package conta_banco;

class ContaPoupanca extends Conta {
    private double taxaRendimento;

    public ContaPoupanca(int numero, Cliente titular, double taxaRendimento) {
        super(numero, titular);
        this.taxaRendimento = taxaRendimento;
    }

    public void aplicarRendimento() {
        double rendimento = getSaldo() * taxaRendimento;
        depositar(rendimento);
        System.out.println("Rendimento de R$" + rendimento + " aplicado na conta poupança");
    }

    @Override
    void sacar(double valor) {
        if (valor > 0 && valor <= getSaldo()) {
            depositar(-valor);
            System.out.println("Saque de R$" + valor + " realizado na conta poupança");
        } else {
            System.out.println("Saldo insuficiente ou valor de saque inválido na conta poupança");
        }
    }
}