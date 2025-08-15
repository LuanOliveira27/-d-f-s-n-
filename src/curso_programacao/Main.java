package curso_programacao;

import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		int y = 12; 
		System.out.println(y);
		//(int) SIGNIFICA NUMERO INTEIRO
		
		String nome= "Maria";
		int idade= 31;
		double renda= 4000;
		
		double x = 42.6754452;
		System.out.println(x);
		//(double) SIGNIFICA NUMERO COM CASAS DECIMAIS
		
		
		Locale.setDefault(Locale.US);
		//SERVE PARA COLOCAR  FORMA A SER ESCRITA, EX:SUBTITUIÇÃO DA VIRGULA PELO PONTO EM NUMERO COM CASAS DECIMAIS
		//LEMRRE-SE ((((((COLOCAR O COMANDO "import java.util.Locale;" NO TOPO DO COMANDO PARA IMPORTAR A CLASSE PARA O JAVA
		
		
		System.out.printf("%.2f%n",x);
		//(printf) SIGNIFICA FORMATADO
		//(%.2f) O NUMERO SIGNIFICA A QUANTIDADE DE CASAS QUE EU QUERO 
		//(%n) SIGINIFICA QUEBRA DE LINHA
		
		
		System.out.println("RESULTADO = " + x +  " METROS");
		// COLOCAR MAIS INFORMAÇÕES É ( System.out.println ("RESULTADO = + "O X, QUE É A INFORMAÇÃO QUE QUEREMOS COLOCAR"+ A INFORMAÇÃO "METROS"
		
		
		
		
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
		
		
		
		
		//%f = ponto flutuante  
		//%d = inteiro INT
		//%s = texto   STRING 
		//%n = quebra de linha
		
        
	}

}
