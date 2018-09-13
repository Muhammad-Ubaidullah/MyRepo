/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L154121_Assignment1;

/**
 *
 * @author w10
 */

interface inter1
{
    void myfun1();
    
}

interface inter2
{
    void myfun2();
}

abstract class A{ 
    A() {
        System.out.println("Base Constructor Called"); } 
    abstract void fun(); 
    abstract double add2(double a,double b);
    final void fun3()
    {
        System.out.println("final method called");
    }
    void fun2()
    {
        System.out.println("Abstract class having non-abstract function");
    }
    static int add(int a,int b)
    {
        return a+b;
    }
} 
class B extends A implements inter1,inter2 { 
    int z=10;
   static  String name="Tomorrow";
   
  
   public void myfun1()
   {
       System.out.println("Function from interface 1");
   }
   
   
   public void myfun2()
   {
       System.out.println("Function from interface 1");
   }
   
   B() {
        System.out.println("Derived Constructor Called"); }
    
    void fun() {
        System.out.println("Derived  abstract fun() called"); } 
    
       double add2(double a,double b)
    {
        return a+b;
    }
       
       class C
       {
           C()
           {
               System.out.println("Default Constructor of non-Static class C in Derived class B called");
           }
           int retz()
           {
               return z;
           }
          
       }
       
       
            class D
       {
           D()
           {
               System.out.println("Default Constructor of Static class D in Derived class B called");
           }
           String retString()
           {
               return name;
           }
          
       }
      
}
public class Test1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   A d = new B();
         d.fun();
         d.fun2();
        
         
         
         System.out.println();
         
         System.out.println("Using static-method in Abstract class to add values ");
         System.out.print("2+3=");
         System.out.println(d.add(2,3));
         
         
         System.out.println();
         System.out.println("Using static-method in Derived class to add values ");
         
         
           System.out.print("9.1+3.4=");
           System.out.println(d.add2(4.424,11.112412));
           
           System.out.println();
           d.fun3();
           
           
           System.out.println();
           System.out.println();
           System.out.println();
           
        B b=new B();
        B.C nonstat=b.new C();
        
        System.out.println();
        System.out.print("Printing value of Z in non-static class=");
        System.out.println(nonstat.retz());
        
        
        System.out.println();
        System.out.println();
        System.out.println();
           
        B daa=new B();
        B.D stat=daa.new D();
        
        System.out.println();
        System.out.print("Printing value of String in static class=");
        System.out.println(stat.retString());
        
        
        
        
        
           
           
    }
}
