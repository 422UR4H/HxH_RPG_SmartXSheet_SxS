package com.example.hxh_char_smart_sheet.charSheet;

import com.example.hxh_char_smart_sheet.R;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Classes {
    private static final Map<String, CharClass> CLASSES = new HashMap<>();


    public static List<String> getClasses() {
        List<String> list = new ArrayList<>(CLASSES.keySet());
        Collections.sort(list);

        return list;
    }

    public static CharClass get(String nome) {
        return CLASSES.get(nome);
    }

    public static void init() {
//        código para banco de dados
//        for (int i = 0; i < axios.length; i++) {
//            CharClass cc = new CharClass();
//            cc.setBonusDex(2);
//            cc.setBonusInt(2);
//            cc.putBonusPro("ADAGAS", 2);
//            cc.putBonusPro("FACAS", 2);
//            cc.putBonusPro("ARCOS", 2);
//            Classes.CLASSES.put(String.valueOf("Caçador"), cc);
//        }

        // creating classes
        CharClass hunter = new CharClass();
        hunter.setBonusDex(2);
        hunter.setBonusInt(2);
        hunter.putBonusPro("ADAGAS", 2);
        hunter.putBonusPro("FACAS", 2);
        hunter.putBonusPro("ARCOS", 2);
        Classes.CLASSES.put(String.valueOf(R.string.class_hunter), hunter);

        CharClass chimera = new CharClass();
        chimera.setBonusStr(4);
        chimera.setBonusCon(4);
        chimera.setBonusCar(-3);
        chimera.setBonusVel(2);
        chimera.setBonusDodge(2);
        chimera.setBonusFreePro(2);
        Classes.CLASSES.put(String.valueOf(R.string.class_chimera), chimera);

        CharClass swordsman = new CharClass();
        swordsman.setBonusStr(2);
        swordsman.setBonusDex(2);
        swordsman.setBonusCon(2);
        swordsman.setBonusInt(1);
        swordsman.setBonusVel(3);
        swordsman.setBonusDodge(3);
        swordsman.setBonusIni(3);
        swordsman.putBonusPro("ESPADAS", 3);
        Classes.CLASSES.put(String.valueOf(R.string.class_swordsman), swordsman);

        CharClass gambler = new CharClass();
        gambler.setBonusDex(2);
        gambler.setBonusCar(3);
        gambler.setBonusInt(1);
        gambler.setLuckByLvl(true);
        gambler.putBonusPro("PRO GAMBLER", 3);
        Classes.CLASSES.put(String.valueOf(R.string.class_gambler), gambler);

        CharClass thief = new CharClass();
        thief.setBonusDex(3);
        thief.setBonusVel(2);
        thief.setBonusIni(1);
        thief.putBonusPro("ADAGAS E FACAS", 2);
        thief.putBonusPro("ADAGAS DE A.", 2);
        Classes.CLASSES.put(String.valueOf(R.string.class_thief), thief);

        CharClass illusionist = new CharClass();
        illusionist.setBonusCar(3);
        illusionist.setBonusDex(2);
        illusionist.setBonusInt(1);
        illusionist.setBonusStr(-2);
        illusionist.setBonusCon(-1);
        illusionist.setBonusFreePro(2);
        Classes.CLASSES.put(String.valueOf(R.string.class_illusionist), illusionist);

        CharClass mobster = new CharClass();
        mobster.setBonusCar(3);
        mobster.setBonusInt(2);
        mobster.setBonusDex(2);
        mobster.setBonusStr(1);
        mobster.setBonusDodge(2);
        mobster.setBonusVel(1);
        mobster.setBonusIni(1);
        mobster.putBonusPro("ARMAS DE FOGO", 3);
        Classes.CLASSES.put(String.valueOf(R.string.class_mobster), mobster);

        CharClass military = new CharClass();
        military.setBonusInt(1);
        military.setBonusDex(1);
        military.setBonusStr(2);
        military.setBonusCon(3);
        military.setBonusCar(-2);
        military.setBonusDodge(1);
        military.setBonusVel(2);
        military.putBonusPro("ARMAS DE FOGO", 3);
        Classes.CLASSES.put(String.valueOf(R.string.class_military), military);

        CharClass ninja = new CharClass();
        ninja.setBonusCon(1);
        ninja.setBonusInt(1);
        ninja.setBonusStr(2);
        ninja.setBonusDex(3);
        ninja.setBonusDodge(1);
        ninja.setBonusVel(3);
        ninja.putBonusPro("ADAGAS DE A.", 2);
        ninja.putBonusPro("KUSARIGAMA", 2);
        Classes.CLASSES.put(String.valueOf(R.string.class_ninja), ninja);

        CharClass samurai = new CharClass();
        samurai.setBonusStr(1);
        samurai.setBonusCrt(2);
        samurai.setBonusDex(3);
        samurai.setBonusIni(1);
        samurai.setBonusVel(2);
        samurai.setBonusDodge(3);
        samurai.putBonusPro("KATANA", 4);
        Classes.CLASSES.put(String.valueOf(R.string.class_samurai), samurai);

        CharClass magicBeast = new CharClass();
        magicBeast.addBLivre(2);
        magicBeast.addBLivre(2);
        magicBeast.addBLivre(1);
        magicBeast.addBLivre(1);
        magicBeast.setBonusFreePro(2);
        magicBeast.setBonusVel(2);
        Classes.CLASSES.put(String.valueOf(R.string.class_magicBeast), magicBeast);

        CharClass magicWeapon = new CharClass();
        magicWeapon.addBLivre(2);
        magicWeapon.addBLivre(2);
        magicWeapon.addBLivre(1);
        magicWeapon.addBLivre(1);
        magicWeapon.setBonusFreePro(3);
        magicWeapon.setBonusVel(2);
        magicWeapon.setBonusDodge(2);
        magicWeapon.setBonusCrt(2);
        Classes.CLASSES.put(String.valueOf(R.string.class_magicWeapon), magicWeapon);

        CharClass recordist = new CharClass();
        recordist.setBonusVel(4);
        recordist.setBonusDodge(1);
        recordist.addBLivre(3);
        recordist.addBLivre(2);
        recordist.addBLivre(2);
        recordist.setBonusFreePro(2);
        Classes.CLASSES.put(String.valueOf(R.string.class_recordist), recordist);

        CharClass cientist = new CharClass();
        cientist.setBonusInt(4);
        cientist.setBonusCar(2);
        cientist.addBLivre(2);
        cientist.addBLivre(1);
        cientist.setBonusDodge(2);
        cientist.setBonusVel(2);
        cientist.setBonusFreePro(4);
        Classes.CLASSES.put(String.valueOf(R.string.class_cientist), cientist);

        CharClass circus = new CharClass();
        circus.setBonusCon(1);
        circus.addBLivre(2);
        circus.addBLivre(3);
        circus.setBonusVel(3);
        circus.setBonusDodge(3);
        circus.setBonusFreePro(2);
        Classes.CLASSES.put(String.valueOf(R.string.class_circus), circus);

        CharClass collector = new CharClass();
        collector.setBonusCar(2);
        collector.setBonusInt(2);
        collector.addBLivre(1);
        collector.addBLivre(1);
        collector.setBonusFreePro(1);
        collector.setBonusVel(1);
        Classes.CLASSES.put(String.valueOf(R.string.class_collector), collector);

        CharClass netrunner = new CharClass();
        netrunner.setBonusCar(2);
        netrunner.setBonusInt(3);
        netrunner.addBLivre(3);
        netrunner.addBLivre(1);
        netrunner.setBonusFreePro(2);
        Classes.CLASSES.put(String.valueOf(R.string.class_netrunner), netrunner);

        CharClass genius = new CharClass();
        genius.setBonusInt(4);
        genius.addBLivre(2);
        genius.addBLivre(2);
        genius.setBonusFreePro(2);
        Classes.CLASSES.put(String.valueOf(R.string.class_genius), genius);

        CharClass amateurHunter = new CharClass();
        amateurHunter.setBonusInt(3);
        amateurHunter.addBLivre(2);
        amateurHunter.addBLivre(1);
        amateurHunter.setBonusFreePro(2);
        amateurHunter.setBonusDodge(2);
        amateurHunter.setBonusVel(2);
        amateurHunter.setBonusIni(1);
        Classes.CLASSES.put(String.valueOf(R.string.class_amateurHunter), amateurHunter);

        CharClass terrorist = new CharClass();
        terrorist.setBonusStr(2);
        terrorist.setBonusInt(2);
        terrorist.setBonusCon(2);
        terrorist.setBonusDex(1);
        terrorist.setBonusCar(1);
        terrorist.setBonusFreePro(2);
        terrorist.setBonusDodge(2);
        terrorist.setBonusVel(1);
        Classes.CLASSES.put(String.valueOf(R.string.class_terrorist), terrorist);

        CharClass monk = new CharClass();
        monk.setBonusStr(2);
        monk.setBonusCon(2);
        monk.setBonusInt(2);
        monk.setBonusDex(1);
        monk.setBonusFreePro(2);
        monk.setBonusVel(2);
        monk.setBonusDodge(2);
        Classes.CLASSES.put(String.valueOf(R.string.class_monk), monk);

        CharClass tribal = new CharClass();
        tribal.addBLivre(3);
        tribal.addBLivre(2);
        tribal.addBLivre(1);
        tribal.setBonusFreePro(2);
        tribal.setBonusVel(2);
        tribal.setBonusDodge(1);
        tribal.setBonusIni(1);
        Classes.CLASSES.put(String.valueOf(R.string.class_tribal), tribal);

        CharClass kuruta = new CharClass();
        kuruta.setBonusInt(3);
        kuruta.setBonusDex(2);
        kuruta.putBonusPro("ARMA KURUTA", 3);
        kuruta.setBonusVel(2);
        kuruta.setBonusDodge(2);
        Classes.CLASSES.put(String.valueOf(R.string.class_kuruta), kuruta);

        CharClass experiment = new CharClass();
        experiment.addBLivre(3);
        experiment.addBLivre(2);
        experiment.addBLivre(2);
        experiment.addBLivre(1);
        experiment.setBonusFreePro(1);
        Classes.CLASSES.put(String.valueOf(R.string.class_experiment), experiment);

        CharClass pirate = new CharClass();
        pirate.setBonusDex(2);
        pirate.addBLivre(2);
        pirate.setBonusDodge(2);
        pirate.setBonusVel(3);
        pirate.setBonusIni(1);
        pirate.putBonusPro("ARMAS DE FOGO", 3);
        pirate.setBonusFreePro(3);
        Classes.CLASSES.put(String.valueOf(R.string.class_pirate), pirate);

        CharClass mercenary = new CharClass();
        mercenary.setBonusDex(2);
        mercenary.setBonusStr(2);
        mercenary.setBonusCon(2);
        mercenary.setBonusDodge(2);
        mercenary.setBonusVel(2);
        mercenary.setBonusIni(2);
        mercenary.putBonusPro("FACAS", 1);
        mercenary.setBonusFreePro(3);
        Classes.CLASSES.put(String.valueOf(R.string.class_mercenary), mercenary);

        CharClass weaponsMaster = new CharClass();
        weaponsMaster.setBonusDex(3);
        weaponsMaster.setBonusStr(2);
        weaponsMaster.setBonusCon(1);
        weaponsMaster.setBonusFreePro(3);
        weaponsMaster.setBonusDodge(1);
        weaponsMaster.setBonusIni(1);
        weaponsMaster.setBonusVel(1);
        Classes.CLASSES.put(String.valueOf(R.string.class_weaponsMaster), weaponsMaster);


        CharClass animal = new CharClass();
        animal.addBLivre(4);
        animal.addBLivre(3);
        animal.setBonusFreePro(1);
        animal.setBonusVel(1);
        Classes.CLASSES.put(String.valueOf(R.string.class_animal), animal);


        CharClass kamaitachi = new CharClass();
        kamaitachi.setBonusDex(4);
        kamaitachi.setBonusStr(2);
        kamaitachi.setBonusCon(2);
        kamaitachi.addBLivre(2);
        kamaitachi.setBonusDodge(4);
        kamaitachi.setBonusVel(4);
        kamaitachi.setBonusIni(4);
        Classes.CLASSES.put("Kamaitachi", kamaitachi);

        CharClass kaijin = new CharClass();
        kaijin.setBonusDex(3);
        kaijin.setBonusStr(3);
        kaijin.setBonusCon(2);
        kaijin.addBLivre(4);
        kaijin.setBonusDodge(4);
        kaijin.setBonusVel(3);
        kaijin.setBonusIni(4);
        Classes.CLASSES.put("Kaijin", kaijin);

        CharClass youkai = new CharClass();
        youkai.setBonusDex(2);
        youkai.setBonusStr(3);
        youkai.setBonusCon(3);
        youkai.addBLivre(4);
        youkai.setBonusDodge(4);
        youkai.setBonusVel(2);
        youkai.setBonusIni(4);
        youkai.setBonusHp(2);
        Classes.CLASSES.put("Youkai", youkai);

        CharClass daikaiju = new CharClass();
        daikaiju.setBonusStr(4);
        daikaiju.setBonusCon(3);
        daikaiju.setBonusDex(2);
        daikaiju.addBLivre(4);
        daikaiju.setBonusDodge(4);
        daikaiju.setBonusVel(2);
        daikaiju.setBonusIni(4);
        daikaiju.setBonusHp(2);
        Classes.CLASSES.put("Daikaiju", daikaiju);

        CharClass kaiju = new CharClass();
        kaiju.setBonusStr(4);
        kaiju.setBonusCon(4);
        kaiju.addBLivre(1);
        kaiju.setBonusDodge(4);
        kaiju.setBonusHp(4);
        Classes.CLASSES.put("Kaiju", kaiju);

        CharClass volantes = new CharClass();
        volantes.setBonusDex(4);
        volantes.setBonusStr(3);
        volantes.setBonusCon(2);
        volantes.addBLivre(1);
        volantes.setBonusDodge(4);
        volantes.setBonusVel(4);
        volantes.setBonusIni(2);
        Classes.CLASSES.put("Volantes", volantes);

        /*
        Kamaitachi
        Kaijin
        Youkai
        Daikaiju
        Kaiju
        */
    }
}
