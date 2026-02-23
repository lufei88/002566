package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.E.b;
import com.github.catvod.spider.merge.E.g;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.I0.C0020;
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
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.Z0.C0041;
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
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.r0.C0060;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.merge.z.C0065;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
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
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class HBcmsV1 extends Spider {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f37short = {3012, 3032, 3032, 3036, 3039, 2966, 2947, 2947, 3035, 3035, 3035, 2946, 3022, 3038, 3011, 3034, 3011, 3016, 2946, 3023, 3011, 3009, 2947, 1832, 1806, 1816, 1807, 1872, 1852, 1818, 1816, 1811, 1801, 2340, 2310, 2323, 2304, 2309, 2309, 2312, 2374, 2396, 2375, 2393, 2377, 2369, 2366, 2304, 2311, 2317, 2310, 2334, 2330, 2377, 2343, 2365, 2377, 2392, 2393, 2375, 2393, 2386, 2377, 2366, 2342, 2366, 2399, 2397, 2368, 2377, 2344, 2329, 2329, 2309, 2316, 2366, 2316, 2315, 2338, 2304, 2333, 2374, 2396, 2394, 2398, 2375, 2394, 2399, 2377, 2369, 2338, 2337, 2365, 2340, 2341, 2373, 2377, 2309, 2304, 2306, 2316, 2377, 2350, 2316, 2314, 2306, 2310, 2368, 2377, 2346, 2305, 2331, 2310, 2308, 2316, 2374, 2392, 2393, 2384, 2375, 2393, 2375, 2393, 2375, 2393, 2377, 2362, 2312, 2319, 2312, 2331, 2304, 2374, 2396, 2394, 2398, 2375, 2394, 2399, 1770, 1811, 1868, 1885, 1883, 1881, 1809, 1208, 1278, 1250, 1275, 1274, 3130, 3133, 3122, 3131, 3115, 3129, 3122, 3191, 3191, 3191, 1301, 1304, 1287, 1375, 1343, 1317, 1340, 1304, 1285, 1300, 1308, 1733, 1736, 1751, 1679, 1749, 1728, 1734, 1746, 26021, -30958, 32509, 21851, 3067, 3062, 3049, 2993, 3051, 3062, 3051, 3059, 3066, 3007, 2977, 3007, 3070, 1615, 1618, 1615, 1623, 1630, 1113, 1091, 1108, 1111, 2666, 2663, 2680, 2592, 2686, 2657, 2685, 2682, 2667, 2684, 2606, 2608, 2606, 2671, 2606, 2608, 2606, 2663, 2659, 2665, 718, 719, 734, 1495, 1498, 1477, 1437, 1473, 1494, 1472, 1482, 1494, 1490, 1473, 1298, 1295, 1298, 1290, 1283, 3000, 2849, 2860, 2867, 2923, 2869, 2858, 2870, 2865, 2848, 2871, 2917, 2939, 2917, 2852, 3171, 3193, 3182, 3181, 1513, 1508, 1531, 1443, 1534, 1518, 1535, 1512, 1512, 1507, 1534, 1509, 1506, 1529, 3145, 782, 1029, 2849, 1445, 1516, 1513, 1515, 1451, 1608, 1608, 1608, 3158, 3100, 3139, 1721, 1767, 1706, 1703, 1701, 1696, 1703, 1708, -28283, 25944, 2937, 2937, 2937, 22336, -32632, 2921, 2838, 2512, 2505, 2443, 2507, 2500, 2515, 2503, 2500, 2519, 2440, 2508, 2513, 2496, 2504, 2518, 2443, 2518, 2514, 2508, 2517, 2496, 2519, 2440, 2514, 2519, 2500, 2517, 2517, 2496, 2519, 1014, 724, 718, 729, 730, 812, 801, 808, 829, 2954, 2961, 2966, 2958, 1011, 1006, 1011, 1003, 994, 2558, 1980, 1952, 1952, 1956, 3045, 3065, 3043, 3044, 3061, 3059, 1983, 1982, 1967, 1646, 1585, 2120, 2125, 2127, 2095, 1949, 1944, 1946, 2010, 1021, 993, 993, 997, 998, 943, 954, 954, 929, 1022, 952, 1012, 995, 955, 1014, 1018, 1016, 954, 998, 938, 1022, 936, 1279, 1272, 1271, 1278, 1262, 1276, 1271, 1202, 1202, 1202, 870, 875, 884, 812, 844, 854, 847, 875, 886, 871, 879, 3108, 3113, 3126, 3182, 3124, 3105, 3111, 3123, 25502, -32471, 31971, 22341, 1830, 1835, 1844, 1900, 1846, 1835, 1846, 1838, 1831, 1890, 1916, 1890, 1827, 906, 919, 906, 914, 923, 429, 439, 416, 419, 595, 606, 577, 537, 583, 600, 580, 579, 594, 581, 535, 521, 535, 598, 535, 521, 535, 606, 602, 592, 2479, 2478, 2495, 578, 591, 592, 520, 596, 579, 597, 607, 579, 583, 596, 1348};
    public String a = C0049.m8007(m240(), 0, 23, 2988);

    public HBcmsV1() {
        new ArrayList();
        new ArrayList();
    }

    public static HashMap a() {
        return C0020.m4251(C0009.m2037(m240(), 23, 10, 1917), C0048.m7902(m240(), 33, 106, 2409));
    }

    /* renamed from: ۟ۡۢۤ, reason: not valid java name and contains not printable characters */
    public static short[] m240() {
        if (C0062.m9429() > 0) {
            return f37short;
        }
        return null;
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        C0011.m2747(sb, C0002.m1297(this), C0027.m5062(m240(), 139, 1, 1733), str, C0011.m2805(m240(), 140, 6, 1852));
        String strM5188 = C0028.m5188(sb, str2, C0017.m3646(m240(), 146, 5, 1174));
        PrintStream printStreamM6087 = C0035.m6087();
        StringBuilder sb2 = new StringBuilder(C0001.m1189(m240(), 151, 10, 3164));
        C0018.m3933(sb2, strM5188);
        C0012.m2969(printStreamM6087, C0047.m7763(sb2));
        Iterator itM7807 = C0047.m7807(C0030.m5333(C0016.m3577(C0032.m5769(strM5188, null)), C0043.m7290(m240(), 161, 11, 1393)));
        while (C0012.m2962(itM7807)) {
            m mVar = (m) C0048.m7949(itM7807);
            String strM4684 = C0024.m4684(C0030.m5333(mVar, C0032.m5708(m240(), 172, 8, 1697)));
            if (!C0058.m9127(strM4684, C0014.m3332(m240(), 180, 2, 1376)) && !C0058.m9127(strM4684, C0044.m7509(m240(), 182, 2, 1906))) {
                String strM8337 = C0052.m8337(m240(), 184, 13, 2975);
                String strM8058 = C0049.m8058(C0030.m5333(mVar, strM8337), C0065.m9775(m240(), 197, 5, 1595));
                String strM80582 = C0049.m8058(C0030.m5333(mVar, strM8337), C0044.m7509(m240(), 202, 4, 1073));
                C0055.m8732(C0028.m5188(new StringBuilder(), C0002.m1297(this), strM80582), strM8058, C0049.m8058(C0030.m5333(mVar, C0035.m6131(m240(), 206, 20, 2574)), C0029.m5256(m240(), 226, 3, 701)), C0064.m9669(C0036.m6243(mVar, C0036.m6188(m240(), 229, 11, 1459))), arrayList);
            }
        }
        return C0020.m4216(C0011.m2808(C0038.m6456(str2)), C0047.m7818(1, str2), C0011.m2808(20), C0054.m8556(str2, 1, 20), arrayList);
    }

    public String detailContent(List<String> list) {
        String strM1077;
        String strM8007;
        String strM4740;
        String strM7718;
        h hVarM3577 = C0016.m3577(C0032.m5769((String) C0048.m7915(list, 0), C0027.m5101()));
        String strM6001 = C0034.m6001(m240(), 240, 5, 1382);
        String str = C0002.m1240(C0024.m4684(C0030.m5333(hVarM3577, strM6001)), C0054.m8574(m240(), 245, 1, 2968), 2)[0];
        d dVarM5333 = C0030.m5333(hVarM3577, C0012.m2973(m240(), 246, 14, 2885));
        String strM4107 = C0019.m4107(m240(), 260, 4, 3083);
        String strM8058 = C0049.m8058(dVarM5333, strM4107);
        d dVarM53332 = C0030.m5333(hVarM3577, C0049.m8007(m240(), 264, 14, 1421));
        PrintStream printStreamM6087 = C0035.m6087();
        StringBuilder sb = new StringBuilder();
        C0018.m3933(sb, str);
        C0018.m3933(sb, strM8058);
        C0012.m2969(printStreamM6087, C0047.m7763(sb));
        StringBuilder sb2 = new StringBuilder(C0007.m1840());
        Iterator itM7807 = C0047.m7807(dVarM53332);
        while (true) {
            boolean zM2962 = C0012.m2962(itM7807);
            strM1077 = C0000.m1077(m240(), 278, 1, 3178);
            strM8007 = C0049.m8007(m240(), 279, 1, 810);
            strM4740 = C0024.m4740(m240(), 280, 1, 1124);
            strM7718 = C0046.m7718(m240(), 281, 1, 2911);
            if (!zM2962) {
                break;
            }
            d dVarM53333 = C0030.m5333((m) C0048.m7949(itM7807), strM4740);
            String strM80582 = C0049.m8058(dVarM53333, strM6001);
            if (C0057.m8953(strM80582)) {
                strM80582 = str;
            }
            String strM80583 = C0049.m8058(dVarM53333, strM4107);
            if (C0057.m8953(strM80583)) {
                strM80583 = (String) C0048.m7915(list, 0);
            }
            C0018.m3933(sb2, strM80582);
            C0018.m3933(sb2, strM8007);
            StringBuilder sb3 = new StringBuilder();
            C0018.m3933(sb3, strM80583);
            C0018.m3933(sb3, strM7718);
            C0018.m3933(sb3, str);
            C0018.m3933(sb3, C0005.m1645(m240(), 282, 5, 1499));
            C0018.m3933(sb2, C0047.m7763(sb3));
            C0018.m3933(sb2, strM7718);
            C0018.m3933(sb2, strM80582);
            C0018.m3933(sb2, strM1077);
        }
        C0018.m3933(sb2, C0025.m4795(m240(), 287, 3, 1644));
        Iterator itM78072 = C0047.m7807(dVarM53332);
        while (C0012.m2962(itM78072)) {
            d dVarM53334 = C0030.m5333((m) C0048.m7949(itM78072), strM4740);
            String strM80584 = C0049.m8058(dVarM53334, strM6001);
            if (C0057.m8953(strM80584)) {
                strM80584 = str;
            }
            String strM80585 = C0049.m8058(dVarM53334, strM4107);
            if (C0057.m8953(strM80585)) {
                strM80585 = (String) C0048.m7915(list, 0);
            }
            C0018.m3933(sb2, strM80584);
            C0018.m3933(sb2, strM8007);
            StringBuilder sb4 = new StringBuilder();
            C0018.m3933(sb4, strM80585);
            C0018.m3933(sb4, strM7718);
            C0018.m3933(sb4, str);
            C0018.m3933(sb4, C0025.m4795(m240(), 290, 3, 3112));
            C0018.m3933(sb2, C0047.m7763(sb4));
            C0018.m3933(sb2, strM7718);
            C0018.m3933(sb2, strM80584);
            C0018.m3933(sb2, strM1077);
        }
        String strM4684 = C0024.m4684(C0030.m5333(hVarM3577, C0039.m6551(m240(), 293, 8, 1737)));
        com.github.catvod.spider.merge.E.m mVar = new com.github.catvod.spider.merge.E.m();
        StringBuilder sb5 = new StringBuilder();
        C0018.m3933(sb5, C0055.m8703());
        C0018.m3933(sb5, strM4684);
        C0027.m5000(mVar, C0047.m7763(sb5));
        C0011.m2828(mVar, (String) C0048.m7915(list, 0));
        C0026.m4947(mVar, strM8058);
        C0005.m1628(mVar, str);
        C0054.m8596(mVar, C0025.m4795(m240(), 301, 9, 2909));
        C0044.m7449(mVar, C0000.m1096(sb2));
        return C0053.m8428(mVar);
    }

    public String homeContent(boolean z) {
        ArrayList arrayList = new ArrayList();
        Iterator itM7807 = C0047.m7807(C0038.m6459(C0030.m5333(C0016.m3577(C0032.m5769(C0002.m1297(this), C0027.m5101())), C0004.m1549(m240(), 310, 30, 2469)), C0001.m1189(m240(), 340, 1, 919)));
        while (C0012.m2962(itM7807)) {
            m mVar = (m) C0048.m7949(itM7807);
            String strM2339 = C0010.m2339(mVar, C0031.m5565(m240(), 341, 4, 700));
            String strM9389 = C0062.m9389(m240(), 345, 4, 856);
            if (C0058.m9127(strM2339, strM9389)) {
                C0004.m1532(arrayList, new b(C0015.m3446(strM2339, strM9389, C0013.m3106(m240(), 349, 4, 3065)), C0064.m9640(C0010.m2339(mVar, C0033.m5852(m240(), 353, 5, 903))), null));
            }
        }
        return C0025.m4831(arrayList, new ArrayList());
    }

    public void init(Context context, String str) {
        C0051.m8194(C0035.m6110());
        if (str != null) {
            this.a = str;
        }
    }

    public String playerContent(String str, String str2, List<String> list) {
        C0036.m6219();
        String[] strArrM4752 = C0024.m4752(str2, C0047.m7833(m240(), 358, 1, 2432));
        String strM5188 = (strArrM4752.length <= 0 || C0057.m8953(strArrM4752[0])) ? null : strArrM4752[0];
        String str3 = (strArrM4752.length <= 1 || C0057.m8953(strArrM4752[1])) ? null : strArrM4752[1];
        String str4 = (strArrM4752.length <= 2 || C0057.m8953(strArrM4752[2])) ? null : strArrM4752[2];
        String str5 = (strArrM4752.length <= 3 || C0057.m8953(strArrM4752[3])) ? null : strArrM4752[3];
        if (!C0058.m9127(strM5188, C0017.m3646(m240(), 359, 4, 2004))) {
            strM5188 = C0028.m5188(new StringBuilder(), C0002.m1297(this), strM5188);
        }
        String strM8058 = C0049.m8058(C0030.m5333(C0016.m3577(C0032.m5769(strM5188, null)), C0050.m8131(m240(), 363, 6, 2966)), C0050.m8131(m240(), 369, 3, 1996));
        String strM2827 = C0011.m2827(strM5188, str3, str5);
        if (C0057.m8953(strM8058)) {
            g gVarM9311 = C0060.m9311(1, strM5188);
            C0057.m9029(gVarM9311, C0027.m5101());
            C0002.m1282(gVarM9311, strM2827);
            return C0033.m5828(gVarM9311);
        }
        String strM6779 = C0041.m6779(m240(), 372, 2, 1626);
        if (C0058.m9127(str4, strM6779)) {
            strM8058 = C0015.m3446(C0015.m3446(strM8058, C0008.m1970(m240(), 374, 4, 2175), strM6779), C0020.m4199(m240(), 378, 4, 1962), strM6779);
        }
        g gVarM93112 = C0060.m9311(0, strM8058);
        C0057.m9029(gVarM93112, C0027.m5101());
        C0002.m1282(gVarM93112, strM2827);
        return C0033.m5828(gVarM93112);
    }

    public String searchContent(String str, String str2, boolean z) {
        ArrayList arrayList = new ArrayList();
        String strM4915 = C0026.m4915(C0013.m3106(m240(), 382, 22, 917), str);
        PrintStream printStreamM6087 = C0035.m6087();
        StringBuilder sb = new StringBuilder(C0047.m7833(m240(), 404, 10, 1177));
        C0018.m3933(sb, strM4915);
        C0012.m2969(printStreamM6087, C0047.m7763(sb));
        Iterator itM7807 = C0047.m7807(C0030.m5333(C0016.m3577(C0032.m5769(strM4915, null)), C0000.m1077(m240(), 414, 11, 770)));
        while (C0012.m2962(itM7807)) {
            m mVar = (m) C0048.m7949(itM7807);
            String strM4684 = C0024.m4684(C0030.m5333(mVar, C0058.m9106(m240(), 425, 8, 3136)));
            if (!C0058.m9127(strM4684, C0029.m5256(m240(), 433, 2, 859)) && !C0058.m9127(strM4684, C0038.m6452(m240(), 435, 2, 1388))) {
                String strM7657 = C0045.m7657(m240(), 437, 13, 1858);
                String strM8058 = C0049.m8058(C0030.m5333(mVar, strM7657), C0037.m6307(m240(), 450, 5, 1022));
                String strM80582 = C0049.m8058(C0030.m5333(mVar, strM7657), C0002.m1305(m240(), 455, 4, 453));
                C0055.m8732(C0028.m5188(new StringBuilder(), C0002.m1297(this), strM80582), strM8058, C0049.m8058(C0030.m5333(mVar, C0000.m1077(m240(), 459, 20, 567)), C0005.m1645(m240(), 479, 3, 2524)), C0064.m9669(C0036.m6243(mVar, C0036.m6188(m240(), 482, 11, 550))), arrayList);
            }
        }
        return C0047.m7783(arrayList);
    }

    public String searchContent(String str, boolean z) {
        return C0015.m3464(this, C0056.m8909(str), C0054.m8574(m240(), 493, 1, 1397), true);
    }
}