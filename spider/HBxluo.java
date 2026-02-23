package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.E.b;
import com.github.catvod.spider.merge.E.g;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.N.C0023;
import com.github.catvod.spider.merge.P0.C0024;
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
import com.github.catvod.spider.merge.a0.C0042;
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
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
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
import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* loaded from: classes.dex */
public class HBxluo extends Spider {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f67short = {2335, 2361, 2351, 2360, 2407, 2315, 2349, 2351, 2340, 2366, 2515, 2545, 2532, 2551, 2546, 2546, 2559, 2481, 2475, 2480, 2478, 2494, 2486, 2505, 2551, 2544, 2554, 2545, 2537, 2541, 2494, 2512, 2506, 2494, 2479, 2478, 2480, 2478, 2469, 2494, 2505, 2551, 2544, 2472, 2474, 2469, 2494, 2534, 2472, 2474, 2487, 2494, 2527, 2542, 2542, 2546, 2555, 2505, 2555, 2556, 2517, 2551, 2538, 2481, 2475, 2477, 2473, 2480, 2477, 2472, 2494, 2486, 2517, 2518, 2506, 2515, 2514, 2482, 2494, 2546, 2551, 2549, 2555, 2494, 2521, 2555, 2557, 2549, 2545, 2487, 2494, 2525, 2550, 2540, 2545, 2547, 2555, 2481, 2479, 2477, 2476, 2480, 2478, 2480, 2478, 2480, 2478, 2494, 2509, 2559, 2552, 2559, 2540, 2551, 2481, 2475, 2477, 2473, 2480, 2477, 2472, 1479, 1483, 1483, 1487, 1485, 1473, 2253, 2257, 2257, 2261, 2262, 2207, 2186, 2186, 2258, 2258, 2258, 2187, 2269, 2249, 2268, 2262, 2197, 2196, 2187, 2246, 2250, 2248, 2186, 2100, 2155, 2170, 2172, 2174, 2102, 1624, 1566, 1538, 1563, 1562, 986, 989, 978, 987, 971, 985, 978, 919, 919, 919, 2965, 2968, 2951, 3039, 3007, 2981, 3004, 2968, 2949, 2964, 2972, 1191, 1194, 1205, 1261, 1207, 1186, 1188, 1200, 25960, -30753, 32355, 21957, 2328, 2325, 2314, 2386, 2312, 2325, 2312, 2320, 2329, 2396, 2370, 2396, 2333, 1937, 1932, 1937, 1929, 1920, 1773, 1783, 1760, 1763, 1444, 1449, 1462, 1518, 1456, 1455, 1459, 1460, 1445, 1458, 1504, 1534, 1504, 1441, 1504, 1534, 1504, 1449, 1453, 1447, 3323, 3322, 3307, 1667, 1678, 1681, 1737, 1685, 1666, 1684, 1694, 1666, 1670, 1685, 2710, 2698, 2698, 2702, 2701, 2756, 2769, 2769, 2697, 2697, 2697, 2768, 2694, 2706, 2695, 2701, 2766, 2767, 2768, 2717, 2705, 2707, 833, 860, 833, 857, 848, 776, 313, 308, 299, 371, 301, 306, 302, 297, 312, 303, 381, 355, 381, 316, 2859, 2865, 2854, 2853, 1014, 1019, 996, 956, 993, 1009, 992, 1015, 1015, 1020, 993, 1018, 1021, 998, 1824, 1241, 851, 1276, 2317, 2372, 2369, 2371, 2307, 814, 814, 814, 2587, 2641, 2574, 2782, 2688, 2765, 2752, 2754, 2759, 2752, 2763, -26622, 27871, 766, 766, 766, 24263, -30449, 750, 657, 2123, 2121, 2607, 2605, 2612, 2603, 2599, 31130, -31383, 24264, 30247, 23651, 705, 733, 733, 729, 730, 659, 646, 646, 734, 734, 734, 647, 721, 709, 720, 730, 665, 664, 647, 714, 710, 708, 646, 730, 716, 712, 731, 714, 705, 646, 735, 716, 731, 704, 719, 720, 746, 710, 717, 716, 700, -24900, 18303, 22073, 2254, 2258, 2258, 2262, 2261, 2204, 2185, 2185, 2257, 2257, 2257, 2184, 2270, 2250, 2271, 2261, 2198, 2199, 2184, 2245, 2249, 2251, 2185, 2261, 2243, 2247, 2260, 2245, 2254, 2185, 2179, 2275, 2206, 2179, 2279, 2272, 2179, 2207, 2276, 2179, 2275, 2194, 2179, 2276, 2276, 2179, 2207, 2207, 2201, 2245, 2249, 2242, 2243, 2203, 2077, 2319, 2825, 2942, 1080, 1054, 1032, 1055, 1088, 1068, 1034, 1032, 1027, 1049, 1741, 1775, 1786, 1769, 1772, 1772, 1761, 1711, 1717, 1710, 1712, 1696, 1704, 1751, 1769, 1774, 1764, 1775, 1783, 1779, 1696, 1742, 1748, 1696, 1713, 1712, 1710, 1712, 1723, 1696, 1751, 1769, 1774, 1718, 1716, 1723, 1696, 1784, 1718, 1716, 1705, 1696, 1729, 1776, 1776, 1772, 1765, 1751, 1765, 1762, 1739, 1769, 1780, 1711, 1717, 1715, 1719, 1710, 1715, 1718, 1696, 1704, 1739, 1736, 1748, 1741, 1740, 1708, 1696, 1772, 1769, 1771, 1765, 1696, 1735, 1765, 1763, 1771, 1775, 1705, 1696, 1731, 1768, 1778, 1775, 1773, 1765, 1711, 1713, 1715, 1714, 1710, 1712, 1710, 1712, 1710, 1712, 1696, 1747, 1761, 1766, 1761, 1778, 1769, 1711, 1717, 1715, 1719, 1710, 1715, 1718, 2351, 1350, 684, 688, 688, 692, 1805, 1809, 1809, 1813, 1814, 1887, 1866, 1866, 1810, 1810, 1810, 1867, 1821, 1801, 1820, 1814, 1877, 1876, 1867, 1798, 1802, 1800, 1872, 1868, 1878, 1873, 1856, 1862, 2393, 2392, 2377, 2036, 1967, 1956, 2038, 1967, 1962, 1957, 1958, 1982, 2029, 1953, 1982, 1958, 1954, 1957, 1964, 2038, 1833, 1893, 1894, 1916, 1895, 1914, 1842, 2938, 2853, 1438, 1435, 1433, 1529, 1647, 1642, 1640, 1576, 3126, 3114, 3114, 3118, 3117, 3172, 3185, 3185, 3178, 3125, 3187, 3135, 3112, 3184, 3133, 3121, 3123, 3185, 3117, 3169, 3125, 3171, 2831, 2824, 2823, 2830, 2846, 2828, 2823, 2882, 2882, 2882, 2132, 2137, 2118, 2078, 2174, 2148, 2173, 2137, 2116, 2133, 2141, 1354, 1351, 1368, 1280, 1370, 1359, 1353, 1373, 25266, -32763, 32503, 21841, 2105, 2100, 2091, 2163, 2089, 2100, 2089, 2097, 2104, 2173, 2147, 2173, 2108, 3151, 3154, 3151, 3159, 3166, 2219, 2225, 2214, 2213, 913, 924, 899, 987, 901, 922, 902, 897, 912, 903, 981, 971, 981, 916, 981, 971, 981, 924, 920, 914, 3276, 3277, 3292, 1603, 1614, 1617, 1545, 1621, 1602, 1620, 1630, 1602, 1606, 1621, 3233, 3261, 3261, 3257, 3258, 3315, 3302, 3302, 3262, 3262, 3262, 3303, 3249, 3237, 3248, 3258, 3321, 3320, 3303, 3242, 3238, 3236, 2678};

