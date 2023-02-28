package com.oliveryasuna.vaadin.fluent.component.login;

import com.oliveryasuna.commons.language.pattern.fluent.IFluentFactory;
import com.vaadin.flow.component.login.LoginForm;

public interface ILoginFormFactory<T extends LoginForm, F extends ILoginFormFactory<T, F>> extends IFluentFactory<T, F>, IAbstractLoginFactory<T, F> {

}
