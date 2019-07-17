## Binary Tree: Search

Binary Search Tree, is a node-based binary tree data structure which has the following properties:
* The left subtree of a node contains only nodes with keys lesser than the node’s key.
* The right subtree of a node contains only nodes with keys greater than the node’s key.
* The left and right subtree each must also be a binary search tree.
There must be no duplicate nodes.

```
        8
      /   \
     3     10
    / \      \
   1   6      14
      / \    /
     4   7  13
```

Search a given value in Binary Search Tree :
- return the node with the value if found
- return *null* if the value does not exists

The class TreeNode is available for you:
``` java
class TreeNode {
    private int value;
    private TreeNode left;
    private TreeNode right;
    // ...
}
```