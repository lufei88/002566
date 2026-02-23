package com.github.catvod.spider.merge.M;

import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.google.gson.annotations.SerializedName;

/* loaded from: classes.dex */
public class f {

    @SerializedName("id")
    private int a;

    @SerializedName("name")
    private String b;

    /* renamed from: ۟۟ۦۤۢ, reason: not valid java name and contains not printable characters */
    public static String m4526(Object obj) {
        if (C0054.m8557() <= 0) {
            return ((f) obj).b;
        }
        return null;
    }

    public final String a() {
        return C0043.m7327(m4526(this)) ? C0007.m1840() : m4526(this);
    }
}