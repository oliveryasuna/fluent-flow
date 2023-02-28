package com.oliveryasuna.vaadin.fluent.component.icon;

import com.oliveryasuna.commons.language.pattern.fluent.IFluentFactory;
import com.oliveryasuna.commons.language.pattern.fluent.breakdown.ValueBreak;
import com.oliveryasuna.vaadin.fluent.component.ClickNotifierFactory;
import com.oliveryasuna.vaadin.fluent.component.HasStyleFactory;
import com.oliveryasuna.vaadin.fluent.component.IComponentFactory;
import com.vaadin.flow.component.icon.IronIcon;

public interface IIronIconFactory<T extends IronIcon, F extends IIronIconFactory<T, F>> extends IFluentFactory<T, F>, IComponentFactory<T, F>,
    HasStyleFactory<T, F>, ClickNotifierFactory<T, F, IronIcon> {

  default F setSize(final String size) {
    get().setSize(size);

    return uncheckedThis();
  }

  default F setColor(final String color) {
    get().setColor(color);

    return uncheckedThis();
  }

  default ValueBreak<T, F, String> getColor() {
    return new ValueBreak<>(uncheckedThis(), get().getColor());
  }

}
