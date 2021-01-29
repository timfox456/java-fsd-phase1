package com.example.learnjava;

public class InnerClassExample {

    private String myMember1;

    public InnerClassExample(String member1) {
        myMember1 = member1;
    }


    public String getMyMember1() {
        return myMember1;
    }

    public String useMyInnerClass() {
        MyInnerClass myInnerClass = new MyInnerClass("test2");
        String innerClassMyMember2  = myInnerClass.getMyMember2();
        return innerClassMyMember2;
    }

    public class MyInnerClass {

        private String myMember2;

        public MyInnerClass(String member2) {
            myMember2 = member2;
        }

        public String getMyMember2() {
            return myMember2;
        }

        public String getMyMember1() {
            return myMember1;
        }
    }
}
