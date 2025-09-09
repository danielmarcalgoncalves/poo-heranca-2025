package app;


import java.time.LocalDate;
public class pessoaFisica extends Pessoa {

    private LocalDate dataCriacao;
    private LocalDate dataNascimento;
    private String cpf;


    public pessoaFisica(String nome, String endereco, LocalDate dataCriacao, LocalDate dataNascimento, String cpf){
        Super(nome,endereco);
        this.dataCriacao = dataCriacao;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
    }

    public LocalDate getDataNascimento(){
        return dataNascimento;
    }


    public void setDataNascimento(LocalDate dataNascimento){
        this.dataNascimento = dataNascimento;
    }


    public String getCpf(){
        return cpf;
    }


    public void setCpf(String cpf){
        this.cpf = cpf;
    }


    public String exibirinformações() {
        return "Nome:" + nome + " endereço:" + endereco + " data de Nascimento:" + dataNascimento + " CPF:" + cpf + " Data criacao:" + dataCriacao;
    }


}