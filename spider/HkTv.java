package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.E.b;
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
import com.github.catvod.spider.merge.V0.d;
import com.github.catvod.spider.merge.W.C0034;
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
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.f0.C0052;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.p.C0057;
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
import com.github.catvod.spider.p000mergexbpq.r.C0014;
import com.github.catvod.spider.p000mergexbpq.x.C0015;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;

/* loaded from: classes.dex */
public class HkTv extends Spider {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f70short = {1658, 1638, 1638, 1634, 1576, 1597, 1597, 1637, 1637, 1637, 1596, 1638, 1636, 1643, 1648, 1570, 1569, 1596, 1649, 1661, 1663, 801, 888, 865, 874, 801, 890, 887, 894, 875, 801, 871, 874, 801, 2339, 2426, 2403, 2408, 2339, 2408, 2409, 2424, 2413, 2405, 2400, 2339, 2405, 2408, 2339, 441, 480, 505, 498, 441, 486, 506, 503, 495, 441, 511, 498, 441, 793, 832, 857, 850, 793, 837, 851, 855, 836, 853, 862, 792, 862, 834, 859, 858, 777, 833, 850, 779, 2532, 2498, 2516, 2499, 2460, 2544, 2518, 2516, 2527, 2501, 1077, 1047, 1026, 1041, 1044, 1044, 1049, 1111, 1101, 1110, 1096, 1112, 1104, 1071, 1041, 1046, 1052, 1047, 1039, 1035, 1112, 1078, 1068, 1112, 1097, 1096, 1110, 1096, 1091, 1112, 1071, 1041, 1046, 1102, 1100, 1091, 1112, 1024, 1102, 1100, 1105, 1112, 1081, 1032, 1032, 1044, 1053, 1071, 1053, 1050, 1075, 1041, 1036, 1111, 1101, 1099, 1103, 1110, 1099, 1102, 1112, 1104, 1075, 1072, 1068, 1077, 1076, 1108, 1112, 1044, 1041, 1043, 1053, 1112, 1087, 1053, 1051, 1043, 1047, 1105, 1112, 1083, 1040, 1034, 1047, 1045, 1053, 1111, 1097, 1098, 1098, 1110, 1096, 1110, 1096, 1110, 1096, 1112, 1067, 1049, 1054, 1049, 1034, 1041, 1111, 1101, 1099, 1103, 1110, 1099, 1102, 665, 735, 707, 730, 731, 608, 1970, 2029, 2044, 2042, 2040, 1970, 1947, 1922, 1984, 1923, 1943, 1947, 1927, 1987, 1944, 1921, 1930, 1922, 1927, 1949, 1946, 1998, 1922, 1927, 1998, 1935, 1984, 1923, 1943, 1947, 1927, 1987, 1944, 1921, 1930, 1922, 1927, 1949, 1946, 1969, 1969, 1946, 1926, 1947, 1923, 1932, 1516, 1513, 1532, 1513, 1445, 1511, 1530, 1505, 1519, 1505, 1510, 1513, 1508, 515, 537, 526, 525, 791, 778, 791, 783, 774, 2600, 2612, 2612, 2608, 1090, 2126, 2071, 2056, 2130, 2127, 2130, 2122, 2115, 2223, 2272, 2211, 2231, 2235, 2215, 2275, 2232, 2209, 2218, 2210, 2215, 2237, 2234, 2193, 2193, 2234, 2214, 2235, 2211, 2220, 2272, 2238, 2215, 2221, 2234, 2235, 2236, 2219, 2286, 2215, 2211, 2217, 842, 847, 858, 847, 771, 833, 860, 839, 841, 839, 832, 847, 834, 2865, 2876, 2851, 2939, 2872, 2860, 2848, 2876, 2936, 2853, 2868, 2875, 2864, 2873, 2826, 2826, 2877, 2864, 2868, 2865, 2939, 2871, 2874, 2849, 2849, 2874, 2872, 2936, 2873, 2876, 2875, 2864, 2939, 2868, 2870, 2849, 2876, 2851, 2864, 2939, 2870, 2873, 2864, 2868, 2855, 2867, 2876, 2861, 2933, 2877, 2918, 2753, 2776, 2714, 2777, 2765, 2753, 2781, 2713, 2775, 2779, 2778, 2752, 2769, 2778, 2752, 2795, 2795, 2776, 2781, 2759, 2752, 1893, 1893, 1893, 2899, 1373, 1284, 1309, 1302, 1373, 1282, 1310, 1299, 1291, 1373, 1307, 1302, 1373, 716, 726, 705, 706, 2644, 2102, 1485, 1173, 1946, 2042, 2525, 2517, 32098, 22310, 30294, -30043, 20740, 30348, -30198, 22289, 27282, 32700, 31254, 1628, 1555, 1616, 1604, 1608, 1620, 1552, 1611, 1618, 1625, 1617, 1620, 1614, 1609, 1634, 1634, 1609, 1621, 1608, 1616, 1631, 510, 507, 494, 507, 439, 501, 488, 499, 509, 499, 500, 507, 502, 1844, 1838, 1849, 1850, 2665, 2676, 2665, 2673, 2680, 816, 812, 812, 808, 1104, 1698, 1723, 1783, 1769, 1783, 1723, 1726, 1783, 1769, 1783, 1718, 975, 981, 962, 961, 678, 767, 742, 749, 678, 765, 752, 761, 748, 678, 736, 749, 678, 2643, 2570, 2579, 2584, 2643, 2584, 2585, 2568, 2589, 2581, 2576, 2643, 2581, 2584, 2643, 1675, 1746, 1739, 1728, 1675, 1748, 1736, 1733, 1757, 1675, 1741, 1728, 1675, 686, 759, 750, 741, 686, 754, 740, 736, 755, 738, 745, 687, 745, 757, 748, 749, 702, 758, 741, 700, 3253, 3298, 3301, 3323, 3275, 3253, 3245, 3275, 3253, 3263, 3257, 3261, 3240, 3262, 3275, 3253, 3259, 3275, 3253, 3298, 3301, 3323, 3272, 3321, 3314, 3311, 3299, 3275, 3253, 3245, 2847, 695, 698, 677, 765, 672, 694, 690, 673, 688, 699, 703, 698, 672, 679, 652, 698, 702, 692, 1283, 1286, 1299, 1286, 1354, 1288, 1301, 1294, 1280, 1294, 1289, 1286, 1291, 428, 438, 417, 418, 2924, 2929, 2924, 2932, 2941, 1941, 1929, 1929, 1933, 406, 463, 464, 477, 476, 470, 406, 965, 899, 927, 902, 903, 1935, 1939, 1935, 1939, 1932, 1994, 2006, 1999, 1998};
    public static String a = C0023.m4536(m433(), 0, 21, 1554);
    public static String b = C0028.m5188(new StringBuilder(), C0014.m3333(), C0024.m4740(m433(), 21, 13, 782));
    public static String c = C0028.m5188(new StringBuilder(), C0014.m3333(), C0014.m3332(m433(), 34, 15, 2316));
    public static String d = C0028.m5188(new StringBuilder(), C0014.m3333(), C0044.m7509(m433(), 49, 13, 406));
    public static String e = C0028.m5188(new StringBuilder(), C0014.m3333(), C0002.m1305(m433(), 62, 20, 822));

