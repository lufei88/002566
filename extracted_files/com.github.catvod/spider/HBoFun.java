package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.E.b;
import com.github.catvod.spider.merge.E.g;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.K0.C0022;
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
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.r0.C0060;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.merge.z.C0065;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.a0.C0006;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.c0.C0010;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.r.C0014;
import com.github.catvod.spider.p000mergexbpq.x.C0015;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class HBoFun extends Spider {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f52short = {731, 711, 711, 707, 704, 649, 668, 668, 708, 708, 708, 669, 732, 734, 732, 725, 710, 733, 704, 669, 720, 732, 734, 668, 2905, 2560, 2630, 2650, 2627, 2626, 3246, 1251, 1252, 1259, 1250, 1266, 1248, 1259, 1198, 1198, 1198, 1718, 1723, 1700, 1788, 1680, 1691, 1715, 1681, 1677, 1683, 1681, 1688, 1723, 1720, 1720, 1715, 1677, 1677, 1686, 1687, 1684, 2058, 2617, 2596, 2617, 2593, 2600, 3150, 3156, 3139, 3136, 2078, 2075, 2062, 2075, 2135, 2069, 2056, 2067, 2077, 2067, 2068, 2075, 2070, 1949, 1950, 1935, 1920, 1984, 1965, 1965, 1926, 1969, 1959, 1967, 1960, 1956, 1984, 1946, 1931, 1942, 1946, 1987, 1948, 1927, 1929, 1926, 1946, 2490, 2460, 2442, 2461, 2498, 2478, 2440, 2442, 2433, 2459, 2055, 2085, 2096, 2083, 2086, 2086, 2091, 2149, 2175, 2148, 2170, 2154, 2146, 2077, 2083, 2084, 2094, 2085, 2109, 2105, 2154, 2052, 2078, 2154, 2171, 2170, 2148, 2170, 2161, 2154, 2077, 2053, 2077, 2172, 2174, 2147, 2154, 2059, 2106, 2106, 2086, 2095, 2077, 2095, 2088, 2049, 2083, 2110, 2149, 2175, 2169, 2173, 2148, 2169, 2172, 2154, 2146, 2049, 2050, 2078, 2055, 2054, 2150, 2154, 2086, 2083, 2081, 2095, 2154, 2061, 2095, 2089, 2081, 2085, 2147, 2154, 2057, 2082, 2104, 2085, 2087, 2095, 2149, 2171, 2170, 2163, 2148, 2170, 2148, 2170, 2148, 2170, 2154, 2073, 2091, 2092, 2091, 2104, 2083, 2149, 2175, 2169, 2173, 2148, 2169, 2172, 3076, 3165, 3138, 3096, 3077, 3096, 3072, 3081, 2590, 1306, 1365, 1291, 1298, 1304, 1371, 1349, 1371, 1298, 1302, 1308, 1751, 1746, 1735, 1746, 1694, 1756, 1729, 1754, 1748, 1754, 1757, 1746, 1759, 3089, 3080, 3146, 3079, 3084, 3077, 3082, 3082, 3073, 3080, 3145, 3088, 3077, 3078, 3140, 3162, 3140, 3080, 3085, 2557, 2544, 2543, 2487, 2541, 2552, 2555, 2484, 2554, 2550, 2551, 2541, 2556, 2551, 2541, 2487, 2523, 2512, 2552, 2522, 2502, 2524, 2515, 2524, 2554, 2557, 2547, 2502, 2557, 2545, 2487, 2554, 2550, 2549, 2484, 2537, 2557, 2487, 2554, 2549, 2556, 2552, 2539, 2559, 2544, 2529, 2489, 2471, 2489, 2557, 2544, 2543, 2432, 2432, 2432, 2613, 1737, 1748, 1737, 1745, 1752, 1023, 997, 1010, 1009, 1030, 1528, 1984, 1135, 1073, 1147, 1150, 1131, 1150, 1073, 1129, 1142, 1132, 1142, 1149, 1139, 1146, 1074, 1127, 1132, 1498, 1497, 1480, 1479, 1415, 1485, 1484, 1501, 1480, 1472, 1477, 1412, 1482, 1478, 1479, 1501, 1484, 1479, 1501, 492, 458, 476, 459, 404, 504, 478, 476, 471, 461, 1234, 1264, 1253, 1270, 1267, 1267, 1278, 1200, 1194, 1201, 1199, 1215, 1207, 1224, 1270, 1265, 1275, 1264, 1256, 1260, 1215, 1233, 1227, 1215, 1198, 1199, 1201, 1199, 1188, 1215, 1224, 1232, 1224, 1193, 1195, 1206, 1215, 1246, 1263, 1263, 1267, 1274, 1224, 1274, 1277, 1236, 1270, 1259, 1200, 1194, 1196, 1192, 1201, 1196, 1193, 1215, 1207, 1236, 1239, 1227, 1234, 1235, 1203, 1215, 1267, 1270, 1268, 1274, 1215, 1240, 1274, 1276, 1268, 1264, 1206, 1215, 1244, 1271, 1261, 1264, 1266, 1274, 1200, 1198, 1199, 1190, 1201, 1199, 1201, 1199, 1201, 1199, 1215, 1228, 1278, 1273, 1278, 1261, 1270, 1200, 1194, 1196, 1192, 1201, 1196, 1193, 1349, 1354, 1373, 1285, 1368, 1349, 1374, 1346, 1286, 1347, 1358, 1354, 1359, 1358, 1369, 1286, 1350, 1358, 1349, 1374, 1286, 1349, 1354, 1373, 1291, 1301, 1291, 1374, 1351, 1422, 2516, 2510, 2521, 2522, 744, 691, 702, 695, 674, 744, 1655, 1658, 1637, 1597, 1617, 1626, 1650, 1616, 1612, 1618, 1616, 1625, 1658, 1657, 1657, 1650, 1612, 1612, 1623, 1622, 1621, 507, 486, 507, 483, 490, 1880, 1885, 1864, 1885, 1809, 1875, 1870, 1877, 1883, 1877, 1874, 1885, 1872, 429, 430, 447, 432, 496, 413, 413, 438, 385, 407, 415, 408, 404, 496, 426, 443, 422, 426, 499, 428, 439, 441, 438, 426, 2220, 1564, 1536, 1536, 1540, 2211, 2181, 2195, 2180, 2267, 2231, 2193, 2195, 2200, 2178, 743, 709, 720, 707, 710, 710, 715, 645, 671, 644, 666, 650, 642, 765, 707, 708, 718, 709, 733, 729, 650, 740, 766, 650, 667, 666, 644, 666, 657, 650, 765, 741, 765, 668, 670, 643, 650, 747, 730, 730, 710, 719, 765, 719, 712, 737, 707, 734, 645, 671, 665, 669, 644, 665, 668, 650, 642, 737, 738, 766, 743, 742, 646, 650, 710, 707, 705, 719, 650, 749, 719, 713, 705, 709, 643, 650, 745, 706, 728, 709, 711, 719, 645, 667, 666, 659, 644, 666, 644, 666, 644, 666, 650, 761, 715, 716, 715, 728, 707, 645, 671, 665, 669, 644, 665, 668, 2418, 1318, 1402, 1388, 1384, 1403, 1386, 1377, 1318, 1324, 1356, 1329, 1324, 1329, 1338, 1324, 1329, 1343, 1324, 1356, 1340, 1324, 1352, 1341, 1324, 1352, 1342, 1324, 1356, 1340, 1324, 1329, 1340, 1324, 1328, 1352, 1316, 1316, 1316, 1316, 1316, 1316, 1316, 1316, 1316, 1316, 1316, 1316, 1316, 1319, 1377, 1405, 1380, 1381, 3283, 3284, 3291, 3282, 3266, 3280, 3291, 3230, 3230, 3230, 1084, 1073, 1070, 1142, 1046, 1036, 1045, 1073, 1068, 1085, 1077, 1061, 1064, 1079, 1135, 1077, 1056, 1062, 1074, 26483, -31292, 32351, 22009, 1754, 1751, 1736, 1680, 1738, 1751, 1738, 1746, 1755, 1694, 1664, 1694, 1759, 1057, 1084, 1057, 1081, 1072, 2321, 2315, 2332, 2335, 402, 415, 384, 472, 390, 409, 389, 386, 403, 388, 470, 456, 470, 407, 470, 456, 470, 415, 411, 401, 2685, 2684, 2669, 1868, 1857, 1886, 1798, 1882, 1869, 1883, 1873, 1869, 1865, 1882};
    public String a = C0037.m6307(m320(), 0, 24, 691);

    /* renamed from: ۦۤۢۥ, reason: contains not printable characters */
    public static short[] m320() {
        if (C0019.m4065() < 0) {
            return f52short;
        }
        return null;
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        C0018.m3933(sb, C0055.m8756(this));
        C0018.m3933(sb, C0042.m7151(m320(), 24, 1, 2934));
        String strM5565 = C0031.m5565(m320(), 25, 5, 2606);
        C0018.m3933(sb, C0015.m3446(str, strM5565, C0007.m1840()));
        String strM6434 = C0038.m6434(sb, C0006.m1774(m320(), 30, 1, 3203), str2, strM5565);
        PrintStream printStreamM6087 = C0035.m6087();
        StringBuilder sb2 = new StringBuilder(C0027.m5062(m320(), 31, 10, 1157));
        C0018.m3933(sb2, strM6434);
        C0012.m2969(printStreamM6087, C0047.m7763(sb2));
        Iterator itM7807 = C0047.m7807(C0030.m5333(C0016.m3577(C0032.m5769(strM6434, null)), C0011.m2805(m320(), 41, 21, 1746)));
        while (C0012.m2962(itM7807)) {
            m mVar = (m) C0048.m7949(itM7807);
            String strM5109 = C0028.m5109(m320(), 62, 1, 2155);
            String strM8058 = C0049.m8058(C0030.m5333(mVar, strM5109), C0004.m1549(m320(), 63, 5, 2637));
            String strM80582 = C0049.m8058(C0030.m5333(mVar, strM5109), C0036.m6188(m320(), 68, 4, 3110));
            C0055.m8732(C0028.m5188(new StringBuilder(), C0055.m8756(this), strM80582), strM8058, C0049.m8058(C0030.m5333(mVar, strM5109), C0056.m8911(m320(), 72, 13, 2170)), C0064.m9669(C0036.m6243(mVar, C0028.m5109(m320(), 85, 24, 2030))), arrayList);
        }
        return C0020.m4216(C0011.m2808(C0038.m6456(str2)), C0047.m7818(1, str2), C0011.m2808(20), C0054.m8556(str2, 1, 20), arrayList);
    }

    public String detailContent(List<String> list) {
        String strM7718;
        String str = (String) C0048.m7915(list, 0);
        HashMap map = new HashMap();
        C0053.m8424(map, C0032.m5708(m320(), 109, 10, 2543), C0045.m7657(m320(), 119, 106, 2122));
        h hVarM3577 = C0016.m3577(C0032.m5769(str, map));
        String str2 = C0002.m1240(C0024.m4684(C0030.m5333(hVarM3577, C0050.m8131(m320(), 225, 8, 3180))), C0006.m1774(m320(), 233, 1, 2622), 2)[0];
        String strM8058 = C0049.m8058(C0030.m5333(hVarM3577, C0056.m8911(m320(), 234, 11, 1403)), C0031.m5565(m320(), 245, 13, 1715));
        d dVarM5333 = C0030.m5333(hVarM3577, C0046.m7718(m320(), 258, 19, 3172));
        d dVarM53332 = C0030.m5333(hVarM3577, C0050.m8131(m320(), 277, 52, 2457));
        PrintStream printStreamM6087 = C0035.m6087();
        StringBuilder sb = new StringBuilder();
        C0018.m3933(sb, str2);
        C0018.m3933(sb, strM8058);
        C0012.m2969(printStreamM6087, C0047.m7763(sb));
        StringBuilder sb2 = new StringBuilder();
        Iterator itM7807 = C0047.m7807(dVarM5333);
        while (true) {
            boolean zM2962 = C0012.m2962(itM7807);
            strM7718 = C0046.m7718(m320(), 329, 3, 2468);
            if (!zM2962) {
                break;
            }
            m mVar = (m) C0048.m7949(itM7807);
            C0018.m3933(sb2, C0016.m3579());
            C0018.m3933(sb2, C0064.m9669(mVar));
            C0018.m3933(sb2, strM7718);
        }
        StringBuilder sb3 = new StringBuilder();
        Iterator itM78072 = C0047.m7807(dVarM53332);
        while (C0012.m2962(itM78072)) {
            Iterator itM78073 = C0047.m7807(C0030.m5333((m) C0048.m7949(itM78072), C0036.m6188(m320(), 332, 1, 2644)));
            while (C0012.m2962(itM78073)) {
                m mVar2 = (m) C0048.m7949(itM78073);
                String strM2339 = C0010.m2339(mVar2, C0014.m3332(m320(), 333, 5, 1725));
                if (C0057.m8953(strM2339)) {
                    strM2339 = str2;
                }
                String strM23392 = C0010.m2339(mVar2, C0041.m6779(m320(), 338, 4, 919));
                if (C0057.m8953(strM23392)) {
                    strM23392 = (String) C0048.m7915(list, 0);
                }
                C0018.m3933(sb3, strM2339);
                C0018.m3933(sb3, C0047.m7833(m320(), 342, 1, 1058));
                StringBuilder sb4 = new StringBuilder();
                C0018.m3933(sb4, strM23392);
                String strM4951 = C0026.m4951(m320(), 343, 1, 1414);
                C0018.m3933(sb4, strM4951);
                C0018.m3933(sb4, str2);
                C0018.m3933(sb3, C0047.m7763(sb4));
                C0018.m3933(sb3, strM4951);
                C0018.m3933(sb3, strM2339);
                C0018.m3933(sb3, C0065.m9775(m320(), 344, 1, 2019));
            }
            C0018.m3933(sb3, strM7718);
        }
        String strM8477 = C0053.m8477(m320(), 345, 17, 1055);
        String strM9669 = C0064.m9669((m) C0028.m5161(C0030.m5333(hVarM3577, strM8477), 0));
        String strM96692 = C0064.m9669((m) C0028.m5161(C0030.m5333(hVarM3577, strM8477), 2));
        String strM4684 = C0024.m4684(C0030.m5333(hVarM3577, C0016.m3525(m320(), 362, 19, 1449)));
        com.github.catvod.spider.merge.E.m mVar3 = new com.github.catvod.spider.merge.E.m();
        C0017.m3671(mVar3, strM9669);
        C0022.m4432(mVar3, strM96692);
        StringBuilder sb5 = new StringBuilder();
        C0018.m3933(sb5, C0055.m8703());
        C0018.m3933(sb5, strM4684);
        C0027.m5000(mVar3, C0047.m7763(sb5));
        C0011.m2828(mVar3, (String) C0048.m7915(list, 0));
        C0026.m4947(mVar3, strM8058);
        C0005.m1628(mVar3, str2);
        C0054.m8596(mVar3, C0000.m1096(sb2));
        C0044.m7449(mVar3, C0000.m1096(sb3));
        return C0053.m8428(mVar3);
    }

    public String homeContent(boolean z) {
        String strM5708;
        ArrayList arrayList = new ArrayList();
        String strM8756 = C0055.m8756(this);
        HashMap map = new HashMap();
        C0053.m8424(map, C0051.m8259(m320(), 381, 10, 441), C0002.m1305(m320(), 391, 106, 1183));
        h hVarM3577 = C0016.m3577(C0032.m5769(strM8756, map));
        d dVarM5333 = C0030.m5333(hVarM3577, C0010.m2300(m320(), 497, 29, 1323));
        String strM6001 = C0034.m6001(m320(), 526, 1, 1519);
        Iterator itM7807 = C0047.m7807(C0038.m6459(dVarM5333, strM6001));
        while (true) {
            boolean zM2962 = C0012.m2962(itM7807);
            strM5708 = C0032.m5708(m320(), 527, 4, 2492);
            if (!zM2962) {
                break;
            }
            m mVar = (m) C0048.m7949(itM7807);
            String strM2339 = C0010.m2339(mVar, strM5708);
            if (C0058.m9127(strM2339, C0062.m9389(m320(), 531, 6, 711))) {
                C0004.m1532(arrayList, new b(strM2339, C0064.m9640(C0064.m9669(mVar)), null));
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator itM78072 = C0047.m7807(C0030.m5333(hVarM3577, C0027.m5062(m320(), 537, 21, 1555)));
        while (C0012.m2962(itM78072)) {
            m mVar2 = (m) C0048.m7949(itM78072);
            String strM8058 = C0049.m8058(C0030.m5333(mVar2, strM6001), C0036.m6188(m320(), 558, 5, 399));
            String strM80582 = C0049.m8058(C0030.m5333(mVar2, strM6001), strM5708);
            C0055.m8732(C0028.m5188(new StringBuilder(), C0055.m8756(this), strM80582), strM8058, C0049.m8058(C0030.m5333(mVar2, strM6001), C0049.m8007(m320(), 563, 13, 1852)), C0064.m9669(C0036.m6243(mVar2, C0043.m7290(m320(), 576, 24, 478))), arrayList2);
        }
        return C0025.m4831(arrayList, arrayList2);
    }

    public void init(Context context) {
        C0051.m8194(C0035.m6110());
    }

    public void init(Context context, String str) {
        C0051.m8194(C0035.m6110());
        if (str != null) {
            this.a = str;
        }
    }

    public String playerContent(String str, String str2, List<String> list) {
        C0036.m6219();
        String[] strArrM4752 = C0024.m4752(str2, C0033.m5852(m320(), 600, 1, 2258));
        String str3 = null;
        String strM5188 = (strArrM4752.length <= 0 || C0057.m8953(strArrM4752[0])) ? null : strArrM4752[0];
        String str4 = (strArrM4752.length <= 1 || C0057.m8953(strArrM4752[1])) ? null : strArrM4752[1];
        if (strArrM4752.length > 2 && !C0057.m8953(strArrM4752[2])) {
            str3 = strArrM4752[2];
        }
        if (!C0058.m9127(strM5188, C0047.m7833(m320(), 601, 4, 1652))) {
            strM5188 = C0028.m5188(new StringBuilder(), C0055.m8756(this), strM5188);
        }
        String strM2827 = C0011.m2827(strM5188, str4, str3);
        g gVarM9311 = C0060.m9311(1, strM5188);
        HashMap map = new HashMap();
        C0053.m8424(map, C0053.m8477(m320(), 605, 10, 2294), C0063.m9585(m320(), 615, 106, 682));
        C0057.m9029(gVarM9311, map);
        C0002.m1282(gVarM9311, strM2827);
        return C0033.m5828(gVarM9311);
    }

    public String searchContent(String str, boolean z) {
        return C0052.m8285(this, C0056.m8909(str), true, C0055.m8814(m320(), 721, 1, 2371));
    }

    public String searchContent(String str, boolean z, String str2) {
        ArrayList arrayList = new ArrayList();
        String strM5188 = C0028.m5188(new StringBuilder(), C0055.m8756(this), C0001.m1189(m320(), 722, 53, 1289));
        PrintStream printStreamM6087 = C0035.m6087();
        StringBuilder sb = new StringBuilder(C0049.m8007(m320(), 775, 10, 3253));
        C0018.m3933(sb, strM5188);
        C0012.m2969(printStreamM6087, C0047.m7763(sb));
        Iterator itM7807 = C0047.m7807(C0030.m5333(C0016.m3577(C0032.m5769(strM5188, null)), C0058.m9106(m320(), 785, 11, 1112)));
        while (C0012.m2962(itM7807)) {
            m mVar = (m) C0048.m7949(itM7807);
            String strM4684 = C0024.m4684(C0030.m5333(mVar, C0020.m4199(m320(), 796, 8, 1089)));
            if (!C0058.m9127(strM4684, C0045.m7657(m320(), 804, 2, 1974)) && !C0058.m9127(strM4684, C0064.m9599(m320(), 806, 2, 2000))) {
                String strM9389 = C0062.m9389(m320(), 808, 13, 1726);
                String strM8058 = C0049.m8058(C0030.m5333(mVar, strM9389), C0056.m8911(m320(), 821, 5, 1109));
                String strM80582 = C0049.m8058(C0030.m5333(mVar, strM9389), C0010.m2300(m320(), 826, 4, 2425));
                C0055.m8732(C0028.m5188(new StringBuilder(), C0055.m8756(this), strM80582), strM8058, C0049.m8058(C0030.m5333(mVar, C0019.m4107(m320(), 830, 20, 502)), C0049.m8007(m320(), 850, 3, 2574)), C0064.m9669(C0036.m6243(mVar, C0012.m2973(m320(), 853, 11, 1832))), arrayList);
            }
        }
        return C0047.m7783(arrayList);
    }
}