package com.oliveryasuna.vaadin.fluent.component.html;

import com.oliveryasuna.commons.language.fluent.IFluentFactory;
import com.oliveryasuna.vaadin.fluent.component.ClickNotifierFactory;
import com.oliveryasuna.vaadin.fluent.component.FocusableFactory;
import com.oliveryasuna.vaadin.fluent.component.IHtmlContainerFactory;
import com.vaadin.flow.component.html.NativeButton;

public interface INativeButtonFactory<T extends NativeButton, F extends INativeButtonFactory<T, F>> extends IFluentFactory<T, F>, IHtmlContainerFactory<T, F>,
    ClickNotifierFactory<T, F, NativeButton>, FocusableFactory<T, F, NativeButton> {

}
