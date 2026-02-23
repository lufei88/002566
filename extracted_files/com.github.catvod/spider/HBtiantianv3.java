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
import com.github.catvod.spider.merge.J0.C0021;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.N.C0023;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.S0.C0029;
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
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d0.C0048;
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
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
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
public class HBtiantianv3 extends Spider {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f62short = {30419, -31357, 28425, -30330, 21603, -29150, 28157, 1400, 1374, 1352, 1375, 1280, 1388, 1354, 1352, 1347, 1369, 2958, 2954, 2953, 2965, 2965, 2961, 3020, 2958, 2954, 2950, 2958, 3022, 2955, 2948, 2944, 2962, 2958, 2959, 2957, 2971, 2968, 872, 836, 837, 863, 846, 837, 863, 774, 895, 850, 859, 846, 2439, 2454, 2454, 2442, 2447, 2437, 2439, 2450, 2447, 2441, 2440, 2505, 2462, 2507, 2449, 2449, 2449, 2507, 2432, 2441, 2452, 2443, 2507, 2451, 2452, 2442, 2435, 2440, 2437, 2441, 2434, 2435, 2434, 1456, 1504, 1527, 1463, 1509, 1513, 1507, 1461, 1524, 1525, 1471, 1458, 1534, 1507, 1518, 1518, 1461, 1517, 1460, 1461, 1527, 1508, 1534, 1527, 1524, 1508, 1512, 1508, 1459, 1520, 1457, 1508, 1456, 1504, 1458, 1524, 1527, 1515, 1136, 1065, 1132, 1136, 1079, 1072, 1074, 1082, 1136, 1067, 1062, 1071, 1082, 1024, 1068, 1082, 1086, 1069, 1084, 1079, 2953, 2963, 2973, 2964, 2303, 2290, 2299, 2286, 2260, 2274, 2287, 2751, 2734, 2728, 2730, 2891, 2894, 2907, 2894, 1691, 1694, 1668, 1667, 3067, 3042, 3049, 3026, 3044, 3049, 2695, 2718, 2709, 2734, 2719, 2704, 2716, 2708, 3003, 2978, 2985, 2962, 3005, 2980, 2990, 2339, 2362, 2353, 2314, 2343, 2352, 2360, 2356, 2343, 2366, 2342, 1624, 1537, 1604, 1624, 1567, 1560, 1562, 1554, 1624, 1537, 1560, 1555, 1576, 1555, 1554, 1539, 1558, 1566, 1563, 1540, 911, 917, 923, 914, 300, 309, 318, 261, 307, 318, 678, 699, 703, 695, 673, 678, 691, 703, 674, 899, 902, 915, 902, 2571, 2578, 2585, 2594, 2573, 2577, 2588, 2564, 2594, 2577, 2580, 2574, 2569, 2077, 2052, 2063, 2100, 2053, 2058, 2054, 2062, 2551, 2557, 2544, 2550, 3178, 3181, 3187, 3180, 583, 584, 580, 588, 868, 885, 870, 871, 881, 843, 865, 870, 888, 871, 1829, 781, 778, 788, 1942, 3249, 3249, 3249, 1275, 1250, 1257, 1234, 1262, 1250, 1251, 1273, 1256, 1251, 1273, 2571, 2578, 2585, 2594, 2585, 2580, 2575, 2584, 2590, 2569, 2578, 2575, 984, 961, 970, 1009, 975, 973, 986, 961, 988, 2374, 2399, 2388, 2415, 2368, 2393, 2387, 1511, 1534, 1525, 1486, 1507, 1524, 1532, 1520, 1507, 1530, 1506, 937, 3014, 673, 2555, 29261, 22537, 32324, -32073, 22806, 22397, 27390, 30380, -30166, 1433, 3242, 3254, 3254, 3250, 28333, 24098, 2574, 2572, 2572, 2590, 2585, 2567, 2050, 1615, 1558, 1619, 1615, 1544, 1551, 1549, 1541, 1615, 1555, 1541, 1537, 1554, 1539, 1544, 2482, 2472, 2470, 2479, 2508, 2498, 2526, 2512, 2504, 2517, 2499, 1732, 1753, 1757, 1749, 1731, 1732, 1745, 1757, 1728, 2682, 2687, 2666, 2687, 555, 558, 564, 563, 2932, 2925, 2918, 2909, 2923, 2918, 2158, 2167, 2172, 2119, 2166, 2169, 2165, 2173, 2025, 2032, 2043, 1984, 2031, 2038, 2044, 1696, 1721, 1714, 1673, 1700, 1715, 1723, 1719, 1700, 1725, 1701};
    public String a = C0007.m1840();
    public final String b = C0009.m2037(m389(), 0, 7, 2156);

