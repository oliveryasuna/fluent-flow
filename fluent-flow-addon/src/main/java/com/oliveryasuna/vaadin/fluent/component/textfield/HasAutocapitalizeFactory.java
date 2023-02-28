package com.oliveryasuna.vaadin.fluent.component.textfield;

import com.oliveryasuna.commons.language.pattern.fluent.IFluentFactory;
import com.oliveryasuna.commons.language.pattern.fluent.breakdown.ValueBreak;
import com.oliveryasuna.vaadin.fluent.component.HasElementFactory;
import com.vaadin.flow.component.textfield.Autocapitalize;
import com.vaadin.flow.component.textfield.HasAutocapitalize;

public interface HasAutocapitalizeFactory<T extends HasAutocapitalize, F extends HasAutocapitalizeFactory<T, F>> extends IFluentFactory<T, F>,
    HasElementFactory<T, F> {

  default F setAutocapitalize(final Autocapitalize autocapitalize) {
    get().setAutocapitalize(autocapitalize);

    return uncheckedThis();
  }

  default ValueBreak<T, F, Autocapitalize> getAutocapitalize() {
    return new ValueBreak<>(uncheckedThis(), get().getAutocapitalize());
  }

}