    public static HashMap a() {
        return C0020.m4251(C0025.m4795(m433(), 82, 10, 2481), C0029.m5256(m433(), 92, 111, 1144));
    }

    public static String decodeURL(String str) {
        int i;
        String strM8636;
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        while (i2 < C0004.m1584(str)) {
            if (C0007.m1823(str, i2) != '%' || (i = i2 + 2) >= C0004.m1584(str)) {
                C0062.m9399(sb, C0007.m1823(str, i2));
                i2++;
            } else {
                int i3 = i2 + 1;
                if (C0007.m1823(str, i3) == 'u') {
                    i2 += 6;
                    strM8636 = C0054.m8636(str, i, i2);
                } else {
                    i2 += 3;
                    strM8636 = C0054.m8636(str, i3, i2);
                }
                C0062.m9399(sb, (char) C0032.m5751(strM8636, 16));
            }
        }
        return C0047.m7763(sb);
    }

    /* renamed from: ۣ۟ۤۤ۟, reason: not valid java name and contains not printable characters */
    public static short[] m433() {
        if (C0045.m7538() < 0) {
            return f70short;
        }
        return null;
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        String strM1715 = C0006.m1715();
        String strM8814 = C0055.m8814(m433(), 203, 5, 695);
        String strM6434 = C0038.m6434(sb, strM1715, str, strM8814);
        if (!C0007.m1815(C0019.m4107(m433(), 208, 1, 593), str2)) {
            StringBuilder sb2 = new StringBuilder();
            C0011.m2747(sb2, C0006.m1715(), str2, C0062.m9389(m433(), 209, 6, 1949), str);
            C0018.m3933(sb2, strM8814);
            strM6434 = C0047.m7763(sb2);
        }
        Iterator itM7807 = C0047.m7807(C0030.m5333(C0016.m3577(C0032.m5769(strM6434, C0029.m5259())), C0002.m1305(m433(), 215, 40, 2030)));
        while (C0012.m2962(itM7807)) {
            m mVar = (m) C0048.m7949(itM7807);
            try {
                String strM2339 = C0010.m2339(mVar, C0018.m3917(m433(), 255, 13, 1416));
                String strM23392 = C0010.m2339(mVar, C0034.m6001(m433(), 268, 4, 619));
                String strM23393 = C0010.m2339(mVar, C0041.m6779(m433(), 272, 5, 867));
                if (!C0043.m7277(strM2339, C0010.m2300(m433(), 277, 4, 2624))) {
                    StringBuilder sb3 = new StringBuilder();
                    C0018.m3933(sb3, C0014.m3333());
                    C0018.m3933(sb3, strM2339);
                    strM2339 = C0047.m7763(sb3);
                }
                C0004.m1532(arrayList, new com.github.catvod.spider.merge.E.m(C0024.m4752(strM23392, C0061.m9361(m433(), 281, 1, 1133))[4], strM23393, strM2339));
            } catch (Exception unused) {
            }
        }
        return C0020.m4216(C0011.m2808(C0038.m6456(str2)), C0047.m7818(1, str2), C0011.m2808(20), C0054.m8556(str2, 1, 20), arrayList);
    }

