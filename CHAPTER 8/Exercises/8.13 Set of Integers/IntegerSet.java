package JuyangBai.Java;

/*
Class: IntegerSet
Array length: 100
Array element: true or false
Array type: booleans

Constructor:
    1. no-argument
    2. false values

Methods

Union:
    1. Static
    2. Set-theoretic union of two existing sets
    (i.e., an element of the new set’s array is set to true if that element is true
    in either or both of the existing sets, otherwise, the new set’s element is set to false)

Intersection:
    1. Static
    2. Set-theoretic union of two existing sets
    (i.e.,an element of the new set’s array is set to false if that element is false in either or both of the
    existing sets—otherwise, the new set’s element is set to true).

InsertElement:
    1. inserts a new k into a set: setting a[k] to true

deleteElement:
    1. deletes integer m: setting a[m] to false

toString:
    1. returns a String containing a set as a list of numbers separated
       by spaces. Include only those elements that are present in the set.
    2. empty set: '---'

isEqualTo:
    1. whether two sets are equal



[F F F F F F F]

[0 1 2 3 4 5 6]
T T T T T T T

[3 4 5 2 1 5 6]
F T T T T T T


*/

public class IntegerSet{
    private static final int LENGTH = 101;
    private boolean[] integerSet = new boolean[LENGTH];


    //Constructor
    // no-argument constructor
    public IntegerSet()
    {
        for(boolean b : integerSet)
            b = false;
    }

    //Have arguments constructor
    public IntegerSet(int... num)
    {
        for(int n : num)
            insertElement(n);
    }


    //Methods
    public static IntegerSet union(IntegerSet set1, IntegerSet set2)
    {
        IntegerSet unionSet = new IntegerSet();

        for(int i=0; i<LENGTH; i++)
        {
            if(set1.integerSet[i] || set2.integerSet[i])
                unionSet.insertElement(i);
            else
                unionSet.deleteElement(i);
        }
        return unionSet;
    }

    public static IntegerSet intersection(IntegerSet set1, IntegerSet set2)
    {
        IntegerSet intersectionSet = new IntegerSet();

        for(int i=0; i<LENGTH; i++)
        {
            if(!set1.integerSet[i] || !set2.integerSet[i])
                intersectionSet.deleteElement(i);
            else
                intersectionSet.insertElement(i);
        }
        return intersectionSet;
    }

    public boolean isEqual(boolean[] set1, boolean[] set2)
    {
        for(int i=0; i<LENGTH; i++)
        {
            if(set1[i] != set2[i])
                return false;
        }
        return true;
    }

    public void insertElement(int k)
    {
        if(k < LENGTH)
            integerSet[k] = true;
        else
            throw new ArrayIndexOutOfBoundsException("element range required: 0-100");
    }

    public void deleteElement(int m)
    {
        if(m < LENGTH)
            integerSet[m] = false;
        else
            throw new ArrayIndexOutOfBoundsException("element range required: 0-100");
    }


    public String toString()
    {
        StringBuilder str = new StringBuilder("");

        for(int i=0; i<LENGTH; i++){
            if(integerSet[i] == true)
                str.append(i + " ");
        }
        return (str.toString().equals("")) ? "---" : str.toString();
    }
}