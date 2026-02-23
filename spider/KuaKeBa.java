package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.E.b;
import com.github.catvod.spider.merge.E.g;
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
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.T0.h;
import com.github.catvod.spider.merge.T0.m;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.d1.C0050;
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
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.a0.C0006;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.c0.C0010;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.r.C0014;
import com.github.catvod.spider.p000mergexbpq.x.C0015;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public class KuaKeBa extends Cloud {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f80short = {625, 560, 547, 549, 568, 562, 573, 564, 639, 564, 553, 562, 564, 547, 545, 549, 778, 843, 1947, 1921, 1942, 1941, 2406, 2351, 2347, 2337, 3233, 3236, 3249, 3236, 3304, 3254, 3255, 3238, 1250, 1278, 1278, 1274, 1408, 1436, 1436, 1432, 1435, 1490, 1479, 1479, 1439, 1439, 1439, 1478, 1411, 1437, 1417, 1411, 1421, 1418, 1417, 1478, 1436, 1415, 1432, 2549, 2493, 2480, 2484, 2481, 2480, 2471, 2549, 2539, 2549, 2493, 2535, 2549, 2539, 2549, 2484, 2297, 2281, 2213, 2283, 2046, 2018, 2018, 2022, 2021, 1964, 1977, 1977, 2017, 2017, 2017, 1976, 2045, 2019, 2039, 2045, 2035, 2036, 2039, 1976, 2018, 2041, 2022, 1977, 2031, 2019, 2040, 2022, 2039, 2040, 773, 803, 821, 802, 893, 785, 823, 821, 830, 804, 1400, 1370, 1359, 1372, 1369, 1369, 1364, 1306, 1280, 1307, 1285, 1301, 1309, 1378, 1372, 1371, 1361, 1370, 1346, 1350, 1301, 1403, 1377, 1301, 1284, 1285, 1307, 1285, 1294, 1301, 1378, 1372, 1371, 1283, 1281, 1294, 1301, 1357, 1283, 1281, 1308, 1301, 1396, 1349, 1349, 1369, 1360, 1378, 1360, 1367, 1406, 1372, 1345, 1306, 1280, 1286, 1282, 1307, 1286, 1283, 1301, 1309, 1406, 1405, 1377, 1400, 1401, 1305, 1301, 1369, 1372, 1374, 1360, 1301, 1394, 1360, 1366, 1374, 1370, 1308, 1301, 1398, 1373, 1351, 1370, 1368, 1360, 1306, 1284, 1287, 1287, 1307, 1285, 1307, 1285, 1307, 1285, 1301, 1382, 1364, 1363, 1364, 1351, 1372, 1306, 1280, 1286, 1282, 1307, 1286, 1283, 2821, 2825, 2825, 2829, 2831, 2819, 2232, 2222, 2238, 2178, 2222, 2232, 2236, 2223, 2238, 2229, 2178, 2238, 2236, 2221, 2217, 2238, 2229, 2236, 2272, 2284, 2278, 2301, 2223, 2232, 2222, 2216, 2225, 2217, 2272, 2281, 2286, 322, 285, 268, 266, 264, 322, 1662, 1624, 1614, 1625, 1542, 1642, 1612, 1614, 1605, 1631, 694, 660, 641, 658, 663, 663, 666, 724, 718, 725, 715, 731, 723, 684, 658, 661, 671, 660, 652, 648, 731, 693, 687, 731, 714, 715, 725, 715, 704, 731, 684, 658, 661, 717, 719, 704, 731, 643, 717, 719, 722, 731, 698, 651, 651, 663, 670, 684, 670, 665, 688, 658, 655, 724, 718, 712, 716, 725, 712, 717, 731, 723, 688, 691, 687, 694, 695, 727, 731, 663, 658, 656, 670, 731, 700, 670, 664, 656, 660, 722, 731, 696, 659, 649, 660, 662, 670, 724, 714, 713, 713, 725, 715, 725, 715, 725, 715, 731, 680, 666, 669, 666, 649, 658, 724, 718, 712, 716, 725, 712, 717, 1895, 1857, 1879, 1856, 1823, 1907, 1877, 1879, 1884, 1862, 1212, 1182, 1163, 1176, 1181, 1181, 1168, 1246, 1220, 1247, 1217, 1233, 1241, 1190, 1176, 1183, 1173, 1182, 1158, 1154, 1233, 1215, 1189, 1233, 1216, 1217, 1247, 1217, 1226, 1233, 1190, 1176, 1183, 1223, 1221, 1226, 1233, 1161, 1223, 1221, 1240, 1233, 1200, 1153, 1153, 1181, 1172, 1190, 1172, 1171, 1210, 1176, 1157, 1246, 1220, 1218, 1222, 1247, 1218, 1223, 1233, 1241, 1210, 1209, 1189, 1212, 1213, 1245, 1233, 1181, 1176, 1178, 1172, 1233, 1206, 1172, 1170, 1178, 1182, 1240, 1233, 1202, 1177, 1155, 1182, 1180, 1172, 1246, 1216, 1219, 1219, 1247, 1217, 1247, 1217, 1247, 1217, 1233, 1186, 1168, 1175, 1168, 1155, 1176, 1246, 1220, 1218, 1222, 1247, 1218, 1223, 1214, 1270, 1199, 1200, 1279, 1260, 1258, 1271, 1277, 1266, 1275, 1203, 1258, 1271, 1258, 1266, 1275, 1214, 1184, 1214, 1279, 1547, 1547, 1602, 1606, 1612, 1591, 1590, 1575, 20575, 25783, 2969, 2955, 2957, 2953, 2972, 2954, 2975, 3009, 3025, 23307, 24321, 3073, 3091, 3093, 3089, 3076, 3090, 3079, 3161, 3145, 17436, 25907, 2589, 2575, 2569, 2573, 2584, 2574, 2587, 2629, 2645, 17649, 27867, 28446, 28132, 2753, 2771, 2773, 2769, 2756, 2770, 2759, 2713, 2697, 1431, 1475, 1433, 1429, 22476, 25966, 32299, 19296, 1431, 1412, 1475, 1433, 1429, 1441, 1411, 1413, 1409, 1428, 1410, 1431, 1412, 1499, 1429, 3235, 3311, 3233, 3194, 3177, 3183, 3186, 3192, 3191, 3198, 3125, 3194, 3177, 3183, 3186, 3192, 3191, 3198, 3126, 3192, 3188, 3189, 3183, 3198, 3189, 3183, 3131, 3179, 3131, 3194, 2442, 2448, 2439, 2436, 1390, 1326, 1330, 1330, 1334, 1333, 1404, 1306, 1385, 1306, 1385, 1334, 1319, 1320, 1306, 1384, 1335, 1331, 1319, 1332, 1325, 1306, 1384, 1317, 1320, 1306, 1385, 1333, 1306, 1385, 1309, 1304, 1380, 1307, 1389, 1391, 3326, 3307, 3309, 534, 1940, 1970, 1956, 1971, 2028, 1920, 1958, 1956, 1967, 1973, 2368, 2402, 2423, 2404, 2401, 2401, 2412, 2338, 2360, 2339, 2365, 2349, 2341, 2394, 2404, 2403, 2409, 2402, 2426, 2430, 2349, 2371, 2393, 2349, 2364, 2365, 2339, 2365, 2358, 2349, 2394, 2404, 2403, 2363, 2361, 2358, 2349, 2421, 2363, 2361, 2340, 2349, 2380, 2429, 2429, 2401, 2408, 2394, 2408, 2415, 2374, 2404, 2425, 2338, 2360, 2366, 2362, 2339, 2366, 2363, 2349, 2341, 2374, 2373, 2393, 2368, 2369, 2337, 2349, 2401, 2404, 2406, 2408, 2349, 2378, 2408, 2414, 2406, 2402, 2340, 2349, 2382, 2405, 2431, 2402, 2400, 2408, 2338, 2364, 2367, 2367, 2339, 2365, 2339, 2365, 2339, 2365, 2349, 2398, 2412, 2411, 2412, 2431, 2404, 2338, 2360, 2366, 2362, 2339, 2366, 2363, 2928, 2924, 2924, 2920, 2923, 2850, 2871, 2871, 2927, 2927, 2927, 2870, 2931, 2925, 2937, 2931, 2941, 2938, 2937, 2870, 2924, 2935, 2920, 2871, 2913, 2925, 2934, 2920, 2937, 2934, 2971, 3039, 3026, 3021, 2965, 3032, 3034, 3023, 3031, 3038, 3034, 3039, 3038, 3017, 2971, 2949, 2971, 3022, 3031, 2971, 2949, 2971, 3031, 3026, 2971, 2949, 2971, 3034, 1209, 1187, 1204, 1207};

    public static String a(String str, Pattern pattern) {
        Matcher matcherM6026 = C0034.m6026(pattern, str);
        return C0003.m1405(matcherM6026) ? C0064.m9640(C0021.m4306(matcherM6026, 1)) : C0007.m1840();
    }

    public static ArrayList b(h hVar) {
        ArrayList arrayList = new ArrayList();
        Iterator itM7807 = C0047.m7807(C0030.m5333(hVar, C0033.m5852(m462(), 0, 16, 593)));
        while (C0012.m2962(itM7807)) {
            m mVar = (m) C0048.m7949(itM7807);
            String strM2339 = C0010.m2339(C0036.m6243(mVar, C0039.m6551(m462(), 16, 2, 810)), C0064.m9599(m462(), 18, 4, 2035));
            String strM23392 = C0010.m2339(C0036.m6243(mVar, C0015.m3484(m462(), 22, 4, 2374)), C0032.m5708(m462(), 26, 8, 3269));
            if (!C0043.m7277(strM23392, C0023.m4536(m462(), 34, 4, 1162))) {
                strM23392 = C0050.m8125(C0004.m1549(m462(), 38, 23, 1512), strM23392);
            }
            C0055.m8732(strM2339, C0064.m9669(C0036.m6243(mVar, C0002.m1305(m462(), 61, 16, 2517))), strM23392, C0007.m1840(), arrayList);
        }
        return arrayList;
    }

    public static String c(String str) {
        String strM8909 = C0056.m8909(str);
        StringBuilder sb = new StringBuilder(C0019.m4107(m462(), 77, 4, 2262));
        C0018.m3933(sb, strM8909);
        String strM8125 = C0050.m8125(C0024.m4740(m462(), 81, 30, 1942), C0047.m7763(sb));
        HashMap map = new HashMap();
        C0053.m8424(map, C0011.m2805(m462(), 111, 10, 848), C0053.m8477(m462(), 121, 111, 1333));
        C0053.m8424(map, C0004.m1549(m462(), 232, 6, 2918), C0015.m3484(m462(), 238, 31, 2269));
        return C0047.m7783(C0012.m3023(C0016.m3577(C0032.m5769(strM8125, map))));
    }

    /* renamed from: ۧۥۣ۠, reason: not valid java name and contains not printable characters */
    public static short[] m462() {
        if (C0044.m7508() <= 0) {
            return f80short;
        }
        return null;
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        String strM5172 = C0028.m5172(str, C0058.m9106(m462(), 269, 6, 365), str2);
        HashMap map2 = new HashMap();
        C0053.m8424(map2, C0047.m7833(m462(), 275, 10, 1579), C0062.m9389(m462(), 285, 111, 763));
        ArrayList arrayListM3023 = C0012.m3023(C0016.m3577(C0032.m5769(strM5172, map2)));
        int iM6456 = (C0038.m6456(str2) + 1) * 20;
        g gVar = new g();
        C0045.m7632(gVar, arrayListM3023);
        C0049.m7974(gVar, C0038.m6456(str2), C0038.m6456(str2) + 1, 20, iM6456);
        return C0033.m5828(gVar);
    }

    @Override // com.github.catvod.spider.Cloud
    public String detailContent(List<String> list) {
        String str = (String) C0048.m7915(list, 0);
        HashMap map = new HashMap();
        C0053.m8424(map, C0006.m1774(m462(), 396, 10, 1842), C0007.m1842(m462(), 406, 111, 1265));
        h hVarM3577 = C0016.m3577(C0032.m5769(str, map));
        com.github.catvod.spider.merge.E.m mVar = new com.github.catvod.spider.merge.E.m();
        C0011.m2828(mVar, str);
        C0005.m1628(mVar, C0064.m9669(C0036.m6243(hVarM3577, C0014.m3332(m462(), 517, 21, 1182))));
        C0026.m4947(mVar, C0010.m2339(C0036.m6243(hVarM3577, C0004.m1549(m462(), 538, 5, 1579)), C0064.m9599(m462(), 543, 3, 1604)));
        C0017.m3671(mVar, C0047.m7804(C0000.m1081(hVarM3577), C0005.m1602(C0002.m1305(m462(), 546, 11, 2979))));
        C0058.m9159(mVar, C0047.m7804(C0000.m1081(hVarM3577), C0005.m1602(C0023.m4536(m462(), 557, 11, 3131))));
        C0058.m9152(mVar, C0047.m7804(C0000.m1081(hVarM3577), C0005.m1602(C0031.m5565(m462(), 568, 11, 2599))));
        C0022.m4432(mVar, C0047.m7804(C0000.m1081(hVarM3577), C0005.m1602(C0039.m6551(m462(), 579, 13, 2811))));
        String strM1840 = C0007.m1840();
        C0019.m4073(mVar, strM1840);
        C0027.m5000(mVar, C0015.m3446(C0047.m7804(C0000.m1081(hVarM3577), C0005.m1602(C0020.m4199(m462(), 592, 23, 1451))), C0001.m1189(m462(), 615, 3, 3231), strM1840));
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator itM7807 = C0047.m7807(C0030.m5333(hVarM3577, C0060.m9352(m462(), 618, 27, 3099)));
        while (C0012.m2962(itM7807)) {
            m mVar2 = (m) C0048.m7949(itM7807);
            String strM1305 = C0002.m1305(m462(), 645, 4, 2530);
            if (C0064.m9686(C0010.m2339(mVar2, strM1305), C0019.m4107(m462(), 649, 36, 1350))) {
                C0004.m1532(arrayList, C0064.m9640(C0010.m2339(mVar2, strM1305)));
            } else if (C0058.m9127(C0010.m2339(mVar2, strM1305), C0036.m6188(m462(), 685, 3, 3210))) {
                C0004.m1532(arrayList2, C0010.m2339(mVar2, strM1305));
            }
        }
        StringBuilder sb = new StringBuilder();
        Iterator itM7816 = C0047.m7816(arrayList2);
        if (C0012.m2962(itM7816)) {
            while (true) {
                C0056.m8896(sb, (CharSequence) C0048.m7949(itM7816));
                if (!C0012.m2962(itM7816)) {
                    break;
                }
                C0056.m8896(sb, C0057.m8978(m462(), 688, 1, 570));
            }
        }
        C0058.m9085(mVar, C0047.m7763(sb));
        C0044.m7449(mVar, C0014.m3356(this, arrayList));
        C0054.m8596(mVar, C0030.m5351(this));
        return C0053.m8428(mVar);
    }

    public String homeContent(boolean z) {
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        C0053.m8424(map, C0053.m8477(m462(), 689, 10, 1985), C0061.m9361(m462(), 699, 111, 2317));
        h hVarM3577 = C0016.m3577(C0032.m5769(C0058.m9106(m462(), 810, 30, 2840), map));
        Iterator itM7807 = C0047.m7807(C0030.m5333(hVarM3577, C0041.m6779(m462(), 840, 28, 3003)));
        while (C0012.m2962(itM7807)) {
            m mVar = (m) C0048.m7949(itM7807);
            C0004.m1532(arrayList, new b(C0010.m2339(mVar, C0003.m1398(m462(), 868, 4, 1233)), C0064.m9669(mVar), null));
        }
        return C0025.m4831(arrayList, C0012.m3023(hVarM3577));
    }

    @Override // com.github.catvod.spider.Cloud
    public void init(Context context, String str) {
        super.init(context, str);
    }

    public String searchContent(String str, boolean z) {
        return C0053.m8432(str);
    }

    public String searchContent(String str, boolean z, String str2) {
        return C0053.m8432(str);
    }
}