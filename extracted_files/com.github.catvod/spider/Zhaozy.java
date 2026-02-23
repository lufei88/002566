package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.J0.C0021;
import com.github.catvod.spider.merge.N.C0023;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.T0.h;
import com.github.catvod.spider.merge.T0.m;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.Z.C0040;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.t.C0061;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.c0.C0010;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.x.C0015;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public class Zhaozy extends Ali {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f137short = {2698, 2762, 2774, 2774, 2770, 2769, 2712, 2701, 2701, 2773, 2773, 2773, 2700, 2755, 2766, 2763, 2779, 2775, 2764, 2758, 2768, 2763, 2772, 2759, 2700, 2753, 2765, 2767, 2701, 2769, 2701, 2809, 2812, 2688, 2815, 2697, 2699, 886, 770, 781, 885, 887, 2287, 2291, 2291, 2295, 2292, 2237, 2216, 2216, 2301, 2287, 2278, 2280, 2301, 2286, 2302, 2290, 2278, 2281, 2230, 2217, 2276, 2276, 2216, 973, 1003, 1021, 1002, 949, 985, 1023, 1021, 1014, 1004, 1410, 1440, 1461, 1446, 1443, 1443, 1454, 1504, 1530, 1505, 1535, 1519, 1511, 1432, 1446, 1441, 1451, 1440, 1464, 1468, 1519, 1409, 1435, 1519, 1534, 1535, 1505, 1535, 1524, 1519, 1432, 1446, 1441, 1529, 1531, 1524, 1519, 1463, 1529, 1531, 1510, 1519, 1422, 1471, 1471, 1443, 1450, 1432, 1450, 1453, 1412, 1446, 1467, 1504, 1530, 1532, 1528, 1505, 1532, 1529, 1519, 1511, 1412, 1415, 1435, 1410, 1411, 1507, 1519, 1443, 1446, 1444, 1450, 1519, 1416, 1450, 1452, 1444, 1440, 1510, 1519, 1420, 1447, 1469, 1440, 1442, 1450, 1504, 1534, 1533, 1533, 1505, 1535, 1505, 1535, 1505, 1535, 1519, 1436, 1454, 1449, 1454, 1469, 1446, 1504, 1530, 1532, 1528, 1505, 1532, 1529, 2839, 2848, 2851, 2848, 2871, 2848, 2871, 2643, 2603, 2643, 2603, 2643, 2603, 1147, 1149, 1131, 1148, 1120, 1135, 1123, 1131, 2168, 2153, 2171, 2171, 2175, 2151, 2170, 2156, 1490, 1524, 1506, 1525, 1450, 1478, 1504, 1506, 1513, 1523, 2212, 2182, 2195, 2176, 2181, 2181, 2184, 2246, 2268, 2247, 2265, 2249, 2241, 2238, 2176, 2183, 2189, 2182, 2206, 2202, 2249, 2215, 2237, 2249, 2264, 2265, 2247, 2265, 2258, 2249, 2238, 2176, 2183, 2271, 2269, 2258, 2249, 2193, 2271, 2269, 2240, 2249, 2216, 2201, 2201, 2181, 2188, 2238, 2188, 2187, 2210, 2176, 2205, 2246, 2268, 2266, 2270, 2247, 2266, 2271, 2249, 2241, 2210, 2209, 2237, 2212, 2213, 2245, 2249, 2181, 2176, 2178, 2188, 2249, 2222, 2188, 2186, 2178, 2182, 2240, 2249, 2218, 2177, 2203, 2182, 2180, 2188, 2246, 2264, 2267, 2267, 2247, 2265, 2247, 2265, 2247, 2265, 2249, 2234, 2184, 2191, 2184, 2203, 2176, 2246, 2268, 2266, 2270, 2247, 2266, 2271, 1133, 1114, 1113, 1114, 1101, 1114, 1101, 2005, 1993, 1993, 1997, 1998, 1927, 1938, 1938, 1991, 2005, 2012, 2002, 1991, 2004, 1988, 1992, 2012, 2003, 1932, 1939, 2014, 2014, 1938, 1998, 1993, 2002, 1997, 1939, 2005, 1993, 2000, 2001, 558, 531, 520, 518, 520, 527, 837, 857, 857, 861, 862, 791, 770, 770, 855, 837, 844, 834, 855, 836, 852, 856, 844, 835, 796, 771, 846, 846, 770, 1885, 1857, 1857, 1861, 1862, 1807, 1818, 1818, 1871, 1885, 1876, 1882, 1871, 1884, 1868, 1856, 1876, 1883, 1796, 1819, 1878, 1878, 1818, 1881, 1882, 1874, 1884, 1856, 1819, 1885, 1857, 1880, 1881, 2734, 2738, 2738, 2742, 2741, 2812, 2793, 2793, 2748, 2734, 2727, 2729, 2748, 2735, 2751, 2739, 2727, 2728, 2807, 2792, 2725, 2725, 2793, 2741, 2729, 2809, 2720, 2735, 2730, 2723, 2728, 2727, 2731, 2723, 2811, 2002, 2036, 2018, 2037, 1962, 1990, 2016, 2018, 2025, 2035, 2314, 2344, 2365, 2350, 2347, 2347, 2342, 2408, 2418, 2409, 2423, 2407, 2415, 2320, 2350, 2345, 2339, 2344, 2352, 2356, 2407, 2313, 2323, 2407, 2422, 2423, 2409, 2423, 2428, 2407, 2320, 2350, 2345, 2417, 2419, 2428, 2407, 2367, 2417, 2419, 2414, 2407, 2310, 2359, 2359, 2347, 2338, 2320, 2338, 2341, 2316, 2350, 2355, 2408, 2418, 2420, 2416, 2409, 2420, 2417, 2407, 2415, 2316, 2319, 2323, 2314, 2315, 2411, 2407, 2347, 2350, 2348, 2338, 2407, 2304, 2338, 2340, 2348, 2344, 2414, 2407, 2308, 2351, 2357, 2344, 2346, 2338, 2408, 2422, 2421, 2421, 2409, 2423, 2409, 2423, 2409, 2423, 2407, 2324, 2342, 2337, 2342, 2357, 2350, 2408, 2418, 2420, 2416, 2409, 2420, 2417, 1611, 1660, 1663, 1660, 1643, 1660, 1643, 2121, 2133, 2133, 2129, 2130, 2075, 2062, 2062, 2139, 2121, 2112, 2126, 2139, 2120, 2136, 2132, 2112, 2127, 2064, 2063, 2114, 2114, 2062, 1982, 1971, 1964, 2036, 1974, 1971, 1925, 1977, 1973, 1972, 2042, 1982, 1971, 1964, 2036, 1972, 1983, 1965, 1961, 1925, 1966, 1983, 1954, 1966, 1232, 1245, 1218, 1178, 1242, 1233, 1219, 1223, 1259, 1216, 1233, 1228, 1216, 1172, 1237, 1321, 1331, 1316, 1319, 2407, 2410, 2421, 2349, 2413, 2406, 2420, 2416, 2396, 2423, 2406, 2427, 2423, 2339, 2402, 2339, 2411, 2352, 3273, 3268, 3291, 3203, 3267, 3272, 3290, 3294, 3314, 3289, 3272, 3285, 3289, 3213, 3276, 3213, 3293, 1164, 1196, -1557, 1215, 1187, 1187, 1191, 1188, 1261, 1272, 1272, 1214, 1209, 1202, 1184, 1188, 1273, 1200, 1187, 1214, 1210, 1200, 1273, 1204, 1208, 1210, 1272, 1209, 1202, 1184, 1188, 1206, 1191, 1191, 1160, 1205, 1187, 1272, 1255, 1272, 1254, 1252, 1253, 1249, 1252, 1263, 1252, 1248, 1263, 1250, 1262, 1272, 1254, 1255, 1255, 1255};
    public final Pattern b = C0005.m1602(C0010.m2300(m780(), 0, 37, 2722));
    public final Pattern c = C0005.m1602(C0039.m6551(m780(), 37, 5, 862));
    public String d;
    public String e;

    /* renamed from: ۨ۟ۨ۟, reason: not valid java name and contains not printable characters */
    public static short[] m780() {
        if (C0057.m9017() >= 0) {
            return f137short;
        }
        return null;
    }

    @Override // com.github.catvod.spider.Ali
    public String detailContent(List<String> list) {
        if (C0003.m1405(C0034.m6026(C0044.m7486(), (CharSequence) C0048.m7915(list, 0)))) {
            return super.detailContent(list);
        }
        String strM4740 = C0024.m4740(m780(), 42, 23, 2183);
        StringBuilder sb = new StringBuilder(strM4740);
        C0018.m3933(sb, (String) C0048.m7915(list, 0));
        String strM7763 = C0047.m7763(sb);
        HashMap map = new HashMap();
        C0053.m8424(map, C0034.m6001(m780(), 65, 10, 920), C0035.m6131(m780(), 75, 111, 1487));
        C0053.m8424(map, C0023.m4536(m780(), 186, 7, 2885), strM4740);
        Matcher matcherM6026 = C0034.m6026(C0064.m9648(this), C0032.m5769(strM7763, map));
        return C0003.m1405(matcherM6026) ? super.detailContent(C0001.m1203(new String[]{C0021.m4306(matcherM6026, 1)})) : C0007.m1840();
    }

    @Override // com.github.catvod.spider.Ali
    public void init(Context context, String str) {
        String[] strArrM4752 = C0024.m4752(str, C0020.m4199(m780(), 193, 6, 2575));
        super.init(context, strArrM4752[0]);
        this.d = strArrM4752[1];
        this.e = strArrM4752[2];
        HashMap map = new HashMap();
        C0053.m8424(map, C0004.m1549(m780(), 199, 8, 1038), C0017.m3679(this));
        C0053.m8424(map, C0064.m9599(m780(), 207, 8, 2056), C0039.m6555(this));
        HashMap map2 = new HashMap();
        C0053.m8424(map2, C0016.m3525(m780(), 215, 10, 1415), C0037.m6307(m780(), 225, 111, 2281));
        C0053.m8424(map2, C0033.m5852(m780(), 336, 7, 1087), C0040.m6584(m780(), 343, 32, 1981));
        C0053.m8424(map2, C0038.m6452(m780(), 375, 6, 609), C0015.m3484(m780(), 381, 23, 813));
        C0003.m1396(C0050.m8131(m780(), 404, 33, 1845), map, map2);
    }

    public String searchContent(String str, boolean z) {
        StringBuilder sb = new StringBuilder(C0039.m6551(m780(), 437, 35, 2758));
        C0018.m3933(sb, C0056.m8909(str));
        String strM7763 = C0047.m7763(sb);
        HashMap map = new HashMap();
        C0053.m8424(map, C0023.m4536(m780(), 472, 10, 1927), C0064.m9599(m780(), 482, 111, 2375));
        C0053.m8424(map, C0007.m1842(m780(), 593, 7, 1561), C0061.m9361(m780(), 600, 23, 2081));
        h hVarM3577 = C0016.m3577(C0032.m5769(strM7763, map));
        ArrayList arrayList = new ArrayList();
        Iterator itM7807 = C0047.m7807(C0030.m5333(hVarM3577, C0044.m7509(m780(), 623, 24, 2010)));
        while (C0012.m2962(itM7807)) {
            m mVar = (m) C0048.m7949(itM7807);
            Matcher matcherM6026 = C0034.m6026(C0054.m8623(this), C0049.m8058(C0030.m5333(mVar, C0003.m1398(m780(), 647, 15, 1204)), C0009.m2037(m780(), 662, 4, 1345)));
            if (C0003.m1405(matcherM6026)) {
                String strM4684 = C0024.m4684(C0030.m5333(mVar, C0061.m9361(m780(), 666, 18, 2307)));
                if (C0058.m9127(strM4684, str)) {
                    String str2 = C0024.m4752(C0024.m4752(C0024.m4684(C0030.m5333(mVar, C0041.m6779(m780(), 684, 17, 3245))), C0017.m3646(m780(), 701, 2, 1232))[1], C0021.m4340(m780(), 703, 1, 1777))[1];
                    com.github.catvod.spider.merge.E.m mVar2 = new com.github.catvod.spider.merge.E.m();
                    C0026.m4947(mVar2, C0005.m1645(m780(), 704, 53, 1239));
                    C0011.m2828(mVar2, C0021.m4306(matcherM6026, 1));
                    C0019.m4073(mVar2, str2);
                    C0005.m1628(mVar2, strM4684);
                    C0004.m1532(arrayList, mVar2);
                }
            }
        }
        return C0047.m7783(arrayList);
    }
}