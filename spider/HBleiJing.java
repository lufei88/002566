package com.github.catvod.spider;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.os.Handler;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.E.m;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.G.C0019;
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
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.a0.P;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.merge.f.C0051;
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
import com.github.catvod.spider.merge.z.C0065;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.a0.C0006;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import com.github.catvod.spider.p000mergexbpq.r.C0014;
import com.github.catvod.spider.p000mergexbpq.x.C0015;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import com.google.gson.JsonObject;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.regex.Matcher;

/* loaded from: classes.dex */
public class HBleiJing extends Cloud {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f46short = {3117, 3121, 3121, 3125, 3126, 3199, 3178, 3178, 3113, 3104, 3116, 3119, 3116, 3115, 3106, 3179, 3133, 3132, 3135, 3178, 558, 544, 574, 530, 569, 546, 550, 552, 547, 624, 639, 628, 639, 628, 639, 632, 558, 632, 559, 558, 635, 558, 633, 553, 638, 638, 559, 635, 634, 553, 637, 559, 634, 634, 637, 558, 558, 553, 636, 555, 636, 552, 630, 621, 519, 542, 520, 542, 542, 516, 514, 515, 516, 521, 624, 636, 634, 637, 526, 520, 634, 639, 637, 527, 634, 526, 524, 523, 523, 520, 639, 632, 636, 638, 520, 634, 638, 639, 521, 521, 635, 527, 632, 638, 639, 633, 638, 1727, 1689, 1679, 1688, 1735, 1707, 1677, 1679, 1668, 1694, 1286, 1316, 1329, 1314, 1319, 1319, 1322, 1380, 1406, 1381, 1403, 1387, 1379, 1308, 1314, 1317, 1327, 1316, 1340, 1336, 1387, 1285, 1311, 1387, 1402, 1403, 1381, 1403, 1392, 1387, 1308, 1284, 1308, 1405, 1407, 1378, 1387, 1290, 1339, 1339, 1319, 1326, 1308, 1326, 1321, 1280, 1314, 1343, 1380, 1406, 1400, 1404, 1381, 1400, 1405, 1387, 1379, 1280, 1283, 1311, 1286, 1287, 1383, 1387, 1319, 1314, 1312, 1326, 1387, 1292, 1326, 1320, 1312, 1316, 1378, 1387, 1288, 1315, 1337, 1316, 1318, 1326, 1380, 1402, 1403, 1394, 1381, 1403, 1381, 1403, 1381, 1403, 1387, 1304, 1322, 1325, 1322, 1337, 1314, 1380, 1406, 1400, 1404, 1381, 1400, 1405, 3035, 3065, 3065, 3071, 3050, 3054, 1019, 1002, 1015, 1019, 928, 999, 1019, 994, 995, 931, 1006, 1023, 1023, 995, 998, 1004, 1006, 1019, 998, 992, 993, 928, 1015, 999, 1019, 994, 995, 932, 1015, 994, 995, 931, 1006, 1023, 1023, 995, 998, 1004, 1006, 1019, 998, 992, 993, 928, 1015, 994, 995, 948, 1022, 946, 959, 929, 950, 931, 998, 994, 1006, 1000, 1002, 928, 1006, 1017, 998, 1001, 931, 998, 994, 1006, 1000, 1002, 928, 1016, 1002, 1005, 1023, 931, 998, 994, 1006, 1000, 1002, 928, 1006, 1023, 993, 1000, 931, 933, 928, 933, 948, 1022, 946, 959, 929, 951, 931, 1006, 1023, 1023, 995, 998, 1004, 1006, 1019, 998, 992, 993, 928, 1020, 998, 1000, 993, 1002, 1003, 930, 1002, 1015, 1004, 999, 1006, 993, 1000, 1002, 948, 1017, 946, 1005, 956, 948, 1022, 946, 959, 929, 950, 2611, 2597, 2595, 2669, 2595, 2600, 2669, 2613, 2593, 2903, 2901, 2875, 2842, 2817, 2901, 2868, 2894, 2871, 2823, 2836, 2843, 2833, 2903, 2894, 2819, 2888, 2903, 2892, 2892, 2903, 2905, 2901, 2903, 2870, 2845, 2823, 2842, 2840, 2844, 2816, 2840, 2903, 2894, 2819, 2888, 2903, 2892, 2893, 2903, 2330, 2316, 2314, 2372, 2314, 2305, 2372, 2332, 2312, 2372, 2308, 2310, 2315, 2304, 2309, 2316, 1584, 1599, 3299, 3317, 3315, 3261, 3315, 3320, 3261, 3301, 3313, 3261, 3296, 3324, 3313, 3300, 3318, 3327, 3298, 3325, 2754, 2743, 2697, 2702, 2692, 2703, 2711, 2707, 2754, 902, 899, 916, 897, 914, 919, 918, 990, 922, 925, 896, 918, 912, 902, 897, 918, 990, 897, 918, 898, 902, 918, 896, 903, 896, 555, 1353, 1375, 1369, 1303, 1372, 1375, 1358, 1369, 1362, 1303, 1353, 1363, 1358, 1375, 1043, 1025, 1037, 1029, 1101, 1039, 1042, 1033, 1031, 1033, 1038, 1591, 1569, 1575, 1641, 1570, 1569, 1584, 1575, 1580, 1641, 1577, 1579, 1568, 1569, 547, 556, 571, 548, 554, 556, 569, 552, 289, 311, 305, 383, 308, 311, 294, 305, 314, 383, 295, 289, 311, 288, 1986, 1996, 2033, 2023, 2017, 1967, 2020, 2023, 2038, 2017, 2026, 1967, 2022, 2023, 2033, 2038, 1890, 1897, 1893, 1907, 1899, 1891, 1896, 1906, 1525, 1506, 1505, 1506, 1525, 1506, 1525, 557, 561, 561, 565, 566, 639, 618, 618, 553, 544, 556, 559, 556, 555, 546, 619, 573, 572, 575, 618, 2775, 2773, 2773, 2771, 2758, 2754, 2715, 2778, 2775, 2776, 2769, 2755, 2775, 2769, 2771, 2370, 2384, 2325, 2427, 2422, 2324, 2370, 2384, 2307, 2377, 2309, 2312, 2326, 2305, 1543, 1549, 1563, 1561, 1632, 1633, 1571, 1578, 1574, 1573, 1574, 1569, 1576, 1580, 1572, 3072, 3079, 3113, 3079, 3125, 3079, 3112, 3078, 3184, 3199, 2659, 2671, 2671, 2667, 2665, 2661, 588, 577, 606, 518, 604, 577, 604, 580, 589, 2745, 2725, 2725, 2721, 2722, 2795, 2814, 2814, 2738, 2749, 2750, 2724, 2741, 2701, 2815, 2784, 2793, 2792, 2701, 2815, 2738, 2751, 2814, 2725, 2814, 2698, 2736, 2812, 2731, 2704, 2812, 2699, 2785, 2812, 2792, 2700, 2810, 1649, 1578, 1627, 1649, 1649, 1649, 1649, 1649, 1649, 1649, 1649, 1651, 1573, 1576, 1592, 1573, 1598, 1594, 1588, 1599, 1651, 1643, 1651, 1651, 1661, 1627, 1649, 1649, 1649, 1649, 1649, 1649, 1649, 1649, 1651, 1589, 1572, 1573, 1598, 1594, 1588, 1599, 1651, 1643, 1651, 1651, 1661, 1627, 1649, 1649, 1649, 1649, 1649, 1649, 1649, 1649, 1651, 1569, 1632, 1635, 1634, 1573, 1598, 1594, 1588, 1599, 1651, 1643, 1651, 1651, 1661, 1627, 1649, 1649, 1649, 1649, 1649, 1649, 1649, 1649, 1651, 1573, 1598, 1594, 1588, 1599, 1651, 1643, 1649, 1651, 1651, 1661, 1627, 1649, 1649, 1649, 1649, 1649, 1649, 1649, 1649, 1651, 1586, 1598, 1598, 1594, 1592, 1588, 1651, 1643, 1649, 1651, 1651, 1661, 1627, 1649, 1649, 1649, 1649, 1649, 1649, 1649, 1649, 1651, 1572, 1586, 1586, 1598, 1598, 1594, 1592, 1588, 1651, 1643, 1651, 1651, 1661, 1627, 1649, 1649, 1649, 1649, 1649, 1649, 1649, 1649, 1651, 1570, 1592, 1573, 1588, 1651, 1643, 1649, 1651, 1651, 1627, 1649, 1649, 1649, 1649, 1649, 1649, 1580, 1141, 1148, 1136, 1139, 1146, 1138, 1652, 1640, 1640, 1644, 1887, 1861, 1880, 1865, 1412, 1502, 1474, 1432, 1413, 1432, 1408, 1417, 1484, 1490, 1484, 1421, 2359, 2337, 2341, 2358, 2343, 2348, 2427, 2351, 2337, 2365, 2355, 2347, 2358, 2336, 2425, 2440, 2447, 2432, 2441, 2457, 2443, 2432, 2501, 2501, 2501, 2249, 2244, 2267, 2179, 2265, 2242, 2269, 2244, 2254, 2276, 2265, 2248, 2240, 1797, 1798, 1815, 1816, 1880, 1794, 1815, 1809, 21983, 26716, 1803, 29250, 22534, 1803, 21776, -28239, 1803, 31197, 22562, 1803, 31115, -31475, 1803, 1859, 1852, 1803, 22534, -29007, 2720, 2746, 2733, 2734, 2140, 2129, 2126, 2070, 2137, 2126, 2137, 2124, 2137, 2122, 2170, 2135, 2112, 2072, 2054, 2072, 2137, 2072, 2054, 2072, 2129, 2133, 2143, 1862, 1863, 1878, 715, 24510, 24992, -28469, -25980, 31973, 30341, 25120, 31518, 27293, 24885, 25420, 
    25938, 1590, -29237, 18755, 29460, 1661, 1616, 1619, 1619, 1623, 27507, -28684, 20564, 25642, -31175, 22346, 18666, 25477, 27369, -30762, -29072, 28743, 22889, -28469, -25980, 31973, 30341, 1590, -31349, 21994, 1631, 1619, 1619, 1623, 1621, 1625, -30233, -29072, -30289, 22361, 1590, 31973, 30341, 20748, 20860, 1542, 1564, 1620, 1608, 1608, 1612, 1615, 1542, 1555, 1555, 1616, 1625, 1621, 1622, 1621, 1618, 1627, 1554, 1604, 1605, 1606, 1555, 2662, 2668, 2682, 2680, 2561, 2560, 2626, 2635, 2631, 2628, 2631, 2624, 2633, 2637, 2629};
    public String g = C0055.m8814(m289(), 0, 20, 3141);
    public String h = C0024.m4740(m289(), 20, 87, 589);
    public AlertDialog i;

