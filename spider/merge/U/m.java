package com.github.catvod.spider.merge.U;

import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.N.C0023;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.a0.C0006;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import com.github.catvod.spider.p000mergexbpq.x.C0015;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class m implements Callable {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f519short = {3010, 3019, 3002, 2508, 2521, 2523, 2449, 780, 2157, 2166, 785, 807, 822, 879, 769, 813, 813, 809, 811, 807, 1704, 1726, 1711, 1782, 1720, 1716, 1716, 1712, 1714, 1726, 1959, 1984, 2031, 1975, 2667, 3054, 3036, 3019, 3032, 3033, 2973, 3038, 3026, 3026, 3030, 3028, 3032, 2951, 2973, 600, 622, 628, 618, 628, 581, 608, 623, 620, 628, 583, 612, 629, 610, 617, 612, 627, 275, 289, 319, 287, 312, 294, 268, 303, 318, 297, 290, 303, 312, 3099, 3099, 3099, 2259, 2273, 2259, 2276, 2233, 2259, 2296, 2279, 2415, 1217, 1245, 1245, 1241, 1242, 1171, 1158, 1158, 1224, 1226, 1242, 1159, 1232, 1222, 1244, 1218, 1244, 1159, 1226, 1222, 1220, 1158, 1217, 1180, 1158, 1220, 1222, 1241, 1228, 1223, 1159, 1232, 1222, 1244, 1218, 1244, 1159, 1229, 1224, 1223, 1220, 1244, 1159, 1221, 1216, 1242, 1245, 1158, 1176, 1159, 1177, 1158, 1174, 2016, 1959, 1974, 1967, 2043, 1963, 1961, 1974, 1955, 1960, 2024, 1983, 1961, 1971, 1965, 1971, 2024, 1954, 1959, 1960, 1963, 1971, 2024, 1962, 1967, 1973, 1970, 2016, 1968, 2043, 2039, 2024, 2038, 2016, 1970, 1983, 1974, 1955, 2043, 1961, 1972, 1967, 1953, 1967, 1960, 1959, 1962, 1964, 1973, 1961, 1960, 2016, 1954, 1959, 1970, 1959, 1938, 1983, 1974, 1955, 2043, 1964, 1973, 1961, 1960, 1974, 2016, 1970, 1967, 1963, 1955, 1961, 1971, 1970, 2043, 2039, 2038, 2038, 2038, 2038, 2016, 1964, 1973, 1961, 1960, 1974, 1935, 1960, 1957, 1942, 1972, 1955, 1952, 1967, 1982, 2043, 1971, 1970, 1967, 1962, 1967, 1970, 1983, 2299, 2274, 2279, 2220, 2211, 2239, 2212, 2239, 2215, 2231, 2288, 2273, 2273, 2266, 2292, 2280, 2220, 2211, 2213, 2215, 2214, 2216, 2214, 2217, 2217, 2231, 2277, 2220, 2470, 2482, 2484, 2486, 2487, 2489, 2487, 2488, 2488, 2470, 986, 973, 976, 980, 988, 975, 984, 981, 988, 969, 1180, 1161, 1178, 1165, 2253, 2186, 2197, 2187, 748, 766, 738, 751, 811, 806, 809, 1366, 1370, 1359, 785, 799, 787, 777, 786, 776, 1413, 1436, 1425, 915, 918, 901, 914, 2686, 2659, 2684, 2659, 2685, 2522, 2519, 2526, 2507, 2872, 2855, 2858, 2373, 2372, 2390, 2365, 2344, 2043, 2013, 2011, 2037, 1935, 2021, 2009, 2047, 1985, 1920, 1998, 2037, 2013, 2021, 2045, 2046, 2014, 2044, 1921, 2004, 1923, 2034, 1924, 1988, 1923, 1927, 2013, 2036, 2015, 2020, 2035, 1988, 402, 396, 408, 3276, 3286, 3288, 3281, 707, 2836, 2514, 2439, 2461, 2451, 2458, 2505, 3061, 3027, 3013, 3026, 2957, 3041, 3015, 3013, 3022, 3028, 765, 735, 714, 729, 732, 732, 721, 671, 645, 670, 640, 656, 664, 743, 729, 734, 724, 735, 711, 707, 656, 766, 740, 656, 641, 640, 670, 640, 651, 656, 743, 729, 734, 646, 644, 651, 656, 712, 646, 644, 665, 656, 753, 704, 704, 732, 725, 743, 725, 722, 763, 729, 708, 671, 645, 643, 647, 670, 643, 646, 656, 664, 763, 760, 740, 765, 764, 668, 656, 732, 729, 731, 725, 656, 759, 725, 723, 731, 735, 665, 656, 755, 728, 706, 735, 733, 725, 671, 641, 642, 643, 670, 640, 670, 640, 670, 640, 656, 739, 721, 726, 721, 706, 729, 671, 645, 643, 647, 670, 643, 646, 2298, 2253, 2254, 2253, 2266, 2253, 2266, 1880, 1860, 1860, 1856, 1859, 1802, 1823, 1823, 1862, 1822, 1865, 1887, 1861, 1883, 1861, 1822, 1875, 1887, 1885, 568, 532, 533, 527, 542, 533, 527, 598, 559, 514, 523, 542, 2016, 2033, 2033, 2029, 2024, 2018, 2016, 2037, 2024, 2030, 2031, 1966, 2041, 1964, 2038, 2038, 2038, 1964, 2023, 2030, 2035, 2028, 1964, 2036, 2035, 2029, 2020, 2031, 2018, 2030, 2021, 2020, 2021, 1886, 1906, 1906, 1910, 1908, 1912, 2576, 2581, 2560, 2581, -29811, 23532, 22275, 22127, 20747, -31457, 2048, 2074, 2490, 2444, 2454, 2440, 2454, 2471, 2434, 2445, 2446, 2454, 2469, 2438, 2455, 2432, 2443, 2438, 2449, 28562, 22594, 23143, 24929, 25260, -1895, 18872, 25144, 18798, 21812, 1967, 1973, 25429, 21637, 22176, 28070, 28267, -2978, 22660, 26330, 17833, 23027, 2920, 2930};
    public final String a;
    public final AtomicReference b;
    public final String c;
    public final Map d;

    public m(String str, AtomicReference atomicReference, String str2, HashMap map) {
        this.a = str;
        this.b = atomicReference;
        this.c = str2;
        this.d = map;
    }

    public static String b(String str) {
        try {
            byte[] bArrM6159 = C0035.m6159(C0015.m3410(C0022.m4403(m5471(), 0, 3, 2959)), C0050.m8115(str));
            StringBuilder sb = new StringBuilder();
            for (byte b : bArrM6159) {
                C0018.m3933(sb, C0002.m1327(C0058.m9106(m5471(), 3, 4, 2537), new Object[]{C0022.m4445(b)}));
            }
            return C0047.m7763(sb);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: ۟ۦۢۧۢ, reason: not valid java name and contains not printable characters */
    public static short[] m5471() {
        if (C0028.m5152() < 0) {
            return f519short;
        }
        return null;
    }

    public final String a() {
        StringBuilder sb = new StringBuilder();
        Iterator itM5199 = C0029.m5199(C0058.m9142(C0002.m1278(this)));
        while (C0012.m2962(itM5199)) {
            Map.Entry entry = (Map.Entry) C0048.m7949(itM5199);
            C0018.m3933(sb, (String) C0045.m7624(entry));
            C0018.m3933(sb, C0035.m6131(m5471(), 7, 1, 817));
            C0018.m3933(sb, (String) C0039.m6540(entry));
            C0018.m3933(sb, C0039.m6551(m5471(), 8, 2, 2134));
        }
        return C0047.m7763(sb);
    }

    public final void c(Map map) {
        Object arrayList = (List) C0062.m9431(map, C0023.m4536(m5471(), 10, 10, 834));
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        List list = (List) C0062.m9431(map, C0031.m5565(m5471(), 20, 10, 1755));
        if (list != null) {
            C0045.m7603(arrayList, list);
        }
        Iterator itM3109 = C0013.m3109(arrayList);
        while (C0012.m2962(itM3109)) {
            String[] strArrM4752 = C0024.m4752((String) C0048.m7949(itM3109), C0041.m6779(m5471(), 30, 4, 1948));
            if (strArrM4752.length > 0) {
                String str = strArrM4752[0];
                String strM1189 = C0001.m1189(m5471(), 34, 1, 2646);
                String[] strArrM1240 = C0002.m1240(str, strM1189, 2);
                if (strArrM1240.length == 2) {
                    String strM9640 = C0064.m9640(strArrM1240[0]);
                    String strM96402 = C0064.m9640(strArrM1240[1]);
                    C0006.m1755(C0002.m1278(this), strM9640, strM96402);
                    StringBuilder sb = new StringBuilder(C0020.m4199(m5471(), 35, 14, 3005));
                    C0018.m3933(sb, strM9640);
                    C0018.m3933(sb, strM1189);
                    C0018.m3933(sb, strM96402);
                    C0047.m7763(sb);
                    C0019.m4107(m5471(), 49, 17, 513);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0426  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0443  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x002f  */
    @Override // java.util.concurrent.Callable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object call() {
        /*
            Method dump skipped, instructions count: 1126
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.U.m.call():java.lang.Object");
    }
}