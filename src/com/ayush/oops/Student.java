package com.ayush.oops;

    class Student {
        String name;
        int age;

        // Constructor 1
        Student(String name) {
            this(name, 18); // Calls Constructor 2
        }
//        In real projects, constructor logic often:
//        Calls APIs
//        Validates input
//        Initializes multiple fields
//        In those cases, constructor logic can be 10+ lines. Reusing it with this(...) is safer and more readable.

        // Constructor 2
        Student(String name, int age) {
            this.name = name;
            this.age = age;
        }

        void display() {
            System.out.println(name + " is " + age + " years old.");
        }


    }

    class Main {
        public static void main(String[] args) {
            Student s = new Student("Bob");
            s.display(); // Output: Bob is 18 years old.
        }
    }


