package com.github.catvod.spider.p000mergexbpq.d;

import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0040;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.r0.C0060;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.github.catvod.spider.p000mergexbpq.c0.C0010;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f197short = {837, 3266, 1281};

    @SerializedName("items")
    private List<e> a;

    @SerializedName("next_marker")
    private String b;

    @SerializedName("file_id")
    private String c;

    @SerializedName("share_id")
    private String d;

    @SerializedName("name")
    private String e;

    @SerializedName("type")
    private String f;

    @SerializedName("file_extension")
    private String g;

    @SerializedName("category")
    private String h;

    @SerializedName("size")
    private double i;

    @SerializedName("parent")
    private String j;

    public e(String str) {
        this.c = str;
    }

    /* renamed from: ۣ۟ۦۡ۠, reason: not valid java name and contains not printable characters */
    public static String m2403(Object obj) {
        if (C0001.m1164() < 0) {
            return ((e) obj).e;
        }
        return null;
    }

    /* renamed from: ۟ۤۨۦۡ, reason: not valid java name and contains not printable characters */
    public static String m2404(Object obj) {
        if (C0010.m2320() < 0) {
            return ((e) obj).f;
        }
        return null;
    }

    /* renamed from: ۟ۥۣۡۤ, reason: not valid java name and contains not printable characters */
    public static String m2405(Object obj) {
        if (C0060.m9355() >= 0) {
            return ((e) obj).h;
        }
        return null;
    }

    /* renamed from: ۟ۦۤۦۣ, reason: not valid java name and contains not printable characters */
    public static String m2406(Object obj) {
        if (C0051.m8216() < 0) {
            return ((e) obj).b;
        }
        return null;
    }

    /* renamed from: ۡۨۥ۟, reason: not valid java name and contains not printable characters */
    public static double m2407(Object obj) {
        if (C0043.m7332() >= 0) {
            return ((e) obj).i;
        }
        return 0.0d;
    }

    /* renamed from: ۢۨۢۥ, reason: not valid java name and contains not printable characters */
    public static String m2408(Object obj) {
        if (C0007.m1886() >= 0) {
            return ((e) obj).g;
        }
        return null;
    }

    /* renamed from: ۤ۟ۧۦ, reason: not valid java name and contains not printable characters */
    public static String m2409(Object obj) {
        if (C0012.m3024() >= 0) {
            return ((e) obj).j;
        }
        return null;
    }

    /* renamed from: ۥۧۧۢ, reason: contains not printable characters */
    public static List m2410(Object obj) {
        if (C0001.m1164() <= 0) {
            return ((e) obj).a;
        }
        return null;
    }

    /* renamed from: ۣۨ۟ۦ, reason: not valid java name and contains not printable characters */
    public static short[] m2411() {
        if (C0044.m7508() < 0) {
            return f197short;
        }
        return null;
    }

    /* renamed from: ۨۤۢۦ, reason: not valid java name and contains not printable characters */
    public static String m2412(Object obj) {
        if (C0054.m8557() <= 0) {
            return ((e) obj).c;
        }
        return null;
    }

    public final String a() {
        return C0043.m7327(m2405(this)) ? C0007.m1840() : m2405(this);
    }

    public final String b() {
        String[] strArr = new String[3];
        boolean zM7327 = C0043.m7327(m2409(this));
        String strM1840 = C0007.m1840();
        String strM4107 = C0019.m4107(m2411(), 0, 1, 792);
        String strM5256 = C0029.m5256(m2411(), 1, 1, 3225);
        strArr[0] = zM7327 ? strM1840 : C0040.m6629(C0042.m7166(strM5256), m2409(this), strM4107);
        strArr[1] = C0064.m9601(this);
        if (m2407(this) != 0.0d) {
            StringBuilder sbM7166 = C0042.m7166(strM5256);
            C0018.m3933(sbM7166, C0058.m9124(m2407(this)));
            C0018.m3933(sbM7166, strM4107);
            strM1840 = C0047.m7763(sbM7166);
        }
        strArr[2] = strM1840;
        return C0064.m9640(C0036.m6194(C0004.m1549(m2411(), 2, 1, 1313), C0001.m1203(strArr)));
    }

    public final String c() {
        return C0043.m7327(m2408(this)) ? C0007.m1840() : m2408(this);
    }

    public final String d() {
        return C0043.m7327(m2412(this)) ? C0007.m1840() : m2412(this);
    }

    public final List<e> e() {
        List<e> listM2410 = m2410(this);
        return listM2410 == null ? C0008.m1961() : listM2410;
    }

    public final String f() {
        return C0043.m7327(m2403(this)) ? C0007.m1840() : m2403(this);
    }

    public final String g() {
        return C0043.m7327(m2406(this)) ? C0007.m1840() : m2406(this);
    }

    public final String h() {
        return C0043.m7327(m2404(this)) ? C0007.m1840() : m2404(this);
    }

    public final e i(String str) {
        this.j = str;
        return this;
    }
}