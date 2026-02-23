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
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.Z.C0040;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.b.C0044;
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
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.r0.C0059;
import com.github.catvod.spider.merge.r0.C0060;
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
import com.github.catvod.spider.p000mergexbpq.a0.C0006;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.github.catvod.spider.p000mergexbpq.c0.C0010;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.x.C0015;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class HBAppfox extends Spider {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f25short = {3075, 3103, 3103, 3099, 3153, 3140, 3140, 3162, 3163, 3160, 3141, 3161, 3160, 3141, 3162, 3167, 3155, 3141, 3162, 3163, 3161, 3153, 3162, 3161, 3163, 3163, 3160, 3140, 3170, 3140, 3154, 3141, 3098, 3190, 3152, 3154, 3161, 3139, 1613, 1647, 1658, 1641, 1644, 1644, 1633, 1583, 1589, 1582, 1584, 1568, 1576, 1641, 1616, 1640, 1647, 1646, 1637, 1595, 1568, 1603, 1616, 1621, 1568, 1641, 1616, 1640, 1647, 1646, 1637, 1568, 1615, 1619, 1568, 1585, 1587, 1631, 1586, 1631, 1587, 1568, 1644, 1641, 1643, 1637, 1568, 1613, 1633, 1635, 1568, 1615, 1619, 1568, 1624, 1577, 1568, 1601, 1648, 1648, 1644, 1637, 1623, 1637, 1634, 1611, 1641, 1652, 1583, 1590, 1584, 1589, 1582, 1585, 1582, 1585, 1589, 1568, 1576, 1611, 1608, 1620, 1613, 1612, 1580, 1568, 1644, 1641, 1643, 1637, 1568, 1607, 1637, 1635, 1643, 1647, 1577, 1568, 1622, 1637, 1650, 1651, 1641, 1647, 1646, 1583, 1585, 1587, 1582, 1584, 1582, 1587, 1568, 1613, 1647, 1634, 1641, 1644, 1637, 1583, 1585, 1589, 1605, 1585, 1588, 1592, 1568, 1619, 1633, 1638, 1633, 1650, 1641, 1583, 1590, 1584, 1588, 1582, 1585, 2198, 2264, 2249, 2256, 2199, 2249, 2257, 2249, 2198, 2296, 2249, 2249, 2271, 2262, 2241, 2198, 2266, 2262, 2263, 2271, 2256, 2270, 418, 423, 434, 423, 2017, 2018, 2030, 2035, 2018, 1999, 2026, 2047, 2026, 1991, 2018, 2040, 2047, 1670, 1690, 1687, 1679, 1683, 1668, 1717, 1689, 1682, 1683, 3326, 3321, 3303, 1533, 1459, 1442, 1467, 1532, 1442, 1466, 1442, 1533, 1427, 1442, 1442, 1460, 1469, 1450, 1533, 1444, 1469, 1462, 1438, 1467, 1441, 1446, 1517, 1446, 1451, 1442, 1463, 1421, 1467, 1462, 1519, 2040, 1966, 1983, 1977, 1979, 2019, 303, 298, 319, 298, 3251, 3236, 3234, 3246, 3244, 3244, 3236, 3247, 3237, 3230, 3245, 3240, 3250, 3253, 726, 719, 708, 767, 713, 708, 2130, 2123, 2112, 2171, 2122, 2117, 2121, 2113, 1948, 1925, 1934, 1973, 1946, 1923, 1929, 1042, 1035, 1024, 1083, 1046, 1025, 1033, 1029, 1046, 1039, 1047, 1761, 1711, 1726, 1703, 1760, 1726, 1702, 1726, 1761, 1679, 1726, 1726, 1704, 1697, 1718, 1761, 1720, 1697, 1706, 1777, 1711, 1709, 1779, 1706, 1707, 1722, 1711, 1703, 1698, 1768, 1703, 1706, 1725, 1779, 978, 983, 973, 970, 811, 818, 825, 770, 813, 817, 828, 804, 770, 827, 815, 818, 816, 1796, 1916, 1796, 1916, 1796, 1916, 2043, 2018, 2025, 2002, 2045, 2017, 2028, 2036, 2002, 2040, 2047, 2017, 766, 766, 766, 1041, 1032, 1027, 1080, 1033, 1030, 1034, 1026, 1582, 846, 822, 2837, 2716, 2621, 2596, 2607, 2580, 2617, 2606, 2598, 2602, 2617, 2592, 2616, 2525, 2500, 2511, 2548, 2504, 2500, 2501, 2527, 2510, 2501, 2527, 3132, 3109, 3118, 3093, 3123, 3119, 3115, 3128, 1064, 1073, 1082, 1025, 1082, 1079, 1068, 1083, 1085, 1066, 1073, 1068, 1050, 1027, 1032, 1075, 1037, 1039, 1048, 1027, 1054, 1764, 1789, 1782, 1741, 1762, 1787, 1777, 1674, 1683, 1688, 1699, 1693, 1678, 1689, 1693, 1042, 1116, 1101, 1108, 1043, 1101, 1109, 1101, 1042, 1148, 1101, 1101, 1115, 1106, 1093, 1042, 1108, 1107, 1108, 1097, 1482, 1487, 1498, 1487, 854, 859, 850, 839, 893, 846, 843, 849, 854, 1852, 1841, 1848, 1837, 1815, 1830, 1833, 1829, 1837, 19179, 29121, 32345, 3106, 3119, 3110, 3123, 3081, 3135, 3122, 1391, 1333, 1337, 1333, 1072, 1140, 1133, 1137, 1136, 2277, 2292, 2285, 2240, 2283, 2281, 2277, 2285, 2282, 2595, 2778, 2781, 2755, 1550, 1611, 1625, 1624, 1806, 701, 755, 738, 763, 700, 738, 762, 738, 701, 723, 738, 738, 756, 765, 746, 701, 740, 765, 758, 685, 755, 753, 687, 758, 759, 742, 755, 763, 766, 692, 741, 758, 687, 1784, 1710, 1721, 1763, 1296, 1301, 1295, 1288, 917, 920, 913, 900, 958, 911, 896, 908, 900, 18799, 28731, 31923, 1099, 1106, 1113, 1122, 1108, 1113, 1323, 1330, 1337, 1282, 1331, 1340, 1328, 1336, 3033, 3008, 3019, 3056, 3039, 3014, 3020, 991, 966, 973, 1014, 987, 972, 964, 968, 987, 962, 986, -26714, -28505, 31928};
    public String a = C0030.m5362(m155(), 0, 28, 3179);
    public final HashMap b = new HashMap();

    public static HashMap b() {
        return C0020.m4251(C0039.m6551(m155(), 28, 10, 3127), C0061.m9361(m155(), 38, 139, 1536));
    }

    /* renamed from: ۣ۟۟ۨ۠, reason: not valid java name and contains not printable characters */
    public static JsonObject m149(Object obj) {
        if (C0044.m7508() <= 0) {
            return ((JsonElement) obj).getAsJsonObject();
        }
        return null;
    }

    /* renamed from: ۟۠ۦ۠ۡ, reason: not valid java name and contains not printable characters */
    public static String m150(Object obj) {
        if (C0064.m9659() < 0) {
            return ((JsonPrimitive) obj).getAsString();
        }
        return null;
    }

    /* renamed from: ۟ۡۨ۟۟, reason: not valid java name and contains not printable characters */
    public static String m151(Object obj) {
        if (C0044.m7508() < 0) {
            return ((JsonElement) obj).getAsString();
        }
        return null;
    }

    /* renamed from: ۟ۤۨ۠ۦ, reason: not valid java name and contains not printable characters */
    public static int m152(Object obj) {
        if (C0026.m4977() < 0) {
            return ((JsonArray) obj).size();
        }
        return 0;
    }

    /* renamed from: ۡۥۥۧ, reason: not valid java name and contains not printable characters */
    public static JsonElement m153(Object obj, Object obj2) {
        if (C0035.m6140() < 0) {
            return ((JsonObject) obj).get((String) obj2);
        }
        return null;
    }

    /* renamed from: ۡۦ۟, reason: not valid java name and contains not printable characters */
    public static JsonElement m154(Object obj, int i) {
        if (C0064.m9659() <= 0) {
            return ((JsonArray) obj).get(i);
        }
        return null;
    }

    /* renamed from: ۡۦ۟ۧ, reason: not valid java name and contains not printable characters */
    public static short[] m155() {
        if (C0052.m8320() >= 0) {
            return f25short;
        }
        return null;
    }

    /* renamed from: ۢ۟۟ۦ, reason: not valid java name and contains not printable characters */
    public static JsonArray m156(Object obj, Object obj2) {
        if (C0017.m3633() <= 0) {
            return ((JsonObject) obj).getAsJsonArray((String) obj2);
        }
        return null;
    }

    /* renamed from: ۣۤ۟ۤ, reason: not valid java name and contains not printable characters */
    public static JsonObject m157(Object obj) {
        if (C0003.m1463() < 0) {
            return AbstractC0308c.i((String) obj);
        }
        return null;
    }

    /* renamed from: ۥۢ۟ۨ, reason: contains not printable characters */
    public static JsonObject m158(Object obj, Object obj2) {
        if (C0059.m9257() < 0) {
            return ((JsonObject) obj).getAsJsonObject((String) obj2);
        }
        return null;
    }

    /* renamed from: ۥۣ۠ۧ, reason: contains not printable characters */
    public static String m159(Object obj, Object obj2, Object obj3) {
        if (C0000.m1116() <= 0) {
            return AbstractC0308c.f((JsonObject) obj, (String) obj2, (String) obj3);
        }
        return null;
    }

    /* renamed from: ۦۣۨۤ, reason: contains not printable characters */
    public static JsonPrimitive m160(Object obj, Object obj2) {
        if (C0029.m5282() > 0) {
            return ((JsonObject) obj).getAsJsonPrimitive((String) obj2);
        }
        return null;
    }

    public final void a() {
        JsonArray jsonArrayM156 = m156(m158(m157(C0032.m5769(C0028.m5188(new StringBuilder(), C0008.m2005(this), C0000.m1077(m155(), 177, 22, 2233)), C0030.m5445())), C0023.m4536(m155(), 199, 4, 454)), C0012.m2973(m155(), 203, 13, 1931));
        for (int i = 0; i < m152(jsonArrayM156); i++) {
            JsonObject jsonObjectM149 = m149(m154(jsonArrayM156, i));
            C0053.m8424(C0044.m7448(this), m151(m153(jsonObjectM149, C0029.m5256(m155(), 216, 10, 1782))), m151(m153(jsonObjectM149, C0021.m4340(m155(), 226, 3, 3211))));
        }
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        C0011.m2747(sb, C0008.m2005(this), C0036.m6188(m155(), 229, 32, 1490), str, C0057.m8978(m155(), 261, 6, 2014));
        C0018.m3933(sb, str2);
        JsonArray jsonArrayM156 = m156(m158(m157(C0032.m5769(C0047.m7763(sb), C0030.m5445())), C0053.m8477(m155(), 267, 4, 331)), C0031.m5565(m155(), 271, 14, 3265));
        for (int i = 0; i < m152(jsonArrayM156); i++) {
            JsonObject jsonObjectM149 = m149(m154(jsonArrayM156, i));
            C0004.m1532(arrayList, new m(m151(m153(jsonObjectM149, C0057.m8978(m155(), 285, 6, 672))), m151(m153(jsonObjectM149, C0065.m9775(m155(), 291, 8, 2084))), m151(m153(jsonObjectM149, C0044.m7509(m155(), 299, 7, 2026))), m151(m153(jsonObjectM149, C0001.m1189(m155(), 306, 11, 1124)))));
        }
        return C0047.m7783(arrayList);
    }

    public String detailContent(List<String> list) {
        String strM7833;
        m mVar = new m();
        StringBuilder sb = new StringBuilder();
        C0018.m3933(sb, C0008.m2005(this));
        C0018.m3933(sb, C0026.m4951(m155(), 317, 34, 1742));
        char c = 0;
        C0018.m3933(sb, (String) C0048.m7915(list, 0));
        JSONObject jSONObjectM3923 = C0018.m3923(C0021.m4333(new JSONObject(C0032.m5769(C0047.m7763(sb), C0030.m5445())), C0027.m5062(m155(), 351, 4, 958)), 0);
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        String strM1212 = C0001.m1212(jSONObjectM3923, C0015.m3484(m155(), 355, 13, 861));
        String strM1645 = C0005.m1645(m155(), 368, 6, 1880);
        String[] strArrM4752 = C0024.m4752(strM1212, strM1645);
        String[] strArrM47522 = C0024.m4752(C0001.m1212(jSONObjectM3923, C0029.m5256(m155(), 374, 12, 1933)), strM1645);
        int i = 0;
        while (true) {
            int length = strArrM4752.length;
            strM7833 = C0047.m7833(m155(), 386, 3, 730);
            if (i >= length) {
                break;
            }
            C0018.m3933(sb2, strArrM4752[i]);
            C0018.m3933(sb2, strM7833);
            i++;
        }
        int i2 = 0;
        while (true) {
            int length2 = strArrM47522.length;
            String strM9775 = C0065.m9775(m155(), 389, 8, 1127);
            if (i2 >= length2) {
                C0005.m1628(mVar, C0001.m1212(jSONObjectM3923, strM9775));
                StringBuilder sb4 = new StringBuilder();
                C0018.m3933(sb4, C0036.m6189());
                C0018.m3933(sb4, C0001.m1212(jSONObjectM3923, C0027.m5062(m155(), 402, 11, 2635)));
                C0019.m4073(mVar, C0047.m7763(sb4));
                C0027.m5000(mVar, C0001.m1212(jSONObjectM3923, C0039.m6551(m155(), 413, 11, 2475)));
                C0022.m4432(mVar, C0001.m1212(jSONObjectM3923, C0041.m6779(m155(), 424, 8, 3146)));
                C0058.m9152(mVar, C0001.m1212(jSONObjectM3923, C0006.m1774(m155(), 432, 12, 1118)));
                C0058.m9159(mVar, C0001.m1212(jSONObjectM3923, C0055.m8814(m155(), 444, 9, 1132)));
                C0026.m4947(mVar, C0001.m1212(jSONObjectM3923, C0044.m7509(m155(), 453, 7, 1682)));
                C0017.m3671(mVar, C0001.m1212(jSONObjectM3923, C0022.m4403(m155(), 460, 8, 1788)));
                C0054.m8596(mVar, C0047.m7763(sb2));
                C0044.m7449(mVar, C0047.m7763(sb3));
                return C0053.m8428(mVar);
            }
            String str = strArrM47522[i2];
            String strM8007 = C0049.m8007(m155(), 397, 1, 1549);
            for (String str2 : C0024.m4752(str, strM8007)) {
                String[] strArrM47523 = C0024.m4752(str2, C0011.m2805(m155(), 398, 2, 786));
                C0018.m3933(sb3, strArrM47523[c]);
                C0018.m3933(sb3, C0015.m3484(m155(), 400, 1, 2865));
                C0018.m3933(sb3, strArrM47523[1]);
                String strM1774 = C0006.m1774(m155(), 401, 1, 2786);
                StringBuilder sb5 = new StringBuilder(strM1774);
                C0018.m3933(sb5, C0001.m1212(jSONObjectM3923, strM9775));
                C0018.m3933(sb5, strM1774);
                c = 0;
                C0018.m3933(sb5, strArrM47523[0]);
                C0018.m3933(sb3, C0047.m7763(sb5));
                C0018.m3933(sb3, strM8007);
            }
            C0018.m3933(sb3, strM7833);
            i2++;
        }
    }

    public String homeContent(boolean z) {
        ArrayList arrayList = new ArrayList();
        JsonArray jsonArrayM156 = m156(m158(m157(C0032.m5769(C0028.m5188(new StringBuilder(), C0008.m2005(this), C0062.m9389(m155(), 468, 20, 1085)), C0030.m5445())), C0041.m6779(m155(), 488, 4, 1454)), C0029.m5256(m155(), 492, 9, 802));
        for (int i = 0; i < m152(jsonArrayM156); i++) {
            JsonObject jsonObjectM149 = m149(m154(jsonArrayM156, i));
            String strM1774 = C0006.m1774(m155(), 501, 9, 1864);
            if (!C0058.m9127(m151(m153(jsonObjectM149, strM1774)), C0062.m9389(m155(), 510, 1, 1485)) && !C0058.m9127(m151(m153(jsonObjectM149, strM1774)), C0055.m8814(m155(), 511, 1, 2126)) && !C0058.m9127(m151(m153(jsonObjectM149, strM1774)), C0065.m9775(m155(), 512, 1, 2655))) {
                C0004.m1532(arrayList, new b(m151(m153(jsonObjectM149, C0054.m8574(m155(), 513, 7, 3158))), m151(m153(jsonObjectM149, strM1774)), null));
                C0049.m8025(C0035.m6087(), jsonObjectM149);
            }
        }
        return C0052.m8297(arrayList, new JSONObject());
    }

    public void init(Context context) {
        C0017.m3664(this);
    }

    public void init(Context context, String str) {
        C0051.m8194(C0035.m6110());
        if (C0060.m9349(str, C0051.m8259(m155(), 520, 4, 1345)) || C0060.m9349(str, C0055.m8814(m155(), 524, 5, 1054))) {
            this.a = m150(m160(m157(C0032.m5769(str, null)), C0040.m6584(m155(), 529, 9, 2180)));
        } else {
            this.a = str;
        }
        C0017.m3664(this);
    }

    public String playerContent(String str, String str2, List<String> list) {
        C0036.m6219();
        String[] strArrM4752 = C0024.m4752(str2, C0043.m7290(m155(), 538, 1, 2653));
        String str3 = null;
        String str4 = (strArrM4752.length <= 0 || C0057.m8953(strArrM4752[0])) ? null : strArrM4752[0];
        String str5 = (strArrM4752.length <= 1 || C0057.m8953(strArrM4752[1])) ? null : strArrM4752[1];
        if (strArrM4752.length > 2 && !C0057.m8953(strArrM4752[2])) {
            str3 = strArrM4752[2];
        }
        String strM2827 = C0011.m2827(str4, str5, str3);
        HashMap mapM7448 = C0044.m7448(this);
        if (C0058.m9098(mapM7448, str)) {
            JsonObject jsonObjectM157 = m157(C0032.m5769(C0065.m9804((String) C0065.m9715(mapM7448, str), str4), C0030.m5445()));
            StringBuilder sb = new StringBuilder();
            C0018.m3933(sb, m159(jsonObjectM157, C0025.m4795(m155(), 539, 3, 2735), C0007.m1840()));
            C0018.m3933(sb, C0010.m2300(m155(), 542, 4, 1585));
            String strM7763 = C0047.m7763(sb);
            g gVar = new g();
            C0002.m1282(gVar, strM2827);
            C0017.m3667(gVar, strM7763);
            C0057.m9029(gVar, C0030.m5445());
            return C0033.m5828(gVar);
        }
        if (C0003.m1392(str4)) {
            g gVar2 = new g();
            C0002.m1282(gVar2, strM2827);
            C0017.m3667(gVar2, str4);
            C0006.m1720(gVar2, 0);
            return C0033.m5828(gVar2);
        }
        g gVar3 = new g();
        C0002.m1282(gVar3, strM2827);
        C0017.m3667(gVar3, str4);
        C0064.m9646(gVar3);
        return C0033.m5828(gVar3);
    }

    public String searchContent(String str, boolean z) {
        return C0059.m9264(this, str, true, C0019.m4107(m155(), 546, 1, 1855));
    }

    public String searchContent(String str, boolean z, String str2) {
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        C0011.m2747(sb, C0008.m2005(this), C0042.m7151(m155(), 547, 33, 658), str, C0041.m6779(m155(), 580, 4, 1758));
        C0018.m3933(sb, str2);
        JSONArray jSONArrayM4333 = C0021.m4333(new JSONObject(C0032.m5769(C0047.m7763(sb), C0030.m5445())), C0024.m4740(m155(), 584, 4, 1404));
        for (int i = 0; i < C0053.m8396(jSONArrayM4333); i++) {
            JSONObject jSONObjectM3923 = C0018.m3923(jSONArrayM4333, i);
            String strM6131 = C0035.m6131(m155(), 588, 9, 993);
            if (!C0058.m9127(C0001.m1212(jSONObjectM3923, strM6131), C0051.m8259(m155(), 597, 1, 1609)) && !C0058.m9127(C0001.m1212(jSONObjectM3923, strM6131), C0031.m5565(m155(), 598, 1, 2484)) && !C0058.m9127(C0001.m1212(jSONObjectM3923, strM6131), C0043.m7290(m155(), 599, 1, 2229))) {
                String strM1212 = C0001.m1212(jSONObjectM3923, C0039.m6551(m155(), 600, 6, 1085));
                String strM12122 = C0001.m1212(jSONObjectM3923, C0018.m3917(m155(), 606, 8, 1373));
                String strM8259 = C0051.m8259(m155(), 614, 7, 2991);
                m mVar = new m(strM1212, strM12122, C0063.m9499(jSONObjectM3923, strM8259) ? C0001.m1212(jSONObjectM3923, strM8259) : C0007.m1840(), C0001.m1212(jSONObjectM3923, C0017.m3646(m155(), 621, 11, 937)));
                C0058.m9085(mVar, C0050.m8131(m155(), 632, 3, 1633));
                C0004.m1532(arrayList, mVar);
            }
        }
        return C0047.m7783(arrayList);
    }
}