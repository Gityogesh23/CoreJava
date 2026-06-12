//Print below pattern:
//     A
//   A B C 
//  A B C D 


public class Patterns_3 {
        public static void main(String[] args) {
    
            int n = 3;
    
            for (int i = 1; i <= n; i++) {
    
                for (int j = 1; j <= n - i; j++) {
                    System.out.print(" ");
                }
    
                if (i == 1) {
                    System.out.print("A");
                } else {
                    for (char ch = 'A'; ch <= 'A' + i; ch++) {
                        System.out.print(ch + " ");
                    }
                }
    
                System.out.println();
            }
        }
    }