class A {
    public String meth() {
        return "Invoking method from class A";
    }
}

class B extends A {
    @Override
    public String meth() {
        return "Method is overridden in Extended class B";
    }
}

public class Main {
    public static void main(String[] args) {
        A objA = new A();
        B objB = new B();

        // call method meth() of class A using objA
        System.out.println(objA.meth());

        // call method meth() of class A using objB
        System.out.println(objB.meth());  // calls the overridden method in class B
    }
}
