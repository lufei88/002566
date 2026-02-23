package com.github.catvod.spider.p000mergexbpq.e0;

import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.Z.C0040;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.r0.C0060;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.c0.l;

/* renamed from: com.github.catvod.spider.merge-xbpq.e0.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0131n extends AbstractC0127j {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f332short = {2226, 2252, 2202, 2253, 2260, 2252, 2202, 2228};

    public C0131n(String str, String str2) {
        super(str, str2, false);
    }

    /* renamed from: ۡ۠۟ۡ, reason: not valid java name and contains not printable characters */
    public static short[] m2713() {
        if (C0047.m7837() >= 0) {
            return f332short;
        }
        return null;
    }

    /* renamed from: ۢۥ۠ۨ, reason: not valid java name and contains not printable characters */
    public static String m2714(Object obj) {
        if (C0024.m4693() <= 0) {
            return ((AbstractC0127j) obj).a;
        }
        return null;
    }

    /* renamed from: ۣۤۤۡ, reason: not valid java name and contains not printable characters */
    public static String m2715(Object obj) {
        if (C0041.m6823() < 0) {
            return ((AbstractC0127j) obj).b;
        }
        return null;
    }

    @Override // com.github.catvod.spider.p000mergexbpq.e0.N
    public final boolean a(l lVar, l lVar2) {
        return C0040.m6638(lVar2, m2714(this)) && C0060.m9349(C0055.m8795(C0058.m9094(lVar2, m2714(this))), m2715(this));
    }

    public final String toString() {
        return C0002.m1327(C0043.m7290(m2713(), 0, 8, 2281), new Object[]{m2714(this), m2715(this)});
    }
}