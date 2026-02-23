package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.E.b;
import com.github.catvod.spider.merge.E.g;
import com.github.catvod.spider.merge.E.m;
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
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.merge.c1.C0046;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d0.C0048;
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
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.merge.z.C0065;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import com.github.catvod.spider.p000mergexbpq.r.C0014;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class HBdcApi extends Spider {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f38short = {2498, 2532, 2546, 2533, 2490, 2518, 2544, 2546, 2553, 2531, 599, 595, 592, 588, 588, 584, 533, 599, 595, 607, 599, 535, 594, 605, 601, 587, 599, 598, 596, 578, 577, 2793, 2805, 2805, 2801, 2802, 2747, 2734, 2734, 2789, 2735, 2789, 2786, 2796, 2798, 2807, 2792, 2788, 2735, 2805, 2798, 2801, 2734, 2734, 2784, 2801, 2792, 2735, 2801, 2793, 2801, 2734, 2807, 2798, 2789, 2734, 2797, 2792, 2802, 2805, 2750, 2802, 2805, 2784, 2805, 2788, 2748, 379, 318, 305, 316, 302, 302, 352, 29800, 24108, 379, 316, 303, 312, 316, 352, 20533, -28235, 379, 292, 312, 316, 303, 352, 20533, -28235, 379, 299, 312, 303, 302, 308, 306, 307, 352, 20533, -28235, 379, 301, 314, 352, 852, 849, 836, 849, 1872, 1877, 1871, 1864, 2410, 2419, 2424, 2371, 2421, 2424, 1537, 1560, 1555, 1576, 1561, 1558, 1562, 1554, 2271, 2246, 2253, 2294, 2265, 2240, 2250, 3115, 3122, 3129, 3074, 3119, 3128, 3120, 3132, 3119, 3126, 3118, 973, 977, 988, 964, 984, 975, 994, 980, 979, 987, 978, 2609, 2602, 2605, 2587, 2599, 2603, 2592, 2593, 3304, 3315, 3325, 3275, 3326, 3277, 3317, 3279, 3306, 3221, 3310, 3283, 3306, 3312, 3298, 3220, 3304, 3316, 3223, 3223, 3326, 3315, 3268, 3222, 3307, 3315, 3276, 3280, 3306, 3299, 3310, 3283, 3325, 3277, 3326, 3294, 3304, 3312, 3326, 3293, 3305, 3312, 3306, 3223, 3306, 3274, 3310, 3280, 266, 264, 2597, 2596, 2613, 2592, 2600, 2605, 1886, 1875, 1860, 2538, 2545, 2549, 2555, 2544, 2966, 2954, 2954, 2958, 2957, 3012, 3025, 3025, 2970, 3024, 2970, 2973, 2963, 2961, 2952, 2967, 2971, 3024, 2954, 2961, 2958, 3025, 3025, 2975, 2958, 2967, 3024, 2958, 2966, 2958, 3025, 2952, 2961, 2970, 3025, 2970, 2971, 2954, 2975, 2967, 2962, 3020, 2243, 2246, 2259, 2246, 1419, 1426, 1433, 1442, 1427, 1436, 1424, 1432, 1421, 1428, 1439, 1444, 1426, 1439, 2065, 2056, 2051, 2104, 2071, 2062, 2052, 744, 753, 762, 705, 767, 748, 763, 767, 2689, 2712, 2707, 2728, 2707, 2718, 2693, 2706, 2708, 2691, 2712, 2693, 2299, 2274, 2281, 2258, 2292, 2280, 2284, 2303, 1737, 1744, 1755, 1760, 1756, 1744, 1745, 1739, 1754, 1745, 1739, 2110, 2087, 2092, 2071, 2106, 2093, 2085, 2089, 2106, 2083, 2107, 603, 578, 585, 626, 605, 577, 588, 596, 626, 577, 580, 606, 601, 2849, 2864, 2851, 2850, 2868, 3078, 3101, 3076, 3076, 1871, 1883, 1862, 1860, 1515, 1515, 1515, 1690, 1693, 1667, 1692, 2533, 2538, 2534, 2542, 687, 1455, 1448, 1462, 941, 1579, 26349, -31211, 31837, 22041, 30299, -30040, 20745, 24093, 25502, 29307, -28931, 31294, 23489, 30419, 1562, 560, 555, 562, 562, 811, 885, 819, 894, 955, 934, 994, 1232, 1239, 1225, 3006, 2978, 2978, 2982, 2981, 3052, 3065, 3065, 2994, 3064, 2994, 2997, 3003, 3001, 2976, 3007, 2995, 3064, 2978, 3001, 2982, 3065, 2999, 2982, 3007, 3064, 2982, 3006, 2982, 3065, 2976, 3001, 2994, 3065, 3003, 2953, 3004, 3007, 2995, 2953, 2990, 3007, 1801, 540, 512, 512, 516, 519, 590, 603, 603, 528, 602, 528, 535, 537, 539, 514, 541, 529, 602, 512, 539, 516, 603, 603, 533, 516, 541, 602, 516, 540, 516, 603, 514, 539, 528, 603, 519, 529, 533, 518, 535, 540, 587, 543, 529, 525, 515, 539, 518, 528, 519, 585, 1845, 1891, 1908, 1838, 2302, 2220, 2209, 2216, 2237, 2277, 2281, 1058, 1063, 1085, 1082, 2281, 2288, 2299, 2240, 2294, 2299, 1077, 1068, 1063, 1052, 1069, 1058, 1070, 1062, 1634, 1659, 1648, 1611, 1636, 1661, 1655, 1210, 1187, 1192, 1171, 1214, 1193, 1185, 1197, 1214, 1191, 1215};
    public String a;

    public static HashMap a() {
        return C0020.m4251(C0024.m4740(m241(), 0, 10, 2455), C0044.m7509(m241(), 10, 21, 568));
    }

    /* renamed from: ۟۠۟ۦۧ, reason: not valid java name and contains not printable characters */
    public static short[] m241() {
        if (C0007.m1886() >= 0) {
            return f38short;
        }
        return null;
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder(C0042.m7151(m241(), 31, 46, 2689));
        C0018.m3933(sb, str);
        C0018.m3933(sb, C0024.m4740(m241(), 77, 40, 349));
        C0018.m3933(sb, str2);
        JSONArray jSONArrayM4333 = C0021.m4333(C0003.m1370(new JSONObject(C0032.m5769(C0047.m7763(sb), C0012.m3050())), C0005.m1645(m241(), 117, 4, 816)), C0030.m5362(m241(), 121, 4, 1852));
        for (int i = 0; i < C0053.m8396(jSONArrayM4333); i++) {
            JSONObject jSONObjectM3923 = C0018.m3923(jSONArrayM4333, i);
            C0004.m1532(arrayList, new m(C0001.m1212(jSONObjectM3923, C0050.m8131(m241(), 125, 6, 2332)), C0001.m1212(jSONObjectM3923, C0056.m8911(m241(), 131, 8, 1655)), C0001.m1212(jSONObjectM3923, C0050.m8131(m241(), 139, 7, 2217)), C0001.m1212(jSONObjectM3923, C0047.m7833(m241(), 146, 11, 3165))));
        }
        return C0020.m4216(C0011.m2808(C0038.m6456(str2)), C0047.m7818(1, str2), C0011.m2808(20), C0054.m8556(str2, 1, 20), arrayList);
    }

    public String detailContent(List<String> list) {
        String strM7902;
        String strM7290 = C0043.m7290(m241(), 157, 11, 957);
        int i = 0;
        String str = (String) C0048.m7915(list, 0);
        HashMap mapM4127 = C0019.m4127(C0050.m8131(m241(), 168, 8, 2628), C0026.m4951(m241(), 176, 48, 3239), C0033.m5852(m241(), 224, 2, 363), C0042.m7151(m241(), 226, 6, 2625));
        C0053.m8424(mapM4127, C0001.m1189(m241(), 232, 3, 1847), str);
        C0053.m8424(mapM4127, C0012.m2973(m241(), 235, 5, 2462), C0007.m1840());
        JSONObject jSONObjectM1370 = C0003.m1370(new JSONObject(C0003.m1444(C0053.m8477(m241(), 240, 42, 3070), mapM4127, C0012.m3050())), C0045.m7657(m241(), 282, 4, 2215));
        m mVar = new m();
        String strM1212 = C0001.m1212(jSONObjectM1370, C0039.m6551(m241(), 286, 8, 1533));
        C0011.m2828(mVar, C0001.m1212(jSONObjectM1370, C0004.m1549(m241(), 294, 6, 1531)));
        C0005.m1628(mVar, strM1212);
        C0026.m4947(mVar, C0001.m1212(jSONObjectM1370, C0047.m7833(m241(), 300, 7, 2151)));
        C0017.m3671(mVar, C0001.m1212(jSONObjectM1370, C0036.m6188(m241(), 307, 8, 670)));
        C0058.m9159(mVar, C0001.m1212(jSONObjectM1370, C0014.m3332(m241(), 315, 12, 2807)));
        C0022.m4432(mVar, C0001.m1212(jSONObjectM1370, C0065.m9775(m241(), 327, 8, 2189)));
        StringBuilder sb = new StringBuilder();
        C0018.m3933(sb, C0055.m8703());
        C0018.m3933(sb, C0001.m1212(jSONObjectM1370, C0030.m5362(m241(), 335, 11, 1727)));
        C0027.m5000(mVar, C0047.m7763(sb));
        StringBuilder sb2 = new StringBuilder();
        C0018.m3933(sb2, C0036.m6189());
        C0018.m3933(sb2, C0001.m1212(jSONObjectM1370, C0001.m1189(m241(), 346, 11, 2120)));
        C0019.m4073(mVar, C0047.m7763(sb2));
        JSONArray jSONArrayM4333 = C0021.m4333(jSONObjectM1370, C0026.m4951(m241(), 357, 13, 557));
        StringBuilder sb3 = new StringBuilder();
        StringBuilder sb4 = new StringBuilder();
        int i2 = 0;
        while (i2 < C0053.m8396(jSONArrayM4333)) {
            JSONObject jSONObjectM3923 = C0018.m3923(jSONArrayM4333, i2);
            try {
                strM7902 = C0025.m4770(C0021.m4333(C0003.m1370(jSONObjectM3923, strM7290), C0007.m1842(m241(), 370, 5, 2897)), i);
            } catch (Exception unused) {
                strM7902 = C0048.m7902(m241(), 375, 4, 3176);
            }
            JSONObject jSONObjectM13702 = C0003.m1370(jSONObjectM3923, strM7290);
            String strM8259 = C0051.m8259(m241(), 379, 4, 1833);
            String strM12122 = C0001.m1212(jSONObjectM13702, strM8259);
            StringBuilder sb5 = new StringBuilder();
            C0018.m3933(sb5, C0016.m3579());
            C0018.m3933(sb5, strM12122);
            C0018.m3933(sb4, C0047.m7763(sb5));
            String strM9352 = C0060.m9352(m241(), 383, 3, 1487);
            C0018.m3933(sb4, strM9352);
            JSONArray jSONArrayM43332 = C0021.m4333(jSONObjectM3923, C0003.m1398(m241(), 386, 4, 1775));
            for (int i3 = 0; i3 < C0053.m8396(jSONArrayM43332); i3++) {
                JSONObject jSONObjectM39232 = C0018.m3923(jSONArrayM43332, i3);
                String strM6307 = C0037.m6307(m241(), 390, 4, 2443);
                C0018.m3933(sb3, C0001.m1212(jSONObjectM39232, strM6307));
                C0018.m3933(sb3, C0063.m9585(m241(), 394, 1, 651));
                C0018.m3933(sb3, C0001.m1212(jSONObjectM39232, C0032.m5708(m241(), 395, 3, 1498)));
                String strM5852 = C0033.m5852(m241(), 398, 1, 979);
                C0018.m3933(sb3, strM5852);
                C0018.m3933(sb3, strM7902);
                C0018.m3933(sb3, strM5852);
                C0018.m3933(sb3, C0001.m1212(jSONObjectM39232, strM8259));
                C0018.m3933(sb3, strM5852);
                C0018.m3933(sb3, strM1212);
                C0018.m3933(sb3, strM5852);
                C0018.m3933(sb3, C0001.m1212(jSONObjectM39232, strM6307));
                C0018.m3933(sb3, C0014.m3332(m241(), 399, 1, 1544));
            }
            C0018.m3933(sb3, strM9352);
            i2++;
            i = 0;
        }
        C0044.m7449(mVar, C0047.m7763(sb3));
        C0054.m8596(mVar, C0047.m7763(sb4));
        return C0053.m8428(mVar);
    }

    public String homeContent(boolean z) {
        ArrayList arrayList = new ArrayList();
        String strM7718 = C0046.m7718(m241(), 400, 2, 1349);
        String strM9361 = C0061.m9361(m241(), 402, 2, 2408);
        String strM77182 = C0046.m7718(m241(), 404, 3, 878);
        String strM7290 = C0043.m7290(m241(), 407, 2, 3253);
        String strM3106 = C0013.m3106(m241(), 409, 2, 3207);
        String strM7509 = C0044.m7509(m241(), 411, 3, 1172);
        List listM1203 = C0001.m1203(new String[]{strM7718, strM9361, strM77182, strM7290, strM3106, strM7509});
        List listM12032 = C0001.m1203(new String[]{strM7718, strM9361, strM77182, strM7290, strM3106, strM7509});
        for (int i = 0; i < C0064.m9636(listM1203); i++) {
            C0004.m1532(arrayList, new b((String) C0048.m7915(listM1203, i), (String) C0048.m7915(listM12032, i), null));
        }
        return C0003.m1448(C0016.m3574(this), null, arrayList);
    }

    public void init(Context context, String str) {
        C0051.m8194(C0035.m6110());
        if (str != null) {
            this.a = str;
        }
    }

    public String playerContent(String str, String str2, List<String> list) {
        C0036.m6219();
        String[] strArrM4752 = C0024.m4752(str2, C0003.m1398(m241(), 414, 1, 1636));
        String str3 = null;
        String str4 = (strArrM4752.length <= 0 || C0057.m8953(strArrM4752[0])) ? null : strArrM4752[0];
        String str5 = (strArrM4752.length <= 1 || C0057.m8953(strArrM4752[1])) ? null : strArrM4752[1];
        if (strArrM4752.length > 2 && !C0057.m8953(strArrM4752[2])) {
            String str6 = strArrM4752[2];
        }
        String str7 = (strArrM4752.length <= 3 || C0057.m8953(strArrM4752[3])) ? null : strArrM4752[3];
        if (strArrM4752.length > 4 && !C0057.m8953(strArrM4752[4])) {
            str3 = strArrM4752[4];
        }
        String strM2827 = C0011.m2827(str4, str7, str3);
        if (C0058.m9127(str5, C0024.m4740(m241(), 415, 4, 606))) {
            if (C0058.m9127(str4, C0013.m3106(m241(), 419, 4, 838)) || C0058.m9127(str4, C0007.m1842(m241(), 423, 3, 982))) {
                g gVar = new g();
                C0017.m3667(gVar, str4);
                C0002.m1282(gVar, strM2827);
                C0057.m9029(gVar, C0038.m6454());
                return C0033.m5828(gVar);
            }
            g gVar2 = new g();
            C0017.m3667(gVar2, str4);
            C0064.m9646(gVar2);
            C0002.m1282(gVar2, strM2827);
            C0057.m9029(gVar2, C0038.m6454());
            return C0033.m5828(gVar2);
        }
        HashMap map = new HashMap();
        StringBuilder sb = new StringBuilder();
        C0018.m3933(sb, str5);
        C0018.m3933(sb, str4);
        String strM7763 = C0047.m7763(sb);
        String strM8911 = C0056.m8911(m241(), 426, 3, 1189);
        C0053.m8424(map, strM8911, strM7763);
        JSONObject jSONObject = new JSONObject(C0008.m2029(C0003.m1396(C0033.m5852(m241(), 429, 42, 3030), map, C0012.m3050())));
        try {
            g gVar3 = new g();
            C0017.m3667(gVar3, C0001.m1212(jSONObject, strM8911));
            C0057.m9029(gVar3, C0012.m3050());
            C0002.m1282(gVar3, strM2827);
            C0057.m9029(gVar3, C0038.m6454());
            return C0033.m5828(gVar3);
        } catch (Exception unused) {
            g gVar4 = new g();
            C0017.m3667(gVar4, str4);
            C0002.m1282(gVar4, strM2827);
            C0057.m9029(gVar4, C0038.m6454());
            return C0033.m5828(gVar4);
        }
    }

    public String searchContent(String str, boolean z) {
        return C0018.m3966(this, C0056.m8909(str), true, C0045.m7657(m241(), 471, 1, 1848));
    }

    public String searchContent(String str, boolean z, String str2) {
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArrayM4333 = C0021.m4333(new JSONObject(C0032.m5769(C0058.m9145(C0007.m1842(m241(), 472, 51, 628), str, C0028.m5109(m241(), 523, 4, 1811), str2, C0011.m2805(m241(), 527, 7, 2264)), C0012.m3050())), C0017.m3646(m241(), 534, 4, 1102));
        for (int i = 0; i < C0053.m8396(jSONArrayM4333); i++) {
            JSONObject jSONObjectM3923 = C0018.m3923(jSONArrayM4333, i);
            C0004.m1532(arrayList, new m(C0001.m1212(jSONObjectM3923, C0056.m8911(m241(), 538, 6, 2207)), C0001.m1212(jSONObjectM3923, C0023.m4536(m241(), 544, 8, 1091)), C0001.m1212(jSONObjectM3923, C0008.m1970(m241(), 552, 7, 1556)), C0001.m1212(jSONObjectM3923, C0034.m6001(m241(), 559, 11, 1228))));
        }
        return C0020.m4216(C0011.m2808(C0038.m6456(str2)), C0047.m7818(1, str2), C0011.m2808(20), C0054.m8556(str2, 1, 20), arrayList);
    }
}