/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hecto
 */
public class BinarySearchTree {
    private Node root;
    
    public BinarySearchTree(){
        root = null;
    }
    
    public Node insertAsoc(Node root, Association key){
        if (root == null){
            root = new Node(key);
            return root;
        }
        if (key.getEnglish().substring(0, 1).compareTo(root.getKey().getEnglish().substring(0, 1))<0){
            root.setLeft(insertAsoc(root.getLeft(), key));
        }else if (key.getEnglish().substring(0, 1).compareTo(root.getKey().getEnglish().substring(0, 1))>0)
            root.setRight(insertAsoc(root.getRight(), key));
        return root;
    }
    
    public void insert(Association key){
        root = insertAsoc(root,key);
    }
    
    public void inOrderRec(Node root){
        if(root != null){
            inOrderRec(root.getLeft());
            System.out.println(root.getKey().getEnglish()+" "+root.getKey().getSpanish());
            inOrderRec(root.getRight());
        }
    }
    
    public void inOrder(){
        inOrderRec(root);
    }
    
    public Node buscar(Node root,String key){
        Node r = null;
        if (root == null || root.getKey().getEnglish().compareTo(key)==0){
            return root;
        }
        
        if (root.getLeft() != null){
            r = buscar(root.getLeft(), key);
        }
        
        if (r == null)
            r = buscar(root.getRight(), key);
        
        return r;
    }
    
    public Node buscarEsp(Node root,String key){
        Node r = null;
        if (root == null || root.getKey().getSpanish().compareTo(key)==0){
            return root;
        }
        
        if (root.getLeft() != null){
            r = buscar(root.getLeft(), key);
        }
        
        if (r == null)
            r = buscar(root.getRight(), key);
        
        return r;
    }
    
    public Node buscari(String key){
        return buscar(root, key);
    }
    
     public Node buscare(String key){
        return buscar(root, key);
    }
}
