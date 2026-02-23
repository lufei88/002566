package com.github.catvod.spider.p000mergexbpq;

import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.J0.C0021;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.z.C0065;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import java.io.ByteArrayOutputStream;

/* loaded from: classes.dex */
public class HaB {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f139short = {973, 962, 1023, 991, 969, 1007, 1283, 1282, 1281, 1280, 1287, 1286, 1285, 1284, 1291, 1290, 1394, 1393, 1392, 1399, 1398, 1397, 2314, 2315, 2312, 2313, 2318, 2319, 2316, 2317, 2306, 2307, 2427, 2424, 2425, 2430, 2431, 2428, 1128, 1129, 1130, 1131, 1132, 1133, 1134, 1135, 1120, 1121, 1049, 1050, 1051, 1052, 1053, 1054, 1583, 1568, 1565, 1597, 1579, 1549, 273, 286, 291, 259, 277, 307};
    private static final String KEY = C0021.m4340(m782(), 0, 6, 954);
    private static final String hexString = C0041.m6779(m782(), 6, 16, 1331);

    public static String d(String str) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(C0004.m1584(str) / 2);
        for (int i = 0; i < C0004.m1584(str); i += 2) {
            C0065.m9782(byteArrayOutputStream, (C0048.m7935(C0029.m5256(m782(), 22, 16, 2362), C0007.m1823(str, i)) << 4) | C0048.m7935(C0000.m1077(m782(), 38, 16, 1112), C0007.m1823(str, i + 1)));
        }
        byte[] bArrM4028 = C0019.m4028(byteArrayOutputStream);
        int length = bArrM4028.length;
        int iM1584 = C0004.m1584(C0011.m2805(m782(), 54, 6, 1624));
        for (int i2 = 0; i2 < length; i2++) {
            bArrM4028[i2] = (byte) (bArrM4028[i2] ^ C0007.m1823(C0022.m4403(m782(), 60, 6, 358), i2 % iM1584));
        }
        return new String(bArrM4028);
    }

    /* renamed from: ۟ۦۣۡۨ, reason: not valid java name and contains not printable characters */
    public static short[] m782() {
        if (C0016.m3596() <= 0) {
            return f139short;
        }
        return null;
    }
}