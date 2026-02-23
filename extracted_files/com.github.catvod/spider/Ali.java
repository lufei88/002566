package com.github.catvod.spider;

import android.app.AlertDialog;
import android.content.Context;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.E.g;
import com.github.catvod.spider.merge.E.m;
import com.github.catvod.spider.merge.F.h;
import com.github.catvod.spider.merge.F.j;
import com.github.catvod.spider.merge.F.k;
import com.github.catvod.spider.merge.F.o;
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
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.Z.C0040;
import com.github.catvod.spider.merge.Z.c;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.a0.C0246g;
import com.github.catvod.spider.merge.a1.C0043;
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
import com.github.catvod.spider.merge.g0.AbstractC0308c;
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
import com.github.catvod.spider.p000mergexbpq.a0.C0006;
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
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* loaded from: classes.dex */
public class Ali extends Spider {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f2short = {1360, 1295, 1295, 1295, 1366, 1305, 1300, 1297, 1281, 1293, 1302, 1308, 1290, 1297, 1294, 1309, 1366, 1307, 1303, 1301, 1284, 1295, 1295, 1295, 1366, 1305, 1300, 1297, 1288, 1305, 1302, 1366, 1307, 1303, 1301, 1361, 1367, 1291, 1367, 1360, 1315, 1318, 1367, 1317, 1363, 1361, 1360, 1367, 1310, 1303, 1300, 1308, 1309, 1290, 1367, 1360, 1315, 1318, 1367, 1317, 1363, 1361, 1361, 1351, 2348, 2359, 2366, 2349, 2362, 2304, 2358, 2363, 2576, 2581, 2563, 2584, 2567, 2580, 2654, 2567, 2626, 2654, 2562, 2585, 2576, 2563, 2580, 2606, 2589, 2584, 2591, 2586, 2654, 2582, 2580, 2565, 2606, 2562, 2585, 2576, 2563, 2580, 2606, 2579, 2568, 2606, 2576, 2591, 2590, 2591, 2568, 2588, 2590, 2564, 2562, 1442, 1451, 1448, 1440, 1441, 1462, 1835, 1846, 1846, 1837, -31653, 20554, 22669, 32377, 22088, 19173, 22481, 28965, 19560, 30349, 25829, 30688, 2582, 2974, 766, 766, 766, 1782, 3099, 3099, 3099, -28407, -26886, -28220, 29138, 2602, 2599, 2606, 2619, 1655, 1640, 1637, 1636, 1646, 1098, 1093, 1088, 1097, 1125, 1096, 2117, 2142, 2135, 2116, 2131, 2175, 2130, 956, 941, 933, 952, 932, 937, 956, 941, 897, 940, 1731, 1739, 1738, 1735, 1743, 1767, 1738, 1677, 1679, 1690, 1675, 2704, 2706, 2693, 2710, 2697, 2693, 2711, 801, 816, 816, 812, 809, 803, 801, 820, 809, 815, 814, 879, 822, 814, 804, 878, 801, 816, 816, 812, 805, 878, 813, 816, 805, 807, 821, 818, 812, 1947, 1924, 1937, 1946, 1924, 1951, 1942, 1925, 1938, 1554, 1552, 1537, 1574, 1565, 1556, 1543, 1552, 1585, 1562, 1538, 1563, 1561, 1562, 1556, 1553, 1568, 1543, 1561, 1627, 1627, 1627, 2237, 2226, 2231, 2238, 2180, 2226, 2239, 2001, 1994, 1987, 2000, 1991, 2045, 1995, 1990, 544, 573, 565, 556, 567, 544, 538, 566, 544, 550, 458, 398, 403, 474, 469, 464, 473, 403, 475, 473, 456, 483, 463, 468, 477, 462, 473, 483, 464, 469, 466, 471, 483, 472, 467, 459, 466, 464, 467, 477, 472, 483, 457, 462, 464, 311, 316, 292, 317, 319, 316, 306, 311, 268, 294, 289, 319, 2386, 2316, 2378, 2311, 2395, 2380, 2383, 2380, 2395, 2380, 2395, 2103, 2109, 2087, 2163, 2099, 2107, 2090, 2111, 2106, 2111, 2090, 2111, 1000, 1019, 1012, 1021, 1023, 2719, 2707, 2706, 2706, 2713, 2719, 2696, 2709, 2707, 2706, 760, 762, 762, 764, 745, 749, 692, 764, 759, 762, 758, 765, 752, 759, 766, 1310, 1304, 1294, 1305, 1350, 1290, 1292, 1294, 1285, 1311, 1069, 1067, 1084, 2909, 2892, 2892, 2896, 2901, 2911, 2909, 2888, 2901, 2899, 2898, 2835, 2899, 2911, 2888, 2905, 2888, 2833, 2895, 2888, 2894, 2905, 2909, 2897, -30248, 24009, 21774, 29690, 21804, 18817, 21685, 29249, 18323, 32118, 28446, 31771, 1056, 1056, 1056, 3003, 3003, 3003, 2859, 2908, 1908, 18962, 28919, 25247, 29082, 3108, 3110, 3110, -29713, 24574, 22329, 29133, 2048, 2139, 2128, 2050, 2142, 2131, 2134, 2073, 2123, 2118, 2127, 2138, 2050, 2121, 2134, 2139, 2138, 2128, 2073, 2140, 2142, 2123, 2138, 2050, 2074, 2124, 2073, 2124, 2135, 2142, 2125, 2138, 2166, 2139, 2050, 2074, 2124, 2073, 2137, 2134, 2131, 2138, 2166, 2139, 2050, 2074, 2124, 1037, 1042, 1031, 1036, 24179, 17118, 24554, 31006, 1567, 1540, 1549, 1566, 1545};
    public static final Pattern a = C0005.m1602(C0003.m1398(m8(), 0, 64, 1400));

