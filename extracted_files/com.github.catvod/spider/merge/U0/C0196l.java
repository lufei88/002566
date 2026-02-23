package com.github.catvod.spider.merge.U0;

import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.i0.C0055;

/* renamed from: com.github.catvod.spider.merge.U0.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum C0196l extends B {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f596short = {3119, 3080, 3098, 3083, 3100, 3116, 3073, 3082, 3095, 2986, 2998, 2991, 2990};

    public C0196l() {
        super(C0039.m6551(f596short, 0, 9, 3182), 18);
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
        String strM8814 = C0055.m8814(f596short, 9, 4, 3010);
        if (zE && ((L) n).c.equals(strM8814)) {
            C0219x c0219x = B.g;
            c0176b.g = n;
            return c0219x.c(n, c0176b);
        }
        if (n.d() && ((K) n).c.equals(strM8814)) {
            c0176b.getClass();
            if (c0176b.y(strM8814)) {
                c0176b.B(strM8814);
            }
            c0176b.l = B.v;
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