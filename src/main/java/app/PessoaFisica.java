package app;


import java.time.LocalDate;
public class pessoaFisica{
    private String nome;
    private String endereco;
    private LocalDate dataCriacao;
    private LocalDate dataNascimento;
    private String cpf;


    public pessoaFisica(String nome, String endereco, LocalDate dataCriacao, LocalDate dataNascimento, String cpf){
        this.nome = nome;
        this.endereco = endereco;
        this.dataCriacao = dataCriacao;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
    }


    public String getNome(){
        return nome;
    }


    public void setNome(String nome){
        this.nome = nome;
    }


    public String getEndereco(){
        return endereco;
    }


    public void setEndereco(String endereco){
        this.endereco = endereco;
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


    public LocalDate getdataCriacao(){
        return dataCriacao;
    }


    public void setDataCriacao(LocalDate dataCriacao){
        this.dataCriacao = dataCriacao;
    }
