package com.github.catvod.spider.merge.P;

import com.github.catvod.spider.merge.r0.C0059;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.google.gson.annotations.SerializedName;

/* loaded from: classes.dex */
public class b {

    @SerializedName("cookie")
    private String a;

    public b(String str) {
        this.a = str;
    }

    /* renamed from: ۥۨ۟ۢ, reason: contains not printable characters */
    public static String m4628(Object obj) {
        if (C0059.m9257() <= 0) {
            return ((b) obj).a;
        }
        return null;
    }

    public final void a() {
        this.a = C0007.m1840();
    }

    public final String b() {
        return m4628(this);
    }
}