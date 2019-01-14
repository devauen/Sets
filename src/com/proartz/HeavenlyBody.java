package com.proartz;

import java.util.HashSet;
import java.util.Set;

public abstract class HeavenlyBody {
    private String name;
    private String bodyType;
    private double orbitalPeriod;
    private Set<HeavenlyBody> satellites;

    public HeavenlyBody(String name, String bodyType, double orbitalPeriod) {
        this.name = name;
        this.bodyType = bodyType;
        this.orbitalPeriod = orbitalPeriod;
        this.satellites = new HashSet<>();
    }


    public String getName() {
        return name;
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public String getBodyType() {
        return bodyType;
    }

    public boolean addSatelite(HeavenlyBody moon) {
        return this.satellites.add(moon);
    }

    public Set<HeavenlyBody> getSatellites() {
        return new HashSet<>(this.satellites);
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }
        System.out.println("obj.getClass() is " + obj.getClass());
        System.out.println("this.getClass() is " + this.getClass());
        if(obj == null || (obj.getClass() != this.getClass())) {
            return false;
        }

        String objName = ((HeavenlyBody) obj).getName();
        double objOrbital = ((HeavenlyBody) obj).getOrbitalPeriod();

        if(this.getOrbitalPeriod() != objOrbital) {
            return false;
        }

        return this.name.equals(objName);
    }

    @Override
    public int hashCode() {
//        System.out.println("hashcode called");
        return this.name.hashCode() + 57;
    }

    @Override
    public String toString() {
        return "HeavenlyBody{" +
                "name='" + name + '\'' +
                ", bodyType='" + bodyType + '\'' +
                ", orbitalPeriod=" + orbitalPeriod +
                ", satellites=" + satellites +
                '}';
    }
}
