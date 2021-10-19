package com.oliveryasuna.vaadin.fluent.component.html;

import com.oliveryasuna.commons.language.fluent.IFluentFactory;
import com.oliveryasuna.commons.language.fluent.breakdown.ValueBreak;
import com.oliveryasuna.vaadin.fluent.component.ClickNotifierFactory;
import com.oliveryasuna.vaadin.fluent.component.IHtmlContainerFactory;
import com.vaadin.flow.component.html.OrderedList;
import com.vaadin.flow.component.html.OrderedList.NumberingType;

public interface IOrderedListFactory<T extends OrderedList, F extends IOrderedListFactory<T, F>> extends IFluentFactory<T, F>, IHtmlContainerFactory<T, F>,
    ClickNotifierFactory<T, F, OrderedList> {

  default ValueBreak<T, F, NumberingType> getType() {
    return new ValueBreak<>(uncheckedThis(), get().getType());
  }

  default F setType(final NumberingType type) {
    get().setType(type);

    return uncheckedThis();
  }

}
