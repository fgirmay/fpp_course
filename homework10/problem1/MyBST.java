package problem1;

/**
 * Created by fissehaye on 6/14/18.
 */
public class MyBST {

    BinaryNode root;

    public void preOrder(){
        preOrder(root);
    }

    private void preOrder(BinaryNode t){
        //implement
    }

     private class BinaryNode {

         private BinaryNode left;
         private BinaryNode right;
         private Object item;

         private BinaryNode(BinaryNode left, BinaryNode right, Object item){
             this.left = left;
             this.right = right;
             this.item = item;
         }
     }
}
