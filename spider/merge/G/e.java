package com.github.catvod.spider.merge.G;

import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import com.google.gson.annotations.SerializedName;

/* loaded from: classes.dex */
public class e {

    @SerializedName("path")
    private String a;

    @SerializedName("pass")
    private String b;

    /* renamed from: ۟۟ۤ۠ۢ, reason: not valid java name and contains not printable characters */
    public static String m4016(Object obj) {
        if (C0013.m3167() >= 0) {
            return ((e) obj).b;
        }
        return null;
    }

    /* renamed from: ۣ۟۠ۧۡ, reason: not valid java name and contains not printable characters */
    public static String m4017(Object obj) {
        if (C0002.m1242() > 0) {
            return ((e) obj).a;
        }
        return null;
    }

    public final String a() {
        return C0043.m7327(m4016(this)) ? C0007.m1840() : m4016(this);
    }

    public final String b() {
        return C0043.m7327(m4017(this)) ? C0007.m1840() : m4017(this);
    }
}