package com.sparta.engineering50;

public class RabbitCounterMale {

    static int rabbitCounterMale;

    public RabbitCounterMale(){
        rabbitCounterMale++;
    }


    public static int getRabbitCounterMale() {
        return rabbitCounterMale;
    }



}
