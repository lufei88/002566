package com.github.catvod.spider.merge.N;

import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

/* loaded from: classes.dex */
public class a {

    @SerializedName("user")
    private b a;

    /* renamed from: ۟۠ۤۦۢ, reason: not valid java name and contains not printable characters */
    public static String m4532(Object obj, Object obj2) {
        if (C0024.m4693() < 0) {
            return ((Gson) obj).toJson(obj2);
        }
        return null;
    }

    /* renamed from: ۡ۠ۥۣ, reason: not valid java name and contains not printable characters */
    public static b m4533(Object obj) {
        if (C0043.m7332() >= 0) {
            return ((a) obj).a;
        }
        return null;
    }

    public final b a() {
        b bVarM4533 = m4533(this);
        return bVarM4533 == null ? new b(C0007.m1840()) : bVarM4533;
    }

    public final void b(b bVar) {
        this.a = bVar;
        C0025.m4829(new com.github.catvod.spider.merge.F.b(4, this));
    }

    public final String toString() {
        return m4532(new Gson(), this);
    }
}