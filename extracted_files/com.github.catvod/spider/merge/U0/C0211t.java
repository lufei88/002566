package com.github.catvod.spider.merge.U0;

import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.t.C0061;
import com.github.catvod.spider.merge.y0.C0064;

/* renamed from: com.github.catvod.spider.merge.U0.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum C0211t extends B {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f612short = {1086, 1049, 1050, 1043, 1038, 1049, 1076, 1049, 1053, 1048, 1960, 1972, 1965, 1964, 1202, 1215, 1211, 1214};

    public C0211t() {
        super(C0061.m9361(f612short, 0, 10, 1148), 2);
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
        if (n.e() && ((L) n).c.equals(C0027.m5062(f612short, 10, 4, 1984))) {
            return B.g.c(n, c0176b);
        }
        boolean zE = n.e();
        String strM9599 = C0064.m9599(f612short, 14, 4, 1242);
        if (zE) {
            L l = (L) n;
            if (l.c.equals(strM9599)) {
                c0176b.o = c0176b.r(l);
                c0176b.l = B.d;
                return true;
            }
        }
        if (n.d() && com.github.catvod.spider.merge.S0.b.c(((K) n).c, A.e)) {
            c0176b.G(strM9599);
            return c0176b.D(n);
        }
        if (n.d()) {
            c0176b.h(this);
            return false;
        }
        c0176b.G(strM9599);
        return c0176b.D(n);
    }
}