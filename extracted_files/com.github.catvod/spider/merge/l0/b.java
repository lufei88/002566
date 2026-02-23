package com.github.catvod.spider.merge.l0;

import com.github.catvod.spider.merge.J0.C0021;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.f0.C0052;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class b {
    public final String a;
    public final String b;
    public final String c;

    /* renamed from: short, reason: not valid java name */
    private static final short[] f829short = {1530, 1409, 1501, 1448, 1532, 1419, 1417, 1530, 1535, 1422, 1535, 1409, 1535, 1434, 1535, 1421, 1532, 1418, 1422, 1530, 1535, 1409, 1535, 1434, 1535, 1421, 1532, 1418, 1416, 1692, 1767, 1723, 1742, 1690, 1773, 1775, 1700, 1711, 1702, 1717, 1716, 1698, 1715, 1774, 1692, 1767, 1723, 1742, 1690, 1773, 1786, 1692, 1767, 1723, 1742, 1690, 1773, 1692, 1760, 1723, 1765, 1690, 1784, 1775, 1692, 1689, 1765, 1689, 1760, 1689, 1788, 1689, 1771, 1690, 1773, 1774, 1692, 1760, 1723, 1765, 1690, 1784, 3108, 3167, 3075, 3190, 3106, 3157, 3159, 3101, 3088, 3082, 3089, 3099, 3102, 3085, 3078, 3158, 3108, 3167, 3075, 3190, 3106, 3157, 3138, 3108, 3167, 3075, 3190, 3106, 3157, 3108, 3160, 3075, 3165, 3106, 3136, 3159, 3108, 3105, 3165, 3105, 3160, 3105, 3140, 3105, 3155, 3106, 3157, 3158, 3108, 3160, 3075, 3165, 3106, 3136, 1762, 1763, 1777, 1690, 1679, 1240, 1216, 1241, 1217, 1244, 1221, 1236, 1223, 1217, 1178, 1235, 1242, 1223, 1240, 1176, 1233, 1236, 1217, 1236};
    public static final Pattern d = C0026.m4930(C0005.m1645(m8842(), 0, 29, 1441), 2);
    public static final Pattern e = C0026.m4930(C0055.m8814(m8842(), 29, 53, 1735), 2);
    public static final Pattern f = C0026.m4930(C0028.m5109(m8842(), 82, 54, 3199), 2);

    public b(String str) {
        String strM8259;
        this.a = str;
        String strM1840 = C0007.m1840();
        if (str != null) {
            Matcher matcherM6026 = C0034.m6026(C0024.m4650(), str);
            this.b = C0003.m1405(matcherM6026) ? C0021.m4306(matcherM6026, 1) : strM1840;
            Matcher matcherM60262 = C0034.m6026(C0044.m7465(), str);
            strM8259 = C0003.m1405(matcherM60262) ? C0021.m4306(matcherM60262, 2) : null;
        } else {
            this.b = strM1840;
            strM8259 = C0051.m8259(m8842(), 136, 5, 1719);
        }
        this.c = strM8259;
        if (C0000.m1057(C0024.m4740(m8842(), 141, 19, 1205), C0052.m8304(this))) {
            Matcher matcherM60263 = C0034.m6026(C0034.m6029(), str);
            if (C0003.m1405(matcherM60263)) {
                C0021.m4306(matcherM60263, 2);
            }
        }
    }

    /* renamed from: ۧۡۤ۠, reason: not valid java name and contains not printable characters */
    public static short[] m8842() {
        if (C0045.m7538() <= 0) {
            return f829short;
        }
        return null;
    }
}