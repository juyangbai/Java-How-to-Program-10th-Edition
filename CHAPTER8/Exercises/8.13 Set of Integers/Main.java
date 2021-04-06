package JuyangBai.Java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        IntegerSet intSet1 = new IntegerSet(1, 34, 25, 11, 23, 56, 43, 16, 100);
        IntegerSet intSet2 = new IntegerSet(44, 32, 65, 62, 12, 11, 16, 34, 100);

        System.out.printf("intSet1 : %s\n", intSet1.toString());
        System.out.printf("intSet2 : %s\n", intSet2.toString());

        IntegerSet intSetUnion = IntegerSet.union(intSet1, intSet2);
        IntegerSet intSetIntersection = IntegerSet.intersection(intSet1, intSet2);

        System.out.printf("intSetUnion : %s\n", intSetUnion.toString());
        System.out.printf("intSetIntersection : %s\n", intSetIntersection.toString());
    }
}
