public class ContaBancaria {
    private Double saldo;
    private Double valor;


    public ContaBancaria(Double saldo, Double valor ){
        this.saldo =saldo;
        this.valor = valor;


    }

    public Double getSaldo() {
        return saldo;
    }
    public Double depositar(){
        return valor;
    }
    public Double sacar(){
        return valor;
    }

    public Double getValor() {
        return valor;
    }
}



