package com.oliveryasuna.vaadin.fluent.component;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.HtmlContainer;

// TODO: This should extend HtmlComponentFactory.
//       Similar for a lot of classes.
public class HtmlContainerFactory extends ComponentFactory<HtmlContainer, HtmlContainerFactory>
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
