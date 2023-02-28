package com.oliveryasuna.vaadin.fluent.component.html;

import com.oliveryasuna.commons.language.pattern.fluent.FluentFactory;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.server.AbstractStreamResource;

public class ImageFactory extends FluentFactory<Image, ImageFactory> implements IImageFactory<Image, ImageFactory> {

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
