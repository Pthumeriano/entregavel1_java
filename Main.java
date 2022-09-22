import java.util.Random;

class Main {
  
  public static void main(String[] args) {
    Algoritmos x = new Algoritmos();
		
		System.out.println("Funções estão comentadas");
    
    //numero quebrado tem q ser com ponto .
    
    //RNG
    Random gerador = new Random();
    //criando vetor e preenchendo
    int vetor[] = new int[10];
    for(int i=0; i<vetor.length;i++){
      vetor[i] = gerador.nextInt(10);
    }
    
		
		//System.out.println(x.ehPrimo(9));
		//System.out.println(x.fibonacci(12));
		//System.out.println(x.contagem());
		//System.out.println(x.maximoDivisor(33, 42));
    
    System.out.print("Vetor: ");
    for(int i=0;i<10;i++){
      System.out.print(" " + vetor[i]);
    }
    
    System.out.println("");
		System.out.println("Soma: " + x.somatorio(vetor));

    
  }
}