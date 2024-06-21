package OperacoesBasicas;

import java.util.Objects;

public class Convidado {
    // atributos
    private String Nome;
    private int codigoConvite;

    public Convidado(String nome, int codigoConvite) {
        Nome = nome;
        this.codigoConvite = codigoConvite;
    }

    public String getNome() {
        return Nome;
    }

    public int getCodigoConvite() {
        return codigoConvite;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Convidado convidado = (Convidado) o;
        return codigoConvite == convidado.codigoConvite;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(codigoConvite);
    }

    @Override
    public String toString() {
        return "Convidado{" +
                "Nome=" + Nome +
                ", codigoConvite=" + codigoConvite +
                '}';
    }
}
