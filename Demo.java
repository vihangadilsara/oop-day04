class Stack{
	private int[] dataArray;
	
	Stack(){
		dataArray=new int[0];
	}
	private void extendsArray(){
		int[] tempDataArray=new int[dataArray.length+1];
		for (int i = 0; i < dataArray.length; i++){
			tempDataArray[i+1]=dataArray[i];
		}
		dataArray=tempDataArray;
	}
	public void push(int data){
		extendsArray();
		dataArray[0]=data;	
	}
	public void pop(){
		if(!isEmpty()){
			int[] tempDataArray=new int[dataArray.length-1];
			for (int i = 0; i < tempDataArray.length; i++){
				tempDataArray[i]=dataArray[i+1];
			}
			dataArray=tempDataArray;	
		}
	}
	public int search(int data){
		for(int i=0; i<dataArray.length; i++){
			if(dataArray[i]==data){
				return i;
			}
		}
		return -1;
	}
	public void display(){
		System.out.print("[");
		for(int i=0; i<dataArray.length;i++){
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
		
		System.out.println("Index of 40 : "+s1.search(40));	//1

	}
}
