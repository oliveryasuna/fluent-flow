package com.oliveryasuna.vaadin.fluent.component.html;

import com.oliveryasuna.commons.language.fluent.IFluentFactory;
import com.oliveryasuna.vaadin.fluent.component.ClickNotifierFactory;
import com.oliveryasuna.vaadin.fluent.component.HasOrderedComponentsFactory;
import com.oliveryasuna.vaadin.fluent.component.IHtmlContainerFactory;
import com.vaadin.flow.component.html.Header;

public interface IHeaderFactory<T extends Header, F extends IHeaderFactory<T, F>> extends IFluentFactory<T, F>, IHtmlContainerFactory<T, F>,
    ClickNotifierFactory<T, F, Header>, HasOrderedComponentsFactory<T, F> {

}
