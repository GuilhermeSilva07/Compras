

//A classe Compra complementa a classe cartaoDeCredito, fornecendo um modelo para representar cada transação realizada com o cartão.
public class Compra implements  Comparable<Compra> {
    private String descricao;
    private double valor;

    //Construtor

    public Compra(String descricao, double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    //Getter - Retorna o valor atual da variavel

    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }

    //Sobrescreve o método toString() herdado da classe Object, fornecendo uma representação textual do objeto Compra.
    @Override
    public String toString() {
        return "Compra{ : descricao= " + descricao +  " valor = " + valor;
    }

    //Definindo o modo de ordenação por valor

    //Esse trecho de código define como dois objetos do tipo Compra devem ser comparados entre si. A comparação é feita com base no valor da compra.
    @Override
    public int compareTo(Compra outraCompra) {
        return Double.valueOf(this.valor).compareTo(Double.valueOf(outraCompra.valor));
    }
}
