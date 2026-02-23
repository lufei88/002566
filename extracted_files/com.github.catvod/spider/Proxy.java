package com.github.catvod.spider;

import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.N.C0023;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.c;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.merge.z.C0065;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import com.github.catvod.spider.p000mergexbpq.r.C0014;
import com.github.catvod.spider.p000mergexbpq.x.C0015;
import com.google.gson.Gson;
import java.io.InputStream;
import java.util.Map;
import java.util.Set;
import okhttp3.Headers;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* loaded from: classes.dex */
public class Proxy extends Spider {
    public static int a = -1;

    /* renamed from: short, reason: not valid java name */
    private static final short[] f99short = {2633, 2638, 2640, 423, 426, 430, 427, 426, 445, 2114, 2121, 1059, 1039, 1038, 1044, 1029, 1038, 1044, 1101, 1076, 1049, 1040, 1029, 766, 728, 718, 729, 646, 746, 716, 718, 709, 735, 3155, 3188, 3176, 3183, 1872, 1868, 1868, 1864, 1794, 1815, 1815, 1801, 1802, 1807, 1814, 1800, 1814, 1800, 1814, 1801, 1794, 1065, 1142, 1140, 1129, 1150, 1151, 1081, 1122, 1129, 1083, 1125, 1133, 1852, 1848, 1945, 1968, 1962, 1969, 1979, 2047, 1971, 1968, 1980, 1982, 1971, 2047, 1964, 1978, 1965, 1961, 1978, 1965, 2047, 1967, 1968, 1965, 1963, 2047, 1945, 1925, 1925, 1921, 1995, 2014, 2014, 1984, 1987, 1990, 2015, 1985, 2015, 1985, 2015, 1984, 1995, 1635, 1596, 1598, 1571, 1588, 1589, 2606, 2672, 2614, 2683, 3076, 3087, 1430, 1435, 1439, 1434, 1435, 1420, 409, 389, 389, 385, 876, 832, 833, 859, 842, 833, 859, 770, 891, 854, 863, 842, 3316, 3315, 3309, 1887, 1865, 1882, 1859, 1865, 962, 966, 978, 961, 984, 895, 893, 864, 887, 886, 2013, 2014, 2002, 2000, 2013, 470, 467, 476, 479, 455, 642, 664, 650, 651, 1442, 1449, 1452, 1449, 2001, 2012, 2009, 837, 851, 933, 941, 2307, 2429, 2363, 2422, 2334, 2364, 2337, 2358, 2359, 1265, 1251, 1252, 1250, 1255, 1264, 2014, 2001, 1995, 2000, 2000, 1984, 1993, 1186, 1204, 1200, 1202, 1209, 1205, 1200, 1215, 1212, 1188, 1298, 1296, 1281, 1305, 1306, 1298, 1806, 1802, 1822, 1805, 1812, 1807, 1814, 1820, 2232, 2219, 2212, 2221, 2223, 2374, 2378, 2379, 2379, 2368, 2374, 2385, 2380, 2378, 2379, 2637, 2639, 2639, 2633, 2652, 2648, 2561, 2633, 2626, 2639, 2627, 2632, 2629, 2626, 2635, 815, 841, 852, 856, 833, 831, 857, 774, 815, 841, 852, 856, 801, 852, 801, 863, 856, 862, 841, 845, 833, 801, 837, 834, 842, 822, 860, 862, 835, 843, 862, 845, 833, 801, 837, 840, 817, 829, 800, 846, 845, 834, 840, 859, 837, 840, 856, 836, 817, 820, 828, 828, 828, 828, 828, 800, 862, 841, 863, 835, 832, 857, 856, 837, 835, 834, 817, 829, 828, 820, 828, 884, 826, 828, 820, 774, 3055, 3055, 3051, 3051, 686, 686, 703, 696, 690, 913, 901, 901, 901, 901, 901, 901, 901, 964, 917, 2787, 2745, 2749, 2567, 2579, 2579, 2579, 2857, 2858, 2849, 2856, 2861, 2862, 2848, 1612, 1611, 1601, 1603, 1621, 1782, 1760, 2726, 2723, 2725, 2799, 2796, 1523, 1521, 1519, 1524, 1877, 1877, 1865, 1866, 3112, 3126, 3111, 3108, 1122, 1122, 1121, 1122, 2944, 3046, 3067, 3063, 3054, 2960, 3062, 1920, 1937, 1937, 1933, 1928, 1922, 1920, 1941, 1928, 1934, 1935, 1998, 1945, 1996, 1932, 1937, 1924, 1926, 1972, 1971, 1965, 3104, 3108, 589, 588, 606, 565, 544, 2704, 2689, 2716, 2704, 2763, 2708, 2696, 2693, 2701, 2698, 2783, 2756, 2695, 2700, 2693, 2710, 2711, 2689, 2704, 2777, 2705, 2704, 2690, 2761, 2780, 2054, 2052, 2073, 2062, 2063, 2134, 2051, 2052, 2074, 2134, 2124, 2326, 2324, 2313, 2334, 2335, 2374, 2318, 2307, 2311, 2306, 2307, 2324, 2374, 2396, 2052, 2138, 2076, 2129, 2121, 2076, 2075, 2053, 2121, 2121, 2131, 2668, 391, 2082, 2172, 2106, 2167, 2159, 2083, 2086, 2081, 2090, 2159, 1104, 588, 530, 596, 537, 513, 593, 595, 590, 601, 600, 580, 581, 513, 589, 584, 591, 580, 513, 3085, 3095, 2692, 2713, 2781};

