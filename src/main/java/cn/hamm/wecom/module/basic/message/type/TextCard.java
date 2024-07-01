package cn.hamm.wecom.module.basic.message.type;

/**
 * <h1>文本卡片</h1>
 *
 * @author Hamm.cn
 */
@SuppressWarnings("unused")
public class TextCard {

    private String title;

    private String description;

    private String url;

    public String getTitle() {
        return title;
    }

    public TextCard setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public TextCard setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public TextCard setUrl(String url) {
        this.url = url;
        return this;
    }
}
