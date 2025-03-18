package br.com.ubssysteam.model;

public class Gerente extends Funcionario {
    public int sala;
    public int ramal;
    public double faturamentoSemestral;

    public Gerente() { super(); }

    public Gerente(String nome, String cpf, Endereco endereco, double salarioFixo, int sala, int ramal, int faturamentoSemestral){
        super(nome, cpf, endereco, salarioFixo);
        this.sala = sala;
        this.ramal = ramal;
        this.faturamentoSemestral = faturamentoSemestral;
    }

    public int getSala() {
        return sala;
    }

    public void setSala(int sala) {
        this.sala = sala;
    }

    public int getRamal() {
        return ramal;
    }

    public void setRamal(int ramal) {
        this.ramal = ramal;
    }

    public double getFaturamentoSemestral() {
        return faturamentoSemestral;
    }

    public void setFaturamentoSemestral(double faturamentoSemestral) {
        this.faturamentoSemestral = faturamentoSemestral;
    }

    @Override
    public double getBonus() {
        return this.getFaturamentoSemestral() * 0.05;
    }

    @Override
    public String getDetalhamento() {
        return "Nome: " + this.getNome() +
                "Sala: " + this.getSala() +
                "Ramal: " + this.getRamal() +
                "Endereco: " + this.getEndereco() +
                "Salario mensal: R$" + this.getSalarioFixo() +
                "Bônus semestral: " +this.getBonus();
    }
}
