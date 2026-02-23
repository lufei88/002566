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
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.Z.C0040;
import com.github.catvod.spider.merge.Z0.C0041;
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
import com.github.catvod.spider.merge.r0.C0059;
import com.github.catvod.spider.merge.r0.C0060;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.merge.y0.C0064;
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
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import com.github.catvod.spider.p000mergexbpq.x.C0015;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class HBcms10 extends Spider {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f35short = {2577, 2573, 2573, 2569, 2570, 2627, 2646, 2646, 2563, 2560, 2647, 2561, 2580, 2580, 2647, 2577, 2578, 2646, 2584, 2569, 2576, 2647, 2569, 2577, 2569, 2646, 2569, 2571, 2582, 2575, 2576, 2589, 2588, 2646, 2575, 2582, 2589, 2646, 1901, 1867, 1885, 1866, 1813, 1913, 1887, 1885, 1878, 1868, 906, 936, 957, 942, 939, 939, 934, 1000, 1010, 1001, 1015, 999, 1007, 912, 942, 937, 931, 936, 944, 948, 999, 905, 915, 999, 1014, 1015, 1001, 1015, 1020, 999, 912, 904, 912, 1009, 1011, 1006, 999, 902, 951, 951, 939, 930, 912, 930, 933, 908, 942, 947, 1000, 1010, 1012, 1008, 1001, 1012, 1009, 999, 1007, 908, 911, 915, 906, 907, 1003, 999, 939, 942, 940, 930, 999, 896, 930, 932, 940, 936, 1006, 999, 900, 943, 949, 936, 938, 930, 1000, 1014, 1015, 1022, 1001, 1015, 1001, 1015, 1001, 1015, 999, 916, 934, 929, 934, 949, 942, 1000, 1010, 1012, 1008, 1001, 1012, 1009, 1337, 617, 575, 552, 626, 3107, 3197, 3199, 3105, 3192, 3193, 3176, 3197, 3189, 3184, 3130, 3176, 3105, 2941, 2874, 2872, 2918, 2879, 2878, 2863, 2874, 2866, 2871, 2941, 2863, 2918, 2233, 2236, 2214, 2209, 1933, 1940, 1951, 1956, 1938, 1951, 2176, 2201, 2194, 2217, 2200, 2199, 2203, 2195, 2318, 2327, 2332, 2343, 2312, 2321, 2331, 430, 439, 444, 391, 426, 445, 437, 441, 426, 435, 427, 1740, 1734, 1735, 1737, 1751, 1685, 1684, 745, 867, 804, 806, 888, 801, 800, 817, 804, 812, 809, 867, 812, 801, 822, 888, 3031, 2953, 2955, 3029, 2956, 2957, 2972, 2953, 2945, 2948, 3022, 2945, 2956, 2971, 3029, 3038, 3035, 3009, 3014, 469, 460, 455, 508, 467, 463, 450, 474, 508, 453, 465, 460, 462, 2424, 2304, 2424, 2304, 2424, 2304, 2025, 2032, 2043, 1984, 2031, 2035, 2046, 2022, 1984, 2026, 2029, 2035, 653, 653, 653, 1824, 1849, 1842, 1801, 1848, 1847, 1851, 1843, 2797, 2504, 2480, 1481, 2625, 2275, 2298, 2289, 2250, 2279, 2288, 2296, 2292, 2279, 2302, 2278, 3182, 3191, 3196, 3143, 3195, 3191, 3190, 3180, 3197, 3190, 3180, 1388, 1397, 1406, 1349, 1379, 1407, 1403, 1384, 2540, 2549, 2558, 2501, 2558, 2547, 2536, 2559, 2553, 2542, 2549, 2536, 3086, 3095, 3100, 3111, 3097, 3099, 3084, 3095, 3082, 2282, 2291, 2296, 2243, 2284, 2293, 2303, 2413, 2420, 2431, 2372, 2426, 2409, 2430, 2426, 791, 792, 789, 775, 775, 812, 801, 808, 829, 775, 822, 825, 821, 829, 19918, 29298, 28816, 1053, 1040, 1049, 1036, 1078, 1024, 1037, 2575, 2563, 2575, 2668, 2672, 2672, 2676, 1869, 1869, 1869, 2844, 2867, 2863, 2863, 2859, 940, 1615, 3078, 3152, 3143, 3101, 735, 664, 666, 708, 669, 668, 653, 664, 656, 661, 735, 654, 669, 708, 1379, 1341, 1343, 1377, 1336, 1337, 1320, 1341, 1333, 1328, 1402, 1323, 1336, 1377, 2565, 2560, 2586, 2589, 2184, 2181, 2188, 2201, 2211, 2194, 2205, 2193, 2201, 19365, 31305, 32538, 625, 635, 634, 628, 618, 552, 553, 2911, 2886, 2893, 2934, 2880, 2893, 601, 576, 587, 624, 577, 590, 578, 586, 1327, 1334, 1341, 1286, 1321, 1328, 1338, 1255, 1278, 1269, 1230, 1251, 1268, 1276, 1264, 1251, 1274, 1250, -27767, -27512, 30871};
    public String a = C0025.m4795(m228(), 0, 38, 2681);
    public final String b = C0007.m1840();
    public String[] c = null;

    public static HashMap a() {
        return C0020.m4251(C0032.m5708(m228(), 38, 10, 1848), C0017.m3646(m228(), 48, 106, 967));
    }

    /* renamed from: ۡۧۡۢ, reason: not valid java name and contains not printable characters */
    public static short[] m228() {
        if (C0016.m3596() < 0) {
            return f35short;
        }
        return null;
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        StringBuilder sb;
        String strM6450;
        String strM9599;
        ArrayList arrayList = new ArrayList();
        boolean zM9127 = C0058.m9127(C0038.m6450(this), C0000.m1077(m228(), 154, 1, 1286));
        String strM1305 = C0002.m1305(m228(), 155, 4, 591);
        if (zM9127) {
            sb = new StringBuilder();
            strM6450 = C0038.m6450(this);
            strM9599 = C0064.m9599(m228(), 172, 13, 2907);
        } else {
            sb = new StringBuilder();
            strM6450 = C0038.m6450(this);
            strM9599 = C0054.m8574(m228(), 159, 13, 3100);
        }
        C0011.m2747(sb, strM6450, strM9599, str, strM1305);
        C0018.m3933(sb, str2);
        JSONArray jSONArrayM4333 = C0021.m4333(new JSONObject(C0032.m5769(C0047.m7763(sb), C0060.m9317())), C0010.m2300(m228(), 185, 4, 2261));
        for (int i = 0; i < C0053.m8396(jSONArrayM4333); i++) {
            JSONObject jSONObjectM3923 = C0018.m3923(jSONArrayM4333, i);
            C0004.m1532(arrayList, new m(C0001.m1212(jSONObjectM3923, C0034.m6001(m228(), 189, 6, 2043)), C0001.m1212(jSONObjectM3923, C0033.m5852(m228(), 195, 8, 2294)), C0001.m1212(jSONObjectM3923, C0041.m6779(m228(), 203, 7, 2424)), C0001.m1212(jSONObjectM3923, C0025.m4795(m228(), 210, 11, 472))));
        }
        return C0047.m7783(arrayList);
    }

    public String detailContent(List<String> list) {
        StringBuilder sb;
        String strM6450;
        String strM2037;
        String strM7718;
        m mVar = new m();
        char c = 0;
        String strM3446 = C0015.m3446((String) C0048.m7915(list, 0), C0001.m1189(m228(), 221, 7, 1700), C0007.m1840());
        if (C0058.m9127(C0038.m6450(this), C0054.m8574(m228(), 228, 1, 726))) {
            sb = new StringBuilder();
            strM6450 = C0038.m6450(this);
            strM2037 = C0047.m7833(m228(), 229, 15, 837);
        } else {
            sb = new StringBuilder();
            strM6450 = C0038.m6450(this);
            strM2037 = C0009.m2037(m228(), 244, 15, 3048);
        }
        JSONObject jSONObjectM3923 = C0018.m3923(C0021.m4333(new JSONObject(C0032.m5769(C0038.m6434(sb, strM6450, strM2037, strM3446), C0060.m9317())), C0009.m2037(m228(), 259, 4, 2994)), 0);
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        String strM1212 = C0001.m1212(jSONObjectM3923, C0011.m2805(m228(), 263, 13, 419));
        String strM8259 = C0051.m8259(m228(), 276, 6, 2340);
        String[] strArrM4752 = C0024.m4752(strM1212, strM8259);
        String[] strArrM47522 = C0024.m4752(C0001.m1212(jSONObjectM3923, C0024.m4740(m228(), 282, 12, 1951)), strM8259);
        int i = 0;
        while (true) {
            int length = strArrM4752.length;
            strM7718 = C0046.m7718(m228(), 294, 3, 681);
            if (i >= length) {
                break;
            }
            String str = strArrM4752[i];
            C0018.m3933(sb2, C0016.m3579());
            C0018.m3933(sb2, str);
            C0018.m3933(sb2, strM7718);
            i++;
        }
        int i2 = 0;
        while (true) {
            int length2 = strArrM47522.length;
            String strM82592 = C0051.m8259(m228(), 297, 8, 1878);
            if (i2 >= length2) {
                C0005.m1628(mVar, C0001.m1212(jSONObjectM3923, strM82592));
                StringBuilder sb4 = new StringBuilder();
                C0018.m3933(sb4, C0036.m6189());
                C0018.m3933(sb4, C0001.m1212(jSONObjectM3923, C0016.m3525(m228(), 310, 11, 2197)));
                C0019.m4073(mVar, C0047.m7763(sb4));
                C0027.m5000(mVar, C0001.m1212(jSONObjectM3923, C0013.m3106(m228(), 321, 11, 3096)));
                C0022.m4432(mVar, C0001.m1212(jSONObjectM3923, C0049.m8007(m228(), 332, 8, 1306)));
                C0058.m9152(mVar, C0001.m1212(jSONObjectM3923, C0055.m8814(m228(), 340, 12, 2458)));
                C0058.m9159(mVar, C0001.m1212(jSONObjectM3923, C0039.m6551(m228(), 352, 9, 3192)));
                C0026.m4947(mVar, C0001.m1212(jSONObjectM3923, C0058.m9106(m228(), 361, 7, 2204)));
                C0017.m3671(mVar, C0001.m1212(jSONObjectM3923, C0009.m2037(m228(), 368, 8, 2331)));
                C0054.m8596(mVar, C0047.m7763(sb2));
                C0044.m7449(mVar, C0047.m7763(sb3));
                return C0053.m8428(mVar);
            }
            String str2 = strArrM47522[i2];
            String strM4199 = C0020.m4199(m228(), 305, 1, 2766);
            for (String str3 : C0024.m4752(str2, strM4199)) {
                String[] strArrM47523 = C0024.m4752(str3, C0053.m8477(m228(), 306, 2, 2452));
                C0018.m3933(sb3, strArrM47523[c]);
                C0018.m3933(sb3, C0007.m1842(m228(), 308, 1, 1517));
                C0018.m3933(sb3, strArrM47523[1]);
                String strM2300 = C0010.m2300(m228(), 309, 1, 2623);
                StringBuilder sb5 = new StringBuilder(strM2300);
                C0018.m3933(sb5, C0001.m1212(jSONObjectM3923, strM82592));
                C0018.m3933(sb5, strM2300);
                c = 0;
                C0018.m3933(sb5, strArrM47523[0]);
                C0018.m3933(sb3, C0047.m7763(sb5));
                C0018.m3933(sb3, strM4199);
            }
            C0018.m3933(sb3, strM7718);
            i2++;
        }
    }

    public String homeContent(boolean z) {
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArrayM4333 = C0021.m4333(new JSONObject(C0032.m5769(C0038.m6450(this), C0060.m9317())), C0020.m4199(m228(), 376, 5, 884));
        for (int i = 0; i < C0053.m8396(jSONArrayM4333); i++) {
            JSONObject jSONObjectM3923 = C0018.m3923(jSONArrayM4333, i);
            String strM8337 = C0052.m8337(m228(), 381, 9, 856);
            if (!C0058.m9127(C0001.m1212(jSONObjectM3923, strM8337), C0052.m8337(m228(), 390, 1, 744)) && !C0058.m9127(C0001.m1212(jSONObjectM3923, strM8337), C0038.m6452(m228(), 391, 1, 3069)) && !C0058.m9127(C0001.m1212(jSONObjectM3923, strM8337), C0040.m6584(m228(), 392, 1, 1174))) {
                C0004.m1532(arrayList, new b(C0001.m1212(jSONObjectM3923, C0026.m4951(m228(), 393, 7, 1129)), C0001.m1212(jSONObjectM3923, strM8337), null));
                C0049.m8025(C0035.m6087(), jSONObjectM3923);
            }
        }
        return C0003.m1448(C0031.m5584(this), null, arrayList);
    }

    public void init(Context context, String str) {
        String strM2083 = str;
        C0051.m8194(C0035.m6110());
        try {
            if (C0058.m9127(strM2083, C0037.m6307(m228(), 400, 3, 2683)) && C0058.m9127(strM2083, C0050.m8131(m228(), 403, 4, 2564))) {
                strM2083 = C0009.m2083(C0009.m2083(C0032.m5769(strM2083, null)));
            }
            String[] strArrM4752 = C0024.m4752(strM2083, C0058.m9106(m228(), 407, 3, 1902));
            this.c = strArrM4752;
            this.a = strArrM4752[0];
            if (strArrM4752.length > 1) {
                C0023.m4593().a = C0013.m3096(this)[1];
                C0023.m4593().d = C0013.m3096(this)[2];
                C0023.m4593().f = C0013.m3096(this)[3];
                C0050.m8081(C0023.m4593());
                C0064.m9696(C0023.m4593());
            }
        } catch (Exception unused) {
        }
    }

    public String playerContent(String str, String str2, List<String> list) {
        String strM9248;
        C0036.m6219();
        String[] strArrM4752 = C0024.m4752(str2, C0050.m8131(m228(), 410, 1, 2914));
        String str3 = null;
        String str4 = (strArrM4752.length <= 0 || C0057.m8953(strArrM4752[0])) ? null : strArrM4752[0];
        String str5 = (strArrM4752.length <= 1 || C0057.m8953(strArrM4752[1])) ? null : strArrM4752[1];
        if (strArrM4752.length > 2 && !C0057.m8953(strArrM4752[2])) {
            str3 = strArrM4752[2];
        }
        String strM2827 = C0011.m2827(str4, str5, str3);
        int length = C0013.m3096(this).length;
        String strM7657 = C0045.m7657(m228(), 411, 4, 2907);
        if (length > 1) {
            ArrayList arrayListM5663 = C0031.m5663(C0023.m4593());
            for (int i = 0; i < C0009.m2139(arrayListM5663); i++) {
                try {
                    strM9248 = C0059.m9248(C0023.m4593(), (String) C0028.m5167(arrayListM5663, i), str4);
                } catch (Exception unused) {
                }
                if (C0058.m9127(strM9248, strM7657)) {
                    g gVar = new g();
                    C0017.m3667(gVar, strM9248);
                    C0002.m1282(gVar, strM2827);
                    return C0033.m5828(gVar);
                }
                continue;
            }
        }
        if (C0003.m1392(str4)) {
            g gVar2 = new g();
            C0002.m1282(gVar2, strM2827);
            C0017.m3667(gVar2, str4);
            C0006.m1720(gVar2, 0);
            return C0033.m5828(gVar2);
        }
        String strM1373 = C0003.m1373(str4);
        if (C0058.m9127(strM1373, strM7657)) {
            g gVar3 = new g();
            C0017.m3667(gVar3, strM1373);
            C0002.m1282(gVar3, strM2827);
            return C0033.m5828(gVar3);
        }
        g gVar4 = new g();
        C0002.m1282(gVar4, strM2827);
        C0017.m3667(gVar4, str4);
        C0006.m1720(gVar4, 1);
        C0064.m9646(gVar4);
        return C0033.m5828(gVar4);
    }

    public String searchContent(String str, boolean z) {
        return C0004.m1503(this, str, true, C0047.m7833(m228(), 415, 1, 925));
    }

    public String searchContent(String str, boolean z, String str2) {
        StringBuilder sb;
        String strM6450;
        String strM5565;
        ArrayList arrayList = new ArrayList();
        boolean zM9127 = C0058.m9127(C0038.m6450(this), C0058.m9106(m228(), 416, 1, 1648));
        String strM6551 = C0039.m6551(m228(), 417, 4, 3104);
        if (zM9127) {
            sb = new StringBuilder();
            strM6450 = C0038.m6450(this);
            strM5565 = C0036.m6188(m228(), 421, 14, 761);
        } else {
            sb = new StringBuilder();
            strM6450 = C0038.m6450(this);
            strM5565 = C0031.m5565(m228(), 435, 14, 1372);
        }
        C0011.m2747(sb, strM6450, strM5565, str, strM6551);
        C0018.m3933(sb, str2);
        JSONArray jSONArrayM4333 = C0021.m4333(new JSONObject(C0032.m5769(C0047.m7763(sb), C0060.m9317())), C0010.m2300(m228(), 449, 4, 2665));
        for (int i = 0; i < C0053.m8396(jSONArrayM4333); i++) {
            JSONObject jSONObjectM3923 = C0018.m3923(jSONArrayM4333, i);
            String strM4340 = C0021.m4340(m228(), 453, 9, 2300);
            if (!C0058.m9127(C0001.m1212(jSONObjectM3923, strM4340), C0032.m5708(m228(), 462, 1, 1155)) && !C0058.m9127(C0001.m1212(jSONObjectM3923, strM4340), C0003.m1398(m228(), 463, 1, 966)) && !C0058.m9127(C0001.m1212(jSONObjectM3923, strM4340), C0050.m8131(m228(), 464, 1, 2844))) {
                StringBuilder sb2 = new StringBuilder(C0018.m3917(m228(), 465, 7, 537));
                C0018.m3933(sb2, C0001.m1212(jSONObjectM3923, C0033.m5852(m228(), 472, 6, 2857)));
                String strM7763 = C0047.m7763(sb2);
                String strM1212 = C0001.m1212(jSONObjectM3923, C0055.m8814(m228(), 478, 8, 559));
                String strM5362 = C0030.m5362(m228(), 486, 7, 1369);
                m mVar = new m(strM7763, strM1212, C0063.m9499(jSONObjectM3923, strM5362) ? C0001.m1212(jSONObjectM3923, strM5362) : C0007.m1840(), C0001.m1212(jSONObjectM3923, C0010.m2300(m228(), 493, 11, 1169)));
                C0058.m9085(mVar, C0018.m3917(m228(), 504, 3, 590));
                C0004.m1532(arrayList, mVar);
            }
        }
        return C0047.m7783(arrayList);
    }
}