package com.github.catvod.spider.p000mergexbpq.c;

import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import com.github.catvod.spider.p000mergexbpq.c0.C0010;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class d {

    @SerializedName("class")
    private List<a> a;

    @SerializedName("list")
    private List<g> b;

    @SerializedName("filters")
    private LinkedHashMap<String, List<c>> c;

    @SerializedName("header")
    private String d;

    @SerializedName("format")
    private String e;

    @SerializedName("url")
    private String f;

    @SerializedName("subs")
    private List<e> g;

    @SerializedName("parse")
    private int h;

    @SerializedName("jx")
    private int i;

    @SerializedName("page")
    private Integer j;

    @SerializedName("pagecount")
    private Integer k;

    @SerializedName("limit")
    private Integer l;

    @SerializedName("total")
    private Integer m;

    public static String e(g gVar) {
        d dVar = new d();
        dVar.b = C0001.m1203(new g[]{gVar});
        return C0016.m3607(dVar);
    }

    public static String f(List<g> list) {
        d dVar = new d();
        dVar.b = list;
        return C0016.m3607(dVar);
    }

    public static String g(List<a> list, LinkedHashMap<String, List<c>> linkedHashMap) {
        d dVar = new d();
        dVar.a = list;
        dVar.c = linkedHashMap;
        return C0016.m3607(dVar);
    }

    /* renamed from: ۢۧۦ۠, reason: not valid java name and contains not printable characters */
    public static String m2032(Object obj, Object obj2) {
        if (C0010.m2320() <= 0) {
            return ((Gson) obj).toJson(obj2);
        }
        return null;
    }

    public final d a(Map<String, String> map) {
        if (C0012.m2970(map)) {
            return this;
        }
        this.d = m2032(new Gson(), map);
        return this;
    }

    public final d b() {
        this.i = 1;
        return this;
    }

    public final d c() {
        this.j = C0011.m2808(1);
        this.l = C0011.m2808(Integer.MAX_VALUE);
        this.m = C0011.m2808(1);
        this.k = C0011.m2808(1);
        return this;
    }

    public final d d() {
        this.h = 1;
        return this;
    }

    public final d h(List<e> list) {
        this.g = list;
        return this;
    }

    public final d i(String str) {
        this.f = str;
        return this;
    }

    public final d j(List<g> list) {
        this.b = list;
        return this;
    }

    public final String toString() {
        return m2032(new Gson(), this);
    }
}