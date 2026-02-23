package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.E.b;
import com.github.catvod.spider.merge.E.g;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.P0.C0024;
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
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.c1.C0046;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.d1.C0049;
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
import com.github.catvod.spider.merge.t.C0061;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.github.catvod.spider.p000mergexbpq.c0.C0010;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import com.github.catvod.spider.p000mergexbpq.r.C0014;
import com.github.catvod.spider.p000mergexbpq.x.C0015;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class HBfling extends Spider {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f40short = {2650, 2684, 2666, 2685, 2594, 2638, 2664, 2666, 2657, 2683, 1193, 1194, 1186, 1197, 1203, 1194, 1186, 1197, 1262, 1186, 1197, 1191, 1201, 1196, 1194, 1191, 1260, 1264, 1269, 1267, 2833, 2827, 2842, 2830, 2831, 2835, 765, 694, 690, 693, 747, 755, 691, 751, 706, 694, 736, 752, 766, 744, 764, 748, 693, 707, 727, 701, 705, 710, 700, 746, 742, 720, 764, 714, 745, 741, 719, 683, 725, 725, 717, 709, 750, 743, 752, 744, 719, 749, 705, 754, 1442, 1470, 1470, 1466, 1465, 1520, 1509, 1509, 1469, 1469, 1469, 1508, 1451, 1451, 1452, 1471, 1444, 1508, 1449, 1449, 1509, 1468, 1445, 1454, 1465, 1442, 1445, 1469, 1509, 1443, 1454, 1509, 953, 998, 1015, 1009, 1011, 953, 991, 921, 901, 924, 925, 736, 743, 744, 737, 753, 739, 744, 685, 685, 685, 1494, 1433, 1503, 1499, 1434, 1502, 1475, 1490, 1498, 1434, 1475, 1503, 1474, 1498, 1493, 1433, 1503, 1499, 1434, 1499, 1494, 1485, 1486, 3270, 3291, 3270, 3294, 3287, 3069, 3047, 3056, 3059, 2748, 2745, 2732, 2745, 2805, 2743, 2730, 2737, 2751, 2737, 2742, 2745, 2740, 1525, 1513, 1513, 1517, 1518, 1447, 1458, 1458, 1514, 1514, 1514, 1459, 1532, 1532, 1531, 1512, 1523, 1459, 1534, 1534, 2926, 2868, 2856, 2926, 2922, 2859, 2914, 2917, 2859, 2930, 2927, 2930, 2922, 2915, 1452, 1455, 1470, 1457, 1521, 1463, 1459, 1522, 1462, 1451, 1466, 1458, 1522, 1451, 1463, 1450, 1458, 1469, 1521, 1463, 1459, 1522, 1459, 1470, 1445, 1446, 1349, 1344, 1365, 1344, 1292, 1358, 1363, 1352, 1350, 1352, 1359, 1344, 1357, 1294, 1345, 1287, 1283, 1346, 1307, 1294, 1293, 1308, 1346, 1293, 1307, 1281, 1345, 1287, 1283, 1346, 1308, 1283, 1286, 1291, 1290, 1346, 1308, 1304, 1286, 1311, 1290, 1309, 949, 940, 1006, 936, 940, 1005, 944, 940, 929, 953, 947, 1005, 940, 937, 947, 948, 1006, 936, 940, 1005, 947, 943, 946, 948, 1005, 940, 937, 947, 948, 1006, 931, 940, 933, 929, 946, 934, 937, 952, 466, 466, 466, 2596, 1477, 1497, 1497, 1501, 1502, 1431, 1410, 1410, 1498, 1498, 1498, 1411, 1484, 1484, 1483, 1496, 1475, 1411, 1486, 1486, 3147, 3153, 3142, 3141, 1308, 1524, 1467, 1533, 1529, 1464, 1521, 1524, 1505, 1524, 1464, 1528, 1520, 1531, 1504, 1467, 1533, 1529, 1464, 1523, 1504, 1529, 1529, 1464, 1530, 1509, 1461, 1451, 1461, 1510, 1509, 1524, 1531, 2538, 2530, 1614, 1656, 1656, 1656, 1656, 1640, 878, 797, 797, 797, 797, 781, 1007, 996, 996, 996, 996, 1012, 25293, 29207, 31202, 24303, 22919, 23770, 1771, 2024, 1971, 1976, 2026, 1971, 1974, 1977, 1978, 1954, 2033, 1981, 1954, 1978, 1982, 1977, 1968, 2026, 542, 594, 593, 587, 592, 589, 517, 656, 652, 652, 648, 651, 706, 727, 727, 655, 655, 655, 726, 665, 665, 670, 653, 662, 726, 667, 667, 727, 670, 669, 662, 671, 725, 651, 726, 656, 652, 661, 660, 711, 655, 668, 709, 2651, 2574, 2568, 2591, 2576, 2580, 2569, 2624, 1796, 1867, 1805, 1801, 1864, 1804, 1809, 1792, 1800, 1864, 1809, 1805, 1808, 1800, 1799, 1867, 1805, 1801, 1864, 1801, 1796, 1823, 1820, 2468, 2489, 2468, 2492, 2485, 3042, 3064, 3055, 3052, 1827, 1830, 1843, 1830, 1898, 1832, 1845, 1838, 1824, 1838, 1833, 1830, 1835, 1656, 1659, 1642, 1637, 1573, 1635, 1639, 1574, 1639, 1640, 1574, 1594, 1573, 1657, 1646, 1638, 1642, 1657, 1632, 1656, 1237, 1225, 1225, 1229, 1230, 1159, 1170, 1170, 1226, 1226, 1226, 1171, 1244, 1244, 1243, 1224, 1235, 1171, 1246, 1246, 582};
    public String a;

    public static HashMap a() {
        return C0019.m4127(C0030.m5362(m243(), 0, 10, 2575), C0046.m7718(m243(), 10, 20, 1219), C0050.m8131(m243(), 30, 6, 2907), C0002.m1305(m243(), 36, 44, 644));
    }

    /* renamed from: ۣۨۨۢ, reason: not valid java name and contains not printable characters */
    public static short[] m243() {
        if (C0013.m3167() >= 0) {
            return f40short;
        }
        return null;
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        ArrayList arrayList = new ArrayList();
        String strM9145 = C0058.m9145(C0015.m3484(m243(), 80, 32, 1482), str, C0031.m5565(m243(), 112, 6, 918), str2, C0050.m8131(m243(), 118, 5, 1009));
        PrintStream printStreamM6087 = C0035.m6087();
        StringBuilder sb = new StringBuilder(C0034.m6001(m243(), 123, 10, 646));
        C0018.m3933(sb, strM9145);
        C0012.m2969(printStreamM6087, C0047.m7763(sb));
        Iterator itM7807 = C0047.m7807(C0030.m5333(C0016.m3577(C0032.m5769(strM9145, C0013.m3097())), C0000.m1077(m243(), 133, 23, 1463)));
        while (C0012.m2962(itM7807)) {
            m mVar = (m) C0048.m7949(itM7807);
            String strM2339 = C0010.m2339(mVar, C0062.m9389(m243(), 156, 5, 3250));
            String strM23392 = C0010.m2339(mVar, C0031.m5565(m243(), 161, 4, 2965));
            C0032.m5685(C0026.m4915(C0036.m6188(m243(), 178, 20, 1437), strM23392), strM2339, C0010.m2339(mVar, C0017.m3646(m243(), 165, 13, 2776)), arrayList);
        }
        return C0020.m4216(C0011.m2808(C0038.m6456(str2)), C0047.m7818(1, str2), C0011.m2808(20), C0054.m8556(str2, 1, 20), arrayList);
    }

    public String detailContent(List<String> list) {
        String strM5109;
        h hVarM3577 = C0016.m3577(C0032.m5769((String) C0048.m7915(list, 0), C0013.m3097()));
        String strM4684 = C0024.m4684(C0030.m5333(hVarM3577, C0060.m9352(m243(), 198, 14, 2822)));
        String strM8058 = C0049.m8058(C0030.m5333(hVarM3577, C0011.m2805(m243(), 212, 26, 1503)), C0003.m1398(m243(), 238, 13, 1313));
        d dVarM5333 = C0030.m5333(hVarM3577, C0048.m7902(m243(), 251, 29, 1391));
        d dVarM53332 = C0030.m5333(hVarM3577, C0029.m5256(m243(), 280, 38, 960));
        PrintStream printStreamM6087 = C0035.m6087();
        StringBuilder sb = new StringBuilder();
        C0018.m3933(sb, strM4684);
        C0018.m3933(sb, strM8058);
        C0012.m2969(printStreamM6087, C0047.m7763(sb));
        StringBuilder sb2 = new StringBuilder();
        Iterator itM7807 = C0047.m7807(dVarM5333);
        while (true) {
            boolean zM2962 = C0012.m2962(itM7807);
            strM5109 = C0028.m5109(m243(), 318, 3, 502);
            if (!zM2962) {
                break;
            }
            m mVar = (m) C0048.m7949(itM7807);
            C0018.m3933(sb2, C0016.m3579());
            C0018.m3933(sb2, C0064.m9669(mVar));
            C0018.m3933(sb2, strM5109);
        }
        StringBuilder sb3 = new StringBuilder(C0007.m1840());
        Iterator itM78072 = C0047.m7807(dVarM53332);
        while (C0012.m2962(itM78072)) {
            Iterator itM78073 = C0047.m7807(C0030.m5333((m) C0048.m7949(itM78072), C0037.m6307(m243(), 321, 1, 2629)));
            while (C0012.m2962(itM78073)) {
                m mVar2 = (m) C0048.m7949(itM78073);
                String strM9669 = C0064.m9669(mVar2);
                StringBuilder sb4 = new StringBuilder(C0042.m7151(m243(), 322, 20, 1453));
                C0018.m3933(sb4, C0010.m2339(mVar2, C0002.m1305(m243(), 342, 4, 3107)));
                String strM7763 = C0047.m7763(sb4);
                C0018.m3933(sb3, strM9669);
                C0062.m9399(sb3, '$');
                C0018.m3933(sb3, strM7763);
                String strM9585 = C0063.m9585(m243(), 346, 1, 1378);
                C0018.m3933(sb3, strM9585);
                C0018.m3933(sb3, strM4684);
                C0018.m3933(sb3, strM9585);
                C0018.m3933(sb3, strM9669);
                C0062.m9399(sb3, '#');
            }
            C0018.m3933(sb3, strM5109);
        }
        String strM96692 = C0064.m9669((m) C0028.m5161(C0030.m5333(hVarM3577, C0061.m9361(m243(), 347, 32, 1429)), 1));
        String strM96693 = C0064.m9669((m) C0028.m5161(C0030.m5333(hVarM3577, C0044.m7509(m243(), 379, 2, 2447)), 0));
        com.github.catvod.spider.merge.E.m mVar3 = new com.github.catvod.spider.merge.E.m();
        C0017.m3671(mVar3, strM96692);
        StringBuilder sb5 = new StringBuilder();
        C0018.m3933(sb5, C0055.m8703());
        C0018.m3933(sb5, strM96693);
        C0027.m5000(mVar3, C0047.m7763(sb5));
        C0011.m2828(mVar3, (String) C0048.m7915(list, 0));
        C0026.m4947(mVar3, strM8058);
        C0005.m1628(mVar3, strM4684);
        C0054.m8596(mVar3, C0000.m1096(sb2));
        C0044.m7449(mVar3, C0000.m1096(sb3));
        return C0053.m8428(mVar3);
    }

    public String homeContent(boolean z) {
        ArrayList arrayList = new ArrayList();
        List listM1203 = C0001.m1203(new String[]{C0032.m5708(m243(), 381, 6, 1595), C0011.m2805(m243(), 387, 6, 862), C0063.m9585(m243(), 393, 6, 935)});
        List listM12032 = C0001.m1203(new String[]{C0052.m8337(m243(), 399, 2, 1917), C0064.m9599(m243(), 401, 2, 3208), C0014.m3332(m243(), 403, 2, 3040)});
        for (int i = 0; i < C0064.m9636(listM1203); i++) {
            C0004.m1532(arrayList, new b((String) C0048.m7915(listM1203, i), (String) C0048.m7915(listM12032, i), null));
        }
        return C0003.m1448(C0010.m2328(this), null, arrayList);
    }

    public void init(Context context, String str) {
        C0051.m8194(C0035.m6110());
        if (str != null) {
            this.a = str;
        }
    }

    public String playerContent(String str, String str2, List<String> list) {
        C0036.m6219();
        String[] strArrM4752 = C0024.m4752(str2, C0063.m9585(m243(), 405, 1, 1685));
        String str3 = null;
        String str4 = (strArrM4752.length <= 0 || C0057.m8953(strArrM4752[0])) ? null : strArrM4752[0];
        String str5 = (strArrM4752.length <= 1 || C0057.m8953(strArrM4752[1])) ? null : strArrM4752[1];
        if (strArrM4752.length > 2 && !C0057.m8953(strArrM4752[2])) {
            str3 = strArrM4752[2];
        }
        StringBuilder sb = new StringBuilder();
        C0018.m3933(sb, C0051.m8217());
        C0018.m3933(sb, C0020.m4199(m243(), 406, 17, 2007));
        C0018.m3933(sb, str5);
        C0018.m3933(sb, C0008.m1970(m243(), 423, 7, 568));
        C0018.m3933(sb, str3);
        String strM7763 = C0047.m7763(sb);
        g gVarM9311 = C0060.m9311(1, str4);
        C0057.m9029(gVarM9311, C0013.m3097());
        C0002.m1282(gVarM9311, strM7763);
        return C0033.m5828(gVarM9311);
    }

    public String searchContent(String str, String str2, boolean z) {
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder(C0053.m8477(m243(), 430, 36, 760));
        C0018.m3933(sb, C0056.m8909(str));
        C0018.m3933(sb, C0027.m5062(m243(), 466, 8, 2685));
        C0018.m3933(sb, str2);
        Iterator itM7807 = C0047.m7807(C0030.m5333(C0016.m3577(C0032.m5769(C0047.m7763(sb), C0013.m3097())), C0011.m2805(m243(), 474, 23, 1893)));
        while (C0012.m2962(itM7807)) {
            m mVar = (m) C0048.m7949(itM7807);
            String strM2339 = C0010.m2339(mVar, C0028.m5109(m243(), 497, 5, 2512));
            String strM23392 = C0010.m2339(mVar, C0034.m6001(m243(), 502, 4, 2954));
            C0055.m8732(C0026.m4915(C0035.m6131(m243(), 539, 20, 1213), strM23392), strM2339, C0010.m2339(mVar, C0015.m3484(m243(), 506, 13, 1863)), C0055.m8697(C0036.m6243(mVar, C0052.m8337(m243(), 519, 20, 1547))), arrayList);
        }
        return C0047.m7783(arrayList);
    }

    public String searchContent(String str, boolean z) {
        return C0012.m2979(this, C0056.m8909(str), C0007.m1842(m243(), 559, 1, 631), true);
    }
}