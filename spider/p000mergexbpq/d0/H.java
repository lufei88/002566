package com.github.catvod.spider.p000mergexbpq.d0;

import com.github.catvod.spider.merge.b0.C0045;

/* loaded from: classes.dex */
class H extends O {
    private String b;

    H() {
        this.a = 5;
    }

    /* renamed from: ۟ۥۦۦ, reason: not valid java name and contains not printable characters */
    public static String m2463(Object obj) {
        if (C0045.m7538() < 0) {
            return ((H) obj).b;
        }
        return null;
    }

    @Override // com.github.catvod.spider.p000mergexbpq.d0.O
    final O g() {
        this.b = null;
        return this;
    }

    final H i(String str) {
        this.b = str;
        return this;
    }

    final String j() {
        return m2463(this);
    }

    public String toString() {
        return m2463(this);
    }
}