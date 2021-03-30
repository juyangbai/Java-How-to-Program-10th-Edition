package JuyangBai.Java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        TIME2 t1 = new TIME2();
        TIME2 t2 = new TIME2(2);
        TIME2 t3 = new TIME2(21,34);
        TIME2 t4 = new TIME2(12,25,42);
        TIME2 t5 = new TIME2(t4);

        System.out.println("Constructed with:");
        displayTime("t1: all default arguments", t1);
        displayTime("t2: hour specified: default minute and second", t2);
        displayTime("t3: hour and minute specified: default second", t3);
        displayTime("t4: hour, minute and second specified", t4);
        displayTime("t5: TIME2 object t4 specified", t5);

        try{
            TIME2 t6 = new TIME2(27,74,99);
        }
        catch (IllegalArgumentException e)
        {
            System.out.printf("%nException while initializing t6: %s%n", e.getMessage());
        }
    }

    private static void displayTime(String header, TIME2 t)
    {
        System.out.printf("%s%n    %s%n    %s%n", header, t.toUniversalString(), t.toString());
    }
}
