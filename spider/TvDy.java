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
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.b0.C0045;
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
import com.github.catvod.spider.merge.r0.C0060;
import com.github.catvod.spider.merge.t.C0061;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.merge.z.C0065;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.c0.C0010;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import com.github.catvod.spider.p000mergexbpq.r.C0014;
import com.github.catvod.spider.p000mergexbpq.x.C0015;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;

/* loaded from: classes.dex */
public class TvDy extends Spider {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f109short = {1103, 1129, 1151, 1128, 1079, 1115, 1149, 1151, 1140, 1134, 2104, 2074, 2063, 2076, 2073, 2073, 2068, 2138, 2112, 2139, 2117, 2133, 2141, 2082, 2076, 2075, 2065, 2074, 2050, 2054, 2133, 2107, 2081, 2133, 2116, 2117, 2139, 2117, 2126, 2133, 2082, 2076, 2075, 2115, 2113, 2126, 2133, 2061, 2115, 2113, 2140, 2133, 2100, 2053, 2053, 2073, 2064, 2082, 2064, 2071, 2110, 2076, 2049, 2138, 2112, 2118, 2114, 2139, 2118, 2115, 2133, 2141, 2110, 2109, 2081, 2104, 2105, 2137, 2133, 2073, 2076, 2078, 2064, 2133, 2098, 2064, 2070, 2078, 2074, 2140, 2133, 2102, 2077, 2055, 2074, 2072, 2064, 2138, 2116, 2119, 2119, 2139, 2117, 2139, 2117, 2139, 2117, 2133, 2086, 2068, 2067, 2068, 2055, 2076, 2138, 2112, 2118, 2114, 2139, 2118, 2115, 1381, 1401, 1401, 1405, 1406, 1335, 1314, 1314, 1402, 1402, 1402, 1315, 1401, 1403, 1385, 1396, 1315, 1397, 1396, 1399, 1314, 1406, 1384, 1388, 1407, 1390, 1381, 1315, 1405, 1381, 1405, 1330, 1401, 1380, 1385, 1328, 440, 493, 507, 511, 492, 509, 502, 490, 487, 494, 507, 419, 427, 440, 497, 492, 506, 507, 492, 419, 509, 497, 499, 499, 507, 496, 506, 440, 494, 511, 505, 507, 419, 2141, 2128, 2127, 2071, 2122, 2125, 2124, 2128, 2068, 2127, 2134, 2141, 2133, 2128, 2122, 2125, 2150, 2150, 2139, 2134, 2113, 2073, 2136, 1593, 1596, 1577, 1596, 1648, 1586, 1583, 1588, 1594, 1588, 1587, 1596, 1585, 747, 753, 742, 741, 2364, 2337, 2364, 2340, 2349, 2632, 2644, 2644, 2640, 1011, 1007, 1007, 1003, 1000, 929, 948, 948, 1004, 1004, 1004, 949, 1007, 1005, 1023, 994, 949, 995, 994, 993, 1260, 1792, 1820, 1820, 1816, 1819, 1874, 1863, 1863, 1823, 1823, 1823, 1862, 1820, 1822, 1804, 1809, 1862, 1808, 1809, 1810, 1863, 1797, 1799, 1822, 1793, 1805, 1863, 822, 879, 880, 810, 823, 810, 818, 827, 1961, 2022, 1976, 1953, 1963, 2024, 1953, 1957, 1967, 3111, 3106, 3127, 3106, 3182, 3116, 3121, 3114, 3108, 3114, 3117, 3106, 3119, 296, 374, 316, 313, 300, 313, 21558, 17599, -2728, 939, 936, 953, 950, 1014, 956, 957, 940, 953, 945, 948, 1013, 955, 951, 950, 940, 957, 950, 940, 2299, 2294, 2281, 2225, 2284, 2283, 2282, 2294, 2226, 2281, 2288, 2299, 2291, 2294, 2284, 2283, 2240, 2240, 2295, 2298, 2302, 2299, 2239, 2295, 2219, 1244, 1233, 1230, 1174, 1227, 1228, 1229, 1233, 1173, 1230, 1239, 1244, 1236, 1233, 1227, 1228, 1255, 1255, 1232, 1245, 1241, 1244, 1176, 1229, 1236, 3301, 3301, 3301, 2262, 1605, 1562, 1542, 1547, 1555, 1605, 849, 843, 860, 863, 2024, 3104, 2755, 2783, 2783, 2779, 2776, 2705, 2692, 2692, 2780, 2780, 2780, 2693, 2783, 2781, 2767, 2770, 2693, 2771, 2770, 2769, 2634, 3045, 1051, 3066, 1231, 548, 547, 32242, 22454, 29409, -29166, 21939, 30714, -29828, 23396, 26343, 32722, 21620, 30436, 22299, 31241, 1398, 1386, 1386, 1390, 1389, 1316, 1329, 1329, 1385, 1385, 1385, 1328, 1386, 1384, 1402, 1383, 1328, 1382, 1383, 1380, 1170, 1245, 1152, 1159, 1158, 1178, 1246, 1157, 1180, 1175, 1183, 1178, 1152, 1159, 1196, 1196, 1159, 1179, 1158, 1182, 1169, 3011, 3014, 3027, 3014, 2954, 3016, 3029, 3022, 3008, 3022, 3017, 3014, 3019, 1950, 1924, 1939, 1936, 2193, 2188, 2193, 2185, 2176, 3137, 3165, 3165, 3161, 1068, 1146, 1126, 1126, 1122, 1121, 1064, 1085, 1085, 1125, 1125, 1125, 1084, 1126, 1124, 1142, 1131, 1084, 1130, 1131, 1128, 1085, 1122, 1150, 1139, 1131, 1085, 3306, 3325, 3310, 3260, 3314, 3315, 3307, 3233, 3326, 3325, 3311, 3321, 3242, 3240, 3320, 3321, 3327, 3315, 3320, 3321, 3252, 3250, 3254, 3235, 3253, 3239, 3306, 3325, 3310, 367, 283, 357, 1707, 1749, 1758, 1949, 1921, 1921, 1925, 1926, 1999, 2010, 2010, 1922, 1922, 1922, 2011, 1921, 1923, 1937, 1932, 2011, 1933, 1932, 1935, 2010, 1926, 1936, 1940, 1927, 1942, 1949, 2011, 1925, 1949, 1925, 1994, 1926, 1936, 1940, 1927, 1942, 1949, 1922, 1946, 1927, 1937, 1992, 711, 714, 725, 653, 720, 727, 726, 714, 654, 725, 716, 711, 719, 714, 720, 727, 764, 764, 705, 716, 731, 643, 706, 3310, 3307, 3326, 3307, 3239, 3301, 3320, 3299, 3309, 3299, 3300, 3307, 3302, 415, 389, 402, 401, 2215, 2234, 2215, 2239, 2230, 1182, 1154, 1154, 1158, 2482, 2478, 2478, 2474, 2473, 2528, 2549, 2549, 2477, 2477, 2477, 2548, 2478, 2476, 2494, 2467, 2548, 2466, 2467, 2464, 1483};

