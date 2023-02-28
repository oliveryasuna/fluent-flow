package com.oliveryasuna.vaadin.fluent.component.html;

import com.oliveryasuna.vaadin.fluent.component.ComponentFactory;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.html.Anchor;
import com.vaadin.flow.server.AbstractStreamResource;

public class AnchorFactory extends ComponentFactory<Anchor, AnchorFactory> implements IAnchorFactory<Anchor, AnchorFactory> {

  public AnchorFactory(final Anchor anchor) {
    super(anchor);
  }

  public AnchorFactory() {
    super(new Anchor());
  }

  public AnchorFactory(final String href, final String text) {
    super(new Anchor(href, text));
  }

  public AnchorFactory(final AbstractStreamResource href, final String text) {
    super(new Anchor(href, text));
  }

  public AnchorFactory(final String href, final Component... components) {
    super(new Anchor(href, components));
  }

}
