package com.github.catvod.spider;

import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.E.b;
import com.github.catvod.spider.merge.E.g;
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
import com.github.catvod.spider.merge.T0.h;
import com.github.catvod.spider.merge.T0.m;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.V0.d;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Y.C0036;
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
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.q.C0058;
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
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.c0.C0010;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
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
public class QxiTv extends Spider {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f103short = {2527, 2553, 2543, 2552, 2471, 2507, 2541, 2543, 2532, 2558, 2778, 2808, 2797, 2814, 2811, 2811, 2806, 2744, 2722, 2745, 2727, 2743, 2751, 2752, 2814, 2809, 2803, 2808, 2784, 2788, 2743, 2777, 2755, 2743, 2726, 2727, 2745, 2727, 2732, 2743, 2752, 2814, 2809, 2721, 2723, 2732, 2743, 2799, 2721, 2723, 2750, 2743, 2774, 2791, 2791, 2811, 2802, 2752, 2802, 2805, 2780, 2814, 2787, 2744, 2722, 2724, 2720, 2745, 2724, 2721, 2743, 2751, 2780, 2783, 2755, 2778, 2779, 2747, 2743, 2811, 2814, 2812, 2802, 2743, 2768, 2802, 2804, 2812, 2808, 2750, 2743, 2772, 2815, 2789, 2808, 2810, 2802, 2744, 2726, 2725, 2725, 2745, 2727, 2745, 2727, 2745, 2727, 2743, 2756, 2806, 2801, 2806, 2789, 2814, 2744, 2722, 2724, 2720, 2745, 2724, 2721, 1294, 1287, 1398, 2882, 2891, 2874, 2863, 22959, 20681, 2869, 2863, 3133, 3105, 3105, 3109, 3110, 3183, 3194, 3194, 3106, 3106, 3106, 3195, 3170, 3117, 3132, 3195, 3105, 3107, 1121, 1666, 1536, 1615, 1553, 1556, 1539, 1549, 1544, 1538, 1612, 1549, 1544, 1554, 1557, 1612, 1540, 1561, 1553, 1623, 1613, 1626, 1625, 3122, 3119, 3122, 3114, 3107, 1251, 1255, 1261, 2681, 2684, 2665, 2684, 2608, 2670, 2671, 2686, 333, 275, 278, 257, 271, 266, 256, 334, 271, 266, 272, 279, 334, 275, 273, 257, 2653, 2636, 2641, 2653, 2632, 2651, 2636, 2632, 1648, 1639, 1642, 1651, 1635, 647, 667, 667, 671, 668, 725, 704, 704, 664, 664, 664, 705, 728, 663, 646, 705, 667, 665, 2868, 2873, 2854, 2942, 2852, 2872, 2873, 2851, 2941, 2868, 2869, 2851, 2867, 2941, 2852, 2873, 2852, 2876, 2869, 874, 871, 888, 800, 890, 870, 871, 893, 803, 894, 871, 877, 803, 876, 868, 448, 455, 458, 479, 470, 2847, 2844, 2846, 2838, 2842, 2831, 2834, 2824, 2835, 2841, 2896, 2836, 2832, 2844, 2842, 2840, 2887, 2909, 2824, 2831, 2833, 2901, 2906, 2093, 2083, 1138, 1151, 1120, 1080, 1122, 1150, 1151, 1125, 1083, 1138, 1139, 1125, 1141, 1083, 1151, 1144, 1136, 1145, 1078, 1064, 1078, 1125, 1126, 1143, 1144, 1950, 2001, 1932, 1928, 1942, 1935, 1946, 1933, 2002, 1932, 1939, 1942, 1947, 1946, 682, 679, 696, 736, 687, 672, 698, 678, 673, 674, 673, 681, 695, 739, 674, 679, 701, 698, 739, 684, 673, 694, 736, 672, 673, 672, 683, 836, 836, 836, 1571, 1677, 1687, 1664, 1667, 2449, 2890, 288, 316, 316, 312, 315, 370, 359, 359, 319, 319, 319, 358, 383, 304, 289, 358, 316, 318, 1223, 1246, 1180, 1217, 1221, 1243, 1218, 1239, 1216, 1183, 1221, 1216, 1235, 1218, 1218, 1239, 1216, 1170, 1164, 1170, 1246, 1243, 1180, 1217, 1221, 1243, 1218, 1239, 1216, 1183, 1217, 1246, 1243, 1238, 1239, 1170, 1164, 1170, 1235, 2865, 2859, 2876, 2879, 30605, -30508, 2333, 2386, 2316, 2313, 2334, 2320, 2325, 2335, 2385, 2320, 2325, 2319, 2312, 2385, 2329, 2308, 2316, 822, 818, 824, 1536, 1541, 1552, 1541, 1609, 1559, 1558, 1543, 1189, 1208, 1189, 1213, 1204, 652, 656, 656, 660, 635, 615, 615, 611, 608, 553, 572, 572, 612, 612, 612, 573, 548, 619, 634, 573, 615, 613, 3007, 3048, 3055, 3057, 3007, 2983, 3007, 2997, 2995, 2999, 2978, 2996, 3056, 2990, 3048, 2981, 3007, 2993, 411, 488, 2336, 2512, 2446, 2504, 2437, 2491, 2471, 2471, 2467, 2464, 2537, 2556, 2556, 2468, 2468, 2468, 2557, 2532, 2475, 2490, 2557, 2471, 2469, 2556, 2469, 2492, 2487, 2464, 2486, 2482, 2465, 2480, 2491, 2556, 2467, 2482, 2484, 2486, 2556, 2530, 2556, 2468, 2487, 2556, 1672, 1742, 1746, 1739, 1738, 724, 667, 709, 704, 727, 729, 732, 726, 664, 729, 732, 710, 705, 664, 720, 717, 709, 922, 926, 916, 2060, 2057, 2076, 2057, 2117, 2075, 2074, 2059, 2781, 2759, 2768, 2771, 1302, 1291, 1302, 1294, 1287, 1687, 1675, 1675, 1679, 2536, 2548, 2548, 2544, 2547, 2490, 2479, 2479, 2551, 2551, 2551, 2478, 2487, 2552, 2537, 2478, 2548, 2550};

