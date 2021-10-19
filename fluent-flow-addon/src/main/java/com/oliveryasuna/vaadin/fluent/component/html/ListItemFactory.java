package com.oliveryasuna.vaadin.fluent.component.html;

import com.oliveryasuna.commons.language.fluent.FluentFactory;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.html.ListItem;

public class ListItemFactory extends FluentFactory<ListItem, ListItemFactory> implements IListItemFactory<ListItem, ListItemFactory> {

  public ListItemFactory(final ListItem ListItem) {
    super(ListItem);
  }

  public ListItemFactory() {
    super(new ListItem());
  }

  public ListItemFactory(final Component... components) {
    super(new ListItem(components));
  }

  public ListItemFactory(final String text) {
    super(new ListItem(text));
  }

}
