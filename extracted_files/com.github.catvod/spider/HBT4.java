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
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.Z.C0040;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.c1.C0046;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.g0.AbstractC0308c;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.t.C0061;
import com.github.catvod.spider.merge.x0.C0063;
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
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import com.github.catvod.spider.p000mergexbpq.r.C0014;
import com.github.catvod.spider.p000mergexbpq.x.C0015;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class HBT4 extends Spider {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f34short = {474, 454, 454, 450, 392, 413, 413, 387, 391, 390, 412, 384, 387, 395, 412, 387, 387, 385, 412, 387, 385, 392, 391, 394, 388, 388, 413, 454, 471, 449, 454, 412, 450, 474, 450, 2147, 2175, 2175, 2171, 2097, 2084, 2084, 2106, 2110, 2111, 2085, 2105, 2106, 2098, 2085, 2106, 2106, 2104, 2085, 2106, 2104, 2097, 2110, 2099, 2109, 2109, 2084, 2145, 2146, 2158, 2085, 2171, 2147, 2171, 2100, 2174, 2169, 2151, 2102, 1351, 1377, 1399, 1376, 1343, 1363, 1397, 1399, 1404, 1382, 925, 959, 938, 953, 956, 956, 945, 1023, 997, 1022, 992, 1008, 1016, 903, 953, 958, 948, 959, 935, 931, 1008, 926, 900, 1008, 993, 992, 1022, 992, 1003, 1008, 903, 927, 903, 998, 996, 1017, 1008, 913, 928, 928, 956, 949, 903, 949, 946, 923, 953, 932, 1023, 997, 995, 999, 1022, 995, 998, 1008, 1016, 923, 920, 900, 925, 924, 1020, 1008, 956, 953, 955, 949, 1008, 919, 949, 947, 955, 959, 1017, 1008, 915, 952, 930, 959, 957, 949, 1023, 993, 992, 1001, 1022, 992, 1022, 992, 1022, 992, 1008, 899, 945, 950, 945, 930, 953, 1023, 997, 995, 999, 1022, 995, 998, 2756, 1966, 2040, 2031, 1973, 2572, 2642, 2640, 2574, 2647, 2646, 2631, 2642, 2650, 2655, 2581, 2631, 2574, 1024, 1095, 1093, 1051, 1090, 1091, 1106, 1095, 1103, 1098, 1024, 1106, 1051, 2404, 2401, 2427, 2428, 903, 926, 917, 942, 920, 917, 2928, 2921, 2914, 2905, 2920, 2919, 2923, 2915, 2681, 2656, 2667, 2640, 2687, 2662, 2668, 671, 646, 653, 694, 667, 652, 644, 648, 667, 642, 666, 1763, 367, 296, 298, 372, 301, 300, 317, 296, 288, 293, 367, 288, 301, 314, 372, 466, 396, 398, 464, 393, 392, 409, 396, 388, 385, 459, 388, 393, 414, 464, 1797, 1792, 1818, 1821, 319, 294, 301, 278, 313, 293, 296, 304, 278, 303, 315, 294, 292, 1545, 1649, 1545, 1649, 1545, 1649, 3021, 3028, 3039, 3044, 3019, 3031, 3034, 3010, 3044, 3022, 3017, 3031, 2430, 2430, 2430, 1270, 1248, 21980, 22826, 1655, 1576, 3308, 3304, 3324, 3311, 3318, 30132, 24002, 671, 704, 2340, 2365, 2358, 2317, 2364, 2355, 2367, 2359, 471, 257, 377, 2137, 3286, 1931, 1938, 1945, 1954, 1935, 1944, 1936, 1948, 1935, 1942, 1934, 1039, 1046, 1053, 1062, 1050, 1046, 1047, 1037, 1052, 1047, 1037, 261, 284, 279, 300, 266, 278, 274, 257, 948, 941, 934, 925, 934, 939, 944, 935, 929, 950, 941, 944, 2262, 2255, 2244, 2303, 2241, 2243, 2260, 2255, 2258, 920, 897, 906, 945, 926, 903, 909, 1054, 1031, 1036, 1079, 1033, 1050, 1037, 1033, 1495, 1496, 1493, 1479, 1479, 1992, 1989, 1996, 2009, 2019, 2002, 2013, 2001, 2009, 17530, 31405, 30188, 1629, 1616, 1625, 1612, 1654, 1600, 1613, 2695, 2715, 2715, 2719, 1279, 1279, 1279, 23015, 21777, 2636, 2579, 1320, 1342, 32260, 22130, 2351, 2416, 1570, 1574, 1586, 1569, 1592, 1327, 1944, 391, 457, 451, 469, 405, 412, 658, 661, 651, 1742, 970, 1077, 1123, 1140, 1070, 2987, 3052, 3054, 2992, 3049, 3048, 3065, 3052, 3044, 3041, 2987, 3066, 3049, 2992, 1828, 1914, 1912, 1830, 1919, 1918, 1903, 1914, 1906, 1911, 1853, 1900, 1919, 1830};
    public String a = C0004.m1549(m224(), 0, 35, 434);
    public final String b = C0032.m5708(m224(), 35, 39, 2059);
    public final String c = C0007.m1840();
    public String[] d;

    public static HashMap a() {
        return C0020.m4251(C0001.m1189(m224(), 74, 10, 1298), C0065.m9775(m224(), 84, 106, 976));
    }

    /* renamed from: ۟۟ۡۦۤ, reason: not valid java name and contains not printable characters */
    public static int m222(Object obj) {
        if (C0054.m8557() <= 0) {
            return ((JsonArray) obj).size();
        }
        return 0;
    }

    /* renamed from: ۟ۤۢ۟, reason: not valid java name and contains not printable characters */
    public static JsonElement m223(Object obj, int i) {
        if (C0040.m6582() >= 0) {
            return ((JsonArray) obj).get(i);
        }
        return null;
    }

    /* renamed from: ۡۤۦۣ, reason: not valid java name and contains not printable characters */
    public static short[] m224() {
        if (C0018.m3956() >= 0) {
            return f34short;
        }
        return null;
    }

    /* renamed from: ۢ۟ۥ۠, reason: not valid java name and contains not printable characters */
    public static String m225(Object obj) {
        if (C0009.m2047() >= 0) {
            return ((JsonElement) obj).getAsString();
        }
        return null;
    }

    /* renamed from: ۤۡۧۨ, reason: not valid java name and contains not printable characters */
    public static JsonObject m226(Object obj) {
        if (C0017.m3633() <= 0) {
            return AbstractC0308c.i((String) obj);
        }
        return null;
    }

    /* renamed from: ۦ۠ۢۤ, reason: contains not printable characters */
    public static JsonArray m227(Object obj, Object obj2) {
        if (C0033.m5872() >= 0) {
            return AbstractC0308c.c((JsonObject) obj, (String) obj2);
        }
        return null;
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        StringBuilder sb;
        String strM4230;
        String strM7718;
        ArrayList arrayList = new ArrayList();
        boolean zM9127 = C0058.m9127(C0020.m4230(this), C0044.m7509(m224(), 190, 1, 2811));
        String strM5362 = C0030.m5362(m224(), 191, 4, 1928);
        if (zM9127) {
            sb = new StringBuilder();
            strM4230 = C0020.m4230(this);
            strM7718 = C0046.m7718(m224(), 208, 13, 1062);
        } else {
            sb = new StringBuilder();
            strM4230 = C0020.m4230(this);
            strM7718 = C0016.m3525(m224(), 195, 13, 2611);
        }
        C0011.m2747(sb, strM4230, strM7718, str, strM5362);
        C0018.m3933(sb, str2);
        JSONArray jSONArrayM4333 = C0021.m4333(new JSONObject(C0053.m8446(C0032.m5769(C0047.m7763(sb), C0047.m7750()))), C0011.m2805(m224(), 221, 4, 2312));
        for (int i = 0; i < C0053.m8396(jSONArrayM4333); i++) {
            JSONObject jSONObjectM3923 = C0018.m3923(jSONArrayM4333, i);
            C0004.m1532(arrayList, new m(C0001.m1212(jSONObjectM3923, C0009.m2037(m224(), 225, 6, 1009)), C0001.m1212(jSONObjectM3923, C0028.m5109(m224(), 231, 8, 2822)), C0001.m1212(jSONObjectM3923, C0003.m1398(m224(), 239, 7, 2575)), C0001.m1212(jSONObjectM3923, C0040.m6584(m224(), 246, 11, 745))));
        }
        return C0047.m7783(arrayList);
    }

    public String detailContent(List<String> list) {
        StringBuilder sb;
        String strM6452;
        String strM9775;
        m mVar = new m();
        char c = 0;
        if (C0058.m9127(C0020.m4230(this), C0058.m9106(m224(), 257, 1, 1756))) {
            sb = new StringBuilder();
            C0018.m3933(sb, C0020.m4230(this));
            strM6452 = C0054.m8574(m224(), 258, 15, 329);
        } else {
            sb = new StringBuilder();
            C0018.m3933(sb, C0020.m4230(this));
            strM6452 = C0038.m6452(m224(), 273, 15, 493);
        }
        C0018.m3933(sb, strM6452);
        C0018.m3933(sb, (String) C0048.m7915(list, 0));
        JSONObject jSONObjectM3923 = C0018.m3923(C0021.m4333(new JSONObject(C0053.m8446(C0032.m5769(C0047.m7763(sb), C0047.m7750()))), C0049.m8007(m224(), 288, 4, 1897)), 0);
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        String strM1212 = C0001.m1212(jSONObjectM3923, C0030.m5362(m224(), 292, 13, 329));
        String strM5256 = C0029.m5256(m224(), 305, 6, 1621);
        String[] strArrM4752 = C0024.m4752(strM1212, strM5256);
        String[] strArrM47522 = C0024.m4752(C0001.m1212(jSONObjectM3923, C0063.m9585(m224(), 311, 12, 3003)), strM5256);
        int i = 0;
        while (true) {
            int length = strArrM4752.length;
            strM9775 = C0065.m9775(m224(), 323, 3, 2394);
            if (i >= length) {
                break;
            }
            C0018.m3933(sb2, C0015.m3446(C0015.m3446(strArrM4752[i], C0009.m2037(m224(), 326, 2, 1155), C0056.m8911(m224(), 328, 4, 1603)), C0065.m9775(m224(), 332, 5, 3229), C0020.m4199(m224(), 337, 4, 683)));
            C0018.m3933(sb2, strM9775);
            i++;
        }
        int i2 = 0;
        while (true) {
            int length2 = strArrM47522.length;
            String strM8007 = C0049.m8007(m224(), 341, 8, 2386);
            if (i2 >= length2) {
                C0005.m1628(mVar, C0001.m1212(jSONObjectM3923, strM8007));
                StringBuilder sb4 = new StringBuilder();
                C0018.m3933(sb4, C0036.m6189());
                C0018.m3933(sb4, C0001.m1212(jSONObjectM3923, C0000.m1077(m224(), 354, 11, 2045)));
                C0019.m4073(mVar, C0047.m7763(sb4));
                C0027.m5000(mVar, C0001.m1212(jSONObjectM3923, C0031.m5565(m224(), 365, 11, 1145)));
                C0022.m4432(mVar, C0001.m1212(jSONObjectM3923, C0031.m5565(m224(), 376, 8, 371)));
                C0058.m9152(mVar, C0001.m1212(jSONObjectM3923, C0047.m7833(m224(), 384, 12, 962)));
                C0058.m9159(mVar, C0001.m1212(jSONObjectM3923, C0020.m4199(m224(), 396, 9, 2208)));
                C0026.m4947(mVar, C0001.m1212(jSONObjectM3923, C0036.m6188(m224(), 405, 7, 1006)));
                C0017.m3671(mVar, C0001.m1212(jSONObjectM3923, C0017.m3646(m224(), 412, 8, 1128)));
                C0054.m8596(mVar, C0047.m7763(sb2));
                C0044.m7449(mVar, C0047.m7763(sb3));
                return C0053.m8428(mVar);
            }
            String str = strArrM47522[i2];
            String strM64522 = C0038.m6452(m224(), 349, 1, 500);
            for (String str2 : C0024.m4752(str, strM64522)) {
                String[] strArrM47523 = C0024.m4752(str2, C0061.m9361(m224(), 350, 2, 349));
                C0018.m3933(sb3, strArrM47523[c]);
                C0018.m3933(sb3, C0010.m2300(m224(), 352, 1, 2173));
                C0018.m3933(sb3, strArrM47523[1]);
                String strM9106 = C0058.m9106(m224(), 353, 1, 3240);
                StringBuilder sb5 = new StringBuilder(strM9106);
                C0018.m3933(sb5, C0001.m1212(jSONObjectM3923, strM8007));
                C0018.m3933(sb5, strM9106);
                c = 0;
                C0018.m3933(sb5, strArrM47523[0]);
                C0018.m3933(sb3, C0047.m7763(sb5));
                C0018.m3933(sb3, strM64522);
            }
            C0018.m3933(sb3, strM9775);
            i2++;
        }
    }

    public String homeContent(boolean z) {
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArrayM4333 = C0021.m4333(new JSONObject(C0053.m8446(C0032.m5769(C0020.m4230(this), C0047.m7750()))), C0026.m4951(m224(), 420, 5, 1460));
        for (int i = 0; i < C0053.m8396(jSONArrayM4333); i++) {
            JSONObject jSONObjectM3923 = C0018.m3923(jSONArrayM4333, i);
            String strM1077 = C0000.m1077(m224(), 425, 9, 1980);
            if (!C0058.m9127(C0001.m1212(jSONObjectM3923, strM1077), C0022.m4403(m224(), 434, 1, 2908)) && !C0058.m9127(C0001.m1212(jSONObjectM3923, strM1077), C0003.m1398(m224(), 435, 1, 802)) && !C0058.m9127(C0001.m1212(jSONObjectM3923, strM1077), C0038.m6452(m224(), 436, 1, 490))) {
                C0004.m1532(arrayList, new b(C0001.m1212(jSONObjectM3923, C0013.m3106(m224(), 437, 7, 1577)), C0001.m1212(jSONObjectM3923, strM1077), null));
            }
        }
        return C0003.m1448(C0056.m8859(this), null, arrayList);
    }

    public void init(Context context) {
        super.init(context);
    }

    public void init(Context context, String str) {
        String strM2083 = str;
        if (strM2083 != null) {
            if (!C0058.m9127(strM2083, C0061.m9361(m224(), 444, 4, 2799))) {
                strM2083 = C0009.m2083(C0009.m2083(strM2083));
            }
            String[] strArrM4752 = C0024.m4752(strM2083, C0032.m5708(m224(), 448, 3, 1244));
            this.d = strArrM4752;
            this.a = strArrM4752[0];
        }
    }

    public String playerContent(String str, String str2, List<String> list) {
        String strM3446 = C0015.m3446(C0015.m3446(str, C0000.m1077(m224(), 451, 4, 2680), C0057.m8978(m224(), 455, 2, 1373)), C0014.m3332(m224(), 457, 4, 2331), C0015.m3484(m224(), 461, 5, 1619));
        String[] strArrM4752 = C0024.m4752(str2, C0003.m1398(m224(), 466, 1, 1361));
        String str3 = (strArrM4752.length <= 0 || C0057.m8953(strArrM4752[0])) ? null : strArrM4752[0];
        String strM2827 = C0011.m2827(str3, (strArrM4752.length <= 1 || C0057.m8953(strArrM4752[1])) ? null : strArrM4752[1], (strArrM4752.length <= 2 || C0057.m8953(strArrM4752[2])) ? null : strArrM4752[2]);
        StringBuilder sb = new StringBuilder();
        C0018.m3933(sb, C0001.m1237(this));
        String str4 = C0037.m6306(this)[1];
        String strM1305 = C0002.m1305(m224(), 467, 1, 1973);
        C0011.m2747(sb, str4, strM1305, strM3446, strM1305);
        C0018.m3933(sb, str3);
        C0018.m3933(sb, C0037.m6307(m224(), 468, 6, 417));
        C0006.m1736(sb, C0035.m6105(C0035.m6110()));
        JsonArray jsonArrayM227 = m227(m226(C0053.m8446(C0032.m5769(C0047.m7763(sb), null))), C0038.m6452(m224(), 474, 3, 743));
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < m222(jsonArrayM227); i++) {
            C0004.m1532(arrayList, m225(m223(jsonArrayM227, i)));
        }
        g gVar = new g();
        C0020.m4226(gVar, arrayList);
        C0002.m1282(gVar, strM2827);
        return C0033.m5828(gVar);
    }

    public String searchContent(String str, boolean z) {
        return C0014.m3371(this, str, true, C0063.m9585(m224(), 477, 1, 1791));
    }

    public String searchContent(String str, boolean z, String str2) {
        StringBuilder sb;
        String strM4230;
        String strM6779;
        new ArrayList();
        boolean zM9127 = C0058.m9127(C0020.m4230(this), C0022.m4403(m224(), 478, 1, 1013));
        String strM1077 = C0000.m1077(m224(), 479, 4, 1043);
        if (zM9127) {
            sb = new StringBuilder();
            strM4230 = C0020.m4230(this);
            strM6779 = C0019.m4107(m224(), 483, 14, 2957);
        } else {
            sb = new StringBuilder();
            strM4230 = C0020.m4230(this);
            strM6779 = C0041.m6779(m224(), 497, 14, 1819);
        }
        C0011.m2747(sb, strM4230, strM6779, str, strM1077);
        C0018.m3933(sb, str2);
        return C0053.m8446(C0032.m5769(C0047.m7763(sb), C0047.m7750()));
    }
}