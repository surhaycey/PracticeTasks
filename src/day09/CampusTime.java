package day09;

public class CampusTime {
    public static void main(String[] args) {
        int hour=1;
        String status;

        if(hour<=24 &&hour>=0)
        {
            if (hour>=8 && hour<=23) status="open";
        else status= "closed";
        }else status="invalid time";
        System.out.println(status);

    }
}
