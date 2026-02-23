package com.github.catvod.spider.merge.E;

import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.E0.u;
import com.github.catvod.spider.merge.E0.v;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.J0.C0021;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.N.C0023;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.T0.r;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.V0.o;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.Z.C0040;
import com.github.catvod.spider.merge.Z0.C0041;
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
import com.github.catvod.spider.merge.t.C0061;
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
import com.github.catvod.spider.p000mergexbpq.c0.C0010;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import com.github.catvod.spider.p000mergexbpq.x.C0015;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class l implements o {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f391short = {1387, 1288, 1488, 272, 285, 294, 3062, 2992, 2988, 2997, 2996, 2678, 1648, 2331, 1725, 1726, 2978, 3006, 3006, 3002, 3001, 3056, 3045, 3045, 2981, 3002, 2991, 2980, 2987, 3002, 2979, 3044, 2995, 2981, 3007, 2977, 3007, 3044, 2985, 2981, 2983, 3045, 3004, 3064, 3045, 3004, 2979, 2990, 2991, 2981, 3001, 3045, 3001, 2978, 2981, 3005, 3044, 2976, 3001, 2981, 2980, 3061, 2985, 2982, 2979, 2991, 2980, 3006, 2965, 2979, 2990, 3063, 3071, 3065, 2991, 3068, 2985, 2985, 3068, 3069, 3064, 3065, 3069, 2988, 2985, 3071, 3059, 2987, 3052, 3004, 2979, 2990, 2991, 2981, 2965, 2979, 2990, 3063, 2047, 1961, 1976, 1978, 1970, 1976, 1982, 1980, 2020, 1978, 1974, 1972, 2039, 1969, 1964, 1976, 1966, 1980, 1968, 2039, 1969, 1966, 1967, 1961, 1973, 1976, 1952, 1980, 1963, 2039, 1952, 1974, 1964, 1970, 1964, 2047, 1980, 1953, 1965, 2020, 1962, 1969, 1974, 1966, 813, 815, 830, 1968, 1942, 1920, 1943, 1992, 1956, 1922, 1920, 1931, 1937, 2684, 2654, 2635, 2648, 2653, 2653, 2640, 2590, 2564, 2591, 2561, 2577, 2585, 2662, 2648, 2655, 2645, 2654, 2630, 2626, 2577, 2687, 2661, 2577, 2560, 2561, 2591, 2561, 2570, 2577, 2662, 2648, 2655, 2567, 2565, 2570, 2577, 2633, 2567, 2565, 2584, 2577, 2672, 2625, 2625, 2653, 2644, 2662, 2644, 2643, 2682, 2648, 2629, 2590, 2564, 2562, 2566, 2591, 2562, 2567, 2577, 2585, 2682, 2681, 2661, 2684, 2685, 2589, 2577, 2653, 2648, 2650, 2644, 2577, 2678, 2644, 2642, 2650, 2654, 2584, 2577, 2674, 2649, 2627, 2654, 2652, 2644, 2590, 2560, 2563, 2562, 2591, 2561, 2591, 2561, 2591, 2561, 2577, 2658, 2640, 2647, 2640, 2627, 2648, 2590, 2564, 2562, 2566, 2591, 2562, 2567, 2378, 2395, 2396, 2383, 2394, 2375, 2369, 2368, 1169, 1191, 1213, 1187, 1213, 1164, 1193, 1190, 1189, 1213, 1166, 1197, 1212, 1195, 1184, 1197, 1210, 2347, 2332, 2332, 2305, 2332, 2382, 2313, 2315, 2330, 2330, 2311, 2304, 2313, 2382, 2314, 2331, 2332, 2319, 2330, 2311, 2305, 2304, 2225, 2278, 2295, 2282, 2278, 1352, 1302, 1360, 1309, 926, 1822, 1822, 1822, 2821, 1135, 1140, 1728, 1782, 1789, 1783, 1786, 1789, 1780, 1715, 1776, 1788, 1788, 1784, 1786, 1782, 1760, 1705, 1715, 856, 878, 884, 874, 884, 837, 864, 879, 876, 884, 839, 868, 885, 866, 873, 868, 883, 1509, 1529, 1529, 1533, 1534, 1463, 1442, 1442, 1505, 1506, 1514, 1443, 1504, 1504, 1534, 1529, 1516, 1529, 1443, 1518, 1506, 1504, 1442, 1512, 1514, 1443, 1511, 1534, 1178, 1176, 1161, 2675, 2645, 2627, 2644, 2571, 2663, 2625, 2627, 2632, 2642, 964, 998, 1011, 992, 997, 997, 1000, 934, 956, 935, 953, 937, 929, 990, 992, 999, 1005, 998, 1022, 1018, 937, 967, 989, 937, 952, 953, 935, 953, 946, 937, 990, 992, 999, 959, 957, 946, 937, 1009, 959, 957, 928, 937, 968, 1017, 1017, 997, 1004, 990, 1004, 1003, 962, 992, 1021, 934, 956, 954, 958, 935, 954, 959, 937, 929, 962, 961, 989, 964, 965, 933, 937, 997, 992, 994, 1004, 937, 974, 1004, 1002, 994, 998, 928, 937, 970, 993, 1019, 998, 996, 1004, 934, 952, 955, 954, 935, 953, 935, 953, 935, 953, 937, 986, 1000, 1007, 1000, 1019, 992, 934, 956, 954, 958, 935, 954, 959, 1502, 1474, 1474, 1478, 1477, 1420, 1433, 1433, 1495, 1493, 1477, 1432, 1487, 1497, 1475, 1501, 1475, 1432, 1493, 1497, 1499, 1433, 1502, 1411, 1433, 1499, 1474, 1497, 1478, 1432, 1493, 1497, 1499, 1432, 1487, 1497, 1475, 1501, 1475, 1432, 1495, 1478, 1498, 1495, 1474, 1488, 1497, 1476, 1499, 1432, 1473, 1491, 1495, 1501, 1489, 1491, 1474, 1433, 1415, 1432, 1414, 1433, 1417, 1500, 1477, 1472, 1419, 1412, 1432, 1411, 1432, 1415, 1424, 1495, 1478, 1478, 1533, 1491, 1487, 1419, 1412, 1410, 1408, 1409, 1423, 1409, 1422, 1422, 2643, 2641, 2624, 3087, 3113, 3135, 3112, 3191, 3099, 3133, 3135, 3124, 3118, 1108, 1142, 1123, 1136, 1141, 1141, 1144, 1078, 1068, 1079, 1065, 1081, 1073, 1102, 1136, 1143, 1149, 1142, 1134, 1130, 1081, 1111, 1101, 1081, 1064, 1065, 1079, 1065, 1058, 1081, 1102, 1136, 1143, 1071, 1069, 1058, 1081, 1121, 1071, 1069, 1072, 1081, 1112, 1129, 1129, 1141, 1148, 1102, 1148, 1147, 1106, 1136, 1133, 1078, 1068, 1066, 1070, 1079, 1066, 1071, 1081, 1073, 1106, 1105, 1101, 1108, 1109, 1077, 1081, 1141, 1136, 1138, 1148, 1081, 1118, 1148, 1146, 1138, 1142, 1072, 1081, 1114, 1137, 1131, 1142, 1140, 1148, 1078, 1064, 1067, 1066, 1079, 1065, 1079, 1065, 1079, 1065, 1081, 1098, 1144, 1151, 1144, 1131, 1136, 1078, 1068, 1066, 1070, 1079, 1066, 1071, 2115, 2159, 2159, 2155, 2153, 2149, 1409, 1412, 1425, 1412, 3282, 3269, 3283, 3285, 3276, 3284, 680, 676, 687, 686, 3203, 3231, 1807, 1811, 1822, 1798, 1822, 1803, 3113, 3109, 3108, 3134, 3119, 3108, 3134, 3096, 3075, 3085, 3074, 3102, 2413, 2410, 2411, 2411, 2411, 2414, 2413, 2409, 2926, 2927, 2455, 2465, 2480, 2537, 2439, 2475, 2475, 2479, 2477, 2465, 969, 1694, 882, 832, 855, 836, 837, 769, 834, 846, 846, 842, 840, 836, 795, 769, 1594, 1548, 1558, 1544, 1558, 1575, 1538, 1549, 1550, 1558, 1573, 1542, 1559, 1536, 1547, 1542, 1553, 1492, 3305, 3322};
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public l(int i) {
        this.a = i;
        switch (i) {
            case 3:
                this.b = new HashMap();
                this.c = new JSONArray();
                break;
            default:
                this.b = new ArrayList();
                this.c = new ArrayList();
                break;
        }
    }

    public l(com.github.catvod.spider.merge.G0.b bVar, u uVar) {
        this.a = 1;
        this.b = bVar;
        this.c = uVar;
    }

    public l(StringBuilder sb, com.github.catvod.spider.merge.T0.g gVar) {
        this.a = 2;
        this.b = sb;
        this.c = gVar;
        C0056.m8862(gVar);
    }

    public static String f(String str) {
        String strM8131 = C0050.m8131(m3773(), 0, 2, 1335);
        String str2 = C0024.m4752(str, strM8131)[0];
        String strM4536 = C0023.m4536(m3773(), 2, 1, 1535);
        int length = C0024.m4752(str2, strM4536).length;
        String strM1840 = C0007.m1840();
        return length > 0 ? C0024.m4752(C0015.m3446(C0024.m4752(C0024.m4752(str, strM8131)[0], strM4536)[C0024.m4752(C0024.m4752(str, strM8131)[0], strM4536).length - 1], C0065.m9775(m3773(), 3, 3, 377), strM1840), C0019.m4107(m3773(), 6, 5, 3032))[0] : strM1840;
    }

    public static String h(com.github.catvod.spider.merge.G0.d dVar) {
        StringBuilder sbM3016;
        int iM6118 = C0035.m6118(dVar);
        StringBuilder sb = new StringBuilder();
        boolean zM6074 = C0035.m6074(dVar);
        String strM1840 = C0007.m1840();
        C0018.m3933(sb, zM6074 ? C0044.m7509(m3773(), 11, 1, 2636) : strM1840);
        C0018.m3933(sb, C0027.m5062(m3773(), 12, 1, 1539));
        C0036.m6177(sb, iM6118);
        if (C0055.m8735(dVar)) {
            strM1840 = C0012.m2973(m3773(), 13, 1, 2373);
        }
        C0018.m3933(sb, strM1840);
        String strM7763 = C0047.m7763(sb);
        if (!C0035.m6074(dVar)) {
            return strM7763;
        }
        com.github.catvod.spider.merge.G0.c[] cVarArrM5193 = C0028.m5193(dVar);
        String strM8131 = C0050.m8131(m3773(), 14, 2, 1664);
        if (cVarArrM5193 != null) {
            sbM3016 = C0012.m3016(strM7763, strM8131);
            C0018.m3933(sbM3016, C0055.m8714(C0028.m5193(dVar)));
        } else {
            sbM3016 = C0012.m3016(strM7763, strM8131);
            C0036.m6177(sbM3016, C0054.m8634(dVar));
        }
        return C0047.m7763(sbM3016);
    }

    public static int j(String str) throws Throwable {
        HttpURLConnection httpURLConnection = null;
        try {
            try {
                StringBuilder sb = new StringBuilder(C0047.m7833(m3773(), 16, 82, 3018));
                C0018.m3933(sb, str);
                C0018.m3933(sb, C0038.m6452(m3773(), 98, 44, 2009));
                HttpURLConnection httpURLConnection2 = (HttpURLConnection) C0018.m3955(new URL(C0047.m7763(sb)));
                try {
                    C0005.m1655(httpURLConnection2, C0000.m1077(m3773(), 142, 3, 874));
                    C0017.m3641(httpURLConnection2, C0057.m8978(m3773(), 145, 10, 2021), C0057.m8978(m3773(), 155, 111, 2609));
                    int iM5075 = C0027.m5075(new JSONObject(C0045.m7641(C0057.m9040(httpURLConnection2))), C0032.m5708(m3773(), 266, 8, 2350), 0);
                    C0005.m1669(httpURLConnection2);
                    return iM5075;
                } catch (Exception e) {
                    httpURLConnection = httpURLConnection2;
                    C0045.m7657(m3773(), 274, 17, 1224);
                    C0056.m8911(m3773(), 291, 22, 2414);
                    if (httpURLConnection != null) {
                        C0005.m1669(httpURLConnection);
                    }
                    return 0;
                } catch (Throwable th) {
                    th = th;
                    httpURLConnection = httpURLConnection2;
                    if (httpURLConnection != null) {
                        C0005.m1669(httpURLConnection);
                    }
                    throw th;
                }
            } catch (Exception e2) {
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static String l(InputStream inputStream) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        StringBuilder sb = new StringBuilder();
        while (true) {
            String strM4438 = C0022.m4438(bufferedReader);
            if (strM4438 == null) {
                return C0047.m7763(sb);
            }
            C0018.m3933(sb, strM4438);
        }
    }

    /* renamed from: ۦۤۤۨ, reason: contains not printable characters */
    public static short[] m3773() {
        if (C0041.m6823() <= 0) {
            return f391short;
        }
        return null;
    }

    @Override // com.github.catvod.spider.merge.V0.o
    public void a(r rVar, int i) {
        try {
            C0022.m4496(rVar, (Appendable) C0000.m1047(this), i, (com.github.catvod.spider.merge.T0.g) C0056.m8924(this));
        } catch (IOException e) {
            throw new com.github.catvod.spider.merge.Q0.a(e);
        }
    }

    @Override // com.github.catvod.spider.merge.V0.o
    public void b(r rVar, int i) {
        if (C0007.m1815(C0041.m6776(rVar), C0002.m1305(m3773(), 313, 5, 2194))) {
            return;
        }
        try {
            C0007.m1850(rVar, (Appendable) C0000.m1047(this), i, (com.github.catvod.spider.merge.T0.g) C0056.m8924(this));
        } catch (IOException e) {
            throw new com.github.catvod.spider.merge.Q0.a(e);
        }
    }

    public void c(String str, ArrayList arrayList) {
        C0004.m1532((ArrayList) C0000.m1047(this), str);
        ArrayList arrayList2 = (ArrayList) C0056.m8924(this);
        ArrayList arrayList3 = new ArrayList();
        Iterator itM7816 = C0047.m7816(arrayList);
        while (C0012.m2962(itM7816)) {
            k kVar = (k) C0048.m7949(itM7816);
            StringBuilder sb = new StringBuilder();
            C0018.m3933(sb, C0015.m3446(C0001.m1182(kVar), C0044.m7509(m3773(), 318, 4, 1317), C0007.m1840()));
            C0062.m9399(sb, '$');
            C0018.m3933(sb, C0003.m1442(kVar));
            C0004.m1532(arrayList3, C0047.m7763(sb));
        }
        StringBuilder sb2 = new StringBuilder();
        Iterator itM78162 = C0047.m7816(arrayList3);
        if (C0012.m2962(itM78162)) {
            while (true) {
                C0056.m8896(sb2, (CharSequence) C0048.m7949(itM78162));
                if (!C0012.m2962(itM78162)) {
                    break;
                } else {
                    C0056.m8896(sb2, C0028.m5109(m3773(), 322, 1, 957));
                }
            }
        }
        C0004.m1532(arrayList2, C0047.m7763(sb2));
    }

    public j d() {
        j jVar = new j(0);
        ArrayList arrayList = (ArrayList) C0000.m1047(this);
        StringBuilder sb = new StringBuilder();
        Iterator itM7816 = C0047.m7816(arrayList);
        boolean zM2962 = C0012.m2962(itM7816);
        String strM4795 = C0025.m4795(m3773(), 323, 3, 1850);
        if (zM2962) {
            while (true) {
                C0056.m8896(sb, (CharSequence) C0048.m7949(itM7816));
                if (!C0012.m2962(itM7816)) {
                    break;
                }
                C0056.m8896(sb, strM4795);
            }
        }
        jVar.b = C0047.m7763(sb);
        ArrayList arrayList2 = (ArrayList) C0056.m8924(this);
        StringBuilder sb2 = new StringBuilder();
        Iterator itM78162 = C0047.m7816(arrayList2);
        if (C0012.m2962(itM78162)) {
            while (true) {
                C0056.m8896(sb2, (CharSequence) C0048.m7949(itM78162));
                if (!C0012.m2962(itM78162)) {
                    break;
                }
                C0056.m8896(sb2, strM4795);
            }
        }
        jVar.c = C0047.m7763(sb2);
        return jVar;
    }

    public String e() {
        StringBuilder sb = new StringBuilder();
        Iterator itM5199 = C0029.m5199(C0043.m7267((HashMap) C0000.m1047(this)));
        while (C0012.m2962(itM5199)) {
            Map.Entry entry = (Map.Entry) C0048.m7949(itM5199);
            C0018.m3933(sb, (String) C0045.m7624(entry));
            C0018.m3933(sb, C0051.m8259(m3773(), 326, 1, 2872));
            C0018.m3933(sb, (String) C0039.m6540(entry));
            C0018.m3933(sb, C0013.m3106(m3773(), 327, 2, 1108));
        }
        String strM7763 = C0047.m7763(sb);
        StringBuilder sb2 = new StringBuilder(C0065.m9775(m3773(), 329, 17, 1683));
        C0018.m3933(sb2, strM7763);
        C0047.m7763(sb2);
        C0025.m4795(m3773(), 346, 17, 769);
        return strM7763;
    }

    public void g() {
        HttpURLConnection httpURLConnection;
        Throwable th;
        try {
            httpURLConnection = (HttpURLConnection) C0018.m3955(new URL(C0013.m3106(m3773(), 363, 28, 1421)));
            try {
                C0005.m1655(httpURLConnection, C0045.m7657(m3773(), 391, 3, 1245));
                C0017.m3641(httpURLConnection, C0041.m6779(m3773(), 394, 10, 2598), C0061.m9361(m3773(), 404, 111, 905));
                C0010.m2315(this, httpURLConnection);
                C0008.m1955(C0057.m9040(httpURLConnection));
                C0005.m1669(httpURLConnection);
            } catch (Throwable th2) {
                th = th2;
                if (httpURLConnection != null) {
                    C0005.m1669(httpURLConnection);
                }
                throw th;
            }
        } catch (Throwable th3) {
            httpURLConnection = null;
            th = th3;
        }
    }

    public void i() {
        HttpURLConnection httpURLConnection;
        Throwable th;
        try {
            httpURLConnection = (HttpURLConnection) C0018.m3955(new URL(C0032.m5708(m3773(), 515, 88, 1462)));
        } catch (Throwable th2) {
            httpURLConnection = null;
            th = th2;
        }
        try {
            C0005.m1655(httpURLConnection, C0041.m6779(m3773(), 603, 3, 2580));
            C0017.m3641(httpURLConnection, C0034.m6001(m3773(), 606, 10, 3162), C0048.m7902(m3773(), 616, 111, 1049));
            C0017.m3641(httpURLConnection, C0028.m5109(m3773(), 727, 6, 2048), C0053.m8438(this));
            C0010.m2315(this, httpURLConnection);
            C0008.m1955(C0057.m9040(httpURLConnection));
            C0005.m1669(httpURLConnection);
        } catch (Throwable th3) {
            th = th3;
            if (httpURLConnection != null) {
                C0005.m1669(httpURLConnection);
            }
            throw th;
        }
    }

    public void k(JSONObject jSONObject) {
        String strM3917 = C0018.m3917(m3773(), 733, 4, 1509);
        if (C0063.m9499(jSONObject, strM3917)) {
            JSONObject jSONObjectM1370 = C0003.m1370(jSONObject, strM3917);
            String strM8978 = C0057.m8978(m3773(), 737, 6, 3232);
            if (C0063.m9499(jSONObjectM1370, strM8978)) {
                JSONObject jSONObject2 = new JSONObject(C0001.m1212(jSONObjectM1370, strM8978));
                String strM1774 = C0006.m1774(m3773(), 743, 4, 715);
                String strM1398 = C0003.m1398(m3773(), 747, 2, 3246);
                if (C0007.m1815(C0009.m2054(jSONObject2, strM1774, strM1398), strM1398)) {
                    return;
                }
                JSONArray jSONArrayM4333 = C0021.m4333(C0003.m1370(jSONObject2, strM3917), strM8978);
                for (int i = 0; i < C0053.m8396(jSONArrayM4333); i++) {
                    JSONObject jSONObjectM3923 = C0018.m3923(jSONArrayM4333, i);
                    long jM6483 = C0039.m6483(jSONObjectM3923, C0015.m3484(m3773(), 749, 6, 1919));
                    String strM2054 = C0009.m2054(jSONObjectM3923, C0058.m9106(m3773(), 755, 7, 3146), C0007.m1840());
                    JSONArray jSONArray = new JSONArray();
                    double d = jM6483;
                    C0004.m1564(d);
                    C0040.m6670(jSONArray, d / 1000.0d);
                    C0044.m7459(jSONArray, C0052.m8337(m3773(), 762, 5, 3178));
                    C0044.m7459(jSONArray, C0052.m8337(m3773(), 767, 8, 2396));
                    C0044.m7459(jSONArray, C0029.m5256(m3773(), 775, 2, 2909));
                    C0044.m7459(jSONArray, strM2054);
                    C0044.m7459((JSONArray) C0056.m8924(this), jSONArray);
                }
            }
        }
    }

    public void m(HttpURLConnection httpURLConnection) {
        Map mapM4865 = C0025.m4865(httpURLConnection);
        ArrayList arrayList = new ArrayList();
        Iterator itM5199 = C0029.m5199(C0058.m9142(mapM4865));
        while (C0012.m2962(itM5199)) {
            Map.Entry entry = (Map.Entry) C0048.m7949(itM5199);
            if (C0000.m1057(C0052.m8337(m3773(), 777, 10, 2500), (String) C0045.m7624(entry))) {
                C0034.m6012(arrayList, (Collection) C0039.m6540(entry));
            }
        }
        Iterator itM7816 = C0047.m7816(arrayList);
        while (C0012.m2962(itM7816)) {
            String[] strArrM4752 = C0024.m4752((String) C0048.m7949(itM7816), C0049.m8007(m3773(), 787, 1, 1010));
            if (strArrM4752.length > 0) {
                String str = strArrM4752[0];
                String strM1189 = C0001.m1189(m3773(), 788, 1, 1699);
                String[] strArrM1240 = C0002.m1240(str, strM1189, 2);
                if (strArrM1240.length == 2) {
                    String strM9640 = C0064.m9640(strArrM1240[0]);
                    String strM96402 = C0064.m9640(strArrM1240[1]);
                    C0053.m8424((HashMap) C0000.m1047(this), strM9640, strM96402);
                    StringBuilder sb = new StringBuilder(C0047.m7833(m3773(), 789, 14, 801));
                    C0018.m3933(sb, strM9640);
                    C0018.m3933(sb, strM1189);
                    C0018.m3933(sb, strM96402);
                    C0047.m7763(sb);
                    C0002.m1305(m3773(), 803, 17, 1635);
                }
            }
        }
    }

    public String toString() {
        switch (C0019.m4079(this)) {
            case 1:
                if (C0049.m7987((com.github.catvod.spider.merge.G0.b) C0000.m1047(this)) == null) {
                    return null;
                }
                StringBuilder sb = new StringBuilder();
                com.github.catvod.spider.merge.G0.b bVar = (com.github.catvod.spider.merge.G0.b) C0000.m1047(this);
                C0047.m7777(bVar);
                ArrayList arrayList = new ArrayList(C0000.m1121(C0041.m6803(bVar)));
                C0027.m5077(arrayList, new com.github.catvod.spider.merge.G0.a());
                Iterator itM7816 = C0047.m7816(arrayList);
                while (C0012.m2962(itM7816)) {
                    com.github.catvod.spider.merge.G0.d dVar = (com.github.catvod.spider.merge.G0.d) C0048.m7949(itM7816);
                    com.github.catvod.spider.merge.G0.d[] dVarArrM8278 = C0051.m8278(dVar);
                    int length = dVarArrM8278 != null ? dVarArrM8278.length : 0;
                    for (int i = 0; i < length; i++) {
                        com.github.catvod.spider.merge.G0.d dVar2 = C0051.m8278(dVar)[i];
                        if (dVar2 != null && C0035.m6118(dVar2) != Integer.MAX_VALUE) {
                            C0018.m3933(sb, C0034.m5954(dVar));
                            String strM3714 = C0017.m3714((v) ((u) C0056.m8924(this)), i - 1);
                            C0018.m3933(sb, C0019.m4107(m3773(), 820, 1, 1529));
                            C0018.m3933(sb, strM3714);
                            C0018.m3933(sb, C0017.m3646(m3773(), 821, 2, 3268));
                            C0018.m3933(sb, C0034.m5954(dVar2));
                            C0062.m9399(sb, '\n');
                        }
                    }
                }
                String strM7763 = C0047.m7763(sb);
                if (C0004.m1584(strM7763) == 0) {
                    return null;
                }
                return strM7763;
            default:
                return super.toString();
        }
    }
}