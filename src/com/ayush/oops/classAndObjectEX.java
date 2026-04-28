package com.ayush.oops;

public class classAndObjectEX {
    static class Student {
        String name;
        float marks;
        void updateName(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        //1
//        Student s1 = new Student();
//        s1.name = "A";
//
//        Student s2 = s1;
//        s2.name = "B";
//
//        System.out.println(s1.name);
        //2
//        Student s1;
//        s1.name = "A";
        //5
//        Student s1 = new Student();
//        Student s2 = new Student();
//
//        s1.name = "A";
//        s2.name = "B";
        //7
        Student s1 = new Student();
        s1.updateName("A");
    }
}
//so the refernce variable of s2 is pointing to the reference of s1

//there is no object is created in heap with "new" also s1 is not implemented properly so s1.name doesnt know where to store the "A"

//2 times cause new refernce variable is created and new object is created along with it as shown

//int = 0 primitive type
//boolean = false primitive type
//string = null non primitive hence null

//to create new object for each s1 and s2 and have distinct value of their own object , earlier in question 1 , s2 = s1 , so s2 was not having its own object in the heap , now in this question it does and points to its own object in th heap

//s1 is not used and given as null hence it wont be used so garbage collector will delete it eventually

//this is a placeholder , internally it would be s1.name = name ; we needed a common method to handle all names so this acts a placeholder for refernce vaariables to the current object, if we remove this then name = name doesnt make sense (actually i am not sure in detail about it what happens if we remove this)

