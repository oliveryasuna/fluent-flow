package com.oliveryasuna.vaadin.fluent.component.avatar;

import com.oliveryasuna.vaadin.fluent.component.ComponentFactory;
import com.vaadin.flow.component.avatar.Avatar;

public class AvatarFactory extends ComponentFactory<Avatar, AvatarFactory> implements IAvatarFactory<Avatar, AvatarFactory> {

  public AvatarFactory(final Avatar avatar) {
    super(avatar);
  }

  public AvatarFactory(final String name) {
    super(new Avatar(name));
  }

  public AvatarFactory(final String name, final String url) {
    super(new Avatar(name, url));
  }

}
