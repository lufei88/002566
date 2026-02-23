package com.github.catvod.spider.p000mergexbpq.P;

import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.f0.C0052;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.S.j;
import com.github.catvod.spider.p000mergexbpq.x.C0015;
import com.github.catvod.spider.p000mergexbpq.x.C0016;

/* loaded from: classes.dex */
public class z extends RuntimeException {
    private final B<?, ?> c;
    private final x d;
    private final r e;
    private D f;
    private int g;

    public z(B<?, ?> b, r rVar, x xVar) {
        this.g = -1;
        this.c = b;
        this.e = rVar;
        this.d = xVar;
        if (b != null) {
            this.g = C0041.m6773(b);
        }
    }

    /* renamed from: ۟۟۟ۡ۟, reason: not valid java name and contains not printable characters */
    public static int m858(Object obj) {
        if (C0015.m3433() >= 0) {
            return ((z) obj).g;
        }
        return 0;
    }

    /* renamed from: ۟ۦۥ۟ۡ, reason: not valid java name and contains not printable characters */
    public static r m859(Object obj) {
        if (C0016.m3596() <= 0) {
            return ((z) obj).e;
        }
        return null;
    }

    /* renamed from: ۟ۧۨۥ, reason: not valid java name and contains not printable characters */
    public static x m860(Object obj) {
        if (C0049.m8038() <= 0) {
            return ((z) obj).d;
        }
        return null;
    }

    /* renamed from: ۣۨ۟ۤ, reason: not valid java name and contains not printable characters */
    public static D m861(Object obj) {
        if (C0052.m8320() >= 0) {
            return ((z) obj).f;
        }
        return null;
    }

    /* renamed from: ۧۤۤۢ, reason: not valid java name and contains not printable characters */
    public static B m862(Object obj) {
        if (C0005.m1599() <= 0) {
            return ((z) obj).c;
        }
        return null;
    }

    public final j a() {
        B bM862 = m862(this);
        if (bM862 != null) {
            return C0031.m5589(C0057.m8998(bM862), m858(this), m860(this));
        }
        return null;
    }

    public final r b() {
        return m859(this);
    }

    public final D c() {
        return m861(this);
    }

    protected final void d(int i) {
        this.g = i;
    }

    protected final void e(D d) {
        this.f = d;
    }
}