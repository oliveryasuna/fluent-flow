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

package com.oliveryasuna.vaadin.fluent.component.page;

import com.oliveryasuna.commons.language.fluent.IFluentFactory;
import com.oliveryasuna.commons.language.fluent.breakdown.ValueBreak;
import com.vaadin.flow.component.page.BrowserWindowResizeListener;
import com.vaadin.flow.component.page.History;
import com.vaadin.flow.component.page.Page;
import com.vaadin.flow.component.page.Page.ExecutionCanceler;
import com.vaadin.flow.component.page.Page.ExtendedClientDetailsReceiver;
import com.vaadin.flow.component.page.PendingJavaScriptResult;
import com.vaadin.flow.function.SerializableConsumer;
import com.vaadin.flow.shared.Registration;
import com.vaadin.flow.shared.ui.LoadMode;

import java.io.Serializable;
import java.net.URI;
import java.net.URL;

public interface IPageFactory<T extends Page, F extends IPageFactory<T, F>> extends IFluentFactory<T, F> {

  default F setTitle(final String title) {
    get().setTitle(title);

    return uncheckedThis();
  }

  default F addStyleSheet(final String url) {
    get().addStyleSheet(url);

    return uncheckedThis();
  }

  default F addStyleSheet(final String url, final LoadMode loadMode) {
    get().addStyleSheet(url, loadMode);

    return uncheckedThis();
  }

  default F addJavaScript(final String url) {
    get().addJavaScript(url);

    return uncheckedThis();
  }

  default F addJavaScript(final String url, final LoadMode loadMode) {
    get().addJavaScript(url, loadMode);

    return uncheckedThis();
  }

  default F addJsModule(final String url) {
    get().addJsModule(url);

    return uncheckedThis();
  }

  default F addJsModule(final String url, final LoadMode loadMode) {
    get().addJsModule(url, loadMode);

    return uncheckedThis();
  }

  default F addHtmlImport(final String url) {
    get().addHtmlImport(url);

    return uncheckedThis();
  }

  default F addHtmlImport(final String url, final LoadMode loadMode) {
    get().addHtmlImport(url, loadMode);

    return uncheckedThis();
  }

  default F addDynamicImport(final String expression) {
    get().addDynamicImport(expression);

    return uncheckedThis();
  }

  default ValueBreak<T, F, ExecutionCanceler> executeJavaScript(final String expression, final Serializable... parameters) {
    return new ValueBreak<>(uncheckedThis(), get().executeJavaScript(expression, parameters));
  }

  default ValueBreak<T, F, PendingJavaScriptResult> executeJs(final String expression, final Serializable... parameters) {
    return new ValueBreak<>(uncheckedThis(), get().executeJs(expression, parameters));
  }

  default ValueBreak<T, F, History> getHistory() {
    return new ValueBreak<>(uncheckedThis(), get().getHistory());
  }

  default F reload() {
    get().reload();

    return uncheckedThis();
  }

  default ValueBreak<T, F, Registration> addBrowserWindowResizeListener(final BrowserWindowResizeListener resizeListener) {
    return new ValueBreak<>(uncheckedThis(), get().addBrowserWindowResizeListener(resizeListener));
  }

  default F open(final String url) {
    get().open(url);

    return uncheckedThis();
  }

  default F setLocation(final String uri) {
    get().setLocation(uri);

    return uncheckedThis();
  }

  default F setLocation(final URI uri) {
    get().setLocation(uri);

    return uncheckedThis();
  }

  default F retrieveExtendedClientDetails(final ExtendedClientDetailsReceiver receiver) {
    get().retrieveExtendedClientDetails(receiver);

    return uncheckedThis();
  }

  default F fetchCurrentURL(final SerializableConsumer<URL> callback) {
    get().fetchCurrentURL(callback);

    return uncheckedThis();
  }

}
