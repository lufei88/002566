package com.github.catvod.spider.p000mergexbpq.e0;

import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.c0.l;
import com.github.catvod.spider.p000mergexbpq.r.C0014;

/* loaded from: classes.dex */
final class V extends Z {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f321short = {2374, 2322, 2323, 2312, 2388, 2393, 2319, 2389};

    public V(N n) {
        this.a = n;
    }

    /* renamed from: ۟ۦۣۢۥ, reason: not valid java name and contains not printable characters */
    public static N m2678(Object obj) {
        if (C0044.m7508() < 0) {
            return ((Z) obj).a;
        }
        return null;
    }

    /* renamed from: ۥۦ۠۠, reason: contains not printable characters */
    public static short[] m2679() {
        if (C0049.m8038() < 0) {
            return f321short;
        }
        return null;
    }

    @Override // com.github.catvod.spider.p000mergexbpq.e0.N
    public final boolean a(l lVar, l lVar2) {
        return !C0007.m1805(m2678(this), lVar, lVar2);
    }

    public final String toString() {
        return C0002.m1327(C0014.m3332(m2679(), 0, 8, 2428), new Object[]{m2678(this)});
    }
}