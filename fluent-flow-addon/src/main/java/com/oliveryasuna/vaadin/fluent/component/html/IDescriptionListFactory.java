package com.oliveryasuna.vaadin.fluent.component.html;

import com.oliveryasuna.commons.language.fluent.IFluentFactory;
import com.oliveryasuna.vaadin.fluent.component.ClickNotifierFactory;
import com.oliveryasuna.vaadin.fluent.component.IHtmlContainerFactory;
import com.vaadin.flow.component.html.DescriptionList;
import com.vaadin.flow.component.html.DescriptionList.Description;
import com.vaadin.flow.component.html.DescriptionList.Term;

public interface IDescriptionListFactory<T extends DescriptionList, F extends IDescriptionListFactory<T, F>> extends IFluentFactory<T, F>,
    IHtmlContainerFactory<T, F>, ClickNotifierFactory<T, F, DescriptionList> {

  interface ITermFactory<T extends Term, F extends ITermFactory<T, F>> extends IFluentFactory<T, F>, IHtmlContainerFactory<T, F>,
      ClickNotifierFactory<T, F, Term> {

  }

  interface IDescriptionFactory<T extends Description, F extends IDescriptionFactory<T, F>> extends IFluentFactory<T, F>, IHtmlContainerFactory<T, F>,
      ClickNotifierFactory<T, F, Description> {

  }

}
