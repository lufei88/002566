package com.github.catvod.spider;

import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.T0.m;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.V0.d;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.merge.c1.C0046;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.t.C0061;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.c0.C0010;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.x.C0015;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class PanSou extends Ali {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f98short = {2526, 2498, 2498, 2502, 2501, 2444, 2457, 2457, 2497, 2497, 2497, 2456, 2519, 2522, 2527, 2502, 2519, 2520, 2501, 2521, 2499, 2456, 2517, 2521, 2523, 2457, 2501, 2515, 2519, 2500, 2517, 2526, 2441, 2525, 2443, 1675, 1757, 1740, 1738, 1736, 1680, 2501, 2448, 2526, 2515, 2501, 2455, 2526, 2510, 2514, 2309, 2339, 2357, 2338, 2429, 2321, 2359, 2357, 2366, 2340, 1633, 1603, 1622, 1605, 1600, 1600, 1613, 1539, 1561, 1538, 1564, 1548, 1540, 1659, 1605, 1602, 1608, 1603, 1627, 1631, 1548, 1634, 1656, 1548, 1565, 1564, 1538, 1564, 1559, 1548, 1659, 1605, 1602, 1562, 1560, 1559, 1548, 1620, 1562, 1560, 1541, 1548, 1645, 1628, 1628, 1600, 1609, 1659, 1609, 1614, 1639, 1605, 1624, 1539, 1561, 1567, 1563, 1538, 1567, 1562, 1548, 1540, 1639, 1636, 1656, 1633, 1632, 1536, 1548, 1600, 1605, 1607, 1609, 1548, 1643, 1609, 1615, 1607, 1603, 1541, 1548, 1647, 1604, 1630, 1603, 1601, 1609, 1539, 1565, 1566, 1566, 1538, 1564, 1538, 1564, 1538, 1564, 1548, 1663, 1613, 1610, 1613, 1630, 1605, 1539, 1561, 1567, 1563, 1538, 1567, 1562, 1441, 1462, 1465, 1530, 1445, 1464, 1440, 1527, 1513, 1527, 1462, 1287, 1302, 1310, 1283, 1311, 1298, 1287, 1302, 1725, 1703, 1712, 1715, 1519, 1523, 1523, 1527, 1524, 1469, 1448, 1448, 1518, 1513, 1506, 1520, 1524, 1449, 1504, 1523, 1518, 1514, 1504, 1449, 1508, 1512, 1514, 1448, 1513, 1506, 1520, 1524, 1510, 1527, 1527, 1496, 1509, 1523, 1448, 1463, 1448, 1462, 1460, 1461, 1457, 1460, 1471, 1460, 1456, 1471, 1458, 1470, 1448, 1462, 1463, 1463, 1463, 2639, 2643, 2643, 2647, 2644, 2589, 2568, 2568, 2640, 2640, 2640, 2569, 2630, 2635, 2638, 2647, 2630, 2633, 2644, 2632, 2642, 2569, 2628, 2632, 2634, 3081, 3157, 3081, 1008, 956, 937, 1008, 2800, 2774, 2752, 2775, 2696, 2788, 2754, 2752, 2763, 2769, 1122, 1088, 1109, 1094, 1091, 1091, 1102, 1024, 1050, 1025, 1055, 1039, 1031, 1144, 1094, 1089, 1099, 1088, 1112, 1116, 1039, 1121, 1147, 1039, 1054, 1055, 1025, 1055, 1044, 1039, 1144, 1094, 1089, 1049, 1051, 1044, 1039, 1111, 1049, 1051, 1030, 1039, 1134, 1119, 1119, 1091, 1098, 1144, 1098, 1101, 1124, 1094, 1115, 1024, 1050, 1052, 1048, 1025, 1052, 1049, 1039, 1031, 1124, 1127, 1147, 1122, 1123, 1027, 1039, 1091, 1094, 1092, 1098, 1039, 1128, 1098, 1100, 1092, 1088, 1030, 1039, 1132, 1095, 1117, 1088, 1090, 1098, 1024, 1054, 1053, 1053, 1025, 1055, 1025, 1055, 1025, 1055, 1039, 1148, 1102, 1097, 1102, 1117, 1094, 1024, 1050, 1052, 1048, 1025, 1052, 1049, 1971, 1924, 1927, 1924, 1939, 1924, 1939, 648, 693, 702, 691, 2077, 2127, 2074, 2079, 2122, 2078, 2127, 2127, 2077, 2120, 2075, 2076, 2066, 2067, 2075, 2127, 2066, 2127, 2120, 2075, 2067, 2066, 2122, 2077, 2066, 2072, 2067, 2075, 2078, 2122, 2127, 2067, 1068};

    public static String b(String str, String str2) {
        StringBuilder sb = new StringBuilder(C0026.m4951(m526(), 0, 35, 2486));
        C0018.m3933(sb, C0056.m8909(str));
        C0018.m3933(sb, C0019.m4107(m526(), 35, 6, 1709));
        C0018.m3933(sb, str2);
        C0018.m3933(sb, C0024.m4740(m526(), 41, 9, 2531));
        String strM7763 = C0047.m7763(sb);
        HashMap map = new HashMap();
        C0053.m8424(map, C0057.m8978(m526(), 50, 10, 2384), C0002.m1305(m526(), 60, 111, 1580));
        d dVarM5333 = C0030.m5333(C0016.m3577(C0032.m5769(strM7763, map)), C0029.m5256(m526(), 171, 11, 1495));
        ArrayList arrayList = new ArrayList();
        Iterator itM7807 = C0047.m7807(dVarM5333);
        while (C0012.m2962(itM7807)) {
            m mVar = (m) C0048.m7949(itM7807);
            String strM9640 = C0064.m9640(C0064.m9669(C0036.m6243(mVar, C0024.m4740(m526(), 182, 8, 1395))));
            if (C0058.m9127(strM9640, str)) {
                com.github.catvod.spider.merge.E.m mVar2 = new com.github.catvod.spider.merge.E.m();
                C0011.m2828(mVar2, C0010.m2339(mVar, C0024.m4740(m526(), 190, 4, 1749)));
                C0026.m4947(mVar2, C0009.m2037(m526(), 194, 53, 1415));
                C0005.m1628(mVar2, strM9640);
                C0004.m1532(arrayList, mVar2);
            }
        }
        return C0047.m7783(arrayList);
    }

    /* renamed from: ۣۧ۟ۢ, reason: not valid java name and contains not printable characters */
    public static short[] m526() {
        if (C0045.m7538() <= 0) {
            return f98short;
        }
        return null;
    }

    @Override // com.github.catvod.spider.Ali
    public String detailContent(List<String> list) {
        if (C0003.m1405(C0034.m6026(C0044.m7486(), (CharSequence) C0048.m7915(list, 0)))) {
            return super.detailContent(list);
        }
        String strM9389 = C0062.m9389(m526(), 247, 25, 2599);
        StringBuilder sb = new StringBuilder(strM9389);
        C0018.m3933(sb, C0015.m3446((String) C0048.m7915(list, 0), C0038.m6452(m526(), 272, 3, 3110), C0054.m8574(m526(), 275, 4, 991)));
        String strM7763 = C0047.m7763(sb);
        String str = (String) C0048.m7915(list, 0);
        HashMap mapM4251 = C0020.m4251(C0043.m7290(m526(), 279, 10, 2725), C0061.m9361(m526(), 289, 111, 1071));
        StringBuilder sb2 = new StringBuilder(strM9389);
        C0018.m3933(sb2, str);
        C0053.m8424(mapM4251, C0031.m5565(m526(), 400, 7, 2017), C0047.m7763(sb2));
        C0053.m8424(mapM4251, C0046.m7718(m526(), 407, 4, 727), C0028.m5109(m526(), 411, 32, 2091));
        return super.detailContent(C0001.m1203(new String[]{C0043.m7360(strM7763, mapM4251)}));
    }

    public String searchContent(String str, boolean z) {
        return C0020.m4196(str, C0048.m7902(m526(), 443, 1, 1053));
    }

    public String searchContent(String str, boolean z, String str2) {
        return C0020.m4196(str, str2);
    }
}