    public static HashMap a() {
        HashMap map = new HashMap();
        C0053.m8424(map, C0037.m6307(m413(), 0, 10, 2378), C0056.m8911(m413(), 10, 111, 2462));
        C0053.m8424(map, C0003.m1398(m413(), 121, 6, 1444), null);
        return map;
    }

    /* renamed from: ۟۠ۧ۟ۤ, reason: not valid java name and contains not printable characters */
    public static ResponseBody m407(Object obj) {
        if (C0045.m7538() < 0) {
            return ((Response) obj).body();
        }
        return null;
    }

    /* renamed from: ۟۠ۧۦۨ, reason: not valid java name and contains not printable characters */
    public static Call m408(Object obj, Object obj2) {
        if (C0012.m3024() > 0) {
            return ((OkHttpClient) obj).newCall((Request) obj2);
        }
        return null;
    }

    /* renamed from: ۣۣ۟ۤۤ, reason: not valid java name and contains not printable characters */
    public static Request.Builder m409(Object obj) {
        if (C0031.m5628() >= 0) {
            return ((Request.Builder) obj).get();
        }
        return null;
    }

    /* renamed from: ۣ۟ۦ۠ۥ, reason: not valid java name and contains not printable characters */
    public static String m410(Object obj) {
        if (C0031.m5628() >= 0) {
            return ((ResponseBody) obj).string();
        }
        return null;
    }