    public static m a(Matcher matcher, String str) {
        String strM4306 = C0021.m4306(matcher, 2);
        int iM3696 = C0017.m3696(matcher);
        String strM1840 = C0007.m1840();
        String strM43062 = iM3696 == 4 ? C0021.m4306(matcher, 4) : strM1840;
        C0246g c0246gM7970 = C0048.m7970();
        C0002.m1292(c0246gM7970, strM4306);
        JsonObject jsonObject = new JsonObject();
        m17(jsonObject, C0021.m4340(m8(), 64, 8, 2399), strM4306);
        o oVar = (o) C0033.m5856(m14(jsonObject, C0014.m3332(m8(), 72, 43, 2673)), o.class);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (!C0043.m7327(strM43062)) {
            strM1840 = strM43062;
        } else if (!C0035.m6132(C0019.m4094(oVar))) {
            h hVar = (h) C0048.m7915(C0019.m4094(oVar), 0);
            strM43062 = C0007.m1815(C0044.m7412(hVar), C0012.m2973(m8(), 115, 6, 1476)) ? C0054.m8607(hVar) : C0012.m2973(m8(), 121, 4, 1881);
            strM1840 = strM43062;
        }
        C0045.m7604(c0246gM7970, strM4306, new h(strM1840), arrayList, arrayList2);
        C0055.m8791(arrayList);
        List listM1203 = C0001.m1203(new String[]{C0040.m6584(m8(), 125, 4, 2834), C0057.m8978(m8(), 129, 4, 1102), C0055.m8814(m8(), 133, 4, 651)});
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        Iterator itM7816 = C0047.m7816(arrayList);
        while (C0012.m2962(itM7816)) {
            h hVar2 = (h) C0048.m7949(itM7816);
            StringBuilder sb = new StringBuilder();
            C0018.m3933(sb, C0046.m7738(hVar2));
            C0018.m3933(sb, C0007.m1842(m8(), 137, 1, 2610));
            C0018.m3933(sb, strM4306);
            String strM5708 = C0032.m5708(m8(), 138, 1, 2997);
            C0018.m3933(sb, strM5708);
            C0018.m3933(sb, C0054.m8607(hVar2));
            String strM6463 = C0038.m6463(hVar2);
            ArrayList arrayList5 = new ArrayList();
            String strM4587 = C0023.m4587(C0009.m2056(strM6463));
            Iterator itM78162 = C0047.m7816(arrayList2);
            while (C0012.m2962(itM78162)) {
                h hVar3 = (h) C0048.m7949(itM78162);
                String strM45872 = C0023.m4587(C0009.m2056(C0038.m6463(hVar3)));
                if (C0058.m9127(strM4587, strM45872) || C0058.m9127(strM45872, strM4587)) {
                    C0004.m1532(arrayList5, hVar3);
                }
            }
            if (C0007.m1817(arrayList5)) {
                C0034.m6012(arrayList5, arrayList2);
            }
            StringBuilder sb2 = new StringBuilder();
            Iterator itM78163 = C0047.m7816(arrayList5);
            while (C0012.m2962(itM78163)) {
                h hVar4 = (h) C0048.m7949(itM78163);
                C0018.m3933(sb2, strM5708);
                C0018.m3933(sb2, C0009.m2056(C0038.m6463(hVar4)));
                String strM3917 = C0018.m3917(m8(), 139, 3, 702);
                C0018.m3933(sb2, strM3917);
                C0018.m3933(sb2, C0009.m2086(hVar4));
                C0018.m3933(sb2, strM3917);
                C0018.m3933(sb2, C0054.m8607(hVar4));
            }
            C0018.m3933(sb, C0047.m7763(sb2));
            C0004.m1532(arrayList3, C0047.m7763(sb));
        }
        for (int i = 0; i < C0064.m9636(listM1203); i++) {
            C0004.m1532(arrayList4, C0036.m6194(C0062.m9389(m8(), 142, 1, 1749), arrayList3));
        }
        m mVar = new m();
        C0011.m2828(mVar, str);
        C0027.m5000(mVar, str);
        C0026.m4947(mVar, C0033.m5830(oVar));
        C0005.m1628(mVar, C0010.m2368(oVar));
        String strM1305 = C0002.m1305(m8(), 143, 3, 3135);
        C0044.m7449(mVar, C0036.m6194(strM1305, arrayList4));
        C0054.m8596(mVar, C0036.m6194(strM1305, listM1203));
        C0058.m9085(mVar, C0002.m1305(m8(), 146, 4, 1846));
        return mVar;
    }

