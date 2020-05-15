package pro1;

import java.util.Locale;
import java.util.Scanner;

public class exercicio {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
	
	int com,atra,svo=0,sin=0,sfo=0,fin;
	double tic,vol;
	char pag;
	
	System.out.printf("SISTEMA DE PERFIL DE CLIENTE%n--------------------------------%nINFORME OS DADOS DO ÚLTIMO ANO%n%n");
	
	
	System.out.printf("Quantas compras o cliente fez no último ano?%n");
	com = sc.nextInt();
	
	System.out.printf("Qual o ticket médio?%n");
	tic = sc.nextDouble();
	
	System.out.printf("Quantas vezes o cliente atrasou o pagamento?%n");
	atra = sc.nextInt();
	
	System.out.printf("A maioria das compras foi em dinheiro, cartão, ou boleto (D/C/B)?%n");
	pag = sc.next().charAt(0);
	
	vol=com*tic;
	
	if(com==0) {
		svo=0;
	}
	
	else if(vol>0 && vol <=3000 && com>2) {
		svo+=40;
	}
	
	else if(vol>0 && vol <=3000 && com<2) {
		svo+=20;
		
	}
	
	else if(vol>3000) {
		svo+=60;
		
	}
	
	if(atra>1 || com==0) {
		sin=0;
	}
	else if(com>0 && atra==1) {
		sin+=15;
	}
	else if(com>0 && atra==0) {
		sin+=30;
	}
	
	
	
	if(com>0 && pag=='D') {
		sfo+=5;
	}
	else if(com>0 && (pag=='C' || pag=='B') ){
		sfo+=10;
		
	}
	
	System.out.printf("Score do volume de compras = %d pontos%n", svo);
	
	System.out.printf("Score de inadimplência = %d pontos%n", sin);
	
	System.out.printf("Score e forma de pagamento = %d pontos%n", sfo);
	

	fin=sin+svo+sfo;
	
	if(fin>=0 && fin<=25) {
		System.out.println("Classificação final = CLIENTE BRONZE");
	}
	if(fin>25 && fin<=75) {
		System.out.println("Classificação final = CLIENTE PRATA");
	}
	if(fin>75) {
		System.out.println("Classificação final = CLIENTE OURO");
	}

	sc.close();
	}
}
