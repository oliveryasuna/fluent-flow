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

package com.oliveryasuna.vaadin.fluent.component.select;

import com.oliveryasuna.commons.language.fluent.IFluentFactory;
import com.oliveryasuna.commons.language.fluent.breakdown.BooleanValueBreak;
import com.oliveryasuna.commons.language.fluent.breakdown.ValueBreak;
import com.oliveryasuna.vaadin.fluent.component.HasHelperFactory;
import com.oliveryasuna.vaadin.fluent.component.HasSizeFactory;
import com.oliveryasuna.vaadin.fluent.component.HasValidationFactory;
import com.oliveryasuna.vaadin.fluent.component.select.generated.IGeneratedVaadinSelectFactory;
import com.oliveryasuna.vaadin.fluent.data.binder.HasDataProviderFactory;
import com.oliveryasuna.vaadin.fluent.data.binder.HasItemsAndComponentsFactory;
import com.oliveryasuna.vaadin.fluent.data.selection.SingleSelectFactory;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.ItemLabelGenerator;
import com.vaadin.flow.component.select.Select;
import com.vaadin.flow.data.provider.DataProvider;
import com.vaadin.flow.data.renderer.ComponentRenderer;
import com.vaadin.flow.function.SerializablePredicate;

import java.util.stream.Stream;

public interface ISelectFactory<T extends Select<T2>, F extends ISelectFactory<T, F, T2>, T2> extends IFluentFactory<T, F>,
    IGeneratedVaadinSelectFactory<T, F, Select<T2>, T2>, HasDataProviderFactory<T, F, T2>, HasItemsAndComponentsFactory<T, F, T2>, HasSizeFactory<T, F>,
    HasValidationFactory<T, F>, SingleSelectFactory<T, F, Select<T2>, T2>, HasHelperFactory<T, F> {

  default ValueBreak<T, F, ComponentRenderer<? extends Component, T2>> getItemRenderer() {
    return new ValueBreak<>(uncheckedThis(), get().getItemRenderer());
  }

  default F setRenderer(final ComponentRenderer<? extends Component, T2> renderer) {
    get().setRenderer(renderer);

    return uncheckedThis();
  }

  default F setTextRenderer(final ItemLabelGenerator<T2> itemLabelGenerator) {
    get().setTextRenderer(itemLabelGenerator);

    return uncheckedThis();
  }

  default F setEmptySelectionAllowed(final boolean emptySelectionAllowed) {
    get().setEmptySelectionAllowed(emptySelectionAllowed);

    return uncheckedThis();
  }

  default BooleanValueBreak<T, F> isEmptySelectionAllowed() {
    return new BooleanValueBreak<>(uncheckedThis(), get().isEmptySelectionAllowed());
  }

  default F setEmptySelectionCaption(final String emptySelectionCaption) {
    get().setEmptySelectionCaption(emptySelectionCaption);

    return uncheckedThis();
  }

  default ValueBreak<T, F, String> getEmptySelectionCaption() {
    return new ValueBreak<>(uncheckedThis(), get().getEmptySelectionCaption());
  }

  default ValueBreak<T, F, SerializablePredicate<T2>> getItemEnabledProvider() {
    return new ValueBreak<>(uncheckedThis(), get().getItemEnabledProvider());
  }

  default F setItemEnabledProvider(final SerializablePredicate<T2> itemEnabledProvider) {
    get().setItemEnabledProvider(itemEnabledProvider);

    return uncheckedThis();
  }

  default ValueBreak<T, F, ItemLabelGenerator<T2>> getItemLabelGenerator() {
    return new ValueBreak<>(uncheckedThis(), get().getItemLabelGenerator());
  }

  default F setItemLabelGenerator(final ItemLabelGenerator<T2> itemLabelGenerator) {
    get().setItemLabelGenerator(itemLabelGenerator);

    return uncheckedThis();
  }

  default ValueBreak<T, F, String> getPlaceholder() {
    return new ValueBreak<>(uncheckedThis(), get().getPlaceholder());
  }

  // Protected override.
  default F setPlaceholder(final String placeholder) {
    get().setPlaceholder(placeholder);

    return uncheckedThis();
  }

  // Protected override.
  default F setLabel(final String label) {
    get().setLabel(label);

    return uncheckedThis();
  }

  // Protected override.
  default ValueBreak<T, F, String> getLabel() {
    return new ValueBreak<>(uncheckedThis(), get().getLabel());
  }

  // Protected override.
  default F setAutofocus(final boolean autofocus) {
    get().setAutofocus(autofocus);

    return uncheckedThis();
  }

  default BooleanValueBreak<T, F> isAutofocus() {
    return new BooleanValueBreak<>(uncheckedThis(), get().isAutofocus());
  }

  @Override
  default F setDataProvider(final DataProvider<T2, ?> dataProvider) {
    get().setDataProvider(dataProvider);

    return uncheckedThis();
  }

  default ValueBreak<T, F, DataProvider<T2, ?>> getDataProvider() {
    return new ValueBreak<>(uncheckedThis(), get().getDataProvider());
  }

  @Override
  default F onEnabledStateChanged(final boolean enabled) {
    get().onEnabledStateChanged(enabled);

    return uncheckedThis();
  }

  @Override
  default F setRequiredIndicatorVisible(final boolean requiredIndicatorVisible) {
    get().setRequiredIndicatorVisible(requiredIndicatorVisible);

    return uncheckedThis();
  }

  @Override
  default BooleanValueBreak<T, F> isRequiredIndicatorVisible() {
    return new BooleanValueBreak<>(uncheckedThis(), get().isRequiredIndicatorVisible());
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

  @Override
  default F add(final Component... components) {
    get().add(components);

    return uncheckedThis();
  }

  @Override
  default F addComponents(final T2 afterItem, final Component... components) {
    get().addComponents(afterItem, components);

    return uncheckedThis();
  }

  @Override
  default F prependComponents(final T2 beforeItem, final Component... components) {
    get().prependComponents(beforeItem, components);

    return uncheckedThis();
  }

  @Override
  default F addComponentAtIndex(final int index, final Component component) {
    get().addComponentAtIndex(index, component);

    return uncheckedThis();
  }

  @Override
  default F addComponentAsFirst(final Component component) {
    get().addComponentAsFirst(component);

    return uncheckedThis();
  }

  // Protected override.
  default F addToPrefix(final Component... components) {
    get().addToPrefix(components);

    return uncheckedThis();
  }

  @Override
  default ValueBreak<T, F, Stream<Component>> getChildren() {
    return new ValueBreak<>(uncheckedThis(), get().getChildren());
  }

  @Override
  default F remove(final Component... components) {
    get().remove(components);

    return uncheckedThis();
  }

  @Override
  default F removeAll() {
    get().removeAll();

    return uncheckedThis();
  }

}
