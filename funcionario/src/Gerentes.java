import java.sql.SQLOutput;

public class Gerentes extends Funcionario{

    public Gerentes(String nome, Double SalarioBase){
        super(nome,SalarioBase);
    }
    public Double CalcularSalario(){
        SalarioBase += (SalarioBase * 20)/100;
        return SalarioBase;
    }

    public void Mostra(){
        System.out.println("funcionario: "+nome+" Salario Total: "+ SalarioBase);
    }
}
