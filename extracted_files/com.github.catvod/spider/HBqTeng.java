package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.B0.a;
import com.github.catvod.spider.merge.E.b;
import com.github.catvod.spider.merge.E.g;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.T0.m;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.Z.C0040;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.b.C0044;
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
import com.github.catvod.spider.merge.r0.C0059;
import com.github.catvod.spider.merge.r0.C0060;
import com.github.catvod.spider.merge.t.C0061;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.a0.C0006;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.github.catvod.spider.p000mergexbpq.c0.C0010;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import com.github.catvod.spider.p000mergexbpq.x.C0015;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* loaded from: classes.dex */
public class HBqTeng extends Spider {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f53short = {1954, 1924, 1938, 1925, 2010, 1974, 1936, 1938, 1945, 1923, 1751, 1781, 1760, 1779, 1782, 1782, 1787, 1717, 1711, 1716, 1706, 1722, 1714, 1741, 1779, 1780, 1790, 1781, 1773, 1769, 1722, 1748, 1742, 1722, 1707, 1706, 1716, 1706, 1697, 1722, 1741, 1749, 1741, 1708, 1710, 1715, 1722, 1755, 1770, 1770, 1782, 1791, 1741, 1791, 1784, 1745, 1779, 1774, 1717, 1711, 1705, 1709, 1716, 1705, 1708, 1722, 1714, 1745, 1746, 1742, 1751, 1750, 1718, 1722, 1782, 1779, 1777, 1791, 1722, 1757, 1791, 1785, 1777, 1781, 1715, 1722, 1753, 1778, 1768, 1781, 1783, 1791, 1717, 1707, 1706, 1699, 1716, 1706, 1716, 1706, 1716, 1706, 1722, 1737, 1787, 1788, 1787, 1768, 1779, 1717, 1711, 1705, 1709, 1716, 1705, 1708, 3308, 3291, 3288, 3291, 3276, 3291, 3276, 3037, 3009, 3009, 3013, 3014, 2959, 2970, 2970, 3013, 3031, 3028, 3030, 3030, 3024, 3014, 3014, 2971, 3011, 3036, 3025, 3024, 3034, 2971, 3012, 3012, 2971, 3030, 3034, 3032, 2750, 2808, 2788, 2813, 2812, 2896, 2903, 2904, 2897, 2881, 2899, 2904, 2845, 2845, 2845, 1201, 1212, 1187, 1275, 1209, 1212, 1190, 1185, 1162, 1191, 1275, 1206, 1206, 1209, 1200, 1204, 1191, 1269, 1259, 1269, 1201, 1212, 1187, 1269, 1259, 1269, 1184, 1209, 1269, 1259, 1269, 1209, 1212, 2681, 2685, 2679, 313, 308, 300, 14236, 15532, 2876, 2065, 2059, 2076, 2079, 2480, 2485, 2464, 2485, 2553, 2491, 2470, 2493, 2483, 2493, 2490, 2485, 2488, 3004, 3007, 2990, 2977, 3041, 3002, 3007, 2987, 2990, 3003, 2986, 2960, 3003, 2982, 2978, 2986, 2474, 2486, 2486, 2482, 2481, 2552, 2541, 2541, 2484, 2540, 2481, 2477, 2469, 2477, 2487, 2540, 2465, 2477, 2479, 521, 535, 528, 538, 529, 521, 546, 592, 545, 545, 567, 560, 567, 554, 567, 575, 562, 545, 557, 554, 575, 554, 571, 545, 545, 579, 598, 592, 596, 577, 599, 581, 546, 598, 1142, 1143, 1126, 1139, 1147, 1150, 672, 701, 684, 676, 653, 680, 701, 680, 916, 923, 919, 927, 2310, 2330, 2334, 2317, 2254, 2279, 2248, 2257, 2267, 2253, 2250, 2260, 785, 796, 775, 784, 790, 769, 794, 775, 1210, 1185, 1196, 1191, 1198, 1200, 1190, 1212, 1474, 1502, 1491, 1483, 2115, 2142, 2127, 2119, 2165, 2118, 2115, 2137, 2142, 2493, 2471, 2490, 2475, 3050, 2983, 2987, 2985, 577, 577, 577, 1077, 1074, 1082, 1075, 1448, 1455, 1457, 1819, 452, 2239, 2211, 2211, 2215, 2212, 2285, 2296, 2296, 2209, 2297, 2212, 2232, 2224, 2232, 2210, 2297, 2228, 2232, 2234, 538, 307, 303, 303, 299, 296, 353, 372, 372, 301, 373, 296, 308, 316, 308, 302, 373, 312, 308, 310, 1573, 1596, 1662, 1598, 1585, 1574, 1662, 1598, 1585, 1574, 1586, 1585, 1570, 1661, 1598, 1585, 1574, 1648, 1646, 1648, 1596, 1593, 1376, 2239, 2213, 2226, 2225, 1909, 1898, 1836, 1840, 1833, 1832, 29985, 20941, 3089, 2338, 2640, 2636, 2636, 2632, 2635, 2562, 2583, 2583, 2632, 2650, 2649, 2651, 2651, 2653, 2635, 2635, 2582, 2638, 2641, 2652, 2653, 2647, 2582, 2633, 2633, 2582, 2651, 2647, 2645, 2583, 2636, 2634, 2632, 2651, 2582, 2638, 2641, 2652, 2653, 2647, 2635, 2653, 2649, 2634, 2651, 2640, 2582, 2635, 2645, 2649, 2634, 2636, 2650, 2647, 2624, 2667, 2653, 2634, 2638, 2653, 2634, 2582, 2672, 2636, 2636, 2632, 2666, 2647, 2637, 2646, 2636, 2666, 2653, 2651, 2649, 2644, 2644, 2583, 2667, 2645, 2649, 2634, 2636, 2650, 2647, 2624, 2567, 2633, 2637, 2653, 2634, 2625, 2565, 2827, 2892, 2909, 2909, 2916, 2921, 2832, 2846, 2844, 2842, 2847, 2827, 2892, 2909, 2909, 2918, 2888, 2900, 2832, 2881, 2922, 2885, 2923, 2916, 2941, 2888, 2921, 2846, 2917, 2910, 2914, 2836, 2901, 2920, 2909, 2827, 2909, 2892, 2890, 2888, 2915, 2904, 2880, 2832, 2845, 2827, 2909, 2892, 2890, 2888, 2942, 2884, 2903, 2888, 2832, 2844, 2845, 3302, 3264, 3286, 3265, 3230, 3314, 3284, 3286, 3293, 3271, 1414, 1444, 1457, 1442, 1447, 1447, 1450, 1508, 1534, 1509, 1531, 1515, 1507, 1436, 1442, 1445, 1455, 1444, 1468, 1464, 1515, 1413, 1439, 1515, 1530, 1531, 1509, 1531, 1520, 1515, 1436, 1442, 1445, 1533, 1535, 1520, 1515, 1459, 1533, 1535, 1506, 1515, 1418, 1467, 1467, 1447, 1454, 1436, 1454, 1449, 1408, 1442, 1471, 1508, 1534, 1528, 1532, 1509, 1528, 1533, 1515, 1507, 1408, 1411, 1439, 1414, 1415, 1511, 1515, 1447, 1442, 1440, 1454, 1515, 1420, 1454, 1448, 1440, 1444, 1506, 1515, 1416, 1443, 1465, 1444, 1446, 1454, 1508, 1522, 1534, 1509, 1531, 1509, 1535, 1533, 1528, 1523, 1509, 1534, 1535, 1515, 1432, 1450, 1453, 1450, 1465, 1442, 1508, 1534, 1528, 1532, 1509, 1528, 1533, 2356, 2358, 2358, 2352, 2341, 2337, 2424, 2361, 2356, 2363, 2354, 2336, 2356, 2354, 2352, 1386, 1400, 1341, 1363, 1374, 1062, 1073, 1074, 1073, 1062, 1073, 1062, 1614, 1618, 1618, 1622, 1621, 1564, 1545, 1545, 1622, 1604, 1607, 1605, 1605, 1603, 1621, 1621, 1544, 1616, 1615, 1602, 1603, 1609, 1544, 1623, 1623, 1544, 1605, 1609, 1611, 275, 261, 259, 333, 262, 261, 276, 259, 264, 333, 260, 261, 275, 276, 2791, 2799, 2802, 2806, 2811, 3312, 3302, 3296, 3246, 3301, 3302, 3319, 3296, 3307, 3246, 3310, 3308, 3303, 3302, 1477, 1481, 1492, 1493, 385, 407, 401, 479, 404, 407, 390, 401, 410, 479, 385, 411, 390, 407, 701, 684, 689, 685, 685, 755, 685, 695, 682, 699, 2719, 2714, 2703, 2714, 1018, 996, 1000, 1019, 1021, 1003, 998, 1009, 960, 1021, 1004, 996, 965, 992, 1018, 1021, 1977, 1978, 1960, 1970, 1976, 1951, 1972, 1976, 461, 448, 2422, 2410, 2410, 2414, 2413, 2340, 2353, 2353, 2416, 2417, 2426, 2427, 2352, 2408, 2423, 2426, 2427, 2417, 2352, 2415, 2415, 2352, 2429, 2417, 2419, 2353, 2406, 2353, 2431, 2414, 2423, 2353, 2424, 2418, 2417, 2431, 2410, 2369, 2408, 2423, 2416, 2424, 2417, 2348, 2337, 2429, 2423, 2426, 2339, 1418, 2108, 2081, 2108, 2084, 2093, 2473, 2480, 2490, 2726, 2737, 2743};
    public String a = C0007.m1840();

