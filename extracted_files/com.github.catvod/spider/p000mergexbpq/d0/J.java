package com.github.catvod.spider.p000mergexbpq.d0;

import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import com.github.catvod.spider.p000mergexbpq.r.C0014;

/* loaded from: classes.dex */
final class J extends O {
    final StringBuilder b = new StringBuilder();
    String c = null;
    final StringBuilder d = new StringBuilder();
    final StringBuilder e = new StringBuilder();
    boolean f = false;

    J() {
        this.a = 1;
    }

    /* renamed from: ۣۣ۟ۤۧ, reason: not valid java name and contains not printable characters */
    public static void m2468(Object obj) {
        if (C0011.m2755() >= 0) {
            O.h((StringBuilder) obj);
        }
    }

    /* renamed from: ۧ۟ۢۨ, reason: not valid java name and contains not printable characters */
    public static StringBuilder m2469(Object obj) {
        if (C0041.m6823() <= 0) {
            return ((J) obj).e;
        }
        return null;
    }

    /* renamed from: ۨۡۢ, reason: not valid java name and contains not printable characters */
    public static StringBuilder m2470(Object obj) {
        if (C0027.m5017() > 0) {
            return ((J) obj).b;
        }
        return null;
    }

    /* renamed from: ۨۨۧۤ, reason: not valid java name and contains not printable characters */
    public static StringBuilder m2471(Object obj) {
        if (C0014.m3353() <= 0) {
            return ((J) obj).d;
        }
        return null;
    }

    @Override // com.github.catvod.spider.p000mergexbpq.d0.O
    final O g() {
        m2468(m2470(this));
        this.c = null;
        m2468(m2471(this));
        m2468(m2469(this));
        this.f = false;
        return this;
    }
}