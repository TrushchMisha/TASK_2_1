package com.tm;

public class BattleStage {
    public static String startBattle(Hero hero, Monster monster){
        if(monster.getHP() <= 0){
            return "Hero wins!";
        } else if(hero.getHP() <= 0){
            return "Monster wins!";
        }
        return "";
    }

    public static String attack(Hero hero, Monster monster){
        while(hero.getHP() > 0 && monster.getHP() > 0){
            hero.setHP(hero.getHP() - monster.getDamage());
            System.out.println("Monster attacked hero, he made " + monster.getDamage() + ", heros hp is " + hero.getHP());

            if(hero.getHP() > 0) {
                monster.setHP(monster.getHP() - hero.getDamage());
                System.out.println("Hero attacked monster, he made " + hero.getDamage() + ", monsters hp is " + monster.getHP());
            }
        }
        return "";
    }


}
