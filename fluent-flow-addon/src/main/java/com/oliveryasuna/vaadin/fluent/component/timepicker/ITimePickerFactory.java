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

package com.oliveryasuna.vaadin.fluent.component.timepicker;

import com.oliveryasuna.commons.language.pattern.fluent.IFluentFactory;
import com.oliveryasuna.commons.language.pattern.fluent.breakdown.BooleanValueBreak;
import com.oliveryasuna.commons.language.pattern.fluent.breakdown.ValueBreak;
import com.oliveryasuna.vaadin.fluent.component.HasEnabledFactory;
import com.oliveryasuna.vaadin.fluent.component.HasHelperFactory;
import com.oliveryasuna.vaadin.fluent.component.HasSizeFactory;
import com.oliveryasuna.vaadin.fluent.component.HasValidationFactory;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.timepicker.GeneratedVaadinTimePicker.InvalidChangeEvent;
import com.vaadin.flow.component.timepicker.TimePicker;
import com.vaadin.flow.shared.Registration;

import java.time.Duration;
import java.time.LocalTime;
import java.util.Locale;

public interface ITimePickerFactory<T extends TimePicker, F extends ITimePickerFactory<T, F>> extends IFluentFactory<T, F>,
    IGeneratedVaadinTimePickerFactory<T, F, TimePicker, LocalTime>, HasSizeFactory<T, F>, HasValidationFactory<T, F>, HasEnabledFactory<T, F>,
    HasHelperFactory<T, F> {

  // Protected override.
  default F setLabel(final String label) {
    get().setLabel(label);

    return uncheckedThis();
  }

  // Protected override.
  default F setValue(final LocalTime value) {
    get().setValue(value);

    return uncheckedThis();
  }

  default ValueBreak<T, F, String> getLabel() {
    return new ValueBreak<>(uncheckedThis(), get().getLabel());
  }

  @Override
  default F setErrorMessage(final String errorMessage) {
    get().setErrorMessage(errorMessage);

    return uncheckedThis();
  }

  @Override
  default ValueBreak<T, F, String> getErrorMessage() {
    return new ValueBreak<>(uncheckedThis(), get().getErrorMessage());
  }

  @Override
  default F setInvalid(final boolean invalid) {
    get().setInvalid(invalid);

    return uncheckedThis();
  }

  @Override
  default BooleanValueBreak<T, F> isInvalid() {
    return new BooleanValueBreak<>(uncheckedThis(), get().isInvalid());
  }

  // Protected override.
  default F setPlaceholder(final String placeholder) {
    get().setPlaceholder(placeholder);

    return uncheckedThis();
  }

  default ValueBreak<T, F, String> getPlaceholder() {
    return new ValueBreak<>(uncheckedThis(), get().getPlaceholder());
  }

  // Protected override.
  default F setRequired(final boolean required) {
    get().setRequired(required);

    return uncheckedThis();
  }

  @Override
  default F setRequiredIndicatorVisible(final boolean requiredIndicatorVisible) {
    get().setRequiredIndicatorVisible(requiredIndicatorVisible);

    return uncheckedThis();
  }

  default BooleanValueBreak<T, F> isRequired() {
    return new BooleanValueBreak<>(uncheckedThis(), get().isRequired());
  }

  default F setStep(final Duration step) {
    get().setStep(step);

    return uncheckedThis();
  }

  default ValueBreak<T, F, Duration> getStep() {
    return new ValueBreak<>(uncheckedThis(), get().getStep());
  }

  // Protected override.
  default ValueBreak<T, F, Registration> addInvalidChangeListener(final ComponentEventListener<InvalidChangeEvent<TimePicker>> listener) {
    return new ValueBreak<>(uncheckedThis(), get().addInvalidChangeListener(listener));
  }

  default F setLocale(final Locale locale) {
    get().setLocale(locale);

    return uncheckedThis();
  }

  // Protected override.
  default ValueBreak<T, F, Locale> getLocale() {
    return new ValueBreak<>(uncheckedThis(), get().getLocale());
  }

  // Protected override.
  default F setMin(final String min) {
    get().setMin(min);

    return uncheckedThis();
  }

  default F setMinTime(final LocalTime min) {
    get().setMinTime(min);

    return uncheckedThis();
  }

  default ValueBreak<T, F, String> getMin() {
    return new ValueBreak<>(uncheckedThis(), get().getMin());
  }

  default ValueBreak<T, F, LocalTime> getMinTime() {
    return new ValueBreak<>(uncheckedThis(), get().getMinTime());
  }

  // Protected override.
  default F setMax(final String max) {
    get().setMax(max);

    return uncheckedThis();
  }

  default F setMaxTime(final LocalTime max) {
    get().setMaxTime(max);

    return uncheckedThis();
  }

  default ValueBreak<T, F, String> getMax() {
    return new ValueBreak<>(uncheckedThis(), get().getMax());
  }

  default ValueBreak<T, F, LocalTime> getMaxTime() {
    return new ValueBreak<>(uncheckedThis(), get().getMaxTime());
  }

  // Protected override.
  default F setClearButtonVisible(final boolean clearButtonVisible) {
    get().setClearButtonVisible(clearButtonVisible);

    return uncheckedThis();
  }

  default BooleanValueBreak<T, F> isClearButtonVisible() {
    return new BooleanValueBreak<>(uncheckedThis(), get().isClearButtonVisible());
  }

  default F setAutoOpen(final boolean autoOpen) {
    get().setAutoOpen(autoOpen);

    return uncheckedThis();
  }

  default BooleanValueBreak<T, F> isAutoOpen() {
    return new BooleanValueBreak<>(uncheckedThis(), get().isAutoOpen());
  }

}
