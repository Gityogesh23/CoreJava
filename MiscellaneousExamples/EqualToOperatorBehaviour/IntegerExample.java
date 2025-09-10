
public class IntegerExample {
    public static void main(String[] args) {
        Integer a=100;
        Integer b=100;
        System.out.println(a==b);

        Integer x=200;
        Integer y=200;
        System.out.println(x==y);
    }


}
/*
 Key Concepts

Wrapper Class (Integer):
In Java, Integer is an object wrapper around the primitive int.

Integer Caching:
Java caches Integer objects for values in the range -128 to 127.
This means if you create two Integer objects with values in this range, they will actually refer to the same object in memory.

== operator with Objects:

== checks reference equality (whether two references point to the same object).

.equals() checks value equality (whether the values inside the objects are the same).

🔹 Execution

Case 1: Integer a = 100; Integer b = 100;

Both a and b are within the cache range (-128 to 127).

So, both refer to the same object.

a == b → true. ✅

Case 2: Integer x = 200; Integer y = 200;

200 is outside the cache range.

So, new Integer objects are created for x and y.

x and y refer to different objects.

x == y → false. ❌
 */