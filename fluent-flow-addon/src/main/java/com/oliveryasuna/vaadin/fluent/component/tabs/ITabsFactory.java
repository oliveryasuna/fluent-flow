package com.oliveryasuna.vaadin.fluent.component.tabs;

import com.oliveryasuna.commons.language.pattern.fluent.IFluentFactory;
import com.oliveryasuna.commons.language.pattern.fluent.breakdown.BooleanValueBreak;
import com.oliveryasuna.commons.language.pattern.fluent.breakdown.IntValueBreak;
import com.oliveryasuna.commons.language.pattern.fluent.breakdown.ValueBreak;
import com.oliveryasuna.vaadin.fluent.component.HasOrderedComponentsFactory;
import com.oliveryasuna.vaadin.fluent.component.HasSizeFactory;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.tabs.Tab;
import com.vaadin.flow.component.tabs.Tabs;
import com.vaadin.flow.component.tabs.Tabs.Orientation;
import com.vaadin.flow.component.tabs.Tabs.SelectedChangeEvent;
import com.vaadin.flow.shared.Registration;

public interface ITabsFactory<T extends Tabs, F extends ITabsFactory<T, F>> extends IFluentFactory<T, F>, IGeneratedVaadinTabsFactory<T, F, Tabs>,
    HasOrderedComponentsFactory<T, F>, HasSizeFactory<T, F> {

  default F add(final Tab... tabs) {
    get().add(tabs);

    return uncheckedThis();
  }

  @Override
  default F add(final Component... components) {
    get().add(components);

    return uncheckedThis();
  }

  @Override
  default F remove(final Component... components) {
    get().remove(components);

    return uncheckedThis();
  }

  @Override
  default F removeAll() {
    get().removeAll();

    return uncheckedThis();
  }

  @Override
  default F addComponentAtIndex(final int index, final Component component) {
    get().addComponentAtIndex(index, component);

    return uncheckedThis();
  }

  @Override
  default F replace(final Component oldComponent, final Component newComponent) {
    get().replace(oldComponent, newComponent);

    return uncheckedThis();
  }

  default ValueBreak<T, F, Registration> addSelectedChangeListener(final ComponentEventListener<SelectedChangeEvent> listener) {
    return new ValueBreak<>(uncheckedThis(), get().addSelectedChangeListener(listener));
  }

  default IntValueBreak<T, F> getSelectedIndex() {
    return new IntValueBreak<>(uncheckedThis(), get().getSelectedIndex());
  }

  default F setSelectedIndex(final int selectedIndex) {
    get().setSelectedIndex(selectedIndex);

    return uncheckedThis();
  }

  default ValueBreak<T, F, Tab> getSelectedTab() {
    return new ValueBreak<>(uncheckedThis(), get().getSelectedTab());
  }

  default F setSelectedTab(final Tab selectedTab) {
    get().setSelectedTab(selectedTab);

    return uncheckedThis();
  }

  default ValueBreak<T, F, Orientation> getOrientation() {
    return new ValueBreak<>(uncheckedThis(), get().getOrientation());
  }

  default F setOrientation(final Orientation orientation) {
    get().setOrientation(orientation);

    return uncheckedThis();
  }

  default F setFlexGrowForEnclosedTabs(final double flexGrow) {
    get().setFlexGrowForEnclosedTabs(flexGrow);

    return uncheckedThis();
  }

  default F setAutoselect(final boolean autoselect) {
    get().setAutoselect(autoselect);

    return uncheckedThis();
  }

  default BooleanValueBreak<T, F> isAutoselect() {
    return new BooleanValueBreak<>(uncheckedThis(), get().isAutoselect());
  }

}
