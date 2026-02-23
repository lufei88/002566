package com.github.catvod.spider.merge.H;

import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

/* loaded from: classes.dex */
public class a {

    @SerializedName("user")
    private b a;

    /* renamed from: ۟ۦۧۤ۟, reason: not valid java name and contains not printable characters */
    public static b m4134(Object obj) {
        if (C0050.m8121() < 0) {
            return ((a) obj).a;
        }
        return null;
    }

    /* renamed from: ۡ۠ۨۥ, reason: not valid java name and contains not printable characters */
    public static String m4135(Object obj, Object obj2) {
        if (C0027.m5017() >= 0) {
            return ((Gson) obj).toJson(obj2);
        }
        return null;
    }

    public final b a() {
        b bVarM4134 = m4134(this);
        return bVarM4134 == null ? new b(C0007.m1840()) : bVarM4134;
    }

    public final void b(b bVar) {
        this.a = bVar;
        C0025.m4829(new com.github.catvod.spider.merge.F.b(1, this));
    }

    public final String toString() {
        return m4135(new Gson(), this);
    }
}