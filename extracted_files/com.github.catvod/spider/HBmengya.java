package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.E.b;
import com.github.catvod.spider.merge.E.g;
import com.github.catvod.spider.merge.E.m;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.N.C0023;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.Z.C0040;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.a0.C0042;
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
import com.github.catvod.spider.p000mergexbpq.a0.C0006;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.x.C0015;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class HBmengya extends Spider {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f49short = {2753, 2781, 2781, 2777, 2778, 2707, 2694, 2694, 2760, 2777, 2777, 2695, 2782, 2753, 2755, 2771, 2755, 2769, 2695, 2762, 2759, 31545, -30615, 25315, -31636, 22921, -31800, 24599, 2453, 2483, 2469, 2482, 2541, 2433, 2471, 2469, 2478, 2484, 609, 613, 614, 634, 634, 638, 547, 609, 613, 617, 609, 545, 612, 619, 623, 637, 609, 608, 610, 628, 631, 2482, 2470, 2471, 2491, 2492, 2465, 2490, 2473, 2482, 2471, 2490, 2492, 2493, 1387, 1399, 1348, 1382, 1388, 1353, 1389, 1383, 1345, 1383, 1348, 1351, 1371, 1396, 1351, 1343, 1344, 1383, 1351, 1405, 1351, 1376, 1372, 1339, 1389, 1357, 1351, 1336, 1351, 1381, 1406, 1366, 1368, 1357, 1348, 1335, 1312, 1387, 1399, 1348, 1378, 1387, 1350, 1359, 1383, 1345, 1380, 1355, 1341, 1347, 1396, 1381, 1399, 1344, 1396, 1359, 1340, 1347, 1370, 1381, 1405, 1351, 1378, 1368, 1396, 1364, 1366, 1348, 1348, 1364, 1357, 1351, 1336, 1344, 1370, 1359, 1339, 1347, 1354, 1385, 1341, 1344, 1354, 1355, 1405, 1351, 1376, 1348, 1378, 1364, 1340, 1378, 1396, 1386, 1353, 1368, 1399, 1366, 1341, 1372, 1406, 1388, 1369, 1371, 1383, 1345, 1383, 1351, 1399, 1347, 1354, 1351, 1342, 1346, 1370, 1359, 1341, 1346, 1370, 1359, 1339, 1351, 1354, 1351, 1401, 1345, 1380, 1371, 1401, 1345, 1380, 1351, 1398, 1351, 1383, 1401, 1383, 1391, 1366, 1344, 1384, 1388, 1369, 1335, 1383, 1391, 1369, 1398, 1378, 1366, 1340, 1348, 1406, 1388, 1379, 1375, 1383, 1345, 1379, 1364, 1382, 1388, 1350, 1344, 1378, 1346, 1357, 1348, 1381, 1351, 1380, 1377, 1383, 1347, 1380, 1375, 1399, 1344, 1370, 1359, 1340, 1345, 1354, 1344, 1382, 1347, 1340, 1348, 1381, 1367, 1380, 1344, 1379, 1347, 1370, 1355, 1338, 1364, 1353, 1364, 1379, 1347, 1380, 1368, 1383, 1367, 1370, 1372, 1383, 1347, 1369, 1344, 1383, 1367, 1370, 1352, 1382, 1351, 1376, 1342, 1312, 1377, 1405, 1350, 1396, 1337, 1373, 1345, 1372, 1344, 1337, 1374, 1350, 1348, 1336, 1403, 1381, 1379, 1342, 1380, 1388, 1343, 1407, 1355, 1350, 1385, 1348, 1387, 1379, 1335, 1346, 1364, 1376, 1337, 1404, 1384, 1336, 1398, 1343, 1337, 1343, 1357, 1366, 1334, 2282, 2214, 2217, 2218, 2224, 2209, 2282, 2227, 2295, 2282, 2225, 2221, 2208, 2212, 2225, 2208, 2231, 2282, 2221, 2218, 2216, 2208, 2202, 2229, 2212, 2210, 2208, 2298, 2225, 2221, 2208, 2212, 2225, 2208, 2231, 2202, 2214, 2217, 2212, 2230, 2230, 2202, 2220, 2209, 2296, 1411, 1489, 1500, 1493, 1472, 1432, 1428, 1411, 1478, 1481, 1476, 1494, 1494, 1431, 1530, 1484, 1473, 1494, 1432, 1429, 1411, 1493, 1476, 1474, 1472, 1530, 1483, 1488, 1480, 1432, 1122, 1076, 1061, 1059, 1057, 1051, 1079, 1069, 1086, 1057, 1145, 1142, 1136, 1660, 1657, 1644, 1657, 2455, 2450, 2440, 2447, 1113, 1093, 1096, 1100, 1113, 1096, 1119, 597, 600, 2395, 2374, 2395, 2371, 2378, 421, 425, 432, 419, 436, 409, 435, 436, 426, 26036, 26352, -32077, 2791, 2812, 2791, 2802, 2815, 1140, 1069, 1129, 1140, 1071, 1075, 1086, 1082, 1071, 1086, 1065, 1028, 1067, 1082, 1065, 1086, 1077, 1071, 1140, 1087, 1086, 1071, 1082, 1074, 1079, 1124, 1071, 1075, 1086, 1082, 1071, 1086, 1065, 1028, 1067, 1082, 1065, 1086, 1077, 1071, 1028, 1074, 1087, 1126, 3191, 3186, 3175, 3186, 3326, 3298, 3311, 3307, 3326, 3311, 3320, 3321, 1430, 1419, 1430, 1422, 1415, 1190, 1213, 1189, 2266, 2958, 2962, 2963, 2978, 2955, 2964, 2969, 2968, 2962, 2978, 2952, 2959, 2961, 889, -25002, 27275, 1997, 1984, 705, 710, 732, 730, 711, 716, 733, 715, 732, 705, 711, 710, 2253, 2262, 2271, 2252, 2267, 2273, 2269, 2257, 2248, 2267, 2252, 25494, 24786, -31599, 1863, 1873, 1878, 1878, 1857, 1866, 1872, 1915, 1866, 1873, 1865, 611, 619, 2569, 2871, 552, 1433, 23441, 24268, 30368, 25312, 21546, 18347, 23785, 18082, 17946, 27703, -26079, 21333, 22607, 28197, 23026, -28267, 22255, 21953, 20636, 1047, 2349, 2420, 2353, 2349, 2417, 2407, 2403, 2416, 2401, 2410, 284, 269, 272, 284, 574, 571, 558, 571, 479, 451, 462, 458, 479, 462, 473, 747, 765, 761, 746, 763, 752, 711, 764, 761, 748, 761, 3265, 3276, 2367, 2338, 2367, 2343, 2350, 1974, 1978, 1955, 1968, 1959, 1930, 1952, 1959, 1977, 24997, 25313, -31070, 943, 948, 943, 954, 951};
    public String a = C0028.m5109(m306(), 0, 21, 2729);
    public final String b = C0048.m7902(m306(), 21, 7, 1414);

    public static HashMap a() {
        return C0019.m4127(C0047.m7833(m306(), 28, 10, 2496), C0005.m1645(m306(), 38, 21, 526), C0002.m1305(m306(), 59, 13, 2515), C0040.m6584(m306(), 72, 264, 1294));
    }

    /* renamed from: ۣۣ۟ۨ۟, reason: not valid java name and contains not printable characters */
    public static JsonObject m301(Object obj) {
        if (C0004.m1557() <= 0) {
            return ((JsonElement) obj).getAsJsonObject();
        }
        return null;
    }

    /* renamed from: ۣ۠ۢۧ, reason: not valid java name and contains not printable characters */
    public static JsonObject m302(Object obj, Object obj2) {
        if (C0002.m1242() >= 0) {
            return ((JsonObject) obj).getAsJsonObject((String) obj2);
        }
        return null;
    }

    /* renamed from: ۣۧۥ۠, reason: not valid java name and contains not printable characters */
    public static JsonArray m303(Object obj, Object obj2) {
        if (C0033.m5872() > 0) {
            return ((JsonObject) obj).getAsJsonArray((String) obj2);
        }
        return null;
    }

    /* renamed from: ۥۨۦۢ, reason: contains not printable characters */
    public static Iterator m304(Object obj) {
        if (C0039.m6529() < 0) {
            return ((JsonArray) obj).iterator();
        }
        return null;
    }

    /* renamed from: ۦۦ۠ۥ, reason: contains not printable characters */
    public static JsonPrimitive m305(Object obj, Object obj2) {
        if (C0027.m5017() > 0) {
            return ((JsonObject) obj).getAsJsonPrimitive((String) obj2);
        }
        return null;
    }

    /* renamed from: ۧۥۤۦ, reason: not valid java name and contains not printable characters */
    public static short[] m306() {
        if (C0054.m8557() <= 0) {
            return f49short;
        }
        return null;
    }

    /* renamed from: ۨۨۢ, reason: not valid java name and contains not printable characters */
    public static String m307(Object obj) {
        if (C0038.m6471() > 0) {
            return ((JsonPrimitive) obj).getAsString();
        }
        return null;
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        C0011.m2747(sb, C0050.m8112(this), C0056.m8911(m306(), 336, 45, 2245), str, C0040.m6584(m306(), 381, 30, 1445));
        Iterator itM304 = m304(m303(m302((JsonObject) C0033.m5856(C0032.m5769(C0028.m5188(sb, str2, C0055.m8814(m306(), 411, 13, 1092)), C0034.m5982()), JsonObject.class), C0027.m5062(m306(), 424, 4, 1560)), C0039.m6551(m306(), 428, 4, 2555)));
        while (C0012.m2962(itM304)) {
            JsonObject jsonObjectM302 = m302(m301((JsonElement) C0048.m7949(itM304)), C0039.m6551(m306(), 432, 7, 1069));
            String strM307 = m307(m305(jsonObjectM302, C0057.m8978(m306(), 439, 2, 572)));
            String strM3072 = m307(m305(jsonObjectM302, C0049.m8007(m306(), 441, 5, 2351)));
            String strM3073 = m307(m305(jsonObjectM302, C0041.m6779(m306(), 446, 9, 454)));
            StringBuilder sb2 = new StringBuilder(C0061.m9361(m306(), 455, 3, 832));
            C0018.m3933(sb2, m307(m305(jsonObjectM302, C0027.m5062(m306(), 458, 5, 2707))));
            C0004.m1532(arrayList, new m(strM307, strM3072, strM3073, C0047.m7763(sb2)));
        }
        return C0047.m7783(arrayList);
    }

    public String detailContent(List<String> list) {
        new ArrayList();
        StringBuilder sb = new StringBuilder();
        C0018.m3933(sb, C0050.m8112(this));
        C0018.m3933(sb, C0038.m6452(m306(), 463, 44, 1115));
        C0018.m3933(sb, (String) C0048.m7915(list, 0));
        JsonObject jsonObjectM302 = m302((JsonObject) C0033.m5856(C0032.m5769(C0047.m7763(sb), C0034.m5982()), JsonObject.class), C0061.m9361(m306(), 507, 4, 3091));
        JsonArray jsonArrayM303 = m303(jsonObjectM302, C0057.m8978(m306(), 511, 8, 3210));
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        String strM307 = m307(m305(jsonObjectM302, C0015.m3484(m306(), 519, 5, 1506)));
        Iterator itM304 = m304(jsonArrayM303);
        while (C0012.m2962(itM304)) {
            JsonObject jsonObjectM301 = m301((JsonElement) C0048.m7949(itM304));
            C0018.m3933(sb2, m307(m305(jsonObjectM301, C0058.m9106(m306(), 524, 3, 1224))));
            C0018.m3933(sb2, C0050.m8131(m306(), 527, 1, 2302));
            C0018.m3933(sb2, m307(m305(jsonObjectM301, C0020.m4199(m306(), 528, 13, 3069))));
            C0018.m3933(sb2, C0031.m5565(m306(), 541, 1, 858));
        }
        C0018.m3933(sb3, C0045.m7657(m306(), 542, 2, 1166));
        m mVar = new m();
        C0011.m2828(mVar, m307(m305(jsonObjectM302, C0055.m8814(m306(), 544, 2, 1956))));
        C0005.m1628(mVar, strM307);
        StringBuilder sb4 = new StringBuilder();
        C0018.m3933(sb4, C0055.m8703());
        C0018.m3933(sb4, m307(m305(jsonObjectM302, C0041.m6779(m306(), 546, 12, 680))));
        C0027.m5000(mVar, C0047.m7763(sb4));
        C0026.m4947(mVar, m307(m305(jsonObjectM302, C0020.m4199(m306(), 558, 11, 2238))));
        StringBuilder sb5 = new StringBuilder();
        C0018.m3933(sb5, C0036.m6189());
        C0018.m3933(sb5, C0007.m1842(m306(), 569, 3, 1378));
        C0018.m3933(sb5, m307(m305(jsonObjectM302, C0007.m1842(m306(), 572, 11, 1828))));
        C0019.m4073(mVar, C0047.m7763(sb5));
        C0054.m8596(mVar, C0047.m7763(sb3));
        C0044.m7449(mVar, C0047.m7763(sb2));
        return C0053.m8428(mVar);
    }

    public String homeContent(boolean z) {
        ArrayList arrayList = new ArrayList();
        List listM1203 = C0001.m1203(new String[]{C0022.m4403(m306(), 583, 1, 594), C0051.m8259(m306(), 584, 1, 601), C0034.m6001(m306(), 585, 1, 2609), C0053.m8477(m306(), 586, 1, 2816), C0022.m4403(m306(), 587, 1, 539), C0022.m4403(m306(), 588, 1, 1452)});
        List listM12032 = C0001.m1203(new String[]{C0054.m8574(m306(), 589, 2, 2550), C0008.m1970(m306(), 591, 3, 1613), C0048.m7902(m306(), 594, 4, 2225), C0032.m5708(m306(), 598, 4, 2600), C0034.m6001(m306(), 602, 2, 2965), C0049.m8007(m306(), 604, 4, 1958)});
        for (int i = 0; i < C0064.m9636(listM1203); i++) {
            C0004.m1532(arrayList, new b((String) C0048.m7915(listM1203, i), (String) C0048.m7915(listM12032, i), null));
        }
        return C0003.m1448(C0057.m8956(this), null, arrayList);
    }

    public void init(Context context, String str) {
        if (C0057.m8953(str)) {
            return;
        }
        this.a = str;
    }

    public String playerContent(String str, String str2, List<String> list) {
        C0036.m6219();
        g gVar = new g();
        C0017.m3667(gVar, str2);
        return C0033.m5828(gVar);
    }

    public String searchContent(String str, boolean z) {
        return C0040.m6615(this, str, z, C0044.m7509(m306(), 608, 1, 1062));
    }

    public String searchContent(String str, boolean z, String str2) {
        ArrayList arrayList = new ArrayList();
        Iterator itM304 = m304(m303(m302(m302((JsonObject) C0033.m5856(C0008.m2029(C0003.m1396(C0028.m5188(new StringBuilder(), C0050.m8112(this), C0062.m9389(m306(), 609, 10, 2306)), C0020.m4251(C0003.m1398(m306(), 619, 4, 360), str), C0034.m5982())), JsonObject.class), C0047.m7833(m306(), 623, 4, 602)), C0001.m1189(m306(), 627, 7, 427)), C0023.m4536(m306(), 634, 11, 664)));
        while (C0012.m2962(itM304)) {
            JsonObject jsonObjectM301 = m301((JsonElement) C0048.m7949(itM304));
            String strM307 = m307(m305(jsonObjectM301, C0030.m5362(m306(), 645, 2, 3240)));
            String strM3072 = m307(m305(jsonObjectM301, C0006.m1774(m306(), 647, 5, 2379)));
            String strM3073 = m307(m305(jsonObjectM301, C0042.m7151(m306(), 652, 9, 2005)));
            StringBuilder sb = new StringBuilder(C0005.m1645(m306(), 661, 3, 1873));
            C0018.m3933(sb, m307(m305(jsonObjectM301, C0015.m3484(m306(), 664, 5, 987))));
            C0004.m1532(arrayList, new m(strM307, strM3072, strM3073, C0047.m7763(sb)));
        }
        return C0047.m7783(arrayList);
    }
}