package com.github.catvod.spider.merge.F0;

import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.r0.C0059;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;

/* loaded from: classes.dex */
public final class B implements InterfaceC0167y {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f410short = {2863, 2852, 2861, 2850, 2850, 2857, 2848, 2916, 2921, 2856, 2917};
    public final int a;

    public B(int i) {
        this.a = i;
    }

    /* renamed from: ۡۤۧۨ, reason: not valid java name and contains not printable characters */
    public static short[] m3846() {
        if (C0030.m5375() > 0) {
            return f410short;
        }
        return null;
    }

    @Override // com.github.catvod.spider.merge.F0.InterfaceC0167y
    public final void a(com.github.catvod.spider.merge.E0.k kVar) {
        kVar.l = C0044.m7398(this);
    }

    @Override // com.github.catvod.spider.merge.F0.InterfaceC0167y
    public final boolean b() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof B) {
            return C0044.m7398(this) == C0044.m7398((B) obj);
        }
        return false;
    }

    public final int hashCode() {
        return C0043.m7334(C0059.m9238(C0059.m9238(0, 0), C0044.m7398(this)), 2);
    }

    public final String toString() {
        return C0002.m1327(C0049.m8007(m3846(), 0, 11, 2892), new Object[]{C0011.m2808(C0044.m7398(this))});
    }
}