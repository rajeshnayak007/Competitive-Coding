            return result;
        }
        
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        
        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            
            for (int i = 0; i < levelSize; i++) {
                Node curr = queue.poll();
                
                // The first node of the current level
                if (i == 0) {
                    result.add(curr.data);
                }
                
                // Add left and right children to the queue
                if (curr.left != null) {
                    queue.add(curr.left);
                }
                if (curr.right != null) {
                    queue.add(curr.right);
                }
            }
        }
        
        return result;
    }
}