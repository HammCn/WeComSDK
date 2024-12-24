package cn.hamm.wecom.common;

import cn.hamm.wecom.common.constant.WeComConstant;
import cn.hamm.wecom.common.enums.WeComApiMethod;
import cn.hamm.wecom.common.exception.WeComApiException;
import cn.hamm.wecom.common.exception.WeComException;
import cn.hamm.wecom.common.util.HttpUtil;
import cn.hamm.wecom.common.util.JsonUtil;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * <h1>企业微信请求抽象类</h1>
 *
 * @author Hamm.cn
 */
@SuppressWarnings("unchecked")
public abstract class AbstractWeComRequest<RES extends WeComResponse<RES>, REQ extends AbstractWeComRequest<RES, REQ>> {
    /**
     * <h3>AccessToken</h3>
     */
    private String accessToken;

    /**
     * <h3>API地址</h3>
     *
     * @return API地址
     */
    public abstract String apiUrl();

    /**
     * <h3>API方法</h3>
     *
     * @return API方法
     */
    public WeComApiMethod apiMethod() {
        return WeComApiMethod.GET;
    }

    /**
     * <h3>发起API请求</h3>
     *
     * @return 响应对象
     */
    public final RES request() throws WeComException, WeComApiException {
        final RES response;
        final String body;
        try {
            final String url = WeComConstant.WECOM_API_PREFIX + apiUrl();
            WeCom.debug("请求地址", url);
            switch (apiMethod()) {
                case GET:
                    body = HttpUtil.get(url);
                    break;
                case POST:
                    final String request = JsonUtil.toString(this);
                    WeCom.debug("请求包体", request);
                    body = HttpUtil.post(url, request);
                    break;
                default:
                    throw new WeComException("不支持的ApiMethod");
            }
            WeCom.debug("响应包体", body);
            response = JsonUtil.parse(body, getResponseClass());
            if (response.isSuccess()) {
                return response;
            }
        } catch (Exception exception) {
            throw new WeComException(exception.getMessage());
        }
        throw new WeComApiException(response.getErrorCode(), response.getErrorMessage(), body);
    }

    /**
     * <h3>获取响应类</h3>
     *
     * @return 类
     */
    private Class<RES> getResponseClass() {
        return (Class<RES>) getActualTypeArguments()[0];
    }

    /**
     * <h3>获取泛型类列表</h3>
     *
     * @return 泛型类列表
     */
    private Type[] getActualTypeArguments() {
        return ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments();
    }

    public String getAccessToken() {
        return accessToken;
    }

    public REQ setAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return (REQ) this;
    }
}
