package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.B0.a;
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
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.Z.C0040;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.a0.C0042;
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
import com.github.catvod.spider.merge.g0.AbstractC0308c;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.merge.z.C0065;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.a0.C0006;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import com.github.catvod.spider.p000mergexbpq.x.C0015;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import com.google.gson.JsonObject;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class HBcms10Dou extends Spider {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f36short = {1575, 1595, 1595, 1599, 1596, 1653, 1632, 1632, 1589, 1590, 1633, 1591, 1570, 1570, 1633, 1575, 1572, 1632, 1582, 1599, 1574, 1633, 1599, 1575, 1599, 1632, 1599, 1597, 1568, 1593, 1574, 1579, 1578, 1632, 1593, 1568, 1579, 1632, 1570, 1540, 1554, 1541, 1626, 1590, 1552, 1554, 1561, 1539, 1311, 1341, 1320, 1339, 1342, 1342, 1331, 1405, 1383, 1404, 1378, 1394, 1402, 1285, 1339, 1340, 1334, 1341, 1317, 1313, 1394, 1308, 1286, 1394, 1379, 1378, 1404, 1378, 1385, 1394, 1285, 1309, 1285, 1380, 1382, 1403, 1394, 1299, 1314, 1314, 1342, 1335, 1285, 1335, 1328, 1305, 1339, 1318, 1405, 1383, 1377, 1381, 1404, 1377, 1380, 1394, 1402, 1305, 1306, 1286, 1311, 1310, 1406, 1394, 1342, 1339, 1337, 1335, 1394, 1301, 1335, 1329, 1337, 1341, 1403, 1394, 1297, 1338, 1312, 1341, 1343, 1335, 1405, 1379, 1378, 1387, 1404, 1378, 1404, 1378, 1404, 1378, 1394, 1281, 1331, 1332, 1331, 1312, 1339, 1405, 1383, 1377, 1381, 1404, 1377, 1380, 2185, 2334, 2376, 2399, 2309, 838, 792, 794, 836, 797, 796, 781, 792, 784, 789, 863, 781, 836, 2219, 2284, 2286, 2224, 2281, 2280, 2297, 2284, 2276, 2273, 2219, 2297, 2224, 778, 783, 789, 786, 1355, 1362, 1369, 1378, 1364, 1369, 1939, 1930, 1921, 1978, 1931, 1924, 1928, 1920, 1406, 1383, 1388, 1367, 1400, 1377, 1387, 570, 547, 552, 531, 574, 553, 545, 557, 574, 551, 575, 2689, 2699, 2698, 2692, 2714, 2776, 2777, 630, 2033, 1974, 1972, 2026, 1971, 1970, 1955, 1974, 1982, 1979, 2033, 1982, 1971, 1956, 2026, 1802, 1876, 1878, 1800, 1873, 1872, 1857, 1876, 1884, 1881, 1811, 1884, 1873, 1862, 1800, 1242, 1247, 1221, 1218, 1134, 1143, 1148, 1095, 1128, 1140, 1145, 1121, 1095, 1150, 1130, 1143, 1141, 1442, 1498, 1442, 1498, 1442, 1498, 2974, 2951, 2956, 2999, 2968, 2948, 2953, 2961, 2999, 2973, 2970, 2948, 760, 760, 760, 2134, 2127, 2116, 2175, 2126, 2113, 2125, 2117, 3024, 709, 701, 2418, 1526, 1221, 1244, 1239, 1260, 1217, 1238, 1246, 1234, 1217, 1240, 1216, 2867, 2858, 2849, 2842, 2854, 2858, 2859, 2865, 2848, 2859, 2865, 2209, 2232, 2227, 2184, 2222, 2226, 2230, 2213, 2950, 2975, 2964, 2991, 2964, 2969, 2946, 2965, 2963, 2948, 2975, 2946, 3125, 3116, 3111, 3100, 3106, 3104, 3127, 3116, 3121, 1234, 1227, 1216, 1275, 1236, 1229, 1223, 935, 958, 949, 910, 944, 931, 948, 944, 2842, 2822, 2822, 2818, 2888, 2909, 2909, 2881, 2890, 2908, 2885, 2884, 2908, 2880, 2883, 2890, 2908, 2885, 2888, 2883, 2880, 2883, 2880, 2883, 2909, 2846, 2820, 2838, 2845, 2823, 2909, 2837, 2839, 2822, 2833, 2841, 2908, 2818, 2842, 2818, 3156, 3144, 3144, 3148, 3078, 3091, 3091, 3151, 3159, 3090, 3082, 3077, 3153, 3142, 3162, 3090, 3167, 3155, 3153, 3091, 3165, 3148, 3157, 3091, 3157, 3154, 3160, 3161, 3140, 3075, 3148, 3165, 3150, 3151, 3161, 3151, 3189, 3160, 3073, 3082, 3082, 3085, 3098, 3165, 3148, 3148, 3157, 3160, 3073, 3076, 3082, 3087, 3086, 3085, 3098, 3146, 3157, 3160, 3161, 3155, 3177, 3150, 3152, 3073, 1578, 1548, 1562, 1549, 1618, 1598, 1560, 1562, 1553, 1547, 2603, 2607, 2604, 2608, 2608, 2612, 2667, 2672, 2666, 2677, 2666, 2676, 1805, 1825, 1824, 1824, 1835, 1837, 1850, 1831, 1825, 1824, 1441, 1423, 1423, 1434, 1479, 1451, 1414, 1411, 1436, 1423, 2188, 2199, 2195, 2205, 2198, 1729, 1773, 1773, 1769, 1771, 1767, 825, 801, 825, 826, 812, 826, 826, 800, 813, 852, 860, 776, 770, 862, 772, 861, 797, 849, 782, 799, 861, 776, 771, 795, 794, 783, 799, 783, 793, 793, 779, 797, 771, 795, 859, 796, 850, 841, 826, 800, 829, 812, 822, 829, 806, 829, 808, 805, 822, 800, 813, 852, 857, 861, 779, 783, 783, 778, 781, 856, 776, 778, 783, 776, 856, 863, 860, 848, 779, 857, 861, 857, 860, 859, 861, 856, 863, 776, 848, 863, 858, 783, 779, 783, 2781, 2770, 2783, 2765, 2765, 477, 464, 473, 460, 502, 455, 456, 452, 460, 18555, 32481, 30170, 1053, 1040, 1049, 1036, 1078, 1024, 1037, 2252, 2240, 2252, 1219, 1247, 1247, 1243, 1729, 1729, 1729, 3139, 1976, 1983, 1953, 2944, 2972, 2972, 2968, 3026, 3015, 3015, 3035, 3024, 3014, 3039, 3038, 3014, 3034, 3033, 3024, 3014, 3039, 3026, 3033, 3034, 3033, 3034, 3033, 3015, 2948, 2974, 2956, 2951, 2973, 3015, 2948, 2974, 2956, 2951, 2973, 3025, 3014, 2968, 2944, 2968, 3031, 2944, 2954, 2972, 3036, 3029, 1325, 1406, 1401, 1383, 1334, 2388, 2376, 2376, 2380, 2274, 1502, 2168, 2094, 2105, 2147, 2959, 3016, 3018, 2964, 3021, 3020, 3037, 3016, 3008, 3013, 2959, 3038, 3021, 2964, 1965, 2035, 2033, 1967, 2038, 2039, 2022, 2035, 2043, 2046, 1972, 2021, 2038, 1967, 2169, 2172, 2150, 2145, 2550, 2555, 2546, 2535, 2525, 2540, 2531, 2543, 2535, 18008, 32540, 32450, 1056, 1066, 1067, 1061, 1083, 1145, 1144, 1556, 1549, 1542, 1597, 1547, 1542, 1963, 1970, 1977, 1922, 1971, 1980, 1968, 1976, 2196, 2189, 2182, 2237, 2194, 2187, 2177, 2070, 2063, 2052, 2111, 2066, 2053, 2061, 2049, 2066, 2059, 2067, -28553, -26762, 31593};
    public String a = C0042.m7151(m234(), 0, 38, 1615);
    public final String b = C0007.m1840();
    public String[] c = null;

    public static HashMap a() {
        return C0020.m4251(C0051.m8259(m234(), 38, 10, 1655), C0023.m4536(m234(), 48, 106, 1362));
    }

    /* renamed from: ۟۟۟۟ۢ, reason: not valid java name and contains not printable characters */
    public static Request.Builder m229(Object obj, Object obj2) {
        if (C0062.m9429() > 0) {
            return ((Request.Builder) obj).url((String) obj2);
        }
        return null;
    }

    /* renamed from: ۟ۡۤ۟ۢ, reason: not valid java name and contains not printable characters */
    public static Call m230(Object obj, Object obj2) {
        if (C0019.m4065() < 0) {
            return ((OkHttpClient) obj).newCall((Request) obj2);
        }
        return null;
    }

    /* renamed from: ۟ۢ۟ۧۦ, reason: not valid java name and contains not printable characters */
    public static Request.Builder m231(Object obj, Object obj2, Object obj3) {
        if (C0038.m6471() >= 0) {
            return ((Request.Builder) obj).addHeader((String) obj2, (String) obj3);
        }
        return null;
    }

    /* renamed from: ۟ۢۥۡۧ, reason: not valid java name and contains not printable characters */
    public static Request.Builder m232(Object obj) {
        if (C0000.m1116() <= 0) {
            return ((Request.Builder) obj).get();
        }
        return null;
    }

    /* renamed from: ۣۨۢ۟, reason: not valid java name and contains not printable characters */
    public static String m233(Object obj, Object obj2, Object obj3) {
        if (C0008.m1975() >= 0) {
            return AbstractC0308c.f((JsonObject) obj, (String) obj2, (String) obj3);
        }
        return null;
    }

    /* renamed from: ۤۧ۟ۨ, reason: not valid java name and contains not printable characters */
    public static short[] m234() {
        if (C0008.m1975() > 0) {
            return f36short;
        }
        return null;
    }

    /* renamed from: ۥ۟ۤۤ, reason: contains not printable characters */
    public static ResponseBody m235(Object obj) {
        if (C0058.m9131() < 0) {
            return ((Response) obj).body();
        }
        return null;
    }

    /* renamed from: ۦ۠۠ۦ, reason: contains not printable characters */
    public static String m236(Object obj) {
        if (C0030.m5375() > 0) {
            return ((ResponseBody) obj).string();
        }
        return null;
    }

    /* renamed from: ۦۣۣۨ, reason: contains not printable characters */
    public static Response m237(Object obj) {
        if (C0002.m1242() >= 0) {
            return ((Call) obj).execute();
        }
        return null;
    }

    /* renamed from: ۧۥۣۨ, reason: not valid java name and contains not printable characters */
    public static Request m238(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        if (C0037.m6350() <= 0) {
            return a.v((Request.Builder) obj, (String) obj2, (String) obj3, (String) obj4, (String) obj5);
        }
        return null;
    }

    /* renamed from: ۨ۠ۡۢ, reason: not valid java name and contains not printable characters */
    public static JsonObject m239(Object obj) {
        if (C0044.m7508() <= 0) {
            return AbstractC0308c.i((String) obj);
        }
        return null;
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        StringBuilder sb;
        String strM8625;
        String strM7833;
        ArrayList arrayList = new ArrayList();
        boolean zM9127 = C0058.m9127(C0054.m8625(this), C0042.m7151(m234(), 154, 1, 2230));
        String strM7290 = C0043.m7290(m234(), 155, 4, 2360);
        if (zM9127) {
            sb = new StringBuilder();
            strM8625 = C0054.m8625(this);
            strM7833 = C0047.m7833(m234(), 172, 13, 2189);
        } else {
            sb = new StringBuilder();
            strM8625 = C0054.m8625(this);
            strM7833 = C0022.m4403(m234(), 159, 13, 889);
        }
        C0011.m2747(sb, strM8625, strM7833, str, strM7290);
        C0018.m3933(sb, str2);
        JSONArray jSONArrayM4333 = C0021.m4333(new JSONObject(C0032.m5769(C0047.m7763(sb), C0011.m2809())), C0009.m2037(m234(), 185, 4, 870));
        for (int i = 0; i < C0053.m8396(jSONArrayM4333); i++) {
            JSONObject jSONObjectM3923 = C0018.m3923(jSONArrayM4333, i);
            C0004.m1532(arrayList, new m(C0001.m1212(jSONObjectM3923, C0055.m8814(m234(), 189, 6, 1341)), C0001.m1212(jSONObjectM3923, C0026.m4951(m234(), 195, 8, 2021)), C0001.m1212(jSONObjectM3923, C0052.m8337(m234(), 203, 7, 1288)), C0001.m1212(jSONObjectM3923, C0048.m7902(m234(), 210, 11, 588))));
        }
        return C0047.m7783(arrayList);
    }

    public String detailContent(List<String> list) {
        StringBuilder sb;
        String strM8625;
        String strM2805;
        String strM6584;
        m mVar = new m();
        char c = 0;
        String strM3446 = C0015.m3446((String) C0048.m7915(list, 0), C0029.m5256(m234(), 221, 7, 2793), C0007.m1840());
        if (C0058.m9127(C0054.m8625(this), C0030.m5362(m234(), 228, 1, 585))) {
            sb = new StringBuilder();
            strM8625 = C0054.m8625(this);
            strM2805 = C0047.m7833(m234(), 229, 15, 2007);
        } else {
            sb = new StringBuilder();
            strM8625 = C0054.m8625(this);
            strM2805 = C0011.m2805(m234(), 244, 15, 1845);
        }
        JSONObject jSONObjectM3923 = C0018.m3923(C0021.m4333(new JSONObject(C0032.m5769(C0038.m6434(sb, strM8625, strM2805, strM3446), C0011.m2809())), C0016.m3525(m234(), 259, 4, 1206)), 0);
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        String strM1212 = C0001.m1212(jSONObjectM3923, C0031.m5565(m234(), 263, 13, 1048));
        String strM3917 = C0018.m3917(m234(), 276, 6, 1534);
        String[] strArrM4752 = C0024.m4752(strM1212, strM3917);
        String[] strArrM47522 = C0024.m4752(C0001.m1212(jSONObjectM3923, C0003.m1398(m234(), 282, 12, 3048)), strM3917);
        int i = 0;
        while (true) {
            int length = strArrM4752.length;
            strM6584 = C0040.m6584(m234(), 294, 3, 732);
            if (i >= length) {
                break;
            }
            String str = strArrM4752[i];
            C0018.m3933(sb2, C0016.m3579());
            C0018.m3933(sb2, str);
            C0018.m3933(sb2, strM6584);
            i++;
        }
        int i2 = 0;
        while (true) {
            int length2 = strArrM47522.length;
            String strM5362 = C0030.m5362(m234(), 297, 8, 2080);
            if (i2 >= length2) {
                C0005.m1628(mVar, C0001.m1212(jSONObjectM3923, strM5362));
                StringBuilder sb4 = new StringBuilder();
                C0018.m3933(sb4, C0036.m6189());
                C0018.m3933(sb4, C0001.m1212(jSONObjectM3923, C0046.m7718(m234(), 310, 11, 1203)));
                C0019.m4073(mVar, C0047.m7763(sb4));
                C0027.m5000(mVar, C0001.m1212(jSONObjectM3923, C0011.m2805(m234(), 321, 11, 2885)));
                C0022.m4432(mVar, C0001.m1212(jSONObjectM3923, C0045.m7657(m234(), 332, 8, 2263)));
                C0058.m9152(mVar, C0001.m1212(jSONObjectM3923, C0064.m9599(m234(), 340, 12, 3056)));
                C0058.m9159(mVar, C0001.m1212(jSONObjectM3923, C0050.m8131(m234(), 352, 9, 3139)));
                C0026.m4947(mVar, C0001.m1212(jSONObjectM3923, C0030.m5362(m234(), 361, 7, 1188)));
                C0017.m3671(mVar, C0001.m1212(jSONObjectM3923, C0032.m5708(m234(), 368, 8, 977)));
                C0054.m8596(mVar, C0047.m7763(sb2));
                C0044.m7449(mVar, C0047.m7763(sb3));
                return C0053.m8428(mVar);
            }
            String str2 = strArrM47522[i2];
            String strM4107 = C0019.m4107(m234(), 305, 1, 3059);
            for (String str3 : C0024.m4752(str2, strM4107)) {
                String[] strArrM47523 = C0024.m4752(str3, C0056.m8911(m234(), 306, 2, 665));
                C0018.m3933(sb3, strArrM47523[c]);
                C0018.m3933(sb3, C0065.m9775(m234(), 308, 1, 2390));
                C0018.m3933(sb3, strArrM47523[1]);
                String strM6307 = C0037.m6307(m234(), 309, 1, 1416);
                StringBuilder sb5 = new StringBuilder(strM6307);
                C0018.m3933(sb5, C0001.m1212(jSONObjectM3923, strM5362));
                C0018.m3933(sb5, strM6307);
                c = 0;
                C0018.m3933(sb5, strArrM47523[0]);
                C0018.m3933(sb3, C0047.m7763(sb5));
                C0018.m3933(sb3, strM4107);
            }
            C0018.m3933(sb3, strM6584);
            i2++;
        }
    }

    public String getUrl(String str) {
        String strM9569 = C0063.m9569(C0032.m5769(C0000.m1077(m234(), 376, 40, 2930), null));
        OkHttpClient okHttpClient = new OkHttpClient();
        Request.Builder builder = new Request.Builder();
        StringBuilder sb = new StringBuilder(C0019.m4107(m234(), 416, 64, 3132));
        C0018.m3933(sb, str);
        return m236(m235(m237(m230(okHttpClient, m238(m231(m231(m232(m229(builder, C0047.m7763(sb))), C0028.m5109(m234(), 480, 10, 1663), C0044.m7509(m234(), 490, 12, 2628)), C0041.m6779(m234(), 502, 10, 1870), C0024.m4740(m234(), 512, 10, 1514)), C0019.m4107(m234(), 522, 5, 2296), strM9569, C0006.m1774(m234(), 527, 6, 1666), C0019.m4107(m234(), 533, 84, 873))))));
    }

    public String homeContent(boolean z) {
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArrayM4333 = C0021.m4333(new JSONObject(C0032.m5769(C0054.m8625(this), C0011.m2809())), C0016.m3525(m234(), 617, 5, 2750));
        for (int i = 0; i < C0053.m8396(jSONArrayM4333); i++) {
            JSONObject jSONObjectM3923 = C0018.m3923(jSONArrayM4333, i);
            String strM4340 = C0021.m4340(m234(), 622, 9, 425);
            if (!C0058.m9127(C0001.m1212(jSONObjectM3923, strM4340), C0022.m4403(m234(), 631, 1, 1885)) && !C0058.m9127(C0001.m1212(jSONObjectM3923, strM4340), C0064.m9599(m234(), 632, 1, 1902)) && !C0058.m9127(C0001.m1212(jSONObjectM3923, strM4340), C0057.m8978(m234(), 633, 1, 476))) {
                C0004.m1532(arrayList, new b(C0001.m1212(jSONObjectM3923, C0031.m5565(m234(), 634, 7, 1129)), C0001.m1212(jSONObjectM3923, strM4340), null));
                C0049.m8025(C0035.m6087(), jSONObjectM3923);
            }
        }
        return C0003.m1448(C0064.m9654(this), null, arrayList);
    }

    public void init(Context context, String str) {
        String strM2083 = str;
        C0051.m8194(C0035.m6110());
        try {
            if (C0058.m9127(strM2083, C0035.m6131(m234(), 641, 3, 2232)) && C0058.m9127(strM2083, C0047.m7833(m234(), 644, 4, 1195))) {
                strM2083 = C0009.m2083(C0009.m2083(C0032.m5769(strM2083, null)));
            }
            String[] strArrM4752 = C0024.m4752(strM2083, C0026.m4951(m234(), 648, 3, 1762));
            this.c = strArrM4752;
            this.a = strArrM4752[0];
            if (strArrM4752.length > 1) {
                C0023.m4593().a = C0044.m7497(this)[1];
                C0023.m4593().d = C0044.m7497(this)[2];
                C0023.m4593().f = C0044.m7497(this)[3];
                C0050.m8081(C0023.m4593());
                C0064.m9696(C0023.m4593());
            }
        } catch (Exception unused) {
        }
    }

    public String playerContent(String str, String str2, List<String> list) {
        C0036.m6219();
        String[] strArrM4752 = C0024.m4752(str2, C0034.m6001(m234(), 651, 1, 3133));
        String str3 = (strArrM4752.length <= 0 || C0057.m8953(strArrM4752[0])) ? null : strArrM4752[0];
        String strM2827 = C0011.m2827(str3, (strArrM4752.length <= 1 || C0057.m8953(strArrM4752[1])) ? null : strArrM4752[1], (strArrM4752.length <= 2 || C0057.m8953(strArrM4752[2])) ? null : strArrM4752[2]);
        String strM233 = m233(m239(C0047.m7850(this, str3)), C0064.m9599(m234(), 652, 3, 1997), C0007.m1840());
        StringBuilder sb = new StringBuilder(C0006.m1774(m234(), 655, 47, 3048));
        C0006.m1736(sb, C0035.m6105(C0035.m6110()));
        C0018.m3933(sb, C0019.m4107(m234(), 702, 5, 1291));
        C0018.m3933(sb, strM233);
        String strM5769 = C0032.m5769(C0047.m7763(sb), null);
        if (C0058.m9127(strM5769, C0000.m1077(m234(), 707, 4, 2364))) {
            g gVar = new g();
            C0017.m3667(gVar, strM5769);
            C0002.m1282(gVar, strM2827);
            return C0033.m5828(gVar);
        }
        g gVar2 = new g();
        C0002.m1282(gVar2, strM2827);
        C0017.m3667(gVar2, str3);
        C0064.m9646(gVar2);
        return C0033.m5828(gVar2);
    }

    public String searchContent(String str, boolean z) {
        return C0016.m3541(this, str, true, C0050.m8131(m234(), 711, 1, 2259));
    }

    public String searchContent(String str, boolean z, String str2) {
        StringBuilder sb;
        String strM8625;
        String strM5062;
        ArrayList arrayList = new ArrayList();
        boolean zM9127 = C0058.m9127(C0054.m8625(this), C0065.m9775(m234(), 712, 1, 1505));
        String strM5852 = C0033.m5852(m234(), 713, 4, 2142);
        if (zM9127) {
            sb = new StringBuilder();
            strM8625 = C0054.m8625(this);
            strM5062 = C0032.m5708(m234(), 717, 14, 2985);
        } else {
            sb = new StringBuilder();
            strM8625 = C0054.m8625(this);
            strM5062 = C0027.m5062(m234(), 731, 14, 1938);
        }
        C0011.m2747(sb, strM8625, strM5062, str, strM5852);
        C0018.m3933(sb, str2);
        JSONArray jSONArrayM4333 = C0021.m4333(new JSONObject(C0032.m5769(C0047.m7763(sb), C0011.m2809())), C0009.m2037(m234(), 745, 4, 2069));
        for (int i = 0; i < C0053.m8396(jSONArrayM4333); i++) {
            JSONObject jSONObjectM3923 = C0018.m3923(jSONArrayM4333, i);
            String strM5565 = C0031.m5565(m234(), 749, 9, 2434);
            if (!C0058.m9127(C0001.m1212(jSONObjectM3923, strM5565), C0002.m1305(m234(), 758, 1, 2430)) && !C0058.m9127(C0001.m1212(jSONObjectM3923, strM5565), C0020.m4199(m234(), 759, 1, 1683)) && !C0058.m9127(C0001.m1212(jSONObjectM3923, strM5565), C0032.m5708(m234(), 760, 1, 2756))) {
                StringBuilder sb2 = new StringBuilder(C0063.m9585(m234(), 761, 7, 1096));
                C0018.m3933(sb2, C0001.m1212(jSONObjectM3923, C0063.m9585(m234(), 768, 6, 1634)));
                String strM7763 = C0047.m7763(sb2);
                String strM1212 = C0001.m1212(jSONObjectM3923, C0028.m5109(m234(), 774, 8, 2013));
                String strM6307 = C0037.m6307(m234(), 782, 7, 2274);
                m mVar = new m(strM7763, strM1212, C0063.m9499(jSONObjectM3923, strM6307) ? C0001.m1212(jSONObjectM3923, strM6307) : C0007.m1840(), C0001.m1212(jSONObjectM3923, C0007.m1842(m234(), 789, 11, 2144)));
                C0058.m9085(mVar, C0030.m5362(m234(), 800, 3, 432));
                C0004.m1532(arrayList, mVar);
            }
        }
        return C0047.m7783(arrayList);
    }
}