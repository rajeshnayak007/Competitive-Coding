        if (root == null) {
            return;
        }
        arrayToBST(root.left, inorder, index);
        root.data = inorder.get(index[0]++);
        arrayToBST(root.right, inorder, index);
    }

    Node binaryTreeToBST(Node root) {
        if (root == null) {
            return null;
        }

        java.util.List<Integer> inorder = new java.util.ArrayList<>();
        getInorder(root, inorder);

        java.util.Collections.sort(inorder);

        int[] index = {0};
        arrayToBST(root, inorder, index);

        return root;
    }
}