package com.github.catvod.spider.merge.F;

import com.github.catvod.spider.merge.N.C0023;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.google.gson.annotations.SerializedName;

/* loaded from: classes.dex */
public class k {

    @SerializedName("template_id")
    private String a;

    @SerializedName("language")
    private String b;

    @SerializedName("status")
    private String c;

    @SerializedName("url")
    private String d;

    /* renamed from: ۠ۦۤ۠, reason: not valid java name and contains not printable characters */
    public static String m3830(Object obj) {
        if (C0055.m8740() > 0) {
            return ((k) obj).a;
        }
        return null;
    }

    /* renamed from: ۢ۠ۧۤ, reason: not valid java name and contains not printable characters */
    public static String m3831(Object obj) {
        if (C0023.m4566() <= 0) {
            return ((k) obj).d;
        }
        return null;
    }

    /* renamed from: ۣۣ۟ۨ, reason: not valid java name and contains not printable characters */
    public static String m3832(Object obj) {
        if (C0054.m8557() <= 0) {
            return ((k) obj).b;
        }
        return null;
    }

    public final String a() {
        return C0043.m7327(m3832(this)) ? C0007.m1840() : m3832(this);
    }

    public final String b() {
        return C0043.m7327(m3830(this)) ? C0007.m1840() : m3830(this);
    }

    public final String c() {
        return C0043.m7327(m3831(this)) ? C0007.m1840() : m3831(this);
    }
}