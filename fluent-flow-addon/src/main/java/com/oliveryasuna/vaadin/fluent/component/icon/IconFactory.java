package com.oliveryasuna.vaadin.fluent.component.icon;

import com.oliveryasuna.commons.language.fluent.FluentFactory;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;

public class IconFactory extends FluentFactory<Icon, IconFactory> implements IIconFactory<Icon, IconFactory> {

  public IconFactory(final Icon icon) {
    super(icon);
  }

  public IconFactory() {
    super(new Icon());
  }

  public IconFactory(final VaadinIcon icon) {
    super(new Icon(icon));
  }

  public IconFactory(final String icon) {
    super(new Icon(icon));
  }

  @Deprecated // Per Vaadin.
  public IconFactory(final String collection, final String icon) {
    super(new Icon(collection, icon));
  }

}