    public static HashMap a() {
        return C0020.m4251(C0011.m2805(m559(), 0, 10, 1050), C0045.m7657(m559(), 10, 111, 2165));
    }

    public static String decodeBase64(String str) {
        return new String(C0034.m5997(str, 0));
    }

    /* renamed from: ۣۣۢ۠, reason: not valid java name and contains not printable characters */
    public static short[] m559() {
        if (C0024.m4693() < 0) {
            return f109short;
        }
        return null;
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder(C0048.m7902(m559(), 121, 36, 1293));
        C0018.m3933(sb, str);
        C0018.m3933(sb, C0036.m6188(m559(), 157, 33, 414));
        C0018.m3933(sb, str2);
        Iterator itM7807 = C0047.m7807(C0030.m5333(C0016.m3577(C0032.m5769(C0047.m7763(sb), C0015.m3508())), C0047.m7833(m559(), 190, 23, 2105)));
        while (C0012.m2962(itM7807)) {
            m mVar = (m) C0048.m7949(itM7807);
            try {
                String strM2339 = C0010.m2339(mVar, C0029.m5256(m559(), 213, 13, 1629));
                String strM23392 = C0010.m2339(mVar, C0060.m9352(m559(), 226, 4, 643));
                String strM23393 = C0010.m2339(mVar, C0030.m5362(m559(), 230, 5, 2376));
                if (!C0043.m7277(strM2339, C0036.m6188(m559(), 235, 4, 2592))) {
                    StringBuilder sb2 = new StringBuilder();
                    C0018.m3933(sb2, C0036.m6188(m559(), 239, 20, 923));
                    C0018.m3933(sb2, strM2339);
                    strM2339 = C0047.m7763(sb2);
                }
                C0004.m1532(arrayList, new com.github.catvod.spider.merge.E.m(C0024.m4752(strM23392, C0033.m5852(m559(), 259, 1, 1219))[2], strM23393, strM2339));
            } catch (Exception unused) {
            }
        }
        return C0020.m4216(C0011.m2808(C0038.m6456(str2)), C0047.m7818(1, str2), C0011.m2808(20), C0054.m8556(str2, 1, 20), arrayList);
    }

