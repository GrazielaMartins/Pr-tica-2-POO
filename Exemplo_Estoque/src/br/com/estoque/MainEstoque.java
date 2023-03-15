package br.com.estoque;

public class MainEstoque {
    public static void main(String[]args){
        Estoque e1 = new Estoque();
        e1.setNome(" Carro");
        e1.setQtdAtual(8);
        e1.setQtdminima(5);
        System.out.println(e1.mostra());

        Estoque e2 = new Estoque(1, "Caderno", 20,1);
        e2.darBaixa(10);
        System.out.println(" Estoque Atual: " + e2.getQtdAtual());
        e2.darBaixa(1000);
        System.out.println(e2.precisaRepor());

    }
}
