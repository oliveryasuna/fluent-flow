package com.oliveryasuna.vaadin.fluent.component.html;

import com.oliveryasuna.commons.language.pattern.fluent.FluentFactory;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.html.NativeDetails;
import com.vaadin.flow.component.html.NativeDetails.Summary;

public class NativeDetailsFactory extends FluentFactory<NativeDetails, NativeDetailsFactory>
    implements INativeDetailsFactory<NativeDetails, NativeDetailsFactory> {

  public NativeDetailsFactory(final NativeDetails nativeDetails) {
    super(nativeDetails);
  }

  public NativeDetailsFactory() {
    super(new NativeDetails());
  }

  public NativeDetailsFactory(final String summary) {
    super(new NativeDetails(summary));
  }

  public NativeDetailsFactory(final Component summaryContent) {
    super(new NativeDetails(summaryContent));
  }

  public NativeDetailsFactory(final String summary, final Component content) {
    super(new NativeDetails(summary, content));
  }

  public NativeDetailsFactory(final Component summaryContent, final Component content) {
    super(new NativeDetails(summaryContent, content));
  }

  public static class SummaryFactory extends FluentFactory<Summary, SummaryFactory> implements ISummaryFactory<Summary, SummaryFactory> {

    public SummaryFactory(final Summary summary) {
      super(summary);
    }

  }

}
