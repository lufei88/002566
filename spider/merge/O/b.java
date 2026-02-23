package com.github.catvod.spider.merge.O;

import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.r0.C0060;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.a0.C0006;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.c0.C0010;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import java.util.Map;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f472short = {905, 902, 907, 934, 929, 954, 958, 944, 955, 2147, 2168, 2161, 2146, 2165, 2127, 2166, 2169, 2164, 2127, 2148, 2175, 2171, 2165, 2174, 1715, 1701, 1714, 1705, 1701, 1715, 1695, 1705, 1700, 1817, 1814, 1811, 1818, 1824, 1809, 1822, 1810, 1818, 1498, 1495, 1503, 1514, 1494, 1492, 1473, 1488, 1490, 1498, 1479, 1484, 1174, 1183, 1154, 1181, 1169, 1156, 1199, 1156, 1161, 1152, 1173, 1365, 1359, 1372, 1347, 1085, 1065, 1060, 1087, 1042, 1067, 1060, 1065, 2795, 2790, 2804, 2803, 2776, 2802, 2807, 2787, 2790, 2803, 2786, 2776, 2790, 2803, 421, 2040, 2924, 2924};
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public Double f;
    public int g;

    public b() {
        String strM1840 = C0007.m1840();
        this.a = strM1840;
        this.b = strM1840;
        this.c = strM1840;
        this.d = strM1840;
        this.e = strM1840;
        this.f = C0013.m3079(0.0d);
        this.g = 0;
    }

    public static b b(String str, Map map) {
        b bVar = new b();
        String strM8131 = C0050.m8131(m4624(), 0, 3, 1007);
        Object objM9431 = C0062.m9431(map, strM8131);
        String strM1840 = C0007.m1840();
        bVar.a = objM9431 != null ? (String) C0062.m9431(map, strM8131) : strM1840;
        bVar.b = str;
        String strM1774 = C0006.m1774(m4624(), 3, 6, 981);
        bVar.c = C0062.m9431(map, strM1774) != null ? (String) C0062.m9431(map, strM1774) : strM1840;
        String strM1842 = C0007.m1842(m4624(), 9, 15, 2064);
        bVar.d = C0062.m9431(map, strM1842) != null ? (String) C0062.m9431(map, strM1842) : strM1840;
        String strM4795 = C0025.m4795(m4624(), 24, 9, 1728);
        if (C0062.m9431(map, strM4795) != null) {
        }
        String strM8978 = C0057.m8978(m4624(), 33, 9, 1919);
        if (C0062.m9431(map, strM8978) != null) {
            strM1840 = (String) C0062.m9431(map, strM8978);
        }
        bVar.e = strM1840;
        String strM4951 = C0026.m4951(m4624(), 42, 12, 1461);
        if (C0062.m9431(map, strM4951) != null) {
        }
        String strM5708 = C0032.m5708(m4624(), 54, 11, 1264);
        if (C0062.m9431(map, strM5708) != null) {
        }
        String strM7902 = C0048.m7902(m4624(), 65, 4, 1318);
        bVar.f = C0013.m3079(C0062.m9431(map, strM7902) != null ? C0032.m5676((Double) C0062.m9431(map, strM7902)) : 0.0d);
        String strM2973 = C0012.m2973(m4624(), 69, 8, 1101);
        if (C0062.m9431(map, strM2973) != null) {
        }
        String strM81312 = C0050.m8131(m4624(), 77, 14, 2695);
        if (C0062.m9431(map, strM81312) != null) {
        }
        bVar.g = 1;
        return bVar;
    }

    /* renamed from: ۟ۤۨۤۡ, reason: not valid java name and contains not printable characters */
    public static short[] m4624() {
        if (C0024.m4693() <= 0) {
            return f472short;
        }
        return null;
    }

    public final String a() {
        boolean zM8953 = C0057.m8953(C0055.m8700(this));
        String strM1840 = C0007.m1840();
        StringBuilder sbM3016 = C0012.m3016(zM8953 ? strM1840 : C0055.m8700(this), C0010.m2300(m4624(), 91, 1, 389));
        C0018.m3933(sbM3016, C0051.m8193(C0032.m5676(C0026.m4883(this))));
        String strM7763 = C0047.m7763(sbM3016);
        StringBuilder sbM30162 = C0012.m3016(strM7763, C0048.m7902(m4624(), 92, 1, 2012));
        if (!C0057.m8953(C0048.m7956(this))) {
            strM1840 = C0048.m7956(this);
        }
        C0018.m3933(sbM30162, strM1840);
        String strM9352 = C0060.m9352(m4624(), 93, 2, 2887);
        C0018.m3933(sbM30162, strM9352);
        C0018.m3933(sbM30162, C0038.m6448(this));
        C0018.m3933(sbM30162, strM9352);
        C0018.m3933(sbM30162, C0003.m1377(this));
        C0018.m3933(sbM30162, strM9352);
        return C0038.m6434(sbM30162, C0027.m4998(this), strM9352, strM7763);
    }
}