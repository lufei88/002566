package com.github.catvod.spider.merge.V;

import android.content.Context;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.E.g;
import com.github.catvod.spider.merge.E.j;
import com.github.catvod.spider.merge.E.k;
import com.github.catvod.spider.merge.E.l;
import com.github.catvod.spider.merge.E.m;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.J0.C0021;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.N.C0023;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z.C0038;
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
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class b extends Spider {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f627short = {3303, 3213, 3214, 3297, 3303, 3204, 3205, 3212, 3297, 3303, 3212, 3217, 3205, 3297, 3303, 3212, 3217, 3205, 3297, 30636, 3240, 3292, 3300, 3243, 3241, 27551, 18458, -26758, 29823, 26033, 22107, 28696, -27575, 26740, 29008, -30201, -30689, 25695, 32362, -31099, 27738, 12637, 1419, 1417, 1436, 1435, 2836, 2839, 2835, 2822, 2823, 2816, 2839, 22870, 25813, 2097, 2110, 2105, 2109, 2101, 31230, 21434, 2252, 2254, 2263, 2248, 2244, 29530, -28759, 21512, 1315, 1333, 1318, 1322, 1318, 30682, -29860, 461, 474, 457, 466, 478, 463, 450, 680, 701, 699, 687, 30543, -29751, 2320, 2311, 2324, 2319, 2307, 2322, 2335, 29851, 24287, 2385, 2387, 2378, 2389, 2393, 20710, 28005, 509, 498, 501, 497, 505, 31791, -32548, 23421, 1316, 1330, 1313, 1325, 1313, 2243, 2262, 2255, 2261, 2249, 2242, 2243, 2290, 2249, 2258, 2247, 2250, 1809, 1843, 1807, 1810, 1802, 1797, 1842, 1813, 1803, 2010, 1989, 2009, 2014, 1999, 2008, 2030, 2046, 2021, 3135, 3108, 3107, 3131, 3077, 3112, 565, 566, 562, 551, 550, 545, 566, 1710, 1699, 1721, 1722, 1702, 1707, 1715, 1668, 1707, 1703, 1711, 1969, 1976, 1962, 1920, 1974, 1964, 1970, 1964, 2820, 2846, 2868, 2818, 2840, 2822, 2840, 3318, 3307, 3318, 3310, 3303, 3270, 3286, 3277, 2788, 2792, 2794, 2794, 2792, 2793, 2755, 2790, 2803, 2790, 1119, 1080, 1085, 1117, 1086, 1096, 1117, 14800, 2542, 2539, 2559, 14801, 2716, -1431, 2792, 2814, 2788, 2810, 2788, 2799, 1195, -24883, 17649, -25954, 1615, 1602, 1624, 1627, 1607, 1610, 1618, 1637, 1610, 1606, 1614, 726, 715, 726, 718, 711, 590, 568, 559, 554, 588, 628, 619, 546, 572, 548, 621, 573, 588, 628, 619, 546, 621, 573, 588, 628, 619, 546, 621, 620, 588, 628, 619, 546, 621, 573, 588, 628, 619, 546, 621, 569, 588, 611, 570, 568, 559, 557, 568, 559, 554, 31036, 588, 628, 571, 25871, 569, 569, 620, 590, 568, 559, 554, 588, 628, 619, 546, 572, 548, 621, 573, 588, 628, 619, 546, 621, 573, 588, 628, 619, 546, 621, 620, 588, 628, 619, 546, 621, 573, 588, 628, 619, 546, 621, 569, 588, 611, 570, 554, 588, 611, 570, 1662, 1660, 1637, 1658, 1654, 3187, 3172, 3191, 3180, 3168, 3185, 3196, 29422, 622, 619, 636, 626, 631, 621, 630, 635, 634, 1546, 26336, 479, -26105, 1024, 1052, 1052, 1048, 1051, 1106, 1095, 1095, 1031, 1048, 1037, 1030, 1033, 1048, 1025, 1094, 1041, 1031, 1053, 1027, 1053, 1094, 1035, 1031, 1029, 1095, 1054, 1114, 1095, 1051, 1024, 1031, 1055, 1051, 1095, 1054, 1025, 1036, 1037, 1031, 1051, 1094, 1026, 1051, 1031, 1030, 1111, 1035, 1028, 1025, 1037, 1030, 1052, 1079, 1025, 1036, 1109, 1117, 1115, 1037, 1118, 1035, 1035, 1118, 1119, 1114, 1115, 1119, 1038, 1035, 1117, 1105, 1033, 1102, 1048, 1033, 1035, 1027, 1033, 1039, 1037, 1109, 1035, 1031, 1029, 1094, 1024, 1053, 1033, 1055, 1037, 1025, 1094, 1024, 1055, 1054, 1048, 1028, 1033, 1041, 1037, 1050, 1094, 1041, 1031, 1053, 1027, 1053, 1102, 1037, 1040, 1052, 1109, 1051, 1024, 1031, 1055, 1102, 1051, 1024, 1031, 1055, 1079, 1025, 1036, 1109, 1607, 1553, 1536, 1542, 1540, 1628, 1779, 1718, 1722, 1696, 1723, 1697, 1768, 1764, 1765, 1765, 638, 600, 590, 601, 518, 618, 588, 590, 581, 607, 1728, 1762, 1783, 1764, 1761, 1761, 1772, 1698, 1720, 1699, 1725, 1709, 1701, 1754, 1764, 1763, 1769, 1762, 1786, 1790, 1709, 1731, 1753, 1709, 1724, 1725, 1699, 1725, 1718, 1709, 1754, 1764, 1763, 1723, 1721, 1718, 1709, 1781, 1723, 1721, 1700, 1709, 1740, 1789, 1789, 1761, 1768, 1754, 1768, 1775, 1734, 1764, 1785, 1698, 1720, 1726, 1722, 1699, 1726, 1723, 1709, 1701, 1734, 1733, 1753, 1728, 1729, 1697, 1709, 1761, 1764, 1766, 1768, 1709, 1738, 1768, 1774, 1766, 1762, 1700, 1709, 1742, 1765, 1791, 1762, 1760, 1768, 1698, 1716, 1724, 1699, 1725, 1699, 1721, 1721, 1722, 1727, 1699, 1724, 1727, 1721, 1709, 1758, 1772, 1771, 1772, 1791, 1764, 1698, 1720, 1726, 1722, 1699, 1726, 1723, 1356, 1390, 1390, 1384, 1405, 1401, 2315, 2330, 2330, 2310, 2307, 2313, 2315, 2334, 2307, 2309, 2308, 2373, 2304, 2329, 2309, 2308, 2124, 2171, 2168, 2171, 2156, 2171, 2156, 2126, 2130, 2130, 2134, 2133, 2076, 2057, 2057, 2129, 2129, 2129, 2056, 2143, 2121, 2131, 2125, 2131, 2056, 2117, 2121, 2123, 3143, 3138, 3141, 3136, 2195, 2206, 497, 490, 497, 484, 489, 2933, 2922, 2919, 2918, 2924, 2928, 2764, 2766, 2808, 2786, 2812, 2786, 2762, 2743, -30432, 22849, 22673, -25519, 22656, -32001, 2733, 2743, 2788, 2815, 2808, 2784, 2760, 2814, 2803, 2730, 3129, 25835, 25023, 20977, 20935, -27385, 19488, 25518, 2091, 2089, 2079, 2053, 2075, 2053, 2093, 2128, 24752, 25915, 23104, 2128, 2790, 17644, 22720, -25600, -2614, 22208, -30351, 22800, 2790, 438, -26141, 293, 295, 273, 267, 277, 267, 291, 350, -32055, 21160, 21368, -26696, -26357, -27108, 350, 2475, 20666, -31570, 2481, 2475, 509, 511, 457, 467, 461, 467, 507, 390, 20695, -32239, 21104, 390, 2687, -25447, 19446, -27239, 3054, 3058, 3058, 3062, 3061, 3004, 2985, 2985, 3056, 2984, 3071, 3049, 3059, 3053, 3059, 2984, 3045, 3049, 3051, 2985, 3056, 3033, 3061, 3054, 3049, 3057, 2985, 3055, 3042, 3033, 2705, 2775, 2763, 2770, 2771, 1787, 1773, 1783, 1769, 1783, 2097, 2099, 2053, 2079, 2049, 2079, 2103, 2122, 28480, 27156, 23130, 23148, -24916, 18315, 26629, 2891, 1369, 1403, 1390, 1405, 1400, 1400, 1397, 1339, 1313, 1338, 1316, 1332, 1340, 1347, 1405, 1402, 1392, 1403, 1379, 1383, 1332, 1370, 1344, 1332, 1317, 1316, 1338, 1316, 1327, 1332, 1347, 1405, 1402, 1314, 1312, 1327, 1332, 1388, 1314, 1312, 1341, 1332, 1365, 1380, 1380, 1400, 1393, 1347, 1393, 1398, 1375, 1405, 1376, 1339, 1313, 1319, 1315, 1338, 1319, 1314, 1332, 1340, 1375, 1372, 1344, 1369, 1368, 1336, 1332, 1400, 1405, 1407, 1393, 1332, 1363, 1393, 1399, 1407, 1403, 1341, 1332, 1367, 1404, 1382, 1403, 1401, 1393, 1339, 1325, 1317, 1338, 1316, 1338, 1312, 1312, 1315, 1318, 1338, 1317, 1318, 1312, 1332, 1351, 1397, 1394, 1397, 1382, 1405, 1339, 1313, 1319, 1315, 1338, 1319, 1314, 1193, 1208, 1214, 1212, 1178, 1206, 1204, 1193, 1206, 1207, 1212, 1207, 1197, 1173, 1200, 1194, 1197, 768, 769, 787, 888, 877, 1182, 1154, 1154, 1158, 1157, 1228, 1241, 1241, 1157, 1171, 1175, 1156, 1173, 1182, 
    1240, 1167, 1177, 1155, 1181, 1155, 1240, 1173, 1177, 1179, 1241, 1175, 1158, 1183, 1241, 1157, 1171, 1175, 1156, 1173, 1182, 1225, 1181, 1171, 1167, 1153, 1177, 1156, 1170, 1227, 682, 680, 670, 644, 666, 644, 684, 721, 24049, 23354, 26349, 32723, 715, 721, 2050, 2129, 2135, 2113, 2134, 2149, 2115, 2113, 2122, 2128, 2073, 1344, 1301, 1295, 1298, 1283, 1371, 1367, 1344, 1285, 1287, 1298, 1283, 1281, 1289, 1300, 1295, 1283, 1301, 1371, 1366, 1344, 1280, 1298, 1311, 1302, 1283, 1371, 1366, 1344, 1289, 1284, 1371, 1366, 1344, 1302, 1281, 1371, 1012, 978, 964, 979, 908, 992, 966, 964, 975, 981, 2193, 2227, 2227, 2229, 2208, 2212, 2738, 2723, 2723, 2751, 2746, 2736, 2738, 2727, 2746, 2748, 2749, 2812, 2745, 2720, 2748, 2749, 824, 783, 780, 783, 792, 783, 792, 883, 879, 879, 875, 872, 801, 820, 820, 876, 876, 876, 821, 866, 884, 878, 880, 878, 821, 888, 884, 886, 2861, 2863, 2841, 2819, 2845, 2819, 2859, 2902, 28522, 30292, 28310, 30117, 27882, 933, 935, 913, 907, 917, 907, 931, 990, 26594, 32476, 24960, 20942, 990, 1457, 19387, 25240, 24793, 31554, 25101};
    public static final Pattern a = C0005.m1602(C0048.m7902(m5544(), 0, 19, 3260));
    public static final Pattern b = C0005.m1602(C0011.m2805(m5544(), 19, 7, 3200));
    public static final String[] c = {C0036.m6188(m5544(), 26, 3, 1591), C0022.m4403(m5544(), 29, 3, 1811), C0041.m6779(m5544(), 32, 3, 791), C0052.m8337(m5544(), 35, 2, 996), C0039.m6551(m5544(), 37, 2, 1970), C0063.m9585(m5544(), 39, 2, 3018), C0049.m8007(m5544(), 41, 1, 343)};

    public static String a(JsonObject jsonObject) {
        String strM6001 = C0034.m6001(m5544(), 42, 4, 1512);
        boolean zM5554 = m5554(jsonObject, strM6001);
        String strM1840 = C0007.m1840();
        String strM5539 = zM5554 ? m5539(m5549(jsonObject, strM6001)) : strM1840;
        String strM2805 = C0011.m2805(m5544(), 46, 7, 2930);
        if (m5554(jsonObject, strM2805)) {
            strM1840 = m5539(m5549(jsonObject, strM2805));
        }
        String strM4587 = C0023.m4587(strM5539);
        String strM45872 = C0023.m4587(strM1840);
        String strM8007 = C0049.m8007(m5544(), 53, 2, 3070);
        if (C0058.m9127(strM4587, strM8007) || C0058.m9127(strM4587, C0055.m8814(m5544(), 55, 5, 2128))) {
            return strM8007;
        }
        String strM4340 = C0021.m4340(m5544(), 60, 2, 3275);
        if (C0058.m9127(strM4587, strM4340) || C0058.m9127(strM4587, C0026.m4951(m5544(), 62, 5, 2209))) {
            return strM4340;
        }
        String strM8911 = C0056.m8911(m5544(), 67, 3, 1647);
        if (C0058.m9127(strM4587, strM8911) || C0058.m9127(strM4587, C0046.m7718(m5544(), 70, 5, 1351))) {
            return strM8911;
        }
        String strM7509 = C0044.m7509(m5544(), 75, 2, 2342);
        return (C0058.m9127(strM4587, strM7509) || C0058.m9127(strM4587, C0024.m4740(m5544(), 77, 7, 443))) ? strM7509 : C0058.m9127(strM45872, strM8007) ? strM8007 : C0058.m9127(strM45872, strM4340) ? strM4340 : (!C0058.m9127(strM45872, strM8911) && C0058.m9127(strM45872, strM7509)) ? strM7509 : strM8911;
    }

    public static String b(JsonObject jsonObject) {
        String strM6307 = C0037.m6307(m5544(), 84, 4, 732);
        String strM4587 = C0023.m4587(m5554(jsonObject, strM6307) ? m5539(m5549(jsonObject, strM6307)) : C0007.m1840());
        boolean zM9127 = C0058.m9127(strM4587, C0032.m5708(m5544(), 88, 2, 2483));
        String strM3646 = C0017.m3646(m5544(), 90, 7, 2406);
        if (!zM9127 && !C0058.m9127(strM4587, strM3646)) {
            boolean zM91272 = C0058.m9127(strM4587, C0017.m3646(m5544(), 97, 2, 430));
            strM3646 = C0049.m8007(m5544(), 99, 5, 2364);
            if (!zM91272 && !C0058.m9127(strM4587, strM3646)) {
                boolean zM91273 = C0058.m9127(strM4587, C0042.m7151(m5544(), 104, 2, 590));
                strM3646 = C0033.m5852(m5544(), 106, 5, 412);
                if (!zM91273 && !C0058.m9127(strM4587, strM3646)) {
                    boolean zM91274 = C0058.m9127(strM4587, C0006.m1774(m5544(), 111, 3, 2330));
                    strM3646 = C0036.m6188(m5544(), 114, 5, 1344);
                    if (!zM91274) {
                        C0058.m9127(strM4587, strM3646);
                    }
                }
            }
        }
        return strM3646;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x01d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.github.catvod.spider.merge.E.m c(com.google.gson.JsonObject r63) {
        /*
            Method dump skipped, instructions count: 635
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.V.b.c(com.google.gson.JsonObject):com.github.catvod.spider.merge.E.m");
    }

    public static String d(int i, JsonObject jsonObject, String str) {
        StringBuilder sb;
        String strM7833 = C0047.m7833(m5544(), 230, 11, 1579);
        boolean zM5554 = m5554(jsonObject, strM7833);
        String strM1840 = C0007.m1840();
        String strM5539 = zM5554 ? m5539(m5549(jsonObject, strM7833)) : strM1840;
        String strM8007 = C0049.m8007(m5544(), 241, 5, 674);
        if (m5554(jsonObject, strM8007)) {
            strM5539 = m5539(m5549(jsonObject, strM8007));
        }
        String strM9640 = C0064.m9640(C0005.m1623(C0034.m6026(C0005.m1602(C0006.m1774(m5544(), 246, 96, 528)), strM5539), strM1840));
        if (C0007.m1815(C0055.m8814(m5544(), 342, 5, 1555), str)) {
            return strM9640;
        }
        boolean zM1815 = C0007.m1815(C0031.m5565(m5544(), 347, 7, 3077), str);
        String strM6779 = C0041.m6779(m5544(), 354, 1, 2498);
        if (zM1815) {
            Matcher matcherM6026 = C0034.m6026(C0055.m8803(), strM9640);
            boolean zM1405 = C0003.m1405(matcherM6026);
            String strM7509 = C0044.m7509(m5544(), 355, 9, 542);
            String strM1189 = C0001.m1189(m5544(), 364, 1, 1578);
            if (zM1405) {
                String strM9422 = C0062.m9422(matcherM6026);
                String strM55392 = m5554(jsonObject, strM7509) ? m5539(m5549(jsonObject, strM7509)) : strM1840;
                if (!C0057.m8953(strM55392)) {
                    strM1840 = C0024.m4752(strM55392, strM1189)[0];
                }
                sb = new StringBuilder();
                C0018.m3933(sb, strM9422);
                C0018.m3933(sb, strM1189);
            } else {
                String strM55393 = m5554(jsonObject, strM7509) ? m5539(m5549(jsonObject, strM7509)) : strM1840;
                if (!C0057.m8953(strM55393)) {
                    strM1840 = C0024.m4752(strM55393, strM1189)[0];
                }
                sb = new StringBuilder(strM6779);
                C0036.m6177(sb, i);
                C0018.m3933(sb, C0004.m1549(m5544(), 365, 2, 511));
            }
            C0018.m3933(sb, strM1840);
            C0018.m3933(sb, strM1189);
            C0018.m3933(sb, strM9640);
        } else {
            boolean zM7277 = C0043.m7277(strM9640, strM6779);
            String strM1774 = C0006.m1774(m5544(), 367, 1, 3265);
            if (zM7277 && C0058.m9127(strM9640, strM1774)) {
                return strM9640;
            }
            sb = new StringBuilder(strM6779);
            C0036.m6177(sb, i);
            C0018.m3933(sb, strM1774);
        }
        return C0047.m7763(sb);
    }

    public static JsonObject e(int i, String str) {
        StringBuilder sb = new StringBuilder(C0033.m5852(m5544(), 368, 126, 1128));
        C0018.m3933(sb, str);
        C0018.m3933(sb, C0042.m7151(m5544(), 494, 6, 1633));
        C0036.m6177(sb, i);
        C0018.m3933(sb, C0021.m4340(m5544(), 500, 10, 1749));
        String strM7763 = C0047.m7763(sb);
        HashMap mapM4127 = C0019.m4127(C0022.m4403(m5544(), 510, 10, 555), C0027.m5062(m5544(), 520, 115, 1677), C0043.m7290(m5544(), 635, 6, 1293), C0016.m3525(m5544(), 641, 16, 2410));
        C0053.m8424(mapM4127, C0063.m9585(m5544(), 657, 7, 2078), C0021.m4340(m5544(), 664, 21, 2086));
        return m5553(m5551(C0032.m5769(strM7763, mapM4127)));
    }

    /* renamed from: ۟۟ۡۥ۠, reason: not valid java name and contains not printable characters */
    public static String m5536(Object obj) {
        if (C0043.m7332() > 0) {
            return b((JsonObject) obj);
        }
        return null;
    }

    /* renamed from: ۟ۤۨۢۢ, reason: not valid java name and contains not printable characters */
    public static JsonArray m5537(Object obj, Object obj2) {
        if (C0042.m7147() < 0) {
            return ((JsonObject) obj).getAsJsonArray((String) obj2);
        }
        return null;
    }

    /* renamed from: ۟ۥ۠ۧۦ, reason: not valid java name and contains not printable characters */
    public static String m5538(Object obj) {
        if (C0041.m6823() < 0) {
            return a((JsonObject) obj);
        }
        return null;
    }

    /* renamed from: ۟ۥۣۨۥ, reason: not valid java name and contains not printable characters */
    public static String m5539(Object obj) {
        if (C0033.m5872() >= 0) {
            return ((JsonElement) obj).getAsString();
        }
        return null;
    }

    /* renamed from: ۟ۦۣۡ۠, reason: not valid java name and contains not printable characters */
    public static String m5540(int i, Object obj, Object obj2) {
        if (C0030.m5375() > 0) {
            return d(i, (JsonObject) obj, (String) obj2);
        }
        return null;
    }

    /* renamed from: ۟ۦۥۥ۟, reason: not valid java name and contains not printable characters */
    public static int m5541(Object obj) {
        if (C0027.m5017() >= 0) {
            return ((JsonArray) obj).size();
        }
        return 0;
    }

    /* renamed from: ۟ۧۢۤۢ, reason: not valid java name and contains not printable characters */
    public static int m5542(Object obj) {
        if (C0036.m6252() >= 0) {
            return ((JsonElement) obj).getAsInt();
        }
        return 0;
    }

    /* renamed from: ۟ۧۧ۠, reason: not valid java name and contains not printable characters */
    public static void m5543(Object obj) {
        if (C0031.m5628() >= 0) {
            SpiderDebug.log((String) obj);
        }
    }

    /* renamed from: ۠۠۟ۧ, reason: not valid java name and contains not printable characters */
    public static short[] m5544() {
        if (C0059.m9257() <= 0) {
            return f627short;
        }
        return null;
    }

    /* renamed from: ۠ۡ۠۟, reason: not valid java name and contains not printable characters */
    public static boolean m5545(Object obj) {
        if (C0062.m9429() >= 0) {
            return ((JsonElement) obj).isJsonArray();
        }
        return false;
    }

    /* renamed from: ۣ۠ۥۥ, reason: not valid java name and contains not printable characters */
    public static void m5546(Object obj) {
        if (C0055.m8740() >= 0) {
            SpiderDebug.log((Throwable) obj);
        }
    }

    /* renamed from: ۣۡۡۤ, reason: not valid java name and contains not printable characters */
    public static JsonObject m5547(int i, Object obj) {
        if (C0060.m9355() >= 0) {
            return e(i, (String) obj);
        }
        return null;
    }

    /* renamed from: ۣۢۧۤ, reason: not valid java name and contains not printable characters */
    public static JsonObject m5548(Object obj, Object obj2) {
        if (C0021.m4379() > 0) {
            return ((JsonObject) obj).getAsJsonObject((String) obj2);
        }
        return null;
    }

    /* renamed from: ۣ۟ۧۧ, reason: not valid java name and contains not printable characters */
    public static JsonElement m5549(Object obj, Object obj2) {
        if (C0033.m5872() > 0) {
            return ((JsonObject) obj).get((String) obj2);
        }
        return null;
    }

    /* renamed from: ۣ۠ۦ۟, reason: not valid java name and contains not printable characters */
    public static Iterator m5550(Object obj) {
        if (C0034.m6048() <= 0) {
            return ((JsonArray) obj).iterator();
        }
        return null;
    }

    /* renamed from: ۣۣۥۣ, reason: not valid java name and contains not printable characters */
    public static JsonElement m5551(Object obj) {
        if (C0007.m1886() > 0) {
            return JsonParser.parseString((String) obj);
        }
        return null;
    }

    /* renamed from: ۧۢۨۥ, reason: not valid java name and contains not printable characters */
    public static m m5552(Object obj) {
        if (C0058.m9131() <= 0) {
            return c((JsonObject) obj);
        }
        return null;
    }

    /* renamed from: ۣۧۢۨ, reason: not valid java name and contains not printable characters */
    public static JsonObject m5553(Object obj) {
        if (C0017.m3633() < 0) {
            return ((JsonElement) obj).getAsJsonObject();
        }
        return null;
    }

    /* renamed from: ۨۤۤۡ, reason: not valid java name and contains not printable characters */
    public static boolean m5554(Object obj, Object obj2) {
        if (C0026.m4977() <= 0) {
            return ((JsonObject) obj).has((String) obj2);
        }
        return false;
    }

    public final String detailContent(List list) {
        String strM8007 = C0049.m8007(m5544(), 685, 4, 3115);
        String strM7290 = C0043.m7290(m5544(), 689, 2, 2298);
        String strM4795 = C0025.m4795(m5544(), 691, 5, 389);
        String strM1840 = C0007.m1840();
        String strM8911 = C0056.m8911(m5544(), 696, 6, 2819);
        String strM9361 = C0061.m9361(m5544(), 702, 24, 2711);
        int i = 0;
        try {
            String[] strArrM4752 = C0024.m4752((String) C0048.m7915(list, 0), C0048.m7902(m5544(), 726, 1, 3143));
            String str = strArrM4752[1];
            StringBuilder sb = new StringBuilder(strM9361);
            C0018.m3933(sb, str);
            m5543(C0047.m7763(sb));
            ArrayList arrayList = new ArrayList();
            JsonObject jsonObjectM5547 = m5547(1, str);
            String strM6001 = C0034.m6001(m5544(), 727, 7, 961);
            if (jsonObjectM5547 != null && m5554(jsonObjectM5547, strM8911) && m5545(m5537(jsonObjectM5547, strM8911))) {
                JsonArray jsonArrayM5537 = m5537(jsonObjectM5547, strM8911);
                Iterator itM5550 = m5550(jsonArrayM5537);
                while (C0012.m2962(itM5550)) {
                    C0004.m1532(arrayList, m5553((JsonElement) C0048.m7949(itM5550)));
                }
                int iM5542 = m5554(jsonObjectM5547, strM4795) ? m5542(m5549(jsonObjectM5547, strM4795)) : m5541(jsonArrayM5537);
                if (iM5542 > 100) {
                    double d = iM5542;
                    double d2 = 100;
                    C0004.m1564(d);
                    C0004.m1564(d2);
                    int iM1140 = (int) C0001.m1140(d / d2);
                    StringBuilder sb2 = new StringBuilder();
                    C0018.m3933(sb2, C0005.m1645(m5544(), 734, 12, 2160));
                    C0036.m6177(sb2, iM5542);
                    C0018.m3933(sb2, C0014.m3332(m5544(), 746, 9, 2758));
                    C0036.m6177(sb2, iM1140);
                    C0018.m3933(sb2, C0012.m2973(m5544(), 755, 2, 406));
                    m5543(C0047.m7763(sb2));
                    for (int i2 = 2; i2 <= iM1140; i2++) {
                        try {
                            JsonObject jsonObjectM55472 = m5547(i2, str);
                            if (jsonObjectM55472 != null && m5554(jsonObjectM55472, strM8911)) {
                                Iterator itM55502 = m5550(m5537(jsonObjectM55472, strM8911));
                                while (C0012.m2962(itM55502)) {
                                    C0004.m1532(arrayList, m5553((JsonElement) C0048.m7949(itM55502)));
                                }
                            }
                        } catch (Exception e) {
                            StringBuilder sb3 = new StringBuilder();
                            C0018.m3933(sb3, C0008.m1970(m5544(), 757, 15, 382));
                            C0036.m6177(sb3, i2);
                            C0018.m3933(sb3, C0056.m8911(m5544(), 772, 5, 2443));
                            C0018.m3933(sb3, C0036.m6261(e));
                            m5543(C0047.m7763(sb3));
                        }
                    }
                }
                StringBuilder sb4 = new StringBuilder();
                C0018.m3933(sb4, C0023.m4536(m5544(), 777, 12, 422));
                C0036.m6177(sb4, C0009.m2139(arrayList));
                C0018.m3933(sb4, C0053.m8477(m5544(), 789, 2, 2655));
                m5543(C0047.m7763(sb4));
                if (C0007.m1817(arrayList)) {
                    return C0056.m8917(strM6001);
                }
                String strM5536 = m5536((JsonObject) C0028.m5167(arrayList, 0));
                m mVar = new m();
                C0011.m2828(mVar, str);
                C0054.m8596(mVar, C0036.m6188(m5544(), 791, 2, 1262));
                ArrayList arrayList2 = new ArrayList();
                while (i < C0009.m2139(arrayList)) {
                    JsonObject jsonObject = (JsonObject) C0028.m5167(arrayList, i);
                    i++;
                    String strM5540 = m5540(i, jsonObject, strM5536);
                    String strM5539 = m5554(jsonObject, strM7290) ? m5539(m5549(jsonObject, strM7290)) : strM1840;
                    String strM55392 = m5554(jsonObject, strM8007) ? m5539(m5549(jsonObject, strM8007)) : strM1840;
                    if (C0057.m8953(strM55392)) {
                        StringBuilder sb5 = new StringBuilder();
                        C0018.m3933(sb5, C0005.m1645(m5544(), 793, 30, 2950));
                        C0018.m3933(sb5, strM5539);
                        C0018.m3933(sb5, C0044.m7509(m5544(), 823, 5, 2751));
                        strM55392 = C0047.m7763(sb5);
                    }
                    k kVar = new k();
                    kVar.a = strM5540;
                    kVar.b = strM55392;
                    C0004.m1532(arrayList2, kVar);
                }
                l lVar = new l(0);
                C0001.m1174(lVar, C0045.m7657(m5544(), 828, 5, 1666), arrayList2);
                j jVarM6432 = C0038.m6432(lVar);
                C0005.m1628(mVar, strArrM4752[2]);
                C0054.m8596(mVar, C0045.m7548(jVarM6432));
                C0044.m7449(mVar, C0055.m8812(jVarM6432));
                return C0053.m8428(mVar);
            }
            m5543(C0018.m3917(m5544(), 833, 15, 2154));
            return C0056.m8917(strM6001);
        } catch (Exception e2) {
            m5546(e2);
            return strM1840;
        }
    }

    public final void init(Context context) {
        C0051.m8194(C0035.m6110());
    }

    public final void init(Context context, String str) {
        C0062.m9396(this, context);
    }

    public final String playerContent(String str, String str2, List list) {
        g gVar = new g();
        C0017.m3667(gVar, str2);
        C0006.m1720(gVar, 1);
        return C0033.m5828(gVar);
    }

    public final String searchContent(String str, boolean z) {
        return C0008.m2022(this, str, z, C0030.m5362(m5544(), 848, 1, 2938));
    }

    public final String searchContent(String str, boolean z, String str2) {
        String strM5708 = C0032.m5708(m5544(), 849, 115, 1300);
        String strM6001 = C0034.m6001(m5544(), 964, 17, 1241);
        String strM6307 = C0037.m6307(m5544(), 981, 5, 853);
        String strM4740 = C0024.m4740(m5544(), 986, 44, 1270);
        try {
            StringBuilder sb = new StringBuilder(C0028.m5109(m5544(), 1030, 14, 753));
            C0018.m3933(sb, str);
            m5543(C0047.m7763(sb));
            String strM8202 = C0051.m8202(str, strM6307);
            String strM82022 = C0051.m8202(strM5708, strM6307);
            StringBuilder sb2 = new StringBuilder(strM4740);
            C0018.m3933(sb2, strM8202);
            C0018.m3933(sb2, C0054.m8574(m5544(), 1044, 11, 2084));
            C0018.m3933(sb2, strM82022);
            C0018.m3933(sb2, C0013.m3106(m5544(), 1055, 37, 1382));
            C0018.m3933(sb2, str2);
            String strM7763 = C0047.m7763(sb2);
            HashMap map = new HashMap();
            C0053.m8424(map, C0033.m5852(m5544(), 1092, 10, 929), strM5708);
            C0053.m8424(map, C0036.m6188(m5544(), 1102, 6, 2256), C0000.m1077(m5544(), 1108, 16, 2771));
            C0053.m8424(map, C0008.m1970(m5544(), 1124, 7, 874), C0055.m8814(m5544(), 1131, 21, 795));
            JsonObject jsonObjectM5553 = m5553(m5551(C0032.m5769(strM7763, map)));
            if (!m5554(jsonObjectM5553, strM6001)) {
                m5543(C0056.m8911(m5544(), 1152, 13, 2934));
            }
            ArrayList arrayList = new ArrayList();
            Iterator itM5550 = m5550(m5537(jsonObjectM5553, strM6001));
            while (C0012.m2962(itM5550)) {
                m mVarM5552 = m5552(m5553((JsonElement) C0048.m7949(itM5550)));
                if (mVarM5552 != null) {
                    C0004.m1532(arrayList, mVarM5552);
                }
            }
            StringBuilder sb3 = new StringBuilder();
            C0018.m3933(sb3, C0012.m2973(m5544(), 1165, 13, 1022));
            C0036.m6177(sb3, C0009.m2139(arrayList));
            C0018.m3933(sb3, C0037.m6307(m5544(), 1178, 6, 1425));
            m5543(C0047.m7763(sb3));
            return C0047.m7783(arrayList);
        } catch (Exception e) {
            m5546(e);
            return C0007.m1840();
        }
    }
}