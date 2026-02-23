package com.github.catvod.spider.merge.M;

import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

/* loaded from: classes.dex */
public class g {

    @SerializedName("country")
    private String a;

    @SerializedName("label")
    private String b;

    @SerializedName("chName")
    private String c;

    @SerializedName("startTime")
    private Integer d;

    @SerializedName("endTime")
    private Integer e;

    @SerializedName("pageSize")
    private Integer f;

    @SerializedName("page")
    private Integer g;

    /* renamed from: ۟ۤۡۨۦ, reason: not valid java name and contains not printable characters */
    public static String m4527(Object obj, Object obj2) {
        if (C0030.m5375() >= 0) {
            return ((Gson) obj).toJson(obj2);
        }
        return null;
    }

    public final void a(String str) {
        this.c = str;
    }

    public final void b(String str) {
        this.a = str;
    }

    public final void c(String str) {
        this.b = str;
    }

    public final void d(Integer num) {
        this.g = num;
    }

    public final void e() {
        this.f = C0011.m2808(16);
    }

    public final void f(String str) {
        this.d = C0011.m2808(C0038.m6456(str));
        this.e = C0011.m2808(C0038.m6456(str));
    }

    public final String toString() {
        return m4527(new Gson(), this);
    }
}