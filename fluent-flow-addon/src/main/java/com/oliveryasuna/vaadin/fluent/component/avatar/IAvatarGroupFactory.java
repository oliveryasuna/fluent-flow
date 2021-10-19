package com.oliveryasuna.vaadin.fluent.component.avatar;

import com.oliveryasuna.commons.language.fluent.IFluentFactory;
import com.oliveryasuna.commons.language.fluent.breakdown.ValueBreak;
import com.oliveryasuna.vaadin.fluent.component.HasSizeFactory;
import com.oliveryasuna.vaadin.fluent.component.HasStyleFactory;
import com.oliveryasuna.vaadin.fluent.component.HasThemeFactory;
import com.oliveryasuna.vaadin.fluent.component.IComponentFactory;
import com.vaadin.flow.component.avatar.AvatarGroup;
import com.vaadin.flow.component.avatar.AvatarGroupVariant;
import com.vaadin.flow.server.AbstractStreamResource;

import java.util.Collection;
import java.util.List;

public interface IAvatarGroupFactory<T extends AvatarGroup, F extends IAvatarGroupFactory<T, F>> extends IFluentFactory<T, F>, IComponentFactory<T, F>,
    HasStyleFactory<T, F>, HasSizeFactory<T, F>, HasThemeFactory<T, F> {

  default F setItems(final Collection<AvatarGroup.AvatarGroupItem> items) {
    get().setItems(items);

    return uncheckedThis();
  }

  default F setItems(final AvatarGroup.AvatarGroupItem... items) {
    get().setItems(items);

    return uncheckedThis();
  }

  default F add(final AvatarGroup.AvatarGroupItem... items) {
    get().add(items);

    return uncheckedThis();
  }

  default F remove(final AvatarGroup.AvatarGroupItem... items) {
    get().remove(items);

    return uncheckedThis();
  }

  default ValueBreak<T, F, List<AvatarGroup.AvatarGroupItem>> getItems() {
    return new ValueBreak<>(uncheckedThis(), get().getItems());
  }

  default ValueBreak<T, F, AvatarGroup.AvatarGroupI18n> getI18n() {
    return new ValueBreak<>(uncheckedThis(), get().getI18n());
  }

  default F setI18n(final AvatarGroup.AvatarGroupI18n i18n) {
    get().setI18n(i18n);

    return uncheckedThis();
  }

  default F setMaxItemsVisible(final Integer max) {
    get().setMaxItemsVisible(max);

    return uncheckedThis();
  }

  default ValueBreak<T, F, Integer> getMaxItemsVisible() {
    return new ValueBreak<>(uncheckedThis(), get().getMaxItemsVisible());
  }

  default F addThemeVariants(final AvatarGroupVariant... variants) {
    get().addThemeVariants(variants);

    return uncheckedThis();
  }

  default F removeThemeVariants(final AvatarGroupVariant... variants) {
    get().removeThemeVariants(variants);

    return uncheckedThis();
  }

  interface IAvatarGroupItemFactory<T extends AvatarGroup.AvatarGroupItem, F extends IAvatarGroupItemFactory<T, F>> extends IFluentFactory<T, F> {

    default ValueBreak<T, F, String> getName() {
      return new ValueBreak<>(uncheckedThis(), get().getName());
    }

    default F setName(final String name) {
      get().setName(name);

      return uncheckedThis();
    }

    default ValueBreak<T, F, String> getAbbreviation() {
      return new ValueBreak<>(uncheckedThis(), get().getAbbreviation());
    }

    default F setAbbreviation(final String abbr) {
      get().setAbbreviation(abbr);

      return uncheckedThis();
    }

    default ValueBreak<T, F, String> getImage() {
      return new ValueBreak<>(uncheckedThis(), get().getImage());
    }

    default ValueBreak<T, F, AbstractStreamResource> getImageResource() {
      return new ValueBreak<>(uncheckedThis(), get().getImageResource());
    }

    default F setImage(final String url) {
      get().setImage(url);

      return uncheckedThis();
    }

    default F setImageResource(final AbstractStreamResource resource) {
      get().setImageResource(resource);

      return uncheckedThis();
    }

    default ValueBreak<T, F, Integer> getColorIndex() {
      return new ValueBreak<>(uncheckedThis(), get().getColorIndex());
    }

    default F setColorIndex(final Integer colorIndex) {
      get().setColorIndex(colorIndex);

      return uncheckedThis();
    }

  }

  // TODO: AvatarGroupI18n?

}
