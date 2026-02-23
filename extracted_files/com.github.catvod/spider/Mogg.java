package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.D.f;
import com.github.catvod.spider.merge.E.b;
import com.github.catvod.spider.merge.E.g;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.J0.C0021;
import com.github.catvod.spider.merge.K0.C0022;
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
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.f0.C0052;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.g0.AbstractC0308c;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.r0.C0060;
import com.github.catvod.spider.merge.t.C0061;
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
import com.github.catvod.spider.p000mergexbpq.r.C0014;
import com.github.catvod.spider.p000mergexbpq.x.C0015;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public class Mogg extends Cloud {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f88short = {1416, 1428, 1428, 1424, 1498, 1487, 1487, 1489, 1488, 1491, 1486, 1492, 1493, 1486, 1489, 1494, 1490, 1486, 1490, 1488, 1495, 1498, 1490, 1488, 1495, 1490, 1488, 1487, 1753, 1758, 1748, 1749, 1736, 1694, 1728, 1752, 1728, 1695, 1734, 1759, 1748, 1695, 1732, 1737, 1728, 1749, 1695, 1753, 1748, 1695, 1688, 1772, 1735, 1691, 1689, 1694, 1752, 1732, 1757, 1756, 940, 980, 940, 984, 978, 940, 990, 925, 913, 915, 943, 900, 927, 900, 913, 924, 978, 940, 985, 940, 990, 900, 917, 904, 900, 940, 984, 983, 984, 940, 916, 987, 985, 983, 940, 985, 971, 2647, 2673, 2663, 2672, 2607, 2627, 2661, 2663, 2668, 2678, 3106, 3072, 3093, 3078, 3075, 3075, 3086, 3136, 3162, 3137, 3167, 3151, 3143, 3128, 3078, 3073, 3083, 3072, 3096, 3100, 3151, 3105, 3131, 3151, 3166, 3167, 3137, 3167, 3156, 3151, 3128, 3078, 3073, 3161, 3163, 3156, 3151, 3095, 3161, 3163, 3142, 3151, 3118, 3103, 3103, 3075, 3082, 3128, 3082, 3085, 3108, 3078, 3099, 3136, 3162, 3164, 3160, 3137, 3164, 3161, 3151, 3143, 3108, 3111, 3131, 3106, 3107, 3139, 3151, 3075, 3078, 3076, 3082, 3151, 3112, 3082, 3084, 3076, 3072, 3142, 3151, 3116, 3079, 3101, 3072, 3074, 3082, 3136, 3166, 3165, 3165, 3137, 3167, 3137, 3167, 3137, 3167, 3151, 3132, 3086, 3081, 3086, 3101, 3078, 3136, 3162, 3164, 3160, 3137, 3164, 3161, 914, 977, 979, 984, 969, 976, 985, 913, 981, 968, 985, 977, 2292, 2220, 2227, 2238, 2239, 2229, 2295, 2228, 2235, 2231, 2239, 2298, 2235, 1989, 2015, 1992, 1995, 2793, 2730, 2728, 2723, 2738, 2731, 2722, 2794, 2734, 2739, 2722, 2730, 2794, 2743, 2734, 2724, 2791, 2809, 2791, 2734, 2730, 2720, 1225, 1228, 1241, 1228, 1152, 1246, 1247, 1230, 2640, 2568, 2583, 2586, 2587, 2577, 2643, 2576, 2591, 2579, 2587, 1816, 1883, 1881, 1874, 1859, 1882, 1875, 1819, 1887, 1858, 1875, 1883, 1819, 1858, 1875, 1870, 1858, 1435, 1501, 1498, 1488, 1489, 1484, 1434, 1476, 1500, 1476, 1435, 1474, 1499, 1488, 1435, 1479, 1489, 1493, 1478, 1495, 1500, 1435, 1476, 1493, 1491, 1489, 1435, 2193, 2249, 2266, 2193, 2541, 2475, 2487, 2478, 2479, 2669, 2606, 2604, 2599, 2614, 2607, 2598, 2670, 2608, 2598, 2594, 2609, 2592, 2603, 2670, 2602, 2615, 2598, 2606, 2532, 2492, 2467, 2478, 2479, 2469, 2535, 2489, 2479, 2488, 2467, 2475, 2470, 1484, 1494, 1473, 1474, 3184, 3181, 3184, 3176, 3169, 2720, 2787, 2785, 2794, 2811, 2786, 2795, 2723, 2791, 2810, 2795, 2787, 2723, 2814, 2791, 2797, 2734, 2736, 2734, 2791, 2787, 2793, 2056, 2061, 2072, 2061, 2113, 2079, 2078, 2063, 817, 873, 886, 891, 890, 880, 818, 875, 894, 888, 818, 886, 892, 880, 881, 2503, 2433, 2438, 2444, 2445, 2448, 2502, 2456, 2432, 2456, 2503, 2462, 2439, 2444, 2503, 2459, 2432, 2439, 2463, 2503, 2433, 2444, 2503, 2159, 2096, 2081, 2087, 2085, 2159, 451, 389, 409, 384, 385, 2062, 2134, 2121, 2116, 2117, 2127, 2061, 2121, 2126, 2118, 2127, 2061, 2120, 2117, 2113, 2116, 2117, 2130, 2048, 2078, 2048, 2062, 2128, 2113, 2119, 2117, 2061, 2132, 2121, 2132, 2124, 2117, 1547, 1608, 1610, 1601, 1616, 1609, 1600, 1544, 1612, 1617, 1600, 1608, 1544, 1621, 1612, 1606, 1541, 1612, 1608, 1602, 1698, 1703, 1714, 1703, 1771, 1717, 1716, 1701, 545, 633, 614, 619, 618, 608, 546, 614, 609, 617, 608, 546, 615, 618, 622, 619, 618, 637, 559, 622, 545, 635, 622, 616, 546, 611, 614, 609, 612, 3202, 3290, 3269, 3272, 3273, 3267, 3201, 3269, 3266, 3274, 3267, 3201, 3268, 3273, 3277, 3272, 3273, 3294, 3212, 3272, 3269, 3290, 3202, 3288, 3277, 3275, 3201, 3264, 3269, 3266, 3271, 3212, 3277, 2701, 832, 771, 769, 778, 795, 770, 779, 835, 796, 769, 793, 835, 794, 779, 790, 794, 2235, 2238, 2219, 2238, 2290, 2236, 2227, 2230, 2223, 2237, 2224, 2238, 2221, 2235, 2290, 2219, 2234, 2215, 2219, 2710, 2766, 2769, 2780, 2781, 2775, 2709, 2769, 2774, 2782, 2775, 2709, 2769, 2764, 2781, 2773, 22924, 28004, 502, 20324, 28235, 21586, 17605, 21429, 26202, 21966, 26476, 2822, 2907, 2905, 2882, 2882, 2935, 2889, 788, 26233, -29128, -27737, 20809, 786, 2308, 2372, 2379, 2396, 2311, 2374, 2371, 2372, 2369, 1254, 1276, 1259, 1256, 540, 518, 539, 522, 2534};
    public String g = C0051.m8259(m485(), 0, 28, 1504);
    public final Pattern h = C0005.m1602(C0060.m9352(m485(), 28, 32, 1712));
    public final Pattern i = C0005.m1602(C0001.m1189(m485(), 60, 37, 1008));

    public static HashMap a() {
        return C0020.m4251(C0030.m5362(m485(), 97, 10, 2562), C0061.m9361(m485(), 107, 111, 3183));
    }

    public static ArrayList b(h hVar) {
        ArrayList arrayList = new ArrayList();
        Iterator itM7807 = C0047.m7807(C0030.m5333(hVar, C0020.m4199(m485(), 218, 12, 956)));
        while (C0012.m2962(itM7807)) {
            m mVar = (m) C0048.m7949(itM7807);
            m mVarM6243 = C0036.m6243(mVar, C0039.m6551(m485(), 230, 13, 2266));
            C0047.m7777(mVarM6243);
            String strM2339 = C0010.m2339(mVarM6243, C0031.m5565(m485(), 243, 4, 1965));
            m mVarM62432 = C0036.m6243(mVar, C0032.m5708(m485(), 247, 22, 2759));
            C0047.m7777(mVarM62432);
            String strM23392 = C0010.m2339(mVarM62432, C0015.m3484(m485(), 269, 8, 1197));
            m mVarM62433 = C0036.m6243(mVar, C0027.m5062(m485(), 277, 11, 2686));
            C0047.m7777(mVarM62433);
            String strM9669 = C0064.m9669(mVarM62433);
            m mVarM62434 = C0036.m6243(mVar, C0041.m6779(m485(), 288, 17, 1846));
            C0047.m7777(mVarM62434);
            C0055.m8732(strM2339, strM9669, strM23392, C0064.m9669(mVarM62434), arrayList);
        }
        return arrayList;
    }

    /* renamed from: ۣ۟ۡۧۦ, reason: not valid java name and contains not printable characters */
    public static JsonObject m484(Object obj) {
        if (C0051.m8216() <= 0) {
            return AbstractC0308c.i((String) obj);
        }
        return null;
    }

    /* renamed from: ۟ۦۣۣ, reason: not valid java name and contains not printable characters */
    public static short[] m485() {
        if (C0016.m3596() < 0) {
            return f88short;
        }
        return null;
    }

    /* renamed from: ۧ۟ۧ۠, reason: not valid java name and contains not printable characters */
    public static JsonPrimitive m486(Object obj, Object obj2) {
        if (C0024.m4693() < 0) {
            return ((JsonObject) obj).getAsJsonPrimitive((String) obj2);
        }
        return null;
    }

    /* renamed from: ۨۤۥۤ, reason: not valid java name and contains not printable characters */
    public static String m487(Object obj) {
        if (C0035.m6140() < 0) {
            return ((JsonPrimitive) obj).getAsString();
        }
        return null;
    }

    public final String c(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        C0018.m3933(sb, C0043.m7317(this));
        C0018.m3933(sb, C0058.m9145(C0035.m6131(m485(), 305, 27, 1460), str2, C0037.m6307(m485(), 332, 4, 2238), C0056.m8909(str), C0008.m1970(m485(), 336, 5, 2499)));
        d dVarM5333 = C0030.m5333(C0016.m3577(C0032.m5769(C0047.m7763(sb), C0011.m2825())), C0006.m1774(m485(), 341, 19, 2627));
        ArrayList arrayList = new ArrayList();
        Iterator itM7807 = C0047.m7807(dVarM5333);
        while (C0012.m2962(itM7807)) {
            m mVar = (m) C0048.m7949(itM7807);
            String strM3525 = C0016.m3525(m485(), 360, 13, 2506);
            C0055.m8732(C0049.m8058(C0030.m5333(mVar, strM3525), C0055.m8814(m485(), 373, 4, 1444)), C0049.m8058(C0030.m5333(mVar, strM3525), C0033.m5852(m485(), 377, 5, 3076)), C0049.m8058(C0030.m5333(mVar, C0040.m6584(m485(), 382, 22, 2702)), C0045.m7657(m485(), 404, 8, 2156)), C0024.m4684(C0030.m5333(mVar, C0052.m8337(m485(), 412, 15, 799))), arrayList);
        }
        return C0047.m7783(arrayList);
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        int iM6456;
        String strM7317 = C0043.m7317(this);
        StringBuilder sb = new StringBuilder();
        C0018.m3933(sb, strM7317);
        C0018.m3933(sb, C0007.m1842(m485(), 427, 23, 2536));
        C0018.m3933(sb, str);
        C0018.m3933(sb, C0011.m2805(m485(), 450, 6, 2112));
        C0018.m3933(sb, str2);
        C0018.m3933(sb, C0009.m2037(m485(), 456, 5, 493));
        h hVarM3577 = C0016.m3577(C0032.m5769(C0047.m7763(sb), C0011.m2825()));
        int iM64562 = C0038.m6456(str2);
        Matcher matcherM6026 = C0034.m6026(C0058.m9096(this), C0000.m1081(hVarM3577));
        int iM1140 = 1;
        if (C0003.m1405(matcherM6026)) {
            String strM4306 = C0021.m4306(matcherM6026, 1);
            C0047.m7777(strM4306);
            iM6456 = C0038.m6456(strM4306);
        } else {
            iM6456 = 0;
        }
        if (iM6456 > 72) {
            double d = iM6456;
            double d2 = 72;
            C0004.m1564(d);
            C0004.m1564(d2);
            iM1140 = (int) C0001.m1140(d / d2);
        }
        g gVar = new g();
        C0045.m7632(gVar, C0011.m2768(hVarM3577));
        C0049.m7974(gVar, iM64562, iM1140, 72, iM6456);
        return C0033.m5828(gVar);
    }

    @Override // com.github.catvod.spider.Cloud
    public String detailContent(List<String> list) {
        String str = (String) C0048.m7915(list, 0);
        h hVarM3577 = C0016.m3577(C0032.m5769(C0028.m5188(new StringBuilder(), C0043.m7317(this), str), C0011.m2825()));
        com.github.catvod.spider.merge.E.m mVar = new com.github.catvod.spider.merge.E.m();
        f fVarM6110 = C0035.m6110();
        String strM7657 = C0045.m7657(m485(), 461, 32, 2080);
        m mVarM6243 = C0036.m6243(hVarM3577, strM7657);
        C0047.m7777(mVarM6243);
        C0055.m8715(fVarM6110, C0064.m9669(mVarM6243));
        C0011.m2828(mVar, str);
        m mVarM62432 = C0036.m6243(hVarM3577, strM7657);
        C0047.m7777(mVarM62432);
        C0005.m1628(mVar, C0064.m9669(mVarM62432));
        m mVarM62433 = C0036.m6243(hVarM3577, C0065.m9775(m485(), 493, 20, 1573));
        C0047.m7777(mVarM62433);
        C0026.m4947(mVar, C0010.m2339(mVarM62433, C0003.m1398(m485(), 513, 8, 1734)));
        m mVarM8455 = C0053.m8455(C0030.m5333(hVarM3577, C0058.m9106(m485(), 521, 29, 527)));
        C0047.m7777(mVarM8455);
        C0017.m3671(mVar, C0064.m9669(mVarM8455));
        ArrayList arrayListM6481 = C0039.m6481(C0030.m5333(hVarM3577, C0032.m5708(m485(), 550, 33, 3244)));
        StringBuilder sb = new StringBuilder();
        Iterator itM7816 = C0047.m7816(arrayListM6481);
        if (C0012.m2962(itM7816)) {
            while (true) {
                C0056.m8896(sb, (CharSequence) C0048.m7949(itM7816));
                if (!C0012.m2962(itM7816)) {
                    break;
                }
                C0056.m8896(sb, C0005.m1645(m485(), 583, 1, 2721));
            }
        }
        C0058.m9085(mVar, C0047.m7763(sb));
        ArrayList arrayListM5773 = C0032.m5773(C0030.m5333(hVarM3577, C0015.m3484(m485(), 584, 16, 878)), C0042.m7151(m485(), 600, 19, 2271));
        for (int i = 0; i < C0009.m2139(arrayListM5773); i++) {
            C0055.m8716(arrayListM5773, i, C0064.m9640((String) C0028.m5167(arrayListM5773, i)));
        }
        C0044.m7449(mVar, C0014.m3356(this, arrayListM5773));
        C0054.m8596(mVar, C0030.m5351(this));
        try {
            Iterator itM7807 = C0047.m7807(C0030.m5333(hVarM3577, C0016.m3525(m485(), 619, 16, 2744)));
            while (C0012.m2962(itM7807)) {
                m mVar2 = (m) C0048.m7949(itM7807);
                m mVarM8640 = C0054.m8640(mVar2);
                C0047.m7777(mVarM8640);
                String strM9669 = C0064.m9669(mVarM8640);
                boolean zM9127 = C0058.m9127(strM9669, C0025.m4795(m485(), 635, 2, 624));
                String strM8911 = C0056.m8911(m485(), 637, 1, 407);
                if (zM9127) {
                    C0058.m9159(mVar, C0063.m9518(C0039.m6481(C0030.m5333(mVar2, strM8911))));
                } else if (C0058.m9127(strM9669, C0044.m7509(m485(), 638, 2, 351))) {
                    C0058.m9152(mVar, C0063.m9518(C0039.m6481(C0030.m5333(mVar2, strM8911))));
                } else if (C0058.m9127(strM9669, C0002.m1305(m485(), 640, 2, 2598))) {
                    m mVarM62434 = C0036.m6243(mVar2, strM8911);
                    C0047.m7777(mVarM62434);
                    C0022.m4432(mVar, C0064.m9640(C0064.m9669(mVarM62434)));
                } else if (C0058.m9127(strM9669, C0065.m9775(m485(), 642, 2, 2738))) {
                    C0019.m4073(mVar, C0064.m9640(C0064.m9669(mVar2)));
                } else if (C0058.m9127(strM9669, C0014.m3332(m485(), 644, 2, 1961))) {
                    m mVarM62435 = C0036.m6243(mVar2, C0008.m1970(m485(), 646, 7, 2856));
                    C0047.m7777(mVarM62435);
                    C0027.m5000(mVar, C0064.m9640(C0015.m3446(C0064.m9669(mVarM62435), C0049.m8007(m485(), 653, 6, 847), C0007.m1840())));
                }
            }
        } catch (Exception unused) {
        }
        return C0053.m8428(mVar);
    }

    public String homeContent(boolean z) {
        ArrayList arrayList = new ArrayList();
        h hVarM3577 = C0016.m3577(C0032.m5769(C0043.m7317(this), C0011.m2825()));
        Iterator itM7807 = C0047.m7807(C0030.m5333(hVarM3577, C0018.m3917(m485(), 659, 9, 2346)));
        while (C0012.m2962(itM7807)) {
            m mVar = (m) C0048.m7949(itM7807);
            Matcher matcherM6026 = C0034.m6026(C0025.m4827(this), C0010.m2339(mVar, C0031.m5565(m485(), 668, 4, 1166)));
            if (C0003.m1405(matcherM6026)) {
                C0004.m1532(arrayList, new b(C0021.m4306(matcherM6026, 1), C0064.m9640(C0064.m9669(mVar)), null));
            }
        }
        return C0025.m4831(arrayList, C0011.m2768(hVarM3577));
    }

    @Override // com.github.catvod.spider.Cloud
    public void init(Context context, String str) {
        String strM487 = m487(m486(m484(str), C0019.m4107(m485(), 672, 4, 623)));
        if (!C0057.m8953(strM487)) {
            this.g = strM487;
        }
        super.init(context, str);
    }

    public String searchContent(String str, boolean z) {
        return C0006.m1694(this, str, C0027.m5062(m485(), 676, 1, 2519));
    }

    public String searchContent(String str, boolean z, String str2) {
        return C0006.m1694(this, str, str2);
    }
}