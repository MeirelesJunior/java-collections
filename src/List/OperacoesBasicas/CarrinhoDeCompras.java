package List.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    //atributos

    private List<Item>  itemList;

    public  CarrinhoDeCompras(){
        this.itemList = new ArrayList<>();
    }

    public void adicionarItem(String nome,double preco, int quantidade){

        Item item= new Item(nome, preco, quantidade);
        this.itemList.add(item);
    }

    public void removerItem(String nome) {
        List<Item> itemParaRemover = new ArrayList<>();
        if (!itemList.isEmpty()) {
            for (Item i : itemList) {
                if (i.getNome().equalsIgnoreCase(nome)) {
                    itemParaRemover.add(i);
                }
            }
        itemList.removeAll(itemParaRemover);

        }else{
        System.out.println("A lista está vazia");
     }
    }

    public double calcularValorTotal(){
       double valorTotal = 0;
       if (!itemList.isEmpty()){
           for (Item item: itemList) {
               double valorItem = item.getPreco() * item.getQuantidade();
               valorTotal+= valorItem;
           }
           return valorTotal;
       }else {
           throw  new RuntimeException("A lista está vazia!");
       }
    }

    public void exibirItens(){
       if (!itemList.isEmpty()){
           System.out.println(this.itemList);
       }else {
           System.out.println("A lista está vazia");
       }
    }

    @Override
    public String toString() {
        return "CarrinhoDeCompras{" +
                "itemList=" + itemList +
                '}';
    }

    public static void main(String[] args) {

        CarrinhoDeCompras carrinhoDeCompras = new  CarrinhoDeCompras();

        //Adicionando Item
        carrinhoDeCompras.adicionarItem("pao",1.58,10);
        carrinhoDeCompras.adicionarItem("leite",2.58,12);
        carrinhoDeCompras.adicionarItem("ovos",1.10,12);
        carrinhoDeCompras.adicionarItem("queijo",5.58,5);

        //Exibindo item
        carrinhoDeCompras.exibirItens();

        //Removendo Item

        carrinhoDeCompras.removerItem("queijo");

        carrinhoDeCompras.exibirItens();

        //Calculando  e exibindo o valor total da compra
        System.out.println("O valor total da compra é: " + carrinhoDeCompras.calcularValorTotal());






    }
}
