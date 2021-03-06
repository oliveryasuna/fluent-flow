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

import com.oliveryasuna.commons.language.fluent.IFluentFactory;
import com.oliveryasuna.vaadin.fluent.component.ClickNotifierFactory;
import com.oliveryasuna.vaadin.fluent.component.HasStyleFactory;
import com.oliveryasuna.vaadin.fluent.component.HasThemeFactory;
import com.oliveryasuna.vaadin.fluent.component.IComponentFactory;
import com.vaadin.flow.component.splitlayout.GeneratedVaadinSplitLayout;
import com.vaadin.flow.component.splitlayout.SplitLayoutVariant;

public interface IGeneratedVaadinSplitLayoutFactory<T extends GeneratedVaadinSplitLayout<R>, F extends IGeneratedVaadinSplitLayoutFactory<T, F, R>,
    R extends GeneratedVaadinSplitLayout<R>> extends IFluentFactory<T, F>, IComponentFactory<T, F>, HasStyleFactory<T, F>, ClickNotifierFactory<T, F, R>,
    HasThemeFactory<T, F> {

  default F addThemeVariants(final SplitLayoutVariant... variants) {
    get().addThemeVariants(variants);

    return uncheckedThis();
  }

  default F removeThemeVariants(final SplitLayoutVariant... variants) {
    get().removeThemeVariants(variants);

    return uncheckedThis();
  }

}
