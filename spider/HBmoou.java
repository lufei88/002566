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
import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.V.C0033;
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
import com.github.catvod.spider.merge.r0.C0060;
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
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class HBmoou extends Spider {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f50short = {2428, 2400, 2400, 2404, 2350, 2363, 2363, 2341, 2342, 2341, 2362, 2338, 2342, 2362, 2342, 2341, 2362, 2341, 2336, 2350, 2337, 2342, 2340, 2363, 2908, 2886, 2905, 2886, 2897, 588, 592, 592, 596, 542, 523, 523, 579, 595, 522, 585, 583, 605, 581, 586, 522, 583, 586, 523, -25953, 24816, -29412, 20614, 378, 382, 373, 383, 303, 373, 296, 383, 383, 382, 373, 379, 376, 372, 301, 302, 995, 946, 996, 944, 948, 945, 998, 951, 993, 944, 944, 944, 999, 948, 951, 949, 20639, 26157, 19792, -31840, 19815, -29118, 26157, 1336, 1315, 1322, 1350, 1370, 2585, 2623, 2601, 2622, 2657, 2573, 2603, 2601, 2594, 2616, 2775, 2805, 2784, 2803, 2806, 2806, 2811, 2741, 2735, 2740, 2730, 2746, 2738, 2774, 2803, 2804, 2799, 2786, 2721, 2746, 2779, 2804, 2814, 2792, 2805, 2803, 2814, 2746, 2731, 2728, 2739, 2746, 2779, 2794, 2794, 2806, 2815, 2765, 2815, 2808, 2769, 2803, 2798, 2741, 2735, 2729, 2733, 2740, 2729, 2732, 2746, 2738, 2769, 2770, 2766, 2775, 2774, 2742, 2746, 2806, 2803, 2801, 2815, 2746, 2781, 2815, 2809, 2801, 2805, 2739, 2746, 2777, 2802, 2792, 2805, 2807, 2815, 2741, 2723, 2728, 2740, 2730, 2740, 2734, 2735, 2731, 2735, 2740, 2731, 2730, 2735, 2746, 2775, 2767, 2773, 2767, 2779, 2762, 2762, 2741, 2731, 2730, 2740, 2722, 2740, 2734, 2735, 2730, 2732, 2740, 2734, 2730, 2730, 2441, 2469, 2468, 2468, 2479, 2473, 2494, 2467, 2469, 2468, 1017, 983, 983, 962, 927, 1011, 990, 987, 964, 983, 1007, 963, 962, 984, 969, 962, 984, 897, 1016, 981, 988, 969, 2861, 2876, 2876, 2848, 2853, 2863, 2861, 2872, 2853, 2851, 2850, 2915, 2868, 2913, 2875, 2875, 2875, 2913, 2858, 2851, 2878, 2849, 2913, 2873, 2878, 2848, 2857, 2850, 2863, 2851, 2856, 2857, 2856, 509, 503, 509, 419, 504, 491, 508, 509, 487, 481, 480, 1768, 1769, 600, 580, 2762, 2789, 2799, 2809, 2788, 2786, 2799, 2796, 2797, 2814, 2785, 2795, 2797, 2911, 2820, 2907, 2904, 2907, 2831, 2827, 2911, 2827, 2905, 2831, 2908, 2904, 2826, 2824, 1350, 1366, 1349, 1354, 1344, 1289, 1353, 1355, 1344, 1345, 1352, 943, 925, 913, 911, 905, 914, 923, 737, 752, 752, 685, 756, 745, 749, 741, 1682, 1667, 1667, 1758, 1669, 1686, 1665, 1664, 1690, 1692, 1693, 2606, 2623, 2623, 2658, 2603, 2602, 2617, 2598, 2604, 2602, 353, 303, 318, 295, 352, 318, 294, 318, 353, 312, 383, 352, 312, 289, 298, 369, 314, 311, 318, 299, 371, 2240, 2181, 2186, 2183, 2197, 2197, 2267, 2240, 2183, 2196, 2179, 2183, 2267, 2240, 2207, 2179, 2183, 2196, 2267, 2240, 2180, 2207, 2267, 2240, 2186, 2191, 2187, 2191, 2194, 2267, 2263, 2270, 2240, 2198, 2183, 2177, 2179, 2267, 1902, 1839, 1827, 1832, 1833, 1902, 1910, 1918, 1916, 1916, 761, 764, 745, 764, 2787, 2790, 2812, 2811, 1483, 1490, 1497, 1506, 1492, 1497, 1262, 1271, 1276, 1223, 1270, 1273, 1269, 1277, 1296, 1289, 1282, 1337, 1302, 1295, 1285, 930, 955, 944, 907, 934, 945, 953, 949, 934, 959, 935, 861, 787, 770, 795, 860, 770, 794, 770, 861, 772, 835, 860, 772, 797, 790, 861, 790, 791, 774, 787, 795, 798, 845, 772, 797, 790, 813, 795, 790, 847, 2056, 2121, 2117, 2126, 2127, 2056, 2064, 2072, 2074, 2074, 2222, 2219, 2238, 2219, 1683, 1674, 1665, 1722, 1675, 1668, 1672, 1664, 2826, 2835, 2840, 2851, 2830, 2841, 2833, 2845, 2830, 2839, 2831, 1359, 1366, 1373, 1382, 1368, 1370, 1357, 1366, 1355, 601, 576, 587, 624, 587, 582, 605, 586, 588, 603, 576, 605, 2402, 2427, 2416, 2379, 2423, 2427, 2426, 2400, 2417, 2426, 2400, 757, 748, 743, 732, 755, 751, 738, 762, 732, 751, 746, 752, 759, 1174, 1154, 1183, 1181, 410, 413, 387, 412, 1926, 1929, 1925, 1933, 3210, 1897, 1902, 1904, 800, 2632, 2953, 2953, 2953, 1146, 1076, 1061, 1061, 1034, 1084, 1083, 1075, 1082, 1147, 1061, 1085, 1061, 1170, 1162, 1168, 1162, 1182, 1167, 1167, 2460, 2991, 1456, 1275, 1278, 1259, 1278, 1660, 2405, 912, 620, 610, 638, 313, 294, 1025, 1035, 1080, 1080, 2653, 2636, 2636, 2577, 2648, 2649, 2634, 2645, 2655, 2649, 1924, 1994, 2011, 1986, 1925, 2011, 1987, 2011, 1924, 2013, 1946, 1925, 2013, 1988, 1999, 1924, 2015, 2002, 2011, 1998, 2008, 404, 469, 473, 466, 467, 404, 396, 388, 390, 390, 2393, 2396, 2377, 2396, 2446, 2435, 2442, 2463, 2454, 2451, 2441, 2446, 2556, 2545, 2552, 2541, 2519, 2529, 2540, 3118, 3107, 3114, 3135, 3077, 3124, 3131, 3127, 3135, 3056, 3052, 3052, 3048, 3019, 3019, 3019, 1757, 1766, 1734, 2045, 2042, 2020, 1822, 1883, 1858, 1886, 1887, 1823, 1857, 1881, 1857, 1806, 1860, 1859, 1885, 1804, 783, 846, 834, 841, 840, 783, 791, 799, 797, 797, 1105, 1101, 1101, 1097, 1178, 2317, 2371, 2386, 2379, 2316, 2386, 2378, 2386, 2317, 2388, 2323, 2316, 2388, 2381, 2374, 2333, 2389, 2374, 2335, 675, 745, 748, 744, 748, 753, 696, 692, 701, 675, 757, 740, 738, 736, 696, 692, 2422, 2359, 2363, 2352, 2353, 2422, 2414, 2406, 2404, 2404, 533, 528, 517, 528, 2323, 2326, 2316, 2315, 600, 577, 586, 625, 583, 586, 869, 892, 887, 844, 893, 882, 894, 886, 417, 440, 435, 392, 423, 446, 436, 2779, 2754, 2761, 2802, 2783, 2760, 2752, 2764, 2783, 2758, 2782, 2532, 2280, 2214, 2231, 2222, 2281, 2231, 2223, 2231, 2296, 2214, 2212, 2227, 2222, 2216, 2217, 2298, 2231, 2219, 2214, 2238, 2210, 2229, 2222, 2217, 2209, 2216, 1299, 1302, 1283, 1302, 1782, 1770, 1767, 1791, 1763, 1780, 1775, 1768, 1760, 1769, 2946, 2974, 2963, 2955, 2967, 2944, 2972, 2963, 2975, 2967, 2412, 2416, 2429, 2405, 2425, 2414, 2422, 2421, 2425, 2423, 2419, 2409};
    public String c;
    public String f;
    public HashMap j;
    public String a = C0042.m7151(m318(), 0, 24, 2324);
    public String b = C0048.m7902(m318(), 24, 5, 2920);
    public String d = C0000.m1077(m318(), 29, 19, 548);
    public String e = C0007.m1842(m318(), 48, 4, 737);
    public String g = C0013.m3106(m318(), 52, 16, 332);
    public String h = C0060.m9352(m318(), 68, 16, 898);
    public String i = C0007.m1840();

    public static String getjmdata(String str, int i, int i2) {
        if (str == null || C0057.m8953(str)) {
            return str;
        }
        int iM1584 = C0004.m1584(str);
        if (i < 0 || i2 < 0) {
            throw new IllegalArgumentException(C0041.m6779(m318(), 84, 7, 861));
        }
        return i + i2 <= iM1584 ? C0054.m8636(str, i, iM1584 - i2) : C0007.m1840();
    }

    public static String sha1(String str) {
        try {
            byte[] bArrM6159 = C0035.m6159(C0015.m3410(C0013.m3106(m318(), 91, 5, 1387)), C0050.m8115(str));
            StringBuilder sb = new StringBuilder();
            for (byte b : bArrM6159) {
                String strM8889 = C0056.m8889(b & 255);
                if (C0004.m1584(strM8889) == 1) {
                    C0062.m9399(sb, '0');
                }
                C0018.m3933(sb, strM8889);
            }
            return C0047.m7763(sb);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: ۟۟ۡ۟ۡ, reason: not valid java name and contains not printable characters */
    public static String m308(Object obj) {
        if (C0032.m5686() < 0) {
            return ((JsonPrimitive) obj).getAsString();
        }
        return null;
    }

    /* renamed from: ۣ۟۟ۢۨ, reason: not valid java name and contains not printable characters */
    public static JsonObject m309(Object obj) {
        if (C0042.m7147() < 0) {
            return ((JsonElement) obj).getAsJsonObject();
        }
        return null;
    }

    /* renamed from: ۟۟ۢۨ۠, reason: not valid java name and contains not printable characters */
    public static JsonElement m310(Object obj, Object obj2) {
        if (C0063.m9589() <= 0) {
            return ((JsonObject) obj).get((String) obj2);
        }
        return null;
    }

    /* renamed from: ۟۟ۦ۟ۧ, reason: not valid java name and contains not printable characters */
    public static Object m311(Object obj, Object obj2, Object obj3) {
        if (C0002.m1242() >= 0) {
            return ((Gson) obj).fromJson((String) obj2, (Class) obj3);
        }
        return null;
    }

    /* renamed from: ۟ۢۡۦ۠, reason: not valid java name and contains not printable characters */
    public static JsonArray m312(Object obj, Object obj2) {
        if (C0038.m6471() >= 0) {
            return ((JsonObject) obj).getAsJsonArray((String) obj2);
        }
        return null;
    }

    /* renamed from: ۟ۥ۟ۧۡ, reason: not valid java name and contains not printable characters */
    public static int m313(Object obj) {
        if (C0028.m5152() < 0) {
            return ((JsonObject) obj).size();
        }
        return 0;
    }

    /* renamed from: ۟ۦۨۨ, reason: not valid java name and contains not printable characters */
    public static Iterator m314(Object obj) {
        if (C0030.m5375() > 0) {
            return ((JsonArray) obj).iterator();
        }
        return null;
    }

    /* renamed from: ۣۡ۟۠, reason: not valid java name and contains not printable characters */
    public static String m315(Object obj) {
        if (C0010.m2320() < 0) {
            return ((JsonElement) obj).getAsString();
        }
        return null;
    }

    /* renamed from: ۡۦۦۢ, reason: not valid java name and contains not printable characters */
    public static JsonObject m316(Object obj, Object obj2) {
        if (C0016.m3596() < 0) {
            return ((JsonObject) obj).getAsJsonObject((String) obj2);
        }
        return null;
    }

    /* renamed from: ۣۤ۠ۥ, reason: not valid java name and contains not printable characters */
    public static JsonPrimitive m317(Object obj, Object obj2) {
        if (C0050.m8121() <= 0) {
            return ((JsonObject) obj).getAsJsonPrimitive((String) obj2);
        }
        return null;
    }

    /* renamed from: ۨۨۧۨ, reason: not valid java name and contains not printable characters */
    public static short[] m318() {
        if (C0039.m6529() < 0) {
            return f50short;
        }
        return null;
    }

    public final HashMap a() {
        HashMap mapM4127 = C0019.m4127(C0029.m5256(m318(), 96, 10, 2636), C0012.m2973(m318(), 106, 113, 2714), C0055.m8814(m318(), 219, 10, 2506), C0038.m6452(m318(), 229, 10, 946));
        C0053.m8424(mapM4127, C0046.m7718(m318(), 239, 12, 940), C0023.m4536(m318(), 251, 33, 2892));
        C0053.m8424(mapM4127, C0018.m3917(m318(), 284, 11, 398), C0055.m8814(m318(), 295, 2, 1753));
        C0053.m8424(mapM4127, C0029.m5256(m318(), 297, 2, 567), C0003.m1398(m318(), 299, 7, 2699));
        C0053.m8424(mapM4127, C0011.m2805(m318(), 306, 6, 2696), C0020.m4199(m318(), 312, 15, 2877));
        C0053.m8424(mapM4127, C0024.m4740(m318(), 327, 11, 1316), C0007.m1842(m318(), 338, 7, 1020));
        C0053.m8424(mapM4127, C0014.m3332(m318(), 345, 8, 640), C0037.m6373(this));
        C0053.m8424(mapM4127, C0051.m8259(m318(), 353, 11, 1779), C0043.m7346(this));
        C0053.m8424(mapM4127, C0056.m8911(m318(), 364, 10, 2639), C0012.m2961(this));
        return mapM4127;
    }

    public final void b() {
        this.c = C0031.m5627(C0009.m2099());
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        ArrayList arrayList = new ArrayList();
        C0044.m7457(this);
        StringBuilder sb = new StringBuilder();
        C0011.m2747(sb, C0016.m3536(this), C0052.m8337(m318(), 374, 21, 334), str, C0005.m1645(m318(), 395, 38, 2278));
        C0018.m3933(sb, str2);
        String strM5769 = C0032.m5769(C0047.m7763(sb), C0028.m5115(this));
        if (!C0058.m9127(strM5769, C0044.m7509(m318(), 433, 10, 1868))) {
            strM5769 = C0045.m7651(strM5769, C0003.m1462(this), C0055.m8725(this));
        }
        JSONArray jSONArrayM4333 = C0021.m4333(C0003.m1370(new JSONObject(strM5769), C0023.m4536(m318(), 443, 4, 669)), C0054.m8574(m318(), 447, 4, 2703));
        for (int i = 0; i < C0053.m8396(jSONArrayM4333); i++) {
            JSONObject jSONObjectM3923 = C0018.m3923(jSONArrayM4333, i);
            C0004.m1532(arrayList, new m(C0001.m1212(jSONObjectM3923, C0042.m7151(m318(), 451, 6, 1469)), C0001.m1212(jSONObjectM3923, C0053.m8477(m318(), 457, 8, 1176)), C0001.m1212(jSONObjectM3923, C0042.m7151(m318(), 465, 7, 1382)), C0001.m1212(jSONObjectM3923, C0043.m7290(m318(), 472, 11, 980))));
        }
        return C0020.m4216(C0011.m2808(C0038.m6456(str2)), C0047.m7818(1, str2), C0011.m2808(20), C0054.m8556(str2, 1, 20), arrayList);
    }

    public String detailContent(List<String> list) {
        C0044.m7457(this);
        StringBuilder sb = new StringBuilder();
        C0018.m3933(sb, C0016.m3536(this));
        C0018.m3933(sb, C0062.m9389(m318(), 483, 30, 882));
        C0018.m3933(sb, (String) C0048.m7915(list, 0));
        String strM5769 = C0032.m5769(C0047.m7763(sb), C0028.m5115(this));
        if (!C0058.m9127(strM5769, C0025.m4795(m318(), 513, 10, 2090))) {
            strM5769 = C0045.m7651(strM5769, C0003.m1462(this), C0055.m8725(this));
        }
        JsonObject jsonObjectM316 = m316((JsonObject) C0033.m5856(strM5769, JsonObject.class), C0044.m7509(m318(), 523, 4, 2250));
        String strM315 = m315(m310(jsonObjectM316, C0063.m9585(m318(), 527, 8, 1765)));
        C0055.m8715(C0035.m6110(), strM315);
        StringBuilder sb2 = new StringBuilder();
        C0018.m3933(sb2, C0036.m6189());
        C0018.m3933(sb2, m315(m310(jsonObjectM316, C0027.m5062(m318(), 535, 11, 2940))));
        String strM7763 = C0047.m7763(sb2);
        String strM3152 = m315(m310(jsonObjectM316, C0023.m4536(m318(), 546, 9, 1337)));
        String strM3153 = m315(m310(jsonObjectM316, C0058.m9106(m318(), 555, 12, 559)));
        StringBuilder sb3 = new StringBuilder();
        C0018.m3933(sb3, C0055.m8703());
        C0018.m3933(sb3, m315(m310(jsonObjectM316, C0064.m9599(m318(), 567, 11, 2324))));
        String strM77632 = C0047.m7763(sb3);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        JsonObject jsonObjectM3162 = m316(jsonObjectM316, C0041.m6779(m318(), 578, 13, 643));
        int i = 0;
        while (i < m313(jsonObjectM3162)) {
            i++;
            JsonObject jsonObjectM3163 = m316(jsonObjectM3162, C0054.m8599(i));
            String strM308 = m308(m317(jsonObjectM3163, C0063.m9585(m318(), 591, 4, 1264)));
            StringBuilder sb4 = new StringBuilder();
            C0018.m3933(sb4, C0016.m3579());
            C0018.m3933(sb4, strM308);
            C0004.m1532(arrayList, C0047.m7763(sb4));
            JsonObject jsonObjectM3164 = m316(jsonObjectM3163, C0048.m7902(m318(), 595, 4, 495));
            ArrayList arrayList3 = new ArrayList();
            int i2 = 0;
            while (i2 < m313(jsonObjectM3164)) {
                i2++;
                JsonObject jsonObjectM3165 = m316(jsonObjectM3164, C0054.m8599(i2));
                StringBuilder sb5 = new StringBuilder();
                String strM6584 = C0040.m6584(m318(), 599, 4, 2024);
                C0018.m3933(sb5, m308(m317(jsonObjectM3165, strM6584)));
                C0018.m3933(sb5, C0012.m2973(m318(), 603, 1, 3246));
                C0018.m3933(sb5, m308(m317(jsonObjectM3165, C0058.m9106(m318(), 604, 3, 1820))));
                C0018.m3933(sb5, C0060.m9352(m318(), 607, 1, 862));
                C0018.m3933(sb5, m308(m317(jsonObjectM3165, strM6584)));
                C0004.m1532(arrayList3, C0047.m7763(sb5));
                jsonObjectM3162 = jsonObjectM3162;
            }
            C0004.m1532(arrayList2, C0036.m6194(C0030.m5362(m318(), 608, 1, 2667), arrayList3));
        }
        C0018.m3891(arrayList);
        C0018.m3891(arrayList2);
        m mVar = new m();
        C0011.m2828(mVar, (String) C0048.m7915(list, 0));
        C0005.m1628(mVar, strM315);
        C0058.m9152(mVar, strM3152);
        C0027.m5000(mVar, strM77632);
        C0058.m9159(mVar, strM3153);
        C0019.m4073(mVar, strM7763);
        String strM8337 = C0052.m8337(m318(), 609, 3, 2989);
        C0054.m8596(mVar, C0036.m6194(strM8337, arrayList));
        C0044.m7449(mVar, C0036.m6194(strM8337, arrayList2));
        return C0053.m8428(mVar);
    }

    public void getInfo() {
        StringBuilder sb = new StringBuilder();
        C0018.m3933(sb, C0058.m9110(this));
        C0018.m3933(sb, C0008.m1970(m318(), 612, 13, 1109));
        String strM7763 = C0047.m7763(sb);
        C0044.m7457(this);
        StringBuilder sb2 = new StringBuilder();
        C0018.m3933(sb2, C0037.m6373(this));
        C0018.m3933(sb2, C0006.m1739(this));
        String strM4335 = C0021.m4335(C0047.m7763(sb2));
        StringBuilder sb3 = new StringBuilder();
        C0018.m3933(sb3, C0037.m6373(this));
        C0018.m3933(sb3, strM4335);
        C0018.m3933(sb3, C0039.m6551(m318(), 625, 7, 1279));
        this.f = C0021.m4335(C0047.m7763(sb3));
        HashMap map = new HashMap();
        C0053.m8424(map, C0047.m7833(m318(), 632, 1, 2536), C0037.m6373(this));
        C0053.m8424(map, C0043.m7290(m318(), 633, 1, 3010), C0035.m6124(this));
        C0053.m8424(map, C0000.m1077(m318(), 634, 1, 1502), strM4335);
        String strM2029 = C0008.m2029(C0003.m1396(strM7763, map, C0028.m5115(this)));
        Gson gson = new Gson();
        JsonObject jsonObject = (JsonObject) m311(gson, strM2029, JsonObject.class);
        String strM308 = m308(m317(jsonObject, C0005.m1645(m318(), 635, 4, 1183)));
        String strM3082 = m308(m317(jsonObject, C0057.m8978(m318(), 639, 1, 1565)));
        JsonObject jsonObject2 = (JsonObject) m311(gson, C0045.m7651(C0032.m5700(strM308, C0038.m6456(m308(m317(jsonObject, C0008.m1970(m318(), 641, 1, 995)))), C0038.m6456(m308(m317(jsonObject, C0060.m9352(m318(), 640, 1, 2304))))), C0054.m8636(C0055.m8717(strM3082), 0, 16), C0054.m8636(C0055.m8717(C0035.m6124(this)), 0, 16)), JsonObject.class);
        this.g = m308(m317(jsonObject2, C0027.m5062(m318(), 642, 3, 519)));
        this.h = m308(m317(jsonObject2, C0010.m2300(m318(), 645, 2, 336)));
        this.a = m308(m317(jsonObject2, C0051.m8259(m318(), 647, 4, 1097)));
        this.g = C0054.m8636(C0055.m8717(C0003.m1462(this)), 0, 16);
        this.h = C0054.m8636(C0055.m8717(C0055.m8725(this)), 0, 16);
    }

    public String homeContent(boolean z) {
        ArrayList arrayList = new ArrayList();
        C0044.m7457(this);
        HashMap mapM5115 = C0028.m5115(this);
        C0053.m8424(mapM5115, C0045.m7657(m318(), 651, 10, 2620), C0012.m2961(this));
        StringBuilder sb = new StringBuilder();
        C0018.m3933(sb, C0016.m3536(this));
        C0018.m3933(sb, C0039.m6551(m318(), 661, 21, 1963));
        String strM5769 = C0032.m5769(C0047.m7763(sb), mapM5115);
        if (!C0058.m9127(strM5769, C0020.m4199(m318(), 682, 10, 438))) {
            strM5769 = C0045.m7651(strM5769, C0003.m1462(this), C0055.m8725(this));
        }
        Iterator itM314 = m314(m312(m316((JsonObject) C0033.m5856(strM5769, JsonObject.class), C0046.m7718(m318(), 692, 4, 2365)), C0064.m9599(m318(), 696, 8, 2554)));
        while (C0012.m2962(itM314)) {
            JsonObject jsonObjectM309 = m309((JsonElement) C0048.m7949(itM314));
            C0004.m1532(arrayList, new b(m308(m317(jsonObjectM309, C0012.m2973(m318(), 704, 7, 2440))), m308(m317(jsonObjectM309, C0035.m6131(m318(), 711, 9, 3162))), null));
        }
        return C0003.m1448(C0007.m1840(), null, arrayList);
    }

    public void init(Context context) {
        C0005.m1609(this);
        C0051.m8194(C0035.m6110());
    }

    public void init(Context context, String str) {
        C0051.m8194(C0035.m6110());
        if (str != null) {
            if (C0058.m9127(str, C0022.m4403(m318(), 720, 4, 2968))) {
                this.d = str;
            } else {
                String strM1451 = C0003.m1451(str);
                String strM5852 = C0033.m5852(m318(), 724, 3, 3048);
                if (C0058.m9127(strM1451, strM5852)) {
                    String[] strArrM4752 = C0024.m4752(strM1451, strM5852);
                    this.d = strArrM4752[0];
                    this.a = strArrM4752[1];
                    this.e = strArrM4752[2];
                    this.b = strArrM4752[3];
                    this.g = strArrM4752[4];
                    this.h = strArrM4752[5];
                } else {
                    this.d = strM1451;
                }
            }
            C0053.m8423(this);
        }
        C0005.m1609(this);
    }

    public String playerContent(String str, String str2, List<String> list) {
        C0036.m6219();
        String[] strArrM4752 = C0024.m4752(str2, C0005.m1645(m318(), 727, 1, 1699));
        String strM1212 = (strArrM4752.length <= 0 || C0057.m8953(strArrM4752[0])) ? null : strArrM4752[0];
        String strM2827 = C0011.m2827(strM1212, C0002.m1316(C0035.m6110()), (strArrM4752.length <= 1 || C0057.m8953(strArrM4752[1])) ? null : strArrM4752[1]);
        String str3 = (String) C0065.m9715(C0040.m6618(this), C0024.m4752(str, C0032.m5708(m318(), 728, 2, 1722))[2]);
        String strM7151 = C0042.m7151(m318(), 730, 3, 1928);
        if (str3 != null) {
            try {
                StringBuilder sb = new StringBuilder();
                C0018.m3933(sb, str3);
                C0018.m3933(sb, strM1212);
                strM1212 = C0001.m1212(new JSONObject(C0032.m5769(C0047.m7763(sb), null)), strM7151);
                g gVar = new g();
                C0017.m3667(gVar, strM1212);
                C0002.m1282(gVar, strM2827);
                return C0033.m5828(gVar);
            } catch (JSONException unused) {
                if (C0003.m1392(strM1212)) {
                    g gVar2 = new g();
                    C0017.m3667(gVar2, strM1212);
                    C0002.m1282(gVar2, strM2827);
                    return C0033.m5828(gVar2);
                }
                g gVar3 = new g();
                C0017.m3667(gVar3, strM1212);
                C0064.m9646(gVar3);
                C0002.m1282(gVar3, strM2827);
                return C0033.m5828(gVar3);
            }
        }
        try {
            C0044.m7457(this);
            StringBuilder sb2 = new StringBuilder();
            StringBuilder sb3 = new StringBuilder();
            C0018.m3933(sb3, C0058.m9110(this));
            C0018.m3933(sb3, C0045.m7657(m318(), 733, 14, 1841));
            C0018.m3933(sb2, C0047.m7763(sb3));
            C0018.m3933(sb2, strM1212);
            String strM5769 = C0032.m5769(C0047.m7763(sb2), C0028.m5115(this));
            if (!C0058.m9127(strM5769, C0064.m9599(m318(), 747, 10, 813))) {
                strM5769 = C0045.m7651(strM5769, C0003.m1462(this), C0055.m8725(this));
            }
            String strM12122 = C0001.m1212(new JSONObject(strM5769), strM7151);
            if (C0058.m9127(strM12122, C0048.m7902(m318(), 757, 4, 1081))) {
                g gVar4 = new g();
                C0017.m3667(gVar4, strM12122);
                C0002.m1282(gVar4, strM2827);
                return C0033.m5828(gVar4);
            }
            g gVar5 = new g();
            C0017.m3667(gVar5, strM12122);
            C0006.m1720(gVar5, 1);
            C0064.m9646(gVar5);
            C0002.m1282(gVar5, strM2827);
            return C0033.m5828(gVar5);
        } catch (JSONException unused2) {
            if (C0003.m1392(strM1212)) {
                g gVar6 = new g();
                C0017.m3667(gVar6, strM1212);
                C0002.m1282(gVar6, strM2827);
                return C0033.m5828(gVar6);
            }
            g gVar7 = new g();
            C0017.m3667(gVar7, strM1212);
            C0064.m9646(gVar7);
            C0002.m1282(gVar7, strM2827);
            return C0033.m5828(gVar7);
        }
    }

    public String searchContent(String str, boolean z) {
        return C0021.m4311(this, str, true, C0023.m4536(m318(), 761, 1, 1195));
    }

    public String searchContent(String str, boolean z, String str2) {
        ArrayList arrayList = new ArrayList();
        C0044.m7457(this);
        StringBuilder sb = new StringBuilder();
        C0018.m3933(sb, C0016.m3536(this));
        C0018.m3933(sb, C0057.m8978(m318(), 762, 19, 2338));
        C0018.m3933(sb, str);
        C0018.m3933(sb, C0002.m1305(m318(), 781, 16, 645));
        String strM5769 = C0032.m5769(C0047.m7763(sb), C0028.m5115(this));
        if (!C0058.m9127(strM5769, C0058.m9106(m318(), 797, 10, 2388))) {
            strM5769 = C0045.m7651(strM5769, C0003.m1462(this), C0055.m8725(this));
        }
        JSONArray jSONArrayM4333 = C0021.m4333(C0003.m1370(new JSONObject(strM5769), C0054.m8574(m318(), 807, 4, 625)), C0000.m1077(m318(), 811, 4, 2431));
        for (int i = 0; i < C0053.m8396(jSONArrayM4333); i++) {
            JSONObject jSONObjectM3923 = C0018.m3923(jSONArrayM4333, i);
            C0004.m1532(arrayList, new m(C0001.m1212(jSONObjectM3923, C0045.m7657(m318(), 815, 6, 558)), C0001.m1212(jSONObjectM3923, C0055.m8814(m318(), 821, 8, 787)), C0001.m1212(jSONObjectM3923, C0004.m1549(m318(), 829, 7, 471)), C0001.m1212(jSONObjectM3923, C0026.m4951(m318(), 836, 11, 2733))));
        }
        return C0047.m7783(arrayList);
    }

    public void setDev() {
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 20; i++) {
            if (i > 0) {
                C0018.m3933(sb, C0011.m2805(m318(), 847, 1, 2526));
            }
            int iM4817 = C0025.m4817(random, 16);
            int iM48172 = C0025.m4817(random, 16);
            C0018.m3933(sb, C0060.m9284(C0056.m8889(iM4817)));
            C0018.m3933(sb, C0060.m9284(C0056.m8889(iM48172)));
        }
        this.i = C0027.m4992(C0047.m7763(sb), C0003.m1462(this), C0055.m8725(this));
        C0044.m7457(this);
        JSONArray jSONArrayM4333 = C0021.m4333(C0003.m1370(new JSONObject(C0045.m7651(C0032.m5769(C0028.m5188(new StringBuilder(), C0058.m9110(this), C0036.m6188(m318(), 848, 26, 2247)), C0028.m5115(this)), C0003.m1462(this), C0055.m8725(this))), C0031.m5565(m318(), 874, 4, 1399)), C0060.m9352(m318(), 878, 10, 1670));
        HashMap map = new HashMap();
        for (int i2 = 0; i2 < C0053.m8396(jSONArrayM4333); i2++) {
            JSONObject jSONObjectM3923 = C0018.m3923(jSONArrayM4333, i2);
            C0053.m8424(map, C0001.m1212(jSONObjectM3923, C0009.m2037(m318(), 888, 10, 3058)), C0001.m1212(jSONObjectM3923, C0056.m8911(m318(), 898, 12, 2332)));
        }
        this.j = map;
    }
}