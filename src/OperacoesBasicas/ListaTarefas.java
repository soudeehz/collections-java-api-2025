package OperacoesBasicas;

import java.util.List;

public class ListaTarefas {
  // atributo
    private List<Tarefas> tarefasList;


    public ListaTarefas() {
      this.tarefasList = new Arraylist<>();
    }

    public void adicionarTarefa(String descricao) {

    tarefasList.add(new tarefa (descricao));


    }
    public void removerTarefa(String descricao){

    List<Tarefas> tarefasParaRemover = new Arraylist <>();
    for(tarefa t : tarefasList) {
    if (t.getDestricao().equalsIgnorecase(descricao));{
    tarefasParaRemover.add(t);

    }
    }

    tarefasList.removeAll(tarefasParaRemover);

    }
    public int obterNumeroTotalTarefas() {
    return tarefasList.size();

    }

    public void obterDescricoesTarefas() {

        System.out.println(tarefasList);
    }


  public static void main(String[] args) {
  ListaTarefas listaTarefa = new ListaTarefas();
    System.out.println("O numero total de elementos na lista é: " + ListaTarefas.obternumeroTotalTarefas());
  }
}
