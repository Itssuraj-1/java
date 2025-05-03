public class Human{
    //overridden method
    public void eat(){
        System.out.println("Human is Eating");
    }
}
public class Boy extends Human{
    //overriding method
    public void eat(){
        System.out.println("Boy is eating");
    }
    public static void main(String[] args) {
        Boy obj = new Boy();
        //this will call the child class method
        obj.eat();
    }
    }