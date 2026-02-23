package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.E.b;
import com.github.catvod.spider.merge.E.g;
import com.github.catvod.spider.merge.E.m;
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
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.Z.C0040;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.merge.c1.C0046;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.d1.C0049;
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
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.c0.C0010;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.r.C0014;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class HBNG extends Spider {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f29short = {1755, 1789, 1771, 1788, 1699, 1743, 1769, 1771, 1760, 1786, 2096, 2100, 2103, 2091, 2091, 2095, 2160, 2155, 2161, 2153, 2161, 2159, 459, 450, 466, 467, 462, 452, 473, 449, 457, 450, 472, 452, 462, 448, 457, 467, 393, 455, 452, 511, 467, 494, 506, 504, 396, 482, 476, 494, 413, 452, 498, 403, 412, 490, 3254, 3244, 3234, 3243, 1229, 1225, 1217, 1229, 566, 575, 559, 558, 563, 569, 548, 572, 564, 575, 549, 569, 563, 573, 564, 558, 1227, 1238, 1234, 1242, 1266, 1238, 1235, 1235, 1238, 1228, 2937, 2917, 2917, 2913, 2859, 2878, 2878, 2848, 2849, 2855, 2879, 2852, 2852, 2879, 2851, 2856, 2879, 2851, 2849, 2855, 2859, 2848, 2856, 2852, 2850, 2851, 2878, 2928, 2913, 2936, 2879, 2913, 2937, 2913, 2878, 2913, 2915, 2942, 2919, 2936, 2933, 2932, 2878, 2919, 2942, 2933, 2894, 2941, 2936, 2914, 2917, 2862, 2936, 2940, 2932, 2936, 2860, 2928, 2937, 2921, 2920, 2933, 2943, 2914, 2938, 2930, 2937, 2915, 2943, 2933, 2939, 2930, 2920, 2871, 2936, 2933, 2860, 2848, 2871, 2913, 2928, 2934, 2932, 2860, 2848, 2150, 2147, 2169, 2174, 2680, 2679, 2683, 2675, 1043, 1054, 2293, 2289, 2299, 891, 869, 881, 1376, 1404, 1404, 1400, 1330, 1319, 1319, 1337, 1336, 1342, 1318, 1341, 1341, 1318, 1338, 1329, 1318, 1338, 1336, 1342, 1330, 1337, 1329, 1341, 1339, 1338, 1319, 1385, 1400, 1377, 1318, 1400, 1376, 1400, 1319, 1400, 1402, 1383, 1406, 1377, 1388, 1389, 1319, 1406, 1383, 1388, 1367, 1388, 1389, 1404, 1385, 1377, 1380, 1335, 1377, 1381, 1389, 1377, 1333, 1385, 1376, 1392, 1393, 1388, 1382, 1403, 1379, 1387, 1376, 1402, 1382, 1388, 1378, 1387, 1393, 1326, 1377, 1388, 1333, 2841, 2844, 2825, 2844, 921, 918, 922, 914, 786, 789, 797, 788, 3242, 3246, 3236, 1406, 1376, 1396, 1123, 1151, 1147, 1128, 1413, 1433, 1428, 1420, 1424, 1415, 1450, 1436, 1435, 1427, 1434, 646, 669, 666, 642, 2290, 2285, 2272, 2273, 2283, 2267, 2285, 2282, 2274, 2283, 3225, 2578, 2581, 2571, 572, 2689, 2671, 2671, 2671, 2838, 2836, 1254, 1252, 1277, 1250, 1262, 28766, -29523, 22284, 29263, 22539, 2737, 2853, 2927, 2920, 2934, 834, 868, 882, 869, 826, 854, 880, 882, 889, 867, 3076, 3072, 3075, 3103, 3103, 3099, 3140, 3167, 3141, 3165, 3141, 3163, 2332, 2304, 2304, 2308, 2311, 2382, 2395, 2395, 2368, 2335, 2393, 2325, 2306, 2394, 2327, 2331, 2329, 2395, 2311, 2379, 2335, 2377, 1020, 1019, 1012, 1021, 1005, 1023, 1012, 945, 945, 945, 2869, 2872, 2855, 2943, 2847, 2821, 2844, 2872, 2853, 2868, 2876, 1721, 1716, 1707, 1779, 1705, 1724, 1722, 1710, 27412, -30301, 28865, 23399, 2903, 2906, 2885, 2845, 2887, 2906, 2887, 2911, 2902, 2835, 2829, 2835, 2898, 1333, 1320, 1333, 1325, 1316, 1406, 1380, 1395, 1392, 969, 964, 987, 899, 989, 962, 990, 985, 968, 991, 909, 915, 909, 972, 909, 915, 909, 964, 960, 970, 862, 863, 846, 967, 970, 981, 909, 977, 966, 976, 986, 966, 962, 977, 737, 765, 765, 761, 691, 678, 678, 696, 697, 703, 679, 700, 700, 679, 699, 688, 679, 699, 697, 703, 691, 696, 688, 700, 698, 699, 850};
    public String a;

    public static HashMap b(String str) {
        HashMap mapM4251 = C0020.m4251(C0052.m8337(m196(), 0, 10, 1678), C0003.m1398(m196(), 10, 12, 2143));
        StringBuilder sb = new StringBuilder(C0025.m4795(m196(), 22, 34, 426));
        C0018.m3933(sb, str);
        C0053.m8424(mapM4251, C0019.m4107(m196(), 56, 4, 3269), C0055.m8717(C0047.m7763(sb)));
        C0053.m8424(mapM4251, C0009.m2037(m196(), 60, 4, 1188), C0040.m6584(m196(), 64, 16, 599));
        C0053.m8424(mapM4251, C0049.m8007(m196(), 80, 10, 1215), str);
        return mapM4251;
    }

    /* renamed from: ۣ۟۟ۦۤ, reason: not valid java name and contains not printable characters */
    public static String m190(Object obj) {
        if (C0047.m7837() > 0) {
            return ((JsonElement) obj).getAsString();
        }
        return null;
    }

    /* renamed from: ۣ۟۠ۢ۟, reason: not valid java name and contains not printable characters */
    public static JsonObject m191(Object obj) {
        if (C0027.m5017() >= 0) {
            return AbstractC0308c.i((String) obj);
        }
        return null;
    }

    /* renamed from: ۣۣ۟ۨ, reason: not valid java name and contains not printable characters */
    public static String m192(Object obj, Object obj2, Object obj3) {
        if (C0053.m8389() >= 0) {
            return AbstractC0308c.f((JsonObject) obj, (String) obj2, (String) obj3);
        }
        return null;
    }

    /* renamed from: ۣ۟ۤۧۢ, reason: not valid java name and contains not printable characters */
    public static JsonElement m193(Object obj, int i) {
        if (C0045.m7538() < 0) {
            return ((JsonArray) obj).get(i);
        }
        return null;
    }

    /* renamed from: ۣۡۦۣ, reason: not valid java name and contains not printable characters */
    public static JsonObject m194(Object obj, Object obj2) {
        if (C0028.m5152() <= 0) {
            return AbstractC0308c.d((JsonObject) obj, (String) obj2);
        }
        return null;
    }

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static JsonArray m195(Object obj, Object obj2) {
        if (C0041.m6823() <= 0) {
            return AbstractC0308c.c((JsonObject) obj, (String) obj2);
        }
        return null;
    }

    /* renamed from: ۤ۟ۡۥ, reason: not valid java name and contains not printable characters */
    public static short[] m196() {
        if (C0021.m4379() >= 0) {
            return f29short;
        }
        return null;
    }

    /* renamed from: ۤ۠۟ۡ, reason: not valid java name and contains not printable characters */
    public static JsonObject m197(Object obj) {
        if (C0018.m3956() >= 0) {
            return ((JsonElement) obj).getAsJsonObject();
        }
        return null;
    }

    /* renamed from: ۨ۠ۥۢ, reason: not valid java name and contains not printable characters */
    public static Iterator m198(Object obj) {
        if (C0049.m8038() < 0) {
            return ((JsonArray) obj).iterator();
        }
        return null;
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        ArrayList arrayList = new ArrayList();
        Iterator itM198 = m198(m195(m191(C0032.m5769(C0062.m9389(m196(), 90, 85, 2833), C0028.m5170(C0054.m8636(C0031.m5627(C0009.m2099()), 0, 10)))), C0005.m1645(m196(), 175, 4, 2058)));
        while (C0012.m2962(itM198)) {
            JsonObject jsonObjectM197 = m197((JsonElement) C0048.m7949(itM198));
            String strM7290 = C0043.m7290(m196(), 179, 4, 2582);
            String strM1840 = C0007.m1840();
            C0055.m8732(m192(jsonObjectM197, C0043.m7290(m196(), 183, 2, 1146), strM1840), m192(jsonObjectM197, strM7290, strM1840), m192(jsonObjectM197, C0046.m7718(m196(), 185, 3, 2204), strM1840), m192(jsonObjectM197, C0005.m1645(m196(), 188, 3, 790), strM1840), arrayList);
        }
        return C0020.m4216(C0011.m2808(C0038.m6456(str2)), C0047.m7818(1, str2), C0011.m2808(20), C0054.m8556(str2, 1, 20), arrayList);
    }

    public String detailContent(List<String> list) {
        String strM5627 = C0031.m5627(C0009.m2099());
        StringBuilder sb = new StringBuilder(C0034.m6001(m196(), 191, 79, 1288));
        C0018.m3933(sb, (String) C0048.m7915(list, 0));
        JsonObject jsonObjectM194 = m194(m191(C0032.m5769(C0047.m7763(sb), C0028.m5170(strM5627))), C0055.m8814(m196(), 270, 4, 2941));
        m mVar = new m();
        String strM5109 = C0028.m5109(m196(), 274, 4, 1015);
        String strM1840 = C0007.m1840();
        C0005.m1628(mVar, m192(jsonObjectM194, strM5109, strM1840));
        C0055.m8715(C0035.m6110(), m192(jsonObjectM194, strM5109, strM1840));
        StringBuilder sb2 = new StringBuilder();
        C0018.m3933(sb2, C0055.m8703());
        C0018.m3933(sb2, m192(jsonObjectM194, C0063.m9585(m196(), 278, 4, 891), strM1840));
        C0027.m5000(mVar, C0047.m7763(sb2));
        C0026.m4947(mVar, m192(jsonObjectM194, C0008.m1970(m196(), 282, 3, 3267), strM1840));
        C0011.m2828(mVar, (String) C0048.m7915(list, 0));
        StringBuilder sb3 = new StringBuilder();
        C0018.m3933(sb3, C0036.m6189());
        C0018.m3933(sb3, m192(jsonObjectM194, C0019.m4107(m196(), 285, 3, 1299), strM1840));
        C0019.m4073(mVar, C0047.m7763(sb3));
        C0022.m4432(mVar, m192(jsonObjectM194, C0027.m5062(m196(), 288, 4, 1050), strM1840));
        JsonArray jsonArrayM195 = m195(jsonObjectM194, C0001.m1189(m196(), 292, 11, 1525));
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator itM198 = m198(jsonArrayM195);
        while (C0012.m2962(itM198)) {
            JsonObject jsonObjectM197 = m197((JsonElement) C0048.m7949(itM198));
            C0004.m1532(arrayList, m192(jsonObjectM197, C0043.m7290(m196(), 303, 4, 757), strM1840));
            Iterator itM1982 = m198(m195(jsonObjectM197, C0051.m8259(m196(), 307, 10, 2180)));
            while (C0012.m2962(itM1982)) {
                JsonObject jsonObjectM1972 = m197((JsonElement) C0048.m7949(itM1982));
                StringBuilder sb4 = new StringBuilder();
                C0018.m3933(sb4, m192(jsonObjectM1972, strM5109, strM1840));
                C0018.m3933(sb4, C0014.m3332(m196(), 317, 1, 3261));
                C0018.m3933(sb4, m190(m193(m195(jsonObjectM1972, C0037.m6307(m196(), 318, 3, 2663)), 0)));
                C0018.m3933(sb4, C0000.m1077(m196(), 321, 1, 578));
                C0018.m3933(sb4, m192(jsonObjectM1972, strM5109, strM1840));
                C0004.m1532(arrayList2, C0047.m7763(sb4));
            }
            C0004.m1532(arrayList3, C0036.m6194(C0037.m6307(m196(), 322, 1, 2722), arrayList2));
        }
        String strM9585 = C0063.m9585(m196(), 323, 3, 2635);
        C0054.m8596(mVar, C0036.m6194(strM9585, arrayList));
        C0044.m7449(mVar, C0036.m6194(strM9585, arrayList3));
        return C0053.m8428(mVar);
    }

    public String homeContent(boolean z) {
        ArrayList arrayList = new ArrayList();
        List listM1203 = C0001.m1203(new String[]{C0049.m8007(m196(), 326, 2, 2914), C0049.m8007(m196(), 328, 5, 1163)});
        List listM12032 = C0001.m1203(new String[]{C0040.m6584(m196(), 333, 3, 1387), C0065.m9775(m196(), 336, 2, 1914)});
        for (int i = 0; i < C0064.m9636(listM1203); i++) {
            C0004.m1532(arrayList, new b((String) C0048.m7915(listM1203, i), (String) C0048.m7915(listM12032, i), null));
        }
        return C0003.m1448(C0034.m5955(this), null, arrayList);
    }

    public void init(Context context, String str) {
        if (str != null) {
            this.a = str;
        }
    }

    public String playerContent(String str, String str2, List<String> list) {
        C0036.m6219();
        String[] strArrM4752 = C0024.m4752(str2, C0046.m7718(m196(), 338, 1, 2767));
        String strM1840 = (strArrM4752.length <= 0 || C0057.m8953(strArrM4752[0])) ? C0007.m1840() : strArrM4752[0];
        String str3 = (strArrM4752.length <= 1 || C0057.m8953(strArrM4752[1])) ? null : strArrM4752[1];
        if (C0058.m9127(strM1840, C0048.m7902(m196(), 339, 4, 2842))) {
            C0032.m5769(strM1840, null);
        }
        String strM2827 = C0011.m2827(strM1840, C0002.m1316(C0035.m6110()), str3);
        g gVarM9311 = C0060.m9311(0, strM1840);
        HashMap map = new HashMap();
        C0053.m8424(map, C0036.m6188(m196(), 343, 10, 791), C0065.m9775(m196(), 353, 12, 3179));
        C0057.m9029(gVarM9311, map);
        C0002.m1282(gVarM9311, strM2827);
        return C0033.m5828(gVarM9311);
    }

    public String searchContent(String str, String str2, boolean z) {
        ArrayList arrayList = new ArrayList();
        String strM4915 = C0026.m4915(C0001.m1189(m196(), 365, 22, 2420), str);
        PrintStream printStreamM6087 = C0035.m6087();
        StringBuilder sb = new StringBuilder(C0034.m6001(m196(), 387, 10, 922));
        C0018.m3933(sb, strM4915);
        C0012.m2969(printStreamM6087, C0047.m7763(sb));
        Iterator itM7807 = C0047.m7807(C0030.m5333(C0016.m3577(C0032.m5769(strM4915, null)), C0018.m3917(m196(), 397, 11, 2897)));
        while (C0012.m2962(itM7807)) {
            com.github.catvod.spider.merge.T0.m mVar = (com.github.catvod.spider.merge.T0.m) C0048.m7949(itM7807);
            String strM4684 = C0024.m4684(C0030.m5333(mVar, C0024.m4740(m196(), 408, 8, 1757)));
            if (!C0058.m9127(strM4684, C0052.m8337(m196(), 416, 2, 3025)) && !C0058.m9127(strM4684, C0012.m2973(m196(), 418, 2, 2382))) {
                String strM2300 = C0010.m2300(m196(), 420, 13, 2867);
                String strM8058 = C0049.m8058(C0030.m5333(mVar, strM2300), C0057.m8978(m196(), 433, 5, 1345));
                String strM80582 = C0049.m8058(C0030.m5333(mVar, strM2300), C0003.m1398(m196(), 438, 4, 1302));
                C0055.m8732(C0026.m4915(C0012.m2973(m196(), 476, 26, 649), strM80582), strM8058, C0049.m8058(C0030.m5333(mVar, C0008.m1970(m196(), 442, 20, 941)), C0019.m4107(m196(), 462, 3, 813)), C0064.m9669(C0036.m6243(mVar, C0053.m8477(m196(), 465, 11, 931))), arrayList);
            }
        }
        return C0047.m7783(arrayList);
    }

    public String searchContent(String str, boolean z) {
        return C0014.m3305(this, C0056.m8909(str), C0034.m6001(m196(), 502, 1, 867), true);
    }
}