package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.E.b;
import com.github.catvod.spider.merge.E.g;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.I0.C0020;
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
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.b.C0044;
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

/* loaded from: classes.dex */
public class HBxLei8 extends Spider {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f65short = {1344, 1372, 1372, 1368, 1371, 1298, 1287, 1287, 1360, 1373, 1350, 1348, 1357, 1345, 1296, 1286, 1351, 1370, 1359, 1287, 1287, 803, 830, 803, 830, 803, 830, 803, 874, 879, 890, 875, 803, 2118, 2136, 2139, 2117, 2051, 2079, 2054, 2055, 802, 805, 810, 803, 819, 801, 810, 879, 879, 879, 2267, 2262, 2249, 2193, 2269, 2268, 2188, 2269, 2270, 2193, 2269, 2268, 2270, 2187, 2266, 2193, 2269, 2189, 2186, 2182, 2188, 2193, 2269, 2183, 2182, 2268, 2269, 2491, 2495, 2485, 1159, 1162, 1170, 2226, 1217, 1243, 1228, 1231, 3308, 3309, 3324, 2827, 2824, 2841, 2838, 2902, 2842, 2881, 2842, 2892, 2841, 1423, 1427, 1427, 1431, 1428, 1501, 1480, 1480, 1439, 1426, 1417, 1419, 1410, 1422, 1503, 1481, 1416, 1429, 1408, 1480, 1528, 1502, 1480, 1503, 1408, 1516, 1482, 1480, 1475, 1497, 1877, 1911, 1890, 1905, 1908, 1908, 1913, 1847, 1837, 1846, 1832, 1848, 1840, 1871, 1905, 1910, 1916, 1911, 1903, 1899, 1848, 1878, 1868, 1848, 1833, 1832, 1846, 1832, 1827, 1848, 1871, 1879, 1871, 1838, 1836, 1841, 1848, 1881, 1896, 1896, 1908, 1917, 1871, 1917, 1914, 1875, 1905, 1900, 1847, 1837, 1835, 1839, 1846, 1835, 1838, 1848, 1840, 1875, 1872, 1868, 1877, 1876, 1844, 1848, 1908, 1905, 1907, 1917, 1848, 1887, 1917, 1915, 1907, 1911, 1841, 1848, 1883, 1904, 1898, 1911, 1909, 1917, 1847, 1833, 1832, 1825, 1846, 1832, 1846, 1832, 1846, 1832, 1848, 1867, 1913, 1918, 1913, 1898, 1905, 1847, 1837, 1835, 1839, 1846, 1835, 1838, 2916, 2942, 2927, 2939, 2938, 2918, 2126, 2053, 2049, 2054, 2136, 2112, 2048, 2140, 2161, 2053, 2131, 2115, 2125, 2139, 2127, 2143, 2054, 2160, 2148, 2062, 2162, 2165, 2063, 2137, 2133, 2147, 2127, 2169, 2138, 2134, 2172, 2072, 2150, 2150, 2174, 2166, 2141, 2132, 2115, 2139, 2172, 2142, 2162, 2113, 1604, 1609, 1622, 1550, 1602, 1601, 1555, 1555, 1552, 1550, 1602, 1605, 1605, 1553, 1603, 1552, 1550, 1602, 1555, 1554, 1603, 1605, 1606, 1550, 1602, 1556, 1606, 1556, 1553, 1606, 1605, 1557, 1550, 1602, 1604, 1560, 1552, 1552, 1601, 1559, 1552, 1561, 1554, 1536, 1566, 1536, 1609, 1613, 1607, 1107, 1118, 1094, 766, 767, 750, 3324, 3313, 3310, 3254, 3322, 3326, 3232, 3242, 3244, 3243, 3322, 3233, 3256, 3238, 3256, 3309, 3316, 3256, 3238, 3256, 3316, 3313, 2891, 2820, 2888, 2891, 2892, 2844, 2895, 2835, 2844, 2842, 2894, 2894, 2346, 2352, 2343, 2340, 815, 819, 1541, 1612, 1609, 1611, 1547, 1800, 925, 963, 911, 988, 907, 985, 989, 907, 986, 981, 981, 981, -28100, 26337, 2178, 2183, 2205, 2202, 2998, 2996, 31167, 21499, 32098, -32367, 23088, 2238, 722, 756, 738, 757, 682, 710, 736, 738, 745, 755, 809, 779, 798, 781, 776, 776, 773, 843, 849, 842, 852, 836, 844, 819, 781, 778, 768, 779, 787, 791, 836, 810, 816, 836, 853, 852, 842, 852, 863, 836, 819, 811, 819, 850, 848, 845, 836, 805, 788, 788, 776, 769, 819, 769, 774, 815, 781, 784, 843, 849, 855, 851, 842, 855, 850, 836, 844, 815, 812, 816, 809, 808, 840, 836, 776, 781, 783, 769, 836, 803, 769, 775, 783, 779, 845, 836, 807, 780, 790, 779, 777, 769, 843, 853, 852, 861, 842, 852, 842, 852, 842, 852, 836, 823, 773, 770, 773, 790, 781, 843, 849, 855, 851, 842, 855, 850, 1486, 1492, 1477, 1489, 1488, 1484, 564, 639, 635, 636, 546, 570, 634, 550, 523, 639, 553, 569, 567, 545, 565, 549, 636, 522, 542, 628, 520, 527, 629, 547, 559, 537, 565, 515, 544, 556, 518, 610, 540, 540, 516, 524, 551, 558, 569, 545, 518, 548, 520, 571, 2197, 1175, 1163, 1163, 1167, 1164, 1221, 1232, 1232, 1159, 1162, 1169, 1171, 1178, 1174, 1223, 1233, 1168, 1165, 1176, 1232, 1232, 1164, 1232, 503, 433, 429, 436, 437, 2440, 2447, 2432, 2441, 2457, 2443, 2432, 2501, 2501, 2501, 1726, 1715, 1708, 1780, 1720, 1775, 1763, 1723, 1768, 1720, 1772, 1774, 1726, 1724, 1771, 1780, 1720, 1727, 1721, 1774, 1724, 1771, 1763, 1772, 1772, 1768, 1763, 1726, 1489, 1419, 1431, 1499, 1420, 1409, 1423, 1496, 1503, 1498, 1408, 1433, 1415, 1433, 1496, 1424, 1418, 1437, 1438, 413, 400, 399, 471, 411, 408, 458, 458, 457, 471, 411, 463, 459, 456, 411, 471, 411, 457, 415, 449, 459, 471, 411, 461, 415, 461, 456, 415, 412, 460, 473, 455, 473, 408, 473, 455, 473, 400, 404, 414, 2488, 2489, 2472, 3197, 3169, 3169, 3173, 3174, 3119, 3130, 3130, 3181, 3168, 3195, 3193, 3184, 3196, 3117, 3131, 3194, 3175, 3186, 3130};
    public String a;

