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

    @JsonProperty("open_userid_list")
    private List<String> openUserIdList;

    @JsonProperty(WeComAlias.SOURCE_AGENT_ID)
    private Integer sourceAgentId;

    public static class Response extends WeComResponse<Response> {
        @JsonProperty(WeComAlias.USERID_LIST)
        private List<UserIdInfo> userIdInfoList;

        @JsonProperty("invalid_open_userid_list")
        private List<String> invalidOpenUserId;

        public static class UserIdInfo {
            @JsonProperty(WeComAlias.OPEN_USER_ID)
            private String openUserId;

            @JsonProperty(WeComAlias.USER_ID)
            private String userId;

            public String getOpenUserId() {
                return openUserId;
            }

            public UserIdInfo setOpenUserId(String openUserId) {
                this.openUserId = openUserId;
                return this;
            }

            public String getUserId() {
                return userId;
            }

            public UserIdInfo setUserId(String userId) {
                this.userId = userId;
                return this;
            }
        }

        public List<UserIdInfo> getUserIdInfoList() {
            return userIdInfoList;
        }

        public Response setUserIdInfoList(List<UserIdInfo> userIdInfoList) {
            this.userIdInfoList = userIdInfoList;
            return this;
        }

        public List<String> getInvalidOpenUserId() {
            return invalidOpenUserId;
        }

        public Response setInvalidOpenUserId(List<String> invalidOpenUserId) {
            this.invalidOpenUserId = invalidOpenUserId;
            return this;
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
