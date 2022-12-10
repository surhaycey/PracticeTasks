package day17;

import java.util.Scanner;

public class RoomReservation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int queenP=100,
                singleP=80,
                kingP=120;

        String room;
        int price;
        String res;
        System.out.println("Do you want to reserve a room?");
        room= sc.nextLine();
        room=room.toLowerCase();
        if (room.equals("yes")){
            System.out.println("Which room you'd like to reserve");
            room=sc.nextLine();
            room=room.toLowerCase();
            boolean
                    queen=room.equals("queen bed"),
                    king=room.equals("king bed"),
                    single=room.equals("single bed");
            while (!(queen)&&!(king)&&!(single)){
                System.out.println("Invalid room, try again");
                room=sc.nextLine();
                room=room.toLowerCase();

                        queen=room.equals("queen bed");
                        king=room.equals("king bed");
                        single=room.equals("single bed");

            }
            if (queen) System.out.println("$"+queenP);
            else if (king) System.out.println("$"+kingP);
            else System.out.println("$"+singleP);
        }
        else System.out.println("Have a nice day.");




    }
}
