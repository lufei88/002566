package com.github.catvod.spider.p000mergexbpq.d0;

import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.r0.C0059;
import com.github.catvod.spider.p000mergexbpq.a0.C0006;

/* loaded from: classes.dex */
abstract class O {
    int a;

    O() {
    }

    static void h(StringBuilder sb) {
        if (sb != null) {
            C0055.m8804(sb, 0, C0006.m1693(sb));
        }
    }

    /* renamed from: ۟ۤۥۦۦ, reason: not valid java name and contains not printable characters */
    public static int m2492(Object obj) {
        if (C0059.m9257() < 0) {
            return ((O) obj).a;
        }
        return 0;
    }

    final boolean a() {
        return m2492(this) == 5;
    }

    final boolean b() {
        return m2492(this) == 4;
    }

    final boolean c() {
        return m2492(this) == 1;
    }

    final boolean d() {
        return m2492(this) == 6;
    }

    final boolean e() {
        return m2492(this) == 3;
    }

    final boolean f() {
        return m2492(this) == 2;
    }

    abstract O g();
}