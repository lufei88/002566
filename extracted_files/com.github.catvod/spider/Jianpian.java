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
import com.github.catvod.spider.merge.Z.C0040;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.b0.C0045;
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

/* loaded from: classes.dex */
public class Jianpian extends Spider {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f77short = {1956, 1976, 1976, 1980, 2038, 2019, 2019, 2040, 1957, 1967, 1954, 1972, 2043, 2018, 1981, 1973, 1958, 1974, 1952, 1956, 2018, 1967, 1955, 1953, 484, 450, 468, 451, 412, 496, 470, 468, 479, 453, 3147, 3144, 3136, 3151, 3153, 3144, 3136, 3151, 3084, 3136, 3151, 3141, 3155, 3150, 3144, 3141, 3086, 3090, 3095, 3089, 2902, 2892, 2909, 2889, 2888, 2900, 2115, 2056, 2060, 2059, 2133, 2125, 2061, 2129, 2172, 2056, 2142, 2126, 2112, 2134, 2114, 2130, 2059, 2173, 2153, 2051, 2175, 2168, 2050, 2132, 2136, 2158, 2114, 2164, 2135, 2139, 2161, 2069, 2155, 2155, 2163, 2171, 2128, 2137, 2126, 2134, 2161, 2131, 2175, 2124, 1508, 1450, 1467, 1442, 1508, 1450, 1467, 1467, 1418, 1470, 1471, 1443, 1416, 1444, 1445, 1453, 1442, 1452, 896, 901, 912, 901, 1225, 1229, 1223, 1252, 1231, 1229, 1217, 1225, 1230, 556, 632, 627, 612, 638, 881, 1036, 1037, 3124, 3170, 3187, 3189, 3191, 3119, 1880, 1814, 1799, 1822, 1880, 1812, 1797, 1794, 1818, 1813, 1880, 1796, 1823, 1816, 1797, 1795, 1851, 1822, 1796, 1795, 1864, 1809, 1812, 1814, 1795, 1810, 1832, 1799, 1822, 1811, 1866, 1582, 1583, 1589, 1151, 1073, 1056, 1081, 1151, 1075, 1058, 1061, 1085, 1074, 1151, 1084, 1081, 1059, 1060, 1135, 1073, 1058, 1077, 1073, 1133, 1120, 1142, 1075, 1073, 1060, 1077, 1079, 1087, 1058, 1065, 1039, 1081, 1076, 1133, 1269, 1191, 1194, 1187, 1206, 1262, 1251, 1269, 1215, 1210, 1214, 1210, 1191, 1262, 1249, 1255, 1269, 1184, 1212, 1185, 1191, 1262, 1251, 1269, 1194, 1206, 1202, 1185, 1262, 1251, 930, 691, 694, 675, 694, 3017, 3028, 3017, 3025, 3032, 1917, 1889, 1889, 1893, 1839, 1850, 1850, 456, 458, 469, 465, 475, 603, 599, 590, 605, 586, 615, 593, 597, 601, 607, 605, 728, 725, 2389, 2393, 2379, 2387, 3159, 3031, 3030, 2987, 3045, 3060, 3053, 2987, 3040, 3041, 3056, 3045, 3053, 3048, 3003, 3047, 3052, 3045, 3050, 3050, 3041, 3048, 3001, 3059, 3045, 3050, 3040, 3051, 3057, 3054, 3053, 3045, 2978, 3056, 3051, 3055, 3041, 3050, 3001, 2978, 3058, 3053, 3040, 3001, 447, 497, 480, 505, 447, 486, 505, 500, 501, 511, 447, 500, 501, 484, 497, 505, 508, 486, 418, 431, 499, 504, 497, 510, 510, 501, 508, 429, 487, 497, 510, 500, 511, 485, 506, 505, 497, 438, 484, 511, 507, 501, 510, 429, 438, 505, 500, 429, 2460, 2457, 2444, 2457, 2667, 2666, 2684, 2668, 2685, 2662, 2687, 2683, 2662, 2656, 2657, 1342, 1330, 1312, 1336, 1622, 1611, 1622, 1614, 1607, 2842, 2822, 2822, 2818, 2888, 2909, 2909, 2619, 2617, 2598, 2594, 2600, 1262, 1250, 1275, 1256, 1279, 1234, 1252, 1248, 1260, 1258, 1256, 1756, 1743, 1752, 1756, 1346, 1374, 1363, 1355, 1374, 1371, 1345, 1350, 756, 2029, 2026, 2036, 1578, 1771, 21590, -31830, 29905, -30847, 2326, 2308, 2304, 2351, 2332, 2329, 2307, 2308, 1920, 2000, 2002, 1990, 1995, 2012, 1929, 2012, 1987, 1950, -29848, 31359, 28921, 23203, 2654, 2654, 2654, 734, 3209, 2007, 2708, 1795, 1794, 30647, 24051, 28838, -29611, 22516, 22417, 27154, 30102, -30448, 29581, 22023, 1479, 1417, 1432, 1409, 1479, 1435, 1412, 1409, 1420, 1421, 1479, 1412, 1409, 1435, 1436, 1495, 1419, 1415, 1420, 1421, 1493, 1437, 1414, 1411, 1414, 1415, 1439, 1414, 1489, 1496, 1499, 1489, 1418, 1502, 1488, 1501, 1502, 1419, 1499, 1417, 1499, 1499, 1496, 1502, 1486, 1432, 1415, 1435, 1463, 1409, 1420, 1493, 1488, 1488, 1486, 1419, 1408, 1417, 1414, 1414, 1421, 1412, 1493, 1439, 1417, 1414, 1420, 1415, 1437, 1410, 1409, 1417, 2382, 2379, 2398, 2379, 2068, 2057, 2068, 2060, 2053, 2428, 2400, 2400, 2404, 2350, 2363, 2363, 2426, 2406, 2427, 2403, 2412, 2400, 2415, 2407, 2402, 1395, 1388, 1396, 1385, 1350, 1392, 1405, 3180, 1596, 1639, 1644, 1598, 1639, 1634, 1645, 1646, 1654, 1573, 1641, 1654, 1646, 1642, 1645, 1636, 1598, 2333, 2385, 2386, 2376, 2387, 2382, 2310, 1370, 1300, 1285, 1308, 1370, 1283, 1351, 1370, 1286, 1296, 1300, 1287, 1302, 1309, 1370, 1283, 1308, 1297, 1296, 1306, 1315, 1351, 1354, 1285, 1300, 1298, 1296, 1352, 1359, 1282, 1292, 1296, 1364, 2918, 2915, 2934, 2915, 2339, 2366, 2339, 2363, 2354, 1564, 1536, 1536, 1540, 1614, 1627, 1627, 408, 410, 389, 385, 395, 384, 396, 405, 390, 401, 444, 394, 398, 386, 388, 390, 1763, 1784, 1767, 1736, 1780, 1782, 1763, 1778, 1776, 1784, 1765, 1774, 1598, 1587, 2457, 545, 557, 575, 551, 3140};
    public String a = C0051.m8259(m459(), 0, 24, 1996);
    public final String b;
    public String c;

