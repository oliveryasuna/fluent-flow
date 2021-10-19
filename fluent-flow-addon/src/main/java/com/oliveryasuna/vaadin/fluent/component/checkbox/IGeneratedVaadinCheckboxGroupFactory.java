package com.oliveryasuna.vaadin.fluent.component.checkbox;

import com.oliveryasuna.vaadin.fluent.component.HasStyleFactory;
import com.oliveryasuna.vaadin.fluent.component.HasThemeFactory;
import com.oliveryasuna.vaadin.fluent.component.IAbstractSinglePropertyFieldFactory;
import com.vaadin.flow.component.checkbox.CheckboxGroupVariant;
import com.vaadin.flow.component.checkbox.GeneratedVaadinCheckboxGroup;

@Deprecated
public interface IGeneratedVaadinCheckboxGroupFactory<T extends GeneratedVaadinCheckboxGroup<R, T2>,
    F extends IGeneratedVaadinCheckboxGroupFactory<T, F, R, T2>, R extends GeneratedVaadinCheckboxGroup<R, T2>, T2>
    extends IAbstractSinglePropertyFieldFactory<T, F, R, T2>, HasStyleFactory<T, F>, HasThemeFactory<T, F> {

  default F addThemeVariants(final CheckboxGroupVariant... variants) {
    get().addThemeVariants(variants);

    return uncheckedThis();
  }

  default F removeThemeVariants(final CheckboxGroupVariant... variants) {
    get().removeThemeVariants(variants);

    return uncheckedThis();
  }

}
