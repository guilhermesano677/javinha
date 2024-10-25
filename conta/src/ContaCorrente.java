public class ContaCorrente extends ContaBancaria {

    Double taxaOperacao ;
    public ContaCorrente(Double saldo,Double valor, Double taxaOperacao){
        super(saldo, valor);
        this.taxaOperacao = taxaOperacao;

    }
    public Double sacar(){
        Double resultado = getSaldo() - (getValor() - (getSaldo() * taxaOperacao));
        mostrar(resultado);
        return 0.0;

    }
    public void mostrar( Double resultado){
        System.out.println("Saldo atualizado: "+ resultado);
    }
    public Double depositar(){
        Double resultado = getSaldo() + getValor() - (getSaldo() * taxaOperacao);
        mostrar(resultado);
        return 0.0;
    }

}