    public Jianpian() {
        String strM1840 = C0007.m1840();
        this.b = strM1840;
        this.c = strM1840;
    }

    public static HashMap a() {
        return C0019.m4127(C0015.m3484(m459(), 24, 10, 433), C0052.m8337(m459(), 34, 20, 3105), C0050.m8131(m459(), 54, 6, 2844), C0028.m5109(m459(), 60, 44, 2106));
    }

    /* renamed from: ۟ۢۦۢ۟, reason: not valid java name and contains not printable characters */
    public static JsonArray m447(Object obj, Object obj2) {
        if (C0052.m8320() > 0) {
            return AbstractC0308c.c((JsonObject) obj, (String) obj2);
        }
        return null;
    }

    /* renamed from: ۣ۟ۤۢۨ, reason: not valid java name and contains not printable characters */
    public static String m448(Object obj, Object obj2, Object obj3) {
        if (C0010.m2320() < 0) {
            return AbstractC0308c.f((JsonObject) obj, (String) obj2, (String) obj3);
        }
        return null;
    }

    /* renamed from: ۣ۟ۤۢ۠, reason: not valid java name and contains not printable characters */
    public static JsonObject m449(Object obj, Object obj2) {
        if (C0041.m6823() < 0) {
            return ((JsonObject) obj).getAsJsonObject((String) obj2);
        }
        return null;
    }

    /* renamed from: ۟ۧۤۢۨ, reason: not valid java name and contains not printable characters */
    public static Iterator m450(Object obj) {
        if (C0019.m4065() < 0) {
            return ((JsonArray) obj).iterator();
        }
        return null;
    }

