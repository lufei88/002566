package com.github.catvod.spider;

import android.content.Context;
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
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.T0.h;
import com.github.catvod.spider.merge.T0.m;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.V0.d;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.o0.C0056;
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
import com.github.catvod.spider.p000mergexbpq.a0.C0006;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.github.catvod.spider.p000mergexbpq.c0.C0010;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class Test extends Spider {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f107short = {1364, 1394, 1380, 1395, 1324, 1344, 1382, 1380, 1391, 1397, 1300, 1303, 1311, 1296, 1294, 1303, 1311, 1296, 1363, 1311, 1296, 1306, 1292, 1297, 1303, 1306, 1361, 1357, 1352, 1358, 1910, 1900, 1917, 1897, 1896, 1908, 1445, 1518, 1514, 1517, 1459, 1451, 1515, 1463, 1434, 1518, 1464, 1448, 1446, 1456, 1444, 1460, 1517, 1435, 1423, 1509, 1433, 1438, 1508, 1458, 1470, 1416, 1444, 1426, 1457, 1469, 1431, 1523, 1421, 1421, 1429, 1437, 1462, 1471, 1448, 1456, 1431, 1461, 1433, 1450, 1768, 1780, 1780, 1776, 1722, 1711, 1711, 1715, 1720, 1710, 1717, 1717, 1710, 1714, 1717, 1712, 1710, 1713, 1716, 1721, 1722, 1713, 1715, 1713, 1716, 1711, 1779, 1711, 1818, 1884, 1856, 1881, 1880, 3265, 3270, 3273, 3264, 3280, 3266, 3273, 3212, 3212, 3212, 1523, 1468, 1535, 1533, 1526, 1511, 1534, 1527, 1471, 1506, 1533, 1505, 1510, 1527, 1504, 1471, 1531, 1510, 1527, 1535, 1468, 1535, 1533, 1526, 1511, 1534, 1527, 1471, 1531, 1510, 1527, 1535, 2765, 2768, 2765, 2773, 2780, 3172, 3198, 3177, 3178, 2382, 2378, 2368, 2313, 2379, 2374, 2397, 2398, 2313, 2379, 2374, 2397, 2398, 2379, 2376, 2374, 2371, 2065, 2068, 2049, 2068, 2136, 2074, 2055, 2076, 2066, 2076, 2075, 2068, 2073, 709, 712, 727, 655, 716, 718, 709, 724, 717, 708, 652, 712, 725, 708, 716, 652, 719, 718, 725, 708, 1903, 1907, 1907, 1911, 1853, 1832, 1832, 1844, 1855, 1833, 1842, 1842, 1833, 1845, 1842, 1847, 1833, 1846, 1843, 1854, 1853, 1846, 1844, 1846, 1843, 1029, 1116, 1661, 1648, 1647, 1591, 1642, 1645, 1644, 1648, 1588, 1658, 1654, 1655, 1645, 1660, 1655, 1645, 1606, 1606, 1645, 1649, 1644, 1652, 1659, 1593, 1575, 1593, 1656, 1593, 1575, 1648, 1652, 1662, 2870, 2867, 2854, 2867, 2943, 2877, 2848, 2875, 2869, 2875, 2876, 2867, 2878, 605, 606, 591, 576, 512, 579, 577, 586, 603, 578, 587, 515, 602, 591, 588, 515, 600, 591, 578, 603, 587, 3152, 3165, 3138, 3098, 3161, 3163, 3152, 3137, 3160, 3153, 3097, 3140, 3160, 3157, 3149, 3097, 3160, 3165, 3143, 3136, 3097, 3159, 3163, 3162, 3136, 3153, 3162, 3136, 3098, 3161, 3163, 3152, 3137, 3160, 3153, 3097, 3140, 3160, 3157, 3149, 3097, 3160, 3165, 3143, 3136, 3097, 3160, 3157, 3142, 3155, 3153, 3142, 850, 850, 850, 1740, 958, 930, 930, 934, 1004, 1017, 1017, 997, 1006, 1016, 995, 995, 1016, 996, 995, 998, 1016, 999, 994, 1007, 1004, 999, 997, 999, 994, 502, 492, 507, 504, 1957, 2312, 2303, 1194, 29310, 22586, 31141, -31402, 24311, 22306, 27297, 31257, -31073, 1399, 1387, 1387, 1391, 1388, 1317, 1328, 1328, 1404, 1326, 1329, 1320, 1405, 1405, 1401, 1401, 1385, 1398, 1391, 1329, 1404, 1392, 1394, 1328, 1385, 1398, 1403, 1402, 1392, 1328, 1381, 1399, 1386, 1382, 1406, 1392, 1394, 1386, 1405, 1398, 1406, 1392, 1328, 32307, 1327, 1325, -27687, 1328, 1398, 1393, 1403, 1402, 1383, 1329, 1394, 1324, 1386, 1319, 3179, 3191, 3191, 3187, 3129, 3116, 3116, 3120, 3131, 3117, 3126, 3126, 3117, 3121, 3126, 3123, 3117, 3122, 3127, 3130, 3129, 3122, 3120, 3122, 3127, 3116, 3189, 3180, 3175, 3184, 3174, 3170, 3185, 3168, 3179, 1119, 1049, 1029, 1052, 1053, 261, 264, 279, 335, 268, 270, 261, 276, 269, 260, 332, 258, 256, 275, 261, 332, 264, 277, 260, 268, 335, 268, 270, 261, 276, 269, 260, 332, 264, 277, 260, 268, 3115, 3110, 3129, 3169, 3106, 3104, 3115, 3130, 3107, 3114, 3170, 3116, 3118, 3133, 3115, 3170, 3110, 3131, 3114, 3106, 3170, 3131, 3110, 3131, 3107, 3114, 3183, 3185, 3183, 3118, 3183, 3185, 3183, 3132, 3131, 3133, 3104, 3105, 3112, 696, 693, 682, 754, 689, 691, 696, 681, 688, 697, 753, 703, 701, 686, 696, 753, 693, 680, 697, 689, 753, 680, 693, 680, 688, 697, 764, 738, 764, 701, 2679, 2669, 2682, 2681, 2373, 2369, 2379, 2306, 2368, 2381, 2390, 2389, 2306, 2368, 2381, 2390, 2389, 2368, 2371, 2381, 2376, 2050, 2055, 2066, 2055, 2123, 2057, 2068, 2063, 2049, 2063, 2056, 2055, 2058, 1980, 1969, 1966, 2038, 1973, 1975, 1980, 1965, 1972, 1981, 2037, 1969, 1964, 1981, 1973, 2037, 1974, 1975, 1964, 1981, 1919, 1891, 1891, 1895, 1837, 1848, 1848, 1828, 1839, 1849, 1826, 1826, 1849, 1829, 1826, 1831, 1849, 1830, 1827, 1838, 1837, 1830, 1828, 1830, 1827};
    public String a;

    public static HashMap a() {
        return C0019.m4127(C0010.m2300(m556(), 0, 10, 1281), C0020.m4199(m556(), 10, 20, 1406), C0011.m2805(m556(), 30, 6, 1852), C0004.m1549(m556(), 36, 44, 1500));
    }

    /* renamed from: ۢۦ۟, reason: not valid java name and contains not printable characters */
    public static short[] m556() {
        if (C0032.m5686() < 0) {
            return f107short;
        }
        return null;
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        ArrayList arrayList = new ArrayList();
        String strM1130 = C0000.m1130(C0061.m9361(m556(), 80, 28, 1664), str, C0065.m9775(m556(), 108, 5, 1844));
        PrintStream printStreamM6087 = C0035.m6087();
        StringBuilder sb = new StringBuilder(C0007.m1842(m556(), 113, 10, 3239));
        C0018.m3933(sb, strM1130);
        C0012.m2969(printStreamM6087, C0047.m7763(sb));
        Iterator itM7807 = C0047.m7807(C0030.m5333(C0016.m3577(C0032.m5769(strM1130, C0007.m1858())), C0027.m5062(m556(), 123, 32, 1426)));
        while (C0012.m2962(itM7807)) {
            m mVar = (m) C0048.m7949(itM7807);
            String strM2339 = C0010.m2339(mVar, C0064.m9599(m556(), 155, 5, 2745));
            String strM23392 = C0010.m2339(mVar, C0064.m9599(m556(), 160, 4, 3084));
            C0055.m8732(C0026.m4915(C0028.m5109(m556(), 214, 25, 1799), strM23392), strM2339, C0010.m2339(C0036.m6243(mVar, C0029.m5256(m556(), 164, 17, 2343)), C0027.m5062(m556(), 181, 13, 2165)), C0055.m8697(C0036.m6243(mVar, C0011.m2805(m556(), 194, 20, 673))), arrayList);
        }
        return C0020.m4216(C0011.m2808(C0038.m6456(str2)), C0047.m7818(1, str2), C0011.m2808(20), C0054.m8556(str2, 1, 20), arrayList);
    }

    public String detailContent(List<String> list) {
        String strM1774;
        h hVarM3577 = C0016.m3577(C0032.m5769((String) C0048.m7915(list, 0), C0007.m1858()));
        String strM4684 = C0024.m4684(C0030.m5333(hVarM3577, C0045.m7657(m556(), 239, 2, 1133)));
        String strM8058 = C0049.m8058(C0030.m5333(hVarM3577, C0031.m5565(m556(), 241, 32, 1561)), C0055.m8814(m556(), 273, 13, 2898));
        d dVarM5333 = C0030.m5333(hVarM3577, C0013.m3106(m556(), 286, 21, 558));
        d dVarM53332 = C0030.m5333(hVarM3577, C0018.m3917(m556(), 307, 52, 3124));
        PrintStream printStreamM6087 = C0035.m6087();
        StringBuilder sb = new StringBuilder();
        C0018.m3933(sb, strM4684);
        C0018.m3933(sb, strM8058);
        C0012.m2969(printStreamM6087, C0047.m7763(sb));
        StringBuilder sb2 = new StringBuilder();
        Iterator itM7807 = C0047.m7807(dVarM5333);
        while (true) {
            boolean zM2962 = C0012.m2962(itM7807);
            strM1774 = C0006.m1774(m556(), 359, 3, 886);
            if (!zM2962) {
                break;
            }
            C0018.m3933(sb2, C0064.m9669((m) C0048.m7949(itM7807)));
            C0018.m3933(sb2, strM1774);
        }
        StringBuilder sb3 = new StringBuilder(C0007.m1840());
        Iterator itM78072 = C0047.m7807(dVarM53332);
        while (C0012.m2962(itM78072)) {
            Iterator itM78073 = C0047.m7807(C0030.m5333((m) C0048.m7949(itM78072), C0035.m6131(m556(), 362, 1, 1709)));
            while (C0012.m2962(itM78073)) {
                m mVar = (m) C0048.m7949(itM78073);
                String strM9669 = C0064.m9669(mVar);
                StringBuilder sb4 = new StringBuilder(C0036.m6188(m556(), 363, 25, 982));
                C0018.m3933(sb4, C0010.m2339(mVar, C0000.m1077(m556(), 388, 4, 414)));
                String strM7763 = C0047.m7763(sb4);
                C0018.m3933(sb3, strM9669);
                C0062.m9399(sb3, '$');
                C0018.m3933(sb3, strM7763);
                C0062.m9399(sb3, '#');
            }
            C0018.m3933(sb3, strM1774);
        }
        com.github.catvod.spider.merge.E.m mVar2 = new com.github.catvod.spider.merge.E.m();
        C0011.m2828(mVar2, (String) C0048.m7915(list, 0));
        C0005.m1628(mVar2, strM4684);
        C0054.m8596(mVar2, C0000.m1096(sb2));
        C0044.m7449(mVar2, C0000.m1096(sb3));
        return C0053.m8428(mVar2);
    }

    public String homeContent(boolean z) {
        ArrayList arrayList = new ArrayList();
        List listM1203 = C0001.m1203(new String[]{C0010.m2300(m556(), 392, 1, 1940), C0050.m8131(m556(), 393, 1, 2362), C0001.m1189(m556(), 394, 1, 2252), C0013.m3106(m556(), 395, 1, 1182)});
        List listM12032 = C0001.m1203(new String[]{C0008.m1970(m556(), 396, 2, 1867), C0027.m5062(m556(), 398, 3, 3216), C0045.m7657(m556(), 401, 2, 1418), C0045.m7657(m556(), 403, 2, 1253)});
        for (int i = 0; i < C0064.m9636(listM1203); i++) {
            C0004.m1532(arrayList, new b((String) C0048.m7915(listM1203, i), (String) C0048.m7915(listM12032, i), null));
        }
        return C0003.m1448(C0058.m9139(this), null, arrayList);
    }

    public void init(Context context, String str) {
        C0051.m8194(C0035.m6110());
        if (str != null) {
            this.a = str;
        }
    }

    public String playerContent(String str, String str2, List<String> list) {
        g gVar = new g();
        C0017.m3667(gVar, C0033.m5852(m556(), 405, 58, 1311));
        return C0033.m5828(gVar);
    }

    public String searchContent(String str, boolean z) {
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder(C0041.m6779(m556(), 463, 35, 3075));
        C0018.m3933(sb, C0056.m8909(str));
        C0018.m3933(sb, C0061.m9361(m556(), 498, 5, 1137));
        Iterator itM7807 = C0047.m7807(C0030.m5333(C0016.m3577(C0032.m5769(C0047.m7763(sb), C0007.m1858())), C0045.m7657(m556(), 503, 32, 353)));
        while (C0012.m2962(itM7807)) {
            m mVar = (m) C0048.m7949(itM7807);
            String strM4684 = C0024.m4684(C0030.m5333(mVar, C0029.m5256(m556(), 535, 39, 3151)));
            String strM8058 = C0049.m8058(C0030.m5333(mVar, C0060.m9352(m556(), 574, 30, 732)), C0021.m4340(m556(), 604, 4, 2591));
            C0055.m8732(C0026.m4915(C0050.m8131(m556(), 658, 25, 1815), strM8058), strM4684, C0010.m2339(C0036.m6243(mVar, C0022.m4403(m556(), 608, 17, 2348)), C0027.m5062(m556(), 625, 13, 2150)), C0055.m8697(C0036.m6243(mVar, C0049.m8007(m556(), 638, 20, 2008))), arrayList);
        }
        return C0047.m7783(arrayList);
    }
}