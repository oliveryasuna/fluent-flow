package com.oliveryasuna.vaadin.fluent.component.contextmenu;

import com.oliveryasuna.commons.language.pattern.fluent.FluentFactory;
import com.vaadin.flow.component.contextmenu.ContextMenuBase;
import com.vaadin.flow.component.contextmenu.MenuItemBase;
import com.vaadin.flow.component.contextmenu.SubMenuBase;

public abstract class ContextMenuBaseFactory<C extends ContextMenuBase<C, I, S>, I extends MenuItemBase<C, I, S>, S extends SubMenuBase<C, I, S>>
    extends FluentFactory<ContextMenuBase<C, I, S>, ContextMenuBaseFactory<C, I, S>>
    implements IContextMenuBaseFactory<ContextMenuBase<C, I, S>, ContextMenuBaseFactory<C, I, S>, C, I, S> {

  public ContextMenuBaseFactory(final ContextMenuBase<C, I, S> contextMenuBase) {
    super(contextMenuBase);
  }

}
