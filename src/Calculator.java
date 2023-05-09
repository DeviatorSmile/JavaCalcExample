public class Calculator {


    public static void main(String[] args) {
        calc(3, 7, '+');
        calc(10, 5, '-');
        calc(3, 3, '*');
        calc(12, 4, '/');
        calc(1, 8, '$');

    }
    static void calc(double a, double b, char operation){
     if(operation == '+'){
         System.out.println(a+b);
     } else if(operation == '-') {
         System.out.println(a-b);
     } else if(operation == '*') {
         System.out.println(a*b);
     } else if(operation == '/') {
         System.out.println(a/b);
     } else {
         System.out.println("Sorry, it's incorrect operation type");
     }


    }
}