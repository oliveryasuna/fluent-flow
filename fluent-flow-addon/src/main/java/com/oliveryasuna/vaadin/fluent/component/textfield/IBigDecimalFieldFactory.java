package com.oliveryasuna.vaadin.fluent.component.textfield;

import com.oliveryasuna.commons.language.fluent.IFluentFactory;
import com.oliveryasuna.commons.language.fluent.breakdown.BooleanValueBreak;
import com.oliveryasuna.commons.language.fluent.breakdown.IntValueBreak;
import com.oliveryasuna.commons.language.fluent.breakdown.ValueBreak;
import com.oliveryasuna.vaadin.fluent.component.*;
import com.oliveryasuna.vaadin.fluent.data.value.HasValueChangeModeFactory;
import com.vaadin.flow.component.textfield.BigDecimalField;
import com.vaadin.flow.data.value.ValueChangeMode;

import java.math.BigDecimal;
import java.util.Locale;

public interface IBigDecimalFieldFactory<T extends BigDecimalField, F extends IBigDecimalFieldFactory<T, F>> extends IFluentFactory<T, F>,
    IGeneratedVaadinTextFieldFactory<T, F, BigDecimalField, BigDecimal>, HasSizeFactory<T, F>, HasValidationFactory<T, F>, HasValueChangeModeFactory<T, F>,
    HasPrefixAndSuffixFactory<T, F>, InputNotifierFactory<T, F>, KeyNotifierFactory<T, F>, CompositionNotifierFactory<T, F>, HasAutocompleteFactory<T, F>,
    HasAutocapitalizeFactory<T, F>, HasAutocorrectFactory<T, F>, HasHelperFactory<T, F> {

  default ValueBreak<T, F, ValueChangeMode> getValueChangeMode() {
    return new ValueBreak<>(uncheckedThis(), get().getValueChangeMode());
  }

  default F setValueChangeMode(final ValueChangeMode valueChangeMode) {
    get().setValueChangeMode(valueChangeMode);

    return uncheckedThis();
  }

  default F setValueChangeTimeout(final int valueChangeTimeout) {
    get().setValueChangeTimeout(valueChangeTimeout);

    return uncheckedThis();
  }

  default IntValueBreak<T, F> getValueChangeTimeout() {
    return new IntValueBreak<>(uncheckedThis(), get().getValueChangeTimeout());
  }

  @Override
  default ValueBreak<T, F, String> getErrorMessage() {
    return new ValueBreak<>(uncheckedThis(), get().getErrorMessage());
  }

  @Override
  default F setErrorMessage(final String errorMessage) {
    get().setErrorMessage(errorMessage);

    return uncheckedThis();
  }

  @Override
  default BooleanValueBreak<T, F> isInvalid() {
    return new BooleanValueBreak<>(uncheckedThis(), get().isInvalid());
  }

  @Override
  default F setInvalid(final boolean invalid) {
    get().setInvalid(invalid);

    return uncheckedThis();
  }

  default F setLabel(final String label) {
    get().setLabel(label);

    return uncheckedThis();
  }

  default ValueBreak<T, F, String> getLabel() {
    return new ValueBreak<>(uncheckedThis(), get().getLabel());
  }

  default F setPlaceholder(final String placeholder) {
    get().setPlaceholder(placeholder);

    return uncheckedThis();
  }

  default ValueBreak<T, F, String> getPlaceholder() {
    return new ValueBreak<>(uncheckedThis(), get().getPlaceholder());
  }

  default BooleanValueBreak<T, F> isAutoselect() {
    return new BooleanValueBreak<>(uncheckedThis(), get().isAutoselect());
  }

  default F setAutoselect(final boolean autoselect) {
    get().setAutoselect(autoselect);

    return uncheckedThis();
  }

  default BooleanValueBreak<T, F> isClearButtonVisible() {
    return new BooleanValueBreak<>(uncheckedThis(), get().isClearButtonVisible());
  }

  default F setClearButtonVisible(final boolean clearButtonVisible) {
    get().setClearButtonVisible(clearButtonVisible);

    return uncheckedThis();
  }

  default F setAutofocus(final boolean autofocus) {
    get().setAutofocus(autofocus);

    return uncheckedThis();
  }

  default BooleanValueBreak<T, F> isAutofocus() {
    return new BooleanValueBreak<>(uncheckedThis(), get().isAutofocus());
  }

  default ValueBreak<T, F, String> getTitle() {
    return new ValueBreak<>(uncheckedThis(), get().getTitle());
  }

  default F setTitle(final String title) {
    get().setTitle(title);

    return uncheckedThis();
  }

  default ValueBreak<T, F, BigDecimal> getEmptyValue() {
    return new ValueBreak<>(uncheckedThis(), get().getEmptyValue());
  }

  default F setValue(final BigDecimal value) {
    get().setValue(value);

    return uncheckedThis();
  }

  default ValueBreak<T, F, BigDecimal> getValue() {
    return new ValueBreak<>(uncheckedThis(), get().getValue());
  }

  default F setRequiredIndicatorVisible(final boolean requiredIndicatorVisible) {
    get().setRequiredIndicatorVisible(requiredIndicatorVisible);

    return uncheckedThis();
  }

  default F setLocale(final Locale locale) {
    get().setLocale(locale);

    return uncheckedThis();
  }

  default ValueBreak<T, F, Locale> getLocale() {
    return new ValueBreak<>(uncheckedThis(), get().getLocale());
  }

}
