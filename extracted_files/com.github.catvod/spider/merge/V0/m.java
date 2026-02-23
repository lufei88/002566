package com.github.catvod.spider.merge.V0;

import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.J0.C0021;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.a0.C0006;
import com.github.catvod.spider.p000mergexbpq.c0.C0010;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class m extends n {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f642short = {2457, 2510, 2498, 2519, 2496, 2507, 2502, 2512, 2548, 2507, 2508, 2511, 2502, 2551, 2502, 2523, 2519, 2443, 2267, 2735, 2808, 2804, 2785, 2806, 2813, 2800, 2790, 2754, 2813, 2810, 2809, 2800, 2778, 2786, 2811, 2753, 2800, 2797, 2785, 2749, 1782, 1212, 1259, 1255, 1266, 1253, 1262, 1251, 1269, 1225, 1265, 1256, 1198, 1399, 1765, 1714, 1726, 1707, 1724, 1719, 1722, 1708, 1783, 2954};
    public final /* synthetic */ int a;
    public final Pattern b;

    public /* synthetic */ m(Pattern pattern, int i) {
        this.a = i;
        this.b = pattern;
    }

    /* renamed from: ۨۢۡۡ, reason: not valid java name and contains not printable characters */
    public static short[] m5907() {
        if (C0053.m8389() > 0) {
            return f642short;
        }
        return null;
    }

    @Override // com.github.catvod.spider.merge.V0.n
    public final boolean a(com.github.catvod.spider.merge.T0.m mVar, com.github.catvod.spider.merge.T0.m mVar2) {
        switch (C0048.m7912(this)) {
            case 0:
                return C0003.m1405(C0034.m6026(C0001.m1232(this), C0064.m9669(mVar2)));
            case 1:
                return C0003.m1405(C0034.m6026(C0001.m1232(this), C0055.m8697(mVar2)));
            case 2:
                return C0003.m1405(C0034.m6026(C0001.m1232(this), C0055.m8778(mVar2)));
            default:
                C0047.m7777(mVar2);
                StringBuilder sbM8572 = C0054.m8572();
                C0006.m1738(new com.github.catvod.spider.merge.T0.j(sbM8572), mVar2);
                return C0003.m1405(C0034.m6026(C0001.m1232(this), C0004.m1543(sbM8572)));
        }
    }

    public final String toString() {
        switch (C0048.m7912(this)) {
            case 0:
                StringBuilder sb = new StringBuilder(C0064.m9599(m5907(), 54, 9, 1759));
                C0016.m3605(sb, C0001.m1232(this));
                C0018.m3933(sb, C0042.m7151(m5907(), 63, 1, 2979));
                return C0047.m7763(sb);
            case 1:
                StringBuilder sb2 = new StringBuilder(C0021.m4340(m5907(), 41, 12, 1158));
                C0016.m3605(sb2, C0001.m1232(this));
                C0018.m3933(sb2, C0028.m5109(m5907(), 53, 1, 1374));
                return C0047.m7763(sb2);
            case 2:
                StringBuilder sb3 = new StringBuilder(C0053.m8477(m5907(), 19, 21, 2709));
                C0016.m3605(sb3, C0001.m1232(this));
                C0018.m3933(sb3, C0035.m6131(m5907(), 40, 1, 1759));
                return C0047.m7763(sb3);
            default:
                StringBuilder sb4 = new StringBuilder(C0029.m5256(m5907(), 0, 18, 2467));
                C0016.m3605(sb4, C0001.m1232(this));
                C0018.m3933(sb4, C0010.m2300(m5907(), 18, 1, 2290));
                return C0047.m7763(sb4);
        }
    }
}