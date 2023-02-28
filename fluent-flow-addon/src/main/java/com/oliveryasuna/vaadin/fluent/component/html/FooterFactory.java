package com.oliveryasuna.vaadin.fluent.component.html;

import com.oliveryasuna.vaadin.fluent.component.ComponentFactory;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.html.Footer;

public class FooterFactory extends ComponentFactory<Footer, FooterFactory> implements IFooterFactory<Footer, FooterFactory> {

  public FooterFactory(final Footer Footer) {
    super(Footer);
  }

  public FooterFactory() {
    super(new Footer());
  }

  public FooterFactory(final Component... components) {
    super(new Footer(components));
  }

}
