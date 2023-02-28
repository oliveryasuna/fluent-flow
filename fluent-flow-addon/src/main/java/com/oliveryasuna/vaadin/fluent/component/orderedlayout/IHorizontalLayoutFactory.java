package com.oliveryasuna.vaadin.fluent.component.orderedlayout;

import com.oliveryasuna.commons.language.pattern.fluent.IFluentFactory;
import com.oliveryasuna.commons.language.pattern.fluent.breakdown.ValueBreak;
import com.oliveryasuna.vaadin.fluent.component.ClickNotifierFactory;
import com.oliveryasuna.vaadin.fluent.component.IComponentFactory;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.HasElement;
import com.vaadin.flow.component.orderedlayout.FlexComponent.Alignment;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

public interface IHorizontalLayoutFactory<T extends HorizontalLayout, F extends IHorizontalLayoutFactory<T, F>> extends IFluentFactory<T, F>,
    IComponentFactory<T, F>, ThemableLayoutFactory<T, F>, FlexComponentFactory<T, F, HorizontalLayout>, ClickNotifierFactory<T, F, HorizontalLayout> {

  @Override
  default F setSpacing(final boolean spacing) {
    get().setSpacing(spacing);

    return uncheckedThis();
  }

  default F setVerticalComponentAlignment(final Alignment alignment, final Component... componentsToAlign) {
    get().setVerticalComponentAlignment(alignment, componentsToAlign);

    return uncheckedThis();
  }

  default ValueBreak<T, F, Alignment> getVerticalComponentAlignment(final Component component) {
    return new ValueBreak<>(uncheckedThis(), get().getVerticalComponentAlignment(component));
  }

  default F setDefaultVerticalComponentAlignment(final Alignment alignment) {
    get().setDefaultVerticalComponentAlignment(alignment);

    return uncheckedThis();
  }

  default ValueBreak<T, F, Alignment> getDefaultVerticalComponentAlignment() {
    return new ValueBreak<>(uncheckedThis(), get().getDefaultVerticalComponentAlignment());
  }

  @Override
  default F setAlignItems(final Alignment alignment) {
    get().setAlignItems(alignment);

    return uncheckedThis();
  }

  @Override
  default ValueBreak<T, F, Alignment> getAlignItems() {
    return new ValueBreak<>(uncheckedThis(), get().getAlignItems());
  }

  @Override
  default F setAlignSelf(final Alignment alignment, final HasElement... elementContainers) {
    get().setAlignSelf(alignment, elementContainers);

    return uncheckedThis();
  }

  @Override
  default ValueBreak<T, F, Alignment> getAlignSelf(final HasElement container) {
    return new ValueBreak<>(uncheckedThis(), get().getAlignSelf(container));
  }

  default F addAndExpand(final Component... components) {
    get().addAndExpand(components);

    return uncheckedThis();
  }

}
