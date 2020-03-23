package Exceptions;

public class CheckedExceptionDemo {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("progrsm is started.....");
		System.out.println("program is in progress....");
		
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
		Thread.sleep(2000);
		
		System.out.println("program is completed......");
		System.out.println("program is exited..args.clone()..args.");

	}

}
