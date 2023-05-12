/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula06LicaoDeCasa;

/**
 *
 * @author STADS
 */
public class MetodosLiterais {
    
    public String retornarReferenciaBibliografica(String nomeAutor) {
        String resultado = "";
        String nomeQuebrado[] = nomeAutor.split(" ");
        for(int i = 1; i<nomeQuebrado.length;i++){
            if(i != nomeQuebrado.length - 1 ){
            resultado = resultado + nomeQuebrado[i]+" ";
            }else{resultado = resultado + nomeQuebrado[i]+", "+nomeQuebrado[0];}
         }
     
        return resultado;
    }
   
    public int contarPalavra(String frase, String palavra) {
    int contador = 0;
    int posicao = frase.indexOf(palavra); 
    while (posicao != -1) {
        contador++; 
        posicao = frase.indexOf(palavra, posicao + 1); 
        
    }
    
    return contador;
}

    


}
