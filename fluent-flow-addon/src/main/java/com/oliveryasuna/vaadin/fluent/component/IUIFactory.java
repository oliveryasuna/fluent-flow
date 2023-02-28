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

import com.oliveryasuna.commons.language.pattern.fluent.IFluentFactory;
import com.oliveryasuna.commons.language.pattern.fluent.breakdown.BooleanValueBreak;
import com.oliveryasuna.commons.language.pattern.fluent.breakdown.IntValueBreak;
import com.oliveryasuna.commons.language.pattern.fluent.breakdown.ValueBreak;
import com.oliveryasuna.vaadin.fluent.router.RouterLayoutFactory;
import com.vaadin.flow.component.*;
import com.vaadin.flow.component.internal.UIInternals;
import com.vaadin.flow.component.page.LoadingIndicatorConfiguration;
import com.vaadin.flow.component.page.Page;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.function.SerializableConsumer;
import com.vaadin.flow.function.SerializableRunnable;
import com.vaadin.flow.internal.ExecutionContext;
import com.vaadin.flow.internal.StateTree;
import com.vaadin.flow.router.*;
import com.vaadin.flow.server.Command;
import com.vaadin.flow.server.VaadinRequest;
import com.vaadin.flow.server.VaadinSession;
import com.vaadin.flow.shared.Registration;
import com.vaadin.flow.theme.ThemeDefinition;

import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.concurrent.Future;

