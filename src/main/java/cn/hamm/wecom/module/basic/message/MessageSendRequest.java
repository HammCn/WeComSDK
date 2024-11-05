package cn.hamm.wecom.module.basic.message;

import cn.hamm.wecom.common.AbstractWeComRequest;
import cn.hamm.wecom.common.WeComResponse;
import cn.hamm.wecom.common.constant.WeComAlias;
import cn.hamm.wecom.common.enums.WeComMsgType;
import cn.hamm.wecom.common.util.json.BooleanToZeroOne;
import cn.hamm.wecom.common.util.json.ZeroOneToBoolean;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

/**
 * <h1>MessageSendRequest</h1>
 *
 * @author Hamm.cn
 * @see <a href="https://developer.work.weixin.qq.com/document/path/90236">发送应用消息</a>
 */
@SuppressWarnings("unused")
public class MessageSendRequest extends AbstractWeComRequest<MessageSendRequest.Response, MessageSendRequest> {
    @JsonProperty(WeComAlias.TO_USER)
    private String toUser;

    @JsonProperty(WeComAlias.TO_PARTY)
    private String toParty;

    @JsonProperty(WeComAlias.TO_TAG)
    private String toTag;

    @JsonProperty(WeComAlias.MSG_TYPE)
    private WeComMsgType msgType;

    @JsonProperty(WeComAlias.AGENTID)
    private String agentId;

    @JsonSerialize(using = BooleanToZeroOne.class)
    @JsonDeserialize(using = ZeroOneToBoolean.class)
    private Boolean safe;

    @JsonProperty(WeComAlias.ENABLE_DUPLICATE_CHECK)
    @JsonSerialize(using = BooleanToZeroOne.class)
    @JsonDeserialize(using = ZeroOneToBoolean.class)
    private Boolean enableDuplicateCheck;

    @JsonProperty(WeComAlias.DUPLICATE_CHECK_INTERVAL)
    private Integer dupplicateCheckInterval = 1800;

    @Override
    public String apiUrl() {
        return String.format("message/send?access_token=%s", getAccessToken());
    }

    public String getToUser() {
        return toUser;
    }

    public MessageSendRequest setToUser(String toUser) {
        this.toUser = toUser;
        return this;
    }

    public String getToParty() {
        return toParty;
    }

    public MessageSendRequest setToParty(String toParty) {
        this.toParty = toParty;
        return this;
    }

    public String getToTag() {
        return toTag;
    }

    public MessageSendRequest setToTag(String toTag) {
        this.toTag = toTag;
        return this;
    }

    public WeComMsgType getMsgType() {
        return msgType;
    }

    public MessageSendRequest setMsgType(WeComMsgType msgType) {
        this.msgType = msgType;
        return this;
    }

    public String getAgentId() {
        return agentId;
    }

    public MessageSendRequest setAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }

    public Boolean getSafe() {
        return safe;
    }

    public MessageSendRequest setSafe(Boolean safe) {
        this.safe = safe;
        return this;
    }

    public Boolean getEnableDuplicateCheck() {
        return enableDuplicateCheck;
    }

    public MessageSendRequest setEnableDuplicateCheck(Boolean enableDuplicateCheck) {
        this.enableDuplicateCheck = enableDuplicateCheck;
        return this;
    }

    public Integer getDupplicateCheckInterval() {
        return dupplicateCheckInterval;
    }

    public MessageSendRequest setDupplicateCheckInterval(Integer dupplicateCheckInterval) {
        this.dupplicateCheckInterval = dupplicateCheckInterval;
        return this;
    }

    public static class Response extends WeComResponse<Response> {
    }
}
