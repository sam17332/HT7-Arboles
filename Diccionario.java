
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hecto
 */
public class Diccionario {
    
    private Association[] palabras = new Association[11];
    private BinarySearchTree tree = new BinarySearchTree();
    
    public Diccionario(){
        String[] palabrasSeparadas;
        int i = 0;

	//se separan las palabras
    File diccionario = new File(System.getProperty("user.dir")+"\\"+"diccionario.txt");
    try{
        
    FileReader leer = new FileReader(diccionario);
    BufferedReader buff = new BufferedReader(leer);
    String linea;
    while((linea = buff.readLine()) != null)
    {
   		palabrasSeparadas = linea.split(",");
                palabras[i] = new Association(palabrasSeparadas[0],palabrasSeparadas[1]);
                i++;
    }
    for (int j = 0; j< 11; j++){
            tree.insert(palabras[j]);
        }
    }catch(IOException e){
        
    }
    }
    
    public String traducir(String linea){
        String respuesta = "";
        String[] palabrasSeparadas = linea.split(" ");
        for (int i = 0; i< palabrasSeparadas.length; i++){
            if (tree.buscari(palabrasSeparadas[i]) == null && tree.buscare(palabrasSeparadas[i]) == null){
                respuesta = respuesta + "*"+palabrasSeparadas[i]+"*" + " ";
            }else if (tree.buscare(palabrasSeparadas[i]) != null && palabrasSeparadas[i].compareTo(tree.buscare(palabrasSeparadas[i]).getKey().getSpanish())==0){
                respuesta = respuesta+palabrasSeparadas[i] + " ";
            }else{
                respuesta = respuesta+ tree.buscari(palabrasSeparadas[i]).getKey().getSpanish()+ " ";
            }
        }
        return respuesta;
    }
    
    public void mostrarInorder(){
        tree.inOrder();
    }
    
}
