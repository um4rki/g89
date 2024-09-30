package exampl1.enums;

import static exampl1.enums.Regionenum.*;

public enum Country {
    BUKHARA(Regionenum.BUKHARA),
    TASHKENT(Regionenum.TASHKENT),
    SAMARKAND(Regionenum.SAMARKAND),
    ANDIJAN(Regionenum.ANDIJAN);

    private Regionenum regionenum;


    Country(Regionenum regionenum){
        this.regionenum = regionenum;
    }

    public String getStatus(){
        long population = regionenum.getPopulation();
        if(regionenum==Regionenum.ANDIJAN&&population<1_000_000){
            return "O'RTACHA";
        }if(population>1000&&population<2_000_000){
            return "YUQORI";
        }else {
            return "O'TA yuqori";
        }
    }
}
