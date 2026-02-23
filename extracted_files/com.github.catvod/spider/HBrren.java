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
import com.github.catvod.spider.merge.f0.C0052;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.r0.C0059;
import com.github.catvod.spider.merge.r0.C0060;
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
import com.github.catvod.spider.p000mergexbpq.x.C0015;
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
public class HBrren extends Spider {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f57short = {1118, 1103, 1103, 1118, 1103, 1110, 28190, 25408, 1240, 1168, 1170, 1155, 1174, 1159, 1159, 1174, 1159, 1182, 1241, 1182, 1177, 1171, 1170, 1167, 1240, 1155, 1166, 1159, 1170, 1201, 1182, 1179, 1155, 1170, 1157, 1185, 1176, 1171, 1211, 1182, 1156, 1155, 1254, 1269, 1250, 1254, 21853, -27427, 570, 550, 546, 561, 2601, 2596, 2605, 2616, 2562, 2612, 2617, 2243, 2258, 2260, 2262, 1859, 1887, 1858, 1860, 27558, 26902, 1594, 1591, 1592, 1585, 2088, 2087, 2090, 2104, 2104, 699, 702, 683, 702, 2535, 2544, 2550, 2554, 2552, 2552, 2544, 2555, 2545, 2506, 2553, 2556, 2534, 2529, 2080, 2105, 2098, 2057, 2111, 2098, 1623, 1614, 1605, 1662, 1615, 1600, 1612, 1604, 1798, 1823, 1812, 1839, 1792, 1817, 1811, 1873, 1864, 1859, 1912, 1877, 1858, 1866, 1862, 1877, 1868, 1876, 879, 807, 805, 820, 801, 816, 816, 801, 816, 809, 878, 809, 814, 804, 805, 824, 879, 822, 815, 804, 772, 805, 820, 801, 809, 812, 1785, 1760, 1771, 1744, 1766, 1771, 2239, 2234, 2223, 2234, 418, 443, 432, 393, 400, 411, 416, 401, 414, 402, 410, 487, 510, 501, 462, 483, 500, 508, 496, 483, 506, 482, 3106, 3131, 3120, 3083, 3125, 3127, 3104, 3131, 3110, 2929, 2920, 2915, 2904, 2915, 2926, 2933, 2914, 2916, 2931, 2920, 2933, 2857, 2864, 2875, 2816, 2876, 2864, 2865, 2859, 2874, 2865, 2859, 431, 438, 445, 390, 425, 437, 440, 416, 390, 437, 432, 426, 429, 1443, 1471, 1458, 1450, 1462, 1441, 1420, 1466, 1469, 1461, 1468, 2115, 2136, 2143, 2119, 2020, 2020, 2020, 2067, 2068, 2058, 2069, 793, 790, 794, 786, 884, 796, 781, 798, 799, 777, 525, 2080, 2087, 2105, 2786, 2809, 2813, 2803, 2808, 2370, 875, 845, 859, 844, 787, 895, 857, 859, 848, 842, 1403, 1407, 1404, 1376, 1376, 1380, 1339, 1319, 1338, 1317, 1312, 1338, 1325, 3030, 3066, 3067, 3041, 3056, 3067, 3041, 3000, 3009, 3052, 3045, 3056, 1466, 1451, 1451, 1463, 1458, 1464, 1466, 1455, 1458, 1460, 1461, 1524, 1443, 1526, 1452, 1452, 1452, 1526, 1469, 1460, 1449, 1462, 1526, 1454, 1449, 1463, 1470, 1461, 1464, 1460, 1471, 1470, 1471, 2037, 2003, 1989, 2002, 1933, 2017, 1991, 1989, 1998, 2004, 402, 432, 421, 438, 435, 435, 446, 496, 490, 497, 495, 511, 503, 392, 438, 433, 443, 432, 424, 428, 511, 401, 395, 511, 494, 495, 497, 495, 484, 511, 392, 400, 392, 489, 491, 502, 511, 414, 431, 431, 435, 442, 392, 442, 445, 404, 438, 427, 496, 490, 492, 488, 497, 492, 489, 511, 503, 404, 407, 395, 402, 403, 499, 511, 435, 438, 436, 442, 511, 408, 442, 444, 436, 432, 502, 511, 412, 439, 429, 432, 434, 442, 496, 494, 495, 486, 497, 495, 497, 495, 497, 495, 511, 396, 446, 441, 446, 429, 438, 496, 490, 492, 488, 497, 492, 489, 1232, 1276, 1277, 1255, 1270, 1277, 1255, 1214, 1223, 1258, 1251, 1270, 3075, 3090, 3090, 3086, 3083, 3073, 3075, 3094, 3083, 3085, 3084, 3149, 3098, 3151, 3093, 3093, 3093, 3151, 3076, 3085, 3088, 3087, 3151, 3095, 3088, 3086, 3079, 3084, 3073, 3085, 3078, 3079, 3078, 3312, 3308, 3309, 3319, 3242, 3297, 3324, 3312, 3297, 3306, 3296, 3241, 3241, 2607, 2600, 2612, 2611, 2561, 2575, 2579, 2324, 2315, 3280, 3293, 3284, 3265, 3309, 3264, 3287, 1501, 1488, 1497, 1484, 1511, 1480, 1476, 1484, 1498, 914, 1426, 1481, 1474, 1424, 1481, 1484, 1475, 1472, 1496, 1419, 1479, 1496, 1472, 1476, 1475, 1482, 1424, 652, 704, 707, 729, 706, 735, 663, 2994, 2997, 2987, 2452, 2433, 2442, 2432, 2458, 1537, 1565, 1565, 1561, 464, 386, 409, 413, 403, 408, 459, 877, 843, 861, 842, 789, 889, 863, 861, 854, 844, 1464, 1464, 1457, 1457, 1456, 2678, 2622, 2620, 2605, 2616, 2601, 2601, 2616, 2601, 2608, 2679, 2608, 2615, 2621, 2620, 2593, 2678, 2607, 2614, 2621, 2569, 2616, 2603, 2602, 2620, 396, 413, 398, 399, 409, 419, 413, 396, 405, 2704, 2699, 2703, 2689, 2698, 2173, 2168, 2157, 2168, 1790, 3023, 3023, 1214, 1257, 1262, 1264, 1214, 1190, 1214, 1204, 1223, 1218, 1214, 1217, 1207, 1205, 1214, 3086, 3161, 3166, 3136, 3086, 3094, 3084, 3086, 3076, 3191, 3186, 3086, 3185, 3079, 3077, 3086, 1448, 1504, 1506, 1523, 1510, 1527, 1527, 1510, 1527, 1518, 1449, 1518, 1513, 1507, 1506, 1535, 1448, 1524, 1506, 1510, 1525, 1508, 1519, 1483, 1518, 1524, 1523, 2182, 2184, 2196, 2202, 2178, 2207, 2185, 2206, 2086, 2091, 2082, 2103, 2082, 2099, 2101, 2103, 2061, 2107, 2102, 1352, 2853, 2848, 2869, 2848, 270, 280, 284, 271, 286, 277, 290, 273, 276, 270, 265, 396, 405, 414, 421, 403, 414, 1544, 1553, 1562, 1569, 1552, 1567, 1555, 1563, 1575, 1598, 1589, 1550, 1569, 1592, 1586, 1482, 1491, 1496, 1507, 1486, 1497, 1489, 1501, 1486, 1495, 1487};
    public String a;
    public final String b;
    public String c;
    public String d;
    public ArrayList e;
    public ArrayList f;