    public String detailContent(List<String> list) {
        h hVarM3577 = C0016.m3577(C0032.m5769(C0050.m8125(C0042.m7121(), (String) C0048.m7915(list, 0)), C0029.m5259()));
        String strM4684 = C0024.m4684(C0030.m5333(hVarM3577, C0006.m1774(m433(), 282, 8, 2086)));
        String strM8058 = C0049.m8058(C0030.m5333(hVarM3577, C0053.m8477(m433(), 290, 33, 2254)), C0016.m3525(m433(), 323, 13, 814));
        d dVarM5333 = C0030.m5333(hVarM3577, C0060.m9352(m433(), 336, 51, 2901));
        d dVarM53332 = C0030.m5333(hVarM3577, C0038.m6452(m433(), 387, 21, 2740));
        String strM1840 = C0007.m1840();
        String strM5172 = strM1840;
        String strM51722 = strM5172;
        int i = 1;
        for (int i2 = 1; i < C0009.m2095(dVarM5333) - i2; i2 = 1) {
            String strM9669 = C0064.m9669((m) C0028.m5161(dVarM5333, i));
            boolean zM1815 = C0007.m1815(strM1840, strM5172);
            String strM3646 = C0017.m3646(m433(), 408, 3, 1857);
            strM5172 = !zM1815 ? C0028.m5172(strM5172, strM3646, strM9669) : C0065.m9804(strM5172, strM9669);
            d dVarM53333 = C0030.m5333((m) C0028.m5161(dVarM53332, i - 1), C0027.m5062(m433(), 411, 1, 2866));
            String strM7763 = strM1840;
            int i3 = 0;
            while (i3 < C0009.m2095(dVarM53333)) {
                boolean zM18152 = C0007.m1815(strM1840, strM7763);
                String strM8911 = C0056.m8911(m433(), 412, 13, 1394);
                String strM8574 = C0054.m8574(m433(), 425, 4, 676);
                d dVar = dVarM53332;
                String strM7290 = C0043.m7290(m433(), 429, 1, 2672);
                StringBuilder sbM3016 = !zM18152 ? C0012.m3016(strM7763, C0026.m4951(m433(), 430, 1, 2069)) : C0031.m5621(strM7763);
                C0018.m3933(sbM3016, C0064.m9669((m) C0028.m5161(dVarM53333, i3)));
                C0018.m3933(sbM3016, strM7290);
                C0018.m3933(sbM3016, C0015.m3446(C0010.m2339((m) C0028.m5161(dVarM53333, i3), strM8574), strM8911, strM1840));
                strM7763 = C0047.m7763(sbM3016);
                i3++;
                dVarM53332 = dVar;
            }
            d dVar2 = dVarM53332;
            strM51722 = !C0007.m1815(strM1840, strM51722) ? C0028.m5172(strM51722, strM3646, strM7763) : C0065.m9804(strM51722, strM7763);
            i++;
            dVarM53332 = dVar2;
        }
        com.github.catvod.spider.merge.E.m mVar = new com.github.catvod.spider.merge.E.m();
        C0011.m2828(mVar, (String) C0048.m7915(list, 0));
        StringBuilder sb = new StringBuilder();
        C0018.m3933(sb, C0014.m3333());
        C0018.m3933(sb, strM8058);
        C0026.m4947(mVar, C0047.m7763(sb));
        C0005.m1628(mVar, strM4684);
        C0054.m8596(mVar, strM5172);
        C0044.m7449(mVar, strM51722);
        return C0053.m8428(mVar);
    }

