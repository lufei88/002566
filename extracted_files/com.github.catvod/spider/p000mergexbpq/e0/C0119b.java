package com.github.catvod.spider.p000mergexbpq.e0;

import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.c0.l;
import com.github.catvod.spider.p000mergexbpq.c0.r;

/* renamed from: com.github.catvod.spider.merge-xbpq.e0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0119b {
    private final l a;
    private l b = null;
    private final N c;

    C0119b(l lVar, N n) {
        this.a = lVar;
        this.c = n;
    }

    /* renamed from: ۟۟ۦۤۥ, reason: not valid java name and contains not printable characters */
    public static l m2687(Object obj) {
        if (C0028.m5152() <= 0) {
            return ((C0119b) obj).b;
        }
        return null;
    }

    /* renamed from: ۟ۢۦۣۧ, reason: not valid java name and contains not printable characters */
    public static N m2688(Object obj) {
        if (C0029.m5282() > 0) {
            return ((C0119b) obj).c;
        }
        return null;
    }

    /* renamed from: ۣۧ۠۟, reason: not valid java name and contains not printable characters */
    public static l m2689(Object obj) {
        if (C0058.m9131() < 0) {
            return ((C0119b) obj).a;
        }
        return null;
    }

    public final int b(r rVar) {
        if (!(rVar instanceof l)) {
            return 1;
        }
        l lVar = (l) rVar;
        if (!C0007.m1805(m2688(this), m2689(this), lVar)) {
            return 1;
        }
        this.b = lVar;
        return 5;
    }
}