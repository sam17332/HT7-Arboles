/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hecto
 */
public class BinarySearchTree <E> {
    private Node root;
    
    public BinarySearchTree(){
        root = null;
    }
    
    public Node insertAsoc(Node root, E key){
        if (root == null){
            root = new Node(key);
            return root;
        }
        if (root.getLeft()==null){
            root.setLeft(insertAsoc(root.getLeft(), key));
        }else if (root.getRight()==null)
            root.setRight(insertAsoc(root.getRight(), key));
        return root;
    }
    
    public void inOrder(Node root){
        if(root != null){
            inOrder(root.getLeft());
            System.out.println(root.getKey());
            inOrder(root.getRight());
        }
    }
}
