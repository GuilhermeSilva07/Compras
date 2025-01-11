import java.util.ArrayList;
import java.util.List;

public class cartaoDeCredito {
    private double limite;
    private double saldo;
    private List<Compra> compras;    //Uma lista que armazena as informações de cada compra realizada com o cartão.


    //Construtor
    public cartaoDeCredito(double limite) {
        this.limite = limite;
        this.saldo = limite;
        this.compras = new ArrayList<>();    // Cria uma nova lista vazia para armazenar as compras.
    }

    // Metodo LancaCompra - implementa a lógica para registrar uma nova compra no cartão de crédito, verificando se há saldo suficiente e atualizando o saldo e o histórico de compras.
    public boolean lancaCompra(Compra compra)
    {
        if (this.saldo >= compra.getValor()){ // Se há saldo suficiente
            this.saldo -= compra.getValor();  // Decrementa o saldo
            this.compras.add(compra);         // Adiciona a compra à lista
            return true;                      // Retorna true indicando sucesso
        }
        return false; // Se não há saldo suficiente, retorna false indicando falha
    }

    //Getter - Retorna o valor atual da variavel

    public double getLimite() {
        return limite;
    }

    public double getSaldo() {
        return saldo;
    }

    public List<Compra> getCompras() {
        return compras;
    }
}