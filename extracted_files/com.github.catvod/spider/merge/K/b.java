package com.github.catvod.spider.merge.K;

import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import com.google.gson.annotations.SerializedName;

/* loaded from: classes.dex */
public class b {

    @SerializedName("cookie")
    private String a;

    public b(String str) {
        this.a = str;
    }

    /* renamed from: ۟۠ۧۦۦ, reason: not valid java name and contains not printable characters */
    public static String m4389(Object obj) {
        if (C0013.m3167() > 0) {
            return ((b) obj).a;
        }
        return null;
    }

    public final void a() {
        this.a = C0007.m1840();
    }

    public final String b() {
        return m4389(this);
    }
}