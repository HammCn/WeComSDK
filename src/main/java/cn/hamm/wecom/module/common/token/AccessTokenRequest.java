package cn.hamm.wecom.module.common.token;

import cn.hamm.wecom.common.AbstractWeComRequest;
import cn.hamm.wecom.common.constant.WeComAlias;
import cn.hamm.wecom.common.WeComResponse;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * <h1>AccessTokenRequest</h1>
 *
 * @author Hamm.cn
 */
@SuppressWarnings("unused")
public class AccessTokenRequest extends AbstractWeComRequest<AccessTokenRequest.Response, AccessTokenRequest> {

    @Override
    public String apiUrl() {
        return String.format("gettoken?corpid=%s&corpsecret=%s", getCorpId(), getCorpSecret());
    }

    @JsonProperty(WeComAlias.CORP_ID)
    private String corpId;

    @JsonProperty(WeComAlias.CORP_SECRET)
    private String corpSecret;

    public static class Response extends WeComResponse<Response> {
        @JsonProperty(WeComAlias.ACCESS_TOKEN)
        private String accessToken;

        @JsonProperty(WeComAlias.EXPIRES_IN)
        private int expiresIn;

        public String getAccessToken() {
            return accessToken;
        }

        public Response setAccessToken(String accessToken) {
            this.accessToken = accessToken;
            return this;
        }

        public int getExpiresIn() {
            return expiresIn;
        }

        public Response setExpiresIn(int expiresIn) {
            this.expiresIn = expiresIn;
            return this;
        }
    }

    public String getCorpId() {
        return corpId;
    }

    public AccessTokenRequest setCorpId(String corpId) {
        this.corpId = corpId;
        return this;
    }

    public String getCorpSecret() {
        return corpSecret;
    }

    public AccessTokenRequest setCorpSecret(String corpSecret) {
        this.corpSecret = corpSecret;
        return this;
    }
}
