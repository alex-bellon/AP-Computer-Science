import java.util.*;
import java.text.*;

/**
 * The purpose of this method is to vend air
 * 
 * ALex Bellon 
 * Feb 20 2015
 */
public class Store
{
    static Scanner scan = new Scanner(System.in);
    static ArrayList<String> stock = new ArrayList<String>(); //store stock
    static ArrayList<Double> prices = new ArrayList<Double>(); //store prices
    static ArrayList<Double> cartprices = new ArrayList<Double>(); //prices of stuff in cart
    static ArrayList<Integer> cart = new ArrayList<Integer>(); //items in cart
    static ArrayList<Integer> quantity = new ArrayList<Integer>(); //quantity of stuff in cart
    
    public static String Login () {  //decide whther they are shopper or manager
        System.out.println("\u000cAre you a Shoppper or the Manager?");
        String input = scan.nextLine();
        input = input.toLowerCase();
        String person = "";
        while (!(input.equals("shopper")||input.equals("manager"))) { //error handling
            System.out.println("\u000cPlease enter 'Shopper' or 'Manager'.");
            input = scan.nextLine();
            input = input.toLowerCase();
        }
        if (input.equals("manager")) { //password check for manager
            System.out.println("Please enter the manager password:");
            String password = scan.nextLine();
            password = password.toLowerCase();
            while (!(password.equals("tartarsauce"))) {
                System.out.println("\u000cThat is not the correct password. Please try again.");
                password = scan.nextLine();
                password = password.toLowerCase();
            }
            person = "manager";
        }
        if (input.equals("shopper")) {
            person = "shopper";
        }
        return person;
    }

    public static void FillStore() { //put items into store  
        stock.add("Vanilla Air"); 
        stock.add("Chocolate Air"); 
        stock.add("Lemon Air"); 
        stock.add("Strawberry Air"); 
        stock.add("Cherry Air"); 
        stock.add("Mint Air"); 
        stock.add("Cinnamon Air"); 
        stock.add("Pumpkin Spice Air"); 
        stock.add("Normal Air for Normal people who aren't picky"); 
        stock.add("Air Air"); 
    }

    public static void SetPrices() { //set prices of items
        prices.add(6.0);
        prices.add(6.0);
        prices.add(4.0);
        prices.add(4.0);
        prices.add(5.0);
        prices.add(8.0);
        prices.add(4.0);
        prices.add(6.0);
        prices.add(5.0);
        prices.add(1000.0);
    }

    public static void Shopper() {//shopper actions
        boolean stop = false;
        while (stop == false) {
            System.out.println("What would you like to do:\na)Check for an item\nb)Shop\nc)Checkout");
            String choice;
            choice = scan.nextLine();
            while (!(choice.equals("a")||choice.equals("b")||choice.equals("c"))) { //err handling
                System.out.println("Please enter a, b, or c");
                choice = scan.nextLine();
            }
            if (choice.equals("a")) { //find an item
                Find();
            }
            if (choice.equals("b")) { //shop
                Shop();
            }
            if (choice.equals("c")) { //checkout
                Checkout();
            }
            System.out.println("Would you like to continue as the manager, or go back to the login screen? [continue/back] ");
            String choice1;
            choice1 = scan.nextLine();
            choice1 = choice1.toLowerCase();
            while (!(choice1.equals("continue")||choice1.equals("back"))) {
                System.out.println("Please enter continue or back");
                choice1 = scan.nextLine();
            }
            if (choice1.equals("back")) { //go back to switch to manager
                stop = true;
                Login();
            }
        }
    }

    public static void Find() { //find an item
        boolean stop = false;
        while (stop == false) {
            System.out.println("What are you looking for?");
            String item;
            boolean check = false;
            item = scan.nextLine();
            item = item.toLowerCase();
            int location = 0;
            for (int x=0; x<stock.size();x++) { //check for item
                if (item.equals(stock.get(x).toLowerCase())) {
                    check = true;
                    location = x;
                    x = stock.size();
                }
                else {
                    check = false;
                }
            }
            if (check == true) { //yes, give option to buy
                System.out.println("Yes, we have "+ item +". It costs $"+prices.get(location)+"0"+". Would you like to add it to your cart? [y/n]");
                String choice;
                choice = scan.nextLine();
                while (!(choice.equals("y")||choice.equals("n"))) {
                    System.out.println("Please enter y or n");
                    choice = scan.nextLine();
                }
                if (choice.equals("y")) {
                    System.out.println("How many would you like to buy?");
                    int amount;
                    amount = scan.nextInt();
                    cart.add(location);
                    quantity.add(amount);
                    cartprices.add(prices.get(location));
                }
            }
            if (check == false) { //no
                System.out.println("Sorry, we don't have that item");
            }
            System.out.println("Write 'back' to go back to the shopper screen. Hit enter if you would like to continue finding items.");
            String choice1;
            scan.nextLine();
            choice1 = scan.nextLine();
            choice1 = choice1.toLowerCase();
            if (choice1.equals("back")) { //go back to switch to manager
                stop = true;
                Shopper();
            }
        }
    }

