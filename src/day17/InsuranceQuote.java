package day17;

import java.util.Scanner;

public class InsuranceQuote {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in );
        String name,gender,maritalStatus,insuranceType,accidents,ATDevice;
        int age,milesDriven;
        System.out.println("What is your name?");
        name=sc.nextLine();
        System.out.println("What is your gender? Male/Female");
        gender= sc.nextLine();
        gender=gender.toLowerCase();
        boolean genderTF=gender.equals("female")||gender.equals("male");


        while (!genderTF){
            System.out.println("Invalid, please re-enter.");
            gender= sc.nextLine();
            gender=gender.toLowerCase();

            genderTF=gender.equals("female")||gender.equals("male");

        }
        System.out.println("Are you married?");
        maritalStatus= sc.nextLine();
        maritalStatus=maritalStatus.toLowerCase();
        boolean maritalTF=maritalStatus.equals("yes")||maritalStatus.equals("no");
        while (!maritalTF){
            System.out.println("Invalid, please re-enter.");
            maritalStatus= sc.nextLine();
            maritalStatus=maritalStatus.toLowerCase();

            maritalTF=maritalStatus.equals("yes")||maritalStatus.equals("no");

        }
        System.out.println("How old are you?");
        age= sc.nextInt();
        while (age>120 || age<0){
            System.out.println("Invalid, please re-enter.");
            age= sc.nextInt();



    }
        System.out.println("How many miles do you drive daily?");
        milesDriven=sc.nextInt();
        while (milesDriven<5){
            System.out.println("Invalid, please re-enter.");
            milesDriven= sc.nextInt();
        }
        if(milesDriven<=10)milesDriven=1;
        else if (milesDriven<=50) milesDriven=2;
        else milesDriven=3;

        System.out.println("Do you want full coverage or liability insurance?");
        sc.nextLine();
        insuranceType=sc.nextLine();
        insuranceType=insuranceType.toLowerCase();
        boolean insuranceTypeTF=insuranceType.equals("full coverage")||insuranceType.equals("liability insurance");
        while (!insuranceTypeTF){
            System.out.println("Invalid, please re-enter.");
            insuranceType=sc.nextLine();
            insuranceType=insuranceType.toLowerCase();
            insuranceTypeTF=insuranceType.equals("full coverage")||insuranceType.equals("liability insurance");

        }
        System.out.println("Did you have any accidents or claims in the past 5 years? Yes/No");
        accidents=sc.nextLine();
        accidents=accidents.toLowerCase();

        boolean accidentTF=accidents.equals("yes")||accidents.equals("no");

        while (!accidentTF){
            System.out.println("Invalid, please re-enter.");
            accidents=sc.nextLine();
            accidents=accidents.toLowerCase();

           accidentTF=accidents.equals("yes")||accidents.equals("no");


        }




        System.out.println("Do you have an anti-theft device? Yes/No");
        ATDevice=sc.nextLine();
        ATDevice=ATDevice.toLowerCase();

        boolean ATDTF=ATDevice.equals("yes")||ATDevice.equals("no");
        while (!ATDTF){System.out.println("Invalid, please re-enter.");
            ATDevice=sc.nextLine();
            ATDevice=ATDevice.toLowerCase();

           ATDTF=ATDevice.equals("yes")||ATDevice.equals("no");


        }

        int price=0;
        if (insuranceType.equals("liability insurance")) {
            if (age<25)price+=90;
            else price+=50;

            if (milesDriven==1)price+=10;
            else if (milesDriven==2) price+=30;
            else price+=50;

        }
        else {
            if (age<25)price+=160;
            else price+=120;

            if (milesDriven==1)price+=20;
            else if (milesDriven==2) price+=40;
            else price+=70;

            
        }

        if(ATDevice.equals("yes"))price*=0.95;
        if (accidents.equals("yes"))price*=1.15;
        else price*=0.90;
        if(maritalStatus.equals("yes"))price*=0.95;

        System.out.println("Hello "+name+"!\n" +
                "Your "+insuranceType+ " costs $"+price+" \nThe price has been set according to the information you provided us. \nHave a nice day! ");







    }}
