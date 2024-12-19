package cn.hamm.wecom.module.basic.message;

import cn.hamm.wecom.common.AbstractWeComRequest;
import cn.hamm.wecom.common.WeComResponse;
import cn.hamm.wecom.common.constant.WeComAlias;
import cn.hamm.wecom.common.enums.WeComApiMethod;
import cn.hamm.wecom.common.enums.WeComMsgType;
import cn.hamm.wecom.common.util.json.BooleanToZeroOne;
import cn.hamm.wecom.common.util.json.ZeroOneToBoolean;
import cn.hamm.wecom.module.basic.message.base.Message;
import cn.hamm.wecom.module.basic.message.type.*;
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
    private Integer duplicateCheckInterval = 1800;

    private Text text;

    @JsonProperty(WeComAlias.TEXT_CARD)
    private TextCard textCard;

    private Image image;

    private Video video;

    private Voice voice;

    private File file;

    @Override
    public String apiUrl() {
        return String.format("message/send?debug=1&access_token=%s", getAccessToken());
    }

    @Override
    public WeComApiMethod apiMethod() {
        return WeComApiMethod.POST;
    }

    public MessageSendRequest setToUser(String toUser) {
        this.toUser = toUser;
        return this;
    }

    public MessageSendRequest setToParty(String toParty) {
        this.toParty = toParty;
        return this;
    }

    public MessageSendRequest setToTag(String toTag) {
        this.toTag = toTag;
        return this;
    }

    public MessageSendRequest setMsgType(WeComMsgType msgType) {
        this.msgType = msgType;
        return this;
    }

    public MessageSendRequest setAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }

    public MessageSendRequest setSafe(Boolean safe) {
        this.safe = safe;
        return this;
    }

    public MessageSendRequest setEnableDuplicateCheck(Boolean enableDuplicateCheck) {
        this.enableDuplicateCheck = enableDuplicateCheck;
        return this;
    }

    public MessageSendRequest setDuplicateCheckInterval(Integer duplicateCheckInterval) {
        this.duplicateCheckInterval = duplicateCheckInterval;
        return this;
    }

    public MessageSendRequest setText(Text text) {
        this.text = text;
        return this;
    }

    public MessageSendRequest setTextCard(TextCard textCard) {
        this.textCard = textCard;
        return this;
    }

    public MessageSendRequest setImage(Image image) {
        this.image = image;
        return this;
    }

    public MessageSendRequest setFile(File file) {
        this.file = file;
        return this;
    }

    public MessageSendRequest setVoice(Voice voice) {
        this.voice = voice;
        return this;
    }

    public MessageSendRequest setVideo(Video video) {
        this.video = video;
        return this;
    }

    public MessageSendRequest resolveMessage(WeComMsgType msgType, Message<?> message){
        switch (msgType){
            case TEXT:
                if(message instanceof Text){
                    Text text = (Text)message;
                    this.setText(text);
                    return this;
                }else{
                    throw new RuntimeException("消息格式[TEXT]不匹配");
                }
            case TEXT_CARD:
                if(message instanceof TextCard){
                    TextCard textCard = (TextCard)message;
                    this.setTextCard(textCard);
                    return this;
                }else{
                    throw new RuntimeException("消息格式[TextCard]不匹配");
                }
            case IMAGE:
                if(message instanceof Image){
                    Image image = (Image)message;
                    this.setImage(image);
                    return this;
                }else{
                    throw new RuntimeException("消息格式[Image]不匹配");
                }
            case VOICE:
                if(message instanceof Voice){
                    Voice voice = (Voice)message;
                    this.setVoice(voice);
                    return this;
                }else{
                    throw new RuntimeException("消息格式[Image]不匹配");
                }
            case VIDEO:
                if(message instanceof Video){
                    Video video = (Video)message;
                    this.setVideo(video);
                    return this;
                }else{
                    throw new RuntimeException("消息格式[Image]不匹配");
                }
            default:
                throw new RuntimeException("不支持消息格式["+ msgType +"]");
        }
    }

    public static class Response extends WeComResponse<MessageSendRequest.Response> {
    }
}
