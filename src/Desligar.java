import javax.management.RuntimeErrorException;

public class Desligar implements Estado {

	@Override
	public String getEstado() {
		
		return "Desligar";
	}

	@Override
	public Estado acelerar() {
		throw new RuntimeErrorException(null, "N�o d�, Carro est� desligado");
		
	}

	@Override
	public Estado parar() {
		throw new RuntimeErrorException(null, "N�o d�, O carro j� est� parado");
	}

	@Override
	public Estado desligar() {
		throw new RuntimeErrorException(null, "N�o d�, Carro j� esta desligado");
	}



}
