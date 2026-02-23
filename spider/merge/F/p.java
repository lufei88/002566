package com.github.catvod.spider.merge.F;

import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.google.gson.annotations.SerializedName;

/* loaded from: classes.dex */
public class p {

    @SerializedName("token_type")
    private String a;

    @SerializedName("access_token")
    private String b;

    @SerializedName("refresh_token")
    private String c;

    /* renamed from: ۟۟ۧ۟ۤ, reason: not valid java name and contains not printable characters */
    public static String m3843(Object obj) {
        if (C0050.m8121() <= 0) {
            return ((p) obj).a;
        }
        return null;
    }

    /* renamed from: ۟ۢۥۦۦ, reason: not valid java name and contains not printable characters */
    public static String m3844(Object obj) {
        if (C0000.m1116() < 0) {
            return ((p) obj).c;
        }
        return null;
    }

    /* renamed from: ۣۢۢۨ, reason: not valid java name and contains not printable characters */
    public static String m3845(Object obj) {
        if (C0007.m1886() >= 0) {
            return ((p) obj).b;
        }
        return null;
    }

    public final void a() {
        String strM1840 = C0007.m1840();
        this.c = strM1840;
        this.b = strM1840;
    }

    public final String b() {
        return C0043.m7327(m3845(this)) ? C0007.m1840() : m3845(this);
    }

    public final String c() {
        return C0043.m7327(m3844(this)) ? C0007.m1840() : m3844(this);
    }

    public final String d() {
        return C0043.m7327(m3843(this)) ? C0007.m1840() : m3843(this);
    }

    public final void e(String str) {
        this.c = str;
    }
}