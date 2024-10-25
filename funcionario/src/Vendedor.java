public class Vendedor extends Funcionario {

    public Vendedor(String nome, Double SalarioBase){
        super(nome,SalarioBase);

    }
    public Double CalcularSalario(){
        SalarioBase += (SalarioBase * 10)/100;
        return SalarioBase;

    }
    public void Mostra() {
        System.out.println("funcionario: " + nome + " Salario Total: " + SalarioBase);
    }
}
