package br.com.ubssysteam.model;

public class Vendedor extends Funcionario{
    public double vendasSemestrais;

    public Vendedor() { super(); }

    public Vendedor(String nome, String cpf, Endereco endereco, double salarioFixo, double vendasSemestrais) {
        super(nome, cpf, endereco, salarioFixo);
        this.vendasSemestrais = vendasSemestrais;
    }

    public double getVendasSemestrais() {
        return vendasSemestrais;
    }

    public void setVendasSemestrais(double vendasSemestrais) {
        this.vendasSemestrais = vendasSemestrais;
    }

    @Override
    public double getBonus() {
        return this.getVendasSemestrais() * 0.015;
    }

    @Override
    public String getDetalhamento() {
        return "Nome: " + this.getNome() +
                "Endereco: " + this.getEndereco().getEnderecoCompleto() +
                "Salario mensal: R$" + this.getSalarioFixo() +
                "Vendas no semestre: R$" + this.getVendasSemestrais() +
                "Bônus semestral: " + this.getBonus();
    }
}
