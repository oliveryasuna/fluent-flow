package com.oliveryasuna.vaadin.fluent.component.html;

import com.oliveryasuna.vaadin.fluent.component.ComponentFactory;
import com.vaadin.flow.component.html.ListItem;
import com.vaadin.flow.component.html.UnorderedList;

public class UnorderedListFactory extends ComponentFactory<UnorderedList, UnorderedListFactory>
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
