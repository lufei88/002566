package com.github.catvod.spider.merge.g0;

import android.net.Uri;
import com.github.catvod.spider.merge.C.C0017;
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
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.Z0.C0041;
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
import com.github.catvod.spider.merge.o0.C0056;
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
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.c0.C0010;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import com.github.catvod.spider.p000mergexbpq.r.C0014;
import com.github.catvod.spider.p000mergexbpq.x.C0015;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import java.math.BigInteger;
import java.net.URI;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public abstract class g {
    public static HashMap e;

    /* renamed from: short, reason: not valid java name */
    private static final short[] f797short = {567, 555, 555, 559, 631, 631, 608, 638, 567, 555, 555, 559, 630, 625, 630, 548, 622, 621, 627, 546, 608, 515, 625, 631, 562, 620, 554, 615, 547, 562, 559, 619, 547, 562, 564, 553, 547, 569, 563, 553, 547, 562, 559, 620, 547, 562, 619, 574, 547, 574, 574, 572, 630, 515, 608, 625, 629, 547, 567, 555, 555, 559, 631, 631, 608, 638, 567, 555, 555, 559, 630, 625, 630, 548, 622, 621, 627, 546, 515, 625, 631, 562, 620, 554, 615, 547, 562, 559, 619, 547, 562, 564, 553, 547, 569, 563, 553, 547, 562, 559, 620, 547, 562, 619, 574, 547, 574, 574, 572, 630, 547, 567, 555, 555, 559, 631, 631, 608, 638, 567, 555, 555, 559, 630, 625, 630, 629, 608, 553, 566, 571, 570, 560, 624, 555, 560, 556, 629, 1953, 2020, 2024, 2030, 2023, 2028, 2045, 2037, 2045, 2017, 2044, 2023, 2029, 2028, 2043, 2037, 2028, 2029, 1979, 2018, 1952, 1971, 1959, 1955, 2307, 2334, 2394, 298, 300, 305, 1161, 1171, 1160, 3024, 3034, 3008, 580, 595, 588, 556, 566, 554, 2690, 2719, 2696, 564, 563, 2267, 2246, 2181, 1612, 1612, 1614, 2577, 2587, 2582, 2580, 483, 442, 495, 2734, 2751, 2730, 2609, 2617, 2617, 733, 732, 730, 1048, 1034, 1034, 1047, 1047, 1029, 1309, 1311, 1311, 1009, 1008, 994, 905, 924, 845, 836, 821, 1575, 1441, 1441, 354, 2185, 2204, 2204, 1575, 1574, 1573, 1572, 1571, 1570, 1569, 1568, 1583, 1582, 1622, 1621, 1620, 1619, 1618, 1617, 1616, 1631, 1630, 1629, 1628, 1627, 1626, 1625, 1624, 1607, 1606, 1605, 1604, 1603, 1602, 1601, 1600, 1615, 1614, 1613, 1654, 1653, 1652, 1651, 1650, 1649, 1648, 1663, 1662, 1661, 1660, 1659, 1658, 1657, 1656, 1639, 1638, 1637, 1636, 1635, 1634, 1633, 1632, 1647, 1646, 1645, 1083, 1120, 1131, 1081, 1120, 1125, 1130, 1129, 1137, 1058, 1137, 1142, 1128, 1081, 1571, 1656, 1651, 1569, 1656, 1661, 1650, 1649, 1641, 1594, 1641, 1646, 1648, 1569, 1931, 2000, 2011, 1929, 2000, 2005, 2010, 2009, 1985, 1938, 2014, 1985, 2009, 2013, 2010, 2003, 1929, 1009, 957, 958, 932, 959, 930, 1002, 1300, 2132, 2143, 2115, 2071, 2132, 2050, 2681, 2671, 520, 525, 2808, 2807, 992, 1001, 1989, 2002, 1985, 2522, 1467, 2672, 2686, 2682, 2672, 2686, 2682, 2663, 2609, 2608, 2611, 786, 858, 853, 840, 774, 1976, 1957, 2017, 698, 700, 673, 293, 379, 317, 368, 835, 857, 834, 2032, 2042, 2016, 2825, 2846, 2817, 2224, 2218, 2230, 1677, 1680, 1671, 1227, 1228, 836, 857, 794, 3040, 3040, 3042, 1761, 1771, 1766, 1764, 1933, 2004, 1921, 1053, 1036, 1049, 1975, 1983, 1983, 2241, 2246, 2264, 2185, 2268, 2240, 2240, 2244, 1199, 1259, 1266, 645, 712, 728, 728, 3189, 3123, 3119, 3126, 3127, 1673, 1681, 1673, 1689, 1673, 1226, 1226, 1698, 1716, 1710, 1712, 1710, 2060, 2053, 2126, 2051, 2063, 2061, 3261, 3260, 3245, 3238, 3260, 3303, 3242, 3238, 3236, 1916, 1910, 1893, 1895, 1205, 1193, 1198, 1203, 1256, 1189, 1193, 1195, 420, 422, 419, 432, 427, 491, 422, 427, 1564, 1559, 1554, 1559, 1564, 1559, 1554, 1559, 1616, 1565, 1553, 1555, 2966, 2965, 2971, 2962, 2961, 2970, 2963, 3034, 2967, 2971, 2969, 2420, 2420, 2416, 2418, 2346, 2407, 2411, 2409, 747, 717, 731, 716, 659, 767, 729, 731, 720, 714, 666, 696, 685, 702, 699, 699, 694, 760, 738, 761, 743, 759, 767, 702, 647, 703, 696, 697, 690, 748, 759, 660, 647, 642, 759, 702, 647, 703, 696, 697, 690, 759, 664, 644, 759, 742, 737, 648, 737, 759, 699, 702, 700, 690, 759, 666, 694, 692, 759, 664, 644, 759, 655, 766, 759, 662, 679, 679, 699, 690, 640, 690, 693, 668, 702, 675, 760, 737, 743, 738, 761, 742, 761, 742, 738, 759, 767, 668, 671, 643, 666, 667, 763, 759, 699, 702, 700, 690, 759, 656, 690, 692, 700, 696, 766, 759, 641, 690, 677, 676, 702, 696, 697, 760, 742, 737, 761, 737, 759, 666, 696, 693, 702, 699, 690, 760, 742, 738, 658, 742, 739, 751, 759, 644, 694, 689, 694, 677, 702, 760, 737, 743, 739, 761, 742, 2655, 1502, 1522, 1523, 1513, 1528, 1523, 1513, 1456, 1481, 1508, 1517, 1528, 2342, 2359, 2346, 2342, 2429, 2338, 2366, 2355, 2363, 2364, 2409, 2353, 2362, 2355, 2336, 2337, 2359, 2342, 2415, 2311, 2310, 2324, 2431, 2410, 917, 951, 951, 945, 932, 928, 1017, 920, 949, 954, 947, 929, 949, 947, 945, 3035, 3017, 2956, 3042, 3055, 2957, 3035, 3017, 2970, 3024, 2972, 2961, 2959, 2969, 2957, 3035, 3017, 2956, 3061, 3062, 2970, 3024, 2972, 2961, 2959, 2966, 2957, 3035, 3017, 2956, 3049, 3050, 2970, 3024, 2972, 2961, 2959, 2964, 2957, 3012, 3023, 2956, 3060, 3058, 2970, 3024, 2972, 2961, 2959, 2962, 2957, 3012, 3023, 2970, 3024, 2972, 2961, 2959, 2963, 1224, 1252, 1253, 1253, 1262, 1256, 1279, 1250, 1252, 1253, 1795, 1805, 1805, 1816, 1861, 1801, 1796, 1793, 1822, 1805, 3297, 3271, 3281, 3270, 3225, 3317, 3283, 3281, 3290, 3264, 2198, 2228, 2209, 2226, 2231, 2231, 2234, 2292, 2286, 2293, 2283, 2299, 2291, 2188, 2226, 2229, 2239, 2228, 2220, 2216, 2299, 2197, 2191, 2299, 2282, 2283, 2293, 2283, 2272, 2299, 2188, 2226, 2229, 2285, 2287, 2272, 2299, 2211, 2285, 2287, 2290, 2299, 2202, 2219, 2219, 2231, 2238, 2188, 2238, 2233, 2192, 2226, 2223, 2292, 2286, 2280, 2284, 2293, 2280, 2285, 2299, 2291, 2192, 2195, 2191, 2198, 2199, 2295, 2299, 2231, 2226, 2224, 2238, 2299, 2204, 2238, 2232, 2224, 2228, 2290, 2299, 2200, 2227, 2217, 2228, 2230, 2238, 2292, 2282, 2281, 2281, 2293, 2283, 2293, 2283, 2293, 2283, 2299, 2184, 2234, 2237, 2234, 2217, 2226, 2292, 2286, 2280, 2284, 2293, 2280, 2285, 1759, 1789, 1789, 1787, 1774, 1770, 440, 445, 440, 1002, 1023, 1023, 2779, 2796, 2799, 2796, 2811, 2796, 2811, 2821, 2872, 2851, 2861, 2851, 2852};
    public static final Pattern a = C0005.m1602(C0013.m3106(m8528(), 0, 138, 607));
    public static final Pattern b = C0005.m1602(C0029.m5256(m8528(), 138, 24, 1929));
    public static final List c = C0001.m1203(new String[]{C0065.m9775(m8528(), 162, 3, 2414), C0046.m7718(m8528(), 165, 3, 327), C0008.m1970(m8528(), 168, 3, 1278), C0004.m1549(m8528(), 171, 3, 2998), C0044.m7509(m8528(), 174, 3, 549), C0027.m5062(m8528(), 177, 3, 581), C0033.m5852(m8528(), 180, 3, 2799), C0032.m5708(m8528(), 183, 2, 576), C0064.m9599(m8528(), 185, 3, 2230), C0054.m8574(m8528(), 188, 3, 1581), C0048.m7902(m8528(), 191, 4, 2679), C0008.m1970(m8528(), 195, 3, 398), C0049.m8007(m8528(), 198, 3, 2767), C0063.m9585(m8528(), 201, 3, 2654)});
    public static final List d = C0001.m1203(new String[]{C0064.m9599(m8528(), 204, 3, 686), C0047.m7833(m8528(), 207, 3, 1145), C0051.m8259(m8528(), 210, 3, 1124), C0029.m5256(m8528(), 213, 3, 1387)});

    public static String a(String str) {
        try {
            StringBuilder sb = new StringBuilder(C0020.m4236(new BigInteger(1, C0035.m6159(C0015.m3410(C0018.m3917(m8528(), 221, 3, 768)), C0021.m4347(str, C0035.m6131(m8528(), 216, 5, 932)))), 16));
            while (C0006.m1693(sb) < 32) {
                C0019.m4071(sb, 0, C0041.m6779(m8528(), 224, 1, 1559));
            }
            return C0023.m4587(C0047.m7763(sb));
        } catch (Exception unused) {
            return C0007.m1840();
        }
    }

    public static String b(String str) {
        return new String(C0034.m5997(str, 2), C0002.m1270());
    }

    public static String c(byte[] bArr) {
        return new String(C0049.m8047(bArr, 2), C0002.m1270());
    }

    public static String d(String str, String str2, Integer num) {
        Matcher matcherM6026 = C0034.m6026(C0005.m1602(str), str2);
        return C0003.m1405(matcherM6026) ? C0021.m4306(matcherM6026, C0024.m4690(num)) : C0007.m1840();
    }

    public static String e(String str, String str2) {
        if (C0043.m7277(str2, C0064.m9599(m8528(), 225, 2, 1422))) {
            Uri uriM4422 = C0022.m4422(str);
            StringBuilder sb = new StringBuilder();
            C0018.m3933(sb, C0000.m1076(uriM4422));
            C0018.m3933(sb, C0000.m1077(m8528(), 227, 1, 344));
            C0018.m3933(sb, str2);
            return C0047.m7763(sb);
        }
        String strM7509 = C0044.m7509(m8528(), 228, 3, 2227);
        if (C0058.m9127(str2, strM7509)) {
            return str2;
        }
        Uri uriM44222 = C0022.m4422(str);
        StringBuilder sb2 = new StringBuilder();
        C0018.m3933(sb2, C0000.m1076(uriM44222));
        C0018.m3933(sb2, strM7509);
        C0018.m3933(sb2, C0048.m7889(uriM44222));
        C0018.m3933(sb2, str2);
        return C0047.m7763(sb2);
    }

    public static String f(int i) {
        SecureRandom secureRandom = new SecureRandom();
        StringBuilder sb = new StringBuilder(i);
        for (int i2 = 0; i2 < i; i2++) {
            C0062.m9399(sb, C0007.m1823(C0026.m4951(m8528(), 231, 62, 1559), C0025.m4817(secureRandom, 62)));
        }
        return C0047.m7763(sb);
    }

    public static String g(String str) {
        StringBuilder sb = new StringBuilder();
        C0018.m3933(sb, C0051.m8217());
        C0018.m3933(sb, C0018.m3917(m8528(), 293, 14, 1028));
        C0018.m3933(sb, str);
        return C0047.m7763(sb);
    }

    public static String h(String str, String str2, String str3) {
        if (C0003.m1402(str)) {
            StringBuilder sb = new StringBuilder();
            C0018.m3933(sb, C0051.m8217());
            C0018.m3933(sb, C0027.m5062(m8528(), 307, 14, 1564));
            C0018.m3933(sb, str);
            return C0047.m7763(sb);
        }
        StringBuilder sb2 = new StringBuilder();
        C0018.m3933(sb2, C0051.m8217());
        C0018.m3933(sb2, C0034.m6001(m8528(), 321, 17, 1972));
        C0018.m3933(sb2, str2);
        C0018.m3933(sb2, C0007.m1842(m8528(), 338, 7, 983));
        C0018.m3933(sb2, str3);
        return C0047.m7763(sb2);
    }

    public static String i(String str) {
        String strM8911 = C0056.m8911(m8528(), 345, 1, 1338);
        return C0058.m9127(str, strM8911) ? C0056.m8890(str, C0002.m1279(str, strM8911) + 1) : str;
    }

    public static String j(double d2) {
        if (d2 <= 0.0d) {
            return C0007.m1840();
        }
        String strM2037 = C0009.m2037(m8528(), 346, 6, 2161);
        return d2 > 1.099511627776E12d ? C0029.m5240(C0045.m7549(), strM2037, new Object[]{C0013.m3079(d2 / 1.099511627776E12d), C0061.m9361(m8528(), 352, 2, 2605)}) : d2 > 1.073741824E9d ? C0029.m5240(C0045.m7549(), strM2037, new Object[]{C0013.m3079(d2 / 1.073741824E9d), C0041.m6779(m8528(), 354, 2, 591)}) : d2 > 1048576.0d ? C0029.m5240(C0045.m7549(), strM2037, new Object[]{C0013.m3079(d2 / 1048576.0d), C0048.m7902(m8528(), 356, 2, 2741)}) : C0029.m5240(C0045.m7549(), strM2037, new Object[]{C0013.m3079(d2 / 1024.0d), C0056.m8911(m8528(), 358, 2, 939)});
    }

    public static String k(String str, String str2) {
        String[] strArrM4752 = C0024.m4752(str, C0004.m1549(m8528(), 360, 3, 1971));
        int length = strArrM4752.length;
        int i = 0;
        while (true) {
            String strM1840 = C0007.m1840();
            if (i >= length) {
                return strM1840;
            }
            String str3 = strArrM4752[i];
            if (C0058.m9127(str3, str2)) {
                String strM1398 = C0003.m1398(m8528(), 363, 1, 2557);
                if (C0058.m9127(str3, strM1398)) {
                    return C0024.m4752(str3, strM1398)[1];
                }
                String strM5062 = C0027.m5062(m8528(), 364, 1, 1433);
                return C0058.m9127(str3, strM5062) ? C0024.m4752(str3, strM5062)[1] : strM1840;
            }
            i++;
        }
    }

    public static boolean l(String str) {
        Iterator itM3109 = C0013.m3109(C0001.m1203(new String[]{C0037.m6307(m8528(), 365, 10, 2633), C0011.m2805(m8528(), 375, 5, 828)}));
        while (C0012.m2962(itM3109)) {
            if (C0058.m9127(str, (String) C0048.m7949(itM3109))) {
                return true;
            }
        }
        return false;
    }

    public static boolean m(String str) {
        Iterator itM3109 = C0013.m3109(C0001.m1203(new String[]{C0060.m9352(m8528(), 380, 3, 2005), C0025.m4795(m8528(), 383, 3, 727), C0013.m3106(m8528(), 386, 4, 328), C0008.m1970(m8528(), 390, 3, 820), C0010.m2300(m8528(), 393, 3, 1942), C0029.m5256(m8528(), 396, 3, 2920), C0012.m2973(m8528(), 399, 3, 2265), C0016.m3525(m8528(), 402, 3, 1760), C0002.m1305(m8528(), 405, 2, 1215), C0031.m5565(m8528(), 407, 3, 809), C0021.m4340(m8528(), 410, 3, 2945), C0002.m1305(m8528(), 413, 4, 1671), C0022.m4403(m8528(), 417, 3, 2016), C0007.m1842(m8528(), 420, 3, 1148), C0015.m3484(m8528(), 423, 3, 2008)}));
        while (C0012.m2962(itM3109)) {
            if (C0058.m9127(str, (String) C0048.m7949(itM3109))) {
                return true;
            }
        }
        return false;
    }

    public static boolean n(String str) {
        if (C0058.m9127(str, C0017.m3646(m8528(), 426, 8, 2228)) || C0058.m9127(str, C0014.m3332(m8528(), 434, 3, 1153)) || C0058.m9127(str, C0064.m9599(m8528(), 437, 4, 683)) || C0058.m9127(str, C0058.m9106(m8528(), 441, 5, 3163))) {
            return false;
        }
        return C0003.m1405(C0034.m6026(C0062.m9425(), str));
    }

    public static boolean o(String str) {
        Iterator itM3109 = C0013.m3109(C0001.m1203(new String[]{C0036.m6188(m8528(), 446, 5, 1760), C0044.m7509(m8528(), 451, 2, 1211), C0015.m3484(m8528(), 453, 5, 1755), C0001.m1189(m8528(), 458, 6, 2144), C0006.m1774(m8528(), 464, 9, 3273), C0011.m2805(m8528(), 473, 4, 1809), C0019.m4107(m8528(), 477, 8, 1222), C0031.m5565(m8528(), 485, 8, 453), C0014.m3332(m8528(), 493, 12, 1662), C0001.m1189(m8528(), 505, 11, 3060), C0054.m8574(m8528(), 516, 8, 2308)}));
        while (C0012.m2962(itM3109)) {
            if (C0058.m9127(str, (String) C0048.m7949(itM3109))) {
                return true;
            }
        }
        return false;
    }

    public static void p(List list, String str) {
        int iM3094 = C0013.m3094(list, str);
        if (iM3094 > 0) {
            ArrayList arrayList = new ArrayList(C0012.m2972(list, iM3094, C0064.m9636(list)));
            C0022.m4479(C0012.m2972(list, iM3094, C0064.m9636(list)));
            C0025.m4820(list, 0, arrayList);
        }
    }

    public static HashMap q() {
        return C0020.m4251(C0065.m9775(m8528(), 524, 10, 702), C0031.m5565(m8528(), 534, 135, 727));
    }

    public static String r(String str) {
        String strM1549 = C0004.m1549(m8528(), 669, 1, 2673);
        return C0058.m9127(str, strM1549) ? C0054.m8636(str, 0, C0002.m1279(str, strM1549)) : str;
    }

    public static String s(String str) {
        return (str == null || C0004.m1584(str) <= 1) ? str : C0054.m8636(str, 0, C0004.m1584(str) - 1);
    }

    public static HashMap t(String str) {
        HashMap mapM1659 = C0005.m1659();
        if (mapM1659 == null || C0041.m6760(mapM1659)) {
            synchronized (g.class) {
                try {
                    HashMap mapM16592 = C0005.m1659();
                    if (mapM16592 == null || C0041.m6760(mapM16592)) {
                        HashMap map = new HashMap();
                        e = map;
                        C0053.m8424(map, C0030.m5362(m8528(), 670, 12, 1437), C0054.m8574(m8528(), 682, 24, 2386));
                        C0053.m8424(C0005.m1659(), C0061.m9361(m8528(), 706, 15, 980), C0011.m2805(m8528(), 721, 59, 2977));
                        C0053.m8424(C0005.m1659(), C0044.m7509(m8528(), 780, 10, 1163), C0052.m8337(m8528(), 790, 10, 1896));
                        C0053.m8424(C0005.m1659(), C0060.m9352(m8528(), 800, 10, 3252), C0023.m4536(m8528(), 810, 111, 2267));
                        C0053.m8424(C0005.m1659(), C0039.m6551(m8528(), 921, 6, 1694), C0001.m1189(m8528(), 927, 3, 402));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        URI uriM7980 = C0049.m7980(str);
        StringBuilder sb = new StringBuilder();
        C0018.m3933(sb, C0008.m1989(uriM7980));
        C0018.m3933(sb, C0054.m8574(m8528(), 930, 3, 976));
        C0018.m3933(sb, C0004.m1491(uriM7980));
        String strM7763 = C0047.m7763(sb);
        C0053.m8424(C0005.m1659(), C0000.m1077(m8528(), 933, 7, 2697), strM7763);
        C0053.m8424(C0005.m1659(), C0064.m9599(m8528(), 940, 6, 2890), strM7763);
        return C0005.m1659();
    }

    /* renamed from: ۣۣۤۡ, reason: not valid java name and contains not printable characters */
    public static short[] m8528() {
        if (C0044.m7508() <= 0) {
            return f797short;
        }
        return null;
    }
}