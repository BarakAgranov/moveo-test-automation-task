package core;

import infra.drivers.Driver;

public abstract class BasePage<ElementsType extends BaseElements, AssertionsType extends BaseAssertions<ElementsType>> {

    protected abstract String getUrl();

    protected ElementsType elements() {
        return NewInstanceFactory.createByTypeParameter(getClass(), 0);
    }

    public AssertionsType assertions() {
        return NewInstanceFactory.createByTypeParameter(getClass(), 1);
    }

    public BasePage<ElementsType, AssertionsType> navigate() {
        Driver.getBrowser().navigate().to(getUrl());
        return this;
    }


}