    public static Object[] proxy(Map<String, String> map) {
        String strM13;
        String str = (String) C0062.m9431(map, C0030.m5362(m8(), 150, 4, 2654));
        boolean zM1815 = C0007.m1815(C0053.m8477(m8(), 154, 5, 1537), str);
        Integer numM2808 = C0011.m2808(200);
        String strM3917 = C0018.m3917(m8(), 159, 6, 1068);
        String strM6779 = C0041.m6779(m8(), 165, 7, 2102);
        if (!zM1815) {
            if (!C0007.m1815(C0042.m7151(m8(), 395, 3, 1118), str)) {
                return null;
            }
            C0246g c0246gM7970 = C0048.m7970();
            C0047.m7777(c0246gM7970);
            return new Object[]{numM2808, C0043.m7290(m8(), 398, 24, 2876), new ByteArrayInputStream(m18(m11(m19(C0044.m7391(c0246gM7970, (String) C0062.m9431(map, strM6779), (String) C0062.m9431(map, strM3917)), C0009.m2076(c0246gM7970)))))};
        }
        C0246g c0246gM79702 = C0048.m7970();
        AlertDialog alertDialogM3951 = C0018.m3951(c0246gM79702);
        if (alertDialogM3951 != null && C0016.m3578(alertDialogM3951)) {
            return null;
        }
        String str2 = (String) C0062.m9431(map, C0032.m5708(m8(), 172, 10, 968));
        String str3 = (String) C0062.m9431(map, strM6779);
        String str4 = (String) C0062.m9431(map, C0051.m8259(m8(), 182, 7, 1710));
        String str5 = (String) C0062.m9431(map, strM3917);
        String str6 = (String) C0062.m9431(map, C0064.m9599(m8(), 189, 4, 1774));
        if (C0007.m1815(C0062.m9389(m8(), 193, 7, 2784), str6)) {
            return new Object[]{numM2808, C0022.m4403(m8(), 200, 29, 832), new ByteArrayInputStream(C0050.m8115(C0018.m3914(c0246gM79702, str3, str5, str2)))};
        }
        if (C0007.m1815(C0040.m6584(m8(), 229, 4, 2036), str6)) {
            strM13 = C0044.m7391(c0246gM79702, str3, str5);
        } else {
            boolean zM18152 = C0007.m1815(C0005.m1645(m8(), 233, 5, 2039), str6);
            String strM1840 = C0007.m1840();
            if (zM18152) {
                String strM2805 = C0011.m2805(m8(), 238, 22, 1653);
                HashMap map2 = (HashMap) C0062.m9437(c0246gM79702);
                try {
                    if (!C0058.m9098(map2, str5) || C0065.m9715(map2, str5) == null || C0063.m9509((String) C0065.m9715(map2, str5))) {
                        C0002.m1292(c0246gM79702, str3);
                        StringBuilder sb = new StringBuilder(strM2805);
                        C0018.m3933(sb, str5);
                        m12(C0047.m7763(sb));
                        JsonObject jsonObject = new JsonObject();
                        m17(jsonObject, C0015.m3484(m8(), 260, 7, 2267), str5);
                        m17(jsonObject, C0028.m5109(m8(), 267, 8, 1954), str3);
                        m20(jsonObject, C0039.m6551(m8(), 275, 10, 581), C0011.m2808(600));
                        strM13 = m13(m15(m10(m9(C0031.m5630(c0246gM79702, C0038.m6452(m8(), 285, 35, 444), m16(jsonObject), false))), C0023.m4536(m8(), 320, 12, 339)));
                        C0053.m8424(map2, str5, strM13);
                    } else {
                        strM13 = (String) C0065.m9715(map2, str5);
                    }
                } catch (Exception e) {
                    C0049.m7975(e);
                }
            } else if (C0007.m1815(C0050.m8131(m8(), 332, 4, 2367), str6)) {
                ReentrantLock reentrantLock = (ReentrantLock) C0028.m5117(c0246gM79702);
                C0054.m8551(reentrantLock);
                HashMap map3 = (HashMap) C0017.m3724(c0246gM79702);
                String str7 = (String) C0062.m9431((Map) C0065.m9715(map3, str5), str4);
                if (C0063.m9509(str7)) {
                    C0018.m3914(c0246gM79702, str3, str5, str2);
                    strM13 = (String) C0062.m9431((Map) C0065.m9715(map3, str5), str4);
                } else {
                    strM13 = str7;
                }
                C0056.m8870(reentrantLock);
            } else {
                strM13 = strM1840;
            }
        }
        TreeMap treeMap = new TreeMap(C0023.m4562());
        List listM1203 = C0001.m1203(new String[]{C0032.m5708(m8(), 336, 7, 2345), C0013.m3106(m8(), 343, 12, 2142), C0049.m8007(m8(), 355, 5, 922), C0035.m6131(m8(), 360, 10, 2812), C0045.m7657(m8(), 370, 15, 665), C0008.m1970(m8(), 385, 10, 1387)});
        Iterator itM5199 = C0029.m5199(C0026.m4887(map));
        while (C0012.m2962(itM5199)) {
            String str8 = (String) C0048.m7949(itM5199);
            if (C0021.m4355(listM1203, str8)) {
                C0058.m9052(treeMap, str8, (String) C0062.m9431(map, str8));
            }
        }
        return C0057.m8993(strM13, treeMap);
    }