    public static HashMap a() {
        return C0019.m4127(C0005.m1645(m323(), 0, 10, 2039), C0051.m8259(m323(), 10, 106, 1690), C0057.m8978(m323(), 116, 7, 3262), C0031.m5565(m323(), 123, 29, 2997));
    }

    /* renamed from: ۟۟ۦۤۥ, reason: not valid java name and contains not printable characters */
    public static JsonObject m321(Object obj, Object obj2) {
        if (C0058.m9131() < 0) {
            return ((JsonObject) obj).getAsJsonObject((String) obj2);
        }
        return null;
    }

    /* renamed from: ۟ۡۤ۠, reason: not valid java name and contains not printable characters */
    public static Call m322(Object obj, Object obj2) {
        if (C0046.m7701() > 0) {
            return ((OkHttpClient) obj).newCall((Request) obj2);
        }
        return null;
    }

    /* renamed from: ۟ۢۢۦۤ, reason: not valid java name and contains not printable characters */
    public static short[] m323() {
        if (C0058.m9131() < 0) {
            return f53short;
        }
        return null;
    }

    /* renamed from: ۟ۢۤۧۦ, reason: not valid java name and contains not printable characters */
    public static String m324(Object obj) {
        if (C0010.m2320() <= 0) {
            return ((JsonPrimitive) obj).getAsString();
        }
        return null;
    }