    /* renamed from: ۟ۤۥۧۤ, reason: not valid java name and contains not printable characters */
    public static JsonObject m287(Object obj) {
        if (C0060.m9355() > 0) {
            return AbstractC0308c.k((String) obj);
        }
        return null;
    }

    /* renamed from: ۦۡۡۥ, reason: contains not printable characters */
    public static String m288(Object obj, Object obj2, Object obj3) {
        if (C0023.m4566() < 0) {
            return AbstractC0308c.f((JsonObject) obj, (String) obj2, (String) obj3);
        }
        return null;
    }

    /* renamed from: ۦۥۥۡ, reason: contains not printable characters */
    public static short[] m289() {
        if (C0049.m8038() <= 0) {
            return f46short;
        }
        return null;
    }

    public final HashMap a() {
        HashMap mapM4127 = C0019.m4127(C0044.m7509(m289(), 107, 10, 1770), C0044.m7509(m289(), 117, 106, 1355), C0018.m3917(m289(), 223, 6, 2970), C0015.m3484(m289(), 229, 135, 911));
        C0053.m8424(mapM4127, C0022.m4403(m289(), 364, 9, 2624), C0002.m1305(m289(), 373, 40, 2933));
        C0053.m8424(mapM4127, C0025.m4795(m289(), 413, 16, 2409), C0056.m8911(m289(), 429, 2, 1551));
        C0053.m8424(mapM4127, C0050.m8131(m289(), 431, 18, 3216), C0049.m8007(m289(), 449, 9, 2784));
        C0053.m8424(mapM4127, C0005.m1645(m289(), 458, 25, 1011), C0065.m9775(m289(), 483, 1, 538));
        C0053.m8424(mapM4127, C0009.m2037(m289(), 484, 14, 1338), C0047.m7833(m289(), 498, 11, 1120));
        C0053.m8424(mapM4127, C0022.m4403(m289(), 509, 14, 1604), C0022.m4403(m289(), 523, 8, 589));
        C0053.m8424(mapM4127, C0002.m1305(m289(), 531, 14, 338), C0032.m5708(m289(), 545, 2, 2045));
        C0053.m8424(mapM4127, C0028.m5109(m289(), 547, 14, 1922), C0064.m9599(m289(), 561, 8, 1798));
        C0053.m8424(mapM4127, C0038.m6452(m289(), 569, 7, 1415), C0000.m1077(m289(), 576, 20, 581));
        C0053.m8424(mapM4127, C0036.m6188(m289(), 596, 15, 2742), C0060.m9352(m289(), 611, 14, 2360));
        String strM1542 = C0004.m1542(C0061.m9361(m289(), 625, 15, 1615));
        C0053.m8424(mapM4127, C0026.m4951(m289(), 650, 6, 2560), !C0057.m8953(strM1542) ? C0025.m4800(strM1542, C0012.m2973(m289(), 640, 10, 3163), C0007.m1840()) : C0016.m3544(this));
        return mapM4127;
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        return C0007.m1840();
    }

