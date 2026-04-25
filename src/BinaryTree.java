import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTree {


    static class Node{
        int val;
        Node left;
        Node right;

        Node(int val){
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }
    // Node newNode = new Node(7);    null   7    null


    // root  -> left  -> right
    public static void preOrderTraversal(Node root){

        if(root == null){
            return;
        }

        System.out.print (root.val + " ");
        //fvf/
        //sdv/
        //fvfd
        //dfv
        //fdvfd
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }
    // TC = O(n)
    // SC = O(h)

    // left -> root -> right
    public static void InOrderTraversal(Node root){

        if(root == null){
            return;
        }

        InOrderTraversal(root.left);
        System.out.print (root.val + " ");
        InOrderTraversal(root.right);
    }

    // left -> right -> root
    public static void PostOrderTraversal(Node root){

        if(root == null){
            return;
        }

        PostOrderTraversal(root.left);
        PostOrderTraversal(root.right);
        System.out.print (root.val + " ");
    }

//    public static void preOrderTraversal(Node root){
//
//        if(root == null){
//            return;
//        }
//
//        System.out.print (root.val + " ");
//
//        Node temp = root;
//        //while(temp!=null)
//    }

    //1  2  4 5  3  6

    public static int heightOfTree(Node root){

        if(root == null){
            return 0;
        }

        int leftHeight = heightOfTree(root.left);
        int rightHeight = heightOfTree(root.right);

        return 1 + Math.max(leftHeight,rightHeight);
    }

    public static void LevelOrderTraversal(Node root){
        Queue<Node> queue = new LinkedList<>();

        queue.add(root);// from where traversal will start

        while(!queue.isEmpty()){
            Node node = queue.peek();
            System.out.print(node.val + " ");

            if(node.left !=null){
                queue.add(node.left);
            }

            if(node.right !=null){
                queue.add(node.right);
            }

            queue.remove();
        }
    }

    public static List<List<Integer>> LevelOrderTraversalNew(Node root){
        Queue<Node> queue = new LinkedList<>();
        List<List<Integer>> result = new ArrayList<>();
        queue.add(root);// from where traversal will start

        while(!queue.isEmpty()){

            int size = queue.size();// keep track of the level.
            List<Integer> level = new ArrayList<>();

            for(int i=1;i<=size;i++){
                Node node = queue.peek();
                level.add(node.val);
                if(node.left !=null){
                    queue.add(node.left);
                }

                if(node.right !=null){
                    queue.add(node.right);
                }
                queue.remove();
            }

            result.add(level);

        }

        return result;
    }

    // 1 2 3 4 5 6 7


    //

    //       1
    //  2         3
    //4    5    6    null
 // 7
   //n  n n  n  n n


    // Q - diamaeter of binary tree
    // longest path between any 2 nodes - root may not be the part
    //   1
    // 2    3   = 3
 //  4


    // 1
    //2
    //3
    //4

    // 4-2-1-3

    // diameter = left height + right height - hint

    // -100        100

    public static boolean IsValidBST(Node root){
        return validate(root,Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public static boolean validate(Node node , int min, int max){

        if(node==null){
            return true;
        }

        if(!(node.val <= max && node.val >= min)){
            return false;
        }
        return validate(node.left, min ,node.val )  && validate(node.right, node.val ,max);
    }

// -100 +100
    // -100 5

    //  3    5
    // true
    //       5
    //  3         8
    //1    4    6    null
    //-7

    //

    //      5

    // left     right


    public static void main(String[] args) {
        // create a binary tree

        //       5
        //  3         8
        //1    4    6    null
    //-7
    //   n  n n  n  n n

        // 1 2 3 4 5 6 7

        // add 7 as right child of 4


        Node root = new Node(5);
        root.left = new Node(3);
        root.right = new Node(8);

        root.left.left = new Node(1);
        root.left.right = new Node(4);
        root.right.left = new Node(6);

        root.left.left.left = new Node(-7);


        preOrderTraversal(root);
        System.out.println();

        InOrderTraversal(root);
        System.out.println();

        PostOrderTraversal(root);
        System.out.println();

        System.out.println(heightOfTree(root));

        LevelOrderTraversal(root);
        System.out.println();

        System.out.println(IsValidBST(root)); // true / false
     }
}
