package com.oliveryasuna.vaadin.fluent.component.formlayout;

import com.oliveryasuna.commons.language.fluent.IFluentFactory;
import com.oliveryasuna.commons.language.fluent.breakdown.IntValueBreak;
import com.oliveryasuna.commons.language.fluent.breakdown.ValueBreak;
import com.oliveryasuna.vaadin.fluent.component.ClickNotifierFactory;
import com.oliveryasuna.vaadin.fluent.component.HasComponentsFactory;
import com.oliveryasuna.vaadin.fluent.component.HasSizeFactory;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.formlayout.FormLayout.FormItem;
import com.vaadin.flow.component.formlayout.FormLayout.ResponsiveStep;

import java.util.List;

public interface IFormLayoutFactory<T extends FormLayout, F extends IFormLayoutFactory<T, F>> extends IFluentFactory<T, F>,
    IGeneratedVaadinFormLayoutFactory<T, F, FormLayout>, HasSizeFactory<T, F>, HasComponentsFactory<T, F>, ClickNotifierFactory<T, F, FormLayout> {

  default F setColspan(final Component component, final int colspan) {
    get().setColspan(component, colspan);

    return uncheckedThis();
  }

  default F add(final Component component, final int colspan) {
    get().add(component, colspan);

    return uncheckedThis();
  }

  default IntValueBreak<T, F> getColspan(final Component component) {
    return new IntValueBreak<>(uncheckedThis(), get().getColspan(component));
  }

  default ValueBreak<T, F, List<ResponsiveStep>> getResponsiveSteps() {
    return new ValueBreak<>(uncheckedThis(), get().getResponsiveSteps());
  }

  default F setResponsiveSteps(final List<ResponsiveStep> steps) {
    get().setResponsiveSteps(steps);

    return uncheckedThis();
  }

  default F setResponsiveSteps(final ResponsiveStep... steps) {
    get().setResponsiveSteps(steps);

    return uncheckedThis();
  }

  default ValueBreak<T, F, FormItem> addFormItem(final Component field, final String label) {
    return new ValueBreak<>(uncheckedThis(), get().addFormItem(field, label));
  }

  default ValueBreak<T, F, FormItem> addFormItem(final Component field, final Component label) {
    return new ValueBreak<>(uncheckedThis(), get().addFormItem(field, label));
  }

  interface IFormItemFactory<T extends FormItem, F extends IFormItemFactory<T, F>> extends IFluentFactory<T, F>,
      IGeneratedVaadinFormItemFactory<T, F, FormItem>, HasComponentsFactory<T, F> {

    @Override
    default F removeAll() {
      get().removeAll();

      return uncheckedThis();
    }

    @Override
    default F remove(final Component... components) {
      get().remove(components);

      return uncheckedThis();
    }

  }

}
