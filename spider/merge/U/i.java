package com.github.catvod.spider.merge.U;

import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.J0.C0021;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z.C0040;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.merge.c1.C0046;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.r0.C0059;
import com.github.catvod.spider.merge.r0.C0060;
import com.github.catvod.spider.merge.t.C0061;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.merge.z.C0065;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.a0.C0006;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.c0.C0010;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.x.C0015;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class i {
    public static final HashMap i;
    public String a;
    public CopyOnWriteArrayList b;
    public ExecutorService c;
    public ExecutorService d;
    public AtomicBoolean e;
    public final AtomicReference f = new AtomicReference();
    public CountDownLatch g;

    /* renamed from: short, reason: not valid java name */
    private static final short[] f518short = {2199, 2225, 2215, 2224, 2287, 2179, 2213, 2215, 2220, 2230, 1668, 1702, 1715, 1696, 1701, 1701, 1704, 1766, 1788, 1767, 1785, 1769, 1761, 1669, 1696, 1703, 1724, 1713, 1778, 1769, 1672, 1703, 1709, 1723, 1702, 1696, 1709, 1769, 1693, 1695, 1760, 1769, 1672, 1721, 1721, 1701, 1708, 1694, 1708, 1707, 1666, 1696, 1725, 1766, 1788, 1786, 1790, 1767, 1786, 1791, 1769, 1761, 1666, 1665, 1693, 1668, 1669, 1765, 1769, 1701, 1696, 1698, 1708, 1769, 1678, 1708, 1706, 1698, 1702, 1760, 1769, 1695, 1708, 1723, 1722, 1696, 1702, 1703, 1766, 1789, 1767, 1785, 1769, 1674, 1697, 1723, 1702, 1700, 1708, 1766, 1784, 1785, 1776, 1767, 1785, 1767, 1785, 1767, 1785, 1769, 1690, 1704, 1711, 1704, 1723, 1696, 1766, 1788, 1786, 1790, 1767, 1786, 1791, 2408, 2378, 2378, 2380, 2393, 2397, 2181, 2196, 2185, 2181, 2270, 2201, 2181, 2204, 2205, 2269, 2192, 2177, 2177, 2205, 2200, 2194, 2192, 2181, 2200, 2206, 2207, 2270, 2185, 2201, 2181, 2204, 2205, 2266, 2185, 2204, 2205, 2269, 2192, 2177, 2177, 2205, 2200, 2194, 2192, 2181, 2200, 2206, 2207, 2270, 2185, 2204, 2205, 2250, 2176, 2252, 2241, 2271, 2248, 2269, 2200, 2204, 2192, 2198, 2196, 2270, 2192, 2183, 2200, 2199, 2269, 2200, 2204, 2192, 2198, 2196, 2270, 2182, 2196, 2195, 2177, 2269, 2200, 2204, 2192, 2198, 2196, 2270, 2192, 2177, 2207, 2198, 2269, 2267, 2270, 2267, 2250, 2176, 2252, 2241, 2271, 2249, 2269, 2192, 2177, 2177, 2205, 2200, 2194, 2192, 2181, 2200, 2206, 2207, 2270, 2178, 2200, 2198, 2207, 2196, 2197, 2268, 2196, 2185, 2194, 2201, 2192, 2207, 2198, 2196, 2250, 2183, 2252, 2195, 2242, 2250, 2176, 2252, 2241, 2271, 2248, 1244, 1226, 1228, 1154, 1228, 1223, 1154, 1242, 1230, 1495, 1493, 1467, 1434, 1409, 1493, 1460, 1486, 1463, 1415, 1428, 1435, 1425, 1495, 1486, 1411, 1480, 1495, 1484, 1484, 1495, 1497, 1493, 1495, 1462, 1437, 1415, 1434, 1432, 1436, 1408, 1432, 1495, 1486, 1411, 1480, 1495, 1484, 1485, 1495, 3179, 3197, 3195, 3125, 3195, 3184, 3125, 3181, 3193, 3125, 3189, 3191, 3194, 3185, 3188, 3197, 1864, 1863, 2230, 2208, 2214, 2280, 2214, 2221, 2280, 2224, 2212, 2280, 2229, 2217, 2212, 2225, 2211, 2218, 2231, 2216, 3210, 3305, 3270, 3276, 3290, 3271, 3265, 3276, 3208, 3324, 3326, 3210, 2972, 2969, 2958, 2971, 2952, 2957, 2956, 3012, 2944, 2951, 2970, 2956, 2954, 2972, 2971, 2956, 3012, 2971, 2956, 2968, 2972, 2956, 2970, 2973, 2970, 2876, 1940, 1922, 1924, 1994, 1921, 1922, 1939, 1924, 1935, 1994, 1940, 1934, 1939, 1922, 3114, 3115, 3114, 3105, 636, 618, 620, 546, 617, 618, 635, 620, 615, 546, 610, 608, 619, 618, 1637, 1642, 1661, 1634, 1644, 1642, 1663, 1646, 1734, 1744, 1750, 1688, 1747, 1744, 1729, 1750, 1757, 1688, 1728, 1734, 1744, 1735, 2396, 2386, 509, 491, 493, 419, 488, 491, 506, 493, 486, 419, 490, 491, 509, 506, 717, 710, 714, 732, 708, 716, 711, 733, 2931, 2929, 2929, 2935, 2914, 2918, 2879, 2942, 2931, 2940, 2933, 2919, 2931, 2933, 2935, 1609, 1627, 1566, 1648, 1661, 1567, 1609, 1627, 1544, 1602, 1550, 1539, 1565, 1546, 28564, 22596, 23137, 21579, 24935, -1889, 22479, 27889, 25253, -28331, 31040, 24591, 19838, 20772, 25058, -29751, 21119, -26980, 959, 933, 17713, 22891, 22072, -31903, 22556, 26178, 3056, 3050, 17923, 23129, -31363, 27918, 2242, 2264, 22003, 30409, 25443, 23116, 17921, 25376, 18170, 23200, -2291, 24582, 22486, 2107, 2081};
    public static final d h = new d();

    static {
        HashMap map = new HashMap();
        i = map;
        C0053.m8424(map, C0045.m7657(m5470(), 0, 10, 2242), C0025.m4795(m5470(), 10, 113, 1737));
        C0053.m8424(map, C0062.m9389(m5470(), 123, 6, 2345), C0061.m9361(m5470(), 129, 135, 2289));
        C0053.m8424(map, C0024.m4740(m5470(), 264, 9, 1199), C0061.m9361(m5470(), 273, 40, 1525));
        C0053.m8424(map, C0026.m4951(m5470(), 313, 16, 3096), C0002.m1305(m5470(), 329, 2, 1911));
        C0053.m8424(map, C0060.m9352(m5470(), 331, 18, 2245), C0048.m7902(m5470(), 349, 12, 3240));
        C0053.m8424(map, C0001.m1189(m5470(), 361, 25, 3049), C0043.m7290(m5470(), 386, 1, 2829));
        C0053.m8424(map, C0061.m9361(m5470(), 387, 14, 2023), C0048.m7902(m5470(), 401, 4, 3140));
        C0053.m8424(map, C0017.m3646(m5470(), 405, 14, 527), C0019.m4107(m5470(), 419, 8, 1547));
        C0053.m8424(map, C0060.m9352(m5470(), 427, 14, 1717), C0040.m6584(m5470(), 441, 2, 2403));
        C0053.m8424(map, C0010.m2300(m5470(), 443, 14, 398), C0027.m5062(m5470(), 457, 8, 681));
        C0053.m8424(map, C0017.m3646(m5470(), 465, 15, 2834), C0027.m5062(m5470(), 480, 14, 1587));
    }

    public static void a(i iVar, ArrayList arrayList) {
        PrintStream printStreamM6087;
        String strM7763;
        C0047.m7777(iVar);
        Iterator itM7816 = C0047.m7816(arrayList);
        while (C0012.m2962(itM7816)) {
            Future future = (Future) C0048.m7949(itM7816);
            try {
                try {
                } catch (CancellationException e) {
                    printStreamM6087 = C0035.m6087();
                    StringBuilder sb = new StringBuilder();
                    C0018.m3933(sb, C0006.m1774(m5470(), 514, 8, 3018));
                    C0018.m3933(sb, C0036.m6261(e));
                    strM7763 = C0047.m7763(sb);
                    C0012.m2969(printStreamM6087, strM7763);
                } catch (ExecutionException e2) {
                    printStreamM6087 = C0035.m6087();
                    StringBuilder sb2 = new StringBuilder();
                    C0018.m3933(sb2, C0007.m1842(m5470(), 506, 8, 901));
                    C0018.m3933(sb2, C0036.m6261(e2));
                    strM7763 = C0047.m7763(sb2);
                    C0012.m2969(printStreamM6087, strM7763);
                } catch (TimeoutException e3) {
                    PrintStream printStreamM60872 = C0035.m6087();
                    StringBuilder sb3 = new StringBuilder();
                    C0018.m3933(sb3, C0043.m7290(m5470(), 522, 6, 2296));
                    C0018.m3933(sb3, C0036.m6261(e3));
                    C0012.m2969(printStreamM60872, C0047.m7763(sb3));
                    C0064.m9685(future, true);
                }
                if (!C0007.m1815((String) C0051.m8180(C0040.m6624(iVar)), C0044.m7494(iVar))) {
                    C0012.m2969(C0035.m6087(), C0054.m8574(m5470(), 494, 12, 1939));
                    return;
                } else {
                    String str = (String) C0059.m9267(future, 20L, C0050.m8151());
                    if (str != null) {
                        C0046.m7700(C0037.m6382(iVar), str);
                    }
                }
            } finally {
                C0007.m1814(C0033.m5869(iVar));
            }
        }
    }

    /* renamed from: ۦۧ۟ۥ, reason: contains not printable characters */
    public static short[] m5470() {
        if (C0047.m7837() >= 0) {
            return f518short;
        }
        return null;
    }

    public final ArrayList b(String str, ArrayList arrayList) throws InterruptedException {
        AtomicBoolean atomicBooleanM2956;
        if (str != null && C0007.m1815(str, C0044.m7494(this))) {
            ExecutorService executorServiceM3657 = C0017.m3657(this);
            if (executorServiceM3657 == null || C0001.m1208(executorServiceM3657) || (atomicBooleanM2956 = C0012.m2956(this)) == null || C0016.m3610(atomicBooleanM2956)) {
                return C0037.m6382(this) != null ? new ArrayList(C0037.m6382(this)) : new ArrayList();
            }
            CountDownLatch countDownLatchM5869 = C0033.m5869(this);
            if (countDownLatchM5869 != null) {
                C0051.m8243(countDownLatchM5869);
            }
            return C0037.m6382(this) != null ? new ArrayList(C0037.m6382(this)) : new ArrayList();
        }
        ExecutorService executorServiceM36572 = C0017.m3657(this);
        if (executorServiceM36572 != null && !C0001.m1208(executorServiceM36572)) {
            C0009.m2093(C0017.m3657(this));
            PrintStream printStreamM6087 = C0035.m6087();
            StringBuilder sb = new StringBuilder(C0016.m3525(m5470(), 528, 13, 2049));
            C0018.m3933(sb, C0044.m7494(this));
            C0012.m2969(printStreamM6087, C0047.m7763(sb));
        }
        ExecutorService executorServiceM1831 = C0007.m1831(this);
        if (executorServiceM1831 != null && !C0001.m1208(executorServiceM1831)) {
            C0009.m2093(C0007.m1831(this));
        }
        AtomicReference atomicReferenceM6624 = C0040.m6624(this);
        C0015.m3486(atomicReferenceM6624, str);
        this.a = str;
        this.e = new AtomicBoolean(false);
        this.b = new CopyOnWriteArrayList();
        this.g = new CountDownLatch(C0009.m2139(arrayList));
        this.c = C0021.m4370(15);
        ArrayList arrayList2 = new ArrayList();
        Iterator itM7816 = C0047.m7816(arrayList);
        while (C0012.m2962(itM7816)) {
            C0004.m1532(arrayList2, C0049.m8042(C0017.m3657(this), new h((String) C0048.m7949(itM7816), atomicReferenceM6624, str)));
        }
        ExecutorService executorServiceM5003 = C0027.m5003();
        this.d = executorServiceM5003;
        C0065.m9706(executorServiceM5003, new g(this, arrayList2, 0));
        CountDownLatch countDownLatchM58692 = C0033.m5869(this);
        if (countDownLatchM58692 != null) {
            C0051.m8243(countDownLatchM58692);
        }
        return C0037.m6382(this) != null ? new ArrayList(C0037.m6382(this)) : new ArrayList();
    }
}