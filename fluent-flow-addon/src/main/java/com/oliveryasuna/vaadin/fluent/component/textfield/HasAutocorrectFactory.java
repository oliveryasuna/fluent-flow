package com.oliveryasuna.vaadin.fluent.component.textfield;

import com.oliveryasuna.commons.language.pattern.fluent.IFluentFactory;
import com.oliveryasuna.commons.language.pattern.fluent.breakdown.BooleanValueBreak;
import com.oliveryasuna.vaadin.fluent.component.HasElementFactory;
import com.vaadin.flow.component.textfield.HasAutocorrect;

public interface HasAutocorrectFactory<T extends HasAutocorrect, F extends HasAutocorrectFactory<T, F>> extends IFluentFactory<T, F>, HasElementFactory<T, F> {

  default F setAutocorrect(final boolean autocorrect) {
    get().setAutocorrect(autocorrect);

    return uncheckedThis();
  }

  default BooleanValueBreak<T, F> isAutocorrect() {
    return new BooleanValueBreak<>(uncheckedThis(), get().isAutocorrect());
  }

}
