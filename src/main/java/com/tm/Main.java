package com.tm;

import java.util.Scanner;

public class Main {
    public static String startBattle(Hero hero, Monster monster){
        if(monster.hp <= 0){
            return "Hero wins!";
        } else if(hero.hp <= 0){
            return "Monster wins!";
        }
        return "";
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        Hero hero = new Hero(100, 10);
        Monster monster = new Monster(100, 5);
        hero.info();
        monster.info();

        System.out.println("Input the hero hp:");
        int hHP = in.nextInt();
        System.out.println("Input the hero damage:");
        int hDMG = in.nextInt();
        hero.setHP(hHP);
        hero.setDamage(hDMG);

        System.out.println("Input the monster hp:");
        int mHP = in.nextInt();
        System.out.println("Input the monster damage:");
        int mDMG = in.nextInt();
        monster.setHP(mHP);
        monster.setDamage(mDMG);


        while(hero.hp > 0 && monster.hp > 0){
            hero.hp -= monster.damage;
            System.out.println("Monster attacked hero, he made " + monster.damage + ", heros hp is " + hero.hp);
            if(hero.hp <= 0){
                System.out.println("Monster wins!");
            }
            if(hero.hp > 0) {
                monster.hp -= hero.damage;
                System.out.println("Hero attacked monster, he made " + hero.damage + ", monsters hp is " + monster.hp);
                if(monster.hp <= 0){
                    System.out.println("Hero wins!");
                }
            }
        }
        startBattle(hero, monster);

    }

}
