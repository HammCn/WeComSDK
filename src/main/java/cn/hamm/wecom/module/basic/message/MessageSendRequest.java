package cn.hamm.wecom.module.basic.message;

import cn.hamm.wecom.common.*;
import cn.hamm.wecom.common.constant.WeComAlias;
import cn.hamm.wecom.common.constant.WeComConstant;
import cn.hamm.wecom.common.enums.WeComMsgType;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * <h1>MessageSendRequest</h1>
 *
 * @author Hamm.cn
 * @see <a href="https://developer.work.weixin.qq.com/document/path/90236">发送应用消息</a>
 */
@SuppressWarnings("unused")
public class MessageSendRequest extends AbstractWeComRequest<MessageSendRequest.Response, MessageSendRequest> {

    @Override
    public String apiUrl() {
        return String.format("message/send?access_token=%s", getAccessToken());
    }

    @JsonProperty(WeComAlias.TO_USER)
    private String toUser;

    @JsonProperty(WeComAlias.TO_PARTY)
    private String toParty;

    @JsonProperty(WeComAlias.TO_TAG)
    private String toTag;

    @JsonProperty(WeComAlias.MSG_TYPE)
    private String msgType;

    @JsonProperty(WeComAlias.AGENTID)
    private String agentId;

    private Integer safe = WeComConstant.BOOLEAN_FALSE_NUMBER;

    @JsonProperty(WeComAlias.ENABLE_DUPLICATE_CHECK)
    private Integer enableDuplicateCheck = WeComConstant.BOOLEAN_FALSE_NUMBER;

    @JsonProperty(WeComAlias.DUPLICATE_CHECK_INTERVAL)
    private Integer dupplicateCheckInterval = 1800;

    public static class Response extends WeComResponse<Response> {
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

    public String getMsgType() {
        return msgType;
    }

    public MessageSendRequest setMsgType(String msgType) {
        this.msgType = msgType;
        return this;
    }

    public MessageSendRequest setMsgType(WeComMsgType weComMsgType) {
        this.msgType = weComMsgType.getType();
        return this;
    }

    public String getAgentId() {
        return agentId;
    }

    public MessageSendRequest setAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }

    public Boolean isSafe() {
        return safe == WeComConstant.BOOLEAN_TRUE_NUMBER;
    }

    public MessageSendRequest setSafe(Boolean safe) {
        return setSafe(safe ? WeComConstant.BOOLEAN_TRUE_NUMBER : WeComConstant.BOOLEAN_FALSE_NUMBER);
    }

    public MessageSendRequest setSafe(Integer safe) {
        this.safe = safe;
        return this;
    }

    public Boolean isEnableDuplicateCheck() {
        return enableDuplicateCheck == WeComConstant.BOOLEAN_TRUE_NUMBER;
    }

    public MessageSendRequest setEnableDuplicateCheck(Boolean enableDuplicateCheck) {
        return setEnableDuplicateCheck(enableDuplicateCheck ? WeComConstant.BOOLEAN_TRUE_NUMBER : WeComConstant.BOOLEAN_FALSE_NUMBER);
    }

    public MessageSendRequest setEnableDuplicateCheck(Integer enableDuplicateCheck) {
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
}
