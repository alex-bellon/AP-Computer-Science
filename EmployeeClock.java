import java.util.*;
public class EmployeeClock{
    Scanner scan = new Scanner(System.in);
    public int employeeNumber;
    ArrayList<Employee> employees= new ArrayList<Employee>(0);
    public void Main(){
        Choice();
    }

    public void Choice(){
        System.out.println("What do you want to do?\n0) Logout\n1) Login\n2) Change password\n3) Get hours for an individual\n4) Get hours for everyone\n5) Get number of employees\n6) Get employee names\n7) Show clock\n8) Edit employees\n9) View employees that are logged in");
        int choice = scan.nextInt();
        while(choice!=0 &&choice!=1 &&choice!=2 &&choice!=3 &&choice!=4 &&choice!=5 &&choice!=6 &&choice!=7&&choice!=8&&choice!=9){
            System.out.println("Please enter a number 0-9");
            choice = scan.nextInt();
        }
        if(choice==0) Logout();
        if(choice==1) Login();
        if(choice==2) changePassword();
        if(choice==3) getIndividualHours();
        if(choice==4) getHours();
        if(choice==5) {System.out.println(employees.size());Choice();}
        if(choice==6) getNames();
        if(choice==7) getTime();
        if(choice==8) editEmployees(); //finish
        if(choice==9) loggedIn();
    }

    public void Login(){
        System.out.println("What is your name?");
        String name = scan.nextLine();
        scan.nextLine();
        while(!findEmployee(name)){
            System.out.println("This employee doesn't exist. Please enter another name.");
            name = scan.nextLine();
            //findEmployee(name);
        }
        System.out.println("What is your password?");
        String password = scan.nextLine();
        //scan.nextLine();
        while(!tryPassword(password)){
            System.out.println("Incorrect password. Please try again.");
            password = scan.nextLine();
            //tryPassword(password);
        }
        System.out.println("You have been logged in");
        employees.get(employeeNumber).setLoggedIn(false);
        //START CLOCK
        Choice();
    }

    public void Logout(){
        System.out.println("What is your name?");
        String name = scan.nextLine();
        scan.nextLine();
        while(!findEmployee(name)){
            System.out.println("This employee doesn't exist. Please enter another name.");
            name = scan.nextLine();
            //findEmployee(name);
        }
        System.out.println("What is your password?");
        String password = scan.nextLine();
        //scan.nextLine();
        while(!tryPassword(password)){
            System.out.println("Incorrect password. Please try again.");
            password = scan.nextLine();
            //tryPassword(password);
        }
        System.out.println("You have been logged out");
        employees.get(employeeNumber).setLoggedIn(false);
        //STOP CLOCK
        //ADD HOURS
        Choice();
    }

    public void changePassword(){
        System.out.println("What is your name?");
        String name = scan.nextLine();
        scan.nextLine();
        while(!findEmployee(name)){
            System.out.println("This employee doesn't exist. Please enter another name.");
            name = scan.nextLine();
            //findEmployee(name);
        }
        System.out.println("What is your password?");
        String password = scan.nextLine();
        //scan.nextLine();
        while(!tryPassword(password)){
            System.out.println("Incorrect password. Please try again.");
            password = scan.nextLine();
            //tryPassword(password);
        }
        System.out.println("What do you want to be your new password?");
        String newPass = scan.nextLine();
        employees.get(employeeNumber).setPassword(newPass);
        Choice();
    }

    public void getIndividualHours(){
        System.out.println("What employee do you want to get the hours for?");
        String name = scan.nextLine();
        while(!findEmployee(name)){
            System.out.println("This employee doesn't exist. Please enter another name.");
            name = scan.nextLine();
            //findEmployee(name);
        }
        System.out.println(employees.get(employeeNumber).getName()+"\n"+employees.get(employeeNumber).getHours()+" hours");
        Choice();
    }

    public void getHours(){
        for(int i=0; i<employees.size(); i++){
            System.out.println(employees.get(i).getName()+"\n"+employees.get(i).getHours()+" hours");
        }
        Choice();
    }

    public void getNames(){
        for(int i=0; i<employees.size(); i++){
            System.out.println(employees.get(i).getName());
        }
        Choice();
    }

    public void loggedIn(){
        for(int i=0; i<employees.size(); i++){
            if(employees.get(i).loggedIn())
                System.out.println(employees.get(i).getName());
        }
        Choice();
    }

    public boolean findEmployee(String name){
        for(int i=0; i<employees.size(); i++){
            if(employees.get(i).getName().equals(name)){
                employeeNumber = i;
                return true;
            } else {return false;}
        }
        return false;
    }

    public void getTime(){
        System.out.println("TIME"); 
        Choice();
    }

    public boolean tryPassword(String password){
        if(employees.get(employeeNumber).getPassword().equals(password))
            return true;
        else return false;
    }
    
    public void editEmployees(){
        System.out.println("Would you like to add or remove an employee?");
        System.out.println("What is their name?");
        String name = scan.nextLine();
        scan.nextLine();
        System.out.println("What is their password?");
        String password = scan.nextLine();
        employees.add(new Employee(name,password));
        Choice();
    }

    public void noEmployees(){
        System.out.println("You have no employees, please add an employee.");
        Choice();
    }
}
