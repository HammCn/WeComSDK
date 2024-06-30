package cn.hamm.wecom.module.basic.message;

import cn.hamm.wecom.base.AbstractWeComRequest;
import cn.hamm.wecom.base.WeCom;
import cn.hamm.wecom.base.WeComResponse;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * <h1>MessageSendRequest</h1>
 *
 * @author Hamm.cn
 * @see <a href="https://developer.work.weixin.qq.com/document/path/90236">发送应用消息</a>
 */
@SuppressWarnings("unused")
public class MessageSendRequest extends AbstractWeComRequest<MessageSendRequest.Response, MessageSendRequest> {
    public static final String PIC_URL = "picurl";
    public static final String ARTICLE_LIST = "articles";
    public static final String ENABLE_DUPLICATE_CHECK = "enable_duplicate_check";
    public static final String DUPLICATE_CHECK_INTERVAL = "duplicate_check_interval";
    public static final String MSG_TYPE = "msgtype";

    @Override
    public String apiUrl() {
        return String.format("message/send?access_token=%s", getAccessToken());
    }

    @JsonProperty(WeCom.Param.TO_USER)
    private String toUser;

    public String getToUser() {
        return toUser;
    }

    public MessageSendRequest setToUser(String toUser) {
        this.toUser = toUser;
        return this;
    }

    @JsonProperty(WeCom.Param.TO_PARTY)
    private String toParty;

    public String getToParty() {
        return toParty;
    }

    public MessageSendRequest setToParty(String toParty) {
        this.toParty = toParty;
        return this;
    }

    @JsonProperty(WeCom.Param.TO_TAG)
    private String toTag;

    public String getToTag() {
        return toTag;
    }

    public MessageSendRequest setToTag(String toTag) {
        this.toTag = toTag;
        return this;
    }

    @JsonProperty(MSG_TYPE)
    private String msgType;

    public String getMsgType() {
        return msgType;
    }

    public MessageSendRequest setMsgType(WeCom.MsgType msgType) {
        this.msgType = msgType.getType();
        return this;
    }

    @JsonProperty(WeCom.Param.AGENTID)
    private String agentId;

    public String getAgentId() {
        return agentId;
    }

    public MessageSendRequest setAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }

    private Integer safe = WeCom.BOOLEAN_FALSE_NUMBER;

    public Boolean isSafe() {
        return safe == WeCom.BOOLEAN_TRUE_NUMBER;
    }

    public MessageSendRequest setSafe(Boolean safe) {
        this.safe = safe ? WeCom.BOOLEAN_TRUE_NUMBER : WeCom.BOOLEAN_FALSE_NUMBER;
        return this;
    }

    @JsonProperty(ENABLE_DUPLICATE_CHECK)
    private Integer enableDuplicateCheck = WeCom.BOOLEAN_FALSE_NUMBER;

    public Boolean isEnableDuplicateCheck() {
        return enableDuplicateCheck == WeCom.BOOLEAN_TRUE_NUMBER;
    }

    public MessageSendRequest setEnableDuplicateCheck(Boolean enableDuplicateCheck) {
        this.enableDuplicateCheck = enableDuplicateCheck ? WeCom.BOOLEAN_TRUE_NUMBER : WeCom.BOOLEAN_FALSE_NUMBER;
        return this;
    }

    @JsonProperty(DUPLICATE_CHECK_INTERVAL)
    private Integer dupplicateCheckInterval = 1800;

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
