package com.github.catvod.spider.merge.a0;

import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.J0.C0021;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.r0.C0060;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.merge.z.C0065;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import com.github.catvod.spider.p000mergexbpq.x.C0015;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.github.catvod.spider.merge.a0.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0255p implements Runnable {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f727short = {1147, 1147, 1147, 1147, 1061, 1058, 1079, 1060, 1058, 1061, 1075, 1060, 1056, 1087, 1077, 1075, 3159, 3148, 3144, 3142, 3149, 2884, 2914, 2932, 2915, 2876, 2896, 2934, 2932, 2943, 2917, 1615, 1645, 1656, 1643, 1646, 1646, 1635, 1581, 1591, 1580, 1586, 1570, 1578, 1621, 1643, 1644, 1638, 1645, 1653, 1649, 1570, 1612, 1622, 1570, 1587, 1586, 1580, 1586, 1593, 1570, 1621, 1643, 1644, 1588, 1590, 1593, 1570, 1658, 1588, 1590, 1579, 1570, 1603, 1650, 1650, 1646, 1639, 1621, 1639, 1632, 1609, 1643, 1654, 1581, 1591, 1585, 1589, 1580, 1585, 1588, 1570, 1578, 1609, 1610, 1622, 1615, 1614, 1582, 1570, 1646, 1643, 1641, 1639, 1570, 1605, 1639, 1633, 1641, 1645, 1579, 1570, 1601, 1642, 1648, 1645, 1647, 1639, 1581, 1587, 1585, 1591, 1580, 1586, 1580, 1586, 1580, 1586, 1570, 1617, 1635, 1636, 1635, 1648, 1643, 1581, 1591, 1585, 1589, 1580, 1585, 1588, 1570, 1607, 1638, 1637, 1581, 1587, 1585, 1591, 1580, 1586, 1580, 1586, 1580, 1586, 1665, 1687, 1681, 1759, 1681, 1690, 1759, 1671, 1683, 1759, 1695, 1693, 1680, 1691, 1694, 1687, 1990, 1993, 1716, 1669, 1669, 1752, 1699, 1680, 1671, 1670, 1692, 1690, 1691, 3047, 2272, 2300, 2289, 2276, 2294, 2303, 2274, 2301, 2860, 2878, 2873, 1274, 1228, 1226, 1156, 1263, 1228, 1245, 1226, 1217, 1156, 1274, 1216, 1245, 1228, 2541, 2559, 2547, 2555, 2483, 2545, 2540, 2551, 2553, 2551, 2544, 1533, 1483, 1485, 1411, 1512, 1483, 1498, 1485, 1478, 1411, 1507, 1473, 1482, 1483, 273, 285, 256, 257, 2637, 2683, 2685, 2611, 2648, 2683, 2666, 2685, 2678, 2611, 2650, 2683, 2669, 2666, 2138, 2130, 2127, 2123, 2118, 3040, 3031, 3028, 3031, 3008, 3031, 3008, 1457, 1453, 1453, 1449, 1450, 1507, 1526, 1526, 1461, 1462, 1470, 1456, 1463, 1527, 1512, 1515, 1514, 1449, 1464, 1463, 1527, 1466, 1462, 1460, 1526, 1466, 1468, 1463, 1453, 1468, 1451, 1461, 1462, 1470, 1456, 1463, 1510, 1451, 1468, 1469, 1456, 1451, 1468, 1466, 1453, 1414, 1452, 1451, 1461, 1508, 1457, 1453, 1453, 1449, 1450, 1532, 1514, 1432, 1532, 1515, 1439, 1532, 1515, 1439, 1454, 1454, 1454, 1527, 1512, 1515, 1514, 1449, 1464, 1463, 1527, 1466, 1462, 1460, 1532, 1515, 1439, 1535, 1450, 1462, 1452, 1451, 1466, 1468, 1414, 1449, 1464, 1470, 1468, 1508, 1454, 1468, 1467, 1450, 1456, 1453, 1468, 2550, 2538, 2538, 2542, 2541, 2468, 2481, 2481, 2546, 2545, 2553, 2551, 2544, 2480, 2479, 2476, 2477, 2542, 2559, 2544, 2480, 2557, 2545, 2547, 2481, 2559, 2542, 2551, 2481, 2539, 2541, 2555, 2540, 2481, 2543, 2540, 2483, 2557, 2545, 2554, 2555, 2481, 2540, 2555, 2541, 2539, 2546, 2538, 2465, 2539, 2544, 2551, 2519, 2522, 2467, 3124, 3119, 3115, 3109, 3118, 1540, 1542, 1542, 3018, 3023, 3034, 3023};
    public final /* synthetic */ int a;
    public final /* synthetic */ C0259u b;
    public final /* synthetic */ Map c;

    public /* synthetic */ RunnableC0255p(C0259u c0259u, HashMap map, int i) {
        this.a = i;
        this.b = c0259u;
        this.c = map;
    }

    /* renamed from: ۟ۡۧۢۧ, reason: not valid java name and contains not printable characters */
    public static String m7067(Object obj) {
        if (C0036.m6252() >= 0) {
            return ((JsonPrimitive) obj).getAsString();
        }
        return null;
    }

    /* renamed from: ۟ۥۧۡۥ, reason: not valid java name and contains not printable characters */
    public static JsonPrimitive m7068(Object obj, Object obj2) {
        if (C0045.m7538() <= 0) {
            return ((JsonObject) obj).getAsJsonPrimitive((String) obj2);
        }
        return null;
    }

    /* renamed from: ۟ۧۥۣ۟, reason: not valid java name and contains not printable characters */
    public static JsonObject m7069(Object obj, Object obj2) {
        if (C0016.m3596() < 0) {
            return ((JsonObject) obj).getAsJsonObject((String) obj2);
        }
        return null;
    }

    /* renamed from: ۠ۧۥۢ, reason: not valid java name and contains not printable characters */
    public static void m7070(Object obj) {
        if (C0054.m8557() <= 0) {
            SpiderDebug.log((String) obj);
        }
    }

    /* renamed from: ۣۢۦ, reason: not valid java name and contains not printable characters */
    public static short[] m7071() {
        if (C0037.m6350() <= 0) {
            return f727short;
        }
        return null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (C0015.m3496(this)) {
            case 0:
                C0259u c0259uM9378 = C0062.m9378(this);
                C0047.m7777(c0259uM9378);
                StringBuilder sb = new StringBuilder(C0049.m8007(m7071(), 367, 55, 2462));
                Map mapM9542 = C0063.m9542(this);
                String strM7290 = C0043.m7290(m7071(), 422, 5, 3136);
                C0018.m3933(sb, (String) C0062.m9431(mapM9542, strM7290));
                String strM5769 = C0032.m5769(C0047.m7763(sb), null);
                if (C0058.m9127(strM5769, C0029.m5256(m7071(), 427, 3, 1590))) {
                    C0032.m5690(c0259uM9378, m7067(m7068(m7069((JsonObject) C0033.m5856(strM5769, JsonObject.class), C0036.m6188(m7071(), 430, 4, 2990)), strM7290)));
                    break;
                }
                break;
            default:
                HashMap map = (HashMap) C0063.m9542(this);
                C0259u c0259uM93782 = C0062.m9378(this);
                C0047.m7777(c0259uM93782);
                m7070(C0027.m5062(m7071(), 0, 16, 1110));
                C0065.m9715(map, C0021.m4340(m7071(), 16, 5, 3107));
                C0053.m8424(map, C0032.m5708(m7071(), 21, 10, 2833), C0011.m2805(m7071(), 31, 125, 1538));
                C0053.m8424(map, C0065.m9775(m7071(), 156, 16, 1778), C0057.m8978(m7071(), 172, 2, 2041));
                C0053.m8424(map, C0027.m5062(m7071(), 174, 11, 1781), C0027.m5062(m7071(), 185, 1, 3028));
                C0053.m8424(map, C0025.m4795(m7071(), 186, 8, 2192), C0029.m5256(m7071(), 194, 3, 2907));
                C0053.m8424(map, C0022.m4403(m7071(), 197, 14, 1193), C0024.m4740(m7071(), 211, 11, 2462));
                C0053.m8424(map, C0016.m3525(m7071(), 222, 14, 1454), C0037.m6307(m7071(), 236, 4, 370));
                C0053.m8424(map, C0009.m2037(m7071(), 240, 14, 2590), C0032.m5708(m7071(), 254, 5, 2111));
                C0053.m8424(map, C0011.m2805(m7071(), 259, 7, 2994), C0003.m1398(m7071(), 266, 101, 1497));
                ScheduledExecutorService scheduledExecutorServiceM3101 = C0013.m3101(1);
                c0259uM93782.d = scheduledExecutorServiceM3101;
                C0060.m9344(scheduledExecutorServiceM3101, new RunnableC0255p(c0259uM93782, map, 0), 1L, 3L, C0050.m8151());
                break;
        }
    }
}