    public static void Shop() {
        boolean stop = false;
        while (stop == false) {
            int size = 0;
            for (int x=0; x<stock.size(); x++) {
                System.out.println("["+x+"]" +stock.get(x)+"@ $"+ prices.get(x)+"0");
                size++;
            }
            System.out.println("\nWhat would you like to add to your cart? Please enter number."); //item
            int choice;
            choice = scan.nextInt();
            while (!(choice <= size)) { //err handling
                System.out.println("Please enter one of the numbers listed");
                choice = scan.nextInt();
            }
            System.out.println("How many would you like to buy?");
            int amount;
            amount = scan.nextInt();
            cart.add(choice);
            quantity.add(amount);
            cartprices.add(prices.get(choice));
            System.out.println("Write 'back' to go back to the shopper screen. Hit enter if you would like to continue shopping.");
            String choice1;
            scan.nextLine();
            choice1 = scan.nextLine();
            choice1 = choice1.toLowerCase();
            if (choice1.equals("back")) { //go back to switch to manager
                stop = true;
                Shopper();
            }
        }
    }

    public static void Manager() {
        boolean stop = false;
        while (stop == false) {
            System.out.println("\u000cWhat would you like to do:\na)Add items\nb)Remove items\nc)Change Prices");
            String choice;
            choice = scan.nextLine();
            while (!(choice.equals("a")||choice.equals("b")||choice.equals("c"))) {//err handling
                System.out.println("Please enter a b or c");
                choice = scan.nextLine();
            }
            if (choice.equals("a")) { //add items
                System.out.println("\u000cWhat would you like to add to your store?");
                String item;
                item = scan.nextLine();
                stock.add(item);
                System.out.println("How much should this item cost? Please write it as a double.");
                double price;
                price = scan.nextDouble();
                System.out.println("You added "+item+" priced at $"+price+"0"+".");
            }
            if (choice.equals("b")) { //remopve items
                System.out.println("\u000cWhat would you like to remove from your store?");
                String item;
                item = scan.nextLine();
                item = item.toLowerCase();
                int location;
                for (int x=0; x<stock.size(); x++){
                    if (item == stock.get(x).toLowerCase()) {
                        location = x;
                        x = stock.size();
                        prices.remove(location);
                    }
                }
                System.out.println("You removed "+item+".");
            }
            if (choice.equals("c")) { //change price
                System.out.println("\u000cWhat would you like to change the price of?");
                String item;
                item = scan.nextLine();
                item = item.toLowerCase(); 
                int location = 1000;
                for (int x=0; x<stock.size(); x++){
                    if (item == stock.get(x).toLowerCase()) {
                        location = x;
                        x = stock.size();          
                    }
                    else {
                        location = 1000;
                    }
                }
                if (location == 1000) {
                    System.out.println("Sorry, that is not in our inventory.");
                }
                else {
                    System.out.println("The current price is $"+prices.get(location)+"0"+". What would you like to change the price to (please input a double)?");
                    double price;
                    price = scan.nextDouble();
                    prices.set(location, price);
                    System.out.println("Price changed.");
                }
            }   
        }   
        System.out.println("Would you like to continue as the manager, or go back to the login screen? [continue/back] ");
        String choice1;
        choice1 = scan.nextLine();
        choice1 = choice1.toLowerCase();
        while (!(choice1.equals("continue")||choice1.equals("back"))) {//err handling
            System.out.println("Please enter continue or back");
            choice1 = scan.nextLine();
        }
        if (choice1.equals("back")) {
            stop = true;
            Login();
        }
    }

    public static double MatchCartPrice (String s) {
        int location = 0;
        for (int x=0; x<stock.size(); x++) { //match price in cart
            if (s.equals(stock.get(x))) {
                location = x;
                x=stock.size();
            }
        }
        double price = 0.0;
        price = prices.get(location);
        return price;
    }

    public static void Checkout() {
        System.out.println("Here is your receipt:");
        double q =0;       
        for (int x=0; x<cart.size(); x++) { //calculate total
            q = q + (cartprices.get(x)*quantity.get(x));
        }
        for (int x=0; x<cart.size(); x++) {//print items, quantity, and proces
            System.out.println(quantity.get(x)+" x "+stock.get(cart.get(x))+" @ "+cartprices.get(x)+"0");
        }
        System.out.println("--------------------------------------------\nYour total is: $"+q+"0"+"."); //print total
    }
}