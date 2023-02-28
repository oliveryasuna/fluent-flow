package com.oliveryasuna.vaadin.fluent.component.html;

import com.oliveryasuna.vaadin.fluent.component.ComponentFactory;
import com.vaadin.flow.component.html.IFrame;

public class IFrameFactory extends ComponentFactory<IFrame, IFrameFactory> implements IIFrameFactory<IFrame, IFrameFactory> {

  public IFrameFactory(final IFrame iframe) {
    super(iframe);
  }

  public IFrameFactory() {
    super(new IFrame());
  }

  public IFrameFactory(final String src) {
    super(new IFrame(src));
  }

}
