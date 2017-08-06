package net.imain.utils;

import org.apache.shiro.crypto.hash.Md5Hash;

/**
 * 加密.
 */
public class Md5Util {
    public static String md5(String password, String salt) {
        return new Md5Hash(password, salt, 2).toString();
    }
}
