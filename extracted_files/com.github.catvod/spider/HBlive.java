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
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.Z.C0040;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.c1.C0046;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.f0.C0052;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.p.C0057;
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
import com.google.gson.JsonPrimitive;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class HBlive extends Spider {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f48short = {1552, 1548, 1548, 1544, 1547, 1602, 1623, 1623, 1556, 1553, 1550, 1565, 1622, 1557, 1549, 1536, 1553, 1561, 1622, 1566, 1549, 1558, 1623, 1561, 1544, 1553, 1610, 1623, 30943, -29809, 24837, -30838, 23151, -32722, 25585, 991, 982, 935, 3117, 3116, 3134, 3157, 3136, 1837, 2886, 750, 747, 753, 758, 1730, 1735, 1746, 1735, 2550, 2494, 2492, 2477, 2458, 2488, 2477, 2492, 2494, 2486, 2475, 2480, 2492, 2474, 2804, 2811, 2807, 2815, 938, 928, 941, 2356, 2349, 2343, 1593, 1649, 1651, 1634, 1621, 1655, 1634, 1651, 1649, 1657, 1636, 1647, 1604, 1657, 1657, 1659, 1637, 1577, 1663, 1650, 1579, 2823, 2897, 2888, 2885, 2844, 2832, 2823, 2897, 2880, 2886, 2884, 2844, 1921, 1948, 1948, 1950, 1978, 1943, 2168, 2149, 2168, 2144, 2153, 1715, 1727, 1702, 1717, 1698, 1525, 1522, 1528, 1520, 1525, 1530, 1526, 1534, 1876, 2787, 2731, 2729, 2744, 2718, 2723, 2723, 2721, 2696, 2729, 2744, 2733, 2725, 2720, 2803, 2725, 2728, 2801, 627, 630, 611, 630, 1453, 1450, 1442, 1451, 708, 715, 711, 719, 2339, 2351, 2340, 2341, 2736, 2725, 2795, 2957, 2404, 2405, 2403, 2406, 2403, 2413, 2404, 2404, 2407, 2412, 2403, 2404, 2402, 1750, 1757, 1677, 1255, 1254, 1268, 1183, 1162, 412, 2570, 2660, 2661, 2659, 2662, 2659, 2669, 2660, 2660, 2663, 2668, 2659, 2660, 2658, 2570, 2429, 2421, 2400, 2419, 2418, 2398, 2412, 2417, 2429, 2352, 2353, 2355, 1965, 2044, 2040, 2008, 2030, 2024, 2041, 2030, 2047, 1974, 1156, 1239, 1239, 1227, 1222, 1183, 1013, 932, 928, 903, 954, 958, 950, 1006, 3037, 2958, 2962, 2975, 3014, 3018, 3019, 3021, 3016, 3021, 3011, 3018, 3018, 3017, 3010, 3021, 3018, 3020, 3037, 2952, 2974, 2954, 2962, 2975, 3014, 1708, 1772, 1785, 1719, 2540, 2473, 2494, 2483, 2490, 2479, 2551, 2494, 2475, 2488, 2489, 2453, 2471, 2490, 2540, 2494, 2551, 2555, 2554, 2552, 2540, 2492, 2479, 2488, 2551, 2555, 2540, 2489, 2492, 2551, 2552, 2558, 2554, 2555, 2553, 2555, 2554, 2553, 2552, 2555, 2311, 2330, 2311, 2335, 2326, 2255, 2248, 2242, 2250, 2255, 2240, 2252, 2244, 446, 434, 427, 440, 431, 2602, 2605, 2603, 2620, 2616, 2612, 2459, 2462, 2457, 2450, 2436, 3082, 835, 836, 858, 1143, 1029, 1029, 1029, 292, 313, 309, 301, 563, 568, 546, 558, 546, 3169, 3178, 3184, 3196, 3180, 3179, 2133, 2142, 2139, 2142, 2133, 2142, 2139, 2142, -30946, 29449, 24858, -26383, 25872, -28555, 2615, 28844};
    public final String a = C0027.m5062(m294(), 0, 28, 1656);
    public final String b = C0012.m2973(m294(), 28, 7, 1632);

    public static String a(String str) {
        try {
            StringBuilder sb = new StringBuilder(C0020.m4236(new BigInteger(1, C0035.m6159(C0015.m3410(C0052.m8337(m294(), 35, 3, 914)), C0021.m4347(str, C0011.m2805(m294(), 38, 5, 3192)))), 16));
            while (C0006.m1693(sb) < 32) {
                C0019.m4071(sb, 0, C0029.m5256(m294(), 43, 1, 1821));
            }
            return C0023.m4587(C0047.m7763(sb));
        } catch (Exception unused) {
            return C0007.m1840();
        }
    }

    public static String g(StringBuilder sb, String str, String str2) {
        return C0028.m5188(sb, str, str2);
    }

    /* renamed from: ۣ۟ۥۢۥ, reason: not valid java name and contains not printable characters */
    public static short[] m294() {
        if (C0017.m3633() <= 0) {
            return f48short;
        }
        return null;
    }

    /* renamed from: ۟ۤۡ۟۠, reason: not valid java name and contains not printable characters */
    public static JsonPrimitive m295(Object obj, Object obj2) {
        if (C0041.m6823() <= 0) {
            return ((JsonObject) obj).getAsJsonPrimitive((String) obj2);
        }
        return null;
    }

    /* renamed from: ۟ۥۤۥۡ, reason: not valid java name and contains not printable characters */
    public static JsonObject m296(Object obj, Object obj2) {
        if (C0041.m6823() <= 0) {
            return ((JsonObject) obj).getAsJsonObject((String) obj2);
        }
        return null;
    }

    /* renamed from: ۟ۥۣۨۤ, reason: not valid java name and contains not printable characters */
    public static Iterator m297(Object obj) {
        if (C0010.m2320() < 0) {
            return ((JsonArray) obj).iterator();
        }
        return null;
    }

    /* renamed from: ۟ۧۤۡ۠, reason: not valid java name and contains not printable characters */
    public static JsonObject m298(Object obj) {
        if (C0011.m2755() >= 0) {
            return ((JsonElement) obj).getAsJsonObject();
        }
        return null;
    }

    /* renamed from: ۥۣۥۦ, reason: contains not printable characters */
    public static String m299(Object obj) {
        if (C0056.m8886() < 0) {
            return ((JsonPrimitive) obj).getAsString();
        }
        return null;
    }

    /* renamed from: ۦۧۨۥ, reason: contains not printable characters */
    public static JsonArray m300(Object obj, Object obj2) {
        if (C0056.m8886() < 0) {
            return ((JsonObject) obj).getAsJsonArray((String) obj2);
        }
        return null;
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        ArrayList arrayList = new ArrayList();
        String strM1077 = C0000.m1077(m294(), 44, 1, 2923);
        String[] strArrM4752 = C0024.m4752(str, strM1077);
        int length = strArrM4752.length;
        String strM4495 = C0022.m4495(this);
        String strM8477 = C0053.m8477(m294(), 45, 4, 642);
        String strM5708 = C0032.m5708(m294(), 49, 4, 1702);
        if (length == 1) {
            Iterator itM297 = m297(m300((JsonObject) C0033.m5856(C0019.m4042(C0032.m5769(C0028.m5188(C0031.m5621(strM4495), strArrM4752[0], C0003.m1398(m294(), 53, 14, 2521)), C0038.m6454())), JsonObject.class), strM5708));
            while (C0012.m2962(itM297)) {
                JsonObject jsonObjectM298 = m298((JsonElement) C0048.m7949(itM297));
                String strM1774 = C0006.m1774(m294(), 67, 4, 2714);
                String strM299 = m299(m295(jsonObjectM298, strM1774));
                Iterator itM2972 = m297(m300(jsonObjectM298, strM8477));
                while (C0012.m2962(itM2972)) {
                    JsonObject jsonObjectM2982 = m298((JsonElement) C0048.m7949(itM2972));
                    StringBuilder sbM3016 = C0012.m3016(str, strM1077);
                    C0018.m3933(sbM3016, m299(m295(jsonObjectM2982, C0014.m3332(m294(), 71, 3, 969))));
                    C0004.m1532(arrayList, new m(C0047.m7763(sbM3016), m299(m295(jsonObjectM2982, strM1774)), m299(m295(jsonObjectM2982, C0024.m4740(m294(), 74, 3, 2372))), strM299, true));
                    itM297 = itM297;
                }
            }
        }
        if (strArrM4752.length == 2) {
            StringBuilder sbM5621 = C0031.m5621(strM4495);
            C0018.m3933(sbM5621, strArrM4752[0]);
            C0018.m3933(sbM5621, C0051.m8259(m294(), 77, 21, 1558));
            Iterator itM2973 = m297(m300(m296((JsonObject) C0033.m5856(C0019.m4042(C0032.m5769(C0038.m6434(sbM5621, strArrM4752[1], C0063.m9585(m294(), 98, 12, 2849), str2), C0038.m6454())), JsonObject.class), strM5708), strM8477));
            while (C0012.m2962(itM2973)) {
                JsonObject jsonObjectM2983 = m298((JsonElement) C0048.m7949(itM2973));
                StringBuilder sbM30162 = C0012.m3016(str, strM1077);
                C0018.m3933(sbM30162, m299(m295(jsonObjectM2983, C0040.m6584(m294(), 110, 6, 2035))));
                C0004.m1532(arrayList, new m(C0047.m7763(sbM30162), m299(m295(jsonObjectM2983, C0041.m6779(m294(), 116, 5, 2060))), m299(m295(jsonObjectM2983, C0026.m4951(m294(), 121, 5, 1744))), m299(m295(jsonObjectM2983, C0021.m4340(m294(), 126, 8, 1435)))));
            }
        }
        C0047.m7783(arrayList);
        return C0047.m7783(arrayList);
    }

    public String detailContent(List<String> list) {
        ArrayList arrayList;
        String strM1840;
        String[] strArrM4752 = C0024.m4752((String) C0048.m7915(list, 0), C0053.m8477(m294(), 134, 1, 1913));
        StringBuilder sb = new StringBuilder();
        C0018.m3933(sb, C0022.m4495(this));
        C0018.m3933(sb, strArrM4752[0]);
        C0018.m3933(sb, C0065.m9775(m294(), 135, 18, 2764));
        C0018.m3933(sb, strArrM4752[2]);
        String strM7763 = C0047.m7763(sb);
        ArrayList arrayList2 = new ArrayList();
        new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        JsonObject jsonObjectM296 = m296((JsonObject) C0033.m5856(C0019.m4042(C0032.m5769(strM7763, C0038.m6454())), JsonObject.class), C0013.m3106(m294(), 153, 4, 535));
        JsonObject jsonObjectM2962 = m296(jsonObjectM296, C0015.m3484(m294(), 157, 4, 1476));
        String strM4740 = C0024.m4740(m294(), 161, 4, 682);
        if (jsonObjectM2962 != null) {
            String strM299 = m299(m295(jsonObjectM2962, strM4740));
            String strM2992 = m299(m295(jsonObjectM2962, C0014.m3332(m294(), 165, 4, 2368)));
            long jM2099 = C0009.m2099();
            arrayList = arrayList3;
            String strM5627 = C0031.m5627(((jM2099 % 10000000000L) * 1000) + ((long) (C0060.m9294() * 4.294967295E9d)));
            String str = C0024.m4752(strM2992, C0049.m8007(m294(), 169, 3, 2774))[1];
            String strM4340 = C0021.m4340(m294(), 172, 1, 2987);
            String str2 = C0024.m4752(str, strM4340)[0];
            String strM9790 = C0065.m9790((jM2099 / 1000) | 21600);
            String strM56272 = C0031.m5627(C0008.m2023(C0042.m7151(m294(), 173, 13, 2389)) + jM2099);
            StringBuilder sb2 = new StringBuilder();
            String str3 = new String(C0034.m5997(C0027.m5053(C0024.m4752(C0024.m4752(strM2992, C0034.m6001(m294(), 186, 3, 1712))[1], strM4340)[0], C0048.m7902(m294(), 189, 5, 1202)), 2));
            String strM5109 = C0028.m5109(m294(), 194, 1, 451);
            C0018.m3933(sb2, C0024.m4752(str3, strM5109)[0]);
            C0018.m3933(sb2, C0023.m4536(m294(), 195, 15, 2645));
            C0018.m3933(sb2, strM299);
            C0018.m3933(sb2, strM5109);
            StringBuilder sb3 = new StringBuilder();
            C0018.m3933(sb3, strM56272);
            C0018.m3933(sb3, C0065.m9775(m294(), 210, 12, 2305));
            C0018.m3933(sb2, C0015.m3455(C0047.m7763(sb3)));
            C0018.m3933(sb2, strM5109);
            C0018.m3933(sb2, strM9790);
            StringBuilder sbM8368 = C0052.m8368(C0053.m8477(m294(), 222, 10, 1931), C0015.m3455(C0047.m7763(sb2)), C0002.m1305(m294(), 232, 6, 1186), strM5627, C0040.m6584(m294(), 238, 8, 979));
            C0011.m2747(sbM8368, strM9790, C0036.m6188(m294(), 246, 25, 3067), strM56272, C0030.m5362(m294(), 271, 4, 1674));
            strM1840 = C0057.m9018(sbM8368, str2, C0050.m8131(m294(), 275, 40, 2506));
        } else {
            arrayList = arrayList3;
            strM1840 = C0007.m1840();
        }
        String strM2993 = m299(m295(jsonObjectM296, C0018.m3917(m294(), 315, 5, 2419)));
        String strM2994 = m299(m295(jsonObjectM296, C0037.m6307(m294(), 320, 8, 2209)));
        String strM2995 = m299(m295(jsonObjectM296, C0014.m3332(m294(), 328, 5, 477)));
        Iterator itM297 = m297(m300(jsonObjectM296, C0023.m4536(m294(), 333, 6, 2649)));
        while (C0012.m2962(itM297)) {
            JsonObject jsonObjectM298 = m298((JsonElement) C0048.m7949(itM297));
            StringBuilder sb4 = new StringBuilder();
            C0018.m3933(sb4, C0016.m3579());
            C0018.m3933(sb4, m299(m295(jsonObjectM298, strM4740)));
            C0004.m1532(arrayList2, C0047.m7763(sb4));
            ArrayList arrayList4 = new ArrayList();
            Iterator itM2972 = m297(m300(jsonObjectM298, C0050.m8131(m294(), 339, 5, 2551)));
            while (C0012.m2962(itM2972)) {
                JsonObject jsonObjectM2982 = m298((JsonElement) C0048.m7949(itM2972));
                StringBuilder sb5 = new StringBuilder();
                C0018.m3933(sb5, m299(m295(jsonObjectM2982, strM4740)));
                C0018.m3933(sb5, C0065.m9775(m294(), 344, 1, 3118));
                C0018.m3933(sb5, m299(m295(jsonObjectM2982, C0041.m6779(m294(), 345, 3, 822))));
                C0018.m3933(sb5, strM1840);
                C0004.m1532(arrayList4, C0047.m7763(sb5));
            }
            C0004.m1532(arrayList, C0036.m6194(C0027.m5062(m294(), 348, 1, 1108), arrayList4));
        }
        m mVar = new m();
        C0019.m4073(mVar, strM2994);
        C0005.m1628(mVar, strM2993);
        C0026.m4947(mVar, strM2995);
        String strM6001 = C0034.m6001(m294(), 349, 3, 1057);
        C0054.m8596(mVar, C0036.m6194(strM6001, arrayList2));
        C0044.m7449(mVar, C0036.m6194(strM6001, arrayList));
        return C0053.m8428(mVar);
    }

    public String homeContent(boolean z) {
        ArrayList arrayList = new ArrayList();
        List listM1203 = C0001.m1203(new String[]{C0019.m4107(m294(), 352, 4, 332), C0039.m6551(m294(), 356, 5, 599), C0053.m8477(m294(), 361, 6, 3077), C0002.m1305(m294(), 367, 8, 2103)});
        List listM12032 = C0001.m1203(new String[]{C0060.m9352(m294(), 375, 2, 336), C0024.m4740(m294(), 377, 2, 1165), C0027.m5062(m294(), 379, 2, 1926), C0046.m7718(m294(), 381, 2, 2677)});
        for (int i = 0; i < C0064.m9636(listM1203); i++) {
            C0004.m1532(arrayList, new b((String) C0048.m7915(listM1203, i), (String) C0048.m7915(listM12032, i), null));
        }
        return C0003.m1448(C0029.m5254(this), null, arrayList);
    }

    public void init(Context context) {
    }

    public String playerContent(String str, String str2, List<String> list) {
        g gVar = new g();
        C0017.m3667(gVar, str2);
        C0006.m1720(gVar, 0);
        return C0033.m5828(gVar);
    }
}