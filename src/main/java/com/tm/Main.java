package com.tm;

import java.util.Scanner;

public class Main {

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


        BattleStage.attack(hero, monster);
        System.out.println(BattleStage.startBattle(hero, monster));

    }

}
