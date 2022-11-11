package com.thoughtworks.movierental;

import org.junit.Assert;
import org.junit.Test;

public class CustomerTest {


    @Test
    public void test() {
        Customer customer = new Customer("Padmini");
        Movie movie = new Movie("Avatar", 2);
        Rental rental = new Rental(movie, 1);
        System.out.println(customer.statement());
        String expected = "Rental Record for Padmini\n" +
                "Amount owed is 0.0\n" +
                "You earned 0 frequent renter points";

        Assert.assertEquals(expected, "Rental Record for Padmini\n" +
                "Amount owed is 0.0\n" +
                "You earned 0 frequent renter points");
    }

}