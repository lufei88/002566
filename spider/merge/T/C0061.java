package com.github.catvod.spider.merge.t;

import com.github.catvod.spider.merge.Y.C0036;
import java.io.ByteArrayOutputStream;

/* renamed from: com.github.catvod.spider.merge.t.ۢۥۤۥ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C0061 {

    /* renamed from: ۨۡۨ۟, reason: not valid java name and contains not printable characters */
    public static int f858 = -479;

    /* renamed from: ۟ۤۧ, reason: not valid java name and contains not printable characters */
    public static String m9358(String str) {
        String string = "";
        int i = 0;
        String str2 = "";
        while (i < 15) {
            string = new StringBuffer().append(string).append(Integer.toHexString(i)).toString();
            String string2 = new StringBuffer().append(str2).append(((int) (Math.random() * 10)) ^ i).toString();
            i++;
            str2 = string2;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(str.length() / 2);
        for (int i2 = 0; i2 < str.length(); i2 += 2) {
            byteArrayOutputStream.write((string.indexOf(str.charAt(i2)) << 4) | string.indexOf(str.charAt(i2 + 1)));
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        int length = byteArray.length;
        int length2 = str2.length();
        for (int i3 = 0; i3 < length; i3++) {
            byteArray[i3] = (byte) (byteArray[i3] ^ str2.charAt(i3 % length2));
        }
        for (int length3 = 0; length3 < byteArray.length; length3 = "".length() + 1) {
        }
        return new String(byteArray);
    }

    /* renamed from: ۟ۥۡۢۡ, reason: not valid java name and contains not printable characters */
    public static int m9359() {
        return (-708) ^ C0036.f686;
    }

    /* renamed from: ۟ۧۢۨۤ, reason: not valid java name and contains not printable characters */
    public static int m9360(Object obj) {
        return obj.hashCode();
    }

    /* renamed from: ۢۤۦ۟, reason: not valid java name and contains not printable characters */
    public static String m9361(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}