package aula04;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Carro oCorcel = new Carro();
        oCorcel.setPlaca("cbh 0190");
        oCorcel.setNumChassi(1234567);
        oCorcel.setVelocidade(90);
        oCorcel.acelerar(70);

        oCorcel.imprimirCarro();
        
	}
}