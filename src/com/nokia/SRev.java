package com.nokia;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SRev {
	 public static void main(String[] args) {
	        String X = "(,)";
	        X=X.replaceAll("[(' \n]", "");
	        System.out.println(X);
	        String Y=X.split(X)[0];
	        System.out.println();
	    }

}
