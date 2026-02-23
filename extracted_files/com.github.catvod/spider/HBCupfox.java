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
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.T0.h;
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
import com.github.catvod.spider.merge.r0.C0059;
import com.github.catvod.spider.merge.r0.C0060;
import com.github.catvod.spider.merge.t.C0061;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.merge.z.C0065;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
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
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public class HBCupfox extends Spider {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f26short = {992, 1020, 1020, 1016, 1019, 946, 935, 935, 1023, 1023, 1023, 934, 1003, 1021, 1016, 1006, 999, 1008, 934, 1001, 993, 3158, 3085, 3072, 3081, 3100, 3158, 3153, 3109, 3101, 3154, 3152, 3109, 3159, 3089, 3085, 3092, 3093, 1245, 1163, 1164, 1243, 2874, 2866, 2818, 2845, 2909, 2879, 2878, 2907, 2856, 2906, 2827, 2899, 2817, 2875, 2862, 2849, 2864, 2841, 2816, 2851, 2859, 2873, 2823, 2853, 2831, 2832, 2834, 2867, 2861, 2910, 2857, 2850, 2821, 2911, 2848, 2835, 2828, 2829, 2904, 2824, 2898, 2860, 2854, 2842, 2863, 2844, 2872, 2840, 2905, 2877, 2846, 2876, 2820, 2822, 2843, 2855, 2819, 2830, 2847, 2908, 2825, 2852, 605, 518, 523, 514, 535, 605, 2327, 1292, 1354, 1366, 1359, 1358, 802, 772, 786, 773, 858, 822, 784, 786, 793, 771, 1442, 1408, 1429, 1414, 1411, 1411, 1422, 1472, 1498, 1473, 1503, 1487, 1479, 1464, 1414, 1409, 1419, 1408, 1432, 1436, 1487, 1441, 1467, 1487, 1502, 1503, 1473, 1503, 1492, 1487, 1464, 1414, 1409, 1497, 1499, 1492, 1487, 1431, 1497, 1499, 1478, 1487, 1454, 1439, 1439, 1411, 1418, 1464, 1418, 1421, 1444, 1414, 1435, 1472, 1498, 1500, 1496, 1473, 1500, 1497, 1487, 1479, 1444, 1447, 1467, 1442, 1443, 1475, 1487, 1411, 1414, 1412, 1418, 1487, 1448, 1418, 1420, 1412, 1408, 1478, 1487, 1452, 1415, 1437, 1408, 1410, 1418, 1472, 1502, 1501, 1501, 1473, 1503, 1473, 1503, 1473, 1503, 1487, 1468, 1422, 1417, 1422, 1437, 1414, 1472, 1498, 1500, 1496, 1473, 1500, 1497, 3006, 3110, 3089, 3090, 3089, 3078, 3089, 3078, 681, 2595, 2682, 2661, 2598, 2596, 2621, 2594, 2606, 2662, 2623, 2594, 2623, 2599, 2606, 1292, 1362, 1357, 1361, 1366, 1351, 1360, 1282, 1355, 1359, 1349, 3076, 3077, 3092, 2812, 2784, 2784, 2788, 504, 421, 419, 443, 443, 439, 420, 431, 504, 434, 435, 418, 439, 447, 442, 421, 386, 430, 418, 1625, 1554, 1556, 1539, 1560, 1552, 1552, 1945, 1988, 2004, 1989, 2008, 2011, 2011, 1946, 2004, 2008, 2009, 1987, 2002, 2009, 1987, 1943, 2006, 3022, 3062, 3049, 2982, 3055, 2215, 2272, 2279, 2287, 2278, 2212, 2285, 2280, 2301, 2280, 24369, 27609, 1185, 28248, 21780, 729, 647, 667, 662, 654, 680, 644, 664, 642, 645, 660, 658, 680, 643, 662, 661, 727, 729, 644, 640, 670, 647, 658, 645, 730, 644, 667, 670, 659, 658, 1318, 1400, 1380, 1385, 1393, 1367, 1380, 1377, 1403, 1404, 1367, 1386, 1383, 1392, 1559, 1626, 1622, 1623, 1613, 1628, 1623, 1613, 1638, 1609, 1621, 1624, 1600, 1621, 1616, 1610, 1613, 1561, 1621, 1616, 1561, 1624, 1311, 1285, 1298, 1297, 3147, 1064, 1131, 1129, 1136, 1135, 1123, 1067, 1130, 1135, 1141, 1138, 1067, 1135, 1138, 1123, 1131, 2848, 1255, 1157, 1192, 1203, 1200, 2333, 2398, 2396, 2373, 2394, 2390, 2334, 2394, 2375, 2390, 2398, 2334, 2397, 2396, 2375, 2390, 2152, 2091, 2089, 2096, 2095, 2083, 2155, 2095, 2098, 2083, 2091, 2155, 2101, 2085, 2089, 2100, 2083, 2619, 2598, 2619, 2595, 2602, 1733, 1759, 1736, 1739, 1896, 1901, 1912, 1901, 1825, 1891, 1918, 1893, 1899, 1893, 1890, 1901, 1888, 2960, 2956, 2956, 2952, 3154, 3165, 3146, 3090, 3166, 3153, 3089, 3157, 3144, 3161, 3153, 3089, 3152, 3157, 3151, 3144, 3100, 3165, 2967, 2957, 2970, 2969, 1529, 1466, 1464, 1461, 1470, 1467, 1458, 1530, 1466, 1462, 1470, 1465, 1527, 1529, 1447, 1462, 1465, 1458, 1467, 432, 490, 511, 508, 435, 509, 497, 496, 490, 507, 496, 490, 2467, 2528, 2530, 2555, 2532, 2536, 2464, 2529, 2532, 2558, 2553, 2464, 2532, 2553, 2536, 2528, 1557, 3089, 3187, 3166, 3141, 3142, 860, 799, 797, 772, 795, 791, 863, 795, 774, 791, 799, 863, 796, 797, 774, 791, 774, 837, 839, 862, 833, 845, 773, 833, 860, 845, 837, 773, 859, 843, 839, 858, 845, 2506, 2519, 2506, 2514, 2523, 3011, 3033, 3022, 3021, 1612, 1609, 1628, 1609, 1541, 1607, 1626, 1601, 1615, 1601, 1606, 1609, 1604, 2381, 2385, 2385, 2389, 557, 554, 564, 565, 567, 572, 573, 2673, 2676, 2657, 2676, 882, 894, 885, 884, 1280, 1314, 1335, 1316, 1313, 1313, 1324, 1378, 1400, 1379, 1405, 1389, 1381, 1306, 1316, 1315, 1321, 1314, 1338, 1342, 1389, 1283, 1305, 1389, 1404, 1405, 1379, 1405, 1398, 1389, 1306, 1316, 1315, 1403, 1401, 1398, 1389, 1333, 1403, 1401, 1380, 1389, 1292, 1341, 1341, 1313, 1320, 1306, 1320, 1327, 1286, 1316, 1337, 1378, 1400, 1406, 1402, 1379, 1406, 1403, 1389, 1381, 1286, 1285, 1305, 1280, 1281, 1377, 1389, 1313, 1316, 1318, 1320, 1389, 1290, 1320, 1326, 1318, 1314, 1380, 1389, 1294, 1317, 1343, 1314, 1312, 1320, 1378, 1404, 1407, 1407, 1379, 1405, 1379, 1405, 1379, 1405, 1389, 1310, 1324, 1323, 1324, 1343, 1316, 1378, 1400, 1406, 1402, 1379, 1406, 1403, 2034, 2004, 1986, 2005, 1930, 2022, 1984, 1986, 1993, 2003, 1023, 1081, 1127, 1147, 1142, 1134, 1138, 1125, 1082, 1151, 1138, 1150, 1136, 1151, 1123, 1079, 1124, 1140, 1125, 1150, 1127, 1123, 2510, 2505, 2519, 3126, 3114, 3111, 3135, 3107, 3124, 3097, 3111, 3111, 3111, 3111, 3109, 3090, 3089, 3090, 3077, 3090, 3077, 2730, 2787, 2794, 2813, 2805, 2793, 2788, 2812, 2730, 2792, 2800, 2796, 2805, 2793, 2788, 2812, 2784, 2807, 2731, 2805, 2797, 2805, 2746, 2803, 2796, 2785, 2744, 1757, 1760, 1787, 1781, 1787, 1788, 728, 685, 722, 741, 753, 757, 741, 755, 756, 741, 740, 685, 727, 745, 756, 744, 487, 498, 499, 503, 459, 459, 463, 493, 474, 462, 458, 474, 460, 459, 915, 908, 897, 787, 858, 851, 836, 844, 848, 861, 837, 787, 861, 844, 853, 786, 844, 852, 844, 1664, 2893, 3175, 3131, 3117, 3113, 3130, 3115, 3104, 3175, 3044, 3045, 3063, 2972, 2953, 1809, 1809, 1809, 1809, 1809, 1809, 1809, 1809, 1809, 1809, 1594, 1594, 1594, 1593, 1663, 1635, 1658, 1659, 2450, 2506, 2515, 2520, 2449, 2511, 2521, 2525, 2510, 2527, 2516, 2449, 2512, 2517, 2511, 2504, 2460, 2450, 2526, 2515, 2500, 3148, 3075, 3150, 3138, 3163, 3144, 3167, 3072, 3137, 3140, 3139, 3142, 1835, 1865, 1892, 1919, 1916, 1314, 1377, 1379, 1402, 1381, 1385, 1313, 1400, 1381, 1400, 1376, 1385, 487, 420, 422, 447, 416, 428, 484, 416, 445, 428, 420, 484, 423, 422, 445, 428, 3263, 3324, 3316, 3301, 3312, 3263, 3318, 3316, 3301, 3326, 3297, 1640, 1650, 
    1637, 1638, 2503, 2498, 2519, 2498, 2446, 2508, 2513, 2506, 2500, 2506, 2509, 2498, 2511, 1180, 1152, 1152, 1156};
    public String a = C0042.m7151(m167(), 0, 21, 904);
    public final Pattern b = C0005.m1602(C0019.m4107(m167(), 21, 17, 3193));

    class Decode1 {

        /* renamed from: short, reason: not valid java name */
        private static final short[] f27short = {321, 1258, 1275, 1261, 1258};

        /* JADX WARN: Code restructure failed: missing block: B:12:0x0045, code lost:
        
            r3 = com.github.catvod.spider.merge.Z.C0038.m6456((java.lang.String) com.github.catvod.spider.merge.b0.C0045.m7624(r5));
         */
        /* JADX WARN: Removed duplicated region for block: B:20:0x006e  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static java.lang.String a(com.google.gson.JsonObject r59, com.google.gson.JsonObject r60, java.lang.String r61) {
            /*
                r10 = r61
                r9 = r60
                r8 = r59
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r1 = 0
            Lc:
                int r2 = com.github.catvod.spider.p000mergexbpq.S.C0004.m1584(r10)
                if (r1 >= r2) goto L74
                char r2 = com.github.catvod.spider.p000mergexbpq.a0.C0007.m1823(r10, r1)
                boolean r3 = com.github.catvod.spider.merge.i0.C0055.m8799(r2)
                if (r3 == 0) goto L6e
                java.lang.String r3 = com.github.catvod.spider.merge.i0.C0055.m8763(r2)
                java.util.Set r4 = m169(r8)
                java.util.Iterator r4 = com.github.catvod.spider.merge.S0.C0029.m5199(r4)
            L28:
                boolean r5 = com.github.catvod.spider.p000mergexbpq.i.C0012.m2962(r4)
                r6 = -1
                if (r5 == 0) goto L51
                java.lang.Object r5 = com.github.catvod.spider.merge.d0.C0048.m7949(r4)
                java.util.Map$Entry r5 = (java.util.Map.Entry) r5
                java.lang.Object r7 = com.github.catvod.spider.merge.Z.C0039.m6540(r5)
                com.google.gson.JsonElement r7 = (com.google.gson.JsonElement) r7
                java.lang.String r7 = m170(r7)
                boolean r7 = com.github.catvod.spider.p000mergexbpq.a0.C0007.m1815(r7, r3)
                if (r7 == 0) goto L28
                java.lang.Object r3 = com.github.catvod.spider.merge.b0.C0045.m7624(r5)     // Catch: java.lang.NumberFormatException -> L50
                java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.NumberFormatException -> L50
                int r3 = com.github.catvod.spider.merge.Z.C0038.m6456(r3)     // Catch: java.lang.NumberFormatException -> L50
                goto L52
            L50:
            L51:
                r3 = -1
            L52:
                if (r3 == r6) goto L6e
                java.lang.String r4 = com.github.catvod.spider.merge.h.C0054.m8599(r3)
                boolean r4 = m175(r9, r4)
                if (r4 == 0) goto L6e
                java.lang.String r2 = com.github.catvod.spider.merge.h.C0054.m8599(r3)
                com.google.gson.JsonElement r2 = m172(r9, r2)
                java.lang.String r2 = m170(r2)
                com.github.catvod.spider.merge.F0.C0018.m3933(r0, r2)
                goto L71
            L6e:
                com.github.catvod.spider.merge.v.C0062.m9399(r0, r2)
            L71:
                int r1 = r1 + 1
                goto Lc
            L74:
                java.lang.String r8 = com.github.catvod.spider.merge.d.C0047.m7763(r0)
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.HBCupfox.Decode1.a(com.google.gson.JsonObject, com.google.gson.JsonObject, java.lang.String):java.lang.String");
        }

        public static String b(String str) {
            String strM1840 = C0007.m1840();
            String strM9599 = C0064.m9599(m174(), 0, 1, 366);
            try {
                String strM9438 = C0062.m9438(str);
                String strM4413 = C0022.m4413(C0033.m5852(m174(), 1, 4, 1182));
                int iM1584 = C0004.m1584(strM4413);
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < C0004.m1584(strM9438); i++) {
                    C0062.m9399(sb, (char) (C0007.m1823(strM4413, i % iM1584) ^ C0007.m1823(strM9438, i)));
                }
                String[] strArrM4752 = C0024.m4752(C0062.m9438(C0047.m7763(sb)), strM9599);
                if (strArrM4752.length < 3) {
                    return strM1840;
                }
                String str2 = strArrM4752[0];
                String str3 = strArrM4752[1];
                CharSequence[] charSequenceArr = (CharSequence[]) C0024.m4732(strArrM4752, 2, strArrM4752.length);
                StringBuilder sb2 = new StringBuilder();
                if (charSequenceArr.length > 0) {
                    C0056.m8896(sb2, charSequenceArr[0]);
                    for (int i2 = 1; i2 < charSequenceArr.length; i2++) {
                        C0056.m8896(sb2, strM9599);
                        C0056.m8896(sb2, charSequenceArr[i2]);
                    }
                }
                return m173(m171(C0062.m9438(str3)), m171(C0062.m9438(str2)), C0062.m9438(C0047.m7763(sb2)));
            } catch (Exception unused) {
                return strM1840;
            }
        }

        /* renamed from: ۟ۢۥۧ۠, reason: not valid java name and contains not printable characters */
        public static Set m169(Object obj) {
            if (C0027.m5017() >= 0) {
                return ((JsonObject) obj).entrySet();
            }
            return null;
        }

        /* renamed from: ۟ۦ۠۟ۤ, reason: not valid java name and contains not printable characters */
        public static String m170(Object obj) {
            if (C0055.m8740() > 0) {
                return ((JsonElement) obj).getAsString();
            }
            return null;
        }

        /* renamed from: ۟ۦۢۢۨ, reason: not valid java name and contains not printable characters */
        public static JsonObject m171(Object obj) {
            if (C0041.m6823() < 0) {
                return AbstractC0308c.i((String) obj);
            }
            return null;
        }

        /* renamed from: ۣ۟ۧ۠ۧ, reason: not valid java name and contains not printable characters */
        public static JsonElement m172(Object obj, Object obj2) {
            if (C0016.m3596() <= 0) {
                return ((JsonObject) obj).get((String) obj2);
            }
            return null;
        }

        /* renamed from: ۟ۧۦۨۧ, reason: not valid java name and contains not printable characters */
        public static String m173(Object obj, Object obj2, Object obj3) {
            if (C0060.m9355() > 0) {
                return a((JsonObject) obj, (JsonObject) obj2, (String) obj3);
            }
            return null;
        }

        /* renamed from: ۠ۦۣۡ, reason: not valid java name and contains not printable characters */
        public static short[] m174() {
            if (C0059.m9257() <= 0) {
                return f27short;
            }
            return null;
        }

        /* renamed from: ۢۢۧۦ, reason: not valid java name and contains not printable characters */
        public static boolean m175(Object obj, Object obj2) {
            if (C0011.m2755() >= 0) {
                return ((JsonObject) obj).has((String) obj2);
            }
            return false;
        }
    }

    public static String b(String str) {
        String strM1840 = C0007.m1840();
        return (str == null || C0057.m8953(str)) ? strM1840 : new String(C0007.m1882(C0015.m3446(str, C0006.m1774(m167(), 38, 4, 1158), strM1840)));
    }

    public static String c(String str) {
        if (str == null || C0057.m8953(str)) {
            return C0007.m1840();
        }
        HashMap map = new HashMap();
        for (int i = 0; i < 62; i++) {
            String strM5362 = C0030.m5362(m167(), 42, 62, 2922);
            C0053.m8424(map, C0006.m1775(C0007.m1823(strM5362, i)), C0006.m1775(C0007.m1823(strM5362, (i + 59) % 62)));
        }
        String strM9438 = C0062.m9438(str);
        StringBuilder sb = new StringBuilder();
        for (int i2 = 1; i2 < C0004.m1584(strM9438); i2 += 3) {
            char cM1823 = C0007.m1823(strM9438, i2);
            Character ch = (Character) C0065.m9715(map, C0006.m1775(cM1823));
            if (ch != null) {
                cM1823 = C0011.m2779(ch);
            }
            C0062.m9399(sb, cM1823);
        }
        return C0047.m7763(sb);
    }

    /* renamed from: ۣ۟۟ۤ۠, reason: not valid java name and contains not printable characters */
    public static JsonObject m161(Object obj) {
        if (C0000.m1116() < 0) {
            return AbstractC0308c.i((String) obj);
        }
        return null;
    }

    /* renamed from: ۣ۟ۢۢۨ, reason: not valid java name and contains not printable characters */
    public static int m162(Object obj) {
        if (C0058.m9131() <= 0) {
            return ((JsonElement) obj).getAsInt();
        }
        return 0;
    }

    /* renamed from: ۟ۢۧۢ۠, reason: not valid java name and contains not printable characters */
    public static boolean m163(Object obj, Object obj2) {
        if (C0037.m6350() <= 0) {
            return ((JsonObject) obj).has((String) obj2);
        }
        return false;
    }

    /* renamed from: ۟ۦۢۡ۠, reason: not valid java name and contains not printable characters */
    public static String m164(Object obj) {
        if (C0040.m6582() >= 0) {
            return ((JsonElement) obj).getAsString();
        }
        return null;
    }

    /* renamed from: ۟ۦۦۤ, reason: not valid java name and contains not printable characters */
    public static JsonObject m165(Object obj, Object obj2) {
        if (C0060.m9355() >= 0) {
            return ((JsonObject) obj).getAsJsonObject((String) obj2);
        }
        return null;
    }

    /* renamed from: ۡ۟ۤ۟, reason: not valid java name and contains not printable characters */
    public static JsonElement m166(Object obj, Object obj2) {
        if (C0017.m3633() <= 0) {
            return ((JsonObject) obj).get((String) obj2);
        }
        return null;
    }

    /* renamed from: ۣۣۨۢ, reason: not valid java name and contains not printable characters */
    public static short[] m167() {
        if (C0052.m8320() >= 0) {
            return f26short;
        }
        return null;
    }

    /* renamed from: ۣۨۨۢ, reason: not valid java name and contains not printable characters */
    public static String m168(Object obj) {
        if (C0034.m6048() <= 0) {
            return Decode1.b((String) obj);
        }
        return null;
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        new ArrayList();
        try {
            StringBuilder sb = new StringBuilder();
            C0018.m3933(sb, C0004.m1534(this));
            C0018.m3933(sb, C0016.m3525(m167(), 104, 6, 626));
            C0018.m3933(sb, str);
            C0018.m3933(sb, C0050.m8131(m167(), 110, 1, 2362));
            C0018.m3933(sb, str2);
            C0018.m3933(sb, C0027.m5062(m167(), 111, 5, 1314));
            ArrayList arrayListM2295 = C0010.m2295(this, C0032.m5769(C0047.m7763(sb), C0042.m7132(this)));
            g gVar = new g();
            C0049.m7974(gVar, C0038.m6456(str2), 999, 0, 0);
            C0045.m7632(gVar, arrayListM2295);
            return C0033.m5828(gVar);
        } catch (Exception unused) {
            return C0007.m1840();
        }
    }

    public final HashMap d() {
        HashMap mapM4251 = C0020.m4251(C0043.m7290(m167(), 116, 10, 887), C0027.m5062(m167(), 126, 111, 1519));
        StringBuilder sb = new StringBuilder();
        C0018.m3933(sb, C0004.m1534(this));
        C0018.m3933(sb, C0042.m7151(m167(), 237, 1, 2961));
        C0053.m8424(mapM4251, C0053.m8477(m167(), 238, 7, 3188), C0047.m7763(sb));
        return mapM4251;
    }

    public String detailContent(List<String> list) {
        String strM2300 = C0010.m2300(m167(), 245, 1, 727);
        ArrayList arrayList = new ArrayList();
        try {
            String str = (String) C0048.m7915(list, 0);
            StringBuilder sb = new StringBuilder();
            C0018.m3933(sb, C0004.m1534(this));
            C0018.m3933(sb, str);
            h hVarM3577 = C0016.m3577(C0032.m5769(C0047.m7763(sb), C0042.m7132(this)));
            m mVar = new m();
            C0011.m2828(mVar, str);
            com.github.catvod.spider.merge.T0.m mVarM6243 = C0036.m6243(hVarM3577, C0065.m9775(m167(), 246, 14, 2635));
            if (mVarM6243 != null) {
                C0005.m1628(mVar, C0064.m9640(C0064.m9669(mVarM6243)));
            }
            com.github.catvod.spider.merge.T0.m mVarM62432 = C0036.m6243(hVarM3577, C0039.m6551(m167(), 260, 11, 1314));
            if (mVarM62432 != null) {
                String strM2339 = C0010.m2339(mVarM62432, C0003.m1398(m167(), 271, 3, 3191));
                if (strM2339 != null && !C0057.m8953(strM2339) && !C0043.m7277(strM2339, C0025.m4795(m167(), 274, 4, 2708))) {
                    StringBuilder sb2 = new StringBuilder();
                    C0018.m3933(sb2, C0004.m1534(this));
                    C0018.m3933(sb2, strM2339);
                    strM2339 = C0047.m7763(sb2);
                }
                C0026.m4947(mVar, strM2339);
            }
            com.github.catvod.spider.merge.T0.m mVarM62433 = C0036.m6243(hVarM3577, C0046.m7718(m167(), 278, 19, 470));
            if (mVarM62433 != null) {
                com.github.catvod.spider.merge.T0.m mVarM4922 = C0026.m4922(mVarM62433);
                C0028.m5130(C0030.m5333(mVarM4922, C0018.m3917(m167(), 297, 7, 1655)));
                C0027.m5000(mVar, C0064.m9640(C0064.m9669(mVarM4922)));
            }
            Iterator itM7807 = C0047.m7807(C0030.m5333(hVarM3577, C0046.m7718(m167(), 304, 17, 1975)));
            while (true) {
                if (!C0012.m2962(itM7807)) {
                    break;
                }
                String strM9640 = C0064.m9640(C0064.m9669((com.github.catvod.spider.merge.T0.m) C0048.m7949(itM7807)));
                if (C0064.m9686(strM9640, C0039.m6551(m167(), 321, 5, 2962))) {
                    C0022.m4432(mVar, strM9640);
                    break;
                }
            }
            Iterator itM78072 = C0047.m7807(C0030.m5333(hVarM3577, C0004.m1549(m167(), 326, 10, 2185)));
            while (C0012.m2962(itM78072)) {
                com.github.catvod.spider.merge.T0.m mVar2 = (com.github.catvod.spider.merge.T0.m) C0048.m7949(itM78072);
                String strM9669 = C0064.m9669(mVar2);
                boolean zM9127 = C0058.m9127(strM9669, C0040.m6584(m167(), 336, 2, 1229));
                String strM5708 = C0032.m5708(m167(), 338, 1, 1216);
                if (zM9127) {
                    ArrayList arrayList2 = new ArrayList();
                    Iterator itM78073 = C0047.m7807(C0030.m5333(mVar2, strM5708));
                    while (C0012.m2962(itM78073)) {
                        C0004.m1532(arrayList2, C0064.m9669((com.github.catvod.spider.merge.T0.m) C0048.m7949(itM78073)));
                    }
                    C0058.m9159(mVar, C0063.m9518(arrayList2));
                } else if (C0058.m9127(strM9669, C0002.m1305(m167(), 339, 2, 332))) {
                    ArrayList arrayList3 = new ArrayList();
                    Iterator itM78074 = C0047.m7807(C0030.m5333(mVar2, strM5708));
                    while (C0012.m2962(itM78074)) {
                        C0004.m1532(arrayList3, C0064.m9669((com.github.catvod.spider.merge.T0.m) C0048.m7949(itM78074)));
                    }
                    C0058.m9152(mVar, C0063.m9518(arrayList3));
                }
            }
            ArrayList arrayList4 = new ArrayList();
            ArrayList arrayList5 = new ArrayList();
            Iterator itM78075 = C0047.m7807(C0030.m5333(hVarM3577, C0028.m5109(m167(), 341, 30, 759)));
            while (C0012.m2962(itM78075)) {
                com.github.catvod.spider.merge.T0.m mVarM49222 = C0026.m4922((com.github.catvod.spider.merge.T0.m) C0048.m7949(itM78075));
                C0028.m5130(C0065.m9765(mVarM49222));
                C0004.m1532(arrayList4, C0064.m9640(C0064.m9669(mVarM49222)));
            }
            Iterator itM78076 = C0047.m7807(C0030.m5333(hVarM3577, C0004.m1549(m167(), 371, 14, 1288)));
            while (C0012.m2962(itM78076)) {
                com.github.catvod.spider.merge.T0.m mVar3 = (com.github.catvod.spider.merge.T0.m) C0048.m7949(itM78076);
                ArrayList arrayList6 = new ArrayList();
                Iterator itM78077 = C0047.m7807(C0030.m5333(mVar3, C0061.m9361(m167(), 385, 22, 1593)));
                while (C0012.m2962(itM78077)) {
                    com.github.catvod.spider.merge.T0.m mVar4 = (com.github.catvod.spider.merge.T0.m) C0048.m7949(itM78077);
                    String strM96402 = C0064.m9640(C0064.m9669(mVar4));
                    String strM23392 = C0010.m2339(mVar4, C0011.m2805(m167(), 407, 4, 1399));
                    StringBuilder sb3 = new StringBuilder();
                    C0018.m3933(sb3, strM96402);
                    C0018.m3933(sb3, C0028.m5109(m167(), 411, 1, 3183));
                    C0018.m3933(sb3, strM23392);
                    C0018.m3933(sb3, strM2300);
                    C0018.m3933(sb3, C0033.m5819(mVar));
                    C0018.m3933(sb3, strM2300);
                    C0018.m3933(sb3, strM96402);
                    C0004.m1532(arrayList6, C0047.m7763(sb3));
                }
                C0004.m1532(arrayList5, C0042.m7156(arrayList6));
            }
            C0054.m8596(mVar, C0048.m7957(arrayList4));
            C0044.m7449(mVar, C0048.m7957(arrayList5));
            C0004.m1532(arrayList, mVar);
            return C0053.m8428(mVar);
        } catch (Exception unused) {
            return C0007.m1840();
        }
    }

    public final ArrayList e(String str) {
        ArrayList arrayList = new ArrayList();
        Iterator itM7807 = C0047.m7807(C0030.m5333(C0016.m3577(str), C0014.m3332(m167(), 412, 16, 1030)));
        while (C0012.m2962(itM7807)) {
            com.github.catvod.spider.merge.T0.m mVar = (com.github.catvod.spider.merge.T0.m) C0048.m7949(itM7807);
            com.github.catvod.spider.merge.T0.m mVarM7303 = C0043.m7303(C0030.m5333(mVar, C0058.m9106(m167(), 428, 1, 2881)));
            com.github.catvod.spider.merge.T0.m mVarM73032 = C0043.m7303(C0030.m5333(mVar, C0064.m9599(m167(), 429, 5, 1225)));
            com.github.catvod.spider.merge.T0.m mVarM73033 = C0043.m7303(C0030.m5333(mVar, C0049.m8007(m167(), 434, 16, 2355)));
            com.github.catvod.spider.merge.T0.m mVarM73034 = C0043.m7303(C0030.m5333(mVar, C0012.m2973(m167(), 450, 17, 2118)));
            if (mVarM7303 != null) {
                String strM2339 = C0010.m2339(mVarM7303, C0049.m8007(m167(), 467, 5, 2639));
                String strM23392 = C0010.m2339(mVarM7303, C0049.m8007(m167(), 472, 4, 1709));
                String strM1840 = C0007.m1840();
                String strM23393 = mVarM73032 != null ? C0010.m2339(mVarM73032, C0065.m9775(m167(), 476, 13, 1804)) : strM1840;
                if (strM23393 != null && !C0057.m8953(strM23393) && !C0043.m7277(strM23393, C0026.m4951(m167(), 489, 4, 3064))) {
                    strM23393 = C0028.m5188(new StringBuilder(), C0004.m1534(this), strM23393);
                }
                if (mVarM73033 != null) {
                    strM1840 = C0064.m9640(C0064.m9669(mVarM73033));
                }
                if (C0057.m8953(strM1840) && mVarM73034 != null) {
                    strM1840 = C0064.m9640(C0064.m9669(mVarM73034));
                }
                if (strM2339 != null && !C0057.m8953(strM2339) && strM23392 != null && !C0057.m8953(strM23392)) {
                    C0055.m8732(strM23392, strM2339, strM23393, strM1840, arrayList);
                }
            }
        }
        return arrayList;
    }

    public String homeContent(boolean z) {
        ArrayList arrayList = new ArrayList();
        try {
            Iterator itM7807 = C0047.m7807(C0030.m5333(C0016.m3577(C0032.m5769(C0004.m1534(this), C0042.m7132(this))), C0048.m7902(m167(), 493, 18, 3132)));
            while (C0012.m2962(itM7807)) {
                com.github.catvod.spider.merge.T0.m mVar = (com.github.catvod.spider.merge.T0.m) C0048.m7949(itM7807);
                String strM9640 = C0064.m9640(C0064.m9669(mVar));
                Matcher matcherM6026 = C0034.m6026(C0021.m4317(this), C0010.m2339(mVar, C0049.m8007(m167(), 511, 4, 3071)));
                if (C0003.m1405(matcherM6026)) {
                    C0004.m1532(arrayList, new b(C0021.m4306(matcherM6026, 1), strM9640, null));
                }
            }
            return C0025.m4831(arrayList, new ArrayList());
        } catch (Exception unused) {
            return C0007.m1840();
        }
    }

    public String homeVideoContent() {
        String strM1840 = C0007.m1840();
        ArrayList arrayList = new ArrayList();
        try {
            h hVarM3577 = C0016.m3577(C0032.m5769(C0004.m1534(this), C0042.m7132(this)));
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator itM7807 = C0047.m7807(C0030.m5333(hVarM3577, C0008.m1970(m167(), 515, 19, 1495)));
            while (C0012.m2962(itM7807)) {
                com.github.catvod.spider.merge.T0.m mVarM7303 = C0043.m7303(C0030.m5333((com.github.catvod.spider.merge.T0.m) C0048.m7949(itM7807), C0036.m6188(m167(), 534, 12, 414)));
                if (mVarM7303 != null) {
                    Iterator itM78072 = C0047.m7807(C0030.m5333(mVarM7303, C0055.m8814(m167(), 546, 16, 2445)));
                    while (C0012.m2962(itM78072)) {
                        com.github.catvod.spider.merge.T0.m mVar = (com.github.catvod.spider.merge.T0.m) C0048.m7949(itM78072);
                        com.github.catvod.spider.merge.T0.m mVarM73032 = C0043.m7303(C0030.m5333(mVar, C0032.m5708(m167(), 562, 1, 1652)));
                        com.github.catvod.spider.merge.T0.m mVarM73033 = C0043.m7303(C0030.m5333(mVar, C0015.m3484(m167(), 563, 5, 3135)));
                        com.github.catvod.spider.merge.T0.m mVarM73034 = C0043.m7303(C0030.m5333(mVar, C0020.m4199(m167(), 568, 16, 882)));
                        com.github.catvod.spider.merge.T0.m mVarM73035 = C0043.m7303(C0030.m5333(mVar, C0019.m4107(m167(), 584, 17, 808)));
                        if (mVarM73032 != null) {
                            String strM2339 = C0010.m2339(mVarM73032, C0063.m9585(m167(), 601, 5, 2494));
                            String strM23392 = C0010.m2339(mVarM73032, C0016.m3525(m167(), 606, 4, 2987));
                            String strM23393 = mVarM73033 != null ? C0010.m2339(mVarM73033, C0034.m6001(m167(), 610, 13, 1576)) : strM1840;
                            if (strM23393 != null && !C0057.m8953(strM23393) && !C0043.m7277(strM23393, C0030.m5362(m167(), 623, 4, 2341))) {
                                StringBuilder sb = new StringBuilder();
                                C0018.m3933(sb, C0004.m1534(this));
                                C0018.m3933(sb, strM23393);
                                strM23393 = C0047.m7763(sb);
                            }
                            String strM9640 = mVarM73034 != null ? C0064.m9640(C0064.m9669(mVarM73034)) : strM1840;
                            if (C0057.m8953(strM9640) && mVarM73035 != null) {
                                strM9640 = C0064.m9640(C0064.m9669(mVarM73035));
                            }
                            if (strM2339 != null && !C0057.m8953(strM2339) && strM23392 != null && !C0057.m8953(strM23392) && !C0036.m6244(linkedHashSet, strM23392)) {
                                C0018.m3918(linkedHashSet, strM23392);
                                C0004.m1532(arrayList, new m(strM23392, strM2339, strM23393, strM9640));
                            }
                        }
                    }
                }
            }
            return C0047.m7783(arrayList);
        } catch (Exception unused) {
            return strM1840;
        }
    }

    public void init(Context context) {
        super.init(context);
    }

    public void init(Context context, String str) {
        if (str == null || C0057.m8953(str)) {
            return;
        }
        this.a = str;
    }

    public String playerContent(String str, String str2, List<String> list) {
        String strM5565;
        String strM164;
        String strM2037 = C0009.m2037(m167(), 627, 7, 600);
        String strM9106 = C0058.m9106(m167(), 634, 4, 2581);
        String strM3484 = C0015.m3484(m167(), 638, 4, 785);
        String strM1970 = C0008.m1970(m167(), 642, 111, 1357);
        String strM8259 = C0051.m8259(m167(), 753, 10, 1959);
        String strM1840 = C0007.m1840();
        try {
            String[] strArrM4752 = C0024.m4752(str2, C0057.m8978(m167(), 763, 1, 897));
            String str3 = strArrM4752[0];
            String str4 = strArrM4752[1];
            String str5 = strArrM4752[2];
            StringBuilder sb = new StringBuilder();
            C0018.m3933(sb, C0004.m1534(this));
            C0018.m3933(sb, str3);
            String strM7763 = C0047.m7763(sb);
            h hVarM3577 = C0016.m3577(C0032.m5769(strM7763, C0042.m7132(this)));
            String strM2827 = C0011.m2827(strM7763, str4, str5);
            Iterator itM7807 = C0047.m7807(C0030.m5333(hVarM3577, C0047.m7833(m167(), 764, 21, 1047)));
            while (true) {
                boolean zM2962 = C0012.m2962(itM7807);
                strM5565 = C0031.m5565(m167(), 785, 3, 2491);
                if (!zM2962) {
                    strM164 = strM1840;
                    break;
                }
                String strM1081 = C0000.m1081((com.github.catvod.spider.merge.T0.m) C0048.m7949(itM7807));
                if (strM1081 != null && C0058.m9127(strM1081, C0048.m7902(m167(), 788, 11, 3142))) {
                    int iM7935 = C0048.m7935(strM1081, 123);
                    int iM5416 = C0030.m5416(strM1081, 125);
                    if (iM7935 > -1 && iM5416 > iM7935) {
                        try {
                            JsonObject jsonObjectM161 = m161(C0054.m8636(strM1081, iM7935, iM5416 + 1));
                            if (m163(jsonObjectM161, strM5565)) {
                                strM164 = m164(m166(jsonObjectM161, strM5565));
                                break;
                            }
                            continue;
                        } catch (Exception e) {
                            C0049.m7975(e);
                        }
                    }
                }
            }
            if (C0057.m8953(strM164)) {
                g gVar = new g();
                C0006.m1720(gVar, 0);
                C0017.m3667(gVar, strM1840);
                return C0033.m5828(gVar);
            }
            HashMap map = new HashMap();
            C0053.m8424(map, strM8259, strM1970);
            String strM6307 = C0037.m6307(m167(), 799, 7, 3191);
            StringBuilder sb2 = new StringBuilder();
            C0018.m3933(sb2, C0004.m1534(this));
            C0018.m3933(sb2, C0062.m9389(m167(), 806, 27, 2693));
            C0018.m3933(sb2, strM164);
            C0053.m8424(map, strM6307, C0047.m7763(sb2));
            C0053.m8424(map, C0056.m8911(m167(), 833, 6, 1682), C0004.m1534(this));
            C0053.m8424(map, C0062.m9389(m167(), 839, 16, 640), C0015.m3484(m167(), 855, 14, 447));
            HashMap map2 = new HashMap();
            C0053.m8424(map2, C0024.m4740(m167(), 869, 3, 997), strM164);
            StringBuilder sb3 = new StringBuilder();
            C0018.m3933(sb3, C0004.m1534(this));
            C0018.m3933(sb3, C0022.m4403(m167(), 872, 16, 828));
            JsonObject jsonObjectM1612 = m161(C0008.m2029(C0003.m1396(C0047.m7763(sb3), map2, map)));
            if (m163(jsonObjectM1612, strM3484) && m162(m166(jsonObjectM1612, strM3484)) == 200 && m163(jsonObjectM1612, strM9106)) {
                JsonObject jsonObjectM165 = m165(jsonObjectM1612, strM9106);
                if (m163(jsonObjectM165, strM5565) && m163(jsonObjectM165, strM2037)) {
                    String strM1642 = m164(m166(jsonObjectM165, strM5565));
                    int iM162 = m162(m166(jsonObjectM165, strM2037));
                    if (iM162 == 1) {
                        strM1642 = m168(strM1642);
                    } else if (iM162 == 2) {
                        strM1642 = C0055.m8701(strM1642);
                    }
                    HashMap map3 = new HashMap();
                    C0053.m8424(map3, strM8259, strM1970);
                    g gVar2 = new g();
                    C0006.m1720(gVar2, 0);
                    C0017.m3667(gVar2, strM1642);
                    C0002.m1282(gVar2, strM2827);
                    C0057.m9029(gVar2, map3);
                    return C0033.m5828(gVar2);
                }
            }
            g gVar3 = new g();
            C0006.m1720(gVar3, 0);
            C0017.m3667(gVar3, strM1840);
            return C0033.m5828(gVar3);
        } catch (Exception unused) {
            return strM1840;
        }
    }

    public String searchContent(String str, boolean z) {
        return C0036.m6227(this, str, z, C0014.m3332(m167(), 888, 1, 1713));
    }

    public String searchContent(String str, boolean z, String str2) {
        String strM7151;
        ArrayList arrayList = new ArrayList();
        String strM1840 = C0007.m1840();
        if (str2 != null) {
            strM7151 = str2;
        } else {
            try {
                strM7151 = C0042.m7151(m167(), 889, 1, 2940);
            } catch (Exception unused) {
                return strM1840;
            }
        }
        StringBuilder sb = new StringBuilder();
        C0018.m3933(sb, C0004.m1534(this));
        C0018.m3933(sb, C0008.m1970(m167(), 890, 8, 3144));
        C0018.m3933(sb, C0051.m8202(str, C0050.m8131(m167(), 898, 5, 2993)));
        C0018.m3933(sb, C0035.m6131(m167(), 903, 10, 1852));
        C0018.m3933(sb, strM7151);
        C0018.m3933(sb, C0010.m2300(m167(), 913, 8, 1559));
        Iterator itM7807 = C0047.m7807(C0030.m5333(C0016.m3577(C0032.m5769(C0047.m7763(sb), C0042.m7132(this))), C0058.m9106(m167(), 921, 21, 2492)));
        while (C0012.m2962(itM7807)) {
            com.github.catvod.spider.merge.T0.m mVar = (com.github.catvod.spider.merge.T0.m) C0048.m7949(itM7807);
            com.github.catvod.spider.merge.T0.m mVarM7303 = C0043.m7303(C0030.m5333(mVar, C0052.m8337(m167(), 942, 12, 3117)));
            com.github.catvod.spider.merge.T0.m mVarM73032 = C0043.m7303(C0030.m5333(mVar, C0016.m3525(m167(), 954, 5, 1797)));
            com.github.catvod.spider.merge.T0.m mVarM73033 = C0043.m7303(C0030.m5333(mVar, C0018.m3917(m167(), 959, 12, 1292)));
            com.github.catvod.spider.merge.T0.m mVarM73034 = C0043.m7303(C0030.m5333(mVar, C0017.m3646(m167(), 971, 16, 457)));
            com.github.catvod.spider.merge.T0.m mVarM73035 = C0043.m7303(C0030.m5333(mVar, C0032.m5708(m167(), 987, 11, 3217)));
            if (mVarM7303 != null && mVarM73033 != null) {
                String strM9640 = C0064.m9640(C0064.m9669(mVarM73033));
                String strM2339 = C0010.m2339(mVarM7303, C0020.m4199(m167(), 998, 4, 1536));
                String strM23392 = mVarM73032 != null ? C0010.m2339(mVarM73032, C0029.m5256(m167(), 1002, 13, 2467)) : strM1840;
                if (strM23392 != null && !C0057.m8953(strM23392) && !C0043.m7277(strM23392, C0002.m1305(m167(), 1015, 4, 1268))) {
                    StringBuilder sb2 = new StringBuilder();
                    C0018.m3933(sb2, C0004.m1534(this));
                    C0018.m3933(sb2, strM23392);
                    strM23392 = C0047.m7763(sb2);
                }
                String strM96402 = mVarM73034 != null ? C0064.m9640(C0064.m9669(mVarM73034)) : strM1840;
                if (C0057.m8953(strM96402) && mVarM73035 != null) {
                    strM96402 = C0064.m9640(C0064.m9669(mVarM73035));
                }
                if (!C0057.m8953(strM9640) && !C0057.m8953(strM2339)) {
                    C0004.m1532(arrayList, new m(strM2339, strM9640, strM23392, strM96402));
                }
            }
        }
        g gVar = new g();
        C0049.m7974(gVar, C0038.m6456(str2), 1, 0, 0);
        C0045.m7632(gVar, arrayList);
        return C0033.m5828(gVar);
    }
}