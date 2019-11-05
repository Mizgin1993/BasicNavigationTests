package com.cbt.utilities;

public class StartsWithUrl {

    public static void StartsWith(String url , String word){
        if(url.startsWith(word)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("url= " + url);
            System.out.println("Url is expected to begin with " + word);
        }
    }
}
