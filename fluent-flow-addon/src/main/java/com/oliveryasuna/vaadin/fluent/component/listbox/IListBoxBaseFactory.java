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

package com.oliveryasuna.vaadin.fluent.component.listbox;

import com.oliveryasuna.commons.language.fluent.IFluentFactory;
import com.oliveryasuna.commons.language.fluent.breakdown.ValueBreak;
import com.oliveryasuna.vaadin.fluent.component.HasSizeFactory;
import com.oliveryasuna.vaadin.fluent.component.IAbstractSinglePropertyFieldFactory;
import com.oliveryasuna.vaadin.fluent.data.binder.HasDataProviderFactory;
import com.oliveryasuna.vaadin.fluent.data.binder.HasItemsAndComponentsFactory;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.listbox.ListBoxBase;
import com.vaadin.flow.data.provider.DataProvider;
import com.vaadin.flow.data.renderer.ComponentRenderer;
import com.vaadin.flow.function.SerializablePredicate;

public interface IListBoxBaseFactory<T extends ListBoxBase<C, ITEM, VALUE>, F extends IListBoxBaseFactory<T, F, C, ITEM, VALUE>,
    C extends ListBoxBase<C, ITEM, VALUE>, ITEM, VALUE> extends IFluentFactory<T, F>, IAbstractSinglePropertyFieldFactory<T, F, C, VALUE>,
    HasItemsAndComponentsFactory<T, F, ITEM>, HasDataProviderFactory<T, F, ITEM>, HasSizeFactory<T, F> {

  @Override
  default F setDataProvider(final DataProvider<ITEM, ?> dataProvider) {
    get().setDataProvider(dataProvider);

    return uncheckedThis();
  }

  default ValueBreak<T, F, DataProvider<ITEM, ?>> getDataProvider() {
    return new ValueBreak<>(uncheckedThis(), get().getDataProvider());
  }

  default ValueBreak<T, F, ComponentRenderer<? extends Component, ITEM>> getItemRenderer() {
    return new ValueBreak<>(uncheckedThis(), get().getItemRenderer());
  }

  default F setRenderer(final ComponentRenderer<? extends Component, ITEM> itemRenderer) {
    get().setRenderer(itemRenderer);

    return uncheckedThis();
  }

  default F setItemEnabledProvider(final SerializablePredicate<ITEM> itemEnabledProvider) {
    get().setItemEnabledProvider(itemEnabledProvider);

    return uncheckedThis();
  }

  default ValueBreak<T, F, SerializablePredicate<ITEM>> getItemEnabledProvider() {
    return new ValueBreak<>(uncheckedThis(), get().getItemEnabledProvider());
  }

  @Override
  default F setRequiredIndicatorVisible(final boolean requiredIndicatorVisible) {
    get().setRequiredIndicatorVisible(requiredIndicatorVisible);

    return uncheckedThis();
  }

  @Override
  default F onEnabledStateChanged(final boolean enabled) {
    get().onEnabledStateChanged(enabled);

    return uncheckedThis();
  }

}
