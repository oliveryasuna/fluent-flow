package com.oliveryasuna.vaadin.fluent.component.html;

import com.oliveryasuna.vaadin.fluent.component.ComponentFactory;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.html.Article;

public class ArticleFactory extends ComponentFactory<Article, ArticleFactory> implements IArticleFactory<Article, ArticleFactory> {

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
