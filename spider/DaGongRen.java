package com.github.catvod.spider;

import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.E.b;
import com.github.catvod.spider.merge.E.g;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.J0.C0021;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.S0.C0028;
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
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.Z.C0040;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.merge.c1.C0046;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.merge.f0.C0052;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.q.C0058;
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
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.c0.C0010;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.r.C0014;
import com.github.catvod.spider.p000mergexbpq.x.C0015;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import java.io.PrintStream;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;

/* loaded from: classes.dex */
public class DaGongRen extends Spider {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f14short = {1632, 1606, 1616, 1607, 1560, 1652, 1618, 1616, 1627, 1601, 2280, 2250, 2271, 2252, 2249, 2249, 2244, 2186, 2192, 2187, 2197, 2181, 2189, 2290, 2252, 2251, 2241, 2250, 2258, 2262, 2181, 2283, 2289, 2181, 2196, 2197, 2187, 2197, 2206, 2181, 2290, 2252, 2251, 2195, 2193, 2206, 2181, 2269, 2195, 2193, 2188, 2181, 2276, 2261, 2261, 2249, 2240, 2290, 2240, 2247, 2286, 2252, 2257, 2186, 2192, 2198, 2194, 2187, 2198, 2195, 2181, 2189, 2286, 2285, 2289, 2280, 2281, 2185, 2181, 2249, 2252, 2254, 2240, 2181, 2274, 2240, 2246, 2254, 2250, 2188, 2181, 2278, 2253, 2263, 2250, 2248, 2240, 2186, 2196, 2199, 2199, 2187, 2197, 2187, 2197, 2187, 2197, 2181, 2294, 2244, 2243, 2244, 2263, 2252, 2186, 2192, 2198, 2194, 2187, 2198, 2195, 2603, 2572, 2576, 2583, 477, 472, 478, 470, 471, 478, 459, 476, 471, 392, 407, 474, 470, 468, 445, 436, 453, 1303, 1310, 1391, 1402, 22522, 24220, 1376, 1402, 1037, 1105, 1098, 1101, 1109, 1039, 2901, 2901, 2901, 2901, 2901, 2901, 2901, 2901, 1697, 1697, 1697, 1698, 1764, 1784, 1761, 1760, 2880, 2908, 2908, 2904, 2907, 2834, 2823, 2823, 2892, 2889, 2895, 2887, 2886, 2895, 2906, 2893, 2886, 2841, 2822, 2891, 2887, 2885, 477, 402, 458, 467, 472, 464, 469, 463, 456, 483, 456, 468, 457, 465, 478, 2722, 2727, 2738, 2727, 2795, 2729, 2740, 2735, 2721, 2735, 2728, 2727, 2730, 1283, 1305, 1294, 1293, 603, 582, 603, 579, 586, 2386, 2382, 2382, 2378, 931, 493, 497, 497, 501, 502, 447, 426, 426, 481, 484, 482, 490, 491, 482, 503, 480, 491, 436, 427, 486, 490, 488, 426, 501, 489, 484, 508, 426, 2581, 2639, 2643, 2569, 2580, 2569, 2577, 2584, 2643, 2576, 2588, 2575, 2586, 2580, 2579, 2594, 2637, 3043, 3054, 3057, 2985, 3063, 3051, 3046, 3070, 3032, 3057, 3051, 3054, 3060, 3059, 3032, 3059, 3055, 3058, 3050, 3045, 2254, 2251, 2270, 2251, 2183, 2245, 2264, 2243, 2253, 2243, 2244, 2251, 2246, 1393, 1396, 1331, 1385, 1404, 1407, 1328, 1389, 1393, 1404, 1380, 952, 929, 995, 942, 930, 931, 953, 936, 931, 953, 914, 957, 929, 940, 948, 929, 932, 958, 953, 1479, 1479, 1479, 2259, 1296, 1359, 1363, 1374, 1350, 1296, 468, 462, 473, 474, 2732, 2454, 3038, 3010, 3010, 3014, 3013, 2956, 2969, 2969, 3026, 3031, 3025, 3033, 3032, 3025, 3012, 3027, 3032, 2951, 2968, 3029, 3033, 3035, 2875, 2870, 2878, 2865, 2854, 2870, 2865, 2872, 1950, 1939, 1947, 1940, 1929, 1938, 1939, 1936, 1935, 3077, 3088, 3089, 3096, 3078, 3094, 550, 557, 556, 549, 559, 547, 556, 1443, 1440, 1445, 1468, 1465, 1440, 1448, 1447, 3191, 3182, 3189, 3191, 3186, 3179, 3186, 3194, 3189, 30270, 23674, -31397, 29800, 22754, 32646, -32000, 23068, 26527, 31624, 23159, 30565, 31948, 22378, 3017, 3029, 3029, 3025, 3026, 2971, 2958, 2958, 3013, 3008, 3014, 3022, 3023, 3014, 3027, 3012, 3023, 2960, 2959, 3010, 3022, 3020, 1068, 1123, 1083, 1058, 1065, 1057, 1060, 1086, 1081, 1042, 1081, 1061, 1080, 1056, 1071, 1099, 1102, 1115, 1102, 1026, 1088, 1117, 1094, 1096, 1094, 1089, 1102, 1091, 1068, 1078, 1057, 1058, 2289, 2284, 2289, 2281, 2272, 645, 665, 665, 669, 2566, 3006, 2978, 2978, 2982, 2981, 3052, 3065, 3065, 2994, 2999, 2993, 3001, 3000, 2993, 2980, 2995, 3000, 3047, 3064, 2997, 3001, 3003, 3065, 2982, 3002, 2999, 2991, 3065, 1457, 1510, 1505, 1535, 1487, 1457, 1449, 1487, 1457, 1467, 1469, 1465, 1452, 1466, 1487, 1457, 1471, 1487, 1457, 1510, 1505, 1535, 1484, 1533, 1526, 1515, 1511, 1487, 1457, 1449, 769, 768, 786, 889, 876, 764, 1149, 427, 439, 439, 435, 432, 505, 492, 492, 423, 418, 420, 428, 429, 420, 433, 422, 429, 498, 493, 416, 428, 430, 492, 432, 422, 418, 433, 416, 427, 494, 494, 494, 494, 494, 494, 494, 494, 494, 494, 494, 494, 494, 494, 493, 427, 439, 430, 431, 508, 436, 423, 510, 670, 659, 652, 724, 649, 671, 667, 648, 665, 658, 662, 659, 649, 654, 677, 659, 663, 669, 3175, 3170, 3191, 3170, 3118, 3180, 3185, 3178, 3172, 3178, 3181, 3170, 3183, 569, 547, 564, 567, 518, 539, 518, 542, 535, 1222, 1242, 1242, 1246, 774, 794, 794, 798, 797, 852, 833, 833, 778, 783, 777, 769, 768, 777, 796, 779, 768, 863, 832, 781, 769, 771, 399, 470, 457, 452, 453, 463, 399, 1551, 1609, 1621, 1612, 1613, 399, 403, 399, 403, 396, 458, 470, 463, 462};

