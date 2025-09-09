  public pessoaJuridica(String nome, String endereco, LocalDate dataCriacao, String nomeFantasia, String cnpj){
        this.nome = nome;
        this.endereco = endereco;
        this.nomeFantasia = nomeFantasia;
        this.cnpj = cnpj;
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


    public LocalDate getdataCriacao(){
        return dataCriacao;
    }


    public void setdataCriacao(LocalDate dataCriacao){
        this.dataCriacao = dataCriacao;
    }
}
