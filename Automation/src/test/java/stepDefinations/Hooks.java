package stepDefinations;


	import io.cucumber.java.After;
	import io.cucumber.java.Before;

	public class Hooks {
		
		
		@Before("@MobileTest")
		public void beforeValidation() {
			System.out.println("Before Mobile hook Validation");
			
		}
		
		@After("@MobileTest")
		public void afterValidation(){
			System.out.println("After mobile hook validation");
			
		}
		
		@Before("@WebTest")
		public void beforeWebValidation() {
			System.out.println("Before web hook Validation");
			
		}
		
		@After("@WebTest")
		public void afterWebValidation(){
			System.out.println("After web hook validation");
			
		}
		

	}



