package com.github.catvod.spider.merge.V;

import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.C.C0017;
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
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.Z.C0040;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.c1.C0046;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.g0.AbstractC0308c;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.r0.C0060;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.merge.y0.C0064;
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
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.security.InvalidKeyException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public final class c extends Spider {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f628short = {713, 725, 725, 721, 722, 667, 654, 654, 704, 721, 712, 655, 723, 723, 716, 715, 655, 721, 717, 724, 722, 882, 878, 878, 874, 873, 800, 821, 821, 887, 820, 872, 872, 887, 880, 820, 874, 886, 879, 873, 1504, 1457, 1508, 1511, 1511, 1504, 1515, 1514, 1515, 1515, 1505, 1458, 1511, 1507, 1509, 1508, 2995, 2999, 2977, 2626, 2630, 2640, 2604, 2630, 2624, 2625, 2604, 2643, 2632, 2624, 2640, 2614, 2643, 2658, 2663, 2663, 2666, 2669, 2660, 1593, 1592, 1578, 1601, 1620, 3037, 3039, 3022, 2960, 3067, 3062, 3059, 3027, 3070, 2976, 2989, 2989, 3039, 3033, 3038, 2988, 2988, 3035, 2999, 2987, 3036, 2989, 2989, 2999, 2990, 2984, 2988, 3036, 2999, 2979, 2986, 2988, 2985, 2999, 3032, 2990, 2987, 2979, 2986, 2984, 2991, 3032, 2986, 2985, 3039, 3039, 2960, 3065, 3054, 2976, 3053, 3071, 3064, 3013, 3050, 3065, 2960, 3065, 3052, 2976, 2987, 2996, 2986, 2996, 2986, 2960, 3054, 2976, 1852, 639, 602, 598, 596, 612, 639, 630, 517, 514, 513, 1401, 1391, 1289, 1293, 1295, 1387, 1292, 1406, 1293, 1407, 1359, 1368, 1385, 1358, 1390, 1293, 1295, 1389, 1367, 1289, 1401, 1371, 1400, 1405, 1399, 1388, 1369, 1369, 1399, 1382, 1381, 480, 481, 499, 408, 397, 891, 861, 843, 860, 771, 879, 841, 843, 832, 858, 1922, 1952, 1973, 1958, 1955, 1955, 1966, 2016, 2042, 2017, 2047, 2031, 2023, 1923, 1958, 1953, 1978, 1975, 2036, 2031, 1934, 1953, 1963, 1981, 1952, 1958, 1963, 2031, 2046, 2047, 2036, 2031, 1924, 2022, 2031, 1934, 1983, 1983, 1955, 1962, 1944, 1962, 1965, 1924, 1958, 1979, 2016, 2042, 2044, 2040, 2017, 2044, 2041, 2031, 2023, 1924, 1927, 1947, 1922, 1923, 2019, 2031, 1955, 1958, 1956, 1962, 2031, 1928, 1962, 1964, 1956, 1952, 2022, 2031, 1932, 1959, 1981, 1952, 1954, 1962, 2016, 2046, 2044, 2047, 2017, 2047, 2017, 2047, 2017, 2047, 2031, 1948, 1966, 1961, 1966, 1981, 1958, 2016, 2042, 2044, 2040, 2017, 2044, 2041, 497, 467, 467, 469, 448, 452, 1587, 1570, 1570, 1598, 1595, 1585, 1587, 1574, 1595, 1597, 1596, 1661, 1592, 1569, 1597, 1596, 1662, 1650, 1574, 1591, 1578, 1574, 1661, 1570, 1598, 1587, 1595, 1596, 1662, 1650, 1656, 1661, 1656, 2171, 2094, 2144, 2146, 2094, 2160, 2154, 2148, 2157, 2757, 2773, 2756, 1954, 3019, 3038, 636, 611, 637, 611, 637, 1285, 1288, 1293, 1325, 1280, 1925, 1925, 2039, 2033, 2038, 1924, 1924, 2035, 1951, 1923, 2036, 1925, 1925, 1951, 1926, 1920, 1924, 2036, 1951, 1931, 1922, 1924, 1921, 1951, 2032, 1926, 1923, 1931, 1922, 1920, 1927, 2032, 1922, 1921, 2039, 2039, 3044, 3059, 2433, 2451, 2452, 2473, 2438, 2453, 1289, 445, 384, 411, 405, 411, 412, 3013, 2782, 2793, 2794, 2793, 2814, 2793, 2814, -32659, 28763, 2948, 2945, 2957, 2959, 28850, 24513, 28218, 22557, 32467, -24875, -32733, 2974, 2953, 2946, 2974, 2953, 2946, 1036, 1102, 1038, 1104, 1111, 1090, 1111, 1098, 1100, 1101, 1036, 1095, 1105, 1090, 1102, 1090, 1036, 1107, 1090, 1092, 1094, 1052, 1095, 1105, 1090, 1102, 1090, 1130, 1095, 1054, 556, 610, 623, 636, 617, 581, 634, 623, 612, 567, 571, 556, 610, 633, 622, 632, 581, 634, 623, 612, 567, 570, 556, 611, 633, 587, 621, 623, 582, 611, 615, 611, 638, 567, 570, 556, 635, 639, 619, 614, 611, 638, 627, 567, 607, 578, 590, 574, 577, 419, 422, 435, 422, 2232, 2222, 2237, 2225, 2237, 2197, 2226, 2234, 2227, 2679, 2666, 2679, 2671, 2662, 1594, 1593, 1580, 1578, 1568, 1576, 1573, 1565, 1576, 1582, 1541, 1568, 1594, 1597, 1373, 1345, 1349, 1366, 653, 670, 649, 653, 3045, 3049, 3056, 3043, 3060, 3086, 3090, 3103, 3079, 3117, 3082, 3103, 3082, 3083, 3085, 1364, 1345, 1368, 1346, 1374, 1365, 1364, 1405, 1368, 1346, 1349, 3179, 3198, 3175, 3197, 3169, 3178, 3179, 3136, 3169, 2623, 2675, 2671, 2671, 2667, 2593, 2612, 2612, 2665, 2686, 2677, 2665, 2686, 2677, 2659, 2674, 2682, 2676, 2675, 2670, 2681, 2682, 2677, 654, 671, 663, 665, 670, 643, 660, 663, 664, 1220, 1246, 1235, 3300, 3296, 3316, 3321, 3324, 3297, 3308, 3286, 3322, 3313, 3312, 23154, -24877, 17950, 28579, 2097, 2173, 2145, 2145, 2149, 2095, 2106, 2106, 23154, -24877, 17950, 28579, 1578, 2663, 779, 782, 795, 782, 2530, 2558, 2558, 2554, 2553, 2480, 2469, 2469, 2539, 2554, 2531, 2468, 2555, 2557, 2542, 2528, 2539, 2554, 2554, 2468, 2537, 2533, 2535, 667, 711, 721, 725, 710, 727, 732, 667, 727, 731, 729, 708, 710, 721, 732, 721, 730, 711, 733, 706, 721, 651, 735, 721, 717, 707, 731, 710, 720, 711, 649, 889, 812, 822, 805, 826, 866, 878, 874, 889, 822, 812, 798, 824, 826, 787, 822, 818, 822, 811, 866, 825, 830, 819, 812, 826, 3303, 3313, 3317, 3303, 3323, 3322, 3288, 3325, 3303, 3296, 1403, 18688, 18688, 2721, 2733, 2740, 2727, 2736, 2405, 2408, 1197, 1210, 1201, 1197, 1210, 1201, 1164, 1169, 1164, 1172, 1181, 2449, 2462, 2451, 2433, 2433, 2459, 2452, 2443, 3185, 3182, 3171, 3170, 3176, 3147, 3182, 3188, 3187, 796, 778, 782, 796, 768, 769, 806, 769, 777, 768, 2885, 2901, 2905, 2884, 2899};
    public final String a = C0064.m9599(m5559(), 0, 21, 673);
    public final String b = C0053.m8477(m5559(), 21, 19, 794);

    public static String b(String str) throws InvalidKeyException {
        byte[] bArrM1882 = C0007.m1882(str);
        SecretKeySpec secretKeySpec = new SecretKeySpec(C0050.m8115(C0000.m1077(m5559(), 40, 16, 1491)), C0055.m8814(m5559(), 56, 3, 3058));
        Cipher cipherM4284 = C0020.m4284(C0057.m8978(m5559(), 59, 20, 2563));
        C0060.m9336(cipherM4284, 2, secretKeySpec);
        return new String(C0010.m2335(cipherM4284, bArrM1882), C0027.m5062(m5559(), 79, 5, 1644));
    }

    /* renamed from: ۟۟۠ۢۨ, reason: not valid java name and contains not printable characters */
    public static Iterator m5555(Object obj) {
        if (C0049.m8038() < 0) {
            return ((JsonArray) obj).iterator();
        }
        return null;
    }

    /* renamed from: ۟ۡ۟ۧۨ, reason: not valid java name and contains not printable characters */
    public static String m5556(Object obj, Object obj2, Object obj3) {
        if (C0007.m1886() > 0) {
            return AbstractC0308c.f((JsonObject) obj, (String) obj2, (String) obj3);
        }
        return null;
    }

    /* renamed from: ۟ۥۨۧۥ, reason: not valid java name and contains not printable characters */
    public static JsonObject m5557(Object obj) {
        if (C0046.m7701() > 0) {
            return ((JsonElement) obj).getAsJsonObject();
        }
        return null;
    }

    /* renamed from: ۟ۦۣۤ۟, reason: not valid java name and contains not printable characters */
    public static JsonObject m5558(Object obj, Object obj2) {
        if (C0046.m7701() > 0) {
            return AbstractC0308c.d((JsonObject) obj, (String) obj2);
        }
        return null;
    }

    /* renamed from: ۡۥۦ۟, reason: not valid java name and contains not printable characters */
    public static short[] m5559() {
        if (C0026.m4977() < 0) {
            return f628short;
        }
        return null;
    }

    /* renamed from: ۣۨۥۣ, reason: not valid java name and contains not printable characters */
    public static JsonObject m5560(Object obj) {
        if (C0006.m1726() <= 0) {
            return AbstractC0308c.i((String) obj);
        }
        return null;
    }

    /* renamed from: ۧۥۥۥ, reason: not valid java name and contains not printable characters */
    public static JsonArray m5561(Object obj, Object obj2) {
        if (C0025.m4797() > 0) {
            return AbstractC0308c.c((JsonObject) obj, (String) obj2);
        }
        return null;
    }

    public final HashMap c(String str) {
        String strM5627 = C0031.m5627(C0009.m2099());
        StringBuilder sb = new StringBuilder(C0047.m7833(m5559(), 84, 68, 2970));
        C0018.m3933(sb, strM5627);
        C0018.m3933(sb, C0050.m8131(m5559(), 152, 1, 1846));
        C0018.m3933(sb, str);
        String strM7763 = C0047.m7763(sb);
        String strM1842 = C0007.m1842(m5559(), 153, 10, 567);
        try {
            Mac macM1732 = C0006.m1732(strM1842);
            C0015.m3454(macM1732, new SecretKeySpec(C0050.m8115(C0008.m1970(m5559(), 163, 31, 1340)), strM1842));
            String strM4719 = C0024.m4719(C0060.m9338(macM1732, C0021.m4347(strM7763, C0002.m1305(m5559(), 194, 5, 437))));
            HashMap mapM4127 = C0019.m4127(C0043.m7290(m5559(), 199, 10, 814), C0047.m7833(m5559(), 209, 104, 1999), C0064.m9599(m5559(), 313, 6, 432), C0008.m1970(m5559(), 319, 33, 1618));
            C0053.m8424(mapM4127, C0054.m8574(m5559(), 352, 9, 2051), strM4719);
            C0053.m8424(mapM4127, C0058.m9106(m5559(), 361, 3, 2736), C0001.m1189(m5559(), 364, 1, 1947));
            C0053.m8424(mapM4127, C0041.m6779(m5559(), 365, 2, 2984), C0027.m5062(m5559(), 367, 5, 589));
            C0053.m8424(mapM4127, C0043.m7290(m5559(), 372, 5, 1380), C0056.m8911(m5559(), 377, 36, 1970));
            C0053.m8424(mapM4127, C0038.m6452(m5559(), 413, 2, 2951), C0003.m1398(m5559(), 415, 6, 2550));
            C0053.m8424(mapM4127, C0050.m8131(m5559(), 421, 1, 1405), strM5627);
            String strM5435 = C0030.m5435(this);
            C0053.m8424(mapM4127, C0056.m8911(m5559(), 422, 6, 498), strM5435);
            StringBuilder sb2 = new StringBuilder();
            C0018.m3933(sb2, strM5435);
            C0018.m3933(sb2, C0019.m4107(m5559(), 428, 1, 3050));
            C0053.m8424(mapM4127, C0005.m1645(m5559(), 429, 7, 2700), C0047.m7763(sb2));
            return mapM4127;
        } catch (Exception e) {
            throw new RuntimeException(C0018.m3917(m5559(), 436, 13, 3020), e);
        }
    }

    public final String detailContent(List list) {
        String str = (String) C0048.m7915(list, 0);
        String strM4403 = C0022.m4403(m5559(), 449, 6, 3052);
        String strM1840 = C0007.m1840();
        String strM3446 = C0015.m3446(str, strM4403, strM1840);
        String strM1130 = C0000.m1130(C0006.m1774(m5559(), 455, 30, 1059), strM3446, C0008.m1970(m5559(), 485, 49, 522));
        JsonObject jsonObjectM5558 = m5558(m5560(C0058.m9056(C0032.m5769(C0028.m5188(new StringBuilder(), C0060.m9345(this), strM1130), C0024.m4696(this, strM1130)))), C0025.m4795(m5559(), 534, 4, 455));
        JsonObject jsonObjectM55582 = m5558(jsonObjectM5558, C0054.m8574(m5559(), 538, 9, 2268));
        m mVar = new m();
        String strM9599 = C0064.m9599(m5559(), 547, 5, 2563);
        C0005.m1628(mVar, m5556(jsonObjectM55582, strM9599, strM1840));
        C0055.m8715(C0035.m6110(), m5556(jsonObjectM55582, strM9599, strM1840));
        StringBuilder sb = new StringBuilder();
        C0018.m3933(sb, C0055.m8703());
        C0018.m3933(sb, m5556(jsonObjectM55582, C0055.m8814(m5559(), 552, 14, 1609), strM1840));
        C0027.m5000(mVar, C0047.m7763(sb));
        C0026.m4947(mVar, m5556(jsonObjectM55582, C0000.m1077(m5559(), 566, 4, 1316), strM1840));
        C0017.m3671(mVar, m5556(jsonObjectM55582, C0014.m3332(m5559(), 570, 4, 748), strM1840));
        C0011.m2828(mVar, (String) C0048.m7915(list, 0));
        C0022.m4432(mVar, m5556(jsonObjectM55582, C0058.m9106(m5559(), 574, 5, 2950), strM1840));
        StringBuilder sb2 = new StringBuilder();
        C0018.m3933(sb2, C0036.m6189());
        C0018.m3933(sb2, m5556(jsonObjectM55582, C0028.m5109(m5559(), 579, 10, 3198), strM1840));
        C0019.m4073(mVar, C0047.m7763(sb2));
        JsonArray jsonArrayM5561 = m5561(jsonObjectM5558, C0022.m4403(m5559(), 589, 11, 1329));
        ArrayList arrayList = new ArrayList();
        Iterator itM5555 = m5555(jsonArrayM5561);
        while (C0012.m2962(itM5555)) {
            JsonObject jsonObjectM5557 = m5557((JsonElement) C0048.m7949(itM5555));
            StringBuilder sb3 = new StringBuilder();
            C0018.m3933(sb3, m5556(jsonObjectM5557, C0022.m4403(m5559(), 600, 9, 3086), strM1840));
            C0018.m3933(sb3, C0031.m5565(m5559(), 609, 23, 2587));
            C0018.m3933(sb3, strM3446);
            String strM4340 = C0021.m4340(m5559(), 632, 9, 758);
            C0018.m3933(sb3, strM4340);
            C0018.m3933(sb3, m5556(jsonObjectM5557, C0010.m2300(m5559(), 641, 3, 1207), strM1840));
            C0018.m3933(sb3, strM4340);
            C0018.m3933(sb3, m5556(jsonObjectM5557, C0015.m3484(m5559(), 644, 11, 3221), strM1840));
            C0004.m1532(arrayList, C0047.m7763(sb3));
        }
        C0054.m8596(mVar, strM4403);
        if (C0007.m1817(arrayList)) {
            C0004.m1532(arrayList, C0004.m1549(m5559(), 655, 16, 2069));
        }
        C0044.m7449(mVar, C0036.m6194(C0005.m1645(m5559(), 671, 1, 1545), arrayList));
        return C0053.m8428(mVar);
    }

    public final String playerContent(String str, String str2, List list) {
        C0036.m6219();
        String strM6133 = C0035.m6133(str2);
        g gVar = new g();
        C0017.m3667(gVar, str2);
        C0064.m9646(gVar);
        C0006.m1720(gVar, 0);
        C0002.m1282(gVar, strM6133);
        return C0033.m5828(gVar);
    }

    public final String searchContent(String str, boolean z) {
        return C0026.m4879(this, str, true, C0051.m8259(m5559(), 672, 1, 2646));
    }

    public final String searchContent(String str, boolean z, String str2) {
        ArrayList arrayList;
        String strM7763;
        String strM1970;
        String strM9352;
        String strM3106;
        String strM7290;
        String strM5708;
        String strM6584;
        String str3 = str;
        String strM8259 = C0051.m8259(m5559(), 673, 4, 879);
        String strM1840 = C0007.m1840();
        String strM2300 = C0010.m2300(m5559(), 677, 23, 2442);
        String strM7833 = C0047.m7833(m5559(), 700, 31, 692);
        try {
            arrayList = new ArrayList();
            StringBuilder sb = new StringBuilder(strM7833);
            C0018.m3933(sb, str3);
            C0018.m3933(sb, C0062.m9389(m5559(), 731, 25, 863));
            strM7763 = C0047.m7763(sb);
        } catch (Exception unused) {
        }
        try {
            JsonObject jsonObjectM5560 = m5560(C0058.m9056(C0032.m5769(C0050.m8125(strM2300, strM7763), C0024.m4696(this, strM7763))));
            JsonArray jsonArrayM5561 = m5561(m5558(jsonObjectM5560, strM8259), C0042.m7151(m5559(), 756, 10, 3220));
            StringBuilder sb2 = new StringBuilder();
            Iterator itM5555 = m5555(jsonArrayM5561);
            while (true) {
                boolean zM2962 = C0012.m2962(itM5555);
                strM1970 = C0008.m1970(m5559(), 766, 1, 1367);
                strM9352 = C0060.m9352(m5559(), 767, 2, 1978);
                strM3106 = C0013.m3106(m5559(), 769, 5, 2754);
                strM7290 = C0043.m7290(m5559(), 774, 2, 2316);
                strM5708 = C0032.m5708(m5559(), 776, 6, 1247);
                strM6584 = C0040.m6584(m5559(), 782, 5, 1272);
                if (!zM2962) {
                    break;
                }
                JsonObject jsonObjectM5557 = m5557((JsonElement) C0048.m7949(itM5555));
                String strM5556 = m5556(jsonObjectM5557, strM6584, strM1840);
                if (C0058.m9127(strM5556, str3)) {
                    StringBuilder sb3 = new StringBuilder();
                    C0018.m3933(sb3, strM5708);
                    C0018.m3933(sb3, m5556(jsonObjectM5557, strM7290, strM1840));
                    String strM77632 = C0047.m7763(sb3);
                    m mVar = new m(strM77632, strM5556, m5556(jsonObjectM5557, strM3106, strM1840), m5556(jsonObjectM5557, C0024.m4740(m5559(), 787, 8, 2546), strM1840));
                    C0058.m9085(mVar, strM9352);
                    if (!C0058.m9127(C0047.m7763(sb2), strM77632)) {
                        C0018.m3933(sb2, strM77632);
                        C0018.m3933(sb2, strM1970);
                        C0004.m1532(arrayList, mVar);
                    }
                }
            }
            Iterator itM55552 = m5555(m5561(m5558(jsonObjectM5560, strM8259), C0049.m8007(m5559(), 795, 9, 3079)));
            while (C0012.m2962(itM55552)) {
                JsonObject jsonObjectM5558 = m5558(m5557((JsonElement) C0048.m7949(itM55552)), C0047.m7833(m5559(), 804, 10, 879));
                String strM55562 = m5556(jsonObjectM5558, strM6584, strM1840);
                if (C0058.m9127(strM55562, str3)) {
                    StringBuilder sb4 = new StringBuilder();
                    C0018.m3933(sb4, strM5708);
                    C0018.m3933(sb4, m5556(jsonObjectM5558, strM7290, strM1840));
                    String strM77633 = C0047.m7763(sb4);
                    m mVar2 = new m(strM77633, strM55562, m5556(jsonObjectM5558, strM3106, strM1840), m5556(jsonObjectM5558, C0038.m6452(m5559(), 814, 5, 2870), strM1840));
                    C0058.m9085(mVar2, strM9352);
                    if (!C0058.m9127(C0047.m7763(sb2), strM77633)) {
                        C0018.m3933(sb2, strM77633);
                        C0018.m3933(sb2, strM1970);
                        C0004.m1532(arrayList, mVar2);
                    }
                    str3 = str;
                }
            }
            return C0047.m7783(arrayList);
        } catch (Exception unused2) {
            return strM1840;
        }
    }
}