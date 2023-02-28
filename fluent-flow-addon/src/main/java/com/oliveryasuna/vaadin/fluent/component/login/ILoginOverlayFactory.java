package com.oliveryasuna.vaadin.fluent.component.login;

import com.oliveryasuna.commons.language.pattern.fluent.IFluentFactory;
import com.oliveryasuna.commons.language.pattern.fluent.breakdown.BooleanValueBreak;
import com.oliveryasuna.commons.language.pattern.fluent.breakdown.ValueBreak;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.login.LoginOverlay;

public interface ILoginOverlayFactory<T extends LoginOverlay, F extends ILoginOverlayFactory<T, F>> extends IFluentFactory<T, F>, IAbstractLoginFactory<T, F> {

  default F close() {
    get().close();

    return uncheckedThis();
  }

  default BooleanValueBreak<T, F> isOpened() {
    return new BooleanValueBreak<>(uncheckedThis(), get().isOpened());
  }

  default F setOpened(final boolean opened) {
    get().setOpened(opened);

    return uncheckedThis();
  }

  default F setTitle(final String title) {
    get().setTitle(title);

    return uncheckedThis();
  }

  default ValueBreak<T, F, String> getTitleAsText() {
    return new ValueBreak<>(uncheckedThis(), get().getTitleAsText());
  }

  default F setTitle(final Component title) {
    get().setTitle(title);

    return uncheckedThis();
  }

  default ValueBreak<T, F, Component> getTitle() {
    return new ValueBreak<>(uncheckedThis(), get().getTitle());
  }

  default F setDescription(final String description) {
    get().setDescription(description);

    return uncheckedThis();
  }

  default ValueBreak<T, F, String> getDescription() {
    return new ValueBreak<>(uncheckedThis(), get().getDescription());
  }

}
