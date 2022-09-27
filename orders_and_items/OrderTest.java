import java.util.ArrayList;

public class OrderTest{

    public static void main(String[] args) {

        System.out.println("===Orders and Items Working===");



        Item item1 = new Item();
        item1.name = "Drip Coffee";
        item1.price = 1.50;

        Item item2 = new Item();
        item2.name = "Latte";
        item2.price = 2.50;

        Item item3 = new Item();
        item3.name = "Capuccino";
        item3.price = 3.00;

        Item item4 = new Item();
        item4.name = "Mocha";
        item4.price = 3.50;



        Order order1 = new Order();
        order1.name = "Cindhuri";
        
        Order order2 = new Order();
        order2.name = "Jimmy";

        Order order3 = new Order();
        order3.name = "Noah";

        Order order4 = new Order();
        order4.name = "Sam";



        order1.items.add(item1);
        order1.total += item1.price;
        order1.ready = true;

        order2.items.add(item1);
        order2.items.add(item2);
        order2.total += item1.price + item2.price;
        order2.ready = false;

        order3.items.add(item4);
        order3.items.add(item2);
        order3.items.add(item3);
        order3.total += item4.price + item2.price + item3.price;
        order3.ready = false;



        System.out.printf("Name: %s\n", order1.name);
        System.out.printf("Order total: %s\n", order1.total);
        System.out.printf("Your order is ready: %s\n", order1.ready);

        System.out.printf("Name: %s\n", order2.name);
        System.out.printf("Order total: %s\n", order2.total);
        System.out.printf("Your order is ready: %s\n", order2.ready);

        System.out.printf("Name: %s\n", order3.name);
        System.out.printf("Order total: %s\n", order3.total);
        System.out.printf("Your order is ready: %s\n", order3.ready);



    }
}