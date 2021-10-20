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

package com.oliveryasuna.vaadin.fluent.component.ironlist;

import com.oliveryasuna.commons.language.fluent.IFluentFactory;
import com.oliveryasuna.commons.language.fluent.breakdown.BooleanValueBreak;
import com.oliveryasuna.commons.language.fluent.breakdown.ValueBreak;
import com.oliveryasuna.vaadin.fluent.component.FocusableFactory;
import com.oliveryasuna.vaadin.fluent.component.HasSizeFactory;
import com.oliveryasuna.vaadin.fluent.component.HasStyleFactory;
import com.oliveryasuna.vaadin.fluent.component.IComponentFactory;
import com.oliveryasuna.vaadin.fluent.data.binder.HasDataProviderFactory;
import com.vaadin.flow.component.ironlist.IronList;
import com.vaadin.flow.data.provider.DataCommunicator;
import com.vaadin.flow.data.provider.DataProvider;
import com.vaadin.flow.data.renderer.Renderer;
import com.vaadin.flow.function.ValueProvider;

public interface IIronListFactory<T extends IronList<T2>, F extends IIronListFactory<T, F, T2>, T2> extends IFluentFactory<T, F>, IComponentFactory<T, F>,
    HasDataProviderFactory<T, F, T2>, HasStyleFactory<T, F>, HasSizeFactory<T, F>, FocusableFactory<T, F, IronList<T2>> {

  @Override
  default F setDataProvider(final DataProvider<T2, ?> dataProvider) {
    get().setDataProvider(dataProvider);

    return uncheckedThis();
  }

  default ValueBreak<T, F, DataProvider<T2, ?>> getDataProvider() {
    return new ValueBreak<>(uncheckedThis(), get().getDataProvider());
  }

  default ValueBreak<T, F, DataCommunicator<T2>> getDataCommunicator() {
    return new ValueBreak<>(uncheckedThis(), get().getDataCommunicator());
  }

  default F setRenderer(final ValueProvider<T2, String> valueProvider) {
    get().setRenderer(valueProvider);

    return uncheckedThis();
  }

  default F setRenderer(final Renderer<T2> renderer) {
    get().setRenderer(renderer);

    return uncheckedThis();
  }

  default F setPlaceholderItem(final T2 placeholderItem) {
    get().setPlaceholderItem(placeholderItem);

    return uncheckedThis();
  }

  default ValueBreak<T, F, T2> getPlaceholderItem() {
    return new ValueBreak<>(uncheckedThis(), get().getPlaceholderItem());
  }

  default BooleanValueBreak<T, F> isGridLayout() {
    return new BooleanValueBreak<>(uncheckedThis(), get().isGridLayout());
  }

  default F setGridLayout(final boolean gridLayout) {
    get().setGridLayout(gridLayout);

    return uncheckedThis();
  }

  @Override
  default F onEnabledStateChanged(final boolean enabled) {
    get().onEnabledStateChanged(enabled);

    return uncheckedThis();
  }

}
