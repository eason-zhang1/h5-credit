package com.modianli.credit.common.util;

public class CodeUtils {

  private final static String NUMBER_SER = "1234567890";
  public static String generateCode(int length) {
	int len = NUMBER_SER.length();

	StringBuilder builder = new StringBuilder();
	for(int i = 0; i < length; i ++){
	  int index = new Double(Math.floor(Math.random() * len)).intValue();
	  char ind = NUMBER_SER.charAt(index);
	  builder.append(ind);
	}

	return builder.toString();
  }
}
