package com.tm;

public class Monster {
    private int hp;
    private int damage;

    public Monster(int hp, int damage){
        this.hp = hp;
        this.damage = damage;
    }

    public int getHP() {
        return hp;
    }

    public int getDamage() {
        return damage;
    }

    public void setHP(int hp){
        this.hp = hp;
    }

    public void setDamage(int damage){
        this.damage = damage;
    }

    public void info(){

        System.out.println("Hero HP = " + getHP() + ", Damage = " + getDamage());
    }
}
