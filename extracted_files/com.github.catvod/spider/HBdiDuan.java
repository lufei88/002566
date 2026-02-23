package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.crawler.Spider;
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
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.V0.d;
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
import com.github.catvod.spider.merge.t.C0061;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.merge.z.C0065;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class HBdiDuan extends Spider {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f39short = {1178, 1219, 1220, 1177, 1220, 1240, 1237, 1229, 1240, 1245, 1223, 1216, 1177, 1223, 1239, 1222, 1245, 1220, 1216, 1634, 1636, 1655, 1653, 1661, 1637, 2479, 2478, 2495, 2540, 1320, 1322, 1339, 1343, 1314, 1316, 1317, 1009, 3301, 3198, 3075, 3075, 3075, 563, 621, 626, 622, 617, 560, 639, 626, 613, 560, 617, 628, 617, 625, 632, 573, 547, 573, 636, 2031, 1968, 1953, 1959, 1957, 2031, 411, 412, 403, 410, 394, 408, 403, 470, 470, 470, 961, 972, 979, 907, 981, 970, 982, 977, 904, 967, 970, 989, 904, 966, 970, 971, 977, 964, 972, 971, 960, 983, 563, 540, 616, 1992, 1510, 1532, 1515, 1512, 2827, 2822, 2841, 2881, 2847, 2816, 2844, 2843, 2882, 2829, 2816, 2839, 2882, 2822, 2818, 2830, 2824, 2826, 2624, 2631, 2634, 2655, 2646, 1400, 1403, 1401, 1393, 1405, 1384, 1397, 1391, 1396, 1406, 1335, 1395, 1399, 1403, 1405, 1407, 1312, 1338, 1391, 1384, 1398, 1330, 2026, 2040, 2128, 2141, 2114, 2074, 2112, 2141, 2112, 2136, 2129, 2068, 2058, 2068, 2133, 556, 628, 559, 621, 628, 615, 624, 612, 622, 621, 629, 586, 619, 614, 614, 615, 620, 556, 614, 621, 631, 622, 619, 625, 630, 559, 625, 631, 608, 616, 615, 609, 630, 1680, 1684, 1694, 2891, 2890, 2907, 560, 573, 546, 634, 565, 566, 551, 544, 550, 565, 567, 544, 3142, 3147, 3156, 3084, 3154, 3139, 3141, 3143, 3087, 3150, 3147, 3148, 3145, 3153, -25531, -30407, 697, 697, 697, 22230, 26547, 3243, 2730, 2736, 2727, 2724, 31777, 21112, 2367, 2367, 2367, 1907, 1837, 1899, 1830, 2214, 2234, 2234, 2238, 2237, 1483, 1495, 1495, 1491, 1488, 1433, 1420, 1420, 1493, 1421, 1479, 1479, 1498, 1488, 1421, 1491, 1489, 1484, 1697, 1725, 1725, 1721, 1722, 1779, 1766, 1766, 1709, 1709, 1712, 1722, 1767, 1721, 1723, 1702, 1766, 1197, 1204, 1270, 1206, 1209, 1198, 2984, 2560, 2586, 2573, 2574, 2515, 2463, 2461, 2440, 2457, 2459, 2451, 2446, 2437, 2515, 1864, 1861, 1882, 1794, 1884, 1859, 1887, 1880, 1793, 1870, 1859, 1876, 1793, 1871, 1859, 1858, 1880, 1869, 1861, 1858, 1865, 1886, 1325, 1395, 1388, 1392, 1399, 1326, 1377, 1388, 1403, 1326, 1399, 1386, 1399, 1391, 1382, 1315, 1341, 1315, 1378, 2656, 2669, 2674, 2602, 2676, 2667, 2679, 2672, 2601, 2662, 2667, 2684, 2601, 2669, 2665, 2661, 2659, 2657, 2406, 2401, 2412, 2425, 2416, 2248, 2251, 2249, 2241, 2253, 2264, 2245, 2271, 2244, 2254, 2183, 2243, 2247, 2251, 2253, 2255, 2192, 2186, 2271, 2264, 2246, 2178, 2045, 2031, 1694, 2584, 2627, 2632, 2586, 2627, 2630, 2633, 2634, 2642, 2561, 2637, 2642, 2634, 2638, 2633, 2624, 2586, 710, 650, 649, 659, 648, 661, 733, 497, 492, 503, 505, 503, 496, 3326, 3298, 3298, 3302, 3301, 3244, 3257, 3257, 3314, 3314, 3311, 3301, 3256, 3302, 3300, 3321, 1337, 1326, 1325, 1326, 1337, 1326, 1337, 2540, 3270, 3290, 3290, 3294, 3293, 3220, 3201, 3201, 3274, 3274, 3287, 3293, 3200, 3294, 3292, 3265, 3201, 3217, 3293, 3219, 414, 456, 471, 459, 460, 487, 460, 449, 456, 477, 389, 456, 471, 459, 460, 971, 913, 909, 979, 972, 976, 983, 910, 983, 970, 983, 975, 966, 899, 925, 899, 962, 636, 614, 625, 626, 800, 777, 787, 881, 802, 777, 780, 887, 781, 824, 888, 817, 803, 790, 802, 820, 802, 777, 791, 808, 781, 882, 768, 823, 795, 774, 792, 883, 792, 827, 772, 882, 792, 790, 792, 881, 795, 789, 791, 810, 783, 811, 810, 882, 795, 773, 776, 824, 782, 774, 784, 820, 800, 815, 771, 815};

    /* renamed from: ۣۣۤۨ, reason: not valid java name and contains not printable characters */
    public static short[] m242() {
        if (C0010.m2320() <= 0) {
            return f39short;
        }
        return null;
    }

    public final String a(h hVar, String str) {
        d dVarM5333 = C0030.m5333(hVar, C0018.m3917(m242(), 0, 19, 1204));
        StringBuilder sb = new StringBuilder();
        Iterator itM7807 = C0047.m7807(dVarM5333);
        while (C0012.m2962(itM7807)) {
            String strM9640 = C0064.m9640(C0000.m1081((m) C0048.m7949(itM7807)));
            JSONArray jSONArrayM4333 = C0021.m4333(new JSONObject(C0054.m8636(strM9640, C0048.m7935(strM9640, 123), C0030.m5416(strM9640, 125) + 1)), C0039.m6551(m242(), 19, 6, 1558));
            new ArrayList();
            for (int i = 0; i < C0053.m8396(jSONArrayM4333); i++) {
                JSONObject jSONObjectM3923 = C0018.m3923(jSONArrayM4333, i);
                String strM1212 = C0001.m1212(jSONObjectM3923, C0006.m1774(m242(), 25, 4, 2524));
                String strM12122 = C0001.m1212(jSONObjectM3923, C0028.m5109(m242(), 29, 7, 1355));
                String strM5843 = C0033.m5843(this, strM1212);
                C0018.m3933(sb, strM12122);
                C0018.m3933(sb, C0051.m8259(m242(), 36, 1, 981));
                C0018.m3933(sb, strM5843);
                String strM4740 = C0024.m4740(m242(), 37, 1, 3227);
                C0011.m2747(sb, strM4740, str, strM4740, strM12122);
                C0018.m3933(sb, C0010.m2300(m242(), 38, 1, 3165));
            }
        }
        C0018.m3933(sb, C0024.m4740(m242(), 39, 3, 3111));
        return C0000.m1096(sb);
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        String strM3446;
        String str3;
        String strM4199 = C0020.m4199(m242(), 42, 19, 541);
        ArrayList arrayList = new ArrayList();
        String strM5172 = C0028.m5172(str, C0027.m5062(m242(), 61, 6, 1984), str2);
        PrintStream printStreamM6087 = C0035.m6087();
        StringBuilder sb = new StringBuilder(C0021.m4340(m242(), 67, 10, 509));
        C0018.m3933(sb, strM5172);
        C0012.m2969(printStreamM6087, C0047.m7763(sb));
        Iterator itM7807 = C0047.m7807(C0030.m5333(C0016.m3577(C0032.m5769(strM5172, C0038.m6454())), C0063.m9585(m242(), 77, 22, 933)));
        while (C0012.m2962(itM7807)) {
            m mVar = (m) C0048.m7949(itM7807);
            try {
                String strM9669 = C0064.m9669(C0036.m6243(mVar, strM4199));
                boolean zM9127 = C0058.m9127(strM9669, C0019.m4107(m242(), 99, 1, 539));
                String strM1840 = C0007.m1840();
                if (zM9127) {
                    String[] strArrM4752 = C0024.m4752(strM9669, C0047.m7833(m242(), 100, 2, 576));
                    String str4 = null;
                    str3 = (strArrM4752.length <= 0 || C0057.m8953(strArrM4752[0])) ? null : strArrM4752[0];
                    if (strArrM4752.length > 1 && !C0057.m8953(strArrM4752[1])) {
                        str4 = strArrM4752[1];
                    }
                    strM3446 = C0015.m3446(str4, C0063.m9585(m242(), 102, 1, 2017), strM1840);
                } else {
                    strM3446 = strM1840;
                    str3 = strM3446;
                }
                C0004.m1532(arrayList, new com.github.catvod.spider.merge.E.m(C0010.m2339(C0036.m6243(mVar, strM4199), C0057.m8978(m242(), 103, 4, 1422)), str3, C0015.m3446(C0015.m3446(C0010.m2339(C0036.m6243(mVar, C0002.m1305(m242(), 107, 18, 2927)), C0045.m7657(m242(), 125, 5, 2611)), C0041.m6779(m242(), 130, 22, 1306), strM1840), C0056.m8911(m242(), 152, 2, 1987), strM1840), strM3446));
            } catch (Exception unused) {
            }
        }
        return C0020.m4216(C0011.m2808(C0038.m6456(str2)), C0047.m7818(1, str2), C0011.m2808(20), C0054.m8556(str2, 1, 20), arrayList);
    }

    public String detailContent(List<String> list) {
        h hVarM3577 = C0016.m3577(C0032.m5769((String) C0048.m7915(list, 0), C0038.m6454()));
        String strM3332 = C0014.m3332(m242(), 154, 13, 2100);
        String strM4684 = C0024.m4684(C0030.m5333(hVarM3577, strM3332));
        String strM8058 = C0049.m8058(C0038.m6459(C0030.m5333(hVarM3577, C0009.m2037(m242(), 167, 33, 514)), C0016.m3525(m242(), 200, 3, 1785)), C0050.m8131(m242(), 203, 3, 2872));
        String strM9669 = C0064.m9669((m) C0028.m5161(C0030.m5333(hVarM3577, C0044.m7509(m242(), 206, 12, 596)), 0));
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        String strM1305 = C0002.m1305(m242(), 218, 14, 3106);
        d dVarM5333 = C0030.m5333(hVarM3577, strM1305);
        StringBuilder sb3 = new StringBuilder();
        C0018.m3933(sb3, C0016.m3579());
        C0018.m3933(sb3, C0010.m2300(m242(), 232, 5, 669));
        C0018.m3933(sb, C0047.m7763(sb3));
        C0018.m3933(sb2, C0049.m8020(this, hVarM3577, strM4684));
        if (C0058.m9127(C0024.m4684(C0038.m6459(dVarM5333, strM1305)), C0022.m4403(m242(), 237, 2, 1233))) {
            Iterator itM7807 = C0047.m7807(C0038.m6459(dVarM5333, C0028.m5109(m242(), 239, 1, 3274)));
            while (C0012.m2962(itM7807)) {
                m mVar = (m) C0048.m7949(itM7807);
                h hVarM35772 = C0016.m3577(C0032.m5769(C0010.m2339(mVar, C0024.m4740(m242(), 240, 4, 2754)), C0038.m6454()));
                String strM46842 = C0024.m4684(C0030.m5333(hVarM3577, strM3332));
                StringBuilder sb4 = new StringBuilder();
                C0018.m3933(sb4, C0016.m3579());
                C0018.m3933(sb4, C0009.m2037(m242(), 244, 1, 1805));
                C0018.m3933(sb4, C0064.m9669(mVar));
                C0018.m3933(sb4, C0020.m4199(m242(), 245, 4, 2331));
                C0018.m3933(sb, C0047.m7763(sb4));
                C0018.m3933(sb2, C0049.m8020(this, hVarM35772, strM46842));
            }
        }
        com.github.catvod.spider.merge.E.m mVar2 = new com.github.catvod.spider.merge.E.m();
        StringBuilder sb5 = new StringBuilder();
        C0018.m3933(sb5, C0055.m8703());
        C0018.m3933(sb5, strM9669);
        C0027.m5000(mVar2, C0047.m7763(sb5));
        C0019.m4073(mVar2, C0036.m6189());
        C0011.m2828(mVar2, (String) C0048.m7915(list, 0));
        C0026.m4947(mVar2, strM8058);
        C0005.m1628(mVar2, strM4684);
        C0054.m8596(mVar2, C0000.m1096(sb));
        C0044.m7449(mVar2, C0000.m1096(sb2));
        return C0053.m8428(mVar2);
    }

    public String getPlayUrl(String str) {
        return (C0060.m9349(str, C0040.m6584(m242(), 249, 4, 1822)) || C0043.m7277(str, C0052.m8337(m242(), 253, 5, 2254))) ? str : C0050.m8125(C0020.m4199(m242(), 258, 18, 1443), str);
    }

    public String homeContent(boolean z) {
        String strM5256;
        ArrayList arrayList = new ArrayList();
        h hVarM3577 = C0016.m3577(C0032.m5769(C0061.m9361(m242(), 276, 17, 1737), C0038.m6454()));
        Iterator itM7807 = C0047.m7807(C0038.m6459(C0030.m5333(hVarM3577, C0049.m8007(m242(), 293, 6, 1240)), C0048.m7902(m242(), 299, 1, 3017)));
        while (true) {
            boolean zM2962 = C0012.m2962(itM7807);
            strM5256 = C0029.m5256(m242(), 300, 4, 2664);
            if (!zM2962) {
                break;
            }
            m mVar = (m) C0048.m7949(itM7807);
            String strM2339 = C0010.m2339(mVar, strM5256);
            if (C0058.m9127(strM2339, C0013.m3106(m242(), 304, 10, 2556))) {
                C0004.m1532(arrayList, new b(strM2339, C0064.m9640(C0064.m9669(mVar)), null));
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator itM78072 = C0047.m7807(C0030.m5333(hVarM3577, C0018.m3917(m242(), 314, 22, 1836)));
        while (C0012.m2962(itM78072)) {
            m mVar2 = (m) C0048.m7949(itM78072);
            String strM6551 = C0039.m6551(m242(), 336, 19, 1283);
            String strM9669 = C0064.m9669(C0036.m6243(mVar2, strM6551));
            String strM23392 = C0010.m2339(C0036.m6243(mVar2, strM6551), strM5256);
            String strM23393 = C0010.m2339(C0036.m6243(mVar2, C0026.m4951(m242(), 355, 18, 2564)), C0021.m4340(m242(), 373, 5, 2325));
            String strM5062 = C0027.m5062(m242(), 378, 22, 2218);
            String strM1840 = C0007.m1840();
            C0032.m5685(strM23392, strM9669, C0015.m3446(C0015.m3446(strM23393, strM5062, strM1840), C0053.m8477(m242(), 400, 2, 2004), strM1840), arrayList2);
        }
        return C0025.m4831(arrayList, arrayList2);
    }

    public void init(Context context) {
        C0051.m8194(C0035.m6110());
    }

    public String playerContent(String str, String str2, List<String> list) {
        C0036.m6219();
        String[] strArrM4752 = C0024.m4752(str2, C0006.m1774(m242(), 402, 1, 1760));
        String str3 = null;
        String str4 = (strArrM4752.length <= 0 || C0057.m8953(strArrM4752[0])) ? null : strArrM4752[0];
        String str5 = (strArrM4752.length <= 1 || C0057.m8953(strArrM4752[1])) ? null : strArrM4752[1];
        if (strArrM4752.length > 2 && !C0057.m8953(strArrM4752[2])) {
            str3 = strArrM4752[2];
        }
        StringBuilder sb = new StringBuilder();
        C0018.m3933(sb, C0051.m8217());
        C0018.m3933(sb, C0028.m5109(m242(), 403, 17, 2599));
        C0018.m3933(sb, str5);
        C0018.m3933(sb, C0033.m5852(m242(), 420, 7, 736));
        C0018.m3933(sb, str3);
        String strM7763 = C0047.m7763(sb);
        g gVarM9311 = C0060.m9311(0, str4);
        HashMap mapM6454 = C0038.m6454();
        String strM7290 = C0043.m7290(m242(), 427, 6, 414);
        String strM8131 = C0050.m8131(m242(), 433, 16, 3222);
        C0053.m8424(mapM6454, strM7290, strM8131);
        C0053.m8424(mapM6454, C0042.m7151(m242(), 449, 7, 1355), strM8131);
        C0057.m9029(gVarM9311, mapM6454);
        C0002.m1282(gVarM9311, strM7763);
        return C0033.m5828(gVarM9311);
    }

    public String searchContent(String str, boolean z) {
        return C0045.m7560(this, C0056.m8909(str), true, C0065.m9775(m242(), 456, 1, 2525));
    }

    public String searchContent(String str, boolean z, String str2) {
        h hVarM3577 = C0016.m3577(C0032.m5769(C0000.m1130(C0013.m3106(m242(), 457, 20, 3246), str, C0045.m7657(m242(), 477, 15, 440)), C0038.m6454()));
        ArrayList arrayList = new ArrayList();
        d dVarM5333 = C0030.m5333(hVarM3577, C0040.m6584(m242(), 492, 17, 931));
        for (int i = 0; i < C0009.m2095(dVarM5333); i++) {
            C0004.m1532(arrayList, new com.github.catvod.spider.merge.E.m(C0010.m2339((m) C0028.m5161(dVarM5333, i), C0054.m8574(m242(), 509, 4, 532)), C0064.m9669((m) C0028.m5161(dVarM5333, i)), new String(C0007.m1882(C0020.m4199(m242(), 513, 56, 833)))));
        }
        return C0047.m7783(arrayList);
    }
}