package com.oliveryasuna.vaadin.fluent.component.html;

import com.oliveryasuna.commons.language.fluent.FluentFactory;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.html.Paragraph;

public class ParagraphFactory extends FluentFactory<Paragraph, ParagraphFactory> implements IParagraphFactory<Paragraph, ParagraphFactory> {

  public ParagraphFactory(final Paragraph Paragraph) {
    super(Paragraph);
  }

  public ParagraphFactory() {
    super(new Paragraph());
  }

  public ParagraphFactory(final Component... components) {
    super(new Paragraph(components));
  }

  public ParagraphFactory(final String text) {
    super(new Paragraph(text));
  }

}