    public HBrren() {
        String strM1840 = C0007.m1840();
        this.a = strM1840;
        this.b = C0041.m6779(m355(), 0, 8, 1087);
        this.c = strM1840;
        this.d = strM1840;
    }

    /* renamed from: ۟۠ۦۧۢ, reason: not valid java name and contains not printable characters */
    public static JsonObject m351(Object obj) {
        if (C0026.m4977() <= 0) {
            return ((JsonElement) obj).getAsJsonObject();
        }
        return null;
    }

    /* renamed from: ۣ۟ۤۦ۟, reason: not valid java name and contains not printable characters */
    public static JsonElement m352(Object obj, Object obj2) {
        if (C0059.m9257() <= 0) {
            return ((JsonObject) obj).get((String) obj2);
        }
        return null;
    }

    /* renamed from: ۟ۥۣۦۣ, reason: not valid java name and contains not printable characters */
    public static JsonObject m353(Object obj, Object obj2) {
        if (C0031.m5628() > 0) {
            return ((JsonObject) obj).getAsJsonObject((String) obj2);
        }
        return null;
    }

    /* renamed from: ۟ۧ۠ۥۡ, reason: not valid java name and contains not printable characters */
    public static Object m354(Object obj, Object obj2, Object obj3) {
        if (C0022.m4497() > 0) {
            return ((Gson) obj).fromJson((String) obj2, (Class) obj3);
        }
        return null;
    }

