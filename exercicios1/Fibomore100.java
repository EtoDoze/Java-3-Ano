package exercicios1;

//. (Opcional) Imprima os primeiros números da série de Fibonacci até passar de
//100. A série de Fibonacci é a seguinte: 0, 1, 1, 2, 3, 5, 8, 13, 21, etc. Para
//calculá-la, o primeiro elemento vale 0, o segundo vale 1, e daí por diante. O n- ésimo elemento vale o (n-1)-ésimo elemento somado ao (n-2)-ésimo elemento
//(ex: 8 = 5 + 3).

public class Fibomore100 {
    public static void main(String[] args) {
        int result = 0;
        int num1 = 0;
        int num2 = 1;
        System.out.println(num1);

        boolean stop = true;
        while (stop == true) {
            if (num2 >100) {
                stop = false;
            }
            System.out.println(num2);
            result = num1 + num2;
            num1 = num2;
            num2 = result;
        }
    }
}
