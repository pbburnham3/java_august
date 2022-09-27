import java.util.ArrayList;

public class CafeUtil{
    public int getStreakGoal(){
        int result = 0;
        for(int i = 1; i <= 10; i++){
            result = result + i;
        }
        return result;
    }

    public double getOrderTotal(double[] prices){
        double sum = 0;
        for(int i = 0; i <prices.length; i++){
            sum += prices[i];
        }
        return sum;
    }

    public void displayMenu(ArrayList<String> menuItems){
        for(int i = 0; i < menuItems.size(); i++){
            System.out.println(i + " " + menuItems.get(i));
        }
    }

    public void addCustomer(ArrayList<String> customers){
        System.out.println("Please enter your name:");
        String userName = System.console().readLine();
        System.out.println("Hello, " + userName + "!");
        customers.add(userName);
        for(int i = 0; i < customers.size(); i++){
            System.out.println("There are " + i + "customers in line before your order.");
            System.out.println(customers.get(i));
        }
    }

}