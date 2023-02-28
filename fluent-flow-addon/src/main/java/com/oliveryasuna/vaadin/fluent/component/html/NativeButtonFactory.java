package com.oliveryasuna.vaadin.fluent.component.html;

import com.oliveryasuna.vaadin.fluent.component.ComponentFactory;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.html.NativeButton;

public class NativeButtonFactory extends ComponentFactory<NativeButton, NativeButtonFactory> implements INativeButtonFactory<NativeButton, NativeButtonFactory> {

  public NativeButtonFactory(final NativeButton nativeButton) {
    super(nativeButton);
  }

  public NativeButtonFactory() {
    super(new NativeButton());
  }

  public NativeButtonFactory(final String text) {
    super(new NativeButton(text));
  }

  public NativeButtonFactory(final String text, final ComponentEventListener<ClickEvent<NativeButton>> clickListener) {
    super(new NativeButton(text, clickListener));
  }

}
