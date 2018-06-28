package com.bricewu;

/**
 * Create by BriceWu on 2018/6/28
 */
public class App 
{
    public static void main( String[] args )
    {
        func();
    }

    private static void func(){
        int i=0;
        for(testFunc('A');testFunc('B')&&i<2;testFunc('C')){
            i++;
            testFunc('D');
        }
    }

    private static boolean testFunc(char a){
        System.out.print(a);
        return true;
    }
}
