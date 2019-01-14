package com.proartz;

public class Planet extends HeavenlyBody {

    public Planet(String name, double orbitalPeriod) {
        super(name, "Planet", orbitalPeriod);
    }



    @Override
    public boolean addSatelite(HeavenlyBody moon) {
        Moon temp = new Moon("test", 0);
        if(moon.getClass() != temp.getClass()) {
            System.out.println("Heavenly Body need to be a Moon");
            return false;
        }
        return super.addSatelite(moon);
    }
}
