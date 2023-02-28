package com.oliveryasuna.vaadin.fluent.component.combobox;

import com.oliveryasuna.commons.language.pattern.fluent.IFluentFactory;
import com.oliveryasuna.vaadin.fluent.component.FocusableFactory;
import com.oliveryasuna.vaadin.fluent.component.HasStyleFactory;
import com.oliveryasuna.vaadin.fluent.component.IAbstractSinglePropertyFieldFactory;
import com.vaadin.flow.component.combobox.GeneratedVaadinComboBox;

public interface IGeneratedVaadinComboBoxFactory<T extends GeneratedVaadinComboBox<R, T2>, F extends IGeneratedVaadinComboBoxFactory<T, F, R, T2>,
    R extends GeneratedVaadinComboBox<R, T2>, T2> extends IFluentFactory<T, F>, IAbstractSinglePropertyFieldFactory<T, F, R, T2>, HasStyleFactory<T, F>,
    FocusableFactory<T, F, R> {

}
