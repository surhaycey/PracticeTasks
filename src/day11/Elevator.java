package day11;

public class Elevator {
    public static void main(String[] args) {
        int floorNum=1;
        String res;
        switch (floorNum){
            case 1:
                res="Floor 1 selected. Companies: Lobby, Verizon, Starbucks";
                break;
            case 2:
                res="Floor 2 selected. Companies: Cybertek, NASA, Intelsat";
                break;
            case 3:
                res="Floor 3 selected. Companies: Lyft, BofA, Stake house";
                break;
            default:
                res="Invalid floor - 6";
        }
        System.out.println(res);
    }
}
