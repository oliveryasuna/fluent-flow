package com.oliveryasuna.vaadin.fluent.component.icon;

import com.oliveryasuna.commons.language.pattern.fluent.FluentFactory;
import com.vaadin.flow.component.icon.IronIcon;

public class IronIconFactory extends FluentFactory<IronIcon, IronIconFactory> implements IIronIconFactory<IronIcon, IronIconFactory> {

  public IronIconFactory(final IronIcon ironIcon) {
    super(ironIcon);
  }

  public IronIconFactory(final String collection, final String icon) {
    super(new IronIcon(collection, icon));
  }

}
