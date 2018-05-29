
/**
 * The purpose of this program is to say what the fresh prince of team air should do
 * 
 * ALex Bellon
 * March 25 2015
 */
public class FreshPrinceOfTeamAir extends FRC_Robot implements Forklifter, ToteStacker
{
    public void MoveUp(){//move forklift up
        System.out.println("WHIRRRR. Forklift up.");
    }

    public void MoveDown(){//move forklift down
        System.out.println("WHIRRRR. Forklift down.");
    }

    public void MoveTogether(){ //move forklift thingies together
        System.out.println("WHIRRRR. Forklift together.");
    }

    public void PickUpTote(){//pick up tote
        System.out.println("WHIRRRR. Picked up a tote.");
    }

    public void MoveTote(){ //move tote
        System.out.println("WHIRRRR. Moved tote.");
    }

    public void SetDownTote(){//set down tote, scores point
        System.out.println("WHIRRRR. Put down a tote.");
    }

    public void TeamNumber(int teamno){//say team number
        System.out.println("BEEP BOOP I AM FROM TEAM "+teamno+"!");
    }

    public void Win(){//win game
        System.out.println("BEEP BOOP I JUST WON!");
    }

    public void Lose(){//lose game
        System.out.println("beep boop i just lost. :(");
    }   
    
    public void TeamSlogan() { //say team slogan
        System.out.println("Not even the sky is our limit");
    }
    
    public void RunIntoBoxes() {//run into a pile of boxes
        System.out.println("WHHHIIIRRR. I ran full speed ahead into a pile of boxes.");
    }
    
    public void BreakParts() {//break 3d printed spool
        System.out.println("Oops. One of my pieces just broke.");
    }
}
