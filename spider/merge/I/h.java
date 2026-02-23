package com.github.catvod.spider.merge.I;

import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.p000mergexbpq.a0.C0006;
import com.google.gson.annotations.SerializedName;

/* loaded from: classes.dex */
public class h {

    @SerializedName("code")
    private Integer a;

    @SerializedName("message")
    private String b;

    @SerializedName("data")
    private b c;

    public static h b(String str) {
        return (h) C0033.m5856(str, h.class);
    }

    /* renamed from: ۣۢۢۤ, reason: not valid java name and contains not printable characters */
    public static b m4189(Object obj) {
        if (C0006.m1726() < 0) {
            return ((h) obj).c;
        }
        return null;
    }

    public final b a() {
        b bVarM4189 = m4189(this);
        return bVarM4189 == null ? new b() : bVarM4189;
    }
}