    public String homeContent(boolean z) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        String[] strArr = {C0007.m1842(m433(), 431, 1, 1532), C0008.m1970(m433(), 432, 1, 1191), C0014.m3332(m433(), 433, 1, 1961), C0061.m9361(m433(), 434, 1, 1998), C0060.m9352(m433(), 435, 2, 2540)};
        String[] strArr2 = {C0046.m7718(m433(), 437, 2, 2135), C0065.m9775(m433(), 439, 3, 867), C0039.m6551(m433(), 442, 2, 2160), C0005.m1645(m433(), 444, 2, 1465), C0007.m1842(m433(), 446, 2, 2129)};
        for (int i = 0; i < 5; i++) {
            C0004.m1532(arrayList2, new b(strArr[i], strArr2[i], null));
        }
        Iterator itM7807 = C0047.m7807(C0030.m5333(C0016.m3577(C0032.m5769(C0014.m3333(), C0029.m5259())), C0051.m8259(m433(), 448, 21, 1597)));
        while (C0012.m2962(itM7807)) {
            m mVar = (m) C0048.m7949(itM7807);
            try {
                String strM2339 = C0010.m2339(mVar, C0037.m6307(m433(), 469, 13, 410));
                String strM23392 = C0010.m2339(mVar, C0048.m7902(m433(), 482, 4, 1884));
                String strM23393 = C0010.m2339(mVar, C0055.m8814(m433(), 486, 5, 2589));
                if (!C0043.m7277(strM2339, C0053.m8477(m433(), 491, 4, 856))) {
                    StringBuilder sb = new StringBuilder();
                    C0018.m3933(sb, C0014.m3333());
                    C0018.m3933(sb, strM2339);
                    strM2339 = C0047.m7763(sb);
                }
                C0004.m1532(arrayList, new com.github.catvod.spider.merge.E.m(C0024.m4752(strM23392, C0004.m1549(m433(), 495, 1, 1151))[4], strM23393, strM2339));
            } catch (Exception unused) {
            }
        }
        return C0025.m4831(arrayList2, arrayList);
    }

    public void init(Context context, String str) {
        super.init(context, str);
        h hVarM3577 = C0016.m3577(C0032.m5769(str, null));
        if (C0040.m6623(new CharSequence[]{C0000.m1081(hVarM3577)})) {
            a = C0010.m2339(C0043.m7303(C0030.m5333(hVarM3577, C0061.m9361(m433(), 496, 11, 1751))), C0023.m4536(m433(), 507, 4, 935));
        }
        b = C0028.m5188(new StringBuilder(), C0014.m3333(), C0023.m4536(m433(), 511, 13, 649));
        c = C0028.m5188(new StringBuilder(), C0014.m3333(), C0064.m9599(m433(), 524, 15, 2684));
        d = C0028.m5188(new StringBuilder(), C0014.m3333(), C0011.m2805(m433(), 539, 13, 1700));
        e = C0028.m5188(new StringBuilder(), C0014.m3333(), C0012.m2973(m433(), 552, 20, 641));
    }

    public String playerContent(String str, String str2, List<String> list) {
        h hVarM3577 = C0016.m3577(C0032.m5769(C0050.m8125(C0012.m2957(), str2), C0029.m5259()));
        Matcher matcherM6026 = C0034.m6026(C0005.m1602(C0042.m7151(m433(), 572, 30, 3223)), C0000.m1081(hVarM3577));
        String strM1081 = C0000.m1081(hVarM3577);
        if (C0003.m1405(matcherM6026)) {
            strM1081 = C0006.m1776(new String(C0034.m5997(C0021.m4306(matcherM6026, 1), 0)));
        }
        g gVar = new g();
        C0017.m3667(gVar, strM1081);
        C0057.m9029(gVar, C0029.m5259());
        return C0033.m5828(gVar);
    }

    public String searchContent(String str, boolean z) {
        String strM5362 = C0030.m5362(m433(), 602, 1, 2942);
        ArrayList arrayList = new ArrayList();
        Iterator itM7807 = C0047.m7807(C0030.m5333(C0016.m3577(C0032.m5769(C0050.m8125(C0053.m8440(), C0056.m8909(str)), C0029.m5259())), C0037.m6307(m433(), 603, 18, 723)));
        while (C0012.m2962(itM7807)) {
            m mVar = (m) C0048.m7949(itM7807);
            try {
                String strM8058 = C0049.m8058(C0030.m5333(mVar, strM5362), C0017.m3646(m433(), 621, 13, 1383));
                String strM80582 = C0049.m8058(C0030.m5333(mVar, strM5362), C0011.m2805(m433(), 634, 4, 452));
                String strM80583 = C0049.m8058(C0030.m5333(mVar, strM5362), C0054.m8574(m433(), 638, 5, 2840));
                if (!C0043.m7277(strM8058, C0052.m8337(m433(), 643, 4, 2045))) {
                    StringBuilder sb = new StringBuilder();
                    C0018.m3933(sb, C0014.m3333());
                    C0018.m3933(sb, strM8058);
                    strM8058 = C0047.m7763(sb);
                }
                C0004.m1532(arrayList, new com.github.catvod.spider.merge.E.m(C0015.m3446(C0015.m3446(strM80582, C0003.m1398(m433(), 647, 7, 441), C0007.m1840()), C0018.m3917(m433(), 654, 5, 1003), C0016.m3525(m433(), 659, 9, 1954)), strM80583, strM8058));
            } catch (Exception unused) {
            }
        }
        return C0047.m7783(arrayList);
    }
}