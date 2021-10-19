package com.oliveryasuna.vaadin.fluent.data.binder;

import com.oliveryasuna.commons.language.fluent.IFluentFactory;
import com.vaadin.flow.data.binder.HasItems;

import java.util.Collection;
import java.util.stream.Stream;

public interface HasItemsFactory<T extends HasItems<T2>, F extends HasItemsFactory<T, F, T2>, T2> extends IFluentFactory<T, F> {

  default F setItems(final Collection<T2> items) {
    get().setItems(items);

    return uncheckedThis();
  }

  @SuppressWarnings("unchecked")
  default F setItems(final T2... items) {
    get().setItems(items);

    return uncheckedThis();
  }

  default F setItems(final Stream<T2> streamOfItems) {
    get().setItems(streamOfItems);

    return uncheckedThis();
  }

}
