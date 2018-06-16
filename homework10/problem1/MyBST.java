package problem1;

/**
 * Created by fissehaye on 6/14/18.
 */
public class MyBST {

    BinaryNode root;

    public void insert(Integer item) {

        if (root == null) {
            root = new BinaryNode(null, null, item);
            return;
        }

    }

    private void insert(BinaryNode left, BinaryNode right, Integer item) {

        if (item < left.item) {

            if (left.left == null) {
                BinaryNode nbn = new BinaryNode(null, null, item);
                left.left = nbn;
            } else {


            }


        } else if (item > right.item && right.item == null) {
            BinaryNode nbn = new BinaryNode(null, null, item);
            right.right = nbn;
        } else {

        }
    }

    public void preOrder(){

        preOrder(root);
    }
    private void preOrder(BinaryNode t){
        //implement
    }
    public void postOrder() {
        preOrder(root);
    }

    private void postOrder(BinaryNode t){
        //implement
    }

    public boolean contains(Integer key){
        //implement
        return false;
    }

    public Integer getRoot(){
        //implement
        return 0;
    }

    public Integer leafNodes(){
        return leafNodes(root);
    }

    private int leafNodes(BinaryNode t){
        //Implement
        return 0;
    }


    public int size(){
        //implement
        return 0;
    }

    public boolean isEmpty(){
        //implement
        // check the tree is empty or not
        return false;
    }

    public Integer findMin(){
        return findMin(root);
    }

    private Integer findMin(BinaryNode root){
        //implement
        return 0;
    }

    public Integer findMax(){

        return findMax(root);

    }

    public Integer findMax(BinaryNode root){
        //implement
        return 0;
    }

     private class BinaryNode {

         private BinaryNode left;
         private BinaryNode right;
         private Integer item;

         private BinaryNode(BinaryNode left, BinaryNode right, Integer item){
             this.left = left;
             this.right = right;
             this.item = item;
         }
     }
}
