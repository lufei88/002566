package com.github.catvod.spider.merge.g1;

import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.z.C0065;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.c0.C0010;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.x.C0015;
import java.lang.reflect.Method;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/* loaded from: classes.dex */
public final class d implements com.github.catvod.spider.merge.e1.b {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f800short = {1751, 1748, 1756};
    public final String a;
    public volatile com.github.catvod.spider.merge.e1.b b;
    public Boolean c;
    public Method d;
    public com.github.catvod.spider.merge.f1.a e;
    public final Queue f;
    public final boolean g;

    public d(String str, LinkedBlockingQueue linkedBlockingQueue, boolean z) {
        this.a = str;
        this.f = linkedBlockingQueue;
        this.g = z;
    }

    /* renamed from: ۧ۟ۦۡ, reason: not valid java name and contains not printable characters */
    public static short[] m8531() {
        if (C0000.m1116() <= 0) {
            return f800short;
        }
        return null;
    }

    @Override // com.github.catvod.spider.merge.e1.b
    public final boolean a() {
        return C0015.m3434(C0012.m2985(this));
    }

    @Override // com.github.catvod.spider.merge.e1.b
    public final boolean b() {
        return C0032.m5721(C0012.m2985(this));
    }

    @Override // com.github.catvod.spider.merge.e1.b
    public final boolean c() {
        return C0049.m8050(C0012.m2985(this));
    }

    @Override // com.github.catvod.spider.merge.e1.b
    public final boolean d() {
        return C0053.m8470(C0012.m2985(this));
    }

    @Override // com.github.catvod.spider.merge.e1.b
    public final boolean e() {
        return C0057.m8957(C0012.m2985(this));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && d.class == C0047.m7777(obj) && C0007.m1815(C0005.m1590(this), C0005.m1590((d) obj));
    }

    @Override // com.github.catvod.spider.merge.e1.b
    public final void f(String str, Exception exc) {
        C0029.m5220(C0012.m2985(this), str, exc);
    }

    @Override // com.github.catvod.spider.merge.e1.b
    public final boolean g(int i) {
        return C0048.m7969(C0012.m2985(this), i);
    }

    @Override // com.github.catvod.spider.merge.e1.b
    public final String getName() {
        return C0005.m1590(this);
    }

    public final com.github.catvod.spider.merge.e1.b h() {
        if (C0036.m6236(this) != null) {
            return C0036.m6236(this);
        }
        if (C0055.m8739(this)) {
            return C0034.m6014();
        }
        if (C0011.m2745(this) == null) {
            this.e = new com.github.catvod.spider.merge.f1.a(this, C0033.m5877(this));
        }
        return C0011.m2745(this);
    }

    public final int hashCode() {
        return C0054.m8590(C0005.m1590(this));
    }

    public final boolean i() {
        Boolean boolM5623 = C0031.m5623(this);
        if (boolM5623 != null) {
            return C0010.m2318(boolM5623);
        }
        try {
            this.d = C0065.m9803(C0047.m7777(C0036.m6236(this)), C0002.m1305(m8531(), 0, 3, 1723), new Class[]{com.github.catvod.spider.merge.f1.c.class});
            this.c = C0000.m1129();
        } catch (NoSuchMethodException unused) {
            this.c = C0057.m9003();
        }
        return C0010.m2318(C0031.m5623(this));
    }
}