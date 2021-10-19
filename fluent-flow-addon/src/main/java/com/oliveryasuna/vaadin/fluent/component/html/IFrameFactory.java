package com.oliveryasuna.vaadin.fluent.component.html;

import com.oliveryasuna.commons.language.fluent.FluentFactory;
import com.vaadin.flow.component.html.IFrame;

public class IFrameFactory extends FluentFactory<IFrame, IFrameFactory> implements IIFrameFactory<IFrame, IFrameFactory> {

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
