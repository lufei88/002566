package com.github.catvod.spider.merge.U;

import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.J0.C0021;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.N.C0023;
import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.Z.C0040;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.f0.C0052;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.g0.AbstractC0308c;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.r0.C0059;
import com.github.catvod.spider.merge.r0.C0060;
import com.github.catvod.spider.merge.t.C0061;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.merge.z.C0065;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
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
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import okhttp3.Call;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f520short = {1954, 1957, 737, 723, 717, 749, 714, 724, 766, 733, 716, 731, 720, 733, 714, 27755, 23483, 22942, 22452, 25240, -1184, 21552, 28430, 24922, -27990, 31423, 25584, 401, 419, 445, 413, 442, 420, 398, 429, 444, 427, 416, 429, 442, 20365, 21463, 25361, -30406, 20620, -27537, 332, 342, 2706, 2720, 2750, 2718, 2745, 2727, 2701, 2734, 2751, 2728, 2723, 2734, 2745, 19125, 22255, 22972, -29467, 22424, 27078, 1140, 1134, 1058, 1040, 1038, 1070, 1033, 1047, 1085, 1054, 1039, 1048, 1043, 1054, 1033, 17097, 24211, -32329, 27076, 3080, 3090, 2205, 21635, 30649, 25107, 23356, 18289, 25168, 18314, 23504, -2435, 24950, 22182, 2379, 2385, 996, 982, 968, 1000, 975, 977, 1019, 984, 969, 990, 981, 984, 975, 1894, 1832, 1849, 1824, 1894, 1828, 1832, 1824, 1831, 1894, 1824, 1831, 1824, 1853, 1910, 1853, 1824, 1828, 1836, 1908, 1853, 1824, 1828, 1836, 1903, 1853, 1830, 1826, 1836, 1831, 1908, 2303, 2232, 2217, 2217, 2182, 2224, 2237, 2276, 3156, 3091, 3074, 3097, 3117, 3103, 3091, 3072, 3097, 3151, 3102, 3076, 3094, 3101, 3079, 3167, 3088, 3101, 3082, 3167, 3079, 3099, 3167, 3140, 3156, 3076, 3095, 3072, 3073, 3099, 3101, 3100, 3151, 3139, 3164, 3139, 3164, 3136, 2988, 2985, 3004, 2985, 2173, 2156, 2175, 2174, 2152, 2174, 2126, 2146, 2147, 2155, 2148, 2154, 2189, 2176, 2185, 2204, 1426, 1810, 1813, 1803, 2115, 2143, 2143, 2139, 804, 827, 802, 828, 819, 831, 823, 808, 826, 827, 808, 807, 828, 1661, 1638, 1634, 1644, 1639, 947, 927, 926, 900, 917, 926, 900, 989, 932, 905, 896, 917, 780, 776, 779, 791, 791, 787, 846, 780, 776, 772, 780, 844, 777, 774, 770, 784, 780, 781, 783, 793, 794, 2524, 2554, 2540, 2555, 2468, 2504, 2542, 2540, 2535, 2557, 1324, 1341, 1327, 1327, 1323, 1331, 1326, 1336, 1377, 1599, 1582, 1582, 1586, 1591, 1597, 1599, 1578, 1591, 1585, 1584, 1649, 1574, 1651, 1577, 1577, 1577, 1651, 1592, 1585, 1580, 1587, 1651, 1579, 1580, 1586, 1595, 1584, 1597, 1585, 1594, 1595, 1594, 1532, 1455, 1449, 1471, 1448, 1460, 1467, 1463, 1471, 1511, 935, 1010, 1000, 998, 1007, 956, 935, 992, 1009, 1002, 990, 1004, 992, 1011, 1002, 956, 1005, 1015, 997, 1006, 1012, 940, 995, 1006, 1017, 940, 1012, 1000, 940, 951, 935, 992, 1009, 1009, 990, 1000, 997, 956, 1701, 1774, 1762, 1777, 1768, 1726, 1716, 1766, 1714, 1767, 1716, 1716, 1712, 1714, 1723, 1719, 1766, 1766, 1717, 1760, 1765, 1712, 1368, 1302, 1287, 1310, 1368, 1282, 1284, 1298, 1285, 1284, 1368, 1285, 1298, 1296, 1310, 1284, 1283, 1298, 1285, 2323, 2367, 2366, 2366, 2357, 2355, 2340, 2361, 2367, 2366, 2296, 2262, 2262, 2243, 2206, 2290, 2271, 2266, 2245, 2262, 881, 851, 851, 853, 832, 836, 797, 892, 849, 862, 855, 837, 849, 855, 853, 983, 965, 896, 1006, 995, 897, 983, 965, 918, 988, 912, 925, 899, 917, 1083, 1148, 1150, 1150, 1138, 1128, 1139, 1129, 1056, 1411, 1494, 1484, 1474, 1483, 1432, 1427, 1479, 1436, 1437, 1431, 1472, 1430, 1436, 1431, 1426, 1427, 1476, 1476, 1426, 1476, 1428, 1473, 1472, 1472, 1437, 1436, 1424, 1425, 1427, 1425, 1479, 1478, 1476, 1429, 1429, 1431, 1425, 1431, 1427, 1473, 1424, 1425, 1425, 1425, 1472, 1479, 1426, 1478, 1479, 1430, 1472, 1429, 1475, 1430, 1472, 1476, 1436, 1436, 1426, 1425, 1475, 1428, 1430, 1437, 1428, 1430, 1475, 1428, 1476, 1411, 1476, 1493, 1486, 1530, 1480, 1476, 1495, 1486, 1432, 1481, 1491, 1473, 1482, 1488, 1416, 1479, 1482, 1501, 1416, 1488, 1484, 1416, 1436, 1411, 1476, 1493, 1493, 1530, 1484, 1473, 1432, 1428, 1429, 1429, 1429, 1429, 1411, 1480, 1476, 1495, 1486, 1432, 1476, 1476, 1476, 1428, 1426, 1476, 1478, 1429, 1473, 1476, 1427, 1472, 1424, 1472, 1475, 1426, 667, 725, 708, 733, 667, 705, 711, 721, 710, 711, 667, 728, 731, 723, 733, 730, 2494, 2491, 2478, 2491, 2735, 2729, 2751, 2728, 2739, 2740, 2748, 2741, 2722, 2749, 2724, 2737, 2746, 2736, 2720, 2749, 2745, 2737, 474, 459, 459, 471, 466, 472, 474, 463, 466, 468, 469, 404, 465, 456, 468, 469, 2516, 2469, 2447, 2447, 2445, 2510, 2508, 2523, 2502, 2496, 2497, 2445, 2453, 2447, 2445, 2496, 2527, 2523, 2502, 2496, 2497, 2445, 2435, 2469, 2447, 2447, 2445, 2496, 2527, 2523, 2502, 2496, 2497, 2544, 2502, 2507, 2445, 2453, 2447, 1463, 1425, 1467, 1467, 1465, 1524, 1515, 1534, 1525, 1522, 1535, 1465, 1441, 1467, 1465, 1465, 1463, 1425, 1467, 1467, 1465, 1535, 1534, 1517, 1522, 1528, 1534, 1476, 1522, 1535, 1465, 1441, 1467, 1465, 1480, 1530, 1526, 1512, 1518, 1525, 1532, 1476, 1480, 1494, 1462, 1484, 1442, 1451, 1449, 1454, 1476, 1498, 1525, 1535, 1513, 1524, 1522, 1535, 1467, 1450, 1455, 1476, 1530, 1525, 1535, 1513, 1524, 1522, 1535, 1465, 1425, 1510, 706, 734, 734, 730, 729, 656, 645, 645, 716, 705, 644, 731, 731, 708, 712, 644, 734, 709, 730, 645, 715, 730, 707, 645, 732, 667, 645, 713, 709, 718, 719, 729, 644, 730, 706, 730, 2857, 2827, 2846, 2829, 2824, 2824, 2821, 2891, 2897, 2890, 2900, 2884, 2892, 2856, 2829, 2826, 2833, 2844, 2911, 2884, 2853, 2826, 2816, 2838, 2827, 2829, 2816, 2884, 2901, 2896, 2911, 2884, 2871, 2857, 2889, 2867, 2909, 2900, 2902, 2897, 2884, 2854, 2833, 2829, 2824, 2816, 2891, 2865, 2863, 2869, 2901, 2890, 2902, 2903, 2900, 2908, 2900, 2896, 2890, 2900, 2900, 2901, 2911, 2884, 2835, 2834, 2893, 2884, 2853, 2836, 2836, 2824, 2817, 2867, 2817, 2822, 2863, 2829, 2832, 2891, 2897, 2903, 2899, 2890, 2903, 2898, 2884, 2892, 2863, 2860, 2864, 2857, 2856, 2888, 2884, 2824, 2829, 2831, 2817, 2884, 2851, 2817, 2823, 2831, 2827, 2893, 2884, 2866, 2817, 2838, 2839, 2829, 2827, 2826, 2891, 2896, 2890, 2900, 2884, 2855, 2828, 2838, 2827, 2825, 2817, 2891, 2901, 2903, 2908, 2890, 2900, 2890, 2899, 2902, 2900, 2896, 2890, 2901, 2908, 2900, 2884, 2857, 2827, 2822, 2829, 2824, 2817, 2884, 2871, 2821, 2818, 2821, 2838, 2829, 2891, 2897, 2903, 2899, 2890, 2903, 2898, 2884, 2876, 2867, 2849, 2854, 2891, 2901, 2903, 2908, 2900, 2901, 2897, 2909, 2884, 2857, 2857, 2867, 2849, 2854, 2871, 2848, 2863, 2891, 2902, 2900, 2902, 2897, 2900, 2902, 2900, 2901, 2884, 2857, 2857, 2867, 2849, 2854, 2861, 2848, 
    2891, 2909, 2902, 2901, 2900, 2884, 2857, 2829, 2823, 2838, 2827, 2857, 2817, 2839, 2839, 2817, 2826, 2819, 2817, 2838, 2891, 2908, 2890, 2900, 2890, 2898, 2900, 2890, 2902, 2908, 2898, 2900, 2892, 2900, 2844, 2902, 2908, 2900, 2900, 2903, 2855, 2897, 2897, 2893, 2884, 2867, 2817, 2855, 2828, 2821, 2832, 2891, 2821, 2838, 2825, 2898, 2896, 2884, 2867, 2817, 2829, 2844, 2829, 2826, 2884, 2858, 2817, 2832, 2864, 2845, 2836, 2817, 2891, 2867, 2861, 2850, 2861, 2884, 2856, 2821, 2826, 2819, 2833, 2821, 2819, 2817, 2891, 2846, 2828, 2875, 2855, 2858, 2884, 2853, 2854, 2861, 2891, 2821, 2838, 2825, 2898, 2896, 2884, 2857, 2829, 2826, 2829, 2868, 2838, 2827, 2819, 2838, 2821, 2825, 2849, 2826, 2834, 2891, 2821, 2826, 2816, 2838, 2827, 2829, 2816, 1180, 1200, 1200, 1204, 1206, 1210, 2954, 2962, 2954, 2953, 2975, 2953, 2953, 2963, 2974, 3047, 3043, 2992, 3048, 2986, 2999, 3005, 2998, 3042, 2984, 3054, 3005, 3005, 2990, 2988, 3007, 3007, 2992, 3050, 3049, 3049, 2994, 3000, 3043, 3003, 3001, 2999, 2287, 2281, 2303, 2303, 2297, 2287, 2287, 2619, 2615, 2620, 2621, 3050, 3048, 3067, 3053, 2996, 2634, 2646, 2646, 2642, 2584, 2573, 2573, 2648, 2648, 2572, 2643, 2643, 2643, 2646, 2644, 2572, 2646, 2637, 2642, 2573, 2627, 2642, 2635, 2573, 2657, 2627, 2640, 2630, 2573, 2635, 2636, 2630, 2631, 2650, 638, 569, 552, 552, 561, 572, 613, 617, 616, 616, 616, 616, 638, 569, 552, 563, 519, 565, 569, 554, 563, 613, 564, 558, 572, 567, 557, 629, 570, 567, 544, 629, 557, 561, 629, 609, 2689, 2727, 2737, 2726, 2809, 2709, 2739, 2737, 2746, 2720, 3153, 3157, 3158, 3146, 3146, 3150, 3089, 3082, 3088, 3087, 3084, 3088, 3086, 632, 611, 615, 617, 610, 277, 274, 268, 883, 879, 879, 875, 801, 820, 820, 810, 814, 815, 821, 809, 810, 802, 821, 810, 810, 808, 821, 810, 808, 801, 810, 809, 810, 809, 810, 820, 878, 882, 802, 821, 875, 883, 875, 804, 883, 889, 879, 815, 806, 1885, 1806, 1801, 1815, 1862, 30666, 21254, 17016, 24098, 22287, 28307, 26997, -31704, 17070, 26926};
    public String a;
    public ArrayList b;
    public Object c;
    public Object d;
    public Serializable e;
    public Serializable f;

    public n(int i) {
        switch (i) {
            case 1:
                String strM1840 = C0007.m1840();
                this.a = strM1840;
                this.c = strM1840;
                this.d = strM1840;
                this.e = strM1840;
                this.f = C0008.m1970(m5483(), 0, 2, 1936);
                this.b = new ArrayList();
                break;
            default:
                this.f = new AtomicReference();
                break;
        }
    }

    public static void a(n nVar, ArrayList arrayList) {
        StringBuilder sb;
        C0047.m7777(nVar);
        Iterator itM7816 = C0047.m7816(arrayList);
        while (C0012.m2962(itM7816)) {
            Future future = (Future) C0048.m7949(itM7816);
            try {
            } catch (CancellationException e) {
                e = e;
                C0022.m4403(m5483(), 48, 13, 2763);
                sb = new StringBuilder(C0008.m1970(m5483(), 61, 8, 1102));
                C0018.m3933(sb, C0036.m6261(e));
                C0047.m7763(sb);
            } catch (ExecutionException e2) {
                e = e2;
                C0020.m4199(m5483(), 27, 13, 456);
                sb = new StringBuilder(C0035.m6131(m5483(), 40, 8, 374));
                C0018.m3933(sb, C0036.m6261(e));
                C0047.m7763(sb);
            } catch (TimeoutException e3) {
                C0026.m4951(m5483(), 69, 13, 1147);
                StringBuilder sb2 = new StringBuilder(C0009.m2037(m5483(), 82, 6, 3122));
                C0018.m3933(sb2, C0036.m6261(e3));
                C0047.m7763(sb2);
                C0064.m9685(future, true);
            }
            if (!C0007.m1815((String) C0051.m8180((AtomicReference) C0002.m1343(nVar)), C0065.m9764(nVar))) {
                C0056.m8911(m5483(), 2, 13, 696);
                C0049.m8007(m5483(), 15, 12, 1132);
                return;
            }
            String str = (String) C0059.m9267(future, 20L, C0050.m8151());
            if (str != null) {
                synchronized (C0031.m5663(nVar)) {
                    C0004.m1532(C0031.m5663(nVar), str);
                }
            } else {
                continue;
            }
        }
    }

    public static String b(String str) {
        String strM4800 = C0025.m4800(str, C0062.m9389(m5483(), 88, 1, 2239), C0007.m1840());
        if (C0004.m1584(strM4800) <= 16) {
            return strM4800;
        }
        String strM8636 = C0054.m8636(strM4800, 0, 16);
        return C0038.m6411(C0056.m8890(strM4800, 16), strM8636, strM8636);
    }

    /* renamed from: ۟۟ۧۧۨ, reason: not valid java name and contains not printable characters */
    public static RequestBody m5472(Object obj, Object obj2) {
        if (C0035.m6140() <= 0) {
            return RequestBody.create((MediaType) obj, (String) obj2);
        }
        return null;
    }

    /* renamed from: ۟ۡۨۢۢ, reason: not valid java name and contains not printable characters */
    public static Request.Builder m5473(Object obj, Object obj2) {
        if (C0031.m5628() >= 0) {
            return ((Request.Builder) obj).url((String) obj2);
        }
        return null;
    }

    /* renamed from: ۟ۢۡۥ, reason: not valid java name and contains not printable characters */
    public static Response m5474(Object obj) {
        if (C0061.m9359() <= 0) {
            return ((Call) obj).execute();
        }
        return null;
    }

    /* renamed from: ۣ۟ۢۨۨ, reason: not valid java name and contains not printable characters */
    public static Request.Builder m5475(Object obj, Object obj2, Object obj3) {
        if (C0060.m9355() > 0) {
            return ((Request.Builder) obj).addHeader((String) obj2, (String) obj3);
        }
        return null;
    }

    /* renamed from: ۟ۤۡۡ, reason: not valid java name and contains not printable characters */
    public static Request.Builder m5476(Object obj) {
        if (C0041.m6823() < 0) {
            return ((Request.Builder) obj).get();
        }
        return null;
    }

    /* renamed from: ۟ۤۨۥۧ, reason: not valid java name and contains not printable characters */
    public static JsonObject m5477(Object obj) {
        if (C0025.m4797() >= 0) {
            return ((JsonElement) obj).getAsJsonObject();
        }
        return null;
    }

    /* renamed from: ۟ۥۤۨۡ, reason: not valid java name and contains not printable characters */
    public static Request m5478(Object obj) {
        if (C0021.m4379() > 0) {
            return ((Request.Builder) obj).build();
        }
        return null;
    }

    /* renamed from: ۟ۥۧۨ۟, reason: not valid java name and contains not printable characters */
    public static String m5479(Object obj, Object obj2, Object obj3) {
        if (C0054.m8557() < 0) {
            return AbstractC0308c.f((JsonObject) obj, (String) obj2, (String) obj3);
        }
        return null;
    }

    /* renamed from: ۟ۦۥۨۨ, reason: not valid java name and contains not printable characters */
    public static int m5480(int i, Object obj, Object obj2) {
        if (C0061.m9359() < 0) {
            return AbstractC0308c.b(i, (JsonObject) obj, (String) obj2);
        }
        return 0;
    }

    /* renamed from: ۟ۧۢۦ۠, reason: not valid java name and contains not printable characters */
    public static JsonObject m5481(Object obj, Object obj2) {
        if (C0032.m5686() < 0) {
            return AbstractC0308c.d((JsonObject) obj, (String) obj2);
        }
        return null;
    }

    /* renamed from: ۣ۟ۧۢ۠, reason: not valid java name and contains not printable characters */
    public static Request.Builder m5482(Object obj, Object obj2) {
        if (C0057.m9017() >= 0) {
            return ((Request.Builder) obj).post((RequestBody) obj2);
        }
        return null;
    }

    /* renamed from: ۠۠ۦ۠, reason: not valid java name and contains not printable characters */
    public static short[] m5483() {
        if (C0012.m3024() > 0) {
            return f520short;
        }
        return null;
    }

    /* renamed from: ۣۡۡۤ, reason: not valid java name and contains not printable characters */
    public static JsonObject m5484(Object obj) {
        if (C0043.m7332() >= 0) {
            return AbstractC0308c.i((String) obj);
        }
        return null;
    }

    /* renamed from: ۢۧۤۧ, reason: not valid java name and contains not printable characters */
    public static Call m5485(Object obj, Object obj2) {
        if (C0054.m8557() <= 0) {
            return ((OkHttpClient) obj).newCall((Request) obj2);
        }
        return null;
    }

    /* renamed from: ۤۡ۟ۦ, reason: not valid java name and contains not printable characters */
    public static Iterator m5486(Object obj) {
        if (C0061.m9359() < 0) {
            return ((JsonArray) obj).iterator();
        }
        return null;
    }

    /* renamed from: ۣۤۡ, reason: not valid java name and contains not printable characters */
    public static String m5487(Object obj) {
        if (C0008.m1975() >= 0) {
            return ((ResponseBody) obj).string();
        }
        return null;
    }

    /* renamed from: ۥ۠۟۟, reason: contains not printable characters */
    public static Request m5488(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        if (C0020.m4210() < 0) {
            return com.github.catvod.spider.merge.B0.a.v((Request.Builder) obj, (String) obj2, (String) obj3, (String) obj4, (String) obj5);
        }
        return null;
    }

    /* renamed from: ۥۧۨۤ, reason: contains not printable characters */
    public static MediaType m5489(Object obj) {
        if (C0064.m9659() < 0) {
            return MediaType.parse((String) obj);
        }
        return null;
    }

    /* renamed from: ۦۤۨۨ, reason: contains not printable characters */
    public static ResponseBody m5490(Object obj) {
        if (C0059.m9257() <= 0) {
            return ((Response) obj).body();
        }
        return null;
    }

    /* renamed from: ۨۦۢۤ, reason: not valid java name and contains not printable characters */
    public static JsonArray m5491(Object obj, Object obj2) {
        if (C0062.m9429() >= 0) {
            return AbstractC0308c.c((JsonObject) obj, (String) obj2);
        }
        return null;
    }

    public ArrayList c(ArrayList arrayList, String str, HashMap map) {
        AtomicBoolean atomicBoolean;
        if (str != null && C0007.m1815(str, C0065.m9764(this))) {
            ExecutorService executorService = (ExecutorService) C0063.m9563(this);
            return (executorService == null || C0001.m1208(executorService) || (atomicBoolean = (AtomicBoolean) C0015.m3511(this)) == null || C0016.m3610(atomicBoolean)) ? C0031.m5663(this) != null ? new ArrayList(C0031.m5663(this)) : new ArrayList() : C0045.m7559(this);
        }
        ExecutorService executorService2 = (ExecutorService) C0063.m9563(this);
        if (executorService2 != null && !C0001.m1208(executorService2)) {
            C0009.m2093((ExecutorService) C0063.m9563(this));
            StringBuilder sb = new StringBuilder(C0009.m2037(m5483(), 89, 13, 2417));
            C0018.m3933(sb, C0065.m9764(this));
            C0047.m7763(sb);
            C0037.m6307(m5483(), 102, 13, 957);
        }
        ExecutorService executorService3 = (ExecutorService) C0012.m3031(this);
        if (executorService3 != null && !C0001.m1208(executorService3)) {
            C0009.m2093((ExecutorService) C0012.m3031(this));
        }
        AtomicReference atomicReference = (AtomicReference) C0002.m1343(this);
        C0015.m3486(atomicReference, str);
        this.a = str;
        this.e = new AtomicBoolean(false);
        this.b = new ArrayList();
        this.c = C0021.m4370(15);
        ArrayList arrayList2 = new ArrayList();
        Iterator itM7816 = C0047.m7816(arrayList);
        while (C0012.m2962(itM7816)) {
            C0004.m1532(arrayList2, C0049.m8042((ExecutorService) C0063.m9563(this), new m((String) C0048.m7949(itM7816), atomicReference, str, map)));
        }
        ExecutorService executorServiceM5003 = C0027.m5003();
        this.d = executorServiceM5003;
        C0065.m9706(executorServiceM5003, new g(this, arrayList2, 1));
        return C0045.m7559(this);
    }

    public void d() {
        StringBuilder sb = new StringBuilder();
        C0018.m3933(sb, C0065.m9764(this));
        C0018.m3933(sb, C0052.m8337(m5483(), 115, 31, 1865));
        C0018.m3933(sb, (String) C0063.m9563(this));
        C0018.m3933(sb, C0011.m2805(m5483(), 146, 8, 2265));
        C0018.m3933(sb, (String) C0012.m3031(this));
        C0018.m3933(sb, C0021.m4340(m5483(), 154, 38, 3186));
        Iterator itM5486 = m5486(m5491(m5481(m5484(C0017.m3663(C0032.m5769(C0047.m7763(sb), null))), C0031.m5565(m5483(), 192, 4, 3016)), C0052.m8337(m5483(), 196, 12, 2061)));
        while (C0012.m2962(itM5486)) {
            JsonObject jsonObjectM5477 = m5477((JsonElement) C0048.m7949(itM5486));
            String strM8131 = C0050.m8131(m5483(), 208, 4, 2297);
            String strM1840 = C0007.m1840();
            String strM5479 = m5479(jsonObjectM5477, strM8131, strM1840);
            String strM7151 = C0042.m7151(m5483(), 212, 1, 1443);
            if (strM5479 == strM7151 || (strM5479 != null && C0058.m9103(strM5479, strM7151))) {
                String strM81312 = C0050.m8131(m5483(), 213, 3, 1895);
                if (C0058.m9127(m5479(jsonObjectM5477, strM81312, strM1840), C0008.m1970(m5483(), 216, 4, 2091))) {
                    C0004.m1532(C0031.m5663(this), m5479(jsonObjectM5477, strM81312, strM1840));
                }
            }
        }
    }

    public void e() {
        String strM5565 = C0031.m5565(m5483(), 220, 13, 850);
        String strM7609 = C0045.m7609(strM5565);
        this.e = strM7609;
        boolean zM8953 = C0057.m8953(strM7609);
        String strM1840 = C0007.m1840();
        String strM4340 = C0021.m4340(m5483(), 233, 5, 1545);
        String strM4536 = C0023.m4536(m5483(), 238, 12, 1008);
        String strM1549 = C0004.m1549(m5483(), 250, 21, 867);
        String strM4199 = C0020.m4199(m5483(), 271, 10, 2441);
        String strM41992 = C0020.m4199(m5483(), 281, 9, 1372);
        String strM2300 = C0010.m2300(m5483(), 290, 33, 1630);
        if (zM8953) {
            String strM2352 = C0010.m2352(11);
            OkHttpClient okHttpClient = new OkHttpClient();
            MediaType mediaTypeM5489 = m5489(strM2300);
            StringBuilder sbM8368 = C0052.m8368(strM41992, strM2352, C0043.m7290(m5483(), 323, 10, 1498), strM2352, C0050.m8131(m5483(), 333, 38, 897));
            C0018.m3933(sbM8368, (String) C0012.m3031(this));
            C0018.m3933(sbM8368, C0052.m8337(m5483(), 371, 22, 1667));
            RequestBody requestBodyM5472 = m5472(mediaTypeM5489, C0047.m7763(sbM8368));
            Request.Builder builder = new Request.Builder();
            StringBuilder sb = new StringBuilder();
            C0018.m3933(sb, C0065.m9764(this));
            C0018.m3933(sb, C0031.m5565(m5483(), 393, 19, 1399));
            m5487(m5490(m5474(m5485(okHttpClient, m5488(m5475(m5475(m5475(m5482(m5473(builder, C0047.m7763(sb)), requestBodyM5472), strM4199, strM1549), C0014.m3332(m5483(), 412, 10, 2384), C0013.m3106(m5483(), 422, 10, 2227)), strM4536, strM2300), C0025.m4795(m5483(), 432, 15, 816), C0013.m3106(m5483(), 447, 14, 941), strM4340, strM1840)))));
            this.e = strM2352;
            C0042.m7162(strM2352, strM5565);
        }
        String str = (String) C0015.m3511(this);
        OkHttpClient okHttpClient2 = new OkHttpClient();
        MediaType mediaTypeM54892 = m5489(strM2300);
        String strM8814 = C0055.m8814(m5483(), 461, 9, 1053);
        String strM5062 = C0027.m5062(m5483(), 470, 129, 1445);
        RequestBody requestBodyM54722 = m5472(mediaTypeM54892, C0058.m9145(strM41992, str, strM8814, str, strM5062));
        Request.Builder builder2 = new Request.Builder();
        StringBuilder sb2 = new StringBuilder();
        C0018.m3933(sb2, C0065.m9764(this));
        C0018.m3933(sb2, C0009.m2037(m5483(), 599, 16, 692));
        JsonObject jsonObjectM5484 = m5484(C0017.m3663(m5487(m5490(m5474(m5485(okHttpClient2, m5488(m5482(m5473(builder2, C0047.m7763(sb2)), requestBodyM54722), strM4199, strM1549, strM4536, strM2300)))))));
        String strM9775 = C0065.m9775(m5483(), 615, 4, 2522);
        JsonObject jsonObjectM5481 = m5481(jsonObjectM5484, strM9775);
        String strM41993 = C0020.m4199(m5483(), 619, 8, 2778);
        int iM5480 = m5480(0, m5481(jsonObjectM5481, strM41993), C0062.m9389(m5483(), 627, 10, 2772));
        this.c = m5479(m5481(m5481(jsonObjectM5484, strM9775), strM41993), strM4340, strM1840);
        if (iM5480 < ((int) (C0009.m2099() / 1000))) {
            OkHttpClient okHttpClient3 = new OkHttpClient();
            String strM1077 = C0000.m1077(m5483(), 637, 16, 443);
            MediaType mediaTypeM54893 = m5489(strM1077);
            StringBuilder sb3 = new StringBuilder(C0018.m3917(m5483(), 653, 39, 2479));
            C0018.m3933(sb3, (String) C0002.m1343(this));
            C0018.m3933(sb3, C0043.m7290(m5483(), 692, 72, 1435));
            String strM5487 = m5487(m5490(m5474(m5485(okHttpClient3, m5488(m5475(m5482(m5473(new Request.Builder(), C0033.m5852(m5483(), 764, 36, 682)), m5472(mediaTypeM54893, C0047.m7763(sb3))), strM4199, C0017.m3646(m5483(), 800, 325, 2916)), strM4536, strM1077, C0013.m3106(m5483(), 1125, 6, 1247), C0031.m5565(m5483(), 1131, 36, 3034))))));
            if (C0058.m9127(strM5487, C0040.m6584(m5483(), 1167, 7, 2204))) {
                String strM5479 = m5479(m5481(m5484(strM5487), strM9775), C0056.m8911(m5483(), 1174, 4, 2648), strM1840);
                OkHttpClient okHttpClient4 = new OkHttpClient();
                MediaType mediaTypeM54894 = m5489(strM2300);
                StringBuilder sb4 = new StringBuilder(C0006.m1774(m5483(), 1178, 5, 2953));
                C0018.m3933(sb4, strM5479);
                C0018.m3933(sb4, strM5062);
                C0017.m3663(m5487(m5490(m5474(m5485(okHttpClient4, m5478(m5475(m5475(m5475(m5482(m5473(new Request.Builder(), C0040.m6584(m5483(), 1183, 34, 2594)), m5472(mediaTypeM54894, C0047.m7763(sb4))), strM4199, strM1549), strM4536, strM2300), strM4340, (String) C0063.m9563(this))))))));
            }
        }
    }

    public String f(String str, String str2) {
        OkHttpClient okHttpClient = new OkHttpClient();
        Request.Builder builder = new Request.Builder();
        StringBuilder sb = new StringBuilder();
        C0018.m3933(sb, str);
        C0018.m3933(sb, str2);
        C0018.m3933(sb, C0043.m7290(m5483(), 1217, 36, 600));
        String strM5479 = m5479(m5484(m5487(m5490(m5474(m5485(okHttpClient, m5478(m5475(m5475(m5476(m5473(builder, C0047.m7763(sb))), C0038.m6452(m5483(), 1253, 10, 2772), C0049.m8007(m5483(), 1263, 13, 3134)), C0009.m2037(m5483(), 1276, 5, 524), (String) C0063.m9563(this)))))))), C0027.m5062(m5483(), 1281, 3, 352), C0007.m1840());
        StringBuilder sb2 = new StringBuilder(C0027.m5062(m5483(), 1284, 41, 795));
        C0006.m1736(sb2, C0035.m6105(C0035.m6110()));
        C0018.m3933(sb2, C0034.m6001(m5483(), 1325, 5, 1915));
        C0018.m3933(sb2, C0053.m8464(strM5479));
        return C0032.m5769(C0047.m7763(sb2), null);
    }

    public ArrayList g() throws InterruptedException {
        do {
            AtomicBoolean atomicBoolean = (AtomicBoolean) C0015.m3511(this);
            if (atomicBoolean == null || C0016.m3610(atomicBoolean)) {
                return C0031.m5663(this) != null ? new ArrayList(C0031.m5663(this)) : new ArrayList();
            }
            C0011.m2785(100L);
        } while (!C0007.m1847(C0031.m5631()));
        throw new InterruptedException(C0034.m6001(m5483(), 1330, 10, 3203));
    }
}