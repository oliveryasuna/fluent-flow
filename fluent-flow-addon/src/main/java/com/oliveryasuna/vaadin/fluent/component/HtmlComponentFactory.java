package com.oliveryasuna.vaadin.fluent.component;

import com.oliveryasuna.commons.language.fluent.FluentFactory;
import com.vaadin.flow.component.HtmlComponent;

public class HtmlComponentFactory extends FluentFactory<HtmlComponent, HtmlComponentFactory>
    implements IHtmlComponentFactory<HtmlComponent, HtmlComponentFactory> {

  public HtmlComponentFactory(final HtmlComponent htmlComponent) {
    super(htmlComponent);
  }

  public HtmlComponentFactory(final String tagName) {
    super(new HtmlComponent(tagName));
  }

}
