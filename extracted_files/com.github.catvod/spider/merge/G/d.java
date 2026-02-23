package com.github.catvod.spider.merge.G;

import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.r0.C0059;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.google.gson.annotations.SerializedName;

/* loaded from: classes.dex */
public class d {

    @SerializedName("username")
    private String a;

    @SerializedName("password")
    private String b;

    /* renamed from: ۣ۟ۧۥۨ, reason: not valid java name and contains not printable characters */
    public static String m4014(Object obj) {
        if (C0059.m9257() <= 0) {
            return ((d) obj).a;
        }
        return null;
    }

    /* renamed from: ۤۧۦۤ, reason: not valid java name and contains not printable characters */
    public static String m4015(Object obj) {
        if (C0044.m7508() <= 0) {
            return ((d) obj).b;
        }
        return null;
    }

    public final String a() {
        return C0043.m7327(m4015(this)) ? C0007.m1840() : m4015(this);
    }

    public final String b() {
        return C0043.m7327(m4014(this)) ? C0007.m1840() : m4014(this);
    }
}