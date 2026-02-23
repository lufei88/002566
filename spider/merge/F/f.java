package com.github.catvod.spider.merge.F;

import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.google.gson.annotations.SerializedName;

/* loaded from: classes.dex */
public class f {

    @SerializedName("url")
    private String a;

    @SerializedName("file_id")
    private String b;

    @SerializedName("expiration")
    private String c;

    /* renamed from: ۥۤۦ۟, reason: contains not printable characters */
    public static String m3811(Object obj) {
        if (C0050.m8121() < 0) {
            return ((f) obj).a;
        }
        return null;
    }

    public final String a() {
        return C0043.m7327(m3811(this)) ? C0007.m1840() : m3811(this);
    }
}