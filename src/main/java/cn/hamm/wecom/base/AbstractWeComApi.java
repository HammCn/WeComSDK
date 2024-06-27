package cn.hamm.wecom.base;

import cn.hamm.wecom.base.enums.ApiMethod;
import cn.hamm.wecom.exception.WeComApiException;
import cn.hamm.wecom.exception.WeComException;
import cn.hamm.wecom.util.HttpUtil;
import cn.hamm.wecom.util.JsonUtil;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * <h1>AbstractWeComApi</h1>
 *
 * @author Hamm.cn
 */
@SuppressWarnings("unchecked")
public abstract class AbstractWeComApi<RES extends WeComResponse<RES>, REQ extends AbstractWeComApi<RES, REQ>> {

    public static final String QUESTION_MARK = "?";

    public static final String AMPERSAND = "&";

    private String accessToken;

    public String getAccessToken() {
        return accessToken;
    }

    public REQ setAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return (REQ) this;
    }

    /**
     * <h2>API地址</h2>
     *
     * @return API地址
     */
    public abstract String apiUrl();

    /**
     * <h2>API方法</h2>
     *
     * @return API方法
     */
    public ApiMethod apiMethod() {
        return ApiMethod.GET;
    }

    /**
     * <h2>发起API请求</h2>
     *
     * @return 响应对象
     */
    public final RES request() throws WeComException, WeComApiException {
        RES response;
        String body;
        try {
            String url = WeCom.WECOM_API_PREFIX + apiUrl();
            switch (apiMethod()) {
                case GET:
                    body = HttpUtil.get(url);
                    break;
                case POST:
                    body = HttpUtil.post(url, JsonUtil.toString(this));
                    break;
                default:
                    throw new WeComException("不支持的ApiMethod");
            }
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
     * <h2>获取响应类</h2>
     *
     * @return 类
     */
    private Class<RES> getResponseClass() {
        return (Class<RES>) getActualTypeArguments()[0];
    }

    /**
     * <h2>获取泛型类列表</h2>
     *
     * @return 泛型类列表
     */
    private Type[] getActualTypeArguments() {
        return ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments();
    }
}
