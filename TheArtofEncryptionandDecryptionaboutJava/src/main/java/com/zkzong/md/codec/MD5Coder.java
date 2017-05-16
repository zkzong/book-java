package com.zkzong.md.codec;

import org.apache.commons.codec.digest.DigestUtils;

import java.security.NoSuchAlgorithmException;

/**
 * MD5消息摘要组件
 * Created by Zong on 2017/5/16.
 */
public abstract class MD5Coder {
    /**
     * MD5消息摘要
     * @param data 待做摘要处理的数据
     * @return byte[] 消息摘要
     * @throws NoSuchAlgorithmException
     */
    public static byte[] encodeMD5(String data) throws NoSuchAlgorithmException {
        // 执行消息摘要
        return DigestUtils.md5(data);
    }

    /**
     * MD5消息摘要
     * @param data 待做摘要处理的数据
     * @return byte[] 消息摘要
     * @throws NoSuchAlgorithmException
     */
    public static String encodeMD5Hex(String data) throws NoSuchAlgorithmException {
        // 执行消息摘要
        return DigestUtils.md5Hex(data);
    }
}
