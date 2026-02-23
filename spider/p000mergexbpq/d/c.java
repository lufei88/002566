package com.github.catvod.spider.p000mergexbpq.d;

import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.N.C0023;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.merge.f0.C0052;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.r0.C0060;
import com.github.catvod.spider.merge.t.C0061;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.merge.z.C0065;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import com.github.catvod.spider.p000mergexbpq.x.C0015;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f196short = {1841, 731, 723, 687, 702, 702, 640, 687, 675, 683, 1838, 1827, 1830, 1846, 1850, 1825, 1808, 1835, 1853, 1830, 1849, 1834, 1453, 1468, 1468, 1417, 1442, 1464, 1470, 1453, 1442, 1455, 1449, 2389, 2375, 2368, 2511, 2517, 2539, 2505, 2500, 2511, 2506, 2499, 767, 760, 757, 746, 764, 530, 543, 528, 537, 2635, 2649, 2670, 2674, 2687, 1337, 1326, 1343, 1342, 1337, 1317, 1310, 1337, 1319, 2622, 2602, 2615, 2613, 2571, 2609, 2604, 2621, 2200, 2207, 455, 460, 479, 501, 452, 471, 452, 456, 470, 688, 703, 680, 690, 703, 688, 697, 683, 703, 697, 699, 964, 982, 915, 1021, 1008, 574, 561, 550, 512, 572, 561, 548, 566, 575, 546, 573, 1572, 1544, 1546, 1568, 1543, 1565, 1548, 1541, 1069, 1057, 1056, 1064, 1063, 1084, 1059, 1067, 1066};

    @SerializedName("data")
    private c a;

    @SerializedName("content")
    private c b;

    @SerializedName("t")
    private String c;

    @SerializedName("ck")
    private String d;

    @SerializedName("codeContent")
    private String e;

    @SerializedName("qrCodeStatus")
    private String f;

    @SerializedName("bizExt")
    private String g;

    public static c g(String str) {
        try {
            c cVar = (c) m2398(new Gson(), str, c.class);
            return cVar == null ? new c() : cVar;
        } catch (Exception unused) {
            return new c();
        }
    }

    /* renamed from: ۟ۢۡ۟ۦ, reason: not valid java name and contains not printable characters */
    public static c m2392(Object obj) {
        if (C0018.m3956() >= 0) {
            return ((c) obj).b;
        }
        return null;
    }

    /* renamed from: ۟ۢۧۤۡ, reason: not valid java name and contains not printable characters */
    public static String m2393(Object obj) {
        if (C0044.m7508() < 0) {
            return ((c) obj).e;
        }
        return null;
    }

    /* renamed from: ۣ۟ۧۦۣ, reason: not valid java name and contains not printable characters */
    public static c m2394(Object obj) {
        if (C0037.m6350() <= 0) {
            return ((c) obj).a;
        }
        return null;
    }

    /* renamed from: ۟ۧ۠ۧۢ, reason: not valid java name and contains not printable characters */
    public static a m2395(Object obj) {
        if (C0029.m5282() > 0) {
            return ((a) obj).a();
        }
        return null;
    }

    /* renamed from: ۠۠۠ۨ, reason: not valid java name and contains not printable characters */
    public static String m2396(Object obj) {
        if (C0060.m9355() > 0) {
            return ((c) obj).f;
        }
        return null;
    }

    /* renamed from: ۡ۠ۧۨ, reason: not valid java name and contains not printable characters */
    public static String m2397(Object obj) {
        if (C0052.m8320() > 0) {
            return ((c) obj).g;
        }
        return null;
    }

    /* renamed from: ۡۢۤۥ, reason: not valid java name and contains not printable characters */
    public static Object m2398(Object obj, Object obj2, Object obj3) {
        if (C0017.m3633() < 0) {
            return ((Gson) obj).fromJson((String) obj2, (Class) obj3);
        }
        return null;
    }

    /* renamed from: ۣۧۧۧ, reason: not valid java name and contains not printable characters */
    public static short[] m2399() {
        if (C0045.m7538() <= 0) {
            return f196short;
        }
        return null;
    }

    /* renamed from: ۥۣۦ, reason: contains not printable characters */
    public static String m2400(Object obj) {
        if (C0050.m8121() <= 0) {
            return ((a) obj).b();
        }
        return null;
    }

    /* renamed from: ۨۦۡۦ, reason: not valid java name and contains not printable characters */
    public static String m2401(Object obj) {
        if (C0020.m4210() <= 0) {
            return ((c) obj).c;
        }
        return null;
    }

    /* renamed from: ۨۧۥ, reason: not valid java name and contains not printable characters */
    public static String m2402(Object obj) {
        if (C0047.m7837() > 0) {
            return ((c) obj).d;
        }
        return null;
    }

    public final String a() {
        String strM2393 = m2393(this);
        return strM2393 == null ? C0007.m1840() : strM2393;
    }

    public final c b() {
        c cVarM2392 = m2392(this);
        return cVarM2392 == null ? new c() : cVarM2392;
    }

    public final c c() {
        c cVarM2394 = m2394(this);
        return cVarM2394 == null ? new c() : cVarM2394;
    }

    public final Map<String, String> d() {
        HashMap map = new HashMap();
        String strM2401 = m2401(this);
        String strM1840 = C0007.m1840();
        if (strM2401 == null) {
            strM2401 = strM1840;
        }
        C0053.m8424(map, C0053.m8477(m2399(), 0, 1, 1861), strM2401);
        String strM2402 = m2402(this);
        if (strM2402 == null) {
            strM2402 = strM1840;
        }
        C0053.m8424(map, C0015.m3484(m2399(), 1, 2, 696), strM2402);
        C0053.m8424(map, C0013.m3106(m2399(), 3, 7, 718), C0053.m8477(m2399(), 10, 12, 1871));
        C0053.m8424(map, C0030.m5362(m2399(), 22, 11, 1484), C0002.m1305(m2399(), 33, 3, 2338));
        C0053.m8424(map, C0061.m9361(m2399(), 36, 8, 2470), C0065.m9775(m2399(), 44, 5, 665));
        C0053.m8424(map, C0054.m8574(m2399(), 49, 4, 638), C0053.m8477(m2399(), 53, 5, 2609));
        C0053.m8424(map, C0048.m7902(m2399(), 58, 9, 1355), strM1840);
        C0053.m8424(map, C0026.m4951(m2399(), 67, 8, 2648), C0063.m9585(m2399(), 75, 2, 2221));
        C0053.m8424(map, C0024.m4740(m2399(), 77, 9, 421), strM1840);
        C0053.m8424(map, C0008.m1970(m2399(), 86, 11, 734), C0023.m4536(m2399(), 97, 5, 958));
        C0053.m8424(map, C0005.m1645(m2399(), 102, 11, 592), C0042.m7151(m2399(), 113, 8, 1641));
        return map;
    }

    public final String e() {
        String strM2397 = m2397(this);
        if (strM2397 == null) {
            strM2397 = C0007.m1840();
        }
        return m2400(m2395((a) m2398(new Gson(), new String(C0034.m5997(strM2397, 0)), a.class)));
    }

    public final boolean f() {
        String strM2396 = m2396(this);
        String strM1840 = C0007.m1840();
        if (strM2396 == null) {
            strM2396 = strM1840;
        }
        if (C0007.m1815(strM2396, C0003.m1398(m2399(), 121, 9, 1134))) {
            String strM2397 = m2397(this);
            if (strM2397 != null) {
                strM1840 = strM2397;
            }
            if (C0004.m1584(strM1840) > 0) {
                return true;
            }
        }
        return false;
    }
}