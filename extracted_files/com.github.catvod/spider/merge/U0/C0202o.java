package com.github.catvod.spider.merge.U0;

import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.v.C0062;

/* renamed from: com.github.catvod.spider.merge.U0.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum C0202o extends B {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f602short = {3021, 3050, 3064, 3049, 3070, 3018, 3070, 3053, 3041, 3049, 3071, 3049, 3064, 1058, 1086, 1063, 1062, 1070, 1071, 1062, 1074, 1057, 1069, 1061, 1075};

    public C0202o() {
        super(C0048.m7902(f602short, 0, 13, 2956), 20);
    }

    @Override // com.github.catvod.spider.merge.U0.B
    public final boolean c(N n, C0176b c0176b) {
        if (B.a(n)) {
            c0176b.s((G) n);
            return true;
        }
        if (n.a()) {
            c0176b.t((H) n);
            return true;
        }
        if (n.b()) {
            c0176b.h(this);
            return false;
        }
        boolean zE = n.e();
        String strM7151 = C0042.m7151(f602short, 13, 4, 1098);
        if (zE && ((L) n).c.equals(strM7151)) {
            C0219x c0219x = B.g;
            c0176b.g = n;
            return c0219x.c(n, c0176b);
        }
        if (n.d() && ((K) n).c.equals(strM7151)) {
            c0176b.l = B.w;
            return true;
        }
        if (n.e() && ((L) n).c.equals(C0062.m9389(f602short, 17, 8, 1088))) {
            C0213u c0213u = B.d;
            c0176b.g = n;
            return c0213u.c(n, c0176b);
        }
        if (n.c()) {
            return true;
        }
        c0176b.h(this);
        return false;
    }
}