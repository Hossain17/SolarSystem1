package com.company;

import java.util.Objects;

public class Main {

    public static void main(String[] args) {

        SolarSystem andromeda =new SolarSystem();
        andromeda.planet=2;
        andromeda.moon=4;
        andromeda.sun=1;

        featureSin mikesun=new featureSin();
        mikesun.color="Red";
        mikesun.heat="11111111111kj";
        mikesun.temp="60000564545465kelvin";
        mikesun.radius="90000000km";
        mikesun.maritalStatus="in love with asghar";

        //adding planet2 features

        planet2 bastranout=new planet2();
        bastranout.color="pinnk";
        bastranout.size="4545564km";
        bastranout.status="same as MIKE's";


        //adding planet 1 features
        planet1 astranout = new planet1();
        astranout.color="grey";
        astranout.realtionshipStatus="single";
        astranout.size="95664564564km";
        

    }
}
