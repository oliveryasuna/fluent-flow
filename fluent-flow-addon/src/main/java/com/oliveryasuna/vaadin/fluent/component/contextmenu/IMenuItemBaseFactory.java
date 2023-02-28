package com.oliveryasuna.vaadin.fluent.component.contextmenu;

import com.oliveryasuna.commons.language.pattern.fluent.IFluentFactory;
import com.oliveryasuna.commons.language.pattern.fluent.breakdown.ValueBreak;
import com.oliveryasuna.vaadin.fluent.component.HasComponentsFactory;
import com.oliveryasuna.vaadin.fluent.component.HasEnabledFactory;
import com.oliveryasuna.vaadin.fluent.component.HasTextFactory;
import com.oliveryasuna.vaadin.fluent.component.IComponentFactory;
import com.vaadin.flow.component.contextmenu.ContextMenuBase;
import com.vaadin.flow.component.contextmenu.MenuItemBase;
import com.vaadin.flow.component.contextmenu.SubMenuBase;

public interface IMenuItemBaseFactory<T extends MenuItemBase<C, I, S>, F extends IMenuItemBaseFactory<T, F, C, I, S>, C extends ContextMenuBase<C, I, S>,
    I extends MenuItemBase<C, I, S>, S extends SubMenuBase<C, I, S>> extends IFluentFactory<T, F>, IComponentFactory<T, F>, HasTextFactory<T, F>,
    HasComponentsFactory<T, F>, HasEnabledFactory<T, F> {

  default ValueBreak<T, F, C> getContextMenu() {
    return new ValueBreak<>(uncheckedThis(), get().getContextMenu());
  }

  default ValueBreak<T, F, S> getSubMenu() {
    return new ValueBreak<>(uncheckedThis(), get().getSubMenu());
  }

  default ValueBreak<T, F, Boolean> isParentItem() {
    return new ValueBreak<>(uncheckedThis(), get().isParentItem());
  }

  default F setCheckable(final boolean checkable) {
    get().setCheckable(checkable);

    return uncheckedThis();
  }

  default ValueBreak<T, F, Boolean> isCheckable() {
    return new ValueBreak<>(uncheckedThis(), get().isCheckable());
  }

  default F setChecked(final boolean checked) {
    get().setChecked(checked);

    return uncheckedThis();
  }

  default ValueBreak<T, F, Boolean> isChecked() {
    return new ValueBreak<>(uncheckedThis(), get().isChecked());
  }

}
