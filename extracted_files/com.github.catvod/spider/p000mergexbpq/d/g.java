package com.github.catvod.spider.p000mergexbpq.d;

import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f199short = {1679};

    @SerializedName("default_drive_id")
    private String a;

    @SerializedName("user_id")
    private String b;

    @SerializedName("token_type")
    private String c;

    @SerializedName("access_token")
    private String d;

    @SerializedName("refresh_token")
    private String e;

    public static g f(String str) {
        g gVar = (g) m2422(new Gson(), str, g.class);
        return gVar == null ? new g() : gVar;
    }

    /* renamed from: ۟ۡۡۢ, reason: not valid java name and contains not printable characters */
    public static String m2419(Object obj) {
        if (C0016.m3596() <= 0) {
            return ((g) obj).d;
        }
        return null;
    }

    /* renamed from: ۟ۤۡۦ۟, reason: not valid java name and contains not printable characters */
    public static String m2420(Object obj) {
        if (C0038.m6471() >= 0) {
            return ((g) obj).a;
        }
        return null;
    }

    /* renamed from: ۟ۤۦۣۤ, reason: not valid java name and contains not printable characters */
    public static short[] m2421() {
        if (C0045.m7538() <= 0) {
            return f199short;
        }
        return null;
    }

    /* renamed from: ۦ۟ۨ, reason: contains not printable characters */
    public static Object m2422(Object obj, Object obj2, Object obj3) {
        if (C0007.m1886() > 0) {
            return ((Gson) obj).fromJson((String) obj2, (Class) obj3);
        }
        return null;
    }

    /* renamed from: ۦۥ۠ۨ, reason: contains not printable characters */
    public static String m2423(Object obj) {
        if (C0011.m2755() >= 0) {
            return ((g) obj).e;
        }
        return null;
    }

    /* renamed from: ۧۢ۟ۤ, reason: not valid java name and contains not printable characters */
    public static String m2424(Object obj, Object obj2) {
        if (C0058.m9131() <= 0) {
            return ((Gson) obj).toJson(obj2);
        }
        return null;
    }

    /* renamed from: ۨۡۤۦ, reason: not valid java name and contains not printable characters */
    public static String m2425(Object obj) {
        if (C0057.m9017() >= 0) {
            return ((g) obj).c;
        }
        return null;
    }

    public final g a() {
        String strM1840 = C0007.m1840();
        this.e = strM1840;
        this.d = strM1840;
        return this;
    }

    public final String b() {
        return C0043.m7327(m2419(this)) ? C0007.m1840() : m2419(this);
    }

    public final String c() {
        StringBuilder sb = new StringBuilder();
        boolean zM7327 = C0043.m7327(m2425(this));
        String strM1840 = C0007.m1840();
        C0018.m3933(sb, zM7327 ? strM1840 : m2425(this));
        C0018.m3933(sb, C0026.m4951(m2421(), 0, 1, 1711));
        if (!C0043.m7327(m2419(this))) {
            strM1840 = m2419(this);
        }
        C0018.m3933(sb, strM1840);
        return C0047.m7763(sb);
    }

    public final String d() {
        return C0043.m7327(m2420(this)) ? C0007.m1840() : m2420(this);
    }

    public final String e() {
        return C0043.m7327(m2423(this)) ? C0007.m1840() : m2423(this);
    }

    public final g g() {
        C0029.m5207(C0051.m8218(C0004.m1555()), C0024.m4672(this));
        return this;
    }

    public final void h(String str) {
        this.e = str;
    }

    public final String toString() {
        return m2424(new Gson(), this);
    }
}