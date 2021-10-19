package com.oliveryasuna.vaadin.fluent.component.textfield;

import com.oliveryasuna.commons.language.fluent.IFluentFactory;
import com.oliveryasuna.vaadin.fluent.component.HasStyleFactory;
import com.vaadin.flow.component.textfield.GeneratedVaadinPasswordField;

public interface IGeneratedVaadinPasswordFieldFactory<T extends GeneratedVaadinPasswordField<R, T2>,
    F extends IGeneratedVaadinPasswordFieldFactory<T, F, R, T2>, R extends GeneratedVaadinPasswordField<R, T2>, T2> extends IFluentFactory<T, F>,
    IGeneratedVaadinTextFieldFactory<T, F, R, T2>, HasStyleFactory<T, F> {

}
