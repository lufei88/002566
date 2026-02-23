package com.github.catvod.spider.merge.U0;

import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.v.C0062;

/* renamed from: com.github.catvod.spider.merge.U0.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum C0206q extends B {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f606short = {793, 830, 812, 829, 810, 793, 830, 812, 829, 810, 798, 810, 825, 821, 829, 811, 829, 812, 2581, 2569, 2576, 2577, 1280, 1281, 1288, 1308, 1295, 1283, 1291, 1309};

    public C0206q() {
        super(C0035.m6131(f606short, 0, 18, 856), 22);
    }

    @Override // com.github.catvod.spider.merge.U0.B
    public final boolean c(N n, C0176b c0176b) {
        if (n.a()) {
            c0176b.t((H) n);
            return true;
        }
        if (n.b() || B.a(n) || (n.e() && ((L) n).c.equals(C0039.m6551(f606short, 18, 4, 2685)))) {
            C0219x c0219x = B.g;
            c0176b.g = n;
            return c0219x.c(n, c0176b);
        }
        if (n.c()) {
            return true;
        }
        if (!n.e() || !((L) n).c.equals(C0062.m9389(f606short, 22, 8, 1390))) {
            c0176b.h(this);
            return false;
        }
        C0213u c0213u = B.d;
        c0176b.g = n;
        return c0213u.c(n, c0176b);
    }
}