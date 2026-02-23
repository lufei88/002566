package com.github.catvod.spider;

import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.E.b;
import com.github.catvod.spider.merge.E.g;
import com.github.catvod.spider.merge.F0.C0018;
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
import com.github.catvod.spider.merge.T0.h;
import com.github.catvod.spider.merge.T0.m;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.V0.d;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.Z0.C0041;
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
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.q.C0058;
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
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.c0.C0010;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import com.github.catvod.spider.p000mergexbpq.x.C0015;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;

/* loaded from: classes.dex */
public class Ikanbot extends Spider {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f72short = {1152, 1190, 1200, 1191, 1272, 1172, 1202, 1200, 1211, 1185, 1871, 1901, 1912, 1899, 1902, 1902, 1891, 1837, 1847, 1836, 1842, 1826, 1834, 1877, 1899, 1900, 1894, 1901, 1909, 1905, 1826, 1868, 1878, 1826, 1843, 1842, 1836, 1842, 1849, 1826, 1877, 1899, 1900, 1844, 1846, 1849, 1826, 1914, 1844, 1846, 1835, 1826, 1859, 1906, 1906, 1902, 1895, 1877, 1895, 1888, 1865, 1899, 1910, 1837, 1847, 1841, 1845, 1836, 1841, 1844, 1826, 1834, 1865, 1866, 1878, 1871, 1870, 1838, 1826, 1902, 1899, 1897, 1895, 1826, 1861, 1895, 1889, 1897, 1901, 1835, 1826, 1857, 1898, 1904, 1901, 1903, 1895, 1837, 1843, 1840, 1840, 1836, 1842, 1836, 1842, 1836, 1842, 1826, 1873, 1891, 1892, 1891, 1904, 1899, 1837, 1847, 1841, 1845, 1836, 1841, 1844, 1106, 1102, 1102, 1098, 1097, 1024, 1045, 1045, 1100, 1044, 1107, 1105, 1115, 1108, 1112, 1109, 1102, 1044, 1113, 1109, 1111, 1045, 1106, 1109, 1102, 1854, 1083, 1126, 1083, 2811, 2749, 2721, 2744, 2745, 1013, 954, 1021, 992, 1009, 1017, 1430, 1426, 1432, 2214, 2211, 2230, 2211, 2287, 2225, 2224, 2209, 3196, 3174, 3185, 3186, 2132, 2137, 2113, 1981, 644, 664, 664, 668, 671, 726, 707, 707, 666, 706, 645, 647, 653, 642, 654, 643, 664, 706, 655, 643, 641, 707, 668, 640, 653, 661, 707, 2164, 2093, 2839, 2847, 2830, 2843, 2849, 2826, 2824, 2837, 2826, 2847, 2824, 2830, 2819, 2887, 2837, 2845, 2880, 2835, 2839, 2843, 2845, 2847, 2855, 1246, 1234, 1235, 1225, 1240, 1235, 1225, 1021, 1008, 1007, 951, 1021, 1020, 1005, 1016, 1008, 1013, 953, 935, 953, 1009, 938, 2868, 2867, 2861, 2856, 2857, 2942, 2878, 2856, 2863, 2863, 2872, 2867, 2857, 2818, 2868, 2873, 1111, 1088, 1101, 1108, 1092, 2550, 2545, 2543, 2538, 2539, 2492, 2554, 2496, 2539, 2544, 2548, 2554, 2545, 1772, 1771, 1781, 1776, 1777, 1702, 1768, 1777, 1788, 1781, 1760, 2495, 2467, 2467, 2471, 2468, 2541, 2552, 2552, 2465, 2553, 2494, 2492, 2486, 2489, 2485, 2488, 2467, 2553, 2484, 2488, 2490, 2552, 2486, 2471, 2494, 2552, 2480, 2482, 2467, 2437, 2482, 2468, 2457, 2536, 2465, 2494, 2483, 2482, 2488, 2462, 2483, 2538, 1834, 1889, 1912, 1909, 1916, 1897, 1841, 2021, 2019, 1969, 1962, 1966, 1952, 1963, 2040, 3077, 3072, 3093, 3072, 2966, 2963, 2953, 2958, 1096, 1096, 1096, 2866, 2892, 2824, 2818, 2831, 2825, 2866, 2892, 2900, 2866, 2892, 2886, 2880, 2884, 2897, 2887, 2866, 2892, 2882, 2866, 2892, 2843, 2844, 2818, 2866, 2892, 2900, 2866, 2892, 2886, 2880, 2884, 2897, 2887, 2866, 2892, 1609, 1630, 1608, 1663, 1626, 1615, 1626, 1310, 3094, 486, 1329, 1329, 563, 569, 574, 574, 574, 2680, 2670, 2665, 2665, 2686, 2677, 2671, 2628, 2674, 2687, 2619, 2929, 2891, 2912, 2939, 2943, 2929, 2938, 2868, 3043, 2981, 2978, 2984, 2985, 2996, 3041, 2977, 2979, 3002, 2981, 2985, 3041, 31521, -25052, 2390, 2320, 2327, 2333, 2332, 2305, 2388, 2317, 2319, 2388, 31124, -25455, 2111, 2169, 2174, 2164, 2165, 2152, 2109, 2148, 2150, 2109, 24301, 18103, 23159, 2552, 2494, 2489, 2483, 2482, 2479, 2554, 2467, 2465, 2554, -25026, 23472, 31856, -26251, 31144, 21484, 31408, -24651, 22586, -25445, 24427, 18225, 23537, -28606, 21964, 1950, 1922, 1922, 1926, 1925, 1996, 2009, 2009, 1920, 2008, 1951, 1949, 1943, 1944, 1940, 1945, 1922, 2008, 1941, 1945, 1947, 2009, 1940, 1951, 1946, 1946, 1940, 1945, 1943, 1924, 1938, 2008, 1950, 1922, 1947, 1946, 839, 842, 853, 781, 842, 855, 838, 846, 782, 849, 844, 844, 855, 1457, 1461, 1471, 1505, 1508, 1521, 1508, 1448, 1526, 1527, 1510, 307, 1220, 1246, 1225, 1226, 2898, 2911, 2887, 2480, 3022, 25619, 28603, -29947, 23396, 818, 873, 866, 816, 873, 876, 867, 864, 888, 811, 871, 888, 864, 868, 867, 874, 816, 3107, 3183, 3180, 3190, 3181, 3184, 3128, 904, 916, 916, 912, 915, 986, 975, 975, 918, 974, 905, 907, 897, 910, 898, 911, 916, 974, 899, 911, 909, 975, 915, 901, 897, 914, 899, 904, 991, 913, 989, 1632, 1583, 1634, 1646, 1655, 1636, 1651, 1580, 1645, 1640, 1647, 1642, 3323, 3327, 3317, 1507, 1510, 1523, 1510, 1450, 1524, 1525, 1508, 3320, 3298, 3317, 3318, 2659, 2670, 2678, 1800};

