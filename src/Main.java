public class Main {
    public static void main(String[] args) {
        Data f = new Data();
//        f.COMPANY = "Microsoft";          (ERROR) : final variable can't be changed

        f.display(101, "Shruti");

//        ExtendData ed = new ExtendData();     (ERROR) : final class can't be inherited
        f.display(101, "Swati");
    }
}