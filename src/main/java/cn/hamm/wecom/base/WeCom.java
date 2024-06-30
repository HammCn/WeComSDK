package cn.hamm.wecom.base;

/**
 * <h1>企业微信SDK</h1>
 *
 * @author Hamm.cn
 */
public class WeCom {
    /**
     * <h2>企业微信API前缀</h2>
     */
    public static final String WECOM_API_PREFIX = "https://qyapi.weixin.qq.com/cgi-bin/";

    /**
     * <h2>成功状态码</h2>
     */
    public static final int SUCCESS_CODE = 0;

    /**
     * <h2>布尔值<code>false</code>对应数字</h2>
     */
    public static final int BOOLEAN_FALSE_NUMBER = 0;

    /**
     * <h2>布尔值<code>true</code>对应数字</h2>
     */
    public static final int BOOLEAN_TRUE_NUMBER = 1;

    /**
     * <h2>是否开启DEBUG模式</h2>
     */
    public static boolean isDebug = true;

    /**
     * <h2>调试输出错误信息</h2>
     *
     * @param title   标题
     * @param message 内容
     */
    public static void debug(String title, Object message) {
        debug(title, message, false);
    }

    /**
     * <h2>调试输出错误信息</h2>
     *
     * @param title   标题
     * @param message 内容
     * @param force   是否强制输出
     */
    public static void debug(String title, Object message, boolean force) {
        if (!isDebug && !force) {
            return;
        }
        System.out.println("\n" + title);
        System.out.println(message);
    }

    /**
     * <h1>参数常量</h1>
     */
    public static class Param {
        public final static String AGENTID = "agentid";
        public static final String PARENT_ID = "parentid";
        public static final String IP_LIST = "ip_list";
        public static final String ACCESS_TOKEN = "access_token";
        public static final String EXPIRES_IN = "expires_in";
        public static final String CORP_ID = "corpid";
        public static final String CORP_SECRET = "corpsecret";
        public static final String TO_USER = "touser";
        public static final String TO_PARTY = "toparty";
        public static final String TO_TAG = "totag";
        public static final String MEDIA_ID = "media_id";
        public static final String APPID = "appid";
        public static final String PAGE_PATH = "pagepath";
        public static final String THUMB_MEDIA_ID = "thumb_media_id";
    }

    /**
     * <h1>消息类型</h1>
     *
     * @author Hamm.cn
     */

    public enum MsgType {
        /**
         * <h2>文本消息</h2>
         *
         * @apiNote 参考文档 <a href="https://developer.work.weixin.qq.com/document/path/90236#%E6%96%87%E6%9C%AC%E6%B6%88%E6%81%AF">文本消息</a>
         */
        TEXT(Constant.TEXT),

        /**
         * <h2>图片消息</h2>
         *
         * @apiNote 参考文档 <a href="https://developer.work.weixin.qq.com/document/path/90236#%E5%9B%BE%E7%89%87%E6%B6%88%E6%81%AF">图片消息</a>
         */
        IMAGE(Constant.IMAGE),

        /**
         * <h2>语音消息</h2>
         *
         * @apiNote 参考文档 <a href="https://developer.work.weixin.qq.com/document/path/90236#%E8%AF%AD%E9%9F%B3%E6%B6%88%E6%81%AF">语音消息</a>
         */
        VOICE(Constant.VOICE),

        /**
         * <h2>视频消息</h2>
         *
         * @apiNote 参考文档 <a href="https://developer.work.weixin.qq.com/document/path/90236#%E8%A7%86%E9%A2%91%E6%B6%88%E6%81%AF">视频消息</a>
         */
        VIDEO(Constant.VIDEO),

        /**
         * <h2>文件消息</h2>
         *
         * @apiNote 参考文档 <a href="https://developer.work.weixin.qq.com/document/path/90236#%E6%96%87%E4%BB%B6%E6%B6%88%E6%81%AF">文件消息</a>
         */
        FILE(Constant.FILE),

        /**
         * <h2>文本卡片消息</h2>
         *
         * @apiNote 参考文档 <a href="https://developer.work.weixin.qq.com/document/path/90236#%E6%96%87%E6%9C%AC%E5%8D%A1%E7%89%87%E6%B6%88%E6%81%AF">文本卡片消息</a>
         */
        TEXT_CARD(Constant.TEXT_CARD),

        /**
         * <h2>图文消息</h2>
         *
         * @apiNote 参考文档 <a href="https://developer.work.weixin.qq.com/document/path/90236#%E5%9B%BE%E6%96%87%E6%B6%88%E6%81%AF">图文消息</a>
         */
        NEWS("news"),

        /**
         * <h2>图文消息（mpnews）</h2>
         *
         * @apiNote 参考文档 <a href="https://developer.work.weixin.qq.com/document/path/90236#%E5%9B%BE%E6%96%87%E6%B6%88%E6%81%AF%EF%BC%88mpnews%EF%BC%89">图文消息（mpnews）</a>
         */
        MP_NEWS(Constant.MP_NEWS),

        /**
         * <h2>Markdown消息</h2>
         *
         * @apiNote 参考文档 <a href="https://developer.work.weixin.qq.com/document/path/90236#%E6%A0%87%E5%87%86%E6%B6%88%E6%81%AF">Markdown消息</a>
         */
        MARKDOWN(Constant.MARKDOWN),

        /**
         * <h2>小程序通知消息</h2>
         *
         * @apiNote 参考文档 <a href="https://developer.work.weixin.qq.com/document/path/90236#%E5%B0%8F%E7%A8%8B%E5%BA%8F%E9%80%9A%E7%9F%A5%E6%B6%88%E6%81%AF">小程序通知消息</a>
         */
        MINI_PROGRAM_NOTICE(Constant.MINIPROGRAM_NOTICE),

        /**
         * <h2>模板卡片消息</h2>
         *
         * @apiNote 参考文档 <a href="https://developer.work.weixin.qq.com/document/path/90236#%E6%A8%A1%E6%9D%BF%E5%8D%A1%E7%89%87%E6%B6%88%E6%81%AF">模板卡片消息</a>
         */
        TEMPLATE_CARD(Constant.TEMPLATE_CARD);

        /**
         * <h2>消息类型代码</h2>
         */
        private final String type;

        public String getType() {
            return type;
        }

        MsgType(String type) {
            this.type = type;
        }

        /**
         * <h2>消息类型常量</h2>
         */
        public static class Constant {
            /**
             * <h2>文本消息</h2>
             */
            public static final String TEXT = "text";

            /**
             * <h2>图片消息</h2>
             */
            public static final String IMAGE = "image";

            /**
             * <h2>文件消息</h2>
             */
            public static final String FILE = "file";

            /**
             * <h2>视频消息</h2>
             */
            public static final String VIDEO = "video";

            /**
             * <h2>语音消息</h2>
             */
            public static final String VOICE = "voice";

            /**
             * <h2>文本卡片消息</h2>
             */
            public static final String TEXT_CARD = "textcard";

            /**
             * <h2>小程序通知消息</h2>
             */
            public static final String MINIPROGRAM_NOTICE = "miniprogram_notice";

            /**
             * <h2>图文消息（mpnews）</h2>
             */
            public static final String MP_NEWS = "mpnews";

            /**
             * <h2>Markdown消息</h2>
             */
            public static final String MARKDOWN = "markdown";

            /**
             * <h2>模板卡片消息</h2>
             */
            public static final String TEMPLATE_CARD = "template_card";
        }
    }
}
