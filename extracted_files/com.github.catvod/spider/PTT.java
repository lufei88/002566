package com.github.catvod.spider;

import android.content.Context;
import android.net.Uri;
import com.github.catvod.crawler.Spider;
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
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.merge.c1.C0046;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.merge.f0.C0052;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.g0.AbstractC0308c;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.r0.C0060;
import com.github.catvod.spider.merge.t.C0061;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.merge.z.C0065;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.c0.C0010;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import com.github.catvod.spider.p000mergexbpq.r.C0014;
import com.github.catvod.spider.p000mergexbpq.x.C0015;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import com.google.gson.JsonElement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public class PTT extends Spider {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f96short = {545, 573, 573, 569, 570, 627, 614, 614, 569, 573, 573, 615, 571, 556, 557, 614, 682, 652, 666, 653, 722, 702, 664, 666, 657, 651, 927, 957, 936, 955, 958, 958, 947, 1021, 999, 1020, 994, 1010, 1018, 901, 955, 956, 950, 957, 933, 929, 1010, 924, 902, 1010, 995, 994, 1020, 994, 1001, 1010, 901, 955, 956, 996, 998, 1001, 1010, 938, 996, 998, 1019, 1010, 915, 930, 930, 958, 951, 901, 951, 944, 921, 955, 934, 1021, 999, 993, 997, 1020, 993, 996, 1010, 1018, 921, 922, 902, 927, 926, 1022, 1010, 958, 955, 953, 951, 1010, 917, 951, 945, 953, 957, 1019, 1010, 913, 954, 928, 957, 959, 951, 1021, 995, 992, 992, 1020, 994, 1020, 994, 1020, 994, 1010, 897, 947, 948, 947, 928, 955, 1021, 999, 993, 997, 1020, 993, 996, 1579, 1545, 1545, 1551, 1562, 1566, 1607, 1574, 1547, 1540, 1549, 1567, 1547, 1549, 1551, 2460, 2446, 2507, 2482, 2481, 2506, 2460, 2446, 2525, 2455, 2523, 2518, 2504, 2527, 2506, 2435, 2440, 2507, 2483, 2485, 2525, 2455, 2523, 2518, 2504, 2526, 2506, 2435, 2440, 2525, 2455, 2523, 2518, 2504, 2513, 779, 852, 2962, 1312, 1388, 2209, 2226, 2213, 2209, 1379, 1392, 1383, 1379, 1373, 1387, 1382, 2453, 2441, 2445, 2462, 1158, 1178, 1159, 1153, 2985, 3000, 3006, 3004, 396, 385, 414, 454, 395, 393, 410, 396, 456, 470, 456, 396, 385, 414, 454, 397, 389, 394, 397, 396, 453, 410, 397, 411, 408, 391, 390, 411, 385, 414, 397, 1152, 2794, 2798, 2788, 1541, 1542, 1559, 1560, 1624, 1556, 1559, 1554, 1553, 1555, 1624, 1556, 1559, 1554, 1553, 1555, 1627, 1541, 1539, 1557, 1557, 1555, 1541, 1541, 658, 659, 642, 2274, 2302, 2302, 2298, 1210, 1207, 1199, 822, 812, 827, 824, 2567, 2585, 663, 654, 705, 661, 723, 706, 732, 706, 654, 651, 706, 732, 706, 643, 1465, 1443, 1460, 1463, 1293, 1950, 1923, 1950, 1926, 1935, 1811, 1822, 1793, 1879, 1865, 1879, 1814, 1881, 1796, 1810, 1798, 1881, 1813, 1816, 1797, 1811, 1810, 1797, 2167, 984, 973, 3242, 3252, 3242, 2943, 1367, 1367, 1367, 697, 700, 757, 747, 757, 692, 763, 677, 685, 760, 743, 763, 677, 685, 760, 678, 696, 760, 742, 763, 677, 684, 760, 743, 763, 699, 692, 675, 760, 697, 700, 699, 702, 781, 791, 768, 771, 2101, 2154, 2101, 2576, 2582, 767, 755, 754, 744, 761, 754, 744, 713, 750, 752, 702, 678, 702, 692, 690, 694, 675, 693, 702, 2920, 2835, 1439, 1473, 829, 882, 867, 869, 871, 831, 1743, 1730, 1757, 1669, 1736, 1738, 1753, 1743, 1675, 1685, 1675, 1743, 1730, 1757, 1669, 1742, 1734, 1737, 1742, 1743, 1670, 1753, 1742, 1752, 1755, 1732, 1733, 1752, 1730, 1757, 1742, 1397, 649, 653, 647, 866, 865, 880, 895, 831, 883, 880, 885, 886, 884, 831, 883, 880, 885, 886, 884, 828, 866, 868, 882, 882, 884, 866, 866, 1403, 1402, 1387, 976, 972, 972, 968, 605, 592, 584, 2396, 2374, 2385, 2386};
    public final String a = C0050.m8131(m522(), 0, 16, 585);
    public String b;

    public static HashMap a() {
        return C0019.m4127(C0061.m9361(m522(), 16, 10, 767), C0021.m4340(m522(), 26, 111, 978), C0035.m6131(m522(), 137, 15, 1642), C0060.m9352(m522(), 152, 35, 2534));
    }

    /* renamed from: ۣ۟۟ۢ, reason: not valid java name and contains not printable characters */
    public static short[] m522() {
        if (C0044.m7508() < 0) {
            return f96short;
        }
        return null;
    }

    /* renamed from: ۟ۥۤۤۧ, reason: not valid java name and contains not printable characters */
    public static String m523(Object obj, Object obj2) {
        if (C0008.m1975() > 0) {
            return g.n((ArrayList) obj, (JsonElement) obj2);
        }
        return null;
    }

    /* renamed from: ۣ۟۠, reason: not valid java name and contains not printable characters */
    public static JsonElement m524(Object obj) {
        if (C0028.m5152() <= 0) {
            return AbstractC0308c.g((String) obj);
        }
        return null;
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        String strM7763;
        StringBuilder sb = new StringBuilder();
        String strM4049 = C0019.m4049(this);
        C0018.m3933(sb, strM4049);
        C0018.m3933(sb, C0050.m8131(m522(), 187, 2, 891));
        C0018.m3933(sb, str);
        Uri.Builder builderM3184 = C0013.m3184(C0022.m4422(C0047.m7763(sb)));
        String strM4403 = C0022.m4403(m522(), 189, 1, 3057);
        if (!C0043.m7327((CharSequence) C0065.m9715(map, strM4403))) {
            StringBuilder sb2 = new StringBuilder(C0020.m4199(m522(), 190, 2, 1347));
            C0018.m3933(sb2, (String) C0065.m9715(map, strM4403));
            C0033.m5834(builderM3184, C0047.m7763(sb2));
        }
        String strM2300 = C0010.m2300(m522(), 192, 4, 2240);
        if (!C0043.m7327((CharSequence) C0065.m9715(map, strM2300))) {
            C0031.m5615(builderM3184, C0018.m3917(m522(), 196, 7, 1282), (String) C0065.m9715(map, strM2300));
        }
        String strM7290 = C0043.m7290(m522(), 203, 4, 2540);
        if (!C0043.m7327((CharSequence) C0065.m9715(map, strM7290))) {
            C0031.m5615(builderM3184, strM7290, (String) C0065.m9715(map, strM7290));
        }
        String strM7718 = C0046.m7718(m522(), 207, 4, 1269);
        if (!C0043.m7327((CharSequence) C0065.m9715(map, strM7718))) {
            C0031.m5615(builderM3184, strM7718, (String) C0065.m9715(map, strM7718));
        }
        C0031.m5615(builderM3184, C0054.m8574(m522(), 211, 4, 3033), str2);
        h hVarM3577 = C0016.m3577(C0032.m5769(C0005.m1611(builderM3184), C0053.m8399()));
        ArrayList arrayList = new ArrayList();
        Iterator itM7807 = C0047.m7807(C0030.m5333(hVarM3577, C0061.m9361(m522(), 215, 31, 488)));
        while (C0012.m2962(itM7807)) {
            m mVar = (m) C0048.m7949(itM7807);
            m mVar2 = (m) C0028.m5161(C0030.m5333(mVar, C0022.m4403(m522(), 246, 1, 1249)), 0);
            m mVar3 = (m) C0028.m5161(C0030.m5333(mVar2, C0049.m8007(m522(), 247, 3, 2691)), 0);
            String strM9669 = C0064.m9669((m) C0028.m5161(C0030.m5333(mVar, C0017.m3646(m522(), 250, 24, 1654)), 0));
            String strM3646 = C0017.m3646(m522(), 274, 3, 737);
            if (C0043.m7277(C0010.m2339(mVar3, strM3646), C0032.m5708(m522(), 277, 4, 2186))) {
                strM7763 = C0010.m2339(mVar3, strM3646);
            } else {
                StringBuilder sbM5621 = C0031.m5621(strM4049);
                C0018.m3933(sbM5621, C0010.m2339(mVar3, strM3646));
                strM7763 = C0047.m7763(sbM5621);
            }
            String strM2339 = C0010.m2339(mVar3, C0035.m6131(m522(), 281, 3, 1243));
            if (!C0043.m7327(strM2339)) {
                C0004.m1532(arrayList, new com.github.catvod.spider.merge.E.m(C0056.m8890(C0010.m2339(mVar2, C0055.m8814(m522(), 284, 4, 862)), 3), strM2339, strM7763, strM9669));
            }
        }
        return C0047.m7783(arrayList);
    }

    public String detailContent(List<String> list) {
        String strM4536;
        String strM6551;
        StringBuilder sb = new StringBuilder();
        C0018.m3933(sb, C0019.m4049(this));
        h hVarM3577 = C0016.m3577(C0032.m5769(C0028.m5188(sb, (String) C0048.m7915(list, 0), C0016.m3525(m522(), 288, 2, 2600)), C0053.m8399()));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList = new ArrayList();
        Iterator itM7807 = C0047.m7807(C0030.m5333(hVarM3577, C0008.m1970(m522(), 290, 14, 738)));
        while (true) {
            boolean zM2962 = C0012.m2962(itM7807);
            strM4536 = C0023.m4536(m522(), 304, 4, 1489);
            strM6551 = C0039.m6551(m522(), 308, 1, 1314);
            if (!zM2962) {
                break;
            }
            m mVar = (m) C0048.m7949(itM7807);
            C0037.m6362(linkedHashMap, C0024.m4752(C0010.m2339(mVar, strM4536), strM6551)[3], C0010.m2339(mVar, C0055.m8814(m522(), 309, 5, 2026)));
        }
        d dVarM5333 = C0030.m5333(hVarM3577, C0061.m9361(m522(), 314, 18, 1911));
        Iterator itM5199 = C0029.m5199(C0014.m3352(linkedHashMap));
        while (C0012.m2962(itM5199)) {
            String str = (String) C0048.m7949(itM5199);
            ArrayList arrayList2 = new ArrayList();
            Iterator itM78072 = C0047.m7807(dVarM5333);
            while (C0012.m2962(itM78072)) {
                m mVar2 = (m) C0048.m7949(itM78072);
                StringBuilder sb2 = new StringBuilder();
                C0018.m3933(sb2, C0064.m9669(mVar2));
                C0018.m3933(sb2, C0062.m9389(m522(), 332, 1, 2131));
                C0018.m3933(sb2, (String) C0048.m7915(list, 0));
                C0018.m3933(sb2, strM6551);
                C0018.m3933(sb2, C0024.m4752(C0010.m2339(mVar2, strM4536), strM6551)[2]);
                C0018.m3933(sb2, strM6551);
                C0018.m3933(sb2, str);
                C0004.m1532(arrayList2, C0047.m7763(sb2));
            }
            if (C0007.m1817(arrayList2)) {
                StringBuilder sb3 = new StringBuilder(C0049.m8007(m522(), 333, 2, 1001));
                C0018.m3933(sb3, (String) C0048.m7915(list, 0));
                C0018.m3933(sb3, C0064.m9599(m522(), 335, 3, 3205));
                C0018.m3933(sb3, str);
                C0004.m1532(arrayList2, C0047.m7763(sb3));
            }
            C0004.m1532(arrayList, C0036.m6194(C0050.m8131(m522(), 338, 1, 2908), arrayList2));
        }
        com.github.catvod.spider.merge.E.m mVar3 = new com.github.catvod.spider.merge.E.m();
        Collection collectionM8457 = C0053.m8457(linkedHashMap);
        String strM9599 = C0064.m9599(m522(), 339, 3, 1395);
        C0054.m8596(mVar3, C0036.m6194(strM9599, collectionM8457));
        C0044.m7449(mVar3, C0036.m6194(strM9599, arrayList));
        return C0053.m8428(mVar3);
    }

    public String homeContent(boolean z) {
        h hVarM3577 = C0016.m3577(C0032.m5769(C0019.m4049(this), C0053.m8399()));
        ArrayList arrayList = new ArrayList();
        Iterator itM7807 = C0047.m7807(C0030.m5333(hVarM3577, C0028.m5109(m522(), 342, 33, 725)));
        while (C0012.m2962(itM7807)) {
            m mVar = (m) C0048.m7949(itM7807);
            C0004.m1532(arrayList, new b(C0015.m3446(C0010.m2339(mVar, C0001.m1189(m522(), 375, 4, 869)), C0063.m9585(m522(), 379, 3, 2074), C0007.m1840()), C0064.m9669(mVar), null));
        }
        return m523(arrayList, m524(C0043.m7327(C0063.m9516(this)) ? C0023.m4536(m522(), 382, 2, 2667) : C0032.m5769(C0063.m9516(this), null)));
    }

    public void init(Context context, String str) {
        this.b = str;
    }

    public String playerContent(String str, String str2, List<String> list) {
        Pattern patternM1602 = C0005.m1602(C0036.m6188(m522(), 384, 19, 668));
        StringBuilder sb = new StringBuilder();
        C0018.m3933(sb, C0019.m4049(this));
        C0018.m3933(sb, str2);
        Matcher matcherM6026 = C0034.m6026(patternM1602, C0032.m5769(C0047.m7763(sb), null));
        boolean zM1405 = C0003.m1405(matcherM6026);
        String strM1840 = C0007.m1840();
        if (!zM1405) {
            return C0056.m8917(strM1840);
        }
        g gVar = new g();
        C0017.m3667(gVar, C0015.m3446(C0021.m4306(matcherM6026, 1), C0054.m8574(m522(), 403, 1, 2868), strM1840));
        return C0033.m5828(gVar);
    }

    public String searchContent(String str, boolean z) {
        return C0021.m4346(this, str, z, C0009.m2037(m522(), 404, 1, 2850));
    }

    public String searchContent(String str, boolean z, String str2) {
        String strM7763;
        StringBuilder sb = new StringBuilder();
        String strM4049 = C0019.m4049(this);
        C0018.m3933(sb, strM4049);
        StringBuilder sb2 = new StringBuilder(C0052.m8337(m522(), 405, 2, 1518));
        C0018.m3933(sb2, str);
        C0018.m3933(sb2, C0037.m6307(m522(), 407, 6, 770));
        C0018.m3933(sb2, str2);
        C0018.m3933(sb, C0047.m7763(sb2));
        h hVarM3577 = C0016.m3577(C0032.m5769(C0047.m7763(sb), C0053.m8399()));
        ArrayList arrayList = new ArrayList();
        Iterator itM7807 = C0047.m7807(C0030.m5333(hVarM3577, C0045.m7657(m522(), 413, 31, 1707)));
        while (C0012.m2962(itM7807)) {
            m mVar = (m) C0048.m7949(itM7807);
            m mVar2 = (m) C0028.m5161(C0030.m5333(mVar, C0033.m5852(m522(), 444, 1, 1300)), 0);
            m mVar3 = (m) C0028.m5161(C0030.m5333(mVar2, C0004.m1549(m522(), 445, 3, 736)), 0);
            String strM9669 = C0064.m9669((m) C0028.m5161(C0030.m5333(mVar, C0063.m9585(m522(), 448, 24, 785)), 0));
            String strM6131 = C0035.m6131(m522(), 472, 3, 1288);
            if (C0043.m7277(C0010.m2339(mVar3, strM6131), C0046.m7718(m522(), 475, 4, 952))) {
                strM7763 = C0010.m2339(mVar3, strM6131);
            } else {
                StringBuilder sbM5621 = C0031.m5621(strM4049);
                C0018.m3933(sbM5621, C0010.m2339(mVar3, strM6131));
                strM7763 = C0047.m7763(sbM5621);
            }
            String strM2339 = C0010.m2339(mVar3, C0010.m2300(m522(), 479, 3, 572));
            if (!C0043.m7327(strM2339)) {
                C0004.m1532(arrayList, new com.github.catvod.spider.merge.E.m(C0056.m8890(C0010.m2339(mVar2, C0008.m1970(m522(), 482, 4, 2356)), 3), strM2339, strM7763, strM9669));
            }
        }
        return C0047.m7783(arrayList);
    }
}