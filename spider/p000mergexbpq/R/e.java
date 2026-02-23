package com.github.catvod.spider.p000mergexbpq.R;

import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.z.C0065;
import com.github.catvod.spider.p000mergexbpq.Q.D;
import com.github.catvod.spider.p000mergexbpq.Q.f;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import com.github.catvod.spider.p000mergexbpq.x.C0016;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f158short = {3141, 744, 747};
    public int a;
    public f b;
    public e[] c;
    public boolean d;
    public int e;
    public D f;
    public boolean g;
    public d[] h;

    public e() {
        this.a = -1;
        this.b = new f(true);
        this.d = false;
    }

    public e(f fVar) {
        this.a = -1;
        new f(true);
        this.d = false;
        this.b = fVar;
    }

    /* renamed from: ۟ۡۥۧۦ, reason: not valid java name and contains not printable characters */
    public static short[] m1353() {
        if (C0058.m9131() < 0) {
            return f158short;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e) {
            return C0032.m5688(C0009.m2094(this), C0009.m2094((e) obj));
        }
        return false;
    }

    public final int hashCode() {
        return C0044.m7505(C0013.m3160(7, C0043.m7297(C0009.m2094(this))), 1);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        C0036.m6177(sb, C0028.m5149(this));
        C0018.m3933(sb, C0033.m5852(m1353(), 0, 1, 3199));
        C0016.m3605(sb, C0009.m2094(this));
        if (C0019.m4114(this)) {
            C0018.m3933(sb, C0055.m8814(m1353(), 1, 2, 725));
            d[] dVarArrM3906 = C0018.m3906(this);
            if (dVarArrM3906 != null) {
                C0018.m3933(sb, C0055.m8714(dVarArrM3906));
            } else {
                C0036.m6177(sb, C0065.m9796(this));
            }
        }
        return C0047.m7763(sb);
    }
}