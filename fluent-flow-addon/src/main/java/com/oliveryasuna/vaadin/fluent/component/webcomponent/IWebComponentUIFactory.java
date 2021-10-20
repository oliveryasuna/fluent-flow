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

package com.oliveryasuna.vaadin.fluent.component.webcomponent;

import com.oliveryasuna.commons.language.fluent.IFluentFactory;
import com.oliveryasuna.commons.language.fluent.breakdown.BooleanValueBreak;
import com.oliveryasuna.commons.language.fluent.breakdown.ValueBreak;
import com.oliveryasuna.vaadin.fluent.component.IUIFactory;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.webcomponent.WebComponentUI;
import com.vaadin.flow.router.HasUrlParameter;
import com.vaadin.flow.router.QueryParameters;
import com.vaadin.flow.router.Router;
import com.vaadin.flow.server.VaadinRequest;
import com.vaadin.flow.theme.ThemeDefinition;

import java.util.Optional;

public interface IWebComponentUIFactory<T extends WebComponentUI, F extends IWebComponentUIFactory<T, F>> extends IFluentFactory<T, F>, IUIFactory<T, F> {

  @Override
  default F doInit(final VaadinRequest request, final int uiId) {
    get().doInit(request, uiId);

    return uncheckedThis();
  }

  @Override
  default ValueBreak<T, F, Router> getRouter() {
    return new ValueBreak<>(uncheckedThis(), get().getRouter());
  }

  @Override
  default BooleanValueBreak<T, F> isNavigationSupported() {
    return new BooleanValueBreak<>(uncheckedThis(), get().isNavigationSupported());
  }

  @Override
  default ValueBreak<T, F, Optional<ThemeDefinition>> getThemeFor(final Class<?> navigationTarget, final String path) {
    return new ValueBreak<>(uncheckedThis(), get().getThemeFor(navigationTarget, path));
  }

  @Override
  default F navigate(final String location) {
    get().navigate(location);

    return uncheckedThis();
  }

  @Override
  default F navigate(final Class<? extends Component> navigationTarget) {
    get().navigate(navigationTarget);

    return uncheckedThis();
  }

  @Override
  default <T2, C extends Component & HasUrlParameter<T2>> F navigate(final Class<? extends C> navigationTarget, final T2 parameter) {
    get().navigate(navigationTarget, parameter);

    return uncheckedThis();
  }

  @Override
  default F navigate(final String location, final QueryParameters queryParameters) {
    get().navigate(location, queryParameters);

    return uncheckedThis();
  }

}
