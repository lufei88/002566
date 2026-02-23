package com.github.catvod.spider;

import com.github.catvod.spider.merge.E.m;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.J0.C0021;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.merge.z.C0065;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.a0.C0006;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.c0.C0010;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.r.C0014;
import java.util.ArrayList;
import java.util.HashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class YiSo extends Ali {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f133short = {1957, 1956, 1974, 2013, 1992, 1435, 1504, 1531, 1472, 1532, 1484, 1530, 1513, 1504, 1486, 1482, 1529, 1531, 1501, 1511, 1514, 887, 883, 869, 682, 720, 735, 724, 754, 764, 674, 741, 731, 728, 738, 766, 674, 676, 732, 745, 298, 302, 312, 324, 296, 297, 296, 324, 315, 288, 296, 312, 350, 315, 266, 271, 271, 258, 261, 268, 537, 517, 517, 513, 514, 587, 606, 606, 520, 536, 514, 542, 607, 535, 516, 543, 606, 528, 513, 536, 606, 514, 532, 528, 515, 530, 537, 590, 543, 528, 540, 532, 588, 362, 316, 301, 299, 297, 258, 291, 369, 381, 362, 298, 318, 291, 289, 369, 301, 288, 293, 2952, 2990, 3000, 2991, 3056, 2972, 3002, 3000, 2995, 2985, 2225, 2195, 2182, 2197, 2192, 2192, 2205, 2259, 2249, 2258, 2252, 2268, 2260, 2224, 2197, 2194, 2185, 2180, 2247, 2268, 2237, 2194, 2200, 2190, 2195, 2197, 2200, 2268, 2253, 2254, 2247, 2268, 2218, 2254, 2252, 2248, 2245, 2237, 2268, 2238, 2185, 2197, 2192, 2200, 2259, 2223, 2220, 2253, 2237, 2258, 2254, 2253, 2252, 2244, 2253, 2254, 2258, 2252, 2252, 2255, 2247, 2268, 2187, 2186, 2261, 2268, 2237, 2188, 2188, 2192, 2201, 2219, 2201, 2206, 2231, 2197, 2184, 2259, 2249, 2255, 2251, 2258, 2255, 2250, 2268, 2260, 2231, 2228, 2216, 2225, 2224, 2256, 2268, 2192, 2197, 2199, 2201, 2268, 2235, 2201, 2207, 2199, 2195, 2261, 2268, 2218, 2201, 2190, 2191, 2197, 2195, 2194, 2259, 2248, 2258, 2252, 2268, 2239, 2196, 2190, 2195, 2193, 2201, 2259, 2253, 2252, 2255, 2258, 2252, 2258, 2249, 2252, 2250, 2252, 2258, 2253, 2254, 2245, 2268, 2225, 2195, 2206, 2197, 2192, 2201, 2268, 2223, 2205, 2202, 2205, 2190, 2197, 2259, 2249, 2255, 2251, 2258, 2255, 2250, 1448, 1439, 1436, 1439, 1416, 1439, 1416, 950, 938, 938, 942, 941, 996, 1009, 1009, 935, 951, 941, 945, 1008, 952, 939, 944, 1009, 2130, 2174, 2174, 2170, 2168, 2164, 2886, 2900, 2881, 2906, 2910, 2896, 2907, 2824, 2823, 2829, 2816, 2817, 2902, 2903, 2816, 2829, 2840, 2822, 2829, 2829, 2817, 2840, 2817, 2818, 2822, 2903, 2840, 2829, 2817, 2902, 2817, 2840, 2822, 2817, 2820, 2819, 2820, 2899, 2819, 2818, 2900, 2817, 2821, 2828, 2466, 2471, 2482, 2471, 1618, 1623, 1613, 1610, 547, 556, 553, 544, 524, 555, 547, 554, 566, 3103, 3088, 3093, 3100, 3127, 3096, 3092, 3100, 1863, 1869, 1876, 1891, 1874, 1861, 1857, 1876, 1861, 891, 892, 866, 522, 534, 534, 530, 529, 600, 589, 589, 523, 524, 519, 533, 529, 588, 517, 534, 523, 527, 517, 588, 513, 525, 527, 589, 524, 519, 533, 529, 515, 530, 530, 573, 512, 534, 589, 594, 589, 595, 593, 592, 596, 593, 602, 593, 597, 602, 599, 603, 589, 595, 594, 594, 594};

    /* renamed from: ۟ۥۣۨۧ, reason: not valid java name and contains not printable characters */
    public static short[] m770() {
        if (C0028.m5152() < 0) {
            return f133short;
        }
        return null;
    }

    public String decrypt(String str) {
        String strM4340 = C0021.m4340(m770(), 0, 5, 2032);
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(C0021.m4347(C0022.m4403(m770(), 5, 16, 1455), strM4340), C0062.m9389(m770(), 21, 3, 822));
            IvParameterSpec ivParameterSpec = new IvParameterSpec(C0021.m4347(C0009.m2037(m770(), 24, 16, 659), strM4340));
            Cipher cipherM4284 = C0020.m4284(C0009.m2037(m770(), 40, 20, 363));
            C0058.m9088(cipherM4284, 2, secretKeySpec, ivParameterSpec);
            return new String(C0010.m2335(cipherM4284, C0044.m7483(C0050.m8115(str), 0)), strM4340);
        } catch (Exception unused) {
            return C0007.m1840();
        }
    }

    public String searchContent(String str, boolean z) {
        StringBuilder sb = new StringBuilder(C0039.m6551(m770(), 60, 33, 625));
        C0018.m3933(sb, C0056.m8909(str));
        C0018.m3933(sb, C0045.m7657(m770(), 93, 18, 332));
        String strM7763 = C0047.m7763(sb);
        HashMap mapM4127 = C0019.m4127(C0021.m4340(m770(), 111, 10, 3037), C0009.m2037(m770(), 121, 159, 2300), C0020.m4199(m770(), 280, 7, 1530), C0005.m1645(m770(), 287, 17, 990));
        C0053.m8424(mapM4127, C0049.m8007(m770(), 304, 6, 2065), C0054.m8574(m770(), 310, 44, 2869));
        JSONArray jSONArrayM4333 = C0021.m4333(C0003.m1370(new JSONObject(C0032.m5769(strM7763, mapM4127)), C0042.m7151(m770(), 354, 4, 2502)), C0006.m1774(m770(), 358, 4, 1598));
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < C0053.m8396(jSONArrayM4333); i++) {
            m mVar = new m();
            String strM1212 = C0001.m1212(C0018.m3923(C0021.m4333(C0018.m3923(jSONArrayM4333, i), C0012.m2973(m770(), 362, 9, 581)), 0), C0030.m5362(m770(), 371, 8, 3193));
            String strM12122 = C0001.m1212(C0018.m3923(jSONArrayM4333, i), C0065.m9775(m770(), 379, 9, 1824));
            C0011.m2828(mVar, C0037.m6341(this, C0001.m1212(C0018.m3923(jSONArrayM4333, i), C0012.m2973(m770(), 388, 3, 782))));
            C0005.m1628(mVar, strM1212);
            C0019.m4073(mVar, strM12122);
            C0026.m4947(mVar, C0014.m3332(m770(), 391, 53, 610));
            C0004.m1532(arrayList, mVar);
        }
        return C0047.m7783(arrayList);
    }
}