package Caso1;

public class TServidor extends Thread{

	private Buff buff;

	public TServidor(Buff buff){
		this.buff = buff;
	}

	public void run(){
		while(true){
			Mensaje actual = buff.recibirMensaje();
//			System.out.println("el mensaje recibido fue: " + actual.getMensaje());
			//no se que hacer aca XD 
			actual.responder();
		}
	}
}
