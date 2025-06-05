public class Main {
    public static void main(String[] args) {
            
    
    
    String tipoConta = "";
    
    if ((tipoConta.toLowerCase() == "corrente") || (tipoConta.toLowerCase() == "poupança")) {
        
        System.out.println("Tipo de conta: "+tipoConta);
    }

    }
}

abstract class Conta{
    double numero;
    double saldo;
    String cliente;

    public Conta(String tipoconta){
        var numero = 0;
        var saldo = 0;
        String cliente = tipoconta;
    }
}