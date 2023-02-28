/*
 * Copyright 2021 Oliver Yasuna
 *
 * Redistribution and use in source and binary forms, with or without modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice, this list of conditions and the following disclaimer in the documentation
 *     and/or other materials provided with the distribution.
 * 3. Neither the name of the copyright holder nor the names of its contributors may be used to endorse or promote products derived from this software without
 *      specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE
 * FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR
 * TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

package com.oliveryasuna.vaadin.fluent.component.menubar;

import com.oliveryasuna.commons.language.pattern.fluent.IFluentFactory;
import com.oliveryasuna.commons.language.pattern.fluent.breakdown.BooleanValueBreak;
import com.oliveryasuna.commons.language.pattern.fluent.breakdown.ValueBreak;
import com.oliveryasuna.vaadin.fluent.component.HasSizeFactory;
import com.oliveryasuna.vaadin.fluent.component.HasStyleFactory;
import com.oliveryasuna.vaadin.fluent.component.HasThemeFactory;
import com.oliveryasuna.vaadin.fluent.component.IComponentFactory;
import com.oliveryasuna.vaadin.fluent.component.contextmenu.HasMenuItemsFactory;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.contextmenu.MenuItem;
import com.vaadin.flow.component.menubar.MenuBar;
import com.vaadin.flow.component.menubar.MenuBarVariant;

import java.util.List;
import java.util.stream.Stream;

public interface IMenuBarFactory<T extends MenuBar, F extends IMenuBarFactory<T, F>> extends IFluentFactory<T, F>, IComponentFactory<T, F>,
    HasMenuItemsFactory<T, F>, HasSizeFactory<T, F>, HasStyleFactory<T, F>, HasThemeFactory<T, F> {

  default ValueBreak<T, F, MenuItem> addItem(final String text) {
    return new ValueBreak<>(uncheckedThis(), get().addItem(text));
  }

  default ValueBreak<T, F, MenuItem> addItem(final Component component) {
    return new ValueBreak<>(uncheckedThis(), get().addItem(component));
  }

  @Override
  default ValueBreak<T, F, MenuItem> addItem(final String text, final ComponentEventListener<ClickEvent<MenuItem>> clickListener) {
    return new ValueBreak<>(uncheckedThis(), get().addItem(text, clickListener));
  }

  @Override
  default ValueBreak<T, F, MenuItem> addItem(final Component component, final ComponentEventListener<ClickEvent<MenuItem>> clickListener) {
    return new ValueBreak<>(uncheckedThis(), get().addItem(component, clickListener));
  }

  default ValueBreak<T, F, List<MenuItem>> getItems() {
    return new ValueBreak<>(uncheckedThis(), get().getItems());
  }

  default F remove(final MenuItem... items) {
    get().remove(items);

    return uncheckedThis();
  }

  default F removeAll() {
    get().removeAll();

    return uncheckedThis();
  }

  @Override
  default ValueBreak<T, F, Stream<Component>> getChildren() {
    return new ValueBreak<>(uncheckedThis(), get().getChildren());
  }

  default F setOpenOnHover(final boolean openOnHover) {
    get().setOpenOnHover(openOnHover);

    return uncheckedThis();
  }

  default BooleanValueBreak<T, F> isOpenOnHover() {
    return new BooleanValueBreak<>(uncheckedThis(), get().isOpenOnHover());
  }

  default F addThemeVariants(final MenuBarVariant... variants) {
    get().addThemeVariants(variants);

    return uncheckedThis();
  }

  default F removeThemeVariants(final MenuBarVariant... variants) {
    get().removeThemeVariants(variants);

    return uncheckedThis();
  }

}
