class Main{
  public static void main(String[] args){
    final double taxa = 0.0825;
    double valorProduto1 = 2.95;
    double valorProduto2 = 3.5;

    System.out.println("O valor do produto 1 é " + valorProduto1 + " e o valor do produto 2 é " + valorProduto2);

    double total = valorProduto1 + valorProduto2;

    double taxaFinal = total * taxa;

    System.out.println("A taxa da compra e de " + taxaFinal);

    double novoPreco = (valorProduto1+taxaFinal)+(valorProduto2+taxaFinal);

    boolean iscaro = novoPreco > 10;

    System.out.println("Fica muito caro = " + iscaro);
  }
}