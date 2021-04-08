package JuyangBai.Java;

public class Main {

    public static <T> boolean isEqualTo(T x, T y)
    {
        return x.equals(y);
    }

    public static void main(String[] args) {
	// write your code here
        char c1, c2;
        c1 = 'x';
        c2 = 'x';
        System.out.printf("%c is equal to %c?   ", c1, c2);
        System.out.println(isEqualTo(c1,c2));

        int x, y;
        x = 10;
        y = 10;
        System.out.printf("%d is equal to %d?   ", x, y);
        System.out.println(isEqualTo(x,y));

        double x1, y1;
        x1 = 3.1415927;
        y1 = 3.1415926;
        System.out.printf("%f is equal to %f?   ", x1, y1);
        System.out.println(isEqualTo(x1,y1));

        Object o1, o2;
        o1 = "math";
        o2 = "physics";
        System.out.printf("%s is equal to %s?   ", o1, o2);
        System.out.println(isEqualTo(o1,o2));
    }
}
