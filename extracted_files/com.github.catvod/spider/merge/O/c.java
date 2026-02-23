package com.github.catvod.spider.merge.O;

import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.google.gson.annotations.SerializedName;

/* loaded from: classes.dex */
public class c {

    @SerializedName("cookie")
    private String a;

    public c(String str) {
        this.a = str;
    }

    /* renamed from: ۢۢۦۧ, reason: not valid java name and contains not printable characters */
    public static String m4625(Object obj) {
        if (C0024.m4693() <= 0) {
            return ((c) obj).a;
        }
        return null;
    }

    public final void a() {
        this.a = C0007.m1840();
    }

    public final String b() {
        return m4625(this);
    }
}