    public static HashMap a() {
        return C0019.m4127(C0005.m1645(m103(), 0, 10, 1589), C0038.m6452(m103(), 10, 111, 2213), C0052.m8337(m103(), 121, 4, 2659), C0063.m9585(m103(), 125, 14, 441));
    }

    /* renamed from: ۦۦ۟۠, reason: contains not printable characters */
    public static short[] m103() {
        if (C0009.m2047() >= 0) {
            return f14short;
        }
        return null;
    }

    public String MD5(String str) {
        try {
            byte[] bArrM6159 = C0035.m6159(C0015.m3410(C0052.m8337(m103(), 139, 3, 496)), C0050.m8115(str));
            StringBuilder sb = new StringBuilder();
            for (byte b : bArrM6159) {
                String strM8889 = C0056.m8889(b & 255);
                if (C0004.m1584(strM8889) == 1) {
                    C0062.m9399(sb, '0');
                }
                C0018.m3933(sb, strM8889);
            }
            PrintStream printStreamM6087 = C0035.m6087();
            StringBuilder sb2 = new StringBuilder();
            C0018.m3933(sb2, C0002.m1305(m103(), 142, 8, 1370));
            C0018.m3933(sb2, C0047.m7763(sb));
            C0012.m2969(printStreamM6087, C0047.m7763(sb2));
            return C0047.m7763(sb);
        } catch (NoSuchAlgorithmException e) {
            C0049.m7975(e);
            return C0007.m1840();
        }
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        ArrayList arrayList = new ArrayList();
        String strM9145 = C0058.m9145(C0040.m6584(m103(), 150, 6, 1058), str, C0064.m9599(m103(), 156, 8, 2936), str2, C0063.m9585(m103(), 164, 8, 1676));
        String strM9106 = C0058.m9106(m103(), 172, 22, 2856);
        Iterator itM7807 = C0047.m7807(C0030.m5333(C0016.m3577(C0032.m5769(C0026.m4915(strM9106, strM9145), C0020.m4218())), C0048.m7902(m103(), 194, 15, 444)));
        while (C0012.m2962(itM7807)) {
            m mVar = (m) C0048.m7949(itM7807);
            try {
                String strM2339 = C0010.m2339(mVar, C0027.m5062(m103(), 209, 13, 2758));
                String strM23392 = C0010.m2339(mVar, C0021.m4340(m103(), 222, 4, 1387));
                String strM23393 = C0010.m2339(mVar, C0010.m2300(m103(), 226, 5, 559));
                if (!C0043.m7277(strM2339, C0035.m6131(m103(), 231, 4, 2362))) {
                    StringBuilder sb = new StringBuilder();
                    C0018.m3933(sb, strM9106);
                    C0018.m3933(sb, strM2339);
                    strM2339 = C0047.m7763(sb);
                }
                C0004.m1532(arrayList, new com.github.catvod.spider.merge.E.m(C0024.m4752(strM23392, C0009.m2037(m103(), 235, 1, 908))[2], strM23393, strM2339));
            } catch (Exception unused) {
            }
        }
        return C0020.m4216(C0011.m2808(C0038.m6456(str2)), C0047.m7818(1, str2), C0011.m2808(20), C0054.m8556(str2, 1, 20), arrayList);
    }

