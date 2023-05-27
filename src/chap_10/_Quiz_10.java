package chap_10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _Quiz_10 {
    public static void main(String[] args) {

        final int COST = 5000;
        final int PAY_AGE = 20;


//        Customer[] customers = new Customer[5];
//        customers[0] = new Customer("챈들러", 50);
//        customers[1] = new Customer("레이첼", 42);
//        customers[2] = new Customer("모니카", 21);
//        customers[3] = new Customer("벤자민", 18);
//        customers[4] = new Customer("제임스", 5);

        List<Customer> list = Arrays.asList(
                new Customer("챈들러", 50),
                new Customer("레이첼", 42),
                new Customer("모니카", 21),
                new Customer("벤자민", 18),
                new Customer("제임스", 5)
        );

        System.out.println("미술관 입장료");
        System.out.println("----------------------------");
        list.stream()
                .map(c -> (c.age >= PAY_AGE) ? (c.name + " " + COST + "원") : (c.name + " 무료"))
                .forEach(System.out::println);


    }
}


class Customer {
    String name;
    int age;
    int cost;

    public Customer(String name, int age) {
        this.name = name;
        this.age = age;
    }
}