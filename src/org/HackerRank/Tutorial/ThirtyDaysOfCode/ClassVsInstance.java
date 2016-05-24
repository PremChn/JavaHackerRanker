package org.HackerRank.Tutorial.ThirtyDaysOfCode;
	
	public class ClassVsInstance {
		private int age;
		
		public ClassVsInstance(int initialAge) {
			if (initialAge < 0) {
				age = 0;
				System.out.println("Age is not valid, setting age to 0.");
			}
			else{
				age = initialAge;
			}
				
		}

		public void amIold() {
			age++;
		}

		public void yearPasses() {
			if (age < 13) {
				System.out.println("You are young.");
			} else if (age >= 13 && age < 18) {
				System.out.println("You are a teenager.");
			} else {
				System.out.println("You are old.");
			}
		}
		
		public static void main(String[] args){
			ClassVsInstance solution = new ClassVsInstance(20);
			solution.amIold();
			solution.yearPasses();
		}

}
