package com.github.catvod.spider.p000mergexbpq.c0;

import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.Z.C0040;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.r0.C0059;
import com.github.catvod.spider.merge.z.C0065;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.d0.C0067a;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import com.github.catvod.spider.p000mergexbpq.r.C0014;
import com.github.catvod.spider.p000mergexbpq.x.C0015;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import java.io.StringReader;
import java.nio.charset.CharsetEncoder;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f190short = {1673, 1714, 1721, 1700, 1708, 1721, 1727, 1704, 1721, 1720, 1788, 1727, 1715, 1705, 1714, 1704, 1788, 1715, 1722, 1788, 1721, 1714, 1704, 1717, 1704, 1717, 1721, 1711, 1788, 1712, 1715, 1725, 1720, 1721, 1720, 3065, 3068, 2983, 956, 1012, 1016, 1001, 1002, 929, 2164, 2161, 2090, 2099, 2146, 2153, 2114, 2051, 2064, 2143, 2885, 2831, 2839, 2904, 878, 809, 805, 824, 883, 2538, 2493, 2489, 2467, 2488, 2551};
    private static final char[] a = {',', ';'};
    private static final HashMap<String, String> b = new HashMap<>();

    static {
        new g();
    }

    static void a(m mVar, String str, int i) {
        int iM5751;
        m2242(mVar, new String[i]);
        m2244(mVar, new int[i]);
        m2236(mVar, new int[i]);
        m2239(mVar, new String[i]);
        C0067a c0067a = new C0067a(new StringReader(str), C0004.m1584(str));
        int i2 = 0;
        while (!C0049.m8062(c0067a)) {
            String strM7295 = C0043.m7295(c0067a, '=');
            C0018.m3905(c0067a);
            int iM57512 = C0032.m5751(C0058.m9161(c0067a, m2230()), 36);
            char cM3324 = C0014.m3324(c0067a);
            C0018.m3905(c0067a);
            if (cM3324 == ',') {
                iM5751 = C0032.m5751(C0043.m7295(c0067a, ';'), 36);
                C0018.m3905(c0067a);
            } else {
                iM5751 = -1;
            }
            int iM57513 = C0032.m5751(C0043.m7295(c0067a, '&'), 36);
            C0018.m3905(c0067a);
            m2238(mVar)[i2] = strM7295;
            m2233(mVar)[i2] = iM57512;
            m2231(mVar)[iM57513] = iM57512;
            m2237(mVar)[iM57513] = strM7295;
            if (iM5751 != -1) {
                C0053.m8424(m2232(), strM7295, new String(new int[]{iM57512, iM5751}, 0, 2));
            }
            i2++;
        }
        if (!(i2 == i)) {
            throw new IllegalArgumentException(C0029.m5256(m2240(), 0, 35, 1756));
        }
    }

    private static void b(Appendable appendable, m mVar, int i) {
        Appendable appendableM4699;
        String strM2243 = m2243(mVar, i);
        if (C0007.m1815(C0007.m1840(), strM2243)) {
            appendableM4699 = C0024.m4699(appendable, C0030.m5362(m2240(), 35, 3, 3039));
            strM2243 = C0056.m8889(i);
        } else {
            appendableM4699 = C0045.m7565(appendable, '&');
        }
        C0045.m7565(C0024.m4699(appendableM4699, strM2243), ';');
    }

    public static int c(String str, int[] iArr) {
        String str2 = (String) C0065.m9715(m2232(), str);
        if (str2 != null) {
            iArr[0] = C0000.m1058(str2, 0);
            iArr[1] = C0000.m1058(str2, 1);
            return 2;
        }
        int iM2229 = m2229(C0001.m1170(), str);
        if (iM2229 == -1) {
            return 0;
        }
        iArr[0] = iM2229;
        return 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x011d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static void d(java.lang.Appendable r66, java.lang.String r67, com.github.catvod.spider.p000mergexbpq.c0.g r68, boolean r69, boolean r70, boolean r71) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.p000mergexbpq.c0.n.d(java.lang.Appendable, java.lang.String, com.github.catvod.spider.merge-xbpq.c0.g, boolean, boolean, boolean):void");
    }

    public static boolean e(String str) {
        return m2229(C0038.m6465(), str) != -1;
    }

    public static boolean f(String str) {
        return m2229(C0001.m1170(), str) != -1;
    }

    /* renamed from: ۟۟ۨ۟ۥ, reason: not valid java name and contains not printable characters */
    public static int m2229(Object obj, Object obj2) {
        if (C0000.m1116() < 0) {
            return ((m) obj).i((String) obj2);
        }
        return 0;
    }

    /* renamed from: ۣ۟ۤۤۤ, reason: not valid java name and contains not printable characters */
    public static char[] m2230() {
        if (C0059.m9257() < 0) {
            return a;
        }
        return null;
    }

    /* renamed from: ۟ۦ۠ۢۢ, reason: not valid java name and contains not printable characters */
    public static int[] m2231(Object obj) {
        if (C0024.m4693() < 0) {
            return ((m) obj).e;
        }
        return null;
    }

    /* renamed from: ۟ۧ۠ۡۨ, reason: not valid java name and contains not printable characters */
    public static HashMap m2232() {
        if (C0016.m3596() <= 0) {
            return b;
        }
        return null;
    }

    /* renamed from: ۟ۧۡۨ۠, reason: not valid java name and contains not printable characters */
    public static int[] m2233(Object obj) {
        if (C0022.m4497() > 0) {
            return ((m) obj).d;
        }
        return null;
    }

    /* renamed from: ۟ۧۢۢ۟, reason: not valid java name and contains not printable characters */
    public static CharsetEncoder m2234(Object obj) {
        if (C0015.m3433() >= 0) {
            return ((g) obj).b();
        }
        return null;
    }

    /* renamed from: ۠ۦ۠ۤ, reason: not valid java name and contains not printable characters */
    public static int m2235(Object obj) {
        if (C0032.m5686() <= 0) {
            return ((g) obj).f;
        }
        return 0;
    }

    /* renamed from: ۡۥۧۧ, reason: not valid java name and contains not printable characters */
    public static int[] m2236(Object obj, Object obj2) {
        if (C0017.m3633() > 0) {
            return null;
        }
        return ((m) obj).e = (int[]) obj2;
    }

    /* renamed from: ۡۦۧ۠, reason: not valid java name and contains not printable characters */
    public static String[] m2237(Object obj) {
        if (C0011.m2755() > 0) {
            return ((m) obj).f;
        }
        return null;
    }

    /* renamed from: ۣۢۢۥ, reason: not valid java name and contains not printable characters */
    public static String[] m2238(Object obj) {
        if (C0029.m5282() >= 0) {
            return ((m) obj).c;
        }
        return null;
    }

    /* renamed from: ۢۥۡۦ, reason: not valid java name and contains not printable characters */
    public static String[] m2239(Object obj, Object obj2) {
        if (C0033.m5872() < 0) {
            return null;
        }
        return ((m) obj).f = (String[]) obj2;
    }

    /* renamed from: ۣۢۧۢ, reason: not valid java name and contains not printable characters */
    public static short[] m2240() {
        if (C0030.m5375() >= 0) {
            return f190short;
        }
        return null;
    }

    /* renamed from: ۤۧۥۥ, reason: not valid java name and contains not printable characters */
    public static void m2241(Object obj, Object obj2, int i) {
        if (C0034.m6048() <= 0) {
            b((Appendable) obj, (m) obj2, i);
        }
    }

    /* renamed from: ۥۡۥۣ, reason: contains not printable characters */
    public static String[] m2242(Object obj, Object obj2) {
        if (C0041.m6823() > 0) {
            return null;
        }
        return ((m) obj).c = (String[]) obj2;
    }

    /* renamed from: ۦۥۥۣ, reason: contains not printable characters */
    public static String m2243(Object obj, int i) {
        if (C0015.m3433() > 0) {
            return ((m) obj).j(i);
        }
        return null;
    }

    /* renamed from: ۨ۟۟۠, reason: not valid java name and contains not printable characters */
    public static int[] m2244(Object obj, Object obj2) {
        if (C0040.m6582() < 0) {
            return null;
        }
        return ((m) obj).d = (int[]) obj2;
    }
}