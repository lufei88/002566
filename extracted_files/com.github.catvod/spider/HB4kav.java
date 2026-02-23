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
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.S0.C0029;
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
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.b.C0044;
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
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import com.github.catvod.spider.p000mergexbpq.r.C0014;
import com.github.catvod.spider.p000mergexbpq.x.C0015;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class HB4kav extends Spider {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f24short = {839, 865, 887, 864, 831, 851, 885, 887, 892, 870, 1754, 1784, 1773, 1790, 1787, 1787, 1782, 1720, 1698, 1721, 1703, 1719, 1727, 1728, 1790, 1785, 1779, 1784, 1760, 1764, 1719, 1753, 1731, 1719, 1702, 1703, 1721, 1703, 1708, 1719, 1728, 1752, 1728, 1697, 1699, 1726, 1719, 1750, 1767, 1767, 1787, 1778, 1728, 1778, 1781, 1756, 1790, 1763, 1720, 1698, 1700, 1696, 1721, 1700, 1697, 1719, 1727, 1756, 1759, 1731, 1754, 1755, 1723, 1719, 1787, 1790, 1788, 1778, 1719, 1744, 1778, 1780, 1788, 1784, 1726, 1719, 1748, 1791, 1765, 1784, 1786, 1778, 1720, 1702, 1703, 1710, 1721, 1703, 1721, 1703, 1721, 1703, 1719, 1732, 1782, 1777, 1782, 1765, 1790, 1720, 1698, 1700, 1696, 1721, 1700, 1697, 1842, 1832, 1849, 1837, 1836, 1840, 1325, 1382, 1378, 1381, 1339, 1315, 1379, 1343, 1298, 1382, 1328, 1312, 1326, 1336, 1324, 1340, 1381, 1299, 1287, 1389, 1297, 1302, 1388, 1338, 1334, 1280, 1324, 1306, 1337, 1333, 1311, 1403, 1285, 1285, 1309, 1301, 1342, 1335, 1312, 1336, 1311, 1341, 1297, 1314, 946, 942, 942, 938, 937, 992, 1013, 1013, 1006, 945, 1015, 955, 940, 1012, 953, 949, 951, 1013, 1329, 1390, 1407, 1401, 1403, 1331, 1878, 1808, 1804, 1813, 1812, 918, 913, 926, 919, 903, 917, 926, 987, 987, 987, 1266, 1279, 1248, 1208, 1240, 1218, 1243, 1279, 1250, 1267, 1275, 3314, 3327, 3296, 3256, 3298, 3319, 3313, 3301, 27851, -29060, 31937, 22375, 1445, 1448, 1463, 1519, 1461, 1448, 1461, 1453, 1444, 1505, 1535, 1505, 1440, 1955, 1982, 1955, 1979, 1970, 1093, 1119, 1096, 1099, 2646, 2651, 2628, 2588, 2626, 2653, 2625, 2630, 2647, 2624, 2578, 2572, 2578, 2643, 2578, 2572, 2578, 2651, 2655, 2645, 2382, 2383, 2398, 1373, 1360, 1359, 1303, 1355, 1372, 1354, 1344, 1372, 1368, 1355, 3270, 3290, 3290, 3294, 3293, 3220, 3201, 3201, 3226, 3269, 3203, 3279, 3288, 3200, 3277, 3265, 3267, 2342, 2363, 2342, 2366, 2359, 2919, 2806, 2811, 2788, 2748, 2786, 2813, 2785, 2790, 2807, 2784, 2738, 2732, 2738, 2803, 3143, 3165, 3146, 3145, 867, 878, 881, 809, 884, 868, 885, 866, 866, 873, 884, 879, 872, 883, 1152, 1630, 589, 800, 2455, 2526, 2523, 2521, 2457, 2382, 2382, 2382, 1315, 1385, 1334, 1744, 1678, 1731, 1742, 1740, 1737, 1742, 1733, -25141, 26902, 1847, 1847, 1847, 23310, -29498, 1831, 1880, 966, 964, 2344, 2346, 2355, 2348, 2336, 30620, -29841, 20686, 29583, 22987, 1391, 3088, 3084, 3084, 3080, 2769, 2765, 2765, 2761, 2762, 2691, 2710, 2710, 2701, 2770, 2708, 2776, 2767, 2711, 2778, 2774, 2772, 2214, 2234, 2208, 2215, 2230, 2224, 714, 715, 730, 2713, 2758, 2318, 2315, 2313, 2409, 858, 863, 861, 797, 2199, 2187, 2187, 2191, 2188, 2245, 2256, 2256, 2251, 2196, 2258, 2206, 2185, 2257, 2204, 2192, 2194, 2256, 2188, 2240, 2196, 2242, 2538, 2541, 2530, 2539, 2555, 2537, 2530, 2471, 2471, 2471, 1410, 1423, 1424, 1480, 1448, 1458, 1451, 1423, 1426, 1411, 1419, 1864, 1861, 1882, 1794, 1880, 1869, 1867, 1887, 25157, -32526, 32090, 22268, 1866, 1863, 1880, 1792, 1882, 1863, 1882, 1858, 1867, 1806, 1808, 1806, 1871, 1362, 1359, 1362, 1354, 1347, 1640, 1650, 1637, 1638, 2567, 2570, 2581, 2637, 2579, 2572, 2576, 2583, 2566, 2577, 2627, 2653, 2627, 2562, 2627, 2653, 2627, 2570, 2574, 2564, 2160, 2161, 2144, 1251, 1262, 1265, 1193, 1269, 1250, 1268, 1278, 1250, 1254, 1269, 630, 618, 618, 622, 621, 548, 561, 561, 554, 629, 563, 639, 616, 560, 637, 625, 627, 2523};
    public String a;

    public static HashMap a() {
        return C0019.m4127(C0004.m1549(m148(), 0, 10, 786), C0057.m8978(m148(), 10, 106, 1687), C0020.m4199(m148(), 116, 6, 1912), C0034.m6001(m148(), 122, 44, 1364));
    }

    /* renamed from: ۥۣۣ۟, reason: contains not printable characters */
    public static short[] m148() {
        if (C0037.m6350() <= 0) {
            return f24short;
        }
        return null;
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        ArrayList arrayList = new ArrayList();
        String strM9145 = C0058.m9145(C0053.m8477(m148(), 166, 18, 986), str, C0039.m6551(m148(), 184, 6, 1310), str2, C0019.m4107(m148(), 190, 5, 1912));
        PrintStream printStreamM6087 = C0035.m6087();
        StringBuilder sb = new StringBuilder(C0008.m1970(m148(), 195, 10, 1008));
        C0018.m3933(sb, strM9145);
        C0012.m2969(printStreamM6087, C0047.m7763(sb));
        Iterator itM7807 = C0047.m7807(C0030.m5333(C0016.m3577(C0032.m5769(strM9145, null)), C0029.m5256(m148(), 205, 11, 1174)));
        while (C0012.m2962(itM7807)) {
            m mVar = (m) C0048.m7949(itM7807);
            String strM4684 = C0024.m4684(C0030.m5333(mVar, C0062.m9389(m148(), 216, 8, 3222)));
            if (!C0058.m9127(strM4684, C0035.m6131(m148(), 224, 2, 3086)) && !C0058.m9127(strM4684, C0032.m5708(m148(), 226, 2, 1358))) {
                String strM4403 = C0022.m4403(m148(), 228, 13, 1473);
                String strM8058 = C0049.m8058(C0030.m5333(mVar, strM4403), C0004.m1549(m148(), 241, 5, 2007));
                String strM80582 = C0049.m8058(C0030.m5333(mVar, strM4403), C0043.m7290(m148(), 246, 4, 1069));
                C0055.m8732(C0026.m4915(C0065.m9775(m148(), 284, 17, 3246), strM80582), strM8058, C0049.m8058(C0030.m5333(mVar, C0006.m1774(m148(), 250, 20, 2610)), C0018.m3917(m148(), 270, 3, 2365)), C0064.m9669(C0036.m6243(mVar, C0014.m3332(m148(), 273, 11, 1337))), arrayList);
            }
        }
        return C0020.m4216(C0011.m2808(C0038.m6456(str2)), C0047.m7818(1, str2), C0011.m2808(20), C0054.m8556(str2, 1, 20), arrayList);
    }

    public String detailContent(List<String> list) {
        String strM5565;
        String strM2973;
        String strM8814;
        String strM3917;
        h hVarM3577 = C0016.m3577(C0032.m5769((String) C0048.m7915(list, 0), C0042.m7176()));
        String strM6001 = C0034.m6001(m148(), 301, 5, 2386);
        String str = C0002.m1240(C0024.m4684(C0030.m5333(hVarM3577, strM6001)), C0001.m1189(m148(), 306, 1, 2887), 2)[0];
        d dVarM5333 = C0030.m5333(hVarM3577, C0005.m1645(m148(), 307, 14, 2706));
        String strM8477 = C0053.m8477(m148(), 321, 4, 3119);
        String strM8058 = C0049.m8058(dVarM5333, strM8477);
        d dVarM53332 = C0030.m5333(hVarM3577, C0011.m2805(m148(), 325, 14, 775));
        PrintStream printStreamM6087 = C0035.m6087();
        StringBuilder sb = new StringBuilder();
        C0018.m3933(sb, str);
        C0018.m3933(sb, strM8058);
        C0012.m2969(printStreamM6087, C0047.m7763(sb));
        StringBuilder sb2 = new StringBuilder(C0007.m1840());
        Iterator itM7807 = C0047.m7807(dVarM53332);
        while (true) {
            boolean zM2962 = C0012.m2962(itM7807);
            strM5565 = C0031.m5565(m148(), 339, 1, 1187);
            strM2973 = C0012.m2973(m148(), 340, 1, 1658);
            strM8814 = C0055.m8814(m148(), 341, 1, 556);
            strM3917 = C0018.m3917(m148(), 342, 1, 862);
            if (!zM2962) {
                break;
            }
            d dVarM53333 = C0030.m5333((m) C0048.m7949(itM7807), strM8814);
            String strM80582 = C0049.m8058(dVarM53333, strM6001);
            if (C0057.m8953(strM80582)) {
                strM80582 = str;
            }
            String strM80583 = C0049.m8058(dVarM53333, strM8477);
            if (C0057.m8953(strM80583)) {
                strM80583 = (String) C0048.m7915(list, 0);
            }
            C0018.m3933(sb2, strM80582);
            C0018.m3933(sb2, strM2973);
            StringBuilder sb3 = new StringBuilder();
            C0018.m3933(sb3, strM80583);
            C0018.m3933(sb3, strM3917);
            C0018.m3933(sb3, str);
            C0018.m3933(sb3, C0039.m6551(m148(), 343, 5, 2537));
            C0018.m3933(sb2, C0047.m7763(sb3));
            C0018.m3933(sb2, strM3917);
            C0018.m3933(sb2, strM80582);
            C0018.m3933(sb2, strM5565);
        }
        C0018.m3933(sb2, C0034.m6001(m148(), 348, 3, 2410));
        Iterator itM78072 = C0047.m7807(dVarM53332);
        while (C0012.m2962(itM78072)) {
            d dVarM53334 = C0030.m5333((m) C0048.m7949(itM78072), strM8814);
            String strM80584 = C0049.m8058(dVarM53334, strM6001);
            if (C0057.m8953(strM80584)) {
                strM80584 = str;
            }
            String strM80585 = C0049.m8058(dVarM53334, strM8477);
            if (C0057.m8953(strM80585)) {
                strM80585 = (String) C0048.m7915(list, 0);
            }
            C0018.m3933(sb2, strM80584);
            C0018.m3933(sb2, strM2973);
            StringBuilder sb4 = new StringBuilder();
            C0018.m3933(sb4, strM80585);
            C0018.m3933(sb4, strM3917);
            C0018.m3933(sb4, str);
            C0018.m3933(sb4, C0057.m8978(m148(), 351, 3, 1373));
            C0018.m3933(sb2, C0047.m7763(sb4));
            C0018.m3933(sb2, strM3917);
            C0018.m3933(sb2, strM80584);
            C0018.m3933(sb2, strM5565);
        }
        String strM4684 = C0024.m4684(C0030.m5333(hVarM3577, C0042.m7151(m148(), 354, 8, 1696)));
        com.github.catvod.spider.merge.E.m mVar = new com.github.catvod.spider.merge.E.m();
        StringBuilder sb5 = new StringBuilder();
        C0018.m3933(sb5, C0055.m8703());
        C0018.m3933(sb5, strM4684);
        C0027.m5000(mVar, C0047.m7763(sb5));
        C0011.m2828(mVar, (String) C0048.m7915(list, 0));
        C0026.m4947(mVar, strM8058);
        C0005.m1628(mVar, str);
        C0054.m8596(mVar, C0013.m3106(m148(), 362, 9, 1811));
        C0044.m7449(mVar, C0000.m1096(sb2));
        return C0053.m8428(mVar);
    }

    public String homeContent(boolean z) {
        ArrayList arrayList = new ArrayList();
        List listM1203 = C0001.m1203(new String[]{C0052.m8337(m148(), 371, 2, 946), C0013.m3106(m148(), 373, 5, 2373)});
        List listM12032 = C0001.m1203(new String[]{C0036.m6188(m148(), 378, 3, 681), C0009.m2037(m148(), 381, 2, 1722)});
        for (int i = 0; i < C0064.m9636(listM1203); i++) {
            C0004.m1532(arrayList, new b((String) C0048.m7915(listM1203, i), (String) C0048.m7915(listM12032, i), null));
        }
        return C0003.m1448(C0030.m5337(this), null, arrayList);
    }

    public void init(Context context, String str) {
        C0051.m8194(C0035.m6110());
        if (str != null) {
            this.a = str;
        }
    }

    public String playerContent(String str, String str2, List<String> list) {
        C0036.m6219();
        String[] strArrM4752 = C0024.m4752(str2, C0001.m1189(m148(), 383, 1, 1297));
        String strM8125 = (strArrM4752.length <= 0 || C0057.m8953(strArrM4752[0])) ? null : strArrM4752[0];
        String str3 = (strArrM4752.length <= 1 || C0057.m8953(strArrM4752[1])) ? null : strArrM4752[1];
        String str4 = (strArrM4752.length <= 2 || C0057.m8953(strArrM4752[2])) ? null : strArrM4752[2];
        String str5 = (strArrM4752.length <= 3 || C0057.m8953(strArrM4752[3])) ? null : strArrM4752[3];
        if (!C0058.m9127(strM8125, C0033.m5852(m148(), 384, 4, 3192))) {
            strM8125 = C0050.m8125(C0008.m1970(m148(), 388, 17, 2745), strM8125);
        }
        String strM8058 = C0049.m8058(C0030.m5333(C0016.m3577(C0032.m5769(strM8125, null)), C0054.m8574(m148(), 405, 6, 2261)), C0024.m4740(m148(), 411, 3, 697));
        String strM2827 = C0011.m2827(strM8125, str3, str5);
        if (C0057.m8953(strM8058)) {
            g gVarM9311 = C0060.m9311(1, strM8125);
            C0057.m9029(gVarM9311, C0042.m7176());
            C0002.m1282(gVarM9311, strM2827);
            return C0033.m5828(gVarM9311);
        }
        String strM7151 = C0042.m7151(m148(), 414, 2, 2733);
        if (C0058.m9127(str4, strM7151)) {
            strM8058 = C0015.m3446(C0015.m3446(strM8058, C0050.m8131(m148(), 416, 4, 2361), strM7151), C0000.m1077(m148(), 420, 4, 877), strM7151);
        }
        g gVarM93112 = C0060.m9311(0, strM8058);
        C0057.m9029(gVarM93112, C0042.m7176());
        C0002.m1282(gVarM93112, strM2827);
        return C0033.m5828(gVarM93112);
    }

    public String searchContent(String str, String str2, boolean z) {
        ArrayList arrayList = new ArrayList();
        String strM4915 = C0026.m4915(C0018.m3917(m148(), 424, 22, 2303), str);
        PrintStream printStreamM6087 = C0035.m6087();
        StringBuilder sb = new StringBuilder(C0042.m7151(m148(), 446, 10, 2444));
        C0018.m3933(sb, strM4915);
        C0012.m2969(printStreamM6087, C0047.m7763(sb));
        Iterator itM7807 = C0047.m7807(C0030.m5333(C0016.m3577(C0032.m5769(strM4915, null)), C0057.m8978(m148(), 456, 11, 1510)));
        while (C0012.m2962(itM7807)) {
            m mVar = (m) C0048.m7949(itM7807);
            String strM4684 = C0024.m4684(C0030.m5333(mVar, C0060.m9352(m148(), 467, 8, 1836)));
            if (!C0058.m9127(strM4684, C0002.m1305(m148(), 475, 2, 640)) && !C0058.m9127(strM4684, C0012.m2973(m148(), 477, 2, 1237))) {
                String strM8131 = C0050.m8131(m148(), 479, 13, 1838);
                String strM8058 = C0049.m8058(C0030.m5333(mVar, strM8131), C0004.m1549(m148(), 492, 5, 1318));
                String strM80582 = C0049.m8058(C0030.m5333(mVar, strM8131), C0020.m4199(m148(), 497, 4, 1536));
                C0055.m8732(C0026.m4915(C0061.m9361(m148(), 535, 17, 542), strM80582), strM8058, C0049.m8058(C0030.m5333(mVar, C0041.m6779(m148(), 501, 20, 2659)), C0017.m3646(m148(), 521, 3, 2051)), C0064.m9669(C0036.m6243(mVar, C0026.m4951(m148(), 524, 11, 1159))), arrayList);
            }
        }
        return C0047.m7783(arrayList);
    }

    public String searchContent(String str, boolean z) {
        return C0022.m4439(this, C0056.m8909(str), C0026.m4951(m148(), 552, 1, 2538), true);
    }
}