    /* renamed from: ۣ۟۠ۧ, reason: not valid java name and contains not printable characters */
    public static short[] m405() {
        if (C0014.m3353() <= 0) {
            return f65short;
        }
        return null;
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        ArrayList arrayList = new ArrayList();
        String strM9145 = C0058.m9145(C0007.m1842(m405(), 0, 21, 1320), str, C0023.m4536(m405(), 21, 12, 782), str2, C0003.m1398(m405(), 33, 8, 2155));
        PrintStream printStreamM6087 = C0035.m6087();
        StringBuilder sb = new StringBuilder(C0009.m2037(m405(), 41, 10, 836));
        C0018.m3933(sb, strM9145);
        C0012.m2969(printStreamM6087, C0047.m7763(sb));
        Iterator itM7807 = C0047.m7807(C0030.m5333(C0016.m3577(C0032.m5769(strM9145, null)), C0041.m6779(m405(), 51, 27, 2239)));
        while (C0012.m2962(itM7807)) {
            m mVar = (m) C0048.m7949(itM7807);
            String strM7151 = C0042.m7151(m405(), 78, 3, 2514);
            String strM8058 = C0049.m8058(C0030.m5333(mVar, strM7151), C0061.m9361(m405(), 81, 3, 1254));
            String strM80582 = C0049.m8058(C0030.m5333(mVar, C0056.m8911(m405(), 84, 1, 2259)), C0065.m9775(m405(), 85, 4, 1193));
            C0055.m8732(C0026.m4915(C0051.m8259(m405(), 102, 20, 1511), strM80582), strM8058, C0049.m8058(C0030.m5333(mVar, strM7151), C0014.m3332(m405(), 89, 3, 3231)), C0064.m9669(C0036.m6243(mVar, C0063.m9585(m405(), 92, 10, 2936))), arrayList);
        }
        return C0020.m4216(C0011.m2808(C0038.m6456(str2)), C0047.m7818(1, str2), C0011.m2808(20), C0054.m8556(str2, 1, 20), arrayList);
    }

