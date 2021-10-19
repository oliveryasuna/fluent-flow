package com.oliveryasuna.vaadin.fluent.component.tabs;

import com.oliveryasuna.commons.language.fluent.IFluentFactory;
import com.oliveryasuna.vaadin.fluent.component.HasStyleFactory;
import com.oliveryasuna.vaadin.fluent.component.HasThemeFactory;
import com.oliveryasuna.vaadin.fluent.component.IComponentFactory;
import com.vaadin.flow.component.tabs.GeneratedVaadinTab;
import com.vaadin.flow.component.tabs.TabVariant;

public interface IGeneratedVaadinTabFactory<T extends GeneratedVaadinTab<R>, F extends IGeneratedVaadinTabFactory<T, F, R>, R extends GeneratedVaadinTab<R>>
    extends IFluentFactory<T, F>, IComponentFactory<T, F>, HasStyleFactory<T, F>, HasThemeFactory<T, F> {

  default F addThemeVariants(final TabVariant... variants) {
    get().addThemeVariants(variants);

    return uncheckedThis();
  }

  default F removeThemeVariants(final TabVariant... variants) {
    get().removeThemeVariants(variants);

    return uncheckedThis();
  }

}