    /* renamed from: ۡۧۤۥ, reason: not valid java name and contains not printable characters */
    public static Object m451(Object obj, Object obj2, Object obj3) {
        if (C0045.m7538() <= 0) {
            return ((Gson) obj).fromJson((String) obj2, (Class) obj3);
        }
        return null;
    }

    /* renamed from: ۣۢۧۢ, reason: not valid java name and contains not printable characters */
    public static JsonObject m452(Object obj) {
        if (C0018.m3956() > 0) {
            return AbstractC0308c.i((String) obj);
        }
        return null;
    }

    /* renamed from: ۢۦۣۤ, reason: not valid java name and contains not printable characters */
    public static JsonObject m453(Object obj) {
        if (C0011.m2755() > 0) {
            return ((JsonElement) obj).getAsJsonObject();
        }
        return null;
    }

    /* renamed from: ۤۡۧ۠, reason: not valid java name and contains not printable characters */
    public static boolean m454(Object obj) {
        if (C0008.m1975() >= 0) {
            return ((JsonArray) obj).isEmpty();
        }
        return false;
    }

    /* renamed from: ۤۢ۟ۡ, reason: not valid java name and contains not printable characters */
    public static String m455(Object obj) {
        if (C0010.m2320() < 0) {
            return ((JsonPrimitive) obj).getAsString();
        }
        return null;
    }

    /* renamed from: ۤۤۤۥ, reason: not valid java name and contains not printable characters */
    public static JsonObject m456(Object obj, Object obj2) {
        if (C0045.m7538() <= 0) {
            return AbstractC0308c.d((JsonObject) obj, (String) obj2);
        }
        return null;
    }

    /* renamed from: ۥۨ۠ۨ, reason: contains not printable characters */
    public static JsonArray m457(Object obj, Object obj2) {
        if (C0063.m9589() < 0) {
            return ((JsonObject) obj).getAsJsonArray((String) obj2);
        }
        return null;
    }

    /* renamed from: ۥۨۤ۠, reason: contains not printable characters */
    public static JsonPrimitive m458(Object obj, Object obj2) {
        if (C0028.m5152() < 0) {
            return ((JsonObject) obj).getAsJsonPrimitive((String) obj2);
        }
        return null;
    }

    /* renamed from: ۨۤۧ۠, reason: not valid java name and contains not printable characters */
    public static short[] m459() {
        if (C0043.m7332() > 0) {
            return f77short;
        }
        return null;
    }

    public void Setimgurl() {
        try {
            StringBuilder sb = new StringBuilder();
            C0018.m3933(sb, C0021.m4372(this));
            C0018.m3933(sb, C0022.m4403(m459(), 104, 18, 1483));
            this.c = m455(m458(m449((JsonObject) m451(new Gson(), C0032.m5769(C0047.m7763(sb), null), JsonObject.class), C0048.m7902(m459(), 122, 4, 996)), C0043.m7290(m459(), 126, 9, 1184)));
        } catch (Exception unused) {
        }
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        String strM8125;
        String strM7763;
        if (C0060.m9349(str, C0023.m4536(m459(), 135, 5, 515))) {
            return C0021.m4300(this, C0024.m4752(str, C0016.m3525(m459(), 140, 1, 862))[0], str2);
        }
        ArrayList arrayList = new ArrayList();
        new HashMap();
        boolean zM9127 = C0058.m9127(str, C0005.m1645(m459(), 141, 2, 1082));
        String strM6131 = C0035.m6131(m459(), 143, 6, 3090);
        if (zM9127) {
            StringBuilder sb = new StringBuilder();
            C0018.m3933(sb, C0021.m4372(this));
            StringBuilder sb2 = new StringBuilder(C0028.m5109(m459(), 149, 31, 1911));
            C0018.m3933(sb2, str);
            C0018.m3933(sb2, strM6131);
            C0018.m3933(sb2, str2);
            C0018.m3933(sb, C0047.m7763(sb2));
            strM7763 = C0047.m7763(sb);
            strM8125 = C0002.m1305(m459(), 180, 3, 1560);
        } else {
            StringBuilder sb3 = new StringBuilder();
            C0018.m3933(sb3, C0021.m4372(this));
            StringBuilder sb4 = new StringBuilder(C0040.m6584(m459(), 183, 35, 1104));
            C0018.m3933(sb4, str);
            C0018.m3933(sb4, strM6131);
            C0018.m3933(sb4, str2);
            C0018.m3933(sb4, C0017.m3646(m459(), 218, 30, 1235));
            C0018.m3933(sb3, C0047.m7763(sb4));
            String strM77632 = C0047.m7763(sb3);
            strM8125 = C0050.m8125(str, C0035.m6131(m459(), 248, 1, 911));
            strM7763 = strM77632;
        }
        Iterator itM450 = m450(m457(m452(C0032.m5769(strM7763, C0030.m5395())), C0065.m9775(m459(), 249, 4, 727)));
        while (C0012.m2962(itM450)) {
            JsonObject jsonObjectM453 = m453((JsonElement) C0048.m7949(itM450));
            String strM455 = m455(m458(jsonObjectM453, C0015.m3484(m459(), 253, 5, 3005)));
            StringBuilder sb5 = new StringBuilder(C0028.m5109(m459(), 258, 7, 1813));
            C0018.m3933(sb5, C0021.m4310(this));
            String strM9106 = C0058.m9106(m459(), 265, 5, 444);
            String strM1840 = C0007.m1840();
            if (m448(jsonObjectM453, strM9106, strM1840) == null) {
                strM9106 = C0051.m8259(m459(), 270, 11, 568);
            }
            C0018.m3933(sb5, m448(jsonObjectM453, strM9106, strM1840));
            String strM77633 = C0047.m7763(sb5);
            StringBuilder sbM5621 = C0031.m5621(strM8125);
            C0018.m3933(sbM5621, m455(m458(jsonObjectM453, C0056.m8911(m459(), 281, 2, 689))));
            C0055.m8732(C0047.m7763(sbM5621), strM455, strM77633, m448(jsonObjectM453, C0057.m8978(m459(), 283, 4, 2360), strM1840), arrayList);
        }
        return C0020.m4216(C0011.m2808(C0038.m6456(str2)), C0047.m7818(1, str2), C0011.m2808(24), C0011.m2808(Integer.MAX_VALUE), arrayList);
    }

