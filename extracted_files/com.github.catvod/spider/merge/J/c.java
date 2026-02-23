package com.github.catvod.spider.merge.J;

import com.github.catvod.spider.merge.E.i;
import com.github.catvod.spider.merge.E.m;
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.Z.C0040;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.github.catvod.spider.p000mergexbpq.x.C0015;
import com.google.gson.annotations.SerializedName;

/* loaded from: classes.dex */
public class c {

    @SerializedName("name")
    private String a;

    @SerializedName("url")
    private String b;

    @SerializedName("icon")
    private String c;

    @SerializedName("copy")
    private String d;

    @SerializedName("version")
    private String e;

    public c(String str) {
        this.b = str;
    }

    /* renamed from: ۣ۟۟ۧۢ, reason: not valid java name and contains not printable characters */
    public static String m4293(Object obj) {
        if (C0049.m8038() < 0) {
            return ((c) obj).d;
        }
        return null;
    }

    /* renamed from: ۟۠۠۟ۡ, reason: not valid java name and contains not printable characters */
    public static String m4294(Object obj) {
        if (C0029.m5282() > 0) {
            return ((c) obj).c;
        }
        return null;
    }

    /* renamed from: ۟۠ۨۧ۠, reason: not valid java name and contains not printable characters */
    public static String m4295(Object obj) {
        if (C0008.m1975() > 0) {
            return ((c) obj).a;
        }
        return null;
    }

    /* renamed from: ۟ۧۥۧ۠, reason: not valid java name and contains not printable characters */
    public static String m4296(Object obj) {
        if (C0056.m8886() < 0) {
            return ((c) obj).b;
        }
        return null;
    }

    /* renamed from: ۣۢۦۧ, reason: not valid java name and contains not printable characters */
    public static String m4297(Object obj) {
        if (C0040.m6582() >= 0) {
            return ((c) obj).e;
        }
        return null;
    }

    public final String a() {
        return C0043.m7327(m4293(this)) ? C0007.m1840() : m4293(this);
    }

    public final m b() {
        boolean zM7327 = C0043.m7327(m4295(this));
        String strM1840 = C0007.m1840();
        return new m(zM7327 ? strM1840 : m4295(this), C0043.m7327(m4294(this)) ? strM1840 : m4294(this), C0043.m7327(m4297(this)) ? strM1840 : m4297(this), new i(C0015.m3472(1.0f)), C0043.m7327(m4296(this)) ? strM1840 : m4296(this));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        boolean zM7327 = C0043.m7327(m4296(this));
        String strM1840 = C0007.m1840();
        String strM4296 = zM7327 ? strM1840 : m4296(this);
        if (!C0043.m7327(m4296(cVar))) {
            strM1840 = m4296(cVar);
        }
        return C0007.m1815(strM4296, strM1840);
    }
}