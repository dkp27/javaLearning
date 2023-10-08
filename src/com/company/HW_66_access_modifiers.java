package com.company;
class C1{
        public int  x = 4;
        protected int y = 5;
        int z = 6;
        private int a = 8;
        void meth1(){
            System.out.println(x);
            System.out.println(y);
            System.out.println(z);
            System.out.println(a);
        }
}
public class HW_66_access_modifiers {
    public static void main(String[] args) {
        C1 s = new C1();
        // s.meth1();
        System.out.println(s.x);
        System.out.println(s.y);
        System.out.println(s.z);
        //System.out.println(s.a);
    }
}
