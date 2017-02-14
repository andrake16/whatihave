package com.nd.whatihave.kit;

import com.nd.whatihave.classes.entities.Thing;

/**
 * Created by ND on 2/14/2017.
 */

public class Kit {

    private OrderBlankKit orderBlankKit;
    private Thing morningThing;
    private Thing dayThing;
    private Thing eveningThing;
    private Thing afterBathThing;
    private Integer totalPrice;


    public OrderBlankKit getOrderBlankKit() {
        return orderBlankKit;
    }

    public void setOrderBlankKit(OrderBlankKit orderBlankKit) {
        this.orderBlankKit = orderBlankKit;
    }

    public Thing getMorningThing() {
        return morningThing;
    }

    public void setMorningThing(Thing morningThing) {
        this.morningThing = morningThing;
    }

    public Thing getDayThing() {
        return dayThing;
    }

    public void setDayThing(Thing dayThing) {
        this.dayThing = dayThing;
    }

    public Thing getEveningThing() {
        return eveningThing;
    }

    public void setEveningThing(Thing eveningThing) {
        this.eveningThing = eveningThing;
    }

    public Thing getAfterBathThing() {
        return afterBathThing;
    }

    public void setAfterBathThing(Thing afterBathThing) {
        this.afterBathThing = afterBathThing;
    }

    public Integer getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Integer totalPrice) {
        this.totalPrice = totalPrice;
    }



}
