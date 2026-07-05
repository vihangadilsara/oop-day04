class Student{
	private String id;	
	private String name;	
	private int prfMarks;
	private int dbmsMarks;
	
	Student(){
		
	}
	Student(String id, String name, int prfMarks, int dbmsMarks){
		this.id=id;
		this.name=name;
		this.prfMarks=prfMarks;
		this.dbmsMarks=dbmsMarks;
	}
	public String getId(){
		return id;
	}
	public boolean equals(Student student){
		return id.equalsIgnoreCase(student.id);
	}
	public String toString(){
		return "["+id+","+name+","+prfMarks+","+dbmsMarks+"]";
	}
}
class StudentList{ //Collection of student objects
	private Student[] studentArray;
	private int nextIndex;
	private double loadFact;
	private int initSize;
	
	StudentList(int initSize, double loadFact){
		studentArray=new Student[initSize];
		nextIndex=0;
		this.loadFact=loadFact;
		this.initSize=initSize;
	}
	private void extendsArray(){
		Student tempStudentArray[]=new Student[studentArray.length+(int)(loadFact*studentArray.length)];
		for (int i = 0; i < studentArray.length; i++){
			tempStudentArray[i]=studentArray[i];
		}
		studentArray=tempStudentArray; 
	}
	private boolean isFull(){
		return nextIndex>=studentArray.length;
	}



	public void add(Student student){ //Insertion order
		if(isFull()){
			extendsArray();
		}
		studentArray[nextIndex++]=student;
	}
	public void add(int index,Student student){
		if(isFull()){
			extendsArray();
		}
		if(index>=0 && index<=nextIndex){
			for (int i = nextIndex-1; i >=index; i--){
				studentArray[i+1]=studentArray[i];
			}
			studentArray[index]=student;
			nextIndex++;
		}
	}
	public void addFirst(Student student){
		add(0,student);
	}
	public void addLast(Student student){
		add(nextIndex,student);
	}
	public void trimToSize(){
		Student[] tempStudentArray=new Student[size()];
		for (int i = 0; i < studentArray.length; i++){
			tempStudentArray[i]=studentArray[i];
		}
		studentArray=tempStudentArray;
	}
	public int size(){
		return nextIndex;
	}

	public void clear(){
		studentArray=new Student[initSize];
		nextIndex=0;
	}
	public void remove(int index){
		if(!isEmpty()){
			if(index>=0 && index<nextIndex){
				for(int i=index; i<nextIndex-1; i++){
					studentArray[i]=studentArray[i+1];
				}
			}	
			nextIndex--;
		}
	}
	public void removeFirst(){
		remove(0);
	}

	public void removeLast(){
		remove(size()-1);
	}
	public int search(Student student){
		for (int i = 0; i < nextIndex; i++){
			if(student.equals(studentArray[i])){
				return i;
			}
		}
		return -1;
	}
	public void display(){
		System.out.print("{");
		for (int i = 0; i < nextIndex; i++){
			System.out.print(studentArray[i].toString()+", ");
		}
		System.out.println(isEmpty()? "empty]":"\b\b}");
	}
	public void display(int start){
		
	}
	public void display(int startIndex, int endIndex){
		
	}
	public Student get(int index){
		return null;
	}
	public Student getFirst(){
		return null;
	}
	public Student getLast(){
		return null;
	}
	public boolean isEmpty(){
		return nextIndex<=0;
	}
	public int capacity(){
		return studentArray.length;
	}
}
class Demo{
	public static void main(String args[]){
		StudentList stList=new StudentList(12,0.25);
		stList.add(new Student("S0001","Nimal",65,67));
		stList.add(new Student("S0002","Amal",85,70));
		stList.add(new Student("S0003","Bimal",35,30));
		stList.add(new Student("S0004","Ramal",55,70));
		stList.add(new Student("S0005","Anil",95,90));
		stList.display(); //{[S0001,Nimal,65,76], [S0002","Amal",85,70]...}
		
		System.out.println("Index of S003-Bimal : "+stList.search(new Student("S0003","Bimal",35,30))); //2
	}
}
