package com.oliveryasuna.vaadin.fluent.component.html;

import com.oliveryasuna.vaadin.fluent.component.ComponentFactory;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.server.AbstractStreamResource;

public class ImageFactory extends ComponentFactory<Image, ImageFactory> implements IImageFactory<Image, ImageFactory> {

  public ImageFactory(final Image image) {
    super(image);
  }

  public ImageFactory() {
    super(new Image());
  }

  public ImageFactory(final String src, final String alt) {
    super(new Image(src, alt));
  }

  public ImageFactory(final AbstractStreamResource src, final String alt) {
    super(new Image(src, alt));
  }

}
