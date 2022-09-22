import java.util.Scanner;

public class Algoritmos {
	
	public int fibonacci(int n){
	    return n<2 ? 1 : fibonacci(n-1) + fibonacci(n-2);
	}
	  
	  public int somatorio(int n){
	    int resultado=0;
	    for(int i=1; i<=n; i++){
	      resultado+=i;
	    }
	    return resultado;
	  }
	  
	  public String ehPrimo(int n){
	    
	    for(int i=n-1; i>1;i--){
	      if(n%i==0){
	        return "Não primo";
	      }
	    }
	    return "Primo";    
	  }
	  
	  public int maximoDivisor(int a, int b){
	    int mdc=0;
	    
	    if(a<b){
	      int aux = a;
	      a = b;
	      b = aux;
	    }
	    
	    for(int i=1; i<a; i++){
	      if(a%i==0 && b%i==0){
	        mdc = i;
	      }
	    }
	    
	    return mdc;
	  }
	  
	  public int contagem() {
		  int qtd=0;
		  Scanner ler = new Scanner(System.in);
		  
		  System.out.println("Digite a quantidade de termos: ");
		  int n = ler.nextInt();
		  
		  for(int i=0; i<n; i++) {
			  System.out.println("Digite o termo " + i);
			  Float temp = ler.nextFloat();
			  if(!(temp - temp.intValue() == 0)) {
				  qtd++;
			  }
		  }
		  
		  return qtd;
	  }
	  
	  public void quickSort(int[] vetor, int inicio, int fim) {
		    if(fim > inicio) {
		      int indexPivo = dividir(vetor, inicio, fim);
		      quickSort(vetor, inicio, indexPivo - 1);
		      quickSort(vetor, indexPivo + 1, fim);
		    }
		  }
	  
	  
	  public int dividir(int[] vetor, int inicio, int fim) {
		  int pivo, pontEsq, pontDir = fim;
		  pontEsq = inicio + 1;
		  pivo = vetor[inicio];

		  while(pontEsq <= pontDir) {
		    while(pontEsq <= pontDir && vetor[pontEsq] <= pivo) {
		        pontEsq++;
		    }
		      while(pontDir >= pontEsq && vetor[pontDir] > pivo) {
		        pontDir--;
		      }

		      if(pontEsq < pontDir) {
		        trocar(vetor, pontDir, pontEsq);
		        pontEsq++;
		        pontDir--;
		      }
		    }
		    
		    trocar(vetor, inicio, pontDir);
		    return pontDir;
	  }  
	  
	  public void trocar(int[] vetor, int i, int j) {
		    int temp = vetor[i];
		    vetor[i] = vetor[j];
		    vetor[j] = temp;
	  }

}