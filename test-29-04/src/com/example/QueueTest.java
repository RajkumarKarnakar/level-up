package com.example;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        queue.add("laxmi");
        queue.add("rajkumar");
        queue.add("pappu");

        System.out.println(queue);

        Customer customer1 = new Customer();
        customer1.name = "laxmi";

        var customer2 = new Customer();
        customer2.name = "rajkumar";

        Queue<Customer> customers = new PriorityQueue<>();
        customers.add(customer1);
        customers.add(customer2);
        customers.forEach(System.out::println);
    }

    static class Customer implements Comparable {
        String name;
        int id;

        @Override
        public int compareTo(Object o) {
            Customer customer = (Customer) o;
            return this.name.compareTo(((Customer) o).name);
        }

        @Override
        public String toString() {
            return "name: " + name;
        }
    }
}
