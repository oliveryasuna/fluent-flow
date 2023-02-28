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

package com.oliveryasuna.vaadin.fluent.component.upload;

import com.oliveryasuna.commons.language.pattern.fluent.IFluentFactory;
import com.oliveryasuna.commons.language.pattern.fluent.breakdown.BooleanValueBreak;
import com.oliveryasuna.commons.language.pattern.fluent.breakdown.IntValueBreak;
import com.oliveryasuna.commons.language.pattern.fluent.breakdown.ValueBreak;
import com.oliveryasuna.vaadin.fluent.component.HasSizeFactory;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.upload.*;
import com.vaadin.flow.shared.Registration;

import java.util.List;

public interface IUploadFactory<T extends Upload, F extends IUploadFactory<T, F>> extends IFluentFactory<T, F>, HasSizeFactory<T, F> {

  default ValueBreak<T, F, Registration> addAllFinishedListener(final ComponentEventListener<AllFinishedEvent> listener) {
    return new ValueBreak<>(uncheckedThis(), get().addAllFinishedListener(listener));
  }

  default F setMaxFiles(final int maxFiles) {
    get().setMaxFiles(maxFiles);

    return uncheckedThis();
  }

  default IntValueBreak<T, F> getMaxFiles() {
    return new IntValueBreak<>(uncheckedThis(), get().getMaxFiles());
  }

  default F setMaxFileSize(final int maxFileSize) {
    get().setMaxFileSize(maxFileSize);

    return uncheckedThis();
  }

  default IntValueBreak<T, F> getMaxFileSize() {
    return new IntValueBreak<>(uncheckedThis(), get().getMaxFileSize());
  }

  default F setAutoUpload(final boolean auoUpload) {
    get().setAutoUpload(auoUpload);

    return uncheckedThis();
  }

  default BooleanValueBreak<T, F> isAutoUpload() {
    return new BooleanValueBreak<>(uncheckedThis(), get().isAutoUpload());
  }

  default F setDropAllowed(final boolean dropAllowed) {
    get().setDropAllowed(dropAllowed);

    return uncheckedThis();
  }

  default BooleanValueBreak<T, F> isDropAllowed() {
    return new BooleanValueBreak<>(uncheckedThis(), get().isDropAllowed());
  }

  default F setAcceptedFileTypes(final String... acceptedFileTypes) {
    get().setAcceptedFileTypes(acceptedFileTypes);

    return uncheckedThis();
  }

  default ValueBreak<T, F, List<String>> getAcceptedFileTypes() {
    return new ValueBreak<>(uncheckedThis(), get().getAcceptedFileTypes());
  }

  default F setUploadButton(final Component uploadButton) {
    get().setUploadButton(uploadButton);

    return uncheckedThis();
  }

  default ValueBreak<T, F, Component> getUploadButton() {
    return new ValueBreak<>(uncheckedThis(), get().getUploadButton());
  }

  default F setDropLabel(final Component dropLabel) {
    get().setDropLabel(dropLabel);

    return uncheckedThis();
  }

  default ValueBreak<T, F, Component> getDropLabel() {
    return new ValueBreak<>(uncheckedThis(), get().getDropLabel());
  }

  default F setDropLabelIcon(final Component dropLabelIcon) {
    get().setDropLabelIcon(dropLabelIcon);

    return uncheckedThis();
  }

  default ValueBreak<T, F, Component> getDropLabelIcon() {
    return new ValueBreak<>(uncheckedThis(), get().getDropLabelIcon());
  }

  default F interruptUpload() {
    get().interruptUpload();

    return uncheckedThis();
  }

  default BooleanValueBreak<T, F> isUploading() {
    return new BooleanValueBreak<>(uncheckedThis(), get().isUploading());
  }

  default ValueBreak<T, F, Registration> addProgressListener(final ComponentEventListener<ProgressUpdateEvent> listener) {
    return new ValueBreak<>(uncheckedThis(), get().addProgressListener(listener));
  }

  default ValueBreak<T, F, Registration> addFailedListener(final ComponentEventListener<FailedEvent> listener) {
    return new ValueBreak<>(uncheckedThis(), get().addFailedListener(listener));
  }

  default ValueBreak<T, F, Registration> addFinishedListener(final ComponentEventListener<FinishedEvent> listener) {
    return new ValueBreak<>(uncheckedThis(), get().addFinishedListener(listener));
  }

  default ValueBreak<T, F, Registration> addStartedListener(final ComponentEventListener<StartedEvent> listener) {
    return new ValueBreak<>(uncheckedThis(), get().addStartedListener(listener));
  }

  default ValueBreak<T, F, Registration> addSucceededListener(final ComponentEventListener<SucceededEvent> listener) {
    return new ValueBreak<>(uncheckedThis(), get().addSucceededListener(listener));
  }

  default ValueBreak<T, F, Registration> addFileRejectedListener(final ComponentEventListener<FileRejectedEvent> listener) {
    return new ValueBreak<>(uncheckedThis(), get().addFileRejectedListener(listener));
  }

  default ValueBreak<T, F, Receiver> getReceiver() {
    return new ValueBreak<>(uncheckedThis(), get().getReceiver());
  }

  default F setReceiver(final Receiver receiver) {
    get().setReceiver(receiver);

    return uncheckedThis();
  }

  default F setI18n(final UploadI18N i18n) {
    get().setI18n(i18n);

    return uncheckedThis();
  }

  default ValueBreak<T, F, UploadI18N> getI18n() {
    return new ValueBreak<>(uncheckedThis(), get().getI18n());
  }

}
