
package day23_discussion.overriding;

public class Father extends Person {

    /*@Override annotation tells the compiler
    method is overriding the method from parent 
    
     */
    String name = "Strong Father";
    public void printName(){
        System.out.println(name);
    }
    @Override
    public void role() {
        System.out.println("I am a father. "
                + "i provide support and protect my family");
    }
    
    
    //access Level : public protected default private 
}
