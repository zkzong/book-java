package com.zkzong.base64.jdk;

import org.junit.Test;
import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

/**
 * Created by zong on 2017/2/21.
 * Base64编码与解码测试类
 */
public class Base64CoderTest {
    /**
     * 测试Base64编码与解码
     */
    @Test
    public final void test() throws IOException {
        String inputStr = "Java加密与解密的艺术";

        System.err.println("原文:\n\t" + inputStr);

        // 进行Base64编码
        String code = Base64Coder.encode(inputStr);

        System.err.println("Base64编码后:\n\t" + code);

        // 进行Base64解码
        String outputStr = Base64Coder.decode(code);
        System.err.println("Base64解码后:\n\t" + outputStr);

        // 验证Base64编码解码一致性
        assertEquals(inputStr, outputStr);
    }

    /**
     * 演示
     * @throws Exception
     */
    @Test
    public final void demo() throws Exception {
        String str = "Java加密与解密的艺术";
        System.err.println("原文:\n\t" + str);
        byte[] input = str.getBytes();

        // Base64编码
        BASE64Encoder encoder = new BASE64Encoder();
        String data = encoder.encodeBuffer(input);
        System.err.println("编码后:\n\t" + data);

        // Base64解码
        BASE64Decoder decoder = new BASE64Decoder();
        byte[] output = decoder.decodeBuffer(data);
        System.err.println("解码后:\n\t" + new String(output));

    }

}
