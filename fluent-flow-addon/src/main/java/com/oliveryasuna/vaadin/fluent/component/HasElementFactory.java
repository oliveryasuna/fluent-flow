package com.oliveryasuna.vaadin.fluent.component;

import com.oliveryasuna.commons.language.pattern.fluent.IFluentFactory;
import com.oliveryasuna.commons.language.pattern.fluent.breakdown.ValueBreak;
import com.vaadin.flow.component.HasElement;
import com.vaadin.flow.dom.Element;

public interface HasElementFactory<T extends HasElement, F extends HasElementFactory<T, F>> extends IFluentFactory<T, F> {

  default ValueBreak<T, F, Element> getElement() {
    return new ValueBreak<>(uncheckedThis(), get().getElement());
  }

}