    /* renamed from: ۟ۢۦۡۡ, reason: not valid java name and contains not printable characters */
    public static Request.Builder m325(Object obj) {
        if (C0001.m1164() < 0) {
            return ((Request.Builder) obj).get();
        }
        return null;
    }

    /* renamed from: ۣۣ۟ۤ, reason: not valid java name and contains not printable characters */
    public static String m326(Object obj) {
        if (C0038.m6471() > 0) {
            return ((ResponseBody) obj).string();
        }
        return null;
    }

    /* renamed from: ۟ۤۦۢۥ, reason: not valid java name and contains not printable characters */
    public static Request m327(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        if (C0062.m9429() >= 0) {
            return a.v((Request.Builder) obj, (String) obj2, (String) obj3, (String) obj4, (String) obj5);
        }
        return null;
    }

    /* renamed from: ۟ۥۣۧۨ, reason: not valid java name and contains not printable characters */
    public static String m328(Object obj) {
        if (C0016.m3596() < 0) {
            return ((JsonElement) obj).toString();
        }
        return null;
    }

    /* renamed from: ۣ۠ۤۨ, reason: not valid java name and contains not printable characters */
    public static JsonObject m329(Object obj) {
        if (C0060.m9355() > 0) {
            return ((JsonElement) obj).getAsJsonObject();
        }
        return null;
    }

    /* renamed from: ۢۢۡۢ, reason: not valid java name and contains not printable characters */
    public static Object m330(Object obj, Object obj2, Object obj3) {
        if (C0042.m7147() < 0) {
            return ((Gson) obj).fromJson((String) obj2, (Class) obj3);
        }
        return null;
    }