    /* renamed from: ۟ۦۥۥۣ, reason: not valid java name and contains not printable characters */
    public static Response m411(Object obj) {
        if (C0007.m1886() > 0) {
            return ((Call) obj).execute();
        }
        return null;
    }

    /* renamed from: ۠ۦ۠ۢ, reason: not valid java name and contains not printable characters */
    public static Request m412(Object obj) {
        if (C0039.m6529() <= 0) {
            return ((Request.Builder) obj).build();
        }
        return null;
    }

    /* renamed from: ۣۦۧ۠, reason: not valid java name and contains not printable characters */
    public static short[] m413() {
        if (C0004.m1557() <= 0) {
            return f67short;
        }
        return null;
    }

    /* renamed from: ۤۨۤۨ, reason: not valid java name and contains not printable characters */
    public static Request.Builder m414(Object obj, Object obj2) {
        if (C0064.m9659() < 0) {
            return ((Request.Builder) obj).url((String) obj2);
        }
        return null;
    }

    /* renamed from: ۥۣ۠۠, reason: contains not printable characters */
    public static Request.Builder m415(Object obj, Object obj2, Object obj3) {
        if (C0042.m7147() < 0) {
            return ((Request.Builder) obj).addHeader((String) obj2, (String) obj3);
        }
        return null;
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        ArrayList arrayList = new ArrayList();
        String strM9145 = C0058.m9145(C0018.m3917(m413(), 127, 23, 2213), str, C0008.m1970(m413(), 150, 6, 2075), str2, C0017.m3646(m413(), 156, 5, 1654));
        PrintStream printStreamM6087 = C0035.m6087();
        StringBuilder sb = new StringBuilder(C0060.m9352(m413(), 161, 10, 956));
        C0018.m3933(sb, strM9145);
        C0012.m2969(printStreamM6087, C0047.m7763(sb));
        Iterator itM7807 = C0047.m7807(C0030.m5333(C0016.m3577(C0032.m5769(strM9145, null)), C0042.m7151(m413(), 171, 11, 3057)));
        while (C0012.m2962(itM7807)) {
            m mVar = (m) C0048.m7949(itM7807);
            String strM4684 = C0024.m4684(C0030.m5333(mVar, C0040.m6584(m413(), 182, 8, 1219)));
            if (!C0058.m9127(strM4684, C0041.m6779(m413(), 190, 2, 1453)) && !C0058.m9127(strM4684, C0031.m5565(m413(), 192, 2, 2028))) {
                String strM8978 = C0057.m8978(m413(), 194, 13, 2428);
                String strM8058 = C0049.m8058(C0030.m5333(mVar, strM8978), C0024.m4740(m413(), 207, 5, 2021));
                String strM80582 = C0049.m8058(C0030.m5333(mVar, strM8978), C0033.m5852(m413(), 212, 4, 1669));
                C0055.m8732(C0026.m4915(C0065.m9775(m413(), 250, 22, 2814), strM80582), strM8058, C0049.m8058(C0030.m5333(mVar, C0049.m8007(m413(), 216, 20, 1472)), C0057.m8978(m413(), 236, 3, 3208)), C0064.m9669(C0036.m6243(mVar, C0065.m9775(m413(), 239, 11, 1767))), arrayList);
            }
        }
        return C0020.m4216(C0011.m2808(C0038.m6456(str2)), C0047.m7818(1, str2), C0011.m2808(20), C0054.m8556(str2, 1, 20), arrayList);
    }

