package com.github.catvod.spider.merge.a1;

import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z.C0040;
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.r0.C0060;
import com.github.catvod.spider.merge.t.C0061;
import com.github.catvod.spider.merge.z.C0065;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.x.C0015;
import okhttp3.Call;
import okhttp3.Headers;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f736short = {627, 610, 610, 638, 635, 625, 627, 614, 635, 637, 636, 573, 618, 575, 613, 613, 613, 575, 628, 637, 608, 639, 575, 615, 608, 638, 631, 636, 625, 637, 630, 631, 630, 2643, 2677, 2659, 2676, 2603, 2631, 2657, 2659, 2664, 2674, 1473, 1507, 1526, 1509, 1504, 1504, 1517, 1443, 1465, 1442, 1468, 1452, 1444, 1499, 1509, 1506, 1512, 1507, 1531, 1535, 1452, 1474, 1496, 1452, 1469, 1468, 1442, 1468, 1463, 1452, 1499, 1509, 1506, 1466, 1464, 1463, 1452, 1524, 1466, 1464, 1445, 1452, 1485, 1532, 1532, 1504, 1513, 1499, 1513, 1518, 1479, 1509, 1528, 1443, 1465, 1471, 1467, 1442, 1471, 1466, 1452, 1444, 1479, 1476, 1496, 1473, 1472, 1440, 1452, 1504, 1509, 1511, 1513, 1452, 1483, 1513, 1519, 1511, 1507, 1445, 1452, 1487, 1508, 1534, 1507, 1505, 1513, 1443, 1461, 1460, 1442, 1468, 1442, 1464, 1467, 1465, 1460, 1442, 1469, 1471, 1461, 1452, 1503, 1517, 1514, 1517, 1534, 1509, 1443, 1465, 1471, 1467, 1442, 1471, 1461, 2495, 2466, 2489, 2487, 2489, 2494, 734, 706, 706, 710, 709, 652, 665, 665, 705, 705, 705, 664, 734, 707, 727, 711, 735, 664, 730, 735, 704, 723, 1362, 1353, 1360, 1360, 2667, 2604, 2623, 2600, 2604, 2672, 864, 892, 892, 888, 891, 818, 807, 807, 876, 873, 892, 873, 806, 894, 865, 876, 877, 871, 806, 865, 889, 865, 881, 865, 806, 875, 871, 869, 807, 894, 806, 878, 828, 894, 1005, 2590, 2583, 2662, 2783, 2755, 2755, 2759, 2756, 2701, 2712, 2712, 2755, 2713, 2778, 2770, 2712, 2783, 2754, 2774, 1278, 1274, 1260, 2552, 2556, 2538, 2454, 2554, 2555, 2554, 2454, 2551, 2518, 2537, 2520, 2525, 2525, 2512, 2519, 2526, 717, 731, 714, 647, 650, 668, 719, 712, 726, 647, 440, 490, 503, 499, 507, 419, 2252, 2177, 2191, 2195, 2263, 1063, 1083, 1083, 1087, 1084, 1141, 1120, 1120, 1070, 1087, 1062, 1122, 1087, 1059, 1070, 1078, 1121, 1063, 1082, 1070, 1086, 1062, 1121, 1087, 1085, 1056, 1120, 1063, 1082, 1070, 1086, 1062, 1083, 1081, 1121, 1061, 1084, 1658, 1635, 3161, 3136, 3140, 3161, 3165, 3157, 3015, 3011, 3029, 3065, 3021, 3011, 3039, 1101, 1097, 1119, 1139, 1093, 1114, 1722, 1725, 1699, 2900, 2888, 2897, 2896, 2264, 2176, 2189, 2194, 2244, 2183, 2184, 2181, 2199, 2199, 2265, 2246, 2192, 2189, 2192, 2184, 2177, 2246, 2266, 2252, 2250, 2254, 2267, 2253, 2264, 2251, 2176, 2189, 2194, 2266, 2200, 2264, 2176, 2189, 2194, 2244, 2183, 2184, 2181, 2199, 2199, 2265, 2246, 2192, 2189, 2192, 2184, 2177, 2249, 2189, 2186, 2178, 2187, 2246, 2266, 2252, 2250, 2254, 2267, 2253, 2264, 2251, 2176, 2189, 2194, 2266, 1289, 1303, 1283, 3033, 3030, 3034, 3026, 2954, 3055, 3066, 3057, 3067, 3041, 2961, 621, 609, 618, 619, 1914, 1916, 1898, 1898, 1900, 1914, 1914, -29503, 25266, 26418, 22461, 2410, 2405, 2409, 2401, 2466, 2472, 2495, 2494, 2465, 2466, 2488, 2466, 1877, 1864, 1875, 1885, 1875, 1876, 2043, 2023, 2023, 2019, 2016, 1961, 1980, 1980, 2020, 2020, 2020, 1981, 2043, 2022, 2034, 2018, 2042, 1981, 2047, 2042, 2021, 2038, 991, 978, 982, 979, 978, 965, 2167, 2167, 2160, 2160, 1980, 2046, 2036, 2023, 2021, 2578, 2636, 2570, 2631, 678, 699, 767, 28465, 23498, 32004, 2107, 2088, 2091, 2089, 2107, -31256, -30857, -2281, 23766, 22159, 31405, 26650, 28698, 2081, 2107, 2415, 2377, 2399, 2376, 2327, 2427, 2397, 2399, 2388, 2382, 1813, 1847, 1826, 1841, 1844, 1844, 1849, 1911, 1901, 1910, 1896, 1912, 1904, 1807, 1841, 1846, 1852, 1847, 1839, 1835, 1912, 1814, 1804, 1912, 1897, 1896, 1910, 1896, 1891, 1912, 1807, 1841, 1846, 1902, 1900, 1891, 1912, 1824, 1902, 1900, 1905, 1912, 1817, 1832, 1832, 1844, 1853, 1807, 1853, 1850, 1811, 1841, 1836, 1911, 1901, 1899, 1903, 1910, 1899, 1902, 1912, 1904, 1811, 1808, 1804, 1813, 1812, 1908, 1912, 1844, 1841, 1843, 1853, 1912, 1823, 1853, 1851, 1843, 1847, 1905, 1912, 1819, 1840, 1834, 1847, 1845, 1853, 1911, 1897, 1897, 1903, 1910, 1896, 1910, 1896, 1910, 1896, 1912, 1803, 1849, 1854, 1849, 1834, 1841, 1911, 1901, 1899, 1903, 1910, 1899, 1889, 23700, 22221, 20845, 18360, 26678, -2237, 575, 572, 560, 562, 551, 570, 572, 573, 1997, 1992, 1992, 2047, 2009, 2012, 2012, 2014, 1993, 2015, 2015, 1993, 1992, 1545, 1601, 1555, 1617, 632, 629, 566, 616, 627, 634, 629, 636, 627, 634, 626, 3168, 3196, 3196, 3192, 21823, -28802, 27809, -2518, 2408, 2429, 28490, -30259, -32557, 28320, 27424, 23471, 618, 564, 548, 616, 1024, 1711, 1758, 1780, 1780, 1780, 1780, 1782, 1719, 1723, 1712, 1713, 1782, 1774, 1780, 1782, 1760, 1764, 1760, 1782, 1784, 1758, 1780, 1780, 1780, 1780, 1782, 1703, 1697, 1719, 1719, 1713, 1703, 1703, 1782, 1774, 1780, 1782, 1764, 1782, 1784, 1758, 1780, 1780, 1780, 1780, 1782, 1721, 1703, 1715, 1782, 1774, 1780, 1782, -28873, 24900, 24549, -29711, 1782, 1784, 1758, 1780, 1780, 1780, 1780, 1782, 1671, 1713, 1702, 1698, 1713, 1702, 1675, 1721, 1703, 1715, 1782, 1774, 1780, 1782, 2474, 2434, 2549, 2941, 2828, 2854, 2854, 2854, 2854, 2852, 2917, 2921, 2914, 2915, 2852, 2876, 2854, 2852, 2866, 2870, 2870, 2852, 2858, 2828, 2854, 2854, 2854, 2854, 2852, 2933, 2931, 2917, 2917, 2915, 2933, 2933, 2852, 2876, 2854, 2852, 2870, 2852, 2858, 2828, 2854, 2854, 2854, 2854, 2852, 2923, 2933, 2913, 2852, 2876, 2854, 2852, 2931, 2932, 2922, 17724, 29052, 2852, 2828, 2939};

    public static String a(String str, String str2) {
        return m7232(m7222(m7218(m7220(new OkHttpClient(), m7231(m7219(m7219(m7217(m7227(new Request.Builder(), str), m7229(m7235(C0065.m9775(m7221(), 0, 33, 530)), str2)), C0015.m3484(m7221(), 33, 10, 2566), C0003.m1398(m7221(), 43, 115, 1420)), C0055.m8814(m7221(), 158, 6, 2512), C0060.m9352(m7221(), 164, 22, 694)))))));
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x02a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String b(java.lang.String r65) {
        /*
            Method dump skipped, instructions count: 1549
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.a1.c.b(java.lang.String):java.lang.String");
    }

    /* renamed from: ۟ۡۡۢ, reason: not valid java name and contains not printable characters */
    public static Request.Builder m7217(Object obj, Object obj2) {
        if (C0050.m8121() < 0) {
            return ((Request.Builder) obj).post((RequestBody) obj2);
        }
        return null;
    }

    /* renamed from: ۣۣ۟۟۠, reason: not valid java name and contains not printable characters */
    public static Response m7218(Object obj) {
        if (C0060.m9355() > 0) {
            return ((Call) obj).execute();
        }
        return null;
    }

    /* renamed from: ۣ۟ۤۨۧ, reason: not valid java name and contains not printable characters */
    public static Request.Builder m7219(Object obj, Object obj2, Object obj3) {
        if (C0043.m7332() > 0) {
            return ((Request.Builder) obj).addHeader((String) obj2, (String) obj3);
        }
        return null;
    }

    /* renamed from: ۣ۟ۥۢ, reason: not valid java name and contains not printable characters */
    public static Call m7220(Object obj, Object obj2) {
        if (C0058.m9131() <= 0) {
            return ((OkHttpClient) obj).newCall((Request) obj2);
        }
        return null;
    }

    /* renamed from: ۟ۤ۟ۨۤ, reason: not valid java name and contains not printable characters */
    public static short[] m7221() {
        if (C0033.m5872() >= 0) {
            return f736short;
        }
        return null;
    }

    /* renamed from: ۟ۤۥۦ۟, reason: not valid java name and contains not printable characters */
    public static ResponseBody m7222(Object obj) {
        if (C0045.m7538() < 0) {
            return ((Response) obj).body();
        }
        return null;
    }

    /* renamed from: ۟ۤۧ۟ۤ, reason: not valid java name and contains not printable characters */
    public static Headers m7223(Object obj) {
        if (C0017.m3633() < 0) {
            return ((Response) obj).headers();
        }
        return null;
    }

    /* renamed from: ۟ۦۡۦۤ, reason: not valid java name and contains not printable characters */
    public static int m7224(Object obj) {
        if (C0019.m4065() <= 0) {
            return ((Response) obj).code();
        }
        return 0;
    }

    /* renamed from: ۟ۦۡۨۨ, reason: not valid java name and contains not printable characters */
    public static OkHttpClient.Builder m7225(Object obj, boolean z) {
        if (C0020.m4210() < 0) {
            return ((OkHttpClient.Builder) obj).followSslRedirects(z);
        }
        return null;
    }

    /* renamed from: ۟ۨۥۧ, reason: not valid java name and contains not printable characters */
    public static Request.Builder m7226(Object obj) {
        if (C0033.m5872() >= 0) {
            return ((Request.Builder) obj).get();
        }
        return null;
    }

    /* renamed from: ۣ۠ۢۤ, reason: not valid java name and contains not printable characters */
    public static Request.Builder m7227(Object obj, Object obj2) {
        if (C0025.m4797() > 0) {
            return ((Request.Builder) obj).url((String) obj2);
        }
        return null;
    }

    /* renamed from: ۠ۢۨۤ, reason: not valid java name and contains not printable characters */
    public static void m7228(Object obj) {
        if (C0018.m3956() >= 0) {
            ((Response) obj).close();
        }
    }

    /* renamed from: ۡۢۡ۠, reason: not valid java name and contains not printable characters */
    public static RequestBody m7229(Object obj, Object obj2) {
        if (C0037.m6350() < 0) {
            return RequestBody.create((MediaType) obj, (String) obj2);
        }
        return null;
    }

    /* renamed from: ۤۡۥۣ, reason: not valid java name and contains not printable characters */
    public static String m7230(Object obj, Object obj2) {
        if (C0058.m9131() < 0) {
            return ((Headers) obj).get((String) obj2);
        }
        return null;
    }

    /* renamed from: ۥۦۥۣ, reason: contains not printable characters */
    public static Request m7231(Object obj) {
        if (C0056.m8886() <= 0) {
            return ((Request.Builder) obj).build();
        }
        return null;
    }

    /* renamed from: ۧۢۤۡ, reason: not valid java name and contains not printable characters */
    public static String m7232(Object obj) {
        if (C0040.m6582() >= 0) {
            return ((ResponseBody) obj).string();
        }
        return null;
    }

    /* renamed from: ۧۨۢۡ, reason: not valid java name and contains not printable characters */
    public static OkHttpClient.Builder m7233(Object obj, boolean z) {
        if (C0000.m1116() < 0) {
            return ((OkHttpClient.Builder) obj).followRedirects(z);
        }
        return null;
    }

    /* renamed from: ۨۤۦ۟, reason: not valid java name and contains not printable characters */
    public static OkHttpClient m7234(Object obj) {
        if (C0049.m8038() <= 0) {
            return ((OkHttpClient.Builder) obj).build();
        }
        return null;
    }

    /* renamed from: ۨۥۤۢ, reason: not valid java name and contains not printable characters */
    public static MediaType m7235(Object obj) {
        if (C0061.m9359() < 0) {
            return MediaType.parse((String) obj);
        }
        return null;
    }
}