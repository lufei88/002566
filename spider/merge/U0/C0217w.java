package com.github.catvod.spider.merge.U0;

import com.github.catvod.spider.merge.J0.C0021;
import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.c1.C0046;
import com.github.catvod.spider.merge.r0.C0060;
import com.github.catvod.spider.merge.v.C0062;

/* renamed from: com.github.catvod.spider.merge.U0.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum C0217w extends B {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f618short = {800, 775, 789, 772, 787, 809, 772, 768, 773, 913, 924, 919, 906, 2542, 2546, 2539, 2538, 416, 436, 423, 427, 419, 437, 419, 434, 574, 563, 567, 562, 1402, 1387, 1379, 1406, 1378, 1391, 1402, 1387};

    public C0217w() {
        super(C0046.m7718(f618short, 0, 9, 865), 5);
    }

    @Override // com.github.catvod.spider.merge.U0.B
    public final boolean c(N n, C0176b c0176b) {
        if (B.a(n)) {
            c0176b.s((G) n);
        } else if (n.a()) {
            c0176b.t((H) n);
        } else if (n.b()) {
            c0176b.h(this);
        } else {
            boolean zE = n.e();
            C0213u c0213u = B.d;
            String strM9352 = C0060.m9352(f618short, 9, 4, 1011);
            if (zE) {
                L l = (L) n;
                String str = l.c;
                boolean zEquals = str.equals(C0021.m4340(f618short, 13, 4, 2438));
                C0219x c0219x = B.g;
                if (zEquals) {
                    c0176b.g = n;
                    return c0219x.c(n, c0176b);
                }
                if (str.equals(strM9352)) {
                    c0176b.r(l);
                    c0176b.u = false;
                    c0176b.l = c0219x;
                } else if (str.equals(C0030.m5362(f618short, 17, 8, 454))) {
                    c0176b.r(l);
                    c0176b.l = B.t;
                } else if (com.github.catvod.spider.merge.S0.b.c(str, A.g)) {
                    c0176b.h(this);
                    com.github.catvod.spider.merge.T0.m mVar = c0176b.o;
                    c0176b.e.add(mVar);
                    c0176b.E(n, c0213u);
                    c0176b.K(mVar);
                } else {
                    if (str.equals(C0025.m4795(f618short, 25, 4, 598))) {
                        c0176b.h(this);
                        return false;
                    }
                    c0176b.G(strM9352);
                    c0176b.u = true;
                    c0176b.D(n);
                }
            } else {
                if (n.d()) {
                    String str2 = ((K) n).c;
                    if (com.github.catvod.spider.merge.S0.b.c(str2, A.d)) {
                        c0176b.G(strM9352);
                    } else {
                        if (!str2.equals(C0062.m9389(f618short, 29, 8, 1294))) {
                            c0176b.h(this);
                            return false;
                        }
                        c0176b.E(n, c0213u);
                    }
                } else {
                    c0176b.G(strM9352);
                }
                c0176b.u = true;
                c0176b.D(n);
            }
        }
        return true;
    }
}