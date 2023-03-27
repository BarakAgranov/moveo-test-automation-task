package core.assertions;

import core.NewInstanceFactory;
import core.elements.BaseElements;

public abstract class BaseAssertions<ElementsType extends BaseElements> {

    protected ElementsType elements() {
        return NewInstanceFactory.createByTypeParameter(getClass(), 0);
    }
}
