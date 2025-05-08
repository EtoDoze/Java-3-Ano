package exercicios1;
//Imprima os fatoriais de 1 a 10

public class Fat1a10 {
    public static void main(String[] args) {
        for(int i=0;i<=10;i++){

            int num = i;
            int conta = 1;

            while (num >=1) {
                conta = conta * num;
                num --;
            }
            System.err.println("Fatorial de "+i+"! é:"+conta);
        }
    }
}
