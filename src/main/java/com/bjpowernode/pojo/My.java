package com.bjpowernode.pojo;

public class My {
        int a=15;
        public void king(){
                do {
                       System.out.println("do");a++;
               }while (a<15);{
                        System.out.println("while");
                        a++;
                }
        }

        public void ing(){
                switch (a){
                        case 15:
                                System.out.println();

                        case 16:
                                System.out.println();

                        case 17:
                                System.out.println("switch case");
                                break;
                }
        }
        public void bao(){
                Integer integer = new Integer(15);
                Integer as=integer.intValue();

                StringBuffer stringBuffer = new StringBuffer();
                StringBuffer append = stringBuffer.append("123");
                System.out.println(append.equals(as));
        }


}
