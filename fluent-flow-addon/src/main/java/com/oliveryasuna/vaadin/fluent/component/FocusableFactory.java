package com.oliveryasuna.vaadin.fluent.component;

import com.oliveryasuna.commons.language.fluent.IFluentFactory;
import com.oliveryasuna.commons.language.fluent.breakdown.IntValueBreak;
import com.oliveryasuna.commons.language.fluent.breakdown.ValueBreak;
import com.vaadin.flow.component.*;

public interface FocusableFactory<T extends Focusable<C>, F extends FocusableFactory<T, F, C>, C extends Component> extends IFluentFactory<T, F>,
    HasElementFactory<T, F>, BlurNotifierFactory<T, F, C>, FocusNotifierFactory<T, F, C>, HasEnabledFactory<T, F> {

  default F setTabIndex(final int tabIndex) {
    get().setTabIndex(tabIndex);

    return uncheckedThis();
  }

  default IntValueBreak<T, F> getTabIndex() {
    return new IntValueBreak<>(uncheckedThis(), get().getTabIndex());
  }

  default F focus() {
    get().focus();

    return uncheckedThis();
  }

  default F blur() {
    get().blur();

    return uncheckedThis();
  }

  default ValueBreak<T, F, ShortcutRegistration> addFocusShortcut(final Key key, final KeyModifier... keyModifiers) {
    return new ValueBreak<>(uncheckedThis(), get().addFocusShortcut(key, keyModifiers));
  }

}