    public String detailContent(List<String> list) {
        String strM4536;
        String strM6307;
        String strM6779;
        String strM8007;
        h hVarM3577 = C0016.m3577(C0032.m5769((String) C0048.m7915(list, 0), C0019.m4056()));
        String strM6001 = C0034.m6001(m413(), 272, 5, 821);
        String str = C0002.m1240(C0024.m4684(C0030.m5333(hVarM3577, strM6001)), C0049.m8007(m413(), 277, 1, 808), 2)[0];
        d dVarM5333 = C0030.m5333(hVarM3577, C0055.m8814(m413(), 278, 14, 349));
        String strM1398 = C0003.m1398(m413(), 292, 4, 2883);
        String strM8058 = C0049.m8058(dVarM5333, strM1398);
        d dVarM53332 = C0030.m5333(hVarM3577, C0061.m9361(m413(), 296, 14, 914));
        PrintStream printStreamM6087 = C0035.m6087();
        StringBuilder sb = new StringBuilder();
        C0018.m3933(sb, str);
        C0018.m3933(sb, strM8058);
        C0012.m2969(printStreamM6087, C0047.m7763(sb));
        StringBuilder sb2 = new StringBuilder(C0007.m1840());
        Iterator itM7807 = C0047.m7807(dVarM53332);
        while (true) {
            boolean zM2962 = C0012.m2962(itM7807);
            strM4536 = C0023.m4536(m413(), 310, 1, 1795);
            strM6307 = C0037.m6307(m413(), 311, 1, 1277);
            strM6779 = C0041.m6779(m413(), 312, 1, 818);
            strM8007 = C0049.m8007(m413(), 313, 1, 1154);
            if (!zM2962) {
                break;
            }
            d dVarM53333 = C0030.m5333((m) C0048.m7949(itM7807), strM6779);
            String strM80582 = C0049.m8058(dVarM53333, strM6001);
            if (C0057.m8953(strM80582)) {
                strM80582 = str;
            }
            String strM80583 = C0049.m8058(dVarM53333, strM1398);
            if (C0057.m8953(strM80583)) {
                strM80583 = (String) C0048.m7915(list, 0);
            }
            C0018.m3933(sb2, strM80582);
            C0018.m3933(sb2, strM6307);
            StringBuilder sb3 = new StringBuilder();
            C0018.m3933(sb3, strM80583);
            C0018.m3933(sb3, strM8007);
            C0018.m3933(sb3, str);
            C0018.m3933(sb3, C0064.m9599(m413(), 314, 5, 2419));
            C0018.m3933(sb2, C0047.m7763(sb3));
            C0018.m3933(sb2, strM8007);
            C0018.m3933(sb2, strM80582);
            C0018.m3933(sb2, strM4536);
        }
        C0018.m3933(sb2, C0060.m9352(m413(), 319, 3, 778));
        Iterator itM78072 = C0047.m7807(dVarM53332);
        while (C0012.m2962(itM78072)) {
            d dVarM53334 = C0030.m5333((m) C0048.m7949(itM78072), strM6779);
            String strM80584 = C0049.m8058(dVarM53334, strM6001);
            if (C0057.m8953(strM80584)) {
                strM80584 = str;
            }
            String strM80585 = C0049.m8058(dVarM53334, strM1398);
            if (C0057.m8953(strM80585)) {
                strM80585 = (String) C0048.m7915(list, 0);
            }
            C0018.m3933(sb2, strM80584);
            C0018.m3933(sb2, strM6307);
            StringBuilder sb4 = new StringBuilder();
            C0018.m3933(sb4, strM80585);
            C0018.m3933(sb4, strM8007);
            C0018.m3933(sb4, str);
            C0018.m3933(sb4, C0041.m6779(m413(), 322, 3, 2661));
            C0018.m3933(sb2, C0047.m7763(sb4));
            C0018.m3933(sb2, strM8007);
            C0018.m3933(sb2, strM80584);
            C0018.m3933(sb2, strM4536);
        }
        String strM4684 = C0024.m4684(C0030.m5333(hVarM3577, C0011.m2805(m413(), 325, 8, 2734)));
        com.github.catvod.spider.merge.E.m mVar = new com.github.catvod.spider.merge.E.m();
        StringBuilder sb5 = new StringBuilder();
        C0018.m3933(sb5, C0055.m8703());
        C0018.m3933(sb5, strM4684);
        C0027.m5000(mVar, C0047.m7763(sb5));
        C0011.m2828(mVar, (String) C0048.m7915(list, 0));
        C0026.m4947(mVar, strM8058);
        C0005.m1628(mVar, str);
        C0054.m8596(mVar, C0000.m1077(m413(), 333, 9, 730));
        C0044.m7449(mVar, C0000.m1096(sb2));
        return C0053.m8428(mVar);
    }

