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

package com.oliveryasuna.vaadin.fluent.component.radiobutton;

import com.oliveryasuna.commons.language.fluent.IFluentFactory;
import com.oliveryasuna.commons.language.fluent.breakdown.BooleanValueBreak;
import com.oliveryasuna.commons.language.fluent.breakdown.ValueBreak;
import com.oliveryasuna.vaadin.fluent.component.HasHelperFactory;
import com.oliveryasuna.vaadin.fluent.component.HasValidationFactory;
import com.oliveryasuna.vaadin.fluent.data.binder.HasDataProviderFactory;
import com.oliveryasuna.vaadin.fluent.data.binder.HasItemsAndComponentsFactory;
import com.oliveryasuna.vaadin.fluent.data.selection.SingleSelectFactory;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.radiobutton.RadioButtonGroup;
import com.vaadin.flow.data.provider.DataProvider;
import com.vaadin.flow.data.renderer.ComponentRenderer;
import com.vaadin.flow.function.SerializablePredicate;

public interface IRadioButtonGroupFactory<T extends RadioButtonGroup<T2>, F extends IRadioButtonGroupFactory<T, F, T2>, T2> extends IFluentFactory<T, F>,
    IGeneratedVaadinRadioGroupFactory<T, F, RadioButtonGroup<T2>, T2>, HasItemsAndComponentsFactory<T, F, T2>, SingleSelectFactory<T, F, RadioButtonGroup<T2>, T2>,
    HasDataProviderFactory<T, F, T2>, HasValidationFactory<T, F>, HasHelperFactory<T, F> {

  @Override
  default F setDataProvider(final DataProvider<T2, ?> dataProvider) {
    get().setDataProvider(dataProvider);

    return uncheckedThis();
  }

  @Override
  default F setValue(final T2 value) {
    get().setValue(value);

    return uncheckedThis();
  }

  default ValueBreak<T, F, DataProvider<T2, ?>> getDataProvider() {
    return new ValueBreak<>(uncheckedThis(), get().getDataProvider());
  }

  default ValueBreak<T, F, SerializablePredicate<T2>> getItemEnabledProvider() {
    return new ValueBreak<>(uncheckedThis(), get().getItemEnabledProvider());
  }

  default F setItemEnabledProvider(final SerializablePredicate<T2> itemEnabledProvider) {
    get().setItemEnabledProvider(itemEnabledProvider);

    return uncheckedThis();
  }

  default ValueBreak<T, F, ComponentRenderer<? extends Component, T2>> getItemRenderer() {
    return new ValueBreak<>(uncheckedThis(), get().getItemRenderer());
  }

  default F setRenderer(final ComponentRenderer<? extends Component, T2> renderer) {
    get().setRenderer(renderer);

    return uncheckedThis();
  }

  @Override
  default F onEnabledStateChanged(final boolean enabled) {
    get().onEnabledStateChanged(enabled);

    return uncheckedThis();
  }

  @Override
  default F setReadOnly(final boolean readOnly) {
    get().setReadOnly(readOnly);

    return uncheckedThis();
  }

  @Override
  default BooleanValueBreak<T, F> isReadOnly() {
    return new BooleanValueBreak<>(uncheckedThis(), get().isReadOnly());
  }

  // Protected override.
  default F setRequired(final boolean required) {
    get().setRequired(required);

    return uncheckedThis();
  }

  default BooleanValueBreak<T, F> isRequired() {
    return new BooleanValueBreak<>(uncheckedThis(), get().isRequired());
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

  // Protected override.
  default F setLabel(final String label) {
    get().setLabel(label);

    return uncheckedThis();
  }

  default ValueBreak<T, F, String> getLabel() {
    return new ValueBreak<>(uncheckedThis(), get().getLabel());
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

}
