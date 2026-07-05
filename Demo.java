class Stack{
	private int[] dataArray;
	private int nextIndex;
	Stack(int size){
		dataArray=new int[size];
		nextIndex=0;
	}
	private void extendsArray(){
	
	}
	private boolean isFull(){
		return nextIndex>=dataArray.length;
	}
	public void push(int data){
		if(isFull()){
			extendsArray();
		}
		dataArray[nextIndex++]=data;
	}
	public void pop(){
		if(!isEmpty()){
			nextIndex--;
		}
	}
	public int search(int data){
		//Insert code here
		return -1;
	}
	public void display(){
		System.out.print("[");
		for (int i =nextIndex-1; i>=0 ; i--){
			System.out.print(dataArray[i]+", ");
		}
		System.out.println(isEmpty()? "empty]":"\b\b]");
	}
	public boolean isEmpty(){
		return nextIndex<=0;
	}
}
class Demo{
	public static void main(String args[]){
		Stack s1=new Stack(100);
		s1.push(10);
		s1.push(20);
		s1.push(30);
		s1.push(40);
		s1.push(50);
		s1.display(); //[50,40,30,20,10]
		s1.pop();
		s1.display(); //[40,30,20,10]
		
		System.out.println("Index of 40 : "+s1.search(40));	//-1

	}
}
