//Rochelle French 
//In-class 1
// 8/28/2015
package testrandomwalker;
import java.awt.*;
import java.util.*;

public class RandomWalker {
    private int steps;
    private Point location;
   
    public RandomWalker(){ 
        location = new Point();
        this.steps = 0;  
        
        
    }
    public int getX(){ 
       return (int)location.getX();     
    }
    public int getY(){ 
        return (int)location.getY();
    }
    public int getSteps(){
        return steps;
    }
    public void move(){
        steps++;
        Random r = new Random();
        int ranNum = r.nextInt(4);        
        if( ranNum == 0 ) location.x++;
        else if(ranNum == 1) location.x--; // go left
        else if (ranNum == 2) location.y++;  // go down
        else  location.y--; 
    
    }
}
