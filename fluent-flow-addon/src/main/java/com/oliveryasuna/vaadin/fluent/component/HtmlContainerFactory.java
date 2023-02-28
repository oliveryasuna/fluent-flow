package com.oliveryasuna.vaadin.fluent.component;

import com.oliveryasuna.commons.language.pattern.fluent.FluentFactory;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.HtmlContainer;

public class HtmlContainerFactory extends FluentFactory<HtmlContainer, HtmlContainerFactory>
    implements IHtmlContainerFactory<HtmlContainer, HtmlContainerFactory> {

  public HtmlContainerFactory(final HtmlContainer htmlContainer) {
    super(htmlContainer);
  }

  public HtmlContainerFactory(final String tagName) {
    super(new HtmlContainer(tagName));
  }

  public HtmlContainerFactory(final String tagName, final Component... components) {
    super(new HtmlContainer(tagName, components));
  }

}