    public static HashMap a() {
        return C0019.m4127(C0009.m2037(m389(), 7, 10, 1325), C0034.m6001(m389(), 17, 21, 3041), C0047.m7833(m389(), 38, 12, 811), C0056.m8911(m389(), 50, 33, 2534));
    }

    public static String b() {
        String strM5627 = C0031.m5627(C0009.m2099());
        String strM8636 = C0054.m8636(strM5627, 0, C0051.m8186(10, C0004.m1584(strM5627)));
        StringBuilder sb = new StringBuilder(C0065.m9775(m389(), 83, 38, 1415));
        C0018.m3933(sb, strM8636);
        return C0022.m4413(C0047.m7763(sb));
    }

    /* renamed from: ۟۠ۥۡ۠, reason: not valid java name and contains not printable characters */
    public static JsonArray m388(Object obj, Object obj2) {
        if (C0025.m4797() > 0) {
            return ((JsonObject) obj).getAsJsonArray((String) obj2);
        }
        return null;
    }

    /* renamed from: ۟ۡۦۣۣ, reason: not valid java name and contains not printable characters */
    public static short[] m389() {
        if (C0063.m9589() <= 0) {
            return f62short;
        }
        return null;
    }

    /* renamed from: ۟ۡۨۨ۟, reason: not valid java name and contains not printable characters */
    public static JsonObject m390(Object obj, Object obj2) {
        if (C0039.m6529() <= 0) {
            return ((JsonObject) obj).getAsJsonObject((String) obj2);
        }
        return null;
    }

    /* renamed from: ۟ۢۥۨۨ, reason: not valid java name and contains not printable characters */
    public static String m391(Object obj) {
        if (C0028.m5152() <= 0) {
            return ((JsonPrimitive) obj).getAsString();
        }
        return null;
    }

    /* renamed from: ۣۣ۟۟ۡ, reason: not valid java name and contains not printable characters */
    public static JsonObject m392(Object obj) {
        if (C0002.m1242() > 0) {
            return ((JsonElement) obj).getAsJsonObject();
        }
        return null;
    }

    /* renamed from: ۟ۤ۠۠ۡ, reason: not valid java name and contains not printable characters */
    public static Iterator m393(Object obj) {
        if (C0019.m4065() < 0) {
            return ((JsonArray) obj).iterator();
        }
        return null;
    }

    /* renamed from: ۟ۥۢۡ۟, reason: not valid java name and contains not printable characters */
    public static JsonPrimitive m394(Object obj, Object obj2) {
        if (C0043.m7332() >= 0) {
            return ((JsonObject) obj).getAsJsonPrimitive((String) obj2);
        }
        return null;
    }

    /* renamed from: ۟ۦۡۥۦ, reason: not valid java name and contains not printable characters */
    public static JsonElement m395(Object obj, int i) {
        if (C0015.m3433() > 0) {
            return ((JsonArray) obj).get(i);
        }
        return null;
    }

    /* renamed from: ۣۡۧۧ, reason: not valid java name and contains not printable characters */
    public static String m396(Object obj) {
        if (C0051.m8216() <= 0) {
            return ((JsonElement) obj).getAsString();
        }
        return null;
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        ArrayList arrayList = new ArrayList();
        String strM5188 = C0028.m5188(new StringBuilder(), C0027.m5057(this), C0036.m6188(m389(), 121, 20, 1119));
        HashMap map2 = new HashMap();
        C0053.m8424(map2, C0040.m6584(m389(), 141, 4, 3066), C0050.m8158());
        C0053.m8424(map2, C0047.m7833(m389(), 145, 7, 2187), str);
        C0053.m8424(map2, C0044.m7509(m389(), 152, 4, 2767), str2);
        Iterator itM393 = m393(m388(m390((JsonObject) C0033.m5856(C0008.m2029(C0003.m1396(strM5188, map2, C0014.m3354())), JsonObject.class), C0020.m4199(m389(), 156, 4, 2863)), C0041.m6779(m389(), 160, 4, 1783)));
        while (C0012.m2962(itM393)) {
            JsonObject jsonObjectM392 = m392((JsonElement) C0048.m7949(itM393));
            C0004.m1532(arrayList, new m(m391(m394(jsonObjectM392, C0031.m5565(m389(), 164, 6, 2957))), m391(m394(jsonObjectM392, C0044.m7509(m389(), 170, 8, 2801))), m391(m394(jsonObjectM392, C0033.m5852(m389(), 178, 7, 3021))), m391(m394(jsonObjectM392, C0007.m1842(m389(), 185, 11, 2389)))));
        }
        return C0047.m7783(arrayList);
    }

