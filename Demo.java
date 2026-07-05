class Queue{
	private int[] dataArray;
	private int nextIndex;
	private double loadFact;
	private int initSize;
	
	Queue(int initSize, double loadFact){
		dataArray=new int[initSize];
		nextIndex=0;
		this.loadFact=loadFact;
		this.initSize=initSize;
	}
	private void extendsArray(){
		int tempDataArray[]=new int[dataArray.length+(int)(loadFact*dataArray.length)];
		for (int i = 0; i < dataArray.length; i++){
			tempDataArray[i]=dataArray[i];
		}
		dataArray=tempDataArray; 
	}
	private boolean isFull(){
		return nextIndex>=dataArray.length;
	}
	public int peek(){
		return isEmpty() ? -1: dataArray[nextIndex-1]; 
	}
	public int poll(){
		return isEmpty() ? -1:  dataArray[--nextIndex]; 
	}
	public void add(int data){
		if(isFull()){
			extendsArray();
		}
		dataArray[nextIndex++]=data;
	}
	public void trimToSize(){
		int[] tempDataArray=new int[size()];
		for (int i = 0; i < dataArray.length; i++){
			tempDataArray[i]=dataArray[i];
		}
		dataArray=tempDataArray;
	}
	public int size(){
		return nextIndex;
	}
	public void trim(){
		//
		//
	}
	public void clear(){
		dataArray=new int[initSize];
		nextIndex=0;
	}
	public void remove(){
		if(!isEmpty()){
			
		}
	}
	public int search(int data){
		//Insert code here
		return -1;
	}
	public void display(){
		System.out.print("[");
		
		System.out.println(isEmpty()? "empty]":"\b\b]");
	}
	public boolean isEmpty(){
		return nextIndex<=0;
	}
	public int capacity(){
		return dataArray.length;
	}
}
class Demo{
	public static void main(String args[]){
		Queue q1=new Queue(12,0.25);
		q1.add(10);
		q1.add(20);
		q1.add(30);
		q1.add(40);
		q1.add(50);
		q1.add(60);
		q1.add(70);
		q1.add(80);
		q1.add(90);
		q1.add(100);
		q1.add(110);
		q1.add(120);
		q1.display(); //[10,20,30,40,50 ........120]
		System.out.println("Size      : "+q1.size()); //12
		
		q1.remove();
		q1.display(); //[20,30,40,50 ........120]
		System.out.println("Size      : "+q1.size()); //11
		
		System.out.println("Index of 50 : "+q1.search(50)); //3
		
	}
}
