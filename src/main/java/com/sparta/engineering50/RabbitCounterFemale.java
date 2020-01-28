package com.sparta.engineering50;

public class RabbitCounterFemale {

    static int rabbitCounterFemale;

    public RabbitCounterFemale(){
        rabbitCounterFemale++;
    }


    public static int getRabbitCounter() {
        return rabbitCounterFemale;
    }



}
