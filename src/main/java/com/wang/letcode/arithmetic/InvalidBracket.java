package com.wang.letcode.arithmetic;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName InvalidBracket
 * @Description 删除无效的括号
 *
 * 删除最小数量的无效括号，使得输入的字符串有效，返回所有可能的结果。
 *
 * 说明: 输入可能包含了除 ( 和 ) 以外的字符。
 *
 * 示例 1:
 *
 * 输入: "()())()"
 * 输出: ["()()()", "(())()"]
 * 示例 2:
 *
 * 输入: "(a)())()"
 * 输出: ["(a)()()", "(a())()"]
 * 示例 3:
 *
 * 输入: ")("
 * 输出: [""]
 *
 * @Author wangjq
 * @Date 2018/12/10 16:28
 * @Version 1.0
 **/
public class InvalidBracket {

    public static void main(String[] args) {



    }


    private static List<String> removeInvalidParentheses(String s) throws Exception {

        List<String> lists = new ArrayList<>();
        if(s.length() < 1 ){
            throw new Exception("输入为空");
        }
        if(s.length() == 1 && (s.charAt(0) == 40 || s.charAt(0) == 41) ){
            return  lists;
        }

        int length = s.length();

//        int i = 0;
//        int j = 1;

        StringBuilder sb = new StringBuilder();
        for(int i=0; i < length-1 ;i++){


            for(int j = 1 ;j<length;j++){

                char char1 = s.charAt(i);
                char char2 = s.charAt(j);


                if(char1 !=40 || char1 !=41){
                    sb.append(char1);
                }

                if(char1 == 40){
                    sb.append(char1);


                }


            }


        }




        return lists;

    }

}
