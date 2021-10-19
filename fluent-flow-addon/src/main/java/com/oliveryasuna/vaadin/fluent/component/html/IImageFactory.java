package com.oliveryasuna.vaadin.fluent.component.html;

import com.oliveryasuna.commons.language.fluent.IFluentFactory;
import com.oliveryasuna.commons.language.fluent.breakdown.ValueBreak;
import com.oliveryasuna.vaadin.fluent.component.ClickNotifierFactory;
import com.oliveryasuna.vaadin.fluent.component.IHtmlContainerFactory;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.server.AbstractStreamResource;

import java.util.Optional;

public interface IImageFactory<T extends Image, F extends IImageFactory<T, F>> extends IFluentFactory<T, F>, IHtmlContainerFactory<T, F>,
    ClickNotifierFactory<T, F, Image> {

  default ValueBreak<T, F, String> getSrc() {
    return new ValueBreak<>(uncheckedThis(), get().getSrc());
  }

  default F setSrc(final String src) {
    get().setSrc(src);

    return uncheckedThis();
  }

  default F setSrc(final AbstractStreamResource src) {
    get().setSrc(src);

    return uncheckedThis();
  }

  default F setAlt(final String alt) {
    get().setAlt(alt);

    return uncheckedThis();
  }

  default ValueBreak<T, F, Optional<String>> getAlt() {
    return new ValueBreak<>(uncheckedThis(), get().getAlt());
  }

}
