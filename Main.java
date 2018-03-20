
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hecto
 */
public class Main {
     public static void main(String[] args) {
        Diccionario m = new Diccionario();
        boolean x = true;
        Scanner sc = new Scanner(System.in);
        String respuesta = "";
        while(x){
            
            System.out.println("MENU");
            System.out.println("1. InOrder");
            System.out.println("2. Traducir texto");
            System.out.println("3. Salir");
            int ope =  sc.nextInt();
            if (ope == 1){
            m.mostrarInorder();
            ope = 0;
            }
            if (ope == 2){
                System.out.println("Traduccion");
                  File texto = new File(System.getProperty("user.dir")+"\\"+"texto.txt");
            try{
                  FileReader leer = new FileReader(texto);
                  BufferedReader buff = new BufferedReader(leer);
                  String linea;
                  while((linea = buff.readLine()) != null)
                  {
                      System.out.println("Original: "+linea);
                      System.out.println(m.traducir(linea));
                  }
            }catch(IOException e){
        
            }
                ope = 0;
                  }
            if (ope == 3){
                x = false;
                ope = 0;
                 }
            }
         //m.mostrarInorder();
         //System.out.println(m.traducir("the dog toma water adentro de su house"));
         /**
         BinarySearchTree tree = new BinarySearchTree();
         Association a1 = new Association("dog","perro");
         Association a2 = new Association("homework","tarea");
         Association a3 = new Association("house","casa");
         Association a4 = new Association("town","pueblo");
         Association a5 = new Association("woman","mujer");
         tree.insert(a1);
         tree.insert(a2);
         tree.insert(a3);
         tree.insert(a4);
         tree.insert(a5);
         tree.inOrder();
         * */
     }
}
