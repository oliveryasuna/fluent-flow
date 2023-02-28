package com.oliveryasuna.vaadin.fluent.component.avatar;

import com.oliveryasuna.commons.language.pattern.fluent.IFluentFactory;
import com.oliveryasuna.commons.language.pattern.fluent.breakdown.IntValueBreak;
import com.oliveryasuna.commons.language.pattern.fluent.breakdown.ValueBreak;
import com.oliveryasuna.vaadin.fluent.component.HasSizeFactory;
import com.oliveryasuna.vaadin.fluent.component.HasStyleFactory;
import com.oliveryasuna.vaadin.fluent.component.HasThemeFactory;
import com.oliveryasuna.vaadin.fluent.component.IComponentFactory;
import com.vaadin.flow.component.avatar.Avatar;
import com.vaadin.flow.component.avatar.Avatar.AvatarI18n;
import com.vaadin.flow.component.avatar.AvatarVariant;
import com.vaadin.flow.server.AbstractStreamResource;

public interface IAvatarFactory<T extends Avatar, F extends IAvatarFactory<T, F>> extends IFluentFactory<T, F>, IComponentFactory<T, F>, HasStyleFactory<T, F>,
    HasSizeFactory<T, F>, HasThemeFactory<T, F> {

  default ValueBreak<T, F, AvatarI18n> getI18n() {
    return new ValueBreak<>(uncheckedThis(), get().getI18n());
  }

  default F setI18n(final AvatarI18n i18n) {
    get().setI18n(i18n);

    return uncheckedThis();
  }

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

  default IntValueBreak<T, F> getColorIndex() {
    return new IntValueBreak<>(uncheckedThis(), get().getColorIndex());
  }

  default F setColorIndex(final Integer colorIndex) {
    get().setColorIndex(colorIndex);

    return uncheckedThis();
  }

  default F addThemeVariants(final AvatarVariant... variants) {
    get().addThemeVariants(variants);

    return uncheckedThis();
  }

  default F removeThemeVariants(final AvatarVariant... variants) {
    get().removeThemeVariants(variants);

    return uncheckedThis();
  }

  // TODO: AvatarI18n?

}