    /* renamed from: ۟ۧۡۢۦ, reason: not valid java name and contains not printable characters */
    public static short[] m355() {
        if (C0021.m4379() > 0) {
            return f57short;
        }
        return null;
    }

    /* renamed from: ۠ۦۤۥ, reason: not valid java name and contains not printable characters */
    public static String m356(Object obj) {
        if (C0000.m1116() <= 0) {
            return ((JsonElement) obj).getAsString();
        }
        return null;
    }

    /* renamed from: ۤۥۦ, reason: not valid java name and contains not printable characters */
    public static Iterator m357(Object obj) {
        if (C0047.m7837() >= 0) {
            return ((JsonArray) obj).iterator();
        }
        return null;
    }

    /* renamed from: ۦۣۣ, reason: contains not printable characters */
    public static JsonArray m358(Object obj, Object obj2) {
        if (C0001.m1164() <= 0) {
            return ((JsonObject) obj).getAsJsonArray((String) obj2);
        }
        return null;
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        ArrayList arrayList = new ArrayList();
        String strM5188 = C0028.m5188(new StringBuilder(), C0064.m9677(this), C0057.m8978(m355(), 8, 34, 1271));
        String strM7151 = C0042.m7151(m355(), 42, 4, 1159);
        String strM2805 = C0011.m2805(m355(), 46, 2, 1077);
        HashMap mapM4127 = C0019.m4127(strM7151, strM2805, C0023.m4536(m355(), 48, 4, 579), strM2805);
        C0053.m8424(mapM4127, C0046.m7718(m355(), 52, 7, 2653), str);
        C0053.m8424(mapM4127, C0007.m1842(m355(), 59, 4, 2227), str2);
        C0053.m8424(mapM4127, C0037.m6307(m355(), 63, 4, 1840), C0002.m1305(m355(), 67, 2, 3238));
        C0053.m8424(mapM4127, C0027.m5062(m355(), 69, 4, 1622), strM2805);
        C0053.m8424(mapM4127, C0047.m7833(m355(), 73, 5, 2123), strM2805);
        Iterator itM357 = m357(m358((JsonObject) C0033.m5856(C0045.m7651(C0001.m1212(new JSONObject(C0008.m2029(C0003.m1396(strM5188, mapM4127, C0020.m4204(this)))), C0015.m3484(m355(), 78, 4, 735)), C0009.m2083(C0016.m3532(this)), C0009.m2083(C0057.m8986(this))), JsonObject.class), C0002.m1305(m355(), 82, 14, 2453)));
        while (C0012.m2962(itM357)) {
            JsonObject jsonObjectM351 = m351((JsonElement) C0048.m7949(itM357));
            C0004.m1532(arrayList, new m(m356(m352(jsonObjectM351, C0057.m8978(m355(), 96, 6, 2134))), m356(m352(jsonObjectM351, C0022.m4403(m355(), 102, 8, 1569))), m356(m352(jsonObjectM351, C0060.m9352(m355(), 110, 7, 1904))), m356(m352(jsonObjectM351, C0052.m8337(m355(), 117, 11, 1831)))));
        }
        return C0020.m4216(C0011.m2808(C0038.m6456(str2)), C0047.m7818(1, str2), C0011.m2808(20), C0054.m8556(str2, 1, 20), arrayList);
    }

