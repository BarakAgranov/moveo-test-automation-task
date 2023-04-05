package core;

public abstract class BaseAssertions<ElementsType extends BaseElements> {

    protected ElementsType elements() {
        return NewInstanceFactory.createByTypeParameter(getClass(), 0);
    }
}
