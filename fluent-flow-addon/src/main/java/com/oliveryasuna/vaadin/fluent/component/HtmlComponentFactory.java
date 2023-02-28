package com.oliveryasuna.vaadin.fluent.component;

import com.vaadin.flow.component.HtmlComponent;

public class HtmlComponentFactory extends ComponentFactory<HtmlComponent, HtmlComponentFactory>
    implements IHtmlComponentFactory<HtmlComponent, HtmlComponentFactory> {

  public HtmlComponentFactory(final HtmlComponent htmlComponent) {
    super(htmlComponent);
  }

  public HtmlComponentFactory(final String tagName) {
    super(new HtmlComponent(tagName));
  }

}
