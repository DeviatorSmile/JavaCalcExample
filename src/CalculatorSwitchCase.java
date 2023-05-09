public class CalculatorSwitchCase {
    public static void main(String[] args) {
        calc(3, 7, '+');
        calc(10, 5, '-');
        calc(3, 3, '*');
        calc(12, 4, '/');
        calc(1, 8, '$');
    }

    static void calc(double a, double b, char operation){
        switch (operation){
            case '+':
                System.out.println(a+b);
                break;
            case '-':
                System.out.println(a-b);
                break;
            case '*':
                System.out.println(a*b);
                break;
            case '/':
                System.out.println(a/b);
        }

    }
}
