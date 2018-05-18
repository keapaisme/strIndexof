package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String ag = "abcdefghi";
        String n17 = "012345678";
        String Str = " _  abc _ ";
        String copyVO ="";
        char [] ag2 =  {'A','B','C','D','E','F'};
        char [] ag3 =  {'-','-','-','-','-','-'};

        System.out.println("字串ag : "+ ag);
        System.out.println("字串n17: "+ n17);
        System.out.println("-----------------------");
        System.out.println("ag2[全部]的值是  ="+ag2[0]+" "+ag2[1]+" "+ag2[2]+" "+ag2[3]+" "+ag2[4]+" "+ag2[5]);
        ag2[3] = ag.charAt(3);
        System.out.println("ag2[3] = ag.charAt(3), ag2[3]的值是  ="+ag2[3]);
        System.out.println("ag.charAt(5) 的值是  =" +ag.charAt(5) +" (unicode 101)");
        System.out.println("^^類似用法ag.codePoint(5)秀unicode  ="+ ag.codePointAt(5)+" (字元e)");
        System.out.println("ag.codePointCount(3,4)  ="+ag.codePointCount(3, 4));
        System.out.println("");

        System.out.println("indexOf(字碼 或 字 從哪裡開始)可放unicode值，如97＝a 98=b；可放字如 a -------------");
        System.out.println("ag.indexOf(101)  ="+ag.indexOf(101));
        System.out.println("ag.indexOf('e')  ="+ag.indexOf('e'));
        System.out.println("ag.indexOf(97)  ="+ag.indexOf(97));
        System.out.println("ag.indexOf('b')  ="+ag.indexOf('b'));
        System.out.println("ag.indexOf(\"r\")  ="+ag.indexOf("r"));
        System.out.println("ag.indexOf(\"r\",5)  ="+ag.indexOf("r",5));
        System.out.println("");

        System.out.println("如果字符串以指定的字开始，则返回 true；否则返回 false。 ");
        System.out.println("ag.startsWith(b，從1開始)  ="+ ag.startsWith("b",1) );
        System.out.println("");
//數組ag2,ag3 《-》 字串 copyVO
        System.out.println("//數組＞＞字串---------------");
        System.out.println("數組ag2  ="+ag2[0]+" "+ag2[1]+" "+ag2[2]+" "+ag2[3]+" "+ag2[4]+" "+ag2[5]);
        System.out.println("字串copyVO  ="+copyVO);
        System.out.println("數組變字串 ag2.toString()  ="+ag2.toString());
        copyVO = copyVO.copyValueOf(ag2, 2, 4);
        System.out.println("拷貝數組成為另一字串copyVO = copyVO.copyValueOf(ag2, 2, 4)  ="+copyVO);//與String.valueOf(數組）相當
        System.out.println("數組變字串 String.valueOf(數組ag2)  ="+ String.valueOf(ag2));
        System.out.println("字串變數組 字串ag.toCharArray()  ="+ag.toCharArray() );
        System.out.println("");
        ag.getChars(3, 5, ag3, 0);
        System.out.println("ag.getChars(3, 5,存到 ag3,從ag3的0開始存)");
        System.out.print("ag3[]  ="+String.valueOf(ag3));
        System.out.println("\n");

        System.out.println("startsWith 可用來判斷如果為真就置換字串");
        System.out.println("ag.startsWith(\"b\", 1) 判斷字串的指定位1是否為b  ="+ag.startsWith("b", 1));
        System.out.println("");

        System.out.println(String.format(ag, "*-"));//??

        System.out.print("删除头尾空白' _abc- ' Str.trim()  ="+ Str.trim());
        System.out.println("");
        System.out.println(ag.matches("r(.*)r"));
        System.out.println(ag.matches("r(.*)"));
        System.out.println("");
        System.out.println("返回一个新的字符序列，它是此序列的一个子序列 subSequence()  ="+ag.subSequence(4, 5) );
        System.out.println("切片字串，劃兩刀 頭尾 ag.substring(2,5)  ="+ag.substring(2, 6) );


    }
}
