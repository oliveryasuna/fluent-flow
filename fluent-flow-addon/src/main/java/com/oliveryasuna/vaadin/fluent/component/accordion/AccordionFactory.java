package com.oliveryasuna.vaadin.fluent.component.accordion;

import com.oliveryasuna.vaadin.fluent.component.ComponentFactory;
import com.vaadin.flow.component.accordion.Accordion;

public class AccordionFactory extends ComponentFactory<Accordion, AccordionFactory> implements IAccordionFactory<Accordion, AccordionFactory> {

  public AccordionFactory(final Accordion accordion) {
    super(accordion);
  }

  public AccordionFactory() {
    super(new Accordion());
  }

}
