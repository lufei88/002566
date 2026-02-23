package com.github.catvod.spider;

import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.E.b;
import com.github.catvod.spider.merge.E.g;
import com.github.catvod.spider.merge.E.m;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.T0.h;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.Z.d;
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
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.r0.C0060;
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
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.c0.C0010;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import com.github.catvod.spider.p000mergexbpq.r.C0014;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class XuanFeng extends Spider {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f131short = {3157, 395, 407, 407, 403, 400, 473, 460, 460, 398, 394, 386, 396, 466, 467, 466, 461, 384, 396, 398, 460, 386, 403, 394, 1202, 1201, 1215, 1210, 1264, 1204, 1197, 1201, 1200, 2896, 2881, 2887, 2885, 1990, 2010, 2010, 2014, 2013, 1940, 1921, 1921, 1987, 1991, 1999, 1985, 1951, 1950, 1951, 1920, 1997, 1985, 1987, 2237, 2210, 2223, 2222, 2212, 2232, 3248, 3305, 3318, 3323, 3322, 3312, 3248, 2225, 2236, 1693, 1696, 1725, 1701, 1708, 639, 595, 586, 601, 590, 1254, 1271, 1266, 1262, 1259, 1249, 1251, 1270, 1255, 1186, 1257, 1255, 1275, 1208, 1186, 594, 590, 590, 586, 585, 512, 533, 533, 599, 595, 603, 597, 523, 522, 523, 532, 601, 597, 599, 2715, 2779, 2775, 2774, 2764, 2777, 2769, 2774, 2781, 2762, 2712, 2694, 2712, 2780, 2769, 2766, 2710, 2762, 2775, 2767, 2710, 2760, 2768, 2775, 2774, 2781, 2712, 2694, 2712, 2780, 2769, 2766, 2710, 2779, 2775, 2772, 2709, 2773, 2780, 2709, 2688, 2712, 2694, 2712, 2780, 2769, 2766, 2690, 2774, 2764, 2768, 2709, 2779, 2768, 2769, 2772, 2780, 2704, 2699, 2705, 2712, 2694, 2712, 2780, 2769, 2766, 2710, 2779, 2775, 2772, 2709, 2773, 2780, 2709, 2688, 2712, 2694, 2712, 2768, 2697, 2980, 3044, 3048, 3049, 3059, 3046, 3054, 3049, 3042, 3061, 2983, 3001, 2983, 3043, 3054, 3057, 2985, 3061, 3048, 3056, 2985, 3063, 3055, 3048, 3049, 3042, 2983, 3001, 2983, 3043, 3054, 3057, 2985, 3044, 3048, 3051, 2986, 3050, 3043, 2986, 3007, 2983, 3001, 2983, 3043, 3054, 3057, 2985, 3043, 2986, 3041, 3051, 3042, 3071, 2985, 3050, 3045, 2986, 2996, 2983, 3001, 2983, 3043, 3054, 3057, 2985, 3041, 3051, 3042, 3071, 2986, 3060, 3055, 3061, 3054, 3049, 3052, 2986, 2999, 2983, 3001, 2983, 3054, 3050, 3040, 1271, 1270, 1255, 1000, 936, 932, 933, 959, 938, 930, 933, 942, 953, 1003, 1013, 1003, 943, 930, 957, 997, 953, 932, 956, 997, 955, 931, 932, 933, 942, 1003, 1013, 1003, 943, 930, 957, 997, 936, 932, 935, 998, 934, 943, 998, 1011, 1003, 1013, 1003, 943, 930, 957, 997, 943, 998, 941, 935, 942, 947, 997, 934, 937, 998, 1016, 1003, 1013, 1003, 943, 930, 957, 997, 941, 935, 942, 947, 998, 940, 953, 932, 956, 998, 1018, 1003, 1013, 1003, 955, 1009, 933, 959, 931, 998, 936, 931, 930, 935, 943, 995, 1018, 1018, 994, 405, 469, 473, 472, 450, 471, 479, 472, 467, 452, 406, 392, 406, 466, 479, 448, 408, 452, 473, 449, 408, 454, 478, 473, 472, 467, 406, 392, 406, 466, 479, 448, 408, 469, 473, 474, 411, 475, 466, 411, 398, 406, 392, 406, 466, 479, 448, 408, 450, 467, 462, 450, 411, 468, 452, 467, 471, 477, 408, 464, 450, 391, 386, 386, 411, 391, 390, 486, 440, 425, 442, 443, 429, 404, 480, 490, 480, 486, 482, 503, 481, 490, 404, 481, 703, 703, 662, 723, 723, 721, 721, 1609, 1898, 1895, 1891, 1894, 1895, 1904, 1905, 2295, 2296, 2301, 2276, 2279, 2518, 2553, 2549, 2557, 1125, 1125, 1125, 1102, 3212, 2795, 2807, 2807, 2803, 2800, 2745, 2732, 2732, 2798, 2794, 2786, 2796, 2738, 2739, 2738, 2733, 2784, 2796, 2798, 2400, 2349, 2338, 2357, 2337, 2338, 2353, 2320, 2358, 2355, 2355, 2348, 2353, 2359, 2342, 2343, 2304, 2348, 2349, 2359, 2342, 2349, 2359, 2403, 2429, 2403, 2358, 2351, 2403, 2429, 2403, 2351, 2346, 2403, 808, 818, 805, 806, 700, 755, 691, 700, 683, 752, 689, 692, 691, 694, 590, 682, 691, 767, 737, 767, 691, 694, 767, 737, 767, 702, 1125, 1061, 1065, 1064, 1074, 1063, 1071, 1064, 1059, 1076, 1126, 1144, 1126, 1058, 1071, 1072, 1128, 1076, 1065, 1073, 1126, 1144, 1126, 1058, 1071, 1072, 1128, 1061, 1065, 1066, 1131, 1067, 1058, 1131, 1140, 1128, 1061, 1065, 1066, 1131, 1136, 1405, 1401, 1395, 2478, 2479, 2494, 1279, 1266, 1261, 1205, 1272, 1268, 1261, 1278, 1257, 1206, 1260, 1257, 1274, 1259, 1211, 1189, 1211, 1274, 437, 440, 423, 511, 434, 432, 419, 437, 508, 421, 440, 421, 445, 436, 2002, 1998, 1998, 1994, 1993, 1920, 1941, 1941, 2007, 2003, 2011, 2005, 1931, 1930, 1931, 1940, 2009, 2005, 2007, 1847, 1899, 1917, 1913, 1898, 1915, 1904, 1831, 1897, 1829, 2059, 2071, 2071, 2067, 2064, 2137, 2124, 2124, 2062, 2058, 2050, 2060, 2130, 2131, 2130, 2125, 2048, 2060, 2062, 3298, 3299, 3313, 3226, 3215, 2227, 2291, 2303, 2302, 2276, 2289, 2297, 2302, 2293, 2274, 2224, 2222, 2224, 2292, 2297, 2278, 2238, 2274, 2303, 2279, 2224, 2222, 2224, 2292, 2297, 2278, 2238, 2291, 2303, 2300, 2237, 2301, 2292, 2237, 2210, 2238, 2291, 2303, 2300, 2237, 2214, 2172, 2168, 2162, 2241, 2240, 2257, 1515, 1510, 1529, 1441, 1516, 1504, 1529, 1514, 1533, 1442, 1528, 1533, 1518, 1535, 1455, 1457, 1455, 1518, 2673, 2667, 2684, 2687, 3109, 3195};

    /* renamed from: ۟ۤۦ۠ۧ, reason: not valid java name and contains not printable characters */
    public static short[] m768() {
        if (C0008.m1975() > 0) {
            return f131short;
        }
        return null;
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        ArrayList arrayList = new ArrayList();
        String strM1130 = C0000.m1130(C0026.m4951(m768(), 1, 23, 483), C0025.m4800(str, C0014.m3332(m768(), 0, 1, 3172), C0007.m1840()), C0028.m5109(m768(), 24, 9, 1246));
        Map.Entry[] entryArr = {new AbstractMap.SimpleEntry(C0006.m1774(m768(), 33, 4, 2848), str2)};
        HashMap map2 = new HashMap(1);
        Map.Entry entry = entryArr[0];
        Object objM7624 = C0045.m7624(entry);
        if (C0044.m7425(objM7624, entry, map2, objM7624) != null) {
            throw new IllegalArgumentException(C0002.m1280(objM7624, C0006.m1774(m768(), 81, 15, 1154)));
        }
        d dVarM1396 = C0003.m1396(strM1130, C0001.m1184(map2), C0006.m1742(C0007.m1842(m768(), 37, 19, 1966)));
        if (C0057.m9021(dVarM1396) != 200) {
            return null;
        }
        Iterator itM7816 = C0047.m7816((ArrayList) C0062.m9431((Map) C0029.m5275(C0008.m2029(dVarM1396), C0047.m7777(new HashMap())), C0001.m1189(m768(), 56, 6, 2251)));
        while (C0012.m2962(itM7816)) {
            Map map3 = (Map) C0048.m7949(itM7816);
            StringBuilder sb = new StringBuilder(C0037.m6307(m768(), 62, 7, 3231));
            C0018.m3933(sb, C0037.m6312(C0062.m9431(map3, C0005.m1645(m768(), 69, 2, 2296))));
            C0004.m1532(arrayList, new m(C0047.m7763(sb), C0037.m6312(C0062.m9431(map3, C0058.m9106(m768(), 71, 5, 1737))), C0037.m6312(C0062.m9431(map3, C0030.m5362(m768(), 76, 5, 572)))));
        }
        return C0020.m4216(C0011.m2808(C0038.m6456(str2)), C0047.m7818(1, str2), C0011.m2808(C0009.m2139(arrayList)), C0011.m2808(Integer.MAX_VALUE), arrayList);
    }

    public String detailContent(List<String> list) {
        List list2;
        List list3;
        String str = (String) C0048.m7915(list, 0);
        String strM7151 = C0042.m7151(m768(), 96, 19, 570);
        h hVarM3577 = C0016.m3577(C0032.m5769(C0050.m8125(strM7151, str), C0006.m1742(strM7151)));
        String strM4684 = C0024.m4684(C0030.m5333(hVarM3577, C0011.m2805(m768(), 115, 80, 2744)));
        String strM8058 = C0049.m8058(C0030.m5333(hVarM3577, C0002.m1305(m768(), 195, 85, 2951)), C0041.m6779(m768(), 280, 3, 1156));
        String strM46842 = C0024.m4684(C0030.m5333(hVarM3577, C0013.m3106(m768(), 283, 95, 971)));
        String strM46843 = C0024.m4684(C0030.m5333(hVarM3577, C0002.m1305(m768(), 378, 63, 438)));
        Map map = (Map) C0029.m5275(C0025.m4800(C0030.m5433(C0046.m7718(m768(), 441, 21, 456), C0000.m1081(hVarM3577), C0011.m2808(1)), C0006.m1774(m768(), 462, 7, 739), C0027.m5062(m768(), 469, 1, 1643)), Map.class);
        List list4 = (List) C0062.m9431(map, C0024.m4740(m768(), 470, 7, 1794));
        List list5 = (List) C0062.m9431(map, C0005.m1645(m768(), 477, 5, 2196));
        String strM1840 = C0007.m1840();
        String strM5172 = strM1840;
        String strM51722 = strM5172;
        int i = 0;
        while (i < C0064.m9636(list4)) {
            String str2 = (String) C0062.m9431((Map) C0048.m7915(list4, i), C0025.m4795(m768(), 482, 4, 2456));
            boolean zM1815 = C0007.m1815(strM1840, strM5172);
            String strM8978 = C0057.m8978(m768(), 486, 3, 1089);
            strM5172 = !zM1815 ? C0028.m5172(strM5172, strM8978, str2) : C0065.m9804(strM5172, str2);
            Iterator itM3109 = C0013.m3109(list5);
            String strM7763 = strM1840;
            while (C0012.m2962(itM3109)) {
                List list6 = (List) C0048.m7949(itM3109);
                boolean zM18152 = C0007.m1815(strM1840, strM7763);
                String strM9585 = C0063.m9585(m768(), 489, 1, 1130);
                if (zM18152) {
                    list2 = list5;
                    list3 = list4;
                    StringBuilder sbM5621 = C0031.m5621(strM7763);
                    C0018.m3933(sbM5621, (String) C0048.m7915(list6, 0));
                    C0018.m3933(sbM5621, strM9585);
                    C0018.m3933(sbM5621, (String) C0048.m7915(list6, 1));
                    strM7763 = C0047.m7763(sbM5621);
                } else {
                    list2 = list5;
                    StringBuilder sbM3016 = C0012.m3016(strM7763, C0039.m6551(m768(), 490, 1, 3247));
                    C0018.m3933(sbM3016, (String) C0048.m7915(list6, 0));
                    C0018.m3933(sbM3016, strM9585);
                    C0018.m3933(sbM3016, (String) C0048.m7915(list6, 1));
                    strM7763 = C0047.m7763(sbM3016);
                    list3 = list4;
                }
                list5 = list2;
                list4 = list3;
            }
            List list7 = list5;
            List list8 = list4;
            strM51722 = !C0007.m1815(strM1840, strM51722) ? C0028.m5172(strM51722, strM8978, strM7763) : C0065.m9804(strM51722, strM7763);
            i++;
            list5 = list7;
            list4 = list8;
        }
        m mVar = new m();
        C0011.m2828(mVar, (String) C0048.m7915(list, 0));
        C0026.m4947(mVar, strM8058);
        C0022.m4432(mVar, strM46842);
        C0005.m1628(mVar, strM4684);
        C0027.m5000(mVar, strM46843);
        C0054.m8596(mVar, strM5172);
        C0044.m7449(mVar, strM51722);
        return C0053.m8428(mVar);
    }

    public String homeContent(boolean z) {
        String strM7833;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        new LinkedHashMap();
        String strM6188 = C0036.m6188(m768(), 491, 19, 2691);
        h hVarM3577 = C0016.m3577(C0032.m5769(strM6188, C0006.m1742(strM6188)));
        Iterator itM7807 = C0047.m7807(C0030.m5333(hVarM3577, C0032.m5708(m768(), 510, 34, 2371)));
        while (true) {
            boolean zM2962 = C0012.m2962(itM7807);
            strM7833 = C0047.m7833(m768(), 544, 4, 832);
            if (!zM2962) {
                break;
            }
            com.github.catvod.spider.merge.T0.m mVar = (com.github.catvod.spider.merge.T0.m) C0048.m7949(itM7807);
            String strM9361 = C0061.m9361(m768(), 548, 10, 733);
            if (C0043.m7277(C0049.m8058(C0030.m5333(mVar, strM9361), strM7833), C0024.m4740(m768(), 558, 1, 609))) {
                C0004.m1532(arrayList2, new b(C0049.m8058(C0030.m5333(mVar, strM9361), strM7833), C0064.m9669(mVar), null));
            } else {
                Iterator itM78072 = C0047.m7807(C0030.m5333(mVar, C0057.m8978(m768(), 559, 11, 735)));
                while (C0012.m2962(itM78072)) {
                    com.github.catvod.spider.merge.T0.m mVar2 = (com.github.catvod.spider.merge.T0.m) C0048.m7949(itM78072);
                    C0004.m1532(arrayList2, new b(C0010.m2339(mVar2, strM7833), C0064.m9669(mVar2), null));
                }
            }
        }
        Iterator itM78073 = C0047.m7807(C0030.m5333(hVarM3577, C0064.m9599(m768(), 570, 41, 1094)));
        while (C0012.m2962(itM78073)) {
            com.github.catvod.spider.merge.T0.m mVar3 = (com.github.catvod.spider.merge.T0.m) C0048.m7949(itM78073);
            try {
                C0004.m1532(arrayList, new m(C0049.m8058(C0030.m5333(mVar3, C0048.m7902(m768(), 617, 18, 1179)), strM7833), C0024.m4684(C0030.m5333(mVar3, C0030.m5362(m768(), 635, 14, 465))), C0049.m8058(C0030.m5333(mVar3, C0060.m9352(m768(), 611, 3, 1300)), C0024.m4740(m768(), 614, 3, 2525))));
            } catch (Exception unused) {
            }
        }
        return C0025.m4831(arrayList2, arrayList);
    }

    public String playerContent(String str, String str2, List<String> list) {
        g gVar = new g();
        C0017.m3667(gVar, str2);
        C0057.m9029(gVar, C0006.m1742(C0016.m3525(m768(), 649, 19, 1978)));
        return C0033.m5828(gVar);
    }

    public String searchContent(String str, boolean z) {
        ArrayList arrayList = new ArrayList();
        String strM5256 = C0029.m5256(m768(), 668, 10, 1816);
        String strM6001 = C0034.m6001(m768(), 678, 19, 2147);
        Iterator itM7807 = C0047.m7807(C0030.m5333(C0016.m3577(C0032.m5769(C0050.m8125(C0050.m8125(strM6001, strM5256), C0051.m8202(str, C0026.m4951(m768(), 697, 5, 3255))), C0006.m1742(strM6001))), C0004.m1549(m768(), 702, 41, 2192)));
        while (C0012.m2962(itM7807)) {
            com.github.catvod.spider.merge.T0.m mVar = (com.github.catvod.spider.merge.T0.m) C0048.m7949(itM7807);
            try {
                C0004.m1532(arrayList, new m(C0049.m8058(C0030.m5333(mVar, C0016.m3525(m768(), 749, 18, 1423)), C0002.m1305(m768(), 767, 4, 2585)), C0024.m4684(C0030.m5333(mVar, C0020.m4199(m768(), 771, 2, 3149))), C0049.m8058(C0030.m5333(mVar, C0061.m9361(m768(), 743, 3, 2069)), C0014.m3332(m768(), 746, 3, 2226))));
            } catch (Exception unused) {
            }
        }
        return C0047.m7783(arrayList);
    }
}