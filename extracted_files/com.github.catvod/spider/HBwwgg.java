package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.E.b;
import com.github.catvod.spider.merge.E.g;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.G.C0019;
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
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.Z.C0040;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.merge.c1.C0046;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.f1.C0053;
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
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.a0.C0006;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.github.catvod.spider.p000mergexbpq.c0.C0010;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class HBwwgg extends Spider {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f64short = {1172, 1202, 1188, 1203, 1260, 1152, 1190, 1188, 1199, 1205, 1507, 1473, 1492, 1479, 1474, 1474, 1487, 1409, 1435, 1408, 1438, 1422, 1414, 1506, 1479, 1472, 1499, 1494, 1429, 1422, 1519, 1472, 1482, 1500, 1473, 1479, 1482, 1422, 1439, 1438, 1429, 1422, 1509, 1415, 1422, 1519, 1502, 1502, 1474, 1483, 1529, 1483, 1484, 1509, 1479, 1498, 1409, 1435, 1437, 1433, 1408, 1437, 1432, 1422, 1414, 1509, 1510, 1530, 1507, 1506, 1410, 1422, 1474, 1479, 1477, 1483, 1422, 1513, 1483, 1485, 1477, 1473, 1415, 1422, 1517, 1478, 1500, 1473, 1475, 1483, 1409, 1439, 1437, 1438, 1408, 1438, 1408, 1438, 1408, 1438, 1422, 1533, 1487, 1480, 1487, 1500, 1479, 1409, 1435, 1437, 1433, 1408, 1437, 1432, 2402, 2421, 2422, 2421, 2402, 2421, 2402, 972, 976, 976, 980, 983, 926, 907, 907, 979, 979, 979, 906, 979, 979, 963, 990, 906, 967, 970, 907, 978, 971, 960, 905, 976, 989, 980, 961, 905, 973, 960, 905, 917, 905, 980, 963, 905, 917, 906, 972, 976, 969, 968, 1899, 1911, 1911, 1907, 1904, 1849, 1836, 1836, 1909, 1898, 1907, 1837, 1908, 1908, 1892, 1913, 1837, 1888, 1901, 1849, 1846, 1841, 1843, 1843, 1836, 1909, 1900, 1895, 1838, 1911, 1914, 1907, 1894, 1838, 1898, 1895, 1838, 1519, 1458, 1445, 1519, 1106, 1044, 1032, 1041, 1040, 1464, 1471, 1456, 1465, 1449, 1467, 1456, 1525, 1525, 1525, 2521, 2496, 2434, 2526, 2505, 2527, 2501, 2518, 2505, 2547, 2496, 2501, 2527, 2520, 2444, 2450, 2444, 2496, 2501, 685, 1608, 1621, 1608, 1616, 1625, 2878, 2852, 2867, 2864, 1674, 1678, 1668, 1543, 1542, 1559, 2583, 2580, 2565, 2570, 2634, 2583, 2598, 2571, 2576, 2576, 2571, 2569, 3194, 3174, 3174, 3170, 3169, 3112, 3133, 3133, 3172, 3195, 3170, 3132, 3173, 3173, 3189, 3176, 3132, 3185, 3196, 3112, 3111, 3104, 3106, 3106, 3133, 1213, 1252, 1275, 1185, 1212, 1185, 1209, 1200, 3287, 3265, 3271, 3280, 3277, 3275, 3274, 3210, 3284, 3269, 3267, 3265, 3209, 3276, 3264, 3204, 3226, 3204, 3269, 3204, 3226, 3204, 3277, 3273, 3267, 2098, 2099, 2082, 987, 982, 969, 913, 983, 987, 927, 897, 927, 970, 979, 927, 897, 927, 979, 982, 2832, 2845, 2818, 2906, 2838, 2832, 444, 421, 1636, 1636, 1636, 3044, 408, 388, 388, 384, 387, 458, 479, 479, 390, 409, 384, 478, 391, 391, 407, 394, 478, 403, 414, 458, 453, 450, 448, 448, 479, 2179, 2201, 2190, 2189, 3043, 3123, 2656, 425, 2168, 2933, 32311, 21619, 29854, -30611, 21452, 22133, 27638, 29899, -30643, 848, 1116, 1031, 1036, 1118, 1031, 1026, 1037, 1038, 1046, 1093, 1033, 1046, 1038, 1034, 1037, 1028, 1118, 846, 770, 769, 795, 768, 797, 853, 2001, 2013, 2015, 2019, 2010, 1998, 2003, 2001, 1921, 1947, 2000, 1990, 2001, 1935, 1993, 1924, 1947, 2023, 1951, 1939, 1941, 1936, 1924, 1938, 2036, 1931, 2036, 1931, 2036, 2036, 1931, 2036, 1931, 2036, 2394, 2341, 2394, 2341, 2394, 2394, 2341, 2394, 2341, 2394, 1711, 1715, 1715, 1719, 1716, 1789, 1768, 1768, 1702, 1719, 1710, 1769, 1712, 1712, 1696, 1725, 1769, 1700, 1705, 1789, 1778, 1781, 1783, 1768, 1712, 1698, 1701, 1700, 1707, 1704, 1714, 1699, 1768, 1706, 1780, 1714, 1791, 1769, 1719, 1711, 1719, 1784, 1714, 1717, 1707, 1786, 2542, 2553, 2538, 2488, 2541, 2538, 2548, 2469, 2495, 2480, 2486, 2483, 2471, 2481, 2495, 2467, 2692, 2812, 2800, 2806, 2803, 2791, 2801, 2711, 2792, 2711, 2792, 2711, 2843, 2916, 2843, 2916, 2843, 421, 441, 441, 445, 446, 503, 482, 482, 428, 445, 420, 483, 442, 442, 426, 439, 483, 430, 419, 503, 504, 511, 509, 482, 442, 424, 431, 430, 417, 418, 440, 425, 482, 445, 417, 428, 436, 482, 428, 423, 437, 511, 501, 501, 483, 445, 421, 445, 498, 440, 447, 417, 496, 1666, 1700, 1714, 1701, 1786, 1686, 1712, 1714, 1721, 1699, 545, 515, 534, 517, 512, 512, 525, 579, 601, 578, 604, 588, 580, 544, 517, 514, 537, 532, 599, 588, 557, 514, 520, 542, 515, 517, 520, 588, 605, 604, 599, 588, 551, 581, 588, 557, 540, 540, 512, 521, 571, 521, 526, 551, 517, 536, 579, 601, 607, 603, 578, 607, 602, 588, 580, 551, 548, 568, 545, 544, 576, 588, 512, 517, 519, 521, 588, 555, 521, 527, 519, 515, 581, 588, 559, 516, 542, 515, 513, 521, 579, 605, 607, 604, 578, 604, 578, 604, 578, 604, 588, 575, 525, 522, 525, 542, 517, 579, 601, 607, 603, 578, 607, 602, 3252, 3251, 3245, 3323, 3297, 3302, 3305, 3311, 3306, 3326, 3304, 3302, 3309, 823, 811, 811, 815, 2142, 2278, 2293, 1836, 1840, 1840, 1844, 1847, 1918, 1899, 1899, 1842, 1837, 1844, 1898, 1843, 1843, 1827, 1854, 1898, 1831, 1834, 1918, 1905, 1910, 1908, 1908, 1899, 1899, 1837, 1834, 1824, 1825, 1852, 1898, 1844, 1836, 1844, 1915, 1833, 1913, 1842, 1835, 1824, 1897, 1847, 1825, 1829, 1846, 1831, 1836, 1570, 1588, 1586, 1573, 1592, 1598, 1599, 1663, 1570, 1588, 1584, 1571, 1586, 1593, 1564, 1584, 1592, 1599, 1663, 1590, 1597, 1598, 1587, 1584, 1597, 1537, 1584, 1589, 1589, 1592, 1599, 1590, 1649, 1647, 1649, 1572, 1597, 1649, 1647, 1649, 1597, 1592, 1740, 1743, 1758, 1745, 1681, 1740, 1771, 1750, 1739, 965, 923, 965, 1015, 986, 961, 961, 986, 984, 1053, 262, 284, 267, 264, 1204, 1200, 1210, 1267, 1201, 1212, 1191, 1188, 1201, 1202, 1212, 1209, 2241, 2240, 2257, 1071, 1063, 1124, 1071, 1063, 1054, 1059, 1086, 1092, 1112, 1112, 1116, 1119, 1046, 1027, 1027, 1114, 1093, 1116, 1026, 1115, 1115, 1099, 1110, 1026, 1103, 1090, 1046, 1049, 1054, 1052, 1052, 1027};
    public String a;

    public static HashMap a() {
        return C0019.m4127(C0024.m4740(m404(), 0, 10, 1217), C0005.m1645(m404(), 10, 104, 1454), C0032.m5708(m404(), 114, 7, 2320), C0040.m6584(m404(), 121, 43, 932));
    }

    /* renamed from: ۣ۟۟ۦۦ, reason: not valid java name and contains not printable characters */
    public static short[] m404() {
        if (C0054.m8557() < 0) {
            return f64short;
        }
        return null;
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        ArrayList arrayList = new ArrayList();
        String strM9145 = C0058.m9145(C0035.m6131(m404(), 164, 37, 1795), str, C0050.m8131(m404(), 201, 4, 1474), str2, C0038.m6452(m404(), 205, 5, 1148));
        PrintStream printStreamM6087 = C0035.m6087();
        StringBuilder sb = new StringBuilder(C0048.m7902(m404(), 210, 10, 1502));
        C0018.m3933(sb, strM9145);
        C0012.m2969(printStreamM6087, C0047.m7763(sb));
        Iterator itM7807 = C0047.m7807(C0030.m5333(C0016.m3577(C0032.m5769(strM9145, C0034.m5952())), C0049.m8007(m404(), 220, 19, 2476)));
        while (C0012.m2962(itM7807)) {
            m mVar = (m) C0048.m7949(itM7807);
            String strM1189 = C0001.m1189(m404(), 239, 1, 716);
            String strM8058 = C0049.m8058(C0030.m5333(mVar, strM1189), C0037.m6307(m404(), 240, 5, 1596));
            String strM80582 = C0049.m8058(C0030.m5333(mVar, strM1189), C0058.m9106(m404(), 245, 4, 2902));
            C0055.m8732(C0026.m4915(C0045.m7657(m404(), 267, 25, 3090), strM80582), strM8058, C0049.m8058(C0030.m5333(mVar, C0020.m4199(m404(), 249, 3, 1763)), C0061.m9361(m404(), 252, 3, 1652)), C0064.m9669(C0036.m6243(mVar, C0060.m9352(m404(), 255, 12, 2660))), arrayList);
        }
        return C0020.m4216(C0011.m2808(C0038.m6456(str2)), C0047.m7818(1, str2), C0011.m2808(20), C0054.m8556(str2, 1, 20), arrayList);
    }

    public String detailContent(List<String> list) {
        String strM1842;
        h hVarM3577 = C0016.m3577(C0032.m5769((String) C0048.m7915(list, 0), C0034.m5952()));
        String strM4684 = C0024.m4684(C0030.m5333(hVarM3577, C0019.m4107(m404(), 292, 8, 1237)));
        String strM8058 = C0049.m8058(C0030.m5333(hVarM3577, C0045.m7657(m404(), 300, 25, 3236)), C0056.m8911(m404(), 325, 3, 2113));
        d dVarM5333 = C0030.m5333(hVarM3577, C0057.m8978(m404(), 328, 16, 959));
        d dVarM6459 = C0038.m6459(C0030.m5333(hVarM3577, C0002.m1305(m404(), 344, 6, 2932)), C0055.m8814(m404(), 350, 2, 457));
        PrintStream printStreamM6087 = C0035.m6087();
        StringBuilder sb = new StringBuilder();
        C0018.m3933(sb, strM4684);
        C0018.m3933(sb, strM8058);
        C0012.m2969(printStreamM6087, C0047.m7763(sb));
        StringBuilder sb2 = new StringBuilder();
        Iterator itM7807 = C0047.m7807(dVarM5333);
        while (true) {
            boolean zM2962 = C0012.m2962(itM7807);
            strM1842 = C0007.m1842(m404(), 352, 3, 1600);
            if (!zM2962) {
                break;
            }
            m mVar = (m) C0048.m7949(itM7807);
            C0018.m3933(sb2, C0016.m3579());
            C0018.m3933(sb2, C0064.m9669(mVar));
            C0018.m3933(sb2, strM1842);
        }
        StringBuilder sb3 = new StringBuilder(C0007.m1840());
        Iterator itM78072 = C0047.m7807(dVarM6459);
        while (C0012.m2962(itM78072)) {
            Iterator itM78073 = C0047.m7807(C0030.m5333((m) C0048.m7949(itM78072), C0006.m1774(m404(), 355, 1, 2949)));
            while (C0012.m2962(itM78073)) {
                m mVar2 = (m) C0048.m7949(itM78073);
                String strM9669 = C0064.m9669(mVar2);
                StringBuilder sb4 = new StringBuilder(C0012.m2973(m404(), 356, 25, 496));
                C0018.m3933(sb4, C0010.m2339(mVar2, C0057.m8978(m404(), 381, 4, 2283)));
                String strM7763 = C0047.m7763(sb4);
                C0018.m3933(sb3, strM9669);
                C0062.m9399(sb3, '$');
                C0018.m3933(sb3, strM7763);
                String strM2973 = C0012.m2973(m404(), 385, 1, 2973);
                C0018.m3933(sb3, strM2973);
                C0018.m3933(sb3, strM4684);
                C0018.m3933(sb3, strM2973);
                C0018.m3933(sb3, strM9669);
                C0062.m9399(sb3, '#');
            }
            C0018.m3933(sb3, strM1842);
        }
        String strM46842 = C0024.m4684(C0030.m5333(hVarM3577, C0019.m4107(m404(), 386, 1, 3139)));
        com.github.catvod.spider.merge.E.m mVar3 = new com.github.catvod.spider.merge.E.m();
        StringBuilder sb5 = new StringBuilder();
        C0018.m3933(sb5, C0055.m8703());
        C0018.m3933(sb5, strM46842);
        C0027.m5000(mVar3, C0047.m7763(sb5));
        C0011.m2828(mVar3, (String) C0048.m7915(list, 0));
        C0026.m4947(mVar3, strM8058);
        C0005.m1628(mVar3, strM4684);
        C0054.m8596(mVar3, C0000.m1096(sb2));
        C0044.m7449(mVar3, C0000.m1096(sb3));
        return C0053.m8428(mVar3);
    }

    public String homeContent(boolean z) {
        ArrayList arrayList = new ArrayList();
        List listM1203 = C0001.m1203(new String[]{C0047.m7833(m404(), 387, 1, 2641), C0042.m7151(m404(), 388, 1, 411), C0065.m9775(m404(), 389, 1, 2124), C0060.m9352(m404(), 390, 1, 2886)});
        List listM12032 = C0001.m1203(new String[]{C0027.m5062(m404(), 391, 2, 2818), C0007.m1842(m404(), 393, 3, 427), C0034.m6001(m404(), 396, 2, 1245), C0051.m8259(m404(), 398, 2, 2615)});
        for (int i = 0; i < C0064.m9636(listM1203); i++) {
            C0004.m1532(arrayList, new b((String) C0048.m7915(listM1203, i), (String) C0048.m7915(listM12032, i), null));
        }
        return C0003.m1448(C0023.m4550(this), null, arrayList);
    }

    public void init(Context context, String str) {
        C0051.m8194(C0035.m6110());
        if (str != null) {
            this.a = str;
        }
    }

    public String playerContent(String str, String str2, List<String> list) {
        String strM5769;
        String strM5256;
        C0036.m6219();
        String[] strArrM4752 = C0024.m4752(str2, C0026.m4951(m404(), 400, 1, 814));
        String str3 = null;
        String str4 = (strArrM4752.length <= 0 || C0057.m8953(strArrM4752[0])) ? null : strArrM4752[0];
        String str5 = (strArrM4752.length <= 1 || C0057.m8953(strArrM4752[1])) ? null : strArrM4752[1];
        if (strArrM4752.length > 2 && !C0057.m8953(strArrM4752[2])) {
            str3 = strArrM4752[2];
        }
        StringBuilder sb = new StringBuilder();
        C0018.m3933(sb, C0051.m8217());
        C0018.m3933(sb, C0049.m8007(m404(), 401, 17, 1123));
        C0018.m3933(sb, str5);
        C0018.m3933(sb, C0057.m8978(m404(), 418, 7, 872));
        C0018.m3933(sb, str3);
        String strM7763 = C0047.m7763(sb);
        String strM57692 = C0032.m5769(str4, C0034.m5952());
        if (C0058.m9127(strM57692, C0058.m9106(m404(), 425, 17, 1980))) {
            String strM9804 = C0065.m9804(str3, C0028.m5109(m404(), 442, 17, 1979));
            StringBuilder sb2 = new StringBuilder();
            C0018.m3933(sb2, C0006.m1778(strM57692, strM9804));
            C0018.m3933(sb2, C0037.m6307(m404(), 459, 10, 2325));
            strM5769 = C0032.m5769(C0026.m4915(C0053.m8477(m404(), 469, 46, 1735), C0047.m7763(sb2)), C0034.m5952());
            strM5256 = C0065.m9775(m404(), 515, 16, 2456);
        } else {
            String strM98042 = C0065.m9804(str3, C0012.m2973(m404(), 531, 12, 2776));
            StringBuilder sb3 = new StringBuilder();
            C0018.m3933(sb3, C0006.m1778(strM57692, strM98042));
            C0018.m3933(sb3, C0055.m8814(m404(), 543, 5, 2900));
            String strM4915 = C0026.m4915(C0046.m7718(m404(), 548, 53, 461), C0047.m7763(sb3));
            HashMap map = new HashMap();
            C0053.m8424(map, C0016.m3525(m404(), 601, 10, 1751), C0050.m8131(m404(), 611, 104, 620));
            strM5769 = C0032.m5769(strM4915, map);
            strM5256 = C0029.m5256(m404(), 715, 13, 3265);
        }
        String strM1778 = C0006.m1778(strM5769, strM5256);
        if (!C0058.m9127(strM1778, C0011.m2805(m404(), 728, 4, 863))) {
            g gVarM9311 = C0060.m9311(1, str4);
            C0057.m9029(gVarM9311, C0034.m5952());
            C0002.m1282(gVarM9311, strM7763);
            return C0033.m5828(gVarM9311);
        }
        g gVar = new g();
        C0017.m3667(gVar, strM1778);
        C0057.m9029(gVar, C0034.m5952());
        C0002.m1282(gVar, strM7763);
        return C0033.m5828(gVar);
    }

    public String searchContent(String str, boolean z) {
        return C0060.m9332(this, str, true, C0008.m1970(m404(), 732, 1, 2159));
    }

    public String searchContent(String str, boolean z, String str2) {
        ArrayList arrayList = new ArrayList();
        Iterator itM7807 = C0047.m7807(C0030.m5333(C0016.m3577(C0008.m2029(C0003.m1396(C0063.m9585(m404(), 735, 48, 1860), C0020.m4251(C0035.m6131(m404(), 733, 2, 2193), str), C0034.m5952()))), C0050.m8131(m404(), 783, 42, 1617)));
        while (C0012.m2962(itM7807)) {
            m mVar = (m) C0048.m7949(itM7807);
            String strM4684 = C0024.m4684(C0030.m5333(mVar, C0044.m7509(m404(), 825, 9, 1727)));
            String strM8058 = C0049.m8058(C0038.m6459(C0030.m5333(mVar, C0007.m1842(m404(), 834, 9, 949)), C0039.m6551(m404(), 843, 1, 1148)), C0004.m1549(m404(), 844, 4, 366));
            C0055.m8732(C0026.m4915(C0048.m7902(m404(), 871, 25, 1068), strM8058), strM4684, C0049.m8058(C0030.m5333(mVar, C0060.m9352(m404(), 848, 12, 1245)), C0013.m3106(m404(), 860, 3, 2226)), C0055.m8697(C0036.m6243(mVar, C0063.m9585(m404(), 863, 8, 1098))), arrayList);
        }
        return C0047.m7783(arrayList);
    }
}