    public String detailContent(List<String> list) {
        h hVarM3577 = C0016.m3577(C0032.m5769(C0050.m8125(C0062.m9389(m103(), 236, 28, 389), (String) C0048.m7915(list, 0)), C0020.m4218()));
        String strM4684 = C0024.m4684(C0030.m5333(hVarM3577, C0025.m4795(m103(), 264, 17, 2685)));
        String strM2339 = C0010.m2339((m) C0028.m5161(C0030.m5333(hVarM3577, C0047.m7833(m103(), 281, 20, 2951)), 0), C0050.m8131(m103(), 301, 13, 2218));
        d dVarM5333 = C0030.m5333(hVarM3577, C0044.m7509(m103(), 314, 11, 1309));
        d dVarM53332 = C0030.m5333(hVarM3577, C0004.m1549(m103(), 325, 19, 973));
        String strM1840 = C0007.m1840();
        String strM5172 = strM1840;
        String strM51722 = strM5172;
        int i = 0;
        while (i < C0009.m2095(dVarM5333)) {
            String strM9669 = C0064.m9669((m) C0028.m5161(dVarM5333, i));
            boolean zM1815 = C0007.m1815(strM1840, strM5172);
            String strM8131 = C0050.m8131(m103(), 344, 3, 1507);
            strM5172 = !zM1815 ? C0028.m5172(strM5172, strM8131, strM9669) : C0065.m9804(strM5172, strM9669);
            d dVarM53333 = C0030.m5333((m) C0028.m5161(dVarM53332, i), C0021.m4340(m103(), 347, 1, 2226));
            String strM7763 = strM1840;
            int i2 = 0;
            while (i2 < C0009.m2095(dVarM53333)) {
                boolean zM18152 = C0007.m1815(strM1840, strM7763);
                String strM8814 = C0055.m8814(m103(), 348, 6, 1343);
                String strM9361 = C0061.m9361(m103(), 354, 4, 444);
                d dVar = dVarM53332;
                String strM81312 = C0050.m8131(m103(), 358, 1, 2696);
                StringBuilder sbM3016 = !zM18152 ? C0012.m3016(strM7763, C0057.m8978(m103(), 359, 1, 2485)) : C0031.m5621(strM7763);
                C0018.m3933(sbM3016, C0064.m9669((m) C0028.m5161(dVarM53333, i2)));
                C0018.m3933(sbM3016, strM81312);
                C0018.m3933(sbM3016, C0015.m3446(C0010.m2339((m) C0028.m5161(dVarM53333, i2), strM9361), strM8814, strM1840));
                strM7763 = C0047.m7763(sbM3016);
                i2++;
                dVarM53332 = dVar;
            }
            d dVar2 = dVarM53332;
            strM51722 = !C0007.m1815(strM1840, strM51722) ? C0028.m5172(strM51722, strM8131, strM7763) : C0065.m9804(strM51722, strM7763);
            i++;
            dVarM53332 = dVar2;
        }
        com.github.catvod.spider.merge.E.m mVar = new com.github.catvod.spider.merge.E.m();
        C0011.m2828(mVar, (String) C0048.m7915(list, 0));
        StringBuilder sb = new StringBuilder(C0021.m4340(m103(), 360, 22, 2998));
        C0018.m3933(sb, strM2339);
        C0026.m4947(mVar, C0047.m7763(sb));
        C0005.m1628(mVar, strM4684);
        C0054.m8596(mVar, strM5172);
        C0044.m7449(mVar, strM51722);
        return C0053.m8428(mVar);
    }

