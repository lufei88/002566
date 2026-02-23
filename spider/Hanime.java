package com.github.catvod.spider;

import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.E.b;
import com.github.catvod.spider.merge.E.c;
import com.github.catvod.spider.merge.E.d;
import com.github.catvod.spider.merge.E.g;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.J0.C0021;
import com.github.catvod.spider.merge.N.C0023;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.T0.h;
import com.github.catvod.spider.merge.T0.m;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Z.C0037;
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
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.r0.C0060;
import com.github.catvod.spider.merge.t.C0061;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.merge.z.C0065;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.github.catvod.spider.p000mergexbpq.c0.C0010;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import com.github.catvod.spider.p000mergexbpq.r.C0014;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class Hanime extends Spider {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f69short = {1758, 1733, 22621, -26147, 2415, 2377, 2399, 2376, 2327, 2427, 2397, 2399, 2388, 2382, 2728, 2698, 2719, 2700, 2697, 2697, 2692, 2762, 2768, 2763, 2773, 2757, 2765, 2738, 2700, 2699, 2689, 2698, 2706, 2710, 2757, 2731, 2737, 2757, 2772, 2773, 2763, 2773, 2782, 2757, 2738, 2700, 2699, 2771, 2769, 2782, 2757, 2717, 2771, 2769, 2764, 2757, 2724, 2709, 2709, 2697, 2688, 2738, 2688, 2695, 2734, 2700, 2705, 2762, 2768, 2774, 2770, 2763, 2774, 2771, 2757, 2765, 2734, 2733, 2737, 2728, 2729, 2761, 2757, 2697, 2700, 2702, 2688, 2757, 2722, 2688, 2694, 2702, 2698, 2764, 2757, 2726, 2701, 2711, 2698, 2696, 2688, 2762, 2772, 2775, 2775, 2763, 2773, 2763, 2773, 2763, 2773, 2757, 2742, 2692, 2691, 2692, 2711, 2700, 2762, 2768, 2774, 2770, 2763, 2774, 2771, 585, 594, 25305, 24681, 19411, 23515, 3010, 3038, 3034, 3017, 526, 530, 530, 534, 533, 604, 585, 585, 526, 519, 520, 527, 523, 515, 599, 584, 523, 515, 2660, 2616, 2606, 2602, 2617, 2600, 2595, 2676, 2604, 2606, 2597, 2617, 2606, 2678, 3220, 3266, 3283, 3285, 3287, 3215, 1830, 1907, 1903, 1906, 1908, 1853, 2627, 2588, 2560, 2564, 2583, 2648, 3177, 3172, 3195, 3107, 3182, 3170, 3169, 3104, 3189, 3198, 3104, 3131, 898, 1608, 1609, 1624, 3057, 3051, 3068, 3071, 3131, 3135, 3125, 779, 836, 773, 796, 783, 792, 774, 779, 787, 1478, 1483, 1492, 1420, 1473, 1475, 1488, 1478, 1423, 1487, 1485, 1472, 1483, 1486, 1479, 1423, 1494, 1483, 1494, 1486, 1479, 1511, 1224, 1246, 1227, 1244, 1239, 2317, 2304, 2335, 2377, 2391, 2377, 2304, 2308, 2318, 2134, 2139, 2116, 2066, 2060, 2066, 2134, 2139, 2116, 997, 1019, 1015, 996, 994, 969, 1010, 1023, 997, 998, 1018, 1015, 1007, 1494, 1482, 1482, 1486, 1485, 1412, 1425, 1425, 1494, 1503, 1488, 1495, 1491, 1499, 1423, 1424, 1491, 1499, 460, 404, 386, 407, 384, 395, 476, 405, 478, 925, 902, 911, 924, 907, 940, 922, 896, 963, 922, 903, 922, 898, 907, 1466, 1450, 1467, 1440, 1465, 1469, 1426, 1469, 1456, 1465, 1452, 1524, 1448, 1465, 1465, 1445, 1440, 1450, 1448, 1469, 1440, 1446, 1447, 1510, 1445, 1453, 1506, 1443, 1466, 1446, 1447, 1428, 2899, 2898, 2884, 2900, 2885, 2910, 2887, 2883, 2910, 2904, 2905, 1419, 1431, 1418, 1426, 1437, 1425, 1438, 1430, 1427, 1450, 1421, 1427, 2669, 2657, 2656, 2682, 2667, 2656, 2682, 2651, 2684, 2658, 1988, 2029, 2018, 2021, 2017, 2025, 1981, 27775, 28140, 2294, 3196, 3168, 3168, 3172, 3175, 3118, 3131, 3131, 3196, 3189, 3194, 3197, 3193, 3185, 3109, 3130, 3193, 3185, 2432, 2524, 2506, 2510, 2525, 2508, 2503, 2448, 2504, 2506, 2497, 2525, 2506, 2450, -32416, 31941, 755, 766, 737, 697, 767, 754, 761, 739, 758, 766, 698, 740, 760, 741, 739, 698, 760, 743, 739, 766, 760, 761, 740, 698, 736, 741, 758, 743, 743, 754, 741, 1971, 1967, 1963, 1976, 2603, 2612, 2608, 2605, 2603, 2602, 1077, 1058, 1071, 1078, 1062, 886, 825, 889, 886, 865, 826, 894, 867, 882, 890, 28470, 32748, -28010, 24268, 557, 27982, 30478, 26114, 23327, 486, 509, 23213, 18980, 854, 1771, 1777, 1766, 1765, 1021, 1003, 1022, 1001, 994, 431, 418, 445, 491, 501, 491, 418, 422, 428, 450, 451, 466, 443, 438, 425, 511, 481, 511, 443, 438, 425, 2214, 3276, 3282, 3294, 3277, 3275, 3296, 3291, 3286, 3276, 3279, 3283, 3294, 3270, 771, 799, 799, 795, 792, 849, 836, 836, 771, 778, 773, 770, 774, 782, 858, 837, 774, 782, 1819, 1863, 1873, 1877, 1862, 1879, 1884, 1803, 1861, 1857, 1873, 1862, 1869, 1801, 1101, 1036, 1038, 1029, 1049, 1038, 1110, 1101, 1048, 1028, 1049, 1055, 1110, 1101, 1042, 1038, 1034, 1049, 1110, 1101, 1030, 1028, 1029, 1055, 1027, 1110, 1101, 1039, 1054, 1049, 1034, 1055, 1026, 1028, 1029, 1110, 1452, 1441, 1470, 1510, 1451, 1447, 1444, 1509, 1456, 1467, 1509, 1534, 2450, 2454, 2460, 1543, 1542, 1559, 2889, 2822, 2887, 2910, 2893, 2906, 2884, 2889, 2897, 1430, 1420, 1435, 1432, 2128, 2141, 2114, 2074, 2135, 2133, 2118, 2128, 2073, 2137, 2139, 2134, 2141, 2136, 2129, 2073, 2112, 2141, 2112, 2136, 2129, 2375};

    public static d a(String str, String str2, ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        if (!C0007.m1815(str2, C0023.m4536(m432(), 0, 2, 1724))) {
            C0004.m1532(arrayList2, new c(C0035.m6131(m432(), 2, 2, 2357), C0007.m1840()));
        }
        Iterator itM7816 = C0047.m7816(arrayList);
        while (C0012.m2962(itM7816)) {
            String str3 = (String) C0048.m7949(itM7816);
            if (!C0057.m8953(str3)) {
                C0004.m1532(arrayList2, new c(str3));
            }
        }
        return new d(str2, str, arrayList2);
    }

    public static HashMap b() {
        return C0020.m4251(C0041.m6779(m432(), 4, 10, 2362), C0061.m9361(m432(), 14, 111, 2789));
    }

    /* renamed from: ۣ۟ۧۡۨ, reason: not valid java name and contains not printable characters */
    public static short[] m432() {
        if (C0031.m5628() >= 0) {
            return f69short;
        }
        return null;
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        String strM7657;
        String strM8574;
        String strM8911;
        ArrayList arrayList = new ArrayList();
        String strM1077 = C0000.m1077(m432(), 125, 2, 555);
        if (C0065.m9715(map, strM1077) == null) {
            C0053.m8424(map, strM1077, C0008.m1970(m432(), 127, 4, 1497));
        }
        String strM7151 = C0042.m7151(m432(), 131, 4, 3003);
        if (C0065.m9715(map, strM7151) == null) {
            C0053.m8424(map, strM7151, C0007.m1840());
        }
        h hVarM3577 = C0016.m3577(C0032.m5769(C0050.m8125(C0050.m8125(C0050.m8125(C0050.m8125(C0050.m8125(C0050.m8125(C0050.m8125(C0050.m8125(C0017.m3646(m432(), 135, 18, 614), C0060.m9352(m432(), 153, 14, 2635)), str), C0014.m3332(m432(), 167, 6, 3250)), str2), C0019.m4107(m432(), 173, 6, 1792)), (String) C0065.m9715(map, strM1077)), C0054.m8574(m432(), 179, 6, 2661)), (String) C0065.m9715(map, strM7151)), C0014.m3351()));
        Iterator itM7807 = C0047.m7807(C0030.m5333(hVarM3577, C0062.m9389(m432(), 185, 12, 3085)));
        while (true) {
            boolean zM2962 = C0012.m2962(itM7807);
            strM7657 = C0045.m7657(m432(), 197, 1, 959);
            strM8574 = C0054.m8574(m432(), 198, 3, 1595);
            strM8911 = C0056.m8911(m432(), 201, 4, 2969);
            if (!zM2962) {
                break;
            }
            m mVar = (m) C0048.m7949(itM7807);
            String strM2339 = C0010.m2339((m) C0028.m5161(C0030.m5333(mVar, C0011.m2805(m432(), 205, 3, 3154)), 1), strM8574);
            String strM8058 = C0049.m8058(C0030.m5333(mVar, C0023.m4536(m432(), 208, 9, 874)), strM8911);
            C0032.m5685(C0024.m4752(strM8058, strM7657)[1], C0024.m4684(C0030.m5333(mVar, C0046.m7718(m432(), 217, 21, 1442))), strM2339, arrayList);
        }
        if (C0007.m1817(arrayList)) {
            Iterator itM78072 = C0047.m7807(C0030.m5333(hVarM3577, C0047.m7833(m432(), 238, 1, 1414)));
            while (C0012.m2962(itM78072)) {
                m mVar2 = (m) C0048.m7949(itM78072);
                if (C0058.m9127(C0010.m2339(mVar2, strM8911), C0061.m9361(m432(), 239, 5, 1215))) {
                    String strM80582 = C0049.m8058(C0030.m5333(mVar2, C0003.m1398(m432(), 244, 9, 2409)), strM8574);
                    String strM23392 = C0010.m2339(mVar2, strM8911);
                    String strM4684 = C0024.m4684(C0030.m5333(mVar2, C0051.m8259(m432(), 253, 9, 2098)));
                    String str3 = C0024.m4752(strM23392, strM7657)[1];
                    if (!C0058.m9127(strM4684, C0057.m8978(m432(), 262, 13, 918))) {
                        C0032.m5685(str3, strM4684, strM80582, arrayList);
                    }
                }
            }
        }
        return C0047.m7783(arrayList);
    }

    public String detailContent(List<String> list) {
        h hVarM3577 = C0016.m3577(C0032.m5769(C0050.m8125(C0050.m8125(C0055.m8814(m432(), 275, 18, 1470), C0026.m4951(m432(), 293, 9, 483)), (String) C0048.m7915(list, 0)), C0014.m3351()));
        String strM9669 = C0064.m9669(C0031.m5610(hVarM3577, C0055.m8814(m432(), 302, 14, 1006)));
        JSONObject jSONObject = new JSONObject(C0064.m9640(C0014.m3314(C0030.m5333(hVarM3577, C0054.m8574(m432(), 316, 32, 1481)))));
        String strM8200 = C0051.m8200(jSONObject, C0034.m6001(m432(), 348, 11, 2871));
        String strM5121 = C0028.m5121(C0008.m1964(jSONObject, C0029.m5256(m432(), 359, 12, 1535)), 0);
        String strM82002 = C0051.m8200(jSONObject, C0051.m8259(m432(), 371, 10, 2574));
        com.github.catvod.spider.merge.E.m mVar = new com.github.catvod.spider.merge.E.m();
        C0011.m2828(mVar, (String) C0048.m7915(list, 0));
        C0026.m4947(mVar, strM5121);
        C0005.m1628(mVar, strM9669);
        C0027.m5000(mVar, strM8200);
        C0054.m8596(mVar, C0012.m2973(m432(), 381, 7, 1932));
        StringBuilder sb = new StringBuilder(C0037.m6307(m432(), 388, 3, 2258));
        C0018.m3933(sb, strM82002);
        C0044.m7449(mVar, C0047.m7763(sb));
        return C0053.m8428(mVar);
    }

    public String homeContent(boolean z) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String strM9106 = C0058.m9106(m432(), 391, 18, 3092);
        h hVarM3577 = C0016.m3577(C0032.m5769(C0050.m8125(strM9106, C0045.m7657(m432(), 409, 16, 2479)), C0014.m3351()));
        ArrayList arrayListM6481 = C0039.m6481(C0030.m5333(hVarM3577, C0010.m2300(m432(), 425, 31, 663)));
        String strM2300 = C0010.m2300(m432(), 456, 4, 1994);
        ArrayList arrayListM5773 = C0032.m5773(C0030.m5333(C0031.m5610(hVarM3577, strM2300), C0023.m4536(m432(), 460, 6, 2628)), C0064.m9599(m432(), 466, 5, 1091));
        h hVarM35772 = C0016.m3577(C0032.m5769(strM9106, C0014.m3351()));
        Iterator itM7807 = C0047.m7807(C0030.m5333(hVarM35772, C0055.m8814(m432(), 471, 10, 791)));
        while (C0012.m2962(itM7807)) {
            String strM9669 = C0064.m9669((m) C0048.m7949(itM7807));
            if (!C0007.m1815(strM9669, C0002.m1305(m432(), 481, 4, 2694)) && !C0007.m1815(strM9669, C0039.m6551(m432(), 485, 3, 613))) {
                C0004.m1532(arrayList2, new b(strM9669, strM9669, null));
                ArrayList arrayList3 = new ArrayList();
                C0004.m1532(arrayList3, C0013.m3165(C0019.m4107(m432(), 488, 2, 1424), C0045.m7657(m432(), 490, 2, 388), arrayListM6481));
                C0004.m1532(arrayList3, C0013.m3165(C0018.m3917(m432(), 492, 2, 1241), strM2300, arrayListM5773));
                C0037.m6362(linkedHashMap, strM9669, arrayList3);
            }
        }
        Iterator itM78072 = C0047.m7807(C0030.m5333(hVarM35772, C0035.m6131(m432(), 494, 1, 823)));
        while (C0012.m2962(itM78072)) {
            m mVar = (m) C0048.m7949(itM78072);
            String strM6001 = C0034.m6001(m432(), 495, 4, 1667);
            if (C0058.m9127(C0010.m2339(mVar, strM6001), C0031.m5565(m432(), 499, 5, 906))) {
                String strM8058 = C0049.m8058(C0030.m5333(mVar, C0016.m3525(m432(), 504, 9, 459)), C0027.m5062(m432(), 513, 3, 433));
                String strM2339 = C0010.m2339(mVar, strM6001);
                String strM4684 = C0024.m4684(C0030.m5333(mVar, C0021.m4340(m432(), 516, 9, 479)));
                String str = C0024.m4752(strM2339, C0032.m5708(m432(), 525, 1, 2203))[1];
                if (!C0058.m9127(strM4684, C0021.m4340(m432(), 526, 13, 3263)) && !C0057.m8953(strM4684)) {
                    C0032.m5685(str, strM4684, strM8058, arrayList);
                }
            }
        }
        return C0033.m5854(arrayList2, arrayList, linkedHashMap);
    }

    public String playerContent(String str, String str2, List<String> list) {
        g gVar = new g();
        C0017.m3667(gVar, str2);
        C0057.m9029(gVar, C0014.m3351());
        return C0033.m5828(gVar);
    }

    public String searchContent(String str, boolean z) {
        ArrayList arrayList = new ArrayList();
        Iterator itM7807 = C0047.m7807(C0030.m5333(C0016.m3577(C0032.m5769(C0050.m8125(C0050.m8125(C0050.m8125(C0063.m9585(m432(), 539, 18, 875), C0045.m7657(m432(), 557, 14, 1844)), str), C0042.m7151(m432(), 571, 36, 1131)), C0014.m3351())), C0053.m8477(m432(), 607, 12, 1480)));
        while (C0012.m2962(itM7807)) {
            m mVar = (m) C0048.m7949(itM7807);
            String strM2339 = C0010.m2339((m) C0028.m5161(C0030.m5333(mVar, C0025.m4795(m432(), 619, 3, 2555)), 1), C0012.m2973(m432(), 622, 3, 1652));
            String strM8058 = C0049.m8058(C0030.m5333(mVar, C0065.m9775(m432(), 625, 9, 2856)), C0008.m1970(m432(), 634, 4, 1534));
            C0032.m5685(C0024.m4752(strM8058, C0004.m1549(m432(), 659, 1, 2426))[1], C0024.m4684(C0030.m5333(mVar, C0053.m8477(m432(), 638, 21, 2100))), strM2339, arrayList);
        }
        return C0047.m7783(arrayList);
    }
}