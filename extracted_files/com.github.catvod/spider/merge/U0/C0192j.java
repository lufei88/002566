package com.github.catvod.spider.merge.U0;

import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.z.C0065;

/* renamed from: com.github.catvod.spider.merge.U0.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum C0192j extends B {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f592short = {2557, 2522, 2535, 2513, 2520, 2513, 2519, 2496, 2557, 2522, 2528, 2517, 2518, 2520, 2513, 459, 477, 468, 477, 475, 460};

    public C0192j() {
        super(C0056.m8911(f592short, 0, 15, 2484), 16);
    }

    @Override // com.github.catvod.spider.merge.U0.B
    public final boolean c(N n, C0176b c0176b) {
        boolean zE = n.e();
        String[] strArr = A.G;
        String strM9775 = C0065.m9775(f592short, 15, 6, 440);
        if (!zE || !com.github.catvod.spider.merge.S0.b.c(((L) n).c, strArr)) {
            if (n.d()) {
                K k = (K) n;
                if (com.github.catvod.spider.merge.S0.b.c(k.c, strArr)) {
                    c0176b.h(this);
                    if (!c0176b.q(k.c)) {
                        return false;
                    }
                }
            }
            C0190i c0190i = B.p;
            c0176b.g = n;
            return c0190i.c(n, c0176b);
        }
        c0176b.h(this);
        c0176b.B(strM9775);
        c0176b.M();
        return c0176b.D(n);
    }
}