    public String homeContent(boolean z) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        String[] strArr = {C0016.m3525(m103(), 382, 8, 2911), C0055.m8814(m103(), 390, 9, 2042), C0041.m6779(m103(), 399, 6, 3199), C0048.m7902(m103(), 405, 7, 578), C0046.m7718(m103(), 412, 8, 1481), C0037.m6307(m103(), 420, 9, 3099)};
        String[] strArr2 = {C0026.m4951(m103(), 429, 2, 779), C0000.m1077(m103(), 431, 3, 2693), C0056.m8911(m103(), 434, 2, 378), C0000.m1077(m103(), 436, 2, 2228), C0043.m7290(m103(), 438, 3, 1314), C0045.m7657(m103(), 441, 2, 1347)};
        for (int i = 0; i < 6; i++) {
            C0004.m1532(arrayList2, new b(strArr[i], strArr2[i], null));
        }
        HashMap mapM4218 = C0020.m4218();
        String strM8574 = C0054.m8574(m103(), 443, 22, 2977);
        Iterator itM7807 = C0047.m7807(C0030.m5333(C0016.m3577(C0032.m5769(strM8574, mapM4218)), C0036.m6188(m103(), 465, 15, 1101)));
        while (C0012.m2962(itM7807)) {
            m mVar = (m) C0048.m7949(itM7807);
            try {
                String strM2339 = C0010.m2339(mVar, C0042.m7151(m103(), 480, 13, 1071));
                String strM23392 = C0010.m2339(mVar, C0003.m1398(m103(), 493, 4, 1092));
                String strM23393 = C0010.m2339(mVar, C0064.m9599(m103(), 497, 5, 2181));
                if (!C0043.m7277(strM2339, C0001.m1189(m103(), 502, 4, 749))) {
                    StringBuilder sb = new StringBuilder();
                    C0018.m3933(sb, strM8574);
                    C0018.m3933(sb, strM2339);
                    strM2339 = C0047.m7763(sb);
                }
                C0004.m1532(arrayList, new com.github.catvod.spider.merge.E.m(C0024.m4752(strM23392, C0007.m1842(m103(), 506, 1, 2601))[2], strM23393, strM2339));
            } catch (Exception unused) {
            }
        }
        return C0025.m4831(arrayList2, arrayList);
    }

    public String playerContent(String str, String str2, List<String> list) {
        Matcher matcherM6026 = C0034.m6026(C0005.m1602(C0012.m2973(m103(), 535, 30, 1427)), C0000.m1081(C0016.m3577(C0032.m5769(C0050.m8125(C0006.m1774(m103(), 507, 28, 3030), str2), null))));
        String strM1840 = C0003.m1405(matcherM6026) ? C0024.m4752(C0027.m5053(C0021.m4306(matcherM6026, 1), C0057.m8978(m103(), 565, 5, 852)), C0040.m6584(m103(), 570, 1, 730))[0] : C0007.m1840();
        g gVar = new g();
        C0017.m3667(gVar, strM1840);
        C0057.m9029(gVar, C0020.m4218());
        return C0033.m5828(gVar);
    }

    public String searchContent(String str, boolean z) {
        String strM5565 = C0031.m5565(m103(), 571, 1, 1052);
        ArrayList arrayList = new ArrayList();
        Iterator itM7807 = C0047.m7807(C0030.m5333(C0016.m3577(C0032.m5769(C0050.m8125(C0053.m8477(m103(), 572, 52, 451), C0056.m8909(str)), C0020.m4218())), C0035.m6131(m103(), 624, 18, 762)));
        while (C0012.m2962(itM7807)) {
            m mVar = (m) C0048.m7949(itM7807);
            try {
                String strM8058 = C0049.m8058(C0030.m5333(mVar, strM5565), C0014.m3332(m103(), 642, 13, 3075));
                String strM80582 = C0049.m8058(C0030.m5333(mVar, strM5565), C0044.m7509(m103(), 655, 4, 593));
                String strM80583 = C0049.m8058(C0030.m5333(mVar, strM5565), C0041.m6779(m103(), 659, 5, 626));
                if (!C0043.m7277(strM8058, C0056.m8911(m103(), 664, 4, 1198))) {
                    StringBuilder sb = new StringBuilder();
                    C0018.m3933(sb, C0021.m4340(m103(), 668, 22, 878));
                    C0018.m3933(sb, strM8058);
                    strM8058 = C0047.m7763(sb);
                }
                C0004.m1532(arrayList, new com.github.catvod.spider.merge.E.m(C0015.m3446(C0015.m3446(strM80582, C0039.m6551(m103(), 690, 7, 416), C0007.m1840()), C0039.m6551(m103(), 697, 5, 1569), C0024.m4740(m103(), 702, 9, 418)), strM80583, strM8058));
            } catch (Exception unused) {
            }
        }
        return C0047.m7783(arrayList);
    }
}