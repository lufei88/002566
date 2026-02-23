package com.github.catvod.spider.p000mergexbpq.e0;

import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.github.catvod.spider.p000mergexbpq.c0.l;

/* renamed from: com.github.catvod.spider.merge-xbpq.e0.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0141y extends AbstractC0139w {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f342short = {2730, 2812, 2788, 2744, 2741, 2804, 2745};

    public C0141y(int i) {
        super(i);
    }

    /* renamed from: ۣ۠ۤۧ, reason: not valid java name and contains not printable characters */
    public static int m2740(Object obj) {
        if (C0025.m4797() > 0) {
            return ((AbstractC0139w) obj).a;
        }
        return 0;
    }

    /* renamed from: ۢۡۦۧ, reason: not valid java name and contains not printable characters */
    public static short[] m2741() {
        if (C0008.m1975() >= 0) {
            return f342short;
        }
        return null;
    }

    @Override // com.github.catvod.spider.p000mergexbpq.e0.N
    public final boolean a(l lVar, l lVar2) {
        return lVar != lVar2 && C0063.m9584(lVar2) < m2740(this);
    }

    public final String toString() {
        return C0002.m1327(C0020.m4199(m2741(), 0, 7, 2704), new Object[]{C0011.m2808(m2740(this))});
    }
}