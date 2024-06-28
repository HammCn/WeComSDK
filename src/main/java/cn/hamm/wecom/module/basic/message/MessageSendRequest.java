package cn.hamm.wecom.module.basic.message;

import cn.hamm.wecom.base.AbstractWeComRequest;
import cn.hamm.wecom.base.WeComResponse;

/**
 * <h1>MessageSendRequest</h1>
 *
 * @author Hamm.cn
 * @see <a href="https://developer.work.weixin.qq.com/document/path/90236">发送应用消息</a>
 */
public class MessageSendRequest extends AbstractWeComRequest<MessageSendRequest.Response, MessageSendRequest> {

    @Override
    public String apiUrl() {
        return String.format("message/send?access_token=%s", getAccessToken());
    }

    public static class Response extends WeComResponse<Response> {
    }
}
