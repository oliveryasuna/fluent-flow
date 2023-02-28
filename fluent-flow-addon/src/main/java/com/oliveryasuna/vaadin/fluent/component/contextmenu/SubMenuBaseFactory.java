package com.oliveryasuna.vaadin.fluent.component.contextmenu;

import com.oliveryasuna.commons.language.pattern.fluent.FluentFactory;
import com.vaadin.flow.component.contextmenu.ContextMenuBase;
import com.vaadin.flow.component.contextmenu.MenuItemBase;
import com.vaadin.flow.component.contextmenu.SubMenuBase;

public abstract class SubMenuBaseFactory<C extends ContextMenuBase<C, I, S>, I extends MenuItemBase<C, I, S>, S extends SubMenuBase<C, I, S>>
    extends FluentFactory<SubMenuBase<C, I, S>, SubMenuBaseFactory<C, I, S>>
    implements ISubMenuBaseFactory<SubMenuBase<C, I, S>, SubMenuBaseFactory<C, I, S>, C, I, S> {

  public SubMenuBaseFactory(final SubMenuBase<C, I, S> subMenuBase) {
    super(subMenuBase);
  }

}
