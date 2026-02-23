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
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z.C0039;
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
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
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
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class HBrenren extends Spider {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f56short = {1758, 1730, 1730, 1734, 1733, 1676, 1689, 1689, 1732, 1732, 1733, 1734, 1691, 1751, 1734, 1759, 1688, 1757, 1747, 1756, 1759, 1735, 1759, 1751, 1752, 1742, 1759, 1751, 1752, 1688, 1749, 1753, 1755, 1676, 1664, 1670, 1666, 1668, 1667, 1689, 2602, 2615, 2604, 2594, 2604, 2603, 1815, 1720, 1722, 1722, 1724, 1705, 1709, 1969, 1952, 1952, 1980, 1977, 1971, 1969, 1956, 1977, 1983, 1982, 2047, 1978, 1955, 1983, 1982, 2044, 2032, 1956, 1973, 1960, 1956, 2047, 1952, 1980, 1969, 1977, 1982, 2044, 2032, 2042, 2047, 2042, 719, 713, 735, 712, 663, 731, 733, 735, 724, 718, 2338, 2338, 2339, 2336, 2430, 2343, 2353, 2366, 2359, 2073, 2062, 2061, 2062, 2073, 2062, 2073, 822, 810, 810, 814, 813, 868, 881, 881, 826, 817, 829, 813, 880, 815, 815, 880, 829, 817, 819, 881, 1683, 1681, 1681, 1687, 1666, 1670, 1759, 1694, 1683, 1692, 1685, 1671, 1683, 1685, 1687, 899, 913, 980, 954, 951, 810, 806, 807, 829, 812, 807, 829, 868, 829, 816, 825, 812, 1637, 1652, 1652, 1640, 1645, 1639, 1637, 1648, 1645, 1643, 1642, 1579, 1646, 1655, 1643, 1642, 1599, 1572, 1639, 1644, 1637, 1654, 1655, 1633, 1648, 1593, 1649, 1648, 1634, 1577, 1596, 416, 428, 429, 439, 422, 429, 439, 494, 431, 422, 429, 420, 439, 427, 2599, 2604, 2154, 2171, 2146, 2085, 2171, 2147, 2171, 2084, 2150, 2154, 2146, 2149, 2132, 2171, 2169, 2148, 2156, 2169, 2154, 2150, 2084, 2150, 2148, 2173, 2146, 2158, 2168, 2122, 2151, 2151, 2084, 2564, 2569, 2560, 2581, 799, 771, 798, 792, 2322, 2315, 2304, 2363, 2320, 2317, 2313, 2305, 3149, 3166, 3145, 3149, 416, 423, 426, 447, 438, 1802, 1815, 1811, 1819, 2779, 2762, 2770, 2346, 2363, 2365, 2367, 1668, 1665, 1669, 1665, 1692, 2901, 2899, 1991, 1986, 2007, 1986, 2601, 2604, 2614, 2609, 1465, 1440, 1451, 1424, 1441, 1454, 1442, 1450, 895, 870, 877, 854, 864, 877, 2132, 2125, 2118, 2173, 2130, 2135, 2112, 2118, 2115, 2134, 2119, 1836, 1840, 1840, 1844, 1847, 1918, 1899, 1899, 1837, 1833, 1829, 1827, 1825, 1898, 1830, 1829, 1837, 1824, 1841, 1898, 1831, 1835, 1833, 1899, 1847, 1825, 1829, 1846, 1831, 1836, 1899, 1824, 1835, 1843, 1834, 1915, 1841, 1846, 1832, 1913, 1776, 1769, 1762, 1753, 1782, 1775, 1765, 1991, 2006, 1999, 1928, 2006, 1998, 2006, 1929, 2006, 1994, 1991, 2015, 1987, 2004, 1929, 1986, 1987, 2002, 1991, 1999, 1994, 2005, 1929, 3053, 3040, 2306, 2307, 2322, 2311, 2319, 2314, 2338, 2311, 2322, 2311, 272, 265, 258, 313, 278, 266, 263, 287, 313, 256, 276, 265, 267, 3092, 3180, 3092, 3180, 3092, 3180, 2259, 2250, 2241, 2298, 2261, 2249, 2244, 2268, 2298, 2256, 2263, 2249, 2518, 2518, 2518, 2320, 2313, 2306, 2361, 2312, 2311, 2315, 2307, 1593, 542, 614, 2321, 2246, 1934, 1943, 1948, 1959, 1930, 1949, 1941, 1945, 1930, 1939, 1931, 2035, 2026, 2017, 2010, 2022, 2026, 2027, 2033, 2016, 2027, 2033, 1036, 1045, 1054, 1061, 1027, 1055, 1051, 1032, 2872, 2849, 2858, 2833, 2858, 2855, 2876, 2859, 2861, 2874, 2849, 2876, 622, 631, 636, 583, 633, 635, 620, 631, 618, 478, 455, 460, 503, 472, 449, 459, 683, 690, 697, 642, 700, 687, 696, 700, 620, 714, 2559, 598, 3242, 2061, 32412, 21720, 20775, -27258, 31468, -31126, 21848, 26843, 28755, 21977, 31206, 22553, 29963, 1323, 2197, 2194, 2188, 443, 426, 435, 500, 426, 434, 426, 501, 426, 438, 443, 419, 447, 424, 501, 426, 443, 419, 396, 435, 446, 447, 437, 399, 424, 438, 501, 607, 602, 591, 602, 2326, 2320, 2310, 2321, 2382, 2306, 2308, 2310, 2317, 2327, 1994, 1994, 1995, 1992, 1942, 1999, 2009, 2006, 2015, 479, 456, 459, 456, 479, 456, 479, 2833, 2829, 2829, 2825, 2826, 2883, 2902, 2902, 2845, 2838, 2842, 2826, 2903, 2824, 2824, 2903, 2842, 2838, 2836, 2902, 1256, 1258, 1258, 1260, 1273, 1277, 1188, 1260, 1255, 1258, 1254, 1261, 1248, 1255, 1262, 670, 643, 656, 649, 770, 857, 850, 768, 857, 860, 851, 848, 840, 795, 855, 840, 848, 852, 851, 858, 768, 1382, 1322, 1321, 1331, 1320, 1333, 1405, 2688, 866, 883, 874, 813, 883, 875, 883, 812, 880, 870, 866, 881, 864, 875, 812, 880, 890, 877, 887, 875, 870, 887, 874, 864, 866, 879, 848, 870, 866, 881, 864, 875, 812, 2570, 2564, 2584, 2582, 2574, 2579, 2565, 1767, 1762, 1783, 1762, 2186, 2184, 2193, 2190, 2178, 2196, 2212, 2184, 2197, 2197, 2178, 2187, 2182, 2195, 2190, 2184, 2185, 3132, 3109, 3118, 3093, 3108, 3115, 3111, 3119, 2403, 2426, 2417, 2378, 2428, 2417, 3322, 3299, 3304, 3283, 3324, 3321, 3310, 3304, 3309, 3320, 3305, 1463, 1451, 1451, 1455, 1452, 1509, 1520, 1520, 1462, 1458, 1470, 1464, 1466, 1521, 1469, 1470, 1462, 1467, 1450, 1521, 1468, 1456, 1458, 1520, 1452, 1466, 1470, 1453, 1468, 1463, 1520, 1467, 1456, 1448, 1457, 1504, 1450, 1453, 1459, 1506, 2205, 2180, 2191, 2228, 2203, 2178, 2184};
    public final String a = C0020.m4199(m349(), 0, 40, 1718);

    public static HashMap a() {
        HashMap mapM4127 = C0019.m4127(C0021.m4340(m349(), 40, 6, 2629), C0006.m1774(m349(), 46, 1, 1853), C0050.m8131(m349(), 47, 6, 1753), C0061.m9361(m349(), 53, 33, 2000));
        C0053.m8424(mapM4127, C0009.m2037(m349(), 86, 10, 698), C0012.m2973(m349(), 96, 9, 2384));
        C0053.m8424(mapM4127, C0043.m7290(m349(), 105, 7, 2155), C0011.m2805(m349(), 112, 20, 862));
        C0053.m8424(mapM4127, C0056.m8911(m349(), 132, 15, 1778), C0063.m9585(m349(), 147, 5, 1017));
        C0053.m8424(mapM4127, C0037.m6307(m349(), 152, 12, 841), C0002.m1305(m349(), 164, 31, 1540));
        C0053.m8424(mapM4127, C0053.m8477(m349(), 195, 14, 451), C0053.m8477(m349(), 209, 2, 2590));
        return mapM4127;
    }

    /* renamed from: ۟ۡۨۡ۠, reason: not valid java name and contains not printable characters */
    public static JsonObject m340(Object obj, Object obj2) {
        if (C0062.m9429() >= 0) {
            return AbstractC0308c.d((JsonObject) obj, (String) obj2);
        }
        return null;
    }

    /* renamed from: ۣ۟ۢۧ۠, reason: not valid java name and contains not printable characters */
    public static String m341(Object obj, Object obj2, Object obj3) {
        if (C0035.m6140() <= 0) {
            return AbstractC0308c.f((JsonObject) obj, (String) obj2, (String) obj3);
        }
        return null;
    }

    /* renamed from: ۟ۢۥۤ۠, reason: not valid java name and contains not printable characters */
    public static JsonObject m342(Object obj) {
        if (C0044.m7508() < 0) {
            return ((JsonElement) obj).getAsJsonObject();
        }
        return null;
    }

    /* renamed from: ۣ۟ۥۣۡ, reason: not valid java name and contains not printable characters */
    public static JsonPrimitive m343(Object obj, Object obj2) {
        if (C0037.m6350() < 0) {
            return ((JsonObject) obj).getAsJsonPrimitive((String) obj2);
        }
        return null;
    }

    /* renamed from: ۟ۧ۟۠۟, reason: not valid java name and contains not printable characters */
    public static Iterator m344(Object obj) {
        if (C0004.m1557() <= 0) {
            return ((JsonArray) obj).iterator();
        }
        return null;
    }

    /* renamed from: ۠۠ۢۡ, reason: not valid java name and contains not printable characters */
    public static JsonArray m345(Object obj, Object obj2) {
        if (C0041.m6823() <= 0) {
            return AbstractC0308c.c((JsonObject) obj, (String) obj2);
        }
        return null;
    }

    /* renamed from: ۠ۧ۟ۥ, reason: not valid java name and contains not printable characters */
    public static JsonElement m346(Object obj) {
        if (C0010.m2320() <= 0) {
            return AbstractC0308c.g((String) obj);
        }
        return null;
    }

    /* renamed from: ۣۦۧۥ, reason: not valid java name and contains not printable characters */
    public static String m347(Object obj) {
        if (C0014.m3353() <= 0) {
            return ((JsonPrimitive) obj).getAsString();
        }
        return null;
    }

    /* renamed from: ۧۡۡۤ, reason: not valid java name and contains not printable characters */
    public static String m348(Object obj, Object obj2) {
        if (C0023.m4566() < 0) {
            return g.n((ArrayList) obj, (JsonElement) obj2);
        }
        return null;
    }

    /* renamed from: ۧۦ۟۠, reason: not valid java name and contains not printable characters */
    public static short[] m349() {
        if (C0062.m9429() > 0) {
            return f56short;
        }
        return null;
    }

    /* renamed from: ۨۤۦ۟, reason: not valid java name and contains not printable characters */
    public static JsonObject m350(Object obj) {
        if (C0017.m3633() < 0) {
            return AbstractC0308c.i((String) obj);
        }
        return null;
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        ArrayList arrayList = new ArrayList();
        String strM5188 = C0028.m5188(new StringBuilder(), C0052.m8358(this), C0062.m9389(m349(), 211, 31, 2059));
        HashMap mapM4127 = C0019.m4127(C0057.m8978(m349(), 242, 4, 2672), str, C0009.m2037(m349(), 246, 4, 876), C0014.m3332(m349(), 250, 8, 2404));
        String strM7718 = C0046.m7718(m349(), 258, 4, 3116);
        String strM1840 = C0007.m1840();
        C0053.m8424(mapM4127, strM7718, strM1840);
        C0053.m8424(mapM4127, C0030.m5362(m349(), 262, 5, 467), strM1840);
        C0053.m8424(mapM4127, C0025.m4795(m349(), 267, 4, 1918), strM1840);
        C0053.m8424(mapM4127, C0043.m7290(m349(), 271, 3, 2731), strM1840);
        C0053.m8424(mapM4127, C0043.m7290(m349(), 274, 4, 2394), str2);
        C0053.m8424(mapM4127, C0023.m4536(m349(), 278, 5, 1768), C0042.m7151(m349(), 283, 2, 2915));
        Iterator itM344 = m344(m345(m340(m350(C0008.m2029(C0045.m7628(strM5188, C0041.m6815(mapM4127), C0044.m7411()))), C0004.m1549(m349(), 285, 4, 1955)), C0058.m9106(m349(), 289, 4, 2629)));
        while (C0012.m2962(itM344)) {
            JsonObject jsonObjectM342 = m342((JsonElement) C0048.m7949(itM344));
            m mVar = new m();
            C0005.m1628(mVar, m341(jsonObjectM342, C0053.m8477(m349(), 293, 8, 1487), strM1840));
            C0011.m2828(mVar, m341(jsonObjectM342, C0051.m8259(m349(), 301, 6, 777), strM1840));
            StringBuilder sb = new StringBuilder();
            C0018.m3933(sb, C0036.m6189());
            C0018.m3933(sb, m341(jsonObjectM342, C0034.m6001(m349(), 307, 11, 2082), strM1840));
            C0019.m4073(mVar, C0047.m7763(sb));
            StringBuilder sb2 = new StringBuilder(C0010.m2300(m349(), 318, 40, 1860));
            C0018.m3933(sb2, m347(m343(jsonObjectM342, C0035.m6131(m349(), 358, 7, 1670))));
            C0026.m4947(mVar, C0047.m7763(sb2));
            C0004.m1532(arrayList, mVar);
        }
        return C0047.m7783(arrayList);
    }

    public String detailContent(List<String> list) {
        String strM1842;
        String strM5188 = C0028.m5188(new StringBuilder(), C0052.m8358(this), C0004.m1549(m349(), 365, 23, 1958));
        HashMap map = new HashMap();
        C0053.m8424(map, C0023.m4536(m349(), 388, 2, 2948), (String) C0048.m7915(list, 0));
        JsonObject jsonObjectM340 = m340(m350(C0008.m2029(C0045.m7628(strM5188, C0041.m6815(map), C0044.m7411()))), C0020.m4199(m349(), 390, 10, 2406));
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        String strM347 = m347(m343(jsonObjectM340, C0007.m1842(m349(), 400, 13, 358)));
        String strM2300 = C0010.m2300(m349(), 413, 6, 3144);
        String[] strArrM4752 = C0024.m4752(strM347, strM2300);
        String[] strArrM47522 = C0024.m4752(m347(m343(jsonObjectM340, C0020.m4199(m349(), 419, 12, 2213))), strM2300);
        int i = 0;
        while (true) {
            int length = strArrM4752.length;
            strM1842 = C0007.m1842(m349(), 431, 3, 2546);
            if (i >= length) {
                break;
            }
            String str = strArrM4752[i];
            C0018.m3933(sb, C0016.m3579());
            C0018.m3933(sb, str);
            C0018.m3933(sb, strM1842);
            i++;
        }
        int i2 = 0;
        while (true) {
            int length2 = strArrM47522.length;
            String strM1189 = C0001.m1189(m349(), 434, 8, 2406);
            if (i2 >= length2) {
                m mVar = new m();
                String strM1840 = C0007.m1840();
                C0005.m1628(mVar, m341(jsonObjectM340, strM1189, strM1840));
                StringBuilder sb3 = new StringBuilder();
                C0018.m3933(sb3, C0036.m6189());
                C0018.m3933(sb3, m341(jsonObjectM340, C0036.m6188(m349(), 447, 11, 2040), strM1840));
                C0019.m4073(mVar, C0047.m7763(sb3));
                C0027.m5000(mVar, m341(jsonObjectM340, C0016.m3525(m349(), 458, 11, 1925), strM1840));
                C0022.m4432(mVar, m341(jsonObjectM340, C0006.m1774(m349(), 469, 8, 1146), strM1840));
                C0058.m9152(mVar, m341(jsonObjectM340, C0037.m6307(m349(), 477, 12, 2894), strM1840));
                C0058.m9159(mVar, m341(jsonObjectM340, C0025.m4795(m349(), 489, 9, 536), strM1840));
                C0026.m4947(mVar, m341(jsonObjectM340, C0064.m9599(m349(), 498, 7, 424), strM1840));
                C0017.m3671(mVar, m341(jsonObjectM340, C0032.m5708(m349(), 505, 8, 733), strM1840));
                C0054.m8596(mVar, C0047.m7763(sb));
                C0044.m7449(mVar, C0047.m7763(sb2));
                return C0053.m8428(mVar);
            }
            String str2 = strArrM47522[i2];
            String strM5708 = C0032.m5708(m349(), 442, 1, 1562);
            for (String str3 : C0024.m4752(str2, strM5708)) {
                String[] strArrM47523 = C0024.m4752(str3, C0010.m2300(m349(), 443, 2, 578));
                C0018.m3933(sb2, strArrM47523[0]);
                C0018.m3933(sb2, C0027.m5062(m349(), 445, 1, 2357));
                C0018.m3933(sb2, strArrM47523[1]);
                String strM8911 = C0056.m8911(m349(), 446, 1, 2232);
                StringBuilder sb4 = new StringBuilder(strM8911);
                C0018.m3933(sb4, m347(m343(jsonObjectM340, strM1189)));
                C0018.m3933(sb4, strM8911);
                C0018.m3933(sb4, strArrM47523[0]);
                C0018.m3933(sb2, C0047.m7763(sb4));
                C0018.m3933(sb2, strM5708);
            }
            C0018.m3933(sb2, strM1842);
            i2++;
        }
    }

    public String homeContent(boolean z) {
        ArrayList arrayList = new ArrayList();
        List listM1203 = C0001.m1203(new String[]{C0007.m1842(m349(), 513, 1, 605), C0012.m2973(m349(), 514, 1, 760), C0027.m5062(m349(), 515, 1, 2508), C0031.m5565(m349(), 516, 1, 610), C0051.m8259(m349(), 517, 1, 3231), C0055.m8814(m349(), 518, 1, 2107)});
        List listM12032 = C0001.m1203(new String[]{C0009.m2037(m349(), 519, 2, 2985), C0028.m5109(m349(), 521, 2, 832), C0054.m8574(m349(), 523, 2, 1040), C0019.m4107(m349(), 525, 2, 2032), C0037.m6307(m349(), 527, 2, 1982), C0034.m6001(m349(), 529, 3, 1868)});
        for (int i = 0; i < C0064.m9636(listM1203); i++) {
            C0004.m1532(arrayList, new b((String) C0048.m7915(listM1203, i), (String) C0048.m7915(listM12032, i), null));
        }
        return m348(arrayList, m346(C0007.m1840()));
    }

    public void init(Context context) {
    }

    public String playerContent(String str, String str2, List<String> list) {
        String[] strArrM4752 = C0024.m4752(str2, C0011.m2805(m349(), 532, 1, 1365));
        HashMap map = new HashMap();
        String str3 = strArrM4752[0];
        String strM8131 = C0050.m8131(m349(), 533, 3, 2272);
        C0053.m8424(map, strM8131, str3);
        String strM341 = m341(m340(m350(C0008.m2029(C0045.m7628(C0028.m5188(new StringBuilder(), C0052.m8358(this), C0005.m1645(m349(), 536, 27, 474)), C0041.m6815(map), C0044.m7411()))), C0046.m7718(m349(), 563, 4, 571)), strM8131, C0007.m1840());
        HashMap mapM4127 = C0019.m4127(C0006.m1774(m349(), 567, 10, 2403), C0035.m6131(m349(), 577, 9, 1976), C0052.m8337(m349(), 586, 7, 429), C0028.m5109(m349(), 593, 20, 2937));
        C0053.m8424(mapM4127, C0021.m4340(m349(), 613, 15, 1161), C0013.m3106(m349(), 628, 4, 761));
        String str4 = strArrM4752[1];
        String str5 = strArrM4752[2];
        C0062.m9425();
        StringBuilder sb = new StringBuilder();
        C0018.m3933(sb, C0051.m8217());
        C0018.m3933(sb, C0052.m8337(m349(), 632, 17, 829));
        C0018.m3933(sb, str4);
        C0018.m3933(sb, C0035.m6131(m349(), 649, 7, 1344));
        C0018.m3933(sb, str5);
        String strM7763 = C0047.m7763(sb);
        g gVar = new g();
        C0017.m3667(gVar, strM341);
        C0002.m1282(gVar, strM7763);
        C0006.m1720(gVar, 0);
        C0057.m9029(gVar, mapM4127);
        return C0033.m5828(gVar);
    }

    public String searchContent(String str, boolean z) {
        return C0064.m9675(this, str, z, C0063.m9585(m349(), 656, 1, 2737));
    }

    public String searchContent(String str, boolean z, String str2) {
        ArrayList arrayList = new ArrayList();
        String strM5188 = C0028.m5188(new StringBuilder(), C0052.m8358(this), C0005.m1645(m349(), 657, 33, 771));
        HashMap map = new HashMap();
        C0053.m8424(map, C0039.m6551(m349(), 690, 7, 2657), str);
        Iterator itM344 = m344(m345(m340(m350(C0008.m2029(C0045.m7628(strM5188, C0041.m6815(map), C0044.m7411()))), C0015.m3484(m349(), 697, 4, 1667)), C0053.m8477(m349(), 701, 17, 2279)));
        while (C0012.m2962(itM344)) {
            JsonObject jsonObjectM342 = m342((JsonElement) C0048.m7949(itM344));
            m mVar = new m();
            String strM3484 = C0015.m3484(m349(), 718, 8, 3146);
            String strM1840 = C0007.m1840();
            String strM341 = m341(jsonObjectM342, strM3484, strM1840);
            if (!C0058.m9127(strM341, str)) {
                C0005.m1628(mVar, strM341);
                C0011.m2828(mVar, m341(jsonObjectM342, C0022.m4403(m349(), 726, 6, 2325), strM1840));
                StringBuilder sb = new StringBuilder();
                C0018.m3933(sb, C0036.m6189());
                C0018.m3933(sb, m341(jsonObjectM342, C0049.m8007(m349(), 732, 11, 3212), strM1840));
                C0019.m4073(mVar, C0047.m7763(sb));
                StringBuilder sb2 = new StringBuilder(C0060.m9352(m349(), 743, 40, 1503));
                C0018.m3933(sb2, m347(m343(jsonObjectM342, C0053.m8477(m349(), 783, 7, 2283))));
                C0026.m4947(mVar, C0047.m7763(sb2));
                C0004.m1532(arrayList, mVar);
            }
        }
        return C0047.m7783(arrayList);
    }
}