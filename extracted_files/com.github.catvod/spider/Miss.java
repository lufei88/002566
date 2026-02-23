package com.github.catvod.spider;

import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.E.b;
import com.github.catvod.spider.merge.E.c;
import com.github.catvod.spider.merge.E.g;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.J0.C0021;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.N.C0023;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.T0.h;
import com.github.catvod.spider.merge.T0.m;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.V0.d;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z.C0038;
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
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.r0.C0060;
import com.github.catvod.spider.merge.t.C0061;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.merge.z.C0065;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.a0.C0006;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.c0.C0010;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.r.C0014;
import com.github.catvod.spider.p000mergexbpq.x.C0015;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes.dex */
public class Miss extends Spider {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f87short = {2866, 2862, 2862, 2858, 2857, 2912, 2933, 2933, 2871, 2867, 2857, 2857, 2875, 2860, 2932, 2873, 2869, 2871, 2933, 2857, 2879, 2875, 2856, 2873, 2866, 2933, 338, 285, 268, 266, 264, 336, 2471, 2474, 2485, 2541, 2487, 2475, 2486, 2478, 2465, 2477, 2466, 2474, 2479, 941, 994, 952, 937, 948, 952, 993, 959, 937, 943, 931, 930, 936, 941, 958, 949, 2233, 2211, 2228, 2231, 2524, 2496, 2496, 2500, 2503, 2446, 2459, 2459, 2521, 2525, 2503, 2503, 2517, 2498, 2458, 2519, 2523, 2521, 2459, 1499, 1503, 1493, 1553, 1556, 1537, 1556, 1624, 1542, 1543, 1558, 948, 949, 932, 2061, 2062, 2079, 2064, 2806, 2794, 2794, 2798, 2797, 2724, 2737, 2737, 2803, 2807, 2797, 2797, 2815, 2792, 2736, 2813, 2801, 2803, 2737, 3062, 3065, 3068, 3044, 3061, 3042, 3043, 1767, 1704, 1721, 1727, 1725, 1765, 2025, 1968, 1983, 1978, 1954, 1971, 1956, 1957, 2027, 2300, 2218, 2235, 2237, 2239, 2279, 1807, 1794, 1821, 1861, 1823, 1795, 1822, 1798, 1801, 1797, 1802, 1794, 1799, 931, 1004, 950, 935, 954, 950, 1007, 945, 935, 929, 941, 940, 934, 931, 944, 955, 1664, 1690, 1677, 1678, 1721, 1725, 1719, 2101, 2096, 2085, 2096, 2172, 2082, 2083, 2098, 1152, 1153, 1168, 2836, 2839, 2822, 2825, 1081, 1061, 1061, 1057, 1058, 1131, 1150, 1150, 1084, 1080, 1058, 1058, 1072, 1063, 1151, 1074, 1086, 1084, 1150, 668, 660, 645, 656, 682, 641, 643, 670, 641, 660, 643, 645, 648, 716, 670, 662, 715, 645, 664, 645, 669, 660, 684, 577, 589, 588, 598, 583, 588, 598, 715, 707, 722, 711, 765, 726, 724, 713, 726, 707, 724, 722, 735, 667, 713, 705, 668, 719, 715, 711, 705, 707, 763, 1202, 1174, 1164, 1164, 1214, 1193, 27976, 27867, 2497, 3296, 3324, 3324, 3320, 3323, 3250, 3239, 3239, 3301, 3297, 3323, 3323, 3305, 3326, 3238, 3307, 3303, 3301, 3239, 395, 452, 392, 390, 389, 393, 385, 452, 410, 402, 455, 478, 452, 410, 403, 455, 472, 452, 414, 399, 402, 414, 455, 409, 391, 452, 390, 399, 395, 398, 387, 388, 397, 455, 479, 452, 414, 399, 402, 414, 455, 388, 389, 408, 398, 479, 452, 392, 397, 455, 388, 389, 408, 398, 473, 2737, 2731, 2748, 2751, 1083, 1074, 2577, 2581, 21977, -27559, 21373, 18537, 18831, 21010, 2142, 2137, 2131, 2142, 2113, 2142, 2131, 2114, 2134, 2139, 16942, 27012, 22356, 21078, 626, 633, 632, 639, 628, 610, 628, 572, 610, 612, 627, 613, 632, 613, 637, 628, 1361, 1374, 1371, 1347, 1362, 1349, 1348, -25527, 25593, 1439, 1426, 1421, 1493, 1423, 1427, 1422, 1430, 1433, 1429, 1434, 1426, 1431, 568, 631, 557, 572, 545, 557, 628, 554, 572, 570, 566, 567, 573, 568, 555, 544, 2354, 2358, 2364, 2392, 2397, 2376, 2397, 2321, 2383, 2382, 2399, 2975, 2974, 2959, 661, 662, 647, 648, 2699, 2711, 2711, 2707, 2704, 2777, 2764, 2764, 2702, 2698, 2704, 2704, 2690, 2709, 2765, 2688, 2700, 2702, 2764, 3084};

