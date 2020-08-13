import javax.management.RuntimeErrorException;

public class Acelerar implements Estado {

	@Override
	public String getEstado() {
		
		return "Acelerar";
	}

	@Override
	public Estado acelerar() {
		
		throw new RuntimeErrorException(null, "Carro está em movimento");
	}

	@Override
	public Estado parar() {
		return new Parado();
	}

	@Override
	public Estado desligar() {
		throw new RuntimeErrorException(null, "Não dá, Carro está em movimento");
	}

}