    /* renamed from: ۢۨۥۨ, reason: not valid java name and contains not printable characters */
    public static Response m331(Object obj) {
        if (C0048.m7971() >= 0) {
            return ((Call) obj).execute();
        }
        return null;
    }

    /* renamed from: ۤۤۥۡ, reason: not valid java name and contains not printable characters */
    public static JsonPrimitive m332(Object obj, Object obj2) {
        if (C0059.m9257() <= 0) {
            return ((JsonObject) obj).getAsJsonPrimitive((String) obj2);
        }
        return null;
    }

    /* renamed from: ۥۤۡ, reason: contains not printable characters */
    public static Request.Builder m333(Object obj, Object obj2) {
        if (C0041.m6823() < 0) {
            return ((Request.Builder) obj).url((String) obj2);
        }
        return null;
    }

    /* renamed from: ۥۥۣ۠, reason: contains not printable characters */
    public static Request.Builder m334(Object obj, Object obj2, Object obj3) {
        if (C0012.m3024() > 0) {
            return ((Request.Builder) obj).addHeader((String) obj2, (String) obj3);
        }
        return null;
    }

    /* renamed from: ۦۧۧۢ, reason: contains not printable characters */
    public static JsonArray m335(Object obj, Object obj2) {
        if (C0024.m4693() <= 0) {
            return ((JsonObject) obj).getAsJsonArray((String) obj2);
        }
        return null;
    }

    /* renamed from: ۧۡۨ۠, reason: not valid java name and contains not printable characters */
    public static Iterator m336(Object obj) {
        if (C0027.m5017() > 0) {
            return ((JsonArray) obj).iterator();
        }
        return null;
    }

    /* renamed from: ۨۢۤۦ, reason: not valid java name and contains not printable characters */
    public static ResponseBody m337(Object obj) {
        if (C0008.m1975() >= 0) {
            return ((Response) obj).body();
        }
        return null;
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        ArrayList arrayList = new ArrayList();
        String strM5172 = C0028.m5172(str, str2, C0046.m7718(m323(), 152, 5, 2704));
        PrintStream printStreamM6087 = C0035.m6087();
        StringBuilder sb = new StringBuilder(C0036.m6188(m323(), 157, 10, 2870));
        C0018.m3933(sb, strM5172);
        C0012.m2969(printStreamM6087, C0047.m7763(sb));
        Iterator itM7807 = C0047.m7807(C0030.m5333(C0016.m3577(C0032.m5769(strM5172, null)), C0018.m3917(m323(), 167, 33, 1237)));
        while (C0012.m2962(itM7807)) {
            m mVar = (m) C0048.m7949(itM7807);
            String strM4403 = C0022.m4403(m323(), 200, 3, 2576);
            String strM8058 = C0049.m8058(C0030.m5333(mVar, strM4403), C0013.m3106(m323(), 203, 3, 344));
            String strM6584 = C0040.m6584(m323(), 206, 1, 1942);
            String strM1840 = C0007.m1840();
            String strM3446 = C0015.m3446(C0015.m3446(strM8058, strM6584, strM1840), C0007.m1842(m323(), 207, 1, 3239), strM1840);
            String strM80582 = C0049.m8058(C0030.m5333(mVar, C0015.m3484(m323(), 208, 1, 2909)), C0008.m1970(m323(), 209, 4, 2169));
            C0055.m8732(C0026.m4915(C0063.m9585(m323(), 242, 19, 2498), strM80582), strM3446, C0049.m8058(C0030.m5333(mVar, strM4403), C0042.m7151(m323(), 213, 13, 2516)), C0064.m9669(C0036.m6243(mVar, C0027.m5062(m323(), 226, 16, 3023))), arrayList);
        }
        return C0020.m4216(C0011.m2808(C0038.m6456(str2)), C0047.m7818(1, str2), C0011.m2808(20), C0054.m8556(str2, 1, 20), arrayList);
    }

