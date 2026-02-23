package com.github.catvod.spider;

import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.J0.C0021;
import com.github.catvod.spider.merge.N.C0023;
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.merge.z.C0065;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.a0.C0006;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.c0.C0010;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.r.C0014;
import com.github.catvod.spider.p000mergexbpq.x.C0015;
import java.util.HashMap;
import java.util.Iterator;
import java.util.regex.Matcher;

/* loaded from: classes.dex */
public class XPathMacFilter extends XPathMac {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f128short = {2614, 1842, 1883, 1859, 1857, 1876, 1861, 1897, 1860, 1885, 3088, 3080, 3082, 3103, 3086, 3131, 3084, 3094, 2251, 2284, 2239, 2233, 2237, 2216, 2238, 2251, 2282, 1403};

    /* renamed from: ۣ۟ۢۧ۠, reason: not valid java name and contains not printable characters */
    public static short[] m751() {
        if (C0053.m8389() >= 0) {
            return f128short;
        }
        return null;
    }

    @Override // com.github.catvod.spider.XPath
    public final String a(String str, String str2, boolean z, HashMap map) {
        String strM2280 = C0010.m2280(C0064.m9621(this));
        String strM6131 = C0035.m6131(m751(), 0, 1, 2635);
        String strM8978 = C0057.m8978(m751(), 1, 1, 1865);
        if (z && map != null && C0014.m3311(map) > 0) {
            Iterator itM5199 = C0029.m5199(C0000.m1121(map));
            while (C0012.m2962(itM5199)) {
                String str3 = (String) C0048.m7949(itM5199);
                String str4 = (String) C0065.m9715(map, str3);
                if (C0004.m1584(str4) > 0) {
                    strM2280 = C0015.m3446(strM2280, C0000.m1130(strM8978, str3, strM6131), C0056.m8909(str4));
                }
            }
        }
        String strM3446 = C0015.m3446(C0015.m3446(strM2280, C0023.m4536(m751(), 2, 8, 1824), str), C0004.m1549(m751(), 10, 8, 3179), str2);
        Matcher matcherM6026 = C0034.m6026(C0005.m1602(C0054.m8574(m751(), 18, 9, 2199)), strM3446);
        while (C0003.m1405(matcherM6026)) {
            String strM4306 = C0021.m4306(matcherM6026, 0);
            String strM1840 = C0007.m1840();
            String strM34462 = C0015.m3446(C0015.m3446(strM4306, strM8978, strM1840), strM6131, strM1840);
            String strM34463 = C0015.m3446(strM3446, C0021.m4306(matcherM6026, 0), strM1840);
            String strM1774 = C0006.m1774(m751(), 27, 1, 1364);
            StringBuilder sb = new StringBuilder(strM1774);
            C0018.m3933(sb, strM34462);
            C0018.m3933(sb, strM1774);
            strM3446 = C0015.m3446(strM34463, C0047.m7763(sb), strM1840);
        }
        return strM3446;
    }
}