    @Override // com.github.catvod.spider.Cloud
    public String detailContent(List<String> list) {
        String strM5769 = C0032.m5769((String) C0048.m7915(list, 0), C0043.m7343(this));
        String strM4684 = C0024.m4684(C0030.m5333(C0016.m3577(strM5769), C0013.m3106(m289(), 656, 9, 552)));
        ArrayList arrayList = new ArrayList();
        Matcher matcherM6026 = C0034.m6026(C0005.m1602(C0063.m9585(m289(), 665, 37, 2769)), strM5769);
        while (C0003.m1405(matcherM6026)) {
            C0004.m1532(arrayList, C0062.m9422(matcherM6026));
        }
        ArrayList arrayList2 = new ArrayList(new LinkedHashSet(arrayList));
        m mVar = new m();
        C0027.m5000(mVar, C0055.m8703());
        C0011.m2828(mVar, (String) C0048.m7915(list, 0));
        C0005.m1628(mVar, strM4684);
        C0044.m7449(mVar, C0014.m3356(this, arrayList2));
        C0054.m8596(mVar, C0030.m5351(this));
        return C0053.m8428(mVar);
    }

    public String homeContent(boolean z) {
        C0030.m5354(this);
        return C0007.m1840();
    }

    public void init(Context context) {
        C0051.m8194(C0035.m6110());
        super.init(context, C0007.m1842(m289(), 702, 164, 1617));
    }

