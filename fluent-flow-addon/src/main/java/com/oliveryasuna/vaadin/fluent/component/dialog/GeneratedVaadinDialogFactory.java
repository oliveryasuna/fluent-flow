package com.oliveryasuna.vaadin.fluent.component.dialog;

import com.oliveryasuna.commons.language.pattern.fluent.FluentFactory;
import com.vaadin.flow.component.dialog.GeneratedVaadinDialog;

public abstract class GeneratedVaadinDialogFactory<R extends GeneratedVaadinDialog<R>>
    extends FluentFactory<GeneratedVaadinDialog<R>, GeneratedVaadinDialogFactory<R>>
    implements IGeneratedVaadinDialogFactory<GeneratedVaadinDialog<R>, GeneratedVaadinDialogFactory<R>, R> {

  public GeneratedVaadinDialogFactory(final GeneratedVaadinDialog<R> generatedVaadinDialog) {
    super(generatedVaadinDialog);
  }

}
