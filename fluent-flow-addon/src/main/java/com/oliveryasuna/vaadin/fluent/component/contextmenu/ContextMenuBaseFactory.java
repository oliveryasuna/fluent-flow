package com.oliveryasuna.vaadin.fluent.component.contextmenu;

import com.oliveryasuna.vaadin.fluent.component.ComponentFactory;
import com.vaadin.flow.component.contextmenu.ContextMenuBase;
import com.vaadin.flow.component.contextmenu.MenuItemBase;
import com.vaadin.flow.component.contextmenu.SubMenuBase;

public class ContextMenuBaseFactory<C extends ContextMenuBase<C, I, S>, I extends MenuItemBase<C, I, S>, S extends SubMenuBase<C, I, S>>
    extends ComponentFactory<ContextMenuBase<C, I, S>, ContextMenuBaseFactory<C, I, S>>
    implements IContextMenuBaseFactory<ContextMenuBase<C, I, S>, ContextMenuBaseFactory<C, I, S>, C, I, S> {

  public ContextMenuBaseFactory(final ContextMenuBase<C, I, S> contextMenuBase) {
    super(contextMenuBase);
  }

}
