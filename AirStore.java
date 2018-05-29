
/**
 * Write a description of class AirStore here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AirStore
{
    public static void store () {
        Store.FillStore();
        Store.SetPrices();
        if (Store.Login().equals("shopper")){
            Store.Shopper();
        }
        if (Store.Login().equals("manager")){
            Store.Manager();
        }
    }
}
