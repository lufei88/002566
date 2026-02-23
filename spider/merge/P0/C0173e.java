package com.github.catvod.spider.merge.P0;

import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.Z.C0040;
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.r0.C0060;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.merge.z.C0065;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.a0.C0006;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.r.C0014;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.TreeSet;

/* renamed from: com.github.catvod.spider.merge.P0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0173e extends i {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f479short = {1862, 1862, 1873, 1799, 1819, 1863, 1366, 2071, 2101, 2087, 2097, 2077, 2106, 2087, 2097, 2106, 2087, 2109, 2080, 2109, 2082, 2097, 2048, 2097, 2092, 2080, 2055, 2080, 2086, 2101, 2080, 2097, 2099, 2093, 2164, 2063, 2098, 2109, 2097, 2104, 2096, 2153, 667, 663, 731, 728, 724, 726, 731, 722, 650, 2273, 2285, 2209, 2182, 2216, 2228, 2203, 2220, 2209, 2232, 2216, 2238, 2288, 3181, 3169, 3121, 3104, 3125, 3125, 3108, 3123, 3119, 3196, 1658};
    public final int b;
    public final Locale c;
    public final HashMap d;

    public C0173e(int i, Calendar calendar, Locale locale) {
        this.b = i;
        this.c = C0060.m9324(locale);
        StringBuilder sbM5621 = C0031.m5621(C0011.m2805(m4635(), 0, 6, 1902));
        HashMap map = new HashMap();
        Locale localeM9324 = C0060.m9324(locale);
        Map mapM8987 = C0057.m8987(calendar, i, 0, localeM9324);
        TreeSet treeSet = new TreeSet(C0064.m9678());
        Iterator itM5199 = C0029.m5199(C0058.m9142(mapM8987));
        while (C0012.m2962(itM5199)) {
            Map.Entry entry = (Map.Entry) C0048.m7949(itM5199);
            String strM6565 = C0039.m6565((String) C0045.m7624(entry), localeM9324);
            if (C0037.m6367(treeSet, strM6565)) {
                C0053.m8424(map, strM6565, C0039.m6540(entry));
            }
        }
        Iterator itM1365 = C0003.m1365(treeSet);
        while (C0012.m2962(itM1365)) {
            C0000.m1075(sbM5621, (String) C0048.m7949(itM1365));
            C0062.m9399(sbM5621, '|');
        }
        this.d = map;
        C0040.m6655(sbM5621, C0006.m1693(sbM5621) - 1);
        C0018.m3933(sbM5621, C0050.m8131(m4635(), 6, 1, 1407));
        this.a = C0005.m1602(C0047.m7763(sbM5621));
    }

    /* renamed from: ۣۡۤ۠, reason: not valid java name and contains not printable characters */
    public static short[] m4635() {
        if (C0007.m1886() >= 0) {
            return f479short;
        }
        return null;
    }

    @Override // com.github.catvod.spider.merge.P0.i
    public final void c(Calendar calendar, String str) {
        String strM6565 = C0039.m6565(str, C0014.m3293(this));
        HashMap mapM6561 = C0039.m6561(this);
        Integer num = (Integer) C0065.m9715(mapM6561, strM6565);
        if (num == null) {
            StringBuilder sb = new StringBuilder();
            C0018.m3933(sb, strM6565);
            C0062.m9399(sb, '.');
            num = (Integer) C0065.m9715(mapM6561, C0047.m7763(sb));
        }
        C0065.m9714(calendar, C0034.m5996(this), C0024.m4690(num));
    }

    @Override // com.github.catvod.spider.merge.P0.i
    public final String toString() {
        StringBuilder sb = new StringBuilder(C0063.m9585(m4635(), 7, 35, 2132));
        C0036.m6177(sb, C0034.m5996(this));
        C0018.m3933(sb, C0040.m6584(m4635(), 42, 9, 695));
        C0016.m3605(sb, C0014.m3293(this));
        C0018.m3933(sb, C0055.m8814(m4635(), 51, 13, 2253));
        C0016.m3605(sb, C0039.m6561(this));
        C0018.m3933(sb, C0055.m8814(m4635(), 64, 10, 3137));
        C0016.m3605(sb, C0053.m8402(this));
        C0018.m3933(sb, C0014.m3332(m4635(), 74, 1, 1575));
        return C0047.m7763(sb);
    }
}