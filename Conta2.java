package Atividade4;

public class Conta2 {
	
	public int agencia;
	public int conta;
	public String titular;
	public double saldo;
	
	static int totalConta300 = 5000;
	
	static int totalConta123  = 1000;

	public Conta2(int agencia, String titular) {
		
		this.agencia = agencia;
		this.titular = titular; 
		
		if(agencia == 300) {
			
			System.out.println("Voc� acaba de criar uma conta para: " + titular);
			System.out.println("Ag�ncia: " + agencia);
			System.out.println("Conta: " + totalConta300);
			
		}else{
			
			System.out.println("Essa conta n�o existe!");
			
		}
		
		if(agencia == 123) {
			
			System.out.println("Voc� acaba de criar uma conta para: " + titular);
			System.out.println("Ag�ncia: " + agencia);
			System.out.println("Conta: " + totalConta123);
			
		}
		
		this.conta = totalConta123 + 1;
		this.totalConta123++;
		this.conta = totalConta300 + 1;
		this.totalConta300++;
		
	}
}
