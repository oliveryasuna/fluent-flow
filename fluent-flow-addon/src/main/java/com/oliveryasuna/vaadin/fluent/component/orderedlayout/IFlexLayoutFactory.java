package com.oliveryasuna.vaadin.fluent.component.orderedlayout;

import com.oliveryasuna.commons.language.pattern.fluent.IFluentFactory;
import com.oliveryasuna.commons.language.pattern.fluent.breakdown.DoubleValueBreak;
import com.oliveryasuna.commons.language.pattern.fluent.breakdown.IntValueBreak;
import com.oliveryasuna.commons.language.pattern.fluent.breakdown.ValueBreak;
import com.oliveryasuna.vaadin.fluent.component.ClickNotifierFactory;
import com.oliveryasuna.vaadin.fluent.component.IComponentFactory;
import com.vaadin.flow.component.HasElement;
import com.vaadin.flow.component.orderedlayout.FlexLayout;
import com.vaadin.flow.component.orderedlayout.FlexLayout.ContentAlignment;
import com.vaadin.flow.component.orderedlayout.FlexLayout.FlexDirection;
import com.vaadin.flow.component.orderedlayout.FlexLayout.FlexWrap;
import com.vaadin.flow.component.orderedlayout.FlexLayout.WrapMode;

public interface IFlexLayoutFactory<T extends FlexLayout, F extends IFlexLayoutFactory<T, F>> extends IFluentFactory<T, F>, IComponentFactory<T, F>,
    FlexComponentFactory<T, F, FlexLayout>, ClickNotifierFactory<T, F, FlexLayout> {

  @Deprecated // Per Vaadin.
  default F setWrapMode(final WrapMode wrapMode) {
    get().setWrapMode(wrapMode);

    return uncheckedThis();
  }

  default F setFlexWrap(final FlexWrap flexWrap) {
    get().setFlexWrap(flexWrap);

    return uncheckedThis();
  }

  @Deprecated // Per Vaadin.
  default ValueBreak<T, F, WrapMode> getWrapMode() {
    return new ValueBreak<>(uncheckedThis(), get().getWrapMode());
  }

  default ValueBreak<T, F, FlexWrap> getFlexWrap() {
    return new ValueBreak<>(uncheckedThis(), get().getFlexWrap());
  }

  default F setAlignContent(final ContentAlignment alignment) {
    get().setAlignContent(alignment);

    return uncheckedThis();
  }

  default ValueBreak<T, F, ContentAlignment> getAlignContent() {
    return new ValueBreak<>(uncheckedThis(), get().getAlignContent());
  }

  default F setFlexBasis(final String width, final HasElement... elementContainers) {
    get().setFlexBasis(width, elementContainers);

    return uncheckedThis();
  }

  default ValueBreak<T, F, String> getFlexBasis(final HasElement elementContainer) {
    return new ValueBreak<>(uncheckedThis(), get().getFlexBasis(elementContainer));
  }

  default F setFlexDirection(final FlexDirection flexDirection) {
    get().setFlexDirection(flexDirection);

    return uncheckedThis();
  }

  default ValueBreak<T, F, FlexDirection> getFlexDirection(final HasElement elementContainer) {
    return new ValueBreak<>(uncheckedThis(), get().getFlexDirection(elementContainer));
  }

  default F setFlexShrink(final double flexShrink, final HasElement... elementContainers) {
    get().setFlexShrink(flexShrink, elementContainers);

    return uncheckedThis();
  }

  default DoubleValueBreak<T, F> getFlexShrink(final HasElement elementContainer) {
    return new DoubleValueBreak<>(uncheckedThis(), get().getFlexShrink(elementContainer));
  }

  default F setOrder(final int order, final HasElement elementContainer) {
    get().setOrder(order, elementContainer);

    return uncheckedThis();
  }

  default IntValueBreak<T, F> getOrder(final HasElement elementContainer) {
    return new IntValueBreak<>(uncheckedThis(), get().getOrder(elementContainer));
  }

}
