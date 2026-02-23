package com.github.catvod.spider.merge.K0;

import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.c1.C0046;
import com.github.catvod.spider.merge.r0.C0059;

/* loaded from: classes.dex */
public abstract class d {
    public static final char[] a;

    static {
        C0046.m7674();
        C0059.m9232();
        a = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    }

    public static String a(byte[] bArr) {
        char[] cArr = new char[bArr.length << 1];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            char[] cArrM7382 = C0044.m7382();
            cArr[i] = cArrM7382[(b & 240) >>> 4];
            i += 2;
            cArr[i2] = cArrM7382[b & 15];
        }
        return new String(cArr);
    }
}