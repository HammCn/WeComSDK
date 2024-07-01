package cn.hamm.wecom.module.basic.message.base;

import cn.hamm.wecom.common.constant.WeComAlias;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * <h1>媒体消息</h1>
 *
 * @author Hamm.cn
 */
@SuppressWarnings({"unchecked", "unused"})
public class MediaMessage<T extends MediaMessage<T>> {
    @JsonProperty(WeComAlias.MEDIA_ID)
    private String mediaId;

    public String getMediaId() {
        return mediaId;
    }

    public T setMediaId(String mediaId) {
        this.mediaId = mediaId;
        return (T) this;
    }
}
