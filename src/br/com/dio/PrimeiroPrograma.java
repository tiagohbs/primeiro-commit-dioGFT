package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {
    public static void main(String[] args) {
        Gato gato = new Gato();

        System.out.println(gato);
        System.out.println(gato);

        Livro livro = new Livro("O problema dos 3 corpos",300);
        System.out.println(livro);
        //int a = 5;
        //int b = 3;
        //System.out.println("Hello, World " + (a+b));
    }
static class Livro{
        private String nome;
        private Integer nPag;

    public Livro(String nome, Integer nPag) {
        this.nome = nome;
        this.nPag = nPag;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getnPag() {
        return nPag;
    }

    public void setnPag(Integer nPag) {
        this.nPag = nPag;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", nPag=" + nPag +
                '}';
    }
}
}
