        }

        return prevVal;
    }

    private static int countNodes(Node root) {
        int count = 0;
        Node curr = root;
        while (curr != null) {
            if (curr.left == null) {
                count++;
                curr = curr.right;
            } else {
                Node pred = curr.left;
                while (pred.right != null && pred.right != curr) {
                    pred = pred.right;
                }
                if (pred.right == null) {
                    pred.right = curr;
                    curr = curr.left;
                } else {
                    pred.right = null;
                    count++;
                    curr = curr.right;
                }
            }
        }
        return count;
    }
}