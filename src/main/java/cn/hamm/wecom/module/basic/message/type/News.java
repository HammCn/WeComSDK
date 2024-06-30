package cn.hamm.wecom.module.basic.message.type;

import cn.hamm.wecom.base.WeCom;
import cn.hamm.wecom.module.basic.message.MessageSendRequest;
import cn.hamm.wecom.module.basic.message.base.ArticleList;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * <h1>图文消息</h1>
 *
 * @author Hamm.cn
 */
@SuppressWarnings("unused")
public class News extends ArticleList<News, News.Article> {

    public static class Article extends ArticleList.Article<Article> {

        private String description;

        public String getDescription() {
            return description;
        }

        public Article setDescription(String description) {
            this.description = description;
            return this;
        }

        private String url;

        public String getUrl() {
            return url;
        }

        public Article setUrl(String url) {
            this.url = url;
            return this;
        }

        @JsonProperty(MessageSendRequest.PIC_URL)
        private String picUrl;

        public String getPicUrl() {
            return picUrl;
        }

        public Article setPicUrl(String picUrl) {
            this.picUrl = picUrl;
            return this;
        }

        @JsonProperty(WeCom.Param.APPID)
        private String appId;

        public String getAppId() {
            return appId;
        }

        public Article setAppId(String appId) {
            this.appId = appId;
            return this;
        }

        @JsonProperty(WeCom.Param.PAGE_PATH)
        private String pagePath;

        public String getPagePath() {
            return pagePath;
        }

        public Article setPagePath(String pagePath) {
            this.pagePath = pagePath;
            return this;
        }
    }
}
