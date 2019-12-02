package com.example.attlistviewfrutas;

import java.math.BigDecimal;
import java.util.HashMap;

public class Controller {

    //Array com instacias de frutas definidas como atributos da classe definidas como final abaixo
    public Fruta[] FRUTAS = {MACA, MORANGO,LARANJA,};
    public HashMap<String, Fruta> FRUTA_MAP =new HashMap<>();


    public Controller() {
        for (Fruta fruta : FRUTAS) {
            FRUTA_MAP.put(String.valueOf(fruta.getCodigo()), fruta);
        }

    }

    //Definição de atributo da classe Frutas com nome de frutas e indtanciado os mesmos.
    public static final Fruta MACA = new Fruta("Maça",
            "Avermelhada com traços verdes",
            R.drawable.maca,
            new BigDecimal(3.9),
            new BigDecimal(6.50),
            2922,
            new BigDecimal(4.5),
            15151);

    public static final Fruta MORANGO = new Fruta("Morango",
            "Avermelhada com traços verdes",
            R.drawable.morango,
            new BigDecimal(3.9),
            new BigDecimal(6.50),
            2922,
            new BigDecimal(4.5),
            15152);

    public static final Fruta LARANJA = new Fruta("Laranja",
            "Fruta em formato esferico com coloraçaão laranja",
            R.drawable.laranja,
            new BigDecimal(3.9),
            new BigDecimal(6.50),
            2922,
            new BigDecimal(4.5),
            15154);

};