package com.oliveryasuna.vaadin.fluent.component.customfield;

import com.oliveryasuna.commons.language.pattern.fluent.FluentFactory;
import com.vaadin.flow.component.customfield.CustomField;

public abstract class CustomFieldFactory<T> extends FluentFactory<CustomField<T>, CustomFieldFactory<T>>
    implements ICustomFieldFactory<CustomField<T>, CustomFieldFactory<T>, T> {

  public CustomFieldFactory(final CustomField<T> customField) {
    super(customField);
  }

}
