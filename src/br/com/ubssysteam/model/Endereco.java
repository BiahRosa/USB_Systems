package br.com.ubssysteam.model;

public class Endereco {
    private String logadouro;
    private int numero;
    private String complemento;
    private String cep;
    private String cidade;
    private String estado;

    public Endereco() {}

    public Endereco (String logadouro, int numero, String complemento, String cep, String cidade, String estado) {
        this.logadouro = logadouro;
        this.numero = numero;
        this.complemento = complemento;
        this.cep = cep;
        this.cidade = cidade;
        this.estado = estado;
    }

    public String getLogadouro() {
        return logadouro;
    }

    public void setLogadouro(String logadouro) {
        this.logadouro = logadouro;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getEnderecoCompleto() {
        return this.logadouro + "," + this.numero + "," + this.complemento + "," + this.cep + "," + this.cidade + "," + this.estado;
    }
}
