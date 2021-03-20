/*
Author: Matthew Fernandez
Date: 3/19/21
Description: practice on Strategy Design pattern, UML to code,
             creating abstract, creating concrete classes,
             build familiarity with managing large projects and
             push code to github repository
 */
// Need modules for code
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Driver {
    public static void main(String[] args){
        HashMap<String, Integer> items = new HashMap<>();
        items.put("gold", 5);
        List<monster> monsters = new ArrayList<>();
        monsters.add(new Imp(15, 20, items));
        monsters.add(new Kobold(1,5,items));

        for (monster m: monsters){
            System.out.println(m);
        }
    }
}
