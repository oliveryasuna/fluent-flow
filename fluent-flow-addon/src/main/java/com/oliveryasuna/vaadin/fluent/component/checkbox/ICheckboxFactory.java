package com.oliveryasuna.vaadin.fluent.component.checkbox;

import com.oliveryasuna.commons.language.fluent.IFluentFactory;
import com.oliveryasuna.commons.language.fluent.breakdown.BooleanValueBreak;
import com.oliveryasuna.commons.language.fluent.breakdown.ValueBreak;
import com.oliveryasuna.vaadin.fluent.component.HasSizeFactory;
import com.vaadin.flow.component.checkbox.Checkbox;

public interface ICheckboxFactory<T extends Checkbox, F extends ICheckboxFactory<T, F>> extends IFluentFactory<T, F>,
    IGeneratedVaadinCheckboxFactory<T, F, Checkbox, Boolean>, HasSizeFactory<T, F> {

  default ValueBreak<T, F, String> getLabel() {
    return new ValueBreak<>(uncheckedThis(), get().getLabel());
  }

  default F setLabel(final String label) {
    get().setLabel(label);

    return uncheckedThis();
  }

  default F setLabelAsHtml(final String htmlContent) {
    get().setLabelAsHtml(htmlContent);

    return uncheckedThis();
  }

  default F setAriaLabel(final String ariaLabel) {
    get().setAriaLabel(ariaLabel);

    return uncheckedThis();
  }

  // Protected override.
  default F setAutofocus(final boolean autofocus) {
    get().setAutofocus(autofocus);

    return uncheckedThis();
  }

  default BooleanValueBreak<T, F> isAutofocus() {
    return new BooleanValueBreak<>(uncheckedThis(), get().isAutofocus());
  }

  // Protected override.
  default F setIndeterminate(final boolean indeterminate) {
    get().setIndeterminate(indeterminate);

    return uncheckedThis();
  }

  default BooleanValueBreak<T, F> isIndeterminate() {
    return new BooleanValueBreak<>(uncheckedThis(), get().isIndeterminate());
  }

}