    public String detailContent(List<String> list) {
        StringBuilder sb;
        String str;
        String strM2300;
        String strM9389;
        String[] strArrM4752 = C0024.m4752((String) C0048.m7915(list, 0), C0021.m4340(m459(), 287, 1, 3194));
        if (C0058.m9127(strArrM4752[0], C0007.m1842(m459(), 288, 2, 3041))) {
            sb = new StringBuilder();
            C0018.m3933(sb, C0021.m4372(this));
            C0018.m3933(sb, C0041.m6779(m459(), 290, 41, 2948));
            str = strArrM4752[1];
        } else {
            sb = new StringBuilder();
            C0018.m3933(sb, C0021.m4372(this));
            C0018.m3933(sb, C0025.m4795(m459(), 331, 48, 400));
            str = strArrM4752[1];
        }
        C0018.m3933(sb, str);
        JsonObject jsonObjectM456 = m456(m452(C0032.m5769(C0047.m7763(sb), C0030.m5395())), C0050.m8131(m459(), 379, 4, 2552));
        m mVar = new m();
        StringBuilder sb2 = new StringBuilder();
        C0018.m3933(sb2, C0055.m8703());
        String strM5565 = C0031.m5565(m459(), 383, 11, 2575);
        String strM1840 = C0007.m1840();
        C0018.m3933(sb2, m448(jsonObjectM456, strM5565, strM1840));
        C0027.m5000(mVar, C0047.m7763(sb2));
        StringBuilder sb3 = new StringBuilder();
        C0018.m3933(sb3, C0036.m6189());
        C0018.m3933(sb3, m448(jsonObjectM456, C0029.m5256(m459(), 394, 4, 1363), strM1840));
        C0019.m4073(mVar, C0047.m7763(sb3));
        String strM4199 = C0020.m4199(m459(), 398, 5, 1570);
        C0005.m1628(mVar, m448(jsonObjectM456, strM4199, strM1840));
        StringBuilder sb4 = new StringBuilder(C0055.m8814(m459(), 403, 7, 2930));
        C0018.m3933(sb4, C0021.m4310(this));
        String strM93892 = C0062.m9389(m459(), 410, 5, 2639);
        if (m448(jsonObjectM456, strM93892, strM1840) == null) {
            strM93892 = C0024.m4740(m459(), 415, 11, 1165);
        }
        C0018.m3933(sb4, m448(jsonObjectM456, strM93892, strM1840));
        C0026.m4947(mVar, C0047.m7763(sb4));
        C0017.m3671(mVar, m448(jsonObjectM456, C0012.m2973(m459(), 426, 4, 1725), strM1840));
        C0055.m8715(C0035.m6110(), m448(jsonObjectM456, strM4199, strM1840));
        JsonArray jsonArrayM447 = m447(jsonObjectM456, C0063.m9585(m459(), 430, 8, 1330));
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator itM450 = m450(jsonArrayM447);
        while (true) {
            boolean zM2962 = C0012.m2962(itM450);
            strM2300 = C0010.m2300(m459(), 438, 1, 650);
            strM9389 = C0062.m9389(m459(), 439, 3, 1944);
            if (!zM2962) {
                break;
            }
            JsonObject jsonObjectM453 = m453((JsonElement) C0048.m7949(itM450));
            StringBuilder sb5 = new StringBuilder();
            C0018.m3933(sb5, m448(jsonObjectM453, strM4199, strM1840));
            C0018.m3933(sb5, C0014.m3332(m459(), 442, 1, 1550));
            C0018.m3933(sb5, m448(jsonObjectM453, strM9389, strM1840));
            C0018.m3933(sb5, strM2300);
            C0018.m3933(sb5, m448(jsonObjectM453, strM4199, strM1840));
            C0004.m1532(arrayList3, C0047.m7763(sb5));
        }
        boolean zM454 = m454(jsonArrayM447);
        String strM6307 = C0037.m6307(m459(), 443, 1, 1736);
        if (!zM454) {
            C0004.m1532(arrayList, C0011.m2805(m459(), 444, 4, 2670));
            C0004.m1532(arrayList2, C0036.m6194(strM6307, arrayList3));
        }
        JsonArray jsonArrayM4472 = m447(jsonObjectM456, C0007.m1842(m459(), 448, 8, 2416));
        ArrayList arrayList4 = new ArrayList();
        Iterator itM4502 = m450(jsonArrayM4472);
        while (C0012.m2962(itM4502)) {
            JsonObject jsonObjectM4532 = m453((JsonElement) C0048.m7949(itM4502));
            StringBuilder sb6 = new StringBuilder();
            C0018.m3933(sb6, m448(jsonObjectM4532, strM4199, strM1840));
            C0018.m3933(sb6, C0000.m1077(m459(), 456, 10, 1956));
            C0018.m3933(sb6, m448(jsonObjectM4532, strM9389, strM1840));
            C0018.m3933(sb6, strM2300);
            C0018.m3933(sb6, m448(jsonObjectM4532, strM4199, strM1840));
            C0004.m1532(arrayList4, C0047.m7763(sb6));
        }
        if (!m454(jsonArrayM4472)) {
            C0004.m1532(arrayList, C0035.m6131(m459(), 466, 4, 2104));
            C0004.m1532(arrayList2, C0036.m6194(strM6307, arrayList4));
        }
        String strM8814 = C0055.m8814(m459(), 470, 3, 2682);
        C0054.m8596(mVar, C0036.m6194(strM8814, arrayList));
        C0044.m7449(mVar, C0036.m6194(strM8814, arrayList2));
        return C0053.m8428(mVar);
    }