    public String detailContent(List<String> list) {
        new ArrayList();
        String strM5188 = C0028.m5188(new StringBuilder(), C0027.m5057(this), C0052.m8337(m389(), 196, 20, 1655));
        String str = (String) C0048.m7915(list, 0);
        HashMap map = new HashMap();
        C0053.m8424(map, C0001.m1189(m389(), 216, 4, 1020), C0050.m8158());
        String strM6001 = C0034.m6001(m389(), 220, 6, 346);
        C0053.m8424(map, strM6001, str);
        String strM5627 = C0031.m5627(C0009.m2099());
        C0053.m8424(map, C0036.m6188(m389(), 226, 9, 722), C0054.m8636(strM5627, 0, C0051.m8186(10, C0004.m1584(strM5627))));
        JsonObject jsonObjectM390 = m390((JsonObject) C0033.m5856(C0008.m2029(C0003.m1396(strM5188, map, C0014.m3354())), JsonObject.class), C0051.m8259(m389(), 235, 4, 999));
        JsonArray jsonArrayM388 = m388(jsonObjectM390, C0065.m9775(m389(), 239, 13, 2685));
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        String strM391 = m391(m394(jsonObjectM390, C0038.m6452(m389(), 252, 8, 2155)));
        Iterator itM393 = m393(jsonArrayM388);
        while (C0012.m2962(itM393)) {
            JsonObject jsonObjectM392 = m392((JsonElement) C0048.m7949(itM393));
            C0018.m3933(sb2, C0016.m3579());
            C0018.m3933(sb2, m391(m394(jsonObjectM392, C0006.m1774(m389(), 260, 4, 2449))));
            Iterator itM3932 = m393(m388(jsonObjectM392, C0024.m4740(m389(), 264, 4, 3103)));
            while (C0012.m2962(itM3932)) {
                JsonObject jsonObjectM3922 = m392((JsonElement) C0048.m7949(itM3932));
                String strM8911 = C0056.m8911(m389(), 268, 4, 553);
                C0018.m3933(sb, m391(m394(jsonObjectM3922, strM8911)));
                C0062.m9399(sb, '$');
                C0018.m3933(sb, m396(m395(m388(jsonObjectM392, C0042.m7151(m389(), 272, 10, 788)), 0)));
                String strM89112 = C0056.m8911(m389(), 282, 1, 1883);
                C0018.m3933(sb, strM89112);
                C0018.m3933(sb, m391(m394(jsonObjectM3922, C0048.m7902(m389(), 283, 3, 888))));
                C0018.m3933(sb, strM89112);
                C0018.m3933(sb, strM391);
                C0018.m3933(sb, strM89112);
                C0018.m3933(sb, m391(m394(jsonObjectM3922, strM8911)));
                C0018.m3933(sb, C0060.m9352(m389(), 286, 1, 1973));
            }
            String strM5256 = C0029.m5256(m389(), 287, 3, 3221);
            C0018.m3933(sb2, strM5256);
            C0018.m3933(sb, strM5256);
        }
        m mVar = new m();
        C0011.m2828(mVar, m391(m394(jsonObjectM390, strM6001)));
        C0005.m1628(mVar, strM391);
        StringBuilder sb3 = new StringBuilder();
        C0018.m3933(sb3, C0055.m8703());
        C0018.m3933(sb3, m391(m394(jsonObjectM390, C0056.m8911(m389(), 290, 11, 1165))));
        C0027.m5000(mVar, C0047.m7763(sb3));
        C0058.m9159(mVar, m391(m394(jsonObjectM390, C0023.m4536(m389(), 301, 12, 2685))));
        C0058.m9152(mVar, m391(m394(jsonObjectM390, C0012.m2973(m389(), 313, 9, 942))));
        C0026.m4947(mVar, m391(m394(jsonObjectM390, C0031.m5565(m389(), 322, 7, 2352))));
        StringBuilder sb4 = new StringBuilder();
        C0018.m3933(sb4, C0036.m6189());
        C0018.m3933(sb4, m391(m394(jsonObjectM390, C0050.m8131(m389(), 329, 11, 1425))));
        C0019.m4073(mVar, C0047.m7763(sb4));
        C0054.m8596(mVar, C0047.m7763(sb2));
        C0044.m7449(mVar, C0047.m7763(sb));
        return C0053.m8428(mVar);
    }

