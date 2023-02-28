package com.oliveryasuna.vaadin.fluent.component.html;

import com.oliveryasuna.commons.language.pattern.fluent.FluentFactory;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.html.DescriptionList;
import com.vaadin.flow.component.html.DescriptionList.Description;
import com.vaadin.flow.component.html.DescriptionList.Term;

import java.util.Map;

public class DescriptionListFactory extends FluentFactory<DescriptionList, DescriptionListFactory>
    implements IDescriptionListFactory<DescriptionList, DescriptionListFactory> {

  public DescriptionListFactory(final DescriptionList descriptionList) {
    super(descriptionList);
  }

  public DescriptionListFactory() {
    super(new DescriptionList());
  }

  public DescriptionListFactory(final Map<Term, Description> terms) {
    super(new DescriptionList(terms));
  }

  public static class TermFactory extends FluentFactory<Term, TermFactory> implements ITermFactory<Term, TermFactory> {

    public TermFactory(final Term term) {
      super(term);
    }

    public TermFactory() {
      super(new Term());
    }

    public TermFactory(final Component... components) {
      super(new Term(components));
    }

    public TermFactory(final String text) {
      super(new Term(text));
    }

  }

  public static class DescriptionFactory extends FluentFactory<Description, DescriptionFactory>
      implements IDescriptionFactory<Description, DescriptionFactory> {

    public DescriptionFactory(final Description Description) {
      super(Description);
    }

    public DescriptionFactory() {
      super(new Description());
    }

    public DescriptionFactory(final Component... components) {
      super(new Description(components));
    }

    public DescriptionFactory(final String text) {
      super(new Description(text));
    }

  }

}
