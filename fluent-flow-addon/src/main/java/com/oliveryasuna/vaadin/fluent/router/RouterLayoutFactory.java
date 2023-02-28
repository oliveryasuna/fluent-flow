package com.oliveryasuna.vaadin.fluent.router;

import com.oliveryasuna.commons.language.pattern.fluent.IFluentFactory;
import com.oliveryasuna.vaadin.fluent.component.HasElementFactory;
import com.vaadin.flow.component.HasElement;
import com.vaadin.flow.router.RouterLayout;

public interface RouterLayoutFactory<T extends RouterLayout, F extends RouterLayoutFactory<T, F>> extends IFluentFactory<T, F>, HasElementFactory<T, F> {

  default F showRouterLayoutContent(final HasElement content) {
    get().showRouterLayoutContent(content);

    return uncheckedThis();
  }

  default F removeRouterLayoutContent(final HasElement oldContent) {
    get().removeRouterLayoutContent(oldContent);

    return uncheckedThis();
  }

}
