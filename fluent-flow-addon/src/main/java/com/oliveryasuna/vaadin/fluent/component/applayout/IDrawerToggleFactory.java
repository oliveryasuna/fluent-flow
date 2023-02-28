package com.oliveryasuna.vaadin.fluent.component.applayout;

import com.oliveryasuna.commons.language.pattern.fluent.IFluentFactory;
import com.oliveryasuna.vaadin.fluent.component.button.IButtonFactory;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.applayout.DrawerToggle;

public interface IDrawerToggleFactory<T extends DrawerToggle, F extends IDrawerToggleFactory<T, F>> extends IFluentFactory<T, F>, IButtonFactory<T, F> {

  @Override
  default F setIcon(final Component icon) {
    get().setIcon(icon);

    return uncheckedThis();
  }

}
