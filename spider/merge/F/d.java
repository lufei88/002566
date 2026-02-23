package com.github.catvod.spider.merge.F;

import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import com.google.gson.annotations.SerializedName;

/* loaded from: classes.dex */
public class d {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f405short = {998, 1002, 993, 992, 952};

    @SerializedName("redirectUri")
    private String a;

    /* renamed from: ۣ۟ۢ۠ۢ, reason: not valid java name and contains not printable characters */
    public static String m3800(Object obj) {
        if (C0044.m7508() < 0) {
            return ((d) obj).a;
        }
        return null;
    }

    /* renamed from: ۡ۠ۥۧ, reason: not valid java name and contains not printable characters */
    public static short[] m3801() {
        if (C0011.m2755() >= 0) {
            return f405short;
        }
        return null;
    }

    public final String a() {
        return C0024.m4752(C0043.m7327(m3800(this)) ? C0007.m1840() : m3800(this), C0055.m8814(m3801(), 0, 5, 901))[1];
    }
}