    public String detailContent(List<String> list) {
        h hVarM3577 = C0016.m3577(C0032.m5769(C0050.m8125(C0003.m1398(m559(), 260, 27, 1896), (String) C0048.m7915(list, 0)), C0015.m3508()));
        String strM4684 = C0024.m4684(C0030.m5333(hVarM3577, C0014.m3332(m559(), 287, 8, 862)));
        String strM8058 = C0049.m8058(C0030.m5333(hVarM3577, C0045.m7657(m559(), 295, 9, 1992)), C0062.m9389(m559(), 304, 13, 3139));
        String strM9669 = C0064.m9669((m) C0028.m5161(C0030.m5333(hVarM3577, C0036.m6188(m559(), 317, 6, 344)), 4));
        String strM1398 = C0003.m1398(m559(), 323, 3, 2626);
        String strM1840 = C0007.m1840();
        String strM3446 = C0015.m3446(strM9669, strM1398, strM1840);
        String strM46842 = C0024.m4684(C0030.m5333(hVarM3577, C0032.m5708(m559(), 326, 19, 984)));
        d dVarM5333 = C0030.m5333(hVarM3577, C0061.m9361(m559(), 345, 25, 2207));
        d dVarM53332 = C0030.m5333(hVarM3577, C0058.m9106(m559(), 370, 25, 1208));
        String str = strM1840;
        String strM5172 = str;
        int i = 0;
        while (i < C0009.m2095(dVarM5333)) {
            String strM96692 = C0064.m9669((m) C0028.m5161(dVarM5333, i));
            boolean zM1815 = C0007.m1815(strM1840, str);
            String strM2300 = C0010.m2300(m559(), 395, 3, 3265);
            String strM51722 = !zM1815 ? C0028.m5172(str, strM2300, strM96692) : C0065.m9804(str, strM96692);
            d dVarM53333 = C0030.m5333((m) C0028.m5161(dVarM53332, i), C0032.m5708(m559(), 398, 1, 2231));
            String strM7763 = strM1840;
            int i2 = 0;
            while (i2 < C0009.m2095(dVarM53333)) {
                boolean zM18152 = C0007.m1815(strM1840, strM7763);
                d dVar = dVarM53332;
                String strM8978 = C0057.m8978(m559(), 399, 6, 1642);
                d dVar2 = dVarM5333;
                String strM8477 = C0053.m8477(m559(), 405, 4, 825);
                String str2 = strM51722;
                String strM7657 = C0045.m7657(m559(), 409, 1, 1996);
                StringBuilder sbM3016 = !zM18152 ? C0012.m3016(strM7763, C0019.m4107(m559(), 410, 1, 3075)) : C0031.m5621(strM7763);
                C0018.m3933(sbM3016, C0064.m9669((m) C0028.m5161(dVarM53333, i2)));
                C0018.m3933(sbM3016, strM7657);
                C0018.m3933(sbM3016, C0015.m3446(C0010.m2339((m) C0028.m5161(dVarM53333, i2), strM8477), strM8978, strM1840));
                strM7763 = C0047.m7763(sbM3016);
                i2++;
                dVarM53332 = dVar;
                dVarM5333 = dVar2;
                strM51722 = str2;
            }
            d dVar3 = dVarM53332;
            d dVar4 = dVarM5333;
            String str3 = strM51722;
            strM5172 = !C0007.m1815(strM1840, strM5172) ? C0028.m5172(strM5172, strM2300, strM7763) : C0065.m9804(strM5172, strM7763);
            i++;
            dVarM53332 = dVar3;
            dVarM5333 = dVar4;
            str = str3;
        }
        com.github.catvod.spider.merge.E.m mVar = new com.github.catvod.spider.merge.E.m();
        C0011.m2828(mVar, (String) C0048.m7915(list, 0));
        StringBuilder sb = new StringBuilder(C0041.m6779(m559(), 411, 20, 2731));
        C0018.m3933(sb, strM8058);
        C0026.m4947(mVar, C0047.m7763(sb));
        C0022.m4432(mVar, strM3446);
        C0005.m1628(mVar, strM4684);
        C0027.m5000(mVar, strM46842);
        C0054.m8596(mVar, str);
        C0044.m7449(mVar, strM5172);
        return C0053.m8428(mVar);
    }

