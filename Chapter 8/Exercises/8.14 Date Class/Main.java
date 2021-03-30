package JuyangBai.Java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Date date0 = new Date(3, 27, 2000);
        System.out.println(date0.toForm1());
        System.out.println(date0.toForm2());
        System.out.println(date0.toForm3());

        System.out.println();


        Date date1 = new Date("March", 27, 2000);
        System.out.println(date1.toForm1());
        System.out.println(date1.toForm2());
        System.out.println(date1.toForm3());

        System.out.println();


        Date date2 = new Date(87, 2000);
        System.out.println(date2.toForm1());
        System.out.println(date2.toForm2());
        System.out.println(date2.toForm3());

        System.out.println();
    }
}
