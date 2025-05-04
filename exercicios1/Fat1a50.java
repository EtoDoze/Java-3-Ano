package exercicios1;
//. No código do exercício anterior, aumente a quantidade de números que terão
//os fatoriais impressos até 20, 30 e 40. Em um determinado momento, além de
//esse cálculo demorar, começará a mostrar respostas completamente erradas.
//Por quê? Mude de int para long a fim de ver alguma mudança.

//R: pois o int e o long não foram feitas para guardar tantos números, o correto é trocar o tipo da variavel para
//double pois ela aguenta bem mais, o float tbm, mas o float só aguenta até 34!, o double vai até 170!, se quiser
// ir além use o tipo BigInteger, ele é sem limite, só depende da ram

public class Fat1a50 {
    public static void main(String[] args) {
        for(int i=0;i<=50;i++){

            long num = i;
            double conta = 1;

            while (num >=1) {
                conta = conta * num;
                num --;
            }
            System.err.println("Fatorial de "+i+"! é:"+conta);
        }
    }
}
