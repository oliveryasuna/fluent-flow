package com.oliveryasuna.vaadin.fluent.component.dialog;

import com.oliveryasuna.commons.language.fluent.IFluentFactory;
import com.oliveryasuna.vaadin.fluent.component.IComponentFactory;
import com.vaadin.flow.component.dialog.GeneratedVaadinDialog;

public interface IGeneratedVaadinDialogFactory<T extends GeneratedVaadinDialog<R>, F extends IGeneratedVaadinDialogFactory<T, F, R>,
    R extends GeneratedVaadinDialog<R>> extends IFluentFactory<T, F>, IComponentFactory<T, F> {

}
