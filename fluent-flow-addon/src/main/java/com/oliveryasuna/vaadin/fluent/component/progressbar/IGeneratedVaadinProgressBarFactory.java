package com.oliveryasuna.vaadin.fluent.component.progressbar;

import com.oliveryasuna.commons.language.fluent.IFluentFactory;
import com.oliveryasuna.vaadin.fluent.component.HasStyleFactory;
import com.oliveryasuna.vaadin.fluent.component.HasThemeFactory;
import com.oliveryasuna.vaadin.fluent.component.IComponentFactory;
import com.vaadin.flow.component.progressbar.GeneratedVaadinProgressBar;
import com.vaadin.flow.component.progressbar.ProgressBarVariant;

public interface IGeneratedVaadinProgressBarFactory<T extends GeneratedVaadinProgressBar<R>, F extends IGeneratedVaadinProgressBarFactory<T, F, R>,
    R extends GeneratedVaadinProgressBar<R>> extends IFluentFactory<T, F>, IComponentFactory<T, F>, HasStyleFactory<T, F>, HasThemeFactory<T, F> {

  default F addThemeVariants(final ProgressBarVariant... variants) {
    get().addThemeVariants(variants);

    return uncheckedThis();
  }

  default F removeThemeVariants(final ProgressBarVariant... variants) {
    get().removeThemeVariants(variants);

    return uncheckedThis();
  }

}
