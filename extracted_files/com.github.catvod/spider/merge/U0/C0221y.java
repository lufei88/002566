package com.github.catvod.spider.merge.U0;

import com.github.catvod.spider.p000mergexbpq.S.C0005;

/* renamed from: com.github.catvod.spider.merge.U0.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum C0221y extends B {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f622short = {1614, 1663, 1634, 1646};

    public C0221y() {
        super(C0005.m1645(f622short, 0, 4, 1562), 7);
    }

    @Override // com.github.catvod.spider.merge.U0.B
    public final boolean c(N n, C0176b c0176b) {
        if (n.a == 5) {
            c0176b.s((G) n);
            return true;
        }
        if (n.c()) {
            c0176b.h(this);
            c0176b.A();
            c0176b.l = c0176b.m;
            return c0176b.D(n);
        }
        if (!n.d()) {
            return true;
        }
        c0176b.A();
        c0176b.l = c0176b.m;
        return true;
    }
}