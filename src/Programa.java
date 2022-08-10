import entities.Cartao;
import entities.Produto;
import service.impl.FacadeDesconto;

public class Programa {
    public static void main(String[] args) {
        FacadeDesconto facadeDesconto = new FacadeDesconto();
        Cartao cartao = new Cartao("123456", "Banco DH");
        Produto produto = new Produto("Lasanha", "Lata");

        int descontoTotal = facadeDesconto.desconto(cartao, produto, 15);
        System.out.println("Desconto concedido: "+ descontoTotal+ "%.");
    }
}
