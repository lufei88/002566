package com.github.catvod.spider.merge.K;

import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

/* loaded from: classes.dex */
public class a {

    @SerializedName("user")
    private b a;

    /* renamed from: ۟۠ۧ۟ۤ, reason: not valid java name and contains not printable characters */
    public static b m4387(Object obj) {
        if (C0036.m6252() > 0) {
            return ((a) obj).a;
        }
        return null;
    }

    /* renamed from: ۦ۠ۥۣ, reason: contains not printable characters */
    public static String m4388(Object obj, Object obj2) {
        if (C0055.m8740() > 0) {
            return ((Gson) obj).toJson(obj2);
        }
        return null;
    }

    public final b a() {
        b bVarM4387 = m4387(this);
        return bVarM4387 == null ? new b(C0007.m1840()) : bVarM4387;
    }

    public final void b(b bVar) {
        this.a = bVar;
        C0025.m4829(new com.github.catvod.spider.merge.F.b(2, this));
    }

    public final String toString() {
        return m4388(new Gson(), this);
    }
}