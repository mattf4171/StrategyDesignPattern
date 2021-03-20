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

public class Kobold extends monster{
    public Kobold(Integer maxHP, Integer xp, HashMap<String, Integer> items){
        // inherit from monster.java
        super(maxHP, xp, items);
    }
    @Override
    public String toString() {
        // To fit the proper format
        return "Kobold has : " + super.toString() + (super.getMaxHP()) + "/" + (super.getMaxHP());
    }
}
