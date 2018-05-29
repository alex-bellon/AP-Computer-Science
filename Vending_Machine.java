import java.util.*;
public class Vending_Machine
{
    public static void vend() {
        Scanner scan = new Scanner(System.in);
        String item;      
        int quantity = 0;
        int totalquantity = 0;
        double totalcost = 0;
        double budget;
        Random random = new Random();
        budget = random.nextInt(20)+11;
        String anotheritem;
        anotheritem = "y";
        double a1cost = 1.50;
        String a1item = "A1 - Bottled Water ";
        double a2cost = 2.50;
        String a2item = "A2 - Coca Cola ";
        double a3cost = 2.50;
        String a3item = "A3 - Sprite ";
        double b1cost = 1.50;
        String b1item = "B1 - Potato Chips ";
        double b2cost = 1.50;
        String b2item = "B2 - Corn Chips ";
        double b3cost = 2.00;
        String b3item = "B3 - Popcorn ";
        double c1cost = 1.50;
        String c1item = "C1 - Chocolate Bar ";
        double c2cost = 1.50;
        String c2item = "C2 - Licorice ";
        double c3cost = 1.50;
        String c3item = "C3 - Gummy Bears ";

        while (anotheritem.equals("y")) {
            System.out.println("Welcome to the vending machine. Here are our items:");
            System.out.println(a1item + a1cost +"\t"+a2item + a2cost +"\t"+a3item + a3cost +"\n"+b1item + b1cost +"\t"+b2item + b2cost +"\t"+b3item + b3cost +"\n"+c1item + c1cost +"\t"+c2item + c2cost +"\t"+c3item + c3cost);
            System.out.println("Please enter the alphanumerical name for youre item (e.g. D4 or H7)");
            item = scan.nextLine();
            while (!(item.equals("A1") || item.equals("A2") || item.equals("A3") || item.equals("B1") || item.equals("B2") || item.equals("B3") || item.equals("C1") || item.equals("C2") || item.equals("C3"))) {
                System.out.println("Please choose one of the items listed above. Make sure the letter is capitalized.");
                item = scan.nextLine();
            }

            switch (item) {
                case "A1": 
            
                break;
                case "A2":
                
                break;
                case "A3":               
                
                break;
                case "B1":               
               
                break;
                case "B2":               
              
                break;
                case "B3":               
           
                break;
                case "C1":               
              
                break;
                case "C2":               
               
                break;
                case "C3":               
              
                break;
                default:
                System.out.println("Uh oh, there was an error! Please quit the program and start again!");
                break;
            }
        }
    }
}