package com.github.catvod.spider;

import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.C.C0017;
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
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.T0.h;
import com.github.catvod.spider.merge.T0.m;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.V0.d;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.a0.C0042;
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
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.r0.C0060;
import com.github.catvod.spider.merge.t.C0061;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.merge.z.C0065;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.c0.C0010;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
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
public class Kugou extends Spider {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f82short = {2159, 2127, 2230, 2228, 2209, 2224, 2204, 2225, 1625, 1605, 1605, 1601, 1602, 1547, 1566, 1566, 1606, 1606, 1606, 1567, 1626, 1604, 1622, 1630, 1604, 1567, 1618, 1630, 1628, 1566, 1608, 1608, 1566, 1603, 1616, 1631, 1626, 1566, 1625, 1630, 1628, 1620, 1566, 1536, 1564, 1090, 1028, 1048, 1025, 1024, 1107, 1034, 1054, 1027, 1025, 1105, 1054, 1037, 1026, 1031, 1625, 1663, 1641, 1662, 1569, 1613, 1643, 1641, 1634, 1656, 1572, 1542, 1555, 1536, 1541, 1541, 1544, 1606, 1628, 1607, 1625, 1609, 1601, 1598, 1536, 1543, 1549, 1542, 1566, 1562, 1609, 1575, 1597, 1609, 1624, 1625, 1607, 1625, 1618, 1609, 1598, 1536, 1543, 1631, 1629, 1618, 1609, 1553, 1631, 1629, 1600, 1609, 1576, 1561, 1561, 1541, 1548, 1598, 1548, 1547, 1570, 1536, 1565, 1606, 1628, 1626, 1630, 1607, 1626, 1631, 1609, 1601, 1570, 1569, 1597, 1572, 1573, 1605, 1609, 1541, 1536, 1538, 1548, 1609, 1582, 1548, 1546, 1538, 1542, 1600, 1609, 1578, 1537, 1563, 1542, 1540, 1548, 1606, 1624, 1627, 1627, 1607, 1625, 1607, 1625, 1607, 1625, 1609, 1594, 1544, 1551, 1544, 1563, 1536, 1606, 1628, 1626, 1630, 1607, 1626, 1631, 2041, 1959, 1972, 1928, 1957, 1974, 1977, 1980, 1928, 1956, 1982, 1971, 1970, 1973, 1974, 1957, 3185, 3176, 3108, 3176, 3181, 3108, 3173, 3272, 3282, 3269, 3270, 2197, 2184, 2197, 2189, 2180, 1906, 1899, 1888, 1883, 1901, 1888, 2156, 2165, 2174, 2117, 2164, 2171, 2167, 2175, 1567, 1540, 1567, 1546, 1543, 2311, 2326, 2320, 2322, 2324, 2328, 2306, 2329, 2307, 2165, 2160, 2154, 2157, 2635, 2669, 2683, 2668, 2611, 2655, 2681, 2683, 2672, 2666, 285, 319, 298, 313, 316, 316, 305, 383, 357, 382, 352, 368, 376, 263, 313, 318, 308, 319, 295, 291, 368, 286, 260, 368, 353, 352, 382, 352, 363, 368, 263, 313, 318, 358, 356, 363, 368, 296, 358, 356, 377, 368, 273, 288, 288, 316, 309, 263, 309, 306, 283, 313, 292, 383, 357, 355, 359, 382, 355, 358, 368, 376, 283, 280, 260, 285, 284, 380, 368, 316, 313, 315, 309, 368, 279, 309, 307, 315, 319, 377, 368, 275, 312, 290, 319, 317, 309, 383, 353, 354, 354, 382, 352, 382, 352, 382, 352, 368, 259, 305, 310, 305, 290, 313, 383, 357, 355, 359, 382, 355, 358, 2747, 2789, 2806, 2762, 2785, 2800, 2808, 2789, 2762, 2790, 2810, 2811, 2802, 2809, 2812, 2790, 2785, 2741, 2784, 2809, 2741, 2809, 2812, 2963, 3036, 2946, 2961, 2989, 2950, 2967, 2975, 2946, 2989, 2945, 2973, 2972, 2965, 2972, 2963, 2975, 2967, 2795, 2801, 2790, 2789, 2043, 2531, 2493, 2478, 2450, 2489, 2472, 2464, 2493, 2450, 2489, 2468, 2489, 2465, 2472, 2541, 2469, 2558, 3099, 3143, 3156, 3163, 3166, 3178, 3136, 3141, 3153, 3156, 3137, 3152, 2795, 2344, 2320, 2325, 2332, 2823, 2823, 2823, 2823, 2893, 2817, 2670, 2670, 2668, 2667, 2671, 2593, 2668, 1288, 1290, 1284, 1293, 1344, 1294, 31376, -24683, 25569, 22824, 29732, -31697, -28242, 18445, 28609, 22691, 32200, 24663, 1335, 1297, 1287, 1296, 1359, 1315, 1285, 1287, 1292, 1302, 2651, 2681, 2668, 2687, 2682, 2682, 2679, 2617, 2595, 2616, 2598, 2614, 2622, 2625, 2687, 2680, 2674, 2681, 2657, 2661, 2614, 2648, 2626, 2614, 2599, 2598, 2616, 2598, 2605, 2614, 2625, 2687, 2680, 2592, 2594, 2605, 2614, 2670, 2592, 2594, 2623, 2614, 2647, 2662, 2662, 2682, 2675, 2625, 2675, 2676, 2653, 2687, 2658, 2617, 2595, 2597, 2593, 2616, 2597, 2592, 2614, 2622, 2653, 2654, 2626, 2651, 2650, 2618, 2614, 2682, 2687, 2685, 2675, 2614, 2641, 2675, 2677, 2685, 2681, 2623, 2614, 2645, 2686, 2660, 2681, 2683, 2675, 2617, 2599, 2596, 2596, 2616, 2598, 2616, 2598, 2616, 2598, 2614, 2629, 2679, 2672, 2679, 2660, 2687, 2617, 2595, 2597, 2593, 2616, 2597, 2592};

