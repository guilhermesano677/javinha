public class ContaPoupança extends ContaBancaria{
    public Double JurosMensais;
            public ContaPoupança(Double saldo, Double valor, Double jurosMensais){
                super(saldo,valor);
                this.JurosMensais =jurosMensais;

            }
            public Double sacar(){
                Double resultado = getSaldo() - (getValor() - (getSaldo() * JurosMensais));
                mostrar(resultado);
                return 0.0;
            }

            public void mostrar( Double resultado) {
                System.out.println("Saldo atualizado: " + resultado);
            }
            public Double depositar(){
             Double resultado = getSaldo() + (getValor() + (getSaldo() * JurosMensais));
             mostrar(resultado);
             return 0.0;

            }



}

