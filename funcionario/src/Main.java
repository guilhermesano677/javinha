//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("jobson", 2500.0);
        Vendedor vendedor1 = new Vendedor("shaulin", 2500.0);
        Gerentes gerentes1 = new Gerentes("hobert",4000.0);

        vendedor1.CalcularSalario();
        gerentes1.CalcularSalario();

        vendedor1.Mostra();
        gerentes1.Mostra();

    }
}