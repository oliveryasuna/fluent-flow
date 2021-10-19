package com.oliveryasuna.vaadin.fluent.component.checkbox;

import com.oliveryasuna.commons.language.fluent.IFluentFactory;
import com.oliveryasuna.vaadin.fluent.component.ClickNotifierFactory;
import com.oliveryasuna.vaadin.fluent.component.FocusableFactory;
import com.oliveryasuna.vaadin.fluent.component.HasStyleFactory;
import com.oliveryasuna.vaadin.fluent.component.IAbstractSinglePropertyFieldFactory;
import com.vaadin.flow.component.checkbox.GeneratedVaadinCheckbox;

public interface IGeneratedVaadinCheckboxFactory<T extends GeneratedVaadinCheckbox<R, T2>, F extends IGeneratedVaadinCheckboxFactory<T, F, R, T2>,
    R extends GeneratedVaadinCheckbox<R, T2>, T2> extends IFluentFactory<T, F>, IAbstractSinglePropertyFieldFactory<T, F, R, T2>, HasStyleFactory<T, F>,
    FocusableFactory<T, F, R>, ClickNotifierFactory<T, F, R> {

}
