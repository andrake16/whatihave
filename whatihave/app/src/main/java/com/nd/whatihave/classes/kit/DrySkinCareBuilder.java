package com.nd.whatihave.classes.kit;

/**
 * Created by ND on 2/14/2017.
 */

public class DrySkinCareBuilder extends KitBuilder {

    @Override
    public KitBuilder buildMorningThing() {
        return this;
    }

    @Override
    public KitBuilder buildDayThing() {
        return this;
    }

    @Override
    public KitBuilder buildEveningThing() {
        return this;
    }

    @Override
    public KitBuilder buildAfterBathThing() {
        return this;
    }

    @Override
    public KitBuilder buildOrderBlankKit() {
        return this;
    }

    @Override
    public KitBuilder buildTotalPrice() {
        return this;
    }
}
