package com.github.catvod.spider.merge.F;

import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.merge.z.C0065;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.c0.C0010;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import java.util.HashMap;

/* loaded from: classes.dex */
public class e {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f406short = {1458, 2122, 2114, 2479, 2494, 2494, 2432, 2479, 2467, 2475, 555, 550, 547, 563, 575, 548, 533, 558, 568, 547, 572, 559, 1424, 1409, 1409, 1460, 1439, 1413, 1411, 1424, 1439, 1426, 1428, 767, 749, 746, 2339, 2361, 2311, 2341, 2344, 2339, 2342, 2351, 2454, 2449, 2460, 2435, 2453, 2729, 2724, 2731, 2722, 3034, 3016, 3071, 3043, 3054, 3285, 3266, 3283, 3282, 3285, 3273, 3314, 3285, 3275, 1647, 1659, 1638, 1636, 1626, 1632, 1661, 1644, 3326, 3321, 3242, 3233, 3250, 3224, 3241, 3258, 3241, 3237, 3259, 525, 514, 533, 527, 514, 525, 516, 534, 514, 516, 518, 2670, 2684, 2617, 2647, 2650, 2872, 2871, 2848, 2822, 2874, 2871, 2850, 2864, 2873, 2852, 2875, 1164, 1184, 1186, 1160, 1199, 1205, 1188, 1197, 1604, 1608, 1609, 1601, 1614, 1621, 1610, 1602, 1603};

    @SerializedName("data")
    private e a;

    @SerializedName("content")
    private e b;

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

    public static e g(String str) {
        try {
            e eVar = (e) m3807(new Gson(), str, e.class);
            return eVar == null ? new e() : eVar;
        } catch (Exception unused) {
            return new e();
        }
    }

    /* renamed from: ۟ۡۦۥۤ, reason: not valid java name and contains not printable characters */
    public static String m3802(Object obj) {
        if (C0041.m6823() < 0) {
            return ((e) obj).g;
        }
        return null;
    }

    /* renamed from: ۟ۢۤۦۧ, reason: not valid java name and contains not printable characters */
    public static String m3803(Object obj) {
        if (C0036.m6252() > 0) {
            return ((e) obj).d;
        }
        return null;
    }

    /* renamed from: ۟ۤ۟ۦ, reason: not valid java name and contains not printable characters */
    public static String m3804(Object obj) {
        if (C0017.m3633() <= 0) {
            return ((e) obj).e;
        }
        return null;
    }

    /* renamed from: ۟ۤۤۤۦ, reason: not valid java name and contains not printable characters */
    public static e m3805(Object obj) {
        if (C0041.m6823() <= 0) {
            return ((e) obj).a;
        }
        return null;
    }

    /* renamed from: ۟ۧۥۧۦ, reason: not valid java name and contains not printable characters */
    public static String m3806(Object obj) {
        if (C0048.m7971() >= 0) {
            return ((e) obj).c;
        }
        return null;
    }

    /* renamed from: ۢۢۤۧ, reason: not valid java name and contains not printable characters */
    public static Object m3807(Object obj, Object obj2, Object obj3) {
        if (C0053.m8389() >= 0) {
            return ((Gson) obj).fromJson((String) obj2, (Class) obj3);
        }
        return null;
    }

    /* renamed from: ۣۣۣ۠, reason: not valid java name and contains not printable characters */
    public static String m3808(Object obj) {
        if (C0042.m7147() < 0) {
            return ((e) obj).f;
        }
        return null;
    }

    /* renamed from: ۦۥۧۥ, reason: contains not printable characters */
    public static e m3809(Object obj) {
        if (C0063.m9589() <= 0) {
            return ((e) obj).b;
        }
        return null;
    }

    /* renamed from: ۨ۠ۥۣ, reason: not valid java name and contains not printable characters */
    public static short[] m3810() {
        if (C0000.m1116() <= 0) {
            return f406short;
        }
        return null;
    }

    public final String a() {
        String strM3802 = m3802(this);
        return strM3802 == null ? C0007.m1840() : strM3802;
    }

    public final String b() {
        String strM3804 = m3804(this);
        return strM3804 == null ? C0007.m1840() : strM3804;
    }

    public final e c() {
        e eVarM3809 = m3809(this);
        return eVarM3809 == null ? new e() : eVarM3809;
    }

    public final e d() {
        e eVarM3805 = m3805(this);
        return eVarM3805 == null ? new e() : eVarM3805;
    }

    public final HashMap e() {
        HashMap map = new HashMap();
        String strM3806 = m3806(this);
        String strM1840 = C0007.m1840();
        if (strM3806 == null) {
            strM3806 = strM1840;
        }
        C0053.m8424(map, C0064.m9599(m3810(), 0, 1, 1478), strM3806);
        String strM3803 = m3803(this);
        if (strM3803 == null) {
            strM3803 = strM1840;
        }
        C0053.m8424(map, C0053.m8477(m3810(), 1, 2, 2089), strM3803);
        C0053.m8424(map, C0054.m8574(m3810(), 3, 7, 2510), C0047.m7833(m3810(), 10, 12, 586));
        C0053.m8424(map, C0055.m8814(m3810(), 22, 11, 1521), C0026.m4951(m3810(), 33, 3, 648));
        C0053.m8424(map, C0065.m9775(m3810(), 36, 8, 2378), C0047.m7833(m3810(), 44, 5, 2544));
        C0053.m8424(map, C0009.m2037(m3810(), 49, 4, 2757), C0019.m4107(m3810(), 53, 5, 2976));
        C0053.m8424(map, C0027.m5062(m3810(), 58, 9, 3239), strM1840);
        C0053.m8424(map, C0047.m7833(m3810(), 67, 8, 1545), C0055.m8814(m3810(), 75, 2, 3275));
        C0053.m8424(map, C0010.m2300(m3810(), 77, 9, 3272), strM1840);
        C0053.m8424(map, C0055.m8814(m3810(), 86, 11, 611), C0007.m1842(m3810(), 97, 5, 2580));
        C0053.m8424(map, C0064.m9599(m3810(), 102, 11, 2902), C0005.m1645(m3810(), 113, 8, 1217));
        return map;
    }

    public final boolean f() {
        String strM3808 = m3808(this);
        if (strM3808 == null) {
            strM3808 = C0007.m1840();
        }
        return C0007.m1815(strM3808, C0025.m4795(m3810(), 121, 9, 1543)) && C0004.m1584(C0063.m9533(this)) > 0;
    }
}