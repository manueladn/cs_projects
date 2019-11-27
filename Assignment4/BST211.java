// Manuela Dorado Novoa
// june 17, 2019
// CS211, Prof. Kim Taesik
//Assignment 4-5

class BST211 {
	int key;
	BST211 left, right;

	public BST211(int item) {
		key = item;
		left = right = null;
	}

	BST211 root;

	BST211() {          
		root = null;     
		} // search an element

	void search(int key) {
		root = searchRec(root, key);

		// for your test
		if (root != null) {
			System.out.println("found: " + key);
		} else
			System.out.println("NOT found: " + key);
	}

	BST211 searchRec(BST211 root, int key) {

		// root is null or key is present at root
		if (root == null || root.key == key)
			return root;

		// value is greater than root's key
		if (root.key > key)
			return searchRec(root.left, key);

		// value is less than root's key
		return searchRec(root.right, key);
	}

	// insert
	void insert(int key) {
		root = insertRec(root, key);

		// for your test
		if (root != null) {
			System.out.println("saved: " + key);
		}
	}

	// A recursive function to insert a new key
	BST211 insertRec(BST211 root, int key) {

		// If the tree is empty, return a new node
		if (root == null) {
			root = new BST211(key);
			return root;
		}
		/* Otherwise, recur down the tree */
		if (key < root.key)
			root.left = insertRec(root.left, key);
		else if (key > root.key)
			root.right = insertRec(root.right, key);

		// return the unchanged node pointer
		return root;
	}

// delete

	void delete(int key) {
		root = deleteRec(root, key);
		// for your test
		if (root == null) {
			System.out.println("deleted:" + key);
		}
	}

	BST211 deleteRec(BST211 root, int key) {
// If the tree is empty
		if (root == null)
			return root;
		// Otherwise, recursive down the tree
		if (key < root.key)
			root.left = deleteRec(root.left, key);
		else if (key > root.key)
			root.right = deleteRec(root.right, key);
		// if key is same as root's key, then This is the node to be deleted
		else {
// node with only one child or no child
			if (root.left == null)
				return root.right;
			else if (root.right == null)
				return root.left;
			// node with two children: Get the smallest in the right subtree
			root.key = minValue(root.right);
			// Delete
			root.right = deleteRec(root.right, root.key);
		}
		return root;
	}

	int minValue(BST211 root) {
		int minv = root.key;
		while (root.left != null) {
			minv = root.left.key;
			root = root.left;
		}
		return minv;
	}
}