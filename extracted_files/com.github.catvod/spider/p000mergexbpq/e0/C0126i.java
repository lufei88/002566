package com.github.catvod.spider.p000mergexbpq.e0;

import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.Z.C0040;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.f0.C0052;
import com.github.catvod.spider.merge.r0.C0060;
import com.github.catvod.spider.merge.z.C0065;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.a0.C0006;
import com.github.catvod.spider.p000mergexbpq.c0.l;

/* renamed from: com.github.catvod.spider.merge-xbpq.e0.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0126i extends N {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f327short = {3116, 3111, 3185, 410, 484, 434, 412, 2001, 1927};
    public final /* synthetic */ int a;
    private final String b;

    public /* synthetic */ C0126i(String str, int i) {
        this.a = i;
        this.b = str;
    }

    /* renamed from: ۣ۟۟ۥ, reason: not valid java name and contains not printable characters */
    public static short[] m2702() {
        if (C0032.m5686() < 0) {
            return f327short;
        }
        return null;
    }

    /* renamed from: ۤۥۧۧ, reason: not valid java name and contains not printable characters */
    public static String m2703(Object obj) {
        if (C0006.m1726() <= 0) {
            return ((C0126i) obj).b;
        }
        return null;
    }

    @Override // com.github.catvod.spider.p000mergexbpq.e0.N
    public final boolean a(l lVar, l lVar2) {
        switch (C0027.m4995(this)) {
            case 0:
                return C0040.m6638(lVar2, m2703(this));
            case 1:
                return C0018.m3989(lVar2, m2703(this));
            default:
                return C0060.m9349(C0049.m8027(lVar2), m2703(this));
        }
    }

    public final String toString() {
        switch (C0027.m4995(this)) {
            case 0:
                return C0002.m1327(C0020.m4199(m2702(), 3, 4, 449), new Object[]{m2703(this)});
            case 1:
                return C0002.m1327(C0052.m8337(m2702(), 0, 3, 3074), new Object[]{m2703(this)});
            default:
                return C0002.m1327(C0065.m9775(m2702(), 7, 2, 2036), new Object[]{m2703(this)});
        }
    }
}