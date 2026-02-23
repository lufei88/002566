package com.github.catvod.spider.merge.P0;

import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.J0.C0021;
import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import java.io.Serializable;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class B implements Serializable {
    public final String a;
    public final TimeZone b;
    public final Locale c;
    public final transient t[] d;
    public final transient int e;

    /* renamed from: short, reason: not valid java name */
    private static final short[] f473short = {2263, 2290, 2290, 2299, 2297, 2303, 2290, 2238, 2286, 2303, 2282, 2282, 2299, 2284, 2288, 2238, 2301, 2289, 2291, 2286, 2289, 2288, 2299, 2288, 2282, 2212, 2238, 695, 688, 680, 703, 690, 695, 698, 766, 688, 683, 691, 700, 699, 684, 766, 689, 696, 766, 646, 316, 283, 265, 270, 318, 283, 270, 287, 298, 264, 275, 276, 270, 287, 264, 289, 1661, 1137};
    public static final t[] f = new t[0];
    public static final ConcurrentHashMap g = new ConcurrentHashMap(7);

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:121:0x025c A[LOOP:2: B:119:0x0258->B:121:0x025c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x00e4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0268 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0135  */
    /* JADX WARN: Type inference failed for: r15v11, types: [com.github.catvod.spider.merge.P0.x] */
    /* JADX WARN: Type inference failed for: r15v14, types: [com.github.catvod.spider.merge.P0.u] */
    /* JADX WARN: Type inference failed for: r15v15, types: [com.github.catvod.spider.merge.P0.o] */
    /* JADX WARN: Type inference failed for: r15v18, types: [com.github.catvod.spider.merge.P0.v] */
    /* JADX WARN: Type inference failed for: r15v19, types: [com.github.catvod.spider.merge.P0.v] */
    /* JADX WARN: Type inference failed for: r15v20, types: [com.github.catvod.spider.merge.P0.v] */
    /* JADX WARN: Type inference failed for: r15v26, types: [com.github.catvod.spider.merge.P0.v] */
    /* JADX WARN: Type inference failed for: r15v27, types: [com.github.catvod.spider.merge.P0.v] */
    /* JADX WARN: Type inference failed for: r15v29, types: [com.github.catvod.spider.merge.P0.q] */
    /* JADX WARN: Type inference failed for: r15v31, types: [com.github.catvod.spider.merge.P0.q] */
    /* JADX WARN: Type inference failed for: r15v32, types: [com.github.catvod.spider.merge.P0.q] */
    /* JADX WARN: Type inference failed for: r15v33, types: [com.github.catvod.spider.merge.P0.y] */
    /* JADX WARN: Type inference failed for: r15v34, types: [com.github.catvod.spider.merge.P0.y] */
    /* JADX WARN: Type inference failed for: r15v63, types: [com.github.catvod.spider.merge.P0.x] */
    /* JADX WARN: Type inference failed for: r15v64, types: [com.github.catvod.spider.merge.P0.x] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public B(java.lang.String r71, java.util.TimeZone r72, java.util.Locale r73) {
        /*
            Method dump skipped, instructions count: 696
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.P0.B.<init>(java.lang.String, java.util.TimeZone, java.util.Locale):void");
    }

    public static void a(StringBuilder sb, int i) {
        C0057.m8950(sb, (char) ((i / 10) + 48));
        C0057.m8950(sb, (char) ((i % 10) + 48));
    }

    public static void b(StringBuilder sb, int i, int i2) {
        int i3 = i2;
        int i4 = i;
        if (i4 < 10000) {
            int i5 = i4 < 1000 ? i4 < 100 ? i4 < 10 ? 1 : 2 : 3 : 4;
            for (int i6 = i3 - i5; i6 > 0; i6--) {
                C0057.m8950(sb, '0');
            }
            if (i5 != 1) {
                if (i5 != 2) {
                    if (i5 != 3) {
                        if (i5 != 4) {
                            return;
                        }
                        C0057.m8950(sb, (char) ((i4 / 1000) + 48));
                        i4 %= 1000;
                    }
                    if (i4 >= 100) {
                        C0057.m8950(sb, (char) ((i4 / 100) + 48));
                        i4 %= 100;
                    } else {
                        C0057.m8950(sb, '0');
                    }
                }
                if (i4 >= 10) {
                    C0057.m8950(sb, (char) ((i4 / 10) + 48));
                    i4 %= 10;
                } else {
                    C0057.m8950(sb, '0');
                }
            }
            C0057.m8950(sb, (char) (i4 + 48));
            return;
        }
        char[] cArr = new char[10];
        int i7 = 0;
        while (i4 != 0) {
            cArr[i7] = (char) ((i4 % 10) + 48);
            i4 /= 10;
            i7++;
        }
        while (i7 < i3) {
            C0057.m8950(sb, '0');
            i3--;
        }
        while (true) {
            i7--;
            if (i7 < 0) {
                return;
            } else {
                C0057.m8950(sb, cArr[i7]);
            }
        }
    }

    public static String c(TimeZone timeZone, boolean z, int i, Locale locale) {
        w wVar = new w(timeZone, z, i, locale);
        ConcurrentHashMap concurrentHashMapM7105 = C0042.m7105();
        String str = (String) C0030.m5374(concurrentHashMapM7105, wVar);
        if (str != null) {
            return str;
        }
        String strM3900 = C0018.m3900(timeZone, z, i, locale);
        String str2 = (String) C0031.m5655(concurrentHashMapM7105, wVar, strM3900);
        return str2 != null ? str2 : strM3900;
    }

    public static r d(int i, int i2) {
        return i2 != 1 ? i2 != 2 ? new s(i, i2) : new A(i, 0) : new A(i, 1);
    }

    /* renamed from: ۣ۟۠ۡۦ, reason: not valid java name and contains not printable characters */
    public static short[] m4629() {
        if (C0003.m1463() <= 0) {
            return f473short;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof B)) {
            return false;
        }
        B b = (B) obj;
        return C0007.m1815(C0000.m1055(this), C0000.m1055(b)) && C0058.m9103(C0044.m7392(this), C0044.m7392(b)) && C0027.m5024(C0035.m6122(this), C0035.m6122(b));
    }

    public final int hashCode() {
        return (((C0005.m1640(C0035.m6122(this)) * 13) + C0050.m8087(C0044.m7392(this))) * 13) + C0054.m8590(C0000.m1055(this));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(C0021.m4340(m4629(), 46, 16, 378));
        C0018.m3933(sb, C0000.m1055(this));
        String strM5062 = C0027.m5062(m4629(), 62, 1, 1617);
        C0018.m3933(sb, strM5062);
        C0016.m3605(sb, C0035.m6122(this));
        C0018.m3933(sb, strM5062);
        C0018.m3933(sb, C0057.m8967(C0044.m7392(this)));
        C0018.m3933(sb, C0009.m2037(m4629(), 63, 1, 1068));
        return C0047.m7763(sb);
    }
}