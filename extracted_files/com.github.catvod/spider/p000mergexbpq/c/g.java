package com.github.catvod.spider.p000mergexbpq.c;

import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import com.google.gson.annotations.SerializedName;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f177short = {1437, 1428, 1431, 1439, 1438, 1417, 2069, 2074, 2079, 2070};

    @SerializedName("type_name")
    private String a;

    @SerializedName("vod_id")
    private String b;

    @SerializedName("vod_name")
    private String c;

    @SerializedName("vod_pic")
    private String d;

    @SerializedName("vod_remarks")
    private String e;

    @SerializedName("vod_year")
    private String f;

    @SerializedName("vod_area")
    private String g;

    @SerializedName("vod_actor")
    private String h;

    @SerializedName("vod_director")
    private String i;

    @SerializedName("vod_content")
    private String j;

    @SerializedName("vod_play_from")
    private String k;

    @SerializedName("vod_play_url")
    private String l;

    @SerializedName("vod_tag")
    private String m;

    @SerializedName("style")
    private f n;

    public g() {
    }

    public g(String str, String str2, String str3, String str4, boolean z) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.m = z ? C0053.m8477(m2034(), 0, 6, 1531) : C0016.m3525(m2034(), 6, 4, 2163);
    }

    /* renamed from: ۟۟ۨۧۡ, reason: not valid java name and contains not printable characters */
    public static short[] m2034() {
        if (C0043.m7332() > 0) {
            return f177short;
        }
        return null;
    }

    public final void a(String str) {
        this.a = str;
    }

    public final void b(String str) {
        this.h = str;
    }

    public final void c(String str) {
        this.g = str;
    }

    public final void d(String str) {
        this.j = str;
    }

    public final void e(String str) {
        this.i = str;
    }

    public final void f(String str) {
        this.b = str;
    }

    public final void g(String str) {
        this.c = str;
    }

    public final void h(String str) {
        this.d = str;
    }

    public final void i(String str) {
        this.k = str;
    }

    public final void j(String str) {
        this.l = str;
    }

    public final void k(String str) {
        this.e = str;
    }

    public final void l(String str) {
        this.f = str;
    }
}