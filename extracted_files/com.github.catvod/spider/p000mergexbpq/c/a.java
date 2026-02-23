package com.github.catvod.spider.p000mergexbpq.c;

import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.c0.C0010;
import com.google.gson.annotations.SerializedName;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f175short = {1515};

    @SerializedName("type_id")
    private String a;

    @SerializedName("type_name")
    private String b;

    @SerializedName("type_flag")
    private String c = C0010.m2300(m2030(), 0, 1, 1498);

    public a(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    /* renamed from: ۟۟۟ۧ۟, reason: not valid java name and contains not printable characters */
    public static short[] m2030() {
        if (C0009.m2047() > 0) {
            return f175short;
        }
        return null;
    }

    /* renamed from: ۤۨۢ۟, reason: not valid java name and contains not printable characters */
    public static String m2031(Object obj) {
        if (C0028.m5152() < 0) {
            return ((a) obj).a;
        }
        return null;
    }

    public final String a() {
        return m2031(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            return C0007.m1815(m2031(this), m2031((a) obj));
        }
        return false;
    }
}