public interface IUIFactory<T extends UI, F extends IUIFactory<T, F>> extends IFluentFactory<T, F>, IComponentFactory<T, F>, PollNotifierFactory<T, F>,
    HasComponentsFactory<T, F>, RouterLayoutFactory<T, F> {

  default ValueBreak<T, F, VaadinSession> getSession() {
    return new ValueBreak<>(uncheckedThis(), get().getSession());
  }

  default IntValueBreak<T, F> getUIId() {
    return new IntValueBreak<>(uncheckedThis(), get().getUIId());
  }

  default F doInit(final VaadinRequest request, final int uiId) {
    get().doInit(request, uiId);

    return uncheckedThis();
  }

  default F close() {
    get().close();

    return uncheckedThis();
  }

  default BooleanValueBreak<T, F> isClosing() {
    return new BooleanValueBreak<>(uncheckedThis(), get().isClosing());
  }

  default F accessSynchronously(final Command command) {
    get().accessSynchronously(command);

    return uncheckedThis();
  }

  default ValueBreak<T, F, Future<Void>> access(final Command command) {
    return new ValueBreak<>(uncheckedThis(), get().access(command));
  }

  default ValueBreak<T, F, SerializableRunnable> accessLater(final SerializableRunnable accessTask, final SerializableRunnable detachHandler) {
    return new ValueBreak<>(uncheckedThis(), get().accessLater(accessTask, detachHandler));
  }

  default <T2> ValueBreak<T, F, SerializableConsumer<T2>> accessLater(final SerializableConsumer<T2> accessTask, final SerializableRunnable detachHandler) {
    return new ValueBreak<>(uncheckedThis(), get().accessLater(accessTask, detachHandler));
  }

  default F setPollInterval(final int intervalInMillis) {
    get().setPollInterval(intervalInMillis);

    return uncheckedThis();
  }

  default IntValueBreak<T, F> getPollInterval() {
    return new IntValueBreak<>(uncheckedThis(), get().getPollInterval());
  }

  default ValueBreak<T, F, LoadingIndicatorConfiguration> getLoadingIndicatorConfiguration() {
    return new ValueBreak<>(uncheckedThis(), get().getLoadingIndicatorConfiguration());
  }

  default F push() {
    get().push();

    return uncheckedThis();
  }

  default ValueBreak<T, F, PushConfiguration> getPushConfiguration() {
    return new ValueBreak<>(uncheckedThis(), get().getPushConfiguration());
  }

  default ValueBreak<T, F, ReconnectDialogConfiguration> getReconnectDialogConfiguration() {
    return new ValueBreak<>(uncheckedThis(), get().getReconnectDialogConfiguration());
  }

  // Protected override.
  default ValueBreak<T, F, Locale> getLocale() {
    return new ValueBreak<>(uncheckedThis(), get().getLocale());
  }

  default F setLocale(final Locale locale) {
    get().setLocale(locale);

    return uncheckedThis();
  }

  default F setDirection(final Direction direction) {
    get().setDirection(direction);

    return uncheckedThis();
  }

  @Override
  default ValueBreak<T, F, Element> getElement() {
    return new ValueBreak<>(uncheckedThis(), get().getElement());
  }

  default ValueBreak<T, F, UIInternals> getInternals() {
    return new ValueBreak<>(uncheckedThis(), get().getInternals());
  }

  default ValueBreak<T, F, Page> getPage() {
    return new ValueBreak<>(uncheckedThis(), get().getPage());
  }

  default ValueBreak<T, F, Optional<ThemeDefinition>> getThemeFor(final Class<?> navigationTarget, final String path) {
    return new ValueBreak<>(uncheckedThis(), get().getThemeFor(navigationTarget, path));
  }

  default F navigate(final Class<? extends Component> navigationTarget) {
    get().navigate(navigationTarget);

    return uncheckedThis();
  }

  default <T2, C extends Component & HasUrlParameter<T2>> F navigate(final Class<? extends C> navigationTarget, final T2 parameter) {
    get().navigate(navigationTarget, parameter);

    return uncheckedThis();
  }

  default F navigate(final Class<? extends Component> navigationTarget, final RouteParameters parameters) {
    get().navigate(navigationTarget, parameters);

    return uncheckedThis();
  }

  default F navigate(final String location) {
    get().navigate(location);

    return uncheckedThis();
  }

  default F navigate(final String location, final QueryParameters queryParameters) {
    get().navigate(location, queryParameters);

    return uncheckedThis();
  }

  default BooleanValueBreak<T, F> isNavigationSupported() {
    return new BooleanValueBreak<>(uncheckedThis(), get().isNavigationSupported());
  }

  default ValueBreak<T, F, Router> getRouter() {
    return new ValueBreak<>(uncheckedThis(), get().getRouter());
  }

  default ValueBreak<T, F, StateTree.ExecutionRegistration> beforeClientResponse(final Component component, final SerializableConsumer<ExecutionContext> execution) {
    return new ValueBreak<>(uncheckedThis(), get().beforeClientResponse(component, execution));
  }

  @Override
  default F add(final Component... components) {
    get().add(components);

    return uncheckedThis();
  }

  @Override
  default ValueBreak<T, F, Optional<UI>> getUI() {
    return new ValueBreak<>(uncheckedThis(), get().getUI());
  }

  default ValueBreak<T, F, Registration> addBeforeEnterListener(final BeforeEnterListener listener) {
    return new ValueBreak<>(uncheckedThis(), get().addBeforeEnterListener(listener));
  }

  default ValueBreak<T, F, Registration> addBeforeLeaveListener(final BeforeLeaveListener listener) {
    return new ValueBreak<>(uncheckedThis(), get().addBeforeLeaveListener(listener));
  }

  default ValueBreak<T, F, Registration> addAfterNavigationListener(final AfterNavigationListener listener) {
    return new ValueBreak<>(uncheckedThis(), get().addAfterNavigationListener(listener));
  }

  default <E> ValueBreak<T, F, List<E>> getNavigationListeners(final Class<E> navigationHandler) {
    return new ValueBreak<>(uncheckedThis(), get().getNavigationListeners(navigationHandler));
  }

  default ValueBreak<T, F, ShortcutRegistration> addShortcutListener(final Command command, final Key key, final KeyModifier... keyModifiers) {
    return new ValueBreak<>(uncheckedThis(), get().addShortcutListener(command, key, keyModifiers));
  }

  default ValueBreak<T, F, ShortcutRegistration> addShortcutListener(final ShortcutEventListener listener, final Key key, final KeyModifier... keyModifiers) {
    return new ValueBreak<>(uncheckedThis(), get().addShortcutListener(listener, key, keyModifiers));
  }

  default ValueBreak<T, F, Component> getActiveDragSourceComponent() {
    return new ValueBreak<>(uncheckedThis(), get().getActiveDragSourceComponent());
  }

  default ValueBreak<T, F, String> getCsrfToken() {
    return new ValueBreak<>(uncheckedThis(), get().getCsrfToken());
  }

}
