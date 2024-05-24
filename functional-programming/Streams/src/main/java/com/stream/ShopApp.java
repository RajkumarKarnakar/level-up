package com.stream;

import java.util.stream.Stream;

/**
 * Hello world!
 *
 */
public class ShopApp
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ECommerce.getItems().stream().filter(item -> item.getPrice() <= 100).forEach(System.out::println);
        //System.out.println(ECommerce.getItems());

    }
}
