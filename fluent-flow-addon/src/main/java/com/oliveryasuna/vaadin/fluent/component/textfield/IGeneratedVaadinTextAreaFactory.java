package com.oliveryasuna.vaadin.fluent.component.textfield;

import com.oliveryasuna.commons.language.fluent.IFluentFactory;
import com.oliveryasuna.vaadin.fluent.component.FocusableFactory;
import com.oliveryasuna.vaadin.fluent.component.HasStyleFactory;
import com.oliveryasuna.vaadin.fluent.component.HasThemeFactory;
import com.oliveryasuna.vaadin.fluent.component.IAbstractSinglePropertyFieldFactory;
import com.vaadin.flow.component.textfield.GeneratedVaadinTextArea;
import com.vaadin.flow.component.textfield.TextAreaVariant;

public interface IGeneratedVaadinTextAreaFactory<T extends GeneratedVaadinTextArea<R, T2>, F extends IGeneratedVaadinTextAreaFactory<T, F, R, T2>,
    R extends GeneratedVaadinTextArea<R, T2>, T2> extends IFluentFactory<T, F>, IAbstractSinglePropertyFieldFactory<T, F, R, T2>, HasStyleFactory<T, F>,
    FocusableFactory<T, F, R>, HasThemeFactory<T, F> {

  default F addThemeVariants(final TextAreaVariant... variants) {
    get().addThemeVariants(variants);

    return uncheckedThis();
  }

  default F removeThemeVariants(final TextAreaVariant... variants) {
    get().removeThemeVariants(variants);

    return uncheckedThis();
  }

}
