package com.github.catvod.spider.merge.E;

import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.google.gson.annotations.SerializedName;

/* loaded from: classes.dex */
public class b {

    @SerializedName("type_id")
    private String a;

    @SerializedName("type_name")
    private String b;

    @SerializedName("type_flag")
    private String c;

    public b(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    /* renamed from: ۠ۤۤۧ, reason: not valid java name and contains not printable characters */
    public static String m3761(Object obj) {
        if (C0062.m9429() > 0) {
            return ((b) obj).a;
        }
        return null;
    }

    public final String a() {
        return m3761(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            return C0007.m1815(m3761(this), m3761((b) obj));
        }
        return false;
    }
}