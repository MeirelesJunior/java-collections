package Set;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {

    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados(){
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite){
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite){
        Convidado convidadoParaRemover = null;
        for (Convidado c: convidadoSet) {
            if (c.getCodigoConvite() == codigoConvite){
                convidadoParaRemover = c;
                break;
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }

    public  int contarConvidados(){
        return  convidadoSet.size();
    }

    public void exibirConvidados(){
        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " dentro do Set de convidados");

        conjuntoConvidados.adicionarConvidado("Jorge", 3377);
        conjuntoConvidados.adicionarConvidado("Julio", 7733);
        conjuntoConvidados.adicionarConvidado("Lucas", 2349);
        conjuntoConvidados.adicionarConvidado("Eduardo", 7786);
        conjuntoConvidados.adicionarConvidado("Ana", 1313);

        conjuntoConvidados.exibirConvidados();

        conjuntoConvidados.removerConvidadoPorCodigoConvite(1313);

        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " dentro do Set de convidados");

        conjuntoConvidados.exibirConvidados();


    }

}
