import javax.management.RuntimeErrorException;

public class Ligar implements Estado {

	@Override
	public String getEstado() {
		
		return "ligado";
	}

	@Override
	public Estado acelerar() {
		
		return new Acelerar();
	}

	@Override
	public Estado parar() {
		
		throw new RuntimeErrorException(null, "Carro está parado");
	}

	@Override
	public Estado desligar() {
		
		return (Estado) new Desligar();
	}


}


