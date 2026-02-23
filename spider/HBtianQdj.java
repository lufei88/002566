package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.E.b;
import com.github.catvod.spider.merge.E.g;
import com.github.catvod.spider.merge.E.m;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.J0.C0021;
import com.github.catvod.spider.merge.N.C0023;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.Z.C0040;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.f0.C0052;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.r0.C0060;
import com.github.catvod.spider.merge.t.C0061;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.merge.z.C0065;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.a0.C0006;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import com.github.catvod.spider.p000mergexbpq.r.C0014;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class HBtianQdj extends Spider {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f60short = {2171, 2151, 2151, 2147, 2144, 2089, 2108, 2108, 2162, 2147, 2170, 2109, 2160, 2166, 2173, 2164, 2150, 2170, 2164, 2150, 2170, 2109, 2160, 2173, 2108, 2162, 2147, 2170, 2108, 2167, 2150, 2162, 2173, 2169, 2150, 2108, 2162, 2147, 2170, 2109, 2147, 2171, 2147, 2092, 2160, 2175, 2162, 2144, 2144, 2173, 2162, 2174, 2166, 2094, 3129, 3184, 3193, 3193, 3180, 3194, 3179, 3106, 1004, 1001, 1020, 1001, 1622, 1627, 1627, 1631, 1643, 1629, 1616, 2056, 2069, 2056, 2064, 2073, 280, 276, 269, 286, 265, 24926, 25114, -31143, 2008, 1997, 2004, 1998, 2002, 2009, 2008, 2018, 2014, 2003, 1993, 2250, 2262, 2262, 2258, 2257, 2200, 2189, 2189, 2243, 2258, 2251, 2188, 2241, 2247, 2252, 2245, 2263, 2251, 2245, 2263, 2251, 2188, 2241, 2252, 2189, 2243, 2258, 2251, 2189, 2246, 2263, 2243, 2252, 2248, 2263, 2189, 2243, 2258, 2251, 2188, 2258, 2250, 2258, 2205, 2240, 2253, 2253, 2249, 2301, 2251, 2246, 2207, 3302, 3299, 3318, 3299, 2958, 2963, 2958, 2966, 2975, 1940, 2740, 2731, 2726, 2727, 2733, 2717, 2731, 2726, 1403, 1933, 1920, 1920, 1924, 1968, 1951, 1926, 1932, -28350, 26015, 2575, 2574, 2584, 2568, 2459, 2454, 2454, 2450, 2470, 2455, 2456, 2452, 2460, 27994, 28190, -30115, 1881, 1858, 1881, 1868, 1857, -27827, 2771, 2767, 2767, 2763, 2760, 2689, 2708, 2708, 2774, 2772, 2765, 2709, 2776, 2782, 2773, 2780, 2766, 2770, 2780, 2766, 2770, 2709, 2776, 2773, 2708, 2481, 2492, 2467, 2555, 23507, 30126, -26148, 27452, 2555, 2481, 2552, 2483, 2489, 2480, 2477, 2555, 2490, 2467, 2480, 2471, 2483, 2489, 2490, 2466, 2552, 2484, 2464, 2465, 2490, 2269, 2250, 2251, 2251, 2256, 2257, 3000, 2980, 2980, 2976, 2979, 3050, 3071, 3071, 2993, 2976, 3001, 3070, 2995, 2997, 3006, 2999, 2981, 3001, 2999, 2981, 3001, 3070, 2995, 3006, 3071, 2993, 2976, 3001, 3071, 2996, 2981, 2993, 3006, 3002, 2981, 3071, 2993, 2976, 3001, 3070, 2976, 3000, 2976, 3055, 2982, 3001, 2996, 2997, 3007, 2959, 3001, 2996, 3053, 2557, 2479, 2466, 2475, 2494, 2534, 2486, 2475, 2543, 729, 1646, 1650, 1650, 1654, 1653, 1596, 1577, 1577, 1639, 1654, 1647, 1576, 1637, 1635, 1640, 1633, 1651, 1647, 1633, 1651, 1647, 1576, 1637, 1640, 1577, 1639, 1654, 1647, 1577, 1634, 1651, 1639, 1640, 1644, 1651, 1577, 1639, 1654, 1647, 1576, 1654, 1646, 1654, 1593, 1640, 1639, 1643, 1635, 1595, 3283, 3286, 3267, 3286, 2967, 2970, 2970, 2974, 2986, 2972, 2961, 1107, 1102, 1107, 1099, 1090, 2448, 2460, 2437, 2454, 2433};
    public String a;

    /* renamed from: ۨ۠ۨ۠, reason: not valid java name and contains not printable characters */
    public static short[] m378() {
        if (C0006.m1726() < 0) {
            return f60short;
        }
        return null;
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder(C0044.m7509(m378(), 0, 54, 2067));
        C0018.m3933(sb, str);
        C0018.m3933(sb, C0014.m3332(m378(), 54, 8, 3103));
        C0018.m3933(sb, str2);
        JSONArray jSONArrayM4333 = C0021.m4333(new JSONObject(C0032.m5769(C0047.m7763(sb), null)), C0005.m1645(m378(), 62, 4, 904));
        for (int i = 0; i < C0053.m8396(jSONArrayM4333); i++) {
            JSONObject jSONObjectM3923 = C0018.m3923(jSONArrayM4333, i);
            String strM1212 = C0001.m1212(jSONObjectM3923, C0013.m3106(m378(), 66, 7, 1588));
            String strM12122 = C0001.m1212(jSONObjectM3923, C0028.m5109(m378(), 73, 5, 2172));
            String strM12123 = C0001.m1212(jSONObjectM3923, C0026.m4951(m378(), 78, 5, 379));
            StringBuilder sb2 = new StringBuilder(C0030.m5362(m378(), 83, 3, 1962));
            C0018.m3933(sb2, C0001.m1212(jSONObjectM3923, C0007.m1842(m378(), 86, 11, 1981)));
            C0004.m1532(arrayList, new m(strM1212, strM12122, strM12123, C0047.m7763(sb2)));
        }
        return C0047.m7783(arrayList);
    }

    public String detailContent(List<String> list) {
        StringBuilder sb = new StringBuilder(C0060.m9352(m378(), 97, 52, 2210));
        C0018.m3933(sb, (String) C0048.m7915(list, 0));
        JSONObject jSONObject = new JSONObject(C0032.m5769(C0047.m7763(sb), null));
        JSONArray jSONArrayM4333 = C0021.m4333(jSONObject, C0053.m8477(m378(), 149, 4, 3202));
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < C0053.m8396(jSONArrayM4333); i++) {
            JSONObject jSONObjectM3923 = C0018.m3923(jSONArrayM4333, i);
            C0018.m3933(sb2, C0001.m1212(jSONObjectM3923, C0039.m6551(m378(), 153, 5, 3066)));
            C0018.m3933(sb2, C0061.m9361(m378(), 158, 1, 1968));
            C0018.m3933(sb2, C0001.m1212(jSONObjectM3923, C0055.m8814(m378(), 159, 8, 2754)));
            C0018.m3933(sb2, C0042.m7151(m378(), 167, 1, 1368));
        }
        m mVar = new m();
        C0044.m7449(mVar, C0047.m7763(sb2));
        C0026.m4947(mVar, C0001.m1212(jSONObject, C0050.m8131(m378(), 168, 8, 2031)));
        C0054.m8596(mVar, C0003.m1398(m378(), 176, 2, 2970));
        C0027.m5000(mVar, C0001.m1212(jSONObject, C0050.m8131(m378(), 178, 4, 2667)));
        C0005.m1628(mVar, C0001.m1212(jSONObject, C0023.m4536(m378(), 182, 9, 2553)));
        StringBuilder sb3 = new StringBuilder();
        C0018.m3933(sb3, C0036.m6189());
        C0018.m3933(sb3, C0047.m7833(m378(), 191, 3, 2990));
        C0018.m3933(sb3, C0001.m1212(jSONObject, C0065.m9775(m378(), 194, 5, 1837)));
        C0018.m3933(sb3, C0056.m8911(m378(), 199, 1, 1419));
        C0019.m4073(mVar, C0047.m7763(sb3));
        return C0053.m8428(mVar);
    }

    public String homeContent(boolean z) {
        ArrayList arrayList = new ArrayList();
        Iterator itM7807 = C0047.m7807(C0038.m6459(C0030.m5333(C0016.m3577(C0032.m5769(C0018.m3917(m378(), 200, 25, 2747), null)), C0060.m9352(m378(), 225, 29, 2517)), C0038.m6452(m378(), 254, 6, 2239)));
        while (C0012.m2962(itM7807)) {
            com.github.catvod.spider.merge.T0.m mVar = (com.github.catvod.spider.merge.T0.m) C0048.m7949(itM7807);
            C0004.m1532(arrayList, new b(C0064.m9669(mVar), C0064.m9669(mVar), null));
        }
        return C0003.m1448(C0052.m8314(this), null, arrayList);
    }

    public void init(Context context, String str) {
        C0051.m8194(C0035.m6110());
        if (str != null) {
            this.a = str;
        }
    }

    public String playerContent(String str, String str2, List<String> list) {
        C0036.m6219();
        StringBuilder sb = new StringBuilder(C0024.m4740(m378(), 260, 53, 3024));
        C0018.m3933(sb, str2);
        C0018.m3933(sb, C0050.m8131(m378(), 313, 9, 2523));
        String strM7763 = C0047.m7763(sb);
        g gVar = new g();
        C0017.m3667(gVar, strM7763);
        return C0033.m5828(gVar);
    }

    public String searchContent(String str, boolean z) {
        return C0016.m3604(this, str, true, C0035.m6131(m378(), 322, 1, 744));
    }

    public String searchContent(String str, boolean z, String str2) {
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArrayM4333 = C0021.m4333(new JSONObject(C0032.m5769(C0026.m4915(C0040.m6584(m378(), 323, 49, 1542), str), null)), C0005.m1645(m378(), 372, 4, 3255));
        for (int i = 0; i < C0053.m8396(jSONArrayM4333); i++) {
            JSONObject jSONObjectM3923 = C0018.m3923(jSONArrayM4333, i);
            C0004.m1532(arrayList, new m(C0001.m1212(jSONObjectM3923, C0063.m9585(m378(), 376, 7, 3061)), C0001.m1212(jSONObjectM3923, C0038.m6452(m378(), 383, 5, 1063)), C0001.m1212(jSONObjectM3923, C0036.m6188(m378(), 388, 5, 2547))));
        }
        return C0047.m7783(arrayList);
    }
}