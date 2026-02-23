package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.E.b;
import com.github.catvod.spider.merge.E.g;
import com.github.catvod.spider.merge.E.m;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.J0.C0021;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.N.C0023;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.merge.b0.l;
import com.github.catvod.spider.merge.c1.C0046;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.f0.C0052;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.q.C0058;
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
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.c0.C0010;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import com.github.catvod.spider.p000mergexbpq.r.C0014;
import com.github.catvod.spider.p000mergexbpq.x.C0015;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class JustLive extends Spider {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f78short = {439, 427, 427, 431, 485, 496, 496, 435, 438, 425, 442, 497, 422, 437, 494, 493, 494, 494, 497, 424, 432, 429, 436, 3038, 3064, 3054, 3065, 2982, 3018, 3052, 3054, 3045, 3071, 408, 442, 431, 444, 441, 441, 436, 506, 480, 507, 485, 501, 509, 386, 444, 443, 433, 442, 418, 422, 501, 411, 385, 501, 484, 485, 507, 485, 494, 501, 386, 444, 443, 483, 481, 494, 501, 429, 483, 481, 508, 501, 404, 421, 421, 441, 432, 386, 432, 439, 414, 444, 417, 506, 480, 486, 482, 507, 486, 483, 501, 509, 414, 413, 385, 408, 409, 505, 501, 441, 444, 446, 432, 501, 402, 432, 438, 446, 442, 508, 501, 406, 445, 423, 442, 440, 432, 506, 484, 487, 487, 507, 485, 507, 485, 507, 485, 501, 390, 436, 435, 436, 423, 444, 506, 480, 486, 482, 507, 486, 483, 29960, 25697, -32667, -27568, -32064, 29771, 26917, 25942, 30970, -29836, -30702, -29839, 21536, 24655, 18284, 28269, 26479, 27480, 21232, 18065, -29470, 21889, 22284, 23847, 17031, 30408, 28396, 20945, 19836, 1907, 1905, 1892, 1909, 1881, 1908, 603, 596, 601, 587, 587, 1987, 1933, 1948, 1925, 1987, 1920, 1925, 1946, 1929, 1987, 1931, 1929, 1944, 1982, 1929, 1935, 1923, 1921, 1921, 1929, 1922, 1928, 1966, 1941, 1965, 1950, 1929, 1933, 1965, 1920, 1920, 2003, 1933, 1950, 1929, 1933, 1976, 1941, 1948, 1929, 2001, 436, 499, 480, 503, 499, 431, 873, 831, 814, 808, 810, 882, 1798, 1795, 1814, 1795, 2650, 2630, 2635, 2654, 2668, 2629, 2648, 2631, 2871, 2858, 2858, 2856, 2828, 2849, 1415, 1413, 1424, 1409, 1411, 1419, 1430, 1437, 1450, 1413, 1417, 1409, 398, 403, 403, 401, 434, 413, 401, 409, 590, 595, 595, 593, 620, 597, 607, 918, 910, 919, 924, 907, 951, 920, 916, 924, 1114, 1008, 1004, 993, 1012, 998, 1007, 1010, 1005, 957, 1152, 1236, 1225, 1225, 1227, 1263, 1218, 1179, 1101, 1027, 1042, 1035, 1101, 1038, 1035, 1044, 1031, 1101, 1029, 1031, 1046, 1072, 1037, 1037, 1039, 1067, 1036, 1028, 1037, 1117, 2204, 2258, 2243, 2266, 2204, 2271, 2266, 2245, 2262, 2204, 2260, 2262, 2247, 2273, 2262, 2258, 2271, 2278, 2241, 2271, 2302, 2246, 2271, 2247, 2266, 2272, 2268, 2246, 2241, 2256, 2262, 2188, 3315, 3318, 3299, 3318, 29875, -30749, 1781, 1777, 1765, 1768, 1773, 1776, 1789, 1738, 1765, 1769, 1761, 2201, 2181, 2184, 2192, 2236, 2203, 2181, 1615, 3072, 2813, 2813, 2813, 2034, 2031, 2031, 2029, 2000, 2025, 2019, 1554, 1551, 1551, 1549, 1582, 1537, 1549, 1541, 638, 610, 623, 634, 584, 609, 636, 611, 870, 877, 887, 891, 887, 24615, -26164, 3125, 3112, 3108, 3132, -31818, 30625, 2242, 2249, 2252, 2249, 2242, 2249, 2252, 2249, 21813, 21768, 21813, 21768, 3075, 3080, 3090, 3102, 3086, 3081, 26444, -28119, 626, 626, 29975, 27733, 2565, 2565, 2564, 2588, 2565, 2574, 2585, 2597, 2570, 2566, 2574, 24550, 30321, 1805, 1804, 1806, 1803, 1804, 1799, 17710, 614, 606, 603, 594, 1969, 1971, 1958, 1975, 1973, 1981, 1952, 1963, 1948, 1971, 1983, 1975, 30962, 27035, 25016, 28107, 22037, 25210, 20686, 17583, 22576, 18320, 2422, 2360, 2345, 2352, 2422, 2357, 2352, 2351, 2364, 2422, 2366, 2364, 2349, 2315, 2364, 2362, 2358, 2356, 2356, 2364, 2359, 2365, 2406, 2345, 2360, 2366, 2364, 2404, 2408, 2431, 2346, 2352, 2339, 2364, 2404, 2411, 2409, 960, 965, 976, 965, 1714, 1710, 1699, 1718, 1668, 1709, 1712, 1711, 869, 888, 888, 890, 862, 883, 1511, 1509, 1520, 1505, 1507, 1515, 1526, 1533, 1482, 1509, 1513, 1505, 1563, 1542, 1542, 1540, 1575, 1544, 1540, 1548, 300, 305, 305, 307, 270, 311, 317, 2397, 2373, 2396, 2391, 2368, 2428, 2387, 2399, 2391, 1213, 1185, 1196, 1209, 1195, 1186, 1215, 1184, 1264, 1269, 1185, 1212, 1212, 1214, 1178, 1207, 1262, 2186, 2244, 2261, 2252, 2186, 2249, 2252, 2259, 2240, 2186, 2262, 2240, 2244, 2263, 2246, 2253, 2202, 2261, 2249, 2244, 2257, 2243, 2250, 2263, 2248, 2200, 2244, 2249, 2249, 2179, 2254, 2240, 2268, 2290, 2250, 2263, 2241, 2262, 2200, 2231, 2276, 2296, 2293, 2220, 2295, 2208, 2211, 2291, 2214, 2215, 2214, 2217, 2288, 2295, 2210, 2215, 2213, 2290, 2291, 2213, 2291, 2210, 2290, 2210, 2208, 2217, 2212, 2212, 2216, 2288, 2293, 2292, 2211, 2209, 2209, 2292, 2294, 2291, 2278, 2291, 527, 531, 542, 523, 537, 528, 525, 530, 2440, 2453, 2453, 2455, 2483, 2462, 3197, 3194, 3184, 3192, 3165, 3186, 3198, 3190, 2772, 2777, 2781, 2776, 2796, 2773, 2783, 2278, 2300, 2243, 2278, 2297, 2282, 1462, 28677, 25180, 18652, 26276, 24206, 25891, 836, 856, 853, 832, 850, 859, 838, 857, 777, 2370, 2326, 2315, 2315, 2313, 2349, 2304, 2393};
    public String a = C0038.m6452(m460(), 0, 23, 479);

    public static HashMap a() {
        return C0020.m4251(C0023.m4536(m460(), 23, 10, 2955), C0029.m5256(m460(), 33, 111, 469));
    }

    /* renamed from: ۟ۦۧ۟ۨ, reason: not valid java name and contains not printable characters */
    public static short[] m460() {
        if (C0058.m9131() < 0) {
            return f78short;
        }
        return null;
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        String str3 = str;
        HashMap mapM4127 = C0019.m4127(C0032.m5708(m460(), 144, 2, 2649), C0035.m6131(m460(), 146, 4, 660), C0007.m1842(m460(), 150, 2, 2926), C0055.m8814(m460(), 152, 4, 2929));
        C0053.m8424(mapM4127, C0030.m5362(m460(), 156, 2, 1909), C0039.m6551(m460(), 158, 4, 2391));
        C0053.m8424(mapM4127, C0026.m4951(m460(), 162, 2, 2241), C0017.m3646(m460(), 164, 3, 3240));
        C0053.m8424(mapM4127, C0028.m5109(m460(), 167, 2, 3153), C0029.m5256(m460(), 169, 4, 983));
        String strM4403 = C0022.m4403(m460(), 173, 6, 1808);
        if (C0065.m9715(map, strM4403) != null) {
            str3 = (String) C0065.m9715(map, strM4403);
        }
        String strM7833 = C0047.m7833(m460(), 179, 5, 568);
        String str4 = (String) (C0065.m9715(map, strM7833) == null ? C0065.m9715(mapM4127, str3) : C0065.m9715(map, strM7833));
        StringBuilder sb = new StringBuilder();
        C0018.m3933(sb, C0019.m4113(this));
        StringBuilder sb2 = new StringBuilder(C0003.m1398(m460(), 184, 41, 2028));
        C0018.m3933(sb2, str3);
        C0018.m3933(sb2, C0008.m1970(m460(), 225, 6, 402));
        C0018.m3933(sb2, str4);
        C0018.m3933(sb2, C0022.m4403(m460(), 231, 6, 847));
        C0018.m3933(sb2, str2);
        C0018.m3933(sb, C0047.m7763(sb2));
        String strM5769 = C0032.m5769(C0047.m7763(sb), C0019.m4125());
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArrayM4333 = C0021.m4333(new JSONObject(strM5769), C0035.m6131(m460(), 237, 4, 1890));
        for (int i = 0; i < C0053.m8396(jSONArrayM4333); i++) {
            JSONObject jSONObjectM3923 = C0018.m3923(jSONArrayM4333, i);
            String strM1212 = C0001.m1212(jSONObjectM3923, C0037.m6307(m460(), 241, 8, 2602));
            String strM12122 = C0001.m1212(jSONObjectM3923, C0014.m3332(m460(), 249, 6, 2885));
            String strM12123 = C0001.m1212(jSONObjectM3923, C0049.m8007(m460(), 255, 12, 1508));
            String strM12124 = C0001.m1212(jSONObjectM3923, C0028.m5109(m460(), 267, 8, 508));
            String strM12125 = C0001.m1212(jSONObjectM3923, C0056.m8911(m460(), 275, 7, 572));
            String strM5172 = C0028.m5172(C0001.m1212(jSONObjectM3923, C0039.m6551(m460(), 282, 9, 1017)), C0057.m8978(m460(), 291, 1, 1143), strM12123);
            StringBuilder sb3 = new StringBuilder(C0048.m7902(m460(), 292, 9, 896));
            C0018.m3933(sb3, strM1212);
            C0018.m3933(sb3, C0013.m3106(m460(), 301, 8, 1190));
            C0018.m3933(sb3, strM12122);
            C0004.m1532(arrayList, new m(C0047.m7763(sb3), strM12124, strM12125, strM5172));
        }
        return C0047.m7783(arrayList);
    }

    public String detailContent(List<String> list) {
        StringBuilder sb = new StringBuilder();
        C0018.m3933(sb, C0019.m4113(this));
        C0018.m3933(sb, C0018.m3917(m460(), 309, 22, 1122));
        C0018.m3933(sb, (String) C0048.m7915(list, 0));
        String strM7763 = C0047.m7763(sb);
        StringBuilder sb2 = new StringBuilder();
        C0018.m3933(sb2, C0019.m4113(this));
        C0018.m3933(sb2, C0023.m4536(m460(), 331, 32, 2227));
        C0018.m3933(sb2, (String) C0048.m7915(list, 0));
        String strM77632 = C0047.m7763(sb2);
        String strM5769 = C0032.m5769(strM77632, C0019.m4125());
        String strM57692 = C0032.m5769(strM7763, C0019.m4125());
        JSONObject jSONObject = new JSONObject(strM5769);
        String strM4740 = C0024.m4740(m460(), 363, 4, 3223);
        JSONObject jSONObjectM1370 = C0003.m1370(jSONObject, strM4740);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator itM7553 = C0045.m7553(jSONObjectM1370);
        while (C0012.m2962(itM7553)) {
            String str = (String) C0048.m7949(itM7553);
            if (C0043.m7277(str, C0026.m4951(m460(), 367, 2, 2572))) {
                C0004.m1532(arrayList, str);
            }
        }
        C0027.m5077(arrayList, new l(0));
        Iterator itM7816 = C0047.m7816(arrayList);
        while (C0012.m2962(itM7816)) {
            JSONArray jSONArrayM4333 = C0021.m4333(jSONObjectM1370, (String) C0048.m7949(itM7816));
            ArrayList arrayList3 = new ArrayList();
            for (int i = 0; i < C0053.m8396(jSONArrayM4333); i++) {
                JSONObject jSONObjectM3923 = C0018.m3923(jSONArrayM4333, i);
                String strM1212 = C0001.m1212(jSONObjectM3923, C0056.m8911(m460(), 369, 11, 1668));
                String strM12122 = C0001.m1212(jSONObjectM3923, C0062.m9389(m460(), 380, 7, 2281));
                StringBuilder sb3 = new StringBuilder();
                C0018.m3933(sb3, strM1212);
                C0018.m3933(sb3, C0039.m6551(m460(), 387, 1, 1643));
                C0018.m3933(sb3, strM12122);
                C0004.m1532(arrayList3, C0047.m7763(sb3));
            }
            C0004.m1532(arrayList2, C0036.m6194(C0053.m8477(m460(), 388, 1, 3107), arrayList3));
        }
        String strM1549 = C0004.m1549(m460(), 389, 3, 2777);
        String strM6194 = C0036.m6194(strM1549, arrayList);
        String strM61942 = C0036.m6194(strM1549, arrayList2);
        JSONObject jSONObjectM13702 = C0003.m1370(new JSONObject(strM57692), strM4740);
        m mVar = new m();
        C0011.m2828(mVar, (String) C0048.m7915(list, 0));
        C0026.m4947(mVar, C0001.m1212(jSONObjectM13702, C0062.m9389(m460(), 392, 7, 1920)));
        C0005.m1628(mVar, C0001.m1212(jSONObjectM13702, C0054.m8574(m460(), 399, 8, 1632)));
        C0017.m3671(mVar, C0015.m3446(C0015.m3446(C0015.m3446(C0015.m3446(C0015.m3446(C0001.m1212(jSONObjectM13702, C0009.m2037(m460(), 407, 8, 526)), C0047.m7833(m460(), 415, 5, 770), C0002.m1305(m460(), 420, 2, 1456)), C0054.m8574(m460(), 422, 4, 3165), C0039.m6551(m460(), 426, 2, 1528)), C0012.m2973(m460(), 428, 8, 2208), C0057.m8978(m460(), 436, 4, 481)), C0041.m6779(m460(), 440, 6, 3175), C0026.m4951(m460(), 446, 2, 1498)), C0038.m6452(m460(), 448, 2, 529), C0036.m6188(m460(), 450, 4, 2630)));
        C0058.m9152(mVar, C0001.m1212(jSONObjectM13702, C0058.m9106(m460(), 454, 9, 2667)));
        StringBuilder sb4 = new StringBuilder(C0003.m1398(m460(), 463, 2, 2254));
        C0036.m6177(sb4, C0046.m7710(jSONObjectM13702, C0009.m2037(m460(), 465, 6, 1890)));
        C0018.m3933(sb4, C0021.m4340(m460(), 471, 1, 2964));
        C0019.m4073(mVar, C0047.m7763(sb4));
        C0027.m5000(mVar, strM77632);
        C0058.m9159(mVar, C0013.m3106(m460(), 472, 4, 567));
        C0058.m9085(mVar, C0001.m1212(jSONObjectM13702, C0063.m9585(m460(), 476, 12, 2002)));
        C0054.m8596(mVar, strM6194);
        C0044.m7449(mVar, strM61942);
        return C0053.m8428(mVar);
    }

    public String homeContent(boolean z) {
        ArrayList arrayList = new ArrayList();
        String strM1077 = C0000.m1077(m460(), 488, 2, 1955);
        String strM1305 = C0002.m1305(m460(), 490, 2, 1011);
        String strM7718 = C0046.m7718(m460(), 492, 2, 1344);
        String strM1398 = C0003.m1398(m460(), 494, 2, 2815);
        String strM8337 = C0052.m8337(m460(), 496, 2, 2374);
        List listM1203 = C0001.m1203(new String[]{strM1077, strM1305, strM7718, strM1398, strM8337});
        List listM12032 = C0001.m1203(new String[]{strM1077, strM1305, strM7718, strM1398, strM8337});
        for (int i = 0; i < C0064.m9636(listM1203); i++) {
            C0004.m1532(arrayList, new b((String) C0048.m7915(listM1203, i), (String) C0048.m7915(listM12032, i), null));
        }
        JSONObject jSONObject = new JSONObject(C0028.m5104());
        String strM5769 = C0032.m5769(C0028.m5188(new StringBuilder(), C0019.m4113(this), C0002.m1305(m460(), 498, 37, 2393)), C0019.m4125());
        ArrayList arrayList2 = new ArrayList();
        JSONArray jSONArrayM4333 = C0021.m4333(new JSONObject(strM5769), C0008.m1970(m460(), 535, 4, 932));
        for (int i2 = 0; i2 < C0053.m8396(jSONArrayM4333); i2++) {
            JSONObject jSONObjectM3923 = C0018.m3923(jSONArrayM4333, i2);
            String strM1212 = C0001.m1212(jSONObjectM3923, C0015.m3484(m460(), 539, 8, 1730));
            String strM12122 = C0001.m1212(jSONObjectM3923, C0055.m8814(m460(), 547, 6, 791));
            String strM9804 = C0065.m9804(C0001.m1212(jSONObjectM3923, C0021.m4340(m460(), 553, 12, 1412)), C0001.m1212(jSONObjectM3923, C0058.m9106(m460(), 565, 8, 1641)));
            String strM12123 = C0001.m1212(jSONObjectM3923, C0024.m4740(m460(), 573, 7, 350));
            String strM12124 = C0001.m1212(jSONObjectM3923, C0012.m2973(m460(), 580, 9, 2354));
            StringBuilder sb = new StringBuilder(C0052.m8337(m460(), 589, 9, 1229));
            C0018.m3933(sb, strM1212);
            C0018.m3933(sb, C0028.m5109(m460(), 598, 8, 1235));
            C0018.m3933(sb, strM12122);
            C0004.m1532(arrayList2, new m(C0047.m7763(sb), strM9804, strM12123, strM12124));
        }
        return C0062.m9423(arrayList, arrayList2, jSONObject);
    }

    public void init(Context context, String str) {
        if (C0057.m8953(str)) {
            return;
        }
        this.a = str;
    }

    public String playerContent(String str, String str2, List<String> list) {
        g gVar = new g();
        C0017.m3667(gVar, str2);
        C0057.m9029(gVar, C0019.m4125());
        return C0033.m5828(gVar);
    }

    public String searchContent(String str, boolean z) {
        StringBuilder sb = new StringBuilder();
        C0018.m3933(sb, C0019.m4113(this));
        C0018.m3933(sb, C0055.m8814(m460(), 606, 39, 2213));
        C0018.m3933(sb, C0056.m8909(str));
        C0018.m3933(sb, C0047.m7833(m460(), 645, 37, 2193));
        String strM5769 = C0032.m5769(C0047.m7763(sb), C0019.m4125());
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArrayM4333 = C0021.m4333(new JSONObject(strM5769), C0052.m8337(m460(), 682, 4, 2194));
        for (int i = 0; i < C0053.m8396(jSONArrayM4333); i++) {
            JSONObject jSONObjectM3923 = C0018.m3923(jSONArrayM4333, i);
            String strM8200 = C0051.m8200(jSONObjectM3923, C0014.m3332(m460(), 686, 8, 639));
            String strM82002 = C0051.m8200(jSONObjectM3923, C0045.m7657(m460(), 694, 6, 2554));
            String strM82003 = C0051.m8200(jSONObjectM3923, C0058.m9106(m460(), 700, 8, 3091));
            String strM82004 = C0051.m8200(jSONObjectM3923, C0035.m6131(m460(), 708, 7, 2748));
            String strM7833 = C0007.m1815(C0051.m8200(jSONObjectM3923, C0010.m2300(m460(), 715, 6, 2191)), C0053.m8477(m460(), 721, 1, 1415)) ? C0047.m7833(m460(), 722, 3, 1777) : C0029.m5256(m460(), 725, 3, 398);
            StringBuilder sb2 = new StringBuilder(C0035.m6131(m460(), 728, 9, 820));
            C0018.m3933(sb2, strM8200);
            C0018.m3933(sb2, C0043.m7290(m460(), 737, 8, 2404));
            C0018.m3933(sb2, strM82002);
            C0004.m1532(arrayList, new m(C0047.m7763(sb2), strM82003, strM82004, strM7833));
        }
        return C0047.m7783(arrayList);
    }
}