    public String homeContent(boolean z) {
        ArrayList arrayList = new ArrayList();
        List listM1203 = C0001.m1203(new String[]{C0061.m9361(m413(), 342, 2, 2111), C0045.m7657(m413(), 344, 5, 2626)});
        List listM12032 = C0001.m1203(new String[]{C0032.m5708(m413(), 349, 3, 3247), C0014.m3332(m413(), 352, 2, 786)});
        for (int i = 0; i < C0064.m9636(listM1203); i++) {
            C0004.m1532(arrayList, new b((String) C0048.m7915(listM1203, i), (String) C0048.m7915(listM12032, i), null));
        }
        return C0003.m1448(null, null, arrayList);
    }

    public void init(Context context, String str) {
        C0051.m8194(C0035.m6110());
        while (true) {
            String strM4253 = C0020.m4253(C0026.m4902(C0004.m1549(m413(), 354, 40, 681), C0019.m4056()));
            boolean zM9127 = C0058.m9127(strM4253, C0027.m5062(m413(), 394, 1, 663));
            String strM3484 = C0015.m3484(m413(), 395, 3, 2542);
            String strM9389 = C0062.m9389(m413(), 398, 54, 2214);
            String strM1840 = C0007.m1840();
            String strM7151 = C0042.m7151(m413(), 452, 1, 2080);
            String strM1398 = C0003.m1398(m413(), 453, 1, 2360);
            if (zM9127 && !C0058.m9127(strM4253, strM1398)) {
                strM4253 = C0015.m3446(strM4253, strM7151, strM1840);
                String[] strArrM4752 = C0024.m4752(strM4253, C0044.m7509(m413(), 454, 2, 2901));
                int iM6456 = C0038.m6456(strArrM4752[1]) + C0038.m6456(strArrM4752[0]);
                OkHttpClient okHttpClient = new OkHttpClient();
                Request.Builder builder = new Request.Builder();
                StringBuilder sb = new StringBuilder(strM9389);
                C0036.m6177(sb, iM6456);
                C0058.m9127(C0000.m1096(m410(m407(m411(m408(okHttpClient, m412(m415(m409(m414(builder, C0047.m7763(sb))), C0063.m9585(m413(), 456, 10, 1133), C0052.m8337(m413(), 466, 111, 1664)))))))), strM3484);
            }
            String strM6551 = C0039.m6551(m413(), 577, 1, 2391);
            if (C0058.m9127(strM4253, strM6551) && !C0058.m9127(strM4253, strM1398)) {
                String[] strArrM47522 = C0024.m4752(C0015.m3446(strM4253, strM7151, strM1840), strM6551);
                C0058.m9127(C0008.m2029(C0007.m1803(C0040.m6632(C0038.m6456(strArrM47522[1]) + C0038.m6456(strArrM47522[0]), strM9389), C0019.m4056(), C0019.m4056())), strM3484);
            }
        }
    }