    public String detailContent(List<String> list) {
        C0032.m5769((String) C0048.m7915(list, 0), C0028.m5156());
        JsonObject jsonObjectM321 = m321(m321((JsonObject) C0033.m5856(C0006.m1778(C0032.m5769((String) C0048.m7915(list, 0), C0028.m5156()), C0018.m3917(m323(), 261, 34, 638)), JsonObject.class), C0051.m8259(m323(), 295, 6, 1042)), C0040.m6584(m323(), 301, 8, 713));
        com.github.catvod.spider.merge.E.m mVar = new com.github.catvod.spider.merge.E.m();
        C0005.m1628(mVar, m324(m332(jsonObjectM321, C0060.m9352(m323(), 309, 4, 1018))));
        C0022.m4432(mVar, m324(m332(jsonObjectM321, C0042.m7151(m323(), 313, 4, 2431))));
        C0026.m4947(mVar, m324(m332(jsonObjectM321, C0032.m5708(m323(), 317, 8, 2232))));
        C0058.m9159(mVar, m324(m332(jsonObjectM321, C0031.m5565(m323(), 325, 8, 885))));
        C0058.m9152(mVar, m324(m332(jsonObjectM321, C0015.m3484(m323(), 333, 8, 1225))));
        JsonArray jsonArrayM335 = m335(m321(jsonObjectM321, C0006.m1774(m323(), 341, 4, 1458)), C0049.m8007(m323(), 345, 9, 2090));
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        Iterator itM336 = m336(jsonArrayM335);
        while (C0012.m2962(itM336)) {
            JsonElement jsonElement = (JsonElement) C0048.m7949(itM336);
            String strM324 = m324(m332(m329(jsonElement), C0020.m4199(m323(), 354, 4, 2510)));
            String strM6452 = C0038.m6452(m323(), 358, 4, 3012);
            String strM1840 = C0007.m1840();
            C0018.m3933(sb, C0015.m3446(strM324, strM6452, strM1840));
            String strM1305 = C0002.m1305(m323(), 362, 3, 613);
            C0018.m3933(sb, strM1305);
            Iterator itM3362 = m336(m335(m329(jsonElement), C0061.m9361(m323(), 365, 4, 1116)));
            int i = 0;
            while (C0012.m2962(itM3362)) {
                String strM3446 = C0015.m3446(m328(m332(m329((JsonElement) C0048.m7949(itM3362)), C0022.m4403(m323(), 369, 3, 1501))), C0038.m6452(m323(), 372, 1, 1849), strM1840);
                i++;
                C0036.m6177(sb2, i);
                C0018.m3933(sb2, C0053.m8477(m323(), 373, 1, 480));
                StringBuilder sb3 = new StringBuilder(C0046.m7718(m323(), 374, 19, 2263));
                C0018.m3933(sb3, strM3446);
                C0018.m3933(sb2, C0047.m7763(sb3));
                C0018.m3933(sb2, C0032.m5708(m323(), 393, 1, 569));
            }
            C0018.m3933(sb2, strM1305);
        }
        C0054.m8596(mVar, C0000.m1096(sb));
        C0044.m7449(mVar, C0000.m1096(sb2));
        return C0053.m8428(mVar);
    }

    public String homeContent(boolean z) {
        ArrayList arrayList = new ArrayList();
        String strM7833 = C0047.m7833(m323(), 394, 19, 347);
        Iterator itM7807 = C0047.m7807(C0030.m5333(C0016.m3577(C0032.m5769(strM7833, null)), C0027.m5062(m323(), 413, 22, 1616)));
        while (C0012.m2962(itM7807)) {
            m mVar = (m) C0048.m7949(itM7807);
            String strM8337 = C0052.m8337(m323(), 435, 1, 1281);
            String strM4684 = C0024.m4684(C0030.m5333(mVar, strM8337));
            String strM3446 = C0015.m3446(C0049.m8058(C0030.m5333(mVar, strM8337), C0031.m5565(m323(), 436, 4, 2263)), C0056.m8911(m323(), 440, 6, 1860), C0007.m1840());
            if (C0058.m9127(strM4684, C0029.m5256(m323(), 446, 1, 1894)) || C0058.m9127(strM4684, C0056.m8911(m323(), 447, 1, 938))) {
                C0004.m1532(arrayList, new b(C0026.m4915(strM7833, strM3446), strM4684, null));
            }
        }
        return C0003.m1448(C0048.m7919(this), null, arrayList);
    }

    public void init(Context context) {
        C0051.m8194(C0035.m6110());
    }

