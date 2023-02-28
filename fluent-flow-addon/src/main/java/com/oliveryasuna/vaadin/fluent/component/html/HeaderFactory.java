package com.oliveryasuna.vaadin.fluent.component.html;

import com.oliveryasuna.vaadin.fluent.component.ComponentFactory;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.html.Header;

public class HeaderFactory extends ComponentFactory<Header, HeaderFactory> implements IHeaderFactory<Header, HeaderFactory> {

  public HeaderFactory(final Header Header) {
    super(Header);
  }

  public HeaderFactory() {
    super(new Header());
  }

  public HeaderFactory(final Component... components) {
    super(new Header(components));
  }

}
