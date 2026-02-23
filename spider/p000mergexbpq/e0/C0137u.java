package com.github.catvod.spider.p000mergexbpq.e0;

import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.z.C0065;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.c0.l;

/* renamed from: com.github.catvod.spider.merge-xbpq.e0.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0137u extends N {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f339short = {2240, 2246, 2192};
    private final String a;

    public C0137u(String str) {
        this.a = str;
    }

    /* renamed from: ۟ۦ۠ۤۦ, reason: not valid java name and contains not printable characters */
    public static String m2734(Object obj) {
        if (C0005.m1599() < 0) {
            return ((C0137u) obj).a;
        }
        return null;
    }

    /* renamed from: ۥۦۢۢ, reason: contains not printable characters */
    public static short[] m2735() {
        if (C0032.m5686() <= 0) {
            return f339short;
        }
        return null;
    }

    @Override // com.github.catvod.spider.p000mergexbpq.e0.N
    public final boolean a(l lVar, l lVar2) {
        return C0007.m1815(m2734(this), C0030.m5353(lVar2));
    }

    public final String toString() {
        return C0002.m1327(C0065.m9775(m2735(), 0, 3, 2275), new Object[]{m2734(this)});
    }
}