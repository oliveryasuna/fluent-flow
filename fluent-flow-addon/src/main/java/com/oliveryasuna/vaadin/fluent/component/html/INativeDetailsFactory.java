package com.oliveryasuna.vaadin.fluent.component.html;

import com.oliveryasuna.commons.language.pattern.fluent.IFluentFactory;
import com.oliveryasuna.commons.language.pattern.fluent.breakdown.BooleanValueBreak;
import com.oliveryasuna.commons.language.pattern.fluent.breakdown.ValueBreak;
import com.oliveryasuna.vaadin.fluent.component.ClickNotifierFactory;
import com.oliveryasuna.vaadin.fluent.component.IHtmlComponentFactory;
import com.oliveryasuna.vaadin.fluent.component.IHtmlContainerFactory;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.html.NativeDetails;
import com.vaadin.flow.component.html.NativeDetails.Summary;
import com.vaadin.flow.component.html.NativeDetails.ToggleEvent;
import com.vaadin.flow.shared.Registration;

public interface INativeDetailsFactory<T extends NativeDetails, F extends INativeDetailsFactory<T, F>> extends IFluentFactory<T, F>,
    IHtmlComponentFactory<T, F>, ClickNotifierFactory<T, F, NativeDetails> {

  interface ISummaryFactory<T extends Summary, F extends ISummaryFactory<T, F>> extends IFluentFactory<T, F>, IHtmlContainerFactory<T, F>,
      ClickNotifierFactory<T, F, Summary> {

  }

  default ValueBreak<T, F, Summary> getSummary() {
    return new ValueBreak<>(uncheckedThis(), get().getSummary());
  }

  default ValueBreak<T, F, String> getSummaryText() {
    return new ValueBreak<>(uncheckedThis(), get().getSummaryText());
  }

  default F setSummaryText(final String summary) {
    get().setSummaryText(summary);

    return uncheckedThis();
  }

  default F setSummary(final Component... summaryContent) {
    get().setSummary(summaryContent);

    return uncheckedThis();
  }

  default ValueBreak<T, F, Component> getContent() {
    return new ValueBreak<>(uncheckedThis(), get().getContent());
  }

  default F setContent(final Component content) {
    get().setContent(content);

    return uncheckedThis();
  }

  default BooleanValueBreak<T, F> isOpen() {
    return new BooleanValueBreak<>(uncheckedThis(), get().isOpen());
  }

  default F setOpen(final boolean open) {
    get().setOpen(open);

    return uncheckedThis();
  }

  default ValueBreak<T, F, Registration> addToggleListener(final ComponentEventListener<ToggleEvent> listener) {
    return new ValueBreak<>(uncheckedThis(), get().addToggleListener(listener));
  }

}
