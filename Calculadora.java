public class Calculadora{

    public static void main(String[] args) {
        // Exemplo de uso dos métodos soma
        System.out.println(soma(2, 3));        // Saída: 5
        System.out.println(soma(2.5, 3.7));    // Saída: 6.2
    }

    public static int soma(int a, int b) {
        return a + b;
    }

    // Método para soma de números de ponto flutuante
    public static double soma(double a, double b) {
        return a + b;
    }
}

