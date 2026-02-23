package com.github.catvod.spider.merge.U0;

import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.o0.C0056;

/* renamed from: com.github.catvod.spider.merge.U0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum C0188h extends B {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f588short = {2263, 2288, 2269, 2299, 2290, 2290, 2495, 2467, 502, 486};

    public C0188h() {
        super(C0047.m7833(f588short, 0, 6, 2206), 14);
    }

    @Override // com.github.catvod.spider.merge.U0.B
    public final boolean c(N n, C0176b c0176b) {
        boolean zD = n.d();
        C0219x c0219x = B.g;
        String strM8911 = C0056.m8911(f588short, 6, 2, 2507);
        String strM6001 = C0034.m6001(f588short, 8, 2, 386);
        if (!zD) {
            if (!n.e() || !com.github.catvod.spider.merge.S0.b.c(((L) n).c, A.y)) {
                c0176b.g = n;
                return c0219x.c(n, c0176b);
            }
            if (!c0176b.q(strM6001) && !c0176b.q(strM8911)) {
                c0176b.h(this);
                return false;
            }
            if (c0176b.q(strM6001)) {
                c0176b.F(strM6001);
            } else {
                c0176b.F(strM8911);
            }
            return c0176b.D(n);
        }
        String str = ((K) n).c;
        if (com.github.catvod.spider.merge.S0.b.c(str, A.v)) {
            boolean zQ = c0176b.q(str);
            C0186g c0186g = B.n;
            if (!zQ) {
                c0176b.h(this);
                c0176b.l = c0186g;
                return false;
            }
            c0176b.j(false);
            if (!c0176b.g(str)) {
                c0176b.h(this);
            }
            c0176b.B(str);
            c0176b.c();
            c0176b.l = c0186g;
            return true;
        }
        if (com.github.catvod.spider.merge.S0.b.c(str, A.w)) {
            c0176b.h(this);
            return false;
        }
        if (!com.github.catvod.spider.merge.S0.b.c(str, A.x)) {
            c0176b.g = n;
            return c0219x.c(n, c0176b);
        }
        if (!c0176b.q(str)) {
            c0176b.h(this);
            return false;
        }
        if (c0176b.q(strM6001)) {
            c0176b.F(strM6001);
        } else {
            c0176b.F(strM8911);
        }
        return c0176b.D(n);
    }
}