    public static String a(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder(C0034.m6001(m483(), 0, 26, 2906));
        C0018.m3933(sb, str);
        C0018.m3933(sb, C0034.m6001(m483(), 26, 6, 365));
        C0018.m3933(sb, str2);
        Iterator itM7807 = C0047.m7807(C0030.m5333(C0016.m3577(C0032.m5769(C0047.m7763(sb), null)), C0023.m4536(m483(), 32, 13, 2499)));
        while (C0012.m2962(itM7807)) {
            m mVar = (m) C0048.m7949(itM7807);
            String strM1189 = C0001.m1189(m483(), 45, 16, 972);
            String strM3446 = C0015.m3446(C0049.m8058(C0030.m5333(mVar, strM1189), C0010.m2300(m483(), 61, 4, 2257)), C0012.m2973(m483(), 65, 19, 2484), C0007.m1840());
            String strM4684 = C0024.m4684(C0030.m5333(mVar, strM1189));
            String strM8259 = C0051.m8259(m483(), 84, 3, 1458);
            String strM8058 = C0049.m8058(C0030.m5333(mVar, strM8259), C0014.m3332(m483(), 87, 8, 1653));
            if (C0057.m8953(strM8058)) {
                strM8058 = C0049.m8058(C0030.m5333(mVar, strM8259), C0046.m7718(m483(), 95, 3, 967));
            }
            String strM46842 = C0024.m4684(C0030.m5333(mVar, C0042.m7151(m483(), 98, 4, 2174)));
            if (!C0043.m7327(strM4684)) {
                C0055.m8732(strM3446, strM4684, strM8058, strM46842, arrayList);
            }
        }
        return C0047.m7783(arrayList);
    }

    /* renamed from: ۣ۟۠ۨ۠, reason: not valid java name and contains not printable characters */
    public static short[] m483() {
        if (C0048.m7971() >= 0) {
            return f87short;
        }
        return null;
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        ArrayList arrayList = new ArrayList();
        String strM4951 = C0026.m4951(m483(), 102, 19, 2718);
        String strM4915 = C0026.m4915(strM4951, str);
        String strM5565 = C0031.m5565(m483(), 121, 7, 2960);
        Iterator itM7807 = C0047.m7807(C0030.m5333(C0016.m3577(C0032.m5769(C0043.m7327((String) C0065.m9715(map, strM5565)) ? C0028.m5172(strM4915, C0049.m8007(m483(), 128, 6, 1752), str2) : C0038.m6434(C0012.m3016(strM4915, C0006.m1774(m483(), 134, 9, 2006)), (String) C0065.m9715(map, strM5565), C0045.m7657(m483(), 143, 6, 2266), str2), null)), C0011.m2805(m483(), 149, 13, 1899)));
        while (C0012.m2962(itM7807)) {
            m mVar = (m) C0048.m7949(itM7807);
            String strM1549 = C0004.m1549(m483(), 162, 16, 962);
            String strM3446 = C0015.m3446(C0049.m8058(C0030.m5333(mVar, strM1549), C0061.m9361(m483(), 178, 4, 1768)), strM4951, C0007.m1840());
            String strM4684 = C0024.m4684(C0030.m5333(mVar, strM1549));
            String strM7657 = C0045.m7657(m483(), 182, 3, 1744);
            String strM8058 = C0049.m8058(C0030.m5333(mVar, strM7657), C0019.m4107(m483(), 185, 8, 2129));
            if (C0057.m8953(strM8058)) {
                strM8058 = C0049.m8058(C0030.m5333(mVar, strM7657), C0006.m1774(m483(), 193, 3, 1267));
            }
            String strM46842 = C0024.m4684(C0030.m5333(mVar, C0016.m3525(m483(), 196, 4, 2919)));
            if (!C0043.m7327(strM4684)) {
                C0055.m8732(strM3446, strM4684, strM8058, strM46842, arrayList);
            }
        }
        return C0047.m7783(arrayList);
    }

