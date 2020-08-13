
public class Main {
	
	public static void main (String[] args){
		Carro carro = new Carro();
		carro.Acelerar();
		System.out.println(carro.getEstado());
		carro.Parar();
		System.out.println(carro.getEstado());
		carro.desligar();
		System.out.println(carro.getEstado());
		
	}

}


