/**
 * 
 */
package com.demo.java;
public class Textclass implements a,a1
{
	 	
		public void method1()
		{
			System.out.println("this interfce method a method ");
		}
		public void method2()
		{
		System.out.println("this interface  a1 two mwthod ");	
		}
		public void method3()
		{
			System.out.println("this interfce a1 method");
		}
		public static void main(String[] args) 
		{
			Textclass  sm=new Textclass();
			sm.method1();
			sm.method2();
			sm.method3();
			System.out.println("access the stric value is like "+a.nm);
		}

	}
	 
	interface a
	 {
		 String nm ="abc";// its by defalut  public ststic final
		 public void method1();
	 }
	 interface a1
	 {
		 public void  method2();
		 public void method3();
	 }


