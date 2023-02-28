package com.oliveryasuna.vaadin.fluent.component.html;

import com.oliveryasuna.vaadin.fluent.component.ComponentFactory;
import com.vaadin.flow.component.html.Input;
import com.vaadin.flow.data.value.ValueChangeMode;

public class InputFactory extends ComponentFactory<Input, InputFactory> implements IInputFactory<Input, InputFactory> {

  public InputFactory(final Input input) {
    super(input);
  }

  public InputFactory() {
    super(new Input());
  }

  public InputFactory(final ValueChangeMode valueChangeMode) {
    super(new Input(valueChangeMode));
  }

}
