package cn.hamm.wecom.module.common.token;

import cn.hamm.wecom.base.AbstractWeComRequest;
import cn.hamm.wecom.base.WeCom;
import cn.hamm.wecom.base.WeComResponse;
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

    @JsonProperty(WeCom.Param.CORP_ID)
    private String corpId;

    public String getCorpId() {
        return corpId;
    }

    public AccessTokenRequest setCorpId(String corpId) {
        this.corpId = corpId;
        return this;
    }

    @JsonProperty(WeCom.Param.CORP_SECRET)
    private String corpSecret;

    public String getCorpSecret() {
        return corpSecret;
    }

    public AccessTokenRequest setCorpSecret(String corpSecret) {
        this.corpSecret = corpSecret;
        return this;
    }

    public static class Response extends WeComResponse<Response> {
        @JsonProperty(WeCom.Param.ACCESS_TOKEN)
        private String accessToken;

        public String getAccessToken() {
            return accessToken;
        }

        public Response setAccessToken(String accessToken) {
            this.accessToken = accessToken;
            return this;
        }

        @JsonProperty(WeCom.Param.EXPIRES_IN)
        private int expiresIn;

        public int getExpiresIn() {
            return expiresIn;
        }

        public Response setExpiresIn(int expiresIn) {
            this.expiresIn = expiresIn;
            return this;
        }
    }
}
