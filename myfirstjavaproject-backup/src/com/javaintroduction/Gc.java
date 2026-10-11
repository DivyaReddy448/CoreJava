package com.javaintroduction;

class Gc {

	@Override
	protected void finalize() throws Throwable {
		System.out.println("hello");
	}
	//out of scope
	void hi(){
		System.out.println("hi");
		Gc h1 = new Gc();
		
	}

	public static void main(String[] args) {
		Gc g1 = new Gc();
		Gc g2 = new Gc();
		Gc g3 = new Gc();
		Gc g4 = new Gc();
		//nullifying the object
		g1=null;
		//re assiging
		g2=g1;
		//anomymonus 
		new Gc();
		
		System.gc();
		g4.hi();
		System.gc();

	}

}
