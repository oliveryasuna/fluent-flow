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
import com.oliveryasuna.vaadin.fluent.data.selection.MultiSelectFactory;
import com.vaadin.flow.component.listbox.MultiSelectListBox;
import com.vaadin.flow.data.selection.MultiSelectionListener;
import com.vaadin.flow.shared.Registration;

import java.util.Set;

public interface IMultiSelectListBoxFactory<T extends MultiSelectListBox<T2>, F extends IMultiSelectListBoxFactory<T, F, T2>, T2> extends IFluentFactory<T, F>,
    IListBoxBaseFactory<T, F, MultiSelectListBox<T2>, T2, Set<T2>>, MultiSelectFactory<T, F, MultiSelectListBox<T2>, T2> {

  @Override
  default ValueBreak<T, F, Set<T2>> getEmptyValue() {
    return IListBoxBaseFactory.super.getEmptyValue();
  }

  @Override
  default ValueBreak<T, F, Set<T2>> getValue() {
    return IListBoxBaseFactory.super.getValue();
  }

  @Override
  default F setValue(final Set<T2> value) {
    get().setValue(value);

    return uncheckedThis();
  }

  @Override
  default F updateSelection(final Set<T2> addedItems, final Set<T2> removedItems) {
    get().updateSelection(addedItems, removedItems);

    return uncheckedThis();
  }

  @Override
  default ValueBreak<T, F, Set<T2>> getSelectedItems() {
    return new ValueBreak<>(uncheckedThis(), get().getSelectedItems());
  }

  @Override
  default ValueBreak<T, F, Registration> addSelectionListener(final MultiSelectionListener<MultiSelectListBox<T2>, T2> listener) {
    return new ValueBreak<>(uncheckedThis(), get().addSelectionListener(listener));
  }

}