    public String detailContent(List<String> list) {
        String str = (String) C0048.m7915(list, 0);
        HashMap map = new HashMap();
        C0053.m8424(map, C0028.m5109(m405(), 122, 10, 1453), C0065.m9775(m405(), 132, 106, 1816));
        C0053.m8424(map, C0037.m6307(m405(), 238, 6, 2862), C0034.m6001(m405(), 244, 44, 2103));
        h hVarM3577 = C0016.m3577(C0032.m5769(str, map));
        String strM8978 = C0057.m8978(m405(), 288, 49, 1568);
        String strM8058 = C0049.m8058(C0030.m5333(hVarM3577, strM8978), C0060.m9352(m405(), 337, 3, 1074));
        String strM80582 = C0049.m8058(C0030.m5333(hVarM3577, strM8978), C0030.m5362(m405(), 340, 3, 653));
        d dVarM5333 = C0030.m5333(hVarM3577, C0063.m9585(m405(), 343, 22, 3224));
        PrintStream printStreamM6087 = C0035.m6087();
        StringBuilder sb = new StringBuilder();
        C0018.m3933(sb, strM8058);
        C0018.m3933(sb, strM80582);
        C0012.m2969(printStreamM6087, C0047.m7763(sb));
        StringBuilder sb2 = new StringBuilder(C0007.m1840());
        Iterator itM7807 = C0047.m7807(dVarM5333);
        while (C0012.m2962(itM7807)) {
            d dVarM53332 = C0030.m5333((m) C0048.m7949(itM7807), C0012.m2973(m405(), 365, 12, 2858));
            String strM4684 = C0024.m4684(dVarM53332);
            if (C0057.m8953(strM4684)) {
                strM4684 = strM8058;
            }
            String strM80583 = C0049.m8058(dVarM53332, C0037.m6307(m405(), 377, 4, 2370));
            if (C0057.m8953(strM80583)) {
                strM80583 = (String) C0048.m7915(list, 0);
            }
            C0018.m3933(sb2, strM4684);
            C0018.m3933(sb2, C0010.m2300(m405(), 381, 1, 779));
            StringBuilder sb3 = new StringBuilder();
            C0018.m3933(sb3, strM80583);
            String strM3646 = C0017.m3646(m405(), 382, 1, 845);
            C0018.m3933(sb3, strM3646);
            C0018.m3933(sb3, strM8058);
            C0018.m3933(sb3, C0008.m1970(m405(), 383, 5, 1659));
            C0018.m3933(sb2, C0047.m7763(sb3));
            C0018.m3933(sb2, strM3646);
            C0018.m3933(sb2, strM4684);
            C0018.m3933(sb2, C0058.m9106(m405(), 388, 1, 1835));
        }
        String strM46842 = C0024.m4684(C0030.m5333(hVarM3577, C0055.m8814(m405(), 389, 12, 1005)));
        com.github.catvod.spider.merge.E.m mVar = new com.github.catvod.spider.merge.E.m();
        StringBuilder sb4 = new StringBuilder();
        C0018.m3933(sb4, C0055.m8703());
        C0018.m3933(sb4, strM46842);
        C0027.m5000(mVar, C0047.m7763(sb4));
        C0011.m2828(mVar, (String) C0048.m7915(list, 0));
        C0026.m4947(mVar, strM80582);
        C0005.m1628(mVar, strM8058);
        C0054.m8596(mVar, C0057.m8978(m405(), 401, 2, 2276));
        C0044.m7449(mVar, C0000.m1096(sb2));
        return C0053.m8428(mVar);
    }

