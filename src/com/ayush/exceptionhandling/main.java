package com.ayush.exceptionhandling;

public class main {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        try {
             divide( a ,  b);
        }
        catch (AssertionError e) {
            System.out.println(e.getMessage());
        }
        catch (ArithmeticException ep) {
            System.out.println(ep.getMessage());
        }
        finally {
            System.out.println("all was so good no erros hehe");
        }
    }

    static int divide(int a , int b )  throws ArithmeticException {
        if (b==0)  {
            throw new ArithmeticException("dont divide by zero bro ");
        }
        return a/b;
    }


}


