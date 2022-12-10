package day11;

public class Browser {
    public static void main(String[] args) {
        String browserName="", res;
        switch (browserName){
            case "chrome":
                res="chrome";
                break;

            case "firefox":
                res="firefox";
                break;
            case "opera":
                res="opera";
                break;
            case "safari":
                res="safari";
                break;
            case "edge":
                res="edge";
                break;
            default:res="Invalid Browser";
        }
        System.out.println(res);
    }
}
