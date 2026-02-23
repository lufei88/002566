package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.E.b;
import com.github.catvod.spider.merge.E.g;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.N.C0023;
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
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.Z.C0040;
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
import com.github.catvod.spider.merge.f0.C0052;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.r0.C0060;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.a0.C0006;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.c0.C0010;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.x.C0015;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class Ysj extends Spider {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f135short = {2995, 2991, 2991, 2987, 2984, 3041, 3060, 3060, 2988, 2988, 2988, 3061, 3007, 2998, 2998, 2994, 2992, 2990, 3061, 3000, 2996, 2998, 3060, 476, 410, 390, 415, 414, 1192, 1271, 1254, 1248, 1250, 1192, 502, 497, 510, 503, 487, 501, 510, 443, 443, 443, 783, 832, 792, 769, 778, 770, 775, 797, 794, 817, 794, 774, 795, 771, 780, 832, 770, 783, 788, 791, 770, 769, 783, 778, 648, 661, 648, 656, 665, 579, 601, 590, 589, 557, 552, 573, 552, 612, 550, 571, 544, 558, 544, 551, 552, 549, 417, 418, 435, 444, 508, 418, 443, 433, 397, 422, 439, 426, 422, 508, 422, 439, 426, 422, 397, 416, 443, 437, 442, 422, 17883, -31571, -28915, 23193, 28208, 17470, 3041, 3040, 3048, 3040, 2944, 22904, 25851, 26158, 19488, 1681, 1739, 1751, 1677, 1680, 1677, 1685, 1692, 2507, 2519, 2519, 2515, 2512, 2457, 2444, 2444, 2516, 2516, 2516, 2445, 2503, 2510, 2510, 2506, 2504, 2518, 2445, 2496, 2508, 2510, 2444, 2371, 2316, 2388, 2381, 2374, 2382, 2379, 2385, 2390, 2429, 2390, 2378, 2391, 2383, 2368, 2316, 2382, 2371, 2392, 2395, 2382, 2381, 2371, 2374, 1194, 1199, 1210, 1199, 1251, 1185, 1212, 1191, 1193, 1191, 1184, 1199, 1186, 1273, 1268, 1259, 1203, 1261, 1265, 1276, 1252, 1218, 1262, 1266, 1256, 1263, 1278, 1272, 1218, 1257, 1276, 1279, 1203, 1265, 1268, 1262, 1257, 1218, 1262, 1278, 1263, 1266, 1265, 1265, 1203, 1278, 1265, 1272, 1276, 1263, 1275, 1268, 1253, 2970, 388, 413, 479, 402, 414, 415, 389, 404, 415, 389, 430, 385, 413, 400, 392, 413, 408, 386, 389, 479, 402, 413, 404, 400, 387, 407, 408, 393, 3061, 3061, 3061, 2557, 2544, 2536, 1476, 1502, 1481, 1482, 2542, 1162, 1167, 1224, 1154, 1159, 1170, 1159, 497, 498, 483, 492, 1125, 1120, 1063, 1133, 1132, 1146, 1130, 1063, 1121, 1120, 1133, 1133, 1132, 1127, 1110, 1137, 1146, 2951, 2971, 2971, 2975, 2972, 3029, 3008, 3008, 2968, 2968, 2968, 3009, 2955, 2946, 2946, 2950, 2948, 2970, 3009, 2956, 2944, 2946, 3008, 848, 841, 779, 843, 836, 851, 890, 841, 844, 854, 849, 779, 838, 841, 832, 836, 855, 835, 844, 861, 1201, 2895, 2901, 2882, 2881, 2294, 2221, 2208, 2217, 2236, 2294, 28848, 23318, -4228, 488, 423, 511, 486, 493, 485, 480, 506, 509, 470, 509, 481, 508, 484, 491, 423, 485, 488, 499, 496, 485, 486, 488, 493, 2417, 2412, 2417, 2409, 2400, 1380, 1377, 1396, 1377, 1325, 1391, 1394, 1385, 1383, 1385, 1390, 1377, 1388, 431, 428, 445, 434, 498, 428, 437, 447, 387, 424, 441, 420, 424, 498, 424, 441, 420, 424, 387, 430, 437, 443, 436, 424, 1812, 1607, 1564, 1559, 1605, 1564, 1561, 1558, 1557, 1549, 1630, 1554, 1549, 1557, 1553, 1558, 1567, 1605, 2390, 2330, 2329, 2307, 2328, 2309, 2381, 530, 2587, 2567, 2567, 2563, 2560, 2633, 2652, 2652, 2564, 2564, 2564, 2653, 2583, 2590, 2590, 2586, 2584, 2566, 2653, 2576, 2588, 2590, 2652, 2586, 2589, 2583, 2582, 2571, 2653, 2563, 2587, 2563, 2652, 2565, 2588, 2583, 2652, 2560, 2582, 2578, 2561, 2576, 2587, 2653, 2587, 2567, 2590, 2591, 2636, 2564, 2583, 2638, 867, 822, 816, 807, 808, 812, 817, 888, 2243, 2188, 2260, 2253, 2246, 2254, 2251, 2257, 2262, 2301, 2262, 2250, 2263, 2255, 2240, 2188, 2254, 2243, 2264, 2267, 2254, 2253, 2243, 2246, 3168, 3197, 3168, 3192, 3185, 2776, 2754, 2773, 2774, 1952, 1980, 1980, 1976, 1979, 2034, 2023, 2023, 1983, 1983, 1983, 2022, 1964, 1957, 1957, 1953, 1955, 1981, 2022, 1963, 1959, 1957, 2023, 2510, 2507, 2526, 2507, 2439, 2501, 2520, 2499, 2509, 2499, 2500, 2507, 2502, 2141, 2142, 2127, 2112, 2048, 2142, 2119, 2125, 2161, 2138, 2123, 2134, 2138, 2048, 2138, 2123, 2134, 2138, 2161, 2140, 2119, 2121, 2118, 2138};

    /* renamed from: ۣۧ۠ۨ, reason: not valid java name and contains not printable characters */
    public static short[] m772() {
        if (C0007.m1886() >= 0) {
            return f135short;
        }
        return null;
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        ArrayList arrayList = new ArrayList();
        String strM8131 = C0050.m8131(m772(), 0, 23, 3035);
        StringBuilder sb = new StringBuilder(strM8131);
        String strM7151 = C0042.m7151(m772(), 23, 5, 498);
        C0018.m3933(sb, C0015.m3446(str, strM7151, C0007.m1840()));
        C0018.m3933(sb, C0049.m8007(m772(), 28, 6, 1159));
        String strM5188 = C0028.m5188(sb, str2, strM7151);
        PrintStream printStreamM6087 = C0035.m6087();
        StringBuilder sb2 = new StringBuilder(C0000.m1077(m772(), 34, 10, 400));
        C0018.m3933(sb2, strM5188);
        C0012.m2969(printStreamM6087, C0047.m7763(sb2));
        Iterator itM7807 = C0047.m7807(C0030.m5333(C0016.m3577(C0032.m5769(strM5188, C0038.m6454())), C0044.m7509(m772(), 44, 24, 878)));
        while (C0012.m2962(itM7807)) {
            m mVar = (m) C0048.m7949(itM7807);
            String strM2339 = C0010.m2339(mVar, C0032.m5708(m772(), 68, 5, 764));
            String strM23392 = C0010.m2339(mVar, C0035.m6131(m772(), 73, 4, 555));
            StringBuilder sb3 = new StringBuilder(strM8131);
            C0018.m3933(sb3, C0010.m2339(mVar, C0002.m1305(m772(), 77, 13, 585)));
            C0055.m8732(C0026.m4915(strM8131, strM23392), strM2339, C0047.m7763(sb3), C0064.m9669(C0036.m6243(mVar, C0012.m2973(m772(), 90, 24, 466))), arrayList);
        }
        return C0047.m7783(arrayList);
    }

    public String detailContent(List<String> list) {
        String strM9585;
        String strM5769 = C0032.m5769((String) C0048.m7915(list, 0), C0038.m6454());
        String strM8574 = C0054.m8574(m772(), 114, 13, 3024);
        String strM1840 = C0007.m1840();
        if (C0058.m9127(C0015.m3446(strM5769, strM8574, strM1840), C0047.m7833(m772(), 127, 2, 974))) {
            return null;
        }
        h hVarM3577 = C0016.m3577(strM5769);
        String strM4684 = C0024.m4684(C0030.m5333(hVarM3577, C0006.m1774(m772(), 129, 8, 1785)));
        String strM7509 = C0044.m7509(m772(), 137, 23, 2467);
        StringBuilder sb = new StringBuilder(strM7509);
        C0018.m3933(sb, C0049.m8058(C0030.m5333(hVarM3577, C0051.m8259(m772(), 160, 24, 2338)), C0058.m9106(m772(), 184, 13, 1230)));
        String strM7763 = C0047.m7763(sb);
        d dVarM5333 = C0030.m5333(hVarM3577, C0062.m9389(m772(), 197, 40, 1181));
        String strM8259 = C0051.m8259(m772(), 237, 1, 3067);
        d dVarM6459 = C0038.m6459(dVarM5333, strM8259);
        d dVarM53332 = C0030.m5333(hVarM3577, C0019.m4107(m772(), 238, 28, 497));
        StringBuilder sb2 = new StringBuilder();
        Iterator itM7807 = C0047.m7807(dVarM6459);
        while (true) {
            boolean zM2962 = C0012.m2962(itM7807);
            strM9585 = C0063.m9585(m772(), 266, 3, 3025);
            if (!zM2962) {
                break;
            }
            m mVar = (m) C0048.m7949(itM7807);
            C0018.m3933(sb2, C0016.m3579());
            C0018.m3933(sb2, C0010.m2339(mVar, C0039.m6551(m772(), 269, 3, 2460)));
            C0018.m3933(sb2, strM9585);
        }
        StringBuilder sb3 = new StringBuilder(strM1840);
        Iterator itM78072 = C0047.m7807(dVarM53332);
        while (C0012.m2962(itM78072)) {
            Iterator itM78073 = C0047.m7807(C0030.m5333((m) C0048.m7949(itM78072), strM8259));
            while (C0012.m2962(itM78073)) {
                m mVar2 = (m) C0048.m7949(itM78073);
                String strM9669 = C0064.m9669(mVar2);
                StringBuilder sb4 = new StringBuilder(strM7509);
                C0018.m3933(sb4, C0010.m2339(mVar2, C0050.m8131(m772(), 272, 4, 1452)));
                String strM77632 = C0047.m7763(sb4);
                C0018.m3933(sb3, strM9669);
                C0062.m9399(sb3, '$');
                C0018.m3933(sb3, strM77632);
                String strM1189 = C0001.m1189(m772(), 276, 1, 2448);
                C0018.m3933(sb3, strM1189);
                C0018.m3933(sb3, strM4684);
                C0018.m3933(sb3, strM1189);
                C0018.m3933(sb3, strM9669);
                C0062.m9399(sb3, '#');
            }
            C0018.m3933(sb3, strM9585);
        }
        String strM7657 = C0045.m7657(m772(), 277, 7, 1254);
        String strM96692 = C0064.m9669((m) C0028.m5161(C0030.m5333((m) C0028.m5161(C0030.m5333(hVarM3577, strM7657), 0), strM8259), 0));
        String strM96693 = C0064.m9669((m) C0028.m5161(C0030.m5333((m) C0028.m5161(C0030.m5333(hVarM3577, strM7657), 0), strM8259), 1));
        String strM96694 = C0064.m9669((m) C0028.m5161(C0030.m5333((m) C0028.m5161(C0030.m5333(hVarM3577, strM7657), 1), C0060.m9352(m772(), 284, 4, 386)), 1));
        String strM96695 = C0064.m9669((m) C0028.m5161(C0030.m5333(hVarM3577, C0035.m6131(m772(), 288, 17, 1033)), 0));
        com.github.catvod.spider.merge.E.m mVar3 = new com.github.catvod.spider.merge.E.m();
        C0017.m3671(mVar3, strM96693);
        C0022.m4432(mVar3, strM96692);
        StringBuilder sb5 = new StringBuilder();
        C0018.m3933(sb5, C0036.m6189());
        C0018.m3933(sb5, strM96694);
        C0019.m4073(mVar3, C0047.m7763(sb5));
        StringBuilder sb6 = new StringBuilder();
        C0018.m3933(sb6, C0055.m8703());
        C0018.m3933(sb6, strM96695);
        C0027.m5000(mVar3, C0047.m7763(sb6));
        C0011.m2828(mVar3, (String) C0048.m7915(list, 0));
        C0026.m4947(mVar3, strM7763);
        C0005.m1628(mVar3, strM4684);
        C0054.m8596(mVar3, C0000.m1096(sb2));
        C0044.m7449(mVar3, C0000.m1096(sb3));
        return C0053.m8428(mVar3);
    }

    public String homeContent(boolean z) {
        String strM8337;
        ArrayList arrayList = new ArrayList();
        HashMap mapM6454 = C0038.m6454();
        String strM6452 = C0038.m6452(m772(), 305, 23, 3055);
        h hVarM3577 = C0016.m3577(C0032.m5769(strM6452, mapM6454));
        Iterator itM7807 = C0047.m7807(C0038.m6459(C0030.m5333(hVarM3577, C0037.m6307(m772(), 328, 20, 805)), C0023.m4536(m772(), 348, 1, 1232)));
        while (true) {
            boolean zM2962 = C0012.m2962(itM7807);
            strM8337 = C0052.m8337(m772(), 349, 4, 2855);
            if (!zM2962) {
                break;
            }
            m mVar = (m) C0048.m7949(itM7807);
            String strM2339 = C0010.m2339(mVar, strM8337);
            if (C0058.m9127(strM2339, C0044.m7509(m772(), 353, 6, 2265)) && !C0058.m9127(C0064.m9669(mVar), C0046.m7718(m772(), 359, 2, 2367))) {
                C0004.m1532(arrayList, new b(strM2339, C0025.m4800(C0064.m9669(mVar), C0033.m5852(m772(), 361, 1, 2363), C0007.m1840()), null));
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator itM78072 = C0047.m7807(C0030.m5333(hVarM3577, C0039.m6551(m772(), 362, 24, 393)));
        while (C0012.m2962(itM78072)) {
            m mVar2 = (m) C0048.m7949(itM78072);
            String strM23392 = C0010.m2339(mVar2, C0037.m6307(m772(), 386, 5, 2309));
            String strM23393 = C0010.m2339(mVar2, strM8337);
            StringBuilder sb = new StringBuilder(strM6452);
            C0018.m3933(sb, C0010.m2339(mVar2, C0040.m6584(m772(), 391, 13, 1280)));
            C0055.m8732(C0026.m4915(strM6452, strM23393), strM23392, C0047.m7763(sb), C0064.m9669(C0036.m6243(mVar2, C0033.m5852(m772(), 404, 24, 476))), arrayList2);
        }
        return C0025.m4831(arrayList, arrayList2);
    }

    public void init(Context context) {
        C0051.m8194(C0035.m6110());
    }

    public void init(Context context, String str) {
        C0051.m8194(C0035.m6110());
    }

    public String playerContent(String str, String str2, List<String> list) {
        C0036.m6219();
        String[] strArrM4752 = C0024.m4752(str2, C0054.m8574(m772(), 428, 1, 1898));
        String str3 = null;
        String str4 = (strArrM4752.length <= 0 || C0057.m8953(strArrM4752[0])) ? null : strArrM4752[0];
        String str5 = (strArrM4752.length <= 1 || C0057.m8953(strArrM4752[1])) ? null : strArrM4752[1];
        if (strArrM4752.length > 2 && !C0057.m8953(strArrM4752[2])) {
            str3 = strArrM4752[2];
        }
        StringBuilder sb = new StringBuilder();
        C0018.m3933(sb, C0051.m8217());
        C0018.m3933(sb, C0022.m4403(m772(), 429, 17, 1656));
        C0018.m3933(sb, str5);
        C0018.m3933(sb, C0064.m9599(m772(), 446, 7, 2416));
        C0018.m3933(sb, str3);
        String strM7763 = C0047.m7763(sb);
        g gVarM9311 = C0060.m9311(1, str4);
        C0057.m9029(gVarM9311, C0038.m6454());
        C0002.m1282(gVarM9311, strM7763);
        return C0033.m5828(gVarM9311);
    }

    public String searchContent(String str, boolean z) {
        return C0024.m4673(this, str, true, C0020.m4199(m772(), 453, 1, 547));
    }

    public String searchContent(String str, boolean z, String str2) {
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder(C0018.m3917(m772(), 454, 52, 2675));
        C0018.m3933(sb, str);
        C0018.m3933(sb, C0012.m2973(m772(), 506, 8, 837));
        C0018.m3933(sb, str2);
        Iterator itM7807 = C0047.m7807(C0030.m5333(C0016.m3577(C0032.m5769(C0047.m7763(sb), C0038.m6454())), C0023.m4536(m772(), 514, 24, 2210)));
        while (C0012.m2962(itM7807)) {
            m mVar = (m) C0048.m7949(itM7807);
            String strM2339 = C0010.m2339(mVar, C0001.m1189(m772(), 538, 5, 3092));
            String strM23392 = C0010.m2339(mVar, C0001.m1189(m772(), 543, 4, 2736));
            String strM5565 = C0031.m5565(m772(), 547, 23, 1992);
            StringBuilder sb2 = new StringBuilder(strM5565);
            C0018.m3933(sb2, C0010.m2339(mVar, C0041.m6779(m772(), 570, 13, 2474)));
            C0055.m8732(C0026.m4915(strM5565, strM23392), strM2339, C0047.m7763(sb2), C0064.m9669(C0036.m6243(mVar, C0035.m6131(m772(), 583, 24, 2094))), arrayList);
        }
        return C0047.m7783(arrayList);
    }
}