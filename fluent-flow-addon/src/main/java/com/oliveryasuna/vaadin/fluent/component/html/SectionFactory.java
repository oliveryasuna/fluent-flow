package com.oliveryasuna.vaadin.fluent.component.html;

import com.oliveryasuna.commons.language.pattern.fluent.FluentFactory;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.html.Section;

public class SectionFactory extends FluentFactory<Section, SectionFactory> implements ISectionFactory<Section, SectionFactory> {

  public SectionFactory(final Section Section) {
    super(Section);
  }

  public SectionFactory() {
    super(new Section());
  }

  public SectionFactory(final Component... components) {
    super(new Section(components));
  }

}
