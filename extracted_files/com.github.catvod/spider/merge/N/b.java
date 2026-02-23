package com.github.catvod.spider.merge.N;

import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.google.gson.annotations.SerializedName;

/* loaded from: classes.dex */
public class b {

    @SerializedName("cookie")
    private String a;

    public b(String str) {
        this.a = str;
    }

    /* renamed from: ۟۟ۥۥ۟, reason: not valid java name and contains not printable characters */
    public static String m4534(Object obj) {
        if (C0049.m8038() <= 0) {
            return ((b) obj).a;
        }
        return null;
    }

    public final void a() {
        this.a = C0007.m1840();
    }

    public final String b() {
        return m4534(this);
    }
}