class BMExercio04 {
  public static void main(String[] args){
    long long1 = 100;

    int int1 = 200;
    //int int2 = int1 + long1; Parte com erro
    int int2 = int1 + (int)long1;
    System.out.println(int2);
  }
}