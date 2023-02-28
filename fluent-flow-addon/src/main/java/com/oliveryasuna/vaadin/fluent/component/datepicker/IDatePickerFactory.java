/*
 * Copyright 2021 Oliver Yasuna
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS
 * FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY,
 * WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package com.oliveryasuna.vaadin.fluent.component.datepicker;

import com.oliveryasuna.commons.language.pattern.fluent.IFluentFactory;
import com.oliveryasuna.commons.language.pattern.fluent.breakdown.BooleanValueBreak;
import com.oliveryasuna.commons.language.pattern.fluent.breakdown.ValueBreak;
import com.oliveryasuna.vaadin.fluent.component.HasHelperFactory;
import com.oliveryasuna.vaadin.fluent.component.HasSizeFactory;
import com.oliveryasuna.vaadin.fluent.component.HasValidationFactory;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.datepicker.DatePicker;
import com.vaadin.flow.component.datepicker.DatePicker.DatePickerI18n;
import com.vaadin.flow.component.datepicker.GeneratedVaadinDatePicker.InvalidChangeEvent;
import com.vaadin.flow.component.datepicker.GeneratedVaadinDatePicker.OpenedChangeEvent;
import com.vaadin.flow.shared.Registration;

import java.time.LocalDate;
import java.util.Locale;

public interface IDatePickerFactory<T extends DatePicker, F extends IDatePickerFactory<T, F>> extends IFluentFactory<T, F>,
    IGeneratedVaadinDatePickerFactory<T, F, DatePicker, LocalDate>, HasSizeFactory<T, F>, HasValidationFactory<T, F>, HasHelperFactory<T, F> {

  default F setMin(final LocalDate min) {
    get().setMin(min);

    return uncheckedThis();
  }

  default ValueBreak<T, F, LocalDate> getMin() {
    return new ValueBreak<>(uncheckedThis(), get().getMin());
  }

  default F setMax(final LocalDate max) {
    get().setMax(max);

    return uncheckedThis();
  }

  default ValueBreak<T, F, LocalDate> getMax() {
    return new ValueBreak<>(uncheckedThis(), get().getMax());
  }

  default F setLocale(final Locale locale) {
    get().setLocale(locale);

    return uncheckedThis();
  }

  // Protected override.
  default ValueBreak<T, F, Locale> getLocale() {
    return new ValueBreak<>(uncheckedThis(), get().getLocale());
  }

  default ValueBreak<T, F, DatePickerI18n> getI18n() {
    return new ValueBreak<>(uncheckedThis(), get().getI18n());
  }

  default F setI18n(final DatePickerI18n i18n) {
    get().setI18n(i18n);

    return uncheckedThis();
  }

  // Protected override.
  default F setErrorMessage(final String errorMessage) {
    get().setErrorMessage(errorMessage);

    return uncheckedThis();
  }

  // Protected override.
  default ValueBreak<T, F, String> getErrorMessage() {
    return new ValueBreak<>(uncheckedThis(), get().getErrorMessage());
  }

  // Protected override.
  default F setInvalid(final boolean invalid) {
    get().setInvalid(invalid);

    return uncheckedThis();
  }

  // Protected override.
  default BooleanValueBreak<T, F> isInvalid() {
    return new BooleanValueBreak<>(uncheckedThis(), get().isInvalid());
  }

  // Protected override.
  default F setClearButtonVisible(final boolean clearButtonVisible) {
    get().setClearButtonVisible(clearButtonVisible);

    return uncheckedThis();
  }

  default BooleanValueBreak<T, F> isClearButtonVisible() {
    return new BooleanValueBreak<>(uncheckedThis(), get().isClearButtonVisible());
  }

  // Protected override.
  default F setLabel(final String label) {
    get().setLabel(label);

    return uncheckedThis();
  }

  default ValueBreak<T, F, String> getLabel() {
    return new ValueBreak<>(uncheckedThis(), get().getLabel());
  }

  // Protected override.
  default F setPlaceholder(final String placeholder) {
    get().setPlaceholder(placeholder);

    return uncheckedThis();
  }

  default ValueBreak<T, F, String> getPlaceholder() {
    return new ValueBreak<>(uncheckedThis(), get().getPlaceholder());
  }

  default F setInitialPosition(final LocalDate initialPosition) {
    get().setInitialPosition(initialPosition);

    return uncheckedThis();
  }

  default ValueBreak<T, F, LocalDate> getInitialPosition() {
    return new ValueBreak<>(uncheckedThis(), get().getInitialPosition());
  }

  // Protected override.
  default F setRequired(final boolean required) {
    get().setRequired(required);

    return uncheckedThis();
  }

  // Protected override.
  default F setRequiredIndicatorVisible(final boolean required) {
    get().setRequiredIndicatorVisible(required);

    return uncheckedThis();
  }

  default BooleanValueBreak<T, F> isRequired() {
    return new BooleanValueBreak<>(uncheckedThis(), get().isRequired());
  }

  default F setWeekNumbersVisible(final boolean weekNumbersVisible) {
    get().setWeekNumbersVisible(weekNumbersVisible);

    return uncheckedThis();
  }

  default BooleanValueBreak<T, F> isWeekNumbersVisible() {
    return new BooleanValueBreak<>(uncheckedThis(), get().isWeekNumbersVisible());
  }

  // Protected override.
  default F setOpened(final boolean opened) {
    get().setOpened(opened);

    return uncheckedThis();
  }

  // Protected override.
  default F open() {
    get().open();

    return uncheckedThis();
  }

  default BooleanValueBreak<T, F> isOpened() {
    return new BooleanValueBreak<>(uncheckedThis(), get().isOpened());
  }

  // Protected override.
  default F setName(final String name) {
    get().setName(name);

    return uncheckedThis();
  }

  default ValueBreak<T, F, String> getName() {
    return new ValueBreak<>(uncheckedThis(), get().getName());
  }

  default F setAutoOpen(final boolean autoOpen) {
    get().setAutoOpen(autoOpen);

    return uncheckedThis();
  }

  default BooleanValueBreak<T, F> isAutoOpen() {
    return new BooleanValueBreak<>(uncheckedThis(), get().isAutoOpen());
  }

  // Protected override.
  default ValueBreak<T, F, Registration> addOpenedChangeListener(final ComponentEventListener<OpenedChangeEvent<DatePicker>> listener) {
    return new ValueBreak<>(uncheckedThis(), get().addOpenedChangeListener(listener));
  }

  // Protected override.
  default ValueBreak<T, F, Registration> addInvalidChangeListener(final ComponentEventListener<InvalidChangeEvent<DatePicker>> listener) {
    return new ValueBreak<>(uncheckedThis(), get().addInvalidChangeListener(listener));
  }

}
