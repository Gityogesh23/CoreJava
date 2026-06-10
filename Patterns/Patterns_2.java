/*
A B C D
A B C
A B
A
logic: set 
for(int i=5;i>=5;i--){
    char ch='A';
    for(int j=1;j<=i;j++){
    Sop(ch+" ");
    ch++;
    }
}

*/
public class Patterns_2 {
public static void main(String[] args) {
 //row till which we want o/p
 int n=5;
 for(int i=n;i>=1;i--){
 char ch='A';
 for(int j=1;j<=i;j++){
    System.out.print(ch+" ");
    ch++;
    }
    System.out.println();
 }   
}    
}
