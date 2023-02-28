package com.oliveryasuna.vaadin.fluent.component.accordion;

import com.oliveryasuna.commons.language.pattern.fluent.IFluentFactory;
import com.oliveryasuna.vaadin.fluent.component.details.IDetailsFactory;
import com.vaadin.flow.component.accordion.AccordionPanel;

public interface IAccordionPanelFactory<T extends AccordionPanel, F extends IAccordionPanelFactory<T, F>> extends IFluentFactory<T, F>, IDetailsFactory<T, F> {

}
