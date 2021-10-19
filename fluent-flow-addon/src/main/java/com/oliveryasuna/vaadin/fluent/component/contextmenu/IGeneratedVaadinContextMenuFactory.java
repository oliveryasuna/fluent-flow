package com.oliveryasuna.vaadin.fluent.component.contextmenu;

import com.oliveryasuna.commons.language.fluent.IFluentFactory;
import com.oliveryasuna.vaadin.fluent.component.ClickNotifierFactory;
import com.oliveryasuna.vaadin.fluent.component.HasStyleFactory;
import com.oliveryasuna.vaadin.fluent.component.IComponentFactory;
import com.vaadin.flow.component.contextmenu.GeneratedVaadinContextMenu;

public interface IGeneratedVaadinContextMenuFactory<T extends GeneratedVaadinContextMenu<R>, F extends IGeneratedVaadinContextMenuFactory<T, F, R>,
    R extends GeneratedVaadinContextMenu<R>> extends IFluentFactory<T, F>, IComponentFactory<T, F>, HasStyleFactory<T, F>, ClickNotifierFactory<T, F, R> {

}
