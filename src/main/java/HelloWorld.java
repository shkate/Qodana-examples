public class HelloWorld {
    
    public String sameReturnValue(String s) {
        return s;
    }

    public void unusedParameter(String s) {
        if(true) {}
        System.out.println("Hello world!");
    }public class HelloWorld {

    private static String className = "HelloWorld";

    public String sameReturnValueAndUnusedVariable(String s) {
        String unusedVariable = "unusedVariable";
        return s;
    }
    
    public String sameReturnValue(String s) {
        return s;
    }

    public void unusedParameter(String s) {
        if(true) {}
        System.out.println("Hello world!");
    }

    public void unusedParameterWithAlwaysTrueClosure(String s) {
        if(true) {}
        System.out.println("Hello world!");    
    }

    public static void main(String[] args) {
        System.out.println(new HelloWorld().sameReturnValue("hi"));
    }
}

    
    public void unusedParameterWithAlwaysTrueClosure(String s) {
        try {
         if(true) {}
            System.out.println("Hello world!");   
        }
    }

    public static void main(String[] args) {
        System.out.println(new HelloWorld().sameReturnValue("hi"));
    }
}
