package com.oliveryasuna.vaadin.fluent.component.avatar;

import com.oliveryasuna.vaadin.fluent.component.ComponentFactory;
import com.vaadin.flow.component.avatar.AvatarGroup;
import com.vaadin.flow.component.avatar.AvatarGroup.AvatarGroupItem;

import java.util.Collection;

public class AvatarGroupFactory extends ComponentFactory<AvatarGroup, AvatarGroupFactory> implements IAvatarGroupFactory<AvatarGroup, AvatarGroupFactory> {

  public AvatarGroupFactory(final AvatarGroup avatarGroup) {
    super(avatarGroup);
  }

  public AvatarGroupFactory() {
    super(new AvatarGroup());
  }

  public AvatarGroupFactory(final Collection<AvatarGroupItem> items) {
    super(new AvatarGroup(items));
  }

  public AvatarGroupFactory(final AvatarGroupItem... items) {
    super(new AvatarGroup(items));
  }

  public static class AvatarGroupItemFactory extends ComponentFactory<AvatarGroupItem, AvatarGroupItemFactory>
      implements IAvatarGroupItemFactory<AvatarGroupItem, AvatarGroupItemFactory> {

    public AvatarGroupItemFactory(final AvatarGroupItem avatarGroupItem) {
      super(avatarGroupItem);
    }

    public AvatarGroupItemFactory() {
      super(new AvatarGroupItem());
    }

    public AvatarGroupItemFactory(final String name) {
      super(new AvatarGroupItem(name));
    }

    public AvatarGroupItemFactory(final String name, final String url) {
      super(new AvatarGroupItem(name, url));
    }

  }

}
