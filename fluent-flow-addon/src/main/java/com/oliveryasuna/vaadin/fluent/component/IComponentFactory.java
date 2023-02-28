package com.oliveryasuna.vaadin.fluent.component;

import com.oliveryasuna.commons.language.pattern.fluent.IFluentFactory;
import com.oliveryasuna.commons.language.pattern.fluent.breakdown.BooleanValueBreak;
import com.oliveryasuna.commons.language.pattern.fluent.breakdown.ValueBreak;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.dom.Element;

import java.util.Locale;
import java.util.Optional;
import java.util.stream.Stream;

public interface IComponentFactory<T extends Component, F extends IComponentFactory<T, F>> extends IFluentFactory<T, F>, HasElementFactory<T, F>,
    AttachNotifierFactory<T, F>, DetachNotifierFactory<T, F> {

  @Override
  default ValueBreak<T, F, Element> getElement() {
    return new ValueBreak<>(uncheckedThis(), get().getElement());
  }

  default ValueBreak<T, F, Optional<Component>> getParent() {
    return new ValueBreak<>(uncheckedThis(), get().getParent());
  }

  default ValueBreak<T, F, Stream<Component>> getChildren() {
    return new ValueBreak<>(uncheckedThis(), get().getChildren());
  }

  default ValueBreak<T, F, Optional<UI>> getUI() {
    return new ValueBreak<>(uncheckedThis(), get().getUI());
  }

  default F setId(final String id) {
    get().setId(id);

    return uncheckedThis();
  }

  default ValueBreak<T, F, Optional<String>> getId() {
    return new ValueBreak<>(uncheckedThis(), get().getId());
  }

  default F setVisible(final boolean visible) {
    get().setVisible(visible);

    return uncheckedThis();
  }

  default BooleanValueBreak<T, F> isVisible() {
    return new BooleanValueBreak<>(uncheckedThis(), get().isVisible());
  }

  default F onEnabledStateChanged(final boolean enabled) {
    get().onEnabledStateChanged(enabled);

    return uncheckedThis();
  }

  default ValueBreak<T, F, String> getTranslation(final String key, final Object... params) {
    return new ValueBreak<>(uncheckedThis(), get().getTranslation(key, params));
  }

  default ValueBreak<T, F, String> getTranslation(final String key, final Locale locale, final Object... params) {
    return new ValueBreak<>(uncheckedThis(), get().getTranslation(key, locale, params));
  }

}
