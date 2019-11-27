import java.util.*;
import java.util.LinkedList;
import java.util.Random;

public class TimeChecker {
	
	static Random rand = new Random();
	static double start, end, exeTime, timeAl = 0.0, timeBST = 0.0, timeLL = 0.0;
	static int v = 10;
	static ArrayList<Integer> myArray = new ArrayList<>();
	static LinkedList<Integer> myLinked = new LinkedList<>();
	static BST211 myTree = new BST211();

	public static void methodAdd() {
		// Arraylist
		start = System.currentTimeMillis();
		myArray.add(v);
		end = System.currentTimeMillis();
		exeTime = (end - start) / 1000;
		timeAl = timeAl + exeTime;

		// LinkedList
		start = System.currentTimeMillis();
		myLinked.add(v);
		end = System.currentTimeMillis();
		exeTime = (end - start) / 1000;
		timeLL = timeLL + exeTime;

		// Binary Search Tree
		start = System.currentTimeMillis();
		myTree.insert(v);
		end = System.currentTimeMillis();
		exeTime = (end - start) / 1000;
		timeBST = timeBST + exeTime;

	}

	public static void methodRemove() {

		// Arraylist
		start = System.currentTimeMillis();
		myArray.remove(v);
		end = System.currentTimeMillis();
		exeTime = (end - start) / 1000;
		timeAl = timeAl + exeTime;

		// LinkedList
		start = System.currentTimeMillis();
		myLinked.remove(v);
		end = System.currentTimeMillis();
		exeTime = (end - start) / 1000;
		timeLL = timeLL + exeTime;

		// Binary Search Tree
		start = System.currentTimeMillis();
		myTree.delete(v);
		end = System.currentTimeMillis();
		exeTime = (end - start) / 1000;
		timeBST = timeBST + exeTime;
	}

	public static void methodSearch() {
		// Arraylist
		start = System.currentTimeMillis();
		myArray.get(v);
		end = System.currentTimeMillis();
		exeTime = (end - start) / 1000;
		timeAl = timeAl + exeTime;

		// LinkedList
		start = System.currentTimeMillis();
		myLinked.get(v);
		end = System.currentTimeMillis();
		exeTime = (end - start) / 1000;
		timeLL = timeLL + exeTime;

		// Binary Search Tree
		start = System.currentTimeMillis();
		myTree.search(v);
		end = System.currentTimeMillis();
		exeTime = (end - start) / 1000;
		timeBST = timeBST + exeTime;
	}

	public static void TimeProcessor() {

		for (int i = 0; i < 1000000; i++) {
			int j = rand.nextInt(10);
			if (j == 0) {
				methodAdd();
			} else if (j > 0 && j < 3) {
				methodRemove();
			} else {
				methodSearch();
			}
		}
	}

	public static void TotalTime() {
		for (int i = 0; i <= 1000000; i++) {
			myArray.add(10);
			myLinked.add(10);
			myTree.insert(10);
		}
	}

	public static void main(String args[]) {
		TotalTime();
		TimeProcessor();
		System.out.println("ArrayList time: " + timeAl);
		System.out.println("Linkedlist time: " + timeLL);
		System.out.println("Binary search tree time: " + timeBST);
	}

}
