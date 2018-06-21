package january2017.problem1;

public class Main {

	public static void main(String[] args) {
		ArrayQueueImpl q = new ArrayQueueImpl();
		q.peek();

		for(int i = 0; i < 15; i ++) {
			q.enqueue(i);
		}

		for(int i = 0; i < 14; i ++)
			System.out.println(q.dequeue());
	}

}
