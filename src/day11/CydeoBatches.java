package day11;

public class CydeoBatches {
    public static void main(String[] args) {
        String batches="EU",classes;
        switch (batches){
            case "US morning":
                classes="Class times are 10-5 EST. M, T, Th, F.";
                break;
            case "US evening":
                classes="Class times are 7-10 EST. M, T, W, Th, S, S";
                break;
            case "EU":
                classes="Class times are  10-5 EST. M, T, W, Th, F.";
                break;
            default: classes="Invalid Btach";
        }
        System.out.println(classes);
    }
}
