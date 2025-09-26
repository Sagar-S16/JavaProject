package inheritance;

//interface A {
//void methodA();
//}
//
//interface B {
//void methodB();
//}
//
//
//class C implements A, B {
//public void methodA() {
//System.out.println("Method A");
//	 }
//public void methodB() {
//System.out.println("Method B");
//	}
//}
//
//
//class D extends C {
//	public void methodD() {
//		System.out.println("Method D");
//}
//}
//
//public class HybridLevelInheritance {
//public static void main(String[] args) {
//	 D obj = new D();
//    obj.methodA();
//    obj.methodB();
//    obj.methodD();															    
//}
//}


class Person{
	void details() {
		System.out.println("Person has basic details : ");
	}}

interface Worker{
		void work();
	}
interface Learner {
		void learn();
	}

class C extends Person implements Worker, Learner {
			public void work() {
				System.out.println("Student Employee Working");
			}
			public void learn() {
				System.out.println("Student Employee Working ");
			}
	}


	public class HybridLevelInheritance{
			public static void main(String[] args) {
				C m = new C();
				m.details();
				m.work();
				m.learn();
			}
		}

