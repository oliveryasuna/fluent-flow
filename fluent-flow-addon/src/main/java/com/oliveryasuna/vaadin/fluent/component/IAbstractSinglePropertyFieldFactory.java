package com.oliveryasuna.vaadin.fluent.component;

import com.oliveryasuna.commons.language.fluent.IFluentFactory;
import com.vaadin.flow.component.AbstractField;
import com.vaadin.flow.component.AbstractSinglePropertyField;

public interface IAbstractSinglePropertyFieldFactory<T extends AbstractSinglePropertyField<C, T2>, F extends IAbstractSinglePropertyFieldFactory<T, F, C, T2>,
    C extends AbstractField<C, T2>, T2> extends IFluentFactory<T, F>, IAbstractFieldFactory<T, F, C, T2> {

}
