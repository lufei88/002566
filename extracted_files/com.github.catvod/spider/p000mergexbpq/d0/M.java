package com.github.catvod.spider.p000mergexbpq.d0;

import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.N.C0023;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.Z.C0040;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.c0.c;

/* loaded from: classes.dex */
final class M extends N {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f217short = {1581, 640, 2982};

    M() {
        this.a = 2;
    }

    /* renamed from: ۟ۡۦۥ۟, reason: not valid java name and contains not printable characters */
    public static c m2474(Object obj) {
        if (C0044.m7508() < 0) {
            return ((N) obj).j;
        }
        return null;
    }

    /* renamed from: ۟ۤۥۤۥ, reason: not valid java name and contains not printable characters */
    public static boolean m2475(Object obj) {
        if (C0019.m4065() <= 0) {
            return ((N) obj).r();
        }
        return false;
    }

    /* renamed from: ۟ۥۧۤۢ, reason: not valid java name and contains not printable characters */
    public static N m2476(Object obj) {
        if (C0023.m4566() < 0) {
            return ((M) obj).v();
        }
        return null;
    }

    /* renamed from: ۣۢۥۤ, reason: not valid java name and contains not printable characters */
    public static String m2477(Object obj) {
        if (C0007.m1886() > 0) {
            return ((N) obj).x();
        }
        return null;
    }

    /* renamed from: ۤۡۧۨ, reason: not valid java name and contains not printable characters */
    public static short[] m2478() {
        if (C0053.m8389() > 0) {
            return f217short;
        }
        return null;
    }

    @Override // com.github.catvod.spider.p000mergexbpq.d0.N, com.github.catvod.spider.p000mergexbpq.d0.O
    final /* bridge */ /* synthetic */ O g() {
        m2476(this);
        return this;
    }

    public final String toString() {
        StringBuilder sbM7166;
        String strM2477;
        boolean zM2475 = m2475(this);
        String strM8259 = C0051.m8259(m2478(), 0, 1, 1555);
        String strM6452 = C0038.m6452(m2478(), 1, 1, 700);
        if (!zM2475 || C0020.m4225(m2474(this)) <= 0) {
            sbM7166 = C0042.m7166(strM6452);
            strM2477 = m2477(this);
        } else {
            sbM7166 = C0042.m7166(strM6452);
            C0018.m3933(sbM7166, m2477(this));
            C0018.m3933(sbM7166, C0024.m4740(m2478(), 2, 1, 2950));
            strM2477 = C0042.m7180(m2474(this));
        }
        return C0040.m6629(sbM7166, strM2477, strM8259);
    }

    @Override // com.github.catvod.spider.p000mergexbpq.d0.N
    final N v() {
        super.v();
        this.j = null;
        return this;
    }
}