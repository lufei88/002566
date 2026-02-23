package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.E.b;
import com.github.catvod.spider.merge.E.g;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.J0.C0021;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.N.C0023;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.T0.h;
import com.github.catvod.spider.merge.T0.m;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.V0.d;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0038;
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
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.r0.C0060;
import com.github.catvod.spider.merge.t.C0061;
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
import com.github.catvod.spider.p000mergexbpq.r.C0014;
import com.github.catvod.spider.p000mergexbpq.x.C0015;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class HBheiHu extends Spider {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f45short = {1532, 1498, 1484, 1499, 1412, 1512, 1486, 1484, 1479, 1501, 528, 531, 539, 532, 522, 531, 539, 532, 599, 539, 532, 542, 520, 533, 531, 542, 597, 585, 588, 586, 796, 774, 791, 771, 770, 798, 1848, 1907, 1911, 1904, 1838, 1846, 1910, 1834, 1799, 1907, 1829, 1845, 1851, 1837, 1849, 1833, 1904, 1798, 1810, 1912, 1796, 1795, 1913, 1839, 1827, 1813, 1849, 1807, 1836, 1824, 1802, 1902, 1808, 1808, 1800, 1792, 1835, 1826, 1845, 1837, 1802, 1832, 1796, 1847, 1936, 1932, 1932, 1928, 1986, 2007, 2007, 1950, 1945, 1951, 1941, 1942, 2006, 1947, 1943, 1941, 2007, 1940, 1937, 1931, 1932, 2007, 1536, 657, 727, 715, 722, 723, 1141, 1138, 1149, 1140, 1124, 1142, 1149, 1080, 1080, 1080, 572, 569, 638, 563, 575, 572, 637, 573, 564, 637, 615, 638, 563, 575, 572, 637, 547, 573, 637, 612, 638, 563, 575, 572, 637, 552, 547, 637, 611, 1231, 1171, 1161, 1235, 1230, 1235, 1227, 1218, 1161, 1235, 1218, 1247, 1235, 1162, 1224, 1233, 1218, 1237, 1217, 1227, 1224, 1232, 1159, 1177, 1159, 1222, 1722, 1703, 1722, 1698, 1707, 2867, 2857, 2878, 2877, 618, 2766, 2763, 2782, 2763, 2695, 2757, 2776, 2755, 2765, 2755, 2756, 2763, 2758, 526, 525, 540, 531, 595, 525, 532, 542, 592, 521, 536, 517, 521, 595, 521, 536, 517, 521, 592, 527, 532, 538, 533, 521, 1476, 1496, 1496, 1500, 1430, 1411, 1411, 1482, 1485, 1483, 1473, 1474, 1410, 1487, 1475, 1473, 1184, 1187, 1202, 1213, 1277, 1191, 1206, 1195, 1191, 1278, 1214, 1190, 1191, 1206, 1207, 1267, 1261, 1267, 1202, 2775, 2778, 2757, 2717, 2752, 2759, 2758, 2778, 2718, 2768, 2780, 2781, 2759, 2774, 2781, 2759, 2796, 2796, 2759, 2779, 2758, 2782, 2769, 2707, 2701, 2707, 2770, 2707, 2701, 2707, 2778, 2782, 2772, 2869, 2864, 2853, 2864, 2940, 2878, 2851, 2872, 2870, 2872, 2879, 2864, 2877, 1474, 1487, 1488, 1416, 1493, 1490, 1491, 1487, 1419, 1477, 1481, 1480, 1490, 1475, 1480, 1490, 1529, 1529, 1490, 1486, 1491, 1483, 1476, 2066, 2065, 2048, 2063, 2127, 2065, 2056, 2050, 2124, 2069, 2052, 2073, 2069, 2127, 2069, 2052, 2073, 2069, 2124, 2067, 2056, 2054, 2057, 2069, 1055, 1030, 1092, 1028, 1035, 1052, 1092, 1028, 1035, 1052, 1095, 1054, 1035, 1032, 1049, 1092, 1035, 1033, 1054, 1027, 1052, 1039, 1098, 1108, 1098, 1030, 1027, 1473, 1484, 1491, 1419, 1489, 1476, 1479, 1416, 1478, 1482, 1483, 1489, 1472, 1483, 1489, 1419, 1494, 1489, 1488, 1484, 1416, 1493, 1476, 1483, 1483, 1472, 1481, 1530, 1479, 1473, 1419, 1478, 1482, 1481, 1416, 1493, 1473, 1413, 1435, 1413, 1473, 1484, 1491, 1413, 1435, 1413, 1488, 1481, 626, 626, 626, 2481, 1988, 2008, 2008, 2012, 1942, 1923, 1923, 1994, 1997, 1995, 1985, 1986, 1922, 1999, 1987, 1985, 2240, 2266, 2253, 2254, 3284, 2503, 2457, 2515, 2518, 2499, 2518, 2455, 2441, 2455, 2518, 2396, 2306, 2368, 2373, 2370, 2377, 2333, 2316, 2322, 2316, 2381, 1641, 1591, 1661, 1660, 1642, 1658, 1591, 1649, 1648, 1661, 1661, 1660, 1655, 1588, 1633, 1642, 417, 2449, 2746, 618, 30684, 23960, 29332, -29081, 21958, 20973, 27758, 29790, -30504, 3053, 3057, 3057, 3061, 3007, 2986, 2986, 3044, 3061, 3052, 2987, 3054, 3056, 3044, 3052, 3055, 3052, 3071, 2987, 3046, 3050, 3048, 2986, 3061, 3049, 3044, 3068, 3040, 3063, 2986, 3044, 3061, 3052, 2987, 3061, 3053, 3061, 3002, 3056, 3063, 3049, 3000, 526, 1214, 1253, 1262, 1212, 1253, 1248, 1263, 1260, 1268, 1191, 1259, 1268, 1260, 1256, 1263, 1254, 1212, 1691, 1751, 1748, 1742, 1749, 1736, 1664, 518, 521, 541, 526, 514, 522, 3078, 3079, 3094, 1874, 1886, 1887, 1858, 1861, 1901, 1858, 1818, 1892, 1859, 1885, 1901, 1858, 1819, 1804, 1901, 1858, 1819, 1811, 1817, 1898, 1903, 1811, 1900, 1819, 1816, 1811, 1445, 1449, 1448, 1461, 1458, 1434, 1461, 1517, 1429, 1455, 1441, 1448, 1434, 1461, 1516, 1531, 1434, 1461, 1516, 1508, 1518, 1437, 1432, 1508, 1435, 1516, 1519, 1508, 2282, 2278, 2279, 2298, 2301, 2261, 2298, 2210, 2301, 2261, 2298, 2211, 2228, 2261, 2298, 2211, 2219, 2209, 2258, 2263, 2219, 2260, 2211, 2208, 2219, 3001, 3052, 3062, 3064, 3057, 2978, 2613, 2663, 2606, 1207, 1200, 1198, 1731, 3321, 3311, 3307, 3320, 3305, 3298, 3325, 3301, 3320, 3310, 2120, 2132, 2132, 2128, 2074, 2063, 2063, 2118, 2113, 2119, 2125, 2126, 2062, 2115, 2127, 2125, 2063, 2131, 2117, 2113, 2130, 2115, 2120, 2062, 2128, 2120, 2128, 1444, 1469, 1535, 1442, 1445, 1444, 1464, 1532, 1447, 1470, 1461, 1469, 1464, 1442, 1445, 1422, 1422, 1468, 1460, 1461, 1464, 1456, 1535, 1458, 1470, 1469, 1532, 1441, 1461, 1535, 1458, 1469, 1460, 1456, 1443, 1463, 1464, 1449, 1521, 1519, 1521, 1469, 1464, 18127, 32239, 2385, 2334, 2374, 2333, 2372, 2392, 2373, 2397, 2386, 3081, 3092, 3081, 3089, 3096, 2089, 2099, 2084, 2087, 1132, 1129, 1148, 1129, 1061, 1127, 1146, 1121, 1135, 1121, 1126, 1129, 1124, 1701, 1702, 1719, 1720, 1784, 1702, 1727, 1717, 1787, 1698, 1715, 1710, 1698, 3014, 3034, 3034, 3038, 2964, 2945, 2945, 3016, 3023, 3017, 3011, 3008, 2944, 3021, 3009, 3011};
    public String a;

    public static HashMap a() {
        return C0019.m4127(C0062.m9389(m286(), 0, 10, 1449), C0034.m6001(m286(), 10, 20, 634), C0051.m8259(m286(), 30, 6, 854), C0042.m7151(m286(), 36, 44, 1857));
    }

    /* renamed from: ۥۨۦۧ, reason: contains not printable characters */
    public static short[] m286() {
        if (C0043.m7332() > 0) {
            return f45short;
        }
        return null;
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        ArrayList arrayList = new ArrayList();
        String strM9145 = C0058.m9145(C0010.m2300(m286(), 80, 22, 2040), str, C0042.m7151(m286(), 102, 1, 1631), str2, C0028.m5109(m286(), 103, 5, 703));
        PrintStream printStreamM6087 = C0035.m6087();
        StringBuilder sb = new StringBuilder(C0010.m2300(m286(), 108, 10, 1043));
        C0018.m3933(sb, strM9145);
        C0012.m2969(printStreamM6087, C0047.m7763(sb));
        Iterator itM7807 = C0047.m7807(C0030.m5333(C0016.m3577(C0032.m5769(strM9145, C0011.m2744())), C0051.m8259(m286(), 118, 29, 592)));
        while (C0012.m2962(itM7807)) {
            m mVar = (m) C0048.m7949(itM7807);
            String strM4403 = C0022.m4403(m286(), 147, 26, 1191);
            String strM8058 = C0049.m8058(C0030.m5333(mVar, strM4403), C0036.m6188(m286(), 173, 5, 1742));
            String strM80582 = C0049.m8058(C0030.m5333(mVar, strM4403), C0060.m9352(m286(), 178, 4, 2907));
            C0055.m8732(C0026.m4915(C0038.m6452(m286(), 220, 16, 1452), strM80582), strM8058, C0049.m8058(C0030.m5333(mVar, C0062.m9389(m286(), 182, 1, 523)), C0019.m4107(m286(), 183, 13, 2730)), C0055.m8697(C0036.m6243(mVar, C0000.m1077(m286(), 196, 24, 637))), arrayList);
        }
        return C0020.m4216(C0011.m2808(C0038.m6456(str2)), C0047.m7818(1, str2), C0011.m2808(20), C0054.m8556(str2, 1, 20), arrayList);
    }

    public String detailContent(List<String> list) {
        String strM9106;
        h hVarM3577 = C0016.m3577(C0032.m5769((String) C0048.m7915(list, 0), C0011.m2744()));
        String strM4684 = C0024.m4684(C0030.m5333(hVarM3577, C0010.m2300(m286(), 236, 19, 1235)));
        String strM8058 = C0049.m8058(C0030.m5333(hVarM3577, C0002.m1305(m286(), 255, 33, 2739)), C0029.m5256(m286(), 288, 13, 2897));
        StringBuilder sb = new StringBuilder();
        C0018.m3933(sb, C0036.m6189());
        C0018.m3933(sb, C0024.m4684(C0038.m6459(C0030.m5333(hVarM3577, C0001.m1189(m286(), 301, 23, 1446)), C0065.m9775(m286(), 324, 24, 2145))));
        String strM7763 = C0047.m7763(sb);
        d dVarM5333 = C0030.m5333(hVarM3577, C0036.m6188(m286(), 348, 27, 1130));
        d dVarM53332 = C0030.m5333(hVarM3577, C0041.m6779(m286(), 375, 48, 1445));
        PrintStream printStreamM6087 = C0035.m6087();
        StringBuilder sb2 = new StringBuilder();
        C0018.m3933(sb2, strM4684);
        C0018.m3933(sb2, strM8058);
        C0012.m2969(printStreamM6087, C0047.m7763(sb2));
        StringBuilder sb3 = new StringBuilder();
        Iterator itM7807 = C0047.m7807(dVarM5333);
        while (true) {
            boolean zM2962 = C0012.m2962(itM7807);
            strM9106 = C0058.m9106(m286(), 423, 3, 598);
            if (!zM2962) {
                break;
            }
            m mVar = (m) C0048.m7949(itM7807);
            C0018.m3933(sb3, C0016.m3579());
            C0018.m3933(sb3, C0064.m9669(mVar));
            C0018.m3933(sb3, strM9106);
        }
        StringBuilder sb4 = new StringBuilder(C0007.m1840());
        Iterator itM78072 = C0047.m7807(dVarM53332);
        while (C0012.m2962(itM78072)) {
            Iterator itM78073 = C0047.m7807(C0030.m5333((m) C0048.m7949(itM78072), C0048.m7902(m286(), 426, 1, 2512)));
            while (C0012.m2962(itM78073)) {
                m mVar2 = (m) C0048.m7949(itM78073);
                String strM9669 = C0064.m9669(mVar2);
                StringBuilder sb5 = new StringBuilder(C0014.m3332(m286(), 427, 16, 1964));
                C0018.m3933(sb5, C0010.m2339(mVar2, C0008.m1970(m286(), 443, 4, 2216)));
                String strM77632 = C0047.m7763(sb5);
                C0018.m3933(sb4, strM9669);
                C0062.m9399(sb4, '$');
                C0018.m3933(sb4, strM77632);
                String strM7902 = C0048.m7902(m286(), 447, 1, 3242);
                C0018.m3933(sb4, strM7902);
                C0018.m3933(sb4, strM4684);
                C0018.m3933(sb4, strM7902);
                C0018.m3933(sb4, strM9669);
                C0062.m9399(sb4, '#');
            }
            C0018.m3933(sb4, strM9106);
        }
        String strM8337 = C0052.m8337(m286(), 448, 10, 2487);
        String strM96692 = C0064.m9669((m) C0028.m5161(C0030.m5333(hVarM3577, strM8337), 1));
        String strM96693 = C0064.m9669((m) C0028.m5161(C0030.m5333(hVarM3577, strM8337), 2));
        String strM46842 = C0024.m4684(C0030.m5333(hVarM3577, C0002.m1305(m286(), 458, 11, 2348)));
        String strM46843 = C0024.m4684(C0030.m5333(hVarM3577, strM8337));
        String strM46844 = C0024.m4684(C0030.m5333(hVarM3577, C0058.m9106(m286(), 469, 16, 1561)));
        com.github.catvod.spider.merge.E.m mVar3 = new com.github.catvod.spider.merge.E.m();
        C0017.m3671(mVar3, strM96692);
        C0058.m9152(mVar3, strM46842);
        C0058.m9159(mVar3, strM46843);
        C0019.m4073(mVar3, strM7763);
        C0022.m4432(mVar3, strM96693);
        StringBuilder sb6 = new StringBuilder();
        C0018.m3933(sb6, C0055.m8703());
        C0018.m3933(sb6, strM46844);
        C0027.m5000(mVar3, C0047.m7763(sb6));
        C0011.m2828(mVar3, (String) C0048.m7915(list, 0));
        C0026.m4947(mVar3, strM8058);
        C0005.m1628(mVar3, strM4684);
        C0054.m8596(mVar3, C0000.m1096(sb3));
        C0044.m7449(mVar3, C0000.m1096(sb4));
        return C0053.m8428(mVar3);
    }

    public String homeContent(boolean z) {
        ArrayList arrayList = new ArrayList();
        List listM1203 = C0001.m1203(new String[]{C0053.m8477(m286(), 485, 1, 400), C0002.m1305(m286(), 486, 1, 2467), C0064.m9599(m286(), 487, 1, 2697), C0016.m3525(m286(), 488, 1, 606)});
        List listM12032 = C0001.m1203(new String[]{C0002.m1305(m286(), 489, 2, 745), C0011.m2805(m286(), 491, 3, 1953), C0021.m4340(m286(), 494, 2, 837), C0030.m5362(m286(), 496, 2, 2722)});
        for (int i = 0; i < C0064.m9636(listM1203); i++) {
            C0004.m1532(arrayList, new b((String) C0048.m7915(listM1203, i), (String) C0048.m7915(listM12032, i), null));
        }
        return C0003.m1448(C0058.m9093(this), null, arrayList);
    }

    public void init(Context context, String str) {
        C0051.m8194(C0035.m6110());
        if (str != null) {
            this.a = str;
        }
    }

    public String playerContent(String str, String str2, List<String> list) {
        String strM1077 = C0000.m1077(m286(), 498, 42, 2949);
        C0036.m6219();
        String[] strArrM4752 = C0024.m4752(str2, C0047.m7833(m286(), 540, 1, 624));
        String str3 = null;
        String str4 = (strArrM4752.length <= 0 || C0057.m8953(strArrM4752[0])) ? null : strArrM4752[0];
        String str5 = (strArrM4752.length <= 1 || C0057.m8953(strArrM4752[1])) ? null : strArrM4752[1];
        if (strArrM4752.length > 2 && !C0057.m8953(strArrM4752[2])) {
            str3 = strArrM4752[2];
        }
        StringBuilder sb = new StringBuilder();
        C0018.m3933(sb, C0051.m8217());
        C0018.m3933(sb, C0029.m5256(m286(), 541, 17, 1153));
        C0018.m3933(sb, str5);
        C0018.m3933(sb, C0055.m8814(m286(), 558, 7, 1725));
        C0018.m3933(sb, str3);
        String strM7763 = C0047.m7763(sb);
        try {
            String strM5769 = C0032.m5769(C0049.m8058(C0030.m5333(C0016.m3577(C0032.m5769(str4, C0038.m6454())), C0043.m7290(m286(), 565, 6, 623)), C0057.m8978(m286(), 571, 3, 3189)), C0038.m6454());
            String strM1778 = C0006.m1778(strM5769, C0009.m2037(m286(), 574, 27, 1841));
            String strM17782 = C0006.m1778(strM5769, C0019.m4107(m286(), 601, 28, 1478));
            String strM17783 = C0006.m1778(strM5769, C0015.m3484(m286(), 629, 25, 2185));
            StringBuilder sb2 = new StringBuilder(strM1077);
            C0018.m3933(sb2, strM1778);
            C0018.m3933(sb2, C0012.m2973(m286(), 654, 6, 2975));
            C0018.m3933(sb2, strM17782);
            C0018.m3933(sb2, C0026.m4951(m286(), 660, 3, 2579));
            C0018.m3933(sb2, strM17783);
            String strM57692 = C0032.m5769(C0047.m7763(sb2), C0038.m6454());
            g gVar = new g();
            C0017.m3667(gVar, C0001.m1212(new JSONObject(strM57692), C0026.m4951(m286(), 663, 3, 1218)));
            C0057.m9029(gVar, C0038.m6454());
            C0002.m1282(gVar, strM7763);
            return C0033.m5828(gVar);
        } catch (Exception unused) {
            g gVarM9311 = C0060.m9311(1, str4);
            C0057.m9029(gVarM9311, C0038.m6454());
            C0002.m1282(gVarM9311, strM7763);
            return C0033.m5828(gVarM9311);
        }
    }

    public String searchContent(String str, boolean z) {
        return C0021.m4364(this, str, true, C0023.m4536(m286(), 666, 1, 1778));
    }

    public String searchContent(String str, boolean z, String str2) {
        ArrayList arrayList = new ArrayList();
        Iterator itM7807 = C0047.m7807(C0030.m5333(C0016.m3577(C0008.m2029(C0003.m1396(C0010.m2300(m286(), 677, 27, 2080), C0020.m4251(C0038.m6452(m286(), 667, 10, 3210), str), C0011.m2744()))), C0061.m9361(m286(), 704, 43, 1489)));
        while (C0012.m2962(itM7807)) {
            m mVar = (m) C0048.m7949(itM7807);
            if (!C0058.m9127(C0064.m9669(mVar), C0041.m6779(m286(), 747, 2, 2537))) {
                String strM6779 = C0041.m6779(m286(), 749, 9, 2352);
                String strM8058 = C0049.m8058(C0030.m5333(mVar, strM6779), C0035.m6131(m286(), 758, 5, 3197));
                String strM80582 = C0049.m8058(C0030.m5333(mVar, strM6779), C0012.m2973(m286(), 763, 4, 2113));
                C0055.m8732(C0026.m4915(C0053.m8477(m286(), 793, 16, 2990), strM80582), strM8058, C0049.m8058(C0030.m5333(mVar, strM6779), C0045.m7657(m286(), 767, 13, 1032)), C0055.m8697(C0036.m6243(mVar, C0046.m7718(m286(), 780, 13, 1750))), arrayList);
            }
        }
        return C0047.m7783(arrayList);
    }
}