    public void init(Context context, String str) {
        C0051.m8194(C0035.m6110());
        if (str != null) {
            this.a = str;
        }
    }

    public String playerContent(String str, String str2, List<String> list) {
        C0036.m6219();
        String[] strArrM4752 = C0024.m4752(str2, C0024.m4740(m323(), 448, 1, 3183));
        String str3 = null;
        String str4 = (strArrM4752.length <= 0 || C0057.m8953(strArrM4752[0])) ? null : strArrM4752[0];
        String str5 = (strArrM4752.length <= 1 || C0057.m8953(strArrM4752[1])) ? null : strArrM4752[1];
        if (strArrM4752.length > 2 && !C0057.m8953(strArrM4752[2])) {
            String str6 = strArrM4752[2];
        }
        if (strArrM4752.length > 3 && !C0057.m8953(strArrM4752[3])) {
            str3 = strArrM4752[3];
        }
        String strM2827 = C0011.m2827(str4, str5, str3);
        g gVarM9311 = C0060.m9311(0, str4);
        C0057.m9029(gVarM9311, C0028.m5156());
        C0002.m1282(gVarM9311, strM2827);
        return C0033.m5828(gVarM9311);
    }

    public String searchContent(String str, boolean z) {
        return C0038.m6449(this, str, true, C0047.m7833(m323(), 449, 1, 2323));
    }

    public String searchContent(String str, boolean z, String str2) {
        List list;
        String strM1840;
        String strM6312;
        ArrayList arrayList = new ArrayList();
        OkHttpClient okHttpClient = new OkHttpClient();
        Request.Builder builder = new Request.Builder();
        StringBuilder sb = new StringBuilder(C0006.m1774(m323(), 450, 93, 2616));
        C0018.m3933(sb, C0056.m8909(str));
        C0018.m3933(sb, C0064.m9599(m323(), 543, 57, 2861));
        String strM326 = m326(m337(m331(m322(okHttpClient, m327(m334(m334(m334(m334(m325(m333(builder, C0047.m7763(sb))), C0019.m4107(m323(), 600, 10, 3251), C0053.m8477(m323(), 610, 114, 1483)), C0064.m9599(m323(), 724, 15, 2389), C0049.m8007(m323(), 739, 5, 1296)), C0040.m6584(m323(), 744, 7, 1108), C0042.m7151(m323(), 751, 29, 1574)), C0032.m5708(m323(), 780, 14, 352), C0040.m6584(m323(), 794, 5, 2690)), C0000.m1077(m323(), 799, 14, 3203), C0026.m4951(m323(), 813, 4, 1446), C0064.m9599(m323(), 817, 14, 498), C0042.m7151(m323(), 831, 10, 734))))));
        C0012.m2969(C0035.m6087(), strM326);
        Gson gson = new Gson();
        Map map = (Map) C0062.m9431((Map) m330(gson, strM326, Map.class), C0008.m1970(m323(), 841, 4, 2811));
        if (map != null && (list = (List) C0062.m9431(map, C0004.m1549(m323(), 845, 16, 905))) != null && C0064.m9636(list) > 0) {
            String strM4915 = C0026.m4915(C0001.m1189(m323(), 871, 49, 2334), (String) C0062.m9431((Map) C0062.m9431((Map) C0048.m7915(list, 0), C0028.m5109(m323(), 861, 8, 2011)), C0053.m8477(m323(), 869, 2, 420)));
            Map map2 = (Map) m330(gson, C0032.m5769(strM4915, C0028.m5156()), Map.class);
            new HashMap();
            Map map3 = (Map) C0062.m9431(map2, C0024.m4740(m323(), 920, 1, 1513));
            if (map3 != null) {
                strM1840 = C0037.m6312(C0062.m9431(map3, C0061.m9361(m323(), 921, 5, 2120)));
                strM6312 = C0037.m6312(C0062.m9431(map3, C0002.m1305(m323(), 926, 3, 2521)));
            } else {
                strM1840 = C0007.m1840();
                strM6312 = strM1840;
            }
            C0055.m8732(strM4915, strM1840, strM6312, C0037.m6312(C0062.m9431(map2, C0057.m8978(m323(), 929, 3, 2772))), arrayList);
        }
        return C0047.m7783(arrayList);
    }
}