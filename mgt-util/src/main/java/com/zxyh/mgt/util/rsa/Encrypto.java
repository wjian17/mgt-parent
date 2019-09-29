package com.zxyh.mgt.util.rsa;

/**
 * @author WJ
 * 处理加减密公共接口
 */
public interface Encrypto {
    String encrypt(String plainText);
    String decrypt(String encryptStr);
}
