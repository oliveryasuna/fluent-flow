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

package com.oliveryasuna.vaadin.fluent.component.splitlayout;

import com.oliveryasuna.commons.language.pattern.fluent.IFluentFactory;
import com.oliveryasuna.commons.language.pattern.fluent.breakdown.ValueBreak;
import com.oliveryasuna.vaadin.fluent.component.HasSizeFactory;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.splitlayout.GeneratedVaadinSplitLayout.SplitterDragendEvent;
import com.vaadin.flow.component.splitlayout.SplitLayout;
import com.vaadin.flow.shared.Registration;

public interface ISplitLayoutFactory<T extends SplitLayout, F extends ISplitLayoutFactory<T, F>> extends IFluentFactory<T, F>,
    IGeneratedVaadinSplitLayoutFactory<T, F, SplitLayout>, HasSizeFactory<T, F> {

  default F setOrientation(final SplitLayout.Orientation orientation) {
    get().setOrientation(orientation);

    return uncheckedThis();
  }

  default ValueBreak<T, F, SplitLayout.Orientation> getOrientation() {
    return new ValueBreak<>(uncheckedThis(), get().getOrientation());
  }

  // Protected override.
  default F addToPrimary(final Component... components) {
    get().addToPrimary(components);

    return uncheckedThis();
  }

  default ValueBreak<T, F, Component> getPrimaryComponent() {
    return new ValueBreak<>(uncheckedThis(), get().getPrimaryComponent());
  }

  // Protected override.
  default F addToSecondary(final Component... components) {
    get().addToSecondary(components);

    return uncheckedThis();
  }

  default ValueBreak<T, F, Component> getSecondaryComponent() {
    return new ValueBreak<>(uncheckedThis(), get().getSecondaryComponent());
  }

  default F setSplitterPosition(final double position) {
    get().setSplitterPosition(position);

    return uncheckedThis();
  }

  default F setPrimaryStyle(final String styleName, final String value) {
    get().setPrimaryStyle(styleName, value);

    return uncheckedThis();
  }

  default F setSecondaryStyle(final String styleName, final String value) {
    get().setSecondaryStyle(styleName, value);

    return uncheckedThis();
  }

  // Protected override.
  default F remove(final Component... components) {
    get().remove(components);

    return uncheckedThis();
  }

  // Protected override.
  default F removeAll() {
    get().removeAll();

    return uncheckedThis();
  }

  // Protected override.
  default ValueBreak<T, F, Registration> addSplitterDragendListener(final ComponentEventListener<SplitterDragendEvent<SplitLayout>> listener) {
    return new ValueBreak<>(uncheckedThis(), get().addSplitterDragendListener(listener));
  }

}
