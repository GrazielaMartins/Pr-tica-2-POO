package br.com.estoque;

public class MainEstoque {
    public static void main(String[]args){
        Estoque e1 = new Estoque();
        e1.setNome(" Carro");
        e1.setQtdAtual(8);
        e1.setQtdminima(5);
        System.out.println(e1.mostra());

        Estoque e2 = new Estoque();
        e2.setNome(" Sapato");
        e2.setQtdAtual(25);
        e2.setQtdminima(10);
        System.out.println(e1.mostra());

    }
}
