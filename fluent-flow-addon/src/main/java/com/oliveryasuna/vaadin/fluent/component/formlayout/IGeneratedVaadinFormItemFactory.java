package com.oliveryasuna.vaadin.fluent.component.formlayout;

import com.oliveryasuna.commons.language.pattern.fluent.IFluentFactory;
import com.oliveryasuna.vaadin.fluent.component.ClickNotifierFactory;
import com.oliveryasuna.vaadin.fluent.component.HasStyleFactory;
import com.oliveryasuna.vaadin.fluent.component.IComponentFactory;
import com.vaadin.flow.component.formlayout.GeneratedVaadinFormItem;

public interface IGeneratedVaadinFormItemFactory<T extends GeneratedVaadinFormItem<R>, F extends IGeneratedVaadinFormItemFactory<T, F, R>,
    R extends GeneratedVaadinFormItem<R>> extends IFluentFactory<T, F>, IComponentFactory<T, F>, HasStyleFactory<T, F>, ClickNotifierFactory<T, F, R> {

}
