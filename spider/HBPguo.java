package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.E.b;
import com.github.catvod.spider.merge.E.g;
import com.github.catvod.spider.merge.E.m;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.J0.C0021;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.a0.C0042;
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
import com.github.catvod.spider.merge.g0.AbstractC0308c;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.o0.C0056;
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
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class HBPguo extends Spider {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f32short = {3138, 3166, 3166, 3162, 3088, 3077, 3077, 3145, 3076, 3154, 3162, 3149, 3166, 3164, 3076, 3140, 3151, 3166, 3077, 3143, 3097, 3167, 3090, 3077, 299, 269, 283, 268, 339, 319, 281, 283, 272, 266, 879, 875, 872, 884, 884, 880, 815, 819, 814, 817, 818, 814, 817, 817, 3189, 3161, 3160, 3160, 3155, 3157, 3138, 3167, 3161, 3160, 1912, 1878, 1878, 1859, 1822, 1906, 1887, 1882, 1861, 1878, 2783, 2777, 2767, 2776, 2805, 2755, 2766, 463, 455, 464, 469, 472, 463, 3095, 3084, 3080, 3078, 3085, 3153, 1869, 1875, 1901, 1884, 1888, 1912, 1912, 1863, 1895, 1915, 1906, 1908, 1905, 1885, 1879, 1825, 1857, 1878, 1903, 1904, 1856, 1908, 1913, 1904, 1904, 1911, 1857, 1869, 1828, 1829, 1859, 1913, 1850, 1907, 1889, 1878, 1891, 1874, 1881, 1861, 1904, 1884, 1824, 1889, 1883, 1831, 1868, 1850, 1913, 1916, 1871, 1824, 1889, 1868, 1824, 1904, 1825, 1889, 1837, 1832, 1679, 1692, 1675, 1674, 1680, 1686, 1687, 510, 502, 481, 484, 489, 510, 390, 453, 457, 459, 392, 470, 462, 457, 451, 456, 463, 478, 392, 466, 464, 407, 392, 403, 392, 403, 1069, 1060, 1078, 1069, 1521, 1528, 1525, 1525, 2842, 2826, 2843, 2828, 2828, 2823, 2833, 1422, 1423, 1423, 1421, 1774, 1781, 1777, 1791, 1780, 3126, 3080, 3092, 3091, 3088, 3082, 3104, 3090, 3083, 3082, 3106, 3119, 3110, 3155, 3088, 3114, 3121, 3092, 3156, 3130, 3111, 3091, 3087, 3088, 3077, 3129, 3131, 3115, 3153, 3127, 3083, 3082, 3091, 3123, 3125, 3105, 3086, 3124, 3081, 3077, 3122, 3094, 3158, 3094, 3117, 3110, 3092, 3084, 3098, 3097, 3113, 3121, 3153, 3148, 3092, 3084, 3076, 3117, 3110, 3112, 3108, 3099, 3111, 3157, 3120, 3086, 3099, 3095, 3131, 3093, 3074, 3144, 3119, 3072, 3087, 3120, 3124, 3091, 3080, 3124, 3074, 3081, 3117, 3115, 3078, 3116, 3129, 3098, 3108, 3124, 3130, 3148, 3092, 3085, 3090, 3092, 3112, 3080, 3154, 3118, 3072, 3130, 3083, 3127, 3115, 3120, 3095, 3079, 3093, 3131, 3083, 3106, 3111, 3109, 3099, 3155, 3086, 3081, 3112, 3083, 3085, 3108, 3104, 3099, 3072, 3080, 3091, 3159, 3155, 3077, 3159, 3094, 3109, 3120, 3118, 3120, 3116, 3162, 3073, 3084, 3156, 3110, 3106, 3120, 3126, 3120, 3109, 3126, 3158, 3090, 3152, 3119, 3118, 3086, 3092, 3113, 3085, 3081, 3078, 3123, 3088, 3082, 3148, 3088, 3117, 3093, 3108, 3111, 3074, 3111, 3152, 3144, 3126, 3120, 3129, 3109, 3072, 3115, 3163, 3094, 3121, 3155, 3088, 3076, 3072, 3093, 3121, 3094, 3122, 3119, 3123, 3073, 3126, 3097, 3148, 3113, 3153, 3115, 3152, 3114, 3152, 3130, 3130, 3166, 2624, 2653, 2649, 2641, 2631, 2624, 2645, 2649, 2628, 2037, 2035, 2033, 2033, 2032, 2038, 2032, 2044, 2044, 2044, 587, 603, 586, 605, 605, 598, 577, 850, 850, 849, 850, 2781, 2753, 2753, 2757, 2703, 2714, 2714, 2780, 2753, 2768, 2776, 2715, 2765, 2757, 2770, 2753, 2755, 2715, 2774, 2778, 2776, 2714, 2772, 2757, 2780, 2715, 2757, 2781, 2757, 2714, 2755, 2695, 2715, 2755, 2778, 2769, 2714, 2772, 2779, 2769, 2759, 2778, 2780, 2769, 2771, 2780, 2777, 2753, 2768, 2759, 2698, 2757, 2772, 2770, 2768, 2696, 494, 444, 433, 440, 429, 501, 1000, 1005, 1016, 1005, 2512, 2527, 2515, 2523, 936, 933, 1978, 1955, 1961, 1552, 1557, 1537, 1540, 1553, 1536, 1580, 1547, 1539, 1546, 2670, 2674, 2674, 2678, 2620, 2601, 2601, 2671, 2674, 2659, 2667, 2600, 2686, 2678, 2657, 2674, 2672, 2600, 2661, 2665, 2667, 2601, 2663, 2678, 2671, 2600, 2678, 2670, 2678, 2601, 2672, 2613, 2600, 2672, 2665, 2658, 2601, 2663, 2664, 2658, 2676, 2665, 2671, 2658, 2658, 2659, 2674, 2663, 2671, 2666, 2612, 2617, 2672, 2665, 2658, 2649, 2671, 2658, 2619, 554, 559, 570, 559, 1935, 1920, 1932, 1924, 2851, 2863, 2862, 2868, 2853, 2862, 2868, 2854, 2879, 2869, 2294, 2291, 2279, 2274, 2295, 2278, 2250, 2285, 2277, 2284, 2034, 2030, 2026, 2041, 3267, 3268, 3290, 3269, 1868, 1858, 1886, 20553, 26229, -27285, 803, 3176, 3183, 3185, 1676, 22398, -30328, 27885, 1718, 2179, 338, 2239, 2621, 30455, -30204, 20901, 32347, 21535, 30503, -29791, 21250, 28289, 1577, 2152, 2091, 2165, 2099, 2174, 2169, 2108, 2094, 2095, 2090, 2095, 2087, 2088, 573, 545, 545, 549, 623, 634, 634, 572, 545, 560, 568, 635, 557, 549, 562, 545, 547, 635, 566, 570, 568, 634, 564, 549, 572, 635, 549, 573, 549, 634, 547, 615, 635, 547, 570, 561, 634, 564, 571, 561, 551, 570, 572, 561, 550, 560, 564, 551, 566, 573, 612, 613, 613, 621, 611, 618, 549, 564, 562, 560, 616, 612, 627, 546, 561, 616, 3295, 3290, 3279, 3290, 3191, 3192, 3188, 3196, 1439, 1426, 2086, 2111, 2101, 1965, 1960, 1980, 1977, 1964, 1981, 1937, 1974, 1982, 1975, 3099};
    public String a;
    public final String b = C0006.m1774(m211(), 0, 24, 3114);

    public static HashMap a() {
        HashMap mapM4127 = C0019.m4127(C0037.m6307(m211(), 24, 10, 382), C0046.m7718(m211(), 34, 14, 768), C0031.m5565(m211(), 48, 10, 3126), C0008.m1970(m211(), 58, 10, 1843));
        C0053.m8424(mapM4127, C0030.m5362(m211(), 68, 7, 2730), C0016.m3525(m211(), 75, 6, 407));
        C0053.m8424(mapM4127, C0038.m6452(m211(), 81, 6, 3171), C0028.m5109(m211(), 87, 60, 1813));
        C0053.m8424(mapM4127, C0027.m5062(m211(), 147, 7, 1785), C0065.m9775(m211(), 154, 26, 422));
        C0053.m8424(mapM4127, C0045.m7657(m211(), 180, 4, 1093), C0002.m1305(m211(), 184, 4, 1472));
        C0053.m8424(mapM4127, C0032.m5708(m211(), 188, 7, 2921), C0062.m9389(m211(), 195, 4, 1468));
        C0053.m8424(mapM4127, C0064.m9599(m211(), 199, 5, 1690), C0006.m1774(m211(), 204, 204, 3171));
        C0053.m8424(mapM4127, C0009.m2037(m211(), 408, 9, 2612), C0012.m2973(m211(), 417, 10, 1988));
        C0053.m8424(mapM4127, C0001.m1189(m211(), 427, 7, 568), C0028.m5109(m211(), 434, 4, 867));
        return mapM4127;
    }

    /* renamed from: ۟۠۟ۥۧ, reason: not valid java name and contains not printable characters */
    public static short[] m211() {
        if (C0029.m5282() >= 0) {
            return f32short;
        }
        return null;
    }

    /* renamed from: ۣۣۣ۟ۢ, reason: not valid java name and contains not printable characters */
    public static JsonObject m212(Object obj) {
        if (C0009.m2047() > 0) {
            return AbstractC0308c.i((String) obj);
        }
        return null;
    }

    /* renamed from: ۟ۦۧۧۦ, reason: not valid java name and contains not printable characters */
    public static Iterator m213(Object obj) {
        if (C0000.m1116() <= 0) {
            return ((JsonArray) obj).iterator();
        }
        return null;
    }

    /* renamed from: ۟ۧۦۢ۠, reason: not valid java name and contains not printable characters */
    public static String m214(Object obj, Object obj2, Object obj3) {
        if (C0046.m7701() > 0) {
            return AbstractC0308c.f((JsonObject) obj, (String) obj2, (String) obj3);
        }
        return null;
    }

    /* renamed from: ۢۤۧۨ, reason: not valid java name and contains not printable characters */
    public static JsonObject m215(Object obj) {
        if (C0001.m1164() <= 0) {
            return ((JsonElement) obj).getAsJsonObject();
        }
        return null;
    }

    /* renamed from: ۦۢۦۡ, reason: contains not printable characters */
    public static JsonArray m216(Object obj, Object obj2) {
        if (C0014.m3353() <= 0) {
            return AbstractC0308c.c((JsonObject) obj, (String) obj2);
        }
        return null;
    }

    /* renamed from: ۧۧۨ, reason: not valid java name and contains not printable characters */
    public static JsonObject m217(Object obj, Object obj2) {
        if (C0021.m4379() > 0) {
            return AbstractC0308c.d((JsonObject) obj, (String) obj2);
        }
        return null;
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        ArrayList arrayList = new ArrayList();
        C0054.m8636(C0031.m5627(C0009.m2099()), 0, 10);
        StringBuilder sb = new StringBuilder(C0010.m2300(m211(), 438, 56, 2741));
        C0018.m3933(sb, str2);
        C0018.m3933(sb, C0060.m9352(m211(), 494, 6, 456));
        C0018.m3933(sb, str);
        Iterator itM213 = m213(m216(m212(C0032.m5769(C0047.m7763(sb), C0035.m6075())), C0052.m8337(m211(), 500, 4, 908)));
        while (C0012.m2962(itM213)) {
            JsonObject jsonObjectM215 = m215((JsonElement) C0048.m7949(itM213));
            String strM9361 = C0061.m9361(m211(), 504, 4, 2494);
            String strM1840 = C0007.m1840();
            C0055.m8732(m214(jsonObjectM215, C0033.m5852(m211(), 508, 2, 961), strM1840), m214(jsonObjectM215, strM9361, strM1840), m214(jsonObjectM215, C0064.m9599(m211(), 510, 3, 1994), strM1840), m214(jsonObjectM215, C0011.m2805(m211(), 513, 10, 1637), strM1840), arrayList);
        }
        return C0020.m4216(C0011.m2808(C0038.m6456(str2)), C0047.m7818(1, str2), C0011.m2808(20), C0054.m8556(str2, 1, 20), arrayList);
    }

    public String detailContent(List<String> list) {
        C0031.m5627(C0009.m2099());
        StringBuilder sb = new StringBuilder(C0065.m9775(m211(), 523, 59, 2566));
        C0018.m3933(sb, (String) C0048.m7915(list, 0));
        JsonObject jsonObjectM217 = m217(m212(C0032.m5769(C0047.m7763(sb), C0035.m6075())), C0002.m1305(m211(), 582, 4, 590));
        m mVar = new m();
        String strM4107 = C0019.m4107(m211(), 586, 4, 2017);
        String strM1840 = C0007.m1840();
        C0005.m1628(mVar, m214(jsonObjectM217, strM4107, strM1840));
        C0055.m8715(C0035.m6110(), m214(jsonObjectM217, strM4107, strM1840));
        StringBuilder sb2 = new StringBuilder();
        C0018.m3933(sb2, C0055.m8703());
        C0018.m3933(sb2, m214(jsonObjectM217, C0042.m7151(m211(), 590, 7, 2880), strM1840));
        C0027.m5000(mVar, C0047.m7763(sb2));
        C0026.m4947(mVar, m214(jsonObjectM217, C0050.m8131(m211(), 597, 3, 2902), strM1840));
        C0011.m2828(mVar, (String) C0048.m7915(list, 0));
        StringBuilder sb3 = new StringBuilder();
        C0018.m3933(sb3, C0036.m6189());
        C0018.m3933(sb3, m214(jsonObjectM217, C0064.m9599(m211(), 600, 10, 2179), strM1840));
        C0019.m4073(mVar, C0047.m7763(sb3));
        C0022.m4432(mVar, m214(jsonObjectM217, C0051.m8259(m211(), 610, 4, 1931), strM1840));
        JsonArray jsonArrayM216 = m216(jsonObjectM217, C0014.m3332(m211(), 614, 4, 3254));
        ArrayList arrayList = new ArrayList();
        Iterator itM213 = m213(jsonArrayM216);
        while (C0012.m2962(itM213)) {
            JsonObject jsonObjectM215 = m215((JsonElement) C0048.m7949(itM213));
            String strM3646 = C0017.m3646(m211(), 618, 3, 1831);
            if (!C0058.m9127(m214(jsonObjectM215, strM3646, strM1840), C0061.m9361(m211(), 621, 3, 899))) {
                StringBuilder sb4 = new StringBuilder();
                C0018.m3933(sb4, m214(jsonObjectM215, strM3646, strM1840));
                C0018.m3933(sb4, C0049.m8007(m211(), 624, 1, 775));
                C0018.m3933(sb4, m214(jsonObjectM215, C0052.m8337(m211(), 625, 3, 3101), strM1840));
                C0018.m3933(sb4, C0033.m5852(m211(), 628, 1, 1778));
                C0018.m3933(sb4, m214(jsonObjectM215, strM3646, strM1840));
                C0004.m1532(arrayList, C0047.m7763(sb4));
            }
        }
        C0054.m8596(mVar, C0052.m8337(m211(), 629, 3, 2929));
        C0044.m7449(mVar, C0036.m6194(C0025.m4795(m211(), 632, 1, 1685), arrayList));
        return C0053.m8428(mVar);
    }

    public String homeContent(boolean z) {
        ArrayList arrayList = new ArrayList();
        List listM1203 = C0001.m1203(new String[]{C0038.m6452(m211(), 633, 1, 2225), C0024.m4740(m211(), 634, 1, 355), C0052.m8337(m211(), 635, 1, 2188), C0021.m4340(m211(), 636, 1, 2569)});
        List listM12032 = C0001.m1203(new String[]{C0051.m8259(m211(), 637, 3, 962), C0019.m4107(m211(), 640, 2, 2926), C0047.m7833(m211(), 642, 2, 2523), C0053.m8477(m211(), 644, 2, 426)});
        for (int i = 0; i < C0064.m9636(listM1203); i++) {
            C0004.m1532(arrayList, new b((String) C0048.m7915(listM1203, i), (String) C0048.m7915(listM12032, i), null));
        }
        return C0003.m1448(C0041.m6822(this), null, arrayList);
    }

    public void init(Context context, String str) {
        if (str != null) {
            this.a = str;
        }
    }

    public String playerContent(String str, String str2, List<String> list) {
        C0036.m6219();
        C0054.m8636(C0031.m5627(C0009.m2099()), 0, 10);
        String[] strArrM4752 = C0024.m4752(str2, C0055.m8814(m211(), 646, 1, 1623));
        String strM1840 = (strArrM4752.length <= 0 || C0057.m8953(strArrM4752[0])) ? C0007.m1840() : strArrM4752[0];
        String strM2827 = C0011.m2827(strM1840, C0002.m1316(C0035.m6110()), (strArrM4752.length <= 1 || C0057.m8953(strArrM4752[1])) ? null : strArrM4752[1]);
        g gVar = new g();
        StringBuilder sb = new StringBuilder();
        C0018.m3933(sb, C0010.m2331(this));
        C0018.m3933(sb, strM1840);
        C0018.m3933(sb, C0033.m5852(m211(), 647, 13, 2118));
        C0017.m3667(gVar, C0047.m7763(sb));
        C0006.m1720(gVar, 0);
        C0057.m9029(gVar, C0035.m6075());
        C0002.m1282(gVar, strM2827);
        return C0033.m5828(gVar);
    }

    public String searchContent(String str, String str2, boolean z) {
        ArrayList arrayList = new ArrayList();
        Iterator itM213 = m213(m216(m212(C0032.m5769(C0026.m4915(C0014.m3332(m211(), 660, 66, 597), str), C0035.m6075())), C0042.m7151(m211(), 726, 4, 3259)));
        while (C0012.m2962(itM213)) {
            JsonObject jsonObjectM215 = m215((JsonElement) C0048.m7949(itM213));
            String strM3484 = C0015.m3484(m211(), 730, 4, 3097);
            String strM1840 = C0007.m1840();
            C0055.m8732(m214(jsonObjectM215, C0002.m1305(m211(), 734, 2, 1526), strM1840), m214(jsonObjectM215, strM3484, strM1840), m214(jsonObjectM215, C0030.m5362(m211(), 736, 3, 2134), strM1840), m214(jsonObjectM215, C0004.m1549(m211(), 739, 10, 2008), strM1840), arrayList);
        }
        return C0047.m7783(arrayList);
    }

    public String searchContent(String str, boolean z) {
        return C0039.m6542(this, C0056.m8909(str), C0047.m7833(m211(), 749, 1, 3114), true);
    }
}