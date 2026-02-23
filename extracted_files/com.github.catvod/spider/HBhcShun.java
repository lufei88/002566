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
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.Z0.C0041;
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
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import com.github.catvod.spider.p000mergexbpq.x.C0015;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import java.io.PrintStream;
import java.security.InvalidKeyException;
import java.security.PublicKey;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.crypto.Cipher;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class HBhcShun extends Spider {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f44short = {681, 655, 665, 654, 721, 701, 667, 665, 658, 648, 1462, 1458, 1457, 1453, 1453, 1449, 1524, 1462, 1458, 1470, 1462, 1526, 1459, 1468, 1464, 1450, 1462, 1463, 1461, 1443, 1440, 2587, 2586, 2568, 2662, 2572, 2570, 2571, 2662, 2585, 2562, 2570, 2586, 2680, 2585, 2600, 2605, 2605, 2592, 2599, 2606, 2622, 2623, 2605, 20922, 22748, 32201, 25734, -1006, 856, 891, 873, 895, 812, 814, -1005, 800, 826, 1548, 1621, 1539, 1550, 1543, 1554, 1576, 1566, 1555, 1621, 1613, 1621, 1606, 1621, 1627, 1621, 1540, 1560, 1541, 1539, 1621, 1613, 1621, 1557, 1550, 1576, 1555, 1554, 1553, 1558, 1538, 1563, 1539, 1621, 1627, 1621, 1556, 1563, 1558, 1540, 1540, 1621, 1613, 1621, 31244, 20988, 1621, 1627, 1621, 1558, 1541, 1554, 1558, 1621, 1613, 1621, 20807, 21837, 1621, 1627, 1621, 1550, 1554, 1558, 1541, 1621, 1613, 1621, 22531, 18570, 1621, 1627, 1621, 1543, 1558, 1552, 1554, 1621, 1613, 1621, 1606, 1621, 1627, 1621, 1543, 1558, 1552, 1554, 1572, 1566, 1549, 1554, 1621, 1613, 1621, 1605, 1606, 1621, 1627, 1621, 1539, 1566, 1562, 1554, 1540, 1539, 1558, 1562, 1543, 1621, 1613, 1621, 1606, 1600, 1604, 1614, 1615, 1615, 1602, 1615, 1600, 1600, 1621, 1546, 1687, 1683, 1683, 1688, 1683, 1712, 1691, 1684, 1688, 1725, 1713, 1707, 1714, 1713, 1715, 1693, 1763, 1709, 1770, 1688, 1691, 1675, 1695, 1692, 1691, 1691, 1685, 1689, 1691, 1675, 1762, 1691, 1687, 1683, 1683, 1688, 1689, 1725, 1681, 1689, 1691, 1675, 1695, 1691, 1770, 1768, 1692, 1781, 1713, 1674, 1725, 1775, 1691, 1768, 1684, 1666, 1774, 1707, 1664, 1775, 1680, 1673, 1716, 1705, 1777, 1720, 1712, 1714, 1676, 1687, 1689, 1689, 1772, 1680, 1720, 1678, 1715, 1678, 1681, 1706, 1720, 1725, 1684, 1725, 1715, 1666, 1679, 1777, 1681, 1713, 1717, 1704, 1725, 1772, 1694, 1712, 1773, 1772, 1725, 1673, 1772, 1762, 1725, 1688, 1762, 1718, 1718, 1714, 1720, 1679, 1681, 1689, 1666, 1712, 1683, 1726, 1699, 1725, 1716, 1682, 1674, 1704, 1698, 1676, 1682, 1677, 1724, 1696, 1719, 1696, 1715, 1705, 1707, 1763, 1674, 1763, 1723, 1709, 1719, 1666, 1688, 1713, 1689, 1713, 1773, 1774, 1673, 1713, 1725, 1718, 1698, 1768, 1686, 1681, 1682, 1723, 1781, 1719, 1684, 1696, 1763, 1715, 1708, 1725, 1772, 1667, 1696, 1675, 1775, 1706, 1675, 1692, 1679, 1695, 1677, 1673, 1770, 1694, 1724, 1717, 1719, 1693, 1688, 1666, 1676, 1710, 1707, 1708, 1688, 1718, 1685, 1666, 1687, 1689, 1672, 1698, 1706, 1772, 1763, 1717, 1677, 1723, 1687, 1705, 1716, 1724, 1712, 1716, 1688, 1676, 1777, 1770, 1680, 1773, 1708, 1682, 1720, 1666, 1696, 1679, 1683, 1713, 1707, 1688, 1686, 1726, 1666, 1673, 1684, 1724, 1687, 1763, 1691, 1725, 1775, 1707, 1726, 1672, 1694, 1704, 1680, 1689, 1769, 1689, 1707, 1688, 1772, 1775, 1695, 1680, 1769, 1691, 1672, 1677, 1676, 1696, 1664, 1678, 1678, 1721, 1666, 1673, 1726, 1687, 1677, 1763, 1715, 1769, 1707, 1696, 1695, 1664, 1674, 1723, 1709, 1674, 1684, 1674, 1727, 1775, 1699, 1674, 1667, 1720, 1687, 1664, 1683, 1717, 1666, 1686, 1721, 1704, 1707, 1708, 1695, 1664, 1716, 1672, 1681, 1771, 1717, 1723, 1713, 1772, 1773, 1781, 1715, 1714, 1724, 1773, 1715, 1709, 1674, 1680, 1707, 1726, 1721, 1777, 1772, 1762, 1664, 1667, 1695, 1719, 1719, 1726, 1707, 1709, 1711, 1716, 1685, 1708, 1672, 1726, 1712, 1707, 1762, 1763, 1724, 1675, 1687, 1676, 1727, 1718, 1719, 1707, 1721, 1672, 1694, 1763, 1672, 1667, 1727, 1770, 1762, 1708, 1777, 1698, 1694, 1698, 1693, 1763, 1689, 1717, 1763, 1696, 1773, 1714, 1721, 1666, 1693, 1678, 1705, 1679, 1707, 1711, 1687, 1698, 1713, 1714, 1768, 1763, 1711, 1684, 1723, 1709, 1683, 1694, 1691, 1675, 1691, 1688, 407, 395, 395, 399, 396, 453, 464, 464, 411, 465, 411, 412, 402, 400, 393, 406, 410, 465, 395, 400, 399, 464, 464, 414, 399, 406, 465, 399, 407, 399, 464, 393, 400, 411, 464, 403, 406, 396, 395, 448, 396, 395, 414, 395, 410, 450, 3080, 3149, 3138, 3151, 3165, 3165, 3091, 31003, 21343, 3080, 3151, 3164, 3147, 3151, 3091, 23878, -25402, 3080, 3159, 3147, 3151, 3164, 3091, 23878, -25402, 3080, 3160, 3147, 3164, 3165, 3143, 3137, 3136, 3091, 23878, -25402, 3080, 3166, 3145, 3091, 3102, 3099, 3086, 3099, 1643, 1646, 1652, 1651, 1612, 1621, 1630, 1637, 1619, 1630, 618, 627, 632, 579, 626, 637, 625, 633, 2457, 2432, 2443, 2480, 2463, 2438, 2444, 2136, 2113, 2122, 2161, 2140, 2123, 2115, 2127, 2140, 2117, 2141, 1566, 1538, 1551, 1559, 1547, 1564, 1585, 1543, 1536, 1544, 1537, 3271, 3292, 3291, 3309, 3281, 3293, 3286, 3287, 689, 682, 676, 658, 679, 660, 684, 662, 691, 716, 695, 650, 691, 681, 699, 717, 689, 685, 718, 718, 679, 682, 669, 719, 690, 682, 661, 649, 691, 698, 695, 650, 676, 660, 679, 647, 689, 681, 679, 644, 688, 681, 691, 718, 691, 659, 695, 649, 2490, 2488, 1933, 1932, 1949, 1928, 1920, 1925, 1252, 1257, 1278, 3320, 3299, 3303, 3305, 3298, 555, 567, 567, 563, 560, 633, 620, 620, 551, 621, 551, 544, 558, 556, 565, 554, 550, 621, 567, 556, 563, 620, 620, 546, 563, 554, 621, 563, 555, 563, 620, 565, 556, 551, 620, 551, 550, 567, 546, 554, 559, 625, 1896, 1901, 1912, 1901, 1898, 1907, 1912, 1859, 1906, 1917, 1905, 1913, 1883, 1858, 1865, 1906, 1860, 1865, 1033, 1040, 1051, 1056, 1039, 1046, 1052, 3253, 3244, 3239, 3228, 3234, 3249, 3238, 3234, 1302, 1295, 1284, 1343, 1284, 1289, 1298, 1285, 1283, 1300, 1295, 1298, 2329, 2304, 2315, 2352, 2326, 2314, 2318, 2333, 2515, 2506, 2497, 2554, 2502, 2506, 2507, 2513, 2496, 2507, 2513, 3311, 3318, 3325, 3270, 3307, 3324, 3316, 3320, 3307, 3314, 3306, 2583, 2574, 2565, 2622, 2577, 2573, 2560, 2584, 2622, 2573, 2568, 2578, 2581, 1923, 1938, 1921, 1920, 1942, 1828, 1855, 1830, 1830, 2437, 2449, 2444, 2446, 2363, 2363, 2363, 3290, 3293, 3267, 3292, 2373, 2378, 2374, 2382, 3195, 2435, 2436, 2458, 642, 1596, 24719, -32649, 32733, 21913, 29078, -29339, 22212, 22075, 27576, 31456, -31130, 32624, 24207, 29597, 1189, 2320, 2315, 2322, 2322, 1433, 1479, 1409, 1484, 948, 937, 1005, 617, 622, 624, 2038, 2026, 2026, 2030, 2029, 1956, 1969, 1969, 2042, 1968, 2042, 2045, 2035, 2033, 2024, 2039, 2043, 1968, 
    2026, 2033, 2030, 1969, 2047, 2030, 2039, 1968, 2030, 2038, 2030, 1969, 2024, 2033, 2042, 1969, 2035, 1985, 2036, 2039, 2043, 1985, 2022, 2039, 1394, 472, 452, 452, 448, 451, 394, 415, 415, 468, 414, 468, 467, 477, 479, 454, 473, 469, 414, 452, 479, 448, 415, 415, 465, 448, 473, 414, 448, 472, 448, 415, 454, 479, 468, 415, 451, 469, 465, 450, 467, 472, 399, 475, 469, 457, 455, 479, 450, 468, 451, 397, 420, 498, 485, 447, 1330, 1376, 1389, 1380, 1393, 1321, 1317, 1463, 1458, 1448, 1455, 811, 818, 825, 770, 820, 825, 2248, 2257, 2266, 2273, 2256, 2271, 2259, 2267, 2253, 2260, 2271, 2276, 2251, 2258, 2264, 2194, 2187, 2176, 2235, 2198, 2177, 2185, 2181, 2198, 2191, 2199};
    public String a;

    public static HashMap a() {
        return C0020.m4251(C0063.m9585(m285(), 0, 10, 764), C0021.m4340(m285(), 10, 21, 1497));
    }

    public static String encrypt(String str, PublicKey publicKey) throws InvalidKeyException {
        Cipher cipherM4284 = C0020.m4284(C0061.m9361(m285(), 31, 20, 2633));
        C0060.m9336(cipherM4284, 1, publicKey);
        return C0024.m4719(C0010.m2335(cipherM4284, C0012.m3018(str, C0034.m5989())));
    }

    public static PublicKey getPublicKey(String str) {
        return C0012.m2981(C0022.m4426(C0030.m5362(m285(), 51, 3, 2668)), new X509EncodedKeySpec(C0007.m1882(str)));
    }

    /* renamed from: ۟ۡ۠ۡ, reason: not valid java name and contains not printable characters */
    public static short[] m285() {
        if (C0002.m1242() >= 0) {
            return f44short;
        }
        return null;
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        String strM2973 = C0012.m2973(m285(), 54, 14, 794);
        try {
            String strM6154 = C0035.m6154(C0060.m9352(m285(), 68, 124, 1655), C0006.m1788(C0021.m4340(m285(), 192, 392, 1754)));
            PrintStream printStreamM6087 = C0035.m6087();
            StringBuilder sb = new StringBuilder(strM2973);
            C0018.m3933(sb, strM6154);
            C0012.m2969(printStreamM6087, C0047.m7763(sb));
        } catch (Exception e) {
            C0049.m7975(e);
        }
        ArrayList arrayList = new ArrayList();
        StringBuilder sb2 = new StringBuilder(C0023.m4536(m285(), 584, 46, 511));
        C0018.m3933(sb2, str);
        C0018.m3933(sb2, C0028.m5109(m285(), 630, 40, 3118));
        C0018.m3933(sb2, str2);
        JSONArray jSONArrayM4333 = C0021.m4333(C0003.m1370(new JSONObject(C0032.m5769(C0047.m7763(sb2), C0024.m4660())), C0006.m1774(m285(), 670, 4, 3194)), C0058.m9106(m285(), 674, 4, 1543));
        for (int i = 0; i < C0053.m8396(jSONArrayM4333); i++) {
            JSONObject jSONObjectM3923 = C0018.m3923(jSONArrayM4333, i);
            C0004.m1532(arrayList, new m(C0001.m1212(jSONObjectM3923, C0037.m6307(m285(), 678, 6, 1594)), C0001.m1212(jSONObjectM3923, C0018.m3917(m285(), 684, 8, 540)), C0001.m1212(jSONObjectM3923, C0047.m7833(m285(), 692, 7, 2543)), C0001.m1212(jSONObjectM3923, C0048.m7902(m285(), 699, 11, 2094))));
        }
        return C0020.m4216(C0011.m2808(C0038.m6456(str2)), C0047.m7818(1, str2), C0011.m2808(20), C0054.m8556(str2, 1, 20), arrayList);
    }

    public String detailContent(List<String> list) {
        String strM9352;
        String strM3646 = C0017.m3646(m285(), 710, 11, 1646);
        int i = 0;
        String str = (String) C0048.m7915(list, 0);
        HashMap mapM4127 = C0019.m4127(C0050.m8131(m285(), 721, 8, 3250), C0015.m3484(m285(), 729, 48, 766), C0031.m5565(m285(), 777, 2, 2523), C0052.m8337(m285(), 779, 6, 2025));
        C0053.m8424(mapM4127, C0011.m2805(m285(), 785, 3, 1165), str);
        C0053.m8424(mapM4127, C0021.m4340(m285(), 788, 5, 3212), C0007.m1840());
        JSONObject jSONObjectM1370 = C0003.m1370(new JSONObject(C0003.m1444(C0024.m4740(m285(), 793, 42, 579), mapM4127, C0024.m4660())), C0013.m3106(m285(), 835, 4, 1804));
        m mVar = new m();
        String strM1212 = C0001.m1212(jSONObjectM1370, C0045.m7657(m285(), 839, 8, 1820));
        C0011.m2828(mVar, C0001.m1212(jSONObjectM1370, C0047.m7833(m285(), 847, 6, 1837)));
        C0005.m1628(mVar, strM1212);
        C0026.m4947(mVar, C0001.m1212(jSONObjectM1370, C0013.m3106(m285(), 853, 7, 1151)));
        C0017.m3671(mVar, C0001.m1212(jSONObjectM1370, C0046.m7718(m285(), 860, 8, 3267)));
        C0058.m9159(mVar, C0001.m1212(jSONObjectM1370, C0011.m2805(m285(), 868, 12, 1376)));
        C0022.m4432(mVar, C0001.m1212(jSONObjectM1370, C0007.m1842(m285(), 880, 8, 2415)));
        StringBuilder sb = new StringBuilder();
        C0018.m3933(sb, C0055.m8703());
        C0018.m3933(sb, C0001.m1212(jSONObjectM1370, C0054.m8574(m285(), 888, 11, 2469)));
        C0027.m5000(mVar, C0047.m7763(sb));
        StringBuilder sb2 = new StringBuilder();
        C0018.m3933(sb2, C0036.m6189());
        C0018.m3933(sb2, C0001.m1212(jSONObjectM1370, C0001.m1189(m285(), 899, 11, 3225)));
        C0019.m4073(mVar, C0047.m7763(sb2));
        JSONArray jSONArrayM4333 = C0021.m4333(jSONObjectM1370, C0002.m1305(m285(), 910, 13, 2657));
        StringBuilder sb3 = new StringBuilder();
        StringBuilder sb4 = new StringBuilder();
        int i2 = 0;
        while (i2 < C0053.m8396(jSONArrayM4333)) {
            JSONObject jSONObjectM3923 = C0018.m3923(jSONArrayM4333, i2);
            try {
                strM9352 = C0025.m4770(C0021.m4333(C0003.m1370(jSONObjectM3923, strM3646), C0013.m3106(m285(), 923, 5, 2035)), i);
            } catch (Exception unused) {
                strM9352 = C0060.m9352(m285(), 928, 4, 1866);
            }
            JSONObject jSONObjectM13702 = C0003.m1370(jSONObjectM3923, strM3646);
            String strM4107 = C0019.m4107(m285(), 932, 4, 2531);
            String strM12122 = C0001.m1212(jSONObjectM13702, strM4107);
            StringBuilder sb5 = new StringBuilder();
            C0018.m3933(sb5, C0016.m3579());
            C0018.m3933(sb5, strM12122);
            C0018.m3933(sb4, C0047.m7763(sb5));
            String strM1774 = C0006.m1774(m285(), 936, 3, 2335);
            C0018.m3933(sb4, strM1774);
            JSONArray jSONArrayM43332 = C0021.m4333(jSONObjectM3923, C0033.m5852(m285(), 939, 4, 3247));
            for (int i3 = 0; i3 < C0053.m8396(jSONArrayM43332); i3++) {
                JSONObject jSONObjectM39232 = C0018.m3923(jSONArrayM43332, i3);
                String strM5256 = C0029.m5256(m285(), 943, 4, 2347);
                C0018.m3933(sb3, C0001.m1212(jSONObjectM39232, strM5256));
                C0018.m3933(sb3, C0057.m8978(m285(), 947, 1, 3167));
                C0018.m3933(sb3, C0001.m1212(jSONObjectM39232, C0024.m4740(m285(), 948, 3, 2550)));
                String strM8814 = C0055.m8814(m285(), 951, 1, 764);
                C0018.m3933(sb3, strM8814);
                C0018.m3933(sb3, strM9352);
                C0018.m3933(sb3, strM8814);
                C0018.m3933(sb3, C0001.m1212(jSONObjectM39232, strM4107));
                C0018.m3933(sb3, strM8814);
                C0018.m3933(sb3, strM1212);
                C0018.m3933(sb3, strM8814);
                C0018.m3933(sb3, C0001.m1212(jSONObjectM39232, strM5256));
                C0018.m3933(sb3, C0045.m7657(m285(), 952, 1, 1567));
            }
            C0018.m3933(sb3, strM1774);
            i2++;
            i = 0;
        }
        C0044.m7449(mVar, C0047.m7763(sb3));
        C0054.m8596(mVar, C0047.m7763(sb4));
        return C0053.m8428(mVar);
    }

    public String homeContent(boolean z) {
        ArrayList arrayList = new ArrayList();
        String strM6779 = C0041.m6779(m285(), 953, 2, 807);
        String strM9389 = C0062.m9389(m285(), 955, 2, 2792);
        String strM8911 = C0056.m8911(m285(), 957, 3, 1187);
        String strM3484 = C0015.m3484(m285(), 960, 2, 1171);
        String strM1189 = C0001.m1189(m285(), 962, 2, 1052);
        String strM4199 = C0020.m4199(m285(), 964, 3, 474);
        List listM1203 = C0001.m1203(new String[]{strM6779, strM9389, strM8911, strM3484, strM1189, strM4199});
        List listM12032 = C0001.m1203(new String[]{strM6779, strM9389, strM8911, strM3484, strM1189, strM4199});
        for (int i = 0; i < C0064.m9636(listM1203); i++) {
            C0004.m1532(arrayList, new b((String) C0048.m7915(listM1203, i), (String) C0048.m7915(listM12032, i), null));
        }
        return C0003.m1448(C0039.m6526(this), null, arrayList);
    }

    public void init(Context context, String str) {
        C0051.m8194(C0035.m6110());
        if (str != null) {
            this.a = str;
        }
    }

    public String playerContent(String str, String str2, List<String> list) {
        C0036.m6219();
        String[] strArrM4752 = C0024.m4752(str2, C0011.m2805(m285(), 967, 1, 1243));
        String str3 = null;
        String str4 = (strArrM4752.length <= 0 || C0057.m8953(strArrM4752[0])) ? null : strArrM4752[0];
        String str5 = (strArrM4752.length <= 1 || C0057.m8953(strArrM4752[1])) ? null : strArrM4752[1];
        if (strArrM4752.length > 2 && !C0057.m8953(strArrM4752[2])) {
            String str6 = strArrM4752[2];
        }
        String str7 = (strArrM4752.length <= 3 || C0057.m8953(strArrM4752[3])) ? null : strArrM4752[3];
        if (strArrM4752.length > 4 && !C0057.m8953(strArrM4752[4])) {
            str3 = strArrM4752[4];
        }
        String strM2827 = C0011.m2827(str4, str7, str3);
        if (C0058.m9127(str5, C0054.m8574(m285(), 968, 4, 2430))) {
            if (C0058.m9127(str4, C0012.m2973(m285(), 972, 4, 1524)) || C0058.m9127(str4, C0018.m3917(m285(), 976, 3, 985))) {
                g gVar = new g();
                C0017.m3667(gVar, str4);
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
        HashMap map = new HashMap();
        StringBuilder sb = new StringBuilder();
        C0018.m3933(sb, str5);
        C0018.m3933(sb, str4);
        String strM7763 = C0047.m7763(sb);
        String strM7290 = C0043.m7290(m285(), 979, 3, 540);
        C0053.m8424(map, strM7290, strM7763);
        JSONObject jSONObject = new JSONObject(C0008.m2029(C0003.m1396(C0054.m8574(m285(), 982, 42, 1950), map, C0024.m4660())));
        try {
            g gVar3 = new g();
            C0017.m3667(gVar3, C0001.m1212(jSONObject, strM7290));
            C0057.m9029(gVar3, C0024.m4660());
            C0002.m1282(gVar3, strM2827);
            C0057.m9029(gVar3, C0038.m6454());
            return C0033.m5828(gVar3);
        } catch (Exception unused) {
            g gVar4 = new g();
            C0017.m3667(gVar4, str4);
            C0002.m1282(gVar4, strM2827);
            C0057.m9029(gVar4, C0038.m6454());
            return C0033.m5828(gVar4);
        }
    }

    public String searchContent(String str, boolean z) {
        return C0008.m1986(this, C0056.m8909(str), true, C0012.m2973(m285(), 1024, 1, 1347));
    }

    public String searchContent(String str, boolean z, String str2) {
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArrayM4333 = C0021.m4333(new JSONObject(C0032.m5769(C0058.m9145(C0002.m1305(m285(), 1025, 51, 432), str, C0019.m4107(m285(), 1076, 4, 386), str2, C0039.m6551(m285(), 1080, 7, 1300)), C0024.m4660())), C0044.m7509(m285(), 1087, 4, 1499));
        for (int i = 0; i < C0053.m8396(jSONArrayM4333); i++) {
            JSONObject jSONObjectM3923 = C0018.m3923(jSONArrayM4333, i);
            C0004.m1532(arrayList, new m(C0001.m1212(jSONObjectM3923, C0050.m8131(m285(), 1091, 6, 861)), C0001.m1212(jSONObjectM3923, C0052.m8337(m285(), 1097, 8, 2238)), C0001.m1212(jSONObjectM3923, C0019.m4107(m285(), 1105, 7, 2235)), C0001.m1212(jSONObjectM3923, C0017.m3646(m285(), 1112, 11, 2276))));
        }
        return C0020.m4216(C0011.m2808(C0038.m6456(str2)), C0047.m7818(1, str2), C0011.m2808(20), C0054.m8556(str2, 1, 20), arrayList);
    }
}