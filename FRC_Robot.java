
/**
 * The purpose of this program is to say what an frc robot should do
 * 
 * ALex Bellon
 * March 25 2015
 */
public abstract class FRC_Robot
{
   public void MoveFB(boolean FB){//move forwards and backwards
        if (FB == false){
            System.out.println("WHHHHIIIIIRRR (forward)");
        }
        if (FB == true){
            System.out.println("WHHHHIIIIIRRR (backwards)");
        }
    }
    public void MoveLR(boolean LR) {//move left and right
        if (LR == false){
            System.out.println("WHHHHIIIIIRRR (towards the left)");
        }
        if (LR == true){
            System.out.println("WHHHHIIIIIRRR (towards the right)");
        }
    }
    public void TurnOffOn(boolean status) {//turn bot on and off
        if (status == false){
            System.out.println("Beep boop. Power off.");
        }
        if (status == true){
            System.out.println("Beep boop. Power on.");
        }
    }
    public abstract void TeamNumber(int teamno); //say team number
    public abstract void Win(); //win game
    public abstract void Lose(); //lose game
}
