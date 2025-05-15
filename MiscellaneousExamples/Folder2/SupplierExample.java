/* 
Q)what is supllier?
ans:supplier represents supplier of result.
Their is no requirement that a new or distinct result result
will be returnedeach time supplier is invoked.

This is a functional interface whose functional method is get().
Type parameters:<T>==>type of result supplied by this supplier.

@FunctionalInterface
public interface Supplier<T>{

    gets a rersult
    returns a result.
    T get();
}
*/

import java.util.function.Supplier;

public class SupplierExample{
    public static void main(String[] args){
        Supplier<Double>randomSupplier=()->Math.random();
        
        System.out.println("Random value: "+""+randomSupplier.get());
    }
}