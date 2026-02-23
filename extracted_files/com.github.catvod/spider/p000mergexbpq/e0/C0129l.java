package com.github.catvod.spider.p000mergexbpq.e0;

import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.Z.C0040;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.github.catvod.spider.p000mergexbpq.c0.l;

/* renamed from: com.github.catvod.spider.merge-xbpq.e0.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0129l extends AbstractC0127j {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f330short = {2335, 2401, 2359, 2425, 2401, 2359, 2329};

    public C0129l(String str, String str2) {
        super(str, str2, true);
    }

    /* renamed from: ۟ۧۥۧۧ, reason: not valid java name and contains not printable characters */
    public static String m2707(Object obj) {
        if (C0008.m1975() >= 0) {
            return ((AbstractC0127j) obj).a;
        }
        return null;
    }

    /* renamed from: ۥۥۧ۟, reason: contains not printable characters */
    public static short[] m2708() {
        if (C0038.m6471() >= 0) {
            return f330short;
        }
        return null;
    }

    /* renamed from: ۧۢۦۦ, reason: not valid java name and contains not printable characters */
    public static String m2709(Object obj) {
        if (C0004.m1557() <= 0) {
            return ((AbstractC0127j) obj).b;
        }
        return null;
    }

    @Override // com.github.catvod.spider.p000mergexbpq.e0.N
    public final boolean a(l lVar, l lVar2) {
        return C0040.m6638(lVar2, m2707(this)) && C0000.m1057(m2709(this), C0064.m9640(C0058.m9094(lVar2, m2707(this))));
    }

    public final String toString() {
        return C0002.m1327(C0055.m8814(m2708(), 0, 7, 2372), new Object[]{m2707(this), m2709(this)});
    }
}