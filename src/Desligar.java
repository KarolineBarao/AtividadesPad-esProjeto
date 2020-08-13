import javax.management.RuntimeErrorException;

public class Desligar implements Estado {

	@Override
	public String getEstado() {
		
		return "Desligar";
	}

	@Override
	public Estado acelerar() {
		throw new RuntimeErrorException(null, "Não dá, Carro está desligado");
		
	}

	@Override
	public Estado parar() {
		throw new RuntimeErrorException(null, "Não dá, O carro já está parado");
	}

	@Override
	public Estado desligar() {
		throw new RuntimeErrorException(null, "Não dá, Carro já esta desligado");
	}



}
