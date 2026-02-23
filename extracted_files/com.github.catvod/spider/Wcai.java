package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.E.b;
import com.github.catvod.spider.merge.E.g;
import com.github.catvod.spider.merge.E.m;
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
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.T0.C0030;
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
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.q.C0058;
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
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class Wcai extends Spider {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f113short = {1049, 1029, 1029, 1025, 1026, 1099, 1118, 1118, 1030, 1030, 1030, 1119, 1042, 1047, 1050, 1051, 1097, 1095, 1119, 1042, 1054, 1052, 32003, -29101, 25817, -32170, 24499, -31246, 26157, 1673, 1711, 1721, 1710, 1777, 1693, 1723, 1721, 1714, 1704, 2655, 2651, 2648, 2628, 2628, 2624, 2591, 2563, 2590, 2561, 2562, 2590, 2561, 2561, 1202, 500, 501, 486, 505, 499, 501, 505, 500, 3008, 3041, 3058, 3053, 3047, 3041, 3053, 3040, 1811, 1800, 1793, 1901, 1905, 2068, 2062, 2048, 2057, 2182, 2248, 2265, 2240, 2182, 2244, 2270, 2180, 2244, 2246, 2271, 2240, 2252, 2182, 2248, 2247, 2246, 2247, 2256, 2244, 2246, 2268, 2266, 2182, 2271, 2240, 2253, 2252, 2246, 2182, 2245, 2240, 2266, 2269, 2198, 2248, 2267, 2252, 2248, 2196, 2191, 2265, 2248, 2254, 2252, 2279, 2268, 2244, 2196, 2806, 2724, 2729, 2720, 2741, 2785, 2797, 2221, 2290, 2286, 2282, 2297, 2230, 1272, 1259, 1276, 1272, 1188, 1215, 1257, 1272, 1278, 1276, 1239, 1260, 1268, 1188, 653, 722, 718, 714, 729, 662, 653, 704, 718, 722, 662, 712, 713, 659, 667, 659, 670, 665, 658, 713, 714, 718, 669, 713, 669, 713, 718, 671, 670, 718, 712, 717, 714, 713, 665, 658, 714, 671, 659, 659, 658, 713, 712, 653, 735, 662, 1777, 1780, 1761, 1780, 1839, 1834, 1840, 1847, 2726, 2751, 2740, 2713, 2740, 622, 631, 636, 598, 633, 629, 637, 2139, 2114, 2121, 2173, 2116, 2126, 478, 455, 460, 506, 461, 453, 457, 474, 451, 475, 1952, 2030, 2047, 2022, 1952, 2018, 2040, 1954, 2018, 2016, 2041, 2022, 2026, 1952, 2030, 2017, 2016, 2017, 2038, 2018, 2016, 2042, 2044, 1952, 2041, 2022, 2027, 2026, 2016, 1952, 2027, 2026, 2043, 2030, 2022, 2019, 1968, 2022, 2027, 1970, 2206, 2195, 2250, 1799, 1866, 1860, 1880, 1820, 1858, 1859, 1817, 1809, 1817, 1812, 1811, 1816, 1859, 1856, 1860, 1815, 1859, 1815, 1859, 1860, 1813, 1812, 1860, 1858, 1863, 1856, 1859, 1811, 1816, 1856, 1813, 1817, 1817, 1816, 1859, 1858, 1799, 1877, 1820, 506, 511, 490, 511, 2196, 2177, 2200, 2178, 2206, 2197, 2196, 2237, 2200, 2178, 2181, 947, 938, 929, 907, 932, 936, 928, 271, 256, 268, 260, 1831, 2621, 2573, 2570, 2567, 3033, 1869, 1876, 1887, 1906, 1887, 2445, 2452, 2463, 2488, 2452, 2453, 2447, 2462, 2453, 2447, 575, 550, 557, 525, 544, 571, 556, 554, 573, 550, 571, 909, 916, 927, 954, 920, 911, 916, 905, 3196, 3173, 3182, 3162, 3171, 3177, 3023, 3030, 3037, 3051, 3036, 3028, 3032, 3019, 3026, 3018, -25234, 27059, 916, 3047, 3067, 2136, 32725, 21905, 31120, -31389, 24258, 22582, 26037, 32068, -32318, 259, 2674, 2674, 2620, 2605, 2612, 2674, 2608, 2602, 2672, 2608, 2610, 2603, 2612, 2616, 2674, 2620, 2611, 2610, 2611, 2596, 2608, 2610, 2600, 2606, 2674, 2603, 2671, 2674, 2603, 2612, 2617, 2616, 2610, 2674, 2616, 2605, 2612, 2606, 2610, 2617, 2616, 2674, 2600, 2607, 2609, 2658, 2622, 2609, 2612, 2616, 2611, 2601, 2569, 2596, 2605, 2616, 2656, 2668, 2683, 2612, 2617, 2656, 2351, 2407, 2400, 2413, 2356, 1609, 1606, 1603, 1615, 1604, 1630, 1662, 1619, 1626, 1615, 1559, 1563, 1548, 1603, 1614, 1559, 2624, 2573, 2563, 2591, 2651, 2565, 2564, 2654, 2646, 2654, 2643, 2644, 2655, 2564, 2567, 2563, 2640, 2564, 2640, 2564, 2563, 2642, 2643, 2563, 2565, 2560, 2567, 2564, 2644, 2655, 2567, 2642, 2654, 2654, 2655, 2564, 2565, 2624, 2578, 2651, 3239, 3234, 3255, 3234, 633, 636, 614, 609, 814, 809, 823, 1648, 1579, 1568, 1650, 1579, 1582, 1569, 1570, 1594, 1641, 1573, 1594, 1570, 1574, 1569, 1576, 1650, 2676, 2616, 2619, 2593, 2618, 2599, 2671, 325, 2645, 2587, 2570, 2579, 2645, 2583, 2573, 2647, 2583, 2581, 2572, 2579, 2591, 2645, 2587, 2580, 2581, 2580, 2563, 2583, 2581, 2575, 2569, 2645, 2572, 2579, 2590, 2591, 2581, 2645, 2569, 2591, 2587, 2568, 2585, 2578, 2616, 2563, 2605, 2581, 2568, 2590, 2629, 2577, 2591, 2563, 2573, 2581, 2568, 2590, 2631, 2964, 3010, 3027, 3029, 3031, 3068, 3015, 3039, 2959, 2279, 2225, 2208, 2214, 2212, 2194, 2216, 2235, 2212, 2300, 2297, 1425, 1439, 1411, 1421, 1429, 1416, 1438, 1479, 1065, 1151, 1134, 1128, 1130, 1116, 1126, 1141, 1130, 1074, 1079, 1065, 1124, 1130, 1142, 1074, 1132, 1133, 1079, 1087, 1079, 1082, 1085, 1078, 1133, 1134, 1130, 1081, 1133, 1081, 1133, 1130, 1083, 1082, 1130, 1132, 1129, 1134, 1133, 1085, 1078, 1134, 1083, 1079, 1079, 1078, 1133, 1132, 1065, 1147, 1074, 1324, 1321, 1340, 1321, 1508, 1523, 1509, 1507, 1530, 1506, 792, 797, 775, 768, 792, 769, 778, 807, 778, 1066, 1075, 1080, 1042, 1085, 1073, 1081, 3175, 3198, 3189, 3137, 3192, 3186, 2393, 2368, 2379, 2429, 2378, 2370, 2382, 2397, 2372, 2396};
    public String a = C0001.m1189(m570(), 0, 22, 1137);
    public final String b = C0052.m8337(m570(), 22, 7, 956);

    public static HashMap a(String str, String str2) {
        HashMap mapM4127 = C0019.m4127(C0033.m5852(m570(), 29, 10, 1756), C0065.m9775(m570(), 39, 14, 2608), C0024.m4740(m570(), 53, 1, 1222), str2);
        C0053.m8424(mapM4127, C0018.m3917(m570(), 54, 8, 400), C0010.m2300(m570(), 62, 8, 2948));
        try {
            C0053.m8424(mapM4127, C0038.m6452(m570(), 75, 4, 2151), C0023.m4570(C0035.m6159(C0015.m3410(C0023.m4536(m570(), 70, 5, 1856)), C0012.m3018(C0022.m4413(str), C0034.m5989()))));
            return mapM4127;
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static String b() {
        String strM5627 = C0031.m5627(C0009.m2099());
        return C0054.m8636(strM5627, 0, C0051.m8186(13, C0004.m1584(strM5627)));
    }

    /* renamed from: ۟۠ۢۤۥ, reason: not valid java name and contains not printable characters */
    public static JsonArray m569(Object obj, Object obj2) {
        if (C0057.m9017() >= 0) {
            return ((JsonObject) obj).getAsJsonArray((String) obj2);
        }
        return null;
    }

    /* renamed from: ۟ۢ۠ۤۡ, reason: not valid java name and contains not printable characters */
    public static short[] m570() {
        if (C0002.m1242() > 0) {
            return f113short;
        }
        return null;
    }

    /* renamed from: ۟ۢۢۥۢ, reason: not valid java name and contains not printable characters */
    public static Iterator m571(Object obj) {
        if (C0026.m4977() < 0) {
            return ((JsonArray) obj).iterator();
        }
        return null;
    }

    /* renamed from: ۣ۟ۤۤ۟, reason: not valid java name and contains not printable characters */
    public static JsonObject m572(Object obj, Object obj2) {
        if (C0010.m2320() < 0) {
            return ((JsonObject) obj).getAsJsonObject((String) obj2);
        }
        return null;
    }

    /* renamed from: ۟ۦۡۦۢ, reason: not valid java name and contains not printable characters */
    public static JsonObject m573(Object obj) {
        if (C0055.m8740() > 0) {
            return ((JsonElement) obj).getAsJsonObject();
        }
        return null;
    }

    /* renamed from: ۠ۨۢۦ, reason: not valid java name and contains not printable characters */
    public static JsonPrimitive m574(Object obj, Object obj2) {
        if (C0024.m4693() <= 0) {
            return ((JsonObject) obj).getAsJsonPrimitive((String) obj2);
        }
        return null;
    }

    /* renamed from: ۣۡۨۨ, reason: not valid java name and contains not printable characters */
    public static String m575(Object obj) {
        if (C0035.m6140() < 0) {
            return ((JsonPrimitive) obj).getAsString();
        }
        return null;
    }

    /* renamed from: ۣۣ۟ۧ, reason: not valid java name and contains not printable characters */
    public static String m576(Object obj) {
        if (C0047.m7837() > 0) {
            return ((JsonElement) obj).getAsString();
        }
        return null;
    }

    /* renamed from: ۧۤ۟ۥ, reason: not valid java name and contains not printable characters */
    public static JsonElement m577(Object obj, int i) {
        if (C0007.m1886() > 0) {
            return ((JsonArray) obj).get(i);
        }
        return null;
    }

    /* renamed from: ۨۤۨ, reason: not valid java name and contains not printable characters */
    public static JsonElement m578(Object obj, Object obj2) {
        if (C0005.m1599() < 0) {
            return ((JsonObject) obj).get((String) obj2);
        }
        return null;
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        ArrayList arrayList = new ArrayList();
        String strM5178 = C0028.m5178();
        StringBuilder sb = new StringBuilder();
        String strM7598 = C0045.m7598(this);
        String strM9775 = C0065.m9775(m570(), 79, 49, 2217);
        String strM1077 = C0000.m1077(m570(), 128, 7, 2768);
        C0011.m2747(sb, strM7598, strM9775, str2, strM1077);
        String strM5188 = C0028.m5188(sb, str, C0018.m3917(m570(), 135, 6, 2187));
        StringBuilder sbM8368 = C0052.m8368(C0023.m4536(m570(), 141, 14, 1177), str2, strM1077, str, C0007.m1842(m570(), 155, 46, 683));
        C0018.m3933(sbM8368, strM5178);
        Iterator itM571 = m571(m569(m572((JsonObject) C0033.m5856(C0032.m5769(strM5188, C0008.m1972(C0047.m7763(sbM8368), strM5178)), JsonObject.class), C0031.m5565(m570(), 201, 4, 1685)), C0000.m1077(m570(), 205, 4, 1859)));
        while (C0012.m2962(itM571)) {
            JsonObject jsonObjectM573 = m573((JsonElement) C0048.m7949(itM571));
            C0004.m1532(arrayList, new m(m576(m578(jsonObjectM573, C0022.m4403(m570(), 209, 5, 2768))), m576(m578(jsonObjectM573, C0022.m4403(m570(), 214, 7, 536))), m576(m578(jsonObjectM573, C0034.m6001(m570(), 221, 6, 2093))), m576(m578(jsonObjectM573, C0052.m8337(m570(), 227, 10, 424)))));
        }
        return C0047.m7783(arrayList);
    }

    public String detailContent(List<String> list) {
        new ArrayList();
        String strM5178 = C0028.m5178();
        StringBuilder sb = new StringBuilder();
        C0018.m3933(sb, C0045.m7598(this));
        C0018.m3933(sb, C0041.m6779(m570(), 237, 40, 1935));
        C0018.m3933(sb, (String) C0048.m7915(list, 0));
        String strM7763 = C0047.m7763(sb);
        StringBuilder sb2 = new StringBuilder(C0061.m9361(m570(), 277, 3, 2295));
        C0018.m3933(sb2, (String) C0048.m7915(list, 0));
        C0018.m3933(sb2, C0048.m7902(m570(), 280, 40, 1825));
        C0018.m3933(sb2, strM5178);
        JsonObject jsonObjectM572 = m572((JsonObject) C0033.m5856(C0032.m5769(strM7763, C0008.m1972(C0047.m7763(sb2), strM5178)), JsonObject.class), C0004.m1549(m570(), 320, 4, 414));
        JsonArray jsonArrayM569 = m569(jsonObjectM572, C0005.m1645(m570(), 324, 11, 2289));
        StringBuilder sb3 = new StringBuilder();
        String strM575 = m575(m574(jsonObjectM572, C0010.m2300(m570(), 335, 7, 965)));
        C0055.m8715(C0035.m6110(), strM575);
        Iterator itM571 = m571(jsonArrayM569);
        while (C0012.m2962(itM571)) {
            JsonObject jsonObjectM573 = m573((JsonElement) C0048.m7949(itM571));
            String strM6584 = C0040.m6584(m570(), 342, 4, 353);
            C0018.m3933(sb3, m576(m578(jsonObjectM573, strM6584)));
            C0018.m3933(sb3, C0046.m7718(m570(), 346, 1, 1795));
            C0018.m3933(sb3, (String) C0048.m7915(list, 0));
            String strM4340 = C0021.m4340(m570(), 347, 1, 2627);
            C0018.m3933(sb3, strM4340);
            C0018.m3933(sb3, m576(m578(jsonObjectM573, C0009.m2037(m570(), 348, 3, 2659))));
            C0018.m3933(sb3, strM4340);
            C0018.m3933(sb3, m576(m578(jsonObjectM573, strM6584)));
            C0018.m3933(sb3, C0062.m9389(m570(), 351, 1, 3066));
        }
        m mVar = new m();
        C0011.m2828(mVar, m575(m574(jsonObjectM572, C0037.m6307(m570(), 352, 5, 1851))));
        C0005.m1628(mVar, strM575);
        StringBuilder sb4 = new StringBuilder();
        C0018.m3933(sb4, C0055.m8703());
        C0018.m3933(sb4, m575(m574(jsonObjectM572, C0007.m1842(m570(), 357, 10, 2555))));
        C0027.m5000(mVar, C0047.m7763(sb4));
        C0058.m9159(mVar, m575(m574(jsonObjectM572, C0011.m2805(m570(), 367, 11, 585))));
        C0058.m9152(mVar, m575(m574(jsonObjectM572, C0047.m7833(m570(), 378, 8, 1019))));
        C0026.m4947(mVar, m575(m574(jsonObjectM572, C0013.m3106(m570(), 386, 6, 3082))));
        C0019.m4073(mVar, m575(m574(jsonObjectM572, C0046.m7718(m570(), 392, 10, 3001))));
        C0054.m8596(mVar, C0022.m4403(m570(), 402, 2, 1974));
        C0044.m7449(mVar, C0047.m7763(sb3));
        return C0053.m8428(mVar);
    }

    public String homeContent(boolean z) {
        ArrayList arrayList = new ArrayList();
        List listM1203 = C0001.m1203(new String[]{C0033.m5852(m570(), 404, 1, 933), C0058.m9106(m570(), 405, 1, 3029), C0005.m1645(m570(), 406, 1, 3023), C0030.m5362(m570(), 407, 1, 2155)});
        List listM12032 = C0001.m1203(new String[]{C0010.m2300(m570(), 408, 2, 2784), C0038.m6452(m570(), 410, 3, 3237), C0016.m3525(m570(), 413, 2, 2718), C0043.m7290(m570(), 415, 2, 952)});
        for (int i = 0; i < C0064.m9636(listM1203); i++) {
            C0004.m1532(arrayList, new b((String) C0048.m7915(listM1203, i), (String) C0048.m7915(listM12032, i), null));
        }
        return C0003.m1448(C0033.m5836(this), null, arrayList);
    }

    public void init(Context context, String str) {
        this.a = str;
    }

    public String playerContent(String str, String str2, List<String> list) {
        C0036.m6219();
        String[] strArrM4752 = C0024.m4752(str2, C0026.m4951(m570(), 417, 1, 381));
        String str3 = null;
        String str4 = (strArrM4752.length <= 0 || C0057.m8953(strArrM4752[0])) ? null : strArrM4752[0];
        String str5 = (strArrM4752.length <= 1 || C0057.m8953(strArrM4752[1])) ? null : strArrM4752[1];
        if (strArrM4752.length > 2 && !C0057.m8953(strArrM4752[2])) {
            str3 = strArrM4752[2];
        }
        String strM5178 = C0028.m5178();
        StringBuilder sb = new StringBuilder();
        String strM7598 = C0045.m7598(this);
        String strM9585 = C0063.m9585(m570(), 418, 62, 2653);
        String strM2037 = C0009.m2037(m570(), 480, 5, 2313);
        C0011.m2747(sb, strM7598, strM9585, str4, strM2037);
        C0018.m3933(sb, str5);
        String strM7763 = C0047.m7763(sb);
        StringBuilder sbM8368 = C0052.m8368(C0055.m8814(m570(), 485, 16, 1578), str4, strM2037, str5, C0029.m5256(m570(), 501, 40, 2662));
        C0018.m3933(sbM8368, strM5178);
        String strM575 = m575(m574(m573(m577(m569(m572((JsonObject) C0033.m5856(C0032.m5769(strM7763, C0008.m1972(C0047.m7763(sbM8368), strM5178)), JsonObject.class), C0048.m7902(m570(), 541, 4, 3267)), C0007.m1842(m570(), 545, 4, 533)), 0)), C0021.m4340(m570(), 549, 3, 859)));
        StringBuilder sb2 = new StringBuilder();
        C0018.m3933(sb2, C0051.m8217());
        C0018.m3933(sb2, C0053.m8477(m570(), 552, 17, 1615));
        String strM6434 = C0038.m6434(sb2, C0002.m1316(C0035.m6110()), C0025.m4795(m570(), 569, 7, 2642), str3);
        g gVar = new g();
        C0017.m3667(gVar, strM575);
        C0002.m1282(gVar, strM6434);
        return C0033.m5828(gVar);
    }

    public String searchContent(String str, boolean z) {
        return C0016.m3547(this, str, z, C0002.m1305(m570(), 576, 1, 372));
    }

    public String searchContent(String str, boolean z, String str2) {
        ArrayList arrayList = new ArrayList();
        String strM5178 = C0028.m5178();
        StringBuilder sb = new StringBuilder();
        String strM7598 = C0045.m7598(this);
        String strM6551 = C0039.m6551(m570(), 577, 51, 2682);
        String strM7833 = C0047.m7833(m570(), 628, 9, 2994);
        C0011.m2747(sb, strM7598, strM6551, str, strM7833);
        String strM5188 = C0028.m5188(sb, str2, C0064.m9599(m570(), 637, 11, 2241));
        StringBuilder sbM8368 = C0052.m8368(C0024.m4740(m570(), 648, 8, 1530), str, strM7833, str2, C0021.m4340(m570(), 656, 51, 1039));
        C0018.m3933(sbM8368, strM5178);
        Iterator itM571 = m571(m569(m572(m572((JsonObject) C0033.m5856(C0032.m5769(strM5188, C0008.m1972(C0047.m7763(sbM8368), strM5178)), JsonObject.class), C0010.m2300(m570(), 707, 4, 1352)), C0058.m9106(m570(), 711, 6, 1430)), C0050.m8131(m570(), 717, 4, 884)));
        while (C0012.m2962(itM571)) {
            JsonObject jsonObjectM573 = m573((JsonElement) C0048.m7949(itM571));
            C0004.m1532(arrayList, new m(m576(m578(jsonObjectM573, C0015.m3484(m570(), 721, 5, 878))), m576(m578(jsonObjectM573, C0014.m3332(m570(), 726, 7, 1116))), m576(m578(jsonObjectM573, C0027.m5062(m570(), 733, 6, 3089))), m576(m578(jsonObjectM573, C0013.m3106(m570(), 739, 10, 2351)))));
        }
        return C0047.m7783(arrayList);
    }
}