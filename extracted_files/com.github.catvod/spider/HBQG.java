package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.E.m;
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
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.Z.C0040;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.f0.C0052;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.t.C0061;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.merge.z.C0065;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.a0.C0006;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import com.github.catvod.spider.p000mergexbpq.r.C0014;
import com.github.catvod.spider.p000mergexbpq.x.C0015;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class HBQG extends Spider {
    public static Class d;

    /* renamed from: short, reason: not valid java name */
    private static final short[] f33short = {2765, 2766, 2752, 2757, 2801, 2760, 2754, 3038, 3036, 3017, 3032, 3034, 3026, 3023, 3012, 3070, 3026, 3027, 3017, 3032, 3027, 3017, 1202, 1207, 1197, 1194, 1153, 1176, 1171, 1192, 1182, 1171, 2284, 2293, 2302, 2245, 2292, 2299, 2295, 2303, 2669, 2676, 2687, 2628, 2667, 2674, 2680, 2509, 2516, 2527, 2532, 2505, 2526, 2518, 2522, 2505, 2512, 2504, 1760, 1760, 1760, 3162, 607, 551, 607, 551, 607, 551, 2663, 2686, 2677, 2638, 2687, 2672, 2684, 2676, 2075, 2074, 2059, 2078, 2070, 2067, 2108, 2064, 2065, 2059, 2074, 2065, 2059, 2673, 2676, 2670, 2665, 2697, 2704, 2715, 2720, 2703, 2707, 2718, 2694, 2720, 2713, 2701, 2704, 2706, 2991, 2998, 3005, 2950, 2985, 2997, 3000, 2976, 2950, 2988, 2987, 2997, 2316, 2420, 3116, 2409, 2409, 2409, 540, 517, 526, 565, 536, 527, 519, 523, 536, 513, 537, 912, 905, 898, 953, 901, 905, 904, 914, 899, 904, 914, 1646, 1655, 1660, 1607, 1633, 1661, 1657, 1642, 2477, 2484, 2495, 2436, 2495, 2482, 2473, 2494, 2488, 2479, 2484, 2473, 2400, 2425, 2418, 2377, 2423, 2421, 2402, 2425, 2404, 2443, 2450, 2457, 2466, 2445, 2452, 2462, 2038, 2031, 2020, 2015, 2017, 2034, 2021, 2017, 315, 316, 318, 310, 272, 316, 317, 295, 310, 317, 295, 2935, 2928, 2930, 2938, 2889, 2934, 2939, 2938, 2928, 2908, 2928, 2929, 2923, 2938, 2929, 2923, 1313, 1325, 1327, 1388, 1317, 1323, 1334, 1322, 1335, 1312, 1388, 1313, 1315, 1334, 1332, 1325, 1318, 1388, 1329, 1330, 1323, 1318, 1319, 1328, 1388, 1302, 1302, 1323, 1315, 1324, 773, 770, 773, 792, 1815, 1819, 1817, 1882, 1811, 1821, 1792, 1820, 1793, 1814, 1882, 1815, 1813, 1792, 1794, 1819, 1808, 1882, 1799, 1796, 1821, 1808, 1809, 1798, 1882, 1824, 1824, 1821, 1813, 1818, 2917, 2914, 2917, 2936, 1901, 1901, 1901, 2107, 2087, 2090, 2098, 2094, 2105, 2056, 2084, 2085, 2111, 2094, 2085, 2111, 682, 687, 672, 675, 687, 677, 699, 2495, 2473, 2477, 2494, 2479, 2468, 2447, 2467, 2466, 2488, 2473, 2466, 2488, 1964, 1978, 1982, 1965, 1980, 1975, 1948, 1968, 1969, 1963, 1978, 1969, 1963};
    public Object a = null;
    public Context b;
    public String c;

    public static Object[] loadPic(Map<String, String> map) {
        return (Object[]) C0052.m8352(C0065.m9803(C0004.m1492(), C0054.m8574(m220(), 0, 7, 2721), new Class[]{Map.class}), null, new Object[]{map});
    }

    /* renamed from: ۣ۟۠ۢۡ, reason: not valid java name and contains not printable characters */
    public static String m218(Object obj, Object obj2) {
        if (C0043.m7332() > 0) {
            return ((Gson) obj).toJson((JsonElement) obj2);
        }
        return null;
    }

    /* renamed from: ۟۠ۥۣ۟, reason: not valid java name and contains not printable characters */
    public static void m219(Object obj, Object obj2, Object obj3) {
        if (C0033.m5872() > 0) {
            ((JsonObject) obj).addProperty((String) obj2, (String) obj3);
        }
    }

    /* renamed from: ۟ۡ۠۠۠, reason: not valid java name and contains not printable characters */
    public static short[] m220() {
        if (C0051.m8216() <= 0) {
            return f33short;
        }
        return null;
    }

    /* renamed from: ۢ۠۟ۥ, reason: not valid java name and contains not printable characters */
    public static Object m221(Object obj, Object obj2, Object obj3) {
        if (C0022.m4497() >= 0) {
            return ((Gson) obj).fromJson((String) obj2, (Class) obj3);
        }
        return null;
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        try {
            C0032.m5744(this, C0040.m6672(this), C0014.m3297(this));
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArrayM4333 = C0021.m4333(new JSONObject(C0037.m6312(C0052.m8352(C0065.m9803(C0004.m1492(), C0004.m1549(m220(), 7, 15, 3005), new Class[]{String.class, String.class, C0011.m2810(), HashMap.class}), C0033.m5865(this), new Object[]{str, str2, C0028.m5186(z), map}))), C0057.m8978(m220(), 22, 4, 1246));
            for (int i = 0; i < C0053.m8396(jSONArrayM4333); i++) {
                JSONObject jSONObjectM3923 = C0018.m3923(jSONArrayM4333, i);
                C0004.m1532(arrayList, new m(C0001.m1212(jSONObjectM3923, C0020.m4199(m220(), 26, 6, 1271)), C0001.m1212(jSONObjectM3923, C0044.m7509(m220(), 32, 8, 2202)), C0001.m1212(jSONObjectM3923, C0015.m3484(m220(), 40, 7, 2587)), C0001.m1212(jSONObjectM3923, C0043.m7290(m220(), 47, 11, 2491))));
            }
            return C0047.m7783(arrayList);
        } catch (Exception unused) {
            return C0007.m1840();
        }
    }

    public String detailContent(List<String> list) {
        m mVar;
        char c = 0;
        String strM6452 = C0038.m6452(m220(), 58, 3, 1732);
        String strM1774 = C0006.m1774(m220(), 61, 1, 3193);
        String strM1842 = C0007.m1842(m220(), 62, 6, 515);
        String strM8259 = C0051.m8259(m220(), 68, 8, 2577);
        try {
            mVar = new m();
        } catch (Exception unused) {
        }
        try {
            JSONObject jSONObjectM3923 = C0018.m3923(C0021.m4333(new JSONObject(C0037.m6312(C0052.m8352(C0065.m9803(C0004.m1492(), C0002.m1305(m220(), 76, 13, 2175), new Class[]{List.class}), C0033.m5865(this), new Object[]{list}))), C0029.m5256(m220(), 89, 4, 2589)), 0);
            C0055.m8715(C0035.m6110(), C0001.m1212(jSONObjectM3923, strM8259));
            ArrayList arrayList = new ArrayList();
            new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            String[] strArrM4752 = C0024.m4752(C0001.m1212(jSONObjectM3923, C0064.m9599(m220(), 93, 13, 2815)), strM1842);
            String[] strArrM47522 = C0024.m4752(C0001.m1212(jSONObjectM3923, C0041.m6779(m220(), 106, 12, 3033)), strM1842);
            for (String str : strArrM4752) {
                C0004.m1532(arrayList, str);
            }
            int i = 0;
            while (i < strArrM47522.length) {
                String[] strArrM47523 = C0024.m4752(strArrM47522[i], strM1774);
                ArrayList arrayList3 = new ArrayList();
                int i2 = 0;
                while (i2 < strArrM47523.length) {
                    String[] strArrM47524 = C0024.m4752(strArrM47523[i2], C0034.m6001(m220(), 118, 2, 2384));
                    StringBuilder sb = new StringBuilder();
                    C0018.m3933(sb, strArrM47524[c]);
                    C0018.m3933(sb, C0006.m1774(m220(), 120, 1, 3080));
                    C0018.m3933(sb, strArrM47524[1]);
                    C0018.m3933(sb, C0025.m4795(m220(), 121, 3, 2383));
                    c = 0;
                    C0018.m3933(sb, strArrM47524[0]);
                    C0004.m1532(arrayList3, C0047.m7763(sb));
                    i2++;
                    strArrM47522 = strArrM47522;
                }
                C0004.m1532(arrayList2, C0036.m6194(strM1774, arrayList3));
                i++;
                strArrM47522 = strArrM47522;
            }
            C0005.m1628(mVar, C0001.m1212(jSONObjectM3923, strM8259));
            StringBuilder sb2 = new StringBuilder();
            C0018.m3933(sb2, C0036.m6189());
            C0018.m3933(sb2, C0001.m1212(jSONObjectM3923, C0015.m3484(m220(), 124, 11, 618)));
            C0019.m4073(mVar, C0047.m7763(sb2));
            StringBuilder sb3 = new StringBuilder();
            C0018.m3933(sb3, C0055.m8703());
            C0018.m3933(sb3, C0001.m1212(jSONObjectM3923, C0061.m9361(m220(), 135, 11, 998)));
            C0027.m5000(mVar, C0047.m7763(sb3));
            C0022.m4432(mVar, C0001.m1212(jSONObjectM3923, C0022.m4403(m220(), 146, 8, 1560)));
            C0058.m9152(mVar, C0001.m1212(jSONObjectM3923, C0007.m1842(m220(), 154, 12, 2523)));
            C0058.m9159(mVar, C0001.m1212(jSONObjectM3923, C0021.m4340(m220(), 166, 9, 2326)));
            C0026.m4947(mVar, C0001.m1212(jSONObjectM3923, C0054.m8574(m220(), 175, 7, 2557)));
            C0017.m3671(mVar, C0001.m1212(jSONObjectM3923, C0045.m7657(m220(), 182, 8, 1920)));
            C0054.m8596(mVar, C0036.m6194(strM6452, arrayList));
            C0044.m7449(mVar, C0036.m6194(strM6452, arrayList2));
            return C0053.m8428(mVar);
        } catch (Exception unused2) {
            return C0007.m1840();
        }
    }

    public String homeContent(boolean z) {
        try {
            return C0037.m6312(C0052.m8352(C0065.m9803(C0004.m1492(), C0004.m1549(m220(), 190, 11, 339), new Class[]{C0011.m2810()}), C0033.m5865(this), new Object[]{C0028.m5186(z)}));
        } catch (Exception unused) {
            return C0007.m1840();
        }
    }

    public String homeVideoContent() {
        try {
            return C0037.m6312(C0052.m8352(C0065.m9803(C0004.m1492(), C0065.m9775(m220(), 201, 16, 2847), null), C0033.m5865(this), null));
        } catch (Exception unused) {
            return C0007.m1840();
        }
    }

    public void init(Context context) {
        Class clsM3417 = C0015.m3417(C0045.m7605(C0047.m7777(this)), C0004.m1549(m220(), 217, 30, 1346));
        d = clsM3417;
        this.a = C0016.m3522(C0005.m1638(clsM3417, null), null);
        C0052.m8352(C0065.m9803(C0004.m1492(), C0009.m2037(m220(), 247, 4, 876), new Class[]{Context.class}), C0033.m5865(this), new Object[]{context});
    }

    public void init(Context context, String str) {
        this.b = context;
        this.c = str;
        Class clsM3417 = C0015.m3417(C0045.m7605(C0047.m7777(this)), C0022.m4403(m220(), 251, 30, 1908));
        d = clsM3417;
        this.a = C0016.m3522(C0005.m1638(clsM3417, null), null);
        C0052.m8352(C0065.m9803(C0004.m1492(), C0034.m6001(m220(), 281, 4, 2828), new Class[]{Context.class, String.class}), C0033.m5865(this), new Object[]{context, str});
    }

    public String playerContent(String str, String str2, List<String> list) {
        try {
            C0036.m6219();
            String[] strArrM4752 = C0024.m4752(str2, C0045.m7657(m220(), 285, 3, 1867));
            String str3 = null;
            String str4 = (strArrM4752.length <= 0 || C0057.m8953(strArrM4752[0])) ? null : strArrM4752[0];
            if (strArrM4752.length > 1 && !C0057.m8953(strArrM4752[1])) {
                str3 = strArrM4752[1];
            }
            String strM2827 = C0011.m2827(str4, C0002.m1316(C0035.m6110()), str3);
            Object objM8352 = C0052.m8352(C0065.m9803(C0004.m1492(), C0054.m8574(m220(), 288, 13, 2123), new Class[]{String.class, String.class, List.class}), C0033.m5865(this), new Object[]{str, str4, list});
            Gson gson = new Gson();
            JsonObject jsonObject = (JsonObject) m221(gson, C0037.m6312(objM8352), JsonObject.class);
            m219(jsonObject, C0062.m9389(m220(), 301, 7, 718), strM2827);
            return m218(gson, jsonObject);
        } catch (Exception unused) {
            return C0007.m1840();
        }
    }

    public String searchContent(String str, boolean z) {
        try {
            return C0037.m6312(C0052.m8352(C0065.m9803(C0004.m1492(), C0034.m6001(m220(), 308, 13, 2508), new Class[]{String.class, C0011.m2810()}), C0033.m5865(this), new Object[]{str, C0028.m5186(z)}));
        } catch (Exception unused) {
            return C0007.m1840();
        }
    }

    public String searchContent(String str, boolean z, String str2) {
        try {
            return C0037.m6312(C0052.m8352(C0065.m9803(C0004.m1492(), C0056.m8911(m220(), 321, 13, 2015), new Class[]{String.class, C0011.m2810(), String.class}), C0033.m5865(this), new Object[]{str, C0028.m5186(z), str2}));
        } catch (Exception unused) {
            return C0007.m1840();
        }
    }
}