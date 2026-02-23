package com.github.catvod.spider.p000mergexbpq.e0;

import com.github.catvod.spider.merge.J0.C0021;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.c0.l;

/* renamed from: com.github.catvod.spider.merge-xbpq.e0.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0140x extends AbstractC0139w {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f341short = {2363, 2406, 2421, 2345, 2340, 2405, 2344};

    public C0140x(int i) {
        super(i);
    }

    /* renamed from: ۣ۟ۧ۠ۤ, reason: not valid java name and contains not printable characters */
    public static int m2738(Object obj) {
        if (C0000.m1116() <= 0) {
            return ((AbstractC0139w) obj).a;
        }
        return 0;
    }

    /* renamed from: ۟ۧۤۢۢ, reason: not valid java name and contains not printable characters */
    public static short[] m2739() {
        if (C0037.m6350() <= 0) {
            return f341short;
        }
        return null;
    }

    @Override // com.github.catvod.spider.p000mergexbpq.e0.N
    public final boolean a(l lVar, l lVar2) {
        return C0063.m9584(lVar2) > m2738(this);
    }

    public final String toString() {
        return C0002.m1327(C0021.m4340(m2739(), 0, 7, 2305), new Object[]{C0011.m2808(m2738(this))});
    }
}