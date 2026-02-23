package com.github.catvod.spider;

import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.J0.C0021;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.T0.m;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.merge.c1.C0046;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.github.catvod.spider.p000mergexbpq.c0.C0010;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class PanSearch extends Cloud {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f97short = {3100, 3130, 3116, 3131, 3172, 3080, 3118, 3116, 3111, 3133, 2398, 2428, 2409, 2426, 2431, 2431, 2418, 2364, 2342, 2365, 2339, 2355, 2363, 2372, 2426, 2429, 2423, 2428, 2404, 2400, 2355, 2397, 2375, 2355, 2338, 2339, 2365, 2339, 2344, 2355, 2372, 2426, 2429, 2341, 2343, 2344, 2355, 2411, 2341, 2343, 2362, 2355, 2386, 2403, 2403, 2431, 2422, 2372, 2422, 2417, 2392, 2426, 2407, 2364, 2342, 2336, 2340, 2365, 2336, 2341, 2355, 2363, 2392, 2395, 2375, 2398, 2399, 2367, 2355, 2431, 2426, 2424, 2422, 2355, 2388, 2422, 2416, 2424, 2428, 2362, 2355, 2384, 2427, 2401, 2428, 2430, 2422, 2364, 2338, 2337, 2337, 2365, 2339, 2365, 2339, 2365, 2339, 2355, 2368, 2418, 2421, 2418, 2401, 2426, 2364, 2342, 2336, 2340, 2365, 2336, 2341, 570, 550, 550, 546, 545, 616, 637, 637, 549, 549, 549, 636, 546, 563, 572, 545, 567, 563, 544, 561, 570, 636, 575, 567, 637, 2618, 2602, 2619, 2592, 2617, 2621, 2578, 2592, 2605, 2676, 2582, 2582, 2567, 2572, 2577, 2589, 2582, 2573, 2568, 2589, 2568, 2582, 2582, 2580, 1628, 1611, 1623, 1618, 1626, 1655, 1626, 612, 608, 628, 615, 638, 2834, 2847, 2842, 2826, 2822, 2845, 2839, 2817, 2842, 2821, 2838, 2603, 2615, 2615, 2611, 2608, 2681, 2668, 2668, 2612, 2612, 2612, 2669, 2611, 2594, 2605, 2608, 2598, 2594, 2609, 2592, 2603, 2669, 2606, 2598, 2668, 2588, 2605, 2598, 2619, 2615, 2668, 2599, 2594, 2615, 2594, 2668, 1223, 1179, 1165, 1161, 1178, 1163, 1152, 1222, 1154, 1179, 1159, 1158, 1239, 1155, 1165, 1169, 1183, 1159, 1178, 1164, 1237, 2353, 2407, 2422, 2425, 2346, 958, 1003, 936, 931, 958, 946, 940, 949, 1003, 930, 935, 946, 935, 2881, 2860, 2875, 2872, 2875, 2860, 2875, 2860, 3154, 3139, 3141, 3143, 3186, 3152, 3149, 3154, 3153, 2444, 2441, 2460, 2441, 2517, 2521, 2520, 2498, 2515, 2520, 2498, 1951, 1965, 1859, 902, 924, 907, 904, 3190, 3173, 3189, 3089, 3092, 3188, 3095, 3169, 3188, 1551, 1554, 1558, 1566, 3116, 3112, 3108, 3106, 3104};

    /* renamed from: ۟ۢۤۦ۠, reason: not valid java name and contains not printable characters */
    public static short[] m525() {
        if (C0055.m8740() >= 0) {
            return f97short;
        }
        return null;
    }

    public String searchContent(String str, boolean z) {
        HashMap map = new HashMap();
        String strM5852 = C0033.m5852(m525(), 0, 10, 3145);
        String strM9599 = C0064.m9599(m525(), 10, 111, 2323);
        C0053.m8424(map, strM5852, strM9599);
        String strM2300 = C0010.m2300(m525(), 121, 25, 594);
        String strM1212 = C0001.m1212(new JSONObject(C0062.m9381((m) C0028.m5161(C0030.m5333(C0016.m3577(C0032.m5769(strM2300, map)), C0022.m4403(m525(), 146, 24, 2633)), 0))), C0046.m7718(m525(), 170, 7, 1598));
        Object[] objArr = {C0001.m1189(m525(), 177, 5, 533), C0057.m8978(m525(), 182, 11, 2931)};
        ArrayList arrayList = new ArrayList(2);
        for (int i = 0; i < 2; i++) {
            Object obj = objArr[i];
            C0047.m7777(obj);
            C0004.m1532(arrayList, obj);
        }
        List listM5209 = C0029.m5209(arrayList);
        ArrayList arrayList2 = new ArrayList();
        Iterator itM3109 = C0013.m3109(listM5209);
        while (C0012.m2962(itM3109)) {
            String str2 = (String) C0048.m7949(itM3109);
            StringBuilder sbM7672 = C0046.m7672(C0055.m8814(m525(), 193, 36, 2627), strM1212, C0004.m1549(m525(), 229, 21, 1256));
            C0018.m3933(sbM7672, C0051.m8202(str, C0038.m6425(C0002.m1270())));
            C0018.m3933(sbM7672, C0017.m3646(m525(), 250, 5, 2327));
            C0018.m3933(sbM7672, str2);
            String strM7763 = C0047.m7763(sbM7672);
            HashMap mapM4127 = C0019.m4127(strM5852, strM9599, C0045.m7657(m525(), 255, 13, 966), C0022.m4403(m525(), 268, 1, 2928));
            C0053.m8424(mapM4127, C0035.m6131(m525(), 269, 7, 2910), strM2300);
            JSONObject jSONObjectM1370 = C0003.m1370(new JSONObject(C0032.m5769(strM7763, mapM4127)), C0003.m1398(m525(), 276, 9, 3106));
            String strM4107 = C0019.m4107(m525(), 285, 4, 2536);
            JSONArray jSONArrayM4333 = C0021.m4333(C0003.m1370(jSONObjectM1370, strM4107), strM4107);
            for (int i2 = 0; i2 < C0053.m8396(jSONArrayM4333); i2++) {
                JSONObject jSONObjectM3923 = C0018.m3923(jSONArrayM4333, i2);
                String strM8200 = C0051.m8200(jSONObjectM3923, C0043.m7290(m525(), 289, 7, 2486));
                String[] strArrM4752 = C0024.m4752(strM8200, C0051.m8259(m525(), 296, 2, 1987));
                if (strArrM4752.length != 0) {
                    C0055.m8732(C0049.m8058(C0030.m5333(C0016.m3577(strM8200), C0008.m1970(m525(), 298, 1, 1826)), C0000.m1077(m525(), 299, 4, 1006)), C0025.m4800(strArrM4752[0], C0022.m4403(m525(), 303, 9, 3146), C0007.m1840()), C0051.m8200(jSONObjectM3923, C0010.m2300(m525(), 316, 5, 3141)), C0051.m8200(jSONObjectM3923, C0043.m7290(m525(), 312, 4, 1659)), arrayList2);
                }
            }
        }
        return C0047.m7783(arrayList2);
    }
}