    public String homeContent(boolean z) {
        ArrayList arrayList = new ArrayList();
        List listM1203 = C0001.m1203(new String[]{C0047.m7833(m459(), 473, 1, 751), C0027.m5062(m459(), 474, 1, 3259), C0048.m7902(m459(), 475, 1, 2020), C0042.m7151(m459(), 476, 1, 2720), C0009.m2037(m459(), 477, 2, 1845)});
        List listM12032 = C0001.m1203(new String[]{C0058.m9106(m459(), 479, 2, 642), C0055.m8814(m459(), 481, 3, 1427), C0060.m9352(m459(), 484, 2, 1337), C0004.m1549(m459(), 486, 2, 2922), C0045.m7657(m459(), 488, 2, 1120)});
        for (int i = 0; i < C0064.m9636(listM1203); i++) {
            C0004.m1532(arrayList, new b((String) C0048.m7915(listM1203, i), (String) C0048.m7915(listM12032, i), null));
        }
        return C0003.m1448(C0047.m7758(this), null, arrayList);
    }

    public String homeVideoContent() {
        ArrayList arrayList = new ArrayList();
        Iterator itM450 = m450(m457((JsonObject) C0033.m5856(C0032.m5769(C0028.m5188(new StringBuilder(), C0021.m4372(this), C0028.m5109(m459(), 490, 72, 1512)), C0030.m5395()), JsonObject.class), C0017.m3646(m459(), 562, 4, 2346)));
        while (C0012.m2962(itM450)) {
            JsonObject jsonObjectM453 = m453((JsonElement) C0048.m7949(itM450));
            String strM455 = m455(m458(jsonObjectM453, C0045.m7657(m459(), 566, 5, 2144)));
            StringBuilder sb = new StringBuilder(C0028.m5109(m459(), 571, 7, 2324));
            C0018.m3933(sb, C0021.m4310(this));
            C0018.m3933(sb, m455(m458(jsonObjectM453, C0022.m4403(m459(), 578, 9, 2318))));
            C0032.m5685(m455(m458(jsonObjectM453, C0052.m8337(m459(), 587, 7, 1305))), strM455, C0047.m7763(sb), arrayList);
        }
        return C0047.m7783(arrayList);
    }

