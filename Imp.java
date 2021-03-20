/*
Author: Matthew Fernandez
Date: 3/19/21
Description: practice on Strategy Design pattern, UML to code,
             creating abstract, creating concrete classes,
             build familiarity with managing large projects and
             push code to github repository
 */
// Need module for code
import java.util.HashMap;

public class Imp extends monster{
    public Imp(Integer maxHP, Integer xp, HashMap<String, Integer> items){
        // inherit from monster.java
        super(maxHP,xp,items);
        //Note the call to super() in the toString method. When not used in as part of a Constructor body, super may be used at any time.
    }

    @Override
    public String toString() {
        // To fit the proper format
        return "Imp has : " + super.toString() + (super.getMaxHP()) + "/" + (super.getMaxHP());
    }
}
