package com.oliveryasuna.vaadin.fluent.component.details;

import com.oliveryasuna.commons.language.fluent.IFluentFactory;
import com.oliveryasuna.commons.language.fluent.breakdown.BooleanValueBreak;
import com.oliveryasuna.commons.language.fluent.breakdown.ValueBreak;
import com.oliveryasuna.vaadin.fluent.component.HasEnabledFactory;
import com.oliveryasuna.vaadin.fluent.component.HasStyleFactory;
import com.oliveryasuna.vaadin.fluent.component.HasThemeFactory;
import com.oliveryasuna.vaadin.fluent.component.IComponentFactory;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.details.Details;
import com.vaadin.flow.component.details.DetailsVariant;
import com.vaadin.flow.shared.Registration;

import java.util.stream.Stream;

public interface IDetailsFactory<T extends Details, F extends IDetailsFactory<T, F>> extends IFluentFactory<T, F>, IComponentFactory<T, F>,
    HasEnabledFactory<T, F>, HasThemeFactory<T, F>, HasStyleFactory<T, F> {

  default F setSummary(final Component summary) {
    get().setSummary(summary);

    return uncheckedThis();
  }

  default ValueBreak<T, F, Component> getSummary() {
    return new ValueBreak<>(uncheckedThis(), get().getSummary());
  }

  default F setSummaryText(final String summary) {
    get().setSummaryText(summary);

    return uncheckedThis();
  }

  default ValueBreak<T, F, String> getSummaryText() {
    return new ValueBreak<>(uncheckedThis(), get().getSummaryText());
  }

  default F setContent(final Component content) {
    get().setContent(content);

    return uncheckedThis();
  }

  default F addContent(final Component content) {
    get().addContent(content);

    return uncheckedThis();
  }

  default ValueBreak<T, F, Stream<Component>> getContent() {
    return new ValueBreak<>(uncheckedThis(), get().getContent());
  }

  default BooleanValueBreak<T, F> isOpened() {
    return new BooleanValueBreak<>(uncheckedThis(), get().isOpened());
  }

  default F setOpened(final boolean opened) {
    get().setOpened(opened);

    return uncheckedThis();
  }

  default F addThemeVariants(final DetailsVariant... variants) {
    get().addThemeVariants(variants);

    return uncheckedThis();
  }

  default F removeThemeVariants(final DetailsVariant... variants) {
    get().removeThemeVariants(variants);

    return uncheckedThis();
  }

  default ValueBreak<T, F, Registration> addOpenedChangeListener(final ComponentEventListener<Details.OpenedChangeEvent> listener) {
    return new ValueBreak<>(uncheckedThis(), get().addOpenedChangeListener(listener));
  }

}
