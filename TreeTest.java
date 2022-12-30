import java.util.ArrayList;
public class TreeTest{
    Tree.Node<Integer> rootNode = new Tree.Node<Integer>();
    Tree<Integer> testTree1 = new Tree<Integer>(5);
    ArrayList<Tree.Node<Integer>> childrenNodes = new ArrayList<>();
    Tree.Node<Integer> child1 = new Tree.Node<Integer>();
    Tree.Node<Integer> child2 = new Tree.Node<Integer>();

    child1.data = 1;
    child2.data = 6;
    childrenNodes.add(child1);
    childrenNodes.add(child2);
    childrenNodes = rootData.children;
}