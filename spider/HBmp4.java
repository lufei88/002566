package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.E.b;
import com.github.catvod.spider.merge.E.g;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.J0.C0021;
import com.github.catvod.spider.merge.N.C0023;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.Q0.C0025;
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
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.a0.C0042;
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
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import com.github.catvod.spider.p000mergexbpq.x.C0015;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class HBmp4 extends Spider {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f51short = {1981, 1947, 1933, 1946, 1989, 1961, 1935, 1933, 1926, 1948, 1645, 1615, 1626, 1609, 1612, 1612, 1601, 1551, 1557, 1550, 1552, 1536, 1544, 1655, 1609, 1614, 1604, 1615, 1623, 1619, 1536, 1646, 1652, 1536, 1553, 1552, 1550, 1552, 1563, 1536, 1655, 1647, 1655, 1558, 1556, 1545, 1536, 1633, 1616, 1616, 1612, 1605, 1655, 1605, 1602, 1643, 1609, 1620, 1551, 1557, 1555, 1559, 1550, 1555, 1558, 1536, 1544, 1643, 1640, 1652, 1645, 1644, 1548, 1536, 1612, 1609, 1611, 1605, 1536, 1639, 1605, 1603, 1611, 1615, 1545, 1536, 1635, 1608, 1618, 1615, 1613, 1605, 1551, 1553, 1552, 1561, 1550, 1552, 1550, 1552, 1550, 1552, 1536, 1651, 1601, 1606, 1601, 1618, 1609, 1551, 1557, 1555, 1559, 1550, 1555, 1558, 2623, 2597, 2612, 2592, 2593, 2621, 3175, 3116, 3112, 3119, 3185, 3177, 3113, 3189, 3160, 3116, 3194, 3178, 3172, 3186, 3174, 3190, 3119, 3161, 3149, 3111, 3163, 3164, 3110, 3184, 3196, 3146, 3174, 3152, 3187, 3199, 3157, 3121, 3151, 3151, 3159, 3167, 3188, 3197, 3178, 3186, 3157, 3191, 3163, 3176, 3216, 3286, 3274, 3283, 3282, 2280, 2287, 2272, 2281, 2297, 2283, 2272, 2213, 2213, 2213, 2573, 2560, 2591, 2631, 2565, 2560, 2586, 2589, 2614, 2587, 2631, 2570, 2570, 2565, 2572, 2568, 2587, 2633, 2647, 2633, 2573, 2560, 2591, 2633, 2647, 2633, 2588, 2565, 2633, 2647, 2633, 2565, 2560, 1182, 1178, 1168, 2701, 2688, 2712, 14866, 15297, 1425, 1044, 1038, 1049, 1050, 2649, 2652, 2633, 2652, 2576, 2642, 2639, 2644, 2650, 2644, 2643, 2652, 2641, 871, 868, 885, 890, 826, 865, 868, 880, 885, 864, 881, 843, 864, 893, 889, 881, 1548, 1552, 1552, 1556, 1559, 1630, 1611, 1611, 1545, 1610, 1548, 1541, 1547, 1545, 1556, 1616, 1610, 1543, 1543, 1611, 984, 981, 970, 914, 968, 985, 964, 968, 924, 898, 924, 972, 583, 580, 597, 602, 991, 978, 973, 917, 971, 978, 984, 923, 901, 923, 978, 982, 988, 2054, 2055, 2070, 2134, 2127, 2061, 2131, 2114, 2125, 2118, 2127, 2061, 2119, 2124, 2132, 2125, 2062, 2127, 2122, 2128, 2135, 2061, 2135, 2123, 2134, 2125, 2119, 2118, 2129, 2066, 2051, 2077, 2051, 2127, 2122, 2238, 2227, 2220, 2292, 2223, 2216, 2230, 2295, 2230, 2239, 2236, 2222, 3105, 1622, 1612, 1627, 1624, 1946, 2549, 2810, 2739, 2742, 2740, 2804, 2442, 1110, 1115, 1092, 1052, 1107, 1088, 1094, 1115, 1105, 1118, 1111, 1055, 1088, 1111, 1118, 1107, 1094, 1111, 1110, 1052, 1115, 1116, 1108, 1117, -24856, 27189, 1259, 1271, 1271, 1267, 1264, 1209, 1196, 1196, 1262, 1197, 1259, 1250, 1260, 1262, 1267, 1207, 1197, 1248, 1248, 1196, 1728, 1753, 1691, 1755, 1748, 1731, 1691, 1755, 1748, 1731, 1751, 1748, 1735, 1688, 1755, 1748, 1731, 1685, 1675, 1685, 1753, 1756, 2732, 282, 256, 279, 276, 1454, 1457, 1527, 1515, 1522, 1523, 32509, 21751, 2395, 385, 2203, 2204, 2195, 2202, 2186, 2200, 2195, 2262, 2262, 2262, 2197, 2185, 2185, 2189, 2190, 2247, 2258, 2258, 2192, 2259, 2197, 2204, 2194, 2192, 2189, 2249, 2259, 2206, 2206, 2258, 2258, 2190, 2200, 2204, 2191, 2206, 2197, 2258, 1686, 1669, 2118, 2392, 1784, 650, 653, 649, 713, 713, 709, 757, 722, 759, 763, 729, 767, 715, 718, 731, 652, 761, 741, 712, 732, 723, 714, 640, 640, 3049, 3061, 3061, 3057, 3058, 3003, 2990, 2990, 3052, 2991, 3049, 3040, 3054, 3052, 3057, 2997, 2991, 3042, 3042, 2990, 2990, 3058, 3044, 3040, 3059, 3042, 3049, 2990, 476, 465, 462, 406, 468, 465, 459, 460, 487, 458, 406, 475, 475, 468, 477, 473, 458, 408, 390, 408, 476, 465, 462, 408, 390, 408, 461, 468, 408, 390, 408, 468, 465, 1536, 1540, 1550, 3157, 3160, 3136, 14198, 13933, 1541, 2648, 2626, 2645, 2646, 1998, 1995, 2014, 1995, 1927, 1989, 2008, 1987, 1997, 1987, 1988, 1995, 1990, 3142, 3162, 3162, 3166, 3165, 3092, 3073, 3073, 3139, 3072, 3142, 3151, 3137, 3139, 3166, 3098, 3072, 3149, 3149, 3073};
    public String a;

    public static HashMap a() {
        return C0019.m4127(C0027.m5062(m319(), 0, 10, 2024), C0061.m9361(m319(), 10, 106, 1568), C0021.m4340(m319(), 116, 6, 2677), C0035.m6131(m319(), 122, 44, 3102));
    }

    /* renamed from: ۣ۟۟ۡۧ, reason: not valid java name and contains not printable characters */
    public static short[] m319() {
        if (C0019.m4065() < 0) {
            return f51short;
        }
        return null;
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        ArrayList arrayList = new ArrayList();
        String strM5172 = C0028.m5172(str, str2, C0058.m9106(m319(), 166, 5, 3262));
        PrintStream printStreamM6087 = C0035.m6087();
        StringBuilder sb = new StringBuilder(C0062.m9389(m319(), 171, 10, 2190));
        C0018.m3933(sb, strM5172);
        C0012.m2969(printStreamM6087, C0047.m7763(sb));
        Iterator itM7807 = C0047.m7807(C0030.m5333(C0016.m3577(C0032.m5769(strM5172, null)), C0027.m5062(m319(), 181, 33, 2665)));
        while (C0012.m2962(itM7807)) {
            m mVar = (m) C0048.m7949(itM7807);
            String strM6307 = C0037.m6307(m319(), 214, 3, 1271);
            String strM8058 = C0049.m8058(C0030.m5333(mVar, strM6307), C0020.m4199(m319(), 217, 3, 2796));
            String strM5109 = C0028.m5109(m319(), 220, 1, 2584);
            String strM1840 = C0007.m1840();
            String strM3446 = C0015.m3446(C0015.m3446(strM8058, strM5109, strM1840), C0023.m4536(m319(), 221, 1, 3018), strM1840);
            String strM80582 = C0049.m8058(C0030.m5333(mVar, C0027.m5062(m319(), 222, 1, 1520)), C0001.m1189(m319(), 223, 4, 1148));
            C0055.m8732(C0026.m4915(C0008.m1970(m319(), 256, 20, 1636), strM80582), strM3446, C0049.m8058(C0030.m5333(mVar, strM6307), C0000.m1077(m319(), 227, 13, 2621)), C0064.m9669(C0036.m6243(mVar, C0016.m3525(m319(), 240, 16, 788))), arrayList);
        }
        return C0020.m4216(C0011.m2808(C0038.m6456(str2)), C0047.m7818(1, str2), C0011.m2808(20), C0054.m8556(str2, 1, 20), arrayList);
    }

    public String detailContent(List<String> list) {
        h hVarM3577 = C0016.m3577(C0032.m5769((String) C0048.m7915(list, 0), C0053.m8398()));
        String strM4684 = C0024.m4684(C0030.m5333((m) C0028.m5161(C0030.m5333(hVarM3577, C0004.m1549(m319(), 276, 12, 956)), 0), C0029.m5256(m319(), 288, 4, 564)));
        String strM8058 = C0049.m8058(C0030.m5333(hVarM3577, C0000.m1077(m319(), 292, 13, 955)), C0015.m3484(m319(), 305, 3, 2165));
        d dVarM5333 = C0030.m5333(hVarM3577, C0005.m1645(m319(), 308, 32, 2083));
        PrintStream printStreamM6087 = C0035.m6087();
        StringBuilder sb = new StringBuilder();
        C0018.m3933(sb, strM4684);
        C0018.m3933(sb, strM8058);
        C0012.m2969(printStreamM6087, C0047.m7763(sb));
        StringBuilder sb2 = new StringBuilder(C0007.m1840());
        Iterator itM7807 = C0047.m7807(dVarM5333);
        while (C0012.m2962(itM7807)) {
            d dVarM6459 = C0038.m6459(C0030.m5333((m) C0048.m7949(itM7807), C0003.m1398(m319(), 340, 12, 2266)), C0025.m4795(m319(), 352, 1, 3136));
            String strM46842 = C0024.m4684(dVarM6459);
            if (C0057.m8953(strM46842)) {
                strM46842 = strM4684;
            }
            String strM80582 = C0049.m8058(dVarM6459, C0002.m1305(m319(), 353, 4, 1598));
            if (C0057.m8953(strM80582)) {
                strM80582 = (String) C0048.m7915(list, 0);
            }
            C0018.m3933(sb2, strM46842);
            C0018.m3933(sb2, C0009.m2037(m319(), 357, 1, 1982));
            StringBuilder sb3 = new StringBuilder();
            C0018.m3933(sb3, strM80582);
            String strM9775 = C0065.m9775(m319(), 358, 1, 2443);
            C0018.m3933(sb3, strM9775);
            C0018.m3933(sb3, strM4684);
            C0018.m3933(sb3, C0033.m5852(m319(), 359, 5, 2692));
            C0018.m3933(sb2, C0047.m7763(sb3));
            C0018.m3933(sb2, strM9775);
            C0018.m3933(sb2, strM46842);
            C0018.m3933(sb2, C0052.m8337(m319(), 364, 1, 2473));
        }
        String strM46843 = C0024.m4684(C0030.m5333(hVarM3577, C0062.m9389(m319(), 365, 24, 1074)));
        com.github.catvod.spider.merge.E.m mVar = new com.github.catvod.spider.merge.E.m();
        StringBuilder sb4 = new StringBuilder();
        C0018.m3933(sb4, C0055.m8703());
        C0018.m3933(sb4, strM46843);
        C0027.m5000(mVar, C0047.m7763(sb4));
        C0011.m2828(mVar, (String) C0048.m7915(list, 0));
        C0026.m4947(mVar, strM8058);
        C0005.m1628(mVar, strM4684);
        C0054.m8596(mVar, C0056.m8911(m319(), 389, 2, 1072));
        C0044.m7449(mVar, C0000.m1096(sb2));
        return C0053.m8428(mVar);
    }

    public String homeContent(boolean z) {
        ArrayList arrayList = new ArrayList();
        String strM8259 = C0051.m8259(m319(), 391, 20, 1155);
        Iterator itM7807 = C0047.m7807(C0030.m5333(C0016.m3577(C0032.m5769(strM8259, null)), C0001.m1189(m319(), 411, 22, 1717)));
        while (C0012.m2962(itM7807)) {
            m mVar = (m) C0048.m7949(itM7807);
            String strM5109 = C0028.m5109(m319(), 433, 1, 2765);
            String strM4684 = C0024.m4684(C0030.m5333(mVar, strM5109));
            String strM3446 = C0015.m3446(C0049.m8058(C0030.m5333(mVar, strM5109), C0042.m7151(m319(), 434, 4, 370)), C0031.m5565(m319(), 438, 6, 1439), C0007.m1840());
            if (C0058.m9127(strM4684, C0062.m9389(m319(), 444, 1, 3258)) || C0058.m9127(strM4684, C0020.m4199(m319(), 445, 1, 1680))) {
                C0004.m1532(arrayList, new b(C0026.m4915(strM8259, strM3446), strM4684, null));
            }
        }
        return C0003.m1448(C0033.m5796(this), null, arrayList);
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
        String[] strArrM4752 = C0024.m4752(str2, C0015.m3484(m319(), 446, 1, 2341));
        String str3 = null;
        String str4 = (strArrM4752.length <= 0 || C0057.m8953(strArrM4752[0])) ? null : strArrM4752[0];
        String str5 = (strArrM4752.length <= 1 || C0057.m8953(strArrM4752[1])) ? null : strArrM4752[1];
        if (strArrM4752.length > 2 && !C0057.m8953(strArrM4752[2])) {
            String str6 = strArrM4752[2];
        }
        if (strArrM4752.length > 3 && !C0057.m8953(strArrM4752[3])) {
            str3 = strArrM4752[3];
        }
        String strM2827 = C0011.m2827(str4, str5, str3);
        g gVarM9311 = C0060.m9311(0, str4);
        C0057.m9029(gVarM9311, C0053.m8398());
        C0002.m1282(gVarM9311, strM2827);
        return C0033.m5828(gVarM9311);
    }

    public String searchContent(String str, boolean z) {
        return C0030.m5345(this, str, true, C0056.m8911(m319(), 447, 1, 432));
    }

    public String searchContent(String str, boolean z, String str2) {
        ArrayList arrayList = new ArrayList();
        C0012.m2969(C0035.m6087(), C0050.m8131(m319(), 448, 38, 2301));
        HashMap map = new HashMap();
        C0053.m8424(map, C0005.m1645(m319(), 486, 2, 1761), str);
        C0053.m8424(map, C0016.m3525(m319(), 488, 1, 2102), C0027.m5062(m319(), 489, 1, 2409));
        C0053.m8424(map, C0057.m8978(m319(), 490, 1, 1676), C0019.m4107(m319(), 491, 24, 701));
        Iterator itM7807 = C0047.m7807(C0030.m5333(C0016.m3577(C0008.m2029(C0003.m1396(C0025.m4795(m319(), 515, 28, 2945), map, C0053.m8398()))), C0055.m8814(m319(), 543, 33, 440)));
        while (C0012.m2962(itM7807)) {
            m mVar = (m) C0048.m7949(itM7807);
            String strM6131 = C0035.m6131(m319(), 576, 3, 1641);
            String strM8058 = C0049.m8058(C0030.m5333(mVar, strM6131), C0000.m1077(m319(), 579, 3, 3124));
            String strM8131 = C0050.m8131(m319(), 582, 1, 1916);
            String strM1840 = C0007.m1840();
            String strM3446 = C0015.m3446(C0015.m3446(strM8058, strM8131, strM1840), C0050.m8131(m319(), 583, 1, 1638), strM1840);
            String strM80582 = C0049.m8058(C0030.m5333(mVar, C0011.m2805(m319(), 584, 1, 1636)), C0057.m8978(m319(), 585, 4, 2608));
            C0032.m5685(C0026.m4915(C0013.m3106(m319(), 602, 20, 3118), strM80582), strM3446, C0049.m8058(C0030.m5333(mVar, strM6131), C0054.m8574(m319(), 589, 13, 1962)), arrayList);
        }
        return C0047.m7783(arrayList);
    }
}