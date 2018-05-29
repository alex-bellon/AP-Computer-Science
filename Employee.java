public class Employee{
	public String password = "";
	public String name = "";
	public double hours = 0;
 	public boolean loggedIn = false;
	
	public Employee (String n, String p){
		password = p;
		name = n;
    }
	
	public double getHours(){
		return hours;
    }
	
	public void addHours(int h){
		hours+=h;
    }
	
	public String getName(){
		return name;
    }
	
	public String getPassword(){
		return password;
    }
	
	public void setPassword(String p){
		password=p;
    }
  
 	public void setLoggedIn(boolean l){
  	  	loggedIn = l;
  	}
  
 	public boolean loggedIn(){
   	 	return loggedIn;
  	}
}
