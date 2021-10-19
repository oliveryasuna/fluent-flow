package com.oliveryasuna.vaadin.fluent.component;

import com.oliveryasuna.commons.language.fluent.IFluentFactory;
import com.oliveryasuna.commons.language.fluent.breakdown.ValueBreak;
import com.vaadin.flow.component.HasSize;
import com.vaadin.flow.component.Unit;

import java.util.Optional;

public interface HasSizeFactory<T extends HasSize, F extends HasSizeFactory<T, F>> extends IFluentFactory<T, F>, HasElementFactory<T, F> {

  default F setWidth(final String width) {
    get().setWidth(width);

    return uncheckedThis();
  }

  default F setWidth(final float width, final Unit unit) {
    get().setWidth(width, unit);

    return uncheckedThis();
  }

  default F setMinWidth(final String minWidth) {
    get().setMinWidth(minWidth);

    return uncheckedThis();
  }

  default F setMinWidth(final float minWidth, final Unit unit) {
    get().setMinWidth(minWidth, unit);

    return uncheckedThis();
  }

  default F setMaxWidth(final String maxWidth) {
    get().setMaxWidth(maxWidth);

    return uncheckedThis();
  }

  default F setMaxWidth(final float maxWidth, final Unit unit) {
    get().setMaxWidth(maxWidth, unit);

    return uncheckedThis();
  }

  default ValueBreak<T, F, String> getWidth() {
    return new ValueBreak<>(uncheckedThis(), get().getWidth());
  }

  default ValueBreak<T, F, String> getMinWidth() {
    return new ValueBreak<>(uncheckedThis(), get().getMinWidth());
  }

  default ValueBreak<T, F, String> getMaxWidth() {
    return new ValueBreak<>(uncheckedThis(), get().getMaxWidth());
  }

  default ValueBreak<T, F, Optional<Unit>> getWidthUnit() {
    return new ValueBreak<>(uncheckedThis(), get().getWidthUnit());
  }

  default F setHeight(final String height) {
    get().setHeight(height);

    return uncheckedThis();
  }

  default F setHeight(final float height, final Unit unit) {
    get().setHeight(height, unit);

    return uncheckedThis();
  }

  default F setMinHeight(final String minHeight) {
    get().setMinHeight(minHeight);

    return uncheckedThis();
  }

  default F setMinHeight(final float minHeight, final Unit unit) {
    get().setMinHeight(minHeight, unit);

    return uncheckedThis();
  }

  default F setMaxHeight(final String maxHeight) {
    get().setMaxHeight(maxHeight);

    return uncheckedThis();
  }

  default F setMaxHeight(final float maxHeight, final Unit unit) {
    get().setMaxHeight(maxHeight, unit);

    return uncheckedThis();
  }

  default ValueBreak<T, F, String> getHeight() {
    return new ValueBreak<>(uncheckedThis(), get().getHeight());
  }

  default ValueBreak<T, F, String> getMinHeight() {
    return new ValueBreak<>(uncheckedThis(), get().getMinHeight());
  }

  default ValueBreak<T, F, String> getMaxHeight() {
    return new ValueBreak<>(uncheckedThis(), get().getMaxHeight());
  }

  default ValueBreak<T, F, Optional<Unit>> getHeightUnit() {
    return new ValueBreak<>(uncheckedThis(), get().getHeightUnit());
  }

  default F setSizeFull() {
    get().setSizeFull();

    return uncheckedThis();
  }

  default F setWidthFull() {
    get().setWidthFull();

    return uncheckedThis();
  }

  default F setHeightFull() {
    get().setHeightFull();

    return uncheckedThis();
  }

  default F setSizeUndefined() {
    get().setSizeUndefined();

    return uncheckedThis();
  }

}
