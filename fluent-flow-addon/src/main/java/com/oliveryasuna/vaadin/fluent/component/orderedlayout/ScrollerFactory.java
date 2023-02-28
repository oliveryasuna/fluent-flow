package com.oliveryasuna.vaadin.fluent.component.orderedlayout;

import com.oliveryasuna.commons.language.pattern.fluent.FluentFactory;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.orderedlayout.Scroller;
import com.vaadin.flow.component.orderedlayout.Scroller.ScrollDirection;

public class ScrollerFactory extends FluentFactory<Scroller, ScrollerFactory> implements IScrollerFactory<Scroller, ScrollerFactory> {

  public ScrollerFactory(final Scroller scroller) {
    super(scroller);
  }

  public ScrollerFactory() {
    super(new Scroller());
  }

  public ScrollerFactory(final Component content) {
    super(new Scroller(content));
  }

  public ScrollerFactory(final Component content, final ScrollDirection scrollDirection) {
    super(new Scroller(content, scrollDirection));
  }

  public ScrollerFactory(final ScrollDirection scrollDirection) {
    super(new Scroller(scrollDirection));
  }

}
