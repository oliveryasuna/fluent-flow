package com.oliveryasuna.vaadin.fluent.component.icon;

import com.oliveryasuna.vaadin.fluent.component.ComponentFactory;
import com.vaadin.flow.component.icon.IronIcon;

public class IronIconFactory extends ComponentFactory<IronIcon, IronIconFactory> implements IIronIconFactory<IronIcon, IronIconFactory> {

  public IronIconFactory(final IronIcon ironIcon) {
    super(ironIcon);
  }

  public IronIconFactory(final String collection, final String icon) {
    super(new IronIcon(collection, icon));
  }

}
