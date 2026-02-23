package com.github.catvod.spider.p000mergexbpq.e0;

import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.c0.C0010;
import com.github.catvod.spider.p000mergexbpq.c0.l;
import com.github.catvod.spider.p000mergexbpq.c0.r;

/* renamed from: com.github.catvod.spider.merge-xbpq.e0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0118a implements O {
    private final l a;
    private final C0124g b;
    private final N c;

    C0118a(l lVar, C0124g c0124g, N n) {
        this.a = lVar;
        this.b = c0124g;
        this.c = n;
    }

    /* renamed from: ۟۠ۤۤۨ, reason: not valid java name and contains not printable characters */
    public static N m2684(Object obj) {
        if (C0010.m2320() < 0) {
            return ((C0118a) obj).c;
        }
        return null;
    }

    /* renamed from: ۟ۢۡۢ, reason: not valid java name and contains not printable characters */
    public static l m2685(Object obj) {
        if (C0024.m4693() <= 0) {
            return ((C0118a) obj).a;
        }
        return null;
    }

    /* renamed from: ۟ۥ۠ۦۤ, reason: not valid java name and contains not printable characters */
    public static C0124g m2686(Object obj) {
        if (C0036.m6252() > 0) {
            return ((C0118a) obj).b;
        }
        return null;
    }

    @Override // com.github.catvod.spider.p000mergexbpq.e0.O
    public final void a(r rVar, int i) {
        if (rVar instanceof l) {
            l lVar = (l) rVar;
            if (C0007.m1805(m2684(this), m2685(this), lVar)) {
                C0018.m3918(m2686(this), lVar);
            }
        }
    }

    @Override // com.github.catvod.spider.p000mergexbpq.e0.O
    public final void b(r rVar, int i) {
    }
}