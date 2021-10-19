package com.oliveryasuna.vaadin.fluent.component.textfield;

import com.oliveryasuna.commons.language.fluent.IFluentFactory;
import com.oliveryasuna.commons.language.fluent.breakdown.ValueBreak;
import com.oliveryasuna.vaadin.fluent.component.HasElementFactory;
import com.vaadin.flow.component.textfield.Autocomplete;
import com.vaadin.flow.component.textfield.HasAutocomplete;

public interface HasAutocompleteFactory<T extends HasAutocomplete, F extends HasAutocompleteFactory<T, F>> extends IFluentFactory<T, F>,
    HasElementFactory<T, F> {

  default F setAutocomplete(final Autocomplete autocomplete) {
    get().setAutocomplete(autocomplete);

    return uncheckedThis();
  }

  default ValueBreak<T, F, Autocomplete> getAutocomplete() {
    return new ValueBreak<>(uncheckedThis(), get().getAutocomplete());
  }

}
