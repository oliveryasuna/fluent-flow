package com.oliveryasuna.vaadin.fluent.component.html;

import com.oliveryasuna.commons.language.fluent.IFluentFactory;
import com.oliveryasuna.vaadin.fluent.component.ClickNotifierFactory;
import com.oliveryasuna.vaadin.fluent.component.HasOrderedComponentsFactory;
import com.oliveryasuna.vaadin.fluent.component.IHtmlContainerFactory;
import com.vaadin.flow.component.html.Section;

public interface ISectionFactory<T extends Section, F extends ISectionFactory<T, F>> extends IFluentFactory<T, F>, IHtmlContainerFactory<T, F>,
    ClickNotifierFactory<T, F, Section>, HasOrderedComponentsFactory<T, F> {

}