    public String detailContent(List<String> list) {
        String strM7651 = C0045.m7651(C0001.m1212(new JSONObject(C0008.m2029(C0003.m1396(C0028.m5188(new StringBuilder(), C0064.m9677(this), C0006.m1774(m355(), 128, 26, 832)), C0020.m4251(C0032.m5708(m355(), 154, 6, 1679), (String) C0048.m7915(list, 0)), C0020.m4204(this)))), C0024.m4740(m355(), 160, 4, 2267)), C0009.m2083(C0016.m3532(this)), C0009.m2083(C0057.m8986(this)));
        C0012.m2969(C0035.m6087(), strM7651);
        JsonObject jsonObject = (JsonObject) m354(new Gson(), strM7651, JsonObject.class);
        JsonObject jsonObjectM353 = m353(jsonObject, C0051.m8259(m355(), 164, 3, 468));
        String strM356 = m356(m352(jsonObjectM353, C0057.m8978(m355(), 167, 8, 511)));
        StringBuilder sb = new StringBuilder();
        C0018.m3933(sb, C0036.m6189());
        C0018.m3933(sb, m356(m352(jsonObjectM353, C0051.m8259(m355(), 175, 11, 401))));
        String strM7763 = C0047.m7763(sb);
        String strM3562 = m356(m352(jsonObjectM353, C0036.m6188(m355(), 186, 9, 3156)));
        String strM3563 = m356(m352(jsonObjectM353, C0035.m6131(m355(), 195, 12, 2823)));
        StringBuilder sb2 = new StringBuilder();
        C0018.m3933(sb2, C0055.m8703());
        C0018.m3933(sb2, m356(m352(jsonObjectM353, C0055.m8814(m355(), 207, 11, 2911))));
        String strM77632 = C0047.m7763(sb2);
        Iterator itM357 = m357(m358(jsonObject, C0035.m6131(m355(), 218, 13, 473)));
        String strM1840 = C0007.m1840();
        String strM9804 = strM1840;
        while (C0012.m2962(itM357)) {
            JsonObject jsonObjectM351 = m351((JsonElement) C0048.m7949(itM357));
            JsonObject jsonObjectM3532 = m353(jsonObjectM351, C0014.m3332(m355(), 231, 11, 1491));
            StringBuilder sbM5621 = C0031.m5621(strM1840);
            C0018.m3933(sbM5621, C0016.m3579());
            C0018.m3933(sbM5621, m356(m352(jsonObjectM3532, C0004.m1549(m355(), 242, 4, 2096))));
            String strM7290 = C0043.m7290(m355(), 246, 3, 1984);
            C0018.m3933(sbM5621, strM7290);
            strM1840 = C0047.m7763(sbM5621);
            Iterator itM3572 = m357(m358(jsonObjectM351, C0063.m9585(m355(), 249, 4, 2150)));
            while (C0012.m2962(itM3572)) {
                JsonObject jsonObjectM3512 = m351((JsonElement) C0048.m7949(itM3572));
                StringBuilder sbM56212 = C0031.m5621(strM9804);
                String strM2300 = C0010.m2300(m355(), 253, 4, 887);
                C0018.m3933(sbM56212, m356(m352(jsonObjectM3512, strM2300)));
                C0018.m3933(sbM56212, C0020.m4199(m355(), 257, 1, 848));
                C0018.m3933(sbM56212, m356(m352(jsonObjectM3532, C0015.m3484(m355(), 258, 5, 876))));
                String strM6188 = C0036.m6188(m355(), 263, 1, 627);
                C0018.m3933(sbM56212, strM6188);
                C0018.m3933(sbM56212, m356(m352(jsonObjectM3512, C0038.m6452(m355(), 264, 3, 2133))));
                C0018.m3933(sbM56212, strM6188);
                C0018.m3933(sbM56212, strM356);
                C0018.m3933(sbM56212, strM6188);
                C0018.m3933(sbM56212, m356(m352(jsonObjectM3512, strM2300)));
                C0018.m3933(sbM56212, strM6188);
                C0018.m3933(sbM56212, m356(m352(jsonObjectM3512, C0038.m6452(m355(), 267, 5, 2710))));
                C0018.m3933(sbM56212, C0038.m6452(m355(), 272, 1, 2401));
                strM9804 = C0047.m7763(sbM56212);
            }
            strM9804 = C0065.m9804(strM9804, strM7290);
        }
        m mVar = new m();
        C0011.m2828(mVar, (String) C0048.m7915(list, 0));
        C0005.m1628(mVar, strM356);
        C0058.m9152(mVar, strM3562);
        C0027.m5000(mVar, strM77632);
        C0058.m9159(mVar, strM3563);
        C0019.m4073(mVar, strM7763);
        C0054.m8596(mVar, C0000.m1096(strM1840));
        C0044.m7449(mVar, C0000.m1096(strM9804));
        return C0053.m8428(mVar);
    }

