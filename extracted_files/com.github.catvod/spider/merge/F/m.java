package com.github.catvod.spider.merge.F;

import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.google.gson.annotations.SerializedName;

/* loaded from: classes.dex */
public class m {

    @SerializedName("domain_id")
    private String a;

    @SerializedName("drive_id")
    private String b;

    @SerializedName("file_id")
    private String c;

    @SerializedName("code")
    private String d;

    @SerializedName("message")
    private String e;

    /* renamed from: ۟ۢۨۥۡ, reason: not valid java name and contains not printable characters */
    public static String m3834(Object obj) {
        if (C0005.m1599() < 0) {
            return ((m) obj).c;
        }
        return null;
    }

    public final String a() {
        return C0043.m7327(m3834(this)) ? C0007.m1840() : m3834(this);
    }
}