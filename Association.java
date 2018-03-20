/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hecto
 */
public class Association <K, V>{
    private K english;
    private V spanish;
    public Association(K ingles, V espanol){
        english = ingles;
        spanish = espanol;
    }
    
    public K getEnglish(){
        return english;
    }
    
    public V getSpanish(){
        return spanish;
    }
}
