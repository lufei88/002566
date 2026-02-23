package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.crawler.Spider;
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
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public class HBNT4 extends Spider {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f30short = {2731, 2743, 2743, 2739, 2809, 2796, 2796, 2800, 2811, 2797, 2804, 2805, 2797, 2801, 2802, 2811, 2797, 2804, 2809, 2802, 2801, 2802, 2801, 2802, 2796, 2711, 2807, 2796, 2722, 2739, 2730, 2797, 2739, 2731, 2739, 3060, 3048, 3048, 3052, 2982, 2995, 2995, 2991, 2980, 2994, 2987, 2986, 2994, 2990, 2989, 2980, 2994, 2987, 2982, 2989, 2990, 2989, 2990, 2989, 2995, 3016, 2984, 2995, 3062, 3061, 3065, 3044, 3061, 2994, 3052, 3060, 3052, 2979, 3049, 3054, 3056, 2977, 1527, 1520, 1530, 1531, 1510, 1456, 1518, 1526, 1518, 1457, 1512, 1521, 1530, 1457, 1514, 1511, 1518, 1531, 1457, 1527, 1530, 1457, 1462, 1474, 1513, 1461, 1463, 1456, 1526, 1514, 1523, 1522, 1013, 909, 1013, 897, 907, 1013, 903, 964, 968, 970, 1014, 989, 966, 989, 968, 965, 907, 1013, 896, 1013, 903, 989, 972, 977, 989, 1013, 897, 910, 897, 1013, 973, 898, 896, 910, 1013, 896, 914, 2114, 2148, 2162, 2149, 2106, 2134, 2160, 2162, 2169, 2147, 1342, 1308, 1289, 1306, 1311, 1311, 1298, 1372, 1350, 1373, 1347, 1363, 1371, 1316, 1306, 1309, 1303, 1308, 1284, 1280, 1363, 1341, 1319, 1363, 1346, 1347, 1373, 1347, 1352, 1363, 1316, 1306, 1309, 1349, 1351, 1352, 1363, 1291, 1349, 1351, 1370, 1363, 1330, 1283, 1283, 1311, 1302, 1316, 1302, 1297, 1336, 1306, 1287, 1372, 1350, 1344, 1348, 1373, 1344, 1349, 1363, 1371, 1336, 1339, 1319, 1342, 1343, 1375, 1363, 1311, 1306, 1304, 1302, 1363, 1332, 1302, 1296, 1304, 1308, 1370, 1363, 1328, 1307, 1281, 1308, 1310, 1302, 1372, 1346, 1345, 1345, 1373, 1347, 1373, 1347, 1373, 1347, 1363, 1312, 1298, 1301, 1298, 1281, 1306, 1372, 1350, 1344, 1348, 1373, 1344, 1349, 1994, 1929, 1931, 1920, 1937, 1928, 1921, 1993, 1933, 1936, 1921, 1929, 1545, 1617, 1614, 1603, 1602, 1608, 1546, 1609, 1606, 1610, 1602, 1543, 1606, 1416, 1426, 1413, 1414, 2069, 2134, 2132, 2143, 2126, 2135, 2142, 2070, 2130, 2127, 2142, 2134, 2070, 2123, 2130, 2136, 2075, 2053, 2075, 2130, 2134, 2140, 2044, 2041, 2028, 2041, 1973, 2027, 2026, 2043, 1032, 1104, 1103, 1090, 1091, 1097, 1035, 1096, 1095, 1099, 1091, 3057, 2994, 2992, 3003, 2986, 2995, 3002, 3058, 2998, 2987, 3002, 2994, 3058, 2987, 3002, 2983, 2987, 1894, 1824, 1831, 1837, 1836, 1841, 1895, 1849, 1825, 1849, 1894, 1855, 1830, 1837, 1894, 1850, 1836, 1832, 1851, 1834, 1825, 1894, 1849, 1832, 1838, 1836, 1894, 425, 497, 482, 425, 2330, 2396, 2368, 2393, 2392, 2850, 2913, 2915, 2920, 2937, 2912, 2921, 2849, 2943, 2921, 2925, 2942, 2927, 2916, 2849, 2917, 2936, 2921, 2913, 833, 793, 774, 779, 778, 768, 834, 796, 778, 797, 774, 782, 771, 2153, 2163, 2148, 2151, 3083, 3094, 3083, 3091, 3098, 1251, 1184, 1186, 1193, 1208, 1185, 1192, 1248, 1188, 1209, 1192, 1184, 1248, 1213, 1188, 1198, 1261, 1267, 1261, 1188, 1184, 1194, 576, 581, 592, 581, 521, 599, 598, 583, 1702, 1790, 1761, 1772, 1773, 1767, 1701, 1788, 1769, 1775, 1701, 1761, 1771, 1767, 1766, 1512, 1454, 1449, 1443, 1442, 1471, 1513, 1463, 1455, 1463, 1512, 1457, 1448, 1443, 1512, 1460, 1455, 1448, 1456, 1512, 1454, 1443, 1512, 3000, 3047, 3062, 3056, 3058, 3000, 1576, 1646, 1650, 1643, 1642, 1129, 2509, 2139, 2083, 2139, 2083, 2139, 2083, 858, 770, 797, 784, 785, 795, 857, 797, 794, 786, 795, 857, 796, 785, 789, 784, 785, 774, 852, 842, 852, 858, 772, 789, 787, 785, 857, 768, 797, 768, 792, 785, 1363, 1296, 1298, 1305, 1288, 1297, 1304, 1360, 1300, 1289, 1304, 1296, 1360, 1293, 1300, 1310, 1373, 1300, 1296, 1306, 1026, 1031, 1042, 1031, 1099, 1045, 1044, 1029, 2851, 2939, 2916, 2921, 2920, 2914, 2848, 2916, 2915, 2923, 2914, 2848, 2917, 2920, 2924, 2921, 2920, 2943, 2861, 2924, 2851, 2937, 2924, 2922, 2848, 2913, 2916, 2915, 2918, 3030, 2958, 2961, 2972, 2973, 2967, 3029, 2961, 2966, 2974, 2967, 3029, 2960, 2973, 2969, 2972, 2973, 2954, 3032, 2972, 2961, 2958, 3030, 2956, 2969, 2975, 3029, 2964, 2961, 2966, 2963, 3032, 2969, 2745, 461, 398, 396, 391, 406, 399, 390, 462, 401, 396, 404, 462, 407, 390, 411, 407, 3063, 3058, 3047, 3058, 3006, 3056, 3071, 3066, 3043, 3057, 3068, 3058, 3041, 3063, 3006, 3047, 3062, 3051, 3047, 2957, 2952, 2962, 2965, 2261, 2243, 2717, 2713, 2701, 2718, 2695, 2778, 2755, 2760, 2803, 2780, 2752, 2765, 2773, 2803, 2762, 2782, 2755, 2753, 2820, 2845, 2838, 2861, 2818, 2846, 2835, 2827, 2861, 2823, 2816, 2846, 1949, 2001, 1995, 2006, 1991, 1951, 2002, 2007, 2001, 1994, 2045, 1987, 1989, 1991, 1996, 2006, 1924, 1987, 1985, 1951, 1990, 1991, 2006, 1987, 1995, 1998, 1924, 1995, 1990, 2001, 1951, 1067, 1066, 1080, 1107, 1094, 27263, -26154, 2006, 2006, 2006, 23373, 22459, 2278, 2233, 29121, 22967, 1770, 1717, 2826, 2930, 2649, 2669, 2613, 2602, 2599, 2598, 2604, 2670, 2602, 2605, 2597, 2604, 2670, 2602, 2615, 2598, 2606, 22891, 28035, 3236, 17524, 25947, 23221, 18978, 21790, 24817, 24110, 27788, 2224, 2285, 2287, 2292, 2292, 2241, 2303, 1438, 24819, -30542, -27347, 22467, 1432, 1342, 1406, 1393, 1382, 1341, 1404, 1401, 1406, 1403, 3279, 3285, 3266, 3265, 21577, 22719, 2018, 1981, 3281, 3271, 28868, 22706, 2031, 1968, 2965, 2961, 2949, 2966, 2959, 1305, 629, 627, 613, 638, 639, 571, 660, 1057, 1135, 1125, 1139, 1075, 1082, 2948, 2947, 2973, 939};
    public String a = C0007.m1840();
    public final String b = C0065.m9775(m206(), 0, 35, 2755);
    public final String c = C0011.m2805(m206(), 35, 42, 2972);
    public final Pattern d = C0005.m1602(C0000.m1077(m206(), 77, 32, 1438));
    public final Pattern e = C0005.m1602(C0043.m7290(m206(), 109, 37, 937));

    public static HashMap a() {
        return C0020.m4251(C0050.m8131(m206(), 146, 10, 2071), C0016.m3525(m206(), 156, 111, 1395));
    }

    public static ArrayList b(h hVar) {
        ArrayList arrayList = new ArrayList();
        Iterator itM7807 = C0047.m7807(C0030.m5333(hVar, C0040.m6584(m206(), 267, 12, 2020)));
        while (C0012.m2962(itM7807)) {
            m mVar = (m) C0048.m7949(itM7807);
            m mVarM6243 = C0036.m6243(mVar, C0041.m6779(m206(), 279, 13, 1575));
            C0047.m7777(mVarM6243);
            String strM2339 = C0010.m2339(mVarM6243, C0008.m1970(m206(), 292, 4, 1504));
            m mVarM62432 = C0036.m6243(mVar, C0032.m5708(m206(), 296, 22, 2107));
            C0047.m7777(mVarM62432);
            String strM23392 = C0010.m2339(mVarM62432, C0020.m4199(m206(), 318, 8, 1944));
            m mVarM62433 = C0036.m6243(mVar, C0034.m6001(m206(), 326, 11, 1062));
            C0047.m7777(mVarM62433);
            String strM9669 = C0064.m9669(mVarM62433);
            m mVarM62434 = C0036.m6243(mVar, C0036.m6188(m206(), 337, 17, 3039));
            C0047.m7777(mVarM62434);
            C0055.m8732(strM2339, strM9669, strM23392, C0064.m9669(mVarM62434), arrayList);
        }
        return arrayList;
    }

    /* renamed from: ۟۟ۢۥۤ, reason: not valid java name and contains not printable characters */
    public static JsonArray m199(Object obj, Object obj2) {
        if (C0006.m1726() < 0) {
            return AbstractC0308c.c((JsonObject) obj, (String) obj2);
        }
        return null;
    }

    /* renamed from: ۟ۢ۠ۧ, reason: not valid java name and contains not printable characters */
    public static String m200(Object obj, Object obj2, Object obj3) {
        if (C0030.m5375() >= 0) {
            return AbstractC0308c.f((JsonObject) obj, (String) obj2, (String) obj3);
        }
        return null;
    }

    /* renamed from: ۟ۢۥۡۢ, reason: not valid java name and contains not printable characters */
    public static JsonObject m201(Object obj) {
        if (C0038.m6471() >= 0) {
            return ((JsonElement) obj).getAsJsonObject();
        }
        return null;
    }

    /* renamed from: ۟ۥۤۨ۠, reason: not valid java name and contains not printable characters */
    public static JsonElement m202(Object obj, int i) {
        if (C0019.m4065() <= 0) {
            return ((JsonArray) obj).get(i);
        }
        return null;
    }

    /* renamed from: ۟ۧ۟ۥۧ, reason: not valid java name and contains not printable characters */
    public static int m203(Object obj) {
        if (C0000.m1116() <= 0) {
            return ((JsonArray) obj).size();
        }
        return 0;
    }

    /* renamed from: ۠ۦۥۥ, reason: not valid java name and contains not printable characters */
    public static String m204(Object obj) {
        if (C0028.m5152() <= 0) {
            return ((JsonElement) obj).getAsString();
        }
        return null;
    }

    /* renamed from: ۤۦ۠, reason: not valid java name and contains not printable characters */
    public static JsonObject m205(Object obj) {
        if (C0060.m9355() >= 0) {
            return AbstractC0308c.i((String) obj);
        }
        return null;
    }

    /* renamed from: ۥۦۡۡ, reason: contains not printable characters */
    public static short[] m206() {
        if (C0009.m2047() > 0) {
            return f30short;
        }
        return null;
    }

    public final String c(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        C0018.m3933(sb, C0013.m3166(this));
        C0018.m3933(sb, C0058.m9145(C0036.m6188(m206(), 354, 27, 1865), str2, C0052.m8337(m206(), 381, 4, 390), C0056.m8909(str), C0022.m4403(m206(), 385, 5, 2356)));
        String strM7763 = C0047.m7763(sb);
        try {
            C0011.m2785(2000L);
        } catch (InterruptedException e) {
            C0034.m6006(C0031.m5631());
            C0049.m7975(e);
        }
        d dVarM5333 = C0030.m5333(C0016.m3577(C0032.m5769(strM7763, C0054.m8644())), C0043.m7290(m206(), 390, 19, 2828));
        ArrayList arrayList = new ArrayList();
        Iterator itM7807 = C0047.m7807(dVarM5333);
        while (C0012.m2962(itM7807)) {
            m mVar = (m) C0048.m7949(itM7807);
            String strM8477 = C0053.m8477(m206(), 409, 13, 879);
            C0055.m8732(C0049.m8058(C0030.m5333(mVar, strM8477), C0039.m6551(m206(), 422, 4, 2049)), C0049.m8058(C0030.m5333(mVar, strM8477), C0017.m3646(m206(), 426, 5, 3199)), C0049.m8058(C0030.m5333(mVar, C0058.m9106(m206(), 431, 22, 1229)), C0054.m8574(m206(), 453, 8, 548)), C0024.m4684(C0030.m5333(mVar, C0050.m8131(m206(), 461, 15, 1672))), arrayList);
        }
        return C0047.m7783(arrayList);
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        int iM6456;
        String strM3166 = C0013.m3166(this);
        StringBuilder sb = new StringBuilder();
        C0018.m3933(sb, strM3166);
        C0018.m3933(sb, C0013.m3106(m206(), 476, 23, 1479));
        C0018.m3933(sb, str);
        C0018.m3933(sb, C0055.m8814(m206(), 499, 6, 2967));
        C0018.m3933(sb, str2);
        C0018.m3933(sb, C0019.m4107(m206(), 505, 5, 1542));
        h hVarM3577 = C0016.m3577(C0032.m5769(C0047.m7763(sb), C0054.m8644()));
        int iM64562 = C0038.m6456(str2);
        Matcher matcherM6026 = C0034.m6026(C0012.m2976(this), C0000.m1081(hVarM3577));
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
        C0045.m7632(gVar, C0057.m9013(hVarM3577));
        C0049.m7974(gVar, iM64562, iM1140, 72, iM6456);
        return C0033.m5828(gVar);
    }

    public String detailContent(List<String> list) {
        String strM5708;
        String strM5109;
        h hVar;
        String strM7657;
        com.github.catvod.spider.merge.E.m mVar;
        String strM8911;
        String str;
        String strM1840;
        String strM2300 = C0010.m2300(m206(), 510, 1, 1047);
        String strM76572 = C0045.m7657(m206(), 511, 1, 2542);
        String strM8259 = C0051.m8259(m206(), 512, 6, 2055);
        String str2 = (String) C0048.m7915(list, 0);
        h hVarM3577 = C0016.m3577(C0032.m5769(C0028.m5188(new StringBuilder(), C0013.m3166(this), str2), C0054.m8644()));
        com.github.catvod.spider.merge.E.m mVar2 = new com.github.catvod.spider.merge.E.m();
        f fVarM6110 = C0035.m6110();
        String strM3332 = C0014.m3332(m206(), 518, 32, 884);
        m mVarM6243 = C0036.m6243(hVarM3577, strM3332);
        C0047.m7777(mVarM6243);
        C0055.m8715(fVarM6110, C0064.m9669(mVarM6243));
        C0011.m2828(mVar2, str2);
        m mVarM62432 = C0036.m6243(hVarM3577, strM3332);
        C0047.m7777(mVarM62432);
        C0005.m1628(mVar2, C0064.m9669(mVarM62432));
        m mVarM62433 = C0036.m6243(hVarM3577, C0011.m2805(m206(), 550, 20, 1405));
        C0047.m7777(mVarM62433);
        C0026.m4947(mVar2, C0010.m2339(mVarM62433, C0043.m7290(m206(), 570, 8, 1126)));
        m mVarM8455 = C0053.m8455(C0030.m5333(hVarM3577, C0064.m9599(m206(), 578, 29, 2829)));
        C0047.m7777(mVarM8455);
        C0017.m3671(mVar2, C0064.m9669(mVarM8455));
        ArrayList arrayListM6481 = C0039.m6481(C0030.m5333(hVarM3577, C0041.m6779(m206(), 607, 33, 3064)));
        StringBuilder sb = new StringBuilder();
        Iterator itM7816 = C0047.m7816(arrayListM6481);
        if (C0012.m2962(itM7816)) {
            while (true) {
                C0056.m8896(sb, (CharSequence) C0048.m7949(itM7816));
                if (!C0012.m2962(itM7816)) {
                    break;
                }
                C0056.m8896(sb, C0030.m5362(m206(), 640, 1, 2709));
            }
        }
        C0058.m9085(mVar2, C0047.m7763(sb));
        ArrayList arrayListM5773 = C0032.m5773(C0030.m5333(hVarM3577, C0035.m6131(m206(), 641, 16, 483)), C0061.m9361(m206(), 657, 19, 2963));
        for (int i = 0; i < C0009.m2139(arrayListM5773); i++) {
            C0055.m8716(arrayListM5773, i, C0064.m9640((String) C0028.m5167(arrayListM5773, i)));
        }
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        String strM9106 = C0058.m9106(m206(), 676, 4, 3041);
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator itM78162 = C0047.m7816(arrayListM5773);
        while (true) {
            boolean zM2962 = C0012.m2962(itM78162);
            strM5708 = C0032.m5708(m206(), 680, 2, 2208);
            strM5109 = C0028.m5109(m206(), 682, 5, 2796);
            hVar = hVarM3577;
            strM7657 = C0045.m7657(m206(), 687, 13, 2732);
            mVar = mVar2;
            strM8911 = C0056.m8911(m206(), 700, 12, 2930);
            str = strM2300;
            strM1840 = C0007.m1840();
            if (!zM2962) {
                break;
            }
            String str3 = (String) C0048.m7949(itM78162);
            try {
                if (C0058.m9127(str3, strM5109) || C0058.m9127(str3, strM5708)) {
                    StringBuilder sb4 = new StringBuilder();
                    C0018.m3933(sb4, C0007.m1830(this));
                    C0018.m3933(sb4, C0011.m2805(m206(), 712, 31, 1954));
                    C0018.m3933(sb4, C0051.m8202(str3, C0004.m1549(m206(), 743, 5, 1150)));
                    JsonObject jsonObjectM205 = m205(C0053.m8446(C0032.m5769(C0047.m7763(sb4), C0054.m8644())));
                    String strM200 = m200(m201(m202(m199(jsonObjectM205, strM9106), 0)), strM7657, strM1840);
                    if (!C0058.m9127(strM200, C0046.m7718(m206(), 748, 2, 2519))) {
                        String strM2002 = m200(m201(m202(m199(jsonObjectM205, strM9106), 0)), strM8911, strM1840);
                        C0004.m1532(arrayList, strM200);
                        C0004.m1532(arrayList2, strM2002);
                    }
                }
            } catch (Exception unused) {
            }
            hVarM3577 = hVar;
            mVar2 = mVar;
            strM2300 = str;
        }
        StringBuilder sb5 = new StringBuilder();
        Iterator itM78163 = C0047.m7816(arrayList);
        boolean zM29622 = C0012.m2962(itM78163);
        String strM7290 = C0043.m7290(m206(), 750, 3, 2034);
        if (zM29622) {
            while (true) {
                C0056.m8896(sb5, (CharSequence) C0048.m7949(itM78163));
                if (!C0012.m2962(itM78163)) {
                    break;
                }
                C0056.m8896(sb5, strM7290);
            }
        }
        C0053.m8424(map, strM7657, C0047.m7763(sb5));
        StringBuilder sb6 = new StringBuilder();
        Iterator itM78164 = C0047.m7816(arrayList2);
        if (C0012.m2962(itM78164)) {
            while (true) {
                C0056.m8896(sb6, (CharSequence) C0048.m7949(itM78164));
                if (!C0012.m2962(itM78164)) {
                    break;
                }
                C0056.m8896(sb6, strM7290);
            }
        }
        C0053.m8424(map, strM8911, C0047.m7763(sb6));
        try {
            String[] strArrM4752 = C0024.m4752((String) C0065.m9715(map, strM7657), strM8259);
            String[] strArrM47522 = C0024.m4752((String) C0065.m9715(map, strM8911), strM8259);
            for (String str4 : strArrM4752) {
                C0018.m3933(sb2, C0015.m3446(C0015.m3446(str4, strM5708, C0022.m4403(m206(), 753, 4, 2258)), strM5109, C0039.m6551(m206(), 757, 4, 1758)));
                C0018.m3933(sb2, strM7290);
            }
            int length = strArrM47522.length;
            int i2 = 0;
            while (i2 < length) {
                String[] strArrM47523 = C0024.m4752(strArrM47522[i2], strM76572);
                int length2 = strArrM47523.length;
                int i3 = 0;
                while (i3 < length2) {
                    String[] strArrM47524 = C0024.m4752(strArrM47523[i3], C0061.m9361(m206(), 761, 2, 2902));
                    C0018.m3933(sb3, strArrM47524[0]);
                    C0018.m3933(sb3, C0018.m3917(m206(), 763, 1, 2685));
                    C0018.m3933(sb3, strArrM47524[1]);
                    String str5 = str;
                    C0018.m3933(sb3, str5);
                    C0018.m3933(sb3, C0033.m5819(mVar));
                    C0018.m3933(sb3, str5);
                    C0018.m3933(sb3, strArrM47524[0]);
                    C0018.m3933(sb3, strM76572);
                    i3++;
                    str = str5;
                }
                String str6 = str;
                C0018.m3933(sb3, strM7290);
                i2++;
                str = str6;
            }
        } catch (Exception unused2) {
        }
        C0054.m8596(mVar, C0000.m1096(sb2));
        C0044.m7449(mVar, C0000.m1096(sb3));
        try {
            Iterator itM7807 = C0047.m7807(C0030.m5333(hVar, C0006.m1774(m206(), 764, 16, 2627)));
            while (C0012.m2962(itM7807)) {
                m mVar3 = (m) C0048.m7949(itM7807);
                m mVarM8640 = C0054.m8640(mVar3);
                C0047.m7777(mVarM8640);
                String strM9669 = C0064.m9669(mVarM8640);
                boolean zM9127 = C0058.m9127(strM9669, C0046.m7718(m206(), 780, 2, 663));
                String strM4795 = C0025.m4795(m206(), 782, 1, 3269);
                if (zM9127) {
                    C0058.m9159(mVar, C0063.m9518(C0039.m6481(C0030.m5333(mVar3, strM4795))));
                } else if (C0058.m9127(strM9669, C0061.m9361(m206(), 783, 2, 2639))) {
                    C0058.m9152(mVar, C0063.m9518(C0039.m6481(C0030.m5333(mVar3, strM4795))));
                } else if (C0058.m9127(strM9669, C0025.m4795(m206(), 785, 2, 1217))) {
                    m mVarM62434 = C0036.m6243(mVar3, strM4795);
                    C0047.m7777(mVarM62434);
                    C0022.m4432(mVar, C0064.m9640(C0064.m9669(mVarM62434)));
                } else if (C0058.m9127(strM9669, C0065.m9775(m206(), 787, 2, 3097))) {
                    C0019.m4073(mVar, C0064.m9640(C0064.m9669(mVar3)));
                } else if (C0058.m9127(strM9669, C0035.m6131(m206(), 789, 2, 3145))) {
                    m mVarM62435 = C0036.m6243(mVar3, C0057.m8978(m206(), 791, 7, 2206));
                    C0047.m7777(mVarM62435);
                    C0027.m5000(mVar, C0064.m9640(C0015.m3446(C0064.m9669(mVarM62435), C0012.m2973(m206(), 798, 6, 1477), strM1840)));
                }
            }
        } catch (Exception unused3) {
        }
        return C0053.m8428(mVar);
    }

    public String homeContent(boolean z) {
        ArrayList arrayList = new ArrayList();
        h hVarM3577 = C0016.m3577(C0032.m5769(C0013.m3166(this), C0054.m8644()));
        Iterator itM7807 = C0047.m7807(C0030.m5333(hVarM3577, C0040.m6584(m206(), 804, 9, 1296)));
        while (C0012.m2962(itM7807)) {
            m mVar = (m) C0048.m7949(itM7807);
            Matcher matcherM6026 = C0034.m6026(C0011.m2760(this), C0010.m2339(mVar, C0001.m1189(m206(), 813, 4, 3239)));
            if (C0003.m1405(matcherM6026)) {
                C0004.m1532(arrayList, new b(C0021.m4306(matcherM6026, 1), C0064.m9640(C0064.m9669(mVar)), null));
            }
        }
        return C0025.m4831(arrayList, C0057.m9013(hVarM3577));
    }

    public void init(Context context, String str) {
        this.a = C0003.m1451(str);
    }

    public String playerContent(String str, String str2, List<String> list) {
        String strM3446 = C0015.m3446(C0015.m3446(str, C0063.m9585(m206(), 817, 4, 2006), C0052.m8337(m206(), 821, 2, 3236)), C0024.m4740(m206(), 823, 4, 2011), C0014.m3332(m206(), 827, 5, 3044));
        String[] strArrM4752 = C0024.m4752(str2, C0057.m8978(m206(), 832, 1, 1383));
        String str3 = (strArrM4752.length <= 0 || C0057.m8953(strArrM4752[0])) ? null : strArrM4752[0];
        String strM2827 = C0011.m2827(str3, (strArrM4752.length <= 1 || C0057.m8953(strArrM4752[1])) ? null : strArrM4752[1], (strArrM4752.length <= 2 || C0057.m8953(strArrM4752[2])) ? null : strArrM4752[2]);
        StringBuilder sb = new StringBuilder();
        C0011.m2747(sb, C0065.m9729(this), C0030.m5362(m206(), 833, 6, 534), strM3446, C0060.m9352(m206(), 839, 1, 697));
        C0018.m3933(sb, str3);
        C0018.m3933(sb, C0027.m5062(m206(), 840, 6, 1031));
        C0006.m1736(sb, C0035.m6105(C0035.m6110()));
        JsonArray jsonArrayM199 = m199(m205(C0053.m8446(C0032.m5769(C0047.m7763(sb), null))), C0010.m2300(m206(), 846, 3, 3057));
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < m203(jsonArrayM199); i++) {
            C0004.m1532(arrayList, m204(m202(jsonArrayM199, i)));
        }
        g gVar = new g();
        C0020.m4226(gVar, arrayList);
        C0002.m1282(gVar, strM2827);
        return C0033.m5828(gVar);
    }

    public String searchContent(String str, boolean z) {
        return C0022.m4430(this, str, C0058.m9106(m206(), 849, 1, 922));
    }

    public String searchContent(String str, boolean z, String str2) {
        return C0022.m4430(this, str, str2);
    }
}