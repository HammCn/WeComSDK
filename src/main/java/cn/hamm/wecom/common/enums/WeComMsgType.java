package cn.hamm.wecom.common.enums;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * <h1>消息类型</h1>
 *
 * @author Hamm.cn
 */
public enum WeComMsgType {
    /**
     * <h3>文本消息</h3>
     *
     * @apiNote 参考文档 <a href="https://developer.work.weixin.qq.com/document/path/90236#%E6%96%87%E6%9C%AC%E6%B6%88%E6%81%AF">文本消息</a>
     */
    TEXT(Constant.TEXT),

    /**
     * <h3>图片消息</h3>
     *
     * @apiNote 参考文档 <a href="https://developer.work.weixin.qq.com/document/path/90236#%E5%9B%BE%E7%89%87%E6%B6%88%E6%81%AF">图片消息</a>
     */
    IMAGE(Constant.IMAGE),

    /**
     * <h3>语音消息</h3>
     *
     * @apiNote 参考文档 <a href="https://developer.work.weixin.qq.com/document/path/90236#%E8%AF%AD%E9%9F%B3%E6%B6%88%E6%81%AF">语音消息</a>
     */
    VOICE(Constant.VOICE),

    /**
     * <h3>视频消息</h3>
     *
     * @apiNote 参考文档 <a href="https://developer.work.weixin.qq.com/document/path/90236#%E8%A7%86%E9%A2%91%E6%B6%88%E6%81%AF">视频消息</a>
     */
    VIDEO(Constant.VIDEO),

    /**
     * <h3>文件消息</h3>
     *
     * @apiNote 参考文档 <a href="https://developer.work.weixin.qq.com/document/path/90236#%E6%96%87%E4%BB%B6%E6%B6%88%E6%81%AF">文件消息</a>
     */
    FILE(Constant.FILE),

    /**
     * <h3>文本卡片消息</h3>
     *
     * @apiNote 参考文档 <a href="https://developer.work.weixin.qq.com/document/path/90236#%E6%96%87%E6%9C%AC%E5%8D%A1%E7%89%87%E6%B6%88%E6%81%AF">文本卡片消息</a>
     */
    TEXT_CARD(Constant.TEXT_CARD),

    /**
     * <h3>图文消息</h3>
     *
     * @apiNote 参考文档 <a href="https://developer.work.weixin.qq.com/document/path/90236#%E5%9B%BE%E6%96%87%E6%B6%88%E6%81%AF">图文消息</a>
     */
    NEWS(Constant.NEWS),

    /**
     * <h3>图文消息（mpnews）</h3>
     *
     * @apiNote 参考文档 <a href="https://developer.work.weixin.qq.com/document/path/90236#%E5%9B%BE%E6%96%87%E6%B6%88%E6%81%AF%EF%BC%88mpnews%EF%BC%89">图文消息（mpnews）</a>
     */
    MP_NEWS(Constant.MP_NEWS),

    /**
     * <h3>Markdown消息</h3>
     *
     * @apiNote 参考文档 <a href="https://developer.work.weixin.qq.com/document/path/90236#%E6%A0%87%E5%87%86%E6%B6%88%E6%81%AF">Markdown消息</a>
     */
    MARKDOWN(Constant.MARKDOWN),

    /**
     * <h3>小程序通知消息</h3>
     *
     * @apiNote 参考文档 <a href="https://developer.work.weixin.qq.com/document/path/90236#%E5%B0%8F%E7%A8%8B%E5%BA%8F%E9%80%9A%E7%9F%A5%E6%B6%88%E6%81%AF">小程序通知消息</a>
     */
    MINI_PROGRAM_NOTICE(Constant.MINIPROGRAM_NOTICE),

    /**
     * <h3>模板卡片消息</h3>
     *
     * @apiNote 参考文档 <a href="https://developer.work.weixin.qq.com/document/path/90236#%E6%A8%A1%E6%9D%BF%E5%8D%A1%E7%89%87%E6%B6%88%E6%81%AF">模板卡片消息</a>
     */
    TEMPLATE_CARD(Constant.TEMPLATE_CARD);

    /**
     * <h3>消息类型代码</h3>
     */
    private final String type;

    WeComMsgType(String type) {
        this.type = type;
    }

    @JsonValue
    public String getType() {
        return type;
    }

    /**
     * <h3>消息类型常量</h3>
     */
    public static class Constant {
        /**
         * <h3>文本消息</h3>
         */
        public static final String TEXT = "text";

        /**
         * <h3>图片消息</h3>
         */
        public static final String IMAGE = "image";

        /**
         * <h3>文件消息</h3>
         */
        public static final String FILE = "file";

        /**
         * <h3>视频消息</h3>
         */
        public static final String VIDEO = "video";

        /**
         * <h3>语音消息</h3>
         */
        public static final String VOICE = "voice";

        /**
         * <h3>文本卡片消息</h3>
         */
        public static final String TEXT_CARD = "textcard";

        /**
         * <h3>小程序通知消息</h3>
         */
        public static final String MINIPROGRAM_NOTICE = "miniprogram_notice";

        /**
         * <h3>图文消息（mpnews）</h3>
         */
        public static final String MP_NEWS = "mpnews";

        /**
         * <h3>Markdown消息</h3>
         */
        public static final String MARKDOWN = "markdown";

        /**
         * <h3>模板卡片消息</h3>
         */
        public static final String TEMPLATE_CARD = "template_card";

        /**
         * <h3>图文消息</h3>
         */
        public static final String NEWS = "news";
    }
}
