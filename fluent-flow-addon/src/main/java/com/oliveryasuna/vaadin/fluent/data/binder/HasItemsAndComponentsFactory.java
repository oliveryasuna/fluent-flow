package com.oliveryasuna.vaadin.fluent.data.binder;

import com.oliveryasuna.commons.language.pattern.fluent.IFluentFactory;
import com.oliveryasuna.commons.language.pattern.fluent.breakdown.IntValueBreak;
import com.oliveryasuna.commons.language.pattern.fluent.breakdown.ValueBreak;
import com.oliveryasuna.vaadin.fluent.component.HasComponentsFactory;
import com.oliveryasuna.vaadin.fluent.component.HasElementFactory;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.data.binder.HasItemsAndComponents;
import com.vaadin.flow.data.binder.HasItemsAndComponents.ItemComponent;

public interface HasItemsAndComponentsFactory<T extends HasItemsAndComponents<T2>, F extends HasItemsAndComponentsFactory<T, F, T2>, T2>
    extends IFluentFactory<T, F>, HasComponentsFactory<T, F>, HasItemsFactory<T, F, T2> {

  default F addComponents(final T2 afterItem, final Component... components) {
    get().addComponents(afterItem, components);

    return uncheckedThis();
  }

  default F prependComponents(final T2 beforeItem, final Component... components) {
    get().prependComponents(beforeItem, components);

    return uncheckedThis();
  }

  default IntValueBreak<T, F> getItemPosition(final T2 item) {
    return new IntValueBreak<>(uncheckedThis(), get().getItemPosition(item));
  }

  interface ItemComponentFactory<T extends ItemComponent<T2>, F extends ItemComponentFactory<T, F, T2>, T2> extends IFluentFactory<T, F>,
      HasElementFactory<T, F> {

    default ValueBreak<T, F, T2> getItem() {
      return new ValueBreak<>(uncheckedThis(), get().getItem());
    }

  }

}
