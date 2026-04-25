public class Inheritance {
}

interface intA{
    // nothign implemented
    // onlt definition

    int func1(String b);
}

interface intB extends intA{

}

abstract class classC{
    // methods implemented or not
}

 class classA implements intA{

     public int func1(String b) {
         return 0;
     }
     // 5 methods - everything has to be implement
}

class classB extends classA{

}


// Abstraction - abstract classs(partial) and interface(full)