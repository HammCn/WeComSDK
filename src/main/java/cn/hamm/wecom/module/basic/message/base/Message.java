package cn.hamm.wecom.module.basic.message.base;

import cn.hamm.wecom.common.constant.WeComAlias;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 消息基类
 * @author wzlee
 * @param <T>
 */
public class Message<T extends Message<T>> {

    @JsonProperty(WeComAlias.MEDIA_ID)
    private String mediaId;

    public String getMediaId() {
        return mediaId;
    }

}
