package aula04;

public class Carro {
    private String placa;
    private int numChassi;
private double velocidade;    

    public void setPlaca(String placa){
       this.placa = placa; 
    }
    
    public String getPlaca() {
        return placa;
    }
 
    public void setNumChassi(int numChassi) {
    	this.numChassi=numChassi;
    }
    
    public int getNumChassi() {
    	return numChassi;
    }
    
    public void setVelocidade(double velocidade) {
    	this.velocidade=velocidade;
    }
    
    public double getVelocidade() {
    	return velocidade;
    }
    
    public void imprimirCarro() {
    	System.out.println("placa: " + this.getPlaca());
    	System.out.println("numero chassi: " + this.getNumChassi());
    	System.out.println("velocidade: " + this.getVelocidade());    	
    }
    
    public void acelerar(double somaVelocidade) {
double newVelocidade= velocidade+somaVelocidade;
		    	if(newVelocidade>=0 && newVelocidade <=180) {
		    		setVelocidade(newVelocidade);
    		System.out.println("Velocidade atual " + getVelocidade());
    	} else {
    		System.out.println("velocidade deve ser maior que 0 e menor ou igual a 180");
    	}
    }
}