    public String homeContent(boolean z) {
        ArrayList arrayList = new ArrayList();
        List listM1203 = C0001.m1203(new String[]{C0052.m8337(m405(), 403, 4, 2286), C0051.m8259(m405(), 407, 2, 3010)});
        List listM12032 = C0001.m1203(new String[]{C0057.m8978(m405(), 409, 2, 3210), C0002.m1305(m405(), 411, 3, 2135)});
        for (int i = 0; i < C0064.m9636(listM1203); i++) {
            C0004.m1532(arrayList, new b((String) C0048.m7915(listM1203, i), (String) C0048.m7915(listM12032, i), null));
        }
        return C0003.m1448(C0011.m2775(this), null, arrayList);
    }

    public void init(Context context) {
        C0051.m8194(C0035.m6110());
    }

    public void init(Context context, String str) {
        C0051.m8194(C0035.m6110());
        if (str != null) {
            this.a = str;
        }
    }

    public String playerContent(String str, String str2, List<String> list) {
        C0036.m6219();
        String[] strArrM4752 = C0024.m4752(str2, C0060.m9352(m405(), 414, 1, 2240));
        String str3 = null;
        String str4 = (strArrM4752.length <= 0 || C0057.m8953(strArrM4752[0])) ? null : strArrM4752[0];
        String str5 = (strArrM4752.length <= 1 || C0057.m8953(strArrM4752[1])) ? null : strArrM4752[1];
        if (strArrM4752.length > 2 && !C0057.m8953(strArrM4752[2])) {
            String str6 = strArrM4752[2];
        }
        if (strArrM4752.length > 3 && !C0057.m8953(strArrM4752[3])) {
            str3 = strArrM4752[3];
        }
        String strM2827 = C0011.m2827(str4, str5, str3);
        g gVarM9311 = C0060.m9311(0, str4);
        HashMap map = new HashMap();
        C0053.m8424(map, C0065.m9775(m405(), 415, 10, 647), C0011.m2805(m405(), 425, 106, 868));
        C0053.m8424(map, C0038.m6452(m405(), 531, 6, 1412), C0024.m4740(m405(), 537, 44, 589));
        C0057.m9029(gVarM9311, map);
        C0002.m1282(gVarM9311, strM2827);
        return C0033.m5828(gVarM9311);
    }

    public String searchContent(String str, boolean z) {
        return C0029.m5202(this, str, true, C0024.m4740(m405(), 581, 1, 2212));
    }

    public String searchContent(String str, boolean z, String str2) {
        ArrayList arrayList = new ArrayList();
        String strM1130 = C0000.m1130(C0063.m9585(m405(), 582, 23, 1279), str, C0017.m3646(m405(), 605, 5, 473));
        PrintStream printStreamM6087 = C0035.m6087();
        StringBuilder sb = new StringBuilder(C0028.m5109(m405(), 610, 10, 2542));
        C0018.m3933(sb, strM1130);
        C0012.m2969(printStreamM6087, C0047.m7763(sb));
        Iterator itM7807 = C0047.m7807(C0030.m5333(C0016.m3577(C0032.m5769(strM1130, null)), C0032.m5708(m405(), 620, 28, 1754)));
        while (C0012.m2962(itM7807)) {
            m mVar = (m) C0048.m7949(itM7807);
            String strM6307 = C0037.m6307(m405(), 648, 15, 1465);
            String strM4684 = C0024.m4684(C0030.m5333(mVar, strM6307));
            String strM8058 = C0049.m8058(C0030.m5333(mVar, strM6307), C0012.m2973(m405(), 663, 4, 1528));
            C0032.m5685(C0026.m4915(C0036.m6188(m405(), 710, 20, 3093), strM8058), strM4684, C0049.m8058(C0030.m5333(mVar, C0015.m3484(m405(), 667, 40, 505)), C0005.m1645(m405(), 707, 3, 2507)), arrayList);
        }
        return C0047.m7783(arrayList);
    }
}