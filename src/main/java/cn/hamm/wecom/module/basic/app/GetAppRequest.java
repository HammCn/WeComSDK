package cn.hamm.wecom.module.basic.app;

import cn.hamm.wecom.base.AbstractWeComRequest;
import cn.hamm.wecom.base.WeCom;
import cn.hamm.wecom.base.WeComResponse;
import cn.hamm.wecom.base.enums.ApiMethod;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * <h1>GetAppRequest</h1>
 *
 * @author Hamm.cn
 * @apiNote 企业仅可获取当前凭证对应的应用；第三方仅可获取被授权的应用。
 * @see <a href="https://developer.work.weixin.qq.com/document/path/90227#获取指定的应用详情">获取指定的应用详情</a>
 */
@SuppressWarnings("unused")
public class GetAppRequest extends AbstractWeComRequest<GetAppRequest.Response, GetAppRequest> {
    @Override
    public String apiUrl() {
        return String.format("agent/get?access_token=%s&agentid=%s", getAccessToken(), getAgentId());
    }

    @Override
    public ApiMethod apiMethod() {
        return ApiMethod.POST;
    }

    @JsonProperty(WeCom.Param.AGENTID)
    private String agentId;

    public String getAgentId() {
        return agentId;
    }

    public GetAppRequest setAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }

    public static class Response extends WeComResponse<Response> {
        private Integer id;

        public Integer getId() {
            return id;
        }

        public Response setId(Integer id) {
            this.id = id;
            return this;
        }
    }
}
