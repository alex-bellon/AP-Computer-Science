public class Street
{
    public void main() {
        Car mycar = new Car();
        Lambo mylambo = new Lambo();
        mycar.rev();
        mycar.brake();
        mycar.beep();
        System.out.println("                         ");
        mylambo.callout();
        mylambo.rev();
    }
}