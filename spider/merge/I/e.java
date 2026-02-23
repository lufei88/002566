package com.github.catvod.spider.merge.I;

import com.github.catvod.spider.merge.N.C0023;
import com.github.catvod.spider.merge.Z.C0040;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.x.C0015;
import com.google.gson.annotations.SerializedName;

/* loaded from: classes.dex */
public class e {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f456short = {1170};

    @SerializedName("cid")
    private String a;

    @SerializedName("part")
    private String b;

    /* renamed from: ۠ۢۥۤ, reason: not valid java name and contains not printable characters */
    public static String m4177(Object obj) {
        if (C0001.m1164() <= 0) {
            return ((e) obj).b;
        }
        return null;
    }

    /* renamed from: ۡ۠ۦۢ, reason: not valid java name and contains not printable characters */
    public static short[] m4178() {
        if (C0023.m4566() <= 0) {
            return f456short;
        }
        return null;
    }

    /* renamed from: ۣۧۡ۟, reason: not valid java name and contains not printable characters */
    public static String m4179(Object obj) {
        if (C0057.m9017() >= 0) {
            return ((e) obj).a;
        }
        return null;
    }

    public final String a() {
        return C0043.m7327(m4179(this)) ? C0007.m1840() : m4179(this);
    }

    public final String b() {
        boolean zM7327 = C0043.m7327(m4177(this));
        String strM1840 = C0007.m1840();
        return zM7327 ? strM1840 : C0015.m3446(m4177(this), C0040.m6584(m4178(), 0, 1, 1201), strM1840);
    }
}