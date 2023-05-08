package com.example.hxh_char_smart_sheet.charSheet;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Vector;
import java.util.concurrent.atomic.AtomicInteger;

public class CharClass {
    private int bonusStr, bonusCon, bonusDex, bonusInt, bonusCar, bonusMen;
    private int bonusCrt, bonusApr;
    private int bonusVel, bonusDodge;
    private int bonusIni, bonusHp;
    private int bonusFreePro;
    private boolean luckByLvl;
    private final Vector<Integer> bonusFree;
    private final Map<String, Integer> bonusPro;


    // constructor
    public CharClass() {
        this.bonusFree = new Vector<>();
        this.bonusPro = new HashMap<>();
        bonusStr = 0;
        bonusCon = 0;
        bonusDex = 0;
        bonusInt = 0;
        bonusCar = 0;
        bonusMen = 0;
        bonusCrt = 0;
        bonusVel = 0;
        bonusApr = 0;
        bonusDodge = 0;
        bonusFreePro = 0;
        luckByLvl = false;
    }

    public void resetClasse() {
        this.bonusFree.removeAllElements();
        this.bonusPro.clear();
        bonusStr = 0;
        bonusCon = 0;
        bonusDex = 0;
        bonusInt = 0;
        bonusCar = 0;
        bonusMen = 0;
        bonusCrt = 0;
        bonusVel = 0;
        bonusApr = 0;
        bonusDodge = 0;
        bonusFreePro = 0;
        luckByLvl = false;
    }

    // getters e setters

    public int getSomaBonus() {
        int sum = 0;
        for (int bonus : bonusFree) {
            sum += bonus;
        }
        return sum;
    }


    public int getBonusHp() {
        return bonusHp;
    }

    public void setBonusHp(int bonusHp) {
        this.bonusHp = bonusHp;
    }

    public int getBonusIni() {
        return bonusIni;
    }

    public void setBonusIni(int bonusIni) {
        this.bonusIni = bonusIni;
    }

    public boolean isLuckByLvl() {
        return luckByLvl;
    }

    public void setLuckByLvl(boolean luckByLvl) {
        this.luckByLvl = luckByLvl;
    }

    public void putBonusPro(String nome, int valor) {
        this.bonusPro.put(nome, valor);
    }

    public int getBonusPro(String nome) {
        return this.bonusPro.get(nome);
    }

    public int getBonusFreePro() {
        return bonusFreePro;
    }

    public void setBonusFreePro(int bonusFreePro) {
        this.bonusFreePro = bonusFreePro;
    }

    public void addBLivre(int i) {
        this.bonusFree.add(i);
    }

    public int getBonusFree(int i) {
        return this.bonusFree.get(i);
    }

    public int getBonusVel() {
        return bonusVel;
    }

    public void setBonusVel(int bonusVel) {
        this.bonusVel = bonusVel;
    }

    public int getBonusDodge() {
        return bonusDodge;
    }

    public void setBonusDodge(int bonusDodge) {
        this.bonusDodge = bonusDodge;
    }

    public int getBonusStr() {
        return bonusStr;
    }

    public void setBonusStr(int bonusStr) {
        this.bonusStr = bonusStr;
    }

    public int getBonusCon() {
        return bonusCon;
    }

    public void setBonusCon(int bonusCon) {
        this.bonusCon = bonusCon;
    }

    public int getBonusDex() {
        return bonusDex;
    }

    public void setBonusDex(int bonusDex) {
        this.bonusDex = bonusDex;
    }

    public int getBonusInt() {
        return bonusInt;
    }

    public void setBonusInt(int bonusInt) {
        this.bonusInt = bonusInt;
    }

    public int getBonusCar() {
        return bonusCar;
    }

    public void setBonusCar(int bonusCar) {
        this.bonusCar = bonusCar;
    }

    public int getBonusMen() {
        return bonusMen;
    }

    public void setBonusMen(int bonusMen) {
        this.bonusMen = bonusMen;
    }

    public int getBonusCrt() {
        return bonusCrt;
    }

    public void setBonusCrt(int bonusCrt) {
        this.bonusCrt = bonusCrt;
    }

    public int getBonusApr() {
        return bonusApr;
    }

    public void setBonusApr(int bonusApr) {
        this.bonusApr = bonusApr;
    }

    public int getSizeBonusFree() {
        return this.bonusFree.size();
    }

    public Set<String> proKeySet() {
        return bonusPro.keySet();
    }
}
