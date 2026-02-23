package com.github.catvod.spider.merge.g0;

import android.app.Application;
import android.content.ContentProvider;
import android.content.pm.ProviderInfo;
import android.content.res.XmlResourceParser;
import com.github.catvod.spider.merge.N.C0023;
import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.f0.C0052;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.t.C0061;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import com.github.catvod.spider.p000mergexbpq.a0.C0006;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;

/* renamed from: com.github.catvod.spider.merge.g0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0307b extends ContentProvider {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f792short = {1719, 1720, 1714, 1700, 1721, 1727, 1714, 1784, 1701, 1699, 1702, 1702, 1721, 1700, 1698, 1784, 1680, 1695, 1690, 1683, 1673, 1670, 1668, 1689, 1664, 1695, 1682, 1683, 1668, 1673, 1670, 1687, 1666, 1694, 1669, 2546, 2557, 2545, 2553, 2461, 2444, 2457, 2437, 2906, 2904, 2906, 2897, 2908, 2836, 2889, 2904, 2893, 2897, 1517, 1520, 1532, 1517, 1530, 1510, 1513, 1508, 1445, 1528, 1513, 1532, 1504, 1145, 1118, 1110, 1107, 1114, 1115, 1055, 1099, 1104, 1055, 1101, 1114, 1100, 1104, 1107, 1097, 1114, 1055, 1116, 1118, 1105, 1104, 1105, 1110, 1116, 1118, 1107, 1055, 1103, 1118, 1099, 1111, 1055, 1113, 1104, 1101, 1055, 2394, 2421, 2425, 2417, 2356, 2425, 2401, 2407, 2400, 2356, 2426, 2427, 2400, 2356, 2422, 2417, 2356, 2417, 2425, 2404, 2400, 2413, 1582, 1546, 1552, 1552, 1546, 1549, 1540, 1603, 1538, 1549, 1543, 1553, 1548, 1546, 1543, 1613, 1552, 1558, 1555, 1555, 1548, 1553, 1559, 1613, 1573, 1578, 1583, 1574, 1596, 1587, 1585, 1580, 1589, 1578, 1575, 1574, 1585, 1596, 1587, 1570, 1591, 1579, 1584, 1603, 1550, 1542, 1559, 1538, 1614, 1543, 1538, 1559, 1538, 3320, 3284, 3278, 3287, 3295, 3285, 3228, 3279, 3227, 3293, 3282, 3285, 3295, 3227, 3286, 3294, 3279, 3290, 3222, 3295, 3290, 3279, 3290, 3227, 3293, 3284, 3273, 3227, 3275, 3273, 3284, 3277, 3282, 3295, 3294, 3273, 3227, 3276, 3282, 3279, 3283, 3227, 3290, 3278, 3279, 3283, 3284, 3273, 3282, 3279, 3266, 3227};
    public static final HashMap a = new HashMap();

    public static C0306a a(Application application, String str) {
        C0306a c0306a = new C0306a(str);
        ProviderInfo providerInfoM7454 = C0044.m7454(C0027.m5093(application), str, 128);
        if (providerInfoM7454 == null) {
            throw new IllegalArgumentException(C0026.m4915(C0006.m1774(m8479(), 178, 52, 3259), str));
        }
        XmlResourceParser xmlResourceParserM3078 = C0013.m3078(providerInfoM7454, C0027.m5093(application), C0016.m3525(m8479(), 0, 35, 1750));
        if (xmlResourceParserM3078 == null) {
            throw new IllegalArgumentException(C0034.m6001(m8479(), 125, 53, 1635));
        }
        while (true) {
            int iM6031 = C0034.m6031(xmlResourceParserM3078);
            if (iM6031 == 1) {
                return c0306a;
            }
            if (iM6031 == 2) {
                String strM8319 = C0052.m8319(xmlResourceParserM3078);
                File fileM7985 = null;
                String strM4848 = C0025.m4848(xmlResourceParserM3078, null, C0001.m1189(m8479(), 35, 4, 2460));
                String strM48482 = C0025.m4848(xmlResourceParserM3078, null, C0061.m9361(m8479(), 39, 4, 2541));
                if (C0007.m1815(C0035.m6131(m8479(), 43, 10, 2873), strM8319)) {
                    fileM7985 = C0043.m7309(application);
                } else if (C0007.m1815(C0030.m5362(m8479(), 53, 13, 1416), strM8319)) {
                    fileM7985 = C0049.m7985();
                }
                if (fileM7985 == null) {
                    continue;
                } else {
                    String str2 = new String[]{strM48482}[0];
                    if (str2 != null) {
                        fileM7985 = new File(fileM7985, str2);
                    }
                    if (C0043.m7327(strM4848)) {
                        throw new IllegalArgumentException(C0023.m4536(m8479(), 103, 22, 2324));
                    }
                    try {
                        C0053.m8424(C0032.m5718(c0306a), strM4848, C0054.m8626(fileM7985));
                    } catch (IOException e) {
                        StringBuilder sb = new StringBuilder(C0000.m1077(m8479(), 66, 37, 1087));
                        C0016.m3605(sb, fileM7985);
                        throw new IllegalArgumentException(C0047.m7763(sb), e);
                    }
                }
            }
        }
    }

    /* renamed from: ۣ۟ۢۧۥ, reason: not valid java name and contains not printable characters */
    public static short[] m8479() {
        if (C0026.m4977() <= 0) {
            return f792short;
        }
        return null;
    }
}