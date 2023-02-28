package com.oliveryasuna.vaadin.fluent.component.html;

import com.oliveryasuna.commons.language.pattern.fluent.IFluentFactory;
import com.oliveryasuna.vaadin.fluent.component.IHtmlComponentFactory;
import com.vaadin.flow.component.html.Hr;

public interface IHrFactory<T extends Hr, F extends IHrFactory<T, F>> extends IFluentFactory<T, F>, IHtmlComponentFactory<T, F> {

}
