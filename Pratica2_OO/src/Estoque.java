public class Estoque {
    private String nome;
    private int qtdAtual, qtdMinima;

    public Estoque() {

    }

    public Estoque(String nome, int qtdAtual, int qtdMinima) {
        nome = nome;
        this.qtdAtual = qtdAtual;
        this.qtdMinima = qtdMinima;
    }

        public void setNome(String nome) {
        this.nome=nome;

        }
        public String getNome(){
        return nome;
        }
        public void setqtdAtual(int qtdAtual){
        this.qtdAtual=qtdAtual;

        }
        public int getQtdAtual(int qtdAtual) {
            return qtdAtual;
        }
        public void setQtdMinima(int qtdMinima){
        this.qtdMinima=qtdMinima;
        }
        public int getQtdMinima(){
        return qtdMinima;
        }
        public void darBaixa(int qtde){
        int novaQuantidade=this.qtdAtual-qtde;

        if (novaQuantidade>=0){
            this.qtdAtual=novaQuantidade;

        }
        else {
            System.out.println(" Não é possivel dar baixa no estoque");
        }
    }
        public String mostra(){
        return "Nome: " +this.nome + "\nQuantidade minima:" + this.qtdMinima + "\nQuantidade atual: " + this.qtdAtual;
        }
        public boolean precisaRepor(){
        return this.qtdAtual<=this.qtdMinima;
        }
        public static void main(String[]args){
        Estoque estoque = new Estoque(" Arroz ",8, 3);

            System.out.println(estoque.mostra());
            estoque.darBaixa(1);

            System.out.println(estoque.mostra());
            System.out.println (" Quer repor? " + estoque.precisaRepor());

        }

}
