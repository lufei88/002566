package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.spider.merge.E.b;
import com.github.catvod.spider.merge.E.g;
import com.github.catvod.spider.merge.E.m;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.N.C0023;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.T0.h;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.Z.C0040;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.merge.c1.C0046;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.g0.AbstractC0308c;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.merge.z.C0065;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.a0.C0006;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.github.catvod.spider.p000mergexbpq.c0.C0010;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.r.C0014;
import com.github.catvod.spider.p000mergexbpq.x.C0015;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class YunPanBa extends Cloud {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f136short = {1882, 1916, 1898, 1917, 1826, 1870, 1896, 1898, 1889, 1915, 1786, 1752, 1741, 1758, 1755, 1755, 1750, 1688, 1666, 1689, 1671, 1687, 1695, 1760, 1758, 1753, 1747, 1752, 1728, 1732, 1687, 1785, 1763, 1687, 1670, 1671, 1689, 1671, 1676, 1687, 1760, 1758, 1753, 1665, 1667, 1676, 1687, 1743, 1665, 1667, 1694, 1687, 1782, 1735, 1735, 1755, 1746, 1760, 1746, 1749, 1788, 1758, 1731, 1688, 1666, 1668, 1664, 1689, 1668, 1665, 1687, 1695, 1788, 1791, 1763, 1786, 1787, 1691, 1687, 1755, 1758, 1756, 1746, 1687, 1776, 1746, 1748, 1756, 1752, 1694, 1687, 1780, 1759, 1733, 1752, 1754, 1746, 1688, 1670, 1669, 1669, 1689, 1671, 1689, 1671, 1689, 1671, 1687, 1764, 1750, 1745, 1750, 1733, 1758, 1688, 1666, 1668, 1664, 1689, 1668, 1665, 2140, 2137, 2124, 2137, 1464, 1461, 1466, 1455, 1455, 1449, 1458, 1465, 1454, 1455, 1470, 1448, 2169, 2148, 2169, 2145, 2152, -2593, 2922, 2934, 2934, 2930, 2929, 2872, 2861, 2861, 2939, 2935, 2924, 2930, 2915, 2924, 2874, 2860, 2913, 2913, 2861, 2915, 2930, 2923, 2861, 2918, 2923, 2929, 2913, 2935, 2929, 2929, 2923, 2925, 2924, 2929, 2877, 2923, 2924, 2913, 2926, 2935, 2918, 2919, 2879, 2935, 2929, 2919, 2928, 2855, 2864, 2881, 2926, 2915, 2929, 2934, 2898, 2925, 2929, 2934, 2919, 2918, 2903, 2929, 2919, 2928, 2855, 2864, 2881, 2927, 2925, 2929, 2934, 2896, 2919, 2926, 2919, 2932, 2915, 2924, 2934, 2898, 2925, 2929, 2934, 2855, 2864, 2881, 2927, 2925, 2929, 2934, 2896, 2919, 2926, 2919, 2932, 2915, 2924, 2934, 2898, 2925, 2929, 2934, 2860, 2935, 2929, 2919, 2928, 2855, 2864, 2881, 2934, 2915, 2917, 2929, 2855, 2864, 2881, 2934, 2915, 2917, 2929, 2860, 2930, 2915, 2928, 2919, 2924, 2934, 2855, 2864, 2881, 2916, 2923, 2928, 2929, 2934, 2898, 2925, 2929, 2934, 2852, 2916, 2923, 2926, 2934, 2919, 2928, 2855, 2871, 2880, 2931, 2855, 2871, 2886, 2879, 2037, 1952, 1980, 1953, 1959, 2037, 1955, 1970, 1972, 1974, 2038, 2022, 1937, 1980, 1973, 1973, 1952, 1974, 1959, 2038, 2022, 1943, 2030, 3062, 3050, 3050, 3054, 3053, 2980, 2993, 2993, 3047, 3051, 3056, 3054, 3071, 3056, 2982, 2992, 3069, 3069, 2993, 3071, 3054, 3063, 2993, 3066, 3063, 3053, 3069, 3051, 3053, 3053, 3063, 3057, 3056, 3053, 2977, 3063, 3056, 3069, 3058, 3051, 3066, 3067, 2979, 3051, 3053, 3067, 3052, 3003, 2988, 3037, 3058, 3071, 3053, 3050, 3022, 3057, 3053, 3050, 3067, 3066, 3019, 3053, 3067, 3052, 3003, 2988, 3037, 3050, 3071, 3065, 3053, 3003, 2988, 3037, 3050, 3071, 3065, 3053, 2992, 3054, 3071, 3052, 3067, 3056, 3050, 3003, 2988, 3037, 3064, 3063, 3052, 3053, 3050, 3022, 3057, 3053, 3050, 3000, 3064, 3063, 3058, 3050, 3067, 3052, 3003, 2987, 3036, 3050, 3071, 3065, 3003, 2987, 3034, 2979, 1418, 1503, 1475, 1502, 1496, 1418, 1500, 1485, 1483, 1481, 1417, 1433, 1518, 1475, 1482, 1482, 1503, 1481, 1496, 1417, 1433, 1512, 1425, 3075, 3103, 3103, 3099, 3096, 3153, 3140, 3140, 3090, 3102, 3077, 3099, 3082, 3077, 3155, 3141, 3080, 3080, 3140, 3087, 3140, 2304, 2304, 2372, 2377, 2390, 2318, 2371, 2383, 2382, 2388, 2369, 2377, 2382, 2373, 2386, 2304, 2304, 2334, 2304, 2376, 2321, 3202, 3202, 3270, 3275, 3284, 3212, 3314, 3277, 3281, 3286, 3215, 3264, 3277, 3270, 3291, 3202, 3228, 3202, 3282, 3202, 3228, 3202, 3275, 3279, 3269, 1884, 1885, 1868, 443, 438, 425, 497, 399, 432, 428, 427, 498, 445, 432, 443, 422, 511, 481, 511, 431, 511, 481, 511, 446, 3313, 3307, 3324, 3327, 1257, 1193, 1205, 1205, 1201, 1202, 1275, 1181, 1262, 1181, 1262, 1201, 1184, 1199, 1181, 1263, 1200, 1204, 1184, 1203, 1194, 1181, 1263, 1186, 1199, 1181, 1262, 1202, 1181, 1262, 1178, 1183, 1251, 1180, 1258, 1256, 1141, 1077, 1065, 1065, 1069, 1070, 1127, 1025, 1138, 1025, 1138, 1081, 1071, 1076, 1067, 1080, 1025, 1139, 1064, 1086, 1025, 1139, 1086, 1075, 1025, 1138, 1070, 1025, 1138, 1030, 1027, 1151, 1024, 1142, 1140, 1286, 1350, 1370, 1370, 1374, 1373, 1300, 1394, 1281, 1394, 1281, 1369, 1369, 1369, 1394, 1280, 1359, 1346, 1351, 1367, 1371, 1344, 1354, 1372, 1351, 1368, 1355, 1394, 1280, 1357, 1345, 1347, 1394, 1281, 1373, 1394, 1281, 1397, 1392, 1292, 1395, 1285, 1362, 1350, 1370, 1370, 1374, 1373, 1300, 1394, 1281, 1394, 1281, 1369, 1369, 1369, 1394, 1280, 1359, 1346, 1351, 1374, 1359, 1344, 1394, 1280, 1357, 1345, 1347, 1394, 1281, 1373, 1394, 1281, 1397, 1392, 1292, 1395, 1285, 1287, 867, 895, 895, 891, 888, 817, 804, 804, 882, 894, 869, 891, 874, 869, 819, 805, 872, 872, 804, 874, 891, 866, 804, 879, 866, 888, 872, 894, 888, 888, 866, 868, 869, 888, 820, 866, 869, 872, 871, 894, 879, 878, 822, 894, 888, 878, 889, 814, 825, 840, 871, 874, 888, 895, 859, 868, 888, 895, 878, 879, 862, 888, 878, 889, 814, 825, 840, 895, 874, 876, 888, 814, 825, 840, 895, 874, 876, 888, 805, 891, 874, 889, 878, 869, 895, 814, 825, 840, 877, 866, 889, 888, 895, 859, 868, 888, 895, 813, 888, 868, 889, 895, 813, 891, 874, 876, 878, 814, 830, 841, 868, 877, 877, 888, 878, 895, 814, 830, 847, 822, 827, 2691, 2707, 2708, 2717, 2697, 2706, 2707, 23356, -29301, 577, 586, 587, 578, 584, 580, 587, 21747, 26992, 1858};

    public static HashMap a() {
        return C0020.m4251(C0008.m1970(m778(), 0, 10, 1807), C0031.m5565(m778(), 10, 111, 1719));
    }

    public static ArrayList b(String str) {
        String str2;
        JsonArray jsonArrayM775 = m775(m774(m779(str), C0030.m5362(m778(), 121, 4, 2104)));
        ArrayList arrayList = new ArrayList();
        Iterator itM776 = m776(jsonArrayM775);
        while (C0012.m2962(itM776)) {
            JsonObject jsonObjectM777 = m777((JsonElement) C0048.m7949(itM776));
            String strM773 = m773(m774(jsonObjectM777, C0036.m6188(m778(), 125, 2, 1489)));
            String strM7732 = m773(m774(m777(m774(jsonObjectM777, C0029.m5256(m778(), 127, 10, 1499))), C0031.m5565(m778(), 137, 5, 2061)));
            String strM1305 = C0002.m1305(m778(), 142, 1, 2775);
            if (C0058.m9127(strM7732, strM1305)) {
                String str3 = C0024.m4752(strM7732, strM1305)[0];
                str2 = C0024.m4752(strM7732, strM1305)[1];
                strM7732 = str3;
            } else {
                str2 = strM7732;
            }
            C0055.m8732(strM773, strM7732, C0007.m1840(), str2, arrayList);
        }
        return arrayList;
    }

    public static String c(String str, String str2) {
        StringBuilder sb = new StringBuilder(C0030.m5362(m778(), 143, 155, 2818));
        C0018.m3933(sb, C0056.m8909(str));
        C0018.m3933(sb, C0064.m9599(m778(), 298, 23, 2003));
        C0036.m6177(sb, (C0038.m6456(str2) - 1) * 20);
        return C0047.m7783(C0012.m2977(C0032.m5769(C0047.m7763(sb), C0030.m5363())));
    }

    /* renamed from: ۟ۡۡۨ۠, reason: not valid java name and contains not printable characters */
    public static String m773(Object obj) {
        if (C0015.m3433() > 0) {
            return ((JsonElement) obj).getAsString();
        }
        return null;
    }

    /* renamed from: ۟ۡۨۥۦ, reason: not valid java name and contains not printable characters */
    public static JsonElement m774(Object obj, Object obj2) {
        if (C0030.m5375() > 0) {
            return ((JsonObject) obj).get((String) obj2);
        }
        return null;
    }

    /* renamed from: ۣۣ۟ۢۡ, reason: not valid java name and contains not printable characters */
    public static JsonArray m775(Object obj) {
        if (C0031.m5628() >= 0) {
            return ((JsonElement) obj).getAsJsonArray();
        }
        return null;
    }

    /* renamed from: ۟ۧۥۦۣ, reason: not valid java name and contains not printable characters */
    public static Iterator m776(Object obj) {
        if (C0028.m5152() < 0) {
            return ((JsonArray) obj).iterator();
        }
        return null;
    }

    /* renamed from: ۠ۥۧۤ, reason: not valid java name and contains not printable characters */
    public static JsonObject m777(Object obj) {
        if (C0048.m7971() > 0) {
            return ((JsonElement) obj).getAsJsonObject();
        }
        return null;
    }

    /* renamed from: ۡۨۧۥ, reason: not valid java name and contains not printable characters */
    public static short[] m778() {
        if (C0008.m1975() > 0) {
            return f136short;
        }
        return null;
    }

    /* renamed from: ۤۥۤ۟, reason: not valid java name and contains not printable characters */
    public static JsonObject m779(Object obj) {
        if (C0029.m5282() > 0) {
            return AbstractC0308c.i((String) obj);
        }
        return null;
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        StringBuilder sbM7672 = C0046.m7672(C0002.m1305(m778(), 321, 114, 2974), str, C0040.m6584(m778(), 435, 23, 1452));
        C0036.m6177(sbM7672, (C0038.m6456(str2) - 1) * 20);
        ArrayList arrayListM2977 = C0012.m2977(C0032.m5769(C0047.m7763(sbM7672), C0030.m5363()));
        int iM6456 = (C0038.m6456(str2) + 1) * 20;
        g gVar = new g();
        C0045.m7632(gVar, arrayListM2977);
        C0049.m7974(gVar, C0038.m6456(str2), C0038.m6456(str2) + 1, 20, iM6456);
        return C0033.m5828(gVar);
    }

    @Override // com.github.catvod.spider.Cloud
    public String detailContent(List<String> list) {
        String str = (String) C0048.m7915(list, 0);
        h hVarM3577 = C0016.m3577(C0032.m5769(C0026.m4915(C0025.m4795(m778(), 458, 21, 3179), str), C0030.m5363()));
        m mVar = new m();
        C0011.m2828(mVar, str);
        C0005.m1628(mVar, C0064.m9669(C0036.m6243(hVarM3577, C0038.m6452(m778(), 479, 21, 2336))));
        C0026.m4947(mVar, C0010.m2339(C0036.m6243(hVarM3577, C0034.m6001(m778(), 500, 25, 3234)), C0010.m2300(m778(), 525, 3, 1839)));
        ArrayList arrayList = new ArrayList();
        Iterator itM7807 = C0047.m7807(C0030.m5333(hVarM3577, C0008.m1970(m778(), 528, 21, 479)));
        while (C0012.m2962(itM7807)) {
            com.github.catvod.spider.merge.T0.m mVar2 = (com.github.catvod.spider.merge.T0.m) C0048.m7949(itM7807);
            String strM1774 = C0006.m1774(m778(), 549, 4, 3225);
            if (C0064.m9686(C0010.m2339(mVar2, strM1774), C0035.m6131(m778(), 553, 36, 1217)) || C0064.m9686(C0010.m2339(mVar2, strM1774), C0001.m1189(m778(), 589, 35, 1117)) || C0064.m9686(C0010.m2339(mVar2, strM1774), C0023.m4536(m778(), 624, 80, 1326))) {
                C0004.m1532(arrayList, C0064.m9640(C0010.m2339(mVar2, strM1774)));
            }
        }
        C0044.m7449(mVar, C0014.m3356(this, arrayList));
        C0054.m8596(mVar, C0030.m5351(this));
        return C0053.m8428(mVar);
    }

    public String homeContent(boolean z) {
        ArrayList arrayList = new ArrayList();
        String strM5769 = C0032.m5769(C0039.m6551(m778(), 704, 121, 779), C0030.m5363());
        C0004.m1532(arrayList, new b(C0056.m8911(m778(), 825, 7, 2810), C0036.m6188(m778(), 832, 2, 1101), null));
        C0004.m1532(arrayList, new b(C0065.m9775(m778(), 834, 7, 549), C0041.m6779(m778(), 841, 2, 1627), null));
        return C0025.m4831(arrayList, C0012.m2977(strM5769));
    }

    @Override // com.github.catvod.spider.Cloud
    public void init(Context context, String str) {
        super.init(context, str);
    }

    public String searchContent(String str, boolean z) {
        return C0006.m1718(str, C0057.m8978(m778(), 843, 1, 1907));
    }

    public String searchContent(String str, boolean z, String str2) {
        return C0006.m1718(str, str2);
    }
}