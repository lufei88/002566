package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.E.b;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.J0.C0021;
import com.github.catvod.spider.merge.K0.C0022;
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
import com.github.catvod.spider.merge.V0.d;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.c1.C0046;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.merge.f0.C0052;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.r0.C0059;
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
import com.github.catvod.spider.p000mergexbpq.a0.C0006;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.c0.C0010;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.x.C0015;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.io.PrintStream;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class W55Movie extends Spider {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f112short = {1439, 1411, 1411, 1415, 1412, 1485, 1496, 1496, 1474, 1474, 1425, 1435, 1438, 1423, 1497, 1428, 1432, 1434, 2236, 2277, 2300, 2295, 2295, 2294, 2279, 2290, 2298, 2303, 2236, 1391, 1334, 1327, 1316, 1328, 1324, 1313, 1337, 1391, 1244, 1157, 1180, 1175, 1152, 1174, 1170, 1153, 1168, 1179, 1244, 1155, 1170, 1172, 1174, 1244, 1218, 1244, 1156, 1175, 1244, 3277, 3307, 3325, 3306, 3253, 3289, 3327, 3325, 3318, 3308, 283, 313, 300, 319, 314, 314, 311, 377, 355, 376, 358, 374, 382, 257, 319, 312, 306, 313, 289, 293, 374, 280, 258, 374, 359, 358, 376, 358, 365, 374, 257, 319, 312, 352, 354, 365, 374, 302, 352, 354, 383, 374, 279, 294, 294, 314, 307, 257, 307, 308, 285, 319, 290, 377, 355, 357, 353, 376, 357, 352, 374, 382, 285, 286, 258, 283, 282, 378, 374, 314, 319, 317, 307, 374, 273, 307, 309, 317, 313, 383, 374, 277, 318, 292, 313, 315, 307, 377, 359, 356, 356, 376, 358, 376, 358, 376, 358, 374, 261, 311, 304, 311, 292, 319, 377, 355, 357, 353, 376, 357, 352, 2038, 2047, 1934, 1627, 1618, 1571, 1590, 21686, 24016, 1580, 1590, 929, 994, 1007, 1004, 1003, 994, 929, 1001, 943, 947, 938, 939, 2802, 2802, 2802, 2802, 2802, 2802, 2802, 2802, 1541, 1541, 1541, 1542, 1600, 1628, 1605, 1604, 1321, 1382, 1317, 1319, 1324, 1341, 1316, 1325, 1381, 1336, 1319, 1339, 1340, 1325, 1338, 1381, 1313, 1340, 1325, 1317, 2866, 2870, 2876, 2763, 2766, 2779, 2766, 2690, 2752, 2781, 2758, 2760, 2758, 2753, 2766, 2755, 1124, 1150, 1129, 1130, 426, 439, 426, 434, 443, 438, 426, 426, 430, 1936, 1196, 1269, 1563, 1567, 1557, 1628, 1566, 1537, 1631, 1563, 1537, 1631, 1553, 1555, 1553, 1562, 1559, 1558, 2182, 2179, 2198, 2179, 2255, 2189, 2192, 2187, 2181, 2187, 2188, 2179, 2190, 915, 926, 897, 985, 922, 920, 915, 898, 923, 914, 986, 926, 921, 913, 920, 986, 899, 918, 912, 986, 923, 926, 921, 924, 1521, 1653, 1661, 1644, 1657, 1603, 1654, 1657, 1653, 1661, 1573, 1660, 1661, 1643, 1659, 1642, 1649, 1640, 1644, 1649, 1655, 1654, 1605, 264, 260, 261, 287, 270, 261, 287, 2442, 2439, 2456, 2496, 2435, 2433, 2442, 2459, 2434, 2443, 2499, 2458, 2447, 2444, 2499, 2439, 2458, 2443, 2435, 2724, 2729, 2742, 2798, 2733, 2735, 2724, 2741, 2732, 2725, 2797, 2736, 2732, 2721, 2745, 2797, 2732, 2729, 2739, 2740, 2797, 2723, 2735, 2734, 2740, 2725, 2734, 2740, 2931, 2931, 2931, 1582, 1655, 1646, 1637, 1649, 1645, 1632, 1656, 1582, 1410, 1432, 1423, 1420, 2990, 2541, 2671, 2604, 2593, 2594, 2597, 2604, 2671, 2606, 2597, 2612, 2598, 2604, 2601, 2616, 995, 954, 931, 936, 959, 932, 931, 955, 995, 1021, 848, 777, 784, 795, 780, 791, 784, 776, 848, 845, 1669, 1756, 1733, 1742, 1753, 1730, 1733, 1757, 1669, 1691, 1688, 1694, 2210, 2299, 2274, 2281, 2302, 2277, 2274, 2298, 2210, 2233, 1539, 1626, 1603, 1608, 1631, 1604, 1603, 1627, 1539, 1567, 672, 651, 666, 648, 642, 647, 662, 30402, 23686, -31020, 30695, 23405, 31957, 22387, 20852, 27895, 29982, -30312, 1300, 1371, 1304, 1306, 1297, 1280, 1305, 1296, 1368, 1285, 1306, 1286, 1281, 1296, 1287, 1368, 1308, 1281, 1296, 1304, 820, 816, 826, 805, 800, 821, 800, 876, 814, 819, 808, 806, 808, 815, 800, 813, 1817, 1795, 1812, 1815, 1214, 1187, 1214, 1190, 1199, 3293, 3265, 3265, 3269, 912, 1175, 1232, 1243, 1241, 1237, 1245, 1242, 1264, 1237, 1216, 1237, 1332, 1329, 1316, 1329, 1405, 1337, 1342, 1334, 1343, 2375, 2395, 2395, 2399, 2396, 2325, 2304, 2304, 1503, 1477, 1496, 1481, 1523, 1473, 1485, 1477, 1474, 1937, 1992, 2001, 2010, 2010, 2011, 1994, 2015, 2007, 2002, 1937, 2385, 2312, 2321, 2330, 2318, 2322, 2335, 2311, 2385, 981, 908, 917, 926, 905, 927, 923, 904, 921, 914, 981, 906, 923, 925, 927, 981, 971, 981, 909, 926, 981, 518, 593, 598, 584, 632, 518, 542, 632, 518, 524, 522, 526, 539, 525, 632, 518, 520, 632, 518, 593, 598, 584, 635, 586, 577, 604, 592, 632, 518, 542, 632, 518, 524, 522, 526, 539, 525, 632, 518, 1617, 1542, 1543, 1621, 1545, 1617, 1539, 1617, 1544, 1541, 1536, 1540, 1545, 1539, 1539, 1545, 3158, 3160, 3087, 3082, 3159, 3084, 3165, 3161, 3085, 3085, 3159, 3080, 3163, 3084, 3159, 3163, 3166, 3167, 3084, 3165, 3085, 3083, 3085, 3085, 3161, 3082, 3085, 3160, 3165, 3161, 3161, 3085, 961, 965, 979, 943, 963, 962, 963, 943, 976, 971, 963, 979, 951, 976, 993, 996, 996, 1001, 1006, 999, 2693, 2692, 2710, 2813, 2792, 3000, 2980, 2980, 2976, 2979, 3050, 3071, 3071, 2976, 3004, 2993, 2985, 2997, 2978, 3070, 2996, 2996, 2986, 2985, 3003, 2981, 3070, 2995, 3007, 3005, 3050, 3043, 3046, 3045, 3043, 3071, 2999, 2997, 2980, 2959, 2981, 2978, 3004, 2959, 2982, 3042, 3055, 2996, 2993, 2980, 2993, 3053, 2890, 2895, 2906, 2895, 2631, 2624, 2654, 3024, 3063, 3055, 3064, 3061, 3056, 3069, 3001, 3027, 3018, 3030, 3031, 3001, 3071, 3062, 3051, 3060, 3064, 3053, 3001, 3062, 3051, 3001, 3060, 3056, 3050, 3050, 3056, 3063, 3070, 3001, 3006, 3052, 3051, 3061, 3006, 3001, 3071, 3056, 3068, 3061, 3069, 2999, 604, 619, 619, 630, 619, 569, 636, 631, 634, 630, 637, 624, 631, 638, 569, 588, 587, 597, 569, 634, 630, 628, 617, 630, 631, 636, 631, 621, 3105, 3175, 3195, 3170, 3171, 437, 506, 420, 417, 438, 440, 445, 439, 505, 440, 445, 423, 416, 505, 433, 428, 420, 2972, 2968, 2962, 2214, 2211, 2230, 2211, 2287, 2225, 2224, 2209, 567, 557, 570, 569, 3119, 3122, 3119, 3127, 3134, 2561, 2589, 2589, 2585, 2227};
    public static String a = C0048.m7902(m568(), 0, 18, 1527);
    public static String b = C0028.m5188(new StringBuilder(), C0065.m9738(), C0063.m9585(m568(), 18, 11, 2195));
    public static String c = C0028.m5188(new StringBuilder(), C0065.m9738(), C0015.m3484(m568(), 29, 9, 1344));
    public static String d = C0028.m5188(new StringBuilder(), C0065.m9738(), C0061.m9361(m568(), 38, 21, 1267));

    public static HashMap a() {
        return C0020.m4251(C0005.m1645(m568(), 59, 10, 3224), C0001.m1189(m568(), 69, 111, 342));
    }

    /* renamed from: ۟ۧۦۧۧ, reason: not valid java name and contains not printable characters */
    public static JsonObject m564(Object obj, Object obj2) {
        if (C0059.m9257() < 0) {
            return ((JsonObject) obj).getAsJsonObject((String) obj2);
        }
        return null;
    }

    /* renamed from: ۣۢۧ۠, reason: not valid java name and contains not printable characters */
    public static boolean m565(Object obj, Object obj2) {
        if (C0006.m1726() <= 0) {
            return ((JsonObject) obj).has((String) obj2);
        }
        return false;
    }

    /* renamed from: ۤۥۣۨ, reason: not valid java name and contains not printable characters */
    public static String m566(Object obj) {
        if (C0052.m8320() > 0) {
            return ((JsonElement) obj).getAsString();
        }
        return null;
    }

    /* renamed from: ۥۣۤۧ, reason: contains not printable characters */
    public static JsonElement m567(Object obj, Object obj2) {
        if (C0063.m9589() < 0) {
            return ((JsonObject) obj).get((String) obj2);
        }
        return null;
    }

    /* renamed from: ۧۧۥۣ, reason: not valid java name and contains not printable characters */
    public static short[] m568() {
        if (C0053.m8389() >= 0) {
            return f112short;
        }
        return null;
    }

    public String MD5(String str) {
        try {
            byte[] bArrM6159 = C0035.m6159(C0015.m3410(C0060.m9352(m568(), 180, 3, 1979)), C0050.m8115(str));
            StringBuilder sb = new StringBuilder();
            for (byte b2 : bArrM6159) {
                String strM8889 = C0056.m8889(b2 & 255);
                if (C0004.m1584(strM8889) == 1) {
                    C0062.m9399(sb, '0');
                }
                C0018.m3933(sb, strM8889);
            }
            PrintStream printStreamM6087 = C0035.m6087();
            StringBuilder sb2 = new StringBuilder();
            C0018.m3933(sb2, C0003.m1398(m568(), 183, 8, 1558));
            C0018.m3933(sb2, C0047.m7763(sb));
            C0012.m2969(printStreamM6087, C0047.m7763(sb2));
            return C0047.m7763(sb);
        } catch (NoSuchAlgorithmException e) {
            C0049.m7975(e);
            return C0007.m1840();
        }
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        ArrayList arrayList = new ArrayList();
        Iterator itM7807 = C0047.m7807(C0030.m5333(C0016.m3577(C0032.m5769(C0028.m5188(new StringBuilder(), C0065.m9738(), C0043.m7277(str, C0064.m9599(m568(), 191, 7, 910)) ? C0028.m5172(str, str2, C0049.m8007(m568(), 198, 5, 967)) : C0004.m1488(str, C0020.m4199(m568(), 203, 8, 2783), str2, C0010.m2300(m568(), 211, 8, 1576))), C0009.m2090())), C0060.m9352(m568(), 219, 20, 1352)));
        while (C0012.m2962(itM7807)) {
            m mVar = (m) C0048.m7949(itM7807);
            try {
                String strM8058 = C0049.m8058(C0030.m5333(mVar, C0005.m1645(m568(), 239, 3, 2907)), C0037.m6307(m568(), 242, 13, 2735));
                String strM2339 = C0010.m2339(mVar, C0027.m5062(m568(), 255, 4, 1036));
                String strM23392 = C0010.m2339(mVar, C0042.m7151(m568(), 259, 5, 478));
                if (!C0043.m7277(strM8058, C0022.m4403(m568(), 264, 4, 478))) {
                    StringBuilder sb = new StringBuilder();
                    C0018.m3933(sb, C0065.m9738());
                    C0018.m3933(sb, strM8058);
                    strM8058 = C0047.m7763(sb);
                }
                C0004.m1532(arrayList, new com.github.catvod.spider.merge.E.m(C0024.m4752(strM2339, C0034.m6001(m568(), 268, 1, 1983))[2], strM23392, strM8058));
            } catch (Exception unused) {
            }
        }
        return C0020.m4216(C0011.m2808(C0038.m6456(str2)), C0047.m7818(1, str2), C0011.m2808(20), C0054.m8556(str2, 1, 20), arrayList);
    }

    public String detailContent(List<String> list) {
        h hVarM3577 = C0016.m3577(C0032.m5769(C0050.m8125(C0064.m9614(), (String) C0048.m7915(list, 0)), C0009.m2090()));
        String strM4684 = C0024.m4684(C0030.m5333(hVarM3577, C0031.m5565(m568(), 269, 2, 1220)));
        String strM8058 = C0049.m8058(C0030.m5333(hVarM3577, C0004.m1549(m568(), 271, 16, 1650)), C0044.m7509(m568(), 287, 13, 2274));
        d dVarM5333 = C0030.m5333(hVarM3577, C0028.m5109(m568(), 300, 24, 1015));
        m mVar = (m) C0028.m5161(dVarM5333, 0);
        String strM8007 = C0049.m8007(m568(), 324, 1, 1424);
        String strM46842 = C0024.m4684(C0030.m5333(mVar, strM8007));
        String strM46843 = C0024.m4684(C0030.m5333((m) C0028.m5161(dVarM5333, 1), strM8007));
        String strM46844 = C0024.m4684(C0030.m5333((m) C0028.m5161(dVarM5333, 2), strM8007));
        String strM80582 = C0049.m8058(C0030.m5333(hVarM3577, C0057.m8978(m568(), 325, 22, 1560)), C0002.m1305(m568(), 347, 7, 363));
        d dVarM53332 = C0030.m5333(hVarM3577, C0061.m9361(m568(), 354, 19, 2542));
        d dVarM53333 = C0030.m5333(hVarM3577, C0054.m8574(m568(), 373, 28, 2752));
        String strM1840 = C0007.m1840();
        String str = strM1840;
        String strM5172 = str;
        int i = 0;
        while (i < C0009.m2095(dVarM53332)) {
            String strM9669 = C0064.m9669((m) C0028.m5161(dVarM53332, i));
            boolean zM1815 = C0007.m1815(strM1840, str);
            String strM7718 = C0046.m7718(m568(), 401, 3, 2903);
            String strM51722 = !zM1815 ? C0028.m5172(str, strM7718, strM9669) : C0065.m9804(str, strM9669);
            d dVarM53334 = C0030.m5333((m) C0028.m5161(dVarM53333, i), strM8007);
            d dVar = dVarM53333;
            String str2 = strM8007;
            d dVar2 = dVarM53332;
            String strM7763 = strM1840;
            int i2 = 0;
            while (i2 < C0009.m2095(dVarM53334)) {
                boolean zM18152 = C0007.m1815(strM1840, strM7763);
                String str3 = strM51722;
                String strM8337 = C0052.m8337(m568(), 404, 9, 1537);
                String str4 = strM4684;
                String strM4951 = C0026.m4951(m568(), 413, 4, 1514);
                String str5 = strM80582;
                String strM8978 = C0057.m8978(m568(), 417, 1, 2954);
                StringBuilder sbM3016 = !zM18152 ? C0012.m3016(strM7763, C0046.m7718(m568(), 418, 1, 2510)) : C0031.m5621(strM7763);
                C0018.m3933(sbM3016, C0064.m9669((m) C0028.m5161(dVarM53334, i2)));
                C0018.m3933(sbM3016, strM8978);
                C0018.m3933(sbM3016, C0015.m3446(C0010.m2339((m) C0028.m5161(dVarM53334, i2), strM4951), strM8337, strM1840));
                strM7763 = C0047.m7763(sbM3016);
                i2++;
                strM51722 = str3;
                strM4684 = str4;
                strM80582 = str5;
            }
            String str6 = strM4684;
            String str7 = strM80582;
            String str8 = strM51722;
            strM5172 = !C0007.m1815(strM1840, strM5172) ? C0028.m5172(strM5172, strM7718, strM7763) : C0065.m9804(strM5172, strM7763);
            i++;
            dVarM53333 = dVar;
            strM8007 = str2;
            dVarM53332 = dVar2;
            str = str8;
            strM4684 = str6;
            strM80582 = str7;
        }
        com.github.catvod.spider.merge.E.m mVar2 = new com.github.catvod.spider.merge.E.m();
        C0011.m2828(mVar2, (String) C0048.m7915(list, 0));
        C0026.m4947(mVar2, strM8058);
        C0022.m4432(mVar2, strM46842);
        C0017.m3671(mVar2, strM46843);
        C0058.m9109(mVar2, strM46844);
        C0027.m5000(mVar2, strM80582);
        C0005.m1628(mVar2, strM4684);
        C0054.m8596(mVar2, str);
        C0044.m7449(mVar2, strM5172);
        return C0053.m8428(mVar2);
    }

    public String homeContent(boolean z) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        String[] strArr = {C0057.m8978(m568(), 419, 14, 2624), C0027.m5062(m568(), 433, 10, 972), C0064.m9599(m568(), 443, 10, 895), C0017.m3646(m568(), 453, 12, 1706), C0061.m9361(m568(), 465, 10, 2189), C0049.m8007(m568(), 475, 10, 1580)};
        String[] strArr2 = {C0012.m2973(m568(), 485, 7, 750), C0011.m2805(m568(), 492, 2, 1015), C0000.m1077(m568(), 494, 3, 2314), C0015.m3484(m568(), 497, 2, 1370), C0065.m9775(m568(), 499, 2, 988), C0057.m8978(m568(), 501, 2, 3042)};
        for (int i = 0; i < 6; i++) {
            C0004.m1532(arrayList2, new b(strArr[i], strArr2[i], null));
        }
        Iterator itM7807 = C0047.m7807(C0030.m5333(C0016.m3577(C0032.m5769(C0065.m9738(), C0009.m2090())), C0021.m4340(m568(), 503, 20, 1397)));
        while (C0012.m2962(itM7807)) {
            m mVar = (m) C0048.m7949(itM7807);
            try {
                String strM8058 = C0049.m8058(C0030.m5333(mVar, C0017.m3646(m568(), 523, 3, 861)), C0044.m7509(m568(), 526, 13, 833));
                String strM2339 = C0010.m2339(mVar, C0061.m9361(m568(), 539, 4, 1905));
                String strM23392 = C0010.m2339(mVar, C0039.m6551(m568(), 543, 5, 1226));
                if (!C0043.m7277(strM8058, C0028.m5109(m568(), 548, 4, 3253))) {
                    StringBuilder sb = new StringBuilder();
                    C0018.m3933(sb, C0065.m9738());
                    C0018.m3933(sb, strM8058);
                    strM8058 = C0047.m7763(sb);
                }
                C0004.m1532(arrayList, new com.github.catvod.spider.merge.E.m(C0024.m4752(strM2339, C0056.m8911(m568(), 552, 1, 959))[2], strM23392, strM8058));
            } catch (Exception unused) {
            }
        }
        return C0025.m4831(arrayList2, arrayList);
    }

    public void init(Context context, String str) {
        super.init(context, str);
        Map map = (Map) C0029.m5275(C0009.m2083(C0049.m8058(C0030.m5333(C0016.m3577(C0032.m5769(str, null)), C0056.m8911(m568(), 553, 11, 1204)), C0049.m8007(m568(), 564, 9, 1360))), Map.class);
        StringBuilder sb = new StringBuilder(C0037.m6307(m568(), 573, 8, 2351));
        C0018.m3933(sb, C0037.m6312(C0062.m9431(map, C0038.m6452(m568(), 581, 9, 1452))));
        a = C0047.m7763(sb);
        b = C0028.m5188(new StringBuilder(), C0065.m9738(), C0001.m1189(m568(), 590, 11, 1982));
        c = C0028.m5188(new StringBuilder(), C0065.m9738(), C0042.m7151(m568(), 601, 9, 2430));
        d = C0028.m5188(new StringBuilder(), C0065.m9738(), C0009.m2037(m568(), 610, 21, 1018));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x010b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String playerContent(java.lang.String r57, java.lang.String r58, java.util.List<java.lang.String> r59) {
        /*
            Method dump skipped, instructions count: 339
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.W55Movie.playerContent(java.lang.String, java.lang.String, java.util.List):java.lang.String");
    }

    public String searchContent(String str, boolean z) {
        ArrayList arrayList = new ArrayList();
        Iterator itM7807 = C0047.m7807(C0030.m5333(C0016.m3577(C0032.m5769(C0050.m8125(C0050.m8125(C0012.m2965(), C0056.m8909(str)), C0003.m1398(m568(), 868, 5, 3087)), C0009.m2090())), C0019.m4107(m568(), 873, 17, 468)));
        while (C0012.m2962(itM7807)) {
            m mVar = (m) C0048.m7949(itM7807);
            try {
                String strM8058 = C0049.m8058(C0030.m5333(mVar, C0009.m2037(m568(), 890, 3, 3061)), C0017.m3646(m568(), 893, 8, 2242));
                String strM2339 = C0010.m2339(mVar, C0065.m9775(m568(), 901, 4, 607));
                String strM23392 = C0010.m2339(mVar, C0007.m1842(m568(), 905, 5, 3163));
                if (!C0043.m7277(strM8058, C0041.m6779(m568(), 910, 4, 2665))) {
                    StringBuilder sb = new StringBuilder();
                    C0018.m3933(sb, C0065.m9738());
                    C0018.m3933(sb, strM8058);
                    strM8058 = C0047.m7763(sb);
                }
                C0004.m1532(arrayList, new com.github.catvod.spider.merge.E.m(C0024.m4752(strM2339, C0025.m4795(m568(), 914, 1, 2204))[2], strM23392, strM8058));
            } catch (Exception unused) {
            }
        }
        return C0047.m7783(arrayList);
    }
}