package DSA;

import java.util.Arrays;

public enum GeoPoliticalZones {

    NORTHCENTRAL("Benue", "FCT", "Kogi", "Kwara", "Nasarawa", "Niger", "Plateau"),
    NORTHEAST("Adamawa", "Bauchi", "Borno", "Gombe", "Taraba", "yobe"),
    NORTHWEST("Kaduna", "Katsina", "Kano", "Kebbi", "Sokoto", "Jigawa", "Zamfara"),
    SOUTHEAST("Abia", "Anambra", "Ebonyi", "Enugu", "Imo"),
    SOUTHSOUTH("Akwa_ibom", "Bayelsa", "Cross_River", "Delta", "Edo", "Rivers"),
    SOUTHWEST("Ekiti", "Lagos", "Osun", "Ondo", "Ogun", "Oyo");

    private String[] politicalZones;

    GeoPoliticalZones(String... politicalZones) {
        this.politicalZones = politicalZones;
        System.out.println("I am living " + this.name());
    }

    public String[] getPoliticalZones() {
        return politicalZones;
    }

    public String setPoliticalZone() {
        this.politicalZones = new String[this.politicalZones.length - 1];
        for (int count = 0; count < this.politicalZones.length; count++) {
            this.politicalZones[count] = this.politicalZones[count + 1];
        }
        return this.politicalZones[this.politicalZones.length - 1];
    }
    public static void main(String[] args) {
        for (GeoPoliticalZones geoPoliticalZone : GeoPoliticalZones.values()) {
            System.out.println(geoPoliticalZone);
        }
    }

}