    public void init(Context context, String str) {
        this.a = str;
        C0020.m4259(this);
    }

    public String playerContent(String str, String str2, List<String> list) {
        C0036.m6219();
        String[] strArrM4752 = C0024.m4752(str2, C0062.m9389(m459(), 594, 1, 3090));
        String str3 = null;
        String str4 = (strArrM4752.length <= 0 || C0057.m8953(strArrM4752[0])) ? null : strArrM4752[0];
        if (strArrM4752.length > 1 && !C0057.m8953(strArrM4752[1])) {
            str3 = strArrM4752[1];
        }
        StringBuilder sb = new StringBuilder();
        C0018.m3933(sb, C0051.m8217());
        C0018.m3933(sb, C0016.m3525(m459(), 595, 17, 1539));
        String strM6434 = C0038.m6434(sb, C0002.m1316(C0035.m6110()), C0008.m1970(m459(), 612, 7, 2363), str3);
        g gVar = new g();
        C0017.m3667(gVar, str4);
        C0002.m1282(gVar, strM6434);
        C0057.m9029(gVar, C0030.m5395());
        return C0033.m5828(gVar);
    }

    public String searchContent(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        C0011.m2747(sb, C0021.m4372(this), C0016.m3525(m459(), 619, 28, 1397), str2, C0000.m1077(m459(), 647, 5, 1385));
        C0018.m3933(sb, C0056.m8909(str));
        Iterator itM450 = m450(m457(m452(C0032.m5769(C0047.m7763(sb), C0030.m5395())), C0001.m1189(m459(), 652, 4, 2818)));
        while (C0012.m2962(itM450)) {
            JsonObject jsonObjectM453 = m453((JsonElement) C0048.m7949(itM450));
            String strM455 = m455(m458(jsonObjectM453, C0010.m2300(m459(), 656, 5, 2391)));
            StringBuilder sb2 = new StringBuilder(C0018.m3917(m459(), 661, 7, 1652));
            C0018.m3933(sb2, C0021.m4310(this));
            String strM4340 = C0021.m4340(m459(), 668, 5, 492);
            String strM1840 = C0007.m1840();
            if (m448(jsonObjectM453, strM4340, strM1840) == null) {
                strM4340 = C0016.m3525(m459(), 673, 11, 483);
            }
            C0018.m3933(sb2, m448(jsonObjectM453, strM4340, strM1840));
            String strM7763 = C0047.m7763(sb2);
            JsonObject jsonObjectM456 = m456(jsonObjectM453, C0018.m3917(m459(), 684, 12, 1687));
            String strM5256 = C0029.m5256(m459(), 696, 2, 1623);
            StringBuilder sbM3016 = C0012.m3016(m448(jsonObjectM456, strM5256, strM1840), C0024.m4740(m459(), 698, 1, 2484));
            C0018.m3933(sbM3016, m455(m458(jsonObjectM453, strM5256)));
            C0055.m8732(C0047.m7763(sbM3016), strM455, strM7763, m448(jsonObjectM453, C0045.m7657(m459(), 699, 4, 588), strM1840), arrayList);
        }
        return C0047.m7783(arrayList);
    }

    public String searchContent(String str, boolean z) {
        return C0021.m4300(this, str, C0049.m8007(m459(), 703, 1, 3189));
    }

    public String searchContent(String str, boolean z, String str2) {
        return C0021.m4300(this, str, str2);
    }
}