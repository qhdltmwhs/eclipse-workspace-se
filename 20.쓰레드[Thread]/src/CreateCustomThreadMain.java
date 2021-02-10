/*
쓰레드(thread)(실행흐름): 
   - 프로그램코드를 실행시키는 힘 
   - 메인쓰레드,AWT(GUI) 쓰레드,사용자정의 쓰레드
   - 언제 만드냐--> 두가지일을 동시에 해야할때..
   
   
- 쓰레드객체 만드는 방법(형식)
     

	Type A:
	1. Thread 클래스를 상속받는다.
	2. Thread class의 run method를 overriding 한다.
		메소드원형 : public void run()
	3. Thread 객체를 생성한다.
	4. Thread 객체를통해서 Thread를 시작시킨다.
	
    Type B:
	1. Runnable interface를 implements 한다.
	2. Runnable interface를 implements 한객체를
	   Thread 클래스의 생성자에 넣어서 Thread 객체를 생성한다
    3. Thread 를 시작시킨다.

   형식>>
    1. Thread 클래스를 상속받아서 만든다..
      ex> public class ThreadEx extends Thread{
          		// run 메쏘드를 재정의 해야한다.
          		 public void run(){
          		 	//사용자가만든 쓰레드 가 실행할코드
          		 }
          } 
    2. Runnable interface를 implements 해서만든다
      ex>  public class ThreadImpl implements Runnable{
           		public void run(){
          		 }
           } 
┏(^_^)┛

└(^_^)┓
*/
class CreateCustomThread extends Thread {
	@Override
	public void run() {
		while(true) {
			System.out.println("가. " + Thread.currentThread().getName() + " 스레드 실행");
			System.out.println("나. " + Thread.currentThread().getName() + " 스레드 return");
		}
	}
}


public class CreateCustomThreadMain {

	public static void main(String[] args) {
		
		System.out.println("1.main thread");
		//3. Thread 객체를 생성한다.
		CreateCustomThread cct = new CreateCustomThread();
		cct.setName("myThread");
		//4. Thread 객체를 통해서 새로운 Thread를 시작시킨다.
		cct.start();
		/*
		 Causes this thread to begin execution; the Java Virtual Machinecalls the run method of this thread. 

		The result is that two threads are running concurrently: thecurrent thread (which returns from the call to the start method) and the other thread (which executes its run method). 

		It is never legal to start a thread more than once.In particular, a thread may not be restarted once it has completedexecution.

		 */
		//while (true) {
			System.out.println("2.main thread return");
		//}
	}

}
