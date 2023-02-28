package com.oliveryasuna.vaadin.fluent.component.progressbar;

import com.oliveryasuna.vaadin.fluent.component.ComponentFactory;
import com.vaadin.flow.component.progressbar.ProgressBar;

public class ProgressBarFactory extends ComponentFactory<ProgressBar, ProgressBarFactory> implements IProgressBarFactory<ProgressBar, ProgressBarFactory> {

  public ProgressBarFactory(final ProgressBar progressBar) {
    super(progressBar);
  }

  public ProgressBarFactory() {
    super(new ProgressBar());
  }

  public ProgressBarFactory(final double min, final double max) {
    super(new ProgressBar(min, max));
  }

  public ProgressBarFactory(final double min, final double max, final double value) {
    super(new ProgressBar(min, max, value));
  }

}
