package com.ayush.oops;
//import com.ayush.recursion.oops2test;


class test {
    String name;
    test(String name) {
        this.name = name;
    }
}

public class oops_2 {
    public static void main(String[] args) {
        test a = new test("allie");
        test b = new test("rose");

        System.out.println(a.name);
        System.out.println(b.name);
    }
}


//public class oops_2 {
////    public static void main(String[] args) {
////        oops2test s = new oops2test();
////        s.display1();
////    }
//    //NEED TO HAVE THE SAME NAME AS THE CLASS
//
//
//
//
//
//}
