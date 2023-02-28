package com.oliveryasuna.vaadin.fluent.component.html;

import com.oliveryasuna.commons.language.pattern.fluent.IFluentFactory;
import com.oliveryasuna.commons.language.pattern.fluent.breakdown.ValueBreak;
import com.oliveryasuna.vaadin.fluent.component.IHtmlComponentFactory;
import com.vaadin.flow.component.html.IFrame;
import com.vaadin.flow.component.html.IFrame.ImportanceType;
import com.vaadin.flow.component.html.IFrame.SandboxType;

import java.util.Optional;

public interface IIFrameFactory<T extends IFrame, F extends IIFrameFactory<T, F>> extends IFluentFactory<T, F>, IHtmlComponentFactory<T, F> {

  default F setSrc(final String src) {
    get().setSrc(src);

    return uncheckedThis();
  }

  default ValueBreak<T, F, String> getSrc() {
    return new ValueBreak<>(uncheckedThis(), get().getSrc());
  }

  default F setSrcdoc(final String srcdoc) {
    get().setSrcdoc(srcdoc);

    return uncheckedThis();
  }

  default ValueBreak<T, F, Optional<String>> getSrcdoc() {
    return new ValueBreak<>(uncheckedThis(), get().getSrcdoc());
  }

  default F setAllow(final String allow) {
    get().setAllow(allow);

    return uncheckedThis();
  }

  default ValueBreak<T, F, Optional<String>> getAllow() {
    return new ValueBreak<>(uncheckedThis(), get().getAllow());
  }

  default F setName(final String name) {
    get().setName(name);

    return uncheckedThis();
  }

  default ValueBreak<T, F, Optional<String>> getName() {
    return new ValueBreak<>(uncheckedThis(), get().getName());
  }

  default F setImportance(final ImportanceType importance) {
    get().setImportance(importance);

    return uncheckedThis();
  }

  default ValueBreak<T, F, Optional<ImportanceType>> getImportance() {
    return new ValueBreak<>(uncheckedThis(), get().getImportance());
  }

  default F setSandbox(final SandboxType... types) {
    get().setSandbox(types);

    return uncheckedThis();
  }

  default ValueBreak<T, F, Optional<SandboxType[]>> getSandbox() {
    return new ValueBreak<>(uncheckedThis(), get().getSandbox());
  }

}
