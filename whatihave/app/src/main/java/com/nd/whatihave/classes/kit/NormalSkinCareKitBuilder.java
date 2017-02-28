package com.nd.whatihave.classes.kit;

import com.nd.whatihave.data.entities.Thing;

/**
 * Created by ND on 2/14/2017.
 */

public class NormalSkinCareKitBuilder extends KitBuilder {

    private Kit kit;

    public Kit getBuildedKit() {
        return kit;
    }



    @Override
    public KitBuilder buildMorningThing() {

        kit.setMorningThing(new Thing());
        return this;
    }

    @Override
    public KitBuilder buildDayThing() {
        kit.setDayThing(new Thing());
        return this;
    }

    @Override
    public KitBuilder buildEveningThing() {
        kit.setEveningThing(new Thing());
        return this;
    }

    @Override
    public KitBuilder buildAfterBathThing() {
        kit.setAfterBathThing(new Thing());
        return this;
    }

    @Override
    public KitBuilder buildOrderBlankKit() {
        //TODO: make pdf file for printing
        return this;
    }

    @Override
    public KitBuilder buildTotalPrice() {
        Integer totalPrice = 0;
        //not a good idea but actually i think Builder pattern is not suitable for this task and i use this unly for studying
        /*
        for (Field field: kit.getClass().getDeclaredFields()) {
            if(field.getClass().equals(Thing.class) )
                totalPrice += field.;

        }*/


        return this;
    }
}
