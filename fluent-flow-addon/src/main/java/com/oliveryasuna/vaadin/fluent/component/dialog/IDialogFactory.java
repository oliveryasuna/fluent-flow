package com.oliveryasuna.vaadin.fluent.component.dialog;

import com.oliveryasuna.commons.language.fluent.IFluentFactory;
import com.oliveryasuna.commons.language.fluent.breakdown.BooleanValueBreak;
import com.oliveryasuna.commons.language.fluent.breakdown.ValueBreak;
import com.oliveryasuna.vaadin.fluent.component.HasComponentsFactory;
import com.oliveryasuna.vaadin.fluent.component.HasSizeFactory;
import com.vaadin.flow.component.AttachEvent;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.DetachEvent;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.dialog.Dialog.DialogCloseActionEvent;
import com.vaadin.flow.component.dialog.Dialog.DialogResizeEvent;
import com.vaadin.flow.component.dialog.GeneratedVaadinDialog.OpenedChangeEvent;
import com.vaadin.flow.shared.Registration;

import java.util.stream.Stream;

public interface IDialogFactory<T extends Dialog, F extends IDialogFactory<T, F>> extends IFluentFactory<T, F>, IGeneratedVaadinDialogFactory<T, F, Dialog>,
    HasComponentsFactory<T, F>, HasSizeFactory<T, F> {

  @Override
  default F setWidth(final String width) {
    get().setWidth(width);

    return uncheckedThis();
  }

  @Override
  default F setMinWidth(final String value) {
    get().setMinWidth(value);

    return uncheckedThis();
  }

  @Override
  default F setMaxWidth(final String value) {
    get().setMaxWidth(value);

    return uncheckedThis();
  }

  @Override
  default F setHeight(final String height) {
    get().setHeight(height);

    return uncheckedThis();
  }

  @Override
  default F setMinHeight(final String value) {
    get().setMinHeight(value);

    return uncheckedThis();
  }

  @Override
  default F setMaxHeight(final String value) {
    get().setMaxHeight(value);

    return uncheckedThis();
  }

  @Override
  default ValueBreak<T, F, String> getWidth() {
    return new ValueBreak<>(uncheckedThis(), get().getWidth());
  }

  @Override
  default ValueBreak<T, F, String> getMinWidth() {
    return new ValueBreak<>(uncheckedThis(), get().getMinWidth());
  }

  @Override
  default ValueBreak<T, F, String> getMaxWidth() {
    return new ValueBreak<>(uncheckedThis(), get().getMaxWidth());
  }

  @Override
  default ValueBreak<T, F, String> getHeight() {
    return new ValueBreak<>(uncheckedThis(), get().getHeight());
  }

  @Override
  default ValueBreak<T, F, String> getMinHeight() {
    return new ValueBreak<>(uncheckedThis(), get().getMinHeight());
  }

  @Override
  default ValueBreak<T, F, String> getMaxHeight() {
    return new ValueBreak<>(uncheckedThis(), get().getMaxHeight());
  }

  default ValueBreak<T, F, Registration> addDialogCloseActionListener(final ComponentEventListener<DialogCloseActionEvent> listener) {
    return new ValueBreak<>(uncheckedThis(), get().addDialogCloseActionListener(listener));
  }

  default ValueBreak<T, F, Registration> addResizeListener(final ComponentEventListener<DialogResizeEvent> listener) {
    return new ValueBreak<>(uncheckedThis(), get().addResizeListener(listener));
  }

  @Override
  default F add(final Component... components) {
    get().add(components);

    return uncheckedThis();
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

  @Override
  default F addComponentAtIndex(final int index, final Component component) {
    get().addComponentAtIndex(index, component);

    return uncheckedThis();
  }

  default BooleanValueBreak<T, F> isCloseOnEsc() {
    return new BooleanValueBreak<>(uncheckedThis(), get().isCloseOnEsc());
  }

  default F setCloseOnEsc(final boolean closeOnEsc) {
    get().setCloseOnEsc(closeOnEsc);

    return uncheckedThis();
  }

  default BooleanValueBreak<T, F> isCloseOnOutsideClick() {
    return new BooleanValueBreak<>(uncheckedThis(), get().isCloseOnOutsideClick());
  }

  default F setCloseOnOutsideClick(final boolean closeOnOutsideClick) {
    get().setCloseOnOutsideClick(closeOnOutsideClick);

    return uncheckedThis();
  }

  default F open() {
    get().open();

    return uncheckedThis();
  }

  default F close() {
    get().close();

    return uncheckedThis();
  }

  default F setModal(final boolean modal) {
    get().setModal(modal);

    return uncheckedThis();
  }

  default BooleanValueBreak<T, F> isModal() {
    return new BooleanValueBreak<>(uncheckedThis(), get().isModal());
  }

  default F setDraggable(final boolean draggable) {
    get().setDraggable(draggable);

    return uncheckedThis();
  }

  default BooleanValueBreak<T, F> isDraggable() {
    return new BooleanValueBreak<>(uncheckedThis(), get().isDraggable());
  }

  default F setResizable(final boolean resizable) {
    get().setResizable(resizable);

    return uncheckedThis();
  }

  default BooleanValueBreak<T, F> isResizable() {
    return new BooleanValueBreak<>(uncheckedThis(), get().isResizable());
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
  default ValueBreak<T, F, Stream<Component>> getChildren() {
    return new ValueBreak<>(uncheckedThis(), get().getChildren());
  }

  // Protected override.
  default ValueBreak<T, F, Registration> addOpenedChangeListener(final ComponentEventListener<OpenedChangeEvent<Dialog>> listener) {
    return new ValueBreak<>(uncheckedThis(), get().addOpenedChangeListener(listener));
  }

  @Override
  default ValueBreak<T, F, Registration> addAttachListener(final ComponentEventListener<AttachEvent> listener) {
    return new ValueBreak<>(uncheckedThis(), get().addAttachListener(listener));
  }

  @Override
  default ValueBreak<T, F, Registration> addDetachListener(final ComponentEventListener<DetachEvent> listener) {
    return new ValueBreak<>(uncheckedThis(), get().addDetachListener(listener));
  }

}
