package january2017.problem1;


public class ArrayQueueImpl {

	private int[] arr = new int[10];
	private int front = -1;
	private int rear = 0;
	private int size =0;
	
	public int peek() {

		if(isEmpty()) {

			return -1;
		}
		else {
			return arr[front];
		}
	}
	
	public void enqueue(int obj){

		if (isFull()) {
			resize();
		}

		arr[rear]=obj;

		if(isEmpty()){
			front++;
		}
		else{
			rear = (rear + 1 ) % arr.length;
		}
		size++;
	}
	
	public int dequeue() {
		if(isEmpty()) {
			return -1;
		}
		int x = arr[front];
		front = (front + 1) % arr.length;
		size--;
		return x;
		//implement
	}
	
	public boolean isEmpty(){	

		return (front==-1);
	}
	
	public int size(){

		return size;
	}

	private void resize() {
		System.out.println("Resizing ... ");
		int[] temp = new int[arr.length * 2];
		System.arraycopy(arr, 0, temp, 0, arr.length);
		arr = temp;
	}

	public boolean isFull() {

		return (size == arr.length);
	}
	
}
