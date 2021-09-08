package com.company;

public class Main {

    public static void main(String[] args) {
        Boss Thanos = new Boss();
        Thanos.setHP(500);
        Thanos.setDamage(100);
        Thanos.setTypeProtection("magical");
        System.out.println(Thanos.getDamage() + ", " + Thanos.getHP() + ", " + Thanos.getTypeProtection());
        for (int i = 0; i < createHeroes().length; i++) {
            System.out.println(createHeroes()[i].getHP() + " " + createHeroes()[i].getDamage() + " " + createHeroes()[i].getSuperAbility());
        }
    }

    public static Hero[] createHeroes() {
        Hero SuperMan = new Hero(50, 85,"Laser");
        Hero Deadpool = new Hero(100, 150);
        Hero SpiderMan = new Hero(250, 300,"web");

        Hero[] heroes = {SuperMan, Deadpool, SpiderMan};
        return heroes;
    }
}
