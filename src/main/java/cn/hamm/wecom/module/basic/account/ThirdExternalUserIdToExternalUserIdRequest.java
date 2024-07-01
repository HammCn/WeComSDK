package cn.hamm.wecom.module.basic.account;

import cn.hamm.wecom.common.AbstractWeComRequest;
import cn.hamm.wecom.common.constant.WeComAlias;
import cn.hamm.wecom.common.WeComResponse;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * <h1>ThirdExternalUserIdToExternalUserIdRequest</h1>
 *
 * @author Hamm.cn
 * @see <a href="https://developer.work.weixin.qq.com/document/path/95884#external-userid%E8%BD%AC%E6%8D%A2">自建应用与第三方应用的对接-external_userid转换</a>
 */
@SuppressWarnings("unused")
public class ThirdExternalUserIdToExternalUserIdRequest extends AbstractWeComRequest<ThirdExternalUserIdToExternalUserIdRequest.Response, ThirdExternalUserIdToExternalUserIdRequest> {
    @Override
    public String apiUrl() {
        return String.format("externalcontact/from_service_external_userid?access_token=%s", getAccessToken());
    }

    @JsonProperty(WeComAlias.EXTERNAL_USER_ID)
    private String externalUserId;

    @JsonProperty(WeComAlias.SOURCE_AGENT_ID)
    private Integer sourceAgentId;

    public static class Response extends WeComResponse<Response> {
    }

    public String getExternalUserId() {
        return externalUserId;
    }

    public ThirdExternalUserIdToExternalUserIdRequest setExternalUserId(String externalUserId) {
        this.externalUserId = externalUserId;
        return this;
    }

    public Integer getSourceAgentId() {
        return sourceAgentId;
    }

    public ThirdExternalUserIdToExternalUserIdRequest setSourceAgentId(Integer sourceAgentId) {
        this.sourceAgentId = sourceAgentId;
        return this;
    }
}