    public static HashMap a() {
        return C0020.m4251(C0023.m4536(m435(), 0, 10, 1237), C0000.m1077(m435(), 10, 111, 1794));
    }

    /* renamed from: ۟ۢۧ۠ۡ, reason: not valid java name and contains not printable characters */
    public static short[] m435() {
        if (C0031.m5628() >= 0) {
            return f72short;
        }
        return null;
    }

    /* renamed from: ۟ۦۢۡ, reason: not valid java name and contains not printable characters */
    public static JsonObject m436(Object obj, Object obj2) {
        if (C0036.m6252() >= 0) {
            return ((JsonObject) obj).getAsJsonObject((String) obj2);
        }
        return null;
    }

    /* renamed from: ۣ۠ۨۨ, reason: not valid java name and contains not printable characters */
    public static Iterator m437(Object obj) {
        if (C0030.m5375() > 0) {
            return ((JsonArray) obj).iterator();
        }
        return null;
    }

    /* renamed from: ۣۥۨۧ, reason: not valid java name and contains not printable characters */
    public static JsonObject m438(Object obj) {
        if (C0029.m5282() >= 0) {
            return ((JsonElement) obj).getAsJsonObject();
        }
        return null;
    }

    /* renamed from: ۣۤ۟۟, reason: not valid java name and contains not printable characters */
    public static JsonElement m439(Object obj, Object obj2) {
        if (C0017.m3633() <= 0) {
            return ((JsonObject) obj).get((String) obj2);
        }
        return null;
    }

