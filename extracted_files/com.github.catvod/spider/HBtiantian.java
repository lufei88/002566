package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.E.b;
import com.github.catvod.spider.merge.E.g;
import com.github.catvod.spider.merge.E.m;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.J0.C0021;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.merge.c1.C0046;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.merge.f.C0051;
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
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.c0.C0010;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import com.github.catvod.spider.p000mergexbpq.r.C0014;
import com.github.catvod.spider.p000mergexbpq.x.C0015;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class HBtiantian extends Spider {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f61short = {30511, -31617, 28405, -30598, 21919, -28706, 27649, 3010, 3044, 3058, 3045, 3002, 3030, 3056, 3058, 3065, 3043, 545, 549, 550, 570, 570, 574, 611, 545, 549, 553, 545, 609, 548, 555, 559, 573, 545, 544, 546, 564, 567, 1302, 1338, 1339, 1313, 1328, 1339, 1313, 1400, 1281, 1324, 1317, 1328, 1898, 1915, 1915, 1895, 1890, 1896, 1898, 1919, 1890, 1892, 1893, 1828, 1907, 1830, 1916, 1916, 1916, 1830, 1901, 1892, 1913, 1894, 1830, 1918, 1913, 1895, 1902, 1893, 1896, 1892, 1903, 1902, 1903, 1365, 1364, 1291, 1288, 1290, 1287, 1371, 1356, 1354, 1364, 1286, 1290, 1365, 1357, 1286, 1287, 1356, 1290, 1364, 1366, 1286, 1357, 1290, 1291, 1366, 1368, 1286, 1290, 1366, 1364, 1368, 1370, 1357, 1294, 1290, 1365, 1813, 1868, 1800, 1813, 1874, 1877, 1879, 1887, 1813, 1870, 1859, 1866, 1887, 1893, 1865, 1887, 1883, 1864, 1881, 1874, 2111, 2085, 2091, 2082, 1277, 1264, 1273, 1260, 1238, 1248, 1261, 1069, 1084, 1082, 1080, 926, 923, 910, 923, 2444, 2441, 2451, 2452, 2478, 2487, 2492, 2439, 2481, 2492, 3142, 3167, 3156, 3183, 3166, 3153, 3165, 3157, 829, 804, 815, 788, 827, 802, 808, 694, 687, 676, 671, 690, 677, 685, 673, 690, 683, 691, 1058, 1147, 1087, 1058, 1125, 1122, 1120, 1128, 1058, 1147, 1122, 1129, 1106, 1129, 1128, 1145, 1132, 1124, 1121, 1150, 768, 794, 788, 797, 2190, 2199, 2204, 2215, 2193, 2204, 2129, 2124, 2120, 2112, 2134, 2129, 2116, 2120, 2133, 2247, 2242, 2263, 2242, 1583, 1590, 1597, 1542, 1577, 1589, 1592, 1568, 1542, 1589, 1584, 1578, 1581, 2974, 2951, 2956, 2999, 2950, 2953, 2949, 2957, 1703, 1709, 1696, 1702, 1736, 1743, 1745, 1742, 1451, 1444, 1448, 1440, 1217, 1232, 1219, 1218, 1236, 1262, 1220, 1219, 1245, 1218, 3058, 2675, 2676, 2666, 2515, 2136, 2136, 2136, 1486, 1495, 1500, 1511, 1499, 1495, 1494, 1484, 1501, 1494, 1484, 2083, 2106, 2097, 2058, 2097, 2108, 2087, 2096, 2102, 2081, 2106, 2087, 2633, 2640, 2651, 2656, 2654, 2652, 2635, 2640, 2637, 2901, 2892, 2887, 2940, 2899, 2890, 2880, 817, 808, 803, 792, 821, 802, 810, 806, 821, 812, 820, 3210, 2671, 3313, 1840, 29580, 22984, 28811, -29576, 22489, 22124, 27631, 30263, -30031, 3073, 499, 495, 495, 491, 27052, 22819, 1133, 1135, 1135, 2051, 2052, 2074, 1062, 3308, 3253, 3313, 3308, 3243, 3244, 3246, 3238, 3308, 3248, 3238, 3234, 3249, 3232, 3243, 1469, 1447, 1449, 1440, 2894, 2880, 2908, 2898, 2890, 2903, 2881, 3285, 3272, 3276, 3268, 3282, 3285, 3264, 3276, 3281, 2339, 2342, 2355, 2342, 1361, 1364, 1358, 1353, 2277, 2300, 2295, 2252, 2298, 2295, 1767, 1790, 1781, 1742, 1791, 1776, 1788, 1780, 2190, 2199, 2204, 2215, 2184, 2193, 2203, 750, 759, 764, 711, 746, 765, 757, 761, 746, 755, 747};
    public String a = C0007.m1840();
    public final String b = C0034.m6001(m379(), 0, 7, 2448);

    public static HashMap a() {
        return C0019.m4127(C0011.m2805(m379(), 7, 10, 2967), C0008.m1970(m379(), 17, 21, 590), C0002.m1305(m379(), 38, 12, 1365), C0041.m6779(m379(), 50, 33, 1803));
    }

    public static String b() {
        String strM5627 = C0031.m5627(C0009.m2099());
        String strM8636 = C0054.m8636(strM5627, 0, C0051.m8186(10, C0004.m1584(strM5627)));
        StringBuilder sb = new StringBuilder(C0036.m6188(m379(), 83, 36, 1342));
        C0018.m3933(sb, strM8636);
        return C0022.m4413(C0047.m7763(sb));
    }

    /* renamed from: ۣۣ۟۠ۧ, reason: not valid java name and contains not printable characters */
    public static short[] m379() {
        if (C0048.m7971() >= 0) {
            return f61short;
        }
        return null;
    }

    /* renamed from: ۟ۡ۟ۦۥ, reason: not valid java name and contains not printable characters */
    public static JsonPrimitive m380(Object obj, Object obj2) {
        if (C0063.m9589() < 0) {
            return ((JsonObject) obj).getAsJsonPrimitive((String) obj2);
        }
        return null;
    }

    /* renamed from: ۣ۟ۧۧ, reason: not valid java name and contains not printable characters */
    public static JsonArray m381(Object obj, Object obj2) {
        if (C0064.m9659() < 0) {
            return ((JsonObject) obj).getAsJsonArray((String) obj2);
        }
        return null;
    }

    /* renamed from: ۟ۥۥۤ, reason: not valid java name and contains not printable characters */
    public static JsonObject m382(Object obj) {
        if (C0011.m2755() > 0) {
            return ((JsonElement) obj).getAsJsonObject();
        }
        return null;
    }

    /* renamed from: ۣۧۦۣ, reason: not valid java name and contains not printable characters */
    public static Iterator m383(Object obj) {
        if (C0027.m5017() >= 0) {
            return ((JsonArray) obj).iterator();
        }
        return null;
    }

    /* renamed from: ۥۡۦۨ, reason: contains not printable characters */
    public static JsonObject m384(Object obj, Object obj2) {
        if (C0002.m1242() > 0) {
            return ((JsonObject) obj).getAsJsonObject((String) obj2);
        }
        return null;
    }

    /* renamed from: ۥۧۦۡ, reason: contains not printable characters */
    public static String m385(Object obj) {
        if (C0034.m6048() < 0) {
            return ((JsonPrimitive) obj).getAsString();
        }
        return null;
    }

    /* renamed from: ۦۨۥۨ, reason: contains not printable characters */
    public static String m386(Object obj) {
        if (C0063.m9589() <= 0) {
            return ((JsonElement) obj).getAsString();
        }
        return null;
    }

    /* renamed from: ۧۨۥۨ, reason: not valid java name and contains not printable characters */
    public static JsonElement m387(Object obj, int i) {
        if (C0031.m5628() >= 0) {
            return ((JsonArray) obj).get(i);
        }
        return null;
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        ArrayList arrayList = new ArrayList();
        String strM5188 = C0028.m5188(new StringBuilder(), C0008.m1974(this), C0037.m6307(m379(), 119, 20, 1850));
        HashMap map2 = new HashMap();
        C0053.m8424(map2, C0055.m8814(m379(), 139, 4, 2124), C0032.m5681());
        C0053.m8424(map2, C0013.m3106(m379(), 143, 7, 1161), str);
        C0053.m8424(map2, C0015.m3484(m379(), 150, 4, 1117), str2);
        Iterator itM383 = m383(m381(m384((JsonObject) C0033.m5856(C0008.m2029(C0003.m1396(strM5188, map2, C0043.m7288())), JsonObject.class), C0064.m9599(m379(), 154, 4, 1018)), C0056.m8911(m379(), 158, 4, 2528)));
        while (C0012.m2962(itM383)) {
            JsonObject jsonObjectM382 = m382((JsonElement) C0048.m7949(itM383));
            C0004.m1532(arrayList, new m(m385(m380(jsonObjectM382, C0028.m5109(m379(), 162, 6, 2520))), m385(m380(jsonObjectM382, C0060.m9352(m379(), 168, 8, 3120))), m385(m380(jsonObjectM382, C0011.m2805(m379(), 176, 7, 843))), m385(m380(jsonObjectM382, C0043.m7290(m379(), 183, 11, 704)))));
        }
        return C0047.m7783(arrayList);
    }

    public String detailContent(List<String> list) {
        new ArrayList();
        String strM5188 = C0028.m5188(new StringBuilder(), C0008.m1974(this), C0017.m3646(m379(), 194, 20, 1037));
        String str = (String) C0048.m7915(list, 0);
        HashMap map = new HashMap();
        C0053.m8424(map, C0062.m9389(m379(), 214, 4, 883), C0032.m5681());
        String strM5708 = C0032.m5708(m379(), 218, 6, 2296);
        C0053.m8424(map, strM5708, str);
        String strM5627 = C0031.m5627(C0009.m2099());
        C0053.m8424(map, C0021.m4340(m379(), 224, 9, 2085), C0054.m8636(strM5627, 0, C0051.m8186(10, C0004.m1584(strM5627))));
        JsonObject jsonObjectM384 = m384((JsonObject) C0033.m5856(C0008.m2029(C0003.m1396(strM5188, map, C0043.m7288())), JsonObject.class), C0050.m8131(m379(), 233, 4, 2211));
        JsonArray jsonArrayM381 = m381(jsonObjectM384, C0061.m9361(m379(), 237, 13, 1625));
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        String strM385 = m385(m380(jsonObjectM384, C0015.m3484(m379(), 250, 8, 3048)));
        Iterator itM383 = m383(jsonArrayM381);
        while (C0012.m2962(itM383)) {
            JsonObject jsonObjectM382 = m382((JsonElement) C0048.m7949(itM383));
            C0018.m3933(sb2, C0016.m3579());
            C0018.m3933(sb2, m385(m380(jsonObjectM382, C0065.m9775(m379(), 258, 4, 1729))));
            Iterator itM3832 = m383(m381(jsonObjectM382, C0061.m9361(m379(), 262, 4, 1725)));
            while (C0012.m2962(itM3832)) {
                JsonObject jsonObjectM3822 = m382((JsonElement) C0048.m7949(itM3832));
                String strM2973 = C0012.m2973(m379(), 266, 4, 1477);
                C0018.m3933(sb, m385(m380(jsonObjectM3822, strM2973)));
                C0062.m9399(sb, '$');
                C0018.m3933(sb, m386(m387(m381(jsonObjectM382, C0010.m2300(m379(), 270, 10, 1201)), 0)));
                String strM2805 = C0011.m2805(m379(), 280, 1, 2956);
                C0018.m3933(sb, strM2805);
                C0018.m3933(sb, m385(m380(jsonObjectM3822, C0047.m7833(m379(), 281, 3, 2566))));
                C0018.m3933(sb, strM2805);
                C0018.m3933(sb, strM385);
                C0018.m3933(sb, strM2805);
                C0018.m3933(sb, m385(m380(jsonObjectM3822, strM2973)));
                C0018.m3933(sb, C0043.m7290(m379(), 284, 1, 2544));
            }
            String strM9352 = C0060.m9352(m379(), 285, 3, 2172);
            C0018.m3933(sb2, strM9352);
            C0018.m3933(sb, strM9352);
        }
        m mVar = new m();
        C0011.m2828(mVar, m385(m380(jsonObjectM384, strM5708)));
        C0005.m1628(mVar, strM385);
        StringBuilder sb3 = new StringBuilder();
        C0018.m3933(sb3, C0055.m8703());
        C0018.m3933(sb3, m385(m380(jsonObjectM384, C0008.m1970(m379(), 288, 11, 1464))));
        C0027.m5000(mVar, C0047.m7763(sb3));
        C0058.m9159(mVar, m385(m380(jsonObjectM384, C0056.m8911(m379(), 299, 12, 2133))));
        C0058.m9152(mVar, m385(m380(jsonObjectM384, C0032.m5708(m379(), 311, 9, 2623))));
        C0026.m4947(mVar, m385(m380(jsonObjectM384, C0030.m5362(m379(), 320, 7, 2851))));
        StringBuilder sb4 = new StringBuilder();
        C0018.m3933(sb4, C0036.m6189());
        C0018.m3933(sb4, m385(m380(jsonObjectM384, C0061.m9361(m379(), 327, 11, 839))));
        C0019.m4073(mVar, C0047.m7763(sb4));
        C0054.m8596(mVar, C0047.m7763(sb2));
        C0044.m7449(mVar, C0047.m7763(sb));
        return C0053.m8428(mVar);
    }

    public String homeContent(boolean z) {
        ArrayList arrayList = new ArrayList();
        List listM1203 = C0001.m1203(new String[]{C0032.m5708(m379(), 338, 1, 3259), C0003.m1398(m379(), 339, 1, 2653), C0033.m5852(m379(), 340, 1, 3266), C0001.m1189(m379(), 341, 1, 1796)});
        List listM12032 = C0001.m1203(new String[]{C0026.m4951(m379(), 342, 2, 1721), C0016.m3525(m379(), 344, 3, 1470), C0033.m5852(m379(), 347, 2, 1220), C0027.m5062(m379(), 349, 2, 2251)});
        for (int i = 0; i < C0064.m9636(listM1203); i++) {
            C0004.m1532(arrayList, new b((String) C0048.m7915(listM1203, i), (String) C0048.m7915(listM12032, i), null));
        }
        return C0003.m1448(C0028.m5108(this), null, arrayList);
    }

    public void init(Context context, String str) {
        this.a = str;
    }

    public String playerContent(String str, String str2, List<String> list) {
        C0036.m6219();
        String[] strArrM4752 = C0024.m4752(str2, C0037.m6307(m379(), 351, 1, 3199));
        String strM385 = null;
        String str3 = (strArrM4752.length <= 0 || C0057.m8953(strArrM4752[0])) ? null : strArrM4752[0];
        String str4 = (strArrM4752.length <= 1 || C0057.m8953(strArrM4752[1])) ? null : strArrM4752[1];
        String strM2827 = C0011.m2827(str4, (strArrM4752.length <= 2 || C0057.m8953(strArrM4752[2])) ? null : strArrM4752[2], (strArrM4752.length <= 3 || C0057.m8953(strArrM4752[3])) ? null : strArrM4752[3]);
        if (C0058.m9127(str3, C0027.m5062(m379(), 352, 4, 411))) {
            StringBuilder sb = new StringBuilder();
            C0018.m3933(sb, str3);
            C0018.m3933(sb, str4);
            String strM5769 = C0032.m5769(C0047.m7763(sb), null);
            if (C0058.m9127(strM5769, C0062.m9389(m379(), 356, 2, 3004)) || C0058.m9127(strM5769, C0033.m5852(m379(), 358, 3, 1119))) {
                strM385 = m385(m380((JsonObject) C0033.m5856(strM5769, JsonObject.class), C0045.m7657(m379(), 361, 3, 2166)));
            }
        }
        C0036.m6219();
        if (strM385 != null) {
            g gVar = new g();
            C0017.m3667(gVar, strM385);
            C0002.m1282(gVar, strM2827);
            C0057.m9029(gVar, C0038.m6454());
            return C0033.m5828(gVar);
        }
        g gVar2 = new g();
        C0017.m3667(gVar2, str4);
        C0064.m9646(gVar2);
        C0002.m1282(gVar2, strM2827);
        C0057.m9029(gVar2, C0038.m6454());
        return C0033.m5828(gVar2);
    }

    public String searchContent(String str, boolean z) {
        return C0033.m5882(this, str, z, C0005.m1645(m379(), 364, 1, 1047));
    }

    public String searchContent(String str, boolean z, String str2) {
        ArrayList arrayList = new ArrayList();
        String strM5188 = C0028.m5188(new StringBuilder(), C0008.m1974(this), C0016.m3525(m379(), 365, 15, 3267));
        HashMap map = new HashMap();
        C0053.m8424(map, C0014.m3332(m379(), 380, 4, 1486), C0032.m5681());
        C0053.m8424(map, C0028.m5109(m379(), 384, 7, 2853), str);
        String strM5627 = C0031.m5627(C0009.m2099());
        C0053.m8424(map, C0016.m3525(m379(), 391, 9, 3233), C0054.m8636(strM5627, 0, C0051.m8186(10, C0004.m1584(strM5627))));
        Iterator itM383 = m383(m381(m384((JsonObject) C0033.m5856(C0008.m2029(C0003.m1396(strM5188, map, C0043.m7288())), JsonObject.class), C0030.m5362(m379(), 400, 4, 2375)), C0029.m5256(m379(), 404, 4, 1341)));
        while (C0012.m2962(itM383)) {
            JsonObject jsonObjectM382 = m382((JsonElement) C0048.m7949(itM383));
            C0004.m1532(arrayList, new m(m385(m380(jsonObjectM382, C0050.m8131(m379(), 408, 6, 2195))), m385(m380(jsonObjectM382, C0055.m8814(m379(), 414, 8, 1681))), m385(m380(jsonObjectM382, C0013.m3106(m379(), 422, 7, 2296))), m385(m380(jsonObjectM382, C0046.m7718(m379(), 429, 11, 664)))));
        }
        return C0047.m7783(arrayList);
    }
}