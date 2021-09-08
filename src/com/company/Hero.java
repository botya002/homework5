package com.company;

public class Hero {
    private int HP;
    private int damage;
    private String superAbility;

    public Hero(int HP, int damage, String superAbility) {
        this.HP = HP;
        this.damage = damage;
        this.superAbility = superAbility;
    }

    public Hero(int HP, int damage) {
        this.HP = HP;
        this.damage = damage;
    }

    public int getHP() {
        return HP;
    }

    public int getDamage() {
        return damage;
    }

    public String getSuperAbility() {
        return superAbility;
    }

}
