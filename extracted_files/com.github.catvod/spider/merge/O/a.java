package com.github.catvod.spider.merge.O;

import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

/* loaded from: classes.dex */
public class a {

    @SerializedName("user")
    private c a;

    /* renamed from: ۣۣ۟۠۟, reason: not valid java name and contains not printable characters */
    public static String m4622(Object obj, Object obj2) {
        if (C0020.m4210() <= 0) {
            return ((Gson) obj).toJson(obj2);
        }
        return null;
    }

    /* renamed from: ۟ۦۢۢ, reason: not valid java name and contains not printable characters */
    public static c m4623(Object obj) {
        if (C0011.m2755() >= 0) {
            return ((a) obj).a;
        }
        return null;
    }

    public final c a() {
        c cVarM4623 = m4623(this);
        return cVarM4623 == null ? new c(C0007.m1840()) : cVarM4623;
    }

    public final void b(c cVar) {
        this.a = cVar;
        C0025.m4829(new com.github.catvod.spider.merge.F.b(5, this));
    }

    public final String toString() {
        return m4622(new Gson(), this);
    }
}