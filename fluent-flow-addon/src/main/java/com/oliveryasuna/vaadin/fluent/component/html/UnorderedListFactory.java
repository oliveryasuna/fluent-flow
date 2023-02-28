package com.oliveryasuna.vaadin.fluent.component.html;

import com.oliveryasuna.commons.language.pattern.fluent.FluentFactory;
import com.vaadin.flow.component.html.ListItem;
import com.vaadin.flow.component.html.UnorderedList;

public class UnorderedListFactory extends FluentFactory<UnorderedList, UnorderedListFactory>
    implements IUnorderedListFactory<UnorderedList, UnorderedListFactory> {

  public UnorderedListFactory(final UnorderedList unorderedList) {
    super(unorderedList);
  }

  public UnorderedListFactory() {
    super(new UnorderedList());
  }

  public UnorderedListFactory(final ListItem... items) {
    super(new UnorderedList(items));
  }

}
