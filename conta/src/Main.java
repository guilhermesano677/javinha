//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ContaCorrente contaCorrente1 = new ContaCorrente(12000.0,700.0,0.05);
        ContaCorrente contaCorrente2 = new ContaCorrente(500.0, 250.0,0.05);
        ContaPoupança contaPoupança1 = new ContaPoupança(500.0, 250.0, 0.08);

        contaCorrente1.sacar();
        contaCorrente2.depositar();
        contaPoupança1.sacar();
        contaPoupança1.depositar();


    }
}