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

package com.oliveryasuna.vaadin.fluent.component;

import com.oliveryasuna.commons.language.fluent.IFluentFactory;
import com.oliveryasuna.commons.language.fluent.breakdown.BooleanValueBreak;
import com.oliveryasuna.commons.language.fluent.breakdown.ValueBreak;
import com.vaadin.flow.component.AbstractCompositeField;
import com.vaadin.flow.component.AbstractField;
import com.vaadin.flow.component.AbstractField.ComponentValueChangeEvent;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.HasValue;
import com.vaadin.flow.shared.Registration;

public interface IAbstractCompositeFieldFactory<T extends AbstractCompositeField<C, S, T2>, F extends IAbstractCompositeFieldFactory<T, F, C, S, T2>,
    C extends Component, S extends AbstractCompositeField<C, S, T2>, T2> extends IFluentFactory<T, F>, ICompositeFactory<T, F, C>,
    HasValueAndElementFactory<T, F, ComponentValueChangeEvent<S, T2>, T2>, HasEnabledFactory<T, F> {

  @Override
  default F setValue(final T2 value) {
    get().setValue(value);

    return uncheckedThis();
  }

  @Override
  default ValueBreak<T, F, T2> getValue() {
    return new ValueBreak<>(uncheckedThis(), get().getValue());
  }

  @Override
  default ValueBreak<T, F, T2> getEmptyValue() {
    return new ValueBreak<>(uncheckedThis(), get().getEmptyValue());
  }

  @Override
  default BooleanValueBreak<T, F> isEmpty() {
    return new BooleanValueBreak<>(uncheckedThis(), get().isEmpty());
  }

  @Override
  default ValueBreak<T, F, Registration> addValueChangeListener(final HasValue.ValueChangeListener<? super ComponentValueChangeEvent<S, T2>> listener) {
    return new ValueBreak<>(uncheckedThis(), get().addValueChangeListener(listener));
  }

}
