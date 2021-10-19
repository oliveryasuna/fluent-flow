package com.oliveryasuna.vaadin.fluent.component.html;

import com.oliveryasuna.commons.language.fluent.FluentFactory;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.html.Article;

public class ArticleFactory extends FluentFactory<Article, ArticleFactory> implements IArticleFactory<Article, ArticleFactory> {

  public ArticleFactory(final Article article) {
    super(article);
  }

  public ArticleFactory() {
    super(new Article());
  }

  public ArticleFactory(final Component... components) {
    super(new Article(components));
  }

}
