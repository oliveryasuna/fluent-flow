/*
 * Copyright 2021 Oliver Yasuna
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS
 * FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY,
 * WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package com.oliveryasuna.vaadin.fluent.component.datepicker;

import com.oliveryasuna.commons.language.fluent.FluentFactory;
import com.vaadin.flow.component.AbstractField.ComponentValueChangeEvent;
import com.vaadin.flow.component.HasValue;
import com.vaadin.flow.component.datepicker.DatePicker;

import java.time.LocalDate;
import java.util.Locale;

public class DatePickerFactory extends FluentFactory<DatePicker, DatePickerFactory> implements IDatePickerFactory<DatePicker, DatePickerFactory> {

  public DatePickerFactory(final DatePicker datePicker) {
    super(datePicker);
  }

  public DatePickerFactory() {
    super(new DatePicker());
  }

  public DatePickerFactory(final LocalDate initialDate) {
    super(new DatePicker(initialDate));
  }

  public DatePickerFactory(final String label) {
    super(new DatePicker(label));
  }

  public DatePickerFactory(final String label, final LocalDate initialDate) {
    super(new DatePicker(label, initialDate));
  }

  public DatePickerFactory(final HasValue.ValueChangeListener<ComponentValueChangeEvent<DatePicker, LocalDate>> listener) {
    super(new DatePicker(listener));
  }

  public DatePickerFactory(final String label, final HasValue.ValueChangeListener<ComponentValueChangeEvent<DatePicker, LocalDate>> listener) {
    super(new DatePicker(label, listener));
  }

  public DatePickerFactory(final LocalDate initialDate, final HasValue.ValueChangeListener<ComponentValueChangeEvent<DatePicker, LocalDate>> listener) {
    super(new DatePicker(initialDate, listener));
  }

  public DatePickerFactory(final String label, final LocalDate initialDate, final HasValue.ValueChangeListener<ComponentValueChangeEvent<DatePicker, LocalDate>> listener) {
    super(new DatePicker(label, initialDate, listener));
  }

  public DatePickerFactory(final LocalDate initialDate, final Locale locale) {
    super(new DatePicker(initialDate, locale));
  }

}
