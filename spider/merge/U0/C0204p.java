package com.github.catvod.spider.merge.U0;

import com.github.catvod.spider.merge.f0.C0052;
import com.github.catvod.spider.merge.y0.C0064;

/* renamed from: com.github.catvod.spider.merge.U0.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum C0204p extends B {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f604short = {567, 528, 514, 531, 516, 567, 528, 514, 531, 516, 564, 537, 530, 527, 1144, 1124, 1149, 1148};

    public C0204p() {
        super(C0064.m9599(f604short, 0, 14, 630), 21);
    }

    @Override // com.github.catvod.spider.merge.U0.B
    public final boolean c(N n, C0176b c0176b) {
        if (n.a()) {
            c0176b.t((H) n);
            return true;
        }
        if (n.b() || (n.e() && ((L) n).c.equals(C0052.m8337(f604short, 14, 4, 1040)))) {
            C0219x c0219x = B.g;
            c0176b.g = n;
            return c0219x.c(n, c0176b);
        }
        if (B.a(n)) {
            c0176b.s((G) n);
            return true;
        }
        if (n.c()) {
            return true;
        }
        c0176b.h(this);
        c0176b.L();
        return c0176b.D(n);
    }
}