package Ordenacao;

import java.util.Comparator;
import java.util.Objects;

public class Produto implements Comparable<Produto> {
    // atributos
    private long produto;

    private String nome;

    private double preco;

    private int quantidade;

    public Produto(long produto, String nome, double preco, int quantidade) {
        this.produto = produto;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }


    public int compareTo(Produto p) {
        return nome.compareToIgnoreCase(p.getNome());
    }


    public long getProduto() {
        return produto;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco(){
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto1 = (Produto) o;
        return produto == produto1.produto;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(produto);
    }

    @Override
    public String toString() {
        return "Produto{" +
                "produto=" + produto +
                ", nome='" + nome + '\'' +
                ", preco="+ preco +
                ", quantidade=" + quantidade +
                '}';
    }
}
 class ComparatorPorPreco implements Comparator<Produto>{


     @Override
     public int compare(Produto p1, Produto p2) {
         return Double.compare(p1.getPreco(),p2.getPreco());
 }

}