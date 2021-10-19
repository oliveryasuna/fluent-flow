package com.oliveryasuna.vaadin.fluent.component.orderedlayout;

import com.oliveryasuna.commons.language.fluent.IFluentFactory;
import com.oliveryasuna.commons.language.fluent.breakdown.ValueBreak;
import com.oliveryasuna.vaadin.fluent.component.HasSizeFactory;
import com.oliveryasuna.vaadin.fluent.component.HasStyleFactory;
import com.oliveryasuna.vaadin.fluent.component.IComponentFactory;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.orderedlayout.Scroller;
import com.vaadin.flow.component.orderedlayout.Scroller.ScrollDirection;

public interface IScrollerFactory<T extends Scroller, F extends IScrollerFactory<T, F>> extends IFluentFactory<T, F>, IComponentFactory<T, F>,
    HasSizeFactory<T, F>, HasStyleFactory<T, F> {

  default F setContent(final Component content) {
    get().setContent(content);

    return uncheckedThis();
  }

  default ValueBreak<T, F, Component> getContent() {
    return new ValueBreak<>(uncheckedThis(), get().getContent());
  }

  default F setScrollDirection(final ScrollDirection scrollDirection) {
    get().setScrollDirection(scrollDirection);

    return uncheckedThis();
  }

  default ValueBreak<T, F, ScrollDirection> getScrollDirection() {
    return new ValueBreak<>(uncheckedThis(), get().getScrollDirection());
  }

}
