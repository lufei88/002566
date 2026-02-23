package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.J0.C0021;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.N.C0023;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.S.a;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.Z.C0040;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.a0.C0246g;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.merge.f0.C0052;
import com.github.catvod.spider.merge.g0.AbstractC0308c;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.r0.C0060;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.merge.z.C0065;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.a0.C0006;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.c0.C0010;
import com.github.catvod.spider.p000mergexbpq.r.C0014;
import com.github.catvod.spider.p000mergexbpq.x.C0015;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class Cloud extends Spider {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f10short = {2390, 2326, 2314, 2314, 2318, 2317, 2372, 2338, 2385, 2338, 2385, 2313, 2313, 2313, 2338, 2384, 2335, 2322, 2327, 2311, 2315, 2320, 2330, 2316, 2327, 2312, 2331, 2338, 2384, 2333, 2321, 2323, 2338, 2385, 2317, 2338, 2385, 2341, 2336, 2396, 2339, 2389, 2306, 2326, 2314, 2314, 2318, 2317, 2372, 2338, 2385, 2338, 2385, 2313, 2313, 2313, 2338, 2384, 2335, 2322, 2327, 2318, 2335, 2320, 2338, 2384, 2333, 2321, 2323, 2338, 2385, 2317, 2338, 2385, 2341, 2336, 2396, 2339, 2389, 2391, 3039, 2975, 2947, 2947, 2951, 2948, 3021, 2987, 3032, 2987, 3032, 2944, 2944, 2944, 2987, 3033, 3014, 3013, 3012, 3023, 3009, 3010, 2987, 3033, 2964, 2968, 2970, 2987, 3032, 2948, 2987, 3032, 2988, 2985, 3029, 2986, 3036, 3038, 482, 418, 446, 446, 442, 441, 496, 406, 485, 406, 485, 442, 427, 420, 406, 484, 443, 447, 427, 440, 417, 406, 484, 425, 420, 406, 485, 441, 406, 485, 401, 404, 488, 407, 481, 483, 3009, 2945, 2973, 2973, 2969, 2970, 3027, 2997, 3014, 2997, 3014, 2957, 2971, 2944, 2975, 2956, 2997, 3015, 2972, 2954, 2997, 3015, 2954, 2951, 2997, 3014, 2970, 2997, 3014, 2994, 2999, 3019, 2996, 3010, 3008, 2024, 2021, 2046, 2044, 2037, 2041, 289, 289, 289, 376, 359, 356, 357, 2248, 2247, 2244, 2270, 2255, 2181, 2202, 2195, 2194, 2426, 2425, 2417, 2428, 2413, 594, 597, 597, 605, 1433, 665, 669, 649, 666, 643, 1397, 1379, 1400, 1383, 1396, 1343, 1380, 1394, 574, 638, 610, 610, 614, 613, 556, 586, 569, 586, 569, 626, 612, 639, 608, 627, 586, 568, 611, 629, 586, 568, 629, 632, 586, 569, 613, 586, 569, 589, 584, 564, 587, 573, 575, 3297, 3319, 3275, 3313, 3322, 3317, 3318, 3320, 3313, 956, 1021, 1022, 1023, 915, 937, 930, 941, 942, 928, 937, 2109, 2173, 2145, 2145, 2149, 2150, 2095, 2121, 2106, 2121, 2106, 2149, 2164, 2171, 2121, 2107, 2148, 2144, 2164, 2151, 2174, 2121, 2107, 2166, 2171, 2121, 2106, 2150, 2121, 2106, 2126, 2123, 2103, 2120, 2110, 2108, 2027, 2031, 2043, 2024, 2033, 1989, 2047, 2036, 2043, 2040, 2038, 2047, 2103, 2100, 2108, 2097, 2080, 2058, 2096, 2107, 2100, 2103, 2105, 2096, 1640, 1653, 1661, 1650, 1637, 1653, 1603, 1657, 1650, 1661, 1662, 1648, 1657, 1063, 1066, 1073, 1075, 1082, 1078, 1024, 1082, 1073, 1086, 1085, 1075, 1082, 1667, 1682, 1693, 1711, 1757, 1675, 1670, 1693, 1695, 1686, 1690, 1711, 1757, 1680, 1692, 1694, 1756, 1664, 1756, 1755, 1704, 1709, 1740, 1749, 1710, 1752, 1754, 1687, 1680, 1667, 1754, 1743, 1724, 1721, 1729, 1722, 1740, 1742, 2927, 2914, 2937, 2939, 2930, 2942, 2868, 3005, 3005, 3005, 1581, 1633, 1630, 1626, 1602, 1662, 1595, 1635, 1624, 1657, 1648, 1635, 1631, 1638, 1630, 1653, 1602, 1662, 1595, 1659, 1657, 1656, 1605, 573, 520, 580, 582, 574, 514, 578, 565, 539, 533, 543, 561, 538, 570, 575, 532, 605, 580, 550, 572, 532, 522, 522, 581, 573, 587, 546, 523, 541, 514, 529, 529, 520, 575, 513, 540, 532, 2123, 2156, 2085, 2114, 2105, 2125, 2155, 2085, 2123, 2148, 2106, 2102, 2171, 2857, 2824, 2842, 2931, 969, 987, 1018, 952, 1010, 971, 996, 958, 1022, 944, 991, 956, 1001, 993, 1004, 994, 984, 963, 957, 963, 960, 1004, 953, 964, 1017, 955, 1020, 931, 1022, 970, 974, 1006, 956, 953, 1004, 1017, 1022, 957, 931, 1006, 998, 967, 1004, 3125, 3091, 3118, 3117, 3128, 3110, 3109, 3188, 3120, 3187, 3123, 3130, 3114, 3186, 3111, 3088, 3119, 3126, 3185, 3091, 3109, 3084, 3098, 3085, 3124, 3089, 3096, 3085, 3188, 3123, 3181, 3077, 3098, 3081, 2100, 2110, 2106, 2081, 2104, 2168, 2096, 2106, 2066, 2085, 2074, 2100, 2066, 2172, 2096, 2091, 2054, 2054, 2064, 2102, 2110, 2098, 2151, 2148, 2105, 2081, 2172, 2058, 2055, 2108, 2106, 2091, 2055, 2055, 2168, 2050, 2149, 2076, 3104, 3164, 3196, 3158, 3194, 3160, 3116, 3159, 3108, 3130, 3106, 3117, 3117, 3195, 3169, 3159, 2229, 2261, 2258, 2223, 2221, 2261, 2189, 2259, 2196, 2186, 2216, 2259, 2225, 2230, 2224, 2212, 2222, 2263, 2180, 2217, 2268, 2225, 2256, 2198, 2263, 2228, 2215, 2227, 2176, 2236, 2268, 2223, 2226, 2195, 2180, 2185, 2179, 3049, 2989, 2953, 3058, 2947, 2956, 728, 725, 718, 716, 709, 713, 278, 279, 257, 278, 269, 265, 263, 268, 2257, 2253, 2253, 2249, 2179, 2198, 2198, 2391, 2379, 2379, 2383, 2380, 2309, 2320, 2320, 1045, 1772, 1712, 1719, 1708, 1713, 1698, 1700, 1702, 677, 698, 1068, 1061, 1087, 1060, 1065, 3251, 3262, 3246, 3251, 3240, 3244, 3234, 3241, 2494, 2559, 2556, 2557, 2490, 2465, 2469, 2475, 2464, 1780, 1762, 1762, 1774, 1774, 1770, 1768, 1764, 2890, 2907, 2906, 2881, 2885, 2891, 2880, 2353, 2365, 2365, 2361, 2363, 2359, 3256, 3260, 3240, 3259, 3234, 3164, 3142, 3178, 3170, 24498, 2575, 2585, 1019, 954, 953, 952, 2363, 32647, 3000, 2984, 32025, 1283, 1294, 1301, 1303, 1310, 1298};
    public Quark a = null;
    public UC b = null;
    public P123 c = null;
    public Baidu d = null;
    public Tianyi e = null;
    public String f = C0007.m1840();

    /* renamed from: ۟۟۟ۥۥ, reason: not valid java name and contains not printable characters */
    public static boolean m81(Object obj, Object obj2) {
        if (C0057.m9017() > 0) {
            return ((JsonObject) obj).has((String) obj2);
        }
        return false;
    }

    /* renamed from: ۟۟۟ۧۨ, reason: not valid java name and contains not printable characters */
    public static JsonElement m82(Object obj, Object obj2) {
        if (C0025.m4797() > 0) {
            return ((JsonObject) obj).get((String) obj2);
        }
        return null;
    }

    /* renamed from: ۟ۡۨۡۧ, reason: not valid java name and contains not printable characters */
    public static String m83(Object obj, Object obj2) {
        if (C0034.m6048() < 0) {
            return ((Spider) obj).detailContent((List) obj2);
        }
        return null;
    }

    /* renamed from: ۟ۤ۠ۤۧ, reason: not valid java name and contains not printable characters */
    public static String m84(Object obj) {
        if (C0052.m8320() > 0) {
            return ((JsonElement) obj).getAsString();
        }
        return null;
    }

    /* renamed from: ۟ۦۦۣۤ, reason: not valid java name and contains not printable characters */
    public static JsonObject m85(Object obj) {
        if (C0031.m5628() > 0) {
            return AbstractC0308c.i((String) obj);
        }
        return null;
    }

    /* renamed from: ۤ۠ۥ۟, reason: not valid java name and contains not printable characters */
    public static short[] m86() {
        if (C0024.m4693() <= 0) {
            return f10short;
        }
        return null;
    }

    public String detailContent(List<String> list) {
        if (C0064.m9686((String) C0048.m7915(list, 0), C0057.m8978(m86(), 0, 80, 2430))) {
            return null;
        }
        String str = (String) C0048.m7915(list, 0);
        C0062.m9425();
        if (C0064.m9686(str, C0026.m4951(m86(), 80, 38, 3063))) {
            return m83(C0065.m9801(this), list);
        }
        if (C0064.m9686((String) C0048.m7915(list, 0), C0034.m6001(m86(), 118, 36, 458))) {
            return C0054.m8571(C0042.m7136(this), list);
        }
        if (C0064.m9686((String) C0048.m7915(list, 0), C0055.m8814(m86(), 154, 35, 3049))) {
            return C0026.m4966(C0041.m6781(this), list);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x052d  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x04a3  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x04d6  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x04da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String detailContentVodPlayUrl(java.util.List r72) {
        /*
            Method dump skipped, instructions count: 1369
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.Cloud.detailContentVodPlayUrl(java.util.List):java.lang.String");
    }

    public void init(Context context, String str) {
        JsonObject jsonObjectM85 = m85(str);
        this.a = new Quark();
        this.b = new UC();
        this.c = new P123();
        this.d = new Baidu();
        this.e = new Tianyi();
        Object[] objArr = {C0062.m9389(m86(), 423, 23, 1556), C0021.m4340(m86(), 446, 37, 626), C0017.m3646(m86(), 483, 13, 2062), C0044.m7509(m86(), 496, 4, 2883), C0039.m6551(m86(), 500, 43, 904), C0055.m8814(m86(), 543, 34, 3138), C0015.m3484(m86(), 577, 38, 2131), C0054.m8574(m86(), 615, 16, 3093), C0054.m8574(m86(), 631, 37, 2277), C0020.m4199(m86(), 668, 6, 3010)};
        ArrayList arrayList = new ArrayList(10);
        for (int i = 0; i < 10; i++) {
            Object obj = objArr[i];
            C0047.m7777(obj);
            C0004.m1532(arrayList, obj);
        }
        C0029.m5209(arrayList);
        C0050.m8082();
        if (((a) C0033.m5856(C0058.m9105(C0002.m1247(C0062.m9389(m86(), 674, 6, 672))), a.class)) == null) {
            new a();
        }
        String strM5708 = C0032.m5708(m86(), 680, 8, 354);
        boolean zM81 = m81(jsonObjectM85, strM5708);
        String strM1840 = C0007.m1840();
        String strM84 = zM81 ? m84(m82(jsonObjectM85, strM5708)) : strM1840;
        if (C0058.m9127(strM84, C0058.m9106(m86(), 688, 7, 2233)) || C0058.m9127(strM84, C0023.m4536(m86(), 695, 8, 2367))) {
            strM84 = C0032.m5769(strM84, null);
        }
        C0246g c0246gM5964 = C0034.m5964();
        C0047.m7777(c0246gM5964);
        if (C0040.m6623(new CharSequence[]{strM84}) && C0058.m9127(strM84, C0028.m5109(m86(), 703, 1, 1083)) && !C0058.m9127(strM84, C0036.m6188(m86(), 704, 8, 1731)) && !C0058.m9127(strM84, C0028.m5109(m86(), 712, 2, 650)) && !C0058.m9127(strM84, C0020.m4199(m86(), 714, 5, 1098))) {
            c0246gM5964.b = strM84;
            C0056.m8881(c0246gM5964);
        }
        Tianyi tianyiM7786 = C0047.m7786(this);
        String strM5852 = C0033.m5852(m86(), 719, 8, 3271);
        C0019.m4077(tianyiM7786, context, m81(jsonObjectM85, strM5852) ? m84(m82(jsonObjectM85, strM5852)) : strM1840);
        P123 p123M9801 = C0065.m9801(this);
        String strM4199 = C0020.m4199(m86(), 727, 9, 2510);
        C0060.m9269(p123M9801, context, m81(jsonObjectM85, strM4199) ? m84(m82(jsonObjectM85, strM4199)) : strM1840);
        UC ucM6781 = C0041.m6781(this);
        String strM5565 = C0031.m5565(m86(), 736, 8, 1665);
        C0025.m4815(ucM6781, context, m81(jsonObjectM85, strM5565) ? m84(m82(jsonObjectM85, strM5565)) : strM1840);
        Baidu baiduM2133 = C0009.m2133(this);
        String strM8814 = C0055.m8814(m86(), 744, 7, 2862);
        C0039.m6505(baiduM2133, context, m81(jsonObjectM85, strM8814) ? m84(m82(jsonObjectM85, strM8814)) : strM1840);
        Quark quarkM7136 = C0042.m7136(this);
        String strM4795 = C0025.m4795(m86(), 751, 6, 2386);
        if (m81(jsonObjectM85, strM4795)) {
            strM1840 = m84(m82(jsonObjectM85, strM4795));
        }
        C0050.m8149(quarkM7136, context, strM1840);
    }

    public String playerContent(String str, String str2, List<String> list) {
        if (C0058.m9127(str, C0010.m2300(m86(), 757, 5, 3273)) || C0058.m9127(str, C0038.m6452(m86(), 762, 5, 3117))) {
            return C0037.m6383(C0042.m7136(this), str, str2, list);
        }
        if (C0058.m9127(str, C0035.m6131(m86(), 767, 2, 2682))) {
            return C0001.m1169(C0041.m6781(this), str, str2, list);
        }
        if (C0058.m9127(str, C0014.m3332(m86(), 769, 4, 907))) {
            return C0025.m4853(C0065.m9801(this), str, str2, list);
        }
        if (C0058.m9127(str, C0063.m9585(m86(), 773, 2, 2399))) {
            return C0022.m4417(C0009.m2133(this), str, str2, list);
        }
        if (C0058.m9127(str, C0058.m9106(m86(), 775, 3, 3009))) {
            return C0052.m8336(C0047.m7786(this), str, str2, list);
        }
        if (!C0058.m9127(str, C0008.m1970(m86(), 778, 6, 1403))) {
            return C0007.m1840();
        }
        C0006.m1797(C0049.m8046());
        return C0031.m5569(C0049.m8046(), str, str2, true);
    }
}