
public class Carro {
	private Estado estado;
	
	public Carro(){
		this.estado = new Ligar();
	}
    public void Acelerar() {
        this.estado = estado.acelerar();
    }

    public void Parar(){
        this.estado = estado.parar();
    }

    public void desligar(){
        this.estado = estado.desligar();
    }

    public String getEstado() {
        return estado.getEstado();
    }


}

