package cn.hamm.wecom.module.basic.account;

import cn.hamm.wecom.common.AbstractWeComRequest;
import cn.hamm.wecom.common.constant.WeComAlias;
import cn.hamm.wecom.common.WeComResponse;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.Objects;

/**
 * <h1>OpenUserIdToUserIdRequest</h1>
 *
 * @author Hamm.cn
 * @see <a href="https://developer.work.weixin.qq.com/document/path/95884#userid%E8%BD%AC%E6%8D%A2">自建应用与第三方应用的对接-userid转换</a>
 */
@SuppressWarnings("unused")
public class OpenUserIdToUserIdRequest extends AbstractWeComRequest<OpenUserIdToUserIdRequest.Response, OpenUserIdToUserIdRequest> {

    @Override
    public String apiUrl() {
        return String.format("batch/openuserid_to_userid?access_token=%s", getAccessToken());
    }

    /**
     * <h2><code>open_userid</code>列表</h2>
     *
     * @apiNote 最多不超过1000个。必须是<code>source_agentid</code>对应的应用所获取
     */
    @JsonProperty("open_userid_list")
    private List<String> openUserIdList;

    /**
     * <h2>企业授权的代开发自建应用或第三方应用的<code>agentid</code></h2>
     */
    @JsonProperty(WeComAlias.SOURCE_AGENT_ID)
    private Integer sourceAgentId;

    public static class Response extends WeComResponse<Response> {
        /**
         * <h2>明文<code>userid</code>列表</h2>
         */
        @JsonProperty(WeComAlias.USERID_LIST)
        private List<UserIdInfo> userIdInfoList;

        /**
         * <h2>不合法的<code>open_userid</code>列表</h2>
         */
        @JsonProperty("invalid_open_userid_list")
        private List<String> invalidOpenUserId;

        public static class UserIdInfo {
            /**
             * <h2>转换成功的<code>open_userid</code></h2>
             */
            @JsonProperty(WeComAlias.OPEN_USER_ID)
            private String openUserId;

            /**
             * <h2>转换成功的<code>open_userid</code>对应的<code>userid</code></h2>
             */
            @JsonProperty(WeComAlias.USER_ID)
            private String userId;

            public String getOpenUserId() {
                return openUserId;
            }

            public void setOpenUserId(String openUserId) {
                this.openUserId = openUserId;
            }

            public String getUserId() {
                return userId;
            }

            public void setUserId(String userId) {
                this.userId = userId;
            }
        }

        public List<UserIdInfo> getUserIdInfoList() {
            return userIdInfoList;
        }

        public void setUserIdInfoList(List<UserIdInfo> userIdInfoList) {
            this.userIdInfoList = userIdInfoList;
        }

        public List<String> getInvalidOpenUserId() {
            return invalidOpenUserId;
        }

        public void setInvalidOpenUserId(List<String> invalidOpenUserId) {
            this.invalidOpenUserId = invalidOpenUserId;
        }
    }

    public List<String> getOpenUserIdList() {
        return openUserIdList;
    }

    public OpenUserIdToUserIdRequest setOpenUserIdList(List<String> openUserIdList) {
        this.openUserIdList = openUserIdList;
        return this;
    }

    public OpenUserIdToUserIdRequest addOpenUserId(String openUserId) {
        if (Objects.isNull(openUserIdList)) {
            openUserIdList = new java.util.ArrayList<>();
        }
        openUserIdList.add(openUserId);
        return this;
    }

    public Integer getSourceAgentId() {
        return sourceAgentId;
    }

    public OpenUserIdToUserIdRequest setSourceAgentId(Integer sourceAgentId) {
        this.sourceAgentId = sourceAgentId;
        return this;
    }
}
