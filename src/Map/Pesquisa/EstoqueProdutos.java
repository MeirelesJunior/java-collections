package Map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {

    private Map<Long, Produto> estoqueProdutosMap;


    public EstoqueProdutos() {
        this.estoqueProdutosMap = new HashMap<>();
    }

    public void adicionarProduto(long cod, String name, double valor, int quantidade) {
        estoqueProdutosMap.put(cod, new Produto(name, valor, quantidade));
    }

    public void exibirProdutos() {
        System.out.println(estoqueProdutosMap);
    }

    public double calcularValorTotalEstoque() {
        double valorTotalEstoque = 0;
        if (!estoqueProdutosMap.isEmpty()) {
            for (Produto p : estoqueProdutosMap.values()) {
                valorTotalEstoque += p.getQuantidade() * p.getPreco();
            }
        }
        return valorTotalEstoque;

    }

    public Produto obterProdutodMaisCaro() {
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if (!estoqueProdutosMap.isEmpty()) {

            for (Produto p : estoqueProdutosMap.values()) {

                if (p.getPreco() > maiorPreco) {
                    produtoMaisCaro = p;
                }
            }

        }
        return produtoMaisCaro;
    }

    public static void main(String[] args) {
        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();

        estoqueProdutos.exibirProdutos();

        estoqueProdutos.adicionarProduto(1l,"Produto A", 10, 5);
        estoqueProdutos.adicionarProduto(2l,"Produto B", 15, 10);
        estoqueProdutos.adicionarProduto(3l,"Produto C", 20, 15);

        estoqueProdutos.exibirProdutos();

        System.out.println("Valor total de estoque " + estoqueProdutos.calcularValorTotalEstoque());
        System.out.println("O produtod mais caro é: " + estoqueProdutos.obterProdutodMaisCaro());
    }
}




