package com.github.catvod.spider.merge.U0;

import com.github.catvod.spider.merge.a1.C0043;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.github.catvod.spider.merge.U0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum C0178c extends B {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f573short = {1081, 1054, 1060, 1041, 1042, 1052, 1045, 1060, 1045, 1032, 1028};

    public C0178c() {
        super(C0043.m7290(f573short, 0, 11, 1136), 9);
    }

    @Override // com.github.catvod.spider.merge.U0.B
    public final boolean c(N n, C0176b c0176b) {
        if (n.a == 5) {
            G g = (G) n;
            if (g.b.equals(B.x)) {
                c0176b.h(this);
                return false;
            }
            c0176b.s.add(g.b);
            return true;
        }
        if (c0176b.s.size() > 0) {
            Iterator it = c0176b.s.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                if (com.github.catvod.spider.merge.S0.b.d(str)) {
                    G g2 = new G();
                    g2.b = str;
                    c0176b.s(g2);
                } else {
                    c0176b.h(this);
                    boolean zC = com.github.catvod.spider.merge.S0.b.c(c0176b.f().d.b, A.A);
                    B b = B.g;
                    if (zC) {
                        c0176b.v = true;
                        G g3 = new G();
                        g3.b = str;
                        c0176b.E(g3, b);
                        c0176b.v = false;
                    } else {
                        G g4 = new G();
                        g4.b = str;
                        c0176b.E(g4, b);
                    }
                }
            }
            c0176b.s = new ArrayList();
        }
        c0176b.l = c0176b.m;
        return c0176b.D(n);
    }
}