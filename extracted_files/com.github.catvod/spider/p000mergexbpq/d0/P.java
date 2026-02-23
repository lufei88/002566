package com.github.catvod.spider.p000mergexbpq.d0;

import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.N.C0023;
import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.Z.C0040;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.r0.C0060;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.c0.C0010;
import com.github.catvod.spider.p000mergexbpq.r.C0014;

/* loaded from: classes.dex */
public final class P {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f222short = {1625, 1652, 1657, 1597, 1651, 1650, 1641, 1597, 1659, 1652, 1651, 1657, 1597, 1663, 1660, 1649, 1660, 1651, 1662, 1656, 1657, 1597, 1648, 1660, 1647, 1654, 1656, 1647, 1597, 1660, 1641, 1597, 1594, 2387, 2645, 2031, 1995, 2011, 1995, 2011, 1950, 2000, 2001, 1994, 1950, 2002, 2001, 2000, 2009, 1950, 2011, 2000, 2001, 1995, 2009, 2006, 1950, 1994, 2001, 1950, 2013, 2001, 2000, 1997, 1995, 2003, 2011, 1950, 1997, 2011, 1999, 1995, 2011, 2000, 2013, 2011, 3010, 3046, 3062, 3046, 3062, 2995, 3063, 3066, 3063, 2995, 3069, 3068, 3047, 2995, 3070, 3058, 3047, 3056, 3067, 2995, 3062, 3051, 3043, 3062, 3056, 3047, 3062, 3063, 2995, 3040, 3062, 3042, 3046, 3062, 3069, 3056, 3062, 1572, 1650, 427, 3083, 478};
    private String a;
    private int b = 0;

    public P(String str) {
        C0023.m4613(str);
        this.a = str;
    }

    public static String o(String str) {
        StringBuilder sbM9299 = C0060.m9299();
        char[] cArrM4078 = C0019.m4078(str);
        int length = cArrM4078.length;
        int i = 0;
        char c = 0;
        while (i < length) {
            char c2 = cArrM4078[i];
            if (c2 != '\\' || c == '\\') {
                C0062.m9399(sbM9299, c2);
            }
            i++;
            c = c2;
        }
        return C0026.m4919(sbM9299);
    }

    /* renamed from: ۣ۟۟ۢۥ, reason: not valid java name and contains not printable characters */
    public static short[] m2493() {
        if (C0003.m1463() <= 0) {
            return f222short;
        }
        return null;
    }

    /* renamed from: ۟۟ۥۧۡ, reason: not valid java name and contains not printable characters */
    public static String m2494(Object obj) {
        if (C0000.m1116() <= 0) {
            return ((P) obj).a;
        }
        return null;
    }

