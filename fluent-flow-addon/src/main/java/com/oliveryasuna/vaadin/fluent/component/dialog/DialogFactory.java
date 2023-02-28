package com.oliveryasuna.vaadin.fluent.component.dialog;

import com.oliveryasuna.vaadin.fluent.component.ComponentFactory;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.dialog.Dialog;

public class DialogFactory extends ComponentFactory<Dialog, DialogFactory> implements IDialogFactory<Dialog, DialogFactory> {

  public DialogFactory(final Dialog dialog) {
    super(dialog);
  }

  public DialogFactory() {
    super(new Dialog());
  }

  public DialogFactory(final Component... components) {
    super(new Dialog(components));
  }

}