    public String detailContent(List<String> list) {
        StringBuilder sb = new StringBuilder(C0060.m9352(m483(), 200, 19, 1105));
        C0018.m3933(sb, (String) C0048.m7915(list, 0));
        h hVarM3577 = C0016.m3577(C0032.m5769(C0047.m7763(sb), null));
        d dVarM5333 = C0030.m5333(hVarM3577, C0022.m4403(m483(), 219, 23, 753));
        String strM8131 = C0050.m8131(m483(), 242, 7, 546);
        String strM8058 = C0049.m8058(dVarM5333, strM8131);
        String strM80582 = C0049.m8058(C0030.m5333(hVarM3577, C0018.m3917(m483(), 249, 23, 678)), strM8131);
        com.github.catvod.spider.merge.E.m mVar = new com.github.catvod.spider.merge.E.m();
        C0011.m2828(mVar, (String) C0048.m7915(list, 0));
        C0026.m4947(mVar, strM80582);
        C0005.m1628(mVar, strM8058);
        C0054.m8596(mVar, C0060.m9352(m483(), 272, 6, 1279));
        StringBuilder sb2 = new StringBuilder(C0061.m9361(m483(), 278, 3, 2533));
        C0018.m3933(sb2, (String) C0048.m7915(list, 0));
        C0044.m7449(mVar, C0047.m7763(sb2));
        return C0053.m8428(mVar);
    }

    public String homeContent(boolean z) {
        String strM8574;
        String strM1840;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String strM5852 = C0033.m5852(m483(), 281, 19, 3208);
        h hVarM3577 = C0016.m3577(C0032.m5769(strM5852, null));
        Iterator itM7807 = C0047.m7807(C0030.m5333(hVarM3577, C0024.m4740(m483(), 300, 55, 490)));
        while (true) {
            boolean zM2962 = C0012.m2962(itM7807);
            strM8574 = C0054.m8574(m483(), 355, 4, 2777);
            strM1840 = C0007.m1840();
            if (!zM2962) {
                break;
            }
            m mVar = (m) C0048.m7949(itM7807);
            String strM3446 = C0015.m3446(C0010.m2339(mVar, strM8574), strM5852, strM1840);
            if (C0043.m7277(strM3446, C0038.m6452(m483(), 359, 2, 1119)) || C0058.m9127(strM3446, C0053.m8477(m483(), 361, 2, 2631))) {
                C0004.m1532(arrayList2, new b(strM3446, C0064.m9669(mVar), null));
                C0037.m6362(linkedHashMap, strM3446, C0001.m1203(new com.github.catvod.spider.merge.E.d[]{new com.github.catvod.spider.merge.E.d(C0014.m3332(m483(), 399, 7, 1335), C0056.m8911(m483(), 406, 2, 3079), C0001.m1203(new c[]{new c(C0021.m4340(m483(), 363, 2, 1201), strM1840), new c(C0015.m3484(m483(), 365, 4, 1747), C0048.m7902(m483(), 369, 10, 2103)), new c(C0041.m6779(m483(), 379, 4, 3075), C0027.m5062(m483(), 383, 16, 529))}))}));
            }
        }
        Iterator itM78072 = C0047.m7807(C0030.m5333(hVarM3577, C0044.m7509(m483(), 408, 13, 1531)));
        while (C0012.m2962(itM78072)) {
            m mVar2 = (m) C0048.m7949(itM78072);
            String strM85742 = C0054.m8574(m483(), 421, 16, 601);
            String strM34462 = C0015.m3446(C0049.m8058(C0030.m5333(mVar2, strM85742), strM8574), strM5852, strM1840);
            String strM4684 = C0024.m4684(C0030.m5333(mVar2, strM85742));
            String strM2805 = C0011.m2805(m483(), 437, 3, 2395);
            String strM8058 = C0049.m8058(C0030.m5333(mVar2, strM2805), C0027.m5062(m483(), 440, 8, 2364));
            if (C0057.m8953(strM8058)) {
                strM8058 = C0049.m8058(C0030.m5333(mVar2, strM2805), C0009.m2037(m483(), 448, 3, 3052));
            }
            String strM46842 = C0024.m4684(C0030.m5333(mVar2, C0065.m9775(m483(), 451, 4, 742)));
            if (!C0043.m7327(strM4684)) {
                C0055.m8732(strM34462, strM4684, strM8058, strM46842, arrayList);
            }
        }
        return C0033.m5854(arrayList2, arrayList, linkedHashMap);
    }

    public String playerContent(String str, String str2, List<String> list) {
        g gVar = new g();
        C0038.m6396(gVar);
        StringBuilder sb = new StringBuilder(C0012.m2973(m483(), 455, 19, 2787));
        C0018.m3933(sb, str2);
        C0017.m3667(gVar, C0047.m7763(sb));
        return C0033.m5828(gVar);
    }

    public String searchContent(String str, boolean z) {
        return C0028.m5157(str, C0025.m4795(m483(), 474, 1, 3133));
    }

    public String searchContent(String str, boolean z, String str2) {
        return C0028.m5157(str, str2);
    }
}