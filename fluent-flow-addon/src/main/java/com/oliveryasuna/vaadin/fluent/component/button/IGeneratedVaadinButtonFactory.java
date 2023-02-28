package com.oliveryasuna.vaadin.fluent.component.button;

import com.oliveryasuna.commons.language.pattern.fluent.IFluentFactory;
import com.oliveryasuna.vaadin.fluent.component.*;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.button.GeneratedVaadinButton;

public interface IGeneratedVaadinButtonFactory<T extends GeneratedVaadinButton<R>, F extends IGeneratedVaadinButtonFactory<T, F, R>,
    R extends GeneratedVaadinButton<R>> extends IFluentFactory<T, F>, IComponentFactory<T, F>, HasStyleFactory<T, F>, ClickNotifierFactory<T, F, R>,
    HasTextFactory<T, F>, FocusableFactory<T, F, R>, HasThemeFactory<T, F> {

  default F addThemeVariants(final ButtonVariant... variants) {
    get().addThemeVariants(variants);

    return uncheckedThis();
  }

  default F removeThemeVariants(final ButtonVariant... variants) {
    get().removeThemeVariants(variants);

    return uncheckedThis();
  }

}
