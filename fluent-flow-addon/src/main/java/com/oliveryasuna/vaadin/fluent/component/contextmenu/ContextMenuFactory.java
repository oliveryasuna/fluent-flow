package com.oliveryasuna.vaadin.fluent.component.contextmenu;

import com.oliveryasuna.vaadin.fluent.component.ComponentFactory;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.contextmenu.ContextMenu;

public class ContextMenuFactory extends ComponentFactory<ContextMenu, ContextMenuFactory> implements IContextMenuFactory<ContextMenu, ContextMenuFactory> {

  public ContextMenuFactory(final ContextMenu contextMenu) {
    super(contextMenu);
  }

  public ContextMenuFactory() {
    super(new ContextMenu());
  }

  public ContextMenuFactory(final Component target) {
    super(new ContextMenu(target));
  }

}
