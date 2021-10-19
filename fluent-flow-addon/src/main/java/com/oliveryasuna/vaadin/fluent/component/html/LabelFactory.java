package com.oliveryasuna.vaadin.fluent.component.html;

import com.oliveryasuna.commons.language.fluent.FluentFactory;
import com.vaadin.flow.component.html.Label;

public class LabelFactory extends FluentFactory<Label, LabelFactory> implements ILabelFactory<Label, LabelFactory> {

  public LabelFactory(final Label label) {
    super(label);
  }

  public LabelFactory() {
    super(new Label());
  }

  public LabelFactory(final String text) {
    super(new Label(text));
  }

}
