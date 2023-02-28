package com.oliveryasuna.vaadin.fluent.component.html;

import com.oliveryasuna.vaadin.fluent.component.ComponentFactory;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.html.Span;

public class SpanFactory extends ComponentFactory<Span, SpanFactory> implements ISpanFactory<Span, SpanFactory> {

  public SpanFactory(final Span Span) {
    super(Span);
  }

  public SpanFactory() {
    super(new Span());
  }

  public SpanFactory(final Component... components) {
    super(new Span(components));
  }

  public SpanFactory(final String text) {
    super(new Span(text));
  }

}
