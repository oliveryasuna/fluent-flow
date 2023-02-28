package com.oliveryasuna.vaadin.fluent.component;

import com.oliveryasuna.commons.language.pattern.fluent.IFluentFactory;
import com.oliveryasuna.commons.language.pattern.fluent.breakdown.BooleanValueBreak;
import com.oliveryasuna.commons.language.pattern.fluent.breakdown.ValueBreak;
import com.vaadin.flow.component.HasStyle;
import com.vaadin.flow.dom.ClassList;
import com.vaadin.flow.dom.Style;

public interface HasStyleFactory<T extends HasStyle, F extends HasStyleFactory<T, F>> extends IFluentFactory<T, F>, HasElementFactory<T, F> {

  default F addClassName(final String className) {
    get().addClassName(className);

    return uncheckedThis();
  }

  default BooleanValueBreak<T, F> removeClassName(final String className) {
    return new BooleanValueBreak<>(uncheckedThis(), get().removeClassName(className));
  }

  default F setClassName(final String className) {
    get().setClassName(className);

    return uncheckedThis();
  }

  default ValueBreak<T, F, String> getClassName() {
    return new ValueBreak<>(uncheckedThis(), get().getClassName());
  }

  default ValueBreak<T, F, ClassList> getClassNames() {
    return new ValueBreak<>(uncheckedThis(), get().getClassNames());
  }

  default F setClassName(final String className, final boolean set) {
    get().setClassName(className, set);

    return uncheckedThis();
  }

  default BooleanValueBreak<T, F> hasClassName(final String className) {
    return new BooleanValueBreak<>(uncheckedThis(), get().hasClassName(className));
  }

  default ValueBreak<T, F, Style> getStyle() {
    return new ValueBreak<>(uncheckedThis(), get().getStyle());
  }

  default F addClassNames(final String... classNames) {
    get().addClassNames(classNames);

    return uncheckedThis();
  }

  default F removeClassNames(final String... classNames) {
    get().removeClassNames(classNames);

    return uncheckedThis();
  }

}
