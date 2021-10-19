package com.oliveryasuna.vaadin.fluent.component.customfield;

import com.oliveryasuna.commons.language.fluent.IFluentFactory;
import com.oliveryasuna.commons.language.fluent.breakdown.BooleanValueBreak;
import com.oliveryasuna.commons.language.fluent.breakdown.ValueBreak;
import com.oliveryasuna.vaadin.fluent.component.*;
import com.vaadin.flow.component.customfield.CustomField;

@SuppressWarnings("rawtypes")
public interface ICustomFieldFactory<T extends CustomField<T2>, F extends ICustomFieldFactory<T, F, T2>, T2> extends IFluentFactory<T, F>,
    IAbstractFieldFactory<T, F, CustomField<T2>, T2>, HasSizeFactory<T, F>, HasValidationFactory<T, F>, FocusableFactory<T, F, CustomField>,
    HasHelperFactory<T, F> {

  default BooleanValueBreak<T, F> isInvalid() {
    return new BooleanValueBreak<>(uncheckedThis(), get().isInvalid());
  }

  default F setInvalid(final boolean invalid) {
    get().setInvalid(invalid);

    return uncheckedThis();
  }

  default F setErrorMessage(final String errorMessage) {
    get().setErrorMessage(errorMessage);

    return uncheckedThis();
  }

  default ValueBreak<T, F, String> getErrorMessage() {
    return new ValueBreak<>(uncheckedThis(), get().getErrorMessage());
  }

  default ValueBreak<T, F, String> getLabel() {
    return new ValueBreak<>(uncheckedThis(), get().getLabel());
  }

  default F setLabel(final String label) {
    get().setLabel(label);

    return uncheckedThis();
  }

}