    @Override // com.github.catvod.spider.Cloud
    public void init(Context context, String str) {
        JsonObject jsonObjectM287 = m287(str);
        String strM1774 = C0006.m1774(m289(), 866, 6, 1049);
        String strM1840 = C0007.m1840();
        if (!C0057.m8953(m288(jsonObjectM287, strM1774, strM1840))) {
            String strM288 = m288(jsonObjectM287, strM1774, strM1840);
            this.h = strM288;
            if (C0058.m9127(strM288, C0027.m5062(m289(), 872, 4, 1564))) {
                this.h = C0032.m5769(C0016.m3544(this), null);
            }
        }
        String strM4107 = C0019.m4107(m289(), 876, 4, 1836);
        if (!C0057.m8953(m288(jsonObjectM287, strM4107, strM1840))) {
            this.g = m288(jsonObjectM287, strM4107, strM1840);
        }
        super.init(context, str);
    }

    public String searchContent(String str, String str2, boolean z) {
        String strM9352 = C0060.m9352(m289(), 880, 12, 1516);
        ArrayList arrayList = new ArrayList();
        String strM6434 = C0038.m6434(new StringBuilder(), C0003.m1366(this), C0002.m1305(m289(), 892, 15, 2372), str);
        PrintStream printStreamM6087 = C0035.m6087();
        StringBuilder sb = new StringBuilder(C0005.m1645(m289(), 907, 10, 2542));
        C0018.m3933(sb, strM6434);
        C0012.m2969(printStreamM6087, C0047.m7763(sb));
        Iterator itM7807 = C0047.m7807(C0030.m5333(C0016.m3577(C0032.m5769(strM6434, C0043.m7343(this))), C0047.m7833(m289(), 917, 13, 2221)));
        while (C0012.m2962(itM7807)) {
            com.github.catvod.spider.merge.T0.m mVar = (com.github.catvod.spider.merge.T0.m) C0048.m7949(itM7807);
            try {
                String strM9669 = C0064.m9669(C0036.m6243(mVar, C0063.m9585(m289(), 930, 8, 1910)));
                if (C0003.m1405(C0034.m6026(C0005.m1602(C0000.m1077(m289(), 938, 20, 1911)), strM9669))) {
                    String strM4684 = C0024.m4684(C0030.m5333(mVar, strM9352));
                    String strM8058 = C0049.m8058(C0030.m5333(mVar, strM9352), C0041.m6779(m289(), 958, 4, 2760));
                    String strM80582 = C0049.m8058(C0030.m5333(mVar, C0024.m4740(m289(), 962, 23, 2104)), C0047.m7833(m289(), 985, 3, 1845));
                    StringBuilder sb2 = new StringBuilder();
                    C0018.m3933(sb2, C0003.m1366(this));
                    C0018.m3933(sb2, strM8058);
                    C0004.m1532(arrayList, new m(C0047.m7763(sb2), strM4684, strM80582, strM9669));
                }
            } catch (Exception unused) {
            }
        }
        return C0047.m7783(arrayList);
    }

