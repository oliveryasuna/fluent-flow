package com.oliveryasuna.vaadin.fluent.component.button;

import com.oliveryasuna.commons.language.pattern.fluent.IFluentFactory;
import com.oliveryasuna.commons.language.pattern.fluent.breakdown.BooleanValueBreak;
import com.oliveryasuna.commons.language.pattern.fluent.breakdown.ValueBreak;
import com.oliveryasuna.vaadin.fluent.component.HasEnabledFactory;
import com.oliveryasuna.vaadin.fluent.component.HasSizeFactory;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.button.Button;

public interface IButtonFactory<T extends Button, F extends IButtonFactory<T, F>> extends IFluentFactory<T, F>, IGeneratedVaadinButtonFactory<T, F, Button>,
    HasSizeFactory<T, F>, HasEnabledFactory<T, F> {

  @Override
  default F setText(final String text) {
    get().setText(text);

    return uncheckedThis();
  }

  default F setIcon(final Component icon) {
    get().setIcon(icon);

    return uncheckedThis();
  }

  default ValueBreak<T, F, Component> getIcon() {
    return new ValueBreak<>(uncheckedThis(), get().getIcon());
  }

  default F setIconAfterText(final boolean iconAfterText) {
    get().setIconAfterText(iconAfterText);

    return uncheckedThis();
  }

  default BooleanValueBreak<T, F> isIconAfterText() {
    return new BooleanValueBreak<>(uncheckedThis(), get().isIconAfterText());
  }

  default F click() {
    get().click();

    return uncheckedThis();
  }

  default F clickInClient() {
    get().clickInClient();

    return uncheckedThis();
  }

  // Protected in GeneratedVaadinButton.
  default F setAutofocus(final boolean autofocus) {
    get().setAutofocus(autofocus);

    return uncheckedThis();
  }

  default BooleanValueBreak<T, F> isAutofocus() {
    return new BooleanValueBreak<>(uncheckedThis(), get().isAutofocus());
  }

  default F setDisableOnClick(final boolean disableOnClick) {
    get().setDisableOnClick(disableOnClick);

    return uncheckedThis();
  }

  default BooleanValueBreak<T, F> isDisableOnClick() {
    return new BooleanValueBreak<>(uncheckedThis(), get().isDisableOnClick());
  }

}