    public String homeContent(boolean z) {
        ArrayList arrayList = new ArrayList();
        List listM1203 = C0001.m1203(new String[]{C0012.m2973(m389(), 340, 1, 920), C0051.m8259(m389(), 341, 1, 3060), C0044.m7509(m389(), 342, 1, 658), C0034.m6001(m389(), 343, 1, 2511)});
        List listM12032 = C0001.m1203(new String[]{C0000.m1077(m389(), 344, 2, 1912), C0040.m6584(m389(), 346, 3, 2929), C0003.m1398(m389(), 349, 2, 1493), C0055.m8814(m389(), 351, 2, 2128)});
        for (int i = 0; i < C0064.m9636(listM1203); i++) {
            C0004.m1532(arrayList, new b((String) C0048.m7915(listM1203, i), (String) C0048.m7915(listM12032, i), null));
        }
        return C0003.m1448(C0058.m9150(this), null, arrayList);
    }

    public void init(Context context, String str) {
        this.a = str;
    }

    public String playerContent(String str, String str2, List<String> list) {
        C0036.m6219();
        String[] strArrM4752 = C0024.m4752(str2, C0020.m4199(m389(), 353, 1, 1511));
        String strM391 = null;
        String str3 = (strArrM4752.length <= 0 || C0057.m8953(strArrM4752[0])) ? null : strArrM4752[0];
        String str4 = (strArrM4752.length <= 1 || C0057.m8953(strArrM4752[1])) ? null : strArrM4752[1];
        String strM2827 = C0011.m2827(str4, (strArrM4752.length <= 2 || C0057.m8953(strArrM4752[2])) ? null : strArrM4752[2], (strArrM4752.length <= 3 || C0057.m8953(strArrM4752[3])) ? null : strArrM4752[3]);
        if (C0058.m9127(str3, C0008.m1970(m389(), 354, 4, 3266))) {
            StringBuilder sb = new StringBuilder();
            C0018.m3933(sb, str3);
            C0018.m3933(sb, str4);
            String strM5769 = C0032.m5769(C0047.m7763(sb), null);
            if (C0058.m9127(strM5769, C0019.m4107(m389(), 358, 2, 3261)) || C0058.m9127(strM5769, C0047.m7833(m389(), 360, 3, 2620))) {
                strM391 = m391(m394((JsonObject) C0033.m5856(strM5769, JsonObject.class), C0013.m3106(m389(), 363, 3, 2667)));
            }
        }
        C0036.m6219();
        if (strM391 != null) {
            g gVar = new g();
            C0017.m3667(gVar, strM391);
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
        return C0015.m3435(this, str, z, C0004.m1549(m389(), 366, 1, 2099));
    }

    public String searchContent(String str, boolean z, String str2) {
        ArrayList arrayList = new ArrayList();
        String strM5188 = C0028.m5188(new StringBuilder(), C0027.m5057(this), C0026.m4951(m389(), 367, 15, 1632));
        HashMap map = new HashMap();
        C0053.m8424(map, C0007.m1842(m389(), 382, 4, 2497), C0050.m8158());
        C0053.m8424(map, C0029.m5256(m389(), 386, 7, 2471), str);
        String strM5627 = C0031.m5627(C0009.m2099());
        C0053.m8424(map, C0051.m8259(m389(), 393, 9, 1712), C0054.m8636(strM5627, 0, C0051.m8186(10, C0004.m1584(strM5627))));
        Iterator itM393 = m393(m388(m390((JsonObject) C0033.m5856(C0008.m2029(C0003.m1396(strM5188, map, C0014.m3354())), JsonObject.class), C0013.m3106(m389(), 402, 4, 2590)), C0021.m4340(m389(), 406, 4, 583)));
        while (C0012.m2962(itM393)) {
            JsonObject jsonObjectM392 = m392((JsonElement) C0048.m7949(itM393));
            C0004.m1532(arrayList, new m(m391(m394(jsonObjectM392, C0019.m4107(m389(), 410, 6, 2818))), m391(m394(jsonObjectM392, C0041.m6779(m389(), 416, 8, 2072))), m391(m394(jsonObjectM392, C0019.m4107(m389(), 424, 7, 1951))), m391(m394(jsonObjectM392, C0014.m3332(m389(), 431, 11, 1750)))));
        }
        return C0047.m7783(arrayList);
    }
}