    /* renamed from: ۟ۥۥۡۢ, reason: not valid java name and contains not printable characters */
    public static short[] m468() {
        if (C0045.m7538() <= 0) {
            return f82short;
        }
        return null;
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        HashMap map2 = new HashMap();
        if (map != null && C0014.m3311(map) > 0) {
            C0018.m3979(map2, map);
        }
        String[] strArrM4752 = C0024.m4752(str, C0026.m4951(m468(), 0, 2, 2099));
        String str3 = strArrM4752[0];
        int iM6456 = C0038.m6456(strArrM4752[1]);
        String strM2973 = C0012.m2973(m468(), 2, 6, 2261);
        if (C0065.m9715(map2, strM2973) != null) {
            str3 = (String) C0065.m9715(map2, strM2973);
        }
        String strM1130 = C0000.m1130(C0036.m6188(m468(), 8, 37, 1585), str3, C0013.m3106(m468(), 45, 15, 1132));
        HashMap map3 = new HashMap();
        C0053.m8424(map3, C0060.m9352(m468(), 60, 10, 1548), C0050.m8131(m468(), 70, 111, 1641));
        d dVarM6459 = C0038.m6459(C0052.m8317(C0030.m5333(C0016.m3577(C0032.m5769(strM1130, map3)), C0062.m9389(m468(), 181, 16, 2007)), iM6456), C0050.m8131(m468(), 197, 7, 3076));
        JSONArray jSONArray = new JSONArray();
        Iterator itM7807 = C0047.m7807(dVarM6459);
        while (C0012.m2962(itM7807)) {
            m mVar = (m) C0048.m7949(itM7807);
            String strM2339 = C0010.m2339(mVar, C0008.m1970(m468(), 204, 4, 3232));
            C0044.m7459(jSONArray, C0047.m7743(C0047.m7743(new JSONObject(), C0018.m3917(m468(), 213, 6, 1796), strM2339), C0048.m7902(m468(), 219, 8, 2074), C0010.m2339(mVar, C0021.m4340(m468(), 208, 5, 2273))));
        }
        return C0004.m1539(C0047.m7743(C0037.m6360(C0037.m6360(new JSONObject(), C0000.m1077(m468(), 227, 5, 1643), C0009.m2095(dVarM6459)), C0044.m7509(m468(), 232, 9, 2423), 1), C0058.m9106(m468(), 241, 4, 2073), jSONArray));
    }

