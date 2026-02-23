package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.E.b;
import com.github.catvod.spider.merge.E.g;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.J0.C0021;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.N.C0023;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.T0.m;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.V0.d;
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
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.f0.C0052;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.r0.C0059;
import com.github.catvod.spider.merge.r0.C0060;
import com.github.catvod.spider.merge.t.C0061;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.merge.z.C0065;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
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
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class BilibiliLive extends Spider {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f8short = {3170, 3177, 3180, 3177, 3170, 3177, 3180, 3177, 3118, 3171, 3183, 3181, 3119, 2017, 1689, 1727, 1705, 1726, 1761, 1677, 1707, 1705, 1698, 1720, 594, 624, 613, 630, 627, 627, 638, 560, 554, 561, 559, 575, 567, 584, 630, 625, 635, 624, 616, 620, 575, 593, 587, 575, 558, 559, 561, 559, 548, 575, 584, 630, 625, 553, 555, 548, 575, 615, 553, 555, 566, 575, 606, 623, 623, 627, 634, 584, 634, 637, 596, 630, 619, 560, 554, 556, 552, 561, 556, 553, 575, 567, 596, 599, 587, 594, 595, 563, 575, 627, 630, 628, 634, 575, 600, 634, 636, 628, 624, 566, 575, 604, 631, 621, 624, 626, 634, 560, 558, 557, 550, 561, 559, 561, 559, 561, 559, 575, 588, 638, 633, 638, 621, 630, 560, 554, 556, 552, 561, 556, 553, 575, 602, 635, 632, 560, 558, 557, 550, 561, 559, 561, 559, 561, 559, 2376, 2388, 2388, 2384, 2387, 2330, 2319, 2319, 2387, 2373, 2369, 2386, 2371, 2376, 2318, 2370, 2377, 2380, 2377, 2370, 2377, 2380, 2377, 2318, 2371, 2383, 2381, 2319, 2380, 2377, 2390, 2373, 2335, 2379, 2373, 2393, 2391, 2383, 2386, 2372, 2333, 2828, 2829, 2847, 2932, 2913, 1608, 1566, 1551, 1545, 1547, 1619, 705, 716, 723, 651, 723, 716, 705, 704, 714, 648, 713, 716, 726, 721, 648, 716, 721, 704, 712, 1648, 1579, 1590, 1658, 1649, 1652, 1649, 1589, 1652, 1649, 1646, 1661, 1589, 1659, 1657, 1642, 1660, 1607, 1607, 1649, 1654, 1662, 1655, 1589, 1589, 1644, 1649, 1644, 32737, 28088, 18232, 1417, 1480, 1490, 1477, 1478, 437, 433, 443, 1429, 1428, 1413, 534, 522, 522, 526, 1470, 1442, 1442, 1446, 1445, 1516, 1365, 1306, 1366, 1373, 1368, 1373, 1305, 1368, 1373, 1346, 1361, 1305, 1367, 1365, 1350, 1360, 1387, 1387, 1373, 1370, 1362, 1371, 1305, 1305, 1345, 1370, 1365, 1369, 1361, 1570, 1598, 1598, 1594, 1593, 1648, 1637, 1637, 1579, 1594, 1571, 1636, 1574, 1571, 1596, 1583, 1636, 1576, 1571, 1574, 1571, 1576, 1571, 1574, 1571, 1636, 1577, 1573, 1575, 1637, 1586, 1574, 1571, 1596, 1583, 1637, 1597, 1583, 1576, 1639, 1592, 1573, 1573, 1575, 1637, 1596, 1656, 1637, 1571, 1572, 1582, 1583, 1586, 1637, 1581, 1583, 1598, 1560, 1573, 1573, 1575, 1562, 1574, 1579, 1587, 1539, 1572, 1580, 1573, 1653, 1592, 1573, 1573, 1575, 1557, 1571, 1582, 1655, 2556, 2474, 2486, 2491, 2478, 2492, 2485, 2472, 2487, 2535, 2477, 2495, 2488, 2556, 2474, 2472, 2485, 2478, 2485, 2489, 2485, 2486, 2535, 2538, 2550, 2539, 2556, 2492, 2485, 2472, 2487, 2491, 2478, 2535, 2538, 2550, 2539, 2550, 2536, 2556, 2489, 2485, 2494, 2495, 2489, 2535, 2538, 2550, 2539, 3043, 3046, 3059, 3046, 1343, 1315, 1326, 1334, 1338, 1341, 1315, 1296, 1318, 1313, 1321, 1312, 1762, 1790, 1779, 1771, 1767, 1760, 1790, 3057, 3062, 3056, 3047, 3043, 3055, 3059, 3066, 3047, 3064, 3060, 3041, 2289, 2301, 2294, 2295, 2289, 571, 572, 546, 529, 551, 544, 552, 545, 2267, 2268, 2240, 2247, 2879, 2876, 2862, 2872, 2818, 2856, 2863, 2865, 2193, 2188, 2176, 2182, 2197, 20804, 31756, -28836, 1585, 2615, 2353, 29610, 32647, 28126, 2398, 24777, -31707, -32215, 31968, 24383, 24322, 32031, 28486, 24432, 24397, 17847, 29979, -32748, -31093, -29987, -25338, 17573, 25595, 28552, 30839, 26910, 22779, 27796, 26006, 27041, -31981, 26518, 19314, 25060, 29382, 21507, 17215, -29474, -31102, 24545, 24287, 19134, 32078, 22282, 22154, -32707, 26600, -26717, 458, 2535, 2555, 2555, 2559, 2556, 2485, 2464, 2464, 2556, 2538, 2542, 2557, 2540, 2535, 2465, 2541, 2534, 2531, 2534, 2541, 2534, 2531, 2534, 2465, 2540, 2528, 2530, 2464, 2531, 2534, 2553, 2538, 2480, 2532, 2538, 2550, 2552, 2528, 2557, 2539, 2482, 1549, 1548, 1566, 1653, 1632, 2172, 2090, 2107, 2109, 2111, 2151, 2928, 2941, 2914, 2874, 2914, 2941, 2928, 2929, 2939, 2873, 2936, 2941, 2919, 2912, 2873, 2941, 2912, 2929, 2937, 2801, 2730, 2743, 2811, 2800, 2805, 2800, 2740, 2805, 2800, 2799, 2812, 2740, 2810, 2808, 2795, 2813, 2758, 2758, 2800, 2807, 2815, 2806, 2740, 2740, 2797, 2800, 2797, 29740, 26229, 19701, 3183, 2701, 2711, 2688, 2691, 3097, 3101, 3095, 296, 297, 312, 2028, 2032, 2032, 2036, 458, 470, 470, 466, 465, 408, 2523, 2452, 2520, 2515, 2518, 2515, 2455, 2518, 2515, 2508, 2527, 2455, 2521, 2523, 2504, 2526, 2533, 2533, 2515, 2516, 2524, 2517, 2455, 2455, 2511, 2516, 2523, 2519, 2527};

    public static String b(String str) {
        int iM9178 = C0059.m9178(str, C0056.m8911(m79(), 0, 13, 3072));
        if (iM9178 == -1) {
            return C0007.m1840();
        }
        int i = iM9178 + 13;
        int iM5388 = C0030.m5388(str, C0024.m4740(m79(), 13, 1, 2014), i);
        if (iM5388 == -1) {
            iM5388 = C0004.m1584(str);
        }
        return C0054.m8636(str, i, iM5388);
    }

    public static HashMap c() {
        return C0020.m4251(C0013.m3106(m79(), 14, 10, 1740), C0060.m9352(m79(), 24, 125, 543));
    }

    /* renamed from: ۣ۟۠ۧۧ, reason: not valid java name and contains not printable characters */
    public static short[] m79() {
        if (C0045.m7538() < 0) {
            return f8short;
        }
        return null;
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        int iM6456 = str2 != null ? C0038.m6456(str2) : 1;
        StringBuilder sb = new StringBuilder(C0014.m3332(m79(), 149, 41, 2336));
        C0018.m3933(sb, C0051.m8202(str, C0003.m1398(m79(), 190, 5, 2905)));
        C0018.m3933(sb, C0063.m9585(m79(), 195, 6, 1646));
        C0036.m6177(sb, iM6456);
        d dVarM5333 = C0030.m5333(C0016.m3577(C0032.m5769(C0047.m7763(sb), C0044.m7491())), C0048.m7902(m79(), 201, 19, 677));
        ArrayList arrayList = new ArrayList();
        Iterator itM7807 = C0047.m7807(dVarM5333);
        while (C0012.m2962(itM7807)) {
            m mVar = (m) C0048.m7949(itM7807);
            m mVarM6243 = C0036.m6243(mVar, C0062.m9389(m79(), 220, 28, 1560));
            if (mVarM6243 != null) {
                String strM9640 = C0064.m9640(C0064.m9669(mVarM6243));
                String strM1549 = C0004.m1549(m79(), 248, 3, 2325);
                String strM1840 = C0007.m1840();
                String strM3446 = C0015.m3446(strM9640, strM1549, strM1840);
                m mVarM62432 = C0036.m6243(mVarM6243, C0050.m8131(m79(), 251, 1, 1512));
                if (mVarM62432 != null) {
                    String strM5591 = C0031.m5591(C0010.m2339(mVarM62432, C0028.m5109(m79(), 252, 4, 1440)));
                    if (!C0057.m8953(strM5591)) {
                        m mVarM62433 = C0036.m6243(mVar, C0022.m4403(m79(), 256, 3, 476));
                        String strM2339 = mVarM62433 != null ? C0010.m2339(mVarM62433, C0052.m8337(m79(), 259, 3, 1510)) : strM1840;
                        if (!C0043.m7277(strM2339, C0028.m5109(m79(), 262, 4, 638))) {
                            strM2339 = C0050.m8125(C0041.m6779(m79(), 266, 6, 1494), strM2339);
                        }
                        m mVarM62434 = C0036.m6243(mVar, C0027.m5062(m79(), 272, 29, 1332));
                        if (mVarM62434 != null) {
                            strM1840 = C0064.m9640(C0064.m9669(mVarM62434));
                        }
                        C0055.m8732(strM5591, strM3446, strM2339, strM1840, arrayList);
                    }
                }
            }
        }
        return C0020.m4216(C0011.m2808(iM6456), C0011.m2808(iM6456 + 1), C0011.m2808(90), C0011.m2808(999999), arrayList);
    }

    public String detailContent(List<String> list) {
        JSONObject jSONObjectM7123;
        JSONObject jSONObjectM71232;
        JSONArray jSONArrayM1964;
        JSONArray jSONArrayM19642;
        JSONArray jSONArrayM19643;
        JSONArray jSONArrayM19644;
        JSONObject jSONObjectM1706;
        String str = (String) C0048.m7915(list, 0);
        JSONObject jSONObjectM71233 = C0042.m7123(new JSONObject(C0032.m5769(C0000.m1130(C0046.m7718(m79(), 301, 78, 1610), str, C0040.m6584(m79(), 379, 49, 2522)), C0044.m7491())), C0037.m6307(m79(), 428, 4, 2951));
        if (jSONObjectM71233 != null && (jSONObjectM7123 = C0042.m7123(jSONObjectM71233, C0042.m7151(m79(), 432, 12, 1359))) != null && (jSONObjectM71232 = C0042.m7123(jSONObjectM7123, C0039.m6551(m79(), 444, 7, 1682))) != null && (jSONArrayM1964 = C0008.m1964(jSONObjectM71232, C0004.m1549(m79(), 451, 6, 2946))) != null) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < C0053.m8396(jSONArrayM1964); i++) {
                JSONObject jSONObjectM17062 = C0006.m1706(jSONArrayM1964, i);
                if (jSONObjectM17062 != null && (jSONArrayM19642 = C0008.m1964(jSONObjectM17062, C0062.m9389(m79(), 457, 6, 2965))) != null) {
                    for (int i2 = 0; i2 < C0053.m8396(jSONArrayM19642); i2++) {
                        JSONObject jSONObjectM17063 = C0006.m1706(jSONArrayM19642, i2);
                        if (jSONObjectM17063 != null && (jSONArrayM19643 = C0008.m1964(jSONObjectM17063, C0051.m8259(m79(), 463, 5, 2194))) != null) {
                            for (int i3 = 0; i3 < C0053.m8396(jSONArrayM19643); i3++) {
                                JSONObject jSONObjectM17064 = C0006.m1706(jSONArrayM19643, i3);
                                if (jSONObjectM17064 != null && (jSONArrayM19644 = C0008.m1964(jSONObjectM17064, C0035.m6131(m79(), 468, 8, 590))) != null && C0053.m8396(jSONArrayM19644) >= 2 && (jSONObjectM1706 = C0006.m1706(jSONArrayM19644, 1)) != null) {
                                    String strM6779 = C0041.m6779(m79(), 476, 4, 2227);
                                    String strM1840 = C0007.m1840();
                                    String strM2054 = C0009.m2054(jSONObjectM1706, strM6779, strM1840);
                                    String strM20542 = C0009.m2054(jSONObjectM17064, C0008.m1970(m79(), 480, 8, 2909), strM1840);
                                    String strM20543 = C0009.m2054(jSONObjectM1706, C0009.m2037(m79(), 488, 5, 2292), strM1840);
                                    if (!C0057.m8953(strM2054) && !C0057.m8953(strM20542) && !C0057.m8953(strM20543)) {
                                        String strM5172 = C0028.m5172(strM2054, strM20542, strM20543);
                                        StringBuilder sb2 = new StringBuilder();
                                        C0036.m6177(sb2, i + 1);
                                        C0018.m3933(sb2, C0037.m6307(m79(), 493, 3, 691));
                                        C0018.m3933(sb, C0047.m7763(sb2));
                                        C0018.m3933(sb, C0064.m9599(m79(), 496, 1, 1557));
                                        C0018.m3933(sb, strM5172);
                                        C0018.m3933(sb, C0018.m3917(m79(), 497, 1, 2580));
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (C0006.m1693(sb) > 0) {
                C0038.m6398(sb, C0006.m1693(sb) - 1);
            }
            com.github.catvod.spider.merge.E.m mVar = new com.github.catvod.spider.merge.E.m();
            C0011.m2828(mVar, str);
            StringBuilder sb3 = new StringBuilder(C0008.m1970(m79(), 498, 5, 2419));
            C0018.m3933(sb3, str);
            C0005.m1628(mVar, C0047.m7763(sb3));
            C0027.m5000(mVar, C0063.m9585(m79(), 503, 8, 3051));
            C0054.m8596(mVar, C0019.m4107(m79(), 511, 4, 2980));
            C0044.m7449(mVar, C0047.m7763(sb));
            return C0053.m8428(mVar);
        }
        return C0053.m8428(new com.github.catvod.spider.merge.E.m());
    }

    public String homeContent(boolean z) {
        ArrayList arrayList = new ArrayList();
        C0004.m1532(arrayList, new b(C0020.m4199(m79(), 515, 1, 522), C0065.m9775(m79(), 516, 2, 1173), null));
        String strM6584 = C0040.m6584(m79(), 518, 2, 2805);
        C0004.m1532(arrayList, new b(strM6584, strM6584, null));
        String strM4536 = C0023.m4536(m79(), 520, 2, 432);
        C0004.m1532(arrayList, new b(strM4536, strM4536, null));
        String strM6779 = C0041.m6779(m79(), 522, 2, 1830);
        C0004.m1532(arrayList, new b(strM6779, strM6779, null));
        String strM7657 = C0045.m7657(m79(), 524, 4, 2990);
        C0004.m1532(arrayList, new b(strM7657, strM7657, null));
        String strM1970 = C0008.m1970(m79(), 528, 4, 1353);
        C0004.m1532(arrayList, new b(strM1970, strM1970, null));
        String strM8978 = C0057.m8978(m79(), 532, 2, 2035);
        C0004.m1532(arrayList, new b(strM8978, strM8978, null));
        String strM7509 = C0044.m7509(m79(), 534, 2, 3180);
        C0004.m1532(arrayList, new b(strM7509, strM7509, null));
        String strM8131 = C0050.m8131(m79(), 536, 2, 1736);
        C0004.m1532(arrayList, new b(strM8131, strM8131, null));
        String strM4340 = C0021.m4340(m79(), 538, 2, 1262);
        C0004.m1532(arrayList, new b(strM4340, strM4340, null));
        C0004.m1532(arrayList, new b(C0065.m9775(m79(), 540, 2, 2171), C0063.m9585(m79(), 542, 2, 2555), null));
        String strM4740 = C0024.m4740(m79(), 544, 2, 600);
        C0004.m1532(arrayList, new b(strM4740, strM4740, null));
        return C0025.m4831(arrayList, new ArrayList());
    }

    public void init(Context context, String str) {
    }

    public String playerContent(String str, String str2, List<String> list) {
        g gVar = new g();
        C0017.m3667(gVar, str2);
        C0057.m9029(gVar, C0044.m7491());
        return C0033.m5828(gVar);
    }

    public String searchContent(String str, boolean z) {
        return C0005.m1595(this, str, z, C0021.m4340(m79(), 546, 1, 507));
    }

    public String searchContent(String str, boolean z, String str2) {
        int iM6456 = str2 != null ? C0038.m6456(str2) : 1;
        StringBuilder sb = new StringBuilder(C0012.m2973(m79(), 547, 41, 2447));
        C0018.m3933(sb, C0051.m8202(str, C0058.m9106(m79(), 588, 5, 1624)));
        C0018.m3933(sb, C0063.m9585(m79(), 593, 6, 2138));
        C0036.m6177(sb, iM6456);
        d dVarM5333 = C0030.m5333(C0016.m3577(C0032.m5769(C0047.m7763(sb), C0044.m7491())), C0000.m1077(m79(), 599, 19, 2836));
        ArrayList arrayList = new ArrayList();
        Iterator itM7807 = C0047.m7807(dVarM5333);
        while (C0012.m2962(itM7807)) {
            m mVar = (m) C0048.m7949(itM7807);
            m mVarM6243 = C0036.m6243(mVar, C0055.m8814(m79(), 618, 28, 2713));
            if (mVarM6243 != null) {
                String strM9640 = C0064.m9640(C0064.m9669(mVarM6243));
                String strM1645 = C0005.m1645(m79(), 646, 3, 728);
                String strM1840 = C0007.m1840();
                String strM3446 = C0015.m3446(strM9640, strM1645, strM1840);
                m mVarM62432 = C0036.m6243(mVarM6243, C0009.m2037(m79(), 649, 1, 3086));
                if (mVarM62432 != null) {
                    String strM5591 = C0031.m5591(C0010.m2339(mVarM62432, C0061.m9361(m79(), 650, 4, 2789)));
                    if (!C0057.m8953(strM5591)) {
                        m mVarM62433 = C0036.m6243(mVar, C0054.m8574(m79(), 654, 3, 3184));
                        String strM2339 = mVarM62433 != null ? C0010.m2339(mVarM62433, C0019.m4107(m79(), 657, 3, 347)) : strM1840;
                        if (!C0043.m7277(strM2339, C0050.m8131(m79(), 660, 4, 1924))) {
                            strM2339 = C0050.m8125(C0000.m1077(m79(), 664, 6, 418), strM2339);
                        }
                        m mVarM62434 = C0036.m6243(mVar, C0002.m1305(m79(), 670, 29, 2490));
                        if (mVarM62434 != null) {
                            strM1840 = C0064.m9640(C0064.m9669(mVarM62434));
                        }
                        C0055.m8732(strM5591, strM3446, strM2339, strM1840, arrayList);
                    }
                }
            }
        }
        return C0020.m4216(C0011.m2808(iM6456), C0011.m2808(iM6456 + 1), C0011.m2808(90), C0011.m2808(999999), arrayList);
    }
}