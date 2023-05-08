package com.example.hxh_char_smart_sheet.charSheet;

import java.util.HashMap;
import java.util.Map;

public class Weapons {
    private static final Map<String, Weapon> ARMAS = new HashMap<>();
    private static final Map<String, Weapon> ELEMENTOS = new HashMap<>();
    public static void init() {
        Weapon arteMarcial = new Weapon();
        arteMarcial.setName("Arte marcial");
        arteMarcial.setDices("D4");
        arteMarcial.setDamage(0);
        Weapons.ARMAS.put(arteMarcial.getName(), arteMarcial);

        Weapon adagas = new Weapon();
        adagas.setName("Adaga");
        adagas.setDices("D8");
        adagas.setDamage(5);
        Weapons.ARMAS.put(adagas.getName(), adagas);

        Weapon adagasDeA = new Weapon();
        adagasDeA.setName("Adaga de a.");
        adagasDeA.setDices("D8");
        adagasDeA.setDamage(2);
        Weapons.ARMAS.put(adagasDeA.getName(), adagasDeA);

        Weapon alabarda = new Weapon();
        alabarda.setName("Alabarda (longa)");
        alabarda.setDices("D12 D10 D6");
        alabarda.setDamage(1);
        Weapons.ARMAS.put(alabarda.getName(), alabarda);

        Weapon arco = new Weapon();
        arco.setName("Arco");
        arco.setDices("D12");
        arco.setDamage(3);
        arco.setCritical(3);
        arco.setPiercing(true);
        Weapons.ARMAS.put(arco.getName(), arco);

        Weapon arcoLongo = new Weapon();
        arcoLongo.setName("Arco longo");
        arcoLongo.setDices("2D12");
        arcoLongo.setDamage(3);
        arcoLongo.setCritical(3);
        Weapons.ARMAS.put(arcoLongo.getName(), arcoLongo);

        Weapon bastao = new Weapon();
        bastao.setName("Bastão");
        bastao.setDices("D10 D8");
        Weapons.ARMAS.put(bastao.getName(), bastao);

        Weapon cimitarra = new Weapon();
        cimitarra.setName("Cimitarra");
        cimitarra.setDices("D6 D4");
        cimitarra.setDamage(4);
        Weapons.ARMAS.put(cimitarra.getName(), cimitarra);

        Weapon chicote = new Weapon();
        chicote.setName("Chicote");
        chicote.setDices("2D4 D8");
        Weapons.ARMAS.put(chicote.getName(), chicote);

        Weapon clava = new Weapon();
        clava.setName("Clava");
        clava.setDices("2D8");
        clava.setDamage(1);
        Weapons.ARMAS.put(clava.getName(), clava);

        Weapon clavaLonga = new Weapon();
        clavaLonga.setName("Clava longa");
        clavaLonga.setDices("2D8 D12");
        clavaLonga.setDamage(1);
        Weapons.ARMAS.put(clavaLonga.getName(), clavaLonga);

        Weapon espada = new Weapon();
        espada.setName("Espada");
        espada.setDices("D10 D4");
        espada.setDamage(2);
        Weapons.ARMAS.put(espada.getName(), espada);

        Weapon espadaLonga = new Weapon();
        espadaLonga.setName("Espada longa");
        espadaLonga.setDices("D12 D10 D4");
        espadaLonga.setDamage(2);
        Weapons.ARMAS.put(espadaLonga.getName(), espadaLonga);

        Weapon foice = new Weapon();
        foice.setName("Foice");
        foice.setDices("2D4 D6");
        foice.setDamage(2);
        Weapons.ARMAS.put(foice.getName(), foice);

        Weapon foiceLonga = new Weapon();
        foiceLonga.setName("Foice longa");
        foiceLonga.setDices("2D4 D6 D12");
        foiceLonga.setDamage(2);
        Weapons.ARMAS.put(foiceLonga.getName(), foiceLonga);

        Weapon katana = new Weapon();
        katana.setName("Katana");
        katana.setDices("D12 D4");
        katana.setDamage(7);
        katana.setCritical(3);
        Weapons.ARMAS.put(katana.getName(), katana);

        Weapon katar = new Weapon();
        katar.setName("Katar");
        katar.setDices("D6");
        katar.setDamage(6);
        katar.setCritical(3);
        Weapons.ARMAS.put(katar.getName(), katar);

        Weapon lanca = new Weapon();
        lanca.setName("Lança");
        lanca.setDices("D8 D4");
        lanca.setDamage(3);
        Weapons.ARMAS.put(lanca.getName(), lanca);

        Weapon lancaLonga = new Weapon();
        lancaLonga.setName("Lança longa");
        lancaLonga.setDices("D12 D8 D4");
        lancaLonga.setDamage(3);
        Weapons.ARMAS.put(lancaLonga.getName(), lancaLonga);

        Weapon machado = new Weapon();
        machado.setName("Machado");
        machado.setDices("D10 D6");
        machado.setDamage(1);
        Weapons.ARMAS.put(machado.getName(), machado);

        Weapon machadoLongo = new Weapon();
        machadoLongo.setName("Machado longo");
        machadoLongo.setDices("D12 D10 D6");
        machadoLongo.setDamage(1);
        Weapons.ARMAS.put(machadoLongo.getName(), machadoLongo);

        Weapon machadoDeA = new Weapon();
        machadoDeA.setName("Machadinha");
        machadoDeA.setDices("D10");
        machadoDeA.setDamage(1);
        Weapons.ARMAS.put(machadoDeA.getName(), machadoDeA);

        Weapon martelo = new Weapon();
        martelo.setName("Martelo");
        martelo.setDices("D12 D6");
        Weapons.ARMAS.put(martelo.getName(), martelo);

        Weapon marreta = new Weapon();
        marreta.setName("Marreta");
        marreta.setDices("2D12 D6");
        Weapons.ARMAS.put(marreta.getName(), marreta);

        Weapon marteloDeA = new Weapon();
        marteloDeA.setName("Martelo de a.");
        marteloDeA.setDices("D12");
        Weapons.ARMAS.put(marteloDeA.getName(), marteloDeA);

        Weapon massaMangual = new Weapon();
        massaMangual.setName("Massa/Mangual");
        massaMangual.setDices("D12 D4");
        massaMangual.setDamage(1);
        Weapons.ARMAS.put(massaMangual.getName(), massaMangual);

        Weapon massaLonga = new Weapon();
        massaLonga.setName("Massa longa");
        massaLonga.setDices("2D12 D4");
        massaLonga.setDamage(1);
        Weapons.ARMAS.put(massaLonga.getName(), massaLonga);

        Weapon nuntchaco = new Weapon();
        nuntchaco.setName("Nuntchaco");
        nuntchaco.setDices("D10");
        nuntchaco.setDamage(4);
        Weapons.ARMAS.put(nuntchaco.getName(), nuntchaco);

        Weapon nuntchacoTriplo = new Weapon();
        nuntchacoTriplo.setName("Nuntchaco triplo");
        nuntchacoTriplo.setDices("2D6");
        nuntchacoTriplo.setDamage(3);
        ARMAS.put(nuntchacoTriplo.getName(), nuntchacoTriplo);

        Weapon picareta = new Weapon();
        picareta.setName("Picareta");
        picareta.setDices("D8 D6");
        picareta.setDamage(2);
        ARMAS.put(picareta.getName(), picareta);

        Weapon picaretaLonga = new Weapon();
        picaretaLonga.setName("Picareta longa");
        picaretaLonga.setDices("D12 D8 D6");
        picaretaLonga.setDamage(2);
        ARMAS.put(picaretaLonga.getName(), picaretaLonga);

        Weapon punhos = new Weapon();
        punhos.setName("Punhos");
        punhos.setDices("2D6 D4");
        ARMAS.put(punhos.getName(), punhos);

        Weapon rapieira = new Weapon();
        rapieira.setName("Rapieira");
        rapieira.setDices("2D4");
        rapieira.setDamage(5);
        ARMAS.put(rapieira.getName(), rapieira);

        Weapon tridente = new Weapon();
        tridente.setName("Tridente");
        tridente.setDices("3D8"); // Dano original: 2 D6 + 3
        tridente.setDamage(3);
        ARMAS.put(tridente.getName(), tridente);

        Weapon ak47 = new Weapon();
        ak47.setName("AK-47");
        ak47.setDices("2D12 2D8");
        ak47.setDamage(1);
        ak47.setCritical(3);
        ak47.setPiercing(true);
        ARMAS.put(ak47.getName(), ak47);

        Weapon ar15 = new Weapon();
        ar15.setName("AR-15");
        ar15.setDices("2D10");
        ar15.setDamage(6);
        ar15.setCritical(3);
        ar15.setPiercing(true);
        ARMAS.put(ar15.getName(), ar15);

        Weapon besta = new Weapon();
        besta.setName("Besta");
        besta.setDices("3D12");
        besta.setDamage(2);
        besta.setCritical(3);
        besta.setPiercing(true);
        ARMAS.put(besta.getName(), besta);

        Weapon metralhadora = new Weapon();
        metralhadora.setName("Metralhadora");
        metralhadora.setDices("D12 D10");
        metralhadora.setDamage(3);
        metralhadora.setCritical(3);
        metralhadora.setPiercing(true);
        ARMAS.put(metralhadora.getName(), metralhadora);

        Weapon pistola = new Weapon();
        pistola.setName("Pistola .38");
        pistola.setDices("D12");
        pistola.setDamage(4);
        pistola.setCritical(3);
        pistola.setPiercing(true);
        ARMAS.put(pistola.getName(), pistola);

        Weapon pistolaLazer = new Weapon();
        pistolaLazer.setName("Pistola lazer");
        pistolaLazer.setDices("D12");
        pistolaLazer.setDamage(8);
        pistolaLazer.setCritical(2);
        pistolaLazer.setPiercing(true);
        ARMAS.put(pistolaLazer.getName(), pistolaLazer);

        Weapon rifle = new Weapon();
        rifle.setName("Rifle");
        rifle.setDices("D12 D10");
        rifle.setDamage(8);
        rifle.setCritical(3);
        rifle.setPiercing(true);
        ARMAS.put(rifle.getName(), rifle);

        Weapon uzi = new Weapon();
        uzi.setName("Uzi");
        uzi.setDices("D12 D8");
        uzi.setDamage(1);
        uzi.setCritical(3);
        uzi.setPiercing(true);
        ARMAS.put(uzi.getName(), uzi);


        Weapon fogo = new Weapon();
        fogo.setName("Fogo");
        fogo.setDices("D12");
        ELEMENTOS.put(fogo.getName(), fogo);

        Weapon raio = new Weapon();
        raio.setName("Raio");
        raio.setDices("D12");
        ELEMENTOS.put(raio.getName(), raio);

        Weapon acido = new Weapon();
        acido.setName("Acido");
        acido.setDices("D12");
        ELEMENTOS.put(acido.getName(), acido);

        Weapon trevas = new Weapon();
        trevas.setName("Trevas");
        trevas.setDices("D12");
        ELEMENTOS.put(trevas.getName(), trevas);

        Weapon madeira = new Weapon();
        madeira.setName("Madeira");
        madeira.setDices("D10");
        madeira.setDamage(1);
        ELEMENTOS.put(madeira.getName(), madeira);

        Weapon gelo = new Weapon();
        gelo.setName("Gelo");
        gelo.setDices("D10");
        gelo.setDamage(1);
        ELEMENTOS.put(gelo.getName(), gelo);

        Weapon terra = new Weapon();
        terra.setName("Terra");
        terra.setDices("D10");
        terra.setDamage(1);
        ELEMENTOS.put(terra.getName(), terra);

        Weapon metal = new Weapon();
        metal.setName("Metal");
        metal.setDices("D10");
        metal.setDamage(1);
        ELEMENTOS.put(metal.getName(), metal);
    }
}
