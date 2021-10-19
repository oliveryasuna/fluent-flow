package com.oliveryasuna.vaadin.fluent.component.combobox;

import com.oliveryasuna.commons.language.fluent.IFluentFactory;
import com.oliveryasuna.commons.language.fluent.breakdown.BooleanValueBreak;
import com.oliveryasuna.commons.language.fluent.breakdown.IntValueBreak;
import com.oliveryasuna.commons.language.fluent.breakdown.ValueBreak;
import com.oliveryasuna.vaadin.fluent.component.HasHelperFactory;
import com.oliveryasuna.vaadin.fluent.component.HasSizeFactory;
import com.oliveryasuna.vaadin.fluent.component.HasValidationFactory;
import com.oliveryasuna.vaadin.fluent.data.binder.HasFilterableDataProviderFactory;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.ItemLabelGenerator;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.combobox.GeneratedVaadinComboBox.CustomValueSetEvent;
import com.vaadin.flow.data.provider.DataProvider;
import com.vaadin.flow.data.provider.ListDataProvider;
import com.vaadin.flow.data.renderer.Renderer;
import com.vaadin.flow.function.SerializableFunction;
import com.vaadin.flow.shared.Registration;

import java.util.Collection;

public interface IComboBoxFactory<T extends ComboBox<T2>, F extends IComboBoxFactory<T, F, T2>, T2> extends IFluentFactory<T, F>,
    IGeneratedVaadinComboBoxFactory<T, F, ComboBox<T2>, T2>, HasSizeFactory<T, F>, HasValidationFactory<T, F>,
    HasFilterableDataProviderFactory<T, F, T2, String>, HasHelperFactory<T, F> {

  @Override
  default F setValue(final T2 value) {
    get().setValue(value);

    return uncheckedThis();
  }

  default F setRenderer(final Renderer<T2> renderer) {
    get().setRenderer(renderer);

    return uncheckedThis();
  }

  @Override
  default F setItems(final Collection<T2> items) {
    get().setItems(items);

    return uncheckedThis();
  }

  default F setItems(final ComboBox.ItemFilter<T2> itemFilter, final Collection<T2> items) {
    get().setItems(itemFilter, items);

    return uncheckedThis();
  }

  @Override
  default F setDataProvider(final DataProvider<T2, String> dataProvider) {
    get().setDataProvider(dataProvider);

    return uncheckedThis();
  }

  default <C> F setDataProvider(final DataProvider<T2, C> dataProvider, final SerializableFunction<String, C> filterConverter) {
    get().setDataProvider(dataProvider, filterConverter);

    return uncheckedThis();
  }

  default F setDataProvider(final ListDataProvider<T2> listDataProvider) {
    get().setDataProvider(listDataProvider);

    return uncheckedThis();
  }

  default F setDataProvider(final ComboBox.FetchItemsCallback<T2> fetchItems, final SerializableFunction<String, Integer> sizeCallback) {
    get().setDataProvider(fetchItems, sizeCallback);

    return uncheckedThis();
  }

  default F setDataProvider(final ComboBox.ItemFilter<T2> itemFilter, final ListDataProvider<T2> listDataProvider) {
    get().setDataProvider(itemFilter, listDataProvider);

    return uncheckedThis();
  }

  default ValueBreak<T, F, DataProvider<T2, ?>> getDataProvider() {
    return new ValueBreak<>(uncheckedThis(), get().getDataProvider());
  }

  default F setItemLabelGenerator(final ItemLabelGenerator<T2> itemLabelGenerator) {
    get().setItemLabelGenerator(itemLabelGenerator);

    return uncheckedThis();
  }

  default ValueBreak<T, F, ItemLabelGenerator<T2>> getItemLabelGenerator() {
    return new ValueBreak<>(uncheckedThis(), get().getItemLabelGenerator());
  }

  default F setPageSize(final int pageSize) {
    get().setPageSize(pageSize);

    return uncheckedThis();
  }

  default IntValueBreak<T, F> getPageSize() {
    return new IntValueBreak<>(uncheckedThis(), get().getPageSize());
  }

  // Protected override.
  default F setOpened(final boolean opened) {
    get().setOpened(opened);

    return uncheckedThis();
  }

  default BooleanValueBreak<T, F> isOpened() {
    return new BooleanValueBreak<>(uncheckedThis(), get().isOpened());
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
  default F setErrorMessage(final String errorMessage) {
    get().setErrorMessage(errorMessage);

    return uncheckedThis();
  }

  @Override
  default ValueBreak<T, F, String> getErrorMessage() {
    return new ValueBreak<>(uncheckedThis(), get().getErrorMessage());
  }

  // Protected override.
  default F setAllowCustomValue(final boolean allowCustomValue) {
    get().setAllowCustomValue(allowCustomValue);

    return uncheckedThis();
  }

  default BooleanValueBreak<T, F> isAllowCustomValue() {
    return new BooleanValueBreak<>(uncheckedThis(), get().isAllowCustomValue());
  }

  default F setAutoOpen(final boolean autoOpen) {
    get().setAutoOpen(autoOpen);

    return uncheckedThis();
  }

  default BooleanValueBreak<T, F> isAutoOpen() {
    return new BooleanValueBreak<>(uncheckedThis(), get().isAutoOpen());
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
  default F setPreventInvalidInput(final boolean preventInvalidInput) {
    get().setPreventInvalidInput(preventInvalidInput);

    return uncheckedThis();
  }

  default BooleanValueBreak<T, F> isPreventInvalidInput() {
    return new BooleanValueBreak<>(uncheckedThis(), get().isPreventInvalidInput());
  }

  // Protected override.
  default F setRequired(final boolean required) {
    get().setRequired(required);

    return uncheckedThis();
  }

  default BooleanValueBreak<T, F> isRequired() {
    return new BooleanValueBreak<>(uncheckedThis(), get().isRequired());
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

  // Protected override.
  default F setPattern(final String pattern) {
    get().setPattern(pattern);

    return uncheckedThis();
  }

  default ValueBreak<T, F, String> getPattern() {
    return new ValueBreak<>(uncheckedThis(), get().getPattern());
  }

  @Override
  default ValueBreak<T, F, T2> getEmptyValue() {
    return new ValueBreak<>(uncheckedThis(), get().getEmptyValue());
  }

  // Protected override.
  default ValueBreak<T, F, Registration> addCustomValueSetListener(final ComponentEventListener<CustomValueSetEvent<ComboBox<T2>>> listener) {
    return new ValueBreak<>(uncheckedThis(), get().addCustomValueSetListener(listener));
  }

  @Override
  default F setRequiredIndicatorVisible(final boolean requiredIndicatorVisible) {
    get().setRequiredIndicatorVisible(requiredIndicatorVisible);

    return uncheckedThis();
  }

  // Protected override.
  default F setClearButtonVisible(final boolean clearButtonVisible) {
    get().setClearButtonVisible(clearButtonVisible);

    return uncheckedThis();
  }

  default BooleanValueBreak<T, F> isClearButtonVisible() {
    return new BooleanValueBreak<>(uncheckedThis(), get().isClearButtonVisible());
  }

}