    public static HashMap a() {
        return C0020.m4251(C0044.m7509(m541(), 0, 10, 2442), C0022.m4403(m541(), 10, 111, 2711));
    }

    /* renamed from: ۟ۦۡۧۢ, reason: not valid java name and contains not printable characters */
    public static short[] m541() {
        if (C0011.m2755() >= 0) {
            return f103short;
        }
        return null;
    }

    public String MD5(String str) {
        try {
            byte[] bArrM6159 = C0035.m6159(C0015.m3410(C0065.m9775(m541(), 121, 3, 1347)), C0050.m8115(str));
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
            C0018.m3933(sb2, C0005.m1645(m541(), 124, 8, 2831));
            C0018.m3933(sb2, C0047.m7763(sb));
            C0012.m2969(printStreamM6087, C0047.m7763(sb2));
            return C0047.m7763(sb);
        } catch (NoSuchAlgorithmException e) {
            C0049.m7975(e);
            return C0007.m1840();
        }
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        String strM1840;
        String strM4915 = C0026.m4915(C0054.m8574(m541(), 132, 18, 3157), str);
        String strM5062 = C0027.m5062(m541(), 150, 1, 1104);
        if (str2 != strM5062 && (str2 == null || !C0058.m9103(str2, strM5062))) {
            strM4915 = C0028.m5172(strM4915, C0056.m8911(m541(), 151, 1, 1711), str2);
        }
        h hVarM3577 = C0016.m3577(C0032.m5769(strM4915, C0023.m4572()));
        ArrayList arrayList = new ArrayList();
        Iterator itM7807 = C0047.m7807(C0030.m5333(hVarM3577, C0042.m7151(m541(), 152, 17, 1633)));
        while (C0012.m2962(itM7807)) {
            m mVar = (m) C0048.m7949(itM7807);
            String strM2339 = C0010.m2339(mVar, C0021.m4340(m541(), 169, 4, 1599));
            String strM23392 = C0010.m2339(mVar, C0009.m2037(m541(), 173, 5, 3142));
            String strM8058 = C0049.m8058(C0030.m5333(mVar, C0050.m8131(m541(), 178, 3, 1162)), C0012.m2973(m541(), 181, 8, 2589));
            d dVarM5333 = C0030.m5333(mVar, C0006.m1774(m541(), 189, 16, 355));
            if (C0009.m2095(dVarM5333) > 0) {
                m mVarM7303 = C0043.m7303(dVarM5333);
                strM1840 = C0007.m1815(C0025.m4804(C0039.m6507(mVarM7303)), C0055.m8814(m541(), 205, 8, 2601)) ? C0064.m9669(mVarM7303) : C0010.m2339(mVarM7303, C0022.m4403(m541(), 213, 5, 1542));
            } else {
                strM1840 = C0007.m1840();
            }
            C0055.m8732(strM2339, strM23392, strM8058, strM1840, arrayList);
        }
        return C0020.m4216(C0011.m2808(C0038.m6456(str2)), C0047.m7818(1, str2), C0011.m2808(C0009.m2139(arrayList)), C0011.m2808(Integer.MAX_VALUE), arrayList);
    }

