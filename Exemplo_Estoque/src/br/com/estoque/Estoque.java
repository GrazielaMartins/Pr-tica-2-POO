package br.com.estoque;

import com.sun.deploy.security.SelectableSecurityManager;

public class Estoque {
    private int codProtuto;
    private String nome;
    private int qtdAtual;
    private int qtdminima;

    public Estoque() {
    }

    public Estoque(int codProtuto, String nome, int qtdAtual, int qtdminima) {
        this.codProtuto = codProtuto;
        this.nome = nome;
        this.qtdAtual = qtdAtual;
        this.qtdminima = qtdminima;
    }

    public void setCodProtuto(int codProtuto) {
        this.codProtuto = codProtuto;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setQtdAtual(int qtdAtual) {
        this.qtdAtual = qtdAtual;
    }

    public void setQtdminima(int qtdminima) {
        this.qtdminima = qtdminima;
    }

    public int getCodProtuto() {
        return codProtuto;
    }

    public String getNome() {
        return nome;
    }

    public int getQtdAtual() {
        return qtdAtual;
    }

    public int getQtdminima() {
        return qtdminima;
    }
    public void darBaixa(int qtd){
        qtdAtual  = qtdAtual - qtd;

        if (qtdAtual<=qtdAtual)
            qtdAtual = qtdAtual - qtd;
            else
            System.out.println(" Estoque insuficiente pra dar baixa ");
        }
        public String mostra() {
            return " Produto: " + this.nome + "\nQtde Minima: " + this.qtdminima + "\nQtde Atual";
        }

        public boolean precisaRepor(){
          if (getQtdAtual()<=getQtdminima())
              return true;
          else
              return false;
            }

    }

