package com.oliveryasuna.vaadin.fluent.component.button;

import com.oliveryasuna.commons.language.pattern.fluent.FluentFactory;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;

public class ButtonFactory extends FluentFactory<Button, ButtonFactory> implements IButtonFactory<Button, ButtonFactory> {

  public ButtonFactory(final Button button) {
    super(button);
  }

  public ButtonFactory() {
    super(new Button());
  }

  public ButtonFactory(final String text) {
    super(new Button(text));
  }

  public ButtonFactory(final Component icon) {
    super(new Button(icon));
  }

  public ButtonFactory(final String text, final Component icon) {
    super(new Button(text, icon));
  }

  public ButtonFactory(final String text, final ComponentEventListener<ClickEvent<Button>> clickListener) {
    super(new Button(text, clickListener));
  }

  public ButtonFactory(final Component icon, final ComponentEventListener<ClickEvent<Button>> clickListener) {
    super(new Button(icon, clickListener));
  }

  public ButtonFactory(final String text, final Component icon, final ComponentEventListener<ClickEvent<Button>> clickListener) {
    super(new Button(text, icon, clickListener));
  }

}
