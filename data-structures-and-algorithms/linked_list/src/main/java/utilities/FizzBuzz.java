package utilities;


import linked_list.Tree;
import linked_list.TNode;

public class FizzBuzz {

    public static Tree fizzBuzz(Tree tree) {
        fizzBuzzHelper(tree.root);
        return tree;
    }
        public static void fizzBuzzHelper(TNode current){
            if(current == null){
                return;
            }
           if((int)current.value % 3 == 0 && (int)current.value % 5 == 0){
               current.value = "fizzbuzz";
           }
           else if((int)current.value % 3 == 0){
               current.value = "fizz";
           }
           else if((int) current.value % 5 == 0){
               current.value = "buzz";
           }
           fizzBuzzHelper(current.left);
           fizzBuzzHelper(current.right);
    }
}
