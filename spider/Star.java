package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.J0.C0021;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.M.b;
import com.github.catvod.spider.merge.M.c;
import com.github.catvod.spider.merge.M.d;
import com.github.catvod.spider.merge.M.e;
import com.github.catvod.spider.merge.M.f;
import com.github.catvod.spider.merge.M.g;
import com.github.catvod.spider.merge.M.h;
import com.github.catvod.spider.merge.N.C0023;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.T0.m;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.Z.C0040;
import com.github.catvod.spider.merge.Z0.C0041;
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
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.r0.C0059;
import com.github.catvod.spider.merge.r0.C0060;
import com.github.catvod.spider.merge.t.C0061;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.merge.z.C0065;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
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
import com.github.catvod.spider.p000mergexbpq.x.C0015;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class Star extends Spider {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f104short = {2648, 2572, 2567, 2576, 2570, 997, 991, 899, 989, 972, 900, 965, 924, 983, 986, 924, 900, 924, 1835, 1829, 1835, 1895, 1896, 1892, 1900, 1835, 1843, 1835, 928, 1023, 941, 991, 2492, 2504, 2438, 2490, 2383, 2450, 2484, 2466, 2485, 2538, 2438, 2464, 2466, 2473, 2483, 2843, 2873, 2860, 2879, 2874, 2874, 2871, 2937, 2915, 2936, 2918, 2934, 2942, 2817, 2879, 2872, 2866, 2873, 2849, 2853, 2934, 2840, 2818, 2934, 2919, 2918, 2936, 2918, 2925, 2934, 2817, 2879, 2872, 2912, 2914, 2925, 2934, 2862, 2912, 2914, 2943, 2934, 2839, 2854, 2854, 2874, 2867, 2817, 2867, 2868, 2845, 2879, 2850, 2937, 2915, 2917, 2913, 2936, 2917, 2912, 2934, 2942, 2845, 2846, 2818, 2843, 2842, 2938, 2934, 2874, 2879, 2877, 2867, 2934, 2833, 2867, 2869, 2877, 2873, 2943, 2934, 2837, 2878, 2852, 2873, 2875, 2867, 2937, 2919, 2916, 2916, 2936, 2918, 2936, 2918, 2936, 2918, 2934, 2821, 2871, 2864, 2871, 2852, 2879, 2937, 2915, 2917, 2913, 2936, 2917, 2912, 2954, 3005, 3006, 3005, 2986, 3005, 2986, 2862, 2866, 2866, 2870, 2869, 2940, 2921, 2921, 2865, 2865, 2865, 2920, 2862, 2863, 2869, 2866, 2855, 2868, 2920, 2866, 2864, 2921, 756, 672, 683, 700, 678, 2914, 2023, 2043, 2047, 2028, 1979, 1974, 1983, 1962, 1987, 2000, 1991, 1987, 1381, 1401, 1401, 1405, 1406, 1335, 1314, 1314, 1388, 1402, 1406, 1315, 1400, 1377, 1380, 1403, 1384, 1401, 1403, 1315, 1379, 1384, 1401, 1314, 1403, 1342, 1314, 1402, 1384, 1391, 1314, 1388, 1405, 1380, 1314, 1387, 1380, 1377, 1401, 1384, 1407, 1989, 1984, 2005, 1984, 2134, 2131, 2121, 2126, 2168, 2148, 2148, 2144, 2147, 2090, 2111, 2111, 2151, 2151, 2151, 2110, 2168, 2169, 2147, 2148, 2161, 2146, 2110, 2148, 2150, 2111, 2150, 2175, 2164, 2111, 2164, 2165, 2148, 2161, 2169, 2172, 2111, 1568, 1628, 1628, 1613, 1606, 1627, 1623, 1628, 1607, 1602, 1623, 1602, 1628, 1628, 2588, 2590, 2563, 2588, 2591, 1344, 1361, 1367, 1365, 1376, 1346, 1375, 1344, 1347, 1710, 1698, 1697, 1697, 1704, 1710, 1721, 1700, 1698, 1699, 1668, 1699, 1707, 1698, 1512, 694, 2611, 2611, 2611, 276, 264, 264, 268, 271, 326, 339, 339, 267, 267, 267, 338, 276, 277, 271, 264, 285, 270, 338, 264, 266, 339, 1188, 1258, 1255, 1255, 1188, 1258, 1255, 1255, 1188, 1258, 1255, 1255, 3219, 3311, 3311, 3326, 3317, 3304, 3300, 3311, 3316, 3313, 3300, 3313, 3311, 3311, 1066, 1064, 1077, 1066, 1065, 2795, 2810, 2812, 2814, 2763, 2793, 2804, 2795, 2792, 2314, 2309, 2304, 2328, 2313, 2334, 2351, 2307, 2306, 2312, 2309, 2328, 2309, 2307, 2306, 1547, 1559, 1559, 1555, 1552, 1625, 1612, 1612, 1556, 1556, 1556, 1613, 1547, 1546, 1552, 1559, 1538, 1553, 1613, 1559, 1557, 1612, 2440, 2548, 2548, 2533, 2542, 2547, 2559, 2548, 2543, 2538, 2559, 2538, 2548, 2548, 578, 576, 605, 578, 577, 1953, 1968, 1974, 1972, 1921, 1955, 1982, 1953, 1954, 832, 834, 849, 839, 848, 29161, -29414, 29224, 24689, 1143, 1141, 1132, 1139, 1151, 30417, 23701, 2056, 2078, 2061, 2049, 2061, 29903, -30660, 21405, 1637, 1642, 1645, 1641, 1637, 1648, 1645, 1643, 1642, 20716, 28015, 1511, 1520, 1507, 1528, 1524, 1509, 1512, 29901, -30645, 3155, 3151, 3151, 3147, 3144, 3073, 3092, 3092, 3148, 3148, 3148, 3093, 3155, 3154, 3144, 3151, 3162, 3145, 3093, 3151, 3149, 3092, 2438, 2454, 2439, 2460, 2437, 2433, 1196, 1197, 1212, 712, 735, 707, 710, 718, 743, 715, 708, 707, 716, 719, 729, 734, 644, 704, 729, 2328, 492, 496, 496, 500, 503, 446, 427, 427, 499, 499, 499, 426, 492, 493, 503, 496, 485, 502, 426, 496, 498, 427, 475, 490, 481, 508, 496, 427, 480, 485, 496, 485, 427, 2920, 2868, 2850, 2854, 2869, 2852, 2863, 2921, 2861, 2868, 2856, 2857, 2936, 2864, 2856, 2869, 2851, 2938, 3040, 3057, 3063, 3061, 3008, 3042, 3071, 3040, 3043, 694, 689, 694, 683, 659, 694, 684, 683};
    public LinkedHashMap a;
    public String b;

    public static String a(List list) {
        StringBuilder sb = new StringBuilder();
        Iterator itM3109 = C0013.m3109(list);
        while (C0012.m2962(itM3109)) {
            f fVar = (f) C0048.m7949(itM3109);
            StringBuilder sb2 = new StringBuilder();
            C0018.m3933(sb2, C0002.m1294(fVar));
            C0018.m3933(sb2, C0038.m6452(m542(), 0, 5, 2679));
            String strM7763 = C0047.m7763(sb2);
            String strM1294 = C0002.m1294(fVar);
            String strM12942 = C0002.m1294(fVar);
            StringBuilder sbM8368 = C0052.m8368(C0038.m6452(m542(), 5, 13, 958), strM7763, C0024.m4740(m542(), 18, 10, 1801), strM1294, C0044.m7509(m542(), 28, 4, 898));
            C0018.m3933(sbM8368, strM12942);
            C0018.m3933(sbM8368, C0048.m7902(m542(), 32, 4, 2535));
            C0018.m3933(sb, C0047.m7763(sbM8368));
            C0018.m3933(sb, C0030.m5362(m542(), 36, 1, 2403));
        }
        return C0033.m5862(C0047.m7763(sb));
    }

    public static HashMap b() {
        return C0019.m4127(C0039.m6551(m542(), 37, 10, 2503), C0013.m3106(m542(), 47, 111, 2902), C0029.m5256(m542(), 158, 7, 3032), C0037.m6307(m542(), 165, 22, 2886));
    }

    /* renamed from: ۟ۤۦۣۥ, reason: not valid java name and contains not printable characters */
    public static short[] m542() {
        if (C0038.m6471() > 0) {
            return f104short;
        }
        return null;
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        if (C0060.m9349(str, C0030.m5362(m542(), 187, 5, 731))) {
            return C0056.m8856(this, C0024.m4752(str, C0060.m9352(m542(), 192, 1, 2893))[0], true);
        }
        String strM7509 = C0044.m7509(m542(), 193, 4, 1950);
        boolean zM9098 = C0058.m9098(map, strM7509);
        String strM1840 = C0007.m1840();
        String str3 = zM9098 ? (String) C0065.m9715(map, strM7509) : strM1840;
        String strM4951 = C0026.m4951(m542(), 197, 4, 1999);
        String str4 = C0058.m9098(map, strM4951) ? (String) C0065.m9715(map, strM4951) : strM1840;
        String strM4199 = C0020.m4199(m542(), 201, 4, 1954);
        if (C0058.m9098(map, strM4199)) {
            strM1840 = (String) C0065.m9715(map, strM4199);
        }
        g gVar = new g();
        C0056.m8913(gVar);
        C0003.m1363(gVar, (String) C0038.m6401(C0015.m3442(this), str));
        C0048.m7954(gVar, C0011.m2808(C0038.m6456(str2)));
        if (C0004.m1584(str3) > 0) {
            C0018.m3967(gVar, str3);
        }
        if (C0004.m1584(str4) > 0) {
            C0016.m3573(gVar, str4);
        }
        if (C0004.m1584(strM1840) > 0) {
            C0003.m1368(gVar, strM1840);
        }
        List listM2051 = C0009.m2051(C0041.m6770(C0021.m4333(C0003.m1370(new JSONObject(C0008.m2029(C0045.m7628(C0043.m7290(m542(), 205, 41, 1293), C0024.m4674(gVar), null))), C0007.m1842(m542(), 246, 4, 1953)), C0054.m8574(m542(), 250, 4, 2106))));
        ArrayList arrayList = new ArrayList();
        Iterator itM3109 = C0013.m3109(listM2051);
        while (C0012.m2962(itM3109)) {
            C0004.m1532(arrayList, C0059.m9239((b) C0048.m7949(itM3109)));
        }
        return C0047.m7783(arrayList);
    }

    public String detailContent(List<String> list) {
        e eVar = (e) C0033.m5856(C0004.m1539(C0003.m1370(C0003.m1370(C0003.m1370(new JSONObject(C0062.m9381((m) C0028.m5161(C0030.m5333(C0016.m3577(C0032.m5769(C0050.m8125(C0050.m8131(m542(), 254, 33, 2064), (String) C0048.m7915(list, 0)), C0050.m8123())), C0028.m5109(m542(), 287, 14, 1539)), 0))), C0018.m3917(m542(), 301, 5, 2668)), C0036.m6188(m542(), 306, 9, 1328)), C0024.m4740(m542(), 315, 14, 1741))), e.class);
        com.github.catvod.spider.merge.E.m mVar = new com.github.catvod.spider.merge.E.m();
        C0011.m2828(mVar, (String) C0048.m7915(list, 0));
        C0022.m4432(mVar, C0023.m4605(eVar));
        C0005.m1628(mVar, C0002.m1284(eVar));
        C0026.m4947(mVar, C0021.m4320(eVar));
        C0017.m3671(mVar, C0028.m5181(eVar));
        C0027.m5000(mVar, C0030.m5422(eVar));
        C0019.m4073(mVar, C0060.m9335(eVar));
        C0058.m9152(mVar, C0035.m6151(C0048.m7952(eVar)));
        C0058.m9159(mVar, C0035.m6151(C0031.m5599(eVar)));
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator itM3109 = C0013.m3109(C0038.m6469(eVar));
        while (C0012.m2962(itM3109)) {
            d dVar = (d) C0048.m7949(itM3109);
            ArrayList arrayList3 = new ArrayList();
            Iterator itM31092 = C0013.m3109(C0038.m6436(dVar));
            while (C0012.m2962(itM31092)) {
                h hVar = (h) C0048.m7949(itM31092);
                StringBuilder sb = new StringBuilder();
                C0036.m6177(sb, C0048.m7891(hVar));
                C0018.m3933(sb, C0040.m6584(m542(), 329, 1, 1484));
                C0018.m3933(sb, C0043.m7308(hVar));
                C0004.m1532(arrayList3, C0047.m7763(sb));
            }
            C0004.m1532(arrayList2, C0036.m6194(C0061.m9361(m542(), 330, 1, 661), arrayList3));
            C0004.m1532(arrayList, C0025.m4860(dVar));
        }
        String strM8814 = C0055.m8814(m542(), 331, 3, 2583);
        C0044.m7449(mVar, C0036.m6194(strM8814, arrayList2));
        C0054.m8596(mVar, C0036.m6194(strM8814, arrayList));
        return C0053.m8428(mVar);
    }

    public String homeContent(boolean z) {
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator itM5199 = C0029.m5199(C0048.m7895(C0015.m3442(this)));
        while (C0012.m2962(itM5199)) {
            Map.Entry entry = (Map.Entry) C0048.m7949(itM5199);
            C0004.m1532(arrayList, new com.github.catvod.spider.merge.E.b((String) C0045.m7624(entry), (String) C0039.m6540(entry), null));
        }
        Iterator itM7816 = C0047.m7816(arrayList);
        while (C0012.m2962(itM7816)) {
            com.github.catvod.spider.merge.E.b bVar = (com.github.catvod.spider.merge.E.b) C0048.m7949(itM7816);
            StringBuilder sb = new StringBuilder(C0029.m5256(m542(), 334, 22, 380));
            C0018.m3933(sb, C0052.m8377(bVar));
            C0018.m3933(sb, C0043.m7290(m542(), 356, 12, 1163));
            C0037.m6362(linkedHashMap, C0052.m8377(bVar), C0060.m9353((c) C0033.m5856(C0004.m1539(C0003.m1370(C0003.m1370(C0003.m1370(new JSONObject(C0062.m9381((m) C0028.m5161(C0030.m5333(C0016.m3577(C0032.m5769(C0047.m7763(sb), C0050.m8123())), C0012.m2973(m542(), 368, 14, 3248)), 0))), C0026.m4951(m542(), 382, 5, 1114)), C0049.m8007(m542(), 387, 9, 2715)), C0046.m7718(m542(), 396, 15, 2412))), c.class)));
        }
        return C0015.m3468(arrayList, linkedHashMap);
    }

    public String homeVideoContent() {
        ArrayList arrayList = new ArrayList();
        Iterator itM3109 = C0013.m3109(C0009.m2051(C0041.m6770(C0021.m4333(C0003.m1370(C0003.m1370(new JSONObject(C0062.m9381((m) C0028.m5161(C0030.m5333(C0016.m3577(C0032.m5769(C0044.m7509(m542(), 411, 22, 1635), C0050.m8123())), C0000.m1077(m542(), 433, 14, 2475)), 0))), C0022.m4403(m542(), 447, 5, 562)), C0028.m5109(m542(), 452, 9, 2001)), C0030.m5362(m542(), 461, 5, 803)))));
        while (C0012.m2962(itM3109)) {
            b bVar = (b) C0048.m7949(itM3109);
            if (!C0007.m1815(C0058.m9065(bVar), C0035.m6131(m542(), 466, 4, 1244))) {
                Iterator itM31092 = C0013.m3109(C0009.m2101(bVar));
                while (C0012.m2962(itM31092)) {
                    C0004.m1532(arrayList, C0059.m9239((b) C0048.m7949(itM31092)));
                }
            }
        }
        return C0047.m7783(arrayList);
    }

    public void init(Context context, String str) {
        String strM1840;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.a = linkedHashMap;
        C0037.m6362(linkedHashMap, C0017.m3646(m542(), 470, 5, 1050), C0048.m7902(m542(), 475, 2, 996));
        C0037.m6362(C0015.m3442(this), C0018.m3917(m542(), 477, 5, 2156), C0006.m1774(m542(), 482, 3, 506));
        C0037.m6362(C0015.m3442(this), C0002.m1305(m542(), 485, 9, 1540), C0037.m6307(m542(), 494, 2, 580));
        C0037.m6362(C0015.m3442(this), C0058.m9106(m542(), 496, 7, 1425), C0011.m2805(m542(), 503, 2, 2609));
        Iterator itM7807 = C0047.m7807(C0030.m5333(C0016.m3577(C0032.m5769(C0064.m9599(m542(), 505, 22, 3131), C0050.m8123())), C0060.m9352(m542(), 527, 6, 2549)));
        while (true) {
            if (!C0012.m2962(itM7807)) {
                strM1840 = C0007.m1840();
                break;
            }
            m mVar = (m) C0048.m7949(itM7807);
            String strM6584 = C0040.m6584(m542(), 533, 3, 1247);
            if (C0058.m9127(C0010.m2339(mVar, strM6584), C0002.m1305(m542(), 536, 16, 682))) {
                strM1840 = C0024.m4752(C0010.m2339(mVar, strM6584), C0028.m5109(m542(), 552, 1, 2359))[3];
                break;
            }
        }
        this.b = strM1840;
    }

    public String playerContent(String str, String str2, List<String> list) {
        com.github.catvod.spider.merge.E.g gVar = new com.github.catvod.spider.merge.E.g();
        C0017.m3667(gVar, str2);
        return C0033.m5828(gVar);
    }

    public String searchContent(String str, boolean z) {
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder(C0027.m5062(m542(), 553, 33, 388));
        C0018.m3933(sb, C0056.m8902(this));
        C0018.m3933(sb, C0019.m4107(m542(), 586, 18, 2887));
        C0018.m3933(sb, C0056.m8909(str));
        Iterator itM3109 = C0013.m3109(C0009.m2051(C0041.m6770(C0021.m4333(C0003.m1370(new JSONObject(C0032.m5769(C0047.m7763(sb), C0050.m8123())), C0010.m2300(m542(), 604, 9, 2960)), C0054.m8574(m542(), 613, 8, 735)))));
        while (C0012.m2962(itM3109)) {
            C0004.m1532(arrayList, C0059.m9239((b) C0048.m7949(itM3109)));
        }
        com.github.catvod.spider.merge.E.g gVar = new com.github.catvod.spider.merge.E.g();
        C0045.m7632(gVar, arrayList);
        C0049.m7974(gVar, 1, 1, 0, 1);
        return C0033.m5828(gVar);
    }
}