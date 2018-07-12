package cs.com.java.demo2;


import java.util.ArrayList;
import java.util.List;

import static cs.com.kotlinTest.demo3.StringFunctions.joinToString;

public class Test5 {
    public static void main(String[] args){
        List<Integer> mList=new ArrayList<>();
        mList.add(1);
        mList.add(2);
        mList.add(3);
        joinToString(mList,",");
    }
}
