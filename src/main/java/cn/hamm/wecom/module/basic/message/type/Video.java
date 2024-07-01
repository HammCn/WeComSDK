package cn.hamm.wecom.module.basic.message.type;

import cn.hamm.wecom.module.basic.message.base.MediaMessage;

/**
 * <h1>视频消息</h1>
 *
 * @author Hamm.cn
 */
@SuppressWarnings("unused")
public class Video extends MediaMessage<Video> {
    private String title;

    private String description;

    public String getTitle() {
        return title;
    }

    public Video setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Video setDescription(String description) {
        this.description = description;
        return this;
    }
}
