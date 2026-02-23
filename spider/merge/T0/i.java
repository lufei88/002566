package com.github.catvod.spider.merge.T0;

import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.J0.C0021;
import com.github.catvod.spider.merge.N.C0023;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.merge.f0.C0052;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.r0.C0060;
import com.github.catvod.spider.merge.z.C0065;
import com.github.catvod.spider.p000mergexbpq.a0.C0006;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.j.C0013;

/* loaded from: classes.dex */
public final class i extends q {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f506short = {994, 1005, 993, 1001, 728, 733, 714, 708, 705, 715, 737, 716, 2871, 2877, 2871, 2864, 2849, 2857, 2829, 2848, 2691, 2694, 2705, 2720, 2698, 2688, 2744, 2710, 2698, 2194, 2199, 2176, 2190, 2187, 2177, 2472, 2466, 2472, 2479, 2494, 2486, 1684, 1747, 1752, 1748, 1731, 1742, 1735, 1746, 3158, 3164, 3158, 3153, 3136, 3144, 3180, 3137, 999, 994, 1013, 1019, 1022, 1012, 990, 1011, 1842, 1839, 1898, 1889, 1901, 1914, 1911, 1918, 1899, 2143, 2114, 2087, 2092, 2080, 2103, 2106, 2099, 2086, 1399, 1400, 1396, 1404, 3209, 3055, 3050, 3069, 3020, 3046, 3052, 3028, 3066, 3046, 2041, 2043};

    public i(String str, String str2, String str3) {
        String strM8131;
        C0065.m9779(str);
        C0065.m9779(str2);
        C0065.m9779(str3);
        C0021.m4329(this, C0052.m8337(m5320(), 0, 4, 908), str);
        String strM9775 = C0065.m9775(m5320(), 4, 8, 680);
        C0021.m4329(this, strM9775, str2);
        String strM1774 = C0006.m1774(m5320(), 12, 8, 2884);
        C0021.m4329(this, strM1774, str3);
        boolean zM2055 = C0009.m2055(this, strM9775);
        String strM5852 = C0033.m5852(m5320(), 20, 9, 2803);
        if (zM2055) {
            strM8131 = C0052.m8337(m5320(), 29, 6, 2242);
        } else if (!C0009.m2055(this, strM1774)) {
            return;
        } else {
            strM8131 = C0050.m8131(m5320(), 35, 6, 2555);
        }
        C0021.m4329(this, strM5852, strM8131);
    }

    /* renamed from: ۟ۢ۟۟ۦ, reason: not valid java name and contains not printable characters */
    public static short[] m5320() {
        if (C0019.m4065() < 0) {
            return f506short;
        }
        return null;
    }

    public final boolean A(String str) {
        return !C0028.m5134(C0050.m8152(this, str));
    }

    @Override // com.github.catvod.spider.merge.T0.r
    public final String o() {
        return C0019.m4107(m5320(), 41, 8, 1719);
    }

    @Override // com.github.catvod.spider.merge.T0.r
    public final void q(Appendable appendable, int i, g gVar) {
        if (C0035.m6143(this) > 0 && C0043.m7337(gVar)) {
            C0045.m7565(appendable, '\n');
        }
        int iM3081 = C0013.m3081(gVar);
        String strM9352 = C0060.m9352(m5320(), 49, 8, 3109);
        String strM2037 = C0009.m2037(m5320(), 57, 8, 919);
        C0024.m4699(appendable, (iM3081 != 1 || C0009.m2055(this, strM2037) || C0009.m2055(this, strM9352)) ? C0026.m4951(m5320(), 74, 9, 2147) : C0056.m8911(m5320(), 65, 9, 1806));
        String strM6452 = C0038.m6452(m5320(), 83, 4, 1305);
        boolean zM2055 = C0009.m2055(this, strM6452);
        String strM4536 = C0023.m4536(m5320(), 87, 1, 3241);
        if (zM2055) {
            C0024.m4699(C0024.m4699(appendable, strM4536), C0050.m8152(this, strM6452));
        }
        String strM8337 = C0052.m8337(m5320(), 88, 9, 2975);
        if (C0009.m2055(this, strM8337)) {
            C0024.m4699(C0024.m4699(appendable, strM4536), C0050.m8152(this, strM8337));
        }
        boolean zM20552 = C0009.m2055(this, strM2037);
        String strM7290 = C0043.m7290(m5320(), 97, 2, 2009);
        if (zM20552) {
            C0045.m7565(C0024.m4699(C0024.m4699(appendable, strM7290), C0050.m8152(this, strM2037)), '\"');
        }
        if (C0009.m2055(this, strM9352)) {
            C0045.m7565(C0024.m4699(C0024.m4699(appendable, strM7290), C0050.m8152(this, strM9352)), '\"');
        }
        C0045.m7565(appendable, '>');
    }

    @Override // com.github.catvod.spider.merge.T0.r
    public final void r(Appendable appendable, int i, g gVar) {
    }
}