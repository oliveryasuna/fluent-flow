package com.oliveryasuna.vaadin.fluent.component.textfield;

import com.oliveryasuna.commons.language.pattern.fluent.IFluentFactory;
import com.oliveryasuna.vaadin.fluent.component.FocusableFactory;
import com.oliveryasuna.vaadin.fluent.component.HasStyleFactory;
import com.oliveryasuna.vaadin.fluent.component.HasThemeFactory;
import com.oliveryasuna.vaadin.fluent.component.IAbstractSinglePropertyFieldFactory;
import com.vaadin.flow.component.textfield.GeneratedVaadinTextField;
import com.vaadin.flow.component.textfield.TextFieldVariant;

public interface IGeneratedVaadinTextFieldFactory<T extends GeneratedVaadinTextField<R, T2>, F extends IGeneratedVaadinTextFieldFactory<T, F, R, T2>,
    R extends GeneratedVaadinTextField<R, T2>, T2> extends IFluentFactory<T, F>, IAbstractSinglePropertyFieldFactory<T, F, R, T2>, HasStyleFactory<T, F>,
    FocusableFactory<T, F, R>, HasThemeFactory<T, F> {

  default F addThemeVariants(final TextFieldVariant... variants) {
    get().addThemeVariants(variants);

    return uncheckedThis();
  }

  default F removeThemeVariants(final TextFieldVariant... variants) {
    get().removeThemeVariants(variants);

    return uncheckedThis();
  }

}
