package com.github.catvod.spider.p000mergexbpq.e0;

import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.c0.l;

/* loaded from: classes.dex */
public final class M extends N {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f316short = {1864, 1822};
    private final String a;

    public M(String str) {
        this.a = str;
    }

    /* renamed from: ۟۟ۧۧۢ, reason: not valid java name and contains not printable characters */
    public static short[] m2652() {
        if (C0007.m1886() > 0) {
            return f316short;
        }
        return null;
    }

    /* renamed from: ۟ۢ۟ۦۨ, reason: not valid java name and contains not printable characters */
    public static String m2653(Object obj) {
        if (C0020.m4210() <= 0) {
            return ((M) obj).a;
        }
        return null;
    }

    @Override // com.github.catvod.spider.p000mergexbpq.e0.N
    public final boolean a(l lVar, l lVar2) {
        return C0007.m1815(C0049.m8027(lVar2), m2653(this));
    }

    public final String toString() {
        return C0002.m1327(C0053.m8477(m2652(), 0, 2, 1901), new Object[]{m2653(this)});
    }
}