    public String detailContent(List<String> list) {
        StringBuilder sb = new StringBuilder(C0018.m3917(m541(), 218, 18, 751));
        C0018.m3933(sb, (String) C0048.m7915(list, 0));
        h hVarM3577 = C0016.m3577(C0032.m5769(C0047.m7763(sb), C0023.m4572()));
        String strM4684 = C0024.m4684(C0030.m5333(hVarM3577, C0007.m1842(m541(), 236, 19, 2896)));
        String strM8058 = C0049.m8058(C0030.m5333(hVarM3577, C0042.m7151(m541(), 255, 15, 782)), C0051.m8259(m541(), 270, 5, 435));
        String strM8259 = C0051.m8259(m541(), 275, 23, 2941);
        String strM1840 = C0007.m1840();
        String strM3446 = C0015.m3446(C0015.m3446(strM8058, strM8259, strM1840), C0020.m4199(m541(), 298, 2, 2058), strM1840);
        String strM9669 = C0064.m9669((m) C0028.m5161(C0030.m5333(hVarM3577, C0046.m7718(m541(), 300, 25, 1046)), 1));
        d dVarM5333 = C0030.m5333(hVarM3577, C0036.m6188(m541(), 325, 14, 2047));
        d dVarM53332 = C0030.m5333(hVarM3577, C0043.m7290(m541(), 339, 27, 718));
        String strM5172 = strM1840;
        String strM51722 = strM5172;
        int i = 0;
        while (i < C0009.m2095(dVarM5333)) {
            String strM96692 = C0064.m9669((m) C0028.m5161(dVarM5333, i));
            boolean zM1815 = C0007.m1815(strM1840, strM5172);
            String strM7902 = C0048.m7902(m541(), 366, 3, 864);
            strM5172 = !zM1815 ? C0028.m5172(strM5172, strM7902, strM96692) : C0065.m9804(strM5172, strM96692);
            d dVarM53333 = C0030.m5333((m) C0028.m5161(dVarM53332, i), C0064.m9599(m541(), 369, 1, 1602));
            String strM7763 = strM1840;
            int i2 = 0;
            while (i2 < C0009.m2095(dVarM53333)) {
                boolean zM18152 = C0007.m1815(strM1840, strM7763);
                String strM8814 = C0055.m8814(m541(), 370, 4, 1765);
                d dVar = dVarM53332;
                String strM1645 = C0005.m1645(m541(), 374, 1, 2485);
                StringBuilder sbM3016 = !zM18152 ? C0012.m3016(strM7763, C0016.m3525(m541(), 375, 1, 2921)) : C0031.m5621(strM7763);
                C0018.m3933(sbM3016, C0064.m9669((m) C0028.m5161(dVarM53333, i2)));
                C0018.m3933(sbM3016, strM1645);
                C0018.m3933(sbM3016, C0010.m2339((m) C0028.m5161(dVarM53333, i2), strM8814));
                strM7763 = C0047.m7763(sbM3016);
                i2++;
                dVarM53332 = dVar;
            }
            d dVar2 = dVarM53332;
            strM51722 = !C0007.m1815(strM1840, strM51722) ? C0028.m5172(strM51722, strM7902, strM7763) : C0065.m9804(strM51722, strM7763);
            i++;
            dVarM53332 = dVar2;
        }
        com.github.catvod.spider.merge.E.m mVar = new com.github.catvod.spider.merge.E.m();
        C0011.m2828(mVar, (String) C0048.m7915(list, 0));
        C0026.m4947(mVar, strM3446);
        C0022.m4432(mVar, strM9669);
        C0005.m1628(mVar, strM4684);
        C0054.m8596(mVar, strM5172);
        C0044.m7449(mVar, strM51722);
        return C0053.m8428(mVar);
    }

