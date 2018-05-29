public class Lambo extends Car
{
    Car dddd = new Car();
    
    public void callout() {
        System.out.println("hey look i have a lambo");
    }
    
    public void rev () {
        super.rev();
        System.out.println("VROOOOOOOMMMM");
    }
}