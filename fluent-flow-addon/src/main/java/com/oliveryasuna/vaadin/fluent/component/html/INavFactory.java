package com.oliveryasuna.vaadin.fluent.component.html;

import com.oliveryasuna.commons.language.fluent.IFluentFactory;
import com.oliveryasuna.vaadin.fluent.component.ClickNotifierFactory;
import com.oliveryasuna.vaadin.fluent.component.HasOrderedComponentsFactory;
import com.oliveryasuna.vaadin.fluent.component.IHtmlContainerFactory;
import com.vaadin.flow.component.html.Nav;

public interface INavFactory<T extends Nav, F extends INavFactory<T, F>> extends IFluentFactory<T, F>, IHtmlContainerFactory<T, F>,
    ClickNotifierFactory<T, F, Nav>, HasOrderedComponentsFactory<T, F> {

}
