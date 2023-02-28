package com.oliveryasuna.vaadin.fluent.component.accordion;

import com.oliveryasuna.commons.language.pattern.fluent.IFluentFactory;
import com.oliveryasuna.commons.language.pattern.fluent.breakdown.ValueBreak;
import com.oliveryasuna.vaadin.fluent.component.HasSizeFactory;
import com.oliveryasuna.vaadin.fluent.component.HasStyleFactory;
import com.oliveryasuna.vaadin.fluent.component.IComponentFactory;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.accordion.Accordion;
import com.vaadin.flow.component.accordion.AccordionPanel;
import com.vaadin.flow.shared.Registration;

import java.util.OptionalInt;

public interface IAccordionFactory<T extends Accordion, F extends IAccordionFactory<T, F>> extends IFluentFactory<T, F>, IComponentFactory<T, F>,
    HasSizeFactory<T, F>, HasStyleFactory<T, F> {

  default ValueBreak<T, F, AccordionPanel> add(final String summary, final Component content) {
    return new ValueBreak<>(uncheckedThis(), get().add(summary, content));
  }

  default ValueBreak<T, F, AccordionPanel> add(final AccordionPanel panel) {
    return new ValueBreak<>(uncheckedThis(), get().add(panel));
  }

  default F remove(final AccordionPanel panel) {
    get().remove(panel);

    return uncheckedThis();
  }

  default F remove(final Component content) {
    get().remove(content);

    return uncheckedThis();
  }

  default F close() {
    get().close();

    return uncheckedThis();
  }

  default F open(final int index) {
    get().open(index);

    return uncheckedThis();
  }

  default F open(final AccordionPanel panel) {
    get().open(panel);

    return uncheckedThis();
  }

  default ValueBreak<T, F, OptionalInt> getOpenedIndex() {
    return new ValueBreak<>(uncheckedThis(), get().getOpenedIndex());
  }

  default ValueBreak<T, F, Registration> addOpenedChangeListener(final ComponentEventListener<Accordion.OpenedChangeEvent> listener) {
    return new ValueBreak<>(uncheckedThis(), get().addOpenedChangeListener(listener));
  }

}
