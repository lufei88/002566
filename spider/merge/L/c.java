package com.github.catvod.spider.merge.L;

import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.google.gson.annotations.SerializedName;

/* loaded from: classes.dex */
public class c {

    @SerializedName("cookie")
    private String a;

    public c(String str) {
        this.a = str;
    }

    /* renamed from: ۥۨۥۨ, reason: contains not printable characters */
    public static String m4503(Object obj) {
        if (C0004.m1557() < 0) {
            return ((c) obj).a;
        }
        return null;
    }

    public final void a() {
        this.a = C0007.m1840();
    }

    public final String b() {
        return m4503(this);
    }
}