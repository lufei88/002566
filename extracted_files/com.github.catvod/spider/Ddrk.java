package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.E.b;
import com.github.catvod.spider.merge.E.g;
import com.github.catvod.spider.merge.E.k;
import com.github.catvod.spider.merge.E.l;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.J0.C0021;
import com.github.catvod.spider.merge.N.C0023;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.T0.h;
import com.github.catvod.spider.merge.T0.m;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.V0.d;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.Z.C0040;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.merge.c1.C0046;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.f0.C0052;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.r0.C0060;
import com.github.catvod.spider.merge.t.C0061;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.merge.z.C0065;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.a0.C0006;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.c0.C0010;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import com.github.catvod.spider.p000mergexbpq.r.C0014;
import com.github.catvod.spider.p000mergexbpq.x.C0015;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class Ddrk extends Cloud {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f15short = {3249, 3325, 3327, 3306, 3323, 3321, 3313, 3308, 3303, 3249, 3254, 3266, 3277, 3253, 3255, 3249, 1468, 1440, 1440, 1444, 1447, 1518, 1531, 1531, 1456, 1456, 1453, 1447, 1530, 1444, 1446, 1467, 1531, 1532, 1416, 1415, 1535, 1533, 1531, 1027, 1036, 1140, 1136, 1071, 1086, 1080, 1082, 1136, 1143, 1027, 1036, 1140, 1142, 1027, 1036, 1140, 451, 460, 436, 439, 503, 491, 491, 495, 451, 460, 436, 504, 438, 3078, 3081, 3185, 3186, 3188, 3184, 3187, 1142, 1104, 1094, 1105, 1038, 1122, 1092, 1094, 1101, 1111, 597, 631, 610, 625, 628, 628, 633, 567, 557, 566, 552, 568, 560, 591, 625, 630, 636, 631, 623, 619, 568, 598, 588, 568, 553, 552, 566, 552, 547, 568, 591, 625, 630, 558, 556, 547, 568, 608, 558, 556, 561, 568, 601, 616, 616, 628, 637, 591, 637, 634, 595, 625, 620, 567, 557, 555, 559, 566, 555, 558, 568, 560, 595, 592, 588, 597, 596, 564, 568, 628, 625, 627, 637, 568, 607, 637, 635, 627, 631, 561, 568, 603, 624, 618, 631, 629, 637, 567, 553, 552, 554, 566, 552, 566, 557, 552, 552, 557, 566, 558, 554, 568, 587, 633, 638, 633, 618, 625, 567, 557, 555, 559, 566, 555, 558, 2227, 2180, 2183, 2180, 2195, 2180, 2195, 497, 493, 493, 489, 490, 419, 438, 438, 509, 509, 480, 490, 439, 489, 491, 502, 3112, 3185, 3190, 3115, 3190, 3178, 3175, 3199, 3178, 3183, 3189, 3186, 3115, 3189, 3173, 3188, 3183, 3190, 3186, 432, 438, 421, 423, 431, 439, 3274, 3275, 3290, 3209, 1519, 1517, 1532, 1528, 1509, 1507, 1506, 2447, 2451, 2451, 2455, 2452, 2525, 2504, 2504, 2435, 2435, 2462, 2452, 2505, 2455, 2453, 2440, 32158, 1667, 24017, 3159, 3081, 3094, 3082, 3085, 3156, 3099, 3094, 3073, 3156, 3085, 3088, 3085, 3093, 3100, 3161, 3096, 1326, 3245, 3297, 3299, 3318, 3303, 3301, 3309, 3312, 3323, 3245, 2560, 2588, 2588, 2584, 2587, 2642, 2631, 2631, 2572, 2572, 2577, 2587, 2630, 2584, 2586, 2567, 1242, 1112, 2413, 2354, 2339, 2341, 2343, 2413, 2877, 2864, 2863, 2935, 2871, 2872, 2863, 2932, 2869, 2864, 2871, 2866, 2858, 620, 630, 609, 610, 1809, 667, 662, 649, 721, 657, 670, 649, 722, 659, 662, 657, 660, 652, 735, 670, 1891, 1888, 1905, 1918, 1854, 1907, 1893, 1890, 1890, 1909, 1918, 1892, 25756, 28468, 27203, 23053, 26773, 26830, -32324, 32441, 30446, 28577, 23771, 2372, 2377, 2390, 2318, 2384, 2383, 2387, 2388, 2317, 2370, 2383, 2392, 2317, 2371, 2383, 2382, 2388, 2369, 2377, 2382, 2373, 2386, 2916, 2848, 2873, 2866, 2825, 2852, 2867, 2875, 2871, 2852, 2877, 2853, 2421, 2412, 2407, 2396, 2419, 2410, 2400, 1649, 1640, 1635, 1624, 1641, 1638, 1642, 1634, 824, 801, 810, 785, 807, 810, 2597, 2594, 2607, 2618, 2611, 3002, 3044, 3067, 3047, 3040, 3001, 3062, 3067, 3052, 3001, 3069, 3065, 3061, 3059, 3057, 3019, 3007, 1794, 3115, 3130, 3132, 3134, 1526, 1511, 1505, 1507, 1509, 1513, 1523, 1512, 1522, 494, 491, 495, 491, 502, 3193, 3170, 3193, 3180, 3169, 429, 424, 434, 437, 2749, 1666, 1694, 1694, 1690, 1689, 1744, 1733, 1733, 1678, 1678, 1683, 1689, 1732, 1690, 1688, 1669, 1733, 2678, 2666, 2666, 2670, 1300, 1619, 1630, 1601, 1561, 1607, 1624, 1604, 1603, 1559, 1630, 1626, 1616, 2225, 2224, 2209, 538, 579, 604, 514, 541, 513, 518, 607, 518, 539, 518, 542, 535, 452, 477, 470, 493, 448, 471, 479, 467, 448, 473, 449, 966, 991, 980, 1007, 990, 977, 989, 981, 933, 977, 1080, 1061, 1057, 1065, 22659, 447, 434, 429, 501, 442, 441, 424, 431, 425, 442, 440, 431, 3257, 1393, 1327, 1343, 1395, 2158, 2082, 2156, 2158, 2173, 2082, 2156, 30073, 24201, 2360, 2346, 2348, 2344, 2347, 23348, 24351, 20374, 337, 323, 325, 321, 322, 31467, 21695, 20661, 949, 935, 929, 933, 934, 24059, 19826, 28307, 21983, 445, 431, 425, 429, 430, 32252, 23610, 26834, 2044, 2030, 2024, 2028, 2031, 26834, 29582, 18117, 2100, 2086, 2080, 2084, 2087, 2103, 2094, 2085, 2078, 2088, 2085, 2757, 2780, 2775, 2796, 2755, 2778, 2768, 2858, 2855, 2862, 2875, 2817, 2864, 2879, 2867, 2875, 2410, 2419, 2424, 2371, 2405, 2425, 2429, 2414, 983, 974, 965, 1022, 960, 979, 964, 960, 2992, 2985, 2978, 2969, 2983, 2981, 2994, 2985, 2996, 2609, 2600, 2595, 2584, 2595, 2606, 2613, 2594, 2596, 2611, 2600, 2613, 1842, 1835, 1824, 1819, 1831, 1835, 1834, 1840, 1825, 1834, 1840, 845, 787, 853, 792, 592, 588, 588, 584, 587, 3026, 3022, 3022, 3018, 3017, 2944, 2965, 2965, 3020, 2964, 3038, 3038, 3011, 3017, 2964, 3018, 3016, 3029, 1079, 1067, 1067, 1071, 1068, 1125, 1136, 1136, 1083, 1083, 1062, 1068, 1137, 1071, 1069, 1072, 1136, 612, 609, 550, 613, 621, 614, 637, 549, 609, 636, 621, 613, 552, 617, 669, 647, 656, 659, 791, 778, 791, 783, 774, 2041, 2043, 2030, 2047, 2045, 2037, 2024, 2019, 2824, 2845, 2843, 1185, 1196, 1203, 1259, 1205, 1194, 1206, 1201, 1256, 1191, 1194, 1213, 1256, 1190, 1194, 1195, 1201, 1188, 1196, 1195, 1184, 1207, 1462, 1512, 1527, 1515, 1516, 1461, 1530, 1527, 1504, 1461, 1516, 1521, 1516, 1524, 1533, 1464, 1446, 1464, 1529, 2402, 2415, 2416, 2344, 2422, 2409, 2421, 2418, 2347, 2404, 2409, 2430, 2347, 2415, 2411, 2407, 2401, 2403, 2406, 2401, 2412, 2425, 2416, 489, 494, 496, 448, 436, 436, 434, 438, 419, 437, 448, 437, 2217, 2221, 2233, 2218, 2227, 1447, 1457, 887, 875, 875, 879, 876, 805, 816, 816, 891, 891, 870, 876, 817, 879, 877, 880, 1121, 1149, 1149, 1145, 1146, 1075, 1062, 1062, 1133, 1133, 1136, 1146, 1063, 1145, 1147, 1126, 1078, 1146, 1076, 1769, 1727, 1696, 1724, 1723, 1680, 1723, 1718, 1727, 1706, 1778, 1727, 1696, 1724, 1723, 2283, 2225, 2221, 2291, 2284, 2288, 2295, 2222, 2295, 2282, 2295, 2287, 2278, 2211, 2237, 2211, 2274, 780, 790, 769, 770};
    public final Pattern g;
    public final Pattern h;
    public final Pattern i;
    public final Pattern j;

    public Ddrk() {
        C0005.m1602(C0032.m5708(m104(), 0, 16, 3230));
        this.g = C0005.m1602(C0032.m5708(m104(), 16, 23, 1492));
        this.h = C0005.m1602(C0055.m8814(m104(), 39, 17, 1119));
        this.i = C0005.m1602(C0027.m5062(m104(), 56, 13, 415));
        this.j = C0005.m1602(C0052.m8337(m104(), 69, 7, 3162));
    }

    public static String a(String str, Pattern pattern) {
        if (pattern == null) {
            return str;
        }
        try {
            Matcher matcherM6026 = C0034.m6026(pattern, str);
            if (C0003.m1405(matcherM6026)) {
                return C0064.m9640(C0021.m4306(matcherM6026, 1));
            }
        } catch (Exception e) {
            m105(e);
        }
        return str;
    }

    public static HashMap b() {
        return C0019.m4127(C0019.m4107(m104(), 76, 10, 1059), C0045.m7657(m104(), 86, 115, 536), C0041.m6779(m104(), 201, 7, 2273), C0024.m4740(m104(), 208, 16, 409));
    }

    /* renamed from: ۟ۦۤۢۤ, reason: not valid java name and contains not printable characters */
    public static short[] m104() {
        if (C0023.m4566() < 0) {
            return f15short;
        }
        return null;
    }

    /* renamed from: ۧۦۣۦ, reason: not valid java name and contains not printable characters */
    public static void m105(Object obj) {
        if (C0005.m1599() <= 0) {
            SpiderDebug.log((Throwable) obj);
        }
    }

    public final void c(h hVar, l lVar) {
        Iterator itM7807 = C0047.m7807(C0030.m5333(hVar, C0025.m4795(m104(), 224, 19, 3078)));
        while (C0012.m2962(itM7807)) {
            String strM9640 = C0064.m9640(C0000.m1081((m) C0048.m7949(itM7807)));
            JSONArray jSONArrayM4333 = C0021.m4333(new JSONObject(C0054.m8636(strM9640, C0048.m7935(strM9640, 123), C0030.m5416(strM9640, 125) + 1)), C0046.m7718(m104(), 243, 6, 452));
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < C0053.m8396(jSONArrayM4333); i++) {
                JSONObject jSONObjectM3923 = C0018.m3923(jSONArrayM4333, i);
                String strM1212 = C0001.m1212(jSONObjectM3923, C0014.m3332(m104(), 249, 4, 3257));
                String strM12122 = C0001.m1212(jSONObjectM3923, C0051.m8259(m104(), 253, 7, 1420));
                String strM6181 = C0036.m6181(this, strM1212);
                k kVar = new k();
                kVar.a = strM12122;
                kVar.b = C0007.m1809(strM6181, C0006.m1742(C0028.m5109(m104(), 260, 16, 2535)));
                C0004.m1532(arrayList, kVar);
            }
            C0001.m1174(lVar, C0011.m2805(m104(), 276, 3, 1714), arrayList);
        }
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        StringBuilder sb;
        int iM6456;
        int iM64562;
        int i;
        JSONObject jSONObject;
        String str3 = str;
        String strM4740 = C0024.m4740(m104(), 279, 17, 3193);
        String strM5852 = C0033.m5852(m104(), 296, 1, 1281);
        String strM1840 = C0007.m1840();
        if (map != null) {
            try {
                if (C0014.m3311(map) > 0) {
                    Iterator itM5199 = C0029.m5199(C0000.m1121(map));
                    String strM7763 = strM1840;
                    while (C0012.m2962(itM5199)) {
                        String str4 = (String) C0065.m9715(map, (String) C0048.m7949(itM5199));
                        String strM7657 = C0045.m7657(m104(), 297, 10, 3202);
                        String strM9361 = C0061.m9361(m104(), 307, 16, 2664);
                        if (str4 == null || C0004.m1584(str4) == 0 || str4 == C0053.m8477(m104(), 323, 1, 1274)) {
                            StringBuilder sb2 = new StringBuilder();
                            C0018.m3933(sb2, strM9361);
                            C0018.m3933(sb2, strM7657);
                            C0018.m3933(sb2, str3);
                            strM7763 = C0047.m7763(sb2);
                        } else {
                            StringBuilder sb3 = new StringBuilder();
                            C0018.m3933(sb3, strM9361);
                            C0018.m3933(sb3, strM7657);
                            C0018.m3933(sb3, str3);
                            C0018.m3933(sb3, strM5852);
                            C0018.m3933(sb3, str4);
                            strM7763 = C0047.m7763(sb3);
                        }
                    }
                    str3 = strM7763;
                }
            } catch (Exception e) {
                m105(e);
                return strM1840;
            }
        }
        if (C0007.m1815(str2, C0014.m3332(m104(), 324, 1, 1129))) {
            sb = new StringBuilder();
            C0018.m3933(sb, str3);
            C0018.m3933(sb, strM5852);
        } else {
            sb = new StringBuilder();
            C0018.m3933(sb, str3);
            C0018.m3933(sb, C0024.m4740(m104(), 325, 6, 2370));
            C0018.m3933(sb, str2);
            C0018.m3933(sb, strM5852);
        }
        String strM5769 = C0032.m5769(C0047.m7763(sb), C0046.m7716());
        h hVarM3577 = C0016.m3577(strM5769);
        JSONObject jSONObject2 = new JSONObject();
        d dVarM5333 = C0030.m5333(hVarM3577, C0050.m8131(m104(), 331, 13, 2905));
        int iM2095 = C0009.m2095(dVarM5333);
        String strM2973 = C0012.m2973(m104(), 344, 4, 516);
        if (iM2095 != 0) {
            int i2 = 0;
            while (true) {
                if (i2 >= C0009.m2095(dVarM5333)) {
                    iM6456 = 0;
                    iM64562 = -1;
                    break;
                }
                if (C0036.m6243((m) C0028.m5161(dVarM5333, i2), C0060.m9352(m104(), 348, 1, 1904)) == null) {
                    i2++;
                } else {
                    String strM2339 = C0010.m2339(C0053.m8455(C0030.m5333(hVarM3577, C0033.m5852(m104(), 349, 15, 767))), strM2973);
                    iM64562 = C0038.m6456(C0064.m9640(C0024.m4684(C0030.m5333(hVarM3577, C0020.m4199(m104(), 364, 12, 1808)))));
                    Matcher matcherM6026 = C0034.m6026(C0037.m6356(this), strM2339);
                    iM6456 = C0003.m1405(matcherM6026) ? C0038.m6456(C0021.m4306(matcherM6026, 1)) : 0;
                }
            }
        } else {
            iM6456 = C0038.m6456(str2);
            iM64562 = iM6456;
        }
        JSONArray jSONArray = new JSONArray();
        if (!C0058.m9127(strM5769, C0015.m3484(m104(), 376, 11, 2109))) {
            d dVarM53332 = C0030.m5333(hVarM3577, C0036.m6188(m104(), 387, 22, 2336));
            int i3 = 0;
            while (i3 < C0009.m2095(dVarM53332)) {
                m mVar = (m) C0028.m5161(dVarM53332, i3);
                String strM9669 = C0064.m9669(C0036.m6243(mVar, strM4740));
                boolean zM9127 = C0058.m9127(strM9669, C0003.m1398(m104(), 409, 1, 2892));
                Pattern patternM6020 = C0034.m6020(this);
                String strM9775 = C0065.m9775(m104(), 410, 11, 2902);
                String strM3646 = C0017.m3646(m104(), 421, 7, 2307);
                d dVar = dVarM53332;
                String strM5256 = C0029.m5256(m104(), 428, 8, 1543);
                int i4 = iM6456;
                String strM6584 = C0040.m6584(m104(), 436, 6, 846);
                JSONObject jSONObject3 = jSONObject2;
                String strM4795 = C0025.m4795(m104(), 442, 5, 2646);
                int i5 = iM64562;
                String strM47952 = C0025.m4795(m104(), 447, 15, 2964);
                if (zM9127) {
                    String[] strArrM4752 = C0024.m4752(strM9669, C0030.m5362(m104(), 462, 2, 2967));
                    i = i3;
                    String str5 = strArrM4752[0];
                    String strM3446 = C0015.m3446(strArrM4752[1], C0000.m1077(m104(), 464, 1, 1835), strM1840);
                    String strM6422 = C0038.m6422(C0010.m2339(C0036.m6243(mVar, strM47952), strM4795), patternM6020);
                    String strM23392 = C0010.m2339(C0036.m6243(mVar, strM4740), strM2973);
                    jSONObject = new JSONObject();
                    C0047.m7743(jSONObject, strM6584, strM23392);
                    C0047.m7743(jSONObject, strM5256, str5);
                    C0047.m7743(jSONObject, strM3646, strM6422);
                    C0047.m7743(jSONObject, strM9775, strM3446);
                } else {
                    i = i3;
                    String strM64222 = C0038.m6422(C0010.m2339(C0036.m6243(mVar, strM47952), strM4795), patternM6020);
                    String strM64223 = C0038.m6422(C0064.m9669(C0036.m6243(mVar, strM4740)), C0002.m1272(this));
                    Matcher matcherM60262 = C0034.m6026(C0033.m5798(this), C0010.m2339(C0036.m6243(mVar, strM4740), strM2973));
                    if (C0003.m1405(matcherM60262)) {
                        String strM4306 = C0021.m4306(matcherM60262, 1);
                        jSONObject = new JSONObject();
                        C0047.m7743(jSONObject, strM6584, strM4306);
                        C0047.m7743(jSONObject, strM5256, strM9669);
                        C0047.m7743(jSONObject, strM3646, strM64222);
                        C0047.m7743(jSONObject, strM9775, strM64223);
                    } else {
                        i3 = i + 1;
                        dVarM53332 = dVar;
                        iM6456 = i4;
                        jSONObject2 = jSONObject3;
                        iM64562 = i5;
                    }
                }
                C0044.m7459(jSONArray, jSONObject);
                i3 = i + 1;
                dVarM53332 = dVar;
                iM6456 = i4;
                jSONObject2 = jSONObject3;
                iM64562 = i5;
            }
        }
        int i6 = iM6456;
        JSONObject jSONObject4 = jSONObject2;
        C0037.m6360(jSONObject4, C0063.m9585(m104(), 465, 4, 3163), iM64562);
        C0037.m6360(jSONObject4, C0014.m3332(m104(), 469, 9, 1414), i6);
        C0037.m6360(jSONObject4, C0046.m7718(m104(), 478, 5, 386), 24);
        C0037.m6360(jSONObject4, C0029.m5256(m104(), 483, 5, 3085), i6 <= 1 ? C0053.m8396(jSONArray) : i6 * 24);
        C0047.m7743(jSONObject4, C0019.m4107(m104(), 488, 4, 449), jSONArray);
        return C0004.m1539(jSONObject4);
    }

    @Override // com.github.catvod.spider.Cloud
    public String detailContent(List<String> list) {
        String strM9775;
        String strM2037 = C0009.m2037(m104(), 492, 1, 2709);
        String strM1840 = C0007.m1840();
        String strM8477 = C0053.m8477(m104(), 493, 17, 1770);
        try {
            String strM7763 = (String) C0048.m7915(list, 0);
            if (!C0043.m7277(strM7763, C0054.m8574(m104(), 510, 4, 2590))) {
                StringBuilder sb = new StringBuilder(strM8477);
                C0018.m3933(sb, strM7763);
                C0018.m3933(sb, C0061.m9361(m104(), 514, 1, 1339));
                strM7763 = C0047.m7763(sb);
            }
            h hVarM3577 = C0016.m3577(C0032.m5769(strM7763, C0046.m7716()));
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            String strM8058 = C0049.m8058(C0030.m5333(hVarM3577, C0012.m2973(m104(), 515, 12, 1591)), C0034.m6001(m104(), 527, 3, 2242));
            String strM4684 = C0024.m4684(C0030.m5333(hVarM3577, C0061.m9361(m104(), 530, 13, 626)));
            boolean zM9127 = C0058.m9127(strM4684, strM2037);
            String strM7151 = C0042.m7151(m104(), 543, 11, 434);
            String strM20372 = C0009.m2037(m104(), 554, 8, 944);
            if (zM9127) {
                String[] strArrM4752 = C0024.m4752(strM4684, C0056.m8911(m104(), 562, 2, 1017));
                String str = strArrM4752[0];
                strM9775 = C0015.m3446(strArrM4752[1], strM2037, strM1840);
                C0047.m7743(jSONObject2, strM20372, str);
            } else {
                C0047.m7743(jSONObject2, strM20372, strM4684);
                C0047.m7777(C0024.m4684(C0030.m5333(hVarM3577, C0039.m6551(m104(), 564, 4, 1100))));
                strM9775 = C0065.m9775(m104(), 568, 1, 2539);
            }
            C0047.m7743(jSONObject2, strM7151, strM9775);
            String strM3446 = C0015.m3446(C0015.m3446(C0015.m3446(C0024.m4684(C0030.m5333(hVarM3577, C0015.m3484(m104(), 569, 12, 475))), C0056.m8911(m104(), 581, 1, 3225), strM1840), C0052.m8337(m104(), 582, 4, 1357), strM1840), C0063.m9585(m104(), 586, 7, 2130), strM1840);
            String strM6422 = C0038.m6422(strM3446, C0005.m1602(C0000.m1077(m104(), 593, 8, 2306)));
            String strM64222 = C0038.m6422(strM3446, C0005.m1602(C0044.m7509(m104(), 601, 8, 363)));
            String strM64223 = C0038.m6422(strM3446, C0005.m1602(C0025.m4795(m104(), 609, 9, 911)));
            String strM64224 = C0038.m6422(strM3446, C0005.m1602(C0045.m7657(m104(), 618, 8, 391)));
            String strM64225 = C0038.m6422(strM3446, C0005.m1602(C0045.m7657(m104(), 626, 8, 1990)));
            String strM64226 = C0038.m6422(strM3446, C0005.m1602(C0063.m9585(m104(), 634, 7, 2062)));
            C0047.m7743(jSONObject2, C0055.m8814(m104(), 641, 6, 2113), C0048.m7915(list, 0));
            C0047.m7743(jSONObject2, C0013.m3106(m104(), 647, 7, 2739), strM8058);
            C0047.m7743(jSONObject2, C0010.m2300(m104(), 654, 9, 2910), strM6422);
            C0047.m7743(jSONObject2, C0036.m6188(m104(), 663, 8, 2332), strM64222);
            C0047.m7743(jSONObject2, C0036.m6188(m104(), 671, 8, 929), strM64223);
            C0047.m7743(jSONObject2, C0055.m8814(m104(), 679, 9, 3014), strM64224);
            C0047.m7743(jSONObject2, C0038.m6452(m104(), 688, 12, 2631), strM64225);
            C0047.m7743(jSONObject2, C0041.m6779(m104(), 700, 11, 1860), strM64226);
            l lVar = new l(0);
            new ArrayList();
            C0053.m8391(this, hVarM3577, lVar);
            C0044.m7459(new JSONArray(), jSONObject2);
            return C0004.m1539(jSONObject);
        } catch (Exception e) {
            m105(e);
            return strM1840;
        }
    }

    public String getPlayUrl(String str) {
        return (C0060.m9349(str, C0044.m7509(m104(), 711, 4, 800)) || C0043.m7277(str, C0047.m7833(m104(), 715, 5, 568))) ? str : C0050.m8125(C0008.m1970(m104(), 720, 18, 3002), str);
    }

    public String homeContent(boolean z) {
        String strM7833;
        ArrayList arrayList = new ArrayList();
        h hVarM3577 = C0016.m3577(C0032.m5769(C0052.m8337(m104(), 738, 17, 1119), C0046.m7716()));
        d dVarM5333 = C0030.m5333(hVarM3577, C0063.m9585(m104(), 755, 14, 520));
        ArrayList arrayList2 = new ArrayList();
        Iterator itM7807 = C0047.m7807(dVarM5333);
        while (true) {
            boolean zM2962 = C0012.m2962(itM7807);
            strM7833 = C0047.m7833(m104(), 769, 4, 757);
            if (!zM2962) {
                break;
            }
            m mVar = (m) C0048.m7949(itM7807);
            String strM2339 = C0010.m2339(mVar, C0013.m3106(m104(), 773, 5, 867));
            String strM23392 = C0010.m2339(mVar, strM7833);
            if (C0058.m9127(C0010.m2339(mVar, strM7833), C0029.m5256(m104(), 778, 8, 1946)) || C0058.m9127(C0010.m2339(mVar, strM7833), C0033.m5852(m104(), 786, 3, 2940))) {
                C0004.m1532(arrayList2, new b(strM23392, strM2339, null));
            }
        }
        d dVarM53332 = C0030.m5333(hVarM3577, C0008.m1970(m104(), 789, 22, 1221));
        for (int i = 0; i < C0009.m2095(dVarM53332); i++) {
            m mVar2 = (m) C0028.m5161(dVarM53332, i);
            String strM4107 = C0019.m4107(m104(), 811, 19, 1432);
            String strM9669 = C0064.m9669(C0036.m6243(mVar2, strM4107));
            String strM23393 = C0010.m2339(C0036.m6243(mVar2, strM4107), strM7833);
            Matcher matcherM6026 = C0034.m6026(C0005.m1602(C0045.m7657(m104(), 853, 12, 412)), C0010.m2339(C0036.m6243(mVar2, C0014.m3332(m104(), 830, 18, 2310)), C0014.m3332(m104(), 848, 5, 2325)));
            C0004.m1532(arrayList, new com.github.catvod.spider.merge.E.m(strM23393, strM9669, C0003.m1405(matcherM6026) ? C0021.m4306(matcherM6026, 1) : C0007.m1840()));
        }
        return C0062.m9423(arrayList2, arrayList, null);
    }

    public void init(Context context) {
        C0051.m8194(C0035.m6110());
    }

    @Override // com.github.catvod.spider.Cloud
    public void init(Context context, String str) {
        C0051.m8194(C0035.m6110());
    }

    @Override // com.github.catvod.spider.Cloud
    public String playerContent(String str, String str2, List<String> list) {
        if (C0058.m9127(str, C0048.m7902(m104(), 865, 5, 2264)) || C0058.m9127(str, C0042.m7151(m104(), 870, 2, 1490))) {
            return super.playerContent(str, str2, list);
        }
        g gVar = new g();
        C0017.m3667(gVar, C0007.m1809(str2, C0006.m1742(C0016.m3525(m104(), 872, 16, 799))));
        return C0033.m5828(gVar);
    }

    public String searchContent(String str, boolean z) {
        StringBuilder sb = new StringBuilder(C0002.m1305(m104(), 888, 19, 1033));
        C0018.m3933(sb, C0056.m8909(str));
        C0018.m3933(sb, C0026.m4951(m104(), 907, 15, 1743));
        h hVarM3577 = C0016.m3577(C0032.m5769(C0047.m7763(sb), C0046.m7716()));
        ArrayList arrayList = new ArrayList();
        d dVarM5333 = C0030.m5333(hVarM3577, C0017.m3646(m104(), 922, 17, 2179));
        for (int i = 0; i < C0009.m2095(dVarM5333); i++) {
            C0004.m1532(arrayList, new com.github.catvod.spider.merge.E.m(C0010.m2339((m) C0028.m5161(dVarM5333, i), C0042.m7151(m104(), 939, 4, 868)), C0064.m9669((m) C0028.m5161(dVarM5333, i)), C0007.m1840()));
        }
        return C0047.m7783(arrayList);
    }
}