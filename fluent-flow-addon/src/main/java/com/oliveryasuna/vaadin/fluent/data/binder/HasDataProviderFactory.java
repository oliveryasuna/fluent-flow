package com.oliveryasuna.vaadin.fluent.data.binder;

import com.oliveryasuna.commons.language.pattern.fluent.IFluentFactory;
import com.vaadin.flow.data.binder.HasDataProvider;
import com.vaadin.flow.data.provider.DataProvider;

import java.util.Collection;

public interface HasDataProviderFactory<T extends HasDataProvider<T2>, F extends HasDataProviderFactory<T, F, T2>, T2> extends IFluentFactory<T, F>,
    HasItemsFactory<T, F, T2> {

  default F setDataProvider(final DataProvider<T2, ?> dataProvider) {
    get().setDataProvider(dataProvider);

    return uncheckedThis();
  }

  @Override
  default F setItems(final Collection<T2> items) {
    get().setItems(items);

    return uncheckedThis();
  }

}