    public String searchContent(String str, boolean z) {
        return C0027.m5081(this, C0056.m8909(str), C0065.m9775(m289(), 988, 1, 762), true);
    }

    public Runnable showdig() {
        int iM3103 = C0013.m3103(16);
        Activity activityM4453 = C0022.m4453();
        LinearLayout linearLayout = new LinearLayout(C0031.m5652());
        C0032.m5684(linearLayout, 1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        C0012.m2963(layoutParams, iM3103, iM3103, iM3103, iM3103);
        C0009.m2112(linearLayout, layoutParams);
        TextView textView = new TextView(C0031.m5652());
        C0042.m7106(textView, C0042.m7151(m289(), 989, 78, 1596));
        C0039.m6563(textView, 16.0f);
        C0017.m3709(textView, C0013.m3103(20), 0, C0013.m3103(20), C0013.m3103(16));
        C0026.m4878(textView, -16777216);
        EditText editText = new EditText(C0031.m5652());
        C0042.m7106(editText, C0004.m1542(C0000.m1077(m289(), 1067, 15, 2606)));
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        C0037.m6336(linearLayout, textView);
        C0041.m6790(linearLayout, editText, layoutParams2);
        C0047.m7781(new Handler(C0063.m9553()), new P(this, activityM4453, linearLayout, editText, 2));
        return null;
    }
}