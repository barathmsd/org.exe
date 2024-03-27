package org.exe;

public class AbcBank extends SbiBank {
	
	@Override
	public void Savings(int id) {
		System.out.println("my savings 546");
		
}
 public static void main(String[] args) {
	 
	 AbcBank s = new AbcBank();
	 
	 s.Savings(46);
	 s.Deposite();
 }
	
}