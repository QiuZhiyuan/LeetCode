package other.test;

import java.util.Comparator;

public class RedBlackTree<T> {

    private class TreeNode {

        public final String key;

        public final T value;

        public TreeNode left;

        public TreeNode right;

        public TreeNode parent;

        public boolean isRed;

        private TreeNode(String key, T value) {
            this.key = key;
            this.value = value;
        }

        public TreeNode newValue(T value) {
            final TreeNode node = new TreeNode(key, value);
            node.left = left;
            node.right = right;
            node.parent = parent;
            node.isRed = isRed;
            return node;
        }
    }

    private TreeNode mRoot;
    private final Comparator<T> comparator;

    public RedBlackTree(Comparator<T> comparator) {
        super();
        this.comparator = comparator;
    }

    public static void main(String[] args) {
        final RedBlackTree<Integer> tree = new RedBlackTree<>(Comparator.comparingInt(integer -> integer));
        tree.add("a", 1);
        tree.add("b", 2);
        tree.add("c", 3);
        tree.add("d", 4);
    }

    public T query(String key) {
        return null;
    }

    public T delete(String key) {
        return null;
    }

    public TreeNode add(String key, T value) {
        mRoot = add(mRoot, key, value);
        return mRoot;
    }

    public TreeNode add(TreeNode node, String key, T value) {
        if (node == null) {
            node = new TreeNode(key, value);
        } else if (node.key.equals(key)) {
            node = node.newValue(value);
        } else if (comparator.compare(node.value, value) > 0) {
            node.left = add(node.left, key, value);
            node.left.parent = node;
        } else {
            node.right = add(node.right, key, value);
            node.right.parent = node;
        }
        colorNode(node);
        return node;
    }

    @Override
    public String toString() {
        // TODO Rewrite to string function
        return super.toString();
    }

    private void colorNode(TreeNode node) {
        if (node == null) {
            return;
        }
        if (node.parent == null) {
            node.isRed = false;
        } else if (!node.parent.isRed) {
            node.isRed = false;
        } else if (isUncleExistAndRed(node)) {
//            node
        }
    }

    private boolean isUncleExistAndRed(TreeNode node) {
        final TreeNode uncle = getUncle(node);
        return uncle != null && uncle.isRed;
    }

    private TreeNode getUncle(TreeNode node) {
        if (node == null) {
            return null;
        }
        final TreeNode parent = node.parent;
        if (parent == null) {
            return null;
        }
        final TreeNode grandparent = parent.parent;
        if (grandparent == null) {
            return null;
        }
        if (parent.equals(grandparent.left)) {
            return grandparent.right;
        }
        if (parent.equals(grandparent.right)) {
            return grandparent.left;
        }
        return null;
    }
}
