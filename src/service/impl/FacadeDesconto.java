package service.impl;

import entities.Cartao;
import entities.Produto;
import service.IFacadeDesconto;

public class FacadeDesconto implements IFacadeDesconto {

    private ApiCartao apiCartao;
    private ApiProduto apiProduto;
    private ApiQuantidade apiQuantidade;

    public FacadeDesconto(){
        apiCartao = new ApiCartao();
        apiProduto = new ApiProduto();
        apiQuantidade = new ApiQuantidade();

    }
    @Override
    public int desconto(Cartao cartao, Produto produto, int quantidade) {

        int desconto = 0;
        desconto += apiCartao.desconto(cartao);
        desconto += apiProduto.desconto(produto);
        desconto += apiQuantidade.desconto(quantidade);

        return desconto;
    }
}
