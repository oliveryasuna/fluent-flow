package com.oliveryasuna.vaadin.fluent.component.formlayout;

import com.oliveryasuna.vaadin.fluent.component.ComponentFactory;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.formlayout.FormLayout.FormItem;

public class FormLayoutFactory extends ComponentFactory<FormLayout, FormLayoutFactory> implements IFormLayoutFactory<FormLayout, FormLayoutFactory> {

  public FormLayoutFactory(final FormLayout formLayout) {
    super(formLayout);
  }

  public FormLayoutFactory() {
    super(new FormLayout());
  }

  public FormLayoutFactory(final Component... components) {
    super(new FormLayout(components));
  }

  public static class FormItemFactory extends ComponentFactory<FormItem, FormItemFactory> implements IFormItemFactory<FormItem, FormItemFactory> {

    public FormItemFactory(final FormItem formItem) {
      super(formItem);
    }

    public FormItemFactory() {
      super(new FormItem());
    }

    public FormItemFactory(final Component... components) {
      super(new FormItem(components));
    }

  }

}
