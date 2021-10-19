package com.oliveryasuna.vaadin.fluent.component.tabs;

import com.oliveryasuna.commons.language.fluent.IFluentFactory;
import com.oliveryasuna.vaadin.fluent.component.HasStyleFactory;
import com.oliveryasuna.vaadin.fluent.component.HasThemeFactory;
import com.oliveryasuna.vaadin.fluent.component.IComponentFactory;
import com.vaadin.flow.component.tabs.GeneratedVaadinTabs;
import com.vaadin.flow.component.tabs.TabsVariant;

public interface IGeneratedVaadinTabsFactory<T extends GeneratedVaadinTabs<R>, F extends IGeneratedVaadinTabsFactory<T, F, R>, R extends GeneratedVaadinTabs<R>>
    extends IFluentFactory<T, F>, IComponentFactory<T, F>, HasStyleFactory<T, F>, HasThemeFactory<T, F> {

  default F addThemeVariants(final TabsVariant... variants) {
    get().addThemeVariants(variants);

    return uncheckedThis();
  }

  default F removeThemeVariants(final TabsVariant... variants) {
    get().removeThemeVariants(variants);

    return uncheckedThis();
  }

}
