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
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.r0.C0059;
import com.github.catvod.spider.merge.r0.C0060;
import com.github.catvod.spider.merge.v.C0062;
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
import com.github.catvod.spider.p000mergexbpq.x.C0015;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class HB360 extends Spider {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f23short = {3052, 3056, 3056, 3060, 3063, 3006, 2987, 2987, 3045, 3060, 3053, 2986, 3059, 3041, 3046, 2986, 2999, 2994, 2996, 3055, 3045, 3050, 2986, 3047, 3051, 3049, 31044, -30188, 24734, -31215, 23540, -32331, 25194, 650, 684, 698, 685, 754, 670, 696, 698, 689, 683, 1952, 1956, 1959, 1979, 1979, 1983, 2018, 1952, 1956, 1960, 1952, 2016, 1957, 1962, 1966, 1980, 1952, 1953, 1955, 1973, 1974, 1236, 1216, 1217, 1245, 1242, 1223, 1244, 1231, 1236, 1217, 1244, 1242, 1243, 1938, 1934, 1981, 1951, 1941, 1968, 1940, 1950, 1976, 1950, 1981, 1982, 1954, 1933, 1982, 1990, 1977, 1950, 1982, 1924, 1982, 1945, 1957, 1986, 1940, 1972, 1982, 1985, 1982, 1948, 1927, 1967, 1953, 1972, 1981, 1998, 2009, 1938, 1934, 1981, 1947, 1938, 1983, 1974, 1950, 1976, 1949, 1970, 1988, 1978, 1933, 1948, 1934, 1977, 1933, 1974, 1989, 1978, 1955, 1948, 1924, 1982, 1947, 1953, 1933, 1965, 1967, 1981, 1981, 1965, 1972, 1982, 1985, 1977, 1955, 1974, 1986, 1978, 1971, 1936, 1988, 1977, 1971, 1970, 1924, 1982, 1945, 1981, 1947, 1965, 1989, 1947, 1933, 1939, 1968, 1953, 1934, 1967, 1988, 1957, 1927, 1941, 1952, 1954, 1950, 1976, 1950, 1982, 1934, 1978, 1971, 1982, 1991, 1979, 1955, 1974, 1988, 1979, 1955, 1974, 1986, 1982, 1971, 1982, 1920, 1976, 1949, 1954, 1920, 1976, 1949, 1982, 1935, 1982, 1950, 1920, 1950, 1942, 1967, 1977, 1937, 1941, 1952, 1998, 1950, 1942, 1952, 1935, 1947, 1967, 1989, 1981, 1927, 1941, 1946, 1958, 1950, 1976, 1946, 1965, 1951, 1941, 1983, 1977, 1947, 1979, 1972, 1981, 1948, 1982, 1949, 1944, 1950, 1978, 1949, 1958, 1934, 1977, 1955, 1974, 1989, 1976, 1971, 1977, 1951, 1978, 1989, 1981, 1948, 1966, 1949, 1977, 1946, 1978, 1955, 1970, 1987, 1965, 1968, 1965, 1946, 1978, 1949, 1953, 1950, 1966, 1955, 1957, 1950, 1978, 1952, 1977, 1950, 1966, 1955, 1969, 1951, 1982, 1945, 1991, 2009, 1944, 1924, 1983, 1933, 1984, 1956, 1976, 1957, 1977, 1984, 1959, 1983, 1981, 1985, 1922, 1948, 1946, 1991, 1949, 1941, 1990, 1926, 1970, 1983, 1936, 1981, 1938, 1946, 1998, 1979, 1965, 1945, 1984, 1925, 1937, 1985, 1935, 1990, 1984, 1990, 1972, 1967, 1999, 1510, 1471, 1528, 1510, 1455, 1440, 1445, 1469, 1452, 1467, 1510, 1445, 1440, 1466, 1469, 1526, 1450, 1448, 1469, 1440, 1453, 1524, 2270, 2186, 2201, 2198, 2195, 2245, 2186, 2201, 2198, 2195, 2196, 2201, 2188, 2205, 2187, 2188, 2270, 2203, 2201, 2188, 2245, 2270, 2177, 2205, 2201, 2186, 2245, 2270, 2201, 2186, 2205, 2201, 2245, 2270, 2187, 2193, 2178, 2205, 2245, 2251, 2253, 2270, 2184, 2201, 2207, 2205, 2198, 2199, 2245, 493, 424, 426, 423, 423, 425, 426, 424, 416, 502, 2413, 2408, 2429, 2408, 777, 779, 786, 781, 769, 791, 1148, 1136, 1129, 1146, 1133, 2889, 2901, 2901, 2897, 1190, 1210, 1210, 1214, 1213, 1268, 3131, 3134, 3113, 3119, 3114, 3135, 3118, 2641, 2628, 2626, 431, 426, 435, 436, 444, 437, 25003, 25327, -31060, 2032, 825, 820, 2260, 2249, 2260, 2252, 2245, 2548, 2545, 2551, 2551, 2035, 1931, 1610, 1555, 1620, 1610, 1537, 1536, 1553, 1540, 1548, 1545, 1626, 1542, 1540, 1553, 1624, 2344, 2407, 2410, 2355, 1657, 1580, 1590, 1579, 1594, 1634, 1848, 1853, 1832, 1853, 2690, 2719, 2690, 2714, 2707, 2633, 2645, 2648, 2624, 2645, 2640, 2647, 2642, 2662, 2634, 2640, 2637, 2652, 2634, 1356, 1356, 426, 430, 420, 428, 1136, 1128, 1144, 1128, 1787, 1773, 1783, 1769, 1783, 3050, 3041, 3044, 3041, 3050, 3041, 3044, 3041, 3001, 742, 747, 753, 755, 2642, 2655, 2655, 2630, 2627, 2650, 2653, 2645, 2652, 2658, 2658, 2658, 1691, 3121, 3172, 3171, 3190, 3173, 3171, 3114, 736, 675, 680, 674, 763, 2892, 2881, 2881, 2888, 2909, 2884, 2889, 2888, 2905, 2892, 2884, 2881, 324, 2580, 2579, 2573, 2659, 2687, 2674, 2666, 2687, 2682, 2685, 2680, 2636, 2685, 2662, 2686, 682, 683, 680, 687, 699, 674, 698, 683, 702, 679, 701, 673, 682, 683, 1534, 1515, 1532, 1511, 1505, 1514, 1962, 1084, 1075, 1087, 1079, 2018, 2046, 2035, 2027, 2046, 2043, 2044, 2041, 2017, 2038, 2039, 2022, 2035, 2043, 2046, 463, 459, 479, 466, 471, 458, 455, 817, 816, 819, 820, 800, 825, 801, 778, 800, 807, 825, 2701, 2698, 2698, 2698, 2160, 2173, 2719, 2718, 2696, 2712, 2697, 2706, 2699, 2703, 2706, 2708, 2709, 2172, 2161, 2154, 2173, 2171, 2156, 2167, 2154, 764, 766, 745, 754, 751, 1058, 1061, 1071, 1058, 1070, 1079, 1060, 1075, 3156, 3153, 3144, 3151, 3143, 3150, 24620, 25448, -30933, 2538, 2543, 2552, 2558, 2555, 2542, 2559, 1939, 681, 2697, 507, 29541, 22817, 31074, -31343, 24112, 23500, 26191, 32094, -32296, 2401, 2401, 2401, 2950, 2970, 2970, 2974, 2973, 3028, 3009, 3009, 2968, 3008, 2967, 2945, 2971, 2949, 2971, 3008, 2957, 2945, 2947, 3009, 2968, 2951, 2954, 2955, 2945, 3025, 2968, 2951, 2954, 3027, 1364, 3142, 3162, 3162, 3166, 3165, 3092, 3073, 3073, 3160, 3072, 3159, 3137, 3163, 3141, 3163, 3072, 3149, 3137, 3139, 3073, 3160, 3185, 3165, 3142, 3137, 3161, 3073, 3143, 3146, 3185, 1469, 1502, 1303, 1288, 22373, -28086, 29612, 21677, 24209, 25351, 1298, 1288, 1211, 1211, 1196, 1198, 1270, 1211, 1207, 1205, 2905, 2885, 2885, 2881, 23619, -29205, -29736, 26027, 24619, 20644, 338, 927, 899, 899, 903, 900, 973, 984, 984, 918, 903, 926, 985, 900, 920, 985, 964, 961, 967, 924, 918, 921, 985, 916, 920, 922, 984, 926, 921, 915, 914, 911, 968, 913, 920, 901, 916, 914, 936, 897, 970, 966, 977, 924, 896, 970, 2682, 2618, 2606, 2611, 2609, 2657, 2682, 2604, 2621, 2619, 2617, 2610, 2611, 2657, 1620, 1540, 1581, 1555, 1538, 1615, 1603, 1620, 1542, 1555, 1552, 1615, 1555, 1566, 1566, 909, 904, 925, 904, 2280, 2283, 2282, 2275, 2240, 2277, 2288, 2277, 1009, 1004, 1012, 1008, 1095, 1090, 1092, 1092, 3299, 3297, 3316, 3295, 3305, 3300, 1069, 1418, 1409, 1456, 1414, 1419, 2670, 2675, 2670, 2678, 2687, 2638, 2658, 2670, 2148, 2152, 2161, 2146, 2165, 2370, 2375, 2369};
    public final String a = C0003.m1398(m142(), 0, 26, 2948);
    public final String b = C0057.m8978(m142(), 26, 7, 2043);
    public String[] c = null;

    public static HashMap a() {
        return C0019.m4127(C0000.m1077(m142(), 33, 10, 735), C0029.m5256(m142(), 43, 21, 1999), C0027.m5062(m142(), 64, 13, 1205), C0020.m4199(m142(), 77, 264, 2039));
    }

    public static boolean containsString(JsonArray jsonArray, String str) {
        Iterator itM144 = m144(jsonArray);
        while (C0012.m2962(itM144)) {
            JsonElement jsonElement = (JsonElement) C0048.m7949(itM144);
            if (m135(jsonElement) && m136(m138(jsonElement)) && C0007.m1815(m140(jsonElement), str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: ۟۟ۡ۟ۥ, reason: not valid java name and contains not printable characters */
    public static boolean m134(Object obj, Object obj2) {
        if (C0000.m1116() <= 0) {
            return ((JsonObject) obj).has((String) obj2);
        }
        return false;
    }

    /* renamed from: ۣ۟۠ۢ, reason: not valid java name and contains not printable characters */
    public static boolean m135(Object obj) {
        if (C0055.m8740() >= 0) {
            return ((JsonElement) obj).isJsonPrimitive();
        }
        return false;
    }

    /* renamed from: ۟ۢۨۥۧ, reason: not valid java name and contains not printable characters */
    public static boolean m136(Object obj) {
        if (C0050.m8121() < 0) {
            return ((JsonPrimitive) obj).isString();
        }
        return false;
    }

    /* renamed from: ۣ۟ۤ۠ۧ, reason: not valid java name and contains not printable characters */
    public static String m137(Object obj) {
        if (C0037.m6350() < 0) {
            return ((JsonPrimitive) obj).getAsString();
        }
        return null;
    }

    /* renamed from: ۣ۟ۧۤۧ, reason: not valid java name and contains not printable characters */
    public static JsonPrimitive m138(Object obj) {
        if (C0037.m6350() < 0) {
            return ((JsonElement) obj).getAsJsonPrimitive();
        }
        return null;
    }

    /* renamed from: ۣ۟ۤۨۦ, reason: not valid java name and contains not printable characters */
    public static JsonArray m139(Object obj, Object obj2) {
        if (C0001.m1164() < 0) {
            return ((JsonObject) obj).getAsJsonArray((String) obj2);
        }
        return null;
    }

    /* renamed from: ۟ۦۤ۟ۢ, reason: not valid java name and contains not printable characters */
    public static String m140(Object obj) {
        if (C0046.m7701() >= 0) {
            return ((JsonElement) obj).getAsString();
        }
        return null;
    }

    /* renamed from: ۣ۠ۤ۠, reason: not valid java name and contains not printable characters */
    public static String m141(Object obj) {
        if (C0031.m5628() > 0) {
            return ((JsonElement) obj).toString();
        }
        return null;
    }

    /* renamed from: ۠ۥۦ۟, reason: not valid java name and contains not printable characters */
    public static short[] m142() {
        if (C0036.m6252() > 0) {
            return f23short;
        }
        return null;
    }

    /* renamed from: ۣۨۤۡ, reason: not valid java name and contains not printable characters */
    public static boolean m143(Object obj, Object obj2) {
        if (C0059.m9257() <= 0) {
            return containsString((JsonArray) obj, (String) obj2);
        }
        return false;
    }

    /* renamed from: ۥۡ۟, reason: contains not printable characters */
    public static Iterator m144(Object obj) {
        if (C0045.m7538() < 0) {
            return ((JsonArray) obj).iterator();
        }
        return null;
    }

    /* renamed from: ۧۢۢ۟, reason: not valid java name and contains not printable characters */
    public static JsonObject m145(Object obj, Object obj2) {
        if (C0006.m1726() < 0) {
            return ((JsonObject) obj).getAsJsonObject((String) obj2);
        }
        return null;
    }

    /* renamed from: ۧۤۨۧ, reason: not valid java name and contains not printable characters */
    public static JsonPrimitive m146(Object obj, Object obj2) {
        if (C0009.m2047() > 0) {
            return ((JsonObject) obj).getAsJsonPrimitive((String) obj2);
        }
        return null;
    }

    /* renamed from: ۨۤۦ۠, reason: not valid java name and contains not printable characters */
    public static JsonObject m147(Object obj) {
        if (C0042.m7147() < 0) {
            return ((JsonElement) obj).getAsJsonObject();
        }
        return null;
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        C0011.m2747(sb, C0043.m7349(this), C0040.m6584(m142(), 341, 22, 1481), str, C0032.m5708(m142(), 363, 49, 2296));
        Iterator itM144 = m144(m139(m145((JsonObject) C0033.m5856(C0032.m5769(C0028.m5188(sb, str2, C0037.m6307(m142(), 412, 10, 459)), C0055.m8711()), JsonObject.class), C0051.m8259(m142(), 422, 4, 2313)), C0044.m7509(m142(), 426, 6, 868)));
        String strM7763 = null;
        while (C0012.m2962(itM144)) {
            JsonObject jsonObjectM147 = m147((JsonElement) C0048.m7949(itM144));
            String strM137 = m137(m146(jsonObjectM147, C0015.m3484(m142(), 432, 5, 1055)));
            if (!C0058.m9127(strM137, C0064.m9599(m142(), 437, 4, 2849))) {
                strM137 = C0050.m8125(C0002.m1305(m142(), 441, 6, 1230), strM137);
            }
            String strM6779 = C0041.m6779(m142(), 447, 7, 3147);
            if (m134(jsonObjectM147, strM6779)) {
                strM7763 = m137(m146(jsonObjectM147, strM6779));
            }
            String strM6551 = C0039.m6551(m142(), 454, 3, 2597);
            if (m134(jsonObjectM147, strM6551)) {
                strM7763 = m137(m146(jsonObjectM147, strM6551));
            }
            String strM5062 = C0027.m5062(m142(), 457, 6, 474);
            if (m134(jsonObjectM147, strM5062)) {
                StringBuilder sb2 = new StringBuilder(C0042.m7151(m142(), 463, 3, 1887));
                C0018.m3933(sb2, m137(m146(jsonObjectM147, strM5062)));
                strM7763 = C0047.m7763(sb2);
            }
            StringBuilder sbM3016 = C0012.m3016(str, C0025.m4795(m142(), 466, 1, 2004));
            C0018.m3933(sbM3016, m137(m146(jsonObjectM147, C0017.m3646(m142(), 467, 2, 848))));
            C0004.m1532(arrayList, new m(C0047.m7763(sbM3016), m137(m146(jsonObjectM147, C0024.m4740(m142(), 469, 5, 2208))), strM137, strM7763));
        }
        return C0047.m7783(arrayList);
    }

    public String detailContent(List<String> list) {
        String strM7763;
        int i;
        String[] strArr;
        String str;
        String str2;
        String[] strArr2;
        String str3;
        JsonArray jsonArray;
        new ArrayList();
        int i2 = 0;
        String[] strArrM4752 = C0024.m4752(C0015.m3446((String) C0048.m7915(list, 0), C0041.m6779(m142(), 474, 4, 2503), C0007.m1840()), C0064.m9599(m142(), 478, 2, 1967));
        StringBuilder sb = new StringBuilder();
        String strM7349 = C0043.m7349(this);
        C0018.m3933(sb, strM7349);
        String strM7902 = C0048.m7902(m142(), 480, 15, 1637);
        C0018.m3933(sb, strM7902);
        C0018.m3933(sb, strArrM4752[0]);
        String strM79022 = C0048.m7902(m142(), 495, 4, 2318);
        C0018.m3933(sb, strM79022);
        String str4 = strArrM4752[1];
        String strM3106 = C0013.m3106(m142(), 499, 6, 1631);
        JsonObject jsonObject = (JsonObject) C0033.m5856(C0032.m5769(C0028.m5188(sb, str4, strM3106), C0055.m8711()), JsonObject.class);
        String strM6307 = C0037.m6307(m142(), 505, 4, 1884);
        JsonObject jsonObjectM145 = m145(jsonObject, strM6307);
        String strM137 = m137(m146(jsonObjectM145, C0047.m7833(m142(), 509, 5, 2806)));
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        JsonArray jsonArrayM139 = m139(jsonObjectM145, C0028.m5109(m142(), 514, 14, 2617));
        String[] strArr3 = {C0023.m4536(m142(), 528, 2, 1341), C0064.m9599(m142(), 530, 4, 451), C0037.m6307(m142(), 534, 4, 1025), C0065.m9775(m142(), 538, 5, 1666), C0051.m8259(m142(), 543, 9, 2952), C0021.m4340(m142(), 552, 4, 645)};
        for (int i3 = 6; i2 < i3; i3 = 6) {
            String str5 = strArr3[i2];
            if (m143(jsonArrayM139, str5)) {
                String strM1189 = C0001.m1189(m142(), 556, 9, 2611);
                boolean zM134 = m134(jsonObjectM145, strM1189);
                strArr2 = strArr3;
                String strM5852 = C0033.m5852(m142(), 565, 3, 2630);
                jsonArray = jsonArrayM139;
                String strM7833 = C0047.m7833(m142(), 568, 1, 1727);
                if (zM134) {
                    int iM6456 = C0038.m6456(m137(m146(m145(jsonObjectM145, strM1189), str5)));
                    str3 = strM137;
                    int i4 = 1;
                    while (i4 < iM6456) {
                        int i5 = i4 + 50;
                        int i6 = i2;
                        int iM8186 = C0051.m8186(iM6456, i4 + 49);
                        int i7 = iM6456;
                        StringBuilder sbM3016 = C0012.m3016(strM7349, strM7902);
                        String str6 = strM7349;
                        C0018.m3933(sbM3016, strArrM4752[0]);
                        C0018.m3933(sbM3016, strM79022);
                        String str7 = strM7902;
                        C0018.m3933(sbM3016, strArrM4752[1]);
                        C0018.m3933(sbM3016, C0053.m8477(m142(), 569, 7, 3095));
                        C0036.m6177(sbM3016, i4);
                        C0018.m3933(sbM3016, C0046.m7718(m142(), 576, 5, 710));
                        C0036.m6177(sbM3016, iM8186);
                        C0018.m3933(sbM3016, strM3106);
                        C0018.m3933(sbM3016, str5);
                        JsonObject jsonObject2 = (JsonObject) C0033.m5856(C0032.m5769(C0047.m7763(sbM3016), C0055.m8711()), JsonObject.class);
                        JsonObject jsonObjectM1452 = m145(jsonObject2, strM6307);
                        String strM58522 = C0033.m5852(m142(), 581, 12, 2861);
                        boolean zM1342 = m134(jsonObjectM1452, strM58522);
                        String strM4740 = C0024.m4740(m142(), 593, 1, 359);
                        String strM4107 = C0019.m4107(m142(), 594, 3, 2657);
                        if (zM1342) {
                            Iterator itM144 = m144(m139(m145(m145(jsonObject2, strM6307), strM58522), str5));
                            while (C0012.m2962(itM144)) {
                                JsonObject jsonObjectM147 = m147((JsonElement) C0048.m7949(itM144));
                                C0018.m3933(sb2, m137(m146(jsonObjectM147, C0054.m8574(m142(), 597, 12, 2579))));
                                C0018.m3933(sb2, strM7833);
                                C0018.m3933(sb2, m137(m146(jsonObjectM147, strM4107)));
                                C0018.m3933(sb2, strM4740);
                                strArrM4752 = strArrM4752;
                            }
                        }
                        String[] strArr4 = strArrM4752;
                        JsonObject jsonObjectM1453 = m145(jsonObject2, strM6307);
                        String strM6584 = C0040.m6584(m142(), 609, 14, 718);
                        if (m134(jsonObjectM1453, strM6584)) {
                            Iterator itM1442 = m144(m139(m145(jsonObject2, strM6307), strM6584));
                            while (C0012.m2962(itM1442)) {
                                JsonObject jsonObjectM1472 = m147((JsonElement) C0048.m7949(itM1442));
                                StringBuilder sb4 = new StringBuilder();
                                C0018.m3933(sb4, m137(m146(jsonObjectM1472, C0004.m1549(m142(), 623, 6, 1422))));
                                C0018.m3933(sb4, C0013.m3106(m142(), 629, 1, 1936));
                                C0018.m3933(sb4, m137(m146(jsonObjectM1472, C0058.m9106(m142(), 630, 4, 1106))));
                                C0018.m3933(sb2, C0047.m7763(sb4));
                                C0018.m3933(sb2, strM7833);
                                C0018.m3933(sb2, m137(m146(jsonObjectM1472, strM4107)));
                                C0018.m3933(sb2, strM4740);
                            }
                        }
                        i4 = i5;
                        i2 = i6;
                        iM6456 = i7;
                        strM7349 = str6;
                        strM7902 = str7;
                        strArrM4752 = strArr4;
                    }
                    i = i2;
                    strArr = strArrM4752;
                    str = strM7349;
                    str2 = strM7902;
                    C0018.m3933(sb3, str5);
                    C0018.m3933(sb3, strM5852);
                    C0018.m3933(sb2, strM5852);
                } else {
                    i = i2;
                    strArr = strArrM4752;
                    str = strM7349;
                    str2 = strM7902;
                    str3 = strM137;
                    JsonObject jsonObjectM1454 = m145(m145(jsonObjectM145, C0022.m4403(m142(), 634, 15, 1938)), str5);
                    C0018.m3933(sb2, m137(m146(jsonObjectM1454, C0030.m5362(m142(), 649, 7, 446))));
                    C0018.m3933(sb2, strM7833);
                    C0018.m3933(sb2, m137(m146(jsonObjectM1454, C0029.m5256(m142(), 656, 11, 853))));
                    C0018.m3933(sb2, C0023.m4536(m142(), 667, 4, 2734));
                    C0018.m3933(sb3, str5);
                    C0018.m3933(sb3, strM5852);
                }
            } else {
                i = i2;
                strArr = strArrM4752;
                str = strM7349;
                str2 = strM7902;
                strArr2 = strArr3;
                str3 = strM137;
                jsonArray = jsonArrayM139;
            }
            i2 = i + 1;
            strM137 = str3;
            strArr3 = strArr2;
            jsonArrayM139 = jsonArray;
            strM7349 = str;
            strM7902 = str2;
            strArrM4752 = strArr;
        }
        m mVar = new m();
        C0011.m2828(mVar, m137(m146(jsonObjectM145, C0057.m8978(m142(), 671, 2, 2073))));
        C0005.m1628(mVar, strM137);
        StringBuilder sb5 = new StringBuilder();
        C0018.m3933(sb5, C0055.m8703());
        C0018.m3933(sb5, m137(m146(jsonObjectM145, C0018.m3917(m142(), 673, 11, 2811))));
        C0027.m5000(mVar, C0047.m7763(sb5));
        C0058.m9159(mVar, m141(m139(jsonObjectM145, C0034.m6001(m142(), 684, 8, 2072))));
        C0058.m9152(mVar, m141(m139(jsonObjectM145, C0018.m3917(m142(), 692, 5, 669))));
        C0026.m4947(mVar, m137(m146(jsonObjectM145, C0043.m7290(m142(), 697, 8, 1089))));
        String strM63072 = C0037.m6307(m142(), 705, 6, 3105);
        if (m134(jsonObjectM145, strM63072)) {
            StringBuilder sb6 = new StringBuilder();
            C0018.m3933(sb6, C0036.m6189());
            C0018.m3933(sb6, C0060.m9352(m142(), 711, 3, 1752));
            C0018.m3933(sb6, m137(m146(jsonObjectM145, strM63072)));
            strM7763 = C0047.m7763(sb6);
        } else {
            StringBuilder sb7 = new StringBuilder();
            C0018.m3933(sb7, C0036.m6189());
            C0018.m3933(sb7, m137(m146(jsonObjectM145, C0029.m5256(m142(), 714, 7, 2458))));
            strM7763 = C0047.m7763(sb7);
        }
        C0019.m4073(mVar, strM7763);
        C0054.m8596(mVar, C0047.m7763(sb3));
        C0044.m7449(mVar, C0047.m7763(sb2));
        return C0053.m8428(mVar);
    }

    public String homeContent(boolean z) {
        ArrayList arrayList = new ArrayList();
        List listM1203 = C0001.m1203(new String[]{C0036.m6188(m142(), 721, 1, 1954), C0016.m3525(m142(), 722, 1, 667), C0022.m4403(m142(), 723, 1, 2749), C0018.m3917(m142(), 724, 1, 456)});
        List listM12032 = C0001.m1203(new String[]{C0019.m4107(m142(), 725, 2, 1616), C0012.m2973(m142(), 727, 3, 3159), C0026.m4951(m142(), 730, 2, 2404), C0000.m1077(m142(), 732, 2, 930)});
        for (int i = 0; i < C0064.m9636(listM1203); i++) {
            C0004.m1532(arrayList, new b((String) C0048.m7915(listM1203, i), (String) C0048.m7915(listM12032, i), null));
        }
        return C0003.m1448(C0038.m6441(this), null, arrayList);
    }

    public void init(Context context, String str) {
        if (C0057.m8953(str)) {
            return;
        }
        String strM1451 = C0003.m1451(str);
        String strM3484 = C0015.m3484(m142(), 734, 3, 2370);
        if (!C0058.m9127(strM1451, strM3484)) {
            strM1451 = C0003.m1451(C0032.m5769(strM1451, null));
        }
        this.c = C0024.m4752(strM1451, strM3484);
    }

    public String playerContent(String str, String str2, List<String> list) {
        String strM3446 = str2;
        C0036.m6219();
        String strM4951 = C0026.m4951(m142(), 737, 30, 3054);
        if (C0058.m9127(strM3446, strM4951)) {
            strM3446 = C0015.m3446(C0024.m4752(strM3446, C0062.m9389(m142(), 767, 1, 1394))[0], strM4951, C0043.m7290(m142(), 768, 30, 3118));
        }
        String[] strArrM1240 = C0002.m1240(strM3446, C0021.m4340(m142(), 798, 2, 1505), 2);
        if (strArrM1240.length > 0) {
            PrintStream printStreamM6087 = C0035.m6087();
            StringBuilder sb = new StringBuilder(C0008.m1970(m142(), 800, 10, 1320));
            C0018.m3933(sb, strArrM1240[0]);
            C0012.m2969(printStreamM6087, C0047.m7763(sb));
            strM3446 = strArrM1240[0];
        }
        if (C0058.m9127(strM3446, C0047.m7833(m142(), 810, 8, 1240))) {
            g gVar = new g();
            C0017.m3667(gVar, strM3446);
            C0006.m1720(gVar, 1);
            return C0033.m5828(gVar);
        }
        String strM6133 = C0035.m6133(strM3446);
        String strM1373 = C0003.m1373(strM3446);
        String strM8131 = C0050.m8131(m142(), 818, 4, 2865);
        if (C0058.m9127(strM1373, strM8131)) {
            g gVar2 = new g();
            C0017.m3667(gVar2, strM1373);
            C0002.m1282(gVar2, strM6133);
            return C0033.m5828(gVar2);
        }
        String[] strArrM4090 = C0019.m4090(this);
        if (strArrM4090 != null) {
            for (String str3 : strArrM4090) {
                try {
                    String strM4376 = C0021.m4376(str3, strM3446);
                    if (C0058.m9127(strM4376, strM8131)) {
                        C0045.m7608(C0046.m7718(m142(), 822, 6, 571));
                        g gVar3 = new g();
                        C0017.m3667(gVar3, strM4376);
                        C0002.m1282(gVar3, strM6133);
                        return C0033.m5828(gVar3);
                    }
                } catch (Exception unused) {
                    g gVar4 = new g();
                    C0017.m3667(gVar4, strM3446);
                    C0064.m9646(gVar4);
                    C0002.m1282(gVar4, strM6133);
                    return C0033.m5828(gVar4);
                }
            }
        }
        g gVar5 = new g();
        C0017.m3667(gVar5, strM3446);
        C0064.m9646(gVar5);
        C0002.m1282(gVar5, strM6133);
        return C0033.m5828(gVar5);
    }

    public String searchContent(String str, boolean z) {
        return C0025.m4828(this, str, z, C0053.m8477(m142(), 828, 1, 355));
    }

    public String searchContent(String str, boolean z, String str2) {
        ArrayList arrayList = new ArrayList();
        Iterator itM144 = m144(m139(m145(m145((JsonObject) C0033.m5856(C0032.m5769(C0058.m9145(C0010.m2300(m142(), 829, 45, 1015), str, C0010.m2300(m142(), 874, 14, 2652), str2, C0039.m6551(m142(), 888, 15, 1650)), C0055.m8711()), JsonObject.class), C0001.m1189(m142(), 903, 4, 1001)), C0044.m7509(m142(), 907, 8, 2180)), C0005.m1645(m142(), 915, 4, 899)));
        while (C0012.m2962(itM144)) {
            try {
                JsonObject jsonObjectM147 = m147((JsonElement) C0048.m7949(itM144));
                StringBuilder sb = new StringBuilder();
                C0018.m3933(sb, C0038.m6452(m142(), 919, 4, 1140));
                C0018.m3933(sb, m137(m146(jsonObjectM147, C0055.m8814(m142(), 923, 6, 3200))));
                C0018.m3933(sb, C0062.m9389(m142(), 929, 1, 1033));
                C0018.m3933(sb, m137(m146(jsonObjectM147, C0055.m8814(m142(), 930, 5, 1519))));
                m mVar = new m(C0047.m7763(sb), m137(m146(jsonObjectM147, C0000.m1077(m142(), 935, 8, 2586))), m137(m146(jsonObjectM147, C0062.m9389(m142(), 943, 5, 2055))), C0007.m1840());
                C0058.m9085(mVar, C0047.m7833(m142(), 948, 3, 2417));
                C0004.m1532(arrayList, mVar);
            } catch (Exception unused) {
            }
        }
        return C0047.m7783(arrayList);
    }
}