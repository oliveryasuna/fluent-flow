package com.oliveryasuna.vaadin.fluent.component.tabs;

import com.oliveryasuna.commons.language.pattern.fluent.IFluentFactory;
import com.oliveryasuna.commons.language.pattern.fluent.breakdown.BooleanValueBreak;
import com.oliveryasuna.commons.language.pattern.fluent.breakdown.DoubleValueBreak;
import com.oliveryasuna.commons.language.pattern.fluent.breakdown.ValueBreak;
import com.oliveryasuna.vaadin.fluent.component.HasComponentsFactory;
import com.vaadin.flow.component.tabs.Tab;

public interface ITabFactory<T extends Tab, F extends ITabFactory<T, F>> extends IFluentFactory<T, F>, IGeneratedVaadinTabFactory<T, F, Tab>,
    HasComponentsFactory<T, F> {

  default ValueBreak<T, F, String> getLabel() {
    return new ValueBreak<>(uncheckedThis(), get().getLabel());
  }

  default F setLabel(final String label) {
    get().setLabel(label);

    return uncheckedThis();
  }

  default F setFlexGrow(final double flexGrow) {
    get().setFlexGrow(flexGrow);

    return uncheckedThis();
  }

  default DoubleValueBreak<T, F> getFlexGrow() {
    return new DoubleValueBreak<>(uncheckedThis(), get().getFlexGrow());
  }

  // Protected override.
  default F setSelected(final boolean selected) {
    get().setSelected(selected);

    return uncheckedThis();
  }

  default BooleanValueBreak<T, F> isSelected() {
    return new BooleanValueBreak<>(uncheckedThis(), get().isSelected());
  }

  // toString().

}
