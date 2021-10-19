package com.oliveryasuna.vaadin.fluent.component.notification;

import com.oliveryasuna.commons.language.fluent.FluentFactory;
import com.vaadin.flow.component.notification.GeneratedVaadinNotification;

public abstract class GeneratedVaadinNotificationFactory<R extends GeneratedVaadinNotification<R>>
    extends FluentFactory<GeneratedVaadinNotification<R>, GeneratedVaadinNotificationFactory<R>>
    implements IGeneratedVaadinNotificationFactory<GeneratedVaadinNotification<R>, GeneratedVaadinNotificationFactory<R>, R> {

  public GeneratedVaadinNotificationFactory(final GeneratedVaadinNotification<R> generatedVaadinNotification) {
    super(generatedVaadinNotification);
  }

}
