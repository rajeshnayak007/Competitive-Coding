    {
        data = d;
        left = right = null;
    }
}*/

class Solution {
    public boolean isBalanced(Node root) {
        // code here
            return checkHeight(root) != -1;
        }

        private int checkHeight(Node node) {
            if (node == null) {
                return 0;
            }

            int leftHeight = checkHeight(node.left);
            if (leftHeight == -1) return -1;

            int rightHeight = checkHeight(node.right);
            if (rightHeight == -1) return -1;

            if (Math.abs(leftHeight - rightHeight) > 1) {
                return -1;
            }

            return 1 + Math.max(leftHeight, rightHeight);
    }
}