    public String playerContent(String str, String str2, List<String> list) {
        C0036.m6219();
        String[] strArrM4752 = C0024.m4752(str2, C0007.m1842(m413(), 578, 1, 1336));
        String strM8125 = (strArrM4752.length <= 0 || C0057.m8953(strArrM4752[0])) ? null : strArrM4752[0];
        String str3 = (strArrM4752.length <= 1 || C0057.m8953(strArrM4752[1])) ? null : strArrM4752[1];
        String str4 = (strArrM4752.length <= 2 || C0057.m8953(strArrM4752[2])) ? null : strArrM4752[2];
        String str5 = (strArrM4752.length <= 3 || C0057.m8953(strArrM4752[3])) ? null : strArrM4752[3];
        if (!C0058.m9127(strM8125, C0032.m5708(m413(), 579, 4, 708))) {
            strM8125 = C0050.m8125(C0008.m1970(m413(), 583, 22, 1893), strM8125);
        }
        String strM8058 = C0049.m8058(C0030.m5333(C0016.m3577(C0032.m5769(strM8125, null)), C0056.m8911(m413(), 605, 6, 1827)), C0037.m6307(m413(), 611, 3, 2346));
        StringBuilder sb = new StringBuilder();
        C0018.m3933(sb, C0051.m8217());
        C0018.m3933(sb, C0015.m3484(m413(), 614, 17, 1995));
        C0018.m3933(sb, str3);
        C0018.m3933(sb, C0008.m1970(m413(), 631, 7, 1807));
        C0018.m3933(sb, str5);
        String strM7763 = C0047.m7763(sb);
        if (C0057.m8953(strM8058)) {
            g gVarM9311 = C0060.m9311(1, strM8125);
            C0057.m9029(gVarM9311, C0019.m4056());
            C0002.m1282(gVarM9311, strM7763);
            return C0033.m5828(gVarM9311);
        }
        String strM5362 = C0030.m5362(m413(), 638, 2, 2894);
        if (C0058.m9127(str4, strM5362)) {
            strM8058 = C0015.m3446(C0015.m3446(strM8058, C0002.m1305(m413(), 640, 4, 1449), strM5362), C0003.m1398(m413(), 644, 4, 1624), strM5362);
        }
        g gVarM93112 = C0060.m9311(0, strM8058);
        C0057.m9029(gVarM93112, C0019.m4056());
        C0002.m1282(gVarM93112, strM7763);
        return C0033.m5828(gVarM93112);
    }

    public String searchContent(String str, String str2, boolean z) {
        ArrayList arrayList = new ArrayList();
        String strM4915 = C0026.m4915(C0031.m5565(m413(), 648, 22, 3166), str);
        PrintStream printStreamM6087 = C0035.m6087();
        StringBuilder sb = new StringBuilder(C0046.m7718(m413(), 670, 10, 2921));
        C0018.m3933(sb, strM4915);
        C0012.m2969(printStreamM6087, C0047.m7763(sb));
        Iterator itM7807 = C0047.m7807(C0030.m5333(C0016.m3577(C0032.m5769(strM4915, null)), C0047.m7833(m413(), 680, 11, 2096)));
        while (C0012.m2962(itM7807)) {
            m mVar = (m) C0048.m7949(itM7807);
            String strM4684 = C0024.m4684(C0030.m5333(mVar, C0033.m5852(m413(), 691, 8, 1326)));
            if (!C0058.m9127(strM4684, C0012.m2973(m413(), 699, 2, 631)) && !C0058.m9127(strM4684, C0044.m7509(m413(), 701, 2, 1912))) {
                String strM5109 = C0028.m5109(m413(), 703, 13, 2141);
                String strM8058 = C0049.m8058(C0030.m5333(mVar, strM5109), C0044.m7509(m413(), 716, 5, 3131));
                String strM80582 = C0049.m8058(C0030.m5333(mVar, strM5109), C0036.m6188(m413(), 721, 4, 2243));
                C0055.m8732(C0026.m4915(C0049.m8007(m413(), 759, 22, 3273), strM80582), strM8058, C0049.m8058(C0030.m5333(mVar, C0063.m9585(m413(), 725, 20, 1013)), C0018.m3917(m413(), 745, 3, 3263)), C0064.m9669(C0036.m6243(mVar, C0055.m8814(m413(), 748, 11, 1575))), arrayList);
            }
        }
        return C0047.m7783(arrayList);
    }

    public String searchContent(String str, boolean z) {
        return C0053.m8450(this, C0056.m8909(str), C0034.m6001(m413(), 781, 1, 2631), true);
    }
}