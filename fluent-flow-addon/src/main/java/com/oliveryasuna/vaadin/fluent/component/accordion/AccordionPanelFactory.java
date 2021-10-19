package com.oliveryasuna.vaadin.fluent.component.accordion;

import com.oliveryasuna.commons.language.fluent.FluentFactory;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.accordion.AccordionPanel;

public class AccordionPanelFactory extends FluentFactory<AccordionPanel, AccordionPanelFactory>
    implements IAccordionPanelFactory<AccordionPanel, AccordionPanelFactory> {

  public AccordionPanelFactory(final AccordionPanel accordionPanel) {
    super(accordionPanel);
  }

  public AccordionPanelFactory() {
    super(new AccordionPanel());
  }

  public AccordionPanelFactory(final String summary, final Component content) {
    super(new AccordionPanel(summary, content));
  }

  public AccordionPanelFactory(final Component summary, final Component content) {
    super(new AccordionPanel(summary, content));
  }

}
