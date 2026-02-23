package com.github.catvod.spider.merge.H;

import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.google.gson.annotations.SerializedName;

/* loaded from: classes.dex */
public class b {

    @SerializedName("cookie")
    private String a;

    public b(String str) {
        this.a = str;
    }

    /* renamed from: ۡ۟ۡ۟, reason: not valid java name and contains not printable characters */
    public static String m4136(Object obj) {
        if (C0018.m3956() > 0) {
            return ((b) obj).a;
        }
        return null;
    }

    public final void a() {
        this.a = C0007.m1840();
    }

    public final String b() {
        return m4136(this);
    }
}