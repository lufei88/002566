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
import com.github.catvod.spider.merge.N.C0023;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.T0.h;
import com.github.catvod.spider.merge.T0.m;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.V0.d;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.Z.C0040;
import com.github.catvod.spider.merge.Z0.C0041;
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
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.r0.C0060;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.merge.z.C0065;
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
import com.github.catvod.spider.p000mergexbpq.r.C0014;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class FirstAid extends Spider {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f21short = {986, 1020, 1002, 1021, 930, 974, 1000, 1002, 993, 1019, 1458, 1424, 1413, 1430, 1427, 1427, 1438, 1488, 1482, 1489, 1487, 1503, 1495, 1448, 1430, 1425, 1435, 1424, 1416, 1420, 1503, 1457, 1451, 1503, 1486, 1487, 1489, 1487, 1476, 1503, 1448, 1430, 1425, 1481, 1483, 1476, 1503, 1415, 1481, 1483, 1494, 1503, 1470, 1423, 1423, 1427, 1434, 1448, 1434, 1437, 1460, 1430, 1419, 1488, 1482, 1484, 1480, 1489, 1484, 1481, 1503, 1495, 1460, 1463, 1451, 1458, 1459, 1491, 1503, 1427, 1430, 1428, 1434, 1503, 1464, 1434, 1436, 1428, 1424, 1494, 1503, 1468, 1431, 1421, 1424, 1426, 1434, 1488, 1486, 1485, 1485, 1489, 1487, 1489, 1487, 1489, 1487, 1503, 1452, 1438, 1433, 1438, 1421, 1430, 1488, 1482, 1484, 1480, 1489, 1484, 1481, 1091, 1123, 2456, 2458, 2447, 2462, 2482, 2463, 693, 901, 921, 921, 925, 926, 983, 962, 962, 896, 963, 916, 898, 920, 897, 908, 900, 963, 910, 899, 2569, 2581, 2581, 2577, 2578, 2651, 2163, 2111, 2097, 2098, 2110, 2102, 2156, 2157, 2157, 2412, 2413, 2428, 1198, 1258, 1258, 1197, 1268, 1257, 1268, 1260, 1253, 1197, 1260, 1257, 1624, 1562, 1567, 1541, 1538, 1627, 1556, 1540, 1605, 770, 2308, 2334, 2313, 2314, 2483, 2539, 2548, 2553, 2552, 2546, 2480, 2537, 2548, 2537, 2545, 2552, 2483, 2549, 2476, 2480, 2537, 2548, 2537, 2545, 2552, 2565, 2653, 2626, 2639, 2638, 2628, 2566, 2632, 2628, 2653, 2638, 2649, 2565, 2631, 2626, 2648, 2655, 2566, 2637, 2631, 2638, 2643, 2566, 2626, 2629, 2571, 2626, 2630, 2636, 275, 274, 259, 1062, 1061, 1076, 1083, 1147, 1073, 1082, 1078, 1144, 1083, 1076, 1080, 1072, 1883, 1820, 1816, 1810, 1880, 1793, 1808, 1805, 1793, 1880, 1814, 1818, 1819, 961, 916, 907, 902, 903, 909, 962, 913, 909, 919, 912, 897, 903, 1081, 1132, 1139, 1150, 1151, 1141, 723, 18660, 20532, 2499, 2555, 2558, 2551, 703, 700, 703, 700, 672, 681, 741, 871, 868, 871, 868, 888, 881, 828, 740, 743, 740, 743, 763, 754, 700, 2650, 2649, 2650, 2649, 2629, 2636, 2563, 1347, 1344, 1347, 1344, 1372, 1365, 1309, 3107, 3104, 3107, 3104, 3132, 3125, 3196, 2561, 2562, 2561, 2562, 2590, 2583, 2653, 2165, 2166, 2165, 2166, 2154, 2147, 2088, 27099, 27823, 27518, -30461, 22977, 23770, 30568, 28492, 27323, 23023, -25773, 32601, 23597, -29740, 24906, 19761, 23446, 31575, -30518, 17946, 26448, 26412, 27138, 28534, 18441, 28150, 26113, 25461, 25786, 23715, 19262, 24816, 2266, 2246, 2246, 2242, 2241, 2184, 2205, 2205, 2271, 2204, 2251, 2269, 2247, 2270, 2259, 2267, 2204, 2257, 2268, 2205, 2257, 2241, 2263, 2205, 2241, 2263, 2259, 2240, 2257, 2266, 2189, 2243, 2191, 890, 807, 817, 821, 806, 823, 828, 889, 802, 829, 816, 817, 827, 889, 824, 829, 890, 824, 829, 807, 800, 889, 822, 806, 870, 1190, 1210, 1210, 1214, 1213, 1268, 1249, 1249, 1187, 1248, 1207, 1185, 1211, 1186, 1199, 1191, 1248, 1197, 1184, 445, 1590, 1580, 1595, 1592, 995, 958, 933, 999, 994, 997, 1006, 934, 1000, 999, 1002, 998, 1019, 954, 2373, 2389, 2319, 2381, 2382, 2374, 2382, 2316, 2371, 2374, 2305, 2376, 2380, 2374, 1725, 1724, 1709, 1427, 1423, 1423, 1419, 1416, 2637, 2641, 2641, 2645, 2646, 2591};

    public static HashMap a() {
        return C0020.m4251(C0035.m6131(m128(), 0, 10, 911), C0048.m7902(m128(), 10, 111, 1535));
    }

    /* renamed from: ۟۠ۥۢ۟, reason: not valid java name and contains not printable characters */
    public static short[] m128() {
        if (C0022.m4497() > 0) {
            return f21short;
        }
        return null;
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        String[] strArrM4752 = C0024.m4752(str, C0040.m6584(m128(), 121, 2, 1055));
        String str3 = strArrM4752[0];
        int iM6456 = C0038.m6456(strArrM4752[1]);
        String strM4107 = C0019.m4107(m128(), 123, 6, 2555);
        if (C0065.m9715(map, strM4107) != null) {
            str3 = (String) C0065.m9715(map, strM4107);
        }
        StringBuilder sb = new StringBuilder(C0014.m3332(m128(), 129, 1, 666));
        C0018.m3933(sb, str3);
        String strM7763 = C0047.m7763(sb);
        String strM5062 = C0027.m5062(m128(), 130, 19, 1005);
        h hVarM3577 = C0016.m3577(C0032.m5769(C0050.m8125(strM5062, strM7763), C0043.m7362()));
        StringBuilder sb2 = new StringBuilder(C0038.m6452(m128(), 149, 6, 2657));
        C0018.m3933(sb2, C0049.m8058(C0052.m8317(C0030.m5333(hVarM3577, C0045.m7657(m128(), 155, 9, 2141)), iM6456), C0037.m6307(m128(), 164, 3, 2335)));
        String strM77632 = C0047.m7763(sb2);
        d dVarM6459 = C0038.m6459(C0052.m8317(C0030.m5333(hVarM3577, C0036.m6188(m128(), 167, 12, 1152)), iM6456), C0060.m9352(m128(), 179, 9, 1654));
        ArrayList arrayList = new ArrayList();
        Iterator itM7807 = C0047.m7807(dVarM6459);
        while (C0012.m2962(itM7807)) {
            m mVar = (m) C0048.m7949(itM7807);
            StringBuilder sb3 = new StringBuilder(strM5062);
            String strM6779 = C0041.m6779(m128(), 188, 1, 867);
            C0018.m3933(sb3, C0049.m8058(C0030.m5333(mVar, strM6779), C0019.m4107(m128(), 189, 4, 2412)));
            C0032.m5685(C0047.m7763(sb3), C0024.m4684(C0030.m5333(mVar, strM6779)), strM77632, arrayList);
        }
        g gVar = new g();
        C0049.m7974(gVar, 1, 1, 0, C0009.m2095(dVarM6459));
        C0045.m7632(gVar, arrayList);
        return C0033.m5828(gVar);
    }

    public String detailContent(List<String> list) {
        h hVarM3577 = C0016.m3577(C0032.m5769((String) C0048.m7915(list, 0), C0043.m7362()));
        String strM4684 = C0024.m4684(C0030.m5333(hVarM3577, C0007.m1842(m128(), 193, 21, 2461)));
        d dVarM5333 = C0030.m5333(hVarM3577, C0051.m8259(m128(), 214, 29, 2603));
        String strM8814 = C0055.m8814(m128(), 243, 3, 352);
        String strM8058 = C0049.m8058(dVarM5333, strM8814);
        String strM46842 = C0024.m4684(C0030.m5333(hVarM3577, C0021.m4340(m128(), 246, 13, 1109)));
        String strM46843 = C0024.m4684(C0030.m5333(hVarM3577, C0046.m7718(m128(), 259, 13, 1909)));
        String strM80582 = C0049.m8058(C0030.m5333(hVarM3577, C0064.m9599(m128(), 272, 13, 994)), strM8814);
        if (C0057.m8953(strM80582)) {
            strM80582 = C0049.m8058(C0030.m5333(hVarM3577, C0031.m5565(m128(), 285, 6, 1050)), strM8814);
        }
        String strM5172 = C0028.m5172(strM4684, C0025.m4795(m128(), 291, 1, 759), strM80582);
        com.github.catvod.spider.merge.E.m mVar = new com.github.catvod.spider.merge.E.m();
        C0011.m2828(mVar, (String) C0048.m7915(list, 0));
        C0026.m4947(mVar, strM8058);
        C0005.m1628(mVar, strM4684);
        C0058.m9152(mVar, strM46842);
        C0017.m3671(mVar, C0007.m1842(m128(), 292, 2, 1737));
        C0027.m5000(mVar, strM46843);
        C0054.m8596(mVar, C0054.m8574(m128(), 294, 4, 2450));
        C0044.m7449(mVar, strM5172);
        return C0053.m8428(mVar);
    }

    public String homeContent(boolean z) {
        ArrayList arrayList = new ArrayList();
        List listM1203 = C0001.m1203(new String[]{C0038.m6452(m128(), 298, 7, 725), C0003.m1398(m128(), 305, 7, 781), C0017.m3646(m128(), 312, 7, 654), C0010.m2300(m128(), 319, 7, 2608), C0018.m3917(m128(), 326, 7, 1321), C0049.m8007(m128(), 333, 7, 3145), C0041.m6779(m128(), 340, 7, 2667), C0040.m6584(m128(), 347, 7, 2079)});
        List listM12032 = C0001.m1203(new String[]{C0027.m5062(m128(), 354, 4, 2558), C0012.m2973(m128(), 358, 4, 631), C0050.m8131(m128(), 362, 4, 2718), C0005.m1645(m128(), 366, 4, 533), C0057.m8978(m128(), 370, 4, 2366), C0026.m4951(m128(), 374, 4, 2599), C0065.m9775(m128(), 378, 4, 1572), C0034.m6001(m128(), 382, 4, 1461)});
        for (int i = 0; i < C0064.m9636(listM1203); i++) {
            C0004.m1532(arrayList, new b((String) C0048.m7915(listM1203, i), (String) C0048.m7915(listM12032, i), null));
        }
        return C0025.m4831(arrayList, C0008.m1961());
    }

    public String playerContent(String str, String str2, List<String> list) {
        g gVar = new g();
        C0017.m3667(gVar, str2);
        C0057.m9029(gVar, C0043.m7362());
        return C0033.m5828(gVar);
    }

    public String searchContent(String str, boolean z) {
        StringBuilder sb = new StringBuilder(C0046.m7718(m128(), 386, 33, 2226));
        C0018.m3933(sb, C0056.m8909(str));
        d dVarM5333 = C0030.m5333(C0016.m3577(C0032.m5769(C0047.m7763(sb), C0043.m7362())), C0055.m8814(m128(), 419, 25, 852));
        ArrayList arrayList = new ArrayList();
        Iterator itM7807 = C0047.m7807(dVarM5333);
        while (C0012.m2962(itM7807)) {
            m mVar = (m) C0048.m7949(itM7807);
            StringBuilder sb2 = new StringBuilder(C0035.m6131(m128(), 444, 19, 1230));
            C0018.m3933(sb2, C0049.m8058(C0030.m5333(mVar, C0063.m9585(m128(), 463, 1, 476)), C0054.m8574(m128(), 464, 4, 1630)));
            String strM7763 = C0047.m7763(sb2);
            String strM4684 = C0024.m4684(C0030.m5333(mVar, C0039.m6551(m128(), 468, 14, 907)));
            String strM8058 = C0049.m8058(C0030.m5333(mVar, C0020.m4199(m128(), 482, 14, 2337)), C0039.m6551(m128(), 496, 3, 1742));
            if (!C0043.m7277(strM8058, C0065.m9775(m128(), 499, 5, 1531))) {
                strM8058 = C0050.m8125(C0023.m4536(m128(), 504, 6, 2597), strM8058);
            }
            C0032.m5685(strM7763, strM4684, strM8058, arrayList);
        }
        return C0047.m7783(arrayList);
    }
}