    public Map<String, String> getHeaders() {
        HashMap map = new HashMap();
        C0009.m2099();
        C0053.m8424(map, C0029.m5256(m355(), 273, 10, 830), C0041.m6779(m355(), 283, 13, 1300));
        C0053.m8424(map, C0048.m7902(m355(), 296, 12, 2965), C0039.m6551(m355(), 308, 33, 1499));
        return map;
    }

    public Map<String, String> getHeaderss() {
        HashMap map = new HashMap();
        C0009.m2099();
        C0053.m8424(map, C0037.m6307(m355(), 341, 10, 1952), C0017.m3646(m355(), 351, 106, 479));
        C0053.m8424(map, C0003.m1398(m355(), 457, 12, 1171), C0007.m1842(m355(), 469, 33, 3170));
        return map;
    }

    public String homeContent(boolean z) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayListM7177 = C0042.m7177(this);
        ArrayList arrayListM5889 = C0033.m5889(this);
        for (int i = 0; i < C0009.m2139(arrayListM7177); i++) {
            C0004.m1532(arrayList, new b((String) C0028.m5167(arrayListM7177, i), (String) C0028.m5167(arrayListM5889, i), null));
        }
        PrintStream printStreamM6087 = C0035.m6087();
        StringBuilder sb = new StringBuilder(C0042.m7151(m355(), 502, 13, 3204));
        C0018.m3933(sb, C0016.m3532(this));
        C0012.m2969(printStreamM6087, C0047.m7763(sb));
        return C0003.m1448(C0057.m9007(this), null, arrayList);
    }

    public void init(Context context, String str) {
        if (str != null) {
            C0051.m8194(C0035.m6110());
            JSONObject jSONObject = new JSONObject(new String(C0007.m1882(str)));
            String strM1212 = C0001.m1212(jSONObject, C0043.m7290(m355(), 515, 4, 2631));
            this.a = strM1212;
            this.a = C0032.m5769(strM1212, null);
            this.c = C0001.m1212(jSONObject, C0021.m4340(m355(), 519, 3, 2666));
            this.d = C0001.m1212(jSONObject, C0001.m1189(m355(), 522, 2, 2429));
            JSONArray jSONArrayM4333 = C0021.m4333(jSONObject, C0021.m4340(m355(), 524, 7, 3236));
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < C0053.m8396(jSONArrayM4333); i++) {
                C0004.m1532(arrayList, C0025.m4770(jSONArrayM4333, i));
            }
            this.e = arrayList;
            JSONArray jSONArrayM43332 = C0021.m4333(jSONObject, C0056.m8911(m355(), 531, 9, 1449));
            ArrayList arrayList2 = new ArrayList();
            for (int i2 = 0; i2 < C0053.m8396(jSONArrayM43332); i2++) {
                C0004.m1532(arrayList2, C0025.m4770(jSONArrayM43332, i2));
            }
            this.f = arrayList2;
        }
    }

    public String playerContent(String str, String str2, List<String> list) {
        HashMap mapM4251;
        C0036.m6219();
        String[] strArrM4752 = C0024.m4752(str2, C0054.m8574(m355(), 540, 1, 1004));
        String str3 = null;
        String str4 = (strArrM4752.length <= 0 || C0057.m8953(strArrM4752[0])) ? null : strArrM4752[0];
        String str5 = (strArrM4752.length <= 1 || C0057.m8953(strArrM4752[1])) ? null : strArrM4752[1];
        String str6 = (strArrM4752.length <= 2 || C0057.m8953(strArrM4752[2])) ? null : strArrM4752[2];
        String str7 = (strArrM4752.length <= 3 || C0057.m8953(strArrM4752[3])) ? null : strArrM4752[3];
        if (strArrM4752.length > 4 && !C0057.m8953(strArrM4752[4])) {
            str3 = strArrM4752[4];
        }
        StringBuilder sb = new StringBuilder();
        C0018.m3933(sb, C0051.m8217());
        C0018.m3933(sb, C0012.m2973(m355(), 541, 17, 1453));
        C0018.m3933(sb, str6);
        C0018.m3933(sb, C0031.m5565(m355(), 558, 7, 682));
        C0018.m3933(sb, str7);
        String strM7763 = C0047.m7763(sb);
        String strM4403 = C0022.m4403(m355(), 565, 3, 3015);
        if (str4 != null) {
            if (C0058.m9127(str4, C0028.m5109(m355(), 568, 5, 2540))) {
                PrintStream printStreamM6087 = C0035.m6087();
                StringBuilder sb2 = new StringBuilder();
                C0018.m3933(sb2, str4);
                C0018.m3933(sb2, str5);
                C0012.m2969(printStreamM6087, C0047.m7763(sb2));
                g gVar = new g();
                StringBuilder sb3 = new StringBuilder();
                C0018.m3933(sb3, str4);
                C0018.m3933(sb3, str5);
                C0017.m3667(gVar, C0026.m4952(C0047.m7763(sb3)));
                C0006.m1720(gVar, 1);
                C0002.m1282(gVar, strM7763);
                return C0033.m5828(gVar);
            }
            if (C0058.m9127(str4, C0011.m2805(m355(), 573, 4, 1641))) {
                StringBuilder sb4 = new StringBuilder();
                C0018.m3933(sb4, str4);
                C0018.m3933(sb4, str5);
                String strM8911 = C0056.m8911(m355(), 577, 7, 502);
                C0018.m3933(sb4, strM8911);
                C0018.m3933(sb4, str3);
                String strM4952 = C0026.m4952(C0047.m7763(sb4));
                HashMap map = new HashMap();
                C0053.m8424(map, C0040.m6584(m355(), 584, 10, 824), C0044.m7509(m355(), 594, 5, 1409));
                String strM5769 = C0032.m5769(strM4952, map);
                PrintStream printStreamM60872 = C0035.m6087();
                StringBuilder sb5 = new StringBuilder();
                C0018.m3933(sb5, str4);
                C0018.m3933(sb5, str5);
                C0018.m3933(sb5, strM8911);
                C0018.m3933(sb5, str3);
                C0012.m2969(printStreamM60872, C0026.m4952(C0047.m7763(sb5)));
                JSONObject jSONObject = new JSONObject(strM5769);
                if (!C0063.m9499(jSONObject, strM4403)) {
                    g gVar2 = new g();
                    C0017.m3667(gVar2, str5);
                    C0064.m9646(gVar2);
                    C0002.m1282(gVar2, strM7763);
                    return C0033.m5828(gVar2);
                }
                String strM1212 = C0001.m1212(jSONObject, strM4403);
                g gVar3 = new g();
                C0017.m3667(gVar3, strM1212);
                C0006.m1720(gVar3, 0);
                C0002.m1282(gVar3, strM7763);
                return C0033.m5828(gVar3);
            }
        }
        if (str4 == null) {
            g gVar4 = new g();
            C0017.m3667(gVar4, str5);
            C0002.m1282(gVar4, strM7763);
            return C0033.m5828(gVar4);
        }
        String strM5188 = C0028.m5188(new StringBuilder(), C0064.m9677(this), C0041.m6779(m355(), 599, 25, 2649));
        String strM6307 = C0037.m6307(m355(), 624, 9, 508);
        if (str3 != null) {
            mapM4251 = C0020.m4251(strM6307, str4);
            C0053.m8424(mapM4251, strM4403, C0027.m4992(str5, C0009.m2083(C0016.m3532(this)), C0009.m2083(C0057.m8986(this))));
            C0053.m8424(mapM4251, C0050.m8131(m355(), 633, 5, 2788), str3);
        } else {
            mapM4251 = C0020.m4251(strM6307, str4);
            C0053.m8424(mapM4251, strM4403, C0027.m4992(str5, C0009.m2083(C0016.m3532(this)), C0009.m2083(C0057.m8986(this))));
        }
        String strM7651 = C0045.m7651(C0001.m1212(new JSONObject(C0008.m2029(C0003.m1396(strM5188, mapM4251, C0020.m4204(this)))), C0020.m4199(m355(), 638, 4, 2073)), C0009.m2083(C0016.m3532(this)), C0009.m2083(C0057.m8986(this)));
        String strM4951 = C0026.m4951(m355(), 642, 1, 1780);
        String strM1840 = C0007.m1840();
        String strM4800 = C0025.m4800(C0025.m4800(strM7651, strM4951, strM1840), C0042.m7151(m355(), 643, 2, 2963), strM1840);
        Matcher matcherM6026 = C0034.m6026(C0005.m1602(C0032.m5708(m355(), 645, 15, 1180)), strM4800);
        if (C0003.m1405(matcherM6026)) {
            String strM4306 = C0021.m4306(matcherM6026, 1);
            g gVar5 = new g();
            C0017.m3667(gVar5, strM4306);
            C0006.m1720(gVar5, 0);
            C0002.m1282(gVar5, strM7763);
            return C0033.m5828(gVar5);
        }
        Matcher matcherM60262 = C0034.m6026(C0005.m1602(C0024.m4740(m355(), 660, 16, 3116)), strM4800);
        if (C0003.m1405(matcherM60262)) {
            String strM43062 = C0021.m4306(matcherM60262, 1);
            g gVar6 = new g();
            C0017.m3667(gVar6, strM43062);
            C0006.m1720(gVar6, 0);
            C0002.m1282(gVar6, strM7763);
            return C0033.m5828(gVar6);
        }
        g gVar7 = new g();
        C0017.m3667(gVar7, str5);
        C0006.m1720(gVar7, 0);
        C0064.m9646(gVar7);
        C0002.m1282(gVar7, strM7763);
        return C0033.m5828(gVar7);
    }

    public String searchContent(String str, boolean z) {
        ArrayList arrayList = new ArrayList();
        Iterator itM357 = m357(m358((JsonObject) m354(new Gson(), C0045.m7651(C0001.m1212(new JSONObject(C0008.m2029(C0003.m1396(C0028.m5188(new StringBuilder(), C0064.m9677(this), C0024.m4740(m355(), 676, 27, 1415)), C0019.m4127(C0056.m8911(m355(), 703, 8, 2285), str, C0018.m3917(m355(), 711, 11, 2130), C0029.m5256(m355(), 722, 1, 1401)), C0055.m8801(this)))), C0065.m9775(m355(), 723, 4, 2881)), C0009.m2083(C0016.m3532(this)), C0009.m2083(C0057.m8986(this))), JsonObject.class), C0056.m8911(m355(), 727, 11, 381)));
        while (C0012.m2962(itM357)) {
            JsonObject jsonObjectM351 = m351((JsonElement) C0048.m7949(itM357));
            C0004.m1532(arrayList, new m(m356(m352(jsonObjectM351, C0063.m9585(m355(), 738, 6, 506))), m356(m352(jsonObjectM351, C0051.m8259(m355(), 744, 8, 1662))), m356(m352(jsonObjectM351, C0027.m5062(m355(), 752, 7, 1617))), m356(m352(jsonObjectM351, C0010.m2300(m355(), 759, 11, 1468)))));
        }
        return C0047.m7783(arrayList);
    }
}