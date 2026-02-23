package com.github.catvod.spider.merge.F;

import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

/* loaded from: classes.dex */
public class c {

    @SerializedName("user")
    private p a;

    @SerializedName("oauth")
    private i b;

    @SerializedName("drive")
    private g c;

    /* renamed from: ۟۠۟ۤ۠, reason: not valid java name and contains not printable characters */
    public static String m3796(Object obj, Object obj2) {
        if (C0036.m6252() >= 0) {
            return ((Gson) obj).toJson(obj2);
        }
        return null;
    }

    /* renamed from: ۣ۟ۤۨۤ, reason: not valid java name and contains not printable characters */
    public static g m3797(Object obj) {
        if (C0029.m5282() > 0) {
            return ((c) obj).c;
        }
        return null;
    }

    /* renamed from: ۥۣۡۥ, reason: contains not printable characters */
    public static i m3798(Object obj) {
        if (C0025.m4797() >= 0) {
            return ((c) obj).b;
        }
        return null;
    }

    /* renamed from: ۥۣۢۤ, reason: contains not printable characters */
    public static p m3799(Object obj) {
        if (C0009.m2047() >= 0) {
            return ((c) obj).a;
        }
        return null;
    }

    public final g a() {
        g gVarM3797 = m3797(this);
        return gVarM3797 == null ? new g() : gVarM3797;
    }

    public final i b() {
        i iVarM3798 = m3798(this);
        return iVarM3798 == null ? new i() : iVarM3798;
    }

    public final p c() {
        p pVarM3799 = m3799(this);
        return pVarM3799 == null ? new p() : pVarM3799;
    }

    public final void d(g gVar) {
        this.c = gVar;
        C0025.m4829(new b(0, this));
    }

    public final void e(i iVar) {
        this.b = iVar;
        C0025.m4829(new b(0, this));
    }

    public final void f(p pVar) {
        this.a = pVar;
        C0025.m4829(new b(0, this));
    }

    public final String toString() {
        return m3796(new Gson(), this);
    }
}