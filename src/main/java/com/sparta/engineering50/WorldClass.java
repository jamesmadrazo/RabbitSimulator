package com.sparta.engineering50;

/**
 * Hello world!
 *
 */
public class WorldClass
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        RabbitCounter.increaseMaleCounter();
        RabbitCounter.increaseFemaleCounter();
    }
}
