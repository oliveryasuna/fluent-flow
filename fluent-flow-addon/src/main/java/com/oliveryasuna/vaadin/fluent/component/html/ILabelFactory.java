package com.oliveryasuna.vaadin.fluent.component.html;

import com.oliveryasuna.commons.language.fluent.IFluentFactory;
import com.oliveryasuna.commons.language.fluent.breakdown.ValueBreak;
import com.oliveryasuna.vaadin.fluent.component.IHtmlContainerFactory;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.html.Label;

import java.util.Optional;

public interface ILabelFactory<T extends Label, F extends ILabelFactory<T, F>> extends IFluentFactory<T, F>, IHtmlContainerFactory<T, F> {

  default F setFor(final Component forComponent) {
    get().setFor(forComponent);

    return uncheckedThis();
  }

  default F setFor(final String forId) {
    get().setFor(forId);

    return uncheckedThis();
  }

  default ValueBreak<T, F, Optional<String>> getFor() {
    return new ValueBreak<>(uncheckedThis(), get().getFor());
  }

}
