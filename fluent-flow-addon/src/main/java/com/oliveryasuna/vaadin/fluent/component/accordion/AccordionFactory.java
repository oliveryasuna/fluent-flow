package com.oliveryasuna.vaadin.fluent.component.accordion;

import com.oliveryasuna.commons.language.fluent.FluentFactory;
import com.vaadin.flow.component.accordion.Accordion;

public class AccordionFactory extends FluentFactory<Accordion, AccordionFactory> implements IAccordionFactory<Accordion, AccordionFactory> {

  public AccordionFactory(final Accordion accordion) {
    super(accordion);
  }

  public AccordionFactory() {
    super(new Accordion());
  }

}
