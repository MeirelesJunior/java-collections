package Map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone){
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome){
        if(!agendaContatoMap.isEmpty()){
            agendaContatoMap.remove(nome);

        }
    }

    public void exibirContato(){
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome){
        Integer numeroPorNome = null;
        if (!agendaContatoMap.isEmpty()){
            numeroPorNome = agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }


    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Jorge", 2345678);
        agendaContatos.adicionarContato("Jorge", 2345678);
        agendaContatos.adicionarContato("Julio", 8765432);
        agendaContatos.adicionarContato("Lucas", 777777);
        agendaContatos.adicionarContato("Eduardo", 467913);

        agendaContatos.exibirContato();

        agendaContatos.removerContato("Jorge");
        agendaContatos.exibirContato();
        System.out.println("O número é: " + agendaContatos.pesquisarPorNome("Julio"));
    }
}
