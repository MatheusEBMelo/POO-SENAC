package aula04_exercicio;

public class Televisor {
	private int volume = 0;
        private int canal = 1;
        private boolean ligado = false;

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    
	
    public void aumentarVolume(){
        if(this.ligado == true){
            if(this.volume < 10){
                this.volume = this.volume + 1;
            }else {System.out.println("O volume já se encontra no máximo");}
        }
    }
    
    public void reduzirVolume(){
       if(this.ligado == true){
            if(this.volume > 0){
                 this.volume = this.volume - 1;
            }else {System.out.println("O volume já se encontra no mínimo");}
       }
       
    }
    
    public void subirCanal(){
        if(this.ligado == true){
            if(this.canal < 16){
                this.canal = this.canal + 1;
            }else {System.out.println("O canal já se encontra no máximo");}
        }
        
    }
    
    public void descerCanal(){
       if(this.ligado == true){
           if(this.canal > 1){
                this.canal = this.canal - 1;
           }else {System.out.println("O canal já se encontra no mínimo");}
       }
       
    }
    
    public void ligarTelevisor(){
        setLigado(true);
    }
    
    public void desligarTelevisor(){
        setLigado(false);
        setCanal(1);
        setVolume(0);
    }
    
    public void mostraStatus(){
        System.out.println("Volume: " + getVolume());
                System.out.println("Canal: " + getCanal());
                System.out.println("Ligado: " + isLigado());
    }
    


}
