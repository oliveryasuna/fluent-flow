package com.oliveryasuna.vaadin.fluent.data.binder;

import com.oliveryasuna.commons.language.pattern.fluent.IFluentFactory;
import com.vaadin.flow.data.binder.HasFilterableDataProvider;
import com.vaadin.flow.data.provider.DataProvider;
import com.vaadin.flow.function.SerializableFunction;

public interface HasFilterableDataProviderFactory<T extends HasFilterableDataProvider<T2, F2>, F extends HasFilterableDataProviderFactory<T, F, T2, F2>, T2,
    F2> extends IFluentFactory<T, F>, HasItemsFactory<T, F, T2> {

  default F setDataProvider(final DataProvider<T2, F2> dataProvider) {
    get().setDataProvider(dataProvider);

    return uncheckedThis();
  }

  default <C> F setDataProvider(final DataProvider<T2, C> dataProvider, final SerializableFunction<F2, C> filterConverter) {
    get().setDataProvider(dataProvider, filterConverter);

    return uncheckedThis();
  }

}
