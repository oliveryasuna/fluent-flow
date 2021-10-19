package com.oliveryasuna.vaadin.fluent.component.notification;

import com.oliveryasuna.commons.language.fluent.IFluentFactory;
import com.oliveryasuna.commons.language.fluent.breakdown.BooleanValueBreak;
import com.oliveryasuna.commons.language.fluent.breakdown.IntValueBreak;
import com.oliveryasuna.commons.language.fluent.breakdown.ValueBreak;
import com.oliveryasuna.vaadin.fluent.component.HasComponentsFactory;
import com.oliveryasuna.vaadin.fluent.component.HasThemeFactory;
import com.vaadin.flow.component.AttachEvent;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.DetachEvent;
import com.vaadin.flow.component.notification.GeneratedVaadinNotification.OpenedChangeEvent;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.notification.NotificationVariant;
import com.vaadin.flow.shared.Registration;

import java.util.stream.Stream;

public interface INotificationFactory<T extends Notification, F extends INotificationFactory<T, F>> extends IFluentFactory<T, F>,
    IGeneratedVaadinNotificationFactory<T, F, Notification>, HasComponentsFactory<T, F>, HasThemeFactory<T, F> {

  default F setText(final String text) {
    get().setText(text);

    return uncheckedThis();
  }

  default F setPosition(final Notification.Position position) {
    get().setPosition(position);

    return uncheckedThis();
  }

  default ValueBreak<T, F, Notification.Position> getPosition(final Notification.Position position) {
    return new ValueBreak<>(uncheckedThis(), get().getPosition());
  }

  default F open() {
    get().open();

    return uncheckedThis();
  }

  default F close() {
    get().close();

    return uncheckedThis();
  }

  default F add(final Component... components) {
    get().add(components);

    return uncheckedThis();
  }

  default F remove(final Component... components) {
    get().remove(components);

    return uncheckedThis();
  }

  default F addComponentAtIndex(final int index, final Component component) {
    get().addComponentAtIndex(index, component);

    return uncheckedThis();
  }

  default F removeAll() {
    get().removeAll();

    return uncheckedThis();
  }

  default ValueBreak<T, F, Stream<Component>> getChildren() {
    return new ValueBreak<>(uncheckedThis(), get().getChildren());
  }

  default F setOpened(final boolean opened) {
    get().setOpened(opened);

    return uncheckedThis();
  }

  default BooleanValueBreak<T, F> isOpened() {
    return new BooleanValueBreak<>(uncheckedThis(), get().isOpened());
  }

  default ValueBreak<T, F, Registration> addOpenedChangeListener(final ComponentEventListener<OpenedChangeEvent<Notification>> listener) {
    return new ValueBreak<>(uncheckedThis(), get().addOpenedChangeListener(listener));
  }

  default F setDuration(final int duration) {
    get().setDuration(duration);

    return uncheckedThis();
  }

  default IntValueBreak<T, F> getDuration() {
    return new IntValueBreak<>(uncheckedThis(), get().getDuration());
  }

  default ValueBreak<T, F, Registration> addAttachListener(final ComponentEventListener<AttachEvent> listener) {
    return new ValueBreak<>(uncheckedThis(), get().addAttachListener(listener));
  }

  default ValueBreak<T, F, Registration> addDetachListener(final ComponentEventListener<DetachEvent> listener) {
    return new ValueBreak<>(uncheckedThis(), get().addDetachListener(listener));
  }

  default F addThemeVariants(final NotificationVariant... variants) {
    get().addThemeVariants(variants);

    return uncheckedThis();
  }

  default F removeThemeVariants(final NotificationVariant... variants) {
    get().removeThemeVariants(variants);

    return uncheckedThis();
  }

}
