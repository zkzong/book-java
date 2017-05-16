package com.zkzong.md.jdk;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * MD消息摘要组件
 * Created by Zong on 2017/5/15.
 */
public abstract class MDCoder {
    /**
     * MD2消息摘要
     * @param data 待做摘要处理的数据
     * @return byte[] 消息摘要
     * @throws NoSuchAlgorithmException
     */
    public static byte[] encodeMD2(byte[] data) throws NoSuchAlgorithmException {
        // 初始化MessageDigest
        MessageDigest md = MessageDigest.getInstance("MD2");
        // 执行消息摘要
        return md.digest(data);
    }

    /**
     * MD5消息摘要
     * @param data 待做摘要处理的数据
     * @return byte[] 消息摘要
     * @throws NoSuchAlgorithmException
     */
    public static byte[] encodeMD5(byte[] data) throws NoSuchAlgorithmException {
        // 初始化MessageDigest
        MessageDigest md = MessageDigest.getInstance("MD5");
        // 执行消息摘要
        return md.digest(data);
    }
}