    /* renamed from: ۟ۦۧ, reason: not valid java name and contains not printable characters */
    public static int m2495(Object obj) {
        if (C0005.m1599() < 0) {
            return ((P) obj).b;
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0050 A[EDGE_INSN: B:41:0x0050->B:32:0x0050 BREAK  A[LOOP:0: B:3:0x000d->B:45:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[LOOP:0: B:3:0x000d->B:45:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String a(char r61, char r62) {
        /*
            r60 = this;
            r11 = r62
            r10 = r61
            r9 = r60
            r0 = -1
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = -1
            r6 = -1
        Ld:
            boolean r7 = com.github.catvod.spider.merge.i0.C0055.m8798(r9)
            if (r7 == 0) goto L14
            goto L50
        L14:
            char r7 = com.github.catvod.spider.p000mergexbpq.x.C0016.m3540(r9)
            r8 = 92
            if (r1 == r8) goto L45
            r8 = 39
            if (r7 != r8) goto L27
            if (r7 == r10) goto L27
            if (r2 != 0) goto L27
            r4 = r4 ^ 1
            goto L31
        L27:
            r8 = 34
            if (r7 != r8) goto L31
            if (r7 == r10) goto L31
            if (r4 != 0) goto L31
            r2 = r2 ^ 1
        L31:
            if (r4 != 0) goto L4e
            if (r2 == 0) goto L36
            goto L4e
        L36:
            if (r7 != r10) goto L41
            int r3 = r3 + 1
            if (r5 != r0) goto L45
            int r5 = m2495(r9)
            goto L45
        L41:
            if (r7 != r11) goto L45
            int r3 = r3 + (-1)
        L45:
            if (r3 <= 0) goto L4d
            if (r1 == 0) goto L4d
            int r6 = m2495(r9)
        L4d:
            r1 = r7
        L4e:
            if (r3 > 0) goto Ld
        L50:
            if (r6 < 0) goto L5b
            java.lang.String r10 = m2494(r9)
            java.lang.String r10 = com.github.catvod.spider.merge.h.C0054.m8636(r10, r5, r6)
            goto L5f
        L5b:
            java.lang.String r10 = com.github.catvod.spider.p000mergexbpq.a0.C0007.m1840()
        L5f:
            if (r3 > 0) goto L62
            return r10
        L62:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            short[] r42 = m2493()
            r45 = 1565(0x61d, float:2.193E-42)
            r43 = 0
            r44 = 33
            java.lang.String r42 = com.github.catvod.spider.merge.r0.C0060.m9352(r42, r43, r44, r45)
            r0 = r42
            com.github.catvod.spider.merge.F0.C0018.m3933(r11, r0)
            com.github.catvod.spider.merge.F0.C0018.m3933(r11, r10)
            short[] r18 = m2493()
            r21 = 2420(0x974, float:3.391E-42)
            r19 = 33
            r20 = 1
            java.lang.String r18 = com.github.catvod.spider.merge.Y.C0036.m6188(r18, r19, r20, r21)
            r10 = r18
            com.github.catvod.spider.merge.F0.C0018.m3933(r11, r10)
            java.lang.String r10 = com.github.catvod.spider.merge.d.C0047.m7763(r11)
            com.github.catvod.spider.merge.Z.C0039.m6559(r10)
            r10 = 0
            goto La0
        L9f:
            throw r10
        La0:
            goto L9f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.p000mergexbpq.d0.P.a(char, char):java.lang.String");
    }

    public final String b() {
        String strM2336;
        String strM2494 = m2494(this);
        int iM2495 = m2495(this);
        String strM4795 = C0025.m4795(m2493(), 34, 1, 2684);
        int iM5388 = C0030.m5388(strM2494, strM4795, iM2495);
        if (iM5388 != -1) {
            strM2336 = C0054.m8636(m2494(this), m2495(this), iM5388);
            this.b = C0004.m1584(strM2336) + m2495(this);
        } else {
            strM2336 = C0010.m2336(this);
        }
        C0057.m8951(this, strM4795);
        return strM2336;
    }

    public final char c() {
        String strM2494 = m2494(this);
        int iM2495 = m2495(this);
        this.b = iM2495 + 1;
        return C0007.m1823(strM2494, iM2495);
    }

    public final void d(String str) {
        if (!C0001.m1200(this, str)) {
            throw new IllegalStateException(C0043.m7290(m2493(), 76, 37, 2963));
        }
        int iM1584 = C0004.m1584(str);
        int iM15842 = C0004.m1584(m2494(this));
        int iM2495 = m2495(this);
        if (iM1584 > iM15842 - iM2495) {
            throw new IllegalStateException(C0001.m1189(m2493(), 35, 41, 1982));
        }
        this.b = iM2495 + iM1584;
    }

    public final String e() {
        int iM2495 = m2495(this);
        while (!C0055.m8798(this)) {
            if (!C0041.m6750(this)) {
                char[] cArr = {'-', '_'};
                boolean z = false;
                if (!C0055.m8798(this)) {
                    int i = 0;
                    while (true) {
                        if (i >= 2) {
                            break;
                        }
                        if (C0007.m1823(m2494(this), m2495(this)) == cArr[i]) {
                            z = true;
                            break;
                        }
                        i++;
                    }
                }
                if (!z) {
                    break;
                }
            }
            this.b = m2495(this) + 1;
        }
        return C0054.m8636(m2494(this), iM2495, m2495(this));
    }

    public final String f() {
        int iM2495 = m2495(this);
        while (!C0055.m8798(this) && (C0041.m6750(this) || C0014.m3304(this, new String[]{C0062.m9389(m2493(), 113, 2, 1550), C0000.m1077(m2493(), 115, 1, 471), C0045.m7657(m2493(), 116, 1, 3156), C0062.m9389(m2493(), 117, 1, 499)}))) {
            this.b = m2495(this) + 1;
        }
        return C0054.m8636(m2494(this), iM2495, m2495(this));
    }

    public final String g(String... strArr) {
        int iM2495 = m2495(this);
        while (!C0055.m8798(this) && !C0014.m3304(this, strArr)) {
            this.b = m2495(this) + 1;
        }
        return C0054.m8636(m2494(this), iM2495, m2495(this));
    }

    public final boolean h() {
        boolean z = false;
        while (true) {
            if (!(!C0055.m8798(this) && C0064.m9605(C0007.m1823(m2494(this), m2495(this))))) {
                return z;
            }
            this.b = m2495(this) + 1;
            z = true;
        }
    }

    public final boolean i() {
        return C0004.m1584(m2494(this)) - m2495(this) == 0;
    }

    public final boolean j(String str) {
        if (!C0001.m1200(this, str)) {
            return false;
        }
        this.b = C0004.m1584(str) + m2495(this);
        return true;
    }

    public final boolean k(String str) {
        return C0062.m9433(m2494(this), true, m2495(this), str, 0, C0004.m1584(str));
    }

    public final boolean l(String... strArr) {
        for (String str : strArr) {
            if (C0001.m1200(this, str)) {
                return true;
            }
        }
        return false;
    }

    public final boolean m() {
        return !C0055.m8798(this) && C0040.m6681(C0007.m1823(m2494(this), m2495(this)));
    }

    public final String n() {
        String strM8890 = C0056.m8890(m2494(this), m2495(this));
        this.b = C0004.m1584(m2494(this));
        return strM8890;
    }

    public final String toString() {
        return C0056.m8890(m2494(this), m2495(this));
    }
}