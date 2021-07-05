class BMExercio03{
  public static void main(String[] args){
    final double taxa = 0.0825;
    double valor_produto1 = 2.95;
    double valor_produto2 = 3.5;

    System.out.println("O valor do produto 1 é " + valor_produto1 + " e o valor do produto 2 é " + valor_produto2);

    double total = valor_produto1 + valor_produto2;

    double taxa_calculada = total * taxa;

    System.out.println("A taxa da compra e de " + taxa_calculada);

    double novoCusto = (valor_produto1+taxa_calculada)+(valor_produto2+taxa_calculada);

    boolean muitoCaro = novoCusto > 10;

    System.out.println("Ficou muito caro = " + muitoCaro);
  }
}