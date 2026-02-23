package com.github.catvod.spider.merge.G0;

import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.F0.C0147d;
import com.github.catvod.spider.merge.F0.C0148e;
import com.github.catvod.spider.merge.F0.C0168z;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.r0.C0059;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.r.C0014;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f449short = {3106, 2445, 2446};
    public int a = -1;
    public C0148e b;
    public d[] c;
    public boolean d;
    public int e;
    public C0168z f;
    public boolean g;
    public c[] h;

    public d(C0148e c0148e) {
        new ArrayList(7);
        new C0147d(0);
        this.d = false;
        this.b = c0148e;
    }

    /* renamed from: ۣ۟۠۠ۧ, reason: not valid java name and contains not printable characters */
    public static short[] m4133() {
        if (C0063.m9589() < 0) {
            return f449short;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d) {
            return C0012.m3011(C0014.m3346(this), C0014.m3346((d) obj));
        }
        return false;
    }

    public final int hashCode() {
        return C0043.m7334(C0059.m9238(7, C0035.m6082(C0014.m3346(this))), 1);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        C0036.m6177(sb, C0035.m6118(this));
        C0018.m3933(sb, C0030.m5362(m4133(), 0, 1, 3096));
        C0016.m3605(sb, C0014.m3346(this));
        if (C0035.m6074(this)) {
            C0018.m3933(sb, C0029.m5256(m4133(), 1, 2, 2480));
            c[] cVarArrM5193 = C0028.m5193(this);
            if (cVarArrM5193 != null) {
                C0018.m3933(sb, C0055.m8714(cVarArrM5193));
            } else {
                C0036.m6177(sb, C0054.m8634(this));
            }
        }
        return C0047.m7763(sb);
    }
}