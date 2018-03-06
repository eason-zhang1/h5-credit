package com.modianli.credit.common.util;

import java.util.UUID;

public class UUIDUtils {

  public static String getShortUUID() {
	return UUID.randomUUID().toString().replaceAll("-", "");
  }
}
