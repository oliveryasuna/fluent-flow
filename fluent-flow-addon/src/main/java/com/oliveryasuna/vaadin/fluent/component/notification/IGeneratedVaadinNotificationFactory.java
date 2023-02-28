package com.oliveryasuna.vaadin.fluent.component.notification;

import com.oliveryasuna.commons.language.pattern.fluent.IFluentFactory;
import com.oliveryasuna.vaadin.fluent.component.IComponentFactory;
import com.vaadin.flow.component.notification.GeneratedVaadinNotification;

public interface IGeneratedVaadinNotificationFactory<T extends GeneratedVaadinNotification<R>, F extends IGeneratedVaadinNotificationFactory<T, F, R>,
    R extends GeneratedVaadinNotification<R>> extends IFluentFactory<T, F>, IComponentFactory<T, F> {

}
