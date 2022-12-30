import java.util.ArrayList;

public class Tree<T> {
    private Node<T> root;

    public Tree(T rootData) {
        root = new Node<T>();
        root.data = rootData;
        root.children = new ArrayList<Node<T>>();
    }

    public static class Node<T> {
        private T data;
        private Node<T> parent;
        private ArrayList<Node<T>> children;
    }

    public void iterAll(){
        recurseIter(this.root);
    } 
    private void recurseIter(Node<T> node){
        System.out.println(node.data);
        for(Node<T> child:node.children){
            recurseIter(child);
        }
    }
}