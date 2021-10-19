package com.oliveryasuna.vaadin.fluent.component;

import com.oliveryasuna.commons.language.fluent.IFluentFactory;
import com.oliveryasuna.commons.language.fluent.breakdown.ValueBreak;
import com.vaadin.flow.component.HtmlComponent;

import java.util.Optional;

public interface IHtmlComponentFactory<T extends HtmlComponent, F extends IHtmlComponentFactory<T, F>> extends IFluentFactory<T, F>, IComponentFactory<T, F>,
    HasSizeFactory<T, F>, HasStyleFactory<T, F> {

  default F setTitle(final String title) {
    get().setTitle(title);

    return uncheckedThis();
  }

  default ValueBreak<T, F, Optional<String>> getTitle() {
    return new ValueBreak<>(uncheckedThis(), get().getTitle());
  }

}