    /* renamed from: ۧۢۨۤ, reason: not valid java name and contains not printable characters */
    public static JsonArray m440(Object obj, Object obj2) {
        if (C0029.m5282() > 0) {
            return ((JsonObject) obj).getAsJsonArray((String) obj2);
        }
        return null;
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        String strM4915 = C0026.m4915(C0060.m9352(m435(), 121, 25, 1082), str);
        if (!C0007.m1815(C0000.m1077(m435(), 146, 1, 1807), str2)) {
            strM4915 = C0028.m5172(strM4915, C0006.m1774(m435(), 147, 3, 1046), str2);
        }
        h hVarM3577 = C0016.m3577(C0032.m5769(C0050.m8125(strM4915, C0038.m6452(m435(), 150, 5, 2773)), C0015.m3501()));
        ArrayList arrayList = new ArrayList();
        Iterator itM7807 = C0047.m7807(C0030.m5333(hVarM3577, C0052.m8337(m435(), 155, 6, 916)));
        while (C0012.m2962(itM7807)) {
            m mVar = (m) C0048.m7949(itM7807);
            String strM1842 = C0007.m1842(m435(), 161, 3, 1535);
            String strM8058 = C0049.m8058(C0030.m5333(mVar, strM1842), C0018.m3917(m435(), 164, 8, 2242));
            String strM2339 = C0010.m2339(mVar, C0038.m6452(m435(), 172, 4, 3092));
            C0004.m1532(arrayList, new com.github.catvod.spider.merge.E.m(C0024.m4752(strM2339, C0045.m7657(m435(), 179, 1, 1938))[2], C0049.m8058(C0030.m5333(mVar, strM1842), C0022.m4403(m435(), 176, 3, 2101)), C0007.m1809(strM8058, C0006.m1742(strM8058))));
        }
        int iM6456 = (C0038.m6456(str2) + 1) * 24;
        g gVar = new g();
        C0045.m7632(gVar, arrayList);
        C0049.m7974(gVar, C0038.m6456(str2), C0038.m6456(str2) + 1, 24, iM6456);
        return C0033.m5828(gVar);
    }

