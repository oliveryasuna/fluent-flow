package com.oliveryasuna.vaadin.fluent.component.html;

import com.oliveryasuna.commons.language.pattern.fluent.IFluentFactory;
import com.oliveryasuna.vaadin.fluent.component.ClickNotifierFactory;
import com.oliveryasuna.vaadin.fluent.component.IHtmlContainerFactory;
import com.vaadin.flow.component.html.UnorderedList;

public interface IUnorderedListFactory<T extends UnorderedList, F extends IUnorderedListFactory<T, F>> extends IFluentFactory<T, F>,
    IHtmlContainerFactory<T, F>, ClickNotifierFactory<T, F, UnorderedList> {

}
