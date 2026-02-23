package com.github.catvod.spider.p000mergexbpq.T;

import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.p000mergexbpq.P.D;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.a0.C0006;
import com.github.catvod.spider.p000mergexbpq.c0.C0010;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;

/* loaded from: classes.dex */
public class g implements f {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f165short = {2246, 2239, 2229, 2236, 2244};
    public D a;

    public g(D d) {
        this.a = d;
    }

    /* renamed from: ۣۢۡۥ, reason: not valid java name and contains not printable characters */
    public static void m1678(Object obj) {
        if (C0017.m3633() <= 0) {
            ((d) obj).q();
        }
    }

    /* renamed from: ۥۧ۠ۢ, reason: contains not printable characters */
    public static short[] m1679() {
        if (C0003.m1463() <= 0) {
            return f165short;
        }
        return null;
    }

    @Override // com.github.catvod.spider.p000mergexbpq.T.f
    public final D a() {
        return C0010.m2293(this);
    }

    @Override // com.github.catvod.spider.p000mergexbpq.T.b
    public final String c() {
        return C0006.m1760(C0010.m2293(this));
    }

    @Override // com.github.catvod.spider.p000mergexbpq.T.b
    public <T> T e(d<? extends T> dVar) {
        m1678(dVar);
        return null;
    }

    public final String toString() {
        return C0011.m2787(C0010.m2293(this)) == -1 ? C0017.m3646(m1679(), 0, 5, 2298) : C0006.m1760(C0010.m2293(this));
    }
}