package com.example.hxh_char_smart_sheet.charSheet;

public class Weapons {
    String name;
    String dices;
    int damage;
    int critical;
    boolean piercing;


    // constructor
    public Weapons() {
        this.damage = 0;
        this.critical = 2;
        this.piercing = false;
    }


    // getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDices() {
        return dices;
    }

    public void setDices(String dices) {
        this.dices = dices;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getCritical() {
        return critical;
    }

    public void setCritical(int critical) {
        this.critical = critical;
    }

    public boolean isPiercing() {
        return piercing;
    }

    public void setPiercing(boolean piercing) {
        this.piercing = piercing;
    }
}
