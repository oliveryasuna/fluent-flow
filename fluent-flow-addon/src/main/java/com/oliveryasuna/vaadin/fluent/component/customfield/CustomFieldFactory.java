package com.oliveryasuna.vaadin.fluent.component.customfield;

import com.oliveryasuna.vaadin.fluent.component.ComponentFactory;
import com.vaadin.flow.component.customfield.CustomField;

public class CustomFieldFactory<T> extends ComponentFactory<CustomField<T>, CustomFieldFactory<T>>
    implements ICustomFieldFactory<CustomField<T>, CustomFieldFactory<T>, T> {

  public CustomFieldFactory(final CustomField<T> customField) {
    super(customField);
  }

}
