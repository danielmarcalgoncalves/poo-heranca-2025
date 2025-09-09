  package app;


import java.time.LocalDate;
public class pessoaJuridica extends Pessoa{
    private String nomeFantasia;
    private String cnpj;


  public pessoaJuridica(String nome, String endereco, LocalDate dataCriacao, String nomeFantasia, String cnpj){
        Super(nome,endereco);
        this.nomeFantasia = nomeFantasia;
        this.cnpj = cnpj;
    
   
    public String getNomeFantasia(){
        return nomeFantasia;
    }


    public void setNomeFantasia(String nomeFantasia){
        this.nomeFantasia = nomeFantasia;
    }


    public String getcnpj(){
        return cnpj;
    }


    public void setCnpj(String cnpj){
        this.cnpj = cnpj;
    }


    public String exibirinformações() {
        return "Nome:" + nome + " endereço:" + endereco + " NOME FANTASIA:" + nomeFantasia + " CNPJ:" + cnpj;
    }
  }
}