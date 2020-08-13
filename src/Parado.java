import javax.management.RuntimeErrorException;

public class Parado implements Estado {

	@Override
	public String getEstado() {
		
		return "Parado";
	}

	@Override
	public Estado acelerar() {
		
		return new Acelerar();
	}

	@Override
	public Estado parar() {
		throw new RuntimeErrorException(null, "Carro está Parado");
	}

	@Override
	public Estado desligar() {
		
		return (Estado) new Desligar();
	}


}
