package com.ruoyi.common.utils.sign;

import org.apache.commons.codec.digest.DigestUtils;

/**
 * @Auther: C5310418
 * @Date: 12/3/2020 17:50
 * @Description: 简单签名工具
 */
public class SignUtils {
  private static final String salt = "lcb1234";

  public static String getSign(String param){
    return DigestUtils.md5Hex(param + salt);
  }

  public static void main(String[] args) {
    // test
    System.out.println(getSign(""));
  }
}
