// Below program explains the concept of thread synchronization in java

class Display{
	public  synchronized void wish(String name){
		for(int i=0;i<5;i++){
			System.out.print("Good Morning :");
		
		try{
			Thread.sleep(2000);
			System.out.println(name);
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}

		}
	}
}
class MyThread extends Thread {
	Display d;
	String name;
	MyThread(Display d,String name){
		this.d=d;
		this.name=name;
	}
	public void run(){
		d.wish(name);

	}
}
class SynchronizedDemo{
	public static void main(String[] args){
		Display d = new Display();
		
		MyThread t1 = new MyThread(d,"Dhoni");
		MyThread t2 = new MyThread(d,"Virat");

		t1.start();
		t2.start();
	}
}