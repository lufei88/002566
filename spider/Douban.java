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
import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.Z.C0040;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.a0.C0042;
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
import com.github.catvod.spider.merge.g0.AbstractC0308c;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.merge.z.C0065;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
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
import com.google.gson.JsonElement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class Douban extends Spider {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f18short = {1273, 1246, 1218, 1221, 849, 837, 856, 851, 856, 793, 851, 856, 834, 853, 854, 857, 793, 852, 856, 858, 2490, 2454, 2455, 2455, 2460, 2458, 2445, 2448, 2454, 2455, 2764, 2786, 2786, 2807, 2730, 2758, 2795, 2798, 2801, 2786, 1295, 1336, 1339, 1336, 1327, 1336, 1327, 1037, 1041, 1041, 1045, 1046, 1119, 1098, 1098, 1046, 1024, 1047, 1043, 1036, 1030, 1024, 1042, 1024, 1030, 1037, 1028, 1041, 1099, 1030, 1034, 1032, 1098, 1042, 1053, 1111, 1027, 1116, 1031, 1109, 1107, 1030, 1108, 1025, 1024, 1108, 1030, 1030, 1027, 1030, 1028, 1098, 1117, 1105, 1098, 1045, 1028, 1026, 1024, 1096, 1027, 1047, 1028, 1032, 1024, 1099, 1037, 1041, 1032, 1033, 1264, 1238, 1216, 1239, 1160, 1252, 1218, 1216, 1227, 1233, 1457, 1427, 1414, 1429, 1424, 1424, 1437, 1491, 1481, 1490, 1484, 1500, 1492, 1451, 1429, 1426, 1432, 1427, 1419, 1423, 1500, 1458, 1448, 1500, 1482, 1490, 1485, 1479, 1500, 1451, 1459, 1451, 1482, 1480, 1493, 1500, 1469, 1420, 1420, 1424, 1433, 1451, 1433, 1438, 1463, 1429, 1416, 1491, 1481, 1487, 1483, 1490, 1487, 1482, 1500, 1492, 1463, 1460, 1448, 1457, 1456, 1488, 1500, 1424, 1429, 1431, 1433, 1500, 1467, 1433, 1439, 1431, 1427, 1493, 1500, 1471, 1428, 1422, 1427, 1425, 1433, 1491, 1481, 1487, 1490, 1484, 1490, 1486, 1483, 1476, 1481, 1490, 1485, 1480, 1487, 1500, 1455, 1437, 1434, 1437, 1422, 1429, 1491, 1481, 1487, 1483, 1490, 1487, 1482, 1500, 1457, 1429, 1439, 1422, 1427, 1457, 1433, 1423, 1423, 1433, 1426, 1435, 1433, 1422, 1491, 1483, 1490, 1484, 1490, 1477, 1490, 1481, 1484, 1485, 1500, 1458, 1433, 1416, 1448, 1413, 1420, 1433, 1491, 1451, 1461, 1466, 1461, 1500, 1457, 1429, 1426, 1429, 1452, 1422, 1427, 1435, 1422, 1437, 1425, 1465, 1426, 1418, 1491, 1451, 1429, 1426, 1432, 1427, 1419, 1423, 1500, 1451, 1429, 1426, 1432, 1427, 1419, 1423, 1451, 1433, 1439, 1428, 1437, 1416, 878, 880, 870, 866, 881, 864, 875, 825, 3013, 3016, 2027, 2038, 2027, 2035, 2042, 3168, 3186, 3141, 3142, 3141, 3154, 3141, 3154, 3101, 3144, 3156, 3156, 3152, 3155, 3098, 3087, 3087, 3137, 3152, 3145, 3086, 3140, 3151, 3157, 3138, 3137, 3150, 3086, 3139, 3151, 3149, 3087, 3168, 3189, 3155, 3141, 3154, 3085, 3169, 3143, 3141, 3150, 3156, 3101, 3181, 3151, 3162, 3145, 3148, 3148, 3137, 3087, 3093, 3086, 3088, 3072, 3080, 3191, 3145, 3150, 3140, 3151, 3159, 3155, 3072, 3182, 3188, 3072, 3089, 3088, 3086, 3088, 3099, 3072, 3191, 3145, 3150, 3094, 3092, 3099, 3072, 3160, 3094, 3092, 3081, 3072, 3169, 3152, 3152, 3148, 3141, 3191, 3141, 3138, 3179, 3145, 3156, 3087, 3093, 3091, 3095, 3086, 3091, 3094, 3072, 3080, 3179, 3176, 3188, 3181, 3180, 3084, 3072, 3148, 3145, 3147, 3141, 3072, 3175, 3141, 3139, 3147, 3151, 3081, 3072, 3171, 3144, 3154, 3151, 3149, 3141, 3087, 3089, 3090, 3090, 3086, 3088, 3086, 3088, 3086, 3088, 3072, 3187, 3137, 3142, 3137, 3154, 3145, 3087, 3093, 3091, 3095, 3086, 3091, 3094, 444, 421, 431, 1823, 1822, 1795, 1820, 1808, 1821, -32489, 22741, -2615, 1105, 1090, 1111, 1098, 1101, 1092, 3152, 3143, 3146, 3155, 3139, 710, 733, 730, 706, 746, 733, 730, 705, 2012, 2014, 2039, 1984, 1991, 2012, 1517, 1521, 1516, 1514, 2238, 1168, 1515, 1465, 1452, 1450, 1470, 1520, 2697, 2780, 2779, 2766, 2781, 2779, 2706, 826, 823, 830, 811, 2151, 2145, 2166, 2174, 2161, 2167, 2144, 2123, 2167, 2171, 2168, 2168, 2161, 2167, 2144, 2173, 2171, 2170, 2123, 2173, 2144, 2161, 2169, 2151, 2687, 2617, 2596, 2613, 2621, 2595, 2671, 2609, 2592, 2617, 2619, 2613, 2601, 2669, 2656, 2609, 2611, 2660, 2660, 2609, 2613, 2656, 2657, 2662, 2660, 2665, 2656, 2612, 2610, 2658, 2658, 2656, 2660, 2611, 2613, 2656, 2609, 2656, 2660, 2658, 2612, 2610, 2658, 2665, 2657, 2662, 2678, 2595, 2596, 2609, 2594, 2596, 2669, 496, 492, 492, 488, 491, 418, 439, 439, 510, 490, 503, 508, 503, 438, 508, 503, 493, 506, 505, 502, 438, 507, 503, 501, 439, 505, 488, 497, 439, 494, 426, 439, 491, 493, 506, 498, 509, 507, 492, 455, 507, 503, 500, 500, 509, 507, 492, 497, 503, 502, 439, 25918, 24567, 2320, 2389, 2393, 2371, 2392, 2370, 2315, 2308, 2310, 476, 449, 464, 472, 454, 1062, 1077, 1082, 1087, 1035, 1080, 1085, 1063, 1056, 1035, 1056, 1058, 1762, 1760, 509, 506, 481, 458, 498, 500, 508, 500, 1333, 1318, 1321, 1324, 1304, 1323, 1326, 1332, 1331, 1304, 1322, 1320, 1329, 1326, 1314, 699, 679, 679, 675, 672, 745, 764, 764, 693, 673, 700, 695, 700, 765, 695, 700, 678, 689, 690, 701, 765, 688, 700, 702, 764, 690, 675, 698, 764, 677, 737, 764, 702, 700, 677, 698, 694, 764, 673, 694, 688, 700, 702, 702, 694, 701, 695, 748, 690, 675, 698, 696, 694, 682, 750, 739, 690, 688, 743, 743, 690, 694, 739, 738, 741, 743, 746, 739, 695, 689, 737, 737, 739, 743, 688, 694, 739, 690, 739, 743, 737, 695, 689, 737, 746, 738, 741, 757, 672, 700, 673, 679, 750, 2700, 2702, 2727, 2698, 2717, 2713, 2708, 2727, 2700, 2705, 2709, 2717, 2727, 2704, 2711, 2700, 2717, 2699, 2700, 2305, 2333, 2333, 2329, 2330, 2387, 2374, 2374, 2319, 2331, 2310, 2317, 2310, 2375, 2317, 2310, 2332, 2315, 2312, 2311, 2375, 2314, 2310, 2308, 2374, 2312, 2329, 2304, 2374, 2335, 2395, 2374, 2333, 2335, 2374, 2331, 2316, 2314, 2310, 2308, 2308, 2316, 2311, 2317, 2390, 2312, 2329, 2304, 2306, 2316, 2320, 2388, 2393, 2312, 2314, 2397, 2397, 2312, 2316, 2393, 2392, 2399, 2397, 2384, 2393, 2317, 2315, 2395, 2395, 2393, 2397, 2314, 2316, 2393, 2312, 2393, 2397, 2395, 2317, 2315, 2395, 2384, 2392, 2399, 2383, 2330, 2310, 2331, 2333, 2388, 1810, 1797, 1795, 1807, 1805, 1805, 1797, 1806, 1796, 571, 552, 575, 571, 22192, -26832, 2572, 2635, 2648, 2639, 2635, 2583, 1387, 1399, 1399, 1395, 1392, 1337, 1324, 1324, 1381, 1393, 1388, 1383, 1388, 1325, 1383, 1388, 1398, 1377, 1378, 1389, 1325, 1376, 1388, 1390, 1324, 1378, 1395, 1386, 1324, 1397, 1329, 1324, 1390, 1388, 1397, 1386, 1382, 1324, 1387, 1388, 1399, 1372, 1380, 1378, 1386, 1378, 1340, 1378, 1395, 1386, 1384, 1382, 1402, 1342, 1331, 1378, 1376, 1335, 1335, 1378, 1382, 1331, 
    1330, 1333, 1335, 1338, 1331, 1383, 1377, 1329, 1329, 1331, 1335, 1376, 1382, 1331, 1378, 1331, 1335, 1329, 1383, 1377, 1329, 1338, 1330, 1333, 1317, 1392, 1388, 1393, 1399, 1342, 1939, 1937, 1928, 1943, 1947, 1953, 1932, 1947, 1951, 1938, 1953, 1930, 1943, 1939, 1947, 1953, 1942, 1937, 1930, 1947, 1933, 1930, 1771, 1772, 1783, 1756, 1764, 1762, 1770, 1762, 1765, 1767, 1742, 1785, 1790, 1765, 2809, 2786, 2789, 2813, 2773, 2786, 2789, 2814, 1797, 1799, 1822, 1793, 1805, 2718, 2716, 3100, 3087, 3072, 3077, 3121, 3074, 3079, 3101, 3098, 3121, 3075, 3073, 3096, 3079, 3083, 397, 414, 401, 404, 416, 403, 406, 396, 395, 416, 395, 393, 31958, -26157, 30990, 21322, 30150, 24966, 22348, -27667, 30364, 25308, 30861, -31733, 32308, 21616, 28762, -25848, 30310, -30059, 30728, -27814, 30479, 23883, 27558, 20847, 32765, -31986, 22703, 25428, 22941, 1962, 1974, 1974, 1970, 2040, 2029, 2029, 1955, 1970, 1963, 2028, 1958, 1965, 1975, 1952, 1955, 1964, 2028, 1953, 1965, 1967, 2029, 1955, 1970, 1963, 2029, 1972, 2032, 2029, 1969, 1975, 1952, 1960, 1959, 1953, 1974, 1949, 1953, 1965, 1966, 1966, 1959, 1953, 1974, 1963, 1965, 1964, 2029, 1969, 1975, 1952, 1960, 1959, 1953, 1974, 1949, 1968, 1959, 1955, 1966, 1949, 1974, 1963, 1967, 1959, 1949, 1962, 1965, 1974, 1959, 1969, 1974, 2029, 1963, 1974, 1959, 1967, 1969, 2045, 1955, 1970, 1963, 1961, 1959, 1979, 2047, 2034, 1955, 1953, 2038, 2038, 1955, 1959, 2034, 2035, 2036, 2038, 2043, 2034, 1958, 1952, 2032, 2032, 2034, 2038, 1953, 1959, 2034, 1955, 2034, 2038, 2032, 1958, 1952, 2032, 2043, 2035, 2036, 394, 396, 411, 403, 412, 410, 397, 422, 410, 406, 405, 405, 412, 410, 397, 400, 406, 407, 422, 400, 397, 412, 404, 394, 2152};
    public String a;

    public static HashMap a() {
        HashMap mapM4127 = C0019.m4127(C0058.m9106(m110(), 0, 4, 1201), C0050.m8131(m110(), 4, 16, 823), C0048.m7902(m110(), 20, 10, 2553), C0006.m1774(m110(), 30, 10, 2695));
        C0053.m8424(mapM4127, C0041.m6779(m110(), 40, 7, 1373), C0009.m2037(m110(), 47, 63, 1125));
        C0053.m8424(mapM4127, C0047.m7833(m110(), 110, 10, 1189), C0000.m1077(m110(), 120, 184, 1532));
        return mapM4127;
    }

    public static ArrayList b(JSONArray jSONArray) {
        String strM7763;
        String strM77632;
        String strM1840 = C0007.m1840();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < C0053.m8396(jSONArray); i++) {
            JSONObject jSONObjectM3923 = C0018.m3923(jSONArray, i);
            StringBuilder sb = new StringBuilder(C0031.m5565(m110(), 304, 8, 771));
            C0018.m3933(sb, C0051.m8200(jSONObjectM3923, C0055.m8814(m110(), 312, 2, 2988)));
            String strM77633 = C0047.m7763(sb);
            String strM8200 = C0051.m8200(jSONObjectM3923, C0046.m7718(m110(), 314, 5, 1951));
            String strM8337 = C0052.m8337(m110(), 319, 155, 3104);
            try {
                StringBuilder sb2 = new StringBuilder();
                C0018.m3933(sb2, C0051.m8200(C0003.m1370(jSONObjectM3923, C0029.m5256(m110(), 474, 3, 460)), C0039.m6551(m110(), 477, 6, 1905)));
                C0018.m3933(sb2, strM8337);
                strM7763 = C0047.m7763(sb2);
            } catch (Exception unused) {
                strM7763 = strM1840;
            }
            try {
                StringBuilder sb3 = new StringBuilder(C0020.m4199(m110(), 483, 3, 2771));
                C0018.m3933(sb3, C0051.m8200(C0003.m1370(jSONObjectM3923, C0040.m6584(m110(), 486, 6, 1059)), C0031.m5565(m110(), 492, 5, 3110)));
                strM77632 = C0047.m7763(sb3);
            } catch (Exception unused2) {
                strM77632 = strM1840;
            }
            C0004.m1532(arrayList, new m(strM77633, strM8200, strM7763, strM77632));
        }
        return arrayList;
    }

    /* renamed from: ۟۟ۢ۟ۢ, reason: not valid java name and contains not printable characters */
    public static String m108(Object obj, Object obj2, Object obj3) {
        if (C0058.m9131() <= 0) {
            return g.o((ArrayList) obj, (ArrayList) obj2, (JsonElement) obj3);
        }
        return null;
    }

    /* renamed from: ۠۟۠ۤ, reason: not valid java name and contains not printable characters */
    public static JsonElement m109(Object obj) {
        if (C0023.m4566() < 0) {
            return AbstractC0308c.g((String) obj);
        }
        return null;
    }

    /* renamed from: ۨۤ۟, reason: not valid java name and contains not printable characters */
    public static short[] m110() {
        if (C0007.m1886() > 0) {
            return f18short;
        }
        return null;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:42:0x0214. Please report as an issue. */
    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        String strM1840;
        String str3;
        String strM1398;
        StringBuilder sb;
        StringBuilder sb2;
        String strM7763;
        String strM1549;
        String str4;
        String strM7151 = C0042.m7151(m110(), 497, 8, 693);
        String strM7902 = C0048.m7902(m110(), 505, 6, 1960);
        String strM1842 = C0007.m1842(m110(), 511, 4, 1438);
        String strM5062 = C0065.m9715(map, strM1842) == null ? C0027.m5062(m110(), 515, 1, 2282) : (String) C0065.m9715(map, strM1842);
        try {
            StringBuilder sb3 = new StringBuilder();
            Iterator itM5199 = C0029.m5199(C0000.m1121(map));
            while (C0012.m2962(itM5199)) {
                String str5 = (String) C0048.m7949(itM5199);
                if (!C0007.m1815(str5, strM1842)) {
                    C0018.m3933(sb3, (String) C0065.m9715(map, str5));
                    C0018.m3933(sb3, C0048.m7902(m110(), 516, 1, 1212));
                }
            }
            strM1840 = C0033.m5862(C0047.m7763(sb3));
        } catch (Exception unused) {
            strM1840 = C0007.m1840();
        }
        String strM8909 = C0056.m8909(strM1840);
        int iM6456 = (C0038.m6456(str2) - 1) * 20;
        C0047.m7777(str);
        String strM2300 = C0010.m2300(m110(), 517, 6, 1485);
        String strM4403 = C0022.m4403(m110(), 523, 7, 2735);
        String strM3646 = C0017.m3646(m110(), 530, 4, 846);
        String strM13982 = C0003.m1398(m110(), 534, 24, 2068);
        String strM8007 = C0049.m8007(m110(), 558, 53, 2640);
        String strM8814 = C0055.m8814(m110(), 611, 51, 408);
        String strM80072 = C0049.m8007(m110(), 662, 2, 3234);
        String strM15492 = C0004.m1549(m110(), 664, 9, 2358);
        String strM7509 = C0044.m7509(m110(), 673, 5, 437);
        char c = 65535;
        switch (C0054.m8590(str)) {
            case -1224615358:
                str3 = strM13982;
                if (C0007.m1815(str, C0054.m8574(m110(), 700, 15, 1351))) {
                    c = 0;
                    break;
                }
                break;
            case -862076656:
                str3 = strM13982;
                if (C0007.m1815(str, strM7902)) {
                    c = 1;
                    break;
                }
                break;
            case -338503669:
                str3 = strM13982;
                if (C0007.m1815(str, strM7151)) {
                    c = 2;
                    break;
                }
                break;
            case -290777052:
                str3 = strM13982;
                if (C0007.m1815(str, C0011.m2805(m110(), 692, 8, 405))) {
                    c = 3;
                    break;
                }
                break;
            case 3714:
                str3 = strM13982;
                if (C0007.m1815(str, C0058.m9106(m110(), 690, 2, 1686))) {
                    c = 4;
                    break;
                }
                break;
            case 1599380656:
                str3 = strM13982;
                if (C0007.m1815(str, C0008.m1970(m110(), 678, 12, 1108))) {
                    c = 5;
                    break;
                }
                break;
            default:
                str3 = strM13982;
                break;
        }
        switch (c) {
            case 0:
                strM1398 = C0065.m9715(map, strM80072) == null ? C0003.m1398(m110(), 1030, 22, 2046) : (String) C0065.m9715(map, strM80072);
                sb = new StringBuilder(strM8814);
                C0018.m3933(sb, strM1398);
                C0018.m3933(sb, strM8007);
                C0036.m6177(sb, iM6456);
                C0018.m3933(sb, strM15492);
                strM7763 = C0047.m7763(sb);
                str4 = str3;
                break;
            case 1:
                if (C0065.m9715(map, strM3646) != null) {
                    strM7902 = (String) C0065.m9715(map, strM3646);
                }
                sb2 = new StringBuilder(strM8814);
                C0018.m3933(sb2, strM7902);
                C0018.m3933(sb2, strM8007);
                C0036.m6177(sb2, iM6456);
                C0018.m3933(sb2, strM15492);
                strM7763 = C0047.m7763(sb2);
                str4 = str3;
                break;
            case 2:
                if (C0065.m9715(map, strM3646) != null) {
                    strM7151 = (String) C0065.m9715(map, strM3646);
                }
                sb2 = new StringBuilder(strM8814);
                C0018.m3933(sb2, strM7151);
                C0018.m3933(sb2, strM8007);
                C0036.m6177(sb2, iM6456);
                C0018.m3933(sb2, strM15492);
                strM7763 = C0047.m7763(sb2);
                str4 = str3;
                break;
            case 3:
                String strM2973 = C0065.m9715(map, strM1842) == null ? C0012.m2973(m110(), 917, 9, 1888) : (String) C0065.m9715(map, strM1842);
                String strM71512 = C0042.m7151(m110(), 926, 4, 602);
                String strM44032 = C0065.m9715(map, strM71512) == null ? C0022.m4403(m110(), 930, 2, 2008) : (String) C0065.m9715(map, strM71512);
                StringBuilder sbM3016 = C0012.m3016(strM2973, C0063.m9585(m110(), 932, 6, 2602));
                C0018.m3933(sbM3016, C0056.m8909(strM44032));
                String strM77632 = C0047.m7763(sbM3016);
                StringBuilder sb4 = new StringBuilder(C0044.m7509(m110(), 938, 92, 1283));
                C0018.m3933(sb4, strM77632);
                C0018.m3933(sb4, strM4403);
                C0036.m6177(sb4, iM6456);
                C0018.m3933(sb4, strM15492);
                strM7763 = C0047.m7763(sb4);
                str4 = strM7509;
                break;
            case 4:
                strM1549 = C0004.m1549(m110(), 827, 90, 2409);
                StringBuilder sbM8368 = C0052.m8368(strM1549, strM5062, strM2300, strM8909, strM4403);
                C0036.m6177(sbM8368, iM6456);
                C0018.m3933(sbM8368, strM15492);
                strM7763 = C0047.m7763(sbM8368);
                str4 = strM7509;
                break;
            case 5:
                strM1398 = C0065.m9715(map, strM80072) == null ? C0014.m3332(m110(), 808, 19, 2808) : (String) C0065.m9715(map, strM80072);
                sb = new StringBuilder(strM8814);
                C0018.m3933(sb, strM1398);
                C0018.m3933(sb, strM8007);
                C0036.m6177(sb, iM6456);
                C0018.m3933(sb, strM15492);
                strM7763 = C0047.m7763(sb);
                str4 = str3;
                break;
            default:
                strM1549 = C0055.m8814(m110(), 715, 93, 723);
                StringBuilder sbM83682 = C0052.m8368(strM1549, strM5062, strM2300, strM8909, strM4403);
                C0036.m6177(sbM83682, iM6456);
                C0018.m3933(sbM83682, strM15492);
                strM7763 = C0047.m7763(sbM83682);
                str4 = strM7509;
                break;
        }
        ArrayList arrayListM4031 = C0019.m4031(C0021.m4333(new JSONObject(C0032.m5769(strM7763, C0025.m4794())), str4));
        int iM64562 = C0038.m6456(str2);
        g gVar = new g();
        C0045.m7632(gVar, arrayListM4031);
        C0049.m7974(gVar, iM64562, Integer.MAX_VALUE, 20, Integer.MAX_VALUE);
        return C0033.m5828(gVar);
    }

    public String homeContent(boolean z) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        List listM1203 = C0001.m1203(new String[]{C0007.m1842(m110(), 1052, 8, 1667), C0000.m1077(m110(), 1060, 6, 1681), C0021.m4340(m110(), 1066, 8, 2698), C0050.m8131(m110(), 1074, 5, 1896), C0039.m6551(m110(), 1079, 2, 2794), C0048.m7902(m110(), 1081, 15, 3182), C0006.m1774(m110(), 1096, 12, 511)});
        List listM12032 = C0001.m1203(new String[]{C0014.m3332(m110(), 1108, 4, 3131), C0000.m1077(m110(), 1112, 4, 1323), C0013.m3106(m110(), 1116, 4, 1649), C0050.m8131(m110(), 1120, 4, 2817), C0025.m4795(m110(), 1124, 4, 851), C0013.m3106(m110(), 1128, 4, 570), C0005.m1645(m110(), 1132, 5, 2760)});
        while (true) {
            if (i >= C0064.m9636(listM1203)) {
                break;
            }
            C0004.m1532(arrayList, new b((String) C0048.m7915(listM1203, i), (String) C0048.m7915(listM12032, i), null));
            i++;
        }
        return m108(arrayList, C0019.m4031(C0008.m1964(new JSONObject(C0032.m5769(C0029.m5256(m110(), 1137, 118, 1986), C0025.m4794())), C0052.m8337(m110(), 1255, 24, 505))), z ? m109(C0032.m5769(C0010.m2385(this), null)) : null);
    }

    public void init(Context context, String str) {
        C0051.m8194(C0035.m6110());
        C0035.m6110().c = true;
        this.a = str;
    }

    public String searchContent(String str, boolean z) {
        return C0044.m7439(this, str, true, C0023.m4536(m110(), 1279, 1, 2137));
    }

    public String searchContent(String str, boolean z, String str2) {
        C0035.m6110().c = true;
        return C0007.m1840();
    }
}