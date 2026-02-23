package com.github.catvod.spider.merge.E;

import com.github.catvod.spider.p000mergexbpq.a0.C0006;
import com.github.catvod.spider.p000mergexbpq.r.C0014;
import com.google.gson.annotations.SerializedName;

/* loaded from: classes.dex */
public class i {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f389short = {1413, 1426, 1428, 1411};

    @SerializedName("type")
    private String a = C0006.m1774(m3771(), 0, 4, 1527);

    @SerializedName("ratio")
    private Float b;

    public i(Float f) {
        this.b = f;
    }

    /* renamed from: ۨۥۣۨ, reason: not valid java name and contains not printable characters */
    public static short[] m3771() {
        if (C0014.m3353() < 0) {
            return f389short;
        }
        return null;
    }
}