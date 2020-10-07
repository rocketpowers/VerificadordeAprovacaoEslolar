import java.util.Scanner;

public class VerificadordeAprovacao{
	public static void main(String [] args ) {

	Scanner tec = new Scanner (System.in);
	 System.out.println("OLA BEM VINDO AO SISTEMA AUTOMATIZADO DE VERIFICAÇÃO DE APROVAÇÃO ESCOLAR");
	 System.out.println("POR FAVOR INSIRA A SUA PRIMEIRA NOTA !");
	  float n1 =tec.nextFloat();
	  System.out.println("AGORA INSIRA A SUA SEGUNDA NOTA !");
	   float n2=tec.nextFloat();
	   System.out.println("POR ULTIMO, INSIRA SUA TERCEIRA NOTA !");
	    float n3=tec.nextFloat();
	     float m = (n1+n2+n3)/3;
	     System.out.println("RESULTADO DA MEDIA " + m);
	      if (m>7.5) {
	    	System.out.println("PARABENS,VOCE ESTA APROVADO");
	      }  else {
	    	  System.out.println("INFELISMENTE VOCE ESTA REPROVADO");	 
	    	  
	    	  
	   	  
   }
  }	
 }

