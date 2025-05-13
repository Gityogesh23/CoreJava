interface NumberOperation {
    int operate(int a);
}

public class LambdaExpDemo {
    public static void main(String[] args) {
        NumberOperation squareOld = new NumberOperation() {
            @Override
            public int operate(int a) {
                return a * a;
            }
        };

        System.out.println("Square (old way) of 5: " + squareOld.operate(5)); // Output: Square (old way) of 5: 25
    }
}