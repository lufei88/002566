package com.github.catvod.spider.p000mergexbpq.d;

import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.a0.C0006;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f198short = {3131};

    @SerializedName("token_type")
    private String a;

    @SerializedName("access_token")
    private String b;

    @SerializedName("refresh_token")
    private String c;

    public static f d(String str) {
        f fVar = (f) m2417(new Gson(), str, f.class);
        return fVar == null ? new f() : fVar;
    }

    /* renamed from: ۣۣ۟۠ۥ, reason: not valid java name and contains not printable characters */
    public static String m2413(Object obj) {
        if (C0058.m9131() < 0) {
            return ((f) obj).b;
        }
        return null;
    }

    /* renamed from: ۟ۡۧۧ۟, reason: not valid java name and contains not printable characters */
    public static short[] m2414() {
        if (C0039.m6529() <= 0) {
            return f198short;
        }
        return null;
    }

    /* renamed from: ۟ۧۡۨۥ, reason: not valid java name and contains not printable characters */
    public static String m2415(Object obj) {
        if (C0054.m8557() <= 0) {
            return ((f) obj).a;
        }
        return null;
    }

    /* renamed from: ۡ۠۟ۤ, reason: not valid java name and contains not printable characters */
    public static String m2416(Object obj) {
        if (C0013.m3167() >= 0) {
            return ((f) obj).c;
        }
        return null;
    }

    /* renamed from: ۢۨۧ۟, reason: not valid java name and contains not printable characters */
    public static Object m2417(Object obj, Object obj2, Object obj3) {
        if (C0058.m9131() <= 0) {
            return ((Gson) obj).fromJson((String) obj2, (Class) obj3);
        }
        return null;
    }

    /* renamed from: ۣۡۧۧ, reason: not valid java name and contains not printable characters */
    public static String m2418(Object obj, Object obj2) {
        if (C0006.m1726() < 0) {
            return ((Gson) obj).toJson(obj2);
        }
        return null;
    }

    public final f a() {
        String strM1840 = C0007.m1840();
        this.c = strM1840;
        this.b = strM1840;
        return this;
    }

    public final String b() {
        StringBuilder sb = new StringBuilder();
        boolean zM7327 = C0043.m7327(m2415(this));
        String strM1840 = C0007.m1840();
        C0018.m3933(sb, zM7327 ? strM1840 : m2415(this));
        C0018.m3933(sb, C0030.m5362(m2414(), 0, 1, 3099));
        if (!C0043.m7327(m2413(this))) {
            strM1840 = m2413(this);
        }
        C0018.m3933(sb, strM1840);
        return C0047.m7763(sb);
    }

    public final String c() {
        return C0043.m7327(m2416(this)) ? C0007.m1840() : m2416(this);
    }

    public final f e() {
        C0029.m5207(C0032.m5693(C0004.m1555()), C0043.m7363(this));
        return this;
    }

    public final String toString() {
        return m2418(new Gson(), this);
    }
}