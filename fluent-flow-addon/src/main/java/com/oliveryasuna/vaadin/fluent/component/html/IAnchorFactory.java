package com.oliveryasuna.vaadin.fluent.component.html;

import com.oliveryasuna.commons.language.fluent.IFluentFactory;
import com.oliveryasuna.commons.language.fluent.breakdown.ValueBreak;
import com.oliveryasuna.vaadin.fluent.component.FocusableFactory;
import com.oliveryasuna.vaadin.fluent.component.IHtmlContainerFactory;
import com.vaadin.flow.component.html.Anchor;
import com.vaadin.flow.server.AbstractStreamResource;

import java.util.Optional;

public interface IAnchorFactory<T extends Anchor, F extends IAnchorFactory<T, F>> extends IFluentFactory<T, F>, IHtmlContainerFactory<T, F>,
    FocusableFactory<T, F, Anchor> {


  default F setHref(final String href) {
    get().setHref(href);

    return uncheckedThis();
  }

  default F removeHref() {
    get().removeHref();

    return uncheckedThis();
  }

  default F setHref(final AbstractStreamResource href) {
    get().setHref(href);

    return uncheckedThis();
  }

  default ValueBreak<T, F, String> getHref() {
    return new ValueBreak<>(uncheckedThis(), get().getHref());
  }

  default F setTarget(final String target) {
    get().setTarget(target);

    return uncheckedThis();
  }

  default ValueBreak<T, F, Optional<String>> getTarget() {
    return new ValueBreak<>(uncheckedThis(), get().getTarget());
  }

}
