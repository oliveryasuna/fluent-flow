package com.oliveryasuna.vaadin.fluent.component.contextmenu;

import com.oliveryasuna.commons.language.pattern.fluent.FluentFactory;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.contextmenu.ContextMenu;

public class ContextMenuFactory extends FluentFactory<ContextMenu, ContextMenuFactory> implements IContextMenuFactory<ContextMenu, ContextMenuFactory> {

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
