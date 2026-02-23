package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.E.b;
import com.github.catvod.spider.merge.E.g;
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
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.T0.h;
import com.github.catvod.spider.merge.T0.m;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0038;
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
import com.github.catvod.spider.merge.f0.C0052;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.c0.C0010;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import com.github.catvod.spider.p000mergexbpq.r.C0014;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public class DianYingYunJi extends Cloud {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f16short = {2273, 2208, 2227, 2229, 2216, 2210, 2221, 2212, 2287, 2225, 2222, 2226, 2229, 2284, 2216, 2229, 2212, 2220, 2117, 2079, 2051, 2120, 2115, 2137, 2143, 2132, 2048, 2137, 2116, 2137, 2113, 2120, 2061, 2067, 2061, 2124, 928, 954, 941, 942, 2524, 2456, 2453, 2442, 2514, 2457, 2450, 2440, 2446, 2437, 2513, 2449, 2457, 2456, 2453, 2461, 2524, 2498, 2524, 2461, 2987, 2990, 3003, 2990, 3042, 2989, 2984, 1184, 1212, 1212, 1208, 2559, 2531, 2531, 2535, 2532, 2477, 2488, 2488, 2547, 2542, 2542, 2557, 2535, 2533, 2552, 2489, 2548, 2552, 2554, 1796, 1880, 1882, 1871, 1798, 1821, 1864, 1798, 1295, 1299, 1299, 1303, 1300, 1373, 1352, 1352, 1283, 1310, 1310, 1293, 1303, 1301, 1288, 1353, 1284, 1288, 1290, 2864, 2838, 2816, 2839, 2888, 2852, 2818, 2816, 2827, 2833, 3294, 3324, 3305, 3322, 3327, 3327, 3314, 3260, 3238, 3261, 3235, 3251, 3259, 3268, 3322, 3325, 3319, 3324, 3300, 3296, 3251, 3293, 3271, 3251, 3234, 3235, 3261, 3235, 3240, 3251, 3268, 3322, 3325, 3237, 3239, 3240, 3251, 3307, 3237, 3239, 3258, 3251, 3282, 3299, 3299, 3327, 3318, 3268, 3318, 3313, 3288, 3322, 3303, 3260, 3238, 3232, 3236, 3261, 3232, 3237, 3251, 3259, 3288, 3291, 3271, 3294, 3295, 3263, 3251, 3327, 3322, 3320, 3318, 3251, 3284, 3318, 3312, 3320, 3324, 3258, 3251, 3280, 3323, 3297, 3324, 3326, 3318, 3260, 3234, 3233, 3233, 3261, 3235, 3261, 3235, 3261, 3235, 3251, 3264, 3314, 3317, 3314, 3297, 3322, 3260, 3238, 3232, 3236, 3261, 3232, 3237, 1696, 1708, 1708, 1704, 1706, 1702, 1126, 1136, 1120, 1116, 1136, 1126, 1122, 1137, 1120, 1131, 1116, 1120, 1122, 1139, 1143, 1120, 1131, 1122, 1086, 1074, 1080, 1059, 1137, 1126, 1136, 1142, 1135, 1143, 1086, 1079, 1072, 2189, 2258, 2243, 2245, 2247, 2189, 583, 609, 631, 608, 575, 595, 629, 631, 636, 614, 1596, 1566, 1547, 1560, 1565, 1565, 1552, 1630, 1604, 1631, 1601, 1617, 1625, 1574, 1560, 1567, 1557, 1566, 1542, 1538, 1617, 1599, 1573, 1617, 1600, 1601, 1631, 1601, 1610, 1617, 1574, 1560, 1567, 1607, 1605, 1610, 1617, 1545, 1607, 1605, 1624, 1617, 1584, 1537, 1537, 1565, 1556, 1574, 1556, 1555, 1594, 1560, 1541, 1630, 1604, 1602, 1606, 1631, 1602, 1607, 1617, 1625, 1594, 1593, 1573, 1596, 1597, 1629, 1617, 1565, 1560, 1562, 1556, 1617, 1590, 1556, 1554, 1562, 1566, 1624, 1617, 1586, 1561, 1539, 1566, 1564, 1556, 1630, 1600, 1603, 1603, 1631, 1601, 1631, 1601, 1631, 1601, 1617, 1570, 1552, 1559, 1552, 1539, 1560, 1630, 1604, 1602, 1606, 1631, 1602, 1607, 3113, 3087, 3097, 3086, 3153, 3133, 3099, 3097, 3090, 3080, 536, 570, 559, 572, 569, 569, 564, 634, 608, 635, 613, 629, 637, 514, 572, 571, 561, 570, 546, 550, 629, 539, 513, 629, 612, 613, 635, 613, 622, 629, 514, 572, 571, 611, 609, 622, 629, 557, 611, 609, 636, 629, 532, 549, 549, 569, 560, 514, 560, 567, 542, 572, 545, 634, 608, 614, 610, 635, 614, 611, 629, 637, 542, 541, 513, 536, 537, 633, 629, 569, 572, 574, 560, 629, 530, 560, 566, 574, 570, 636, 629, 534, 573, 551, 570, 568, 560, 634, 612, 615, 615, 635, 613, 635, 613, 635, 613, 629, 518, 564, 563, 564, 551, 572, 634, 608, 614, 610, 635, 614, 611, 1590, 1662, 1575, 1592, 1638, 1657, 1637, 1634, 1595, 1634, 1663, 1634, 1658, 1651, 1962, 1977, 1983, 1954, 1960, 1959, 1966, 2021, 1979, 1956, 1976, 1983, 2022, 1960, 1956, 1957, 1983, 1966, 1957, 1983, 2027, 2027, 1954, 1958, 1964, 612, 613, 628, 1557, 1542, 1536, 1565, 1559, 1560, 1553, 1626, 1540, 1563, 1543, 1536, 1625, 1559, 1563, 1562, 1536, 1553, 1562, 1536, 1620, 1610, 1620, 1540, 21085, 26293, 2459, 2441, 2447, 2443, 2462, 2440, 30391, 23494, 2459, 21591, 20573, 861, 847, 841, 845, 856, 846, -30582, -30361, 861, 18222, 26113, 2351, 2365, 2363, 2367, 2346, 2364, 30062, 24222, 2351, 19366, 25484, 24649, 25267, 1430, 1412, 1410, 1414, 1427, 1413, 30699, -28461, 1430, 24096, 27778, 30663, 17036, 3183, 3177, 3181, 3192, 3182, -28688, 21777, 27778, 24050, 3235, 3248, 3254, 3243, 3233, 3246, 3239, 3308, 3250, 3245, 3249, 3254, 3311, 3233, 3245, 3244, 3254, 3239, 3244, 3254, 3298, 3250, 3298, 3235, 1638, 1660, 1643, 1640, 1036, 1100, 1104, 1104, 1108, 1111, 1054, 1144, 1035, 1144, 1035, 1108, 1093, 1098, 1144, 1034, 1109, 1105, 1093, 1110, 1103, 1144, 1034, 1095, 1098, 1144, 1035, 1111, 1144, 1035, 1151, 1146, 1030, 1145, 1039, 1037, 1426, 1473, 1474, 1491, 1500, 1436, 1503, 1495, 1478, 1491, 1439, 1489, 1491, 1478, 1439, 1494, 1501, 1478, 1460, 1426, 1412, 1427, 1484, 1440, 1414, 1412, 1423, 1429, 777, 811, 830, 813, 808, 808, 805, 875, 881, 874, 884, 868, 876, 787, 813, 810, 800, 811, 819, 823, 868, 778, 784, 868, 885, 884, 874, 884, 895, 868, 787, 813, 810, 882, 880, 895, 868, 828, 882, 880, 877, 868, 773, 820, 820, 808, 801, 787, 801, 806, 783, 813, 816, 875, 881, 887, 883, 874, 887, 882, 868, 876, 783, 780, 784, 777, 776, 872, 868, 808, 813, 815, 801, 868, 771, 801, 807, 815, 811, 877, 868, 775, 812, 822, 811, 809, 801, 875, 885, 886, 886, 874, 884, 874, 884, 874, 884, 868, 791, 805, 802, 805, 822, 813, 875, 881, 887, 883, 874, 887, 882, 1481, 1493, 1493, 1489, 1490, 1435, 1422, 1422, 1477, 1496, 1496, 1483, 1489, 1491, 1486, 1423, 1474, 1486, 1484, 335, 332, 263, 266, 270, 267, 266, 285, 322, 257, 270, 281, 269, 270, 285, 335, 337, 335, 259, 262, 321, 258, 266, 257, 282, 322, 262, 283, 266, 258, 335, 337, 335, 270, 1264, 1258, 1277, 1278};

    public static String a(String str, Pattern pattern) {
        Matcher matcherM6026 = C0034.m6026(pattern, str);
        return C0003.m1405(matcherM6026) ? C0064.m9640(C0021.m4306(matcherM6026, 1)) : C0007.m1840();
    }

    public static ArrayList b(h hVar) {
        ArrayList arrayList = new ArrayList();
        Iterator itM7807 = C0047.m7807(C0030.m5333(hVar, C0011.m2805(m106(), 0, 18, 2241)));
        while (C0012.m2962(itM7807)) {
            m mVar = (m) C0048.m7949(itM7807);
            String strM9106 = C0058.m9106(m106(), 18, 18, 2093);
            String strM2339 = C0010.m2339(C0036.m6243(mVar, strM9106), C0047.m7833(m106(), 36, 4, 968));
            String strM23392 = C0010.m2339(C0036.m6243(mVar, C0033.m5852(m106(), 40, 20, 2556)), C0044.m7509(m106(), 60, 7, 3023));
            if (!C0043.m7277(strM23392, C0022.m4403(m106(), 67, 4, 1224))) {
                strM23392 = C0050.m8125(C0025.m4795(m106(), 71, 19, 2455), strM23392);
            }
            C0055.m8732(strM2339, C0064.m9669(C0036.m6243(mVar, strM9106)), strM23392, C0007.m1840(), arrayList);
        }
        return arrayList;
    }

    public static String c(String str) {
        String strM8909 = C0056.m8909(str);
        StringBuilder sb = new StringBuilder(C0048.m7902(m106(), 90, 8, 1851));
        C0018.m3933(sb, strM8909);
        String strM8125 = C0050.m8125(C0013.m3106(m106(), 98, 19, 1383), C0047.m7763(sb));
        HashMap map = new HashMap();
        C0053.m8424(map, C0040.m6584(m106(), 117, 10, 2917), C0000.m1077(m106(), 127, 111, 3219));
        C0053.m8424(map, C0052.m8337(m106(), 238, 6, 1731), C0032.m5708(m106(), 244, 31, 1027));
        return C0047.m7783(C0029.m5201(C0016.m3577(C0032.m5769(strM8125, map))));
    }

    /* renamed from: ۟ۤ۠ۡۨ, reason: not valid java name and contains not printable characters */
    public static short[] m106() {
        if (C0008.m1975() >= 0) {
            return f16short;
        }
        return null;
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        String strM5172 = C0028.m5172(str, C0053.m8477(m106(), 275, 6, 2210), str2);
        HashMap map2 = new HashMap();
        C0053.m8424(map2, C0042.m7151(m106(), 281, 10, 530), C0058.m9106(m106(), 291, 111, 1649));
        ArrayList arrayListM5201 = C0029.m5201(C0016.m3577(C0032.m5769(strM5172, map2)));
        int iM6456 = (C0038.m6456(str2) + 1) * 19;
        g gVar = new g();
        C0045.m7632(gVar, arrayListM5201);
        C0049.m7974(gVar, C0038.m6456(str2), C0038.m6456(str2) + 1, 19, iM6456);
        return C0033.m5828(gVar);
    }

    @Override // com.github.catvod.spider.Cloud
    public String detailContent(List<String> list) {
        String str = (String) C0048.m7915(list, 0);
        HashMap map = new HashMap();
        C0053.m8424(map, C0026.m4951(m106(), 402, 10, 3196), C0057.m8978(m106(), 412, 111, 597));
        h hVarM3577 = C0016.m3577(C0032.m5769(str, map));
        com.github.catvod.spider.merge.E.m mVar = new com.github.catvod.spider.merge.E.m();
        C0011.m2828(mVar, str);
        C0005.m1628(mVar, C0064.m9669(C0036.m6243(hVarM3577, C0046.m7718(m106(), 523, 14, 1558))));
        C0026.m4947(mVar, C0010.m2339(C0036.m6243(hVarM3577, C0016.m3525(m106(), 537, 25, 1995)), C0040.m6584(m106(), 562, 3, 535)));
        String strM4684 = C0024.m4684(C0030.m5333(hVarM3577, C0054.m8574(m106(), 565, 24, 1652)));
        C0058.m9159(mVar, C0014.m3323(strM4684, C0005.m1602(C0033.m5852(m106(), 589, 11, 2465))));
        C0017.m3671(mVar, C0014.m3323(strM4684, C0005.m1602(C0062.m9389(m106(), 600, 11, 871))));
        C0058.m9152(mVar, C0014.m3323(strM4684, C0005.m1602(C0050.m8131(m106(), 611, 11, 2325))));
        C0022.m4432(mVar, C0014.m3323(strM4684, C0005.m1602(C0048.m7902(m106(), 622, 13, 1452))));
        C0019.m4073(mVar, C0007.m1840());
        C0027.m5000(mVar, C0014.m3323(strM4684, C0005.m1602(C0011.m2805(m106(), 635, 13, 3143))));
        ArrayList arrayList = new ArrayList();
        Iterator itM7807 = C0047.m7807(C0030.m5333(hVarM3577, C0010.m2300(m106(), 648, 24, 3266)));
        while (C0012.m2962(itM7807)) {
            m mVar2 = (m) C0048.m7949(itM7807);
            String strM8477 = C0053.m8477(m106(), 672, 4, 1550);
            if (C0064.m9686(C0010.m2339(mVar2, strM8477), C0054.m8574(m106(), 676, 36, 1060))) {
                C0004.m1532(arrayList, C0064.m9640(C0010.m2339(mVar2, strM8477)));
            }
        }
        C0058.m9085(mVar, C0064.m9669(C0036.m6243(hVarM3577, C0029.m5256(m106(), 712, 18, 1458))));
        C0044.m7449(mVar, C0014.m3356(this, arrayList));
        C0054.m8596(mVar, C0030.m5351(this));
        return C0053.m8428(mVar);
    }

    public String homeContent(boolean z) {
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        C0053.m8424(map, C0047.m7833(m106(), 730, 10, 1505), C0023.m4536(m106(), 740, 111, 836));
        String strM4107 = C0019.m4107(m106(), 851, 19, 1441);
        h hVarM3577 = C0016.m3577(C0032.m5769(strM4107, map));
        Iterator itM7807 = C0047.m7807(C0030.m5333(hVarM3577, C0040.m6584(m106(), 870, 34, 367)));
        while (C0012.m2962(itM7807)) {
            m mVar = (m) C0048.m7949(itM7807);
            String strM2339 = C0010.m2339(mVar, C0054.m8574(m106(), 904, 4, 1176));
            String strM9669 = C0064.m9669(mVar);
            if (C0058.m9127(strM2339, strM4107)) {
                C0004.m1532(arrayList, new b(strM2339, strM9669, null));
            }
        }
        return C0025.m4831(arrayList, C0029.m5201(hVarM3577));
    }

    @Override // com.github.catvod.spider.Cloud
    public void init(Context context, String str) {
        super.init(context, str);
    }

    public String searchContent(String str, boolean z) {
        return C0009.m2142(str);
    }

    public String searchContent(String str, boolean z, String str2) {
        return C0009.m2142(str);
    }
}