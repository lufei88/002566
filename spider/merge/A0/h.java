package com.github.catvod.spider.merge.A0;

import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;

/* loaded from: classes.dex */
public abstract class h extends g {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f371short = {1063, 1135, 1139, 1138, 1128, 1061, 2118, 2114, 2136, 2136, 2114, 2117, 2124, 2159, 2126, 2119, 2114, 2118, 2114, 2143, 2126, 2137, 2173, 2122, 2119, 2142, 2126, 2341, 2339, 2356, 2341, 2338, 2340, 2367, 2360, 2353, 2430, 2424, 2424, 2424, 2431};

    public static String e(String str) {
        C0057.m8982(str, C0043.m7290(m3616(), 0, 6, 1051));
        C0057.m8982(str, C0005.m1645(m3616(), 6, 21, 2091));
        int iM5592 = C0031.m5592(str, 46, C0004.m1584(str) - 1);
        if (iM5592 == -1) {
            return str;
        }
        String strM8636 = C0054.m8636(str, iM5592 + 1, C0004.m1584(str));
        C0055.m8753(strM8636, C0007.m1842(m3616(), 27, 14, 2390));
        return strM8636;
    }

    /* renamed from: ۣۢۤ۟, reason: not valid java name and contains not printable characters */
    public static short[] m3616() {
        if (C0004.m1557() < 0) {
            return f371short;
        }
        return null;
    }
}