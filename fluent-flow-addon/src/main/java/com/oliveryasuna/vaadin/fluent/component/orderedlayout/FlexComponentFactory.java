package com.oliveryasuna.vaadin.fluent.component.orderedlayout;

import com.oliveryasuna.commons.language.fluent.IFluentFactory;
import com.oliveryasuna.commons.language.fluent.breakdown.DoubleValueBreak;
import com.oliveryasuna.commons.language.fluent.breakdown.ValueBreak;
import com.oliveryasuna.vaadin.fluent.component.HasOrderedComponentsFactory;
import com.oliveryasuna.vaadin.fluent.component.HasSizeFactory;
import com.oliveryasuna.vaadin.fluent.component.HasStyleFactory;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.HasElement;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.FlexComponent.Alignment;
import com.vaadin.flow.component.orderedlayout.FlexComponent.JustifyContentMode;

public interface FlexComponentFactory<T extends FlexComponent<C>, F extends FlexComponentFactory<T, F, C>, C extends Component> extends IFluentFactory<T, F>,
    HasOrderedComponentsFactory<T, F>, HasStyleFactory<T, F>, HasSizeFactory<T, F> {

  default F setAlignItems(final Alignment alignment) {
    get().setAlignItems(alignment);

    return uncheckedThis();
  }

  default ValueBreak<T, F, Alignment> getAlignItems() {
    return new ValueBreak<>(uncheckedThis(), get().getAlignItems());
  }

  default F setAlignSelf(final Alignment alignment, final HasElement... elementContainers) {
    get().setAlignSelf(alignment, elementContainers);

    return uncheckedThis();
  }

  default ValueBreak<T, F, Alignment> getAlignSelf(final HasElement container) {
    return new ValueBreak<>(uncheckedThis(), get().getAlignSelf(container));
  }

  default F setFlexGrow(final double flexGrow, final HasElement... elementContainers) {
    get().setFlexGrow(flexGrow, elementContainers);

    return uncheckedThis();
  }

  default DoubleValueBreak<T, F> getFlexGrow(final HasElement elementContainer) {
    return new DoubleValueBreak<>(uncheckedThis(), get().getFlexGrow(elementContainer));
  }

  default F setJustifyContentMode(final JustifyContentMode justifyContentMode) {
    get().setJustifyContentMode(justifyContentMode);

    return uncheckedThis();
  }

  default ValueBreak<T, F, JustifyContentMode> getJustifyContentMode() {
    return new ValueBreak<>(uncheckedThis(), get().getJustifyContentMode());
  }

  default F expand(final Component... componentsToExpand) {
    get().expand(componentsToExpand);

    return uncheckedThis();
  }

  default F replace(final Component oldComponent, final Component newComponent) {
    get().replace(oldComponent, newComponent);

    return uncheckedThis();
  }

}