    public String detailContent(List<String> list) {
        String str = (String) C0048.m7915(list, 0);
        HashMap map = new HashMap();
        C0053.m8424(map, C0061.m9361(m468(), 245, 10, 2590), C0007.m1842(m468(), 255, 111, 336));
        h hVarM3577 = C0016.m3577(C0032.m5769(str, map));
        d dVarM5333 = C0030.m5333(hVarM3577, C0042.m7151(m468(), 366, 23, 2709));
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < C0009.m2095(dVarM5333); i++) {
            m mVar = (m) C0028.m5161(dVarM5333, i);
            String strM8259 = C0051.m8259(m468(), 389, 18, 3058);
            String strM8058 = C0049.m8058(C0030.m5333(mVar, strM8259), C0020.m4199(m468(), 407, 4, 2691));
            String strM4684 = C0024.m4684(C0030.m5333(mVar, strM8259));
            StringBuilder sb = new StringBuilder();
            C0018.m3933(sb, strM4684);
            C0018.m3933(sb, C0021.m4340(m468(), 411, 1, 2015));
            C0018.m3933(sb, strM8058);
            C0004.m1532(arrayList, C0047.m7763(sb));
        }
        String strM46842 = C0024.m4684(C0030.m5333(hVarM3577, C0019.m4107(m468(), 412, 17, 2509)));
        String strM46843 = C0024.m4684(C0030.m5333(hVarM3577, C0003.m1398(m468(), 429, 12, 3125)));
        String strM6194 = C0036.m6194(C0020.m4199(m468(), 441, 1, 2760), arrayList);
        com.github.catvod.spider.merge.E.m mVar2 = new com.github.catvod.spider.merge.E.m();
        C0011.m2828(mVar2, (String) C0048.m7915(list, 0));
        C0005.m1628(mVar2, strM46842);
        C0019.m4073(mVar2, strM46843);
        C0054.m8596(mVar2, C0019.m4107(m468(), 442, 4, 2425));
        C0044.m7449(mVar2, strM6194);
        return C0053.m8428(mVar2);
    }

    public String homeContent(boolean z) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        List listM1203 = C0001.m1203(new String[]{C0017.m3646(m468(), 446, 6, 2865), C0054.m8574(m468(), 452, 7, 2653), C0010.m2300(m468(), 459, 6, 1340)});
        List listM12032 = C0001.m1203(new String[]{C0022.m4403(m468(), 465, 4, 2685), C0062.m9389(m468(), 469, 5, 1629), C0051.m8259(m468(), 474, 3, 2507)});
        for (int i = 0; i < C0064.m9636(listM1203); i++) {
            C0004.m1532(arrayList, new b((String) C0048.m7915(listM1203, i), (String) C0048.m7915(listM12032, i), null));
        }
        return C0025.m4831(arrayList, arrayList2);
    }

    public String playerContent(String str, String str2, List<String> list) {
        g gVar = new g();
        C0017.m3667(gVar, str2);
        C0038.m6396(gVar);
        HashMap map = new HashMap();
        C0053.m8424(map, C0025.m4795(m468(), 477, 10, 1378), C0032.m5708(m468(), 487, 111, 2582));
        C0057.m9029(gVar, map);
        return C0033.m5828(gVar);
    }
}