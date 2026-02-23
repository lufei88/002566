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
import com.github.catvod.spider.merge.N.C0023;
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
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.Z.C0040;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.merge.c1.C0046;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d0.C0048;
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
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import com.github.catvod.spider.p000mergexbpq.r.C0014;
import com.github.catvod.spider.p000mergexbpq.x.C0015;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class HBv1Class extends Spider {
    public static String g = "";
    public String a = C0007.m1840();
    public final ArrayList b = new ArrayList();
    public final String c;
    public String d;
    public String e;

    /* renamed from: short, reason: not valid java name */
    private static final short[] f63short = {664, 644, 644, 640, 714, 735, 735, 705, 705, 704, 734, 708, 706, 734, 711, 734, 705, 707, 704, 714, 705, 712, 710, 710, 735, 1013, 1013, 999, 999, 1008, 1008, 995, 995, 1004, 1004, 1016, 1016, 999, 1004, 933, 1004, 893, 808, 812, 812, 810, 812, 894, 810, 881, 892, 892, 815, 810, 812, 894, 811, 893, 893, 812, 808, 893, 892, 880, 894, 811, 811, 894, 895, 888, 881, 808, 813, 1805, 1805, 1805, 1812, 1812, 1812, 1812, 1812, 1812, 1812, 1805, 1800, 1800, 1700, 1771, 1487, 1514, 1511, 1533, 1506, 1504, 1444, 2727, 2735, 2763, 2798, 2793, 2802, 2815, 2748, 2727, 2770, 2748, 2727, 2758, 2793, 2787, 2805, 2792, 2798, 2787, 2727, 2742, 2743, 2748, 2727, 2783, 2798, 2790, 2792, 2794, 2798, 2727, 2757, 2802, 2798, 2795, 2787, 2728, 2762, 2766, 2727, 2751, 2727, 2772, 2754, 2721, 2804, 2798, 2784, 2793, 2746, 2530, 2721, 2695, 2705, 2694, 2777, 2741, 2707, 2705, 2714, 2688, 1390, 1346, 1347, 1347, 1352, 1358, 1369, 1348, 1346, 1347, 682, 644, 644, 657, 716, 672, 653, 648, 663, 644, 765, 745, 2482, 2465, 2486, 2487, 2477, 2475, 2474, 1121, 1149, 1149, 1145, 1075, 1062, 1062, 379, 930, 2615, 2608, 2604, 2603, 402, 403, 400, 401, 406, 407, 404, 405, 410, 411, 451, 448, 449, 454, 455, 452, 453, 458, 459, 456, 457, 462, 463, 460, 461, 466, 467, 464, 465, 470, 471, 468, 469, 474, 475, 472, 483, 480, 481, 486, 487, 484, 485, 490, 491, 488, 489, 494, 495, 492, 493, 498, 499, 496, 497, 502, 503, 500, 501, 506, 507, 504, 2956, 3010, 3027, 3018, 2957, 3027, 3019, 3027, 2956, 3029, 2962, 2957, 3008, 3023, 3010, 3024, 3024, 3018, 3013, 3034, 2956, 3008, 3020, 3021, 3031, 3014, 3021, 3031, 2972, 3027, 3010, 3012, 3014, 2974, 2050, 2163, 2137, 2137, 2139, 2072, 2059, 2076, 2072, 2139, 2115, 2137, 2139, 22801, -26479, 24393, 23363, 2139, 2133, 2163, 2137, 2137, 2139, 2059, 2072, 2071, 2066, 2139, 2115, 2137, 2139, 27504, 18035, 28105, 2139, 2133, 2163, 2137, 2137, 2139, 2061, 2048, 2057, 2076, 2139, 2115, 2137, 2139, 22801, -26479, 29698, 24562, 2139, 2133, 2163, 2137, 2137, 2139, 2061, 2048, 2057, 2076, 2086, 2064, 2077, 2139, 2115, 2137, 2139, 2397, 2387, 2421, 2399, 2399, 2397, 2310, 2330, 2334, 2317, 2397, 2373, 2399, 2397, 22551, -26217, 22283, 18332, 2397, 2421, 2306, 2085, 2080, 2101, 2080, 3190, 3177, 3172, 3173, 3183, 3167, 3180, 3177, 3187, 3188, 1000, 1009, 1018, 961, 1015, 1018, 511, 486, 493, 470, 487, 488, 484, 492, 432, 425, 418, 409, 438, 431, 421, 314, 291, 296, 275, 318, 297, 289, 301, 318, 295, 319, 2700, 2754, 2771, 2762, 2701, 2771, 2763, 2771, 2700, 2773, 2706, 2701, 2771, 2767, 2754, 2778, 2758, 2769, 2700, 2759, 2758, 2775, 2754, 2762, 2767, 2768, 2716, 2773, 2764, 2759, 2812, 2762, 2759, 2718, 2455, 2450, 2439, 2450, 2940, 2941, 2924, 2937, 2929, 2932, 3134, 3111, 3116, 3095, 3110, 3113, 3109, 3117, 2554, 2531, 2536, 2515, 2533, 2536, 1651, 1642, 1633, 1626, 1653, 1644, 1638, 1279, 1254, 1261, 1238, 1261, 1248, 1275, 1260, 1258, 1277, 1254, 1275, 2017, 2040, 2035, 1992, 2030, 2034, 2038, 2021, 1010, 1003, 992, 987, 999, 1003, 1002, 1008, 993, 1002, 1008, 2192, 2185, 2178, 2233, 2196, 2179, 2187, 2183, 2196, 2189, 2197, 3040, 3068, 3057, 3049, 3023, 3045, 3042, 3068, 3023, 3068, 3065, 3043, 3044, 3077, 3089, 3084, 3086, 3182, 3182, 3182, 682, 685, 691, 684, 2019, 2028, 2016, 2024, 2438, 481, 486, 504, 730, 760, 829, 817, 816, 824, 823, 825, 1948, 1984, 2011, 2002, 1985, 2008, 1948, 2002, 1987, 2010, 1949, 1987, 2011, 1987, 1932, 2002, 2000, 1991, 2010, 2012, 2013, 1934, 2000, 2012, 2013, 2005, 2010, 2004, 1984, 503, 491, 486, 510, 482, 501, 494, 489, 481, 488, 500, 2396, 2383, 2392, 2393, 2371, 2373, 2372, 2404, 2379, 2375, 2383, 1074, 1071, 1078, 1071, 1087, 3033, 658, 655, 662, 654, 475, 455, 458, 466, 462, 473, 453, 458, 454, 462, 948, 2558, 2530, 2543, 2551, 2539, 2556, 2532, 2535, 2539, 2533, 2529, 2555, 1355, 1370, 1353, 1352, 1374, 1391, 1346, 1355, 1374, 3167, 3089, 3072, 3097, 3166, 3072, 3096, 3072, 3167, 3078, 3137, 3166, 3096, 3103, 3101, 3093, 3167, 3076, 3081, 3072, 3093, 3075, 1194, 1199, 1210, 1199, 1041, 1052, 1045, 1024, 1046, 1776, 1789, 1780, 1761, 1755, 1773, 1760, 673, 684, 677, 688, 650, 699, 692, 696, 688, 1612, 1616, 1616, 1620, 772, 862, 850, 862, 1993, 2014, 2008, 1999, 2010, 2005, 2012, 2007, 2014, 2010, 2015, 1992, 2010, 2015, 1987, 2010, 1910, 1715, 1718, 1699, 1718, 1770, 1791, 1676, 1673, 1777, 1674, 1788, 1790, 1074, 1070, 1070, 1066, 1306, 1350, 1373, 1364, 1351, 1374, 1306, 1364, 1349, 1372, 1307, 1349, 1373, 1349, 1290, 1364, 1366, 1345, 1372, 1370, 1371, 1288, 1349, 1364, 1351, 1350, 1360, 1347, 1370, 1361, 3019, 3034, 3017, 3016, 3038, 1038, 1033, 1047, 2643, 2655, 2634, 2653, 2646, 2647, 2640, 2649, 463, 385, 400, 393, 462, 400, 392, 400, 463, 406, 465, 462, 403, 389, 385, 402, 387, 392, 463, 388, 385, 404, 385, 479, 407, 388, 477, 1423, 1501, 1488, 1497, 1484, 1526, 1472, 1485, 1428, 1433, 1423, 1497, 1480, 1486, 1484, 1428, 2474, 2479, 2490, 2479, 384, 406, 402, 385, 400, 411, 428, 407, 402, 391, 402, 2479, 2486, 2493, 2438, 2480, 2493, 905, 912, 923, 928, 913, 926, 914, 922, 2980, 3005, 2998, 2957, 2978, 3003, 2993, 996, 1021, 1014, 973, 992, 1015, 1023, 1011, 992, 1017, 993, 2276};
    public static String f = C0024.m4740(m402(), 0, 25, 752);

    public HBv1Class() {
        String strM7718 = C0046.m7718(m402(), 25, 16, 916);
        this.c = strM7718;
        this.d = strM7718;
        this.e = C0003.m1398(m402(), 41, 32, 841);
    }

    public static HashMap a() {
        StringBuilder sb = new StringBuilder();
        C0018.m3933(sb, C0055.m8717(C0004.m1549(m402(), 73, 13, 1900)));
        C0018.m3933(sb, C0064.m9604());
        StringBuilder sb2 = new StringBuilder(C0054.m8574(m402(), 86, 2, 1733));
        C0018.m3933(sb2, C0005.m1667());
        C0018.m3933(sb, C0055.m8717(C0047.m7763(sb2)));
        String strM7763 = C0047.m7763(sb);
        HashMap map = new HashMap();
        StringBuilder sb3 = new StringBuilder(C0015.m3484(m402(), 88, 7, 1419));
        C0018.m3933(sb3, C0031.m5612());
        C0018.m3933(sb3, C0008.m1970(m402(), 95, 50, 2695));
        C0018.m3933(sb3, strM7763);
        C0018.m3933(sb3, C0023.m4536(m402(), 145, 1, 2507));
        C0053.m8424(map, C0027.m5062(m402(), 146, 10, 2804), C0047.m7763(sb3));
        C0053.m8424(map, C0058.m9106(m402(), 156, 10, 1325), C0037.m6307(m402(), 166, 10, 737));
        C0053.m8424(map, C0044.m7509(m402(), 176, 2, 648), strM7763);
        C0053.m8424(map, C0053.m8477(m402(), 178, 7, 2500), C0031.m5612());
        String strM7593 = C0045.m7593();
        String strM1549 = C0004.m1549(m402(), 185, 7, 1033);
        String strM1840 = C0007.m1840();
        C0053.m8424(map, C0061.m9361(m402(), 194, 4, 2655), C0024.m4752(C0015.m3446(C0015.m3446(strM7593, strM1549, strM1840), C0042.m7151(m402(), 192, 1, 340), strM1840), C0041.m6779(m402(), 193, 1, 920))[0]);
        return map;
    }

    public static String generate13DigitTimestamp() {
        return C0031.m5627(C0009.m2099());
    }

    public static String generateRandomString() {
        SecureRandom secureRandom = new SecureRandom();
        StringBuilder sb = new StringBuilder(16);
        for (int i = 0; i < 16; i++) {
            C0062.m9399(sb, C0007.m1823(C0000.m1077(m402(), 198, 62, 418), C0025.m4817(secureRandom, 62)));
        }
        return C0047.m7763(sb);
    }

    /* renamed from: ۟ۢۤ, reason: not valid java name and contains not printable characters */
    public static JsonArray m397(Object obj, Object obj2) {
        if (C0025.m4797() >= 0) {
            return ((JsonObject) obj).getAsJsonArray((String) obj2);
        }
        return null;
    }

    /* renamed from: ۟ۦۥۤۧ, reason: not valid java name and contains not printable characters */
    public static JsonPrimitive m398(Object obj, Object obj2) {
        if (C0016.m3596() < 0) {
            return ((JsonObject) obj).getAsJsonPrimitive((String) obj2);
        }
        return null;
    }

    /* renamed from: ۣۡۤۢ, reason: not valid java name and contains not printable characters */
    public static String m399(Object obj) {
        if (C0003.m1463() <= 0) {
            return ((JsonPrimitive) obj).getAsString();
        }
        return null;
    }

    /* renamed from: ۣۨۤۧ, reason: not valid java name and contains not printable characters */
    public static Iterator m400(Object obj) {
        if (C0032.m5686() <= 0) {
            return ((JsonArray) obj).iterator();
        }
        return null;
    }

    /* renamed from: ۣۤۦ۠, reason: not valid java name and contains not printable characters */
    public static JsonObject m401(Object obj, Object obj2) {
        if (C0050.m8121() <= 0) {
            return ((JsonObject) obj).getAsJsonObject((String) obj2);
        }
        return null;
    }

    /* renamed from: ۥۥ۠ۡ, reason: contains not printable characters */
    public static short[] m402() {
        if (C0025.m4797() >= 0) {
            return f63short;
        }
        return null;
    }

    /* renamed from: ۨۦۡۨ, reason: not valid java name and contains not printable characters */
    public static JsonObject m403(Object obj) {
        if (C0002.m1242() >= 0) {
            return ((JsonElement) obj).getAsJsonObject();
        }
        return null;
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        ArrayList arrayList = new ArrayList();
        Iterator itM400 = m400(m397(m401((JsonObject) C0033.m5856(C0016.m3588(C0046.m7725(C0008.m2029(C0045.m7628(C0038.m6434(new StringBuilder(), C0045.m7593(), C0019.m4107(m402(), 260, 34, 2979), str2), C0000.m1130(C0001.m1189(m402(), 294, 69, 2169), str, C0033.m5852(m402(), 363, 21, 2431)), C0012.m3049()))), C0008.m2027(this)), JsonObject.class), C0014.m3332(m402(), 384, 4, 2113)), C0013.m3106(m402(), 388, 10, 3072)));
        while (C0012.m2962(itM400)) {
            JsonObject jsonObjectM403 = m403((JsonElement) C0048.m7949(itM400));
            C0004.m1532(arrayList, new m(m399(m398(jsonObjectM403, C0023.m4536(m402(), 398, 6, 926))), m399(m398(jsonObjectM403, C0043.m7290(m402(), 404, 8, 393))), m399(m398(jsonObjectM403, C0047.m7833(m402(), 412, 7, 454))), m399(m398(jsonObjectM403, C0041.m6779(m402(), 419, 11, 332)))));
        }
        return C0020.m4216(C0011.m2808(C0038.m6456(str2)), C0047.m7818(1, str2), C0011.m2808(20), C0054.m8556(str2, 1, 20), arrayList);
    }

    public String detailContent(List<String> list) {
        StringBuilder sb = new StringBuilder();
        C0018.m3933(sb, C0045.m7593());
        C0018.m3933(sb, C0006.m1774(m402(), 430, 34, 2723));
        C0018.m3933(sb, (String) C0048.m7915(list, 0));
        JSONObject jSONObjectM1370 = C0003.m1370(C0003.m1370(new JSONObject(C0016.m3588(C0032.m5769(C0047.m7763(sb), C0012.m3049()), C0008.m2027(this))), C0037.m6307(m402(), 464, 4, 2547)), C0006.m1774(m402(), 468, 6, 2840));
        m mVar = new m();
        String strM1212 = C0001.m1212(jSONObjectM1370, C0029.m5256(m402(), 474, 8, 3144));
        C0011.m2828(mVar, C0001.m1212(jSONObjectM1370, C0006.m1774(m402(), 482, 6, 2444)));
        C0005.m1628(mVar, strM1212);
        C0026.m4947(mVar, C0001.m1212(jSONObjectM1370, C0029.m5256(m402(), 488, 7, 1541)));
        C0058.m9159(mVar, C0001.m1212(jSONObjectM1370, C0042.m7151(m402(), 495, 12, 1161)));
        C0022.m4432(mVar, C0001.m1212(jSONObjectM1370, C0057.m8978(m402(), 507, 8, 1943)));
        StringBuilder sb2 = new StringBuilder();
        C0018.m3933(sb2, C0055.m8703());
        C0018.m3933(sb2, C0001.m1212(jSONObjectM1370, C0061.m9361(m402(), 515, 11, 900)));
        C0027.m5000(mVar, C0047.m7763(sb2));
        StringBuilder sb3 = new StringBuilder();
        C0018.m3933(sb3, C0036.m6189());
        C0018.m3933(sb3, C0001.m1212(jSONObjectM1370, C0037.m6307(m402(), 526, 11, 2278)));
        C0019.m4073(mVar, C0047.m7763(sb3));
        JSONArray jSONArrayM4333 = C0021.m4333(jSONObjectM1370, C0038.m6452(m402(), 537, 13, 2960));
        StringBuilder sb4 = new StringBuilder();
        StringBuilder sb5 = new StringBuilder();
        for (int i = 0; i < C0053.m8396(jSONArrayM4333); i++) {
            JSONObject jSONObjectM3923 = C0018.m3923(jSONArrayM4333, i);
            C0018.m3933(sb5, C0016.m3579());
            String strM8574 = C0054.m8574(m402(), 550, 4, 3171);
            C0018.m3933(sb5, C0001.m1212(jSONObjectM3923, strM8574));
            String strM7833 = C0047.m7833(m402(), 554, 3, 3146);
            C0018.m3933(sb5, strM7833);
            JSONArray jSONArrayM43332 = C0021.m4333(jSONObjectM3923, C0044.m7509(m402(), 557, 4, 735));
            for (int i2 = 0; i2 < C0053.m8396(jSONArrayM43332); i2++) {
                JSONObject jSONObjectM39232 = C0018.m3923(jSONArrayM43332, i2);
                String strM9106 = C0058.m9106(m402(), 561, 4, 1933);
                C0018.m3933(sb4, C0001.m1212(jSONObjectM39232, strM9106));
                C0018.m3933(sb4, C0037.m6307(m402(), 565, 1, 2466));
                C0018.m3933(sb4, C0001.m1212(jSONObjectM39232, C0038.m6452(m402(), 566, 3, 404)));
                String strM5565 = C0031.m5565(m402(), 569, 1, 676);
                C0018.m3933(sb4, strM5565);
                C0018.m3933(sb4, strM1212);
                C0018.m3933(sb4, strM5565);
                C0018.m3933(sb4, C0001.m1212(jSONObjectM3923, strM8574));
                C0018.m3933(sb4, strM5565);
                C0018.m3933(sb4, C0001.m1212(jSONObjectM39232, strM9106));
                C0018.m3933(sb4, C0019.m4107(m402(), 570, 1, 731));
            }
            C0018.m3933(sb4, strM7833);
        }
        C0044.m7449(mVar, C0047.m7763(sb4));
        C0054.m8596(mVar, C0047.m7763(sb5));
        return C0053.m8428(mVar);
    }

    public void getConfig(String str) {
        String strM7290 = C0043.m7290(m402(), 571, 6, 862);
        f = str;
        JSONObject jSONObject = new JSONObject(C0016.m3588(C0032.m5769(C0065.m9804(str, C0016.m3525(m402(), 577, 29, 1971)), C0012.m3049()), C0050.m8070(this)));
        JSONArray jSONArrayM4333 = C0021.m4333(jSONObject, C0052.m8337(m402(), 606, 11, 391));
        try {
            g = C0046.m7725(C0001.m1212(C0003.m1370(jSONObject, strM7290), C0018.m3917(m402(), 617, 11, 2346)));
            this.e = C0024.m4752(C0046.m7725(C0001.m1212(C0003.m1370(jSONObject, strM7290), C0060.m9352(m402(), 628, 5, 1114))), C0018.m3917(m402(), 633, 1, 3071))[0];
            String strM3588 = C0016.m3588(C0046.m7725(C0001.m1212(C0003.m1370(jSONObject, strM7290), C0000.m1077(m402(), 634, 4, 762))), C0027.m5039(this));
            this.d = strM3588;
            this.d = C0054.m8636(C0055.m8717(strM3588), 0, 16);
        } catch (Exception unused) {
        }
        for (int i = 0; i < C0053.m8396(jSONArrayM4333); i++) {
            JSONObject jSONObjectM3923 = C0018.m3923(jSONArrayM4333, i);
            ArrayList arrayListM1389 = C0003.m1389(this);
            StringBuilder sb = new StringBuilder();
            C0018.m3933(sb, C0001.m1212(jSONObjectM3923, C0057.m8978(m402(), 638, 10, 427)));
            String strM8911 = C0056.m8911(m402(), 648, 1, 970);
            C0018.m3933(sb, strM8911);
            C0018.m3933(sb, C0001.m1212(jSONObjectM3923, C0058.m9106(m402(), 649, 12, 2446)));
            C0018.m3933(sb, strM8911);
            C0018.m3933(sb, C0001.m1212(jSONObjectM3923, C0020.m4199(m402(), 661, 9, 1339)));
            C0004.m1532(arrayListM1389, C0047.m7763(sb));
        }
        String strM7321 = C0043.m7321(this);
        if (strM7321 != null) {
            this.a = strM7321;
        }
    }

    public String homeContent(boolean z) {
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArrayM4333 = C0021.m4333(C0003.m1370(new JSONObject(C0016.m3588(C0032.m5769(C0028.m5188(new StringBuilder(), C0045.m7593(), C0051.m8259(m402(), 670, 22, 3184)), C0012.m3049()), C0008.m2027(this))), C0026.m4951(m402(), 692, 4, 1230)), C0028.m5109(m402(), 696, 5, 1125));
        for (int i = 1; i < C0053.m8396(jSONArrayM4333); i++) {
            C0004.m1532(arrayList, new b(C0001.m1212(C0018.m3923(jSONArrayM4333, i), C0061.m9361(m402(), 701, 7, 1668)), C0001.m1212(C0018.m3923(jSONArrayM4333, i), C0014.m3332(m402(), 708, 9, 725)), null));
        }
        return C0003.m1448(C0043.m7321(this), null, arrayList);
    }

    public void init(Context context) {
        C0051.m8194(C0035.m6110());
        C0051.m8277(this, C0045.m7593());
    }

    public void init(Context context, String str) {
        String strM3588 = str;
        C0051.m8194(C0035.m6110());
        if (!C0058.m9127(strM3588, C0060.m9352(m402(), 717, 4, 1572))) {
            strM3588 = C0003.m1451(strM3588);
        }
        if (C0058.m9127(strM3588, C0057.m8978(m402(), 721, 4, 810))) {
            strM3588 = C0016.m3588(C0032.m5769(strM3588, null), C0042.m7151(m402(), 725, 16, 1979));
            Iterator itM3109 = C0013.m3109((List) C0033.m5856(strM3588, ArrayList.class));
            if (C0012.m2962(itM3109)) {
                strM3588 = (String) C0048.m7949(itM3109);
            }
        }
        if (C0057.m8953(strM3588)) {
            return;
        }
        C0051.m8277(this, strM3588);
    }

    public String playerContent(String str, String str2, List<String> list) {
        String strM1840;
        String strM6001 = C0034.m6001(m402(), 741, 1, 1800);
        String[] strArrM4752 = C0024.m4752(str2, strM6001);
        String str3 = null;
        String str4 = (strArrM4752.length <= 0 || C0057.m8953(strArrM4752[0])) ? null : strArrM4752[0];
        String str5 = (strArrM4752.length <= 1 || C0057.m8953(strArrM4752[1])) ? null : strArrM4752[1];
        String str6 = (strArrM4752.length <= 2 || C0057.m8953(strArrM4752[2])) ? null : strArrM4752[2];
        String strM2827 = C0011.m2827(str4, str5, (strArrM4752.length <= 3 || C0057.m8953(strArrM4752[3])) ? null : strArrM4752[3]);
        String strM3588 = C0016.m3588(str4, C0027.m5039(this));
        String strM4340 = C0021.m4340(m402(), 742, 12, 1751);
        if (C0058.m9127(strM3588, strM4340)) {
            strM3588 = C0006.m1778(strM3588, strM4340);
        }
        String strM35882 = C0016.m3588(strM3588, C0008.m2027(this));
        if (C0058.m9127(strM35882, C0025.m4795(m402(), 754, 4, 1114))) {
            if (C0015.m3436(strM35882)) {
                g gVar = new g();
                C0017.m3667(gVar, strM35882);
                C0002.m1282(gVar, strM2827);
                return C0033.m5828(gVar);
            }
            g gVar2 = new g();
            C0017.m3667(gVar2, strM35882);
            C0064.m9646(gVar2);
            C0002.m1282(gVar2, strM2827);
            return C0033.m5828(gVar2);
        }
        int i = 0;
        while (true) {
            ArrayList arrayListM1389 = C0003.m1389(this);
            int iM2139 = C0009.m2139(arrayListM1389);
            strM1840 = C0007.m1840();
            if (i >= iM2139) {
                str3 = strM1840;
                break;
            }
            String str7 = (String) C0028.m5167(arrayListM1389, i);
            StringBuilder sb = new StringBuilder();
            C0018.m3933(sb, str6);
            C0018.m3933(sb, strM6001);
            if (C0058.m9127(str7, C0047.m7763(sb))) {
                String[] strArrM47522 = C0024.m4752((String) C0028.m5167(arrayListM1389, i), strM6001);
                if (strArrM47522.length > 0 && !C0057.m8953(strArrM47522[0])) {
                    String str8 = strArrM47522[0];
                }
                if (strArrM47522.length > 1 && !C0057.m8953(strArrM47522[1])) {
                    str3 = strArrM47522[1];
                }
                if (strArrM47522.length > 2 && !C0057.m8953(strArrM47522[2])) {
                    String str9 = strArrM47522[2];
                }
            } else {
                i++;
            }
        }
        if (str3 == null) {
            g gVar3 = new g();
            C0017.m3667(gVar3, strM35882);
            C0002.m1282(gVar3, strM2827);
            return C0033.m5828(gVar3);
        }
        String strM35883 = C0016.m3588(str3, C0027.m5039(this));
        String strM5188 = C0028.m5188(new StringBuilder(), C0045.m7593(), C0034.m6001(m402(), 758, 30, 1333));
        String strM2037 = C0009.m2037(m402(), 788, 5, 3003);
        String strM7509 = C0044.m7509(m402(), 793, 3, 1147);
        HashMap mapM4127 = C0019.m4127(strM2037, strM35883, strM7509, strM35882);
        C0053.m8424(mapM4127, C0065.m9775(m402(), 796, 8, 2622), strM1840);
        try {
            String strM1212 = C0001.m1212(new JSONObject(C0016.m3588(C0008.m2029(C0003.m1396(strM5188, mapM4127, C0012.m3049())), C0008.m2027(this))), strM7509);
            if (strM1212 != null) {
                g gVar4 = new g();
                C0017.m3667(gVar4, strM1212);
                C0002.m1282(gVar4, strM2827);
                return C0033.m5828(gVar4);
            }
            g gVar5 = new g();
            C0017.m3667(gVar5, strM35882);
            C0064.m9646(gVar5);
            C0002.m1282(gVar5, strM2827);
            return C0033.m5828(gVar5);
        } catch (Exception unused) {
            g gVar6 = new g();
            C0017.m3667(gVar6, strM35882);
            C0064.m9646(gVar6);
            C0002.m1282(gVar6, strM2827);
            return C0033.m5828(gVar6);
        }
    }

    public String searchContent(String str, String str2, boolean z) {
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        C0011.m2747(sb, C0045.m7593(), C0038.m6452(m402(), 804, 27, 480), str, C0030.m5362(m402(), 831, 16, 1449));
        C0018.m3933(sb, str2);
        JSONArray jSONArrayM4333 = C0021.m4333(C0003.m1370(new JSONObject(C0016.m3588(C0032.m5769(C0047.m7763(sb), C0012.m3049()), C0008.m2027(this))), C0065.m9775(m402(), 847, 4, 2510)), C0040.m6584(m402(), 851, 11, 499));
        for (int i = 0; i < C0053.m8396(jSONArrayM4333); i++) {
            JSONObject jSONObjectM3923 = C0018.m3923(jSONArrayM4333, i);
            C0004.m1532(arrayList, new m(C0001.m1212(jSONObjectM3923, C0018.m3917(m402(), 862, 6, 2521)), C0001.m1212(jSONObjectM3923, C0061.m9361(m402(), 868, 8, 1023)), C0001.m1212(jSONObjectM3923, C0065.m9775(m402(), 876, 7, 3026)), C0001.m1212(jSONObjectM3923, C0011.m2805(m402(), 883, 11, 914))));
        }
        return C0047.m7783(arrayList);
    }

    public String searchContent(String str, boolean z) {
        return C0030.m5370(this, C0056.m8909(str), C0014.m3332(m402(), 894, 1, 2261), true);
    }
}