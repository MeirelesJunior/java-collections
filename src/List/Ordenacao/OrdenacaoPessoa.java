package List.Ordenacao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {

    private List<Pessoa> pessoaList;

    public OrdenacaoPessoa() {
        this.pessoaList = new ArrayList<>();
    }

    public  void adicionarPessoa(String nome, int idade, double altura){
        pessoaList.add(new Pessoa(nome,idade,altura));
    }

    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    public List<Pessoa> ordenarPorAltura(){
       List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
       Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
       return  pessoasPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();

        ordenacaoPessoa.adicionarPessoa("Jorge", 36, 1.80);
        ordenacaoPessoa.adicionarPessoa("Julio", 7, 1.35);
        ordenacaoPessoa.adicionarPessoa("Eduardo", 33, 1.96);
        ordenacaoPessoa.adicionarPessoa("Lucas", 29, 1.90);
        ordenacaoPessoa.adicionarPessoa("Ana", 25, 1.30);
        ordenacaoPessoa.adicionarPessoa("Luis", 30, 1.67);

        System.out.println(ordenacaoPessoa.pessoaList);
        //System.out.println(ordenacaoPessoa.ordenarPorIdade());
        //System.out.println(ordenacaoPessoa.ordenarPorAltura());
    }
}