    /* renamed from: ۣ۟۟۟ۡ, reason: not valid java name and contains not printable characters */
    public static short[] m8() {
        if (C0052.m8320() > 0) {
            return f2short;
        }
        return null;
    }

    /* renamed from: ۟۠ۨۢۢ, reason: not valid java name and contains not printable characters */
    public static JsonElement m9(Object obj) {
        if (C0025.m4797() >= 0) {
            return AbstractC0308c.g((String) obj);
        }
        return null;
    }

    /* renamed from: ۟ۡۥ۟۠, reason: not valid java name and contains not printable characters */
    public static JsonObject m10(Object obj) {
        if (C0034.m6048() < 0) {
            return ((JsonElement) obj).getAsJsonObject();
        }
        return null;
    }

    /* renamed from: ۟ۦۣ۠ۢ, reason: not valid java name and contains not printable characters */
    public static ResponseBody m11(Object obj) {
        if (C0051.m8216() < 0) {
            return ((Response) obj).body();
        }
        return null;
    }

    /* renamed from: ۣ۠۟ۨ, reason: not valid java name and contains not printable characters */
    public static void m12(Object obj) {
        if (C0033.m5872() >= 0) {
            SpiderDebug.log((String) obj);
        }
    }

    /* renamed from: ۣ۠۠ۡ, reason: not valid java name and contains not printable characters */
    public static String m13(Object obj) {
        if (C0011.m2755() > 0) {
            return ((JsonElement) obj).getAsString();
        }
        return null;
    }