    public String detailContent(List<String> list) {
        String strM4306;
        String strM43062;
        String strM7763;
        h hVarM3577 = C0016.m3577(C0032.m5769(C0050.m8125(C0063.m9585(m435(), 180, 27, 748), (String) C0048.m7915(list, 0)), C0015.m3501()));
        String strM4684 = C0024.m4684(C0030.m5333(hVarM3577, C0046.m7718(m435(), 207, 2, 2076)));
        String strM8058 = C0049.m8058(C0030.m5333(hVarM3577, C0060.m9352(m435(), 209, 23, 2938)), C0041.m6779(m435(), 232, 7, 1213));
        d dVarM5333 = C0030.m5333(hVarM3577, C0038.m6452(m435(), 239, 15, 921));
        int i = 1;
        String strM9669 = C0064.m9669((m) C0028.m5161(dVarM5333, 1));
        String strM96692 = C0064.m9669((m) C0028.m5161(dVarM5333, 2));
        String strM96693 = C0064.m9669((m) C0028.m5161(dVarM5333, 3));
        d dVarM53332 = C0030.m5333(hVarM3577, C0001.m1189(m435(), 254, 16, 2909));
        String strM4740 = C0024.m4740(m435(), 270, 5, 1057);
        String strM80582 = C0049.m8058(dVarM53332, strM4740);
        String strM80583 = C0049.m8058(C0030.m5333(hVarM3577, C0023.m4536(m435(), 275, 13, 2463)), strM4740);
        String strM80584 = C0049.m8058(C0030.m5333(hVarM3577, C0044.m7509(m435(), 288, 11, 1669)), strM4740);
        String strM8925 = C0056.m8925(this, strM80582, strM80583);
        StringBuilder sb = new StringBuilder(C0012.m2973(m435(), 299, 42, 2519));
        C0011.m2747(sb, (String) C0048.m7915(list, 0), C0003.m1398(m435(), 341, 7, 1804), strM80584, C0013.m3106(m435(), 348, 8, 1989));
        C0018.m3933(sb, strM8925);
        Iterator itM437 = m437(m440(m436((JsonObject) C0033.m5856(C0032.m5769(C0047.m7763(sb), C0015.m3501()), JsonObject.class), C0029.m5256(m435(), 356, 4, 3169)), C0026.m4951(m435(), 360, 4, 3066)));
        String strM1840 = C0007.m1840();
        String strM5172 = strM1840;
        String str = strM5172;
        while (true) {
            boolean zM2962 = C0012.m2962(itM437);
            String strM8337 = C0052.m8337(m435(), 364, 3, 1132);
            if (!zM2962) {
                com.github.catvod.spider.merge.E.m mVar = new com.github.catvod.spider.merge.E.m();
                C0011.m2828(mVar, (String) C0048.m7915(list, 0));
                C0026.m4947(mVar, C0007.m1809(strM8058, C0006.m1742(strM8058)));
                C0022.m4432(mVar, strM9669);
                C0058.m9152(mVar, strM96693);
                C0017.m3671(mVar, strM96692);
                C0005.m1628(mVar, strM4684);
                C0054.m8596(mVar, strM5172);
                C0044.m7449(mVar, C0015.m3446(C0015.m3446(str, C0027.m5062(m435(), 413, 2, 1298), C0060.m9352(m435(), 415, 1, 528)), C0058.m9106(m435(), 416, 4, 538), strM8337));
                return C0053.m8428(mVar);
            }
            Matcher matcherM6026 = C0034.m6026(C0005.m1602(C0038.m6452(m435(), 367, 36, 2926)), C0015.m3446(C0000.m1096(m439(m438((JsonElement) C0048.m7949(itM437)), C0003.m1398(m435(), 403, 7, 1595))), C0009.m2037(m435(), 410, 1, 1346), strM1840));
            if (C0003.m1405(matcherM6026)) {
                strM43062 = C0021.m4306(matcherM6026, i);
                strM4306 = C0021.m4306(matcherM6026, 2);
            } else {
                strM4306 = strM1840;
                strM43062 = strM4306;
            }
            strM5172 = !C0007.m1815(strM1840, strM5172) ? C0028.m5172(strM5172, strM8337, strM43062) : C0065.m9804(strM5172, strM43062);
            boolean zM1815 = C0007.m1815(strM1840, str);
            String strM3525 = C0016.m3525(m435(), 411, 1, 3122);
            if (zM1815) {
                StringBuilder sbM5621 = C0031.m5621(str);
                StringBuilder sb2 = new StringBuilder(strM3525);
                C0018.m3933(sb2, strM43062);
                C0018.m3933(sbM5621, C0015.m3446(strM4306, C0047.m7763(sb2), strM1840));
                strM7763 = C0047.m7763(sbM5621);
            } else {
                StringBuilder sb3 = new StringBuilder();
                C0018.m3933(sb3, str);
                C0018.m3933(sb3, C0007.m1842(m435(), 412, 1, 408));
                C0018.m3933(sb3, strM4684);
                C0018.m3933(sb3, strM8337);
                StringBuilder sb4 = new StringBuilder(strM3525);
                C0018.m3933(sb4, strM43062);
                C0018.m3933(sb3, C0015.m3446(strM4306, C0047.m7763(sb4), strM1840));
                strM7763 = C0047.m7763(sb3);
            }
            str = strM7763;
            i = 1;
        }
    }

    public String get_tks(String str, String str2) {
        String strM8890 = str2;
        PrintStream printStreamM6087 = C0035.m6087();
        C0015.m3428(printStreamM6087, C0026.m4915(C0023.m4536(m435(), 420, 11, 2587), str), new Object[0]);
        StringBuilder sb = new StringBuilder(C0016.m3525(m435(), 431, 8, 2836));
        C0018.m3933(sb, strM8890);
        C0015.m3428(printStreamM6087, C0047.m7763(sb), new Object[0]);
        String strM1840 = C0007.m1840();
        if (C0007.m1815(strM1840, str) || C0007.m1815(strM1840, strM8890)) {
            return strM1840;
        }
        String[] strArr = new String[4];
        int iM1584 = C0004.m1584(str);
        String strM8636 = C0054.m8636(str, iM1584 - 4, iM1584);
        for (int i = 0; i < C0004.m1584(strM8636); i++) {
            int iM5585 = C0031.m5585(C0007.m1823(strM8636, i)) % 3;
            int i2 = iM5585 + 1;
            int i3 = iM5585 + 9;
            strArr[i] = C0054.m8636(strM8890, i2, i3);
            strM8890 = C0056.m8890(strM8890, i3);
        }
        StringBuilder sb2 = new StringBuilder();
        for (int i4 = 0; i4 < 4; i4++) {
            C0018.m3933(sb2, strArr[i4]);
        }
        return C0047.m7763(sb2);
    }

