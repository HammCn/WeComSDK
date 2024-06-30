package cn.hamm.wecom.module.basic.message.base;

import cn.hamm.wecom.module.basic.message.MessageSendRequest;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

/**
 * <h1>文章列表类</h1>
 *
 * @author Hamm.cn
 */
@SuppressWarnings({"unchecked", "unused"})
public class ArticleList<M extends ArticleList<M, A>, A extends ArticleList.Article<A>> {
    @JsonProperty(MessageSendRequest.ARTICLE_LIST)
    private List<A> articleList;

    public List<A> getArticleList() {
        return articleList;
    }

    public M setArticleList(List<A> articleList) {
        this.articleList = articleList;
        return (M) this;
    }

    public M addArticle(A article) {
        if (articleList == null) {
            articleList = new ArrayList<>();
        }
        articleList.add(article);
        return (M) this;
    }

    public static class Article<A extends Article<A>> {

        private String title;

        public String getTitle() {
            return title;
        }

        public A setTitle(String title) {
            this.title = title;
            return (A) this;
        }
    }
}