    public String homeContent(boolean z) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        String[] strArr = {C0009.m2037(m559(), 431, 1, 2683), C0060.m9352(m559(), 432, 1, 3031), C0030.m5362(m559(), 433, 1, 1064), C0010.m2300(m559(), 434, 1, 3022), C0032.m5708(m559(), 435, 1, 1274), C0009.m2037(m559(), 436, 2, 535)};
        String[] strArr2 = {C0052.m8337(m559(), 438, 2, 2247), C0013.m3106(m559(), 440, 3, 2004), C0016.m3525(m559(), 443, 2, 2310), C0041.m6779(m559(), 445, 2, 2508), C0027.m5062(m559(), 447, 2, 1629), C0042.m7151(m559(), 449, 3, 2126)};
        for (int i = 0; i < 6; i++) {
            C0004.m1532(arrayList2, new b(strArr[i], strArr2[i], null));
        }
        HashMap mapM3508 = C0015.m3508();
        String strM7151 = C0042.m7151(m559(), 452, 20, 1310);
        Iterator itM7807 = C0047.m7807(C0030.m5333(C0016.m3577(C0032.m5769(strM7151, mapM3508)), C0009.m2037(m559(), 472, 21, 1267)));
        while (C0012.m2962(itM7807)) {
            m mVar = (m) C0048.m7949(itM7807);
            try {
                String strM2339 = C0010.m2339(mVar, C0047.m7833(m559(), 493, 13, 2983));
                String strM23392 = C0010.m2339(mVar, C0035.m6131(m559(), 506, 4, 2038));
                String strM23393 = C0010.m2339(mVar, C0028.m5109(m559(), 510, 5, 2277));
                if (!C0043.m7277(strM2339, C0009.m2037(m559(), 515, 4, 3113))) {
                    StringBuilder sb = new StringBuilder();
                    C0018.m3933(sb, strM7151);
                    C0018.m3933(sb, strM2339);
                    strM2339 = C0047.m7763(sb);
                }
                C0004.m1532(arrayList, new com.github.catvod.spider.merge.E.m(C0024.m4752(strM23392, C0018.m3917(m559(), 519, 1, 1027))[2], strM23393, strM2339));
            } catch (Exception unused) {
            }
        }
        return C0025.m4831(arrayList2, arrayList);
    }

    public String playerContent(String str, String str2, List<String> list) {
        h hVarM3577 = C0016.m3577(C0032.m5769(C0050.m8125(C0012.m2973(m559(), 520, 26, 1042), str2), C0015.m3508()));
        Matcher matcherM6026 = C0034.m6026(C0005.m1602(C0004.m1549(m559(), 546, 29, 3228)), C0000.m1081(hVarM3577));
        String strM1081 = C0000.m1081(hVarM3577);
        if (C0003.m1405(matcherM6026)) {
            String strM4306 = C0021.m4306(matcherM6026, 1);
            String strM8477 = C0053.m8477(m559(), 575, 3, 327);
            String strM1840 = C0007.m1840();
            strM1081 = C0029.m5242(C0015.m3446(C0015.m3446(strM4306, strM8477, strM1840), C0032.m5708(m559(), 578, 3, 1783), strM1840));
        }
        g gVar = new g();
        C0017.m3667(gVar, strM1081);
        C0057.m9029(gVar, C0015.m3508());
        return C0033.m5828(gVar);
    }

    public String searchContent(String str, boolean z) {
        ArrayList arrayList = new ArrayList();
        Iterator itM7807 = C0047.m7807(C0030.m5333(C0016.m3577(C0032.m5769(C0050.m8125(C0005.m1645(m559(), 581, 43, 2037), C0056.m8909(str)), C0015.m3508())), C0065.m9775(m559(), 624, 23, 675)));
        while (C0012.m2962(itM7807)) {
            m mVar = (m) C0048.m7949(itM7807);
            try {
                String strM2339 = C0010.m2339(mVar, C0047.m7833(m559(), 647, 13, 3210));
                String strM23392 = C0010.m2339(mVar, C0029.m5256(m559(), 660, 4, 503));
                String strM23393 = C0010.m2339(mVar, C0055.m8814(m559(), 664, 5, 2259));
                if (!C0043.m7277(strM2339, C0013.m3106(m559(), 669, 4, 1270))) {
                    StringBuilder sb = new StringBuilder();
                    C0018.m3933(sb, C0056.m8911(m559(), 673, 20, 2522));
                    C0018.m3933(sb, strM2339);
                    strM2339 = C0047.m7763(sb);
                }
                C0004.m1532(arrayList, new com.github.catvod.spider.merge.E.m(C0024.m4752(strM23392, C0030.m5362(m559(), 693, 1, 1508))[2], strM23393, strM2339));
            } catch (Exception unused) {
            }
        }
        return C0047.m7783(arrayList);
    }
}