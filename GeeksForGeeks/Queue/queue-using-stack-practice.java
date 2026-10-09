        }
    // Push item into s1
        s1.push(x);
    // Push everything back to s1
    while (!s2.isEmpty()) {
        s1.push(s2.pop());
        }
    }

    void dequeue() {
        // Implement dequeue operation
    if (!s1.isEmpty()) {
                s1.pop();
            }
    }

    int front() {
        // Implement front operation
    if (s1.isEmpty()) {
                return -1;
            }
            return s1.peek();
    }

    int size() {
        // Implement size operation
        return s1.size();
    }
}
