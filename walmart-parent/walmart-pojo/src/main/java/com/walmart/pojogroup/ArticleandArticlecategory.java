package com.walmart.pojogroup;

import com.walmart.pojo.Article;
import com.walmart.pojo.Articlecategory;
import lombok.Data;

import java.io.Serializable;

@Data
public class ArticleandArticlecategory implements Serializable {
    private Article article;
    private Articlecategory articlecategory;

    public ArticleandArticlecategory() {
    }

    public ArticleandArticlecategory(Article article, Articlecategory articlecategory) {
        this.article = article;
        this.articlecategory = articlecategory;
    }

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }

    public Articlecategory getArticlecategory() {
        return articlecategory;
    }

    public void setArticlecategory(Articlecategory articlecategory) {
        this.articlecategory = articlecategory;
    }

    @Override
    public String toString() {
        return "ArticleandArticlecategory{" +
                "article=" + article +
                ", articlecategory=" + articlecategory +
                '}';
    }
}
