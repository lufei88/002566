package com.github.catvod.spider.p000mergexbpq.e0;

import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.r0.C0059;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.c0.l;

/* renamed from: com.github.catvod.spider.merge-xbpq.e0.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0138v extends AbstractC0139w {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f340short = {3155, 3084, 3096, 3137, 3148, 3085, 3136};

    public C0138v(int i) {
        super(i);
    }

    /* renamed from: ۟۠۟ۦۧ, reason: not valid java name and contains not printable characters */
    public static int m2736(Object obj) {
        if (C0031.m5628() > 0) {
            return ((AbstractC0139w) obj).a;
        }
        return 0;
    }

    /* renamed from: ۣۣ۟ۨۨ, reason: not valid java name and contains not printable characters */
    public static short[] m2737() {
        if (C0059.m9257() < 0) {
            return f340short;
        }
        return null;
    }

    @Override // com.github.catvod.spider.p000mergexbpq.e0.N
    public final boolean a(l lVar, l lVar2) {
        return C0063.m9584(lVar2) == m2736(this);
    }

    public final String toString() {
        return C0002.m1327(C0020.m4199(m2737(), 0, 7, 3177), new Object[]{C0011.m2808(m2736(this))});
    }
}