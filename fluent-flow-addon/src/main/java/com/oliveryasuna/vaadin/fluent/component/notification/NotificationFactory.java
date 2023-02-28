package com.oliveryasuna.vaadin.fluent.component.notification;

import com.oliveryasuna.commons.language.pattern.fluent.FluentFactory;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.notification.Notification;

public class NotificationFactory extends FluentFactory<Notification, NotificationFactory> implements INotificationFactory<Notification, NotificationFactory> {

  public NotificationFactory(final Notification notification) {
    super(notification);
  }

  public NotificationFactory() {
    super(new Notification());
  }

  public NotificationFactory(final String text) {
    super(new Notification(text));
  }

  public NotificationFactory(final String text, final int duration) {
    super(new Notification(text, duration));
  }

  public NotificationFactory(final String text, final int duration, final Notification.Position position) {
    super(new Notification(text, duration, position));
  }

  public NotificationFactory(final Component... components) {
    super(new Notification(components));
  }

}
