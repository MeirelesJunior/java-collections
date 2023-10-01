package Map.Ordenacao;

import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {

    private Map<LocalDate, Evento> eventoMap;

    public AgendaEventos() {
        this.eventoMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao) {

        eventoMap.put(data, new Evento(nome, atracao));
    }

    public void exibirAgenda() {
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventoMap);
        System.out.println(eventosTreeMap);
    }

    public void obterProximoEvento() {
        LocalDate dataAtual = LocalDate.now();
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventoMap);
        for (Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()) {
            if (entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
                System.out.println("O proximo evento: " + entry.getValue() + " acontecerá na data " + entry.getKey());
                break;
            }
        }
    }

    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();
        agendaEventos.adicionarEvento(LocalDate.of(2023, Month.JULY, 12), "Evento1", "Atração1");
        agendaEventos.adicionarEvento(LocalDate.of(2023, Month.AUGUST, 3), "Evento2", "Atração2");
        agendaEventos.adicionarEvento(LocalDate.of(2023, Month.OCTOBER, 31), "Evento3", "Atração3");
        agendaEventos.adicionarEvento(LocalDate.of(2023, Month.APRIL, 7), "Evento4", "Atração8");
        agendaEventos.adicionarEvento(LocalDate.of(2023, Month.OCTOBER, 1), "Evento5", "Atração 5");

        agendaEventos.exibirAgenda();

        agendaEventos.obterProximoEvento();
    }
}
