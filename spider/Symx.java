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
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.r0.C0059;
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
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public class Symx extends Spider {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f106short = {3030, 3018, 3018, 3022, 3021, 2948, 2961, 2961, 3032, 3031, 3026, 3027, 2960, 3021, 3015, 3027, 3014, 2960, 3037, 3026, 3019, 3036, 3288, 3245, 3283, 3305, 3303, 3310, 1164, 1160, 1167, 390, 396, 408, 397, 2869, 2941, 2868, 2884, 2871, 2887, 2870, 2886, 2865, 2881, 2864, 2880, 2867, 2883, 2866, 2884, 2877, 2887, 2876, 2886, 2029, 1995, 2013, 1994, 1941, 2041, 2015, 2013, 2006, 1996, 1196, 1166, 1179, 1160, 1165, 1165, 1152, 1230, 1236, 1231, 1233, 1217, 1225, 1206, 1160, 1167, 1157, 1166, 1174, 1170, 1217, 1199, 1205, 1217, 1232, 1233, 1231, 1233, 1242, 1217, 1206, 1160, 1167, 1239, 1237, 1242, 1217, 1177, 1239, 1237, 1224, 1217, 1184, 1169, 1169, 1165, 1156, 1206, 1156, 1155, 1194, 1160, 1173, 1230, 1236, 1234, 1238, 1231, 1234, 1239, 1217, 1225, 1194, 1193, 1205, 1196, 1197, 1229, 1217, 1165, 1160, 1162, 1156, 1217, 1190, 1156, 1154, 1162, 1166, 1224, 1217, 1186, 1161, 1171, 1166, 1164, 1156, 1230, 1232, 1235, 1235, 1231, 1233, 1231, 1233, 1231, 1233, 1217, 1202, 1152, 1159, 1152, 1171, 1160, 1230, 1236, 1234, 1238, 1231, 1234, 1239, 412, 1819, 1836, 1839, 1836, 1851, 1836, 1851, 2046, 2012, 2012, 2010, 1999, 1995, 1304, 1289, 1289, 1301, 1296, 1306, 1304, 1293, 1296, 1302, 1303, 1366, 1299, 1290, 1302, 1303, 1365, 1369, 1293, 1308, 1281, 1293, 1366, 1289, 1301, 1304, 1296, 1303, 1365, 1369, 1363, 1366, 1363, 3327, 3210, 3319, 3275, 3270, 3283, 3265, 3272, 3285, 3274, 838, 852, 851, 2719, 2794, 2707, 2734, 2730, 2722, 2740, 2739, 2726, 2730, 2743, 2354, 2327, 2331, 2329, 2345, 2354, 2363, 2376, 2383, 2380, 1345, 1355, 1375, 1354, 1389, 867, 473, 1809, 2693, 1293, 1760, 1372, 1353, 1355, 1281, 2791, 2729, 2744, 2721, 2791, 2734, 2721, 2724, 2725, 2791, 2731, 2729, 2748, 2733, 2735, 2727, 2746, 2737, 2791, 2724, 2721, 2747, 2748, 2807, 2729, 2746, 2733, 2729, 2805, 2798, 2731, 2729, 2748, 2733, 2735, 2727, 2746, 2737, 2689, 2732, 2805, 2316, 2374, 2379, 2372, 2381, 2399, 2379, 2381, 2383, 2327, 2316, 2394, 2379, 2381, 2383, 2404, 2399, 2375, 2327, 1641, 1599, 1582, 1576, 1578, 1564, 1574, 1589, 1578, 1650, 1662, 1658, 1641, 1596, 1568, 1597, 1595, 1650, 1594, 1599, 1579, 1582, 1595, 1578, 1563, 1574, 1570, 1578, 1641, 1590, 1578, 1582, 1597, 1650, 2196, 2193, 2180, 2193, 579, 600, 579, 598, 603, 3072, 3077, 3103, 3096, 1113, 1108, 3039, 3024, 3036, 3028, 687, 675, 698, 681, 702, 416, 421, 433, 436, 417, 432, 390, 417, 436, 417, 416, 422, 505, 439, 422, 447, 505, 432, 447, 442, 443, 505, 434, 435, 418, 439, 447, 442, 489, 447, 434, 491, 2513, 2512, 2498, 2473, 2492, 1635, 1578, 1573, 1568, 1569, 1635, 1576, 1577, 1592, 1581, 1573, 1568, 1530, 1535, 1514, 1535, -30788, 22493, -28691, 25806, 23866, -30418, 1164, 1155, 1167, 1159, 2698, 2694, 2719, 2700, 2715, 2402, 2430, 2426, 2409, 703, 676, 696, 693, 674, 3141, 3143, 3152, 3147, 3158, 1105, 1116, 1095, 1104, 1110, 1089, 1114, 1095, 2023, 2025, 2032, 2039, 2023, 1894, 1901, 1911, 1888, 1891, 1900, 1873, 1889, 1901, 1904, 1895, -30581, 28718, 1271, 1261, 1723, 1703, 1706, 1714, 1671, 1698, 1701, 1710, 1671, 1698, 1720, 1727, 2073, 2053, 2056, 2064, 2060, 2075, 2087, 2056, 2052, 2060, 881, 884, 883, 888, 878, 800, 813, 880, 2341, 2163, 687, 687, 687, 3055, 3042, 17820, 29148, 757, 699, 682, 691, 757, 697, 699, 686, 703, 701, 693, 680, 675, 757, 686, 693, 682, 1462, 1459, 1446, 1459, 576, 591, 579, 587, 1021, 1008, 636, 562, 547, 570, 636, 565, 570, 575, 574, 636, 560, 562, 551, 566, 564, 572, 545, 554, 1182, 1169, 1172, 1173, 1204, 1169, 1163, 1164, 837, 841, 848, 835, 852, 2314, 2305, 2331, 2316, 2319, 2304, 2365, 2317, 2305, 2332, 2315, 2776, 2756, 2756, 2752, 3105, 2967, 2962, 2951, 2962, 1036, 1090, 1107, 1098, 1036, 1104, 1114, 1104, 1111, 1094, 1102, 1036, 1088, 1100, 1101, 1093, 1098, 1092, 2108, 2091, 2110, 2081, 2108, 2106, 2055, 2090, 3160, 3166, 3149, 3151, 3145, 3173, 3144, 2084, 2098, 2084, 2084, 2110, 2104, 2105, 2825, 3022, 2944, 2961, 2952, 3022, 2957, 2952, 2959, 2948, 3022, 2961, 2957, 2944, 2968, 3022, 2961, 2944, 2963, 2962, 2948, 3038, 2957, 2952, 2959, 2948, 2984, 2949, 3036, 1446, 1447, 1461, 1502, 1483, 1359, 1292, 1289, 1294, 1285, 1359, 1296, 1292, 1281, 1305, 1359, 1296, 1281, 1298, 1299, 1285, 1532, 1529, 1516, 1529, -31312, 21969, 25258, 25401, 20791, 20807, 24374, -29918, 2726, 828, 882, 867, 890, 828, 885, 890, 895, 894, 828, 864, 886, 882, 865, 880, 891, 812, 888, 886, 874, 868, 892, 865, 887, 814, 3041, 3040, 3058, 2969, 2956, 2813, 2731, 2746, 2748, 2750, 2709, 2734, 2742, 2790, 1842, 1892, 1909, 1907, 1905, 1863, 1917, 1902, 1905, 1833, 1829, 1828, 2986, 3043, 3052, 3049, 3048, 2986, 3062, 3040, 3044, 3063, 3046, 3053, 3115, 3118, 3131, 3118, 1600, 1605, 1631, 1624, 1351, 1354, 1970, 1981, 1969, 1977, 394, 390, 415, 396, 411, 1667, 1670, 1682, 1687, 1666, 1683, 1701, 1666, 1687, 1666, 1667, 1669, 3096, 3076, 3072, 3091};
    public String a = C0051.m8259(m546(), 0, 22, 3006);
    public String b = C0019.m4107(m546(), 22, 6, 3200);
    public String c = C0024.m4740(m546(), 28, 3, 1276);
    public String d = C0019.m4107(m546(), 31, 4, 501);

    public static String c(JsonObject jsonObject, String str) {
        return (jsonObject == null || !m544(jsonObject, str) || m551(m547(jsonObject, str))) ? C0007.m1840() : m548(m547(jsonObject, str));
    }

    public static String d(String str) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < C0004.m1584(str)) {
            int i2 = i + 2;
            C0062.m9399(sb, (char) (C0007.m1823(C0064.m9599(m546(), 35, 20, 2821), (i / 2) % 20) ^ C0032.m5751(C0054.m8636(str, i, i2), 16)));
            i = i2;
        }
        return C0047.m7763(sb);
    }

    /* renamed from: ۟۟ۡ۟۠, reason: not valid java name and contains not printable characters */
    public static boolean m544(Object obj, Object obj2) {
        if (C0037.m6350() <= 0) {
            return ((JsonObject) obj).has((String) obj2);
        }
        return false;
    }

    /* renamed from: ۟۠ۨۨۢ, reason: not valid java name and contains not printable characters */
    public static JsonArray m545(Object obj, Object obj2) {
        if (C0048.m7971() > 0) {
            return ((JsonObject) obj).getAsJsonArray((String) obj2);
        }
        return null;
    }

    /* renamed from: ۣ۟ۢۢۧ, reason: not valid java name and contains not printable characters */
    public static short[] m546() {
        if (C0051.m8216() <= 0) {
            return f106short;
        }
        return null;
    }

    /* renamed from: ۟ۤ۠ۢۧ, reason: not valid java name and contains not printable characters */
    public static JsonElement m547(Object obj, Object obj2) {
        if (C0044.m7508() <= 0) {
            return ((JsonObject) obj).get((String) obj2);
        }
        return null;
    }

    /* renamed from: ۟ۧ۠۟۠, reason: not valid java name and contains not printable characters */
    public static String m548(Object obj) {
        if (C0062.m9429() >= 0) {
            return ((JsonElement) obj).getAsString();
        }
        return null;
    }

    /* renamed from: ۟ۨۦ۟, reason: not valid java name and contains not printable characters */
    public static int m549(Object obj) {
        if (C0026.m4977() < 0) {
            return ((JsonElement) obj).getAsInt();
        }
        return 0;
    }

    /* renamed from: ۣۡ۠۟, reason: not valid java name and contains not printable characters */
    public static JsonObject m550(Object obj) {
        if (C0000.m1116() <= 0) {
            return AbstractC0308c.i((String) obj);
        }
        return null;
    }

    /* renamed from: ۤۡ۠ۨ, reason: not valid java name and contains not printable characters */
    public static boolean m551(Object obj) {
        if (C0000.m1116() <= 0) {
            return ((JsonElement) obj).isJsonNull();
        }
        return false;
    }

    /* renamed from: ۥۢۤ۠, reason: contains not printable characters */
    public static String m552(Object obj, Object obj2) {
        if (C0018.m3956() >= 0) {
            return c((JsonObject) obj, (String) obj2);
        }
        return null;
    }

    /* renamed from: ۥۦ۠۟, reason: contains not printable characters */
    public static Iterator m553(Object obj) {
        if (C0030.m5375() > 0) {
            return ((JsonArray) obj).iterator();
        }
        return null;
    }

    /* renamed from: ۣۨ۟ۨ, reason: not valid java name and contains not printable characters */
    public static JsonObject m554(Object obj, Object obj2) {
        if (C0050.m8121() < 0) {
            return ((JsonObject) obj).getAsJsonObject((String) obj2);
        }
        return null;
    }

    /* renamed from: ۨۥ۠ۡ, reason: not valid java name and contains not printable characters */
    public static JsonObject m555(Object obj) {
        if (C0034.m6048() <= 0) {
            return ((JsonElement) obj).getAsJsonObject();
        }
        return null;
    }

    public final HashMap a() {
        HashMap mapM4251 = C0020.m4251(C0002.m1305(m546(), 55, 10, 1976), C0036.m6188(m546(), 65, 111, 1249));
        StringBuilder sb = new StringBuilder();
        C0018.m3933(sb, C0008.m2001(this));
        C0018.m3933(sb, C0046.m7718(m546(), 176, 1, 435));
        C0053.m8424(mapM4251, C0015.m3484(m546(), 177, 7, 1865), C0047.m7763(sb));
        C0053.m8424(mapM4251, C0037.m6307(m546(), 184, 6, 1983), C0030.m5362(m546(), 190, 33, 1401));
        C0053.m8424(mapM4251, C0029.m5256(m546(), 223, 10, 3239), C0044.m7509(m546(), 233, 3, 817));
        return mapM4251;
    }

    public final HashMap b(String str) {
        String strM1840;
        HashMap mapM8933 = C0056.m8933(this);
        String strM5627 = C0031.m5627(C0009.m2099());
        String strM8636 = C0054.m8636(strM5627, 0, C0004.m1584(strM5627) - 1);
        int i = 0;
        for (int i2 = 0; i2 < C0019.m4078(strM8636).length; i2++) {
            i += r4[i2] - '0';
        }
        StringBuilder sbM5621 = C0031.m5621(strM8636);
        C0036.m6177(sbM5621, i % 10);
        String strM7763 = C0047.m7763(sbM5621);
        C0053.m8424(mapM8933, C0017.m3646(m546(), 236, 11, 2759), strM7763);
        String strM4582 = C0023.m4582(this);
        String strM7151 = C0042.m7151(m546(), 247, 10, 2426);
        try {
            StringBuilder sb = new StringBuilder(C0015.m3484(m546(), 257, 5, 1330));
            C0018.m3933(sb, C0016.m3592(this));
            String strM77632 = C0047.m7763(sb);
            HashMap map = new HashMap();
            C0053.m8424(map, C0006.m1775('p'), str);
            C0053.m8424(map, C0006.m1775('t'), strM7763);
            C0053.m8424(map, C0006.m1775('s'), strM77632);
            StringBuilder sb2 = new StringBuilder();
            for (char c : C0019.m4078(C0043.m7304(this))) {
                String str2 = (String) C0065.m9715(map, C0006.m1775(c));
                if (str2 != null) {
                    C0018.m3933(sb2, str2);
                }
            }
            String strM3446 = C0015.m3446(C0015.m3446(C0015.m3446(C0047.m7763(sb2), C0051.m8259(m546(), 262, 1, 850), C0028.m5109(m546(), 263, 1, 432)), C0008.m1970(m546(), 264, 1, 1825), C0012.m2973(m546(), 265, 1, 2794)), C0035.m6131(m546(), 266, 1, 1336), C0027.m5062(m546(), 267, 1, 1683));
            Mac macM1732 = C0006.m1732(strM7151);
            String strM3592 = C0016.m3592(this);
            String strM9232 = C0059.m9232();
            C0015.m3454(macM1732, new SecretKeySpec(C0021.m4347(strM3592, strM9232), strM7151));
            byte[] bArrM9338 = C0060.m9338(macM1732, C0021.m4347(strM3446, strM9232));
            StringBuilder sb3 = new StringBuilder();
            for (byte b : bArrM9338) {
                C0018.m3933(sb3, C0002.m1327(C0043.m7290(m546(), 268, 4, 1401), new Object[]{C0011.m2808(b & 255)}));
            }
            strM1840 = C0047.m7763(sb3);
        } catch (Exception unused) {
            strM1840 = C0007.m1840();
        }
        C0053.m8424(mapM8933, strM4582, strM1840);
        return mapM8933;
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        ArrayList arrayList = new ArrayList();
        int iM6456 = C0038.m6456(str2);
        StringBuilder sb = new StringBuilder();
        C0011.m2747(sb, C0008.m2001(this), C0047.m7833(m546(), 272, 41, 2760), str, C0004.m1549(m546(), 313, 19, 2346));
        C0036.m6177(sb, iM6456);
        C0018.m3933(sb, C0035.m6131(m546(), 332, 34, 1615));
        JsonObject jsonObjectM550 = m550(C0032.m5769(C0047.m7763(sb), C0056.m8933(this)));
        String strM1189 = C0001.m1189(m546(), 366, 4, 2288);
        int iM549 = 0;
        if (m544(jsonObjectM550, strM1189)) {
            JsonObject jsonObjectM554 = m554(jsonObjectM550, strM1189);
            if (jsonObjectM554 != null) {
                String strM8574 = C0054.m8574(m546(), 370, 5, 567);
                if (m544(jsonObjectM554, strM8574) && !m551(m547(jsonObjectM554, strM8574))) {
                    iM549 = m549(m547(jsonObjectM554, strM8574));
                }
            }
            String strM9106 = C0058.m9106(m546(), 375, 4, 3180);
            if (m544(jsonObjectM554, strM9106)) {
                Iterator itM553 = m553(m545(jsonObjectM554, strM9106));
                while (C0012.m2962(itM553)) {
                    JsonObject jsonObjectM555 = m555((JsonElement) C0048.m7949(itM553));
                    m mVar = new m();
                    C0011.m2828(mVar, m548(m547(jsonObjectM555, C0036.m6188(m546(), 379, 2, 1072))));
                    C0005.m1628(mVar, m552(jsonObjectM555, C0001.m1189(m546(), 381, 4, 2993)));
                    C0026.m4947(mVar, m552(jsonObjectM555, C0006.m1774(m546(), 385, 5, 716)));
                    C0019.m4073(mVar, m552(jsonObjectM555, C0001.m1189(m546(), 390, 12, 469)));
                    C0004.m1532(arrayList, mVar);
                }
            }
        }
        g gVar = new g();
        C0045.m7632(gVar, arrayList);
        C0049.m7974(gVar, iM6456, (iM549 + 14) / 15, 15, iM549);
        return C0033.m5828(gVar);
    }

    public String detailContent(List<String> list) {
        if (list == null || C0035.m6132(list)) {
            return C0056.m8917(C0013.m3106(m546(), 535, 4, 2982));
        }
        String str = (String) C0048.m7915(list, 0);
        StringBuilder sb = new StringBuilder();
        C0018.m3933(sb, C0008.m2001(this));
        C0018.m3933(sb, C0007.m1842(m546(), 402, 20, 470));
        C0018.m3933(sb, C0051.m8202(str, C0042.m7151(m546(), 422, 5, 2436)));
        JsonObject jsonObjectM550 = m550(C0032.m5769(C0047.m7763(sb), C0063.m9523(this, C0035.m6131(m546(), 427, 12, 1612))));
        String strM6452 = C0038.m6452(m546(), 439, 4, 1438);
        if (!m544(jsonObjectM550, strM6452)) {
            return C0056.m8917(C0024.m4740(m546(), 443, 6, 1035));
        }
        JsonObject jsonObjectM554 = m554(jsonObjectM550, strM6452);
        String strM9775 = C0065.m9775(m546(), 449, 4, 1250);
        String strM552 = m552(jsonObjectM554, strM9775);
        m mVar = new m();
        C0011.m2828(mVar, str);
        C0005.m1628(mVar, strM552);
        C0026.m4947(mVar, m552(jsonObjectM554, C0052.m8337(m546(), 453, 5, 2793)));
        C0022.m4432(mVar, m552(jsonObjectM554, C0047.m7833(m546(), 458, 4, 2331)));
        C0017.m3671(mVar, m552(jsonObjectM554, C0014.m3332(m546(), 462, 5, 720)));
        C0058.m9152(mVar, m552(jsonObjectM554, C0064.m9599(m546(), 467, 5, 3108)));
        C0058.m9159(mVar, m552(jsonObjectM554, C0018.m3917(m546(), 472, 8, 1077)));
        C0027.m5000(mVar, m552(jsonObjectM554, C0052.m8337(m546(), 480, 5, 1925)));
        String strM5522 = m552(jsonObjectM554, C0012.m2973(m546(), 485, 11, 1794));
        if (!C0057.m8953(strM5522)) {
            C0019.m4073(mVar, C0050.m8125(C0022.m4403(m546(), 496, 4, 1229), strM5522));
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        String strM2037 = C0009.m2037(m546(), 500, 12, 1739);
        if (m544(jsonObjectM554, strM2037)) {
            Iterator itM553 = m553(m545(jsonObjectM554, strM2037));
            while (C0012.m2962(itM553)) {
                JsonObject jsonObjectM555 = m555((JsonElement) C0048.m7949(itM553));
                C0004.m1532(arrayList, m552(jsonObjectM555, C0039.m6551(m546(), 512, 10, 2153)));
                ArrayList arrayList3 = new ArrayList();
                String strM4199 = C0020.m4199(m546(), 522, 5, 797);
                if (m544(jsonObjectM555, strM4199)) {
                    Iterator itM5532 = m553(m545(jsonObjectM555, strM4199));
                    while (C0012.m2962(itM5532)) {
                        JsonObject jsonObjectM5552 = m555((JsonElement) C0048.m7949(itM5532));
                        String strM5523 = m552(jsonObjectM5552, strM9775);
                        String strM548 = m548(m547(jsonObjectM5552, C0065.m9775(m546(), 527, 2, 841)));
                        StringBuilder sb2 = new StringBuilder();
                        C0018.m3933(sb2, strM5523);
                        C0018.m3933(sb2, C0015.m3484(m546(), 529, 1, 852));
                        C0018.m3933(sb2, strM548);
                        String strM8131 = C0050.m8131(m546(), 530, 1, 2395);
                        C0018.m3933(sb2, strM8131);
                        C0018.m3933(sb2, strM552);
                        C0018.m3933(sb2, strM8131);
                        C0018.m3933(sb2, strM5523);
                        C0004.m1532(arrayList3, C0047.m7763(sb2));
                    }
                }
                C0004.m1532(arrayList2, C0036.m6194(C0012.m2973(m546(), 531, 1, 2128), arrayList3));
            }
        }
        String strM7290 = C0043.m7290(m546(), 532, 3, 651);
        String strM6194 = C0036.m6194(strM7290, arrayList2);
        C0054.m8596(mVar, C0036.m6194(strM7290, arrayList));
        C0044.m7449(mVar, strM6194);
        return C0053.m8428(mVar);
    }

    public String homeContent(boolean z) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        JsonObject jsonObjectM550 = m550(C0032.m5769(C0028.m5188(new StringBuilder(), C0008.m2001(this), C0037.m6307(m546(), 539, 17, 730)), C0056.m8933(this)));
        String strM3106 = C0013.m3106(m546(), 556, 4, 1490);
        boolean zM544 = m544(jsonObjectM550, strM3106);
        String strM5062 = C0027.m5062(m546(), 560, 4, 558);
        String strM2973 = C0012.m2973(m546(), 564, 2, 916);
        if (zM544) {
            Iterator itM553 = m553(m545(jsonObjectM550, strM3106));
            while (C0012.m2962(itM553)) {
                JsonObject jsonObjectM555 = m555((JsonElement) C0048.m7949(itM553));
                C0004.m1532(arrayList, new b(m548(m547(jsonObjectM555, strM2973)), m548(m547(jsonObjectM555, strM5062)), null));
            }
        }
        JsonObject jsonObjectM5502 = m550(C0032.m5769(C0028.m5188(new StringBuilder(), C0008.m2001(this), C0058.m9106(m546(), 566, 18, 595)), C0056.m8933(this)));
        if (m544(jsonObjectM5502, strM3106)) {
            Iterator itM5532 = m553(m545(jsonObjectM5502, strM3106));
            int i = 0;
            while (C0012.m2962(itM5532)) {
                JsonObject jsonObjectM5552 = m555((JsonElement) C0048.m7949(itM5532));
                String strM6001 = C0034.m6001(m546(), 584, 8, 1272);
                if (m544(jsonObjectM5552, strM6001)) {
                    Iterator itM5533 = m553(m545(jsonObjectM5552, strM6001));
                    while (C0012.m2962(itM5533)) {
                        JsonElement jsonElement = (JsonElement) C0048.m7949(itM5533);
                        if (i >= 30) {
                            break;
                        }
                        JsonObject jsonObjectM5553 = m555(jsonElement);
                        m mVar = new m();
                        C0011.m2828(mVar, m548(m547(jsonObjectM5553, strM2973)));
                        C0005.m1628(mVar, m552(jsonObjectM5553, strM5062));
                        C0026.m4947(mVar, m552(jsonObjectM5553, C0007.m1842(m546(), 592, 5, 806)));
                        C0019.m4073(mVar, m552(jsonObjectM5553, C0047.m7833(m546(), 597, 11, 2414)));
                        C0004.m1532(arrayList2, mVar);
                        i++;
                    }
                }
                if (i >= 30) {
                    break;
                }
            }
        }
        return C0025.m4831(arrayList, arrayList2);
    }

    public void init(Context context, String str) {
        super.init(context, str);
        if (str != null && C0043.m7277(str, C0025.m4795(m546(), 608, 4, 2736))) {
            String strM9640 = C0064.m9640(str);
            this.a = strM9640;
            if (C0060.m9349(strM9640, C0060.m9352(m546(), 612, 1, 3086))) {
                this.a = C0054.m8636(C0008.m2001(this), 0, C0004.m1584(r3) - 1);
            }
        }
        String strM8007 = C0049.m8007(m546(), 613, 4, 3059);
        try {
            StringBuilder sb = new StringBuilder();
            C0018.m3933(sb, C0008.m2001(this));
            C0018.m3933(sb, C0060.m9352(m546(), 617, 18, 1059));
            JsonObject jsonObjectM550 = m550(C0032.m5769(C0047.m7763(sb), C0056.m8933(this)));
            if (m544(jsonObjectM550, strM8007)) {
                JsonObject jsonObjectM554 = m554(jsonObjectM550, strM8007);
                String strM552 = m552(jsonObjectM554, C0050.m8131(m546(), 635, 8, 2126));
                String strM5522 = m552(jsonObjectM554, C0025.m4795(m546(), 643, 7, 3116));
                String strM5523 = m552(jsonObjectM554, C0003.m1398(m546(), 650, 7, 2135));
                if (!C0057.m8953(strM552)) {
                    this.b = C0034.m6013(strM552);
                }
                if (!C0057.m8953(strM5522)) {
                    this.c = C0034.m6013(strM5522);
                }
                if (C0057.m8953(strM5523)) {
                    return;
                }
                this.d = C0034.m6013(strM5523);
            }
        } catch (Exception unused) {
        }
    }

    public String playerContent(String str, String str2, List<String> list) {
        String[] strArrM4752 = C0024.m4752(str2, C0053.m8477(m546(), 657, 1, 2935));
        String strM2827 = C0011.m2827(strArrM4752[0], strArrM4752[1], strArrM4752[2]);
        StringBuilder sb = new StringBuilder();
        C0018.m3933(sb, C0008.m2001(this));
        C0018.m3933(sb, C0043.m7290(m546(), 658, 28, 3041));
        C0018.m3933(sb, C0051.m8202(str2, C0042.m7151(m546(), 686, 5, 1523)));
        String strM552 = m552(m550(C0032.m5769(C0047.m7763(sb), C0063.m9523(this, C0054.m8574(m546(), 691, 16, 1376)))), C0024.m4740(m546(), 707, 4, 1432));
        if (C0057.m8953(strM552)) {
            return C0056.m8917(C0062.m9389(m546(), 711, 8, 1543));
        }
        g gVar = new g();
        C0017.m3667(gVar, strM552);
        C0057.m9029(gVar, C0056.m8933(this));
        C0002.m1282(gVar, strM2827);
        return C0033.m5828(gVar);
    }

    public String searchContent(String str, boolean z) {
        return C0033.m5781(this, str, z, C0014.m3332(m546(), 719, 1, 2711));
    }

    public String searchContent(String str, boolean z, String str2) {
        ArrayList arrayList = new ArrayList();
        int iM6456 = C0038.m6456(str2);
        StringBuilder sb = new StringBuilder();
        C0018.m3933(sb, C0008.m2001(this));
        C0018.m3933(sb, C0025.m4795(m546(), 720, 25, 787));
        C0018.m3933(sb, C0051.m8202(str, C0044.m7509(m546(), 745, 5, 2996)));
        C0018.m3933(sb, C0034.m6001(m546(), 750, 9, 2779));
        C0036.m6177(sb, iM6456);
        C0018.m3933(sb, C0011.m2805(m546(), 759, 12, 1812));
        JsonObject jsonObjectM550 = m550(C0032.m5769(C0047.m7763(sb), C0063.m9523(this, C0044.m7509(m546(), 771, 12, 2949))));
        String strM7833 = C0047.m7833(m546(), 783, 4, 3151);
        if (m544(jsonObjectM550, strM7833)) {
            JsonObject jsonObjectM554 = m554(jsonObjectM550, strM7833);
            String strM9775 = C0065.m9775(m546(), 787, 4, 1580);
            if (m544(jsonObjectM554, strM9775)) {
                Iterator itM553 = m553(m545(jsonObjectM554, strM9775));
                while (C0012.m2962(itM553)) {
                    JsonObject jsonObjectM555 = m555((JsonElement) C0048.m7949(itM553));
                    m mVar = new m();
                    C0011.m2828(mVar, m548(m547(jsonObjectM555, C0004.m1549(m546(), 791, 2, 1326))));
                    C0005.m1628(mVar, m552(jsonObjectM555, C0043.m7290(m546(), 793, 4, 2012)));
                    C0026.m4947(mVar, m552(jsonObjectM555, C0012.m2973(m546(), 797, 5, 489)));
                    C0019.m4073(mVar, m552(jsonObjectM555, C0040.m6584(m546(), 802, 12, 1782)));
                    C0022.m4432(mVar, m552(jsonObjectM555, C0036.m6188(m546(), 814, 4, 3169)));
                    C0004.m1532(arrayList, mVar);
                }
            }
        }
        return C0047.m7783(arrayList);
    }
}