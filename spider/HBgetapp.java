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
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.S.C0027;
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
import com.github.catvod.spider.merge.Z.C0040;
import com.github.catvod.spider.merge.Z.d;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.b0.C0045;
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
import com.github.catvod.spider.p000mergexbpq.r.C0014;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class HBgetapp extends Spider {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f41short = {2045, 2028, 2028, 2045, 2028, 2037, 28093, 24803, 1413, 1483, 1498, 1475, 1412, 1498, 1474, 1498, 1413, 1485, 1487, 1502, 1483, 1498, 1498, 1483, 1498, 1475, 1412, 1475, 1476, 1486, 1487, 1490, 1413, 1502, 1491, 1498, 1487, 1516, 1475, 1478, 1502, 1487, 1496, 1532, 1477, 1486, 1510, 1475, 1497, 1502, 515, 528, 519, 515, 21946, -27590, 2619, 2599, 2595, 2608, 1678, 1667, 1674, 1695, 1701, 1683, 1694, 2053, 2068, 2066, 2064, 1883, 1863, 1882, 1884, 26013, 26413, 2203, 2198, 2201, 2192, 1788, 1779, 1790, 1772, 1772, 1841, 1844, 1825, 1844, 820, 803, 805, 809, 811, 811, 803, 808, 802, 793, 810, 815, 821, 818, 1025, 1048, 1043, 1064, 1054, 1043, 2290, 2283, 2272, 2267, 2282, 2277, 2281, 2273, 2530, 2555, 2544, 2507, 2532, 2557, 2551, 2930, 2923, 2912, 2907, 2934, 2913, 2921, 2917, 2934, 2927, 2935, 2306, 2380, 2397, 2372, 2307, 2397, 2373, 2397, 2306, 2378, 2376, 2393, 2380, 2397, 2397, 2380, 2397, 2372, 2307, 2372, 2371, 2377, 2376, 2389, 2306, 2395, 2370, 2377, 2409, 2376, 2393, 2380, 2372, 2369, 1509, 1532, 1527, 1484, 1530, 1527, 1847, 1842, 1831, 1842, 1520, 1513, 1506, 2356, 2349, 2342, 2333, 2348, 2339, 2351, 2343, 3167, 3142, 3149, 3190, 3163, 3148, 3140, 3144, 3163, 3138, 3162, 2051, 2074, 2065, 2090, 2068, 2070, 2049, 2074, 2055, 2440, 2449, 2458, 2465, 2458, 2455, 2444, 2459, 2461, 2442, 2449, 2444, 405, 396, 391, 444, 384, 396, 397, 407, 390, 397, 407, 2102, 2095, 2084, 2079, 2096, 2092, 2081, 2105, 2079, 2092, 2089, 2099, 2100, 3322, 3302, 3307, 3315, 3311, 3320, 3285, 3299, 3300, 3308, 3301, 801, 826, 829, 805, 1201, 1201, 1201, 2210, 2213, 2235, 2212, 1062, 1065, 1061, 1069, 2873, 2591, 2574, 2589, 2588, 2570, 1390, 2552, 2559, 2529, 1786, 1761, 1765, 1771, 1760, 3041, 2280, 2254, 2264, 2255, 2192, 2300, 2266, 2264, 2259, 2249, 1223, 1219, 1216, 1244, 1244, 1240, 1159, 1179, 1158, 1177, 1180, 1158, 1169, 2595, 2575, 2574, 2580, 2565, 2574, 2580, 2637, 2612, 2585, 2576, 2565, 1309, 1292, 1292, 1296, 1301, 1311, 1309, 1288, 1301, 1299, 1298, 1363, 1284, 1361, 1291, 1291, 1291, 1361, 1306, 1299, 1294, 1297, 1361, 1289, 1294, 1296, 1305, 1298, 1311, 1299, 1304, 1305, 1304, 1358, 1375, 1375, 1282, 1370, 1372, 1354, 1373, 1282, 1371, 1344, 1348, 1354, 1345, 1262, 1257, 1211, 1262, 1257, 1200, 1258, 1257, 1260, 1260, 1208, 1260, 1211, 1214, 1209, 1200, 1257, 1260, 1257, 1259, 1257, 1259, 1211, 1201, 1215, 1200, 1262, 1262, 1259, 1200, 1257, 1210, 1201, 1201, 1215, 1257, 1208, 1261, 1213, 1258, 1212, 1212, 1262, 1201, 1211, 1212, 1259, 1260, 1261, 1212, 1211, 1261, 1261, 1209, 1208, 1258, 1213, 1257, 1214, 1210, 1214, 1259, 1258, 1213, 1957, 2027, 2042, 2019, 1956, 2042, 2018, 2042, 1957, 2029, 2031, 2046, 2027, 2042, 2042, 2027, 2042, 2019, 1956, 2019, 2020, 2030, 2031, 2034, 1957, 2019, 2020, 2019, 2046, 2012, 1979, 1979, 1971, 1923, 1926, 1939, 1926, 1757, 1744, 1753, 1740, 1782, 1733, 1728, 1754, 1757, 3019, 3014, 3023, 3034, 3040, 3030, 3035, 1052, 1041, 1048, 1037, 1079, 1030, 1033, 1029, 1037, 677, 674, 702, 697, 875, 817, 829, 817, 2935, 2937, 2917, 1525, 1514, 491, 506, 506, 481, 495, 499, 1994, 2011, 2011, 1986, 2013, 1715, 3083, 3084, 3090, 2674, 2663, 2668, 2662, 2684, 1208, 1188, 1188, 1184, 2626, 2572, 2589, 2564, 2627, 2589, 2565, 2589, 2626, 2570, 2568, 2585, 2572, 2589, 2589, 2572, 2589, 2564, 2627, 2564, 2563, 2569, 2568, 2581, 2626, 2587, 2562, 2569, 2621, 2572, 2591, 2590, 2568, 3152, 3137, 3154, 3155, 3141, 3199, 3137, 3152, 3145, 1089, 1114, 1118, 1104, 1115, 2984, 2989, 3000, 2989, 1067, 3077, 3077, 2912, 2871, 2864, 2862, 2912, 2936, 2912, 2922, 2841, 2844, 2912, 2847, 2921, 2923, 2912, 2771, 2692, 2691, 2717, 2771, 2763, 2769, 2771, 2777, 2730, 2735, 2771, 2732, 2778, 2776, 2771, 2386, 2332, 2317, 2324, 2387, 2317, 2325, 2317, 2386, 2330, 2328, 2313, 2332, 2317, 2317, 2332, 2317, 2324, 2387, 2324, 2323, 2329, 2328, 2309, 2386, 2318, 2328, 2332, 2319, 2334, 2325, 2353, 2324, 2318, 2313, 2062, 2048, 2076, 2066, 2058, 2071, 2049, 2070, 2653, 2640, 2649, 2636, 2649, 2632, 2638, 2636, 2678, 2624, 2637, 2611, 1118, 1115, 1102, 1115, 3103, 3081, 3085, 3102, 3087, 3076, 3123, 3072, 3077, 3103, 3096, 1939, 1930, 1921, 1978, 1932, 1921, 2806, 2799, 2788, 2783, 2798, 2785, 2797, 2789, 2356, 2349, 2342, 2333, 2354, 2347, 2337, 1924, 1949, 1942, 1965, 1920, 1943, 1951, 1939, 1920, 1945, 1921};
    public String a;
    public final String b;
    public String c;
    public String d;

    public HBgetapp() {
        String strM1840 = C0007.m1840();
        this.a = strM1840;
        this.b = C0053.m8477(m247(), 0, 8, 1948);
        this.c = strM1840;
        this.d = strM1840;
    }

    /* renamed from: ۣ۟۟ۢۦ, reason: not valid java name and contains not printable characters */
    public static JsonObject m244(Object obj, Object obj2) {
        if (C0040.m6582() > 0) {
            return ((JsonObject) obj).getAsJsonObject((String) obj2);
        }
        return null;
    }

    /* renamed from: ۟ۤۡۥۦ, reason: not valid java name and contains not printable characters */
    public static JsonObject m245(Object obj) {
        if (C0035.m6140() <= 0) {
            return ((JsonElement) obj).getAsJsonObject();
        }
        return null;
    }

    /* renamed from: ۠۠ۥۣ, reason: not valid java name and contains not printable characters */
    public static JsonElement m246(Object obj, Object obj2) {
        if (C0064.m9659() < 0) {
            return ((JsonObject) obj).get((String) obj2);
        }
        return null;
    }

    /* renamed from: ۢۢۦۥ, reason: not valid java name and contains not printable characters */
    public static short[] m247() {
        if (C0035.m6140() <= 0) {
            return f41short;
        }
        return null;
    }

    /* renamed from: ۤۦۨۨ, reason: not valid java name and contains not printable characters */
    public static String m248(Object obj) {
        if (C0036.m6252() >= 0) {
            return ((JsonElement) obj).getAsString();
        }
        return null;
    }

    /* renamed from: ۦ۟۠ۤ, reason: contains not printable characters */
    public static Object m249(Object obj, Object obj2, Object obj3) {
        if (C0050.m8121() <= 0) {
            return ((Gson) obj).fromJson((String) obj2, (Class) obj3);
        }
        return null;
    }

    /* renamed from: ۦۣ۟ۤ, reason: contains not printable characters */
    public static JsonArray m250(Object obj, Object obj2) {
        if (C0034.m6048() < 0) {
            return ((JsonObject) obj).getAsJsonArray((String) obj2);
        }
        return null;
    }

    /* renamed from: ۦ۟ۨۧ, reason: contains not printable characters */
    public static Iterator m251(Object obj) {
        if (C0022.m4497() > 0) {
            return ((JsonArray) obj).iterator();
        }
        return null;
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        ArrayList arrayList = new ArrayList();
        String strM5188 = C0028.m5188(new StringBuilder(), C0035.m6145(this), C0047.m7833(m247(), 8, 42, 1450));
        String strM9106 = C0058.m9106(m247(), 50, 4, 610);
        String strM8911 = C0056.m8911(m247(), 54, 2, 1234);
        HashMap mapM4127 = C0019.m4127(strM9106, strM8911, C0010.m2300(m247(), 56, 4, 2626), strM8911);
        C0053.m8424(mapM4127, C0051.m8259(m247(), 60, 7, 1786), str);
        C0053.m8424(mapM4127, C0017.m3646(m247(), 67, 4, 2165), str2);
        C0053.m8424(mapM4127, C0054.m8574(m247(), 71, 4, 1832), C0008.m1970(m247(), 75, 2, 669));
        C0053.m8424(mapM4127, C0060.m9352(m247(), 77, 4, 2295), strM8911);
        C0053.m8424(mapM4127, C0012.m2973(m247(), 81, 5, 1695), strM8911);
        Iterator itM251 = m251(m250((JsonObject) C0033.m5856(C0045.m7651(C0001.m1212(new JSONObject(C0008.m2029(C0003.m1396(strM5188, mapM4127, C0020.m4209(this)))), C0061.m9361(m247(), 86, 4, 1877)), C0009.m2083(C0009.m2096(this)), C0009.m2083(C0057.m8997(this))), JsonObject.class), C0012.m2973(m247(), 90, 14, 838)));
        while (C0012.m2962(itM251)) {
            JsonObject jsonObjectM245 = m245((JsonElement) C0048.m7949(itM251));
            C0004.m1532(arrayList, new m(m248(m246(jsonObjectM245, C0029.m5256(m247(), 104, 6, 1143))), m248(m246(jsonObjectM245, C0003.m1398(m247(), 110, 8, 2180))), m248(m246(jsonObjectM245, C0037.m6307(m247(), 118, 7, 2452))), m248(m246(jsonObjectM245, C0021.m4340(m247(), 125, 11, 2820)))));
        }
        return C0020.m4216(C0011.m2808(C0038.m6456(str2)), C0047.m7818(1, str2), C0011.m2808(20), C0054.m8556(str2, 1, 20), arrayList);
    }

    public String detailContent(List<String> list) {
        String strM7651 = C0045.m7651(C0001.m1212(new JSONObject(C0008.m2029(C0003.m1396(C0028.m5188(new StringBuilder(), C0035.m6145(this), C0058.m9106(m247(), 136, 34, 2349)), C0020.m4251(C0055.m8814(m247(), 170, 6, 1427), (String) C0048.m7915(list, 0)), C0020.m4209(this)))), C0000.m1077(m247(), 176, 4, 1875)), C0009.m2083(C0009.m2096(this)), C0009.m2083(C0057.m8997(this)));
        C0012.m2969(C0035.m6087(), strM7651);
        JsonObject jsonObject = (JsonObject) m249(new Gson(), strM7651, JsonObject.class);
        JsonObject jsonObjectM244 = m244(jsonObject, C0045.m7657(m247(), 180, 3, 1414));
        String strM248 = m248(m246(jsonObjectM244, C0051.m8259(m247(), 183, 8, 2370)));
        StringBuilder sb = new StringBuilder();
        C0018.m3933(sb, C0036.m6189());
        C0018.m3933(sb, m248(m246(jsonObjectM244, C0052.m8337(m247(), 191, 11, 3113))));
        String strM7763 = C0047.m7763(sb);
        String strM2482 = m248(m246(jsonObjectM244, C0034.m6001(m247(), 202, 9, 2165)));
        String strM2483 = m248(m246(jsonObjectM244, C0000.m1077(m247(), 211, 12, 2558)));
        StringBuilder sb2 = new StringBuilder();
        C0018.m3933(sb2, C0055.m8703());
        C0018.m3933(sb2, m248(m246(jsonObjectM244, C0006.m1774(m247(), 223, 11, 483))));
        String strM77632 = C0047.m7763(sb2);
        Iterator itM251 = m251(m250(jsonObject, C0058.m9106(m247(), 234, 13, 2112)));
        String strM1840 = C0007.m1840();
        String strM9804 = strM1840;
        while (C0012.m2962(itM251)) {
            JsonObject jsonObjectM245 = m245((JsonElement) C0048.m7949(itM251));
            JsonObject jsonObjectM2442 = m244(jsonObjectM245, C0003.m1398(m247(), 247, 11, 3210));
            StringBuilder sbM5621 = C0031.m5621(strM1840);
            C0018.m3933(sbM5621, C0016.m3579());
            C0018.m3933(sbM5621, m248(m246(jsonObjectM2442, C0003.m1398(m247(), 258, 4, 850))));
            String strM6188 = C0036.m6188(m247(), 262, 3, 1173);
            C0018.m3933(sbM5621, strM6188);
            strM1840 = C0047.m7763(sbM5621);
            Iterator itM2512 = m251(m250(jsonObjectM245, C0045.m7657(m247(), 265, 4, 2263)));
            while (C0012.m2962(itM2512)) {
                JsonObject jsonObjectM2452 = m245((JsonElement) C0048.m7949(itM2512));
                StringBuilder sbM56212 = C0031.m5621(strM9804);
                String strM1398 = C0003.m1398(m247(), 269, 4, 1096);
                C0018.m3933(sbM56212, m248(m246(jsonObjectM2452, strM1398)));
                C0018.m3933(sbM56212, C0061.m9361(m247(), 273, 1, 2845));
                C0018.m3933(sbM56212, m248(m246(jsonObjectM2442, C0057.m8978(m247(), 274, 5, 2671))));
                String strM3332 = C0014.m3332(m247(), 279, 1, 1296);
                C0018.m3933(sbM56212, strM3332);
                C0018.m3933(sbM56212, m248(m246(jsonObjectM2452, C0024.m4740(m247(), 280, 3, 2445))));
                C0018.m3933(sbM56212, strM3332);
                C0018.m3933(sbM56212, strM248);
                C0018.m3933(sbM56212, strM3332);
                C0018.m3933(sbM56212, m248(m246(jsonObjectM2452, strM1398)));
                C0018.m3933(sbM56212, strM3332);
                C0018.m3933(sbM56212, m248(m246(jsonObjectM2452, C0057.m8978(m247(), 283, 5, 1678))));
                C0018.m3933(sbM56212, C0021.m4340(m247(), 288, 1, 3010));
                strM9804 = C0047.m7763(sbM56212);
            }
            strM9804 = C0065.m9804(strM9804, strM6188);
        }
        m mVar = new m();
        C0011.m2828(mVar, (String) C0048.m7915(list, 0));
        C0005.m1628(mVar, strM248);
        C0058.m9152(mVar, strM2482);
        C0027.m5000(mVar, strM77632);
        C0058.m9159(mVar, strM2483);
        C0019.m4073(mVar, strM7763);
        C0054.m8596(mVar, C0000.m1096(strM1840));
        C0044.m7449(mVar, C0000.m1096(strM9804));
        return C0053.m8428(mVar);
    }

    public Map<String, String> getHeaders() {
        HashMap map = new HashMap();
        C0009.m2099();
        C0053.m8424(map, C0002.m1305(m247(), 289, 10, 2237), C0022.m4403(m247(), 299, 13, 1192));
        C0053.m8424(map, C0055.m8814(m247(), 312, 12, 2656), C0028.m5109(m247(), 324, 33, 1404));
        C0053.m8424(map, C0063.m9585(m247(), 357, 14, 1327), C0048.m7902(m247(), 371, 64, 1160));
        return map;
    }

    public String homeContent(boolean z) {
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArrayM1964 = C0008.m1964(new JSONObject(C0045.m7651(C0001.m1212(new JSONObject(C0008.m2029(C0003.m1396(C0028.m5188(new StringBuilder(), C0035.m6145(this), C0034.m6001(m247(), 435, 33, 1930)), C0020.m4209(this), C0020.m4209(this)))), C0058.m9106(m247(), 468, 4, 2023)), C0009.m2083(C0009.m2096(this)), C0009.m2083(C0057.m8997(this)))), C0040.m6584(m247(), 472, 9, 1705));
        for (int i = 0; i < C0053.m8396(jSONArrayM1964); i++) {
            C0004.m1532(arrayList, new b(C0001.m1212(C0018.m3923(jSONArrayM1964, i), C0004.m1549(m247(), 481, 7, 3007)), C0001.m1212(C0018.m3923(jSONArrayM1964, i), C0025.m4795(m247(), 488, 9, 1128)), null));
        }
        return C0003.m1448(C0027.m5010(this), null, arrayList);
    }

    public void init(Context context, String str) {
        String strM2083 = str;
        C0051.m8194(C0035.m6110());
        if (strM2083 != null) {
            String strM4795 = C0025.m4795(m247(), 497, 4, 717);
            if (!C0058.m9127(strM2083, strM4795)) {
                strM2083 = C0009.m2083(strM2083);
            }
            JSONObject jSONObject = new JSONObject(strM2083);
            String strM1212 = C0001.m1212(jSONObject, strM4795);
            this.a = strM1212;
            if (C0060.m9349(strM1212, C0004.m1549(m247(), 501, 4, 837))) {
                this.a = C0032.m5769(C0035.m6145(this), null);
            }
            String strM9389 = C0062.m9389(m247(), 505, 3, 2844);
            if (C0063.m9499(jSONObject, strM9389)) {
                this.c = C0001.m1212(jSONObject, strM9389);
                this.d = C0001.m1212(jSONObject, C0041.m6779(m247(), 508, 2, 1436));
            }
            String strM5708 = C0032.m5708(m247(), 510, 6, 394);
            if (C0063.m9499(jSONObject, strM5708)) {
                this.c = C0050.m8153(C0050.m8115(C0001.m1212(jSONObject, strM5708)));
                this.d = C0050.m8153(C0050.m8115(C0001.m1212(jSONObject, C0004.m1549(m247(), 516, 5, 1963))));
            }
        }
    }

    public String playerContent(String str, String str2, List<String> list) {
        d dVarM1396;
        C0036.m6219();
        String[] strArrM4752 = C0024.m4752(str2, C0022.m4403(m247(), 521, 1, 1741));
        String str3 = (strArrM4752.length <= 0 || C0057.m8953(strArrM4752[0])) ? null : strArrM4752[0];
        String str4 = (strArrM4752.length <= 1 || C0057.m8953(strArrM4752[1])) ? null : strArrM4752[1];
        String str5 = (strArrM4752.length <= 2 || C0057.m8953(strArrM4752[2])) ? null : strArrM4752[2];
        String str6 = (strArrM4752.length <= 3 || C0057.m8953(strArrM4752[3])) ? null : strArrM4752[3];
        String str7 = (strArrM4752.length <= 4 || C0057.m8953(strArrM4752[4])) ? null : strArrM4752[4];
        String strM2827 = C0011.m2827(str4, str5, str6);
        String strM5256 = C0029.m5256(m247(), 522, 3, 3198);
        if (str3 != null) {
            if (C0058.m9127(str3, C0040.m6584(m247(), 525, 5, 2570))) {
                PrintStream printStreamM6087 = C0035.m6087();
                StringBuilder sb = new StringBuilder();
                C0018.m3933(sb, str3);
                C0018.m3933(sb, str4);
                C0012.m2969(printStreamM6087, C0047.m7763(sb));
                g gVar = new g();
                StringBuilder sb2 = new StringBuilder();
                C0018.m3933(sb2, str3);
                C0018.m3933(sb2, str4);
                C0017.m3667(gVar, C0026.m4952(C0047.m7763(sb2)));
                C0006.m1720(gVar, 1);
                C0002.m1282(gVar, strM2827);
                return C0033.m5828(gVar);
            }
            if (C0058.m9127(str3, C0003.m1398(m247(), 530, 4, 1232))) {
                PrintStream printStreamM60872 = C0035.m6087();
                StringBuilder sb3 = new StringBuilder();
                C0018.m3933(sb3, str3);
                C0018.m3933(sb3, str4);
                C0012.m2969(printStreamM60872, C0026.m4952(C0047.m7763(sb3)));
                StringBuilder sb4 = new StringBuilder();
                C0018.m3933(sb4, str3);
                C0018.m3933(sb4, str4);
                JSONObject jSONObject = new JSONObject(C0032.m5769(C0026.m4952(C0047.m7763(sb4)), null));
                if (!C0063.m9499(jSONObject, strM5256)) {
                    g gVar2 = new g();
                    C0017.m3667(gVar2, str4);
                    C0064.m9646(gVar2);
                    C0002.m1282(gVar2, strM2827);
                    return C0033.m5828(gVar2);
                }
                String strM1212 = C0001.m1212(jSONObject, strM5256);
                g gVar3 = new g();
                C0017.m3667(gVar3, strM1212);
                C0006.m1720(gVar3, 0);
                C0002.m1282(gVar3, strM2827);
                return C0033.m5828(gVar3);
            }
        }
        if (str3 == null) {
            g gVar4 = new g();
            C0017.m3667(gVar4, str4);
            C0002.m1282(gVar4, strM2827);
            return C0033.m5828(gVar4);
        }
        String strM5188 = C0028.m5188(new StringBuilder(), C0035.m6145(this), C0055.m8814(m247(), 534, 33, 2669));
        String strM5062 = C0027.m5062(m247(), 567, 9, 3104);
        if (str7 != null) {
            HashMap mapM4251 = C0020.m4251(strM5062, str3);
            C0053.m8424(mapM4251, strM5256, C0027.m4992(str4, C0009.m2083(C0009.m2096(this)), C0009.m2083(C0057.m8997(this))));
            C0053.m8424(mapM4251, C0053.m8477(m247(), 576, 5, 1077), str7);
            dVarM1396 = C0003.m1396(strM5188, mapM4251, C0020.m4209(this));
        } else {
            HashMap mapM42512 = C0020.m4251(strM5062, str3);
            C0053.m8424(mapM42512, strM5256, C0027.m4992(str4, C0009.m2083(C0009.m2096(this)), C0009.m2083(C0057.m8997(this))));
            dVarM1396 = C0003.m1396(strM5188, mapM42512, C0020.m4209(this));
        }
        String strM7651 = C0045.m7651(C0001.m1212(new JSONObject(C0008.m2029(dVarM1396)), C0043.m7290(m247(), 581, 4, 3020)), C0009.m2083(C0009.m2096(this)), C0009.m2083(C0057.m8997(this)));
        String strM4740 = C0024.m4740(m247(), 585, 1, 1057);
        String strM1840 = C0007.m1840();
        String strM4800 = C0025.m4800(C0025.m4800(strM7651, strM4740, strM1840), C0041.m6779(m247(), 586, 2, 3161), strM1840);
        Matcher matcherM6026 = C0034.m6026(C0005.m1602(C0017.m3646(m247(), 588, 15, 2882)), strM4800);
        if (C0003.m1405(matcherM6026)) {
            String strM4306 = C0021.m4306(matcherM6026, 1);
            g gVar5 = new g();
            C0017.m3667(gVar5, strM4306);
            C0006.m1720(gVar5, 0);
            C0002.m1282(gVar5, strM2827);
            return C0033.m5828(gVar5);
        }
        Matcher matcherM60262 = C0034.m6026(C0005.m1602(C0020.m4199(m247(), 603, 16, 2801)), strM4800);
        if (C0003.m1405(matcherM60262)) {
            String strM43062 = C0021.m4306(matcherM60262, 1);
            g gVar6 = new g();
            C0017.m3667(gVar6, strM43062);
            C0006.m1720(gVar6, 0);
            C0002.m1282(gVar6, strM2827);
            return C0033.m5828(gVar6);
        }
        g gVar7 = new g();
        C0017.m3667(gVar7, str4);
        C0006.m1720(gVar7, 0);
        C0064.m9646(gVar7);
        C0002.m1282(gVar7, strM2827);
        return C0033.m5828(gVar7);
    }

    public String searchContent(String str, boolean z) {
        ArrayList arrayList = new ArrayList();
        Iterator itM251 = m251(m250((JsonObject) C0033.m5856(C0045.m7651(C0001.m1212(new JSONObject(C0008.m2029(C0003.m1396(C0028.m5188(new StringBuilder(), C0035.m6145(this), C0011.m2805(m247(), 619, 35, 2429)), C0019.m4127(C0020.m4199(m247(), 654, 8, 2149), str, C0021.m4340(m247(), 662, 11, 2601), C0055.m8814(m247(), 673, 1, 2562)), C0020.m4209(this)))), C0014.m3332(m247(), 674, 4, 1082)), C0009.m2083(C0009.m2096(this)), C0009.m2083(C0057.m8997(this))), JsonObject.class), C0035.m6131(m247(), 678, 11, 3180)));
        while (C0012.m2962(itM251)) {
            JsonObject jsonObjectM245 = m245((JsonElement) C0048.m7949(itM251));
            C0004.m1532(arrayList, new m(m248(m246(jsonObjectM245, C0005.m1645(m247(), 689, 6, 2021))), m248(m246(jsonObjectM245, C0014.m3332(m247(), 695, 8, 2688))), m248(m246(jsonObjectM245, C0017.m3646(m247(), 703, 7, 2370))), m248(m246(jsonObjectM245, C0007.m1842(m247(), 710, 11, 2034)))));
        }
        return C0047.m7783(arrayList);
    }
}