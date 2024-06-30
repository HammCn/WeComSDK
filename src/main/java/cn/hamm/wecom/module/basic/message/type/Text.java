package cn.hamm.wecom.module.basic.message.type;

/**
 * <h1>文本消息</h1>
 *
 * @author Hamm.cn
 */
@SuppressWarnings("unused")
public class Text {
    private String content;

    public String getContent() {
        return content;
    }

    public Text setContent(String content) {
        this.content = content;
        return this;
    }
}
