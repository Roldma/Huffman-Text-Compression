
package huffmantree.nodes;

public class Node {
    
    private int value;
    private char c;
    
    Node left;
    Node right;
    
    public Node () {
        value = 0;
    }
    
    public int getValue() {
        return value;
    }
    
    public void increment() {
        value += 1;
    }
    
}
