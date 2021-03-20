/*
Author: Matthew Fernandez
Date: 3/19/21
Description: practice on Strategy Design pattern, UML to code,
             creating abstract, creating concrete classes,
             build familiarity with managing large projects and
             push code to github repository
 */
// Need modules for code
import java.util.HashMap;
import java.util.Objects;

abstract public class monster {
    private Integer hp = 15;
    private Integer xp =10;
    private Integer maxHP;
    private HashMap<String, Integer> items;
    // Will store value type String, key type Int

    // monster constructor
    public monster(Integer maxHP, Integer xp, HashMap<String, Integer> items) {
        this.maxHP = maxHP;
        hp = this.maxHP;
        this.xp = xp;
        this.items = items;
    }
    // SETTERS & GETTERS
    public Integer getHp(){
        return this.hp;
    }

    public void setHp(Integer hp){
        this.hp = hp;
    }

    public Integer getXp() {
        return xp;
    }

    public void setXp(Integer xp) {
        this.xp = xp;
    }

    public Integer getMaxHP() {
        return maxHP;
    }

    public void setMaxHP(Integer maxHP) {
        this.maxHP = maxHP;
    }

    public HashMap<String, Integer> getItems() {
        return items;
    }

    public void setItems(HashMap<String, Integer> items) {
        this.items = items;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof monster)) return false;
        monster monster = (monster) o;
        return getHp().equals(monster.getHp()) && getXp().equals(monster.getXp()) && getMaxHP().equals(monster.getMaxHP()) && getItems().equals(monster.getItems());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getHp(), getXp(), getMaxHP(), getItems());
    }

    @Override
    public String toString() {
        return "hp="; // Ultimate string hack
    }
}
