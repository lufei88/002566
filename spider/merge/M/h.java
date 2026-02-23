package com.github.catvod.spider.merge.M;

import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.r0.C0060;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.google.gson.annotations.SerializedName;

/* loaded from: classes.dex */
public class h {

    @SerializedName("purl")
    private String a;

    @SerializedName("eporder")
    private int b;

    /* renamed from: ۦۤ۠۠, reason: contains not printable characters */
    public static int m4528(Object obj) {
        if (C0060.m9355() >= 0) {
            return ((h) obj).b;
        }
        return 0;
    }

    /* renamed from: ۣۣۣۧ, reason: not valid java name and contains not printable characters */
    public static String m4529(Object obj) {
        if (C0028.m5152() < 0) {
            return ((h) obj).a;
        }
        return null;
    }

    public final int a() {
        return m4528(this);
    }

    public final String b() {
        return C0043.m7327(m4529(this)) ? C0007.m1840() : m4529(this);
    }
}