package day31;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOffres {
    public static void main(String[] args) {
        Offer off1= new Offer();
        Offer off2=new Offer();
        Offer off3=new Offer();
        Offer off4=new Offer();
        Offer off5=new Offer();
        off1.setInfo("VA","Amazon","SDET",110000,true,true,true,true);
        off2.setInfo("CA","Sony Inc.","QA",120000,true,false,false,true);
        off3.setInfo("FL","Apple Inc.","QE",125000,true,true,true,false);
        off4.setInfo("TX","CapitalOne","SM",115000,false,false,true,true);
        off5.setInfo("WA","Bank Of America","BA",130000,true,true,false,true);

        Offer[] myOffers={off1,off2,off3,off4,off5};

        ArrayList<Offer> fullTimeOffers =new ArrayList<>(Arrays.asList(myOffers));
        fullTimeOffers.removeIf(p -> !p.isFullTime);

        ArrayList<Offer> localOffers =new ArrayList<>(Arrays.asList(myOffers));
        localOffers.removeIf(p -> !(p.location.equals("VA")||p.location.equals("CA")));

        System.out.println(localOffers.size());







    }
}
