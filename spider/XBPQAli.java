package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.J0.C0021;
import com.github.catvod.spider.merge.N.C0023;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.r0.C0059;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.b.p;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.github.catvod.spider.p000mergexbpq.c.d;
import com.github.catvod.spider.p000mergexbpq.r.C0014;
import com.github.catvod.spider.p000mergexbpq.x.C0015;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public class XBPQAli extends Spider {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f120short = {2399, 2399, 2399, 2310, 2377, 2372, 2369, 2385, 2397, 2374, 2380, 2394, 2369, 2398, 2381, 2310, 2379, 2375, 2373, 2311, 2395, 2311, 2304, 2419, 2422, 2311, 2421, 2307, 2305, 2304, 2311, 2382, 2375, 2372, 2380, 2381, 2394, 2311, 2304, 2419, 2422, 2311, 2421, 2307, 2305, 2305, 2327, 2040, 2037, 2044, 2025, 1998, 1992, 2015, 2093, 2102, 2098, 2108, 2103, 1695, 1695, 1695, 1734, 1673, 1668, 1665, 1688, 1673, 1670, 1734, 1675, 1671, 1669, 3169, 3169, 3169, 3128, 3191, 3194, 3199, 3183, 3171, 3192, 3186, 3172, 3199, 3168, 3187, 3128, 3189, 3193, 3195, 1494, 1441, 2053, 23460, 32000, 2055};
    public static final Pattern a = C0005.m1602(C0047.m7833(m734(), 0, 47, 2344));

    public static Object[] proxy(Map<String, String> map) {
        String str = (String) C0062.m9431(map, C0056.m8911(m734(), 47, 4, 1932));
        if (C0007.m1815(str, C0017.m3646(m734(), 51, 3, 1981))) {
            return C0032.m5770(C0004.m1555(), map);
        }
        if (C0007.m1815(str, C0018.m3917(m734(), 54, 5, 2137))) {
            return C0008.m2010(C0004.m1555());
        }
        return null;
    }

    /* renamed from: ۥۥۦۣ, reason: contains not printable characters */
    public static short[] m734() {
        if (C0014.m3353() <= 0) {
            return f120short;
        }
        return null;
    }

    public String detailContent(List<String> list) {
        String strM1840 = C0007.m1840();
        try {
            String strM3446 = C0015.m3446(C0064.m9640((String) C0048.m7915(list, 0)), C0058.m9106(m734(), 59, 14, 1768), C0062.m9389(m734(), 73, 19, 3094));
            Matcher matcherM6026 = C0034.m6026(C0023.m4597(), strM3446);
            if (!C0003.m1405(matcherM6026)) {
                return strM1840;
            }
            String strM4306 = C0021.m4306(matcherM6026, 1);
            String strM43062 = C0017.m3696(matcherM6026) == 3 ? C0021.m4306(matcherM6026, 3) : strM1840;
            C0059.m9246(C0004.m1555(), strM4306);
            return C0030.m5373(C0041.m6746(C0004.m1555(), strM3446, strM43062));
        } catch (Exception unused) {
            return strM1840;
        }
    }

    public void init(Context context, String str) {
        C0047.m7806(C0004.m1555(), str);
    }

    public String playerContent(String str, String str2, List<String> list) {
        try {
            String[] strArrM4752 = C0024.m4752(str2, C0032.m5708(m734(), 92, 2, 1418));
            if (!C0007.m1815(str, C0008.m1970(m734(), 94, 4, 2107))) {
                return C0051.m8235(C0004.m1555(), strArrM4752, str);
            }
            p pVarM1555 = C0004.m1555();
            C0047.m7777(pVarM1555);
            d dVar = new d();
            C0034.m5966(dVar, C0050.m8085(pVarM1555, strArrM4752[0]));
            C0005.m1656(dVar, C0043.m7281(pVarM1555, strArrM4752));
            C0024.m4713(dVar, C0030.m5359(pVarM1555));
            return C0016.m3607(dVar);
        } catch (Exception unused) {
            return C0007.m1840();
        }
    }
}