    public String homeContent(boolean z) {
        ArrayList arrayList = new ArrayList();
        String[] strArr = {C0038.m6452(m435(), 439, 15, 3020), C0051.m8259(m435(), 454, 12, 2425), C0018.m3917(m435(), 466, 13, 2064), C0027.m5062(m435(), 479, 12, 2519)};
        String[] strArr2 = {C0047.m7833(m435(), 491, 4, 3229), C0024.m4740(m435(), 495, 4, 2653), C0001.m1189(m435(), 499, 3, 2454), C0034.m6001(m435(), 502, 2, 1963)};
        for (int i = 0; i < 4; i++) {
            C0004.m1532(arrayList, new b(strArr[i], strArr2[i], null));
        }
        h hVarM3577 = C0016.m3577(C0032.m5769(C0002.m1305(m435(), 504, 36, 2038), C0015.m3501()));
        ArrayList arrayList2 = new ArrayList();
        Iterator itM7807 = C0047.m7807(C0030.m5333(hVarM3577, C0001.m1189(m435(), 540, 13, 803)));
        while (C0012.m2962(itM7807)) {
            m mVar = (m) C0048.m7949(itM7807);
            String strM5256 = C0029.m5256(m435(), 553, 3, 1496);
            String strM8058 = C0049.m8058(C0030.m5333(mVar, strM5256), C0017.m3646(m435(), 556, 8, 1413));
            try {
                C0004.m1532(arrayList2, new com.github.catvod.spider.merge.E.m(C0024.m4752(C0049.m8058(C0030.m5333(mVar, C0032.m5708(m435(), 564, 1, 338)), C0004.m1549(m435(), 565, 4, 1196)), C0046.m7718(m435(), 572, 1, 2463))[2], C0049.m8058(C0030.m5333(mVar, strM5256), C0006.m1774(m435(), 569, 3, 2867)), C0007.m1809(strM8058, C0006.m1742(strM8058))));
            } catch (Exception unused) {
            }
        }
        return C0025.m4831(arrayList, arrayList2);
    }

    public String playerContent(String str, String str2, List<String> list) {
        C0036.m6219();
        String[] strArrM4752 = C0024.m4752(str2, C0027.m5062(m435(), 573, 1, 2992));
        String strM8131 = (strArrM4752.length <= 0 || C0057.m8953(strArrM4752[0])) ? C0050.m8131(m435(), 574, 4, 2226) : strArrM4752[0];
        String str3 = (strArrM4752.length <= 1 || C0057.m8953(strArrM4752[1])) ? null : strArrM4752[1];
        StringBuilder sb = new StringBuilder();
        C0018.m3933(sb, C0051.m8217());
        C0018.m3933(sb, C0034.m6001(m435(), 578, 17, 781));
        C0018.m3933(sb, str3);
        C0018.m3933(sb, C0058.m9106(m435(), 595, 7, 3077));
        C0018.m3933(sb, str);
        String strM7763 = C0047.m7763(sb);
        g gVar = new g();
        C0017.m3667(gVar, strM8131);
        C0002.m1282(gVar, strM7763);
        C0057.m9029(gVar, C0015.m3501());
        return C0033.m5828(gVar);
    }

    public String searchContent(String str, boolean z) {
        h hVarM3577 = C0016.m3577(C0032.m5769(C0050.m8125(C0043.m7290(m435(), 602, 31, 992), C0056.m8909(str)), C0015.m3501()));
        ArrayList arrayList = new ArrayList();
        Iterator itM7807 = C0047.m7807(C0030.m5333(hVarM3577, C0055.m8814(m435(), 633, 12, 1537)));
        while (C0012.m2962(itM7807)) {
            m mVar = (m) C0048.m7949(itM7807);
            String strM8911 = C0056.m8911(m435(), 645, 3, 3218);
            String strM8058 = C0049.m8058(C0030.m5333(mVar, strM8911), C0033.m5852(m435(), 648, 8, 1415));
            String strM2339 = C0010.m2339(mVar, C0002.m1305(m435(), 656, 4, 3216));
            C0004.m1532(arrayList, new com.github.catvod.spider.merge.E.m(C0024.m4752(strM2339, C0053.m8477(m435(), 663, 1, 1831))[2], C0049.m8058(C0030.m5333(mVar, strM8911), C0021.m4340(m435(), 660, 3, 2562)), C0007.m1809(strM8058, C0006.m1742(strM8058))));
        }
        return C0047.m7783(arrayList);
    }
}