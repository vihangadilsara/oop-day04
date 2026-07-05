class Stack{
	private int[] dataArray;
	
	Stack(){
		dataArray=new int[0];
	}
	private void extendsArray(){
		int[] tempDataArray=new int[dataArray.length+1];
		for (int i = 0; i < dataArray.length; i++){
			tempDataArray[i]=dataArray[i];
		}
		dataArray=tempDataArray;
	}
	public void push(int data){
		extendsArray();
		dataArray[dataArray.length-1]=data;	
	}
	public void pop(){
		
	}
	public int search(int data){
		return -1;
	}
	public void display(){
		System.out.print("[");
		for(int i=dataArray.length-1; i>=0; i--){
			System.out.print(dataArray[i]+", ");		
		}
		System.out.println(isEmpty()? "empty":"\b\b]");
	}
	public boolean isEmpty(){
		return dataArray.length<=0;
	}
}
class Demo{
	public static void main(String args[]){
		Stack s1=new Stack();
		s1.push(10);
		s1.push(20);
		s1.push(30);
		s1.push(40);
		s1.push(50);
		s1.display(); //[50,40,30,20,10]
		
		s1.pop();
		s1.display(); //[40,30,20,10]
	}
}