    /* renamed from: ۡۢۧۨ, reason: not valid java name and contains not printable characters */
    public static String m14(Object obj, Object obj2) {
        if (C0027.m5017() >= 0) {
            return C0246g.s((JsonObject) obj, (String) obj2);
        }
        return null;
    }

    /* renamed from: ۡۢۨۦ, reason: not valid java name and contains not printable characters */
    public static JsonElement m15(Object obj, Object obj2) {
        if (C0041.m6823() <= 0) {
            return ((JsonObject) obj).get((String) obj2);
        }
        return null;
    }

    /* renamed from: ۤ۟ۥۢ, reason: not valid java name and contains not printable characters */
    public static String m16(Object obj) {
        if (C0037.m6350() < 0) {
            return ((JsonElement) obj).toString();
        }
        return null;
    }

    /* renamed from: ۤۢۢ, reason: not valid java name and contains not printable characters */
    public static void m17(Object obj, Object obj2, Object obj3) {
        if (C0052.m8320() >= 0) {
            ((JsonObject) obj).addProperty((String) obj2, (String) obj3);
        }
    }

    /* renamed from: ۥۤۢۡ, reason: contains not printable characters */
    public static byte[] m18(Object obj) {
        if (C0044.m7508() < 0) {
            return ((ResponseBody) obj).bytes();
        }
        return null;
    }

    /* renamed from: ۧ۠ۨۧ, reason: not valid java name and contains not printable characters */
    public static Response m19(Object obj, Object obj2) {
        if (C0005.m1599() <= 0) {
            return c.g((String) obj, (Map) obj2);
        }
        return null;
    }

    /* renamed from: ۣۨ۟ۡ, reason: not valid java name and contains not printable characters */
    public static void m20(Object obj, Object obj2, Object obj3) {
        if (C0026.m4977() < 0) {
            ((JsonObject) obj).addProperty((String) obj2, (Number) obj3);
        }
    }

    public String detailContent(List<String> list) {
        String strM9640 = C0064.m9640((String) C0048.m7915(list, 0));
        Matcher matcherM6026 = C0034.m6026(C0044.m7486(), strM9640);
        return C0003.m1405(matcherM6026) ? C0053.m8428(C0056.m8884(matcherM6026, strM9640)) : C0007.m1840();
    }

