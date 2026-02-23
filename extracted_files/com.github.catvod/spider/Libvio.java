package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.E.b;
import com.github.catvod.spider.merge.E.g;
import com.github.catvod.spider.merge.E.j;
import com.github.catvod.spider.merge.E.k;
import com.github.catvod.spider.merge.E.l;
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
import com.github.catvod.spider.merge.T0.h;
import com.github.catvod.spider.merge.T0.m;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.V0.d;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.Z.C0040;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.g0.AbstractC0308c;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.q.C0058;
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
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
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
import java.io.PrintStream;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class Libvio extends Cloud {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f83short = {2391, 2379, 2379, 2383, 2380, 2309, 2320, 2320, 2376, 2376, 2376, 2321, 2387, 2390, 2397, 2377, 2390, 2384, 2321, 2387, 2390, 2385, 2388, 2320, 1355, 1389, 1403, 1388, 1331, 1375, 1401, 1403, 1392, 1386, 3207, 3237, 3248, 3235, 3238, 3238, 3243, 3301, 3327, 3300, 3322, 3306, 3298, 3206, 3235, 3236, 3263, 3250, 3313, 3306, 3211, 3236, 3246, 3256, 3237, 3235, 3246, 3306, 3323, 3323, 3313, 3306, 3207, 3320, 3322, 3322, 3325, 3200, 3321, 3225, 3209, 3306, 3208, 3263, 3235, 3238, 3246, 3301, 3224, 3201, 3227, 3323, 3300, 3320, 3322, 3322, 3314, 3320, 3324, 3300, 3322, 3322, 3320, 3313, 3306, 3261, 3260, 3299, 3306, 3211, 3258, 3258, 3238, 3247, 3229, 3247, 3240, 3201, 3235, 3262, 3301, 3327, 3321, 3325, 3300, 3321, 3324, 3306, 3298, 3201, 3202, 3230, 3207, 3206, 3302, 3306, 3238, 3235, 3233, 3247, 3306, 3213, 3247, 3241, 3233, 3237, 3299, 3306, 3228, 3247, 3256, 3257, 3235, 3237, 3236, 3301, 3326, 3300, 3322, 3306, 3209, 3234, 3256, 3237, 3239, 3247, 3301, 3325, 3325, 3300, 3322, 3300, 3321, 3314, 3324, 3327, 3300, 3323, 3320, 3322, 3306, 3207, 3227, 3227, 3208, 3256, 3237, 3261, 3257, 3247, 3256, 3301, 3324, 3300, 3320, 3306, 3230, 3208, 3225, 3301, 3322, 3326, 3327, 3325, 3323, 3326, 3306, 3207, 3237, 3240, 3235, 3238, 3247, 3306, 3225, 3243, 3244, 3243, 3256, 3235, 3301, 3327, 3321, 3325, 3300, 3321, 3324, 1561, 1552, 1633, 2465, 2472, 2521, 2508, 23372, 21034, 2518, 2508, 2220, 3045, 2979, 3007, 2982, 2983, 3159, 3150, 3084, 3153, 3158, 3159, 3147, 3087, 3156, 3149, 3142, 3150, 3147, 3153, 3158, 3074, 3100, 3074, 3150, 3147, 3074, 3100, 3074, 3142, 3147, 3156, 3074, 3100, 3074, 3139, 1170, 1175, 1154, 1175, 1243, 1177, 1156, 1183, 1169, 1183, 1176, 1175, 1178, 1526, 1516, 1531, 1528, 3314, 3311, 3314, 3306, 3299, 2517, 2505, 2505, 2509, 972, 949, 1022, 1023, 1006, 1019, 1011, 1014, 949, 588, 577, 586, 599, 526, 528, 526, 586, 583, 600, 532, 576, 602, 582, 515, 589, 582, 583, 578, 586, 518, 541, 519, 526, 528, 526, 586, 583, 600, 512, 604, 577, 601, 526, 528, 526, 586, 583, 600, 526, 528, 526, 586, 583, 600, 526, 528, 526, 586, 583, 600, 526, 528, 526, 586, 583, 600, 512, 605, 602, 603, 583, 515, 589, 577, 576, 602, 587, 576, 602, 526, 528, 526, 586, 583, 600, 512, 605, 602, 603, 583, 515, 589, 577, 576, 602, 587, 576, 602, 625, 625, 586, 587, 602, 591, 583, 578, 526, 528, 526, 582, 543, 1946, 1943, 1928, 2000, 1933, 1930, 1931, 1943, 2003, 1949, 1937, 1936, 1930, 1947, 1936, 1930, 1953, 1953, 1930, 1942, 1931, 1939, 1948, 2014, 1984, 2014, 1951, 2014, 1984, 1943, 1939, 1945, 2513, 2516, 2497, 2516, 2456, 2522, 2503, 2524, 2514, 2524, 2523, 2516, 2521, 2120, 2117, 2138, 2050, 2143, 2136, 2137, 2117, 2049, 2138, 2115, 2120, 2112, 2117, 2143, 2136, 2163, 2163, 2116, 2121, 2125, 2120, 2060, 2066, 2060, 2120, 2117, 2138, 2060, 2066, 2060, 2116, 2079, 1700, 1705, 1718, 1774, 1715, 1716, 1717, 1705, 1773, 1718, 1711, 1700, 1708, 1705, 1715, 1716, 1695, 1695, 1704, 1701, 1697, 1700, 1760, 1790, 1760, 1717, 1708, 1774, 1715, 1716, 1717, 1705, 1773, 1699, 1711, 1710, 1716, 1701, 1710, 1716, 1695, 1695, 1712, 1708, 1697, 1721, 1708, 1705, 1715, 1716, 1760, 1760, 3079, 1181, 1163, 23302, 21365, 1470, 1444, 1459, 1456, 1091, 1052, 1024, 1037, 1045, 1091, 2279, 2299, 2294, 2286, 2290, 2277, 2248, 2294, 2294, 2294, 2294, 2218, 2239, 2233, 2237, 2216, 2238, 2219, 2232, 2276, 2292, 2277, 2302, 2279, 2275, 2217, 1653, 1650, 1644, 3189, 3189, 3189, 1506, 1531, 1465, 1508, 1507, 1506, 1534, 1466, 1535, 1522, 1526, 1523, 1522, 1509, 1480, 1480, 1530, 1522, 1529, 1506, 1463, 1449, 1463, 1531, 1534, 1463, 1449, 1463, 1526, 883, 873, 894, 893, 2047, 1977, 1957, 1980, 1981, 592, 585, 523, 598, 593, 592, 588, 520, 595, 586, 577, 585, 588, 598, 593, 517, 539, 517, 585, 588, 517, 539, 517, 577, 588, 595, 517, 539, 517, 580, 1300, 1297, 1284, 1297, 1373, 1311, 1282, 1305, 1303, 1305, 1310, 1297, 1308, 2541, 2544, 2541, 2549, 2556, 2082, 2110, 2110, 2106, 419, 2917, 2943, 2914, 2931, 2267, 2202, 23410, 32181, 2162, 2152, 2175, 2172, 997, 992, 1003, 1023, 992, 998, -29062, -29467, 21689, 21705, 937, 948, 948, 948, 948, 948, 951, 2357, 2353, 2341, 2358, 2351, 912, 975, 979, 990, 966, 912, 615, 635, 630, 622, 626, 613, 584, 630, 630, 630, 630, 554, 575, 569, 573, 552, 574, 555, 568, 612, 628, 613, 638, 615, 611, 553, 1188, 1187, 1213, 2483, 2471, 2490, 2488, 576, 581, 578, 583, 627, 578, 585, 596, 600, 876, 865, 860, 859, 854, 862, 770, 773, 784, 773, 792, 786, 862, 769, 797, 784, 776, 788, 771, 862, 867, 807, 830, 2893, 2846, 2847, 2830, 2896, 2895, 2885, 2883, 2887, 2898, 2884, 2890, 3056, 3000, 2995, 2990, 2978, 3051, 2189, 2242, 2255, 2198, 1408, 1480, 1487, 1474, 1435, 2222, 2226, 2226, 2230, 1200, 1200, 1200, 1257, 2175, 2137, 2127, 2136, 2055, 2155, 2125, 2127, 2116, 2142, 2556, 2526, 2507, 2520, 2525, 2525, 2512, 2462, 2436, 2463, 2433, 2449, 2457, 2557, 2520, 2527, 2500, 2505, 2442, 2449, 2544, 2527, 2517, 2499, 2526, 2520, 2517, 2449, 2432, 2432, 2442, 2449, 2556, 2435, 2433, 2433, 2438, 2555, 2434, 2530, 2546, 2449, 2547, 2500, 2520, 2525, 2517, 2462, 2531, 2554, 2528, 2432, 2463, 2435, 2433, 2433, 2441, 2435, 2439, 2463, 2433, 2433, 2435, 2442, 2449, 2502, 2503, 2456, 2449, 2544, 2497, 2497, 2525, 2516, 2534, 2516, 2515, 2554, 2520, 2501, 2462, 2436, 2434, 2438, 2463, 2434, 2439, 2449, 2457, 2554, 2553, 2533, 2556, 2557, 2461, 2449, 2525, 2520, 2522, 2516, 2449, 2550, 2516, 2514, 2522, 2526, 2456, 2449, 2535, 2516, 2499, 2498, 2520, 2526, 2527, 2462, 2437, 2463, 2433, 2449, 2546, 2521, 2499, 2526, 2524, 2516, 2462, 2438, 2438, 2463, 2433, 2463, 2434, 2441, 2439, 2436, 2463, 2432, 2435, 2433, 2449, 2556, 2528, 2528, 2547, 2499, 2526, 2502, 2498, 2516, 2499, 2462, 2439, 2463, 2435, 2449, 2533, 2547, 2530, 2462, 2433, 2437, 2436, 2438, 2432, 2437, 2449, 2556, 2526, 2515, 2520, 2525, 2516, 2449, 2530, 2512, 2519, 
    2512, 2499, 2520, 2462, 2436, 2434, 2438, 2463, 2434, 2439, 2325, 2338, 2337, 2338, 2357, 2338, 2357, 1012, 1003, 998, 1393, 1325, 1339, 1343, 1324, 1341, 1334, 1393, 1395, 1395, 1395, 1395, 1395, 1395, 1395, 1395, 1395, 1395, 1395, 1395, 1395, 1392, 1334, 1322, 1331, 1330, 1377, 1321, 1338, 1379, 590, 599, 533, 584, 591, 590, 594, 534, 589, 596, 607, 599, 594, 584, 591, 539, 517, 539, 599, 594, 539, 517, 539, 607, 594, 589, 539, 517, 539, 602, 2191, 2186, 2207, 2186, 2246, 2180, 2201, 2178, 2188, 2178, 2181, 2186, 2183, 692, 686, 697, 698, 989, 960, 989, 965, 972, 3094, 3082, 3082, 3086, 949};
    public static String g = C0039.m6551(m470(), 0, 24, 2367);

    public static HashMap a() {
        return C0020.m4251(C0012.m2973(m470(), 24, 10, 1310), C0023.m4536(m470(), 34, 187, 3274));
    }

    /* renamed from: ۟۟ۥۣ۟, reason: not valid java name and contains not printable characters */
    public static JsonElement m469(Object obj) {
        if (C0040.m6582() >= 0) {
            return AbstractC0308c.g((String) obj);
        }
        return null;
    }

    /* renamed from: ۟ۢ۟ۥۢ, reason: not valid java name and contains not printable characters */
    public static short[] m470() {
        if (C0002.m1242() >= 0) {
            return f83short;
        }
        return null;
    }

    /* renamed from: ۣ۟۠ۤۨ, reason: not valid java name and contains not printable characters */
    public static JsonObject m471(Object obj) {
        if (C0018.m3956() > 0) {
            return ((JsonElement) obj).getAsJsonObject();
        }
        return null;
    }

    /* renamed from: ۡۧۡۧ, reason: not valid java name and contains not printable characters */
    public static JsonElement m472(Object obj, Object obj2) {
        if (C0031.m5628() > 0) {
            return ((JsonObject) obj).get((String) obj2);
        }
        return null;
    }

    /* renamed from: ۤۧ۠, reason: not valid java name and contains not printable characters */
    public static void m473(Object obj) {
        if (C0037.m6350() < 0) {
            SpiderDebug.log((String) obj);
        }
    }

    /* renamed from: ۥۤۦۤ, reason: contains not printable characters */
    public static String m474(Object obj) {
        if (C0013.m3167() >= 0) {
            return ((JsonElement) obj).getAsString();
        }
        return null;
    }

    public String MD5(String str) {
        try {
            byte[] bArrM6159 = C0035.m6159(C0015.m3410(C0011.m2805(m470(), 221, 3, 1620)), C0050.m8115(str));
            StringBuilder sb = new StringBuilder();
            for (byte b : bArrM6159) {
                String strM8889 = C0056.m8889(b & 255);
                if (C0004.m1584(strM8889) == 1) {
                    C0062.m9399(sb, '0');
                }
                C0018.m3933(sb, strM8889);
            }
            PrintStream printStreamM6087 = C0035.m6087();
            StringBuilder sb2 = new StringBuilder();
            C0018.m3933(sb2, C0034.m6001(m470(), 224, 8, 2540));
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
        StringBuilder sb = new StringBuilder();
        C0011.m2747(sb, C0053.m8407(), str, C0045.m7657(m470(), 232, 1, 2177), str2);
        C0018.m3933(sb, C0054.m8574(m470(), 233, 5, 3019));
        Iterator itM7807 = C0047.m7807(C0030.m5333(C0016.m3577(C0032.m5769(C0047.m7763(sb), C0063.m9534())), C0049.m8007(m470(), 238, 30, 3106)));
        while (C0012.m2962(itM7807)) {
            m mVar = (m) C0048.m7949(itM7807);
            String strM2339 = C0010.m2339(mVar, C0017.m3646(m470(), 268, 13, 1270));
            String strM23392 = C0010.m2339(mVar, C0028.m5109(m470(), 281, 4, 1438));
            String strM23393 = C0010.m2339(mVar, C0065.m9775(m470(), 285, 5, 3206));
            if (!C0043.m7277(strM2339, C0064.m9599(m470(), 290, 4, 2493))) {
                strM2339 = C0028.m5188(new StringBuilder(), C0053.m8407(), strM2339);
            }
            C0032.m5685(C0024.m4752(strM23392, C0042.m7151(m470(), 294, 1, 995))[2], strM23393, strM2339, arrayList);
        }
        return C0020.m4216(C0011.m2808(C0038.m6456(str2)), C0047.m7818(1, str2), C0011.m2808(20), C0054.m8556(str2, 1, 20), arrayList);
    }

    @Override // com.github.catvod.spider.Cloud
    public String detailContent(List<String> list) {
        String strM1840;
        String str;
        String strM8574;
        String strM8131;
        h hVarM3577 = C0016.m3577(C0032.m5769(C0050.m8125(C0050.m8125(C0053.m8407(), C0002.m1305(m470(), 295, 8, 922)), (String) C0048.m7915(list, 0)), C0063.m9534()));
        String strM4684 = C0024.m4684(C0030.m5333(hVarM3577, C0065.m9775(m470(), 303, 102, 558)));
        String strM8058 = C0049.m8058(C0030.m5333(hVarM3577, C0051.m8259(m470(), 405, 32, 2046)), C0061.m9361(m470(), 437, 13, 2485));
        d dVarM5333 = C0030.m5333(hVarM3577, C0003.m1398(m470(), 450, 33, 2092));
        d dVarM53332 = C0030.m5333(hVarM3577, C0062.m9389(m470(), 483, 52, 1728));
        l lVar = new l(0);
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            int iM2095 = C0009.m2095(dVarM5333);
            strM1840 = C0007.m1840();
            if (i >= iM2095) {
                break;
            }
            ArrayList arrayList2 = new ArrayList();
            String strM9669 = C0064.m9669((m) C0028.m5161(dVarM5333, i));
            Iterator itM7807 = C0047.m7807(C0030.m5333((m) C0028.m5161(dVarM53332, i), C0029.m5256(m470(), 535, 1, 3174)));
            while (true) {
                boolean zM2962 = C0012.m2962(itM7807);
                strM8574 = C0054.m8574(m470(), 536, 2, 1224);
                strM8131 = C0050.m8131(m470(), 538, 2, 574);
                if (!zM2962) {
                    break;
                }
                m mVar = (m) C0048.m7949(itM7807);
                boolean zM9127 = C0058.m9127(strM9669, strM8131);
                d dVar = dVarM53332;
                String strM7657 = C0045.m7657(m470(), 540, 4, 1494);
                if (zM9127 || C0058.m9127(strM9669, strM8574)) {
                    C0004.m1532(arrayList, C0010.m2339(mVar, strM7657));
                } else {
                    k kVar = new k();
                    kVar.a = C0064.m9669(mVar);
                    kVar.b = C0015.m3446(C0010.m2339(mVar, strM7657), C0019.m4107(m470(), 544, 6, 1132), strM1840);
                    C0004.m1532(arrayList2, kVar);
                }
                dVarM53332 = dVar;
            }
            d dVar2 = dVarM53332;
            if (!C0058.m9127(strM9669, strM8131) && !C0058.m9127(strM9669, strM8574)) {
                C0001.m1174(lVar, strM9669, arrayList2);
            }
            i++;
            dVarM53332 = dVar2;
        }
        ArrayList arrayList3 = new ArrayList();
        if (C0007.m1817(arrayList)) {
            str = strM1840;
        } else {
            Iterator itM7816 = C0047.m7816(arrayList);
            while (C0012.m2962(itM7816)) {
                Matcher matcherM6026 = C0034.m6026(C0005.m1602(C0020.m4199(m470(), 550, 26, 2199)), C0000.m1081(C0016.m3577(C0032.m5769(C0050.m8125(C0053.m8407(), (String) C0048.m7949(itM7816)), C0063.m9534()))));
                C0004.m1532(arrayList3, C0001.m1212(new JSONObject(C0003.m1405(matcherM6026) ? C0021.m4306(matcherM6026, 1) : strM1840), C0010.m2300(m470(), 576, 3, 1536)));
            }
            String strM3356 = C0014.m3356(this, arrayList3);
            strM1840 = C0030.m5351(this);
            str = strM3356;
        }
        j jVarM6432 = C0038.m6432(lVar);
        com.github.catvod.spider.merge.E.m mVar2 = new com.github.catvod.spider.merge.E.m();
        C0011.m2828(mVar2, (String) C0048.m7915(list, 0));
        StringBuilder sb = new StringBuilder();
        C0018.m3933(sb, C0053.m8407());
        C0018.m3933(sb, strM8058);
        C0026.m4947(mVar2, C0047.m7763(sb));
        C0005.m1628(mVar2, strM4684);
        StringBuilder sb2 = new StringBuilder();
        C0018.m3933(sb2, C0045.m7548(jVarM6432));
        String strM8978 = C0057.m8978(m470(), 579, 3, 3153);
        C0018.m3933(sb2, strM8978);
        C0018.m3933(sb2, strM1840);
        C0054.m8596(mVar2, C0047.m7763(sb2));
        StringBuilder sb3 = new StringBuilder();
        C0018.m3933(sb3, C0055.m8812(jVarM6432));
        C0018.m3933(sb3, strM8978);
        C0018.m3933(sb3, str);
        C0044.m7449(mVar2, C0047.m7763(sb3));
        return C0053.m8428(mVar2);
    }

    public String homeContent(boolean z) {
        String strM3525;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        h hVarM3577 = C0016.m3577(C0032.m5769(C0053.m8407(), C0063.m9534()));
        Iterator itM7807 = C0047.m7807(C0030.m5333(hVarM3577, C0065.m9775(m470(), 582, 29, 1431)));
        while (true) {
            boolean zM2962 = C0012.m2962(itM7807);
            strM3525 = C0016.m3525(m470(), 611, 4, 795);
            if (!zM2962) {
                break;
            }
            m mVar = (m) C0048.m7949(itM7807);
            C0004.m1532(arrayList2, new b(C0015.m3446(C0010.m2339(mVar, strM3525), C0062.m9389(m470(), 615, 5, 2001), C0007.m1840()), C0064.m9669(mVar), null));
        }
        Iterator itM78072 = C0047.m7807(C0030.m5333(hVarM3577, C0031.m5565(m470(), 620, 30, 549)));
        while (C0012.m2962(itM78072)) {
            m mVar2 = (m) C0048.m7949(itM78072);
            String strM2339 = C0010.m2339(mVar2, C0027.m5062(m470(), 650, 13, 1392));
            String strM23392 = C0010.m2339(mVar2, strM3525);
            String strM23393 = C0010.m2339(mVar2, C0028.m5109(m470(), 663, 5, 2457));
            if (!C0043.m7277(strM2339, C0044.m7509(m470(), 668, 4, 2122))) {
                strM2339 = C0028.m5188(new StringBuilder(), C0053.m8407(), strM2339);
            }
            C0032.m5685(C0024.m4752(strM23392, C0053.m8477(m470(), 672, 1, 396))[2], strM23393, strM2339, arrayList);
        }
        return C0025.m4831(arrayList2, arrayList);
    }

    @Override // com.github.catvod.spider.Cloud
    public void init(Context context, String str) {
        JsonElement jsonElementM469 = m469(str);
        super.init(context, str);
        Iterator itM7807 = C0047.m7807(C0030.m5333(C0016.m3577(C0032.m5769(m474(m472(m471(jsonElementM469), C0062.m9389(m470(), 673, 4, 2838))), null)), C0022.m4403(m470(), 677, 2, 2299)));
        while (true) {
            if (!C0012.m2962(itM7807)) {
                break;
            }
            m mVar = (m) C0048.m7949(itM7807);
            if (C0058.m9127(C0064.m9669(mVar), C0037.m6307(m470(), 679, 2, 2205))) {
                g = C0010.m2339(mVar, C0026.m4951(m470(), 681, 4, 2074));
                break;
            }
        }
        StringBuilder sb = new StringBuilder(C0010.m2300(m470(), 685, 17, 905));
        C0018.m3933(sb, C0053.m8407());
        m473(C0047.m7763(sb));
    }

    @Override // com.github.catvod.spider.Cloud
    public String playerContent(String str, String str2, List<String> list) {
        if (C0058.m9127(str, C0000.m1077(m470(), 702, 5, 2372))) {
            return super.playerContent(str, str2, list);
        }
        String strM8125 = C0050.m8125(C0050.m8125(C0053.m8407(), C0024.m4740(m470(), 707, 6, 959)), str2);
        Matcher matcherM6026 = C0034.m6026(C0005.m1602(C0048.m7902(m470(), 713, 26, 535)), C0000.m1081(C0016.m3577(C0032.m5769(strM8125, null))));
        boolean zM1405 = C0003.m1405(matcherM6026);
        String strM1840 = C0007.m1840();
        JSONObject jSONObject = new JSONObject(zM1405 ? C0021.m4306(matcherM6026, 1) : strM1840);
        String strM1212 = C0001.m1212(jSONObject, C0048.m7902(m470(), 739, 3, 1233));
        String strM12122 = C0001.m1212(jSONObject, C0034.m6001(m470(), 742, 4, 2517));
        String strM12123 = C0001.m1212(jSONObject, C0010.m2300(m470(), 746, 9, 556));
        String strM12124 = C0001.m1212(jSONObject, C0063.m9585(m470(), 755, 2, 773));
        String strM12125 = C0001.m1212(jSONObject, C0012.m2973(m470(), 757, 3, 818));
        StringBuilder sb = new StringBuilder();
        C0018.m3933(sb, C0053.m8407());
        C0018.m3933(sb, C0004.m1549(m470(), 760, 15, 881));
        C0018.m3933(sb, strM12122);
        C0018.m3933(sb, C0024.m4740(m470(), 775, 3, 845));
        Matcher matcherM60262 = C0034.m6026(C0005.m1602(C0057.m8978(m470(), 778, 12, 2925)), C0032.m5769(C0047.m7763(sb), null));
        String strM4306 = C0003.m1405(matcherM60262) ? C0021.m4306(matcherM60262, 1) : strM1840;
        StringBuilder sb2 = new StringBuilder();
        C0018.m3933(sb2, strM4306);
        C0018.m3933(sb2, strM1212);
        C0018.m3933(sb2, C0020.m4199(m470(), 790, 6, 3030));
        C0018.m3933(sb2, strM12123);
        C0018.m3933(sb2, C0019.m4107(m470(), 796, 4, 2219));
        String strM6434 = C0038.m6434(sb2, strM12124, C0057.m8978(m470(), 800, 5, 1446), strM12125);
        boolean zM7277 = C0043.m7277(strM6434, C0057.m8978(m470(), 805, 4, 2246));
        String strM8574 = C0054.m8574(m470(), 809, 4, 1223);
        if (!zM7277) {
            StringBuilder sb3 = new StringBuilder();
            C0018.m3933(sb3, C0015.m3446(C0053.m8407(), strM8574, strM1840));
            C0018.m3933(sb3, strM6434);
            strM6434 = C0047.m7763(sb3);
        }
        String strM3446 = C0015.m3446(strM8125, strM8574, strM1840);
        HashMap map = new HashMap();
        C0053.m8424(map, C0062.m9389(m470(), 813, 10, 2090), C0026.m4951(m470(), 823, 187, 2481));
        C0053.m8424(map, C0044.m7509(m470(), 1010, 7, 2375), strM3446);
        String strM9032 = C0057.m9032(C0032.m5769(strM6434, map), C0045.m7657(m470(), 1017, 3, 898));
        g gVar = new g();
        C0017.m3667(gVar, strM9032);
        C0057.m9029(gVar, C0063.m9534());
        return C0033.m5828(gVar);
    }

    public String searchContent(String str, boolean z) {
        ArrayList arrayList = new ArrayList();
        Iterator itM7807 = C0047.m7807(C0030.m5333(C0016.m3577(C0032.m5769(C0050.m8125(C0050.m8125(C0053.m8407(), C0014.m3332(m470(), 1020, 30, 1374)), C0056.m8909(str)), C0063.m9534())), C0017.m3646(m470(), 1050, 30, 571)));
        while (C0012.m2962(itM7807)) {
            m mVar = (m) C0048.m7949(itM7807);
            String strM2339 = C0010.m2339(mVar, C0055.m8814(m470(), 1080, 13, 2283));
            String strM23392 = C0010.m2339(mVar, C0064.m9599(m470(), 1093, 4, 732));
            String strM23393 = C0010.m2339(mVar, C0032.m5708(m470(), 1097, 5, 937));
            if (!C0043.m7277(strM2339, C0004.m1549(m470(), 1102, 4, 3198))) {
                strM2339 = C0028.m5188(new StringBuilder(), C0053.m8407(), strM2339);
            }
            C0032.m5685(C0024.m4752(strM23392, C0015.m3484(m470(), 1106, 1, 922))[2], strM23393, strM2339, arrayList);
        }
        return C0047.m7783(arrayList);
    }
}