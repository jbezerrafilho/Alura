package com.alura.modelo;

public class Compra implements Comparable<Compra> {
    private String descricao;
    private double valor;

    public Compra(String descricao, double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "Compra: " + descricao +
                ", valor: " + valor;
    }

    @Override
    public int compareTo(Compra outroValor) {
        return Double.valueOf(this.valor).compareTo(outroValor.getValor());
    }
}