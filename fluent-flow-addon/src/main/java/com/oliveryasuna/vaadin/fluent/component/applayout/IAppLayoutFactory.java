package com.oliveryasuna.vaadin.fluent.component.applayout;

import com.oliveryasuna.commons.language.fluent.IFluentFactory;
import com.oliveryasuna.commons.language.fluent.breakdown.BooleanValueBreak;
import com.oliveryasuna.commons.language.fluent.breakdown.ValueBreak;
import com.oliveryasuna.vaadin.fluent.component.IComponentFactory;
import com.oliveryasuna.vaadin.fluent.router.RouterLayoutFactory;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.HasElement;
import com.vaadin.flow.component.applayout.AppLayout;

public interface IAppLayoutFactory<T extends AppLayout, F extends IAppLayoutFactory<T, F>> extends IFluentFactory<T, F>, IComponentFactory<T, F>,
    RouterLayoutFactory<T, F> {

  default ValueBreak<T, F, AppLayout.Section> getPrimarySection() {
    return new ValueBreak<>(uncheckedThis(), get().getPrimarySection());
  }

  default F setPrimarySection(final AppLayout.Section primarySection) {
    get().setPrimarySection(primarySection);

    return uncheckedThis();
  }

  default BooleanValueBreak<T, F> isDrawerOpened() {
    return new BooleanValueBreak<>(uncheckedThis(), get().isDrawerOpened());
  }

  default F setDrawerOpened(final boolean drawerOpened) {
    get().setDrawerOpened(drawerOpened);

    return uncheckedThis();
  }

  default BooleanValueBreak<T, F> isOverlay() {
    return new BooleanValueBreak<>(uncheckedThis(), get().isOverlay());
  }

  default ValueBreak<T, F, Component> getContent() {
    return new ValueBreak<>(uncheckedThis(), get().getContent());
  }

  default F setContent(final Component content) {
    get().setContent(content);

    return uncheckedThis();
  }

  default F addToDrawer(final Component... components) {
    get().addToDrawer(components);

    return uncheckedThis();
  }

  default F addToNavbar(final Component... components) {
    get().addToNavbar(components);

    return uncheckedThis();
  }

  default F remove(final Component... components) {
    get().remove(components);

    return uncheckedThis();
  }

  @Override
  default F showRouterLayoutContent(final HasElement content) {
    get().showRouterLayoutContent(content);

    return uncheckedThis();
  }

}