    public String detailContentVodPlayFrom(List<String> list, int i) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 1; i2 <= C0064.m9636(list); i2++) {
            C0004.m1532(arrayList, C0029.m5240(C0045.m7549(), C0040.m6632(i, C0006.m1774(m8(), 422, 4, 1681)), new Object[0]));
            C0004.m1532(arrayList, C0029.m5240(C0045.m7549(), C0040.m6632(i, C0061.m9361(m8(), 426, 4, 1834)), new Object[0]));
            C0004.m1532(arrayList, C0029.m5240(C0045.m7549(), C0040.m6632(i, C0011.m2805(m8(), 430, 4, 2416)), new Object[0]));
        }
        return C0036.m6194(C0049.m8007(m8(), 434, 3, 1028), arrayList);
    }

    public String detailContentVodPlayUrl(List<String> list) {
        ArrayList arrayList = new ArrayList();
        Iterator itM3109 = C0013.m3109(list);
        while (C0012.m2962(itM3109)) {
            String str = (String) C0048.m7949(itM3109);
            Matcher matcherM6026 = C0034.m6026(C0044.m7486(), str);
            if (C0003.m1405(matcherM6026)) {
                C0004.m1532(arrayList, C0035.m6167(C0056.m8884(matcherM6026, str)));
            }
        }
        return C0036.m6194(C0060.m9352(m8(), 437, 3, 2975), arrayList);
    }

    public void init(Context context, String str) {
        C0048.m7970().b = str;
    }

    public String playerContent(String str, String str2, List<String> list) {
        g gVar;
        String strM1327;
        C0246g c0246gM7970 = C0048.m7970();
        String[] strArrM4752 = C0024.m4752(str2, C0018.m3917(m8(), 440, 2, 2935));
        C0047.m7777(c0246gM7970);
        String strM2300 = C0010.m2300(m8(), 442, 1, 1879);
        if (C0007.m1815(C0024.m4752(str, strM2300)[0], C0009.m2037(m8(), 443, 4, 1265))) {
            j jVarM3506 = C0015.m3506(c0246gM7970, strArrM4752[0], strArrM4752[1]);
            ArrayList arrayListM7563 = C0045.m7563(jVarM3506, strArrM4752[0], strArrM4752[1], true);
            ArrayList arrayListM7181 = C0042.m7181(strArrM4752);
            ArrayList arrayList = new ArrayList();
            Iterator itM3109 = C0013.m3109(C0030.m5343(jVarM3506));
            while (C0012.m2962(itM3109)) {
                k kVar = (k) C0048.m7949(itM3109);
                C0047.m7777(kVar);
                com.github.catvod.spider.merge.E.h hVar = new com.github.catvod.spider.merge.E.h();
                C0012.m3013(hVar, C0004.m1571(kVar));
                C0020.m4249(hVar, C0058.m9156(kVar));
                C0052.m8322(hVar, C0058.m9156(kVar));
                C0036.m6229(hVar, C0022.m4403(m8(), 447, 3, 3154));
                C0004.m1532(arrayList, hVar);
            }
            C0034.m6012(arrayListM7181, arrayList);
            g gVar2 = new g();
            C0020.m4226(gVar2, arrayListM7563);
            C0045.m7583(gVar2);
            C0025.m4788(gVar2, arrayListM7181);
            C0057.m9029(gVar2, C0048.m7911());
            return C0033.m5828(gVar2);
        }
        boolean zM1815 = C0007.m1815(C0024.m4752(str, strM2300)[0], C0013.m3106(m8(), 450, 4, 1190));
        String strM4199 = C0020.m4199(m8(), 454, 47, 2111);
        if (zM1815) {
            gVar = new g();
            String str3 = strArrM4752[0];
            String str4 = strArrM4752[1];
            StringBuilder sb = new StringBuilder();
            C0018.m3933(sb, C0051.m8217());
            C0018.m3933(sb, strM4199);
            strM1327 = C0002.m1327(C0047.m7763(sb), new Object[]{C0001.m1189(m8(), 501, 4, 1122), str3, str4});
        } else {
            if (!C0007.m1815(C0024.m4752(str, strM2300)[0], C0014.m3332(m8(), 505, 4, 3189))) {
                return C0007.m1840();
            }
            gVar = new g();
            String str5 = strArrM4752[0];
            String str6 = strArrM4752[1];
            StringBuilder sb2 = new StringBuilder();
            C0018.m3933(sb2, C0051.m8217());
            C0018.m3933(sb2, strM4199);
            strM1327 = C0002.m1327(C0047.m7763(sb2), new Object[]{C0039.m6551(m8(), 509, 5, 1644), str5, str6});
        }
        C0017.m3667(gVar, strM1327);
        C0020.m4286(gVar);
        C0025.m4788(gVar, C0042.m7181(strArrM4752));
        C0057.m9029(gVar, C0048.m7911());
        return C0033.m5828(gVar);
    }
}