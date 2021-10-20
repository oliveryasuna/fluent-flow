/*
 * Copyright 2021 Oliver Yasuna
 *
 * Redistribution and use in source and binary forms, with or without modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice, this list of conditions and the following disclaimer in the documentation
 *     and/or other materials provided with the distribution.
 * 3. Neither the name of the copyright holder nor the names of its contributors may be used to endorse or promote products derived from this software without
 *      specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE
 * FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR
 * TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

package com.oliveryasuna.vaadin.fluent.component.datetimepicker;

import com.oliveryasuna.commons.language.fluent.IFluentFactory;
import com.oliveryasuna.commons.language.fluent.breakdown.BooleanValueBreak;
import com.oliveryasuna.commons.language.fluent.breakdown.ValueBreak;
import com.oliveryasuna.vaadin.fluent.component.*;
import com.vaadin.flow.component.datepicker.DatePicker.DatePickerI18n;
import com.vaadin.flow.component.datetimepicker.DateTimePicker;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Locale;

public interface IDateTimePickerFactory<T extends DateTimePicker, F extends IDateTimePickerFactory<T, F>> extends IFluentFactory<T, F>,
    IAbstractFieldFactory<T, F, DateTimePicker, LocalDateTime>, HasStyleFactory<T, F>, HasSizeFactory<T, F>, HasThemeFactory<T, F>, HasValidationFactory<T, F>,
    FocusableFactory<T, F, DateTimePicker>, HasHelperFactory<T, F> {

  @Override
  default F setValue(final LocalDateTime value) {
    get().setValue(value);

    return uncheckedThis();
  }

  @Override
  default F setReadOnly(final boolean readOnly) {
    get().setReadOnly(readOnly);

    return uncheckedThis();
  }

  default F setLabel(final String label) {
    get().setLabel(label);

    return uncheckedThis();
  }

  default ValueBreak<T, F, String> getLabel() {
    return new ValueBreak<>(uncheckedThis(), get().getLabel());
  }

  default F setDatePlaceholder(final String placeholder) {
    get().setDatePlaceholder(placeholder);

    return uncheckedThis();
  }

  default ValueBreak<T, F, String> getDatePlaceholder() {
    return new ValueBreak<>(uncheckedThis(), get().getDatePlaceholder());
  }

  default F setTimePlaceholder(final String placeholder) {
    get().setTimePlaceholder(placeholder);

    return uncheckedThis();
  }

  default ValueBreak<T, F, String> getTimePlaceholder() {
    return new ValueBreak<>(uncheckedThis(), get().getTimePlaceholder());
  }

  default F setStep(final Duration step) {
    get().setStep(step);

    return uncheckedThis();
  }

  default ValueBreak<T, F, Duration> getStep() {
    return new ValueBreak<>(uncheckedThis(), get().getStep());
  }

  default F setWeekNumbersVisible(final boolean weekNumbersVisible) {
    get().setWeekNumbersVisible(weekNumbersVisible);

    return uncheckedThis();
  }

  default BooleanValueBreak<T, F> isWeekNumbersVisible() {
    return new BooleanValueBreak<>(uncheckedThis(), get().isWeekNumbersVisible());
  }

  default F setLocale(final Locale locale) {
    get().setLocale(locale);

    return uncheckedThis();
  }

  // Protected override.
  default ValueBreak<T, F, Locale> getLocale() {
    return new ValueBreak<>(uncheckedThis(), get().getLocale());
  }

  @Override
  default F addThemeName(final String themeName) {
    get().addThemeName(themeName);

    return uncheckedThis();
  }

  @Override
  default BooleanValueBreak<T, F> removeThemeName(final String themeName) {
    return new BooleanValueBreak<>(uncheckedThis(), get().removeThemeName(themeName));
  }

  @Override
  default F setThemeName(final String themeName) {
    get().setThemeName(themeName);

    return uncheckedThis();
  }

  @Override
  default F setThemeName(final String themeName, final boolean set) {
    get().setThemeName(themeName, set);

    return uncheckedThis();
  }

  @Override
  default F addThemeNames(final String... themeNames) {
    get().addThemeNames(themeNames);

    return uncheckedThis();
  }

  @Override
  default F removeThemeNames(final String... themes) {
    get().removeThemeNames(themes);

    return uncheckedThis();
  }

  default F setErrorMessage(final String errorMessage) {
    get().setErrorMessage(errorMessage);

    return uncheckedThis();
  }

  default ValueBreak<T, F, String> getErrorMessage() {
    return new ValueBreak<>(uncheckedThis(), get().getErrorMessage());
  }

  default F setInvalid(final boolean invalid) {
    get().setInvalid(invalid);

    return uncheckedThis();
  }

  default BooleanValueBreak<T, F> isInvalid() {
    return new BooleanValueBreak<>(uncheckedThis(), get().isInvalid());
  }

  default F setMin(final LocalDateTime min) {
    get().setMin(min);

    return uncheckedThis();
  }

  default ValueBreak<T, F, LocalDateTime> getMin() {
    return new ValueBreak<>(uncheckedThis(), get().getMin());
  }

  default F setMax(final LocalDateTime max) {
    get().setMax(max);

    return uncheckedThis();
  }

  default ValueBreak<T, F, LocalDateTime> getMax() {
    return new ValueBreak<>(uncheckedThis(), get().getMax());
  }

  default F setDatePickerI18n(final DatePickerI18n i18n) {
    get().setDatePickerI18n(i18n);

    return uncheckedThis();
  }

  @Override
  default F setRequiredIndicatorVisible(final boolean requiredIndicatorVisible) {
    get().setRequiredIndicatorVisible(requiredIndicatorVisible);

    return uncheckedThis();
  }

  default F setAutoOpen(final boolean autoOpen) {
    get().setAutoOpen(autoOpen);

    return uncheckedThis();
  }

  default BooleanValueBreak<T, F> isAutoOpen() {
    return new BooleanValueBreak<>(uncheckedThis(), get().isAutoOpen());
  }

}
