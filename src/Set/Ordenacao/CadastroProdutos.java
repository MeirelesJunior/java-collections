package Set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {

    private Set<Produto> produtoSet;

    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(long cod, String nome, double preco, int quantidade){
        produtoSet.add(new Produto(nome, cod, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome(){
        Set<Produto> produtosPorNome =new TreeSet<>(produtoSet);
        return  produtosPorNome;
    }

    public Set<Produto> exibirPordutosPorPreco(){
        Set<Produto> produtosPorPreco = new TreeSet<>( new ComparatorPorPreco());
        produtosPorPreco.addAll(produtoSet);
        return  produtosPorPreco;

        }

    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();

        cadastroProdutos.adicionarProduto(1l,"Produto7",15d,6);
        cadastroProdutos.adicionarProduto(7l,"Produto25",21d,11);
        cadastroProdutos.adicionarProduto(1l,"Produto3",8d,20);
        cadastroProdutos.adicionarProduto(12l,"Produto4",5d,21);

        System.out.println(cadastroProdutos.produtoSet);

        System.out.println(cadastroProdutos.exibirProdutosPorNome());
        System.out.println(cadastroProdutos.exibirPordutosPorPreco());
    }

}


