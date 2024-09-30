package exampl1.enums;

public enum Regionenum {
    BUKHARA(150000, "BUKHARA"),
    TASHKENT(550000, "TASHKENT"),
    SAMARKAND(160000, "SAMARKAND"),
    ANDIJAN(153000, "ANDIJAN");

    private String nameUz;
    private long population;


    private Regionenum( long population,String nameUz) {
        this.nameUz = nameUz;
        this.population = population;
    }

    public String getNameUz() {
        return nameUz;
    }

    public void setNameUz(String nameUz) {
        this.nameUz = nameUz;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }
}