    public String homeContent(boolean z) {
        String strM4107;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        HashMap mapM4572 = C0023.m4572();
        String strM9775 = C0065.m9775(m541(), 376, 18, 328);
        h hVarM3577 = C0016.m3577(C0032.m5769(strM9775, mapM4572));
        Iterator itM7807 = C0047.m7807(C0030.m5333(hVarM3577, C0002.m1305(m541(), 394, 39, 1202)));
        while (true) {
            boolean zM2962 = C0012.m2962(itM7807);
            strM4107 = C0019.m4107(m541(), 433, 4, 2905);
            if (!zM2962) {
                break;
            }
            m mVar = (m) C0048.m7949(itM7807);
            if (C0058.m9127(C0064.m9669(mVar), C0013.m3106(m541(), 437, 2, 724))) {
                break;
            }
            C0004.m1532(arrayList2, new b(C0010.m2339(mVar, strM4107), C0064.m9669(mVar), null));
        }
        Iterator itM78072 = C0047.m7807(C0030.m5333(hVarM3577, C0018.m3917(m541(), 439, 17, 2428)));
        while (C0012.m2962(itM78072)) {
            m mVar2 = (m) C0048.m7949(itM78072);
            try {
                String strM8058 = C0049.m8058(C0030.m5333(mVar2, C0048.m7902(m541(), 456, 3, 863)), C0029.m5256(m541(), 459, 8, 1636));
                String strM2339 = C0010.m2339(mVar2, strM4107);
                String strM23392 = C0010.m2339(mVar2, C0045.m7657(m541(), 467, 5, 1233));
                if (!C0043.m7277(strM8058, C0038.m6452(m541(), 472, 4, 740))) {
                    StringBuilder sb = new StringBuilder();
                    C0018.m3933(sb, strM9775);
                    C0018.m3933(sb, strM8058);
                    strM8058 = C0047.m7763(sb);
                }
                C0004.m1532(arrayList, new com.github.catvod.spider.merge.E.m(strM2339, strM23392, strM8058));
            } catch (Exception unused) {
            }
        }
        return C0025.m4831(arrayList2, arrayList);
    }

    public String playerContent(String str, String str2, List<String> list) {
        String strM1840;
        Matcher matcherM6026 = C0034.m6026(C0005.m1602(C0009.m2037(m541(), 494, 18, 2973)), C0000.m1081(C0016.m3577(C0032.m5769(C0050.m8125(C0040.m6584(m541(), 476, 18, 531), str2), C0023.m4572()))));
        if (C0003.m1405(matcherM6026)) {
            String strM4306 = C0021.m4306(matcherM6026, 1);
            StringBuilder sb = new StringBuilder();
            C0018.m3933(sb, C0015.m3446(strM4306, C0021.m4340(m541(), 512, 2, 455), C0014.m3332(m541(), 514, 1, 2319)));
            C0018.m3933(sb, C0054.m8574(m541(), 515, 4, 2493));
            strM1840 = C0047.m7763(sb);
        } else {
            strM1840 = C0007.m1840();
        }
        g gVar = new g();
        C0017.m3667(gVar, strM1840);
        C0057.m9029(gVar, C0023.m4572());
        return C0033.m5828(gVar);
    }

    public String searchContent(String str, boolean z) {
        ArrayList arrayList = new ArrayList();
        Iterator itM7807 = C0047.m7807(C0030.m5333(C0016.m3577(C0032.m5769(C0050.m8125(C0050.m8125(C0018.m3917(m541(), 519, 39, 2515), C0056.m8909(str)), C0032.m5708(m541(), 558, 5, 1702)), C0023.m4572())), C0014.m3332(m541(), 563, 17, 693)));
        while (C0012.m2962(itM7807)) {
            m mVar = (m) C0048.m7949(itM7807);
            try {
                String strM8058 = C0049.m8058(C0030.m5333(mVar, C0041.m6779(m541(), 580, 3, 1011)), C0024.m4740(m541(), 583, 8, 2152));
                String strM2339 = C0010.m2339(mVar, C0001.m1189(m541(), 591, 4, 2741));
                String strM23392 = C0010.m2339(mVar, C0039.m6551(m541(), 595, 5, 1378));
                if (!C0043.m7277(strM8058, C0053.m8477(m541(), 600, 4, 1791))) {
                    StringBuilder sb = new StringBuilder();
                    C0018.m3933(sb, C0015.m3484(m541(), 604, 18, 2432));
                    C0018.m3933(sb, strM8058);
                    strM8058 = C0047.m7763(sb);
                }
                C0004.m1532(arrayList, new com.github.catvod.spider.merge.E.m(strM2339, strM23392, strM8058));
            } catch (Exception unused) {
            }
        }
        return C0047.m7783(arrayList);
    }
}