    static {
        C0001.m1203(new String[]{C0023.m4536(m533(), 0, 3, 2620), C0049.m8007(m533(), 3, 6, 463), C0004.m1549(m533(), 9, 2, 2086), C0065.m9775(m533(), 11, 12, 1120), C0014.m3332(m533(), 23, 10, 683), C0025.m4795(m533(), 33, 4, 3099)});
    }

    public static void a() {
        if (C0041.m6767() > 0) {
            return;
        }
        for (int i = 9978; i < 10000; i++) {
            StringBuilder sb = new StringBuilder(C0024.m4740(m533(), 37, 17, 1848));
            C0036.m6177(sb, i);
            C0018.m3933(sb, C0065.m9775(m533(), 54, 12, 1030));
            if (C0007.m1815(C0032.m5769(C0047.m7763(sb), null), C0064.m9599(m533(), 66, 2, 1875))) {
                StringBuilder sb2 = new StringBuilder(C0013.m3106(m533(), 68, 24, 2015));
                C0036.m6177(sb2, i);
                m530(C0047.m7763(sb2));
                a = i;
                return;
            }
        }
    }

    public static int getPort() {
        C0048.m7940();
        return C0041.m6767();
    }

    public static String getUrl() {
        C0048.m7940();
        StringBuilder sb = new StringBuilder(C0064.m9599(m533(), 92, 17, 2033));
        C0036.m6177(sb, C0041.m6767());
        C0018.m3933(sb, C0032.m5708(m533(), 109, 6, 1612));
        return C0047.m7763(sb);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:150:0x057b  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x058b  */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object[] proxy(java.util.Map<java.lang.String, java.lang.String> r68) {
        /*
            Method dump skipped, instructions count: 2228
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.Proxy.proxy(java.util.Map):java.lang.Object[]");
    }

    /* renamed from: ۟ۢ۠ۢۧ, reason: not valid java name and contains not printable characters */
    public static Object m527(Object obj, Object obj2, Object obj3) {
        if (C0019.m4065() < 0) {
            return ((Gson) obj).fromJson((String) obj2, (Class) obj3);
        }
        return null;
    }

    /* renamed from: ۣ۟۠ۥۦ, reason: not valid java name and contains not printable characters */
    public static InputStream m528(Object obj) {
        if (C0012.m3024() > 0) {
            return ((ResponseBody) obj).byteStream();
        }
        return null;
    }

    /* renamed from: ۟ۧۧۡ۟, reason: not valid java name and contains not printable characters */
    public static int m529(Object obj) {
        if (C0055.m8740() >= 0) {
            return ((Response) obj).code();
        }
        return 0;
    }

    /* renamed from: ۟ۨۧۡ, reason: not valid java name and contains not printable characters */
    public static void m530(Object obj) {
        if (C0050.m8121() < 0) {
            SpiderDebug.log((String) obj);
        }
    }

    /* renamed from: ۠ۡۡ۟, reason: not valid java name and contains not printable characters */
    public static Set m531(Object obj) {
        if (C0012.m3024() > 0) {
            return ((Headers) obj).names();
        }
        return null;
    }

    /* renamed from: ۡۡ۟۠, reason: not valid java name and contains not printable characters */
    public static Headers m532(Object obj) {
        if (C0015.m3433() >= 0) {
            return ((Response) obj).headers();
        }
        return null;
    }

    /* renamed from: ۣۦۨۦ, reason: not valid java name and contains not printable characters */
    public static short[] m533() {
        if (C0005.m1599() <= 0) {
            return f99short;
        }
        return null;
    }

    /* renamed from: ۦۨ۟ۦ, reason: contains not printable characters */
    public static String m534(Object obj, Object obj2) {
        if (C0050.m8121() <= 0) {
            return ((Headers) obj).get((String) obj2);
        }
        return null;
    }

    /* renamed from: ۦۨۢ۟, reason: contains not printable characters */
    public static ResponseBody m535(Object obj) {
        if (C0048.m7971() >= 0) {
            return ((Response) obj).body();
        }
        return null;
    }

    /* renamed from: ۧۨۦۨ, reason: not valid java name and contains not printable characters */
    public static Response m536(Object obj, Object obj2) {
        if (C0007.m1886() > 0) {
            return c.g((String) obj, (Map) obj2);
        }
        return null;
    }
}