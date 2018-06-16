package problem1;

/**
 * Created by fissehaye on 6/14/18.
 */
public class MyBST {

    BinaryNode root;


    public void preOrder() {

        preOrder(root);
    }

    private void preOrder(BinaryNode node) {

        if (node != null) {

            System.out.print(node.item + " ");
            preOrder(node.left);
            preOrder(node.right);
        }
    }


    public void postOrder() {

        postOrder(root);
    }

    private void postOrder(BinaryNode node) {

        if (node != null) {

            postOrder(node.left);
            postOrder(node.right);
            System.out.print(node.item + " ");
        }
    }

    public boolean contains(Integer key) {

        return contains(root, key);
    }

    private boolean contains(BinaryNode node, Integer key) {

        boolean found = false;

        while ((node != null) && !found) {

            int rval = node.item;

            if (key < rval) {

                node = node.left;

            } else if (key > rval) {

                node = node.right;

            } else {

                found = true;
                break;
            }

            found = contains(node, key);
        }

        return found;
    }

    public Integer getRoot() {

        if (root != null) {

            return root.item;
        }

        return Integer.MIN_VALUE;
    }

    public Integer leafNodes() {

        return leafNodes(root);
    }

    private Integer leafNodes(BinaryNode node) {

        if(node == null) {

            return 0;

        } else {

            if (node.left == null && node.right == null) {
                return 1;

            } else {

                return leafNodes(node.left) + leafNodes(node.right);
            }
        }
    }

    public int size() {

        return size(root);
    }

    private int size(BinaryNode node) {

        if (node == null) {

            return 0;

        } else {

            int size = 1;
            size += size(node.left);
            size += size(node.right);
            return size;
        }
    }

    public boolean isEmpty(){

        return root == null;
    }

    public Integer findMin(){
        
        return findMin(root);
    }

    public Integer findMin(BinaryNode node) {

        if (node == null) {

            return Integer.MAX_VALUE;
        }

        int min = node.item;
        int leftMin = findMin(node.left);
        int rightMin = findMin(node.right);

        if (leftMin < min) {

            min = leftMin;
        }

        if (rightMin < min) {

            min = rightMin;
        }

        return min;
    }


    public Integer findMax(){

        return findMax(root);

    }

    public Integer findMax(BinaryNode node) {

        if (node == null) {
            return Integer.MIN_VALUE;
        }

        int max = node.item;
        int leftMax = findMax(node.left);
        int rightMax = findMax(node.right);

        if (leftMax > max) {
            max = leftMax;
        }

        if (rightMax > max) {
            max = rightMax;
        }

        return max;
    }

    public void insert(Integer key) {

        root = insert(root, key);
    }

    private BinaryNode insert(BinaryNode root, Integer key) {

        /* If the tree is empty, return a new node */
        if (root == null) {

            root = new BinaryNode(null, null, key);
            return root;
        }

        /* Otherwise, recur down the tree */
        if (key < root.item) {

            root.left = insert(root.left, key);

        } else if (key > root.item) {

            root.right = insert(root.right, key);
        }

        return root;
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
