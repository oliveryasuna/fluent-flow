package com.oliveryasuna.vaadin.fluent.component;

import com.oliveryasuna.commons.language.pattern.fluent.IFluentFactory;
import com.vaadin.flow.component.HtmlContainer;

public interface IHtmlContainerFactory<T extends HtmlContainer, F extends IHtmlContainerFactory<T, F>> extends IFluentFactory<T, F>,
    IHtmlComponentFactory<T, F>, HasComponentsFactory<T, F>, HasTextFactory<T, F> {

}
