package com.github.catvod.spider.merge.L;

import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.t.C0061;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

/* loaded from: classes.dex */
public class a {

    @SerializedName("user")
    private c a;

    /* renamed from: ۟ۥۥۦۣ, reason: not valid java name and contains not printable characters */
    public static String m4500(Object obj, Object obj2) {
        if (C0004.m1557() <= 0) {
            return ((Gson) obj).toJson(obj2);
        }
        return null;
    }

    /* renamed from: ۦۧۨۧ, reason: contains not printable characters */
    public static c m4501(Object obj) {
        if (C0061.m9359() < 0) {
            return ((a) obj).a;
        }
        return null;
    }

    public final c a() {
        c cVarM4501 = m4501(this);
        return cVarM4501 == null ? new c(C0007.m1840()) : cVarM4501;
    }

    public final void b(c cVar) {
        this.a = cVar;
        C0025.m4829(new com.github.catvod.spider.merge.F.b(3, this));
    }

    public final String toString() {
        return m4500(new Gson(), this);
    }
}