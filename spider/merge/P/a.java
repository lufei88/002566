package com.github.catvod.spider.merge.P;

import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

/* loaded from: classes.dex */
public class a {

    @SerializedName("user")
    private b a;

    /* renamed from: ۟ۤۨ۟ۢ, reason: not valid java name and contains not printable characters */
    public static String m4626(Object obj, Object obj2) {
        if (C0041.m6823() <= 0) {
            return ((Gson) obj).toJson(obj2);
        }
        return null;
    }

    /* renamed from: ۨۤۢۥ, reason: not valid java name and contains not printable characters */
    public static b m4627(Object obj) {
        if (C0029.m5282() > 0) {
            return ((a) obj).a;
        }
        return null;
    }

    public final b a() {
        b bVarM4627 = m4627(this);
        return bVarM4627 == null ? new b(C0007.m1840()) : bVarM4627;
    }

    public final void b(b bVar) {
        this.a = bVar;
        C0025.m4829(new com.github.catvod.spider.merge.F.b(6, this));
    }

    public final String toString() {
        return m4626(new Gson(), this);
    }
}