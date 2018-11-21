package com.tm;

public class Hero {
    public int hp;
    public int damage;

    public Hero(int hp, int damage){
        this.hp = hp;
        this.damage = damage;
    }

    private int getHP() {
        return hp;
    }

    private int getDamage() {
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
