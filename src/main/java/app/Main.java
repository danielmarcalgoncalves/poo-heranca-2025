package app;


import java.time.LocalDate;
import java.time.Month;


public class Main{
    public static void main(String[] args){
        /*System.out.println("Leite");
        Tarefa[] tarefas = new Tarefa[5];
        Compromisso[] compromissos = new Compromisso[5];


        tarefas[0] = new Tarefa(0, "teste", false);
        compromissos[2] = new Compromisso(0, "compromisso", "hoje", "Amanha");
       


        System.out.println(tarefas[0].getDescricao());*/


        pessoaFisica pf = new pessoaFisica("Macos", "Rua sem cu, 0" , LocalDate.of(1943,Month.MARCH, 11),LocalDate.of(1234, Month.APRIL, 12), "123123123123");


        pessoaJuridica pj = new pessoaJuridica("COCA", "Casa do capeta 231", LocalDate.of(3290, Month.AUGUST, 12), "COLA COCA", "18293714412");
       
        System.out.println(pf.exibirinformações());
        System.out.println(pj.exibirinformações());
    }
}

