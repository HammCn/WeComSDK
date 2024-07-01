package cn.hamm.wecom.module.basic.message.type;

import cn.hamm.wecom.common.constant.WeComAlias;
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

        /**
         * <h2>缩略图ID</h2>
         */
        @JsonProperty(WeComAlias.THUMB_MEDIA_ID)
        private String thumbMediaId;

        /**
         * <h2>作者名称</h2>
         */
        private String anchor;

        /**
         * <h2>原文链接</h2>
         */
        @JsonProperty(WeComAlias.CONTENT_SOURCE_URL)
        private String contentSourceUrl;

        /**
         * <h2>图文消息内容</h2>
         */
        private String content;

        /**
         * <h2>摘要</h2>
         */
        private String digest;

        public String getThumbMediaId() {
            return thumbMediaId;
        }

        public Article setThumbMediaId(String thumbMediaId) {
            this.thumbMediaId = thumbMediaId;
            return this;
        }

        public String getAnchor() {
            return anchor;
        }

        public Article setAnchor(String anchor) {
            this.anchor = anchor;
            return this;
        }

        public String getContentSourceUrl() {
            return contentSourceUrl;
        }

        public Article setContentSourceUrl(String contentSourceUrl) {
            this.contentSourceUrl = contentSourceUrl;
            return this;
        }

        public String getContent() {
            return content;
        }

        public Article setContent(String content) {
            this.content = content;
            return this;
        }

        public String getDigest() {
            return digest;
        }

        public Article setDigest(String digest) {
            this.digest = digest;
            return this;
        }
    }
}
