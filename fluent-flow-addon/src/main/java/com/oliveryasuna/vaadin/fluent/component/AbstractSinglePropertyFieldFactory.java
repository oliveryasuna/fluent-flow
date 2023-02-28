package com.oliveryasuna.vaadin.fluent.component;

import com.vaadin.flow.component.AbstractField;
import com.vaadin.flow.component.AbstractSinglePropertyField;
import com.vaadin.flow.function.SerializableBiFunction;
import com.vaadin.flow.function.SerializableFunction;

public class AbstractSinglePropertyFieldFactory<C extends AbstractField<C, T>, T>
    extends ComponentFactory<AbstractSinglePropertyField<C, T>, AbstractSinglePropertyFieldFactory<C, T>>
    implements IAbstractSinglePropertyFieldFactory<AbstractSinglePropertyField<C, T>, AbstractSinglePropertyFieldFactory<C, T>, C, T> {

  public AbstractSinglePropertyFieldFactory(final AbstractSinglePropertyField<C, T> abstractSinglePropertyField) {
    super(abstractSinglePropertyField);
  }

  public AbstractSinglePropertyFieldFactory(final String propertyName, final T defaultValue, final boolean acceptNullValues) {
    super(new AbstractSinglePropertyField<C, T>(propertyName, defaultValue, acceptNullValues));
  }

  public <P> AbstractSinglePropertyFieldFactory(final String propertyName, final T defaultValue, final Class<P> elementPropertyType,
      final SerializableFunction<P, T> presentationToModel, final SerializableFunction<T, P> modelToPresentation) {
    super(new AbstractSinglePropertyField<C, T>(propertyName, defaultValue, elementPropertyType, presentationToModel, modelToPresentation));
  }

  public <P> AbstractSinglePropertyFieldFactory(final String propertyName, final T defaultValue, final Class<P> elementPropertyType,
      final SerializableBiFunction<C, P, T> presentationToModel, final SerializableBiFunction<C, T, P> modelToPresentation) {
    super(new AbstractSinglePropertyField<C, T>(propertyName, defaultValue, elementPropertyType, presentationToModel, modelToPresentation));
  }

}
