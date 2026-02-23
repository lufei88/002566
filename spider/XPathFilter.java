package com.github.catvod.spider;

import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.J0.C0021;
import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.c1.C0046;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.merge.z.C0065;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.c0.C0010;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.r.C0014;
import com.github.catvod.spider.p000mergexbpq.x.C0015;
import java.util.HashMap;
import java.util.Iterator;
import java.util.regex.Matcher;

/* loaded from: classes.dex */
public class XPathFilter extends XPath {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f126short = {1833, 2480, 2819, 2843, 2841, 2828, 2845, 2865, 2844, 2821, 2942, 2918, 2916, 2929, 2912, 2901, 2914, 2936, 262, 289, 370, 372, 368, 357, 371, 262, 295, 3207};

    /* renamed from: ۟ۤۡۨۡ, reason: not valid java name and contains not printable characters */
    public static short[] m747() {
        if (C0027.m5017() > 0) {
            return f126short;
        }
        return null;
    }

    @Override // com.github.catvod.spider.XPath
    public final String a(String str, String str2, boolean z, HashMap map) {
        String strM2280 = C0010.m2280(C0064.m9621(this));
        String strM1398 = C0003.m1398(m747(), 0, 1, 1876);
        String strM6188 = C0036.m6188(m747(), 1, 1, 2507);
        if (z && map != null && C0014.m3311(map) > 0) {
            Iterator itM5199 = C0029.m5199(C0000.m1121(map));
            while (C0012.m2962(itM5199)) {
                String str3 = (String) C0048.m7949(itM5199);
                String str4 = (String) C0065.m9715(map, str3);
                if (C0004.m1584(str4) > 0) {
                    strM2280 = C0015.m3446(strM2280, C0000.m1130(strM6188, str3, strM1398), C0056.m8909(str4));
                }
            }
        }
        String strM3446 = C0015.m3446(C0015.m3446(strM2280, C0046.m7718(m747(), 2, 8, 2936), str), C0033.m5852(m747(), 10, 8, 2821), str2);
        Matcher matcherM6026 = C0034.m6026(C0005.m1602(C0021.m4340(m747(), 18, 9, 346)), strM3446);
        while (C0003.m1405(matcherM6026)) {
            String strM4306 = C0021.m4306(matcherM6026, 0);
            String strM1840 = C0007.m1840();
            String strM34462 = C0015.m3446(C0015.m3446(strM4306, strM6188, strM1840), strM1398, strM1840);
            String strM34463 = C0015.m3446(strM3446, C0021.m4306(matcherM6026, 0), strM1840);
            String strM9389 = C0062.m9389(m747(), 27, 1, 3240);
            StringBuilder sb = new StringBuilder(strM9389);
            C0018.m3933(sb, strM34462);
            C0018.m3933(sb, strM9389);
            strM3446 = C0015.m3446(strM34463, C0047.m7763(sb), strM1840);
        }
        return strM3446;
    }

    @Override // com.github.catvod.spider.XPath
    public final void d(String str) {
    }
}