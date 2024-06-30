package cn.hamm.wecom.module.basic.message.type;

import cn.hamm.wecom.base.WeCom;
import cn.hamm.wecom.module.basic.message.base.ArticleList;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * <h1>图文消息</h1>
 *
 * @author Hamm.cn
 */
@SuppressWarnings("unused")
public class MpNews extends ArticleList<MpNews, MpNews.Article> {
    public static class Article extends ArticleList.Article<Article> {
        public static final String CONTENT_SOURCE_URL = "content_source_url";

        /**
         * <h2>缩略图ID</h2>
         */
        @JsonProperty(WeCom.Param.THUMB_MEDIA_ID)
        private String thumbMediaId;

        public String getThumbMediaId() {
            return thumbMediaId;
        }

        public Article setThumbMediaId(String thumbMediaId) {
            this.thumbMediaId = thumbMediaId;
            return this;
        }

        /**
         * <h2>作者名称</h2>
         */
        private String anchor;

        public String getAnchor() {
            return anchor;
        }

        public Article setAnchor(String anchor) {
            this.anchor = anchor;
            return this;
        }

        /**
         * <h2>原文链接</h2>
         */
        @JsonProperty(CONTENT_SOURCE_URL)
        private String contentSourceUrl;

        public String getContentSourceUrl() {
            return contentSourceUrl;
        }

        public Article setContentSourceUrl(String contentSourceUrl) {
            this.contentSourceUrl = contentSourceUrl;
            return this;
        }

        /**
         * <h2>图文消息内容</h2>
         */
        private String content;

        public String getContent() {
            return content;
        }

        public Article setContent(String content) {
            this.content = content;
            return this;
        }

        /**
         * <h2>摘要</h2>
         */
        private String digest;

        public String getDigest() {
            return digest;
        }

        public Article setDigest(String digest) {
            